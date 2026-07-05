package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bxh {
    public final String a;
    public final String b;

    public bxh(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxh)) {
            return false;
        }
        bxh bxhVar = (bxh) obj;
        return x44.r(this.a, bxhVar.a) && x44.r(this.b, bxhVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ij0.l("ErrorDetails(type=", this.a, ", message=", this.b, ")");
    }
}
