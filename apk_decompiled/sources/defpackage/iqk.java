package defpackage;

import android.net.Uri;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class iqk {
    public static final Object g = new Object();
    public static volatile bnk h;
    public static final AtomicInteger i;
    public final bm7 a;
    public final String b;
    public final Object c;
    public volatile int d = -1;
    public volatile Object e;
    public final /* synthetic */ int f;

    static {
        new AtomicReference();
        i = new AtomicInteger();
    }

    public iqk(bm7 bm7Var, String str, Object obj, int i2) {
        this.f = i2;
        bm7Var.getClass();
        if (((Uri) bm7Var.b) == null) {
            sz6.p("Must pass a valid SharedPreferences file name or ContentProvider URI");
            throw null;
        }
        this.a = bm7Var;
        this.b = str;
        this.c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040 A[PHI: r2
      0x0040: PHI (r2v1 kjc) = (r2v0 kjc), (r2v5 kjc) binds: [B:8:0x0014, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = defpackage.iqk.i
            int r0 = r0.get()
            int r1 = r8.d
            if (r1 >= r0) goto La3
            monitor-enter(r8)
            int r1 = r8.d     // Catch: java.lang.Throwable -> L3d
            if (r1 >= r0) goto L9f
            bnk r1 = defpackage.iqk.h     // Catch: java.lang.Throwable -> L3d
            x r2 = defpackage.x.E     // Catch: java.lang.Throwable -> L3d
            r3 = 0
            if (r1 == 0) goto L40
            nyg r2 = r1.b     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L3d
            kjc r2 = (defpackage.kjc) r2     // Catch: java.lang.Throwable -> L3d
            boolean r4 = r2.b()     // Catch: java.lang.Throwable -> L3d
            if (r4 == 0) goto L40
            java.lang.Object r4 = r2.a()     // Catch: java.lang.Throwable -> L3d
            ipk r4 = (defpackage.ipk) r4     // Catch: java.lang.Throwable -> L3d
            bm7 r5 = r8.a     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r6 = r5.b     // Catch: java.lang.Throwable -> L3d
            android.net.Uri r6 = (android.net.Uri) r6     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r5 = r5.d     // Catch: java.lang.Throwable -> L3d
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L3d
            java.lang.String r7 = r8.b     // Catch: java.lang.Throwable -> L3d
            ook r4 = (defpackage.ook) r4     // Catch: java.lang.Throwable -> L3d
            java.lang.String r4 = r4.a(r6, r5, r7)     // Catch: java.lang.Throwable -> L3d
            goto L41
        L3d:
            r0 = move-exception
            goto La1
        L40:
            r4 = r3
        L41:
            if (r1 == 0) goto L45
            r5 = 1
            goto L46
        L45:
            r5 = 0
        L46:
            java.lang.String r6 = "Must call PhenotypeFlagInitializer.maybeInit() first"
            defpackage.fd9.L(r6, r5)     // Catch: java.lang.Throwable -> L3d
            bm7 r5 = r8.a     // Catch: java.lang.Throwable -> L3d
            r5.getClass()     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r5 = r8.c(r1)     // Catch: java.lang.Throwable -> L3d
            if (r5 == 0) goto L57
            goto L8c
        L57:
            bm7 r5 = r8.a     // Catch: java.lang.Throwable -> L3d
            boolean r6 = r5.a     // Catch: java.lang.Throwable -> L3d
            if (r6 != 0) goto L86
            android.content.Context r1 = r1.a     // Catch: java.lang.Throwable -> L3d
            epk r1 = defpackage.epk.A(r1)     // Catch: java.lang.Throwable -> L3d
            boolean r6 = r5.a     // Catch: java.lang.Throwable -> L3d
            if (r6 == 0) goto L69
            r6 = r3
            goto L7c
        L69:
            java.lang.Object r5 = r5.c     // Catch: java.lang.Throwable -> L3d
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L3d
            java.lang.String r6 = r8.b     // Catch: java.lang.Throwable -> L3d
            if (r5 == 0) goto L78
            boolean r7 = r5.isEmpty()     // Catch: java.lang.Throwable -> L3d
            if (r7 == 0) goto L78
            goto L7c
        L78:
            java.lang.String r6 = defpackage.kgh.o(r5, r6)     // Catch: java.lang.Throwable -> L3d
        L7c:
            java.lang.Object r1 = r1.b(r6)     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L86
            java.lang.Object r3 = r8.b(r1)     // Catch: java.lang.Throwable -> L3d
        L86:
            if (r3 == 0) goto L8a
            r5 = r3
            goto L8c
        L8a:
            java.lang.Object r5 = r8.c     // Catch: java.lang.Throwable -> L3d
        L8c:
            boolean r1 = r2.b()     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L9b
            if (r4 != 0) goto L97
            java.lang.Object r5 = r8.c     // Catch: java.lang.Throwable -> L3d
            goto L9b
        L97:
            java.lang.Object r5 = r8.b(r4)     // Catch: java.lang.Throwable -> L3d
        L9b:
            r8.e = r5     // Catch: java.lang.Throwable -> L3d
            r8.d = r0     // Catch: java.lang.Throwable -> L3d
        L9f:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3d
            goto La3
        La1:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3d
            throw r0
        La3:
            java.lang.Object r8 = r8.e
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqk.a():java.lang.Object");
    }

    public final Object b(Object obj) {
        int i2 = this.f;
        String strO = this.b;
        bm7 bm7Var = this.a;
        switch (i2) {
            case 0:
                if (obj instanceof Boolean) {
                    return (Boolean) obj;
                }
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (ylk.c.matcher(str).matches()) {
                        return Boolean.TRUE;
                    }
                    if (ylk.d.matcher(str).matches()) {
                        return Boolean.FALSE;
                    }
                }
                String str2 = (String) bm7Var.d;
                if (str2 == null || !str2.isEmpty()) {
                    strO = kgh.o(str2, strO);
                }
                Log.e("PhenotypeFlag", "Invalid boolean value for " + strO + ": " + String.valueOf(obj));
                return null;
            case 1:
                if (obj instanceof Long) {
                    return (Long) obj;
                }
                if (obj instanceof String) {
                    try {
                        return Long.valueOf(Long.parseLong((String) obj));
                    } catch (NumberFormatException unused) {
                    }
                }
                String str3 = (String) bm7Var.d;
                if (str3 == null || !str3.isEmpty()) {
                    strO = kgh.o(str3, strO);
                }
                Log.e("PhenotypeFlag", "Invalid long value for " + strO + ": " + String.valueOf(obj));
                return null;
            case 2:
                if (obj instanceof String) {
                    return (String) obj;
                }
                return null;
            default:
                if (obj instanceof Double) {
                    return (Double) obj;
                }
                if (obj instanceof Float) {
                    return Double.valueOf(((Float) obj).doubleValue());
                }
                if (obj instanceof String) {
                    try {
                        return Double.valueOf(Double.parseDouble((String) obj));
                    } catch (NumberFormatException unused2) {
                    }
                }
                String str4 = (String) bm7Var.d;
                if (str4 == null || !str4.isEmpty()) {
                    strO = kgh.o(str4, strO);
                }
                Log.e("PhenotypeFlag", "Invalid double value for " + strO + ": " + String.valueOf(obj));
                return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:19|(1:21)(7:22|(1:24)(1:25)|26|(0)|35|36|37)|30|59|31|32|(1:34)|35|36|37) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.bnk r10) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqk.c(bnk):java.lang.Object");
    }
}
