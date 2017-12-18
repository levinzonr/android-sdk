package dk.nodes.nstack.kotlin.translate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Translate {

    String value() default "";

    enum AccessLevel {PUBLIC, PROTECTED, PACKAGE_PROTECTED, PRIVATE}
}
