package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ujb {
    public final String a;
    public final String b;

    public ujb(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujb)) {
            return false;
        }
        ujb ujbVar = (ujb) obj;
        return x44.r(this.a, ujbVar.a) && x44.r(this.b, ujbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ij0.l("MethodDescriptor(service=", this.a, ", method=", this.b, ")");
    }
}
