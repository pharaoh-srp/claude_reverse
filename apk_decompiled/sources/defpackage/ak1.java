package defpackage;

import com.anthropic.claude.tool.model.UserLocationV0Output;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ak1 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ iqb G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;
    public final /* synthetic */ qz7 K;
    public final /* synthetic */ Object L;

    public /* synthetic */ ak1(zy7 zy7Var, y49 y49Var, boolean z, boolean z2, iqb iqbVar, int i, int i2) {
        this.E = 0;
        this.K = zy7Var;
        this.L = y49Var;
        this.F = z;
        this.H = z2;
        this.G = iqbVar;
        this.I = i;
        this.J = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        int i2 = this.I;
        iei ieiVar = iei.a;
        Object obj3 = this.L;
        qz7 qz7Var = this.K;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                jwk.f((zy7) qz7Var, (y49) obj3, this.F, this.H, this.G, (ld4) obj, iP0, this.J);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                ckk.a(this.F, (bz7) qz7Var, this.G, this.H, (ce3) obj3, (ld4) obj, iP02, this.J);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP03 = x44.p0(i2 | 1);
                vjk.b(this.F, (zy7) qz7Var, this.G, this.H, (x0e) obj3, (ld4) obj, iP03, this.J);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iP04 = x44.p0(i2 | 1);
                q0h.a(this.F, (bz7) qz7Var, this.G, this.H, (p0h) obj3, (ld4) obj, iP04, this.J);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP05 = x44.p0(this.J | 1);
                rkj.f(this.F, this.I, this.H, (zy7) qz7Var, (UserLocationV0Output) obj3, this.G, (ld4) obj, iP05);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ak1(boolean z, int i, boolean z2, zy7 zy7Var, UserLocationV0Output userLocationV0Output, iqb iqbVar, int i2) {
        this.E = 4;
        this.F = z;
        this.I = i;
        this.H = z2;
        this.K = zy7Var;
        this.L = userLocationV0Output;
        this.G = iqbVar;
        this.J = i2;
    }

    public /* synthetic */ ak1(boolean z, qz7 qz7Var, iqb iqbVar, boolean z2, Object obj, int i, int i2, int i3) {
        this.E = i3;
        this.F = z;
        this.K = qz7Var;
        this.G = iqbVar;
        this.H = z2;
        this.L = obj;
        this.I = i;
        this.J = i2;
    }
}
