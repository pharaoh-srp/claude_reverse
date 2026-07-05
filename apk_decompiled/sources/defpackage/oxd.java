package defpackage;

import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public abstract class oxd {
    public static final ByteString a;

    static {
        ByteString byteString = ByteString.H;
        a = ByteString.Companion.b("xn--");
    }

    public static int a(int i, int i2, boolean z) {
        int i3 = z ? i / 700 : i / 2;
        int i4 = (i3 / i2) + i3;
        int i5 = 0;
        while (i4 > 455) {
            i4 /= 35;
            i5 += 36;
        }
        return ((i4 * 36) / (i4 + 38)) + i5;
    }

    public static int b(int i) {
        if (i < 26) {
            return i + 97;
        }
        if (i < 36) {
            return i + 22;
        }
        mr9.p(i, "unexpected digit: ");
        return 0;
    }
}
