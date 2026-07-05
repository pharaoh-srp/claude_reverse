package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wf1 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ sih F;
    public final /* synthetic */ l45 G;
    public final /* synthetic */ sih H;

    public wf1(sih sihVar, l45 l45Var, sih sihVar2, int i) {
        this.E = i;
        switch (i) {
            case 1:
                this.F = sihVar;
                this.G = l45Var;
                this.H = sihVar2;
                break;
            case 2:
                this.F = sihVar;
                this.G = l45Var;
                this.H = sihVar2;
                break;
            default:
                this.F = sihVar;
                this.G = l45Var;
                this.H = sihVar2;
                break;
        }
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        ykh ykhVar = ykh.E;
        sih sihVar = this.F;
        sih sihVar2 = this.H;
        o45 o45Var = o45.H;
        tp4 tp4Var = null;
        l45 l45Var = this.G;
        int i2 = 1;
        switch (i) {
            case 0:
                gb9.D(l45Var, null, o45Var, new vf1(sihVar2, tp4Var, 0), 1);
                sihVar.E(ykhVar);
                break;
            case 1:
                gb9.D(l45Var, null, o45Var, new vf1(sihVar2, tp4Var, i2), 1);
                sihVar.E(ykhVar);
                break;
            default:
                gb9.D(l45Var, null, o45Var, new vf1(sihVar2, tp4Var, 2), 1);
                sihVar.E(ykhVar);
                break;
        }
        return ieiVar;
    }
}
