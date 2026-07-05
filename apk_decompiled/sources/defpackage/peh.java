package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class peh extends qw5 implements oe4, beh {
    public o1i U;
    public bz7 V;
    public bz7 W;
    public bz7 X;
    public fkg Y;
    public final wz5 Z = mpk.w(new p3f(13, this));
    public l9e a0 = l9e.e;

    public peh(o1i o1iVar, bz7 bz7Var, bz7 bz7Var2, bz7 bz7Var3) {
        this.U = o1iVar;
        this.V = bz7Var;
        this.W = bz7Var2;
        this.X = bz7Var3;
    }

    @Override // defpackage.beh
    public final aeh d0() {
        return (aeh) this.Z.getValue();
    }

    @Override // defpackage.hqb
    public final void h1() {
        o1i o1iVar = this.U;
        o1iVar.b = n1i.G;
        o1iVar.a = this;
    }

    @Override // defpackage.hqb
    public final void i1() {
        o1i o1iVar = this.U;
        o1iVar.b = n1i.F;
        o1iVar.a = null;
    }

    @Override // defpackage.beh
    public final long j(cu9 cu9Var) {
        return m(cu9Var).h();
    }

    @Override // defpackage.beh
    public final l9e m(cu9 cu9Var) {
        l9e l9eVar;
        if (this.R && (l9eVar = (l9e) this.X.invoke(cu9Var)) != null) {
            this.a0 = l9eVar;
            return l9eVar;
        }
        return this.a0;
    }
}
