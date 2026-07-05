package defpackage;

import com.anthropic.claude.api.experience.SpotlightContent;
import com.anthropic.claude.bell.b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tk1 implements pz7 {
    public final /* synthetic */ int E = 2;
    public final /* synthetic */ float F;
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ tk1(x5a x5aVar, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, float f, iqb iqbVar, int i) {
        this.H = x5aVar;
        this.I = zy7Var;
        this.J = zy7Var2;
        this.K = zy7Var3;
        this.F = f;
        this.L = iqbVar;
        this.G = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.G;
        Object obj3 = this.L;
        Object obj4 = this.K;
        Object obj5 = this.J;
        Object obj6 = this.I;
        Object obj7 = this.H;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                b.e((String) obj7, (String) obj6, this.F, (fq3) obj4, (String) obj5, (bz7) obj3, (ld4) obj, iP0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                xsc.e((x5a) obj7, (zy7) obj6, (zy7) obj5, (zy7) obj4, this.F, (iqb) obj3, (ld4) obj, iP02);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP03 = x44.p0(i2 | 1);
                dkk.c((SpotlightContent) obj7, (iqb) obj6, this.F, (mnc) obj5, (yw8) obj4, (vig) obj3, (ld4) obj, iP03);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ tk1(SpotlightContent spotlightContent, iqb iqbVar, float f, mnc mncVar, yw8 yw8Var, vig vigVar, int i) {
        this.H = spotlightContent;
        this.I = iqbVar;
        this.F = f;
        this.J = mncVar;
        this.K = yw8Var;
        this.L = vigVar;
        this.G = i;
    }

    public /* synthetic */ tk1(String str, String str2, float f, fq3 fq3Var, String str3, bz7 bz7Var, int i) {
        this.H = str;
        this.I = str2;
        this.F = f;
        this.K = fq3Var;
        this.J = str3;
        this.L = bz7Var;
        this.G = i;
    }
}
