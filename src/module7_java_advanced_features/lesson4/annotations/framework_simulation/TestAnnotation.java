package module7_java_advanced_features.lesson4.annotations.framework_simulation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//We can create our own annotations
//@Target defines where annotation can be used
@Target(ElementType.METHOD)
//@Retention defines when annotation can be used
@Retention(RetentionPolicy.RUNTIME)
public @interface TestAnnotation {

    String description() default "Hello";
}
