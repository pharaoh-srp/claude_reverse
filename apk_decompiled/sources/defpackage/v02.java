package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v02 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ long F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ v02(long j, mnc mncVar, rz7 rz7Var) {
        this.F = j;
        this.G = mncVar;
        this.H = rz7Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.H;
        Object obj4 = this.G;
        int i2 = 2;
        switch (i) {
            case 0:
                mnc mncVar = (mnc) obj4;
                rz7 rz7Var = (rz7) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    zh4.h(this.F, ((gwa) e18Var.j(jwa.a)).b.m, fd9.q0(417635459, new ow1(mncVar, i2, rz7Var), e18Var), e18Var, 384);
                }
                break;
            default:
                String str = (String) obj4;
                tkh tkhVar = (tkh) obj3;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else if (str == null) {
                    e18Var2.a0(-1363841442);
                    e18Var2.p(false);
                } else {
                    e18Var2.a0(-1364044523);
                    tjh.b(str, null, this.F, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, tkhVar, e18Var2, 0, 24960, 110586);
                    e18Var2.p(false);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ v02(String str, long j, tkh tkhVar) {
        this.G = str;
        this.F = j;
        this.H = tkhVar;
    }
}
