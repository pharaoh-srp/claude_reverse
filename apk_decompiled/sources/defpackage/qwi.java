package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qwi {
    public final long a;
    public final long b;
    public final long c;

    public qwi(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwi)) {
            return false;
        }
        qwi qwiVar = (qwi) obj;
        return this.a == qwiVar.a && this.b == qwiVar.b && this.c == qwiVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + vb7.e(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbW = grc.w(this.a, "InpSubParts(inputDelay=", ", processingTime=");
        sbW.append(this.b);
        sbW.append(", presentationDelay=");
        sbW.append(this.c);
        sbW.append(")");
        return sbW.toString();
    }
}
