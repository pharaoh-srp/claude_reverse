package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class x3c {
    public final String a;
    public final String b;

    public x3c(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3c)) {
            return false;
        }
        x3c x3cVar = (x3c) obj;
        return x44.r(this.a, x3cVar.a) && this.b.equals(x3cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ij0.l("Active(id=", this.a, ", text=", this.b, ")");
    }
}
