package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ank implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ mnk F;
    public final /* synthetic */ u1l G;

    public /* synthetic */ ank(mnk mnkVar, u1l u1lVar, int i) {
        this.E = i;
        this.F = mnkVar;
        this.G = u1lVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.E;
        u1l u1lVar = this.G;
        mnk mnkVar = this.F;
        switch (i) {
            case 0:
                o0l o0lVar = mnkVar.i;
                o0lVar.Z();
                o0lVar.T(u1lVar);
                break;
            case 1:
                o0l o0lVar2 = mnkVar.i;
                o0lVar2.Z();
                o0lVar2.S(u1lVar);
                break;
            default:
                o0l o0lVar3 = mnkVar.i;
                o0lVar3.Z();
                o0lVar3.O().K0();
                o0lVar3.a0();
                dgj.s(u1lVar.E);
                o0lVar3.T(u1lVar);
                o0lVar3.S(u1lVar);
                break;
        }
    }
}
