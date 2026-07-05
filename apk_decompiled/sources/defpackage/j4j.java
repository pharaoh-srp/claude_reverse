package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j4j {
    public final String a;

    public j4j(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j4j) && this.a.equals(((j4j) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("DefaultToDeviceLocale(code=", this.a, ")");
    }
}
