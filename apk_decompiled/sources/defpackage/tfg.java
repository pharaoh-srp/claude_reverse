package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tfg {
    public final String a;

    public tfg(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tfg) && x44.r(this.a, ((tfg) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ij0.j("View(id=", this.a, ")");
    }
}
