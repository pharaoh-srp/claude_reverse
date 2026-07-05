package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pl5 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ String G;

    public /* synthetic */ pl5(String str, String str2, int i) {
        this.E = i;
        this.F = str;
        this.G = str2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        String str = this.G;
        String str2 = this.F;
        ekf ekfVar = (ekf) obj;
        switch (i) {
            case 0:
                ckf.l(ekfVar, str2 + ", " + str);
                break;
            case 1:
                ekfVar.getClass();
                ckf.l(ekfVar, str2 + ", " + str);
                break;
            case 2:
                ekfVar.getClass();
                ckf.l(ekfVar, str2);
                ckf.g(ekfVar, str, null);
                break;
            default:
                ekfVar.getClass();
                ckf.l(ekfVar, str2);
                ckf.v(ekfVar, str);
                break;
        }
        return ieiVar;
    }
}
