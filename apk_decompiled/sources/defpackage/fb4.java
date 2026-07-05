package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fb4 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ sbg F;

    public /* synthetic */ fb4(sbg sbgVar, int i) {
        this.E = i;
        this.F = sbgVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        sbg sbgVar = this.F;
        switch (i) {
            case 0:
                ((vbg) sbgVar).a();
                break;
            case 1:
                ((vbg) sbgVar).a();
                break;
            case 2:
                ((vbg) sbgVar).a();
                break;
            default:
                ua2 ua2Var = ((vbg) sbgVar).b;
                if (ua2Var.s() instanceof q6c) {
                    ua2Var.resumeWith(ecg.F);
                }
                break;
        }
        return ieiVar;
    }
}
