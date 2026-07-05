package defpackage;

import com.anthropic.claude.tasks.ui.y;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c3g implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ c3g(String str, q68 q68Var, skh skhVar, int i, int i2) {
        this.E = 5;
        this.G = str;
        this.H = q68Var;
        this.I = skhVar;
        this.F = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        int i2 = this.F;
        iei ieiVar = iei.a;
        Object obj3 = this.I;
        Object obj4 = this.H;
        Object obj5 = this.G;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                e3g.b((ia0) obj5, (zy7) obj4, (ta4) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                itj.b((x3g) obj5, (bz7) obj4, (u3g) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                stj.i((a5g) obj5, (pz7) obj4, (ta4) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                y.b((ml3) obj5, (pz7) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                hah.a((List) obj5, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(3073);
                spk.b((String) obj5, (q68) obj4, (skh) obj3, this.F, (ld4) obj, iP0);
                break;
            case 6:
                ((Integer) obj2).getClass();
                t1i.c((List) obj5, (mnc) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                wb5.e((List) obj5, (iqb) obj4, (String) obj3, (ld4) obj, x44.p0(1), this.F);
                break;
            case 8:
                ((Integer) obj2).getClass();
                pqi.e((uli) obj5, (List) obj4, (ud7) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                dmk.b((dc1) obj5, (i4g) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ c3g(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.E = i2;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
        this.F = i;
    }

    public /* synthetic */ c3g(List list, iqb iqbVar, String str, int i, int i2) {
        this.E = 7;
        this.G = list;
        this.H = iqbVar;
        this.I = str;
        this.F = i2;
    }
}
