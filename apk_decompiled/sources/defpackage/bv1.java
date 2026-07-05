package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bv1 implements bz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ String F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ String H;
    public final /* synthetic */ String I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ zy7 K;
    public final /* synthetic */ Object L;

    public /* synthetic */ bv1(String str, boolean z, String str2, String str3, String str4, gt0 gt0Var, beg begVar) {
        this.F = str;
        this.G = z;
        this.H = str2;
        this.I = str3;
        this.J = str4;
        this.K = gt0Var;
        this.L = begVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj2 = this.L;
        zy7 zy7Var = this.K;
        Object obj3 = this.J;
        String str = this.I;
        String str2 = this.H;
        boolean z = this.G;
        String str3 = this.F;
        switch (i) {
            case 0:
                v4g v4gVar = (v4g) obj3;
                l45 l45Var = (l45) obj2;
                ekf ekfVar = (ekf) obj;
                if (z) {
                    kl1 kl1Var = new kl1(2, zy7Var);
                    wn9[] wn9VarArr = ckf.a;
                    ekfVar.a(ojf.v, new e5(str3, kl1Var));
                    if (v4gVar.c() == b5g.G) {
                        ekfVar.a(ojf.t, new e5(str2, new ei(v4gVar, l45Var, v4gVar, 11)));
                    } else if (v4gVar.d()) {
                        ekfVar.a(ojf.u, new e5(str, new ik1(v4gVar, 4, l45Var)));
                    }
                }
                break;
            default:
                String str4 = (String) obj3;
                gt0 gt0Var = (gt0) zy7Var;
                beg begVar = (beg) obj2;
                ekf ekfVar2 = (ekf) obj;
                if (str3.equals("SecondaryEditable")) {
                    ckf.s(ekfVar2, 0);
                    if (z) {
                        str = str2;
                    }
                    ckf.v(ekfVar2, str);
                    ckf.l(ekfVar2, str4);
                } else {
                    ckf.s(ekfVar2, 6);
                }
                ckf.g(ekfVar2, null, new yg4(gt0Var, str3, begVar, 17));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ bv1(boolean z, v4g v4gVar, String str, String str2, String str3, zy7 zy7Var, l45 l45Var) {
        this.G = z;
        this.J = v4gVar;
        this.F = str;
        this.H = str2;
        this.I = str3;
        this.K = zy7Var;
        this.L = l45Var;
    }
}
