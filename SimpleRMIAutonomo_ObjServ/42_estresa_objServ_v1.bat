@echo off
echo ---------------------------------------------------------------------------------
echo ejecuta el estresador para sembrar los clientes
echo uso:
echo 4_estresa NumCltes NumSolicitudesPorClte HOSTNAME_SERVIDOR_DE_DISPARO HOSTNAME_SERVIDOR 
echo el primer argumento es obligatorio, en caso de omitir los siguientes se usa
echo 20 Clientes, 
echo 25 solicitudes por cliente, 
echo localhost como host del rmi para el servidor de disparo
echo localhost como host del servicio a estresar
echo ---------------------------------------------------------------------------------


rem ===================================================================================
rem ESTRESJAR            nombre del .jar con la infraestructura de estres.
rem INTERFAZ_SERVICIOJAR nombre del .jar con la interfaz para interoperar clte y servicio
rem POJOJAR              nombre del jar donde reside la clase del objeto que implementa la interfaz para solicitar los servicios
rem POJO                 secuencia de paq1.paq2,....paqn.ClaseObjServ (Clase de los objetos que implamentan la interfaz para solicitar los servicios)
rem ===================================================================================
rem La totalidad de jars debe estar en esta carpeta y toma el classpath de la carpeta
rem de donde esté ejecutándose el bat (ver "." en la definición del classpath).
rem ===================================================================================
rem trabajando con tstRMI_objServ02.jar
rem ===================================================================================




set ESTRESJAR=tstRMI_objServ02.jar
set INTERFAZ_SERVICIOJAR=ISolicitaServicio.jar
set POJOJAR=Pojo_Parcial_02.jar
set POJO=pojo_parcial_02.Pojo_Parcial_02

set cb=-Djava.rmi.server.codebase=file:%ESTRESJAR%
set cp=-cp .;%INTERFAZ_SERVICIOJAR%;%ESTRESJAR%;%POJOJAR%

echo            ESTRESJAR:%ESTRESJAR%
echo INTERFAZ_SERVICIOJAR:%INTERFAZ_SERVICIOJAR%
echo              POJOJAR:%POJOJAR%
echo                 POJO:%POJO%
echo ------------------------------------------------------
echo codebase y classpath:
echo                   cb:%cb%
echo                   cp:%cp%
echo ------------------------------------------------------

rem ====================================================================================
rem                               Pruebas de armado
rem ====================================================================================
rem set cb=.\%ESTRESJAR%
rem set cp=.;%INTERFAZ_SERVICIOJAR%;%ESTRESJAR%;%POJOJAR%

rem java -Djava.rmi.server.codebase=file:.\tstRMI.jar -cp .;ISolicitaServicio.jar;tstRMI.jar;ObjetoDeServicio.jar example.hello.Distribuidor Cliente_ObjServ 
rem java -Djava.rmi.server.codebase=file:%cb% -cp %cp% example.hello.Distribuidor Cliente_ObjServ 
rem java -Djava.rmi.server.codebase=file:%cb% %cp% example.hello.Distribuidor Cliente_ObjServ
rem java %cb% %cp% example.hello.Distribuidor Cliente_ObjServ 
rem goto fin
rem ====================================================================================
rem                             Fin de pruebas de armado
rem ====================================================================================

if [%1] NEQ [] goto conclientes
estresador 20 %cp% %cb% example.hello.Distribuidor Cliente_ObjServ %POJO% 20 localhost localhost 
goto fin

:conclientes
if [%2] NEQ [] goto consolicitudes
estresador %1 %cp% %cb% example.hello.Distribuidor Cliente_ObjServ %POJO% 20 localhost localhost
goto fin

:consolicitudes
if [%3] NEQ [] goto conHostSD
estresador %1 %cp% %cb% example.hello.Distribuidor Cliente_ObjServ %POJO% %2 localhost localhost
goto fin

:conHostSD
if [%4] NEQ [] goto conHostSERV
estresador %1 %cp% %cb% example.hello.Distribuidor Cliente_ObjServ %POJO% %2 %3

:conHostSERV
estresador %1 %cp% %cb% example.hello.Distribuidor Cliente_ObjServ %POJO% %2 %3 %4


:fin