package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kl2 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;

    public kl2(String str, String str2, String str3, long j, int i) {
        grc.B(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = i;
    }

    public static kl2 a(kl2 kl2Var, int i) {
        String str = kl2Var.a;
        String str2 = kl2Var.b;
        String str3 = kl2Var.c;
        long j = kl2Var.d;
        kl2Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new kl2(str, str2, str3, j, i);
    }

    public final int b() {
        return this.e;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl2)) {
            return false;
        }
        kl2 kl2Var = (kl2) obj;
        return x44.r(this.a, kl2Var.a) && x44.r(this.b, kl2Var.b) && x44.r(this.c, kl2Var.c) && this.d == kl2Var.d && this.e == kl2Var.e;
    }

    public final long f() {
        return this.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + vb7.e(kgh.l(kgh.l(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("BusyContainerSendRetry(conversationUuid=", this.a, ", organizationUuid=", this.b, ", humanMessageUuid=");
        sbR.append(this.c);
        sbR.append(", startTime=");
        sbR.append(this.d);
        sbR.append(", attemptCount=");
        sbR.append(this.e);
        sbR.append(")");
        return sbR.toString();
    }

    public /* synthetic */ kl2(String str, String str2, String str3, long j) {
        this(str, str2, str3, j, 0);
    }
}
