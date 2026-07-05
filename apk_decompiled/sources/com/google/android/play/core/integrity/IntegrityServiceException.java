package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.ApiException;

/* JADX INFO: loaded from: classes3.dex */
public class IntegrityServiceException extends ApiException {
    public final Throwable F;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public IntegrityServiceException(int r6, java.lang.Exception r7) {
        /*
            r5 = this;
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.util.Locale r1 = java.util.Locale.ROOT
            java.util.HashMap r1 = defpackage.clj.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            boolean r3 = r1.containsKey(r2)
            if (r3 == 0) goto L2e
            java.util.HashMap r3 = defpackage.clj.b
            boolean r4 = r3.containsKey(r2)
            if (r4 != 0) goto L19
            goto L2e
        L19:
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = " (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/IntegrityErrorCode.html#"
            java.lang.String r4 = ")"
            java.lang.String r1 = defpackage.kgh.p(r1, r3, r2, r4)
            goto L30
        L2e:
            java.lang.String r1 = ""
        L30:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Integrity API error ("
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r3 = "): "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r2 = 0
            r0.<init>(r6, r1, r2, r2)
            r5.<init>(r0)
            if (r6 == 0) goto L57
            r5.F = r7
            return
        L57:
            java.lang.String r5 = "ErrorCode should not be 0."
            defpackage.sz6.p(r5)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.IntegrityServiceException.<init>(int, java.lang.Exception):void");
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.F;
    }
}
