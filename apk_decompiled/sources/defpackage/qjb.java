package defpackage;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class qjb {
    public static final Logger a = Logger.getLogger(qjb.class.getName());

    /* JADX WARN: Removed duplicated region for block: B:40:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List a(java.io.InputStream r8) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "Error closing input stream (ignored)"
            java.util.logging.Logger r1 = defpackage.qjb.a
            if (r8 != 0) goto Lb
            java.util.List r8 = java.util.Collections.EMPTY_LIST
            java.util.List r8 = (java.util.List) r8
            return r8
        Lb:
            r2 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4d
            r3.<init>(r8)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4d
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            r2.<init>()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            int r4 = r3.readInt()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            r5 = 0
        L1b:
            if (r5 >= r4) goto L2b
            n2d r6 = new n2d     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            r6.<init>()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            r6.readExternal(r3)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            r2.add(r6)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            int r5 = r5 + 1
            goto L1b
        L2b:
            boolean r4 = r2.isEmpty()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            if (r4 != 0) goto L3c
            r3.close()     // Catch: java.io.IOException -> L35
            return r2
        L35:
            r8 = move-exception
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            r1.log(r3, r0, r8)
            return r2
        L3c:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            java.lang.String r4 = "Empty metadata"
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            throw r2     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
        L44:
            r2 = move-exception
            goto L59
        L46:
            r2 = move-exception
            goto L51
        L48:
            r3 = move-exception
            r7 = r3
            r3 = r2
            r2 = r7
            goto L59
        L4d:
            r3 = move-exception
            r7 = r3
            r3 = r2
            r2 = r7
        L51:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L44
            java.lang.String r5 = "Unable to parse metadata file"
            r4.<init>(r5, r2)     // Catch: java.lang.Throwable -> L44
            throw r4     // Catch: java.lang.Throwable -> L44
        L59:
            if (r3 == 0) goto L66
            r3.close()     // Catch: java.io.IOException -> L5f
            goto L70
        L5f:
            r8 = move-exception
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            r1.log(r3, r0, r8)
            goto L70
        L66:
            r8.close()     // Catch: java.io.IOException -> L6a
            goto L70
        L6a:
            r8 = move-exception
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            r1.log(r3, r0, r8)
        L70:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qjb.a(java.io.InputStream):java.util.List");
    }
}
