package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r52 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ xnc F;
    public final /* synthetic */ lrb G;

    public /* synthetic */ r52(xnc xncVar, lrb lrbVar, int i) {
        this.E = i;
        this.F = xncVar;
        this.G = lrbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        lrb lrbVar = this.G;
        xnc xncVar = this.F;
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                xncVar.e(lrbVar, iIntValue, iIntValue2);
                break;
            default:
                xncVar.e(lrbVar, iIntValue, iIntValue2);
                break;
        }
        return ieiVar;
    }
}
