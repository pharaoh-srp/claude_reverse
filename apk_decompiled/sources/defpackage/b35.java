package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b35 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zhh F;

    public /* synthetic */ b35(zhh zhhVar, int i) {
        this.E = i;
        this.F = zhhVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        cu9 cu9VarC;
        int i = this.E;
        zhh zhhVar = this.F;
        switch (i) {
            case 0:
                zhhVar.y();
                return iei.a;
            default:
                cu9 cu9Var = (cu9) obj;
                l9e l9eVarN = zhhVar.n();
                m2a m2aVar = zhhVar.d;
                if (m2aVar == null || (cu9VarC = m2aVar.c()) == null) {
                    return null;
                }
                return xwj.h(l9eVarN, cu9VarC, cu9Var);
        }
    }
}
