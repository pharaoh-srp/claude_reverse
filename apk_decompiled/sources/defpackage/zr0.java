package defpackage;

import android.content.Context;
import com.anthropic.claude.R;
import com.anthropic.claude.artifact.model.ArtifactMetadata;
import com.anthropic.claude.artifact.model.ArtifactType;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zr0 {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(java.io.File r5, defpackage.h86 r6, defpackage.vp4 r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof defpackage.vr0
            if (r0 == 0) goto L13
            r0 = r7
            vr0 r0 = (defpackage.vr0) r0
            int r1 = r0.F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.F = r1
            goto L18
        L13:
            vr0 r0 = new vr0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.E
            int r1 = r0.F
            iei r2 = defpackage.iei.a
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            defpackage.sf5.h0(r7)
            return r2
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return r4
        L2e:
            defpackage.sf5.h0(r7)
            if (r5 != 0) goto L34
            goto L53
        L34:
            e45 r6 = r6.b()
            b6c r7 = defpackage.b6c.F
            r6.getClass()
            c45 r6 = defpackage.nai.Z(r6, r7)
            g9 r7 = new g9
            r1 = 10
            r7.<init>(r5, r4, r1)
            r0.F = r3
            java.lang.Object r5 = defpackage.gb9.c0(r6, r7, r0)
            m45 r6 = defpackage.m45.E
            if (r5 != r6) goto L53
            return r6
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr0.a(java.io.File, h86, vp4):java.lang.Object");
    }

    public static final boolean b(ArtifactType artifactType) {
        if (x44.r(artifactType, ArtifactType.Text.INSTANCE) || x44.r(artifactType, ArtifactType.Markdown.INSTANCE) || x44.r(artifactType, ArtifactType.Svg.INSTANCE) || x44.r(artifactType, ArtifactType.Code.INSTANCE) || x44.r(artifactType, ArtifactType.Repl.INSTANCE)) {
            return true;
        }
        if (x44.r(artifactType, ArtifactType.Html.INSTANCE) || x44.r(artifactType, ArtifactType.React.INSTANCE) || x44.r(artifactType, ArtifactType.Mermaid.INSTANCE) || (artifactType instanceof ArtifactType.BinaryDocument) || artifactType == null) {
            return false;
        }
        wg6.i();
        return false;
    }

    public static final String c(tp0 tp0Var, Context context) {
        String strB;
        CharSequence charSequenceSubSequence;
        tp0Var.getClass();
        context.getClass();
        ArtifactMetadata artifactMetadata = tp0Var.b;
        String title = artifactMetadata.getTitle();
        String fileExtension = artifactMetadata.getFileExtension();
        String string = context.getString(R.string.artifact_default_title);
        string.getClass();
        if (title != null && (strB = rq0.b(title)) != null) {
            if (fileExtension == null || bsg.I0(fileExtension)) {
                fileExtension = null;
            }
            if (fileExtension != null && isg.h0(strB, ".".concat(fileExtension), true)) {
                String strY0 = bsg.y0(fileExtension.length() + 1, strB);
                int length = strY0.length() - 1;
                if (length >= 0) {
                    while (true) {
                        int i = length - 1;
                        char cCharAt = strY0.charAt(length);
                        if (!gb9.B(cCharAt) && cCharAt != '.') {
                            charSequenceSubSequence = strY0.subSequence(0, length + 1);
                            break;
                        }
                        if (i < 0) {
                            break;
                        }
                        length = i;
                    }
                    charSequenceSubSequence = "";
                    strB = charSequenceSubSequence.toString();
                } else {
                    charSequenceSubSequence = "";
                    strB = charSequenceSubSequence.toString();
                }
            }
            if (strB != null) {
                String str = bsg.I0(strB) ? null : strB;
                if (str != null) {
                    string = str;
                }
            }
        }
        return string.concat(".pdf");
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0152, code lost:
    
        if (a(r0, r8, r9) != r15) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0110 A[Catch: all -> 0x0092, CancellationException -> 0x0096, TRY_LEAVE, TryCatch #11 {CancellationException -> 0x0096, all -> 0x0092, blocks: (B:60:0x0107, B:63:0x0110, B:37:0x008d), top: B:90:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0175 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(android.content.Context r16, defpackage.tp0 r17, defpackage.h86 r18, defpackage.vp4 r19) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr0.d(android.content.Context, tp0, h86, vp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        if (defpackage.gb9.c0(r12, r1, r0) == r6) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0091, code lost:
    
        if (a(r10, r11, r0) == r6) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(android.content.Context r9, defpackage.tp0 r10, defpackage.h86 r11, defpackage.vp4 r12) {
        /*
            boolean r0 = r12 instanceof defpackage.xr0
            if (r0 == 0) goto L13
            r0 = r12
            xr0 r0 = (defpackage.xr0) r0
            int r1 = r0.J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.J = r1
            goto L18
        L13:
            xr0 r0 = new xr0
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.I
            int r1 = r0.J
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            m45 r6 = defpackage.m45.E
            if (r1 == 0) goto L4c
            if (r1 == r4) goto L44
            if (r1 == r3) goto L36
            if (r1 != r2) goto L30
            java.lang.Throwable r9 = r0.H
            defpackage.sf5.h0(r12)
            goto L94
        L30:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r9)
            return r5
        L36:
            java.io.File r9 = r0.G
            h86 r10 = r0.F
            defpackage.sf5.h0(r12)     // Catch: java.lang.Throwable -> L3e java.util.concurrent.CancellationException -> La5
            goto La0
        L3e:
            r11 = move-exception
            r8 = r10
            r10 = r9
            r9 = r11
            r11 = r8
            goto L7f
        L44:
            h86 r11 = r0.F
            android.content.Context r9 = r0.E
            defpackage.sf5.h0(r12)
            goto L5c
        L4c:
            defpackage.sf5.h0(r12)
            r0.E = r9
            r0.F = r11
            r0.J = r4
            java.lang.Object r12 = d(r9, r10, r11, r0)
            if (r12 != r6) goto L5c
            goto L93
        L5c:
            r10 = r12
            java.io.File r10 = (java.io.File) r10
            if (r10 != 0) goto L64
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        L64:
            e45 r12 = r11.a()     // Catch: java.lang.Throwable -> L7e java.util.concurrent.CancellationException -> La5
            g9 r1 = new g9     // Catch: java.lang.Throwable -> L7e java.util.concurrent.CancellationException -> La5
            r7 = 11
            r1.<init>(r9, r10, r5, r7)     // Catch: java.lang.Throwable -> L7e java.util.concurrent.CancellationException -> La5
            r0.E = r5     // Catch: java.lang.Throwable -> L7e java.util.concurrent.CancellationException -> La5
            r0.F = r11     // Catch: java.lang.Throwable -> L7e java.util.concurrent.CancellationException -> La5
            r0.G = r10     // Catch: java.lang.Throwable -> L7e java.util.concurrent.CancellationException -> La5
            r0.J = r3     // Catch: java.lang.Throwable -> L7e java.util.concurrent.CancellationException -> La5
            java.lang.Object r9 = defpackage.gb9.c0(r12, r1, r0)     // Catch: java.lang.Throwable -> L7e java.util.concurrent.CancellationException -> La5
            if (r9 != r6) goto La0
            goto L93
        L7e:
            r9 = move-exception
        L7f:
            java.io.File r10 = r10.getParentFile()
            r0.E = r5
            r0.F = r5
            r0.G = r5
            r0.H = r9
            r0.J = r2
            java.lang.Object r10 = a(r10, r11, r0)
            if (r10 != r6) goto L94
        L93:
            return r6
        L94:
            java.util.List r10 = defpackage.xah.a
            ozf r10 = defpackage.ozf.F
            r11 = 24
            java.lang.String r12 = "Failed to launch share sheet for artifact PDF"
            defpackage.xah.f(r9, r12, r10, r5, r11)
            r4 = 0
        La0:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r4)
            return r9
        La5:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr0.e(android.content.Context, tp0, h86, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(android.content.Context r11, defpackage.tp0 r12, android.net.Uri r13, defpackage.h86 r14, defpackage.vp4 r15) throws java.lang.Throwable {
        /*
            boolean r0 = r15 instanceof defpackage.yr0
            if (r0 == 0) goto L13
            r0 = r15
            yr0 r0 = (defpackage.yr0) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            yr0 r0 = new yr0
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.H
            int r1 = r0.I
            r2 = 2
            r3 = 1
            m45 r4 = defpackage.m45.E
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            defpackage.sf5.h0(r15)
            return r15
        L2a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r11)
            r11 = 0
            return r11
        L31:
            h86 r14 = r0.G
            android.net.Uri r13 = r0.F
            android.content.Context r11 = r0.E
            defpackage.sf5.h0(r15)
        L3a:
            r7 = r11
            r8 = r13
            goto L4f
        L3d:
            defpackage.sf5.h0(r15)
            r0.E = r11
            r0.F = r13
            r0.G = r14
            r0.I = r3
            java.lang.Object r15 = d(r11, r12, r14, r0)
            if (r15 != r4) goto L3a
            goto L70
        L4f:
            r6 = r15
            java.io.File r6 = (java.io.File) r6
            if (r6 != 0) goto L57
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        L57:
            e45 r11 = r14.b()
            qq0 r5 = new qq0
            r10 = 3
            r9 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r0.E = r9
            r0.F = r9
            r0.G = r9
            r0.I = r2
            java.lang.Object r11 = defpackage.gb9.c0(r11, r5, r0)
            if (r11 != r4) goto L71
        L70:
            return r4
        L71:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr0.f(android.content.Context, tp0, android.net.Uri, h86, vp4):java.lang.Object");
    }
}
