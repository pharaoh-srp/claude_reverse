package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class a74 implements c45, Serializable {
    public final c45 E;
    public final a45 F;

    public a74(a45 a45Var, c45 c45Var) {
        c45Var.getClass();
        a45Var.getClass();
        this.E = c45Var;
        this.F = a45Var;
    }

    @Override // defpackage.c45
    public final Object K(pz7 pz7Var, Object obj) {
        return pz7Var.invoke(this.E.K(pz7Var, obj), this.F);
    }

    @Override // defpackage.c45
    public final c45 S(b45 b45Var) {
        b45Var.getClass();
        a45 a45Var = this.F;
        a45 a45VarX0 = a45Var.x0(b45Var);
        c45 c45Var = this.E;
        if (a45VarX0 != null) {
            return c45Var;
        }
        c45 c45VarS = c45Var.S(b45Var);
        return c45VarS == c45Var ? this : c45VarS == im6.E ? a45Var : new a74(a45Var, c45VarS);
    }

    public final boolean equals(Object obj) {
        boolean zR;
        if (this == obj) {
            return true;
        }
        if (obj instanceof a74) {
            a74 a74Var = (a74) obj;
            int i = 2;
            a74 a74Var2 = a74Var;
            int i2 = 2;
            while (true) {
                c45 c45Var = a74Var2.E;
                a74Var2 = c45Var instanceof a74 ? (a74) c45Var : null;
                if (a74Var2 == null) {
                    break;
                }
                i2++;
            }
            a74 a74Var3 = this;
            while (true) {
                c45 c45Var2 = a74Var3.E;
                a74Var3 = c45Var2 instanceof a74 ? (a74) c45Var2 : null;
                if (a74Var3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    a45 a45Var = this.F;
                    if (!x44.r(a74Var.x0(a45Var.getKey()), a45Var)) {
                        zR = false;
                        break;
                    }
                    c45 c45Var3 = this.E;
                    if (!(c45Var3 instanceof a74)) {
                        c45Var3.getClass();
                        a45 a45Var2 = (a45) c45Var3;
                        zR = x44.r(a74Var.x0(a45Var2.getKey()), a45Var2);
                        break;
                    }
                    this = (a74) c45Var3;
                }
                if (zR) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.F.hashCode() + this.E.hashCode();
    }

    @Override // defpackage.c45
    public final c45 r0(c45 c45Var) {
        c45Var.getClass();
        return c45Var == im6.E ? this : (c45) c45Var.K(new z35(0), this);
    }

    public final String toString() {
        return vb7.s(new StringBuilder("["), (String) K(new m14(4), ""), ']');
    }

    @Override // defpackage.c45
    public final a45 x0(b45 b45Var) {
        b45Var.getClass();
        while (true) {
            a45 a45VarX0 = this.F.x0(b45Var);
            if (a45VarX0 != null) {
                return a45VarX0;
            }
            c45 c45Var = this.E;
            if (!(c45Var instanceof a74)) {
                return c45Var.x0(b45Var);
            }
            this = (a74) c45Var;
        }
    }
}
