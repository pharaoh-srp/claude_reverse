package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class yd1 extends ae1 {
    public final char[] e;

    public yd1(xd1 xd1Var) {
        super(xd1Var, (Character) null);
        this.e = new char[512];
        char[] cArr = xd1Var.b;
        fd9.E(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.e;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING] = cArr[i & 15];
        }
    }

    @Override // defpackage.ae1
    public final void b(StringBuilder sb, byte[] bArr, int i) {
        fd9.K(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.e;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING]);
        }
    }
}
