package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mlk {
    public static final l51 a;

    static {
        l51 l51Var;
        synchronized (tlk.class) {
            try {
                if (tlk.a == null) {
                    l51 l51Var2 = new l51(1);
                    synchronized (tlk.class) {
                        if (tlk.a != null) {
                            throw new IllegalStateException("init() already called");
                        }
                        tlk.a = l51Var2;
                    }
                }
                l51Var = tlk.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        a = l51Var;
    }
}
