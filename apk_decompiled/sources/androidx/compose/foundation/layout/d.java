package androidx.compose.foundation.layout;

import defpackage.e56;
import defpackage.eij;
import defpackage.fsh;
import defpackage.hqb;
import defpackage.mdj;
import defpackage.nqb;
import defpackage.pz7;
import defpackage.x44;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/d;", "Lnqb;", "Leij;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class d extends nqb {
    public final e56 E;
    public final boolean F;
    public final pz7 G;
    public final Object H;

    public d(e56 e56Var, boolean z, pz7 pz7Var, Object obj) {
        this.E = e56Var;
        this.F = z;
        this.G = pz7Var;
        this.H = obj;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        eij eijVar = new eij();
        eijVar.S = this.E;
        eijVar.T = this.F;
        eijVar.U = this.G;
        return eijVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.E == dVar.E && this.F == dVar.F && x44.r(this.H, dVar.H);
    }

    public final int hashCode() {
        return this.H.hashCode() + fsh.p(this.E.hashCode() * 31, 31, this.F);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        eij eijVar = (eij) hqbVar;
        eijVar.S = this.E;
        eijVar.T = this.F;
        eijVar.U = this.G;
    }
}
