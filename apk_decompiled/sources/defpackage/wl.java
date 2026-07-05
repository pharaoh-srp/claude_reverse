package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wl implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ vm F;

    public /* synthetic */ wl(vm vmVar, int i) {
        this.E = i;
        this.F = vmVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        vm vmVar = this.F;
        xk xkVar = (xk) obj;
        switch (i) {
            case 0:
                xkVar.getClass();
                vmVar.p(xkVar);
                break;
            default:
                vmVar.p(xkVar);
                break;
        }
        return ieiVar;
    }
}
