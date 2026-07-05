package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j8g {
    public static final j8g c;
    public final v46 a;
    public final v46 b;

    static {
        s46 s46Var = s46.a;
        c = new j8g(s46Var, s46Var);
    }

    public j8g(v46 v46Var, v46 v46Var2) {
        this.a = v46Var;
        this.b = v46Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8g)) {
            return false;
        }
        j8g j8gVar = (j8g) obj;
        return this.a.equals(j8gVar.a) && this.b.equals(j8gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ")";
    }
}
