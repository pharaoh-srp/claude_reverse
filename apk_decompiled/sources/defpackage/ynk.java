package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ynk implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ u1l F;
    public final /* synthetic */ mnk G;

    public /* synthetic */ ynk(mnk mnkVar, u1l u1lVar, int i) {
        this.E = i;
        this.F = u1lVar;
        this.G = mnkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        u1l u1lVar = this.F;
        mnk mnkVar = this.G;
        switch (i) {
            case 0:
                o0l o0lVar = mnkVar.i;
                o0lVar.Z();
                o0lVar.O().K0();
                o0lVar.a0();
                dgj.s(u1lVar.E);
                o0lVar.f(u1lVar);
                break;
            default:
                o0l o0lVar2 = mnkVar.i;
                o0lVar2.Z();
                o0lVar2.M(u1lVar);
                break;
        }
    }
}
