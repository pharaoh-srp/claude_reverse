package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ja6 implements ivd {
    public static final Object G = new Object();
    public volatile fe7 E;
    public volatile Object F;

    public static ivd a(fe7 fe7Var) {
        if (fe7Var instanceof ja6) {
            return fe7Var;
        }
        ja6 ja6Var = new ja6();
        ja6Var.F = G;
        ja6Var.E = fe7Var;
        return ja6Var;
    }

    @Override // defpackage.ivd
    public final Object get() {
        Object obj;
        Object obj2 = this.F;
        Object obj3 = G;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.F;
                if (obj == obj3) {
                    obj = this.E.get();
                    Object obj4 = this.F;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.F = obj;
                    this.E = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
