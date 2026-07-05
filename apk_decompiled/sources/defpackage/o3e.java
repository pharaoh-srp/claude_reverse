package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class o3e implements t3e {
    public final String a;

    public o3e(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o3e) && x44.r(this.a, ((o3e) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ij0.j("Error(message=", this.a, ")");
    }
}
