package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fze extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ v84 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fze(v84 v84Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = v84Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        v84 v84Var = this.G;
        switch (i) {
            case 0:
                return new fze(v84Var, tp4Var, 0);
            case 1:
                return new fze(v84Var, tp4Var, 1);
            default:
                return new fze(v84Var, tp4Var, 2);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((fze) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.E;
        v84 v84Var = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    Object objW = v84Var.w(this);
                    if (objW == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 1:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    Object objW2 = v84Var.w(this);
                    if (objW2 == m45Var) {
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
                    this.F = 1;
                    Object objW3 = v84Var.w(this);
                    if (objW3 == m45Var) {
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
