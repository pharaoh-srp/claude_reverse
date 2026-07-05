package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rnh {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public rnh(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rnh)) {
            return false;
        }
        rnh rnhVar = (rnh) obj;
        return this.a.equals(rnhVar.a) && this.b.equals(rnhVar.b) && this.c.equals(rnhVar.c) && this.d == rnhVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + kgh.l(kgh.l(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("ThreadDump(name=", this.a, ", state=", this.b, ", stack=");
        sbR.append(this.c);
        sbR.append(", crashed=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
