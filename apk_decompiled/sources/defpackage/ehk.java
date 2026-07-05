package defpackage;

import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ehk {
    public static final Comparator a;

    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(ehk.class.getName().concat("$UnsafeComparator")).getEnumConstants();
            Objects.requireNonNull(enumConstants);
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = ahk.E;
        }
        a = comparator;
    }
}
