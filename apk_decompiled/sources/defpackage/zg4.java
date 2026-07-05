package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zg4 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ nwb G;

    public /* synthetic */ zg4(String str, nwb nwbVar, int i) {
        this.E = i;
        this.F = str;
        this.G = nwbVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        nwb nwbVar = this.G;
        String str = this.F;
        switch (i) {
            case 0:
                nwbVar.setValue(((Boolean) obj).booleanValue() ? str : null);
                break;
            default:
                gj7 gj7Var = (gj7) obj;
                gj7Var.getClass();
                if (((Boolean) nwbVar.getValue()).booleanValue()) {
                    gj7Var.evaluateJavascript(str, null);
                }
                break;
        }
        return ieiVar;
    }
}
