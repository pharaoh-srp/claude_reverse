package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xvg implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;

    public /* synthetic */ xvg(boolean z, int i) {
        this.E = i;
        this.F = z;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        boolean z = this.F;
        ekf ekfVar = (ekf) obj;
        switch (i) {
            case 0:
                ekfVar.getClass();
                if (!z) {
                    ckf.f(ekfVar);
                }
                break;
            default:
                ekfVar.getClass();
                ckf.t(ekfVar, z);
                break;
        }
        return ieiVar;
    }
}
