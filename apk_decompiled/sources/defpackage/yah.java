package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yah {
    public final String a;

    public yah(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yah) && x44.r(this.a, ((yah) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Action(id=", this.a, ")");
    }
}
