package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ypj implements lqj {
    public static final Object G = new Object();
    public volatile lqj E;
    public volatile Object F;

    public static lqj a(lqj lqjVar) {
        if (lqjVar instanceof ypj) {
            return lqjVar;
        }
        ypj ypjVar = new ypj();
        ypjVar.F = G;
        ypjVar.E = lqjVar;
        return ypjVar;
    }

    @Override // defpackage.lqj
    public final Object zza() {
        Object objZza;
        Object obj = this.F;
        Object obj2 = G;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objZza = this.F;
                if (objZza == obj2) {
                    objZza = this.E.zza();
                    Object obj3 = this.F;
                    if (obj3 != obj2 && obj3 != objZza) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZza + ". This is likely due to a circular dependency.");
                    }
                    this.F = objZza;
                    this.E = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objZza;
    }
}
