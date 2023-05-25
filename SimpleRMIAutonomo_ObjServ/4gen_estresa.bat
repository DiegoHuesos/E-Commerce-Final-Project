echo off
echo ejecuta el estresador para sembrar los clientes
echo uso:
echo 4_estresa NumCltes NumSolicitudesPorClte HOSTNAME (en caso de omitirlo se usa localhost, si se omiten los clientes usa 20 y el localhost)
echo on

rem
rem POJOJAR es el nombre del jar donde reside la clase del objeto que implementa la interfaz para solicitar los servicios
rem
rem POJOJAR=CltePojoBPEL_Tda_011.jar
rem
rem CLTEPOJO es la sucesión de paquetes y la clase del objeto que se utiliza para estresar.
rem set CLTEPOJO=cltepojobpel_tda_011.SolicitadorServicio
rem

rem ===================================================================================
rem trabajando con tstRMI_objServ.jar
rem ===================================================================================

set ESTRESJAR=tstRMI_objServ02.jar

set INTERFAZ_SERVICIOJAR=ISolicitaServicio.jar
set POJOJAR=ObjetoDeServicio.jar
set POJO=objetodeservicio.ObjetodeServicio

rem La totalidad de jars debe ester en este directorio y toma el classpath del directorio
rem de donde esté ejecutándose el bat (ver "." en la definición del classpath.

set cb=-Djava.rmi.server.codebase=file:%ESTRESJAR%
set cp=-cp .;%INTERFAZ_SERVICIOJAR%;%ESTRESJAR%;%POJOJAR%


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

rem voy aquí:
rem falta:
rem 1) que el Cliente_Objserv reciba el nombre del Objeto de Servicio como argumento
rem 2) que el Cliente_ObjServ defina la secuencia de argumentos para el Objeto de Servicio

if [%1] NEQ [] goto conclientes
estresador 5 %cp% %cb% example.hello.Distribuidor Cliente_ObjServ %POJO% 25 localhost localhost 
goto fin

:conclientes
goto fin

if [%2] NEQ [] goto consolicitudes
estresador %1 %cp% %cb% example.hello.Distribuidor EjecutaSolicitante %POJO% localhost 200
goto fin

:consolicitudes
if [%3] NEQ [] goto conHost
estresador %1 %cp% %cb% example.hello.Distribuidor EjecutaSolicitante %POJO% localhost %2
goto fin

:conHost
estresador %1 %cp% %cb% example.hello.Distribuidor EjecutaSolicitante %POJO% %3 %2


:fin