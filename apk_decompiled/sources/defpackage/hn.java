package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hn implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ an F;

    public /* synthetic */ hn(an anVar, int i) {
        this.E = i;
        this.F = anVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        an anVar = this.F;
        switch (i) {
            case 0:
                anVar.f.setValue(Boolean.TRUE);
                break;
            default:
                anVar.g.setValue(Boolean.FALSE);
                break;
        }
        return ieiVar;
    }
}
