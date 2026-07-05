package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ko5 {
    public final wv8 a;
    public final boolean b;

    public ko5(wv8 wv8Var, boolean z) {
        this.a = wv8Var;
        this.b = z;
    }

    public final wv8 a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ko5)) {
            return false;
        }
        ko5 ko5Var = (ko5) obj;
        return this.a.equals(ko5Var.a) && this.b == ko5Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DecodeResult(image=" + this.a + ", isSampled=" + this.b + ")";
    }
}
