package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class er5 {
    public static final gw5 a;

    static {
        String property;
        gw5 gw5Var;
        int i = u1h.a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            ft5 ft5Var = g86.a;
            ye8 ye8Var = tpa.a;
            ye8 ye8Var2 = ye8Var.J;
            gw5Var = ye8Var;
            if (ye8Var == null) {
                gw5Var = dr5.P;
            }
        } else {
            gw5Var = dr5.P;
        }
        a = gw5Var;
    }
}
