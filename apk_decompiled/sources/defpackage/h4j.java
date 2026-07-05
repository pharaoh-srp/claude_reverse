package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h4j implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ nwb F;

    public /* synthetic */ h4j(int i, nwb nwbVar) {
        this.E = i;
        this.F = nwbVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        nwb nwbVar = this.F;
        switch (i) {
            case 0:
                nwbVar.setValue(Boolean.FALSE);
                break;
            case 1:
                nwbVar.setValue(Boolean.TRUE);
                break;
            default:
                nwbVar.setValue(Boolean.FALSE);
                break;
        }
        return ieiVar;
    }
}
