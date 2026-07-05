package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nbh {
    public final String a;

    public nbh(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nbh) && x44.r(this.a, ((nbh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Session(id=", this.a, ")");
    }
}
