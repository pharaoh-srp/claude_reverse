package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vdd implements xdd {
    public final String a;

    public vdd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vdd) && this.a.equals(((vdd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Success(code=", this.a, ")");
    }
}
