package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class vfk extends egk {
    public final char[] e;

    public vfk(rfk rfkVar) {
        super(rfkVar, (Character) null);
        this.e = new char[512];
        char[] cArr = rfkVar.b;
        if (cArr.length != 16) {
            mr9.y();
            throw null;
        }
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.e;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING] = cArr[i & 15];
        }
    }

    @Override // defpackage.egk
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        zok.i(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.e;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING]);
        }
    }
}
