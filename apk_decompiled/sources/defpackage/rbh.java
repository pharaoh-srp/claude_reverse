package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rbh {
    public final String a;

    public rbh(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rbh) && x44.r(this.a, ((rbh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Action(id=", this.a, ")");
    }
}
