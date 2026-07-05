package defpackage;

import okio.Buffer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a7j {
    public static void a(Buffer.UnsafeCursor unsafeCursor, byte[] bArr) {
        long j;
        unsafeCursor.getClass();
        bArr.getClass();
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = unsafeCursor.I;
            int i2 = unsafeCursor.J;
            int i3 = unsafeCursor.K;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            long j2 = unsafeCursor.H;
            Buffer buffer = unsafeCursor.E;
            buffer.getClass();
            if (j2 == buffer.F) {
                sz6.j("no more bytes");
                return;
            }
            j = unsafeCursor.H;
        } while (unsafeCursor.d(j == -1 ? 0L : j + ((long) (unsafeCursor.K - unsafeCursor.J))) != -1);
    }
}
