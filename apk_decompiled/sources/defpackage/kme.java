package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kme implements nme {
    public final String a;

    public kme(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kme) && this.a.equals(((kme) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("Absolute(formatted=", this.a, ")");
    }
}
