package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mw implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ bz7 F;
    public final /* synthetic */ r4g G;

    public /* synthetic */ mw(r4g r4gVar, bz7 bz7Var) {
        this.E = 0;
        this.G = r4gVar;
        this.F = bz7Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        r4g r4gVar = this.G;
        bz7 bz7Var = this.F;
        switch (i) {
            case 0:
                iaj iajVar = (iaj) obj;
                iajVar.getClass();
                r4gVar.a();
                bz7Var.invoke(iajVar);
                break;
            case 1:
                z4b z4bVar = (z4b) obj;
                z4bVar.getClass();
                bz7Var.invoke(z4bVar);
                r4gVar.a();
                break;
            default:
                z4b z4bVar2 = (z4b) obj;
                z4bVar2.getClass();
                bz7Var.invoke(z4bVar2);
                r4gVar.a();
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ mw(bz7 bz7Var, r4g r4gVar, int i) {
        this.E = i;
        this.F = bz7Var;
        this.G = r4gVar;
    }
}
