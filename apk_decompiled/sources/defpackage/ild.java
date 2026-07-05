package defpackage;

import com.anthropic.claude.project.details.ProjectDetailsScreenParams;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class ild extends iwe {
    public static final /* synthetic */ int A = 0;
    public static final long z;
    public final ProjectDetailsScreenParams b;
    public final koi c;
    public final kab d;
    public final vd3 e;
    public final mkd f;
    public final wqd g;
    public final fod h;
    public final vn5 i;
    public final f1c j;
    public final a8f k;
    public final mn5 l;
    public final zy1 m;
    public final lsc n;
    public final lsc o;
    public final lsc p;
    public final lsc q;
    public final wz5 r;
    public final lsc s;
    public final wz5 t;
    public final wz5 u;
    public final lsc v;
    public final wz5 w;
    public final lsc x;
    public boolean y;

    static {
        lz1 lz1Var = uh6.F;
        z = uh6.f(v40.Q(1, zh6.MINUTES));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ild(ProjectDetailsScreenParams projectDetailsScreenParams, koi koiVar, kab kabVar, vd3 vd3Var, mkd mkdVar, wqd wqdVar, fod fodVar, vn5 vn5Var, f1c f1cVar, a8f a8fVar, mn5 mn5Var, h86 h86Var) {
        super(h86Var);
        projectDetailsScreenParams.getClass();
        this.b = projectDetailsScreenParams;
        this.c = koiVar;
        this.d = kabVar;
        this.e = vd3Var;
        this.f = mkdVar;
        this.g = wqdVar;
        this.h = fodVar;
        this.i = vn5Var;
        this.j = f1cVar;
        this.k = a8fVar;
        this.l = mn5Var;
        this.m = x44.a();
        Boolean bool = Boolean.FALSE;
        this.n = mpk.P(bool);
        this.o = mpk.P(bool);
        this.p = mpk.P(bool);
        this.q = mpk.P(null);
        int i = 0;
        this.r = mpk.w(new ald(this, i));
        this.s = mpk.P(bool);
        this.t = mpk.w(new ald(this, 1));
        this.u = mpk.w(new ald(this, 2));
        this.v = mpk.P(lm6.E);
        this.w = mpk.w(new ald(this, 3));
        this.x = mpk.P(new Date());
        gb9.D(this.a, null, null, new bld(this, null, i), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O(defpackage.ild r8, defpackage.vp4 r9) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ild.O(ild, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P(defpackage.ild r6, defpackage.vp4 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.dld
            if (r0 == 0) goto L13
            r0 = r7
            dld r0 = (defpackage.dld) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            dld r0 = new dld
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.F
            int r1 = r0.H
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            java.lang.String r0 = r0.E
            defpackage.sf5.h0(r7)
            goto L49
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            r6 = 0
            return r6
        L2e:
            defpackage.sf5.h0(r7)
            com.anthropic.claude.project.details.ProjectDetailsScreenParams r7 = r6.b
            java.lang.String r7 = r7.m789getProjectId5pmjbU()
            wqd r1 = r6.g
            r0.E = r7
            r0.H = r2
            java.lang.Object r0 = r1.i(r7, r0)
            m45 r1 = defpackage.m45.E
            if (r0 != r1) goto L46
            return r1
        L46:
            r5 = r0
            r0 = r7
            r7 = r5
        L49:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r1 = r7.booleanValue()
            if (r1 != 0) goto Laf
            yfa r1 = defpackage.zfa.a
            r1.getClass()
            boolean r1 = defpackage.yfa.b()
            if (r1 != 0) goto L5d
            goto Laf
        L5d:
            java.lang.String r6 = defpackage.iuj.E(r6)
            java.util.concurrent.CopyOnWriteArrayList r1 = defpackage.yfa.b
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L6c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L82
            java.lang.Object r3 = r1.next()
            r4 = r3
            zfa r4 = (defpackage.zfa) r4
            n30 r4 = (defpackage.n30) r4
            r4.getClass()
            r2.add(r3)
            goto L6c
        L82:
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto Laf
            yfa r1 = defpackage.zfa.a
            r1.getClass()
            java.lang.String r0 = com.anthropic.claude.types.strings.ProjectId.m1084toStringimpl(r0)
            java.lang.String r1 = "Failed to fetch project details "
            java.lang.String r0 = defpackage.ij0.i(r1, r0)
            java.util.Iterator r1 = r2.iterator()
        L9b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Laf
            java.lang.Object r2 = r1.next()
            zfa r2 = (defpackage.zfa) r2
            n30 r2 = (defpackage.n30) r2
            sfa r3 = defpackage.sfa.ERROR
            r2.b(r3, r6, r0)
            goto L9b
        Laf:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ild.P(ild, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Q(defpackage.ild r8, defpackage.vp4 r9) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ild.Q(ild, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0090 A[LOOP:0: B:31:0x008a->B:33:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object R(defpackage.ild r7, defpackage.vp4 r8) {
        /*
            com.anthropic.claude.project.details.ProjectDetailsScreenParams r0 = r7.b
            boolean r1 = r8 instanceof defpackage.fld
            if (r1 == 0) goto L15
            r1 = r8
            fld r1 = (defpackage.fld) r1
            int r2 = r1.I
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.I = r2
            goto L1a
        L15:
            fld r1 = new fld
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r1.G
            int r2 = r1.I
            r3 = 0
            r4 = 2
            r5 = 1
            m45 r6 = defpackage.m45.E
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L31
            ild r0 = r1.F
            com.anthropic.claude.api.project.Project r1 = r1.E
            defpackage.sf5.h0(r8)
            goto L79
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r3
        L37:
            defpackage.sf5.h0(r8)
            goto L5e
        L3b:
            defpackage.sf5.h0(r8)
            boolean r8 = r7.S()
            wqd r2 = r7.g
            if (r8 == 0) goto L4f
            java.lang.String r7 = r0.m789getProjectId5pmjbU()
            com.anthropic.claude.api.project.Project r7 = r2.c(r7)
            return r7
        L4f:
            java.lang.String r8 = r0.m789getProjectId5pmjbU()
            r1.I = r5
            nkd r2 = r2.h
            java.lang.Object r8 = r2.d(r8, r1)
            if (r8 != r6) goto L5e
            goto L75
        L5e:
            com.anthropic.claude.api.project.Project r8 = (com.anthropic.claude.api.project.Project) r8
            if (r8 != 0) goto L63
            return r3
        L63:
            vd3 r2 = r7.e
            java.lang.String r0 = r0.m789getProjectId5pmjbU()
            r1.E = r8
            r1.F = r7
            r1.I = r4
            java.lang.Object r0 = r2.l(r0, r1)
            if (r0 != r6) goto L76
        L75:
            return r6
        L76:
            r1 = r8
            r8 = r0
            r0 = r7
        L79:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = defpackage.x44.y(r8, r3)
            r2.<init>(r3)
            java.util.Iterator r8 = r8.iterator()
        L8a:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L9e
            java.lang.Object r3 = r8.next()
            com.anthropic.claude.api.chat.ChatConversationWithProjectReference r3 = (com.anthropic.claude.api.chat.ChatConversationWithProjectReference) r3
            com.anthropic.claude.api.chat.ChatConversation r3 = defpackage.nkk.k(r3)
            r2.add(r3)
            goto L8a
        L9e:
            lsc r8 = r0.v
            r8.setValue(r2)
            lsc r7 = r7.n
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r7.setValue(r8)
            java.util.List r7 = defpackage.xah.a
            vba r7 = defpackage.vba.CACHE
            defpackage.xah.b(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ild.R(ild, vp4):java.lang.Object");
    }

    public final boolean S() {
        return ((Boolean) this.n.getValue()).booleanValue();
    }

    public final void o() {
        gb9.D(this.a, null, null, new gld(this, null), 3);
    }
}
