package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oi5 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ bj5 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oi5(bj5 bj5Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = bj5Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        bj5 bj5Var = this.H;
        switch (i) {
            case 0:
                oi5 oi5Var = new oi5(bj5Var, tp4Var, 0);
                oi5Var.G = obj;
                return oi5Var;
            default:
                oi5 oi5Var2 = new oi5(bj5Var, tp4Var, 1);
                oi5Var2.G = obj;
                return oi5Var2;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        kq4 kq4Var = (kq4) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((oi5) create(kq4Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        bj5 bj5Var = this.H;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                kq4 kq4Var = (kq4) this.G;
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    this.G = null;
                    this.F = 1;
                    if (bj5.w(bj5Var, kq4Var, this) == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                kq4 kq4Var2 = (kq4) this.G;
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    this.G = null;
                    this.F = 1;
                    if (bj5.w(bj5Var, kq4Var2, this) == m45Var) {
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
