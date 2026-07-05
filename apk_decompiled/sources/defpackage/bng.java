package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bng implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ long F;
    public final /* synthetic */ iqb G;
    public final /* synthetic */ float H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ qz7 J;
    public final /* synthetic */ int K;
    public final /* synthetic */ int L;

    public /* synthetic */ bng(ta4 ta4Var, ta4 ta4Var2, iqb iqbVar, long j, float f, int i, int i2) {
        this.E = 4;
        this.I = ta4Var;
        this.J = ta4Var2;
        this.G = iqbVar;
        this.F = j;
        this.H = f;
        this.K = i;
        this.L = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.K;
        qz7 qz7Var = this.J;
        Object obj3 = this.I;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                dng.b(this.F, this.G, this.H, (m8f) obj3, (zy7) qz7Var, (ld4) obj, iP0, this.L);
                break;
            case 1:
                ((Integer) obj2).intValue();
                int iP02 = x44.p0(i2 | 1);
                dng.b(this.F, this.G, this.H, (m8f) obj3, (zy7) qz7Var, (ld4) obj, iP02, this.L);
                break;
            case 2:
                ((Integer) obj2).intValue();
                int iP03 = x44.p0(i2 | 1);
                dng.b(this.F, this.G, this.H, (m8f) obj3, (zy7) qz7Var, (ld4) obj, iP03, this.L);
                break;
            case 3:
                ((Integer) obj2).intValue();
                int iP04 = x44.p0(i2 | 1);
                dng.b(this.F, this.G, this.H, (m8f) obj3, (zy7) qz7Var, (ld4) obj, iP04, this.L);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP05 = x44.p0(i2 | 1);
                pvj.c((ta4) obj3, (ta4) qz7Var, this.G, this.F, this.H, (ld4) obj, iP05, this.L);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ bng(long j, iqb iqbVar, float f, m8f m8fVar, zy7 zy7Var, int i, int i2, int i3) {
        this.E = i3;
        this.F = j;
        this.G = iqbVar;
        this.H = f;
        this.I = m8fVar;
        this.J = zy7Var;
        this.K = i;
        this.L = i2;
    }
}
