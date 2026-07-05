package defpackage;

import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nu7 {
    public static final zna a = new zna(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final w6g d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new hje());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new w6g(0);
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((hu7) list.get(i2)).g);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b5, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b9, code lost:
    
        throw r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.mu7 b(java.lang.String r8, android.content.Context r9, java.util.List r10, int r11) {
        /*
            zna r0 = defpackage.nu7.a
            java.lang.String r1 = "getFontSync"
            android.os.Trace.beginSection(r1)
            java.lang.Object r1 = r0.c(r8)     // Catch: java.lang.Throwable -> Lb5
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1     // Catch: java.lang.Throwable -> Lb5
            if (r1 == 0) goto L18
            mu7 r8 = new mu7     // Catch: java.lang.Throwable -> Lb5
            r8.<init>(r1)     // Catch: java.lang.Throwable -> Lb5
            android.os.Trace.endSection()
            return r8
        L18:
            iv7 r10 = defpackage.gu7.a(r9, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lab java.lang.Throwable -> Lb5
            java.util.List r1 = r10.b     // Catch: java.lang.Throwable -> Lb5
            int r10 = r10.a     // Catch: java.lang.Throwable -> Lb5
            r2 = 1
            r3 = -3
            r4 = 0
            if (r10 == 0) goto L2b
            if (r10 == r2) goto L29
        L27:
            r10 = r3
            goto L4c
        L29:
            r10 = -2
            goto L4c
        L2b:
            java.lang.Object r10 = r1.get(r4)     // Catch: java.lang.Throwable -> Lb5
            jv7[] r10 = (defpackage.jv7[]) r10     // Catch: java.lang.Throwable -> Lb5
            if (r10 == 0) goto L4b
            int r5 = r10.length     // Catch: java.lang.Throwable -> Lb5
            if (r5 != 0) goto L37
            goto L4b
        L37:
            int r5 = r10.length     // Catch: java.lang.Throwable -> Lb5
            r6 = r4
        L39:
            if (r6 >= r5) goto L49
            r7 = r10[r6]     // Catch: java.lang.Throwable -> Lb5
            int r7 = r7.f     // Catch: java.lang.Throwable -> Lb5
            if (r7 == 0) goto L46
            if (r7 >= 0) goto L44
            goto L27
        L44:
            r10 = r7
            goto L4c
        L46:
            int r6 = r6 + 1
            goto L39
        L49:
            r10 = r4
            goto L4c
        L4b:
            r10 = r2
        L4c:
            if (r10 == 0) goto L57
            mu7 r8 = new mu7     // Catch: java.lang.Throwable -> Lb5
            r8.<init>(r10)     // Catch: java.lang.Throwable -> Lb5
            android.os.Trace.endSection()
            return r8
        L57:
            int r10 = r1.size()     // Catch: java.lang.Throwable -> Lb5
            if (r10 <= r2) goto L79
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lb5
            r2 = 29
            if (r10 < r2) goto L79
            qwk r10 = defpackage.kbi.a     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r10 = "TypefaceCompat.createFromFontInfoWithFallback"
            android.os.Trace.beginSection(r10)     // Catch: java.lang.Throwable -> Lb5
            qwk r10 = defpackage.kbi.a     // Catch: java.lang.Throwable -> L74
            android.graphics.Typeface r9 = r10.h(r9, r1, r11)     // Catch: java.lang.Throwable -> L74
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb5
            goto L8f
        L74:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb5
            throw r8     // Catch: java.lang.Throwable -> Lb5
        L79:
            java.lang.Object r10 = r1.get(r4)     // Catch: java.lang.Throwable -> Lb5
            jv7[] r10 = (defpackage.jv7[]) r10     // Catch: java.lang.Throwable -> Lb5
            qwk r1 = defpackage.kbi.a     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r1 = "TypefaceCompat.createFromFontInfo"
            android.os.Trace.beginSection(r1)     // Catch: java.lang.Throwable -> Lb5
            qwk r1 = defpackage.kbi.a     // Catch: java.lang.Throwable -> La6
            android.graphics.Typeface r9 = r1.g(r9, r10, r11)     // Catch: java.lang.Throwable -> La6
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb5
        L8f:
            if (r9 == 0) goto L9d
            r0.d(r8, r9)     // Catch: java.lang.Throwable -> Lb5
            mu7 r8 = new mu7     // Catch: java.lang.Throwable -> Lb5
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lb5
            android.os.Trace.endSection()
            return r8
        L9d:
            mu7 r8 = new mu7     // Catch: java.lang.Throwable -> Lb5
            r8.<init>(r3)     // Catch: java.lang.Throwable -> Lb5
            android.os.Trace.endSection()
            return r8
        La6:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb5
            throw r8     // Catch: java.lang.Throwable -> Lb5
        Lab:
            mu7 r8 = new mu7     // Catch: java.lang.Throwable -> Lb5
            r9 = -1
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lb5
            android.os.Trace.endSection()
            return r8
        Lb5:
            r8 = move-exception
            android.os.Trace.endSection()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu7.b(java.lang.String, android.content.Context, java.util.List, int):mu7");
    }
}
