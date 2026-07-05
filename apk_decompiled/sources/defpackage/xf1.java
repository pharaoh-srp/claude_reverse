package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xf1 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ sih F;
    public final /* synthetic */ sih G;

    public xf1(sih sihVar, sih sihVar2, int i) {
        this.E = i;
        switch (i) {
            case 1:
                this.F = sihVar;
                this.G = sihVar2;
                break;
            default:
                this.F = sihVar;
                this.G = sihVar2;
                break;
        }
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        sih sihVar = this.F;
        sih sihVar2 = this.G;
        switch (i) {
            case 0:
                sihVar2.B();
                sihVar.E(ykh.G);
                break;
            default:
                zy7 zy7Var = sihVar2.m;
                if (zy7Var != null) {
                    zy7Var.a();
                }
                sihVar.E(ykh.E);
                break;
        }
        return ieiVar;
    }
}
