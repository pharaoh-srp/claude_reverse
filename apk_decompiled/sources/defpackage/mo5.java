package defpackage;

import okio.BufferedSource;
import okio.ByteString;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mo5 {
    public static final ByteString a;
    public static final ByteString b;

    static {
        ByteString byteString = ByteString.H;
        a = ByteString.Companion.b("<svg");
        b = ByteString.Companion.b("<");
    }

    public static final boolean a(BufferedSource bufferedSource) {
        return bufferedSource.Y(0L, b) && bufferedSource.u0(1024L, a) != -1;
    }
}
