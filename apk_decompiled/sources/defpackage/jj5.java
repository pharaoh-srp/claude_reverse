package defpackage;

import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.db.ClaudeDatabase;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jj5 implements nkd {
    public final ClaudeDatabase a;
    public final bg9 b;
    public final zz8 c = new zz8();

    public jj5(ClaudeDatabase claudeDatabase, bg9 bg9Var) {
        this.a = claudeDatabase;
        this.b = bg9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // defpackage.nkd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.vp4 r14, java.lang.String r15, boolean r16) {
        /*
            r13 = this;
            r3 = r16
            boolean r4 = r14 instanceof defpackage.hj5
            if (r4 == 0) goto L16
            r4 = r14
            hj5 r4 = (defpackage.hj5) r4
            int r5 = r4.I
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L16
            int r5 = r5 - r6
            r4.I = r5
        L14:
            r7 = r4
            goto L1c
        L16:
            hj5 r4 = new hj5
            r4.<init>(r13, r14)
            goto L14
        L1c:
            java.lang.Object r0 = r7.G
            int r4 = r7.I
            r8 = 0
            iei r9 = defpackage.iei.a
            zz8 r5 = r13.c
            r10 = 2
            r6 = 1
            m45 r11 = defpackage.m45.E
            if (r4 == 0) goto L45
            if (r4 == r6) goto L3b
            if (r4 != r10) goto L35
            defpackage.sf5.h0(r0)     // Catch: java.lang.Exception -> L33 java.util.concurrent.CancellationException -> L80
            return r9
        L33:
            r0 = move-exception
            goto L74
        L35:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r0)
            return r8
        L3b:
            boolean r2 = r7.F
            java.lang.String r3 = r7.E
            defpackage.sf5.h0(r0)
            r4 = r3
            r3 = r2
            goto L55
        L45:
            defpackage.sf5.h0(r0)
            r7.E = r15
            r7.F = r3
            r7.I = r6
            r5.a(r7, r15, r3)
            if (r9 != r11) goto L54
            goto L72
        L54:
            r4 = r15
        L55:
            com.anthropic.claude.api.project.Project r2 = r5.b(r4)
            if (r2 != 0) goto L5c
            goto L73
        L5c:
            com.anthropic.claude.db.ClaudeDatabase r12 = r13.a     // Catch: java.lang.Exception -> L33 java.util.concurrent.CancellationException -> L80
            c53 r0 = new c53     // Catch: java.lang.Exception -> L33 java.util.concurrent.CancellationException -> L80
            r5 = 0
            r6 = 3
            r1 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L33 java.util.concurrent.CancellationException -> L80
            r7.E = r8     // Catch: java.lang.Exception -> L33 java.util.concurrent.CancellationException -> L80
            r7.F = r3     // Catch: java.lang.Exception -> L33 java.util.concurrent.CancellationException -> L80
            r7.I = r10     // Catch: java.lang.Exception -> L33 java.util.concurrent.CancellationException -> L80
            java.lang.Object r0 = defpackage.oq5.V(r12, r0, r7)     // Catch: java.lang.Exception -> L33 java.util.concurrent.CancellationException -> L80
            if (r0 != r11) goto L73
        L72:
            return r11
        L73:
            return r9
        L74:
            java.util.List r1 = defpackage.xah.a
            ozf r1 = defpackage.ozf.F
            r2 = 24
            java.lang.String r3 = "Failed to update starred project in DB"
            defpackage.xah.f(r0, r3, r1, r8, r2)
            return r9
        L80:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj5.a(vp4, java.lang.String, boolean):java.lang.Object");
    }

    @Override // defpackage.nkd
    public final Project b(String str) {
        str.getClass();
        return this.c.b(str);
    }

    @Override // defpackage.nkd
    public final void c(kmd kmdVar, List list, vp4 vp4Var) {
        this.c.c(kmdVar, list, vp4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        if (r9 == r6) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.nkd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r8, defpackage.tp4 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.dj5
            if (r0 == 0) goto L13
            r0 = r9
            dj5 r0 = (defpackage.dj5) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L1a
        L13:
            dj5 r0 = new dj5
            vp4 r9 = (defpackage.vp4) r9
            r0.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r0.E
            int r1 = r0.G
            zz8 r2 = r7.c
            r3 = 2
            r4 = 1
            r5 = 0
            m45 r6 = defpackage.m45.E
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L37
            if (r1 != r3) goto L31
            defpackage.sf5.h0(r9)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L83
            goto L74
        L2f:
            r7 = move-exception
            goto L77
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r5
        L37:
            defpackage.sf5.h0(r9)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L83
            goto L58
        L3b:
            defpackage.sf5.h0(r9)
            com.anthropic.claude.api.project.Project r9 = r2.b(r8)
            if (r9 == 0) goto L45
            return r9
        L45:
            com.anthropic.claude.db.ClaudeDatabase r9 = r7.a     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L83
            h62 r9 = r9.t()     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L83
            java.util.List r8 = defpackage.x44.W(r8)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L83
            r0.G = r4     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L83
            java.lang.Object r9 = r9.a(r8, r0)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L83
            if (r9 != r6) goto L58
            goto L73
        L58:
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L83
            bg9 r7 = r7.b     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L83
            java.util.ArrayList r7 = defpackage.cvj.n(r9, r7)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L83
            java.lang.Object r7 = defpackage.w44.N0(r7)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L83
            com.anthropic.claude.api.project.Project r7 = (com.anthropic.claude.api.project.Project) r7     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L83
            if (r7 != 0) goto L69
            return r5
        L69:
            r0.G = r3     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L83
            fj0 r8 = r2.a     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L83
            java.lang.Object r9 = r8.S(r7)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L83
            if (r9 != r6) goto L74
        L73:
            return r6
        L74:
            com.anthropic.claude.api.project.Project r9 = (com.anthropic.claude.api.project.Project) r9     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L83
            return r9
        L77:
            java.util.List r8 = defpackage.xah.a
            ozf r8 = defpackage.ozf.F
            r9 = 24
            java.lang.String r0 = "Failed to load cached project"
            defpackage.xah.f(r7, r0, r8, r5, r9)
            return r5
        L83:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj5.d(java.lang.String, tp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // defpackage.nkd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.kmd r14, java.util.List r15, defpackage.vp4 r16) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj5.e(kmd, java.util.List, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.nkd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.anthropic.claude.api.project.Project r9, defpackage.vp4 r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.ij5
            if (r0 == 0) goto L13
            r0 = r10
            ij5 r0 = (defpackage.ij5) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            ij5 r0 = new ij5
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.F
            int r1 = r0.H
            r2 = 0
            r3 = 2
            r4 = 1
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L39
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2f
            com.anthropic.claude.api.project.Project r8 = r0.E
            defpackage.sf5.h0(r10)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L85
            return r8
        L2d:
            r9 = move-exception
            goto L79
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r8)
            return r2
        L35:
            defpackage.sf5.h0(r10)
            goto L49
        L39:
            defpackage.sf5.h0(r10)
            r0.H = r4
            zz8 r10 = r8.c
            fj0 r10 = r10.a
            java.lang.Object r10 = r10.S(r9)
            if (r10 != r5) goto L49
            goto L71
        L49:
            r9 = r10
            com.anthropic.claude.api.project.Project r9 = (com.anthropic.claude.api.project.Project) r9
            com.anthropic.claude.db.ClaudeDatabase r10 = r8.a     // Catch: java.lang.Exception -> L77 java.util.concurrent.CancellationException -> L85
            h62 r10 = r10.t()     // Catch: java.lang.Exception -> L77 java.util.concurrent.CancellationException -> L85
            bg9 r8 = r8.b     // Catch: java.lang.Exception -> L77 java.util.concurrent.CancellationException -> L85
            g62 r8 = defpackage.cvj.m(r9, r8)     // Catch: java.lang.Exception -> L77 java.util.concurrent.CancellationException -> L85
            r0.E = r9     // Catch: java.lang.Exception -> L77 java.util.concurrent.CancellationException -> L85
            r0.H = r3     // Catch: java.lang.Exception -> L77 java.util.concurrent.CancellationException -> L85
            cve r1 = r10.a     // Catch: java.lang.Exception -> L77 java.util.concurrent.CancellationException -> L85
            l0 r3 = new l0     // Catch: java.lang.Exception -> L77 java.util.concurrent.CancellationException -> L85
            r6 = 27
            r3.<init>(r10, r6, r8)     // Catch: java.lang.Exception -> L77 java.util.concurrent.CancellationException -> L85
            r8 = 0
            java.lang.Object r8 = defpackage.u00.G(r0, r1, r8, r4, r3)     // Catch: java.lang.Exception -> L77 java.util.concurrent.CancellationException -> L85
            if (r8 != r5) goto L6d
            goto L6f
        L6d:
            iei r8 = defpackage.iei.a     // Catch: java.lang.Exception -> L77 java.util.concurrent.CancellationException -> L85
        L6f:
            if (r8 != r5) goto L72
        L71:
            return r5
        L72:
            return r9
        L73:
            r7 = r9
            r9 = r8
            r8 = r7
            goto L79
        L77:
            r8 = move-exception
            goto L73
        L79:
            java.util.List r10 = defpackage.xah.a
            ozf r10 = defpackage.ozf.F
            r0 = 24
            java.lang.String r1 = "Failed to persist project"
            defpackage.xah.f(r9, r1, r10, r2, r0)
            return r8
        L85:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj5.f(com.anthropic.claude.api.project.Project, vp4):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0194 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012a A[Catch: Exception -> 0x0046, CancellationException -> 0x0244, TryCatch #4 {Exception -> 0x0046, blocks: (B:15:0x0042, B:81:0x019a, B:84:0x01af, B:85:0x01ba, B:87:0x01c0, B:89:0x01d0, B:90:0x01d4, B:105:0x020d, B:106:0x0210, B:57:0x011a, B:59:0x012a, B:62:0x0130, B:107:0x0211, B:108:0x0218, B:32:0x007b, B:43:0x00b0, B:46:0x00ba, B:47:0x00cb, B:49:0x00d1, B:50:0x00e7, B:51:0x00f8, B:53:0x00fe, B:54:0x010c, B:40:0x0099), top: B:121:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0148 A[Catch: all -> 0x018d, TryCatch #8 {all -> 0x018d, blocks: (B:67:0x0142, B:69:0x0148, B:71:0x0168), top: B:128:0x0142 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [rcg] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v3, types: [kwb, rcg] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [kwb] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, rcg] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [kwb] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [kwb] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0186 -> B:75:0x0189). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0191 -> B:79:0x0192). Please report as a decompilation issue!!! */
    @Override // defpackage.nkd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.kmd r18, defpackage.tp4 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj5.g(kmd, tp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.nkd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.kmd r9, java.lang.String r10, defpackage.vp4 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.ej5
            if (r0 == 0) goto L13
            r0 = r11
            ej5 r0 = (defpackage.ej5) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            ej5 r0 = new ej5
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.G
            int r1 = r0.I
            r2 = 0
            r3 = 2
            r4 = 1
            iei r5 = defpackage.iei.a
            m45 r6 = defpackage.m45.E
            if (r1 == 0) goto L3f
            if (r1 == r4) goto L37
            if (r1 != r3) goto L31
            kmd r8 = r0.E
            defpackage.sf5.h0(r11)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L9e
            return r5
        L2f:
            r9 = move-exception
            goto L78
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r8)
            return r2
        L37:
            java.lang.String r10 = r0.F
            kmd r9 = r0.E
            defpackage.sf5.h0(r11)
            goto L50
        L3f:
            defpackage.sf5.h0(r11)
            r0.E = r9
            r0.F = r10
            r0.I = r4
            zz8 r11 = r8.c
            r11.h(r9, r10, r0)
            if (r5 != r6) goto L50
            goto L72
        L50:
            boolean r11 = r9.a()
            if (r11 != 0) goto L57
            goto L73
        L57:
            com.anthropic.claude.db.ClaudeDatabase r8 = r8.a     // Catch: java.lang.Exception -> L74 java.util.concurrent.CancellationException -> L9e
            imd r8 = r8.v()     // Catch: java.lang.Exception -> L74 java.util.concurrent.CancellationException -> L9e
            jmd r11 = new jmd     // Catch: java.lang.Exception -> L74 java.util.concurrent.CancellationException -> L9e
            r11.<init>(r9, r10)     // Catch: java.lang.Exception -> L74 java.util.concurrent.CancellationException -> L9e
            java.util.List r10 = defpackage.x44.W(r11)     // Catch: java.lang.Exception -> L74 java.util.concurrent.CancellationException -> L9e
            r0.E = r9     // Catch: java.lang.Exception -> L74 java.util.concurrent.CancellationException -> L9e
            r0.F = r2     // Catch: java.lang.Exception -> L74 java.util.concurrent.CancellationException -> L9e
            r0.I = r3     // Catch: java.lang.Exception -> L74 java.util.concurrent.CancellationException -> L9e
            java.lang.Object r8 = r8.d(r10, r0)     // Catch: java.lang.Exception -> L74 java.util.concurrent.CancellationException -> L9e
            if (r8 != r6) goto L73
        L72:
            return r6
        L73:
            return r5
        L74:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L78:
            java.util.List r10 = defpackage.xah.a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "persist prepend to "
            r10.<init>(r11)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Failed to "
            r10.<init>(r11)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            ozf r10 = defpackage.ozf.F
            r11 = 24
            defpackage.xah.f(r9, r8, r10, r2, r11)
            return r5
        L9e:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj5.h(kmd, java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.nkd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r8, defpackage.vp4 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.fj5
            if (r0 == 0) goto L13
            r0 = r9
            fj5 r0 = (defpackage.fj5) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            fj5 r0 = new fj5
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.F
            int r1 = r0.H
            r2 = 0
            iei r3 = defpackage.iei.a
            r4 = 2
            r5 = 1
            m45 r6 = defpackage.m45.E
            if (r1 == 0) goto L3b
            if (r1 == r5) goto L35
            if (r1 != r4) goto L2f
            defpackage.sf5.h0(r9)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L6b
            return r3
        L2d:
            r7 = move-exception
            goto L5f
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r2
        L35:
            java.lang.String r8 = r0.E
            defpackage.sf5.h0(r9)
            goto L4a
        L3b:
            defpackage.sf5.h0(r9)
            r0.E = r8
            r0.H = r5
            zz8 r9 = r7.c
            r9.i(r8, r0)
            if (r3 != r6) goto L4a
            goto L5d
        L4a:
            com.anthropic.claude.db.ClaudeDatabase r9 = r7.a     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L6b
            t74 r1 = new t74     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L6b
            r5 = 17
            r1.<init>(r7, r8, r2, r5)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L6b
            r0.E = r2     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L6b
            r0.H = r4     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L6b
            java.lang.Object r7 = defpackage.oq5.V(r9, r1, r0)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L6b
            if (r7 != r6) goto L5e
        L5d:
            return r6
        L5e:
            return r3
        L5f:
            java.util.List r8 = defpackage.xah.a
            ozf r8 = defpackage.ozf.F
            r9 = 24
            java.lang.String r0 = "Failed to delete project"
            defpackage.xah.f(r7, r0, r8, r2, r9)
            return r3
        L6b:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj5.i(java.lang.String, vp4):java.lang.Object");
    }

    @Override // defpackage.nkd
    public final kdg j(kmd kmdVar) {
        zz8 zz8Var = this.c;
        zz8Var.getClass();
        return zz8Var.k(kmdVar);
    }
}
