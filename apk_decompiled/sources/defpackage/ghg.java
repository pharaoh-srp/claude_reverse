package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ghg implements hhg {
    public final String a;

    public ghg(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ghg) && this.a.equals(((ghg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Results(text=", this.a, ")");
    }
}
