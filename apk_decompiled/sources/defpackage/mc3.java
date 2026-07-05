package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mc3 {
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;

    public mc3(String str, String str2, Integer num, String str3) {
        grc.B(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mc3)) {
            return false;
        }
        mc3 mc3Var = (mc3) obj;
        return x44.r(this.a, mc3Var.a) && x44.r(this.b, mc3Var.b) && x44.r(this.c, mc3Var.c) && this.d.equals(mc3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kgh.l(kgh.l(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("ChatStarterSuggestion(displayText=", this.a, ", prompt=", this.b, ", id=");
        sbR.append(this.c);
        sbR.append(", iconResource=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
