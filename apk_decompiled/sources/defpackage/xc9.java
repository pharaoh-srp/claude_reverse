package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xc9 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ long F;
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;

    public /* synthetic */ xc9(Object obj, long j, int i, int i2) {
        this.E = i2;
        this.H = obj;
        this.F = j;
        this.G = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.G;
        long j = this.F;
        Object obj3 = this.H;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                rwk.g((String) obj3, j, (ld4) obj, x44.p0(i2 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                tik.d((i4d) obj3, j, (ld4) obj, x44.p0(i2 | 1));
                break;
        }
        return ieiVar;
    }
}
