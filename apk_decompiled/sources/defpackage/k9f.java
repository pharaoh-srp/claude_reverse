package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lk9f;", "Lnqb;", "Ll9f;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class k9f extends nqb {
    public final aaf E;
    public final ukc F;
    public final boolean G;
    public final boolean H;
    public final eo7 I;
    public final zub J;
    public final xx1 K;
    public final boolean L;
    public final b20 M;

    public k9f(b20 b20Var, xx1 xx1Var, eo7 eo7Var, zub zubVar, ukc ukcVar, aaf aafVar, boolean z, boolean z2, boolean z3) {
        this.E = aafVar;
        this.F = ukcVar;
        this.G = z;
        this.H = z2;
        this.I = eo7Var;
        this.J = zubVar;
        this.K = xx1Var;
        this.L = z3;
        this.M = b20Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        l9f l9fVar = new l9f();
        l9fVar.U = this.E;
        l9fVar.V = this.F;
        l9fVar.W = this.G;
        l9fVar.X = this.H;
        l9fVar.Y = this.I;
        l9fVar.Z = this.J;
        l9fVar.a0 = this.K;
        l9fVar.b0 = this.L;
        l9fVar.c0 = this.M;
        return l9fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k9f.class != obj.getClass()) {
            return false;
        }
        k9f k9fVar = (k9f) obj;
        return x44.r(this.E, k9fVar.E) && this.F == k9fVar.F && this.G == k9fVar.G && this.H == k9fVar.H && x44.r(this.I, k9fVar.I) && x44.r(this.J, k9fVar.J) && x44.r(this.K, k9fVar.K) && this.L == k9fVar.L && x44.r(this.M, k9fVar.M);
    }

    public final int hashCode() {
        int iP = fsh.p(fsh.p((this.F.hashCode() + (this.E.hashCode() * 31)) * 31, 31, this.G), 31, this.H);
        eo7 eo7Var = this.I;
        int iHashCode = (iP + (eo7Var != null ? eo7Var.hashCode() : 0)) * 31;
        zub zubVar = this.J;
        int iHashCode2 = (iHashCode + (zubVar != null ? zubVar.hashCode() : 0)) * 31;
        xx1 xx1Var = this.K;
        int iP2 = fsh.p((iHashCode2 + (xx1Var != null ? xx1Var.hashCode() : 0)) * 31, 31, this.L);
        b20 b20Var = this.M;
        return iP2 + (b20Var != null ? b20Var.hashCode() : 0);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        zub zubVar = this.J;
        ((l9f) hqbVar).u1(this.M, this.K, this.I, zubVar, this.F, this.E, this.L, this.G, this.H);
    }
}
