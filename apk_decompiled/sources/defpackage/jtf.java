package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jtf {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final String h;

    public jtf(String str, String str2, int i, String str3, String str4, int i2, int i3, String str5) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = i2;
        this.g = i3;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jtf)) {
            return false;
        }
        jtf jtfVar = (jtf) obj;
        return x44.r(this.a, jtfVar.a) && x44.r(this.b, jtfVar.b) && this.c == jtfVar.c && x44.r(this.d, jtfVar.d) && this.e.equals(jtfVar.e) && this.f == jtfVar.f && this.g == jtfVar.g && x44.r(this.h, jtfVar.h);
    }

    public final int hashCode() {
        int iC = vb7.c(this.c, kgh.l(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        int iC2 = vb7.c(this.g, vb7.c(this.f, kgh.l((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31), 31);
        String str2 = this.h;
        return iC2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("SessionPullRequest(repo=", this.a, ", branch=", this.b, ", number=");
        sbR.append(this.c);
        sbR.append(", title=");
        sbR.append(this.d);
        sbR.append(", url=");
        sbR.append(this.e);
        sbR.append(", additions=");
        sbR.append(this.f);
        sbR.append(", deletions=");
        sbR.append(this.g);
        sbR.append(", state=");
        sbR.append(this.h);
        sbR.append(")");
        return sbR.toString();
    }
}
