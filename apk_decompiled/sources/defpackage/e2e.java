package defpackage;

import com.google.crypto.tink.shaded.protobuf.a;

/* JADX INFO: loaded from: classes3.dex */
public final class e2e {
    public final a a;
    public final String b;
    public final Object[] c;
    public final int d;

    public e2e(a aVar, String str, Object[] objArr) {
        this.a = aVar;
        this.b = str;
        this.c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }
}
