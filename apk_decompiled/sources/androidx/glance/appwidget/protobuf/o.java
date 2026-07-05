package androidx.glance.appwidget.protobuf;

import defpackage.pmf;
import defpackage.tgi;
import defpackage.wy;
import defpackage.zsj;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o {
    public static final zsj a;

    static {
        a = (tgi.e && tgi.d && !wy.a()) ? new n(1) : new n(0);
    }

    public static int a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i >= length) {
                break;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt < 2048) {
                i2 += (127 - cCharAt) >>> 31;
                i++;
            } else {
                int length2 = str.length();
                int i3 = 0;
                while (i < length2) {
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 < 2048) {
                        i3 += (127 - cCharAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i) < 65536) {
                                throw new Utf8$UnpairedSurrogateException(i, length2);
                            }
                            i++;
                        }
                    }
                    i++;
                }
                i2 += i3;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        pmf.g(((long) i2) + 4294967296L);
        return 0;
    }
}
