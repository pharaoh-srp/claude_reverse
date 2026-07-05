package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xlf implements ylf {
    public final String a;

    public xlf(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xlf) && x44.r(this.a, ((xlf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Success(requestId=", this.a, ")");
    }
}
