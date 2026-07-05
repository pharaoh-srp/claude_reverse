package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sv2 {
    public final String a;
    public final String b;

    public sv2(String str, String str2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv2)) {
            return false;
        }
        sv2 sv2Var = (sv2) obj;
        return this.a.equals(sv2Var.a) && x44.r(this.b, sv2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ij0.l("PendingPrefill(text=", this.a, ", source=", this.b, ")");
    }
}
