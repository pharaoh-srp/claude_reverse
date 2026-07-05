package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cz4 implements fz4 {
    public final String a;

    public cz4(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cz4) && this.a.equals(((cz4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Error(message=", this.a, ")");
    }
}
