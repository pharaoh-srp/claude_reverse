package defpackage;

import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.api.common.ConsistencyLevel;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.api.referral.ReferralEligibility;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class yn8 extends iwe implements un8 {
    public static final long C;
    public final wz5 A;
    public final wz5 B;
    public final q7 b;
    public final koi c;
    public final vd3 d;
    public final wqd e;
    public final vn5 f;
    public final qzb g;
    public final zf6 h;
    public final tae i;
    public final kae j;
    public final kf6 k;
    public final lsc l;
    public final lsc m;
    public final lsc n;
    public final wz5 o;
    public final wz5 p;
    public final wlg q;
    public final wz5 r;
    public final wlg s;
    public final wlg t;
    public final wlg u;
    public final a4e v;
    public final wlg w;
    public final wz5 x;
    public final wz5 y;
    public final wz5 z;

    static {
        lz1 lz1Var = uh6.F;
        C = uh6.f(v40.Q(10, zh6.MINUTES));
    }

    public yn8(q7 q7Var, koi koiVar, vd3 vd3Var, wqd wqdVar, pkc pkcVar, vn5 vn5Var, vpd vpdVar, qzb qzbVar, zf6 zf6Var, tae taeVar, kae kaeVar, kf6 kf6Var, rc8 rc8Var, nf7 nf7Var, h86 h86Var) {
        super(h86Var);
        this.b = q7Var;
        this.c = koiVar;
        this.d = vd3Var;
        this.e = wqdVar;
        this.f = vn5Var;
        this.g = qzbVar;
        this.h = zf6Var;
        this.i = taeVar;
        this.j = kaeVar;
        this.k = kf6Var;
        Boolean bool = Boolean.FALSE;
        this.l = mpk.P(bool);
        this.m = mpk.P(bool);
        this.n = mpk.P(bool);
        final int i = 0;
        this.o = mpk.w(new zy7(this) { // from class: vn8
            public final /* synthetic */ yn8 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i2 = i;
                yn8 yn8Var = this.F;
                switch (i2) {
                    case 0:
                        return eve.E(yn8Var.b.a().getFull_name(), "");
                    case 1:
                        q7 q7Var2 = yn8Var.b;
                        String display_name = q7Var2.a().getDisplay_name();
                        if (display_name != null) {
                            return display_name;
                        }
                        String full_name = q7Var2.a().getFull_name();
                        return full_name == null ? q7Var2.a().m105getEmail_addressZiuLfiY() : full_name;
                    case 2:
                        return Boolean.valueOf(yn8Var.c.h());
                    case 3:
                        return Boolean.valueOf(((Boolean) yn8Var.d.i.getValue()).booleanValue() || ((Boolean) yn8Var.n.getValue()).booleanValue());
                    case 4:
                        if (((Boolean) yn8Var.l.getValue()).booleanValue() && ((Boolean) yn8Var.m.getValue()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 5:
                        return w44.j1((List) yn8Var.d.l.getValue(), 10);
                    case 6:
                        return (List) yn8Var.d.m.getValue();
                    default:
                        if (!yn8Var.N()) {
                            return lm6.E;
                        }
                        List list = (List) yn8Var.e.p.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            if (okk.P((Project) obj)) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                }
            }
        });
        final int i2 = 1;
        this.p = mpk.w(new zy7(this) { // from class: vn8
            public final /* synthetic */ yn8 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i2;
                yn8 yn8Var = this.F;
                switch (i22) {
                    case 0:
                        return eve.E(yn8Var.b.a().getFull_name(), "");
                    case 1:
                        q7 q7Var2 = yn8Var.b;
                        String display_name = q7Var2.a().getDisplay_name();
                        if (display_name != null) {
                            return display_name;
                        }
                        String full_name = q7Var2.a().getFull_name();
                        return full_name == null ? q7Var2.a().m105getEmail_addressZiuLfiY() : full_name;
                    case 2:
                        return Boolean.valueOf(yn8Var.c.h());
                    case 3:
                        return Boolean.valueOf(((Boolean) yn8Var.d.i.getValue()).booleanValue() || ((Boolean) yn8Var.n.getValue()).booleanValue());
                    case 4:
                        if (((Boolean) yn8Var.l.getValue()).booleanValue() && ((Boolean) yn8Var.m.getValue()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 5:
                        return w44.j1((List) yn8Var.d.l.getValue(), 10);
                    case 6:
                        return (List) yn8Var.d.m.getValue();
                    default:
                        if (!yn8Var.N()) {
                            return lm6.E;
                        }
                        List list = (List) yn8Var.e.p.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            if (okk.P((Project) obj)) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                }
            }
        });
        this.q = nf7Var.a();
        this.r = vpdVar.d;
        this.s = rc8Var.m("mobile_artifacts_gallery");
        this.t = rc8Var.m("squares_enabled_mobile");
        this.u = rc8Var.m("claude_ai_tasks_nav");
        final int i3 = 7;
        this.v = j8.f0(zf6Var.b, this.a, v3g.a, new uf6((List) null, (List) null, 7));
        this.w = rc8Var.m("mobile_android_drawer_footer_redesign");
        final int i4 = 2;
        mpk.w(new zy7(this) { // from class: vn8
            public final /* synthetic */ yn8 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i4;
                yn8 yn8Var = this.F;
                switch (i22) {
                    case 0:
                        return eve.E(yn8Var.b.a().getFull_name(), "");
                    case 1:
                        q7 q7Var2 = yn8Var.b;
                        String display_name = q7Var2.a().getDisplay_name();
                        if (display_name != null) {
                            return display_name;
                        }
                        String full_name = q7Var2.a().getFull_name();
                        return full_name == null ? q7Var2.a().m105getEmail_addressZiuLfiY() : full_name;
                    case 2:
                        return Boolean.valueOf(yn8Var.c.h());
                    case 3:
                        return Boolean.valueOf(((Boolean) yn8Var.d.i.getValue()).booleanValue() || ((Boolean) yn8Var.n.getValue()).booleanValue());
                    case 4:
                        if (((Boolean) yn8Var.l.getValue()).booleanValue() && ((Boolean) yn8Var.m.getValue()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 5:
                        return w44.j1((List) yn8Var.d.l.getValue(), 10);
                    case 6:
                        return (List) yn8Var.d.m.getValue();
                    default:
                        if (!yn8Var.N()) {
                            return lm6.E;
                        }
                        List list = (List) yn8Var.e.p.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            if (okk.P((Project) obj)) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                }
            }
        });
        final int i5 = 3;
        this.x = mpk.w(new zy7(this) { // from class: vn8
            public final /* synthetic */ yn8 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i5;
                yn8 yn8Var = this.F;
                switch (i22) {
                    case 0:
                        return eve.E(yn8Var.b.a().getFull_name(), "");
                    case 1:
                        q7 q7Var2 = yn8Var.b;
                        String display_name = q7Var2.a().getDisplay_name();
                        if (display_name != null) {
                            return display_name;
                        }
                        String full_name = q7Var2.a().getFull_name();
                        return full_name == null ? q7Var2.a().m105getEmail_addressZiuLfiY() : full_name;
                    case 2:
                        return Boolean.valueOf(yn8Var.c.h());
                    case 3:
                        return Boolean.valueOf(((Boolean) yn8Var.d.i.getValue()).booleanValue() || ((Boolean) yn8Var.n.getValue()).booleanValue());
                    case 4:
                        if (((Boolean) yn8Var.l.getValue()).booleanValue() && ((Boolean) yn8Var.m.getValue()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 5:
                        return w44.j1((List) yn8Var.d.l.getValue(), 10);
                    case 6:
                        return (List) yn8Var.d.m.getValue();
                    default:
                        if (!yn8Var.N()) {
                            return lm6.E;
                        }
                        List list = (List) yn8Var.e.p.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            if (okk.P((Project) obj)) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                }
            }
        });
        final int i6 = 4;
        this.y = mpk.w(new zy7(this) { // from class: vn8
            public final /* synthetic */ yn8 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i6;
                yn8 yn8Var = this.F;
                switch (i22) {
                    case 0:
                        return eve.E(yn8Var.b.a().getFull_name(), "");
                    case 1:
                        q7 q7Var2 = yn8Var.b;
                        String display_name = q7Var2.a().getDisplay_name();
                        if (display_name != null) {
                            return display_name;
                        }
                        String full_name = q7Var2.a().getFull_name();
                        return full_name == null ? q7Var2.a().m105getEmail_addressZiuLfiY() : full_name;
                    case 2:
                        return Boolean.valueOf(yn8Var.c.h());
                    case 3:
                        return Boolean.valueOf(((Boolean) yn8Var.d.i.getValue()).booleanValue() || ((Boolean) yn8Var.n.getValue()).booleanValue());
                    case 4:
                        if (((Boolean) yn8Var.l.getValue()).booleanValue() && ((Boolean) yn8Var.m.getValue()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 5:
                        return w44.j1((List) yn8Var.d.l.getValue(), 10);
                    case 6:
                        return (List) yn8Var.d.m.getValue();
                    default:
                        if (!yn8Var.N()) {
                            return lm6.E;
                        }
                        List list = (List) yn8Var.e.p.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            if (okk.P((Project) obj)) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                }
            }
        });
        final int i7 = 5;
        this.z = mpk.w(new zy7(this) { // from class: vn8
            public final /* synthetic */ yn8 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i7;
                yn8 yn8Var = this.F;
                switch (i22) {
                    case 0:
                        return eve.E(yn8Var.b.a().getFull_name(), "");
                    case 1:
                        q7 q7Var2 = yn8Var.b;
                        String display_name = q7Var2.a().getDisplay_name();
                        if (display_name != null) {
                            return display_name;
                        }
                        String full_name = q7Var2.a().getFull_name();
                        return full_name == null ? q7Var2.a().m105getEmail_addressZiuLfiY() : full_name;
                    case 2:
                        return Boolean.valueOf(yn8Var.c.h());
                    case 3:
                        return Boolean.valueOf(((Boolean) yn8Var.d.i.getValue()).booleanValue() || ((Boolean) yn8Var.n.getValue()).booleanValue());
                    case 4:
                        if (((Boolean) yn8Var.l.getValue()).booleanValue() && ((Boolean) yn8Var.m.getValue()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 5:
                        return w44.j1((List) yn8Var.d.l.getValue(), 10);
                    case 6:
                        return (List) yn8Var.d.m.getValue();
                    default:
                        if (!yn8Var.N()) {
                            return lm6.E;
                        }
                        List list = (List) yn8Var.e.p.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            if (okk.P((Project) obj)) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                }
            }
        });
        final int i8 = 6;
        this.A = mpk.w(new zy7(this) { // from class: vn8
            public final /* synthetic */ yn8 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i8;
                yn8 yn8Var = this.F;
                switch (i22) {
                    case 0:
                        return eve.E(yn8Var.b.a().getFull_name(), "");
                    case 1:
                        q7 q7Var2 = yn8Var.b;
                        String display_name = q7Var2.a().getDisplay_name();
                        if (display_name != null) {
                            return display_name;
                        }
                        String full_name = q7Var2.a().getFull_name();
                        return full_name == null ? q7Var2.a().m105getEmail_addressZiuLfiY() : full_name;
                    case 2:
                        return Boolean.valueOf(yn8Var.c.h());
                    case 3:
                        return Boolean.valueOf(((Boolean) yn8Var.d.i.getValue()).booleanValue() || ((Boolean) yn8Var.n.getValue()).booleanValue());
                    case 4:
                        if (((Boolean) yn8Var.l.getValue()).booleanValue() && ((Boolean) yn8Var.m.getValue()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 5:
                        return w44.j1((List) yn8Var.d.l.getValue(), 10);
                    case 6:
                        return (List) yn8Var.d.m.getValue();
                    default:
                        if (!yn8Var.N()) {
                            return lm6.E;
                        }
                        List list = (List) yn8Var.e.p.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            if (okk.P((Project) obj)) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                }
            }
        });
        this.B = mpk.w(new zy7(this) { // from class: vn8
            public final /* synthetic */ yn8 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i3;
                yn8 yn8Var = this.F;
                switch (i22) {
                    case 0:
                        return eve.E(yn8Var.b.a().getFull_name(), "");
                    case 1:
                        q7 q7Var2 = yn8Var.b;
                        String display_name = q7Var2.a().getDisplay_name();
                        if (display_name != null) {
                            return display_name;
                        }
                        String full_name = q7Var2.a().getFull_name();
                        return full_name == null ? q7Var2.a().m105getEmail_addressZiuLfiY() : full_name;
                    case 2:
                        return Boolean.valueOf(yn8Var.c.h());
                    case 3:
                        return Boolean.valueOf(((Boolean) yn8Var.d.i.getValue()).booleanValue() || ((Boolean) yn8Var.n.getValue()).booleanValue());
                    case 4:
                        if (((Boolean) yn8Var.l.getValue()).booleanValue() && ((Boolean) yn8Var.m.getValue()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 5:
                        return w44.j1((List) yn8Var.d.l.getValue(), 10);
                    case 6:
                        return (List) yn8Var.d.m.getValue();
                    default:
                        if (!yn8Var.N()) {
                            return lm6.E;
                        }
                        List list = (List) yn8Var.e.p.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            if (okk.P((Project) obj)) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                }
            }
        });
        O(ConsistencyLevel.EVENTUAL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // defpackage.un8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(defpackage.uf6 r5, defpackage.tp4 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.xn8
            if (r0 == 0) goto L13
            r0 = r6
            xn8 r0 = (defpackage.xn8) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            xn8 r0 = new xn8
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L28
            defpackage.sf5.h0(r6)     // Catch: java.io.IOException -> L26
            goto L9d
        L26:
            r5 = move-exception
            goto L3f
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2f:
            defpackage.sf5.h0(r6)
            zf6 r6 = r4.h     // Catch: java.io.IOException -> L26
            r0.G = r2     // Catch: java.io.IOException -> L26
            java.lang.Object r4 = r6.a(r5, r0)     // Catch: java.io.IOException -> L26
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L9d
            return r5
        L3f:
            yfa r6 = defpackage.zfa.a
            r6.getClass()
            boolean r6 = defpackage.yfa.b()
            if (r6 != 0) goto L4b
            goto L9d
        L4b:
            java.lang.String r4 = defpackage.iuj.E(r4)
            java.util.concurrent.CopyOnWriteArrayList r6 = defpackage.yfa.b
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L5a:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L70
            java.lang.Object r1 = r6.next()
            r2 = r1
            zfa r2 = (defpackage.zfa) r2
            n30 r2 = (defpackage.n30) r2
            r2.getClass()
            r0.add(r1)
            goto L5a
        L70:
            boolean r6 = r0.isEmpty()
            if (r6 != 0) goto L9d
            yfa r6 = defpackage.zfa.a
            r6.getClass()
            java.lang.String r5 = defpackage.gsk.c(r5)
            java.lang.String r6 = "Failed to persist drawer tab preferences: "
            java.lang.String r5 = r6.concat(r5)
            java.util.Iterator r6 = r0.iterator()
        L89:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L9d
            java.lang.Object r0 = r6.next()
            zfa r0 = (defpackage.zfa) r0
            n30 r0 = (defpackage.n30) r0
            sfa r1 = defpackage.sfa.WARN
            r0.b(r1, r4, r5)
            goto L89
        L9d:
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yn8.A(uf6, tp4):java.lang.Object");
    }

    @Override // defpackage.un8
    public final String G() {
        return (String) this.o.getValue();
    }

    @Override // defpackage.un8
    public final boolean H() {
        return this.g.e();
    }

    @Override // defpackage.un8
    public final a4e J() {
        return this.v;
    }

    @Override // defpackage.un8
    public final boolean K() {
        return !this.c.h();
    }

    @Override // defpackage.un8
    public final boolean N() {
        return i() && ((Boolean) this.r.getValue()).booleanValue();
    }

    public final void O(ConsistencyLevel consistencyLevel) {
        this.f.b();
        boolean zBooleanValue = ((Boolean) this.i.a.getValue()).booleanValue();
        mp4 mp4Var = this.a;
        tp4 tp4Var = null;
        if (zBooleanValue) {
            gb9.D(mp4Var, null, null, new wn8(this, tp4Var, 0), 3);
        }
        gb9.D(mp4Var, null, null, new f23(this, consistencyLevel, tp4Var, 2), 3);
    }

    @Override // defpackage.un8
    public final void b(ChatConversationWithProjectReference chatConversationWithProjectReference) {
        chatConversationWithProjectReference.getClass();
        gb9.D(this.a, null, null, new ix5(this, chatConversationWithProjectReference, null, 16), 3);
    }

    @Override // defpackage.un8
    public final boolean c() {
        return ((Boolean) this.x.getValue()).booleanValue();
    }

    @Override // defpackage.un8
    public final String d() {
        return (String) this.p.getValue();
    }

    @Override // defpackage.un8
    public final boolean e() {
        return i() && ((Boolean) this.s.getValue()).booleanValue();
    }

    @Override // defpackage.un8
    public final boolean f() {
        return ((Boolean) this.t.getValue()).booleanValue();
    }

    @Override // defpackage.un8
    public final boolean g() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    @Override // defpackage.un8
    public final boolean h() {
        return this.g.d();
    }

    @Override // defpackage.un8
    public final boolean i() {
        return ((Boolean) this.q.getValue()).booleanValue();
    }

    @Override // defpackage.un8
    public final List k() {
        return (List) this.A.getValue();
    }

    @Override // defpackage.un8
    public final void l(Project project) {
        project.getClass();
        gb9.D(this.a, null, null, new ix5(this, project, null, 17), 3);
    }

    @Override // defpackage.un8
    public final String m() {
        return this.c.e;
    }

    @Override // defpackage.un8
    public final List n() {
        return (List) this.B.getValue();
    }

    @Override // defpackage.un8
    public final void o() {
        O(ConsistencyLevel.STRONG);
    }

    @Override // defpackage.un8
    public final boolean p() {
        return this.g.a();
    }

    @Override // defpackage.un8
    public final Set q() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : re6.G) {
            re6 re6Var = (re6) obj;
            kf6 kf6Var = this.k;
            kf6Var.getClass();
            re6Var.getClass();
            if (!((Boolean) sta.f0(re6Var, kf6Var.c)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return w44.t1(arrayList);
    }

    @Override // defpackage.un8
    public final List t() {
        return (List) this.z.getValue();
    }

    @Override // defpackage.un8
    public final boolean u() {
        return ((Boolean) this.w.getValue()).booleanValue();
    }

    @Override // defpackage.un8
    public final boolean y() {
        if (!((Boolean) this.i.a.getValue()).booleanValue()) {
            return false;
        }
        ReferralEligibility referralEligibilityA = this.j.a(this.c.e);
        return referralEligibilityA != null && referralEligibilityA.getHasSharablePass();
    }

    @Override // defpackage.un8
    public final boolean z() {
        return this.g.f();
    }
}
