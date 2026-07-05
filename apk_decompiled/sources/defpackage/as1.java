package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class as1 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ iqb F;
    public final /* synthetic */ bz7 G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ qz7 M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ Object P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;

    public /* synthetic */ as1(oe5 oe5Var, r1e r1eVar, iwg iwgVar, zy7 zy7Var, zy7 zy7Var2, bz7 bz7Var, zy7 zy7Var3, zy7 zy7Var4, qi3 qi3Var, zy7 zy7Var5, iqb iqbVar, int i, int i2) {
        this.J = oe5Var;
        this.K = r1eVar;
        this.L = iwgVar;
        this.M = zy7Var;
        this.N = zy7Var2;
        this.G = bz7Var;
        this.O = zy7Var3;
        this.P = zy7Var4;
        this.R = qi3Var;
        this.Q = zy7Var5;
        this.F = iqbVar;
        this.H = i;
        this.I = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.I;
        int i3 = this.H;
        Object obj3 = this.R;
        Object obj4 = this.Q;
        Object obj5 = this.P;
        Object obj6 = this.O;
        Object obj7 = this.N;
        qz7 qz7Var = this.M;
        Object obj8 = this.L;
        Object obj9 = this.K;
        Object obj10 = this.J;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i3 | 1);
                int iP02 = x44.p0(i2);
                es1.a((oe5) obj10, (r1e) obj9, (iwg) obj8, (zy7) qz7Var, (zy7) obj7, this.G, (zy7) obj6, (zy7) obj5, (qi3) obj3, (zy7) obj4, this.F, (ld4) obj, iP0, iP02);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP03 = x44.p0(i3 | 1);
                int iP04 = x44.p0(i2);
                rl5.b(this.F, (Long) obj10, this.G, (o72) obj9, (ta4) obj8, (ta4) qz7Var, (sl5) obj7, (nl5) obj6, (Locale) obj5, (wl5) obj4, (bt7) obj3, (ld4) obj, iP03, iP04);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ as1(iqb iqbVar, Long l, bz7 bz7Var, o72 o72Var, ta4 ta4Var, ta4 ta4Var2, sl5 sl5Var, nl5 nl5Var, Locale locale, wl5 wl5Var, bt7 bt7Var, int i, int i2) {
        this.F = iqbVar;
        this.J = l;
        this.G = bz7Var;
        this.K = o72Var;
        this.L = ta4Var;
        this.M = ta4Var2;
        this.N = sl5Var;
        this.O = nl5Var;
        this.P = locale;
        this.Q = wl5Var;
        this.R = bt7Var;
        this.H = i;
        this.I = i2;
    }
}
