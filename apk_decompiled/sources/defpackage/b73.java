package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b73 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ lsc F;

    public /* synthetic */ b73(lsc lscVar, int i) {
        this.E = i;
        this.F = lscVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        lsc lscVar = this.F;
        switch (i) {
            case 0:
                lscVar.setValue((zxa) obj);
                break;
            default:
                obj.getClass();
                lscVar.setValue(obj);
                break;
        }
        return ieiVar;
    }
}
