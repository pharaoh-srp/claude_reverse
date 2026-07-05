package defpackage;

import com.anthropic.claude.settings.internal.e;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bk1 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ iqb H;
    public final /* synthetic */ int I;

    public /* synthetic */ bk1(int i, zy7 zy7Var, String str, iqb iqbVar, int i2) {
        this.E = 4;
        this.I = i;
        this.G = zy7Var;
        this.F = str;
        this.H = iqbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        int i2 = this.I;
        iqb iqbVar = this.H;
        zy7 zy7Var = this.G;
        String str = this.F;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                jwk.k(x44.p0(i2 | 1), (ld4) obj, zy7Var, iqbVar, str);
                break;
            case 1:
                ((Integer) obj2).getClass();
                auj.a(x44.p0(i2 | 1), (ld4) obj, zy7Var, iqbVar, str);
                break;
            case 2:
                ((Integer) obj2).getClass();
                nuj.f(x44.p0(i2 | 1), (ld4) obj, zy7Var, iqbVar, str);
                break;
            case 3:
                ((Integer) obj2).getClass();
                e.c(x44.p0(i2 | 1), (ld4) obj, zy7Var, iqbVar, str);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(1);
                zhk.e(this.I, iP0, (ld4) obj, this.G, this.H, this.F);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(3073);
                b1e.f(this.I, iP02, (ld4) obj, this.G, this.H, this.F);
                break;
            case 6:
                ((Integer) obj2).getClass();
                zlk.b(x44.p0(i2 | 1), (ld4) obj, zy7Var, iqbVar, str);
                break;
            case 7:
                ((Integer) obj2).getClass();
                ztk.d(x44.p0(i2 | 1), (ld4) obj, zy7Var, iqbVar, str);
                break;
            default:
                ((Integer) obj2).getClass();
                yjk.d(x44.p0(i2 | 1), (ld4) obj, zy7Var, iqbVar, str);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ bk1(zy7 zy7Var, iqb iqbVar, String str, int i) {
        this.E = 6;
        this.G = zy7Var;
        this.H = iqbVar;
        this.F = str;
        this.I = i;
    }

    public /* synthetic */ bk1(String str, int i, zy7 zy7Var, iqb iqbVar, int i2) {
        this.E = 5;
        this.F = str;
        this.I = i;
        this.G = zy7Var;
        this.H = iqbVar;
    }

    public /* synthetic */ bk1(String str, zy7 zy7Var, iqb iqbVar, int i, int i2) {
        this.E = i2;
        this.F = str;
        this.G = zy7Var;
        this.H = iqbVar;
        this.I = i;
    }
}
