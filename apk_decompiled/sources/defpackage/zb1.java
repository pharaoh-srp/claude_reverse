package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lzb1;", "Lnqb;", "Lcc1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class zb1 extends nqb {
    public final long E;
    public final jy1 F;
    public final float G;
    public final e0g H;

    public zb1(long j, jy1 jy1Var, e0g e0gVar, int i) {
        j = (i & 1) != 0 ? d54.h : j;
        jy1Var = (i & 2) != 0 ? null : jy1Var;
        this.E = j;
        this.F = jy1Var;
        this.G = 1.0f;
        this.H = e0gVar;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        cc1 cc1Var = new cc1();
        cc1Var.S = this.E;
        cc1Var.T = this.F;
        cc1Var.U = this.G;
        cc1Var.V = this.H;
        cc1Var.W = 9205357640488583168L;
        return cc1Var;
    }

    public final boolean equals(Object obj) {
        zb1 zb1Var = obj instanceof zb1 ? (zb1) obj : null;
        return zb1Var != null && d54.c(this.E, zb1Var.E) && x44.r(this.F, zb1Var.F) && this.G == zb1Var.G && x44.r(this.H, zb1Var.H);
    }

    public final int hashCode() {
        int i = d54.i;
        int iHashCode = Long.hashCode(this.E) * 31;
        jy1 jy1Var = this.F;
        return this.H.hashCode() + vb7.b(this.G, (iHashCode + (jy1Var != null ? jy1Var.hashCode() : 0)) * 31, 31);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        cc1 cc1Var = (cc1) hqbVar;
        cc1Var.S = this.E;
        cc1Var.T = this.F;
        cc1Var.U = this.G;
        e0g e0gVar = cc1Var.V;
        e0g e0gVar2 = this.H;
        if (!x44.r(e0gVar, e0gVar2)) {
            cc1Var.V = e0gVar2;
            yfd.W(cc1Var).V();
        }
        wd6.t0(cc1Var);
    }
}
