package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class d03 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ f03 G;
    public final /* synthetic */ String H;
    public final /* synthetic */ boolean I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d03(f03 f03Var, String str, boolean z, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = f03Var;
        this.H = str;
        this.I = z;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new d03(this.G, this.H, this.I, tp4Var, 0);
            default:
                return new d03(this.G, this.H, this.I, tp4Var, 1);
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
        return ((d03) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        boolean z = this.I;
        String str = this.H;
        f03 f03Var = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    g5c g5cVar = f03Var.i.D;
                    this.F = 1;
                    if (g5cVar.m(str, z, this) == m45Var) {
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
                    p60 p60Var = f03Var.i.z;
                    this.F = 1;
                    if (p60Var.q(str, z, this) == m45Var) {
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
