package defpackage;

import com.anthropic.claude.settings.internal.e;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a32 implements pz7 {
    public final /* synthetic */ int E = 2;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ iqb H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    public /* synthetic */ a32(leb lebVar, boolean z, bz7 bz7Var, pz7 pz7Var, bz7 bz7Var2, iqb iqbVar, pz7 pz7Var2, int i, int i2) {
        this.K = lebVar;
        this.F = z;
        this.G = bz7Var;
        this.M = pz7Var;
        this.L = bz7Var2;
        this.H = iqbVar;
        this.N = pz7Var2;
        this.I = i;
        this.J = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.I;
        Object obj3 = this.N;
        Object obj4 = this.M;
        Object obj5 = this.L;
        Object obj6 = this.G;
        Object obj7 = this.K;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                ttj.c((leb) obj7, this.F, (bz7) obj6, (pz7) obj4, (bz7) obj5, this.H, (pz7) obj3, (ld4) obj, iP0, this.J);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                e.f((String) obj7, this.F, (bz7) obj6, this.H, (String) obj5, (oxf) obj4, (mnc) obj3, (ld4) obj, iP02, this.J);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP03 = x44.p0(i2 | 1);
                jwk.q(this.H, this.F, (zy7) obj7, (zy7) obj6, (zy7) obj5, (zy7) obj4, (zy7) obj3, (ld4) obj, iP03, this.J);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iP04 = x44.p0(i2 | 1);
                otj.f((r4g) obj7, (String) obj6, this.H, (z3g) obj5, this.F, (pz7) obj4, (ta4) obj3, (ld4) obj, iP04, this.J);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP05 = x44.p0(i2 | 1);
                nvh.b((lwc) obj7, (zy7) obj6, (zy7) obj5, (zy7) obj4, (rz7) obj3, this.H, this.F, (ld4) obj, iP05, this.J);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ a32(iqb iqbVar, boolean z, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, zy7 zy7Var4, zy7 zy7Var5, int i, int i2) {
        this.H = iqbVar;
        this.F = z;
        this.K = zy7Var;
        this.G = zy7Var2;
        this.L = zy7Var3;
        this.M = zy7Var4;
        this.N = zy7Var5;
        this.I = i;
        this.J = i2;
    }

    public /* synthetic */ a32(lwc lwcVar, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, rz7 rz7Var, iqb iqbVar, boolean z, int i, int i2) {
        this.K = lwcVar;
        this.G = zy7Var;
        this.L = zy7Var2;
        this.M = zy7Var3;
        this.N = rz7Var;
        this.H = iqbVar;
        this.F = z;
        this.I = i;
        this.J = i2;
    }

    public /* synthetic */ a32(r4g r4gVar, String str, iqb iqbVar, z3g z3gVar, boolean z, pz7 pz7Var, ta4 ta4Var, int i, int i2) {
        this.K = r4gVar;
        this.G = str;
        this.H = iqbVar;
        this.L = z3gVar;
        this.F = z;
        this.M = pz7Var;
        this.N = ta4Var;
        this.I = i;
        this.J = i2;
    }

    public /* synthetic */ a32(String str, boolean z, bz7 bz7Var, iqb iqbVar, String str2, oxf oxfVar, mnc mncVar, int i, int i2) {
        this.K = str;
        this.F = z;
        this.G = bz7Var;
        this.H = iqbVar;
        this.L = str2;
        this.M = oxfVar;
        this.N = mncVar;
        this.I = i;
        this.J = i2;
    }
}
