package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class au5 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ xv8 G;
    public final /* synthetic */ za1 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ au5(xv8 xv8Var, za1 za1Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = xv8Var;
        this.H = za1Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        za1 za1Var = this.H;
        xv8 xv8Var = this.G;
        switch (i) {
            case 0:
                return new au5(xv8Var, za1Var, tp4Var, 0);
            case 1:
                return new au5(xv8Var, za1Var, tp4Var, 1);
            default:
                return new au5(xv8Var, za1Var, tp4Var, 2);
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
        return ((au5) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        za1 za1Var = this.H;
        xv8 xv8Var = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    gff gffVar = (gff) xv8Var.G;
                    float f = za1Var.a;
                    this.F = 1;
                    if (gffVar.S0(f, zo6.G, this) == m45Var) {
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
                    gff gffVar2 = (gff) xv8Var.H;
                    float f2 = za1Var.a;
                    this.F = 1;
                    if (gffVar2.S0(f2, zo6.F, this) == m45Var) {
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
                    if (xv8Var.w(za1Var, this) == m45Var) {
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
