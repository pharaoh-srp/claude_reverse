package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sw4 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ String F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ iqb H;
    public final /* synthetic */ boolean I;

    public /* synthetic */ sw4(String str, zy7 zy7Var, iqb iqbVar, boolean z, int i) {
        this.F = str;
        this.G = zy7Var;
        this.H = iqbVar;
        this.I = z;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                psk.a(x44.p0(1), (ld4) obj, this.G, this.H, this.F, this.I);
                break;
            default:
                ((Integer) obj2).getClass();
                bwj.a(x44.p0(1), (ld4) obj, this.G, this.H, this.F, this.I);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ sw4(String str, boolean z, zy7 zy7Var, iqb iqbVar, int i) {
        this.F = str;
        this.I = z;
        this.G = zy7Var;
        this.H = iqbVar;
    }
}
