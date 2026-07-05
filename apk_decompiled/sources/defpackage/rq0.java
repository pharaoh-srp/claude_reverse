package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rq0 {
    public static final ide a = new ide("[/\\\\:*?\"<>|\\p{Cntrl}]");

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String a(defpackage.tp0 r3, android.content.Context r4) {
        /*
            r3.getClass()
            r4.getClass()
            com.anthropic.claude.artifact.model.ArtifactMetadata r3 = r3.b
            java.lang.String r0 = r3.getFileExtension()
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            java.lang.String r3 = r3.getTitle()
            if (r3 == 0) goto L27
            java.lang.String r3 = b(r3)
            if (r3 == 0) goto L27
            boolean r2 = defpackage.bsg.I0(r3)
            if (r2 == 0) goto L23
            goto L24
        L23:
            r1 = r3
        L24:
            if (r1 == 0) goto L27
            goto L31
        L27:
            r3 = 2131886144(0x7f120040, float:1.9406859E38)
            java.lang.String r1 = r4.getString(r3)
            r1.getClass()
        L31:
            java.lang.String r3 = "."
            java.lang.String r3 = defpackage.ij0.C(r1, r3, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rq0.a(tp0, android.content.Context):java.lang.String");
    }

    public static final String b(String str) {
        str.getClass();
        String strJ1 = bsg.j1(64, a.h(str, "_"));
        Character chM0 = bsg.M0(strJ1);
        if (chM0 != null && Character.isHighSurrogate(chM0.charValue())) {
            strJ1 = bsg.y0(1, strJ1);
        }
        int length = strJ1.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            char cCharAt = strJ1.charAt(!z ? i : length);
            boolean z2 = gb9.B(cCharAt) || cCharAt == '.';
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return strJ1.subSequence(i, length + 1).toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable c(android.content.Context r9, java.lang.String r10, java.lang.String r11, defpackage.h86 r12, defpackage.vp4 r13) throws java.lang.Throwable {
        /*
            boolean r0 = r13 instanceof defpackage.pq0
            if (r0 == 0) goto L13
            r0 = r13
            pq0 r0 = (defpackage.pq0) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            pq0 r0 = new pq0
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.G
            int r1 = r0.H
            r2 = 1
            r7 = 0
            if (r1 == 0) goto L31
            if (r1 != r2) goto L2a
            java.lang.String r11 = r0.F
            android.content.Context r9 = r0.E
            defpackage.sf5.h0(r13)
            goto L52
        L2a:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r9)
            r9 = 0
            return r9
        L31:
            defpackage.sf5.h0(r13)
            e45 r12 = r12.b()
            qq0 r3 = new qq0
            r8 = 0
            r4 = r9
            r6 = r10
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r0.E = r4
            r0.F = r5
            r0.H = r2
            java.lang.Object r13 = defpackage.gb9.c0(r12, r3, r0)
            m45 r9 = defpackage.m45.E
            if (r13 != r9) goto L50
            return r9
        L50:
            r9 = r4
            r11 = r5
        L52:
            java.io.File r13 = (java.io.File) r13
            if (r13 != 0) goto L59
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        L59:
            java.lang.String r10 = r9.getPackageName()     // Catch: java.lang.Throwable -> La3
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La3
            r12.<init>()     // Catch: java.lang.Throwable -> La3
            r12.append(r10)     // Catch: java.lang.Throwable -> La3
            java.lang.String r10 = ".provider"
            r12.append(r10)     // Catch: java.lang.Throwable -> La3
            java.lang.String r10 = r12.toString()     // Catch: java.lang.Throwable -> La3
            android.net.Uri r10 = androidx.core.content.FileProvider.d(r9, r10, r13)     // Catch: java.lang.Throwable -> La3
            android.content.Intent r12 = new android.content.Intent     // Catch: java.lang.Throwable -> La3
            java.lang.String r0 = "android.intent.action.SEND"
            r12.<init>(r0)     // Catch: java.lang.Throwable -> La3
            java.lang.String r0 = "text/plain"
            java.lang.String r11 = defpackage.ikb.c(r11, r0)     // Catch: java.lang.Throwable -> La3
            r12.setType(r11)     // Catch: java.lang.Throwable -> La3
            java.lang.String r11 = "android.intent.extra.STREAM"
            r12.putExtra(r11, r10)     // Catch: java.lang.Throwable -> La3
            java.lang.String r10 = "android.intent.extra.SUBJECT"
            java.lang.String r11 = defpackage.nk7.n0(r13)     // Catch: java.lang.Throwable -> La3
            r12.putExtra(r10, r11)     // Catch: java.lang.Throwable -> La3
            r12.addFlags(r2)     // Catch: java.lang.Throwable -> La3
            android.content.Intent r10 = android.content.Intent.createChooser(r12, r7)     // Catch: java.lang.Throwable -> La3
            r11 = 268435456(0x10000000, float:2.524355E-29)
            android.content.Intent r10 = r10.addFlags(r11)     // Catch: java.lang.Throwable -> La3
            r9.startActivity(r10)     // Catch: java.lang.Throwable -> La3
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> La3
            goto Lab
        La3:
            r0 = move-exception
            r9 = r0
            hre r10 = new hre
            r10.<init>(r9)
            r9 = r10
        Lab:
            java.lang.Throwable r10 = defpackage.jre.a(r9)
            if (r10 != 0) goto Lb2
            goto Lc3
        Lb2:
            boolean r9 = r10 instanceof java.util.concurrent.CancellationException
            if (r9 != 0) goto Lc4
            java.util.List r9 = defpackage.xah.a
            ozf r9 = defpackage.ozf.F
            r11 = 24
            java.lang.String r12 = "Failed to launch share sheet for exported artifact"
            defpackage.xah.f(r10, r12, r9, r7, r11)
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
        Lc3:
            return r9
        Lc4:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rq0.c(android.content.Context, java.lang.String, java.lang.String, h86, vp4):java.io.Serializable");
    }
}
