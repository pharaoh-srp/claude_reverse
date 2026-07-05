package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qc1 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ long G;
    public final /* synthetic */ long H;
    public final /* synthetic */ Object I;

    public /* synthetic */ qc1(int i, long j, long j2, ud0 ud0Var, iqb iqbVar) {
        this.E = 1;
        this.I = ud0Var;
        this.F = iqbVar;
        this.G = j;
        this.H = j2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.I;
        Object obj4 = this.F;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(3073);
                pqi.a((iqb) obj4, this.G, this.H, (rz7) obj3, (ld4) obj, iP0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(1);
                long j = this.G;
                long j2 = this.H;
                sc2.a(iP02, j, j2, (ud0) obj3, (ld4) obj, (iqb) obj4);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP03 = x44.p0(1);
                tlk.a((String) obj4, this.G, this.H, (String) obj3, (ld4) obj, iP03);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ qc1(Object obj, long j, long j2, Object obj2, int i, int i2) {
        this.E = i2;
        this.F = obj;
        this.G = j;
        this.H = j2;
        this.I = obj2;
    }
}
