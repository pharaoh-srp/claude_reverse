package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hs4 implements ls4 {
    public final String a;
    public final boolean b;

    public hs4(String str) {
        this.a = str;
        this.b = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs4)) {
            return false;
        }
        hs4 hs4Var = (hs4) obj;
        return x44.r(this.a, hs4Var.a) && this.b == hs4Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Failed(message=" + this.a + ", reconnecting=" + this.b + ")";
    }

    public hs4(String str, boolean z) {
        this.a = str;
        this.b = z;
    }
}
