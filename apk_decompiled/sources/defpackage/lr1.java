package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llr1;", "Lnqb;", "Lmr1;", "ui"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class lr1 extends nqb {
    public final e0g E;
    public final bz7 F;

    public lr1(e0g e0gVar, bz7 bz7Var) {
        this.E = e0gVar;
        this.F = bz7Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        mr1 mr1Var = new mr1();
        mr1Var.W = this.E;
        mr1Var.X = this.F;
        mr1Var.Z = 0L;
        mr1Var.a0 = d54.b;
        mr1Var.b0 = 1.0f;
        mr1Var.c0 = 3;
        return mr1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lr1)) {
            return false;
        }
        lr1 lr1Var = (lr1) obj;
        return x44.r(this.E, lr1Var.E) && this.F == lr1Var.F;
    }

    public final int hashCode() {
        return this.F.hashCode() + (this.E.hashCode() * 31);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        mr1 mr1Var = (mr1) hqbVar;
        e0g e0gVar = mr1Var.W;
        e0g e0gVar2 = this.E;
        if (!x44.r(e0gVar, e0gVar2)) {
            mr1Var.W = e0gVar2;
            mr1Var.p1();
        }
        bz7 bz7Var = mr1Var.X;
        bz7 bz7Var2 = this.F;
        if (bz7Var != bz7Var2) {
            mr1Var.X = bz7Var2;
            mr1Var.V = false;
            wd6.t0(mr1Var);
        }
    }
}
