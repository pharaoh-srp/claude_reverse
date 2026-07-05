package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class sie {
    public static rie a(p8b p8bVar, byte[] bArr, int i, int i2) {
        bArr.getClass();
        zkj.a(bArr.length, i, i2);
        return new rie(p8bVar, bArr, i2, i);
    }

    public static rie b(String str, p8b p8bVar) {
        str.getClass();
        Charset charset = dj2.a;
        if (p8bVar != null) {
            ide ideVar = p8b.e;
            Charset charsetA = p8bVar.a(null);
            if (charsetA == null) {
                try {
                    p8bVar = nai.D(p8bVar + "; charset=utf-8");
                } catch (IllegalArgumentException unused) {
                    p8bVar = null;
                }
            } else {
                charset = charsetA;
            }
        }
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        return a(p8bVar, bytes, 0, bytes.length);
    }

    public static /* synthetic */ rie c(sie sieVar, byte[] bArr, p8b p8bVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            p8bVar = null;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int length = bArr.length;
        sieVar.getClass();
        return a(p8bVar, bArr, i, length);
    }
}
