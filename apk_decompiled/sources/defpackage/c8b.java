package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c8b implements gm4 {
    public final /* synthetic */ int E;
    public final /* synthetic */ tg6 F;
    public final /* synthetic */ uba G;
    public final /* synthetic */ l7b H;

    public /* synthetic */ c8b(tg6 tg6Var, uba ubaVar, l7b l7bVar, int i) {
        this.E = i;
        this.F = tg6Var;
        this.G = ubaVar;
        this.H = l7bVar;
    }

    @Override // defpackage.gm4
    public final void accept(Object obj) {
        int i = this.E;
        l7b l7bVar = this.H;
        uba ubaVar = this.G;
        tg6 tg6Var = this.F;
        f8b f8bVar = (f8b) obj;
        switch (i) {
            case 0:
                f8bVar.j(tg6Var.a, tg6Var.b, ubaVar, l7bVar);
                break;
            default:
                f8bVar.g(tg6Var.a, tg6Var.b, ubaVar, l7bVar);
                break;
        }
    }
}
