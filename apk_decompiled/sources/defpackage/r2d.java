package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class r2d implements fjb {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public r2d(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static r2d d(ssc sscVar) {
        int iM = sscVar.m();
        String strK = gkb.k(sscVar.x(sscVar.m(), StandardCharsets.US_ASCII));
        String strX = sscVar.x(sscVar.m(), StandardCharsets.UTF_8);
        int iM2 = sscVar.m();
        int iM3 = sscVar.m();
        int iM4 = sscVar.m();
        int iM5 = sscVar.m();
        int iM6 = sscVar.m();
        byte[] bArr = new byte[iM6];
        sscVar.k(bArr, 0, iM6);
        return new r2d(iM, strK, strX, iM2, iM3, iM4, iM5, bArr);
    }

    @Override // defpackage.fjb
    public final void b(m7b m7bVar) {
        m7bVar.a(this.h, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r2d.class != obj.getClass()) {
            return false;
        }
        r2d r2dVar = (r2d) obj;
        return this.a == r2dVar.a && this.b.equals(r2dVar.b) && this.c.equals(r2dVar.c) && this.d == r2dVar.d && this.e == r2dVar.e && this.f == r2dVar.f && this.g == r2dVar.g && Arrays.equals(this.h, r2dVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((kgh.l(kgh.l((527 + this.a) * 31, 31, this.b), 31, this.c) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }
}
