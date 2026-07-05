package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hfg {
    public final String a;

    public hfg(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hfg) && x44.r(this.a, ((hfg) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ij0.j("Application(id=", this.a, ")");
    }
}
