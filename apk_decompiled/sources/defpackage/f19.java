package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lf19;", "Lnqb;", "Lg19;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class f19 extends nqb {
    public final w79 E;
    public final h19 F;

    public f19(w79 w79Var, h19 h19Var) {
        this.E = w79Var;
        this.F = h19Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        nw5 nw5VarA = this.F.a(this.E);
        g19 g19Var = new g19();
        g19Var.U = nw5VarA;
        g19Var.p1(nw5VarA);
        return g19Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f19)) {
            return false;
        }
        f19 f19Var = (f19) obj;
        return x44.r(this.E, f19Var.E) && x44.r(this.F, f19Var.F);
    }

    public final int hashCode() {
        return this.F.hashCode() + (this.E.hashCode() * 31);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        g19 g19Var = (g19) hqbVar;
        nw5 nw5VarA = this.F.a(this.E);
        g19Var.q1(g19Var.U);
        g19Var.U = nw5VarA;
        g19Var.p1(nw5VarA);
    }
}
