package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fce extends gce {
    public final zy7 F;
    public volatile Object G = null;

    public fce(zy7 zy7Var) {
        this.F = zy7Var;
    }

    public final Object a() {
        Object obj = gce.E;
        Object obj2 = this.G;
        if (obj2 != null) {
            if (obj2 == obj) {
                return null;
            }
            return obj2;
        }
        Object objA = this.F.a();
        if (objA != null) {
            obj = objA;
        }
        this.G = obj;
        return objA;
    }
}
