package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ix4 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ bz7 F;
    public final /* synthetic */ String G;
    public final /* synthetic */ nwb H;

    public /* synthetic */ ix4(bz7 bz7Var, String str, nwb nwbVar, int i) {
        this.E = i;
        this.F = bz7Var;
        this.G = str;
        this.H = nwbVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        nwb nwbVar = this.H;
        String str = this.G;
        bz7 bz7Var = this.F;
        switch (i) {
            case 0:
                bz7Var.invoke(str);
                nwbVar.setValue(null);
                break;
            case 1:
                bz7Var.invoke(str);
                nwbVar.setValue(null);
                break;
            default:
                bz7Var.invoke(str);
                nwbVar.setValue(Boolean.FALSE);
                break;
        }
        return ieiVar;
    }
}
