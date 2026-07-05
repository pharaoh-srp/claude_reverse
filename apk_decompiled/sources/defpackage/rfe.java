package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rfe {
    public final String a;

    public rfe(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rfe) && x44.r(this.a, ((rfe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Renamed(name=", this.a, ")");
    }
}
