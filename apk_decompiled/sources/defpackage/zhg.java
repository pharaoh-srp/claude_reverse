package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zhg implements aig {
    public final String a;

    public zhg(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zhg) && this.a.equals(((zhg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Finished(text=", this.a, ")");
    }
}
