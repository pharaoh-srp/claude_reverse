package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jt6 {
    public final Number a;
    public final Number b;

    public jt6(Number number, Number number2) {
        this.a = number;
        this.b = number2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt6)) {
            return false;
        }
        jt6 jt6Var = (jt6) obj;
        return this.a.equals(jt6Var.a) && this.b.equals(jt6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Viewport(width=" + this.a + ", height=" + this.b + ")";
    }
}
