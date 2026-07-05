package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cn implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ fk0 F;
    public final /* synthetic */ an G;
    public final /* synthetic */ nwb H;

    public /* synthetic */ cn(fk0 fk0Var, an anVar, nwb nwbVar, int i) {
        this.E = i;
        this.F = fk0Var;
        this.G = anVar;
        this.H = nwbVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        nwb nwbVar = this.H;
        an anVar = this.G;
        fk0 fk0Var = this.F;
        switch (i) {
            case 0:
                fk0Var.t(true);
                anVar.g.setValue(Boolean.FALSE);
                ((zy7) nwbVar.getValue()).a();
                break;
            default:
                if (!fk0Var.g()) {
                    anVar.g.setValue(Boolean.TRUE);
                } else {
                    ((zy7) nwbVar.getValue()).a();
                }
                break;
        }
        return ieiVar;
    }
}
