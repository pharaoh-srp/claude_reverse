package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class xmc extends eo5 implements wmc {
    public final ww7 I;
    public final String J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xmc(tqb tqbVar, ww7 ww7Var) {
        super(tqbVar, dd8.F, ww7Var.g(), neg.n);
        tqbVar.getClass();
        ww7Var.getClass();
        this.I = ww7Var;
        this.J = "package " + ww7Var + " of " + tqbVar;
    }

    @Override // defpackage.bo5
    public final Object E(fo5 fo5Var, Object obj) {
        return fo5Var.A(this, obj);
    }

    @Override // defpackage.eo5, defpackage.bo5
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public final tqb h() {
        bo5 bo5VarH = super.h();
        bo5VarH.getClass();
        return (tqb) bo5VarH;
    }

    @Override // defpackage.eo5, defpackage.do5
    public neg d() {
        return neg.n;
    }

    @Override // defpackage.co5
    public String toString() {
        return this.J;
    }
}
