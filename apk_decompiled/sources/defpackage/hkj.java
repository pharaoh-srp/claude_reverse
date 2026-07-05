package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lhkj;", "Lnqb;", "Lqkj;", "zoomable_release"}, k = 1, mv = {1, 9, 0}, xi = mdj.f)
final /* data */ class hkj extends nqb {
    public final gkj E;
    public final boolean F;
    public final d9f G;
    public final bz7 H;
    public final pz7 I;

    public hkj(gkj gkjVar, boolean z, d9f d9fVar, bz7 bz7Var, pz7 pz7Var) {
        gkjVar.getClass();
        this.E = gkjVar;
        this.F = z;
        this.G = d9fVar;
        this.H = bz7Var;
        this.I = pz7Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new qkj(this.E, this.F, this.G, this.H, this.I);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hkj)) {
            return false;
        }
        hkj hkjVar = (hkj) obj;
        return x44.r(this.E, hkjVar.E) && this.F == hkjVar.F && this.G == hkjVar.G && this.H.equals(hkjVar.H) && this.I.equals(hkjVar.I);
    }

    public final int hashCode() {
        return this.I.hashCode() + qy1.e(this.H, (this.G.hashCode() + fsh.p(fsh.p(this.E.hashCode() * 31, 31, true), 31, this.F)) * 31, 31);
    }

    public final String toString() {
        return "ZoomableElement(zoomState=" + this.E + ", zoomEnabled=true, enableOneFingerZoom=" + this.F + ", scrollGesturePropagation=" + this.G + ", onTap=" + this.H + ", onDoubleTap=" + this.I + ')';
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        qkj qkjVar = (qkj) hqbVar;
        qkjVar.getClass();
        gkj gkjVar = this.E;
        gkjVar.getClass();
        if (!x44.r(qkjVar.U, gkjVar)) {
            gkjVar.d(qkjVar.a0);
            qkjVar.U = gkjVar;
        }
        qkjVar.V = true;
        qkjVar.W = this.F;
        qkjVar.X = this.G;
        qkjVar.Y = this.H;
        qkjVar.Z = this.I;
    }
}
