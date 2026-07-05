package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hm1 extends jm1 {
    public final String b;

    public hm1(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hm1) && x44.r(this.b, ((hm1) obj).b);
    }

    public final int hashCode() {
        String str = this.b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ij0.j("MessageSseError(displayMessage=", this.b, ")");
    }
}
