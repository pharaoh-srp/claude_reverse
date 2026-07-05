package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o4j implements p4j {
    public final String a;

    public o4j(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o4j) && this.a.equals(((o4j) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Unsupported(languageCode=", this.a, ")");
    }
}
