package org.checkerframework.checker.dividebyzero.qual;

import org.checkerframework.framework.qual.SubtypeOf;
import org.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Bottome
@SubtypeOf({MinusOne.class,Zero.class,One.class})
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
public @interface Bottom { }
