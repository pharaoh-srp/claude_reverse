package defpackage;

import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes2.dex */
public final class yu2 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ pz7 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yu2(pz7 pz7Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = pz7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        pz7 pz7Var = this.H;
        switch (i) {
            case 0:
                yu2 yu2Var = new yu2(pz7Var, tp4Var, 0);
                yu2Var.G = obj;
                return yu2Var;
            case 1:
                yu2 yu2Var2 = new yu2(pz7Var, tp4Var, 1);
                yu2Var2.G = obj;
                return yu2Var2;
            default:
                yu2 yu2Var3 = new yu2(pz7Var, tp4Var, 2);
                yu2Var3.G = obj;
                return yu2Var3;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((yu2) create((vt6) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 1:
                return ((yu2) create((JsonObject) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((yu2) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        pz7 pz7Var = this.H;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                vt6 vt6Var = (vt6) this.G;
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    this.G = null;
                    this.F = 1;
                    if (pz7Var.invoke(vt6Var, this) == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 1:
                JsonObject jsonObject = (JsonObject) this.G;
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    String strA = gt4.a("query", jsonObject);
                    if (strA == null || bsg.I0(strA)) {
                        strA = null;
                    }
                    this.G = null;
                    this.F = 1;
                    Object objInvoke = pz7Var.invoke(strA, this);
                    if (objInvoke == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    l45 l45Var = (l45) this.G;
                    this.F = 1;
                    if (pz7Var.invoke(l45Var, this) == m45Var) {
                    }
                } else if (i4 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }
}
