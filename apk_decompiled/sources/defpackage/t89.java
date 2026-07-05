package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t89 {
    public static final Charset a;
    public static final byte[] b;

    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        r34.h(bArr, 0, 0, false);
    }

    public static void a(String str, Object obj) {
        if (obj != null) {
            return;
        }
        mr9.h(str);
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
