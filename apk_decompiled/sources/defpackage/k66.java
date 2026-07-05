package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k66 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ long F;
    public final /* synthetic */ long G;
    public final /* synthetic */ Object H;

    public /* synthetic */ k66(ud0 ud0Var, long j, long j2) {
        this.E = 2;
        this.H = ud0Var;
        this.F = j;
        this.G = j2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.H;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                usj.b(this.F, this.G, (iqb) obj3, (ld4) obj, x44.p0(385));
                break;
            case 1:
                ((Integer) obj2).getClass();
                pd8.h(this.F, this.G, (zy7) obj3, (ld4) obj, x44.p0(1));
                break;
            default:
                ud0 ud0Var = (ud0) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    ud0 ud0Var2 = ud0.d;
                    sc2.a(0, this.F, this.G, ud0Var, e18Var, null);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ k66(long j, long j2, Object obj, int i, int i2) {
        this.E = i2;
        this.F = j;
        this.G = j2;
        this.H = obj;
    }
}
