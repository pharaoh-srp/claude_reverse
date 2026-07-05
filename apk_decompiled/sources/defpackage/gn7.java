package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gn7 extends v28 {
    private static final gn7 DEFAULT_INSTANCE;
    public static volatile n28 e;

    static {
        gn7 gn7Var = new gn7();
        DEFAULT_INSTANCE = gn7Var;
        gn7Var.b = Integer.MAX_VALUE;
        v28.d.put(gn7.class, gn7Var);
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
                return new f2e(DEFAULT_INSTANCE, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003:\u0000\u00045\u0000\u00054\u0000\u0006;\u0000\u0007=\u0000\bဇ\u0002", new Object[]{"value_", "valueCase_", "bitField0_", "appId_", "minVersion_", "applyEvenIfCronetTelemetryDisabled_"});
            case 3:
                return new gn7();
            case 4:
                return new fn7(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                n28 n28Var2 = e;
                if (n28Var2 != null) {
                    return n28Var2;
                }
                synchronized (gn7.class) {
                    try {
                        n28Var = e;
                        if (n28Var == null) {
                            n28Var = new n28();
                            e = n28Var;
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
