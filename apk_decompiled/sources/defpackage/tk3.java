package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tk3 implements zy7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ of6 F;
    public final /* synthetic */ l45 G;

    public /* synthetic */ tk3(l45 l45Var, of6 of6Var) {
        this.G = l45Var;
        this.F = of6Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        l45 l45Var = this.G;
        of6 of6Var = this.F;
        switch (i) {
            case 0:
                gb9.D(l45Var, null, null, new nj3(of6Var, null, 3), 3);
                return iei.a;
            default:
                if (((Boolean) of6Var.a.invoke(og6.E)).booleanValue()) {
                    gb9.D(l45Var, null, null, new nj3(of6Var, null, 4), 3);
                }
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ tk3(of6 of6Var, l45 l45Var) {
        this.F = of6Var;
        this.G = l45Var;
    }
}
