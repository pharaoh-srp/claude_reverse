package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s73 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ ybg H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s73(ybg ybgVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = ybgVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                s73 s73Var = new s73(this.H, tp4Var, 0);
                s73Var.G = obj;
                return s73Var;
            default:
                s73 s73Var2 = new s73(this.H, tp4Var, 1);
                s73Var2.G = obj;
                return s73Var2;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((s73) create((String) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((s73) create((vt6) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        ybg ybgVar = this.H;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                String str = (String) this.G;
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    this.G = null;
                    this.F = 1;
                    if (ybg.b(ybgVar, str, null, this, 14) == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                vt6 vt6Var = (vt6) this.G;
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    ubg ubgVar = new ubg(vt6Var);
                    this.G = null;
                    this.F = 1;
                    if (ybgVar.a(ubgVar, this) == m45Var) {
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
