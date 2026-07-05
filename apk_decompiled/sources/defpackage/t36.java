package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class t36 implements x36 {
    public final String a;

    public t36(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t36) && x44.r(this.a, ((t36) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Error(message=", this.a, ")");
    }
}
