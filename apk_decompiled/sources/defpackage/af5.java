package defpackage;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class af5 extends ef5 {
    public final long b;
    public final long c;
    public String d;
    public String e;

    public af5(long j, long j2, String str) {
        this.b = j;
        this.c = j2;
        this.d = str;
    }

    @Override // defpackage.ef5
    public final String b() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        byte[] bArr = new byte[32];
        j8.E(this.b, bArr, 0, 16);
        j8.E(this.c, bArr, 16, 16);
        String str2 = new String(bArr, StandardCharsets.US_ASCII);
        this.d = str2;
        return str2;
    }

    @Override // defpackage.ef5
    public final String c() {
        return j8.j0(16, this.c);
    }

    @Override // defpackage.ef5
    public final long d() {
        return this.b;
    }

    @Override // defpackage.ef5
    public final long e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af5)) {
            return false;
        }
        af5 af5Var = (af5) obj;
        return this.b == af5Var.b && this.c == af5Var.c;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = j ^ (j >>> 32);
        long j3 = this.c;
        return (int) ((j2 ^ j3) ^ (j3 >>> 32));
    }

    @Override // defpackage.ef5
    public final String toString() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        String unsignedString = Long.toUnsignedString(this.c);
        this.e = unsignedString;
        return unsignedString;
    }
}
