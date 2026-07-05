package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class z48 {
    public final String a;
    public final String b;

    public z48(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z48)) {
            return false;
        }
        z48 z48Var = (z48) obj;
        return this.a.equals(z48Var.a) && this.b.equals(z48Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ij0.l("GitHubAuthIntentData(code=", this.a, ", state=", this.b, ")");
    }
}
