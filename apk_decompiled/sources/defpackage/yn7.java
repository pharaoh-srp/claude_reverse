package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yn7 implements do7 {
    public final lm0 a;
    public final int b;

    public yn7(lm0 lm0Var, int i) {
        this.a = lm0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yn7) {
            yn7 yn7Var = (yn7) obj;
            if (this.a == yn7Var.a && this.b == yn7Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Available(appUpdateInfo=" + this.a + ", stalenessDays=" + this.b + ")";
    }
}
