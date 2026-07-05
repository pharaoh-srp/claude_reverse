package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class t21 implements w21 {
    public final String a;
    public final jz0 b;

    public t21(String str, jz0 jz0Var) {
        str.getClass();
        jz0Var.getClass();
        this.a = str;
        this.b = jz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t21)) {
            return false;
        }
        t21 t21Var = (t21) obj;
        return x44.r(this.a, t21Var.a) && x44.r(this.b, t21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Markdown(text=" + this.a + ", root=" + this.b + ")";
    }
}
