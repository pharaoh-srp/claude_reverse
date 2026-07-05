package defpackage;

import com.anthropic.claude.artifact.model.ArtifactMetadata;
import com.anthropic.claude.code.remote.bottomsheet.a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tr0 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ tr0(ud0 ud0Var, boolean z, zy7 zy7Var, String str, ta4 ta4Var, int i, int i2) {
        this.E = 3;
        this.K = ud0Var;
        this.F = z;
        this.L = zy7Var;
        this.G = str;
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
        Object obj4 = this.H;
        Object obj5 = this.G;
        Object obj6 = this.K;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                ur0.b((ArtifactMetadata) obj6, (String) obj5, (zy7) obj3, (iqb) obj4, this.F, (ld4) obj, iP0, this.J);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                ur0.a(this.F, (bs0) obj6, (String) obj5, (iqb) obj4, (clh) obj3, (ld4) obj, iP02, this.J);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP03 = x44.p0(i2 | 1);
                ttj.f((spf) obj6, (jz0) obj5, this.F, (pz7) obj3, (bz7) obj4, (ld4) obj, iP03, this.J);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iP04 = x44.p0(i2 | 1);
                a.B((ud0) obj6, this.F, (zy7) obj3, (String) obj5, (ta4) obj4, (ld4) obj, iP04, this.J);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iP05 = x44.p0(i2 | 1);
                t3c.b((ud0) obj6, (String) obj5, (zy7) obj3, (iqb) obj4, this.F, (ld4) obj, iP05, this.J);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP06 = x44.p0(i2 | 1);
                ((tqh) obj6).A((String) obj5, (wu8) obj4, this.F, (zy7) obj3, (ld4) obj, iP06, this.J);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ tr0(spf spfVar, jz0 jz0Var, boolean z, pz7 pz7Var, bz7 bz7Var, int i, int i2) {
        this.E = 2;
        this.K = spfVar;
        this.G = jz0Var;
        this.F = z;
        this.L = pz7Var;
        this.H = bz7Var;
        this.I = i;
        this.J = i2;
    }

    public /* synthetic */ tr0(tqh tqhVar, String str, wu8 wu8Var, boolean z, zy7 zy7Var, int i, int i2) {
        this.E = 5;
        this.K = tqhVar;
        this.G = str;
        this.H = wu8Var;
        this.F = z;
        this.L = zy7Var;
        this.I = i;
        this.J = i2;
    }

    public /* synthetic */ tr0(Object obj, String str, zy7 zy7Var, iqb iqbVar, boolean z, int i, int i2, int i3) {
        this.E = i3;
        this.K = obj;
        this.G = str;
        this.L = zy7Var;
        this.H = iqbVar;
        this.F = z;
        this.I = i;
        this.J = i2;
    }

    public /* synthetic */ tr0(boolean z, bs0 bs0Var, String str, iqb iqbVar, clh clhVar, int i, int i2) {
        this.E = 1;
        this.F = z;
        this.K = bs0Var;
        this.G = str;
        this.H = iqbVar;
        this.L = clhVar;
        this.I = i;
        this.J = i2;
    }
}
