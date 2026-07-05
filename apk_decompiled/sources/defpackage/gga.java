package defpackage;

import com.anthropic.claude.app.main.loggedin.i;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gga implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    public /* synthetic */ gga(ta4 ta4Var, boolean z, zy7 zy7Var, iqb iqbVar, pz7 pz7Var, pz7 pz7Var2, e0g e0gVar, yq5 yq5Var, int i) {
        this.H = ta4Var;
        this.F = z;
        this.I = zy7Var;
        this.J = iqbVar;
        this.K = pz7Var;
        this.L = pz7Var2;
        this.M = e0gVar;
        this.N = yq5Var;
        this.G = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.N;
        Object obj4 = this.M;
        Object obj5 = this.L;
        Object obj6 = this.K;
        Object obj7 = this.J;
        Object obj8 = this.I;
        Object obj9 = this.H;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(1);
                i.b(this.F, (q61) obj9, (fk0) obj8, (String) obj7, (h9) obj6, (ul7) obj5, (qi3) obj4, (bz7) obj3, (ld4) obj, iP0, this.G);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(this.G | 1);
                gzb.e((ta4) obj9, this.F, (zy7) obj8, (iqb) obj7, (pz7) obj6, (pz7) obj5, (e0g) obj4, (yq5) obj3, (ld4) obj, iP02);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ gga(boolean z, q61 q61Var, fk0 fk0Var, String str, h9 h9Var, ul7 ul7Var, qi3 qi3Var, bz7 bz7Var, int i, int i2) {
        this.F = z;
        this.H = q61Var;
        this.I = fk0Var;
        this.J = str;
        this.K = h9Var;
        this.L = ul7Var;
        this.M = qi3Var;
        this.N = bz7Var;
        this.G = i2;
    }
}
