package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gk implements jk {
    public final fk a;
    public final String b;
    public final String c;

    public gk(fk fkVar, String str, String str2) {
        fkVar.getClass();
        this.a = fkVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk)) {
            return false;
        }
        gk gkVar = (gk) obj;
        return x44.r(this.a, gkVar.a) && this.b.equals(gkVar.b) && x44.r(this.c, gkVar.c);
    }

    public final int hashCode() {
        int iL = kgh.l(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iL + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Code(attachment=");
        sb.append(this.a);
        sb.append(", language=");
        sb.append(this.b);
        sb.append(", code=");
        return ij0.m(sb, this.c, ")");
    }
}
