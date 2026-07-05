package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ilf implements jlf {
    public final String a;

    public ilf(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ilf) && x44.r(this.a, ((ilf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Success(requestId=", this.a, ")");
    }
}
