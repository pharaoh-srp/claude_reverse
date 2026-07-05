package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class f3e implements i3e {
    public final String a;

    public f3e(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f3e) && x44.r(this.a, ((f3e) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ij0.j("Failure(message=", this.a, ")");
    }
}
