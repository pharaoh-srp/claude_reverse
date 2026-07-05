package defpackage;

import io.sentry.p1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jv2 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ iqb F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ ta4 H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ jv2(zy7 zy7Var, wu8 wu8Var, iqb iqbVar, boolean z, ta4 ta4Var, int i, int i2) {
        this.K = zy7Var;
        this.L = wu8Var;
        this.F = iqbVar;
        this.G = z;
        this.H = ta4Var;
        this.I = i;
        this.J = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.I;
        Object obj3 = this.L;
        Object obj4 = this.K;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                d4c.h((zy7) obj4, (wu8) obj3, this.F, this.G, this.H, (ld4) obj, iP0, this.J);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                mpk.h((String) obj4, this.F, this.G, (p1) obj3, this.H, (ld4) obj, iP02, this.J);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ jv2(String str, iqb iqbVar, boolean z, p1 p1Var, ta4 ta4Var, int i, int i2) {
        this.K = str;
        this.F = iqbVar;
        this.G = z;
        this.L = p1Var;
        this.H = ta4Var;
        this.I = i;
        this.J = i2;
    }
}
