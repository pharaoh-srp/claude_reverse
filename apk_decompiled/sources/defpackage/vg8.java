package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface vg8 {
    boolean allowUnsafeNonAsciiValues() default false;

    String[] value();
}
