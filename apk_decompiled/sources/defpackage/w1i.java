package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class w1i {
    public final String a;
    public final String b;
    public final String c;
    public final y1i d;

    public w1i(String str, String str2, String str3, y1i y1iVar) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = y1iVar;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1i)) {
            return false;
        }
        w1i w1iVar = (w1i) obj;
        return x44.r(this.a, w1iVar.a) && x44.r(this.b, w1iVar.b) && this.c.equals(w1iVar.c) && this.d == w1iVar.d;
    }

    public final int hashCode() {
        int iL = kgh.l(fsh.p(kgh.l(this.a.hashCode() * 31, 31, this.b), 31, true), 31, this.c);
        y1i y1iVar = this.d;
        return iL + (y1iVar == null ? 0 : y1iVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("Tooltip(id=", this.a, ", text=", this.b, ", ignoreCooldown=true, locationId=");
        sbR.append(this.c);
        sbR.append(", actionType=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
