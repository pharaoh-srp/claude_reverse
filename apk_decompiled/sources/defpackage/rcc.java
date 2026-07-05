package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lrcc;", "Lnqb;", "Lscc;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class rcc extends nqb {
    public final bz7 E;
    public final boolean F;

    public rcc(bz7 bz7Var, boolean z) {
        this.E = bz7Var;
        this.F = z;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        scc sccVar = new scc();
        sccVar.S = this.E;
        sccVar.T = this.F;
        return sccVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        rcc rccVar = obj instanceof rcc ? (rcc) obj : null;
        return rccVar != null && this.E == rccVar.E && this.F == rccVar.F;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.F) + (this.E.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffsetPxModifier(offset=");
        sb.append(this.E);
        sb.append(", rtlAware=");
        return y6a.p(sb, this.F, ')');
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        scc sccVar = (scc) hqbVar;
        bz7 bz7Var = sccVar.S;
        bz7 bz7Var2 = this.E;
        boolean z = this.F;
        if (bz7Var != bz7Var2 || sccVar.T != z) {
            yfd.W(sccVar).u0(false);
        }
        sccVar.S = bz7Var2;
        sccVar.T = z;
    }
}
