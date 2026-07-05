package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nu implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zy7 F;
    public final /* synthetic */ wlg G;

    public /* synthetic */ nu(zy7 zy7Var, wlg wlgVar, int i) {
        this.E = i;
        this.F = zy7Var;
        this.G = wlgVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        wlg wlgVar = this.G;
        zy7 zy7Var = this.F;
        r4a r4aVar = (r4a) obj;
        switch (i) {
            case 0:
                r4aVar.getClass();
                if (((Boolean) wlgVar.getValue()).booleanValue()) {
                    zy7Var.a();
                }
                return new le(1);
            case 1:
                r4aVar.getClass();
                if (((Boolean) wlgVar.getValue()).booleanValue()) {
                    zy7Var.a();
                }
                return new le(2);
            default:
                r4aVar.getClass();
                if (((Boolean) wlgVar.getValue()).booleanValue()) {
                    zy7Var.a();
                }
                return new le(4);
        }
    }
}
