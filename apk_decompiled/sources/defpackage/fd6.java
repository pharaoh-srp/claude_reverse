package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Lfd6;", "T", "Lnqb;", "Lgd6;", "material3"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class fd6<T> extends nqb {
    public final q28 E;
    public final pz7 F;
    public final ukc G;

    public fd6(q28 q28Var, pz7 pz7Var, ukc ukcVar) {
        this.E = q28Var;
        this.F = pz7Var;
        this.G = ukcVar;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        gd6 gd6Var = new gd6();
        gd6Var.S = this.E;
        gd6Var.T = this.F;
        gd6Var.U = this.G;
        return gd6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd6)) {
            return false;
        }
        fd6 fd6Var = (fd6) obj;
        return x44.r(this.E, fd6Var.E) && this.F == fd6Var.F && this.G == fd6Var.G;
    }

    public final int hashCode() {
        return this.G.hashCode() + ((this.F.hashCode() + (this.E.hashCode() * 31)) * 31);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        gd6 gd6Var = (gd6) hqbVar;
        q28 q28Var = gd6Var.S;
        q28 q28Var2 = this.E;
        boolean zR = x44.r(q28Var, q28Var2);
        gd6Var.S = q28Var2;
        gd6Var.T = this.F;
        gd6Var.U = this.G;
        if (zR) {
            return;
        }
        gd6Var.V = false;
        yfd.W(gd6Var).T();
    }
}
