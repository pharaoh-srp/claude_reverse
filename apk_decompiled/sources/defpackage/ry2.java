package defpackage;

import com.anthropic.claude.sessions.types.PermissionMode;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ry2 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ zy7 H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ zy7 J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ zy7 L;
    public final /* synthetic */ zy7 M;
    public final /* synthetic */ int N;
    public final /* synthetic */ int O;
    public final /* synthetic */ qz7 P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object S;

    public /* synthetic */ ry2(bz7 bz7Var, boolean z, boolean z2, PermissionMode permissionMode, zy7 zy7Var, boolean z3, zy7 zy7Var2, boolean z4, zy7 zy7Var3, zy7 zy7Var4, i4g i4gVar, iqb iqbVar, int i, int i2) {
        this.P = bz7Var;
        this.F = z;
        this.G = z2;
        this.Q = permissionMode;
        this.H = zy7Var;
        this.I = z3;
        this.J = zy7Var2;
        this.K = z4;
        this.L = zy7Var3;
        this.M = zy7Var4;
        this.R = i4gVar;
        this.S = iqbVar;
        this.N = i;
        this.O = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.O;
        int i3 = this.N;
        Object obj3 = this.S;
        Object obj4 = this.R;
        Object obj5 = this.Q;
        qz7 qz7Var = this.P;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i3 | 1);
                int iP02 = x44.p0(i2);
                ajk.a(this.F, this.G, this.I, this.K, this.H, this.J, this.L, this.M, (zy7) qz7Var, (zy7) obj5, (zy7) obj4, (oy2) obj3, (ld4) obj, iP0, iP02);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP03 = x44.p0(i3 | 1);
                int iP04 = x44.p0(i2);
                t3c.d((bz7) qz7Var, this.F, this.G, (PermissionMode) obj5, this.H, this.I, this.J, this.K, this.L, this.M, (i4g) obj4, (iqb) obj3, (ld4) obj, iP03, iP04);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ry2(boolean z, boolean z2, boolean z3, boolean z4, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, zy7 zy7Var4, zy7 zy7Var5, zy7 zy7Var6, zy7 zy7Var7, oy2 oy2Var, int i, int i2) {
        this.F = z;
        this.G = z2;
        this.I = z3;
        this.K = z4;
        this.H = zy7Var;
        this.J = zy7Var2;
        this.L = zy7Var3;
        this.M = zy7Var4;
        this.P = zy7Var5;
        this.Q = zy7Var6;
        this.R = zy7Var7;
        this.S = oy2Var;
        this.N = i;
        this.O = i2;
    }
}
