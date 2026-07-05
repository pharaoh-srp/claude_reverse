package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h30 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ bz7 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h30(int i, tp4 tp4Var, bz7 bz7Var) {
        super(2, tp4Var);
        this.E = i;
        this.G = bz7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        bz7 bz7Var = this.G;
        switch (i) {
            case 0:
                return new h30(0, tp4Var, bz7Var);
            default:
                return new h30(1, tp4Var, bz7Var);
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
        return ((h30) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        bz7 bz7Var = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    if (bz7Var.invoke(this) == m45Var) {
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
                    this.F = 1;
                    if (bz7Var.invoke(this) == m45Var) {
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
