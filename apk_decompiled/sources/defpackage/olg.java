package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class olg {
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;

    public olg(String str, String str2, Integer num, String str3) {
        grc.B(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof olg)) {
            return false;
        }
        olg olgVar = (olg) obj;
        return x44.r(this.a, olgVar.a) && x44.r(this.b, olgVar.b) && x44.r(this.c, olgVar.c) && this.d.equals(olgVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kgh.l(kgh.l(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("StarterPrompt(id=", this.a, ", promptTitle=", this.b, ", prompt=");
        sbR.append(this.c);
        sbR.append(", iconResource=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
