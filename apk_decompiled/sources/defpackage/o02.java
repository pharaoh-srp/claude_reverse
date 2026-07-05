package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o02 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ zy7 F;
    public final /* synthetic */ iqb G;
    public final /* synthetic */ mnc H;
    public final /* synthetic */ long I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ Object P;

    public /* synthetic */ o02(zy7 zy7Var, iqb iqbVar, a12 a12Var, h12 h12Var, z02 z02Var, long j, mnc mncVar, zub zubVar, ta4 ta4Var, int i, int i2) {
        this.F = zy7Var;
        this.G = iqbVar;
        this.L = a12Var;
        this.M = h12Var;
        this.N = z02Var;
        this.I = j;
        this.H = mncVar;
        this.O = zubVar;
        this.P = ta4Var;
        this.J = i;
        this.K = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.J;
        Object obj3 = this.P;
        Object obj4 = this.O;
        Object obj5 = this.N;
        Object obj6 = this.M;
        Object obj7 = this.L;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                ysj.a(this.F, this.G, (a12) obj7, (h12) obj6, (z02) obj5, this.I, this.H, (zub) obj4, (ta4) obj3, (ld4) obj, iP0, this.K);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                yhk.c((bpc) obj7, (String) obj6, this.F, this.G, (pz7) obj5, (String) obj4, (nxf) obj3, this.H, this.I, (ld4) obj, iP02, this.K);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ o02(bpc bpcVar, String str, zy7 zy7Var, iqb iqbVar, pz7 pz7Var, String str2, nxf nxfVar, mnc mncVar, long j, int i, int i2) {
        this.L = bpcVar;
        this.M = str;
        this.F = zy7Var;
        this.G = iqbVar;
        this.N = pz7Var;
        this.O = str2;
        this.P = nxfVar;
        this.H = mncVar;
        this.I = j;
        this.J = i;
        this.K = i2;
    }
}
