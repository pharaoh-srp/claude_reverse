package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bi implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ bz7 F;
    public final /* synthetic */ nwb G;

    public /* synthetic */ bi(bz7 bz7Var, nwb nwbVar, int i) {
        this.E = i;
        this.F = bz7Var;
        this.G = nwbVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        nwb nwbVar = this.G;
        bz7 bz7Var = this.F;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) nwbVar.getValue();
                bool.getClass();
                bz7Var.invoke(bool);
                break;
            case 1:
                bz7Var.invoke((String) nwbVar.getValue());
                break;
            case 2:
                nwbVar.setValue(Boolean.FALSE);
                bz7Var.invoke(0);
                break;
            case 3:
                bz7Var.invoke((Boolean) nwbVar.getValue());
                break;
            case 4:
                bz7Var.invoke(bsg.k1((String) nwbVar.getValue()).toString());
                break;
            case 5:
                bz7Var.invoke(null);
                nwbVar.setValue(Boolean.FALSE);
                break;
            case 6:
                Boolean bool2 = Boolean.FALSE;
                bz7Var.invoke(bool2);
                nwbVar.setValue(bool2);
                break;
            default:
                bz7Var.invoke(Boolean.TRUE);
                nwbVar.setValue(Boolean.FALSE);
                break;
        }
        return ieiVar;
    }
}
