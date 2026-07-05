package okio;

import defpackage.grc;
import defpackage.mdj;
import defpackage.mr9;
import defpackage.pmf;
import defpackage.vb7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okio"}, k = 2, mv = {2, 1, 0}, xi = mdj.f)
public final class Utf8 {
    public static long a(String str) {
        long j;
        int length = str.length();
        str.getClass();
        long j2 = 0;
        if (length < 0) {
            mr9.q(grc.o(length, 0, "endIndex < beginIndex: ", " < "));
            return 0L;
        }
        if (length > str.length()) {
            pmf.f(str.length(), vb7.u("endIndex > string.length: ", length, " > "));
            return 0L;
        }
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                j2++;
            } else {
                if (cCharAt < 2048) {
                    j = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    j = 3;
                } else {
                    int i2 = i + 1;
                    char cCharAt2 = i2 < length ? str.charAt(i2) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j2++;
                        i = i2;
                    } else {
                        j2 += 4;
                        i += 2;
                    }
                }
                j2 += j;
            }
            i++;
        }
        return j2;
    }
}
