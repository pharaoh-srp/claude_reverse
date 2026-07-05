package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sbh {
    public final String a;

    public sbh(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sbh) && x44.r(this.a, ((sbh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Application(id=", this.a, ")");
    }
}
