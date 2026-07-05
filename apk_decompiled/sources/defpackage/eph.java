package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leph;", "Lnqb;", "Lgph;", "material3"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final /* data */ class eph extends nqb {
    public final w79 E;
    public final boolean F;
    public final yig G;

    public eph(w79 w79Var, boolean z, yig yigVar) {
        this.E = w79Var;
        this.F = z;
        this.G = yigVar;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        gph gphVar = new gph();
        gphVar.S = this.E;
        gphVar.T = this.F;
        gphVar.U = this.G;
        gphVar.Y = Float.NaN;
        gphVar.Z = Float.NaN;
        return gphVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eph)) {
            return false;
        }
        eph ephVar = (eph) obj;
        return x44.r(this.E, ephVar.E) && this.F == ephVar.F && this.G.equals(ephVar.G);
    }

    public final int hashCode() {
        return this.G.hashCode() + fsh.p(this.E.hashCode() * 31, 31, this.F);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.E + ", checked=" + this.F + ", animationSpec=" + this.G + ')';
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        gph gphVar = (gph) hqbVar;
        gphVar.S = this.E;
        boolean z = gphVar.T;
        boolean z2 = this.F;
        if (z != z2) {
            yfd.W(gphVar).T();
        }
        gphVar.T = z2;
        gphVar.U = this.G;
        if (gphVar.X == null && !Float.isNaN(gphVar.Z)) {
            gphVar.X = zh4.a(gphVar.Z);
        }
        if (gphVar.W != null || Float.isNaN(gphVar.Y)) {
            return;
        }
        gphVar.W = zh4.a(gphVar.Y);
    }
}
