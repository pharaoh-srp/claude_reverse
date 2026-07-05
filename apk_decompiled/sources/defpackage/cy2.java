package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cy2 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ String G;
    public final /* synthetic */ String H;

    public /* synthetic */ cy2(String str, String str2, String str3, int i) {
        this.E = i;
        this.F = str;
        this.G = str2;
        this.H = str3;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        String str = this.H;
        String str2 = this.G;
        String str3 = this.F;
        ekf ekfVar = (ekf) obj;
        switch (i) {
            case 0:
                ekfVar.getClass();
                ckf.l(ekfVar, str3);
                ckf.g(ekfVar, str2, null);
                if (str != null) {
                    ckf.v(ekfVar, str);
                }
                break;
            default:
                ekfVar.getClass();
                ckf.l(ekfVar, str3);
                ckf.g(ekfVar, str2, null);
                if (str != null) {
                    ckf.v(ekfVar, str);
                }
                break;
        }
        return ieiVar;
    }
}
