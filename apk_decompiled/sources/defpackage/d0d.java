package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class d0d implements f0d {
    public final String a;

    public d0d(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0d) && x44.r(this.a, ((d0d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Message(text=", this.a, ")");
    }
}
