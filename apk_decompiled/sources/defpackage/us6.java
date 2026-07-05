package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class us6 {
    public final jt6 a;

    public us6(jt6 jt6Var) {
        this.a = jt6Var;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        jt6 jt6Var = this.a;
        if (jt6Var != null) {
            qh9 qh9Var2 = new qh9();
            qh9Var2.p(jt6Var.a, "width");
            qh9Var2.p(jt6Var.b, "height");
            qh9Var.o("viewport", qh9Var2);
        }
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof us6) && x44.r(this.a, ((us6) obj).a);
    }

    public final int hashCode() {
        jt6 jt6Var = this.a;
        if (jt6Var == null) {
            return 0;
        }
        return jt6Var.hashCode();
    }

    public final String toString() {
        return "Display(viewport=" + this.a + ")";
    }
}
