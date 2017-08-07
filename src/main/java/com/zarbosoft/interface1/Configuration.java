package com.zarbosoft.interface1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Configuration {
	String name() default "";

	boolean optional() default false;
}
