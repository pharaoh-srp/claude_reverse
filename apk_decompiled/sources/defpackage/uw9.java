package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uw9 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ iqb F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ bz7 N;
    public final /* synthetic */ int O;
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ uw9(ya8 ya8Var, iqb iqbVar, lx9 lx9Var, mnc mncVar, jo0 jo0Var, go0 go0Var, eo7 eo7Var, boolean z, b20 b20Var, bz7 bz7Var, int i, int i2) {
        this.Q = ya8Var;
        this.F = iqbVar;
        this.G = lx9Var;
        this.H = mncVar;
        this.L = jo0Var;
        this.M = go0Var;
        this.I = eo7Var;
        this.J = z;
        this.K = b20Var;
        this.N = bz7Var;
        this.O = i;
        this.P = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.O;
        Object obj3 = this.K;
        Object obj4 = this.I;
        Object obj5 = this.M;
        Object obj6 = this.L;
        Object obj7 = this.H;
        Object obj8 = this.G;
        Object obj9 = this.Q;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                yuj.a((ya8) obj9, this.F, (lx9) obj8, (mnc) obj7, (jo0) obj6, (go0) obj5, (eo7) obj4, this.J, (b20) obj3, this.N, (ld4) obj, iP0, this.P);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                int iP03 = x44.p0(this.P);
                cvj.a(this.F, (lx9) obj8, (ab8) obj9, (mnc) obj7, (eo7) obj4, this.J, (b20) obj3, (jo0) obj6, (go0) obj5, this.N, (ld4) obj, iP02, iP03);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP04 = x44.p0(i2 | 1);
                lvk.b(this.J, (List) obj9, this.F, this.N, (bz7) obj8, (i4g) obj7, (jgf) obj6, (hgf) obj5, (pz7) obj4, (ta4) obj3, (ld4) obj, iP04, this.P);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ uw9(iqb iqbVar, lx9 lx9Var, ab8 ab8Var, mnc mncVar, eo7 eo7Var, boolean z, b20 b20Var, jo0 jo0Var, go0 go0Var, bz7 bz7Var, int i, int i2) {
        this.F = iqbVar;
        this.G = lx9Var;
        this.Q = ab8Var;
        this.H = mncVar;
        this.I = eo7Var;
        this.J = z;
        this.K = b20Var;
        this.L = jo0Var;
        this.M = go0Var;
        this.N = bz7Var;
        this.O = i;
        this.P = i2;
    }

    public /* synthetic */ uw9(boolean z, List list, iqb iqbVar, bz7 bz7Var, bz7 bz7Var2, i4g i4gVar, jgf jgfVar, hgf hgfVar, pz7 pz7Var, ta4 ta4Var, int i, int i2) {
        this.J = z;
        this.Q = list;
        this.F = iqbVar;
        this.N = bz7Var;
        this.G = bz7Var2;
        this.H = i4gVar;
        this.L = jgfVar;
        this.M = hgfVar;
        this.I = pz7Var;
        this.K = ta4Var;
        this.O = i;
        this.P = i2;
    }
}
