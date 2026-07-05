package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rh5 extends xzg implements pz7 {
    public int E;
    public /* synthetic */ boolean F;
    public final /* synthetic */ bi5 G;
    public final /* synthetic */ int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh5(int i, tp4 tp4Var, bi5 bi5Var) {
        super(2, tp4Var);
        this.G = bi5Var;
        this.H = i;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        rh5 rh5Var = new rh5(this.H, tp4Var, this.G);
        rh5Var.F = ((Boolean) obj).booleanValue();
        return rh5Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((rh5) create(bool, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        boolean z = this.F;
        int i = this.E;
        if (i == 0) {
            sf5.h0(obj);
            if (!z) {
                iIntValue = this.H;
                return new Integer(iIntValue);
            }
            z7g z7gVarF = this.G.f();
            this.F = z;
            this.E = 1;
            obj = z7gVarF.a();
            m45 m45Var = m45.E;
            if (obj == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        iIntValue = ((Number) obj).intValue();
        return new Integer(iIntValue);
    }
}
