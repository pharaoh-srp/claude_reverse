package defpackage;

import com.anthropic.claude.sessions.types.MarkSessionReadRequest;
import com.anthropic.claude.types.strings.SessionId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jwf {
    public final nwf a;
    public final String b;
    public final owf c;
    public final so3 d;

    public jwf(nwf nwfVar, String str, owf owfVar, so3 so3Var) {
        str.getClass();
        this.a = nwfVar;
        this.b = str;
        this.c = owfVar;
        this.d = so3Var;
    }

    public static Object g(jwf jwfVar, String str, List list, String str2, vp4 vp4Var, int i) {
        ArrayList arrayList = null;
        String str3 = (i & 1) != 0 ? null : str;
        if ((i & 8) != 0) {
            list = null;
        }
        String str4 = (i & 16) != 0 ? null : str2;
        nwf nwfVar = jwfVar.a;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(x44.y(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((vq) it.next()).a());
            }
        }
        return nwfVar.K(str3, null, null, arrayList, str4, vp4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object h(jwf jwfVar, String str, Integer num, List list, vp4 vp4Var, int i) {
        return jwfVar.a.M(jwfVar.b, null, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : list, vp4Var);
    }

    public static Object i(jwf jwfVar, String str, String str2, String str3, Integer num, vp4 vp4Var, int i) {
        Boolean bool = Boolean.TRUE;
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            bool = null;
        }
        return jwfVar.a.k(str, str2, str3, num, bool, vp4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object j(jwf jwfVar, String str, Integer num, List list, boolean z, vp4 vp4Var, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            list = null;
        }
        if ((i & 16) != 0) {
            z = false;
        }
        jwfVar.getClass();
        Boolean boolValueOf = z ? Boolean.valueOf(z) : null;
        boolean zF = ((jf0) jwfVar.c).f();
        nwf nwfVar = jwfVar.a;
        List list2 = list;
        Integer num2 = num;
        String str2 = str;
        return zF ? nwfVar.i(null, str2, num2, list2, boolValueOf, vp4Var) : nwfVar.i(null, str2, num2, list2, boolValueOf, vp4Var);
    }

    public static String m(String str) {
        return isg.q0(str, "cse_", false) ? SessionId.m1115constructorimpl("session_".concat(bsg.R0(str, "cse_"))) : str;
    }

    public static String n(String str) {
        return isg.q0(str, "session_", false) ? SessionId.m1115constructorimpl("cse_".concat(bsg.R0(str, "session_"))) : str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r7 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        if (r7 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, defpackage.vp4 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.bwf
            if (r0 == 0) goto L13
            r0 = r7
            bwf r0 = (defpackage.bwf) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            bwf r0 = new bwf
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L33
            if (r1 == r4) goto L2f
            if (r1 != r3) goto L29
            defpackage.sf5.h0(r7)
            goto L83
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return r2
        L2f:
            defpackage.sf5.h0(r7)
            goto L51
        L33:
            defpackage.sf5.h0(r7)
            owf r7 = r5.c
            jf0 r7 = (defpackage.jf0) r7
            boolean r7 = r7.f()
            m45 r1 = defpackage.m45.E
            nwf r5 = r5.a
            if (r7 == 0) goto L76
            java.lang.String r6 = n(r6)
            r0.G = r4
            java.lang.Object r7 = r5.o(r6, r0)
            if (r7 != r1) goto L51
            goto L82
        L51:
            com.anthropic.claude.api.result.ApiResult r7 = (com.anthropic.claude.api.result.ApiResult) r7
            boolean r5 = r7 instanceof defpackage.of0
            if (r5 == 0) goto L6d
            of0 r7 = (defpackage.of0) r7
            int r5 = r7.a
            java.lang.Object r6 = r7.b
            com.anthropic.claude.sessions.types.SessionV2Envelope r6 = (com.anthropic.claude.sessions.types.SessionV2Envelope) r6
            com.anthropic.claude.sessions.types.SessionV2 r6 = r6.getSession()
            com.anthropic.claude.sessions.types.SessionResource r6 = r6.toSessionResource()
            of0 r7 = new of0
            r7.<init>(r5, r6)
            return r7
        L6d:
            boolean r5 = r7 instanceof defpackage.nf0
            if (r5 == 0) goto L72
            return r7
        L72:
            defpackage.mr9.b()
            return r2
        L76:
            java.lang.String r6 = n(r6)
            r0.G = r3
            java.lang.Object r7 = r5.o(r6, r0)
            if (r7 != r1) goto L83
        L82:
            return r1
        L83:
            com.anthropic.claude.api.result.ApiResult r7 = (com.anthropic.claude.api.result.ApiResult) r7
            boolean r5 = r7 instanceof defpackage.of0
            if (r5 == 0) goto L9f
            of0 r7 = (defpackage.of0) r7
            int r5 = r7.a
            java.lang.Object r6 = r7.b
            com.anthropic.claude.sessions.types.SessionV2Envelope r6 = (com.anthropic.claude.sessions.types.SessionV2Envelope) r6
            com.anthropic.claude.sessions.types.SessionV2 r6 = r6.getSession()
            com.anthropic.claude.sessions.types.SessionResource r6 = r6.toSessionResource()
            of0 r7 = new of0
            r7.<init>(r5, r6)
            return r7
        L9f:
            boolean r5 = r7 instanceof defpackage.nf0
            if (r5 == 0) goto La4
            return r7
        La4:
            defpackage.mr9.b()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jwf.a(java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r7 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        if (r7 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.anthropic.claude.sessions.types.CreateSessionParams r6, defpackage.vp4 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cwf
            if (r0 == 0) goto L13
            r0 = r7
            cwf r0 = (defpackage.cwf) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            cwf r0 = new cwf
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L33
            if (r1 == r4) goto L2f
            if (r1 != r3) goto L29
            defpackage.sf5.h0(r7)
            goto L83
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return r2
        L2f:
            defpackage.sf5.h0(r7)
            goto L51
        L33:
            defpackage.sf5.h0(r7)
            owf r7 = r5.c
            jf0 r7 = (defpackage.jf0) r7
            boolean r7 = r7.f()
            m45 r1 = defpackage.m45.E
            nwf r5 = r5.a
            if (r7 == 0) goto L76
            com.anthropic.claude.sessions.types.CreateSessionV2Params r6 = defpackage.ne5.k(r6)
            r0.G = r4
            java.lang.Object r7 = r5.D(r6, r0)
            if (r7 != r1) goto L51
            goto L82
        L51:
            com.anthropic.claude.api.result.ApiResult r7 = (com.anthropic.claude.api.result.ApiResult) r7
            boolean r5 = r7 instanceof defpackage.of0
            if (r5 == 0) goto L6d
            of0 r7 = (defpackage.of0) r7
            int r5 = r7.a
            java.lang.Object r6 = r7.b
            com.anthropic.claude.sessions.types.SessionV2Envelope r6 = (com.anthropic.claude.sessions.types.SessionV2Envelope) r6
            com.anthropic.claude.sessions.types.SessionV2 r6 = r6.getSession()
            com.anthropic.claude.sessions.types.SessionResource r6 = r6.toSessionResource()
            of0 r7 = new of0
            r7.<init>(r5, r6)
            return r7
        L6d:
            boolean r5 = r7 instanceof defpackage.nf0
            if (r5 == 0) goto L72
            return r7
        L72:
            defpackage.mr9.b()
            return r2
        L76:
            com.anthropic.claude.sessions.types.CreateSessionV2Params r6 = defpackage.ne5.k(r6)
            r0.G = r3
            java.lang.Object r7 = r5.D(r6, r0)
            if (r7 != r1) goto L83
        L82:
            return r1
        L83:
            com.anthropic.claude.api.result.ApiResult r7 = (com.anthropic.claude.api.result.ApiResult) r7
            boolean r5 = r7 instanceof defpackage.of0
            if (r5 == 0) goto L9f
            of0 r7 = (defpackage.of0) r7
            int r5 = r7.a
            java.lang.Object r6 = r7.b
            com.anthropic.claude.sessions.types.SessionV2Envelope r6 = (com.anthropic.claude.sessions.types.SessionV2Envelope) r6
            com.anthropic.claude.sessions.types.SessionV2 r6 = r6.getSession()
            com.anthropic.claude.sessions.types.SessionResource r6 = r6.toSessionResource()
            of0 r7 = new of0
            r7.<init>(r5, r6)
            return r7
        L9f:
            boolean r5 = r7 instanceof defpackage.nf0
            if (r5 == 0) goto La4
            return r7
        La4:
            defpackage.mr9.b()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jwf.b(com.anthropic.claude.sessions.types.CreateSessionParams, vp4):java.lang.Object");
    }

    public final Object c(String str, vp4 vp4Var) {
        boolean zF = ((jf0) this.c).f();
        nwf nwfVar = this.a;
        return zF ? nwfVar.v(str, vp4Var) : nwfVar.v(str, vp4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r5, defpackage.vp4 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dwf
            if (r0 == 0) goto L13
            r0 = r6
            dwf r0 = (defpackage.dwf) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            dwf r0 = new dwf
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.sf5.h0(r6)
            goto L40
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L2c:
            defpackage.sf5.h0(r6)
            java.lang.String r5 = n(r5)
            r0.G = r3
            nwf r4 = r4.a
            java.lang.Object r6 = r4.a(r5, r0)
            m45 r4 = defpackage.m45.E
            if (r6 != r4) goto L40
            return r4
        L40:
            com.anthropic.claude.api.result.ApiResult r6 = (com.anthropic.claude.api.result.ApiResult) r6
            boolean r4 = r6 instanceof defpackage.of0
            if (r4 == 0) goto L58
            of0 r6 = (defpackage.of0) r6
            int r4 = r6.a
            java.lang.Object r5 = r6.b
            com.anthropic.claude.sessions.types.GetSessionV2Response r5 = (com.anthropic.claude.sessions.types.GetSessionV2Response) r5
            com.anthropic.claude.sessions.types.SessionResourceV2 r5 = r5.getSession()
            of0 r6 = new of0
            r6.<init>(r4, r5)
            return r6
        L58:
            boolean r4 = r6 instanceof defpackage.nf0
            if (r4 == 0) goto L5d
            return r6
        L5d:
            defpackage.mr9.b()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jwf.d(java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c5 -> B:35:0x00cb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r18, defpackage.vp4 r19) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jwf.e(java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r14, defpackage.vp4 r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof defpackage.fwf
            if (r0 == 0) goto L13
            r0 = r15
            fwf r0 = (defpackage.fwf) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            fwf r0 = new fwf
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.F
            int r1 = r0.H
            r2 = 2
            r3 = 1
            r4 = 0
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.sf5.h0(r15)
            return r15
        L2b:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r13)
            return r4
        L31:
            java.lang.String r14 = r0.E
            defpackage.sf5.h0(r15)     // Catch: java.lang.Throwable -> L61
            goto L5f
        L37:
            defpackage.sf5.h0(r15)
            com.anthropic.claude.sessions.types.StdinMessage$ControlRequest r6 = new com.anthropic.claude.sessions.types.StdinMessage$ControlRequest
            java.lang.String r9 = defpackage.vb7.i()
            com.anthropic.claude.sessions.types.m r15 = com.anthropic.claude.sessions.types.ControlRequestBody.Companion
            r15.getClass()
            com.anthropic.claude.sessions.types.ControlRequestBody$Interrupt r10 = com.anthropic.claude.sessions.types.m.a()
            r11 = 3
            r12 = 0
            r7 = 0
            r8 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            java.util.List r15 = defpackage.x44.W(r6)     // Catch: java.lang.Throwable -> L61
            r0.E = r14     // Catch: java.lang.Throwable -> L61
            r0.H = r3     // Catch: java.lang.Throwable -> L61
            java.lang.Object r15 = r13.l(r14, r15, r0)     // Catch: java.lang.Throwable -> L61
            if (r15 != r5) goto L5f
            goto L6b
        L5f:
            com.anthropic.claude.api.result.ApiResult r15 = (com.anthropic.claude.api.result.ApiResult) r15     // Catch: java.lang.Throwable -> L61
        L61:
            r0.E = r4
            r0.H = r2
            java.lang.Object r13 = r13.a(r14, r0)
            if (r13 != r5) goto L6c
        L6b:
            return r5
        L6c:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jwf.f(java.lang.String, vp4):java.lang.Object");
    }

    public final Object k(String str, String str2, vp4 vp4Var) {
        boolean zF = ((jf0) this.c).f();
        nwf nwfVar = this.a;
        return zF ? nwfVar.x(n(str), new MarkSessionReadRequest(str2), vp4Var) : nwfVar.x(n(str), new MarkSessionReadRequest(str2), vp4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00e7 -> B:39:0x00e8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r19, java.util.List r20, defpackage.vp4 r21) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jwf.l(java.lang.String, java.util.List, vp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r7 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        if (r7 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.String r6, defpackage.vp4 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.hwf
            if (r0 == 0) goto L13
            r0 = r7
            hwf r0 = (defpackage.hwf) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            hwf r0 = new hwf
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L33
            if (r1 == r4) goto L2f
            if (r1 != r3) goto L29
            defpackage.sf5.h0(r7)
            goto L83
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return r2
        L2f:
            defpackage.sf5.h0(r7)
            goto L51
        L33:
            defpackage.sf5.h0(r7)
            owf r7 = r5.c
            jf0 r7 = (defpackage.jf0) r7
            boolean r7 = r7.f()
            m45 r1 = defpackage.m45.E
            nwf r5 = r5.a
            if (r7 == 0) goto L76
            java.lang.String r6 = n(r6)
            r0.G = r4
            java.lang.Object r7 = r5.H(r6, r0)
            if (r7 != r1) goto L51
            goto L82
        L51:
            com.anthropic.claude.api.result.ApiResult r7 = (com.anthropic.claude.api.result.ApiResult) r7
            boolean r5 = r7 instanceof defpackage.of0
            if (r5 == 0) goto L6d
            of0 r7 = (defpackage.of0) r7
            int r5 = r7.a
            java.lang.Object r6 = r7.b
            com.anthropic.claude.sessions.types.SessionV2Envelope r6 = (com.anthropic.claude.sessions.types.SessionV2Envelope) r6
            com.anthropic.claude.sessions.types.SessionV2 r6 = r6.getSession()
            com.anthropic.claude.sessions.types.SessionResource r6 = r6.toSessionResource()
            of0 r7 = new of0
            r7.<init>(r5, r6)
            return r7
        L6d:
            boolean r5 = r7 instanceof defpackage.nf0
            if (r5 == 0) goto L72
            return r7
        L72:
            defpackage.mr9.b()
            return r2
        L76:
            java.lang.String r6 = n(r6)
            r0.G = r3
            java.lang.Object r7 = r5.H(r6, r0)
            if (r7 != r1) goto L83
        L82:
            return r1
        L83:
            com.anthropic.claude.api.result.ApiResult r7 = (com.anthropic.claude.api.result.ApiResult) r7
            boolean r5 = r7 instanceof defpackage.of0
            if (r5 == 0) goto L9f
            of0 r7 = (defpackage.of0) r7
            int r5 = r7.a
            java.lang.Object r6 = r7.b
            com.anthropic.claude.sessions.types.SessionV2Envelope r6 = (com.anthropic.claude.sessions.types.SessionV2Envelope) r6
            com.anthropic.claude.sessions.types.SessionV2 r6 = r6.getSession()
            com.anthropic.claude.sessions.types.SessionResource r6 = r6.toSessionResource()
            of0 r7 = new of0
            r7.<init>(r5, r6)
            return r7
        L9f:
            boolean r5 = r7 instanceof defpackage.nf0
            if (r5 == 0) goto La4
            return r7
        La4:
            defpackage.mr9.b()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jwf.o(java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r8 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if (r8 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.String r6, java.lang.String r7, defpackage.vp4 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.iwf
            if (r0 == 0) goto L13
            r0 = r8
            iwf r0 = (defpackage.iwf) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            iwf r0 = new iwf
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L33
            if (r1 == r4) goto L2f
            if (r1 != r3) goto L29
            defpackage.sf5.h0(r8)
            goto L8d
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return r2
        L2f:
            defpackage.sf5.h0(r8)
            goto L56
        L33:
            defpackage.sf5.h0(r8)
            owf r8 = r5.c
            jf0 r8 = (defpackage.jf0) r8
            boolean r8 = r8.f()
            m45 r1 = defpackage.m45.E
            nwf r5 = r5.a
            if (r8 == 0) goto L7b
            java.lang.String r6 = n(r6)
            com.anthropic.claude.sessions.types.UpdateSessionParams r8 = new com.anthropic.claude.sessions.types.UpdateSessionParams
            r8.<init>(r7)
            r0.G = r4
            java.lang.Object r8 = r5.F(r6, r8, r0)
            if (r8 != r1) goto L56
            goto L8c
        L56:
            com.anthropic.claude.api.result.ApiResult r8 = (com.anthropic.claude.api.result.ApiResult) r8
            boolean r5 = r8 instanceof defpackage.of0
            if (r5 == 0) goto L72
            of0 r8 = (defpackage.of0) r8
            int r5 = r8.a
            java.lang.Object r6 = r8.b
            com.anthropic.claude.sessions.types.SessionV2Envelope r6 = (com.anthropic.claude.sessions.types.SessionV2Envelope) r6
            com.anthropic.claude.sessions.types.SessionV2 r6 = r6.getSession()
            com.anthropic.claude.sessions.types.SessionResource r6 = r6.toSessionResource()
            of0 r7 = new of0
            r7.<init>(r5, r6)
            return r7
        L72:
            boolean r5 = r8 instanceof defpackage.nf0
            if (r5 == 0) goto L77
            return r8
        L77:
            defpackage.mr9.b()
            return r2
        L7b:
            java.lang.String r6 = n(r6)
            com.anthropic.claude.sessions.types.UpdateSessionParams r8 = new com.anthropic.claude.sessions.types.UpdateSessionParams
            r8.<init>(r7)
            r0.G = r3
            java.lang.Object r8 = r5.F(r6, r8, r0)
            if (r8 != r1) goto L8d
        L8c:
            return r1
        L8d:
            com.anthropic.claude.api.result.ApiResult r8 = (com.anthropic.claude.api.result.ApiResult) r8
            boolean r5 = r8 instanceof defpackage.of0
            if (r5 == 0) goto La9
            of0 r8 = (defpackage.of0) r8
            int r5 = r8.a
            java.lang.Object r6 = r8.b
            com.anthropic.claude.sessions.types.SessionV2Envelope r6 = (com.anthropic.claude.sessions.types.SessionV2Envelope) r6
            com.anthropic.claude.sessions.types.SessionV2 r6 = r6.getSession()
            com.anthropic.claude.sessions.types.SessionResource r6 = r6.toSessionResource()
            of0 r7 = new of0
            r7.<init>(r5, r6)
            return r7
        La9:
            boolean r5 = r8 instanceof defpackage.nf0
            if (r5 == 0) goto Lae
            return r8
        Lae:
            defpackage.mr9.b()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jwf.p(java.lang.String, java.lang.String, vp4):java.lang.Object");
    }
}
