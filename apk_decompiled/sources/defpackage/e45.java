package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class e45 extends e1 implements a45 {
    public static final d45 F = new d45(a5.G, new a73(25));

    public e45() {
        super(a5.G);
    }

    public abstract void O0(c45 c45Var, Runnable runnable);

    public void P0(c45 c45Var, Runnable runnable) {
        a86.b(this, c45Var, runnable);
    }

    public boolean Q0(c45 c45Var) {
        return !(this instanceof wdi);
    }

    public e45 R0(int i, String str) {
        eve.o(i);
        return new d5a(this, i, str);
    }

    @Override // defpackage.e1, defpackage.c45
    public final c45 S(b45 b45Var) {
        b45Var.getClass();
        if (b45Var instanceof d45) {
            d45 d45Var = (d45) b45Var;
            b45 b45Var2 = this.E;
            b45Var2.getClass();
            if ((b45Var2 != d45Var && d45Var.F != b45Var2) || ((a45) d45Var.E.invoke(this)) == null) {
                return this;
            }
        } else if (a5.G != b45Var) {
            return this;
        }
        return im6.E;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + xn5.d0(this);
    }

    @Override // defpackage.e1, defpackage.c45
    public final a45 x0(b45 b45Var) {
        a45 a45Var;
        b45Var.getClass();
        if (b45Var instanceof d45) {
            d45 d45Var = (d45) b45Var;
            b45 b45Var2 = this.E;
            b45Var2.getClass();
            if ((b45Var2 == d45Var || d45Var.F == b45Var2) && (a45Var = (a45) d45Var.E.invoke(this)) != null) {
                return a45Var;
            }
        } else if (a5.G == b45Var) {
            return this;
        }
        return null;
    }
}
