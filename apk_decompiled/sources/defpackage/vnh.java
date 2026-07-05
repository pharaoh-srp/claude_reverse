package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class vnh {
    public static final ThreadLocal a = new ThreadLocal();

    public static vz6 a() {
        ThreadLocal threadLocal = a;
        vz6 vz6Var = (vz6) threadLocal.get();
        if (vz6Var != null) {
            return vz6Var;
        }
        zr1 zr1Var = new zr1(Thread.currentThread());
        threadLocal.set(zr1Var);
        return zr1Var;
    }
}
