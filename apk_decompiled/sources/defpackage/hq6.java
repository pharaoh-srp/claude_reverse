package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hq6 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ iq6 F;

    public /* synthetic */ hq6(iq6 iq6Var, int i) {
        this.E = i;
        this.F = iq6Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iq6 iq6Var = this.F;
        switch (i) {
            case 0:
                sxb sxbVar = (sxb) obj;
                if (sxbVar != null) {
                    return iq6Var.j(sxbVar, iq6Var.i().g(sxbVar, 16));
                }
                iq6.h(8);
                throw null;
            default:
                sxb sxbVar2 = (sxb) obj;
                if (sxbVar2 != null) {
                    return iq6Var.j(sxbVar2, iq6Var.i().d(sxbVar2, 16));
                }
                iq6.h(4);
                throw null;
        }
    }
}
