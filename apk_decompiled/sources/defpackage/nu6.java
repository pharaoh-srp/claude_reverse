package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class nu6 {
    public static final nu6 a = new nu6();
    public static final au6 b = au6.E;
    public static final ur6 c = new ur6(sxb.g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{"unknown class"}, 1))));
    public static final ku6 d = c(mu6.CYCLIC_SUPERTYPES, new String[0]);
    public static final ku6 e = c(mu6.ERROR_PROPERTY_TYPE, new String[0]);
    public static final Set f = sf5.f0(new bu6());

    public static final gu6 a(int i, boolean z, String... strArr) {
        sq6.a(i);
        return z ? new dph(i, (String[]) Arrays.copyOf(strArr, strArr.length)) : new gu6(i, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final gu6 b(int i, String... strArr) {
        sq6.a(i);
        return a(i, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final ku6 c(mu6 mu6Var, String... strArr) {
        mu6Var.getClass();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        return e(mu6Var, lm6.E, d(mu6Var, (String[]) Arrays.copyOf(strArr2, strArr2.length)), (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static lu6 d(mu6 mu6Var, String... strArr) {
        mu6Var.getClass();
        return new lu6(mu6Var, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static ku6 e(mu6 mu6Var, List list, u9i u9iVar, String... strArr) {
        mu6Var.getClass();
        return new ku6(u9iVar, b(7, u9iVar.toString()), mu6Var, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean f(bo5 bo5Var) {
        if (bo5Var != null) {
            return (bo5Var instanceof ur6) || (bo5Var.h() instanceof ur6) || bo5Var == b;
        }
        return false;
    }
}
