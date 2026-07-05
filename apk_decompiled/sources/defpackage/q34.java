package defpackage;

import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q34 {
    public static final byte[] a = {0, 0, 0, 1};
    public static final String[] b = {"", "A", "B", "C"};
    public static final Pattern c = Pattern.compile("^\\D?(\\d+)$");

    public static String a(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = {b[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i4)};
        String str = tpi.a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i5 = 0; i5 < length; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0606 A[Catch: NumberFormatException -> 0x0610, TRY_LEAVE, TryCatch #7 {NumberFormatException -> 0x0610, blocks: (B:438:0x05b9, B:440:0x05cd, B:451:0x05eb, B:462:0x0606), top: B:707:0x05b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:669:0x08f9  */
    /* JADX WARN: Removed duplicated region for block: B:688:0x0933  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair b(defpackage.jw7 r33) {
        /*
            Method dump skipped, instruction units count: 2924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q34.b(jw7):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair c(java.lang.String r11, java.lang.String[] r12, defpackage.f54 r13) {
        /*
            Method dump skipped, instruction units count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q34.c(java.lang.String, java.lang.String[], f54):android.util.Pair");
    }
}
