package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llh6;", "Lnqb;", "Lsb6;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class lh6 extends nqb {
    public final bz7 E;

    public lh6(bz7 bz7Var) {
        this.E = bz7Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        pb6 pb6Var = eve.a;
        sb6 sb6Var = new sb6();
        sb6Var.U = this.E;
        sb6Var.V = pb6Var;
        return sb6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lh6) && this.E == ((lh6) obj).E;
    }

    public final int hashCode() {
        return this.E.hashCode() + (eve.a.hashCode() * 31);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        sb6 sb6Var = (sb6) hqbVar;
        pb6 pb6Var = eve.a;
        sb6Var.U = this.E;
        if (pb6Var != sb6Var.V) {
            mb6 mb6Var = sb6Var.W;
            if (mb6Var != null) {
                sb6Var.q1(mb6Var);
            }
            sb6Var.V = pb6Var;
            mb6 mb6Var2 = new mb6(new j40(new a2(25, sb6Var), 5, pb6Var), 1);
            sb6Var.p1(mb6Var2);
            sb6Var.W = mb6Var2;
        }
    }
}
