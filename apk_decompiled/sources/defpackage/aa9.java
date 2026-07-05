package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aa9 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ ybg G;
    public final /* synthetic */ ca9 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aa9(ybg ybgVar, ca9 ca9Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = ybgVar;
        this.H = ca9Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        ca9 ca9Var = this.H;
        ybg ybgVar = this.G;
        switch (i) {
            case 0:
                return new aa9(ybgVar, ca9Var, tp4Var, 0);
            default:
                return new aa9(ybgVar, ca9Var, tp4Var, 1);
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
        return ((aa9) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        ca9 ca9Var = this.H;
        ybg ybgVar = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    String strConcat = "canReattest=false — ".concat(ca9Var.P());
                    this.F = 1;
                    if (ybg.b(ybgVar, strConcat, null, this, 14) == m45Var) {
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
                    String str = ca9Var.c.d() ? "Experience cache cleared and refetched. Open a new chat to see it." : "Experience framework is disabled. Enable mobile_use_experiences_framework gate.";
                    this.F = 1;
                    if (ybg.b(ybgVar, str, null, this, 14) == m45Var) {
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
