package defpackage;

import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ds1 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ Object F;
    public final /* synthetic */ long G;
    public final /* synthetic */ int H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ qz7 L;
    public final /* synthetic */ Object M;

    public /* synthetic */ ds1(v4g v4gVar, long j, i4g i4gVar, a5g a5gVar, pz7 pz7Var, rz7 rz7Var, ta4 ta4Var, int i) {
        this.I = v4gVar;
        this.G = j;
        this.J = i4gVar;
        this.K = a5gVar;
        this.L = pz7Var;
        this.M = rz7Var;
        this.F = ta4Var;
        this.H = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.H;
        Object obj3 = this.F;
        Object obj4 = this.M;
        qz7 qz7Var = this.L;
        Object obj5 = this.K;
        Object obj6 = this.J;
        Object obj7 = this.I;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                es1.c((Date) obj7, (r1e) obj6, (iwg) obj5, (zy7) qz7Var, (qi3) obj4, (iqb) obj3, this.G, (ld4) obj, iP0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                ssj.b((String) obj7, (ml3) obj6, (iqb) obj3, (ta4) obj5, (ta4) qz7Var, this.G, (ta4) obj4, (ld4) obj, iP02);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP03 = x44.p0(i2 | 1);
                stj.c((v4g) obj7, this.G, (i4g) obj6, (a5g) obj5, (pz7) qz7Var, (rz7) obj4, (ta4) obj3, (ld4) obj, iP03);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ds1(String str, ml3 ml3Var, iqb iqbVar, ta4 ta4Var, ta4 ta4Var2, long j, ta4 ta4Var3, int i) {
        this.I = str;
        this.J = ml3Var;
        this.F = iqbVar;
        this.K = ta4Var;
        this.L = ta4Var2;
        this.G = j;
        this.M = ta4Var3;
        this.H = i;
    }

    public /* synthetic */ ds1(Date date, r1e r1eVar, iwg iwgVar, zy7 zy7Var, qi3 qi3Var, iqb iqbVar, long j, int i) {
        this.I = date;
        this.J = r1eVar;
        this.K = iwgVar;
        this.L = zy7Var;
        this.M = qi3Var;
        this.F = iqbVar;
        this.G = j;
        this.H = i;
    }
}
