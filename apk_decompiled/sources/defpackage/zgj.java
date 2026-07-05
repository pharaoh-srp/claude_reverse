package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zgj implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ahj F;
    public final /* synthetic */ lze G;

    public /* synthetic */ zgj(ahj ahjVar, lze lzeVar, int i) {
        this.E = i;
        this.F = ahjVar;
        this.G = lzeVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        lze lzeVar = this.G;
        ahj ahjVar = this.F;
        bp0 bp0Var = (bp0) obj;
        switch (i) {
            case 0:
                bp0Var.getClass();
                ahjVar.a(lzeVar, bp0Var);
                break;
            default:
                bp0Var.getClass();
                ahjVar.b(lzeVar, bp0Var);
                break;
        }
        return ieiVar;
    }
}
