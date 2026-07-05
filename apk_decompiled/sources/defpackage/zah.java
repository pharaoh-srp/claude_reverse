package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zah {
    public final String a;

    public zah(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zah) && x44.r(this.a, ((zah) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Application(id=", this.a, ")");
    }
}
