package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class iuf implements fvf {
    public final String a;

    public iuf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iuf) && x44.r(this.a, ((iuf) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ij0.j("CliVersionAvailable(version=", this.a, ")");
    }
}
