package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z1a extends yr9 {
    public final gfa F;
    public final zy7 G;
    public final dfa H;

    public z1a(gfa gfaVar, zy7 zy7Var) {
        gfaVar.getClass();
        this.F = gfaVar;
        this.G = zy7Var;
        this.H = new dfa(gfaVar, zy7Var);
    }

    @Override // defpackage.yr9
    public final fab G() {
        return l0().G();
    }

    @Override // defpackage.yr9
    public final List H() {
        return l0().H();
    }

    @Override // defpackage.yr9
    public final r9i K() {
        return l0().K();
    }

    @Override // defpackage.yr9
    public final u9i O() {
        return l0().O();
    }

    @Override // defpackage.yr9
    public final boolean b0() {
        return l0().b0();
    }

    @Override // defpackage.yr9
    public final yr9 j0(es9 es9Var) {
        es9Var.getClass();
        return new z1a(this.F, new xz(es9Var, 15, this));
    }

    @Override // defpackage.yr9
    public final fhi k0() {
        yr9 yr9VarL0 = l0();
        while (yr9VarL0 instanceof z1a) {
            yr9VarL0 = ((z1a) yr9VarL0).l0();
        }
        yr9VarL0.getClass();
        return (fhi) yr9VarL0;
    }

    public final yr9 l0() {
        return (yr9) this.H.a();
    }

    public final String toString() {
        dfa dfaVar = this.H;
        return (dfaVar.G == ffa.E || dfaVar.G == ffa.F) ? "<Not computed yet>" : l0().toString();
    }
}
