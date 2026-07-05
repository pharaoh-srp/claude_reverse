package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class d50 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ e50 F;

    public /* synthetic */ d50(e50 e50Var, int i) {
        this.E = i;
        this.F = e50Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        e50 e50Var = this.F;
        switch (i) {
            case 0:
                iqb iqbVar = (iqb) obj;
                int iIntValue = ((Number) obj3).intValue();
                iqbVar.getClass();
                e18 e18Var = (e18) ((ld4) obj2);
                e18Var.a0(1610193473);
                e18Var.a0(-1187310799);
                iqb iqbVarM = puj.m(iqbVar, new c50(e50Var, 0), e18Var, iIntValue & 14);
                e18Var.p(false);
                e18Var.p(false);
                return iqbVarM;
            default:
                iqb iqbVar2 = (iqb) obj;
                int iIntValue2 = ((Number) obj3).intValue();
                iqbVar2.getClass();
                e18 e18Var2 = (e18) ((ld4) obj2);
                e18Var2.a0(-671740805);
                e18Var2.a0(988982976);
                iqb iqbVarM2 = puj.m(iqbVar2, new c50(e50Var, 1), e18Var2, iIntValue2 & 14);
                e18Var2.p(false);
                e18Var2.p(false);
                return iqbVarM2;
        }
    }
}
