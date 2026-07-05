package defpackage;

import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.db.ClaudeDatabase;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bj5 implements hq4 {
    public final bg9 a;
    public final h86 b;
    public final el5 c;
    public final boolean d = true;
    public volatile boolean e;

    public bj5(ClaudeDatabase claudeDatabase, bg9 bg9Var, h86 h86Var) {
        this.a = bg9Var;
        this.b = h86Var;
        this.c = new el5(claudeDatabase);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x00d7: MOVE (r8 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:50:0x00d7 */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b A[Catch: all -> 0x003a, TryCatch #6 {all -> 0x003a, blocks: (B:13:0x0036, B:40:0x0095, B:42:0x009b, B:44:0x00ad), top: B:75:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [kwb] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(defpackage.bj5 r13, defpackage.kq4 r14, defpackage.vp4 r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj5.w(bj5, kq4, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // defpackage.hq4, defpackage.iib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r14, defpackage.d8a r15, java.lang.String r16, defpackage.tp4 r17) throws java.lang.Throwable {
        /*
            r13 = this;
            r0 = r17
            boolean r1 = r0 instanceof defpackage.pi5
            if (r1 == 0) goto L16
            r1 = r0
            pi5 r1 = (defpackage.pi5) r1
            int r2 = r1.I
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r2 & r4
            if (r5 == 0) goto L16
            int r2 = r2 - r4
            r1.I = r2
        L14:
            r7 = r1
            goto L1e
        L16:
            pi5 r1 = new pi5
            vp4 r0 = (defpackage.vp4) r0
            r1.<init>(r13, r0)
            goto L14
        L1e:
            java.lang.Object r0 = r7.G
            int r1 = r7.I
            r8 = 2
            r6 = 1
            iei r9 = defpackage.iei.a
            r4 = 0
            m45 r10 = defpackage.m45.E
            if (r1 == 0) goto L46
            if (r1 == r6) goto L3a
            if (r1 != r8) goto L33
            defpackage.sf5.h0(r0)
            return r9
        L33:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r0)
            r0 = 0
            return r0
        L3a:
            java.lang.String r1 = r7.F
            java.lang.String r2 = r7.E
            defpackage.sf5.h0(r0)
            r12 = r2
            r2 = r1
            r1 = r12
            r12 = r4
            goto L78
        L46:
            defpackage.sf5.h0(r0)
            com.anthropic.claude.api.chat.ChatConversationWithProjectReference r0 = r13.t(r14)
            if (r0 != 0) goto L50
            goto L93
        L50:
            boolean r0 = r0.is_temporary()
            if (r0 == 0) goto L57
            goto L93
        L57:
            h86 r0 = r13.b
            e45 r11 = r0.getDefault()
            si5 r0 = new si5
            r5 = 0
            r3 = r13
            r2 = r14
            r1 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r12 = r4
            r7.E = r14
            r1 = r16
            r7.F = r1
            r7.I = r6
            java.lang.Object r0 = defpackage.gb9.c0(r11, r0, r7)
            if (r0 != r10) goto L76
            goto L92
        L76:
            r2 = r1
            r1 = r14
        L78:
            r4 = r0
            java.util.List r4 = (java.util.List) r4
            b9 r0 = new b9
            r5 = 0
            r6 = 16
            r3 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.E = r12
            r7.F = r12
            r7.I = r8
            el5 r1 = r13.c
            java.lang.Object r0 = r1.K(r0, r7)
            if (r0 != r10) goto L93
        L92:
            return r10
        L93:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj5.a(java.lang.String, d8a, java.lang.String, tp4):java.lang.Object");
    }

    @Override // defpackage.hq4
    public final kdg b(ft2 ft2Var) {
        ft2Var.getClass();
        xz8 xz8Var = (xz8) this.c.I;
        xz8Var.getClass();
        return xz8Var.w(ft2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2 A[PHI: r0 r2
      0x00a2: PHI (r0v9 java.lang.Object) = (r0v7 java.lang.Object), (r0v0 java.lang.Object) binds: [B:34:0x009f, B:18:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r2v10 java.lang.String) = (r2v7 java.lang.String), (r2v15 java.lang.String) binds: [B:34:0x009f, B:18:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // defpackage.hq4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r13, java.util.List r14, defpackage.vp4 r15) throws java.lang.Throwable {
        /*
            r12 = this;
            iei r6 = defpackage.iei.a
            boolean r2 = r15 instanceof defpackage.aj5
            if (r2 == 0) goto L16
            r2 = r15
            aj5 r2 = (defpackage.aj5) r2
            int r3 = r2.I
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.I = r3
        L14:
            r7 = r2
            goto L1c
        L16:
            aj5 r2 = new aj5
            r2.<init>(r12, r15)
            goto L14
        L1c:
            java.lang.Object r0 = r7.G
            m45 r8 = defpackage.m45.E
            int r2 = r7.I
            r9 = 3
            r10 = 2
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L51
            if (r2 == r3) goto L47
            if (r2 == r10) goto L3d
            if (r2 != r9) goto L36
            java.util.List r1 = r7.F
            java.util.List r1 = (java.util.List) r1
            defpackage.sf5.h0(r0)
            return r6
        L36:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r0)
            r0 = 0
            return r0
        L3d:
            java.util.List r2 = r7.F
            java.util.List r2 = (java.util.List) r2
            java.lang.String r2 = r7.E
            defpackage.sf5.h0(r0)
            goto La2
        L47:
            java.util.List r2 = r7.F
            java.util.List r2 = (java.util.List) r2
            java.lang.String r3 = r7.E
            defpackage.sf5.h0(r0)
            goto L71
        L51:
            defpackage.sf5.h0(r0)
            boolean r0 = r12.e
            if (r0 != 0) goto L74
            el5 r0 = r12.c
            oi5 r2 = new oi5
            r2.<init>(r12, r4, r3)
            r7.E = r13
            r11 = r14
            java.util.List r11 = (java.util.List) r11
            r7.F = r11
            r7.I = r3
            java.lang.Object r0 = r0.K(r2, r7)
            if (r0 != r8) goto L6f
            goto Lba
        L6f:
            r3 = r13
            r2 = r14
        L71:
            r0 = r2
            r2 = r3
            goto L76
        L74:
            r2 = r13
            r0 = r14
        L76:
            boolean r3 = r12.e
            if (r3 == 0) goto L87
            el5 r3 = r12.c
            java.lang.Object r3 = r3.I
            xz8 r3 = (defpackage.xz8) r3
            boolean r3 = r3.o(r2)
            if (r3 != 0) goto L87
            goto Lbb
        L87:
            h86 r3 = r12.b
            e45 r11 = r3.getDefault()
            r1 = r0
            si5 r0 = new si5
            r5 = 2
            r3 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r7.E = r2
            r7.F = r4
            r7.I = r10
            java.lang.Object r0 = defpackage.gb9.c0(r11, r0, r7)
            if (r0 != r8) goto La2
            goto Lba
        La2:
            r3 = r0
            java.util.List r3 = (java.util.List) r3
            el5 r10 = r12.c
            mt4 r0 = new mt4
            r5 = 5
            r1 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r7.E = r4
            r7.F = r4
            r7.I = r9
            java.lang.Object r0 = r10.K(r0, r7)
            if (r0 != r8) goto Lbb
        Lba:
            return r8
        Lbb:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj5.c(java.lang.String, java.util.List, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.hq4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r5, defpackage.vp4 r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.vi5
            if (r0 == 0) goto L13
            r0 = r6
            vi5 r0 = (defpackage.vi5) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            vi5 r0 = new vi5
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.sf5.h0(r6)
            goto L41
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L2c:
            defpackage.sf5.h0(r6)
            wi5 r6 = new wi5
            r6.<init>(r5, r2)
            r0.G = r3
            el5 r4 = r4.c
            java.lang.Object r4 = r4.K(r6, r0)
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L41
            return r5
        L41:
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj5.d(java.lang.String, vp4):java.lang.Object");
    }

    @Override // defpackage.hq4
    public final Object e(ft2 ft2Var, List list, boolean z, vp4 vp4Var) {
        return this.c.K(new yi5(ft2Var, list, z, this, null), vp4Var);
    }

    @Override // defpackage.hq4
    public final Object f(ft2 ft2Var, String str, vp4 vp4Var) throws Throwable {
        Object objK = this.c.K(new w14(ft2Var, str, (tp4) null, 18), vp4Var);
        return objK == m45.E ? objK : iei.a;
    }

    @Override // defpackage.hq4
    public final Object g(ChatConversationWithProjectReference chatConversationWithProjectReference, boolean z, vp4 vp4Var) {
        return this.c.K(new c53(chatConversationWithProjectReference, z, this, (tp4) null), vp4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.hq4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.util.Set r5, defpackage.vp4 r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.xi5
            if (r0 == 0) goto L13
            r0 = r6
            xi5 r0 = (defpackage.xi5) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            xi5 r0 = new xi5
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.sf5.h0(r6)
            goto L43
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L2c:
            defpackage.sf5.h0(r6)
            ed3 r6 = new ed3
            r1 = 25
            r6.<init>(r5, r2, r1)
            r0.G = r3
            el5 r4 = r4.c
            java.lang.Object r4 = r4.K(r6, r0)
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L43
            return r5
        L43:
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj5.h(java.util.Set, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.hq4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.vp4 r5, java.lang.String r6, boolean r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.zi5
            if (r0 == 0) goto L13
            r0 = r5
            zi5 r0 = (defpackage.zi5) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            zi5 r0 = new zi5
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.sf5.h0(r5)
            goto L41
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L2c:
            defpackage.sf5.h0(r5)
            eq r5 = new eq
            r5.<init>(r6, r7, r4, r2)
            r0.G = r3
            el5 r4 = r4.c
            java.lang.Object r4 = r4.K(r5, r0)
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L41
            return r5
        L41:
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj5.i(vp4, java.lang.String, boolean):java.lang.Object");
    }

    @Override // defpackage.hq4
    public final Object j(List list, tp4 tp4Var) throws Throwable {
        Object objK = this.c.K(new ed3(list, null, 24), (vp4) tp4Var);
        return objK == m45.E ? objK : iei.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [dae, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v3 */
    @Override // defpackage.hq4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r17, java.util.List r18, java.lang.String r19, java.lang.String r20, defpackage.tp4 r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj5.k(java.lang.String, java.util.List, java.lang.String, java.lang.String, tp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.hq4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.lang.String r12, defpackage.tp4 r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.ni5
            if (r0 == 0) goto L13
            r0 = r13
            ni5 r0 = (defpackage.ni5) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L1a
        L13:
            ni5 r0 = new ni5
            vp4 r13 = (defpackage.vp4) r13
            r0.<init>(r11, r13)
        L1a:
            java.lang.Object r13 = r0.F
            m45 r1 = defpackage.m45.E
            int r2 = r0.H
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2d
            defpackage.sf5.h0(r13)
            return r13
        L2d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r11)
            r11 = 0
            return r11
        L34:
            java.lang.String r12 = r0.E
            defpackage.sf5.h0(r13)
            goto L54
        L3a:
            defpackage.sf5.h0(r13)
            boolean r13 = r11.e
            if (r13 != 0) goto L54
            el5 r13 = r11.c
            oi5 r2 = new oi5
            r5 = 0
            r2.<init>(r11, r9, r5)
            r0.E = r12
            r0.H = r4
            java.lang.Object r13 = r13.K(r2, r0)
            if (r13 != r1) goto L54
            goto L79
        L54:
            r6 = r12
            com.anthropic.claude.api.chat.ChatConversationWithProjectReference r12 = r11.t(r6)
            if (r12 == 0) goto L7b
            java.lang.String r8 = r12.m206getCurrent_leaf_message_uuidsaiyK68()
            if (r8 != 0) goto L62
            goto L7b
        L62:
            el5 r12 = r11.c
            w22 r5 = new w22
            r10 = 5
            r7 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            r0.E = r9
            r0.H = r3
            java.lang.Object r11 = r12.E
            com.anthropic.claude.db.ClaudeDatabase r11 = (com.anthropic.claude.db.ClaudeDatabase) r11
            java.lang.Object r11 = r5.invoke(r11, r0)
            if (r11 != r1) goto L7a
        L79:
            return r1
        L7a:
            return r11
        L7b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj5.m(java.lang.String, tp4):java.lang.Object");
    }

    @Override // defpackage.hq4
    public final Object n(q60 q60Var) throws Throwable {
        Object objK = this.c.K(new ki5(2, null, 0), q60Var);
        return objK == m45.E ? objK : iei.a;
    }

    @Override // defpackage.hq4
    public final boolean o(String str) {
        str.getClass();
        return ((xz8) this.c.I).o(str);
    }

    @Override // defpackage.hq4
    public final Object p(Collection collection, tp4 tp4Var) {
        return collection.isEmpty() ? um6.E : new dx(collection, (tp4) null, 23).invoke((ClaudeDatabase) this.c.E, tp4Var);
    }

    @Override // defpackage.hq4
    public final Object q(bt2 bt2Var, String str, tp4 tp4Var) throws Throwable {
        Object objK = this.c.K(new w14((ft2) bt2Var, str, (tp4) null, 19), (vp4) tp4Var);
        return objK == m45.E ? objK : iei.a;
    }

    @Override // defpackage.hq4
    public final Object r(ft2 ft2Var, vp4 vp4Var) {
        Object objK;
        if (ft2Var.a()) {
            el5 el5Var = this.c;
            xz8 xz8Var = (xz8) el5Var.I;
            xz8Var.getClass();
            if (xz8Var.w(ft2Var).isEmpty() && (objK = el5Var.K(new m80(ft2Var, this, (tp4) null, 2), vp4Var)) == m45.E) {
                return objK;
            }
        }
        return iei.a;
    }

    @Override // defpackage.hq4
    public final boolean s() {
        return this.d;
    }

    @Override // defpackage.hq4
    public final ChatConversationWithProjectReference t(String str) {
        str.getClass();
        return ((xz8) this.c.I).t(str);
    }

    @Override // defpackage.hq4
    public final Object v(String str, boolean z, bz7 bz7Var, vp4 vp4Var) {
        return this.c.K(new mt4(str, bz7Var, this, (tp4) null, 4), vp4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(java.lang.String r5, defpackage.vp4 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.mi5
            if (r0 == 0) goto L13
            r0 = r6
            mi5 r0 = (defpackage.mi5) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            mi5 r0 = new mi5
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.sf5.h0(r6)
            goto L44
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.sf5.h0(r6)
            com.anthropic.claude.types.strings.MessageId r5 = com.anthropic.claude.types.strings.MessageId.m1051boximpl(r5)
            java.util.List r5 = defpackage.x44.W(r5)
            java.util.Collection r5 = (java.util.Collection) r5
            r0.G = r2
            java.lang.Object r6 = r4.p(r5, r0)
            m45 r4 = defpackage.m45.E
            if (r6 != r4) goto L44
            return r4
        L44:
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r4 = r6.isEmpty()
            r4 = r4 ^ r2
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj5.x(java.lang.String, vp4):java.lang.Object");
    }
}
