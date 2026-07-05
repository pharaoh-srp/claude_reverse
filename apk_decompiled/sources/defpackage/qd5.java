package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qd5 {
    public final String a;
    public final zy7 b;

    public qd5(zy7 zy7Var, String str) {
        this.a = str;
        this.b = zy7Var;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd5)) {
            return false;
        }
        qd5 qd5Var = (qd5) obj;
        return x44.r(this.a, qd5Var.a) && this.b == qd5Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomAccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }
}
