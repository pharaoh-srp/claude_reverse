package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nqf implements rqf {
    public final String a;

    public nqf(String str) {
        str.getClass();
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nqf) && x44.r(this.a, ((nqf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("InterruptAccepted(requestId=", this.a, ")");
    }
}
