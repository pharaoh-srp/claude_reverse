package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ow7 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ ow7(String str, String str2, int i, int i2, xm8 xm8Var, pz7 pz7Var, int i3, int i4) {
        this.E = 2;
        this.I = str;
        this.J = str2;
        this.F = i;
        this.G = i2;
        this.K = xm8Var;
        this.L = pz7Var;
        this.H = i4;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        int i2 = this.G;
        iei ieiVar = iei.a;
        Object obj3 = this.L;
        Object obj4 = this.K;
        Object obj5 = this.J;
        Object obj6 = this.I;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                rw7.a((cte) obj6, (paa) obj5, (List) obj4, this.F, (ta4) obj3, (ld4) obj, iP0, this.H);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                ytk.b((j50) obj6, (String) obj5, (q68) obj4, this.F, (e54) obj3, (ld4) obj, iP02, this.H);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP03 = x44.p0(1);
                ltk.f((String) obj6, (String) obj5, this.F, this.G, (xm8) obj4, (pz7) obj3, (ld4) obj, iP03, this.H);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ow7(Object obj, Object obj2, Object obj3, int i, Object obj4, int i2, int i3, int i4) {
        this.E = i4;
        this.I = obj;
        this.J = obj2;
        this.K = obj3;
        this.F = i;
        this.L = obj4;
        this.G = i2;
        this.H = i3;
    }
}
