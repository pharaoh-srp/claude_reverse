package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class afd implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ String F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ zy7 H;

    public /* synthetic */ afd(zy7 zy7Var, String str, boolean z) {
        this.G = z;
        this.F = str;
        this.H = zy7Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        zy7 zy7Var = this.H;
        iei ieiVar = iei.a;
        String str = this.F;
        boolean z = this.G;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                twj.c(x44.p0(1), (ld4) obj, zy7Var, str, z);
                break;
            case 1:
                ((Integer) obj2).getClass();
                yjk.e(x44.p0(1), (ld4) obj, zy7Var, str, z);
                break;
            default:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else if (!z) {
                    e18Var.a0(-1229186502);
                    ez1.e(this.H, null, !bsg.I0(str), null, null, fd9.q0(1926359823, new ngf(str, 9), e18Var), e18Var, 1572864, 58);
                    e18Var.p(false);
                } else {
                    e18Var.a0(1622913822);
                    ez1.a(null, vf2.H, 0L, e18Var, 48, 5);
                    e18Var.p(false);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ afd(String str, zy7 zy7Var, boolean z, int i) {
        this.F = str;
        this.H = zy7Var;
        this.G = z;
    }

    public /* synthetic */ afd(String str, boolean z, zy7 zy7Var, int i) {
        this.F = str;
        this.G = z;
        this.H = zy7Var;
    }
}
