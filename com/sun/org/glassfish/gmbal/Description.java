package com.sun.org.glassfish.gmbal;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Description {
  String value();
  
  String key() default "";
}


/* Location:              D:\software\jd-gui\jd-gui-windows-1.6.3\rt.jar!\com\sun\org\glassfish\gmbal\Description.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */