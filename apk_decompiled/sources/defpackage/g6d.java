package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g6d extends i6d {
    public final lm0 a;
    public final int b;

    public g6d(lm0 lm0Var, int i) {
        this.a = lm0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g6d) {
            g6d g6dVar = (g6d) obj;
            if (this.a == g6dVar.a && this.b == g6dVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateAvailable(appUpdateInfo=" + this.a + ", updateAvailability=" + this.b + ")";
    }
}
