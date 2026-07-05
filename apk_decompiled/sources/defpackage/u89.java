package defpackage;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.a;
import io.sentry.e0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class u89 {
    public static final Charset a;
    public static final byte[] b;

    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new a(bArr, 0, 0, false).f(0);
        } catch (InvalidProtocolBufferException e) {
            e0.i(e);
        }
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
