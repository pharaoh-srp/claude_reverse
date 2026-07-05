package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i73 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ l45 F;
    public final /* synthetic */ t53 G;
    public final /* synthetic */ hw2 H;
    public final /* synthetic */ bt7 I;

    public /* synthetic */ i73(l45 l45Var, t53 t53Var, hw2 hw2Var, bt7 bt7Var, int i) {
        this.E = i;
        this.F = l45Var;
        this.G = t53Var;
        this.H = hw2Var;
        this.I = bt7Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = this.F;
        switch (i) {
            case 0:
                vhd vhdVar = (vhd) obj;
                vhdVar.getClass();
                gb9.D(l45Var, null, null, new cm(this.G, vhdVar, this.H, this.I, null, 22), 3);
                break;
            default:
                dgb dgbVar = (dgb) obj;
                dgbVar.getClass();
                gb9.D(l45Var, null, null, new tm(this.G, dgbVar, this.H, this.I, (tp4) null, 15), 3);
                break;
        }
        return ieiVar;
    }
}
