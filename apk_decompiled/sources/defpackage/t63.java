package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t63 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;

    public /* synthetic */ t63(Object obj, int i, int i2) {
        this.E = i2;
        this.G = obj;
        this.F = i;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        int i2 = this.F;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                t53 t53Var = (t53) obj2;
                ((w86) obj).getClass();
                em2 em2Var = t53Var.h0;
                em2Var.A++;
                if (em2Var.u.h() == i2) {
                    em2Var.w = false;
                }
                return new dd(3, t53Var);
            default:
                vz9 vz9Var = (vz9) obj;
                zr5 zr5Var = ((x0a) obj2).a;
                rcg rcgVarZ = fd9.Z();
                fd9.s0(rcgVarZ, fd9.k0(rcgVarZ), rcgVarZ != null ? rcgVarZ.e() : null);
                zr5Var.getClass();
                int iA = vz9Var.a() == -1 ? 2 : vz9Var.a();
                for (int i3 = 0; i3 < iA; i3++) {
                    vz9Var.b(i2 + i3);
                }
                return iei.a;
        }
    }
}
