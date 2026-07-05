package io.sentry.vendor.gson.internal.bind.util;

import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final TimeZone a = TimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    public static void b(int i, int i2, StringBuilder sb) {
        String string = Integer.toString(i);
        for (int length = i2 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f6 A[Catch: IllegalArgumentException -> 0x00b8, NumberFormatException -> 0x00bb, IndexOutOfBoundsException -> 0x00be, TRY_LEAVE, TryCatch #2 {IllegalArgumentException -> 0x00b8, IndexOutOfBoundsException -> 0x00be, NumberFormatException -> 0x00bb, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:17:0x0051, B:19:0x0061, B:20:0x0063, B:22:0x006f, B:23:0x0072, B:25:0x0078, B:29:0x0082, B:34:0x0092, B:36:0x009a, B:37:0x009e, B:39:0x00a4, B:44:0x00b1, B:53:0x00c5, B:64:0x00f0, B:66:0x00f6, B:92:0x01a8, B:74:0x0108, B:75:0x0123, B:76:0x0124, B:80:0x0141, B:82:0x014e, B:85:0x0157, B:87:0x0176, B:90:0x0185, B:91:0x01a7, B:79:0x0130, B:94:0x01d9, B:95:0x01e0, B:57:0x00d5, B:58:0x00d8, B:52:0x00c1), top: B:106:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d9 A[Catch: IllegalArgumentException -> 0x00b8, NumberFormatException -> 0x00bb, IndexOutOfBoundsException -> 0x00be, TryCatch #2 {IllegalArgumentException -> 0x00b8, IndexOutOfBoundsException -> 0x00be, NumberFormatException -> 0x00bb, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:17:0x0051, B:19:0x0061, B:20:0x0063, B:22:0x006f, B:23:0x0072, B:25:0x0078, B:29:0x0082, B:34:0x0092, B:36:0x009a, B:37:0x009e, B:39:0x00a4, B:44:0x00b1, B:53:0x00c5, B:64:0x00f0, B:66:0x00f6, B:92:0x01a8, B:74:0x0108, B:75:0x0123, B:76:0x0124, B:80:0x0141, B:82:0x014e, B:85:0x0157, B:87:0x0176, B:90:0x0185, B:91:0x01a7, B:79:0x0130, B:94:0x01d9, B:95:0x01e0, B:57:0x00d5, B:58:0x00d8, B:52:0x00c1), top: B:106:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date c(java.lang.String r17, java.text.ParsePosition r18) throws java.text.ParseException {
        /*
            Method dump skipped, instruction units count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.internal.bind.util.a.c(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static int d(int i, int i2, String str) {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int iDigit = Character.digit(str.charAt(i), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: ".concat(str.substring(i, i2)));
            }
            i3 = -iDigit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int iDigit2 = Character.digit(str.charAt(i4), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: ".concat(str.substring(i, i2)));
            }
            i3 = (i3 * 10) - iDigit2;
            i4 = i5;
        }
        return -i3;
    }
}
