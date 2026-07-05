package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lnz5;", "Lnqb;", "Loz5;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class nz5 extends nqb {
    public final wbj E;
    public final poc F;

    public nz5(wbj wbjVar, poc pocVar) {
        this.E = wbjVar;
        this.F = pocVar;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        oz5 oz5Var = new oz5();
        oz5Var.U = this.E;
        oz5Var.V = this.F;
        oz5Var.W = iuj.h;
        return oz5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nz5)) {
            return false;
        }
        nz5 nz5Var = (nz5) obj;
        return x44.r(this.E, nz5Var.E) && this.F == nz5Var.F;
    }

    public final int hashCode() {
        return this.F.hashCode() + (this.E.hashCode() * 31);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        oz5 oz5Var = (oz5) hqbVar;
        wbj wbjVar = oz5Var.U;
        wbj wbjVar2 = this.E;
        boolean zR = x44.r(wbjVar, wbjVar2);
        poc pocVar = this.F;
        if (zR && pocVar == oz5Var.V) {
            return;
        }
        oz5Var.U = wbjVar2;
        oz5Var.V = pocVar;
        oz5Var.W = new c57(wbjVar2, oz5Var.S);
        yfd.W(oz5Var).T();
    }
}
