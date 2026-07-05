package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class m1c {
    public final int a;
    public final long b;
    public final long c;
    public final z0c d;
    public final afg e;
    public final Object f;

    public m1c(int i, long j, long j2, z0c z0cVar, afg afgVar, Object obj) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = z0cVar;
        this.e = afgVar;
        this.f = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1c)) {
            return false;
        }
        m1c m1cVar = (m1c) obj;
        return this.a == m1cVar.a && this.b == m1cVar.b && this.c == m1cVar.c && x44.r(this.d, m1cVar.d) && x44.r(this.e, m1cVar.e) && x44.r(this.f, m1cVar.f);
    }

    public final int hashCode() {
        int iG = ebh.g(vb7.e(vb7.e(this.a * 31, 31, this.b), 31, this.c), 31, this.d.a);
        afg afgVar = this.e;
        int iHashCode = (iG + (afgVar == null ? 0 : afgVar.E.hashCode())) * 31;
        Object obj = this.f;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkResponse(code=");
        sb.append(this.a);
        sb.append(", requestMillis=");
        sb.append(this.b);
        ij0.u(this.c, ", responseMillis=", ", headers=", sb);
        sb.append(this.d);
        sb.append(", body=");
        sb.append(this.e);
        sb.append(", delegate=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
