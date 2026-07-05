package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g84 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ float F;
    public final /* synthetic */ iqb G;

    public /* synthetic */ g84(float f, int i, int i2, iqb iqbVar) {
        this.E = i2;
        this.F = f;
        this.G = iqbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        iqb iqbVar = this.G;
        float f = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                j84.b(f, x44.p0(1), ld4Var, iqbVar);
                break;
            default:
                pqi.h(f, x44.p0(49), ld4Var, iqbVar);
                break;
        }
        return ieiVar;
    }
}
