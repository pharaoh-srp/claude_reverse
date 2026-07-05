package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aj7 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ iqb F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ qz7 K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;

    public /* synthetic */ aj7(iqb iqbVar, mnc mncVar, rz7 rz7Var, sz7 sz7Var, rz7 rz7Var2, wp6 wp6Var, d77 d77Var, bz7 bz7Var, int i, int i2) {
        this.E = 1;
        this.F = iqbVar;
        this.I = mncVar;
        this.J = rz7Var;
        this.K = sz7Var;
        this.L = rz7Var2;
        this.M = wp6Var;
        this.N = d77Var;
        this.O = bz7Var;
        this.G = i;
        this.H = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        Object obj3 = this.L;
        iei ieiVar = iei.a;
        int i2 = this.G;
        Object obj4 = this.O;
        Object obj5 = this.N;
        Object obj6 = this.M;
        qz7 qz7Var = this.K;
        Object obj7 = this.J;
        Object obj8 = this.I;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                bj7.f((String) obj8, (String) obj7, this.F, (zy7) qz7Var, this.L, (fj7) obj6, (Float) obj5, (va6) obj4, (ld4) obj, iP0, this.H);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                qwj.a(this.F, (mnc) obj8, (rz7) obj7, (sz7) qz7Var, (rz7) obj3, (wp6) obj6, (d77) obj5, (bz7) obj4, (ld4) obj, iP02, this.H);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP03 = x44.p0(i2 | 1);
                bte.a((cte) obj8, (zb0) obj7, this.F, (bz7) qz7Var, (Map) obj3, (bz7) obj6, (bz7) obj5, (bz7) obj4, (ld4) obj, iP03, this.H);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ aj7(Object obj, CharSequence charSequence, iqb iqbVar, qz7 qz7Var, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2, int i3) {
        this.E = i3;
        this.I = obj;
        this.J = charSequence;
        this.F = iqbVar;
        this.K = qz7Var;
        this.L = obj2;
        this.M = obj3;
        this.N = obj4;
        this.O = obj5;
        this.G = i;
        this.H = i2;
    }
}
