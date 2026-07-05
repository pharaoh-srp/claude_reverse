package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002¨\u0006\u0004"}, d2 = {"Le90;", "S", "Lnqb;", "Lh90;", "animation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class e90<S> extends nqb {
    public final q5i E;
    public final nwb F;
    public final i90 G;

    public e90(q5i q5iVar, nwb nwbVar, i90 i90Var) {
        this.E = q5iVar;
        this.F = nwbVar;
        this.G = i90Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        h90 h90Var = new h90();
        h90Var.S = this.E;
        h90Var.T = this.F;
        h90Var.U = this.G;
        h90Var.V = -9223372034707292160L;
        return h90Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e90)) {
            return false;
        }
        e90 e90Var = (e90) obj;
        return x44.r(e90Var.E, this.E) && e90Var.F.equals(this.F);
    }

    public final int hashCode() {
        int iHashCode = this.G.hashCode() * 31;
        q5i q5iVar = this.E;
        return this.F.hashCode() + ((iHashCode + (q5iVar != null ? q5iVar.hashCode() : 0)) * 31);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        h90 h90Var = (h90) hqbVar;
        h90Var.S = this.E;
        h90Var.T = this.F;
        h90Var.U = this.G;
    }
}
