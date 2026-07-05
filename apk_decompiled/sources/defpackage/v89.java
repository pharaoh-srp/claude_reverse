package defpackage;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v89 {
    public static final byte[] a;

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        ByteBuffer.wrap(bArr);
    }

    public static boolean a(byte[] bArr) {
        return nai.Y(bArr, 0, bArr.length) == 0;
    }

    public static String b(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            xh6.f("UTF-8 not supported?", e);
            return null;
        }
    }
}
