package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dkj extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ gkj G;
    public final /* synthetic */ float H;
    public final /* synthetic */ yig I;
    public final /* synthetic */ l9e J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dkj(gkj gkjVar, float f, yig yigVar, l9e l9eVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = gkjVar;
        this.H = f;
        this.I = yigVar;
        this.J = l9eVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new dkj(this.G, this.H, this.I, this.J, tp4Var, 0);
            default:
                return new dkj(this.G, this.H, this.I, this.J, tp4Var, 1);
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
        return ((dkj) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        float f = this.H;
        m45 m45Var = m45.E;
        gkj gkjVar = this.G;
        l9e l9eVar = this.J;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    gkjVar.c.i(null, null);
                    a80 a80Var = gkjVar.c;
                    Float f2 = new Float(f);
                    this.F = 1;
                    if (a80.c(a80Var, f2, this.I, null, this, 12) == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                gkjVar.c.i(new Float(l9eVar.a), new Float(l9eVar.c));
                break;
            default:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    gkjVar.d.i(null, null);
                    a80 a80Var2 = gkjVar.d;
                    Float f3 = new Float(f);
                    this.F = 1;
                    if (a80.c(a80Var2, f3, this.I, null, this, 12) == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                gkjVar.d.i(new Float(l9eVar.b), new Float(l9eVar.d));
                break;
        }
        return ieiVar;
    }
}
