package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jo9 {
    public static final jo9 c = new jo9(null, null);
    public final lo9 a;
    public final eo9 b;

    public jo9(lo9 lo9Var, fo9 fo9Var) {
        String str;
        this.a = lo9Var;
        this.b = fo9Var;
        if ((lo9Var == null) == (fo9Var == null)) {
            return;
        }
        if (lo9Var == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + lo9Var + " requires type to be specified.";
        }
        mr9.q(str);
        throw null;
    }

    public final eo9 a() {
        return this.b;
    }

    public final lo9 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo9)) {
            return false;
        }
        jo9 jo9Var = (jo9) obj;
        return this.a == jo9Var.a && x44.r(this.b, jo9Var.b);
    }

    public final int hashCode() {
        lo9 lo9Var = this.a;
        int iHashCode = (lo9Var == null ? 0 : lo9Var.hashCode()) * 31;
        eo9 eo9Var = this.b;
        return iHashCode + (eo9Var != null ? eo9Var.hashCode() : 0);
    }

    public final String toString() {
        lo9 lo9Var = this.a;
        int i = lo9Var == null ? -1 : io9.a[lo9Var.ordinal()];
        if (i == -1) {
            return "*";
        }
        eo9 eo9Var = this.b;
        if (i == 1) {
            return String.valueOf(eo9Var);
        }
        if (i == 2) {
            return "in " + eo9Var;
        }
        if (i != 3) {
            wg6.i();
            return null;
        }
        return "out " + eo9Var;
    }
}
