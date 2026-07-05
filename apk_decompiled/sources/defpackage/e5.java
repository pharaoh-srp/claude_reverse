package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e5 {
    public final String a;
    public final qz7 b;

    public e5(String str, qz7 qz7Var) {
        this.a = str;
        this.b = qz7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5)) {
            return false;
        }
        e5 e5Var = (e5) obj;
        return x44.r(this.a, e5Var.a) && x44.r(this.b, e5Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        qz7 qz7Var = this.b;
        return iHashCode + (qz7Var != null ? qz7Var.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }
}
