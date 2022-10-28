package org.checkerframework.checker.dividebyzero.qual;

import org.checkerframework.framework.qual.SubtypeOf;
import org.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// > 0
@SubtypeOf({NonZero.class})
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
public @interface Greater { }
