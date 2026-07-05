package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lxi {
    public final Number a;
    public final Number b;

    public lxi(Number number, Number number2) {
        this.a = number;
        this.b = number2;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        qh9Var.p(this.a, "width");
        qh9Var.p(this.b, "height");
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxi)) {
            return false;
        }
        lxi lxiVar = (lxi) obj;
        return this.a.equals(lxiVar.a) && this.b.equals(lxiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Viewport(width=" + this.a + ", height=" + this.b + ")";
    }
}
