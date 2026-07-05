package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lm9f;", "Lnqb;", "Lz9f;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class m9f extends nqb {
    public final aaf E;
    public final ukc F;
    public final boolean G;
    public final boolean H;
    public final eo7 I;
    public final zub J;

    public m9f(aaf aafVar, ukc ukcVar, boolean z, boolean z2, eo7 eo7Var, zub zubVar) {
        this.E = aafVar;
        this.F = ukcVar;
        this.G = z;
        this.H = z2;
        this.I = eo7Var;
        this.J = zubVar;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new z9f(null, null, this.I, this.J, this.F, this.E, this.G, this.H);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9f)) {
            return false;
        }
        m9f m9fVar = (m9f) obj;
        return x44.r(this.E, m9fVar.E) && this.F == m9fVar.F && this.G == m9fVar.G && this.H == m9fVar.H && x44.r(this.I, m9fVar.I) && x44.r(this.J, m9fVar.J);
    }

    public final int hashCode() {
        int iP = fsh.p(fsh.p((this.F.hashCode() + (this.E.hashCode() * 31)) * 961, 31, this.G), 31, this.H);
        eo7 eo7Var = this.I;
        int iHashCode = (iP + (eo7Var != null ? eo7Var.hashCode() : 0)) * 31;
        zub zubVar = this.J;
        return (iHashCode + (zubVar != null ? zubVar.hashCode() : 0)) * 31;
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        ((z9f) hqbVar).K1(null, null, this.I, this.J, this.F, this.E, this.G, this.H);
    }
}
