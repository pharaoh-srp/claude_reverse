package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class blf implements clf {
    public final String a;

    public blf(String str) {
        str.getClass();
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof blf) && x44.r(this.a, ((blf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Success(messageUuid=", this.a, ")");
    }
}
