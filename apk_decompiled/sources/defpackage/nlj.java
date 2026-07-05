package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nlj implements qlj {
    public static final Object G = new Object();
    public volatile plj E;
    public volatile Object F;

    /* JADX WARN: Multi-variable type inference failed */
    public static nlj a(plj pljVar) {
        if (pljVar instanceof nlj) {
            return (nlj) pljVar;
        }
        nlj nljVar = new nlj();
        nljVar.F = G;
        nljVar.E = pljVar;
        return nljVar;
    }

    @Override // defpackage.qlj
    public final Object d() {
        Object obj = this.F;
        Object obj2 = G;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.F;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object objD = this.E.d();
                Object obj4 = this.F;
                if (obj4 != obj2 && obj4 != objD) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objD + ". This is likely due to a circular dependency.");
                }
                this.F = objD;
                this.E = null;
                return objD;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
