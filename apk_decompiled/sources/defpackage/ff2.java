package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ff2 implements pz7 {
    public final /* synthetic */ int E = 3;
    public final /* synthetic */ Object F;
    public final /* synthetic */ long G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;

    public /* synthetic */ ff2(int i, long j, iqb iqbVar, bpc bpcVar, String str) {
        this.F = bpcVar;
        this.J = str;
        this.G = j;
        this.H = iqbVar;
        this.I = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        int i2 = this.I;
        iei ieiVar = iei.a;
        Object obj3 = this.J;
        Object obj4 = this.H;
        Object obj5 = this.F;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ez1.b((zy7) obj5, (iqb) obj4, (vf2) obj3, this.G, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                xuk.d((String) obj3, (zy7) obj5, this.G, (iqb) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                rsk.c((zy7) obj5, this.G, (gnb) obj4, (ta4) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 3:
                String str = (String) obj3;
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                long j = this.G;
                ghk.c(iP0, j, (ld4) obj, (iqb) obj4, (bpc) obj5, str);
                break;
            case 4:
                String str2 = (String) obj5;
                mnc mncVar = (mnc) obj4;
                tkh tkhVar = (tkh) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    pqi.d(str2, null, null, mncVar, this.G, tkhVar, this.I, e18Var, 0, 4);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                quj.c(this.G, (tkh) obj5, (z4g) obj4, (ta4) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ff2(long j, tkh tkhVar, z4g z4gVar, ta4 ta4Var, int i) {
        this.G = j;
        this.F = tkhVar;
        this.H = z4gVar;
        this.J = ta4Var;
        this.I = i;
    }

    public /* synthetic */ ff2(zy7 zy7Var, long j, gnb gnbVar, ta4 ta4Var, int i) {
        this.F = zy7Var;
        this.G = j;
        this.H = gnbVar;
        this.J = ta4Var;
        this.I = i;
    }

    public /* synthetic */ ff2(zy7 zy7Var, iqb iqbVar, vf2 vf2Var, long j, int i) {
        this.F = zy7Var;
        this.H = iqbVar;
        this.J = vf2Var;
        this.G = j;
        this.I = i;
    }

    public /* synthetic */ ff2(String str, zy7 zy7Var, long j, iqb iqbVar, int i) {
        this.J = str;
        this.F = zy7Var;
        this.G = j;
        this.H = iqbVar;
        this.I = i;
    }

    public /* synthetic */ ff2(String str, mnc mncVar, long j, tkh tkhVar, int i) {
        this.F = str;
        this.H = mncVar;
        this.G = j;
        this.J = tkhVar;
        this.I = i;
    }
}
