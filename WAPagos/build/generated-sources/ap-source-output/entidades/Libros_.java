package entidades;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-05-25T11:13:31")
@StaticMetamodel(Libros.class)
public class Libros_ { 

    public static volatile SingularAttribute<Libros, BigDecimal> precio;
    public static volatile SingularAttribute<Libros, String> isbn;
    public static volatile SingularAttribute<Libros, Integer> id;
    public static volatile SingularAttribute<Libros, Integer> cantidad;
    public static volatile SingularAttribute<Libros, String> nombre;

}