package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ofe {
    public final String a;

    public ofe(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ofe) && x44.r(this.a, ((ofe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Renamed(name=", this.a, ")");
    }
}
