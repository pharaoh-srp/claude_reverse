package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xf7 implements zz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ pz7 F;

    public /* synthetic */ xf7(int i, pz7 pz7Var) {
        this.E = i;
        this.F = pz7Var;
    }

    public final void a(String str, Throwable th) {
        int i = this.E;
        pz7 pz7Var = this.F;
        switch (i) {
            case 0:
                ((z35) pz7Var).invoke(str, th);
                break;
            default:
                ((gg7) pz7Var).invoke(str, th);
                break;
        }
    }

    @Override // defpackage.zz7
    public final qz7 d() {
        int i = this.E;
        pz7 pz7Var = this.F;
        switch (i) {
            case 0:
                return (z35) pz7Var;
            default:
                return (gg7) pz7Var;
        }
    }

    public final boolean equals(Object obj) {
        int i = this.E;
        pz7 pz7Var = this.F;
        switch (i) {
            case 0:
                if (!(obj instanceof xf7) || !(obj instanceof zz7) || ((z35) pz7Var) != ((zz7) obj).d()) {
                }
                break;
            default:
                if (!(obj instanceof xf7) || !(obj instanceof zz7) || ((gg7) pz7Var) != ((zz7) obj).d()) {
                }
                break;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.E;
        pz7 pz7Var = this.F;
        switch (i) {
            case 0:
                return ((z35) pz7Var).hashCode();
            default:
                return ((gg7) pz7Var).hashCode();
        }
    }
}
