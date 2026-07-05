package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zi3 {
    public final String a;
    public final String b;

    public zi3(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi3)) {
            return false;
        }
        zi3 zi3Var = (zi3) obj;
        return x44.r(this.a, zi3Var.a) && x44.r(this.b, zi3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ij0.l("Cta(copy=", this.a, ", intent=", this.b, ")");
    }
}
