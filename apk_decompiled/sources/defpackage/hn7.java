package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hn7 extends v28 {
    private static final hn7 DEFAULT_INSTANCE;
    public static volatile n28 f;
    public final wud e = wud.H;

    static {
        hn7 hn7Var = new hn7();
        DEFAULT_INSTANCE = hn7Var;
        hn7Var.b &= Integer.MAX_VALUE;
        v28.d.put(hn7.class, hn7Var);
    }

    public static hn7 h() {
        return DEFAULT_INSTANCE;
    }

    @Override // defpackage.v28
    public final Object a(int i) {
        n28 n28Var;
        switch (sq6.F(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new f2e(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001b", new Object[]{"constrainedValues_", gn7.class});
            case 3:
                return new hn7();
            case 4:
                return new fn7();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                n28 n28Var2 = f;
                if (n28Var2 != null) {
                    return n28Var2;
                }
                synchronized (hn7.class) {
                    try {
                        n28Var = f;
                        if (n28Var == null) {
                            n28Var = new n28();
                            f = n28Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return n28Var;
            default:
                mr9.x();
                return null;
        }
    }
}
