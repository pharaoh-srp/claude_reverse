package defpackage;

import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.api.project.ProjectDoc;
import com.anthropic.claude.types.strings.ProjectId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wqd {
    public final String a;
    public final koi b;
    public final mkd c;
    public final omd d;
    public final mn5 e;
    public final qi3 f;
    public final dmd g;
    public final nkd h;
    public final zy1 i;
    public final mdg j;
    public final mdg k;
    public final fj0 l;
    public final wz5 m;
    public final fj0 n;
    public final wz5 o;
    public final wz5 p;
    public final mdg q;
    public final mdg r;
    public final mdg s;

    public wqd(String str, koi koiVar, mkd mkdVar, omd omdVar, mn5 mn5Var, qi3 qi3Var, dmd dmdVar, nkd nkdVar) {
        str.getClass();
        this.a = str;
        this.b = koiVar;
        this.c = mkdVar;
        this.d = omdVar;
        this.e = mn5Var;
        this.f = qi3Var;
        this.g = dmdVar;
        this.h = nkdVar;
        this.i = x44.a();
        this.j = new mdg();
        this.k = new mdg();
        this.l = new fj0(wl0.L, new sz6(21));
        final int i = 0;
        this.m = mpk.w(new zy7(this) { // from class: ypd
            public final /* synthetic */ wqd F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i2 = i;
                wqd wqdVar = this.F;
                switch (i2) {
                    case 0:
                        Collection collectionY = wqdVar.l.y();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj : collectionY) {
                            ProjectId projectIdM1079boximpl = ProjectId.m1079boximpl(((wld) obj).b());
                            Object arrayList = linkedHashMap.get(projectIdM1079boximpl);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(projectIdM1079boximpl, arrayList);
                            }
                            ((List) arrayList).add(obj);
                        }
                        return linkedHashMap;
                    case 1:
                        Collection collectionY2 = wqdVar.n.y();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Object obj2 : collectionY2) {
                            ProjectId projectIdM1079boximpl2 = ProjectId.m1079boximpl(((ProjectDoc) obj2).m413getProject_uuid5pmjbU());
                            Object arrayList2 = linkedHashMap2.get(projectIdM1079boximpl2);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                linkedHashMap2.put(projectIdM1079boximpl2, arrayList2);
                            }
                            ((List) arrayList2).add(obj2);
                        }
                        return linkedHashMap2;
                    default:
                        nkd nkdVar2 = wqdVar.h;
                        kdg kdgVarJ = nkdVar2.j(kmd.H);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator<E> it = kdgVarJ.iterator();
                        while (it.hasNext()) {
                            Project projectB = nkdVar2.b(((ProjectId) it.next()).m1085unboximpl());
                            if (projectB != null) {
                                arrayList3.add(projectB);
                            }
                        }
                        List listI1 = w44.i1(arrayList3, new iec(6));
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj3 : listI1) {
                            if (((Project) obj3).getArchived_at() == null) {
                                arrayList4.add(obj3);
                            }
                        }
                        return arrayList4;
                }
            }
        });
        this.n = new fj0(wl0.K, new sz6(21));
        final int i2 = 1;
        this.o = mpk.w(new zy7(this) { // from class: ypd
            public final /* synthetic */ wqd F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i2;
                wqd wqdVar = this.F;
                switch (i22) {
                    case 0:
                        Collection collectionY = wqdVar.l.y();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj : collectionY) {
                            ProjectId projectIdM1079boximpl = ProjectId.m1079boximpl(((wld) obj).b());
                            Object arrayList = linkedHashMap.get(projectIdM1079boximpl);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(projectIdM1079boximpl, arrayList);
                            }
                            ((List) arrayList).add(obj);
                        }
                        return linkedHashMap;
                    case 1:
                        Collection collectionY2 = wqdVar.n.y();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Object obj2 : collectionY2) {
                            ProjectId projectIdM1079boximpl2 = ProjectId.m1079boximpl(((ProjectDoc) obj2).m413getProject_uuid5pmjbU());
                            Object arrayList2 = linkedHashMap2.get(projectIdM1079boximpl2);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                linkedHashMap2.put(projectIdM1079boximpl2, arrayList2);
                            }
                            ((List) arrayList2).add(obj2);
                        }
                        return linkedHashMap2;
                    default:
                        nkd nkdVar2 = wqdVar.h;
                        kdg kdgVarJ = nkdVar2.j(kmd.H);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator<E> it = kdgVarJ.iterator();
                        while (it.hasNext()) {
                            Project projectB = nkdVar2.b(((ProjectId) it.next()).m1085unboximpl());
                            if (projectB != null) {
                                arrayList3.add(projectB);
                            }
                        }
                        List listI1 = w44.i1(arrayList3, new iec(6));
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj3 : listI1) {
                            if (((Project) obj3).getArchived_at() == null) {
                                arrayList4.add(obj3);
                            }
                        }
                        return arrayList4;
                }
            }
        });
        final int i3 = 2;
        this.p = mpk.w(new zy7(this) { // from class: ypd
            public final /* synthetic */ wqd F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i3;
                wqd wqdVar = this.F;
                switch (i22) {
                    case 0:
                        Collection collectionY = wqdVar.l.y();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj : collectionY) {
                            ProjectId projectIdM1079boximpl = ProjectId.m1079boximpl(((wld) obj).b());
                            Object arrayList = linkedHashMap.get(projectIdM1079boximpl);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(projectIdM1079boximpl, arrayList);
                            }
                            ((List) arrayList).add(obj);
                        }
                        return linkedHashMap;
                    case 1:
                        Collection collectionY2 = wqdVar.n.y();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Object obj2 : collectionY2) {
                            ProjectId projectIdM1079boximpl2 = ProjectId.m1079boximpl(((ProjectDoc) obj2).m413getProject_uuid5pmjbU());
                            Object arrayList2 = linkedHashMap2.get(projectIdM1079boximpl2);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                linkedHashMap2.put(projectIdM1079boximpl2, arrayList2);
                            }
                            ((List) arrayList2).add(obj2);
                        }
                        return linkedHashMap2;
                    default:
                        nkd nkdVar2 = wqdVar.h;
                        kdg kdgVarJ = nkdVar2.j(kmd.H);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator<E> it = kdgVarJ.iterator();
                        while (it.hasNext()) {
                            Project projectB = nkdVar2.b(((ProjectId) it.next()).m1085unboximpl());
                            if (projectB != null) {
                                arrayList3.add(projectB);
                            }
                        }
                        List listI1 = w44.i1(arrayList3, new iec(6));
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj3 : listI1) {
                            if (((Project) obj3).getArchived_at() == null) {
                                arrayList4.add(obj3);
                            }
                        }
                        return arrayList4;
                }
            }
        });
        this.q = new mdg();
        this.r = new mdg();
        this.s = new mdg();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.wqd r7, java.lang.String r8, defpackage.vp4 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.fqd
            if (r0 == 0) goto L13
            r0 = r9
            fqd r0 = (defpackage.fqd) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            fqd r0 = new fqd
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.G
            int r1 = r0.I
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2e
            z9e r8 = r0.F
            java.lang.String r0 = r0.E
            defpackage.sf5.h0(r9)
            r6 = r9
            r9 = r8
            r8 = r0
            r0 = r6
            goto L4f
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r2
        L34:
            defpackage.sf5.h0(r9)
            z9e r9 = new z9e
            r9.<init>()
            omd r1 = r7.d
            java.lang.String r4 = r7.a
            r0.E = r8
            r0.F = r9
            r0.I = r3
            java.lang.Object r0 = r1.h(r4, r8, r0)
            m45 r1 = defpackage.m45.E
            if (r0 != r1) goto L4f
            return r1
        L4f:
            com.anthropic.claude.api.result.ApiResult r0 = (com.anthropic.claude.api.result.ApiResult) r0
            boolean r1 = r0 instanceof defpackage.of0
            if (r1 == 0) goto L6c
            r1 = r0
            of0 r1 = (defpackage.of0) r1
            java.lang.Object r1 = r1.b
            java.util.List r1 = (java.util.List) r1
            fj0 r2 = r7.n
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            gqd r4 = new gqd
            r5 = 0
            r4.<init>(r8, r5)
            r2.F(r1, r4)
            r9.E = r3
            goto L70
        L6c:
            boolean r8 = r0 instanceof defpackage.nf0
            if (r8 == 0) goto L7c
        L70:
            zy1 r7 = r7.i
            com.anthropic.claude.ui.components.snackbar.a.a(r0, r7)
            boolean r7 = r9.E
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L7c:
            defpackage.mr9.b()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqd.a(wqd, java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.wqd r8, java.lang.String r9, defpackage.vp4 r10) {
        /*
            boolean r0 = r10 instanceof defpackage.hqd
            if (r0 == 0) goto L13
            r0 = r10
            hqd r0 = (defpackage.hqd) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            hqd r0 = new hqd
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.G
            int r1 = r0.I
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            z9e r9 = r0.F
            java.lang.String r0 = r0.E
            defpackage.sf5.h0(r10)
            goto L4f
        L2a:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r8)
            return r2
        L30:
            defpackage.sf5.h0(r10)
            z9e r10 = new z9e
            r10.<init>()
            omd r1 = r8.d
            java.lang.String r4 = r8.a
            r0.E = r9
            r0.F = r10
            r0.I = r3
            java.lang.Object r0 = r1.a(r4, r9, r0)
            m45 r1 = defpackage.m45.E
            if (r0 != r1) goto L4b
            return r1
        L4b:
            r7 = r0
            r0 = r9
            r9 = r10
            r10 = r7
        L4f:
            com.anthropic.claude.api.result.ApiResult r10 = (com.anthropic.claude.api.result.ApiResult) r10
            boolean r1 = r10 instanceof defpackage.of0
            if (r1 == 0) goto L8f
            r1 = r10
            of0 r1 = (defpackage.of0) r1
            java.lang.Object r1 = r1.b
            java.util.List r1 = (java.util.List) r1
            fj0 r2 = r8.l
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.x44.y(r1, r5)
            r4.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L6f:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L84
            java.lang.Object r5 = r1.next()
            com.anthropic.claude.api.chat.MessageFile r5 = (com.anthropic.claude.api.chat.MessageFile) r5
            wld r6 = new wld
            r6.<init>(r5, r0)
            r4.add(r6)
            goto L6f
        L84:
            gqd r1 = new gqd
            r1.<init>(r0, r3)
            r2.F(r4, r1)
            r9.E = r3
            goto L93
        L8f:
            boolean r0 = r10 instanceof defpackage.nf0
            if (r0 == 0) goto L9f
        L93:
            zy1 r8 = r8.i
            com.anthropic.claude.ui.components.snackbar.a.a(r10, r8)
            boolean r8 = r9.E
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        L9f:
            defpackage.mr9.b()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqd.b(wqd, java.lang.String, vp4):java.lang.Object");
    }

    public final Project c(String str) {
        str.getClass();
        return this.h.b(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r11, java.lang.String r12, int r13, java.lang.String r14, com.anthropic.claude.analytics.events.ProjectsEvents$ProjectDocumentSource r15, com.anthropic.claude.analytics.events.ProjectsEvents$ProjectUploadSource r16, defpackage.vp4 r17) {
        /*
            r10 = this;
            r2 = r17
            boolean r3 = r2 instanceof defpackage.zpd
            if (r3 == 0) goto L15
            r3 = r2
            zpd r3 = (defpackage.zpd) r3
            int r4 = r3.K
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L15
            int r4 = r4 - r5
            r3.K = r4
            goto L1a
        L15:
            zpd r3 = new zpd
            r3.<init>(r10, r2)
        L1a:
            java.lang.Object r2 = r3.I
            int r4 = r3.K
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L3a
            if (r4 != r6) goto L34
            int r1 = r3.H
            com.anthropic.claude.analytics.events.ProjectsEvents$ProjectUploadSource r4 = r3.G
            com.anthropic.claude.analytics.events.ProjectsEvents$ProjectDocumentSource r6 = r3.F
            java.lang.String r3 = r3.E
            defpackage.sf5.h0(r2)
            r8 = r1
            r1 = r3
            r7 = r4
            r4 = r6
            goto L5e
        L34:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r0)
            return r5
        L3a:
            defpackage.sf5.h0(r2)
            com.anthropic.claude.api.project.ProjectDocsCreateParams r2 = new com.anthropic.claude.api.project.ProjectDocsCreateParams
            r2.<init>(r12, r14)
            r3.E = r11
            r3.F = r15
            r7 = r16
            r3.G = r7
            r3.H = r13
            r3.K = r6
            omd r6 = r10.d
            java.lang.String r9 = r10.a
            java.lang.Object r2 = r6.b(r9, r11, r2, r3)
            m45 r3 = defpackage.m45.E
            if (r2 != r3) goto L5b
            return r3
        L5b:
            r1 = r11
            r8 = r13
            r4 = r15
        L5e:
            com.anthropic.claude.api.result.ApiResult r2 = (com.anthropic.claude.api.result.ApiResult) r2
            boolean r3 = r2 instanceof defpackage.of0
            if (r3 == 0) goto L97
            r3 = r2
            of0 r3 = (defpackage.of0) r3
            java.lang.Object r3 = r3.b
            com.anthropic.claude.api.project.ProjectDoc r3 = (com.anthropic.claude.api.project.ProjectDoc) r3
            com.anthropic.claude.analytics.events.ProjectsEvents$ProjectDocumentAdded r5 = new com.anthropic.claude.analytics.events.ProjectsEvents$ProjectDocumentAdded
            java.lang.String r6 = r10.a
            java.lang.String r9 = r3.m414getUuidH8pzoGc()
            r13 = r1
            r16 = r4
            r11 = r5
            r12 = r6
            r17 = r7
            r15 = r8
            r14 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r1 = r11
            java.lang.Class<com.anthropic.claude.analytics.events.ProjectsEvents$ProjectDocumentAdded> r4 = com.anthropic.claude.analytics.events.ProjectsEvents$ProjectDocumentAdded.class
            eo9 r4 = defpackage.jce.b(r4)
            kotlinx.serialization.KSerializer r4 = defpackage.iv1.J(r4)
            znf r4 = (defpackage.znf) r4
            qi3 r5 = r10.f
            r5.e(r1, r4)
            fj0 r1 = r10.n
            r1.S(r3)
            goto L9b
        L97:
            boolean r1 = r2 instanceof defpackage.nf0
            if (r1 == 0) goto La1
        L9b:
            zy1 r0 = r10.i
            com.anthropic.claude.ui.components.snackbar.a.a(r2, r0)
            return r2
        La1:
            defpackage.mr9.b()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqd.d(java.lang.String, java.lang.String, int, java.lang.String, com.anthropic.claude.analytics.events.ProjectsEvents$ProjectDocumentSource, com.anthropic.claude.analytics.events.ProjectsEvents$ProjectUploadSource, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r6, java.lang.String r7, com.anthropic.claude.analytics.events.ProjectsEvents$ProjectUploadSource r8, defpackage.vp4 r9) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqd.e(java.lang.String, java.lang.String, com.anthropic.claude.analytics.events.ProjectsEvents$ProjectUploadSource, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r8, java.util.List r9, com.anthropic.claude.analytics.events.ProjectsEvents$ProjectUploadSource r10, defpackage.vp4 r11) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqd.f(java.lang.String, java.util.List, com.anthropic.claude.analytics.events.ProjectsEvents$ProjectUploadSource, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r7, defpackage.vp4 r8) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqd.g(java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r9, defpackage.vp4 r10) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqd.h(java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r9, defpackage.vp4 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.eqd
            if (r0 == 0) goto L13
            r0 = r10
            eqd r0 = (defpackage.eqd) r0
            int r1 = r0.J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.J = r1
            goto L18
        L13:
            eqd r0 = new eqd
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.H
            int r1 = r0.J
            r2 = 0
            r3 = 2
            r4 = 1
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L3d
            if (r1 == r4) goto L37
            if (r1 != r3) goto L31
            com.anthropic.claude.api.project.Project r9 = r0.G
            of0 r1 = r0.F
            z9e r0 = r0.E
            defpackage.sf5.h0(r10)
            goto L78
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r8)
            return r2
        L37:
            z9e r9 = r0.E
            defpackage.sf5.h0(r10)
            goto L57
        L3d:
            defpackage.sf5.h0(r10)
            z9e r10 = new z9e
            r10.<init>()
            r0.E = r10
            r0.J = r4
            mkd r1 = r8.c
            java.lang.String r6 = r8.a
            java.lang.Object r9 = r1.b(r6, r9, r0)
            if (r9 != r5) goto L54
            goto L75
        L54:
            r7 = r10
            r10 = r9
            r9 = r7
        L57:
            r1 = r10
            com.anthropic.claude.api.result.ApiResult r1 = (com.anthropic.claude.api.result.ApiResult) r1
            boolean r10 = r1 instanceof defpackage.of0
            if (r10 == 0) goto L94
            r10 = r1
            of0 r10 = (defpackage.of0) r10
            java.lang.Object r2 = r10.b
            com.anthropic.claude.api.project.Project r2 = (com.anthropic.claude.api.project.Project) r2
            r0.E = r9
            r0.F = r10
            r0.G = r2
            r0.J = r3
            nkd r10 = r8.h
            java.lang.Object r10 = r10.f(r2, r0)
            if (r10 != r5) goto L76
        L75:
            return r5
        L76:
            r0 = r9
            r9 = r2
        L78:
            java.lang.String r9 = r9.m404getUuid5pmjbU()
            com.anthropic.claude.types.strings.ProjectId r9 = com.anthropic.claude.types.strings.ProjectId.m1079boximpl(r9)
            mn5 r10 = r8.e
            long r2 = r10.a()
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r2)
            mdg r2 = r8.q
            r2.put(r9, r10)
            r0.E = r4
            r9 = r0
            goto L98
        L94:
            boolean r10 = r1 instanceof defpackage.nf0
            if (r10 == 0) goto La4
        L98:
            zy1 r8 = r8.i
            com.anthropic.claude.ui.components.snackbar.a.a(r1, r8)
            boolean r8 = r9.E
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        La4:
            defpackage.mr9.b()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqd.i(java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0108, code lost:
    
        if (r10.e(r9, r11, r12) == r15) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0125, code lost:
    
        if (defpackage.iei.a == r15) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0128, code lost:
    
        r9 = r1;
        r1 = r4;
        r2 = r6;
        r4 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.gnd r22, int r23, defpackage.vp4 r24) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqd.j(gnd, int, vp4):java.lang.Object");
    }

    public final wpd k(gnd gndVar, String str) {
        gndVar.getClass();
        wpd wpdVar = (wpd) this.k.get(new tnd(gndVar, str));
        return wpdVar == null ? new wpd() : wpdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(com.anthropic.claude.api.project.Project r8, defpackage.vp4 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.kqd
            if (r0 == 0) goto L13
            r0 = r9
            kqd r0 = (defpackage.kqd) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            kqd r0 = new kqd
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.F
            int r1 = r0.H
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            nkd r7 = r7.h
            m45 r6 = defpackage.m45.E
            if (r1 == 0) goto L42
            if (r1 == r5) goto L3c
            if (r1 == r4) goto L36
            if (r1 != r3) goto L30
            defpackage.sf5.h0(r9)
            return r9
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r2
        L36:
            com.anthropic.claude.api.project.Project r8 = r0.E
            defpackage.sf5.h0(r9)
            goto L61
        L3c:
            com.anthropic.claude.api.project.Project r8 = r0.E
            defpackage.sf5.h0(r9)
            goto L50
        L42:
            defpackage.sf5.h0(r9)
            r0.E = r8
            r0.H = r5
            java.lang.Object r9 = r7.f(r8, r0)
            if (r9 != r6) goto L50
            goto L77
        L50:
            java.lang.String r9 = r8.m404getUuid5pmjbU()
            r0.E = r8
            r0.H = r4
            kmd r1 = defpackage.kmd.E
            java.lang.Object r9 = r7.h(r1, r9, r0)
            if (r9 != r6) goto L61
            goto L77
        L61:
            boolean r9 = r8.is_private()
            if (r9 != 0) goto L79
            java.lang.String r8 = r8.m404getUuid5pmjbU()
            r0.E = r2
            r0.H = r3
            kmd r9 = defpackage.kmd.F
            java.lang.Object r7 = r7.h(r9, r8, r0)
            if (r7 != r6) goto L78
        L77:
            return r6
        L78:
            return r7
        L79:
            iei r7 = defpackage.iei.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqd.l(com.anthropic.claude.api.project.Project, vp4):java.lang.Object");
    }

    public final boolean m(gnd gndVar) {
        gndVar.getClass();
        return x44.r(this.j.get(gndVar), Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.vp4 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.lqd
            if (r0 == 0) goto L13
            r0 = r5
            lqd r0 = (defpackage.lqd) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            lqd r0 = new lqd
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.F
            int r1 = r0.H
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            java.util.Iterator r1 = r0.E
            defpackage.sf5.h0(r5)
            goto L38
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.sf5.h0(r5)
            gq6 r5 = defpackage.kmd.M
            java.util.Iterator r5 = r5.iterator()
            r1 = r5
        L38:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L53
            java.lang.Object r5 = r1.next()
            kmd r5 = (defpackage.kmd) r5
            r0.E = r1
            r0.H = r2
            nkd r3 = r4.h
            java.lang.Object r5 = r3.g(r5, r0)
            m45 r3 = defpackage.m45.E
            if (r5 != r3) goto L38
            return r3
        L53:
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqd.n(vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.gnd r6, defpackage.vp4 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.mqd
            if (r0 == 0) goto L13
            r0 = r7
            mqd r0 = (defpackage.mqd) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            mqd r0 = new mqd
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.E
            int r1 = r0.G
            r2 = 1
            iei r3 = defpackage.iei.a
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            defpackage.sf5.h0(r7)
            return r3
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            r5 = 0
            return r5
        L2e:
            defpackage.sf5.h0(r7)
            mdg r7 = r5.j
            java.lang.Object r7 = r7.get(r6)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r7 = defpackage.x44.r(r7, r1)
            if (r7 == 0) goto L40
            goto L76
        L40:
            tnd r7 = new tnd
            r7.<init>(r6)
            mdg r4 = r5.k
            java.lang.Object r7 = r4.get(r7)
            wpd r7 = (defpackage.wpd) r7
            if (r7 != 0) goto L50
            goto L76
        L50:
            java.lang.Boolean r4 = r7.a
            boolean r1 = defpackage.x44.r(r4, r1)
            if (r1 == 0) goto L76
            boolean r7 = r7.b
            if (r7 == 0) goto L5d
            goto L76
        L5d:
            nkd r7 = r5.h
            kmd r1 = defpackage.iik.h(r6)
            kdg r7 = r7.j(r1)
            int r7 = r7.size()
            r0.G = r2
            java.lang.Object r5 = r5.j(r6, r7, r0)
            m45 r6 = defpackage.m45.E
            if (r5 != r6) goto L76
            return r6
        L76:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqd.o(gnd, vp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x010c, code lost:
    
        if (defpackage.iei.a == r13) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.gnd r20, java.lang.String r21, defpackage.vp4 r22) {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqd.p(gnd, java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.lang.String r9, com.anthropic.claude.api.project.Project r10, boolean r11, defpackage.vp4 r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof defpackage.oqd
            if (r0 == 0) goto L13
            r0 = r12
            oqd r0 = (defpackage.oqd) r0
            int r1 = r0.J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.J = r1
            goto L18
        L13:
            oqd r0 = new oqd
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.H
            int r1 = r0.J
            r2 = 3
            r3 = 2
            r4 = 1
            nkd r5 = r8.h
            r6 = 0
            m45 r7 = defpackage.m45.E
            if (r1 == 0) goto L44
            if (r1 == r4) goto L40
            if (r1 == r3) goto L36
            if (r1 != r2) goto L30
            defpackage.sf5.h0(r12)
            return r12
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r8)
            return r6
        L36:
            boolean r11 = r0.G
            com.anthropic.claude.api.project.Project r10 = r0.F
            java.lang.String r9 = r0.E
            defpackage.sf5.h0(r12)
            goto L8b
        L40:
            defpackage.sf5.h0(r12)
            return r12
        L44:
            defpackage.sf5.h0(r12)
            if (r11 == 0) goto L5b
            r0.E = r6
            r0.F = r6
            r0.G = r11
            r0.J = r4
            kmd r8 = defpackage.kmd.K
            java.lang.Object r8 = r5.h(r8, r9, r0)
            if (r8 != r7) goto L5a
            goto La1
        L5a:
            return r8
        L5b:
            if (r10 == 0) goto La3
            com.anthropic.claude.api.project.ProjectActorAccount r12 = r10.getCreator()
            if (r12 == 0) goto L68
            java.lang.String r12 = r12.m408getUuidislZJdo()
            goto L69
        L68:
            r12 = r6
        L69:
            koi r8 = r8.b
            java.lang.String r8 = r8.d
            if (r12 != 0) goto L71
            r8 = 0
            goto L75
        L71:
            boolean r8 = com.anthropic.claude.types.strings.AccountId.m946equalsimpl0(r12, r8)
        L75:
            if (r8 == 0) goto L7a
            kmd r8 = defpackage.kmd.E
            goto L7c
        L7a:
            kmd r8 = defpackage.kmd.G
        L7c:
            r0.E = r9
            r0.F = r10
            r0.G = r11
            r0.J = r3
            java.lang.Object r8 = r5.h(r8, r9, r0)
            if (r8 != r7) goto L8b
            goto La1
        L8b:
            boolean r8 = r10.is_private()
            if (r8 != 0) goto La3
            r0.E = r6
            r0.F = r6
            r0.G = r11
            r0.J = r2
            kmd r8 = defpackage.kmd.F
            java.lang.Object r8 = r5.h(r8, r9, r0)
            if (r8 != r7) goto La2
        La1:
            return r7
        La2:
            return r8
        La3:
            iei r8 = defpackage.iei.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqd.q(java.lang.String, com.anthropic.claude.api.project.Project, boolean, vp4):java.lang.Object");
    }

    public final ArrayList r(gnd gndVar) {
        gndVar.getClass();
        kmd kmdVarH = iik.h(gndVar);
        nkd nkdVar = this.h;
        kdg kdgVarJ = nkdVar.j(kmdVarH);
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = kdgVarJ.iterator();
        while (it.hasNext()) {
            Project projectB = nkdVar.b(((ProjectId) it.next()).m1085unboximpl());
            if (projectB != null) {
                arrayList.add(projectB);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if ((((Project) obj).getArchived_at() != null) == (gndVar == gnd.I)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        if (r14.h.e(defpackage.kmd.H, r2, r8) == r13) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.vp4 r15) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqd.s(vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(defpackage.gnd r19, java.lang.String r20, defpackage.vp4 r21) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqd.t(gnd, java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x011a, code lost:
    
        if (v(r22, r9, r4) == r12) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[PHI: r1 r2 r3 r5
      0x0061: PHI (r1v8 java.lang.Object) = (r1v7 java.lang.Object), (r1v1 java.lang.Object) binds: [B:39:0x00f1, B:19:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0061: PHI (r2v4 boolean) = (r2v3 boolean), (r2v12 boolean) binds: [B:39:0x00f1, B:19:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0061: PHI (r3v4 java.util.Date) = (r3v3 java.util.Date), (r3v12 java.util.Date) binds: [B:39:0x00f1, B:19:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0061: PHI (r5v5 java.lang.String) = (r5v4 java.lang.String), (r5v15 java.lang.String) binds: [B:39:0x00f1, B:19:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(defpackage.vp4 r24, java.lang.String r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqd.u(vp4, java.lang.String, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.String r5, defpackage.bz7 r6, defpackage.vp4 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.sqd
            if (r0 == 0) goto L13
            r0 = r7
            sqd r0 = (defpackage.sqd) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            sqd r0 = new sqd
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.E
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.sf5.h0(r7)
            goto L4b
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.sf5.h0(r7)
            com.anthropic.claude.api.project.Project r5 = r4.c(r5)
            if (r5 != 0) goto L38
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L38:
            java.lang.Object r5 = r6.invoke(r5)
            com.anthropic.claude.api.project.Project r5 = (com.anthropic.claude.api.project.Project) r5
            r0.G = r2
            nkd r4 = r4.h
            java.lang.Object r4 = r4.f(r5, r0)
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L4b
            return r5
        L4b:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqd.v(java.lang.String, bz7, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(java.lang.String r22, java.lang.String r23, defpackage.vp4 r24) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqd.w(java.lang.String, java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(defpackage.vp4 r23, java.lang.String r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqd.x(vp4, java.lang.String, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(java.lang.String r15, defpackage.gub r16, int r17, com.anthropic.claude.analytics.events.ProjectsEvents$ProjectFileSource r18, boolean r19, com.anthropic.claude.analytics.events.ProjectsEvents$ProjectUploadSource r20, defpackage.vp4 r21) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqd.y(java.lang.String, gub, int, com.anthropic.claude.analytics.events.ProjectsEvents$ProjectFileSource, boolean, com.anthropic.claude.analytics.events.ProjectsEvents$ProjectUploadSource, vp4):java.lang.Object");
    }
}
