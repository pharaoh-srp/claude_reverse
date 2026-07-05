package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hrg {
    public final String a;

    public hrg(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hrg) && this.a.equals(((hrg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Value(text=", this.a, ")");
    }
}
