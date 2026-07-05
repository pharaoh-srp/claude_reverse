package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ukf implements vkf {
    public final String a;

    public ukf(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ukf) && x44.r(this.a, ((ukf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Success(requestId=", this.a, ")");
    }
}
