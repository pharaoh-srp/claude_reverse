package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ef8 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ bae F;
    public final /* synthetic */ bae G;

    public /* synthetic */ ef8(bae baeVar, bae baeVar2, int i) {
        this.E = i;
        this.F = baeVar;
        this.G = baeVar2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        bae baeVar = this.G;
        bae baeVar2 = this.F;
        ova ovaVar = (ova) obj;
        switch (i) {
            case 0:
                if (baeVar2.E == -1) {
                    baeVar2.E = ovaVar.b().E;
                }
                baeVar.E = ovaVar.b().F + 1;
                break;
            default:
                if (baeVar2.E == -1) {
                    baeVar2.E = ovaVar.b().E;
                }
                baeVar.E = ovaVar.b().F + 1;
                break;
        }
        return "";
    }
}
