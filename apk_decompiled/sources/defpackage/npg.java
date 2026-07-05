package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class npg extends wpg {
    public final String a;
    public final String b;
    public final lsk c;
    public final long d;

    public npg(String str, String str2, lsk lskVar, long j) {
        this.a = str;
        this.b = str2;
        this.c = lskVar;
        this.d = j;
    }

    @Override // defpackage.wpg
    public final long a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof npg)) {
            return false;
        }
        npg npgVar = (npg) obj;
        return this.a.equals(npgVar.a) && this.b.equals(npgVar.b) && this.c.equals(npgVar.c) && this.d == npgVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + kgh.l(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("Html(html=", this.a, ", htmlId=", this.b, ", renderKind=");
        sbR.append(this.c);
        sbR.append(", timestamp=");
        sbR.append(this.d);
        sbR.append(")");
        return sbR.toString();
    }
}
