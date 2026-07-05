package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zd1 extends ae1 {
    /* JADX WARN: Illegal instructions before constructor call */
    public zd1(String str, String str2) {
        char[] charArray = str2.toCharArray();
        super(new xd1(str, charArray), (Character) '=');
        fd9.E(charArray.length == 64);
    }

    @Override // defpackage.ae1
    public final void b(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        fd9.K(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 2;
            int i5 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
            i2 += 3;
            int i6 = i5 | (bArr[i4] & 255);
            xd1 xd1Var = this.a;
            char[] cArr = xd1Var.b;
            char[] cArr2 = xd1Var.b;
            sb.append(cArr[i6 >>> 18]);
            sb.append(cArr2[(i6 >>> 12) & 63]);
            sb.append(cArr2[(i6 >>> 6) & 63]);
            sb.append(cArr2[i6 & 63]);
        }
        if (i2 < i) {
            a(sb, bArr, i2, i - i2);
        }
    }
}
