package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ij1 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ mj1 F;

    public /* synthetic */ ij1(mj1 mj1Var, int i) {
        this.E = i;
        this.F = mj1Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        mj1 mj1Var = this.F;
        switch (i) {
            case 0:
                mj1Var.L = ((Boolean) obj).booleanValue();
                mj1Var.N.r(nk1.a);
                return iei.a;
            default:
                ((r4a) obj).getClass();
                gb9.D(mj1Var.a, null, null, new jj1(mj1Var, null, 0), 3);
                return new le(5);
        }
    }
}
