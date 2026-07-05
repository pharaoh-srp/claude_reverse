package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o7e implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ q7e F;

    public /* synthetic */ o7e(q7e q7eVar, int i) {
        this.E = i;
        this.F = q7eVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        q7e q7eVar = this.F;
        switch (i) {
            case 0:
                q7eVar.e.setValue(Boolean.FALSE);
                break;
            default:
                q7eVar.e.setValue(Boolean.TRUE);
                break;
        }
        return ieiVar;
    }
}
