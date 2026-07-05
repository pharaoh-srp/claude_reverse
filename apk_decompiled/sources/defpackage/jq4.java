package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jq4 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ bz7 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq4(tp4 tp4Var, bz7 bz7Var) {
        super(2, tp4Var);
        this.E = 1;
        this.H = bz7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                jq4 jq4Var = new jq4(0, tp4Var, this.H);
                jq4Var.G = obj;
                return jq4Var;
            case 1:
                jq4 jq4Var2 = new jq4(tp4Var, this.H);
                jq4Var2.G = obj;
                return jq4Var2;
            default:
                jq4 jq4Var3 = new jq4(2, tp4Var, this.H);
                jq4Var3.G = obj;
                return jq4Var3;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((jq4) create((y4i) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 1:
                return ((jq4) create((guc) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((jq4) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        bz7 bz7Var = this.H;
        m45 m45Var = m45.E;
        tp4 tp4Var = null;
        switch (i) {
            case 0:
                y4i y4iVar = (y4i) this.G;
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    i01 i01Var = new i01(2, tp4Var, bz7Var);
                    this.G = null;
                    this.F = 1;
                    if (y4iVar.d(x4i.F, i01Var, this) == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i2 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                return iei.a;
            case 1:
                int i3 = this.F;
                if (i3 != 0) {
                    if (i3 == 1) {
                        sf5.h0(obj);
                        return obj;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                this.F = 1;
                Object objInvoke = bz7Var.invoke(this);
                return objInvoke == m45Var ? m45Var : objInvoke;
            default:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    if (((l45) this.G).getCoroutineContext().x0(w4i.F) != null) {
                        this.F = 1;
                        Object objInvoke2 = bz7Var.invoke(this);
                        return objInvoke2 == m45Var ? m45Var : objInvoke2;
                    }
                    sz6.j("Expected a TransactionElement in the CoroutineContext but none was found.");
                } else {
                    if (i4 == 1) {
                        sf5.h0(obj);
                        return obj;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jq4(int i, tp4 tp4Var, bz7 bz7Var) {
        super(2, tp4Var);
        this.E = i;
        this.H = bz7Var;
    }
}
