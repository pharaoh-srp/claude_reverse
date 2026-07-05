package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ce9 {
    public static final be9 a;
    public static final be9 b;
    public static final be9 c;
    public static final HashMap d;

    static {
        hf9 hf9Var = hf9.c;
        be9 be9Var = new be9(hf9Var, 0);
        a = be9Var;
        jf9 jf9Var = jf9.c;
        be9 be9Var2 = new be9(jf9Var, 1);
        b = be9Var2;
        if9 if9Var = if9.c;
        be9 be9Var3 = new be9(if9Var, 2);
        c = be9Var3;
        HashMap map = new HashMap();
        d = map;
        map.put(hf9Var, be9Var);
        map.put(jf9Var, be9Var2);
        map.put(if9Var, be9Var3);
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i == 5 || i == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i != 5 && i != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(m6e m6eVar, go5 go5Var, bo5 bo5Var) {
        go5 go5VarT;
        if (bo5Var == null) {
            a(1);
            throw null;
        }
        if (go5Var instanceof e92) {
            go5VarT = m06.t((e92) go5Var);
        } else {
            int i = m06.a;
            go5VarT = go5Var;
        }
        if (c(go5VarT, bo5Var)) {
            return true;
        }
        return q06.c.a(m6eVar, go5Var, bo5Var);
    }

    public static boolean c(go5 go5Var, bo5 bo5Var) {
        if (go5Var == null) {
            a(2);
            throw null;
        }
        if (bo5Var == null) {
            a(3);
            throw null;
        }
        wmc wmcVar = (wmc) m06.i(go5Var, wmc.class, false);
        wmc wmcVar2 = (wmc) m06.i(bo5Var, wmc.class, false);
        return (wmcVar2 == null || wmcVar == null || !((xmc) wmcVar).I.equals(((xmc) wmcVar2).I)) ? false : true;
    }
}
