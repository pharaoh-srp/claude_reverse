package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ru5 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ String F;
    public final /* synthetic */ long G;
    public final /* synthetic */ tkh H;

    public /* synthetic */ ru5(String str, long j, tkh tkhVar) {
        this.F = str;
        this.G = j;
        this.H = tkhVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                jwk.e(this.F, this.H, this.G, (ld4) obj, x44.p0(1));
                break;
            default:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    tjh.b(this.F, null, this.G, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, this.H, e18Var, 0, 24960, 110586);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ru5(String str, tkh tkhVar, long j, int i) {
        this.F = str;
        this.H = tkhVar;
        this.G = j;
    }
}
