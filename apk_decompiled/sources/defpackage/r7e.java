package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r7e {
    public le4 a;
    public int b;
    public y08 c;
    public pz7 d;
    public int e;
    public mvb f;
    public ewb g;

    public r7e(le4 le4Var) {
        this.a = le4Var;
    }

    public final boolean a() {
        if (this.a != null) {
            y08 y08Var = this.c;
            if (y08Var != null ? y08Var.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final ub9 b(Object obj) {
        ub9 ub9VarS;
        le4 le4Var = this.a;
        return (le4Var == null || (ub9VarS = le4Var.s(this, obj)) == null) ? ub9.E : ub9VarS;
    }

    public final void c() {
        le4 le4Var = this.a;
        if (le4Var != null) {
            le4Var.S = true;
            le4Var.X.E();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void d(boolean z) {
        int i = this.b;
        this.b = z ? i | 32 : i & (-33);
    }

    public final void e(pz7 pz7Var) {
        this.d = pz7Var;
    }
}
