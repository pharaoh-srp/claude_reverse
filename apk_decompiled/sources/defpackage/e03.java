package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class e03 extends xzg implements pz7 {
    public final /* synthetic */ int E = 0;
    public int F;
    public final /* synthetic */ String G;
    public final /* synthetic */ f03 H;
    public final /* synthetic */ String I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e03(f03 f03Var, String str, String str2, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = f03Var;
        this.G = str;
        this.I = str2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        String str = this.I;
        f03 f03Var = this.H;
        String str2 = this.G;
        switch (i) {
            case 0:
                return new e03(f03Var, str2, str, tp4Var);
            default:
                return new e03(str2, f03Var, str, tp4Var);
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
        return ((e03) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    xa3 xa3Var = this.H.e;
                    this.F = 1;
                    if (xa3Var.e(this.G, this.I, this) == m45Var) {
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
                    qq0 qq0Var = new qq0((Object) this.G, (Object) this.H, (Comparable) this.I, (tp4) null, 6);
                    this.F = 1;
                    if (iuj.N(qq0Var, this) == m45Var) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e03(String str, f03 f03Var, String str2, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = str;
        this.H = f03Var;
        this.I = str2;
    }
}
