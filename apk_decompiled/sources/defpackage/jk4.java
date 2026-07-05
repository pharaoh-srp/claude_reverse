package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jk4 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ kk4 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jk4(kk4 kk4Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = kk4Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        kk4 kk4Var = this.G;
        switch (i) {
            case 0:
                return new jk4(kk4Var, tp4Var, 0);
            default:
                return new jk4(kk4Var, tp4Var, 1);
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
        return ((jk4) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        kk4 kk4Var = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    zy1 zy1Var = kk4Var.b.v;
                    zy1 zy1Var2 = kk4Var.h;
                    this.F = 1;
                    if (x44.I(zy1Var, zy1Var2, this) == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    q0i q0iVar = kk4Var.b;
                    this.F = 1;
                    if (q0iVar.e(this) == m45Var) {
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
