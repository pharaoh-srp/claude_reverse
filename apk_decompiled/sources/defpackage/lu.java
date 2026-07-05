package defpackage;

import com.anthropic.claude.analytics.events.ChatListEvents$ConversationSearchEntryPoint;
import com.anthropic.claude.analytics.events.ChatListEvents$ConversationSearchOutcome;
import com.anthropic.claude.analytics.events.ChatListEvents$ConversationSearchSessionEnded;
import com.anthropic.claude.analytics.events.ChatListEvents$ConversationSearchVersion;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.api.common.ConsistencyLevel;
import com.anthropic.claude.api.project.Project;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class lu extends iwe implements un8 {
    public final wz5 A;
    public final /* synthetic */ yn8 b;
    public final koi c;
    public final vd3 d;
    public final wqd e;
    public final pkc f;
    public final dl2 g;
    public final qi3 h;
    public final am0 i;
    public final mn5 j;
    public final zy1 k;
    public final lsc l;
    public final lsc m;
    public final lsc n;
    public final lsc o;
    public final lsc p;
    public final lsc q;
    public final lsc r;
    public final zy1 s;
    public final iu t;
    public final wz5 u;
    public final wz5 v;
    public final yih w;
    public Long x;
    public ChatListEvents$ConversationSearchOutcome y;
    public final wz5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu(yn8 yn8Var, koi koiVar, vd3 vd3Var, wqd wqdVar, pkc pkcVar, dl2 dl2Var, qi3 qi3Var, am0 am0Var, mn5 mn5Var, h86 h86Var) {
        super(h86Var);
        yn8Var.getClass();
        this.b = yn8Var;
        this.c = koiVar;
        this.d = vd3Var;
        this.e = wqdVar;
        this.f = pkcVar;
        this.g = dl2Var;
        this.h = qi3Var;
        this.i = am0Var;
        this.j = mn5Var;
        Boolean bool = Boolean.FALSE;
        mpk.P(bool);
        this.k = x44.a();
        tp4 tp4Var = null;
        this.l = mpk.P(null);
        this.m = mpk.P(new Date());
        this.n = mpk.P(by2.E);
        this.o = mpk.P(bool);
        this.p = mpk.P(um6.E);
        this.q = mpk.P(bool);
        this.r = mpk.P(bool);
        this.s = x44.a();
        this.t = new iu(this);
        a5 a5Var = a5.N;
        int i = 0;
        this.u = mpk.x(new gu(this, i), a5Var);
        int i2 = 1;
        this.v = mpk.w(new gu(this, i2));
        this.w = new yih((String) null, 3);
        int i3 = 2;
        this.z = mpk.x(new gu(this, i3), a5Var);
        this.A = mpk.x(new gu(this, 3), a5Var);
        mpk.w(new gu(this, 4));
        gb9.D(this.a, null, null, new hu(this, tp4Var, i), 3);
        gb9.D(this.a, null, null, new hu(this, tp4Var, i2), 3);
        gb9.D(this.a, null, null, new hu(this, tp4Var, i3), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O(defpackage.lu r9, java.lang.String r10, defpackage.vp4 r11) {
        /*
            lsc r0 = r9.l
            vd3 r1 = r9.d
            boolean r2 = r11 instanceof defpackage.ju
            if (r2 == 0) goto L17
            r2 = r11
            ju r2 = (defpackage.ju) r2
            int r3 = r2.I
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.I = r3
            goto L1c
        L17:
            ju r2 = new ju
            r2.<init>(r9, r11)
        L1c:
            java.lang.Object r9 = r2.G
            int r11 = r2.I
            iei r3 = defpackage.iei.a
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            m45 r8 = defpackage.m45.E
            if (r11 == 0) goto L48
            if (r11 == r7) goto L44
            if (r11 == r6) goto L3e
            if (r11 != r5) goto L38
            boolean r10 = r2.F
            java.lang.String r11 = r2.E
            defpackage.sf5.h0(r9)
            goto L82
        L38:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r9)
            return r4
        L3e:
            java.lang.String r10 = r2.E
            defpackage.sf5.h0(r9)
            goto L6b
        L44:
            defpackage.sf5.h0(r9)
            return r3
        L48:
            defpackage.sf5.h0(r9)
            int r9 = r10.length()
            if (r9 != 0) goto L60
            r0.setValue(r4)
            r2.E = r4
            r2.I = r7
            java.lang.Object r9 = r1.b(r2)
            if (r9 != r8) goto L5f
            goto L7f
        L5f:
            return r3
        L60:
            r2.E = r10
            r2.I = r6
            java.lang.Object r9 = r1.q(r10, r2)
            if (r9 != r8) goto L6b
            goto L7f
        L6b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L84
            r2.E = r10
            r2.F = r9
            r2.I = r5
            java.lang.Object r11 = r1.b(r2)
            if (r11 != r8) goto L80
        L7f:
            return r8
        L80:
            r11 = r10
            r10 = r9
        L82:
            r9 = r10
            r10 = r11
        L84:
            pa3 r11 = new pa3
            r9 = r9 ^ r7
            r11.<init>(r10, r9)
            r0.setValue(r11)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lu.O(lu, java.lang.String, vp4):java.lang.Object");
    }

    @Override // defpackage.un8
    public final Object A(uf6 uf6Var, tp4 tp4Var) {
        return this.b.A(uf6Var, tp4Var);
    }

    @Override // defpackage.un8
    public final String G() {
        return this.b.G();
    }

    @Override // defpackage.un8
    public final boolean H() {
        return this.b.g.e();
    }

    @Override // defpackage.un8
    public final a4e J() {
        return this.b.v;
    }

    @Override // defpackage.un8
    public final boolean K() {
        return this.b.K();
    }

    @Override // defpackage.un8
    public final boolean N() {
        return this.b.N();
    }

    public final void P(ChatListEvents$ConversationSearchOutcome chatListEvents$ConversationSearchOutcome) {
        chatListEvents$ConversationSearchOutcome.getClass();
        Long l = this.x;
        if (l != null) {
            long jLongValue = l.longValue();
            this.x = null;
            this.y = chatListEvents$ConversationSearchOutcome;
            this.h.e(new ChatListEvents$ConversationSearchSessionEnded(ChatListEvents$ConversationSearchEntryPoint.SIDEBAR, chatListEvents$ConversationSearchOutcome, this.j.b() - jLongValue, ChatListEvents$ConversationSearchVersion.V2, "conversation_hybrid"), ChatListEvents$ConversationSearchSessionEnded.Companion.serializer());
        }
    }

    public final Set Q() {
        return (Set) this.p.getValue();
    }

    public final void R() {
        yn8 yn8Var = this.b;
        vn5 vn5Var = yn8Var.f;
        long j = yn8.C;
        vn5Var.getClass();
        if (vn5Var.a.a() - vn5Var.b > j) {
            yn8Var.O(ConsistencyLevel.EVENTUAL);
        }
    }

    @Override // defpackage.un8
    public final void b(ChatConversationWithProjectReference chatConversationWithProjectReference) {
        chatConversationWithProjectReference.getClass();
        this.b.b(chatConversationWithProjectReference);
    }

    @Override // defpackage.un8
    public final boolean c() {
        return this.b.c();
    }

    @Override // defpackage.un8
    public final String d() {
        return this.b.d();
    }

    @Override // defpackage.un8
    public final boolean e() {
        return this.b.e();
    }

    @Override // defpackage.un8
    public final boolean f() {
        return this.b.f();
    }

    @Override // defpackage.un8
    public final boolean g() {
        return this.b.g();
    }

    @Override // defpackage.un8
    public final boolean h() {
        return this.b.g.d();
    }

    @Override // defpackage.un8
    public final boolean i() {
        return this.b.i();
    }

    @Override // defpackage.un8
    public final List k() {
        return this.b.k();
    }

    @Override // defpackage.un8
    public final void l(Project project) {
        project.getClass();
        this.b.l(project);
    }

    @Override // defpackage.un8
    public final String m() {
        return this.b.c.e;
    }

    @Override // defpackage.un8
    public final List n() {
        return this.b.n();
    }

    @Override // defpackage.un8
    public final void o() {
        this.b.o();
    }

    @Override // defpackage.un8
    public final boolean p() {
        return this.b.g.a();
    }

    @Override // defpackage.un8
    public final Set q() {
        return this.b.q();
    }

    @Override // defpackage.un8
    public final List t() {
        return (List) this.v.getValue();
    }

    @Override // defpackage.un8
    public final boolean u() {
        return this.b.u();
    }

    @Override // defpackage.un8
    public final boolean y() {
        return this.b.y();
    }

    @Override // defpackage.un8
    public final boolean z() {
        return this.b.g.f();
    }
}
