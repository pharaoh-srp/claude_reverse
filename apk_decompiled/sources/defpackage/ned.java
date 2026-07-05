package defpackage;

import android.net.Uri;
import com.anthropic.claude.api.chat.MessageBlobFile;
import com.anthropic.claude.core.telemetry.SilentException;

/* JADX INFO: loaded from: classes.dex */
public final class ned {
    public final hdc a;
    public final ze0 b;
    public final koi c;
    public final h86 d;
    public final led e;

    public ned(hdc hdcVar, ze0 ze0Var, koi koiVar, h86 h86Var, led ledVar) {
        this.a = hdcVar;
        this.b = ze0Var;
        this.c = koiVar;
        this.d = h86Var;
        this.e = ledVar;
    }

    public final String a(MessageBlobFile messageBlobFile, ej7 ej7Var) {
        messageBlobFile.getClass();
        ej7Var.getClass();
        String strC = ij0.C(this.b.a(), "/api/organizations/", this.c.e);
        String path = messageBlobFile.getPath();
        if (path == null) {
            return kgh.p(strC, "/files/", messageBlobFile.mo236getFile_uuidExWXDbg(), "/contents");
        }
        if (!(ej7Var instanceof cj7)) {
            if (ej7Var.equals(dj7.a)) {
                SilentException.a(new SilentException(ij0.i("Preview: wiggle blob on non-chat surface, file_uuid=", messageBlobFile.mo236getFile_uuidExWXDbg())), ozf.F, false, 2);
                return null;
            }
            mr9.b();
            return null;
        }
        return Uri.parse(strC + "/conversations/" + ((cj7) ej7Var).a() + "/wiggle/download-file").buildUpon().appendQueryParameter("path", path).build().toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ej7 r12, com.anthropic.claude.api.chat.MessageBlobFile r13, defpackage.vp4 r14) {
        /*
            r11 = this;
            led r0 = r11.e
            fj0 r1 = r0.a
            boolean r0 = r14 instanceof defpackage.med
            if (r0 == 0) goto L17
            r0 = r14
            med r0 = (defpackage.med) r0
            int r2 = r0.H
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r0.H = r2
            goto L1c
        L17:
            med r0 = new med
            r0.<init>(r11, r14)
        L1c:
            java.lang.Object r14 = r0.F
            int r2 = r0.H
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L30
            com.anthropic.claude.api.chat.MessageBlobFile r13 = r0.E
            defpackage.sf5.h0(r14)     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> Lc1
            goto L8e
        L2c:
            r0 = move-exception
        L2d:
            r11 = r0
            goto L99
        L30:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r11)
            return r4
        L36:
            defpackage.sf5.h0(r14)
            java.lang.String r14 = r13.mo236getFile_uuidExWXDbg()
            r14.getClass()
            com.anthropic.claude.types.strings.FileId r14 = com.anthropic.claude.types.strings.FileId.m1014boximpl(r14)
            java.lang.Object r2 = r1.G
            mdg r2 = (defpackage.mdg) r2
            java.lang.Object r14 = r2.get(r14)
            ged r14 = (defpackage.ged) r14
            if (r14 == 0) goto L55
            java.lang.String r14 = r14.a()
            goto L56
        L55:
            r14 = r4
        L56:
            if (r14 == 0) goto L59
            return r14
        L59:
            java.lang.Long r9 = r13.getSize_bytes()
            if (r9 == 0) goto L6b
            long r5 = r9.longValue()
            r7 = 2000000(0x1e8480, double:9.881313E-318)
            int r14 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r14 <= 0) goto L6b
            goto L71
        L6b:
            java.lang.String r7 = r11.a(r13, r12)
            if (r7 != 0) goto L72
        L71:
            return r4
        L72:
            h86 r12 = r11.d     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc1
            e45 r12 = r12.b()     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc1
            qq0 r5 = new qq0     // Catch: java.lang.Exception -> L96 java.util.concurrent.CancellationException -> Lc1
            r10 = 0
            r6 = r11
            r8 = r13
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L92 java.util.concurrent.CancellationException -> Lc1
            r0.E = r8     // Catch: java.lang.Exception -> L92 java.util.concurrent.CancellationException -> Lc1
            r0.H = r3     // Catch: java.lang.Exception -> L92 java.util.concurrent.CancellationException -> Lc1
            java.lang.Object r14 = defpackage.gb9.c0(r12, r5, r0)     // Catch: java.lang.Exception -> L92 java.util.concurrent.CancellationException -> Lc1
            m45 r11 = defpackage.m45.E
            if (r14 != r11) goto L8d
            return r11
        L8d:
            r13 = r8
        L8e:
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> Lc1
            r4 = r14
            goto Laf
        L92:
            r0 = move-exception
            r11 = r0
            r13 = r8
            goto L99
        L96:
            r0 = move-exception
            r8 = r13
            goto L2d
        L99:
            com.anthropic.claude.core.telemetry.SilentException r12 = new com.anthropic.claude.core.telemetry.SilentException
            java.lang.String r14 = r13.mo236getFile_uuidExWXDbg()
            java.lang.String r0 = "Preview fetch exception: file_uuid="
            java.lang.String r14 = defpackage.ij0.i(r0, r14)
            r12.<init>(r14, r11)
            r11 = 0
            r14 = 2
            ozf r0 = defpackage.ozf.F
            com.anthropic.claude.core.telemetry.SilentException.a(r12, r0, r11, r14)
        Laf:
            if (r4 == 0) goto Lc0
            java.lang.String r11 = r13.mo236getFile_uuidExWXDbg()
            r11.getClass()
            ged r12 = new ged
            r12.<init>(r11, r4)
            r1.S(r12)
        Lc0:
            return r4
        Lc1:
            r0 = move-exception
            r11 = r0
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ned.b(ej7, com.anthropic.claude.api.chat.MessageBlobFile, vp4):java.lang.Object");
    }
}
