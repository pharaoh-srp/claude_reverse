package defpackage;

import com.google.android.gms.internal.measurement.zzlk;
import io.sentry.e0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class sxk {
    public static final Charset a;
    public static final byte[] b;

    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        int length = bArr.length;
        try {
            if (length < 0) {
                throw zzlk.b();
            }
            int i = (0 - 0) + length;
            if (i < 0) {
                throw zzlk.c();
            }
            if (i > Integer.MAX_VALUE) {
                throw zzlk.d();
            }
        } catch (zzlk e) {
            e0.i(e);
        }
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
