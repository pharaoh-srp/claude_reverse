package defpackage;

import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes2.dex */
public final class et4 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ rz7 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ et4(rz7 rz7Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = rz7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        rz7 rz7Var = this.H;
        switch (i) {
            case 0:
                et4 et4Var = new et4(rz7Var, tp4Var, 0);
                et4Var.G = obj;
                return et4Var;
            default:
                et4 et4Var2 = new et4(rz7Var, tp4Var, 1);
                et4Var2.G = obj;
                return et4Var2;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        JsonObject jsonObject = (JsonObject) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((et4) create(jsonObject, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        rz7 rz7Var = this.H;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                JsonObject jsonObject = (JsonObject) this.G;
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    String strA = gt4.a("trigger_word", jsonObject);
                    if (strA != null) {
                        String strA2 = gt4.a("label", jsonObject);
                        if (strA2 != null) {
                            this.G = null;
                            this.F = 1;
                            Object objInvoke = rz7Var.invoke(strA, strA2, this);
                            if (objInvoke == m45Var) {
                            }
                        } else {
                            i15 i15Var = i15.d;
                        }
                    } else {
                        i15 i15Var2 = i15.d;
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                JsonObject jsonObject2 = (JsonObject) this.G;
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    String strA3 = gt4.a("title", jsonObject2);
                    if (strA3 == null) {
                        strA3 = "Conway";
                    }
                    String strA4 = gt4.a("body", jsonObject2);
                    if (strA4 == null) {
                        strA4 = "";
                    }
                    this.G = null;
                    this.F = 1;
                    Object objInvoke2 = rz7Var.invoke(strA3, strA4, this);
                    if (objInvoke2 == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }
}
