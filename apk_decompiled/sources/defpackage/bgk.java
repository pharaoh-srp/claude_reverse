package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bgk extends egk {
    /* JADX WARN: Illegal instructions before constructor call */
    public bgk(String str, String str2) {
        char[] charArray = str2.toCharArray();
        super(new rfk(str, charArray), (Character) '=');
        if (charArray.length == 64) {
            return;
        }
        mr9.y();
        throw null;
    }

    @Override // defpackage.egk
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        zok.i(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16) | (bArr[i2 + 2] & 255);
            rfk rfkVar = this.a;
            char[] cArr = rfkVar.b;
            char[] cArr2 = rfkVar.b;
            sb.append(cArr[i4 >>> 18]);
            sb.append(cArr2[(i4 >>> 12) & 63]);
            sb.append(cArr2[(i4 >>> 6) & 63]);
            sb.append(cArr2[i4 & 63]);
            i2 += 3;
        }
        if (i2 < i) {
            b(sb, bArr, i2, i - i2);
        }
    }
}
