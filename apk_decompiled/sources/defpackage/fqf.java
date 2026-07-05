package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fqf implements lp7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ iqf F;

    public /* synthetic */ fqf(iqf iqfVar, int i) {
        this.E = i;
        this.F = iqfVar;
    }

    @Override // defpackage.lp7
    public final Object g(Object obj, tp4 tp4Var) {
        String str;
        int i = this.E;
        iei ieiVar = iei.a;
        iqf iqfVar = this.F;
        switch (i) {
            case 0:
                ph4 ph4Var = (ph4) obj;
                amg amgVar = iqfVar.h;
                if (((ph4Var instanceof oh4) || (ph4Var instanceof nh4)) && (str = (String) amgVar.getValue()) != null) {
                    amgVar.m(null);
                    amg amgVar2 = iqfVar.i;
                    Boolean bool = Boolean.FALSE;
                    amgVar2.getClass();
                    amgVar2.n(null, bool);
                    iqfVar.c.c1("error:connection_lost_while_sending", str, "error:connection_lost_while_sending");
                }
                break;
            default:
                iqfVar.b((fvf) obj);
                break;
        }
        return ieiVar;
    }
}
