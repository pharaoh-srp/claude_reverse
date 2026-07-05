package defpackage;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes.dex */
public final class se8 implements Closeable {
    public final HttpURLConnection E;
    public final InputStream F;
    public final OutputStream G;
    public final /* synthetic */ int H;

    public se8(HttpURLConnection httpURLConnection, InputStream inputStream, OutputStream outputStream, int i) {
        this.H = i;
        this.E = httpURLConnection;
        this.F = inputStream;
        this.G = outputStream;
    }

    public final void c() {
        this.E.disconnect();
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0039: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:20:0x0039 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0046 A[Catch: all -> 0x004a, PHI: r4 r5
      0x0046: PHI (r4v8 java.lang.String) = (r4v6 java.lang.String), (r4v13 java.lang.String) binds: [B:36:0x0061, B:28:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x0046: PHI (r5v6 java.io.InputStream) = (r5v4 java.io.InputStream), (r5v7 java.io.InputStream) binds: [B:36:0x0061, B:28:0x0044] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x004a, blocks: (B:5:0x000b, B:29:0x0046, B:38:0x0064, B:39:0x0077, B:41:0x007a, B:42:0x007d), top: B:58:0x000b }] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r9 = this;
            int r0 = r9.H
            switch(r0) {
                case 0: goto L90;
                default: goto L5;
            }
        L5:
            java.io.OutputStream r0 = r9.G
            java.net.HttpURLConnection r1 = r9.E
            java.lang.String r2 = "Could not read response body for rejected message: "
            int r3 = r1.getResponseCode()     // Catch: java.lang.Throwable -> L4a
            r4 = 300(0x12c, float:4.2E-43)
            if (r3 < r4) goto L7e
            r4 = 0
            java.io.InputStream r5 = r1.getInputStream()     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            goto L1f
        L19:
            r1 = move-exception
            goto L78
        L1b:
            java.io.InputStream r5 = r1.getErrorStream()     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L4c
        L1f:
            if (r5 == 0) goto L44
            java.nio.charset.Charset r4 = defpackage.dj2.a     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            r6.<init>(r5, r4)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            r7 = 8192(0x2000, float:1.148E-41)
            r4.<init>(r6, r7)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            java.lang.String r6 = defpackage.d4c.g0(r4)     // Catch: java.lang.Throwable -> L3d
            r4.close()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            r4 = r6
            goto L44
        L38:
            r1 = move-exception
            r4 = r5
            goto L78
        L3b:
            r4 = move-exception
            goto L50
        L3d:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L3f
        L3f:
            r7 = move-exception
            defpackage.wd6.Z(r4, r6)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
            throw r7     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3b
        L44:
            if (r5 == 0) goto L64
        L46:
            r5.close()     // Catch: java.lang.Throwable -> L4a
            goto L64
        L4a:
            r1 = move-exception
            goto L87
        L4c:
            r5 = move-exception
            r8 = r5
            r5 = r4
            r4 = r8
        L50:
            yw r6 = defpackage.gx.Companion     // Catch: java.lang.Throwable -> L38
            defpackage.bjk.f(r6, r4)     // Catch: java.lang.Throwable -> L38
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L38
            r6.append(r4)     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L38
            if (r5 == 0) goto L64
            goto L46
        L64:
            com.segment.analytics.kotlin.core.HTTPException r2 = new com.segment.analytics.kotlin.core.HTTPException     // Catch: java.lang.Throwable -> L4a
            java.lang.String r5 = r1.getResponseMessage()     // Catch: java.lang.Throwable -> L4a
            r5.getClass()     // Catch: java.lang.Throwable -> L4a
            java.util.Map r1 = r1.getHeaderFields()     // Catch: java.lang.Throwable -> L4a
            r1.getClass()     // Catch: java.lang.Throwable -> L4a
            r2.<init>(r3, r5, r4, r1)     // Catch: java.lang.Throwable -> L4a
            throw r2     // Catch: java.lang.Throwable -> L4a
        L78:
            if (r4 == 0) goto L7d
            r4.close()     // Catch: java.lang.Throwable -> L4a
        L7d:
            throw r1     // Catch: java.lang.Throwable -> L4a
        L7e:
            r9.c()
            if (r0 == 0) goto L86
            r0.close()
        L86:
            return
        L87:
            r9.c()
            if (r0 == 0) goto L8f
            r0.close()
        L8f:
            throw r1
        L90:
            r9.c()
            java.io.InputStream r9 = r9.F
            if (r9 == 0) goto L9a
            r9.close()
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.se8.close():void");
    }
}
