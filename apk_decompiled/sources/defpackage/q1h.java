package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lq1h;", "Lnqb;", "Lr1h;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class q1h extends nqb {
    public final bz7 E;

    public q1h(bz7 bz7Var) {
        this.E = bz7Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        r1h r1hVar = new r1h(iuj.h);
        r1hVar.V = this.E;
        return r1hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q1h) {
            return this.E == ((q1h) obj).E;
        }
        return false;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        r1h r1hVar = (r1h) hqbVar;
        bz7 bz7Var = r1hVar.V;
        bz7 bz7Var2 = this.E;
        if (bz7Var != bz7Var2) {
            r1hVar.V = bz7Var2;
            gdj gdjVar = r1hVar.W;
            if (gdjVar != null) {
                wbj wbjVar = (wbj) bz7Var2.invoke(gdjVar);
                if (x44.r(wbjVar, r1hVar.U)) {
                    return;
                }
                r1hVar.U = wbjVar;
                r1hVar.q1();
            }
        }
    }
}
