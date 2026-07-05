package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ve2 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ ve2(int i, int i2, zy7 zy7Var, zy7 zy7Var2) {
        this.E = 8;
        this.F = i;
        this.I = zy7Var;
        this.H = zy7Var2;
        this.G = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        int i2 = this.G;
        int i3 = this.F;
        iei ieiVar = iei.a;
        Object obj3 = this.I;
        Object obj4 = this.H;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((we2) obj4).a(x44.p0(i3 | 1), i2, (ld4) obj, (zy7) obj3);
                break;
            case 1:
                mnc mncVar = (mnc) obj4;
                String str = (String) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    tjh.b(str, gb9.I(fqb.E, mncVar), 0L, 0L, null, null, null, 0L, null, null, 0L, this.F, false, this.G, 0, null, null, e18Var, 0, 0, 241660);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                rta.c((cte) obj4, i3, (ta4) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                dvj.b((v77) obj4, (iqb) obj3, i3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                rwj.a((List) obj4, (iqb) obj3, (ld4) obj, x44.p0(i3 | 1), i2);
                break;
            case 5:
                ((Integer) obj2).getClass();
                fhk.c((iqb) obj4, (tkh) obj3, (ld4) obj, x44.p0(i3 | 1), i2);
                break;
            case 6:
                ((Integer) obj2).getClass();
                dkk.d(this.F, this.G, (bz7) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                xvk.c((iqb) obj4, (ta4) obj3, (ld4) obj, x44.p0(i3 | 1), i2);
                break;
            case 8:
                ((Integer) obj2).intValue();
                jvk.b(i3, (zy7) obj3, (zy7) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                zjk.c(x44.p0(i3 | 1), i2, (ld4) obj, (pz7) obj4, (iqb) obj3);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ve2(int i, int i2, ta4 ta4Var, cte cteVar) {
        this.E = 2;
        this.H = cteVar;
        this.F = i;
        this.I = ta4Var;
        this.G = i2;
    }

    public /* synthetic */ ve2(int i, int i2, int i3, Object obj, Object obj2) {
        this.E = i3;
        this.H = obj;
        this.I = obj2;
        this.F = i;
        this.G = i2;
    }

    public /* synthetic */ ve2(int i, int i2, bz7 bz7Var, iqb iqbVar, int i3) {
        this.E = 6;
        this.F = i;
        this.G = i2;
        this.H = bz7Var;
        this.I = iqbVar;
    }
}
