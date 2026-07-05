package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class or0 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ String F;
    public final /* synthetic */ jz0 G;
    public final /* synthetic */ s6a H;
    public final /* synthetic */ iqb I;
    public final /* synthetic */ float J;

    public /* synthetic */ or0(jz0 jz0Var, iqb iqbVar, float f, s6a s6aVar, String str) {
        this.G = jz0Var;
        this.I = iqbVar;
        this.J = f;
        this.H = s6aVar;
        this.F = str;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    jz0 jz0Var = this.G;
                    iqb iqbVar = this.I;
                    float f = this.J;
                    if (jz0Var == null) {
                        e18Var.a0(-1326872497);
                        tjh.b(this.F, gb9.J(mpk.b0(iqbVar, mpk.Y(e18Var), true), f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var, 0, 0, 262140);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(-1327128464);
                        jlk.f(jz0Var, gb9.J(mpk.b0(iqbVar, mpk.Y(e18Var), true), f), null, this.H, null, null, null, e18Var, 0, 236);
                        e18Var.p(false);
                    }
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ktk.a(this.F, this.G, this.H, this.I, this.J, (ld4) obj, x44.p0(513));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ or0(String str, jz0 jz0Var, s6a s6aVar, iqb iqbVar, float f, int i) {
        this.F = str;
        this.G = jz0Var;
        this.H = s6aVar;
        this.I = iqbVar;
        this.J = f;
    }
}
