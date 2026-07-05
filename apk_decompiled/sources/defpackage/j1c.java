package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j1c {
    public final String a;
    public final String b;
    public final z0c c;
    public final be7 d;

    public j1c(String str, String str2, z0c z0cVar, be7 be7Var) {
        this.a = str;
        this.b = str2;
        this.c = z0cVar;
        this.d = be7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1c)) {
            return false;
        }
        j1c j1cVar = (j1c) obj;
        return this.a.equals(j1cVar.a) && x44.r(this.b, j1cVar.b) && this.c.equals(j1cVar.c) && x44.r(this.d, j1cVar.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + ebh.g(kgh.l(this.a.hashCode() * 31, 31, this.b), 961, this.c.a);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("NetworkRequest(url=", this.a, ", method=", this.b, ", headers=");
        sbR.append(this.c);
        sbR.append(", body=null, extras=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
