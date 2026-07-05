package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mf2 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ a80 G;
    public final /* synthetic */ long H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mf2(a80 a80Var, long j, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = a80Var;
        this.H = j;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new mf2(this.G, this.H, tp4Var, 0);
            default:
                return new mf2(this.G, this.H, tp4Var, 1);
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
        return ((mf2) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        long j = this.H;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    y69 y69Var = new y69(j);
                    yig yigVarK = kxk.K(1.0f, 1500.0f, null, 4);
                    this.F = 1;
                    if (a80.c(this.G, y69Var, yigVarK, null, this, 12) == m45Var) {
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
                    fcc fccVar = new fcc(j);
                    yig yigVar = kif.d;
                    this.F = 1;
                    if (a80.c(this.G, fccVar, yigVar, null, this, 12) == m45Var) {
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
