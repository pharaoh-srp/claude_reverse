package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hyc extends jyc implements qe4, ne4 {
    public static final hyc H = new hyc(x6i.e, 0);

    @Override // defpackage.jyc, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof fvd) {
            return super.containsKey((fvd) obj);
        }
        return false;
    }

    @Override // defpackage.l2, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof zqi) {
            return super.containsValue((zqi) obj);
        }
        return false;
    }

    @Override // defpackage.jyc
    public final nyc f() {
        gyc gycVar = new gyc(this);
        gycVar.K = this;
        return gycVar;
    }

    @Override // defpackage.jyc
    public final nyc g() {
        gyc gycVar = new gyc(this);
        gycVar.K = this;
        return gycVar;
    }

    @Override // defpackage.jyc, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof fvd) {
            return (zqi) super.get((fvd) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof fvd) ? obj2 : (zqi) super.getOrDefault((fvd) obj, (zqi) obj2);
    }

    public final hyc i(fvd fvdVar, zqi zqiVar) {
        g11 g11VarU = this.E.u(fvdVar.hashCode(), fvdVar, zqiVar, 0);
        return g11VarU == null ? this : new hyc((x6i) g11VarU.G, this.F + g11VarU.F);
    }

    @Override // defpackage.ne4
    public final Object u0(fvd fvdVar) {
        return u00.I(this, fvdVar);
    }
}
