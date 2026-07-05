package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class uqb extends co5 implements tqb {
    public final gfa G;
    public final or9 H;
    public final Map I;
    public final enc J;
    public d86 K;
    public zmc L;
    public final boolean M;
    public final afa N;
    public final u0h O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uqb(sxb sxbVar, gfa gfaVar, or9 or9Var, int i) {
        super(dd8.F, sxbVar);
        sxbVar.getClass();
        this.G = gfaVar;
        this.H = or9Var;
        if (!sxbVar.F) {
            xh6.k("Module name must be special: ", sxbVar);
            throw null;
        }
        this.I = nm6.E;
        enc.a.getClass();
        enc encVar = (enc) F(lz1.O);
        this.J = encVar == null ? dnc.b : encVar;
        this.M = true;
        this.N = gfaVar.b(new e0(22, this));
        this.O = new u0h(new qj9(this, 1));
    }

    @Override // defpackage.bo5
    public final Object E(fo5 fo5Var, Object obj) {
        return fo5Var.s(this, obj);
    }

    @Override // defpackage.tqb
    public final Object F(sqb sqbVar) {
        sqbVar.getClass();
        Object obj = this.I.get(sqbVar);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // defpackage.tqb
    public final List Z() {
        if (this.K != null) {
            return lm6.E;
        }
        String str = getName().E;
        str.getClass();
        mr9.g(str, " were not set", "Dependencies of module ");
        return null;
    }

    @Override // defpackage.tqb
    public final d1a a0(ww7 ww7Var) {
        ww7Var.getClass();
        if (this.M) {
            return (d1a) this.N.invoke(ww7Var);
        }
        ssj.r(this);
        throw null;
    }

    @Override // defpackage.tqb
    public final or9 f() {
        return this.H;
    }

    @Override // defpackage.tqb
    public final Collection g(ww7 ww7Var, bz7 bz7Var) {
        ww7Var.getClass();
        boolean z = this.M;
        if (!z) {
            ssj.r(this);
            throw null;
        }
        if (z) {
            return ((be4) this.O.getValue()).g(ww7Var, bz7Var);
        }
        ssj.r(this);
        throw null;
    }

    @Override // defpackage.bo5
    public final bo5 h() {
        return null;
    }

    @Override // defpackage.co5
    public final String toString() {
        String strL0 = co5.L0(this);
        return this.M ? strL0 : strL0.concat(" !isValid");
    }

    @Override // defpackage.tqb
    public final boolean w(tqb tqbVar) {
        tqbVar.getClass();
        if (this == tqbVar) {
            return true;
        }
        this.K.getClass();
        if (w44.G0(um6.E, tqbVar)) {
            return true;
        }
        Z();
        return tqbVar.Z().contains(this);
    }
}
