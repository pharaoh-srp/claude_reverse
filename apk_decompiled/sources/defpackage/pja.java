package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pja implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ String F;
    public final /* synthetic */ String G;
    public final /* synthetic */ int H;

    public /* synthetic */ pja(String str, int i, String str2) {
        this.F = str;
        this.H = i;
        this.G = str2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        String str = this.G;
        ld4 ld4Var = (ld4) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    String str2 = this.F;
                    zh4.g(this.H, 0, e18Var, null, str2, str2.equals(str));
                }
                break;
            default:
                num.intValue();
                ltk.g(this.F, str, ld4Var, x44.p0(this.H | 1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ pja(String str, String str2, int i) {
        this.F = str;
        this.G = str2;
        this.H = i;
    }
}
