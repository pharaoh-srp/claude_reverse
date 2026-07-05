package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class j4d {
    public final String a;
    public final String b;
    public final String c;

    public j4d(String str, String str2, String str3) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4d)) {
            return false;
        }
        j4d j4dVar = (j4d) obj;
        return this.a.equals(j4dVar.a) && x44.r(this.b, j4dVar.b) && this.c.equals(j4dVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kgh.l(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ij0.m(kgh.r("PlanApproval(requestId=", this.a, ", toolUseId=", this.b, ", plan="), this.c, ")");
    }
}
