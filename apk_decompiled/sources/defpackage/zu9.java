package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zu9 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ av9 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zu9(int i, av9 av9Var) {
        super(0);
        this.F = i;
        this.G = av9Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        av9 av9Var = this.G;
        switch (i) {
            case 0:
                ev9 ev9VarT = av9Var.t();
                ev9VarT.p.e0 = true;
                lma lmaVar = ev9VarT.q;
                if (lmaVar != null) {
                    lmaVar.Y = true;
                }
                return iei.a;
            default:
                av9 av9VarG = av9Var.G();
                av9VarG.getClass();
                z39 z39Var = (z39) av9VarG.k0.H;
                z39Var.getClass();
                return z39Var;
        }
    }
}
