package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lhd6;", "Lnqb;", "Lod6;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class hd6 extends nqb {
    public static final xg5 M = new xg5(8);
    public final pd6 E;
    public final ukc F;
    public final boolean G;
    public final zub H;
    public final boolean I;
    public final rz7 J;
    public final rz7 K;
    public final boolean L;

    public hd6(pd6 pd6Var, ukc ukcVar, boolean z, zub zubVar, boolean z2, rz7 rz7Var, rz7 rz7Var2, boolean z3) {
        this.E = pd6Var;
        this.F = ukcVar;
        this.G = z;
        this.H = zubVar;
        this.I = z2;
        this.J = rz7Var;
        this.K = rz7Var2;
        this.L = z3;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        xg5 xg5Var = M;
        boolean z = this.G;
        zub zubVar = this.H;
        ukc ukcVar = this.F;
        od6 od6Var = new od6(xg5Var, z, zubVar, ukcVar);
        od6Var.n0 = this.E;
        od6Var.o0 = ukcVar;
        od6Var.p0 = this.I;
        od6Var.q0 = this.J;
        od6Var.r0 = this.K;
        od6Var.s0 = this.L;
        return od6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hd6.class != obj.getClass()) {
            return false;
        }
        hd6 hd6Var = (hd6) obj;
        return x44.r(this.E, hd6Var.E) && this.F == hd6Var.F && this.G == hd6Var.G && x44.r(this.H, hd6Var.H) && this.I == hd6Var.I && x44.r(this.J, hd6Var.J) && x44.r(this.K, hd6Var.K) && this.L == hd6Var.L;
    }

    public final int hashCode() {
        int iP = fsh.p((this.F.hashCode() + (this.E.hashCode() * 31)) * 31, 31, this.G);
        zub zubVar = this.H;
        return Boolean.hashCode(this.L) + ((this.K.hashCode() + ((this.J.hashCode() + fsh.p((iP + (zubVar != null ? zubVar.hashCode() : 0)) * 31, 31, this.I)) * 31)) * 31);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        boolean z;
        boolean z2;
        od6 od6Var = (od6) hqbVar;
        pd6 pd6Var = od6Var.n0;
        pd6 pd6Var2 = this.E;
        if (x44.r(pd6Var, pd6Var2)) {
            z = false;
        } else {
            od6Var.n0 = pd6Var2;
            z = true;
        }
        ukc ukcVar = od6Var.o0;
        ukc ukcVar2 = this.F;
        if (ukcVar != ukcVar2) {
            od6Var.o0 = ukcVar2;
            z = true;
        }
        boolean z3 = od6Var.s0;
        boolean z4 = this.L;
        if (z3 != z4) {
            od6Var.s0 = z4;
            z2 = true;
        } else {
            z2 = z;
        }
        od6Var.q0 = this.J;
        od6Var.r0 = this.K;
        od6Var.p0 = this.I;
        od6Var.J1(M, this.G, this.H, ukcVar2, z2);
    }
}
