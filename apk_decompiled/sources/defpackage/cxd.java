package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcxd;", "Lnqb;", "Llxd;", "material3"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class cxd extends nqb {
    public final boolean E;
    public final zy7 F;
    public final boolean G;
    public final mxd H;
    public final float I;

    public cxd(boolean z, zy7 zy7Var, boolean z2, mxd mxdVar, float f) {
        this.E = z;
        this.F = zy7Var;
        this.G = z2;
        this.H = mxdVar;
        this.I = f;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new lxd(this.E, this.F, this.G, this.H, this.I);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxd)) {
            return false;
        }
        cxd cxdVar = (cxd) obj;
        return this.E == cxdVar.E && this.G == cxdVar.G && this.F == cxdVar.F && x44.r(this.H, cxdVar.H) && va6.b(this.I, cxdVar.I);
    }

    public final int hashCode() {
        return Float.hashCode(this.I) + ((this.H.hashCode() + ((this.F.hashCode() + fsh.p(Boolean.hashCode(this.E) * 31, 31, this.G)) * 31)) * 31);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        lxd lxdVar = (lxd) hqbVar;
        lxdVar.V = this.F;
        lxdVar.W = this.G;
        lxdVar.X = this.H;
        lxdVar.Y = this.I;
        boolean z = lxdVar.U;
        boolean z2 = this.E;
        if (z != z2) {
            lxdVar.U = z2;
            gb9.D(lxdVar.d1(), null, null, new ixd(lxdVar, null, 1), 3);
        }
    }
}
