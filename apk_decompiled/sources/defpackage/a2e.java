package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class a2e {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public a2e(String str, String str2, String str3, int i) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2e)) {
            return false;
        }
        a2e a2eVar = (a2e) obj;
        return x44.r(this.a, a2eVar.a) && this.b.equals(a2eVar.b) && this.c.equals(a2eVar.c) && this.d == a2eVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + kgh.l(kgh.l(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("RawInputEntry(key=", this.a, ", displayValue=", this.b, ", collapsedDisplayValue=");
        sbR.append(this.c);
        sbR.append(", hiddenChars=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
