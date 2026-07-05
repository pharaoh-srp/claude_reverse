package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dih implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ cae F;
    public final /* synthetic */ cae G;
    public final /* synthetic */ sih H;

    public /* synthetic */ dih(cae caeVar, cae caeVar2, sih sihVar, int i) {
        this.E = i;
        this.F = caeVar;
        this.G = caeVar2;
        this.H = sihVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        cae caeVar = this.G;
        sih sihVar = this.H;
        cae caeVar2 = this.F;
        switch (i) {
            case 0:
                sih.m(caeVar2, caeVar, sihVar);
                break;
            case 1:
                sih.l(caeVar2, caeVar, sihVar);
                break;
            case 2:
                sih.l(caeVar2, caeVar, sihVar);
                break;
            default:
                sih.m(caeVar2, caeVar, sihVar);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ dih(cae caeVar, sih sihVar, cae caeVar2, int i) {
        this.E = i;
        this.F = caeVar;
        this.H = sihVar;
        this.G = caeVar2;
    }
}
