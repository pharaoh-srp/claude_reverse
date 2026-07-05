package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ev0 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ String F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ int H;

    public /* synthetic */ ev0(String str, int i, int i2, boolean z) {
        this.H = i;
        this.F = str;
        this.G = z;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.H;
        String str = this.F;
        boolean z = this.G;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                euk.j(i2, str, z, ld4Var, x44.p0(1));
                break;
            case 1:
                prk.c(x44.p0(i2 | 1), ld4Var, str, z);
                break;
            default:
                ht9.a(x44.p0(i2 | 1), ld4Var, str, z);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ev0(String str, boolean z, int i) {
        this.F = str;
        this.G = z;
        this.H = i;
    }

    public /* synthetic */ ev0(boolean z, String str, int i) {
        this.G = z;
        this.F = str;
        this.H = i;
    }
}
