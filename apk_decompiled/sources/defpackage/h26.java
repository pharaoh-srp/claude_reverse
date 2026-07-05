package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class h26 {
    public final int a;
    public final String b;
    public final String c;

    public h26(String str, int i, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!h26.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        h26 h26Var = (h26) obj;
        return this.a == h26Var.a && x44.r(this.b, h26Var.b) && x44.r(this.c, h26Var.c);
    }

    public final int hashCode() {
        int i = this.a * 31;
        String str = this.b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device(type=");
        sb.append(this.a);
        sb.append(", manufacturer=");
        sb.append(this.b);
        sb.append(", model=");
        return vb7.s(sb, this.c, ')');
    }
}
