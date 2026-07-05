package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tkb {
    public final String a;
    public final int b;

    public tkb(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tkb)) {
            return false;
        }
        tkb tkbVar = (tkb) obj;
        return x44.r(this.a, tkbVar.a) && this.b == tkbVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return sq6.u("MintedToken(jwt=", this.a, this.b, ", expiresInSeconds=", ")");
    }
}
