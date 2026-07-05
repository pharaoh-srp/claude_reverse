package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zt6 {
    public final long a;
    public final long b;
    public final e0g c;
    public final qu1 d;
    public final float e;
    public final n02 f;

    public zt6(long j, long j2, e0g e0gVar, qu1 qu1Var, float f, n02 n02Var) {
        e0gVar.getClass();
        this.a = j;
        this.b = j2;
        this.c = e0gVar;
        this.d = qu1Var;
        this.e = f;
        this.f = n02Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zt6)) {
            return false;
        }
        zt6 zt6Var = (zt6) obj;
        return d54.c(this.a, zt6Var.a) && d54.c(this.b, zt6Var.b) && x44.r(this.c, zt6Var.c) && this.d.equals(zt6Var.d) && va6.b(this.e, zt6Var.e) && this.f.equals(zt6Var.f);
    }

    public final int hashCode() {
        int i = d54.i;
        return this.f.hashCode() + vb7.b(this.e, (this.d.hashCode() + ((this.c.hashCode() + vb7.e(Long.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31, 31);
    }

    public final String toString() {
        String strI = d54.i(this.a);
        String strI2 = d54.i(this.b);
        String strC = va6.c(this.e);
        StringBuilder sbR = kgh.r("ErrorMessageBoxStyle(backgroundColor=", strI, ", contentColor=", strI2, ", shape=");
        sbR.append(this.c);
        sbR.append(", border=");
        sbR.append(this.d);
        sbR.append(", shadowElevation=");
        sbR.append(strC);
        sbR.append(", buttonColors=");
        sbR.append(this.f);
        sbR.append(")");
        return sbR.toString();
    }
}
