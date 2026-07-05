package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yhg implements aig {
    public final String a;

    public yhg(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yhg) && this.a.equals(((yhg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Error(partialText=", this.a, ")");
    }
}
