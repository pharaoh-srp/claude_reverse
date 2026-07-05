package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dki implements hki {
    public final String a;

    public dki(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dki) && this.a.equals(((dki) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return ij0.j("PermanentError(message=", this.a, ", cause=null)");
    }
}
