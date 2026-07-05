package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rfg {
    public final String a;

    public rfg(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rfg) && x44.r(this.a, ((rfg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Tracer(version=", this.a, ")");
    }
}
