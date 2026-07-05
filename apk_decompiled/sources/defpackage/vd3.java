package defpackage;

import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.types.strings.ChatId;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class vd3 {
    public final dl2 a;
    public final koi b;
    public final b1i c;
    public final qi3 d;
    public final hq4 e;
    public final loi f;
    public final n2g g = o2g.b(3, 5, null);
    public final zy1 h = x44.a();
    public final lsc i;
    public final lsc j;
    public final lsc k;
    public final wz5 l;
    public final wz5 m;
    public final wz5 n;
    public final lsc o;

    public vd3(dl2 dl2Var, koi koiVar, b1i b1iVar, qi3 qi3Var, hq4 hq4Var, loi loiVar) {
        this.a = dl2Var;
        this.b = koiVar;
        this.c = b1iVar;
        this.d = qi3Var;
        this.e = hq4Var;
        this.f = loiVar;
        Boolean bool = Boolean.FALSE;
        this.i = mpk.P(bool);
        this.j = mpk.P(bool);
        final int i = 0;
        this.k = mpk.P(new p03(0, false, false, false));
        this.l = mpk.w(new zy7(this) { // from class: zc3
            public final /* synthetic */ vd3 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i2 = i;
                vd3 vd3Var = this.F;
                switch (i2) {
                    case 0:
                        return vd3Var.e.l(ct2.a);
                    case 1:
                        return vd3Var.e.l(et2.a);
                    default:
                        hq4 hq4Var2 = vd3Var.e;
                        kdg kdgVarB = hq4Var2.b(dt2.a);
                        ArrayList arrayList = new ArrayList();
                        Iterator<E> it = kdgVarB.iterator();
                        while (it.hasNext()) {
                            ChatConversationWithProjectReference chatConversationWithProjectReferenceT = hq4Var2.t(((ChatId) it.next()).m984unboximpl());
                            if (chatConversationWithProjectReferenceT != null) {
                                arrayList.add(chatConversationWithProjectReferenceT);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : arrayList) {
                            if (!((ChatConversationWithProjectReference) obj).is_temporary()) {
                                arrayList2.add(obj);
                            }
                        }
                        return arrayList2;
                }
            }
        });
        final int i2 = 1;
        this.m = mpk.w(new zy7(this) { // from class: zc3
            public final /* synthetic */ vd3 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i2;
                vd3 vd3Var = this.F;
                switch (i22) {
                    case 0:
                        return vd3Var.e.l(ct2.a);
                    case 1:
                        return vd3Var.e.l(et2.a);
                    default:
                        hq4 hq4Var2 = vd3Var.e;
                        kdg kdgVarB = hq4Var2.b(dt2.a);
                        ArrayList arrayList = new ArrayList();
                        Iterator<E> it = kdgVarB.iterator();
                        while (it.hasNext()) {
                            ChatConversationWithProjectReference chatConversationWithProjectReferenceT = hq4Var2.t(((ChatId) it.next()).m984unboximpl());
                            if (chatConversationWithProjectReferenceT != null) {
                                arrayList.add(chatConversationWithProjectReferenceT);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : arrayList) {
                            if (!((ChatConversationWithProjectReference) obj).is_temporary()) {
                                arrayList2.add(obj);
                            }
                        }
                        return arrayList2;
                }
            }
        });
        final int i3 = 2;
        this.n = mpk.w(new zy7(this) { // from class: zc3
            public final /* synthetic */ vd3 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i3;
                vd3 vd3Var = this.F;
                switch (i22) {
                    case 0:
                        return vd3Var.e.l(ct2.a);
                    case 1:
                        return vd3Var.e.l(et2.a);
                    default:
                        hq4 hq4Var2 = vd3Var.e;
                        kdg kdgVarB = hq4Var2.b(dt2.a);
                        ArrayList arrayList = new ArrayList();
                        Iterator<E> it = kdgVarB.iterator();
                        while (it.hasNext()) {
                            ChatConversationWithProjectReference chatConversationWithProjectReferenceT = hq4Var2.t(((ChatId) it.next()).m984unboximpl());
                            if (chatConversationWithProjectReferenceT != null) {
                                arrayList.add(chatConversationWithProjectReferenceT);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : arrayList) {
                            if (!((ChatConversationWithProjectReference) obj).is_temporary()) {
                                arrayList2.add(obj);
                            }
                        }
                        return arrayList2;
                }
            }
        });
        this.o = mpk.P(nm6.E);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.vd3 r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, defpackage.vp4 r10) {
        /*
            hq4 r0 = r6.e
            boolean r1 = r10 instanceof defpackage.rd3
            if (r1 == 0) goto L15
            r1 = r10
            rd3 r1 = (defpackage.rd3) r1
            int r2 = r1.I
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.I = r2
            goto L1a
        L15:
            rd3 r1 = new rd3
            r1.<init>(r6, r10)
        L1a:
            java.lang.Object r6 = r1.G
            int r10 = r1.I
            r2 = 2
            r3 = 1
            r4 = 0
            m45 r5 = defpackage.m45.E
            if (r10 == 0) goto L3b
            if (r10 == r3) goto L33
            if (r10 != r2) goto L2d
            defpackage.sf5.h0(r6)
            return r6
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r4
        L33:
            java.lang.String r9 = r1.F
            java.lang.String r7 = r1.E
            defpackage.sf5.h0(r6)
            goto L63
        L3b:
            defpackage.sf5.h0(r6)
            r6 = 0
            if (r8 != 0) goto L45
            if (r9 != 0) goto L4c
            r6 = r3
            goto L4c
        L45:
            if (r9 != 0) goto L48
            goto L4c
        L48:
            boolean r6 = com.anthropic.claude.types.strings.ProjectId.m1082equalsimpl0(r8, r9)
        L4c:
            if (r6 == 0) goto L4f
            goto L78
        L4f:
            if (r8 == 0) goto L63
            bt2 r6 = new bt2
            r6.<init>(r8)
            r1.E = r7
            r1.F = r9
            r1.I = r3
            java.lang.Object r6 = r0.q(r6, r7, r1)
            if (r6 != r5) goto L63
            goto L76
        L63:
            if (r9 == 0) goto L78
            bt2 r6 = new bt2
            r6.<init>(r9)
            r1.E = r4
            r1.F = r4
            r1.I = r2
            java.lang.Object r6 = r0.f(r6, r7, r1)
            if (r6 != r5) goto L77
        L76:
            return r5
        L77:
            return r6
        L78:
            iei r6 = defpackage.iei.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd3.a(vd3, java.lang.String, java.lang.String, java.lang.String, vp4):java.lang.Object");
    }

    public static /* synthetic */ Object f(vd3 vd3Var, String str, boolean z, boolean z2, a33 a33Var, vp4 vp4Var, int i) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        boolean z3 = (i & 8) == 0;
        bz7 it2Var = a33Var;
        if ((i & 16) != 0) {
            it2Var = new it2(14);
        }
        return vd3Var.e(str, z, z2, z3, it2Var, vp4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.vp4 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ad3
            if (r0 == 0) goto L13
            r0 = r5
            ad3 r0 = (defpackage.ad3) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            ad3 r0 = new ad3
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.E
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.sf5.h0(r5)
            goto L48
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.sf5.h0(r5)
            nm6 r5 = defpackage.nm6.E
            lsc r1 = r4.o
            r1.setValue(r5)
            r0.G = r2
            r5 = 0
            hq4 r4 = r4.e
            dt2 r1 = defpackage.dt2.a
            lm6 r2 = defpackage.lm6.E
            java.lang.Object r4 = r4.e(r1, r2, r5, r0)
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L48
            return r5
        L48:
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd3.b(vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r9, defpackage.vp4 r10) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd3.c(java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0096 A[LOOP:0: B:31:0x0090->B:33:0x0096, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.Set r7, defpackage.vp4 r8) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd3.d(java.util.Set, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r19, boolean r20, boolean r21, boolean r22, defpackage.bz7 r23, defpackage.vp4 r24) {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd3.e(java.lang.String, boolean, boolean, boolean, bz7, vp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
    
        if (r13.e.j(r0, r6) == r12) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.vp4 r14) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd3.g(vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.anthropic.claude.api.common.ConsistencyLevel r12, defpackage.vp4 r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.gd3
            if (r0 == 0) goto L13
            r0 = r13
            gd3 r0 = (defpackage.gd3) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            gd3 r0 = new gd3
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.F
            int r1 = r0.H
            lsc r2 = r11.i
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L30
            if (r1 != r4) goto L2a
            z9e r11 = r0.E
            defpackage.sf5.h0(r13)
            goto L61
        L2a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r11)
            return r3
        L30:
            defpackage.sf5.h0(r13)
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            r2.setValue(r13)
            p03 r5 = r11.j()
            r9 = 0
            r10 = 11
            r6 = 0
            r7 = 0
            r8 = 0
            p03 r13 = defpackage.p03.a(r5, r6, r7, r8, r9, r10)
            r11.r(r13)
            z9e r13 = new z9e
            r13.<init>()
            q60 r1 = new q60
            r1.<init>(r11, r13, r12, r3)
            r0.E = r13
            r0.H = r4
            java.lang.Object r11 = defpackage.fd9.N(r1, r0)
            m45 r12 = defpackage.m45.E
            if (r11 != r12) goto L60
            return r12
        L60:
            r11 = r13
        L61:
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r2.setValue(r12)
            boolean r11 = r11.E
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd3.h(com.anthropic.claude.api.common.ConsistencyLevel, vp4):java.lang.Object");
    }

    public final ChatConversationWithProjectReference i(String str) {
        str.getClass();
        return this.e.t(str);
    }

    public final p03 j() {
        return (p03) this.k.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.vp4 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.id3
            if (r0 == 0) goto L13
            r0 = r6
            id3 r0 = (defpackage.id3) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            id3 r0 = new id3
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.G
            hq4 r5 = r5.e
            r2 = 2
            r3 = 1
            m45 r4 = defpackage.m45.E
            if (r1 == 0) goto L37
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2c
            defpackage.sf5.h0(r6)
            return r6
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            r5 = 0
            return r5
        L33:
            defpackage.sf5.h0(r6)
            goto L45
        L37:
            defpackage.sf5.h0(r6)
            r0.G = r3
            ct2 r6 = defpackage.ct2.a
            java.lang.Object r6 = r5.r(r6, r0)
            if (r6 != r4) goto L45
            goto L4f
        L45:
            r0.G = r2
            et2 r6 = defpackage.et2.a
            java.lang.Object r5 = r5.r(r6, r0)
            if (r5 != r4) goto L50
        L4f:
            return r4
        L50:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd3.k(vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r5, defpackage.vp4 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.jd3
            if (r0 == 0) goto L13
            r0 = r6
            jd3 r0 = (defpackage.jd3) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            jd3 r0 = new jd3
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.F
            int r1 = r0.H
            hq4 r4 = r4.e
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            bt2 r5 = r0.E
            defpackage.sf5.h0(r6)
            goto L46
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L30:
            defpackage.sf5.h0(r6)
            bt2 r6 = new bt2
            r6.<init>(r5)
            r0.E = r6
            r0.H = r2
            java.lang.Object r5 = r4.r(r6, r0)
            m45 r0 = defpackage.m45.E
            if (r5 != r0) goto L45
            return r0
        L45:
            r5 = r6
        L46:
            java.util.List r4 = r4.l(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd3.l(java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.lang.String r10, java.lang.String r11, java.lang.String r12, defpackage.vp4 r13) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd3.m(java.lang.String, java.lang.String, java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
    
        if (r15 == r6) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00dd -> B:26:0x00a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00fd -> B:39:0x0101). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(com.anthropic.claude.api.project.Project r13, java.util.Set r14, defpackage.vp4 r15) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd3.n(com.anthropic.claude.api.project.Project, java.util.Set, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.String r10, java.lang.String r11, defpackage.vp4 r12) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd3.o(java.lang.String, java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.String r5, java.util.ArrayList r6, defpackage.vp4 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.nd3
            if (r0 == 0) goto L13
            r0 = r7
            nd3 r0 = (defpackage.nd3) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            nd3 r0 = new nd3
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.E
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.sf5.h0(r7)
            goto L42
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.sf5.h0(r7)
            bt2 r7 = new bt2
            r7.<init>(r5)
            r0.G = r2
            r5 = 0
            hq4 r4 = r4.e
            java.lang.Object r4 = r4.e(r7, r6, r5, r0)
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L42
            return r5
        L42:
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd3.p(java.lang.String, java.util.ArrayList, vp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c9, code lost:
    
        if (r11.e.e(defpackage.dt2.a, r0, true, r6) == r10) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.lang.String r12, defpackage.vp4 r13) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd3.q(java.lang.String, vp4):java.lang.Object");
    }

    public final void r(p03 p03Var) {
        this.k.setValue(p03Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(java.lang.String r5, defpackage.bz7 r6, defpackage.vp4 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.pd3
            if (r0 == 0) goto L13
            r0 = r7
            pd3 r0 = (defpackage.pd3) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            pd3 r0 = new pd3
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.E
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.sf5.h0(r7)
            goto L42
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.sf5.h0(r7)
            f7 r7 = new f7
            r1 = 3
            r7.<init>(r1, r6)
            r0.G = r2
            hq4 r4 = r4.e
            java.lang.Object r7 = r4.v(r5, r2, r7, r0)
            m45 r4 = defpackage.m45.E
            if (r7 != r4) goto L42
            return r4
        L42:
            if (r7 == 0) goto L45
            goto L46
        L45:
            r2 = 0
        L46:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd3.s(java.lang.String, bz7, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(java.lang.String r20, java.lang.String r21, defpackage.vp4 r22) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd3.t(java.lang.String, java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(defpackage.vp4 r20, java.lang.String r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd3.u(vp4, java.lang.String, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(com.anthropic.claude.api.chat.ChatConversation r5, boolean r6, defpackage.vp4 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.td3
            if (r0 == 0) goto L13
            r0 = r7
            td3 r0 = (defpackage.td3) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            td3 r0 = new td3
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.E
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.sf5.h0(r7)
            goto L40
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.sf5.h0(r7)
            com.anthropic.claude.api.chat.ChatConversationWithProjectReference r5 = defpackage.nkk.o(r5)
            r0.G = r2
            hq4 r4 = r4.e
            java.lang.Object r4 = r4.g(r5, r6, r0)
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L40
            return r5
        L40:
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd3.v(com.anthropic.claude.api.chat.ChatConversation, boolean, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(com.anthropic.claude.api.chat.ChatConversation r7, defpackage.vp4 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ud3
            if (r0 == 0) goto L13
            r0 = r8
            ud3 r0 = (defpackage.ud3) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            ud3 r0 = new ud3
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.F
            int r1 = r0.H
            r2 = 0
            r3 = 2
            r4 = 1
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.sf5.h0(r8)
            return r8
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r2
        L31:
            com.anthropic.claude.api.chat.ChatConversation r7 = r0.E
            defpackage.sf5.h0(r8)
            goto L4a
        L37:
            defpackage.sf5.h0(r8)
            boolean r8 = r7.is_temporary()
            r8 = r8 ^ r4
            r0.E = r7
            r0.H = r4
            java.lang.Object r8 = r6.v(r7, r8, r0)
            if (r8 != r5) goto L4a
            goto L5c
        L4a:
            java.lang.String r7 = r7.m176getUuidRjYBDck()
            r0.E = r2
            r0.H = r3
            hq4 r6 = r6.e
            ct2 r8 = defpackage.ct2.a
            java.lang.Object r6 = r6.f(r8, r7, r0)
            if (r6 != r5) goto L5d
        L5c:
            return r5
        L5d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd3.w(com.anthropic.claude.api.chat.ChatConversation, vp4):java.lang.Object");
    }
}
