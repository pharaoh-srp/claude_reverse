package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dbh {
    public final String a;

    public dbh(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dbh) && x44.r(this.a, ((dbh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Session(id=", this.a, ")");
    }
}
