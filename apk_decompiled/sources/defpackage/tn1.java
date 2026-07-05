package defpackage;

import android.media.AudioRecord;
import android.os.SystemClock;
import com.anthropic.claude.analytics.events.VoiceEvents$SessionError;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceActivationMode;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceErrorKind;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceInputTrigger;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceTurnOutcome;
import com.anthropic.claude.api.common.RateLimit;
import com.anthropic.claude.bell.VoiceSessionSummary;
import com.anthropic.claude.bell.api.BellApiClientMessage;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.ThinkingEffort;
import com.anthropic.claude.types.strings.ThinkingMode;
import com.anthropic.claude.types.strings.ToolUseId;
import com.anthropic.claude.types.strings.VoiceSessionId;
import java.util.Date;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class tn1 implements fn1, ym1 {
    public final mo1 A;
    public g5j B;
    public final cp3 C;
    public Integer D;
    public VoiceEvents$VoiceErrorKind E;
    public String F;
    public final lsc G;
    public final Object H;
    public boolean I;
    public final lsc J;
    public final zy1 K;
    public final lsc L;
    public boolean M;
    public final lsc N;
    public volatile boolean O;
    public volatile boolean P;
    public final lsc Q;
    public final lsc R;
    public boolean S;
    public final lsc T;
    public final lsc U;
    public final lsc V;
    public fkg W;
    public fkg X;
    public fkg Y;
    public fkg Z;
    public final String a;
    public final u0h a0;
    public final vn1 b;
    public final zy1 b0;
    public final vn1 c;
    public VoiceSessionSummary c0;
    public final vn1 d;
    public final lsc d0;
    public final l45 e;
    public final boolean e0;
    public final h86 f;
    public fkg f0;
    public final gj1 g;
    public boolean g0;
    public final um1 h;
    public boolean h0;
    public final koi i;
    public final am0 j;
    public final jzg k;
    public final myh l;
    public final ci1 m;
    public final co1 n;
    public final jud o;
    public final xn1 p;
    public final u4j q;
    public final ki1 r;
    public final ej1 s;
    public final x51 t;
    public final y49 u;
    public final dmc v;
    public final lsc w;
    public final go1 x;
    public final zn1 y;
    public final dn1 z;

    public tn1(String str, o1j o1jVar, vn1 vn1Var, vn1 vn1Var2, vn1 vn1Var3, mp4 mp4Var, h86 h86Var, gj1 gj1Var, um1 um1Var, koi koiVar, qi3 qi3Var, am0 am0Var, jzg jzgVar, myh myhVar, ci1 ci1Var, co1 co1Var, jud judVar, xn1 xn1Var, u4j u4jVar, ki1 ki1Var, ej1 ej1Var, x51 x51Var, l6 l6Var, y49 y49Var, dmc dmcVar, bg9 bg9Var, nib nibVar, nz2 nz2Var) {
        str.getClass();
        o1jVar.getClass();
        mp4Var.getClass();
        this.a = str;
        this.b = vn1Var;
        this.c = vn1Var2;
        this.d = vn1Var3;
        this.e = mp4Var;
        this.f = h86Var;
        this.g = gj1Var;
        this.h = um1Var;
        this.i = koiVar;
        this.j = am0Var;
        this.k = jzgVar;
        this.l = myhVar;
        this.m = ci1Var;
        this.n = co1Var;
        this.o = judVar;
        this.p = xn1Var;
        this.q = u4jVar;
        this.r = ki1Var;
        this.s = ej1Var;
        this.t = x51Var;
        this.u = y49Var;
        this.v = dmcVar;
        Boolean bool = Boolean.FALSE;
        this.w = mpk.P(bool);
        go1 go1Var = new go1(bg9Var, nibVar, nz2Var, myhVar, h86Var, this);
        this.x = go1Var;
        this.y = (zn1) l6Var.invoke(new gn1(this, 0));
        this.z = new dn1(this);
        this.A = new mo1(x51Var, go1Var.g, go1Var.h);
        VoiceSessionId.Companion.getClass();
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        String string = uuidRandomUUID.toString();
        string.getClass();
        this.B = new g5j(qi3Var, koiVar.e, str, VoiceSessionId.m1165constructorimpl(string), o1jVar);
        this.C = new cp3();
        this.G = mpk.P(no1.k);
        this.H = new Object();
        this.I = true;
        this.J = mpk.P(nm6.E);
        this.K = x44.a();
        this.L = mpk.P(bool);
        this.N = mpk.P(bool);
        this.Q = mpk.P(null);
        this.R = mpk.P(null);
        this.T = mpk.P(bool);
        this.U = mpk.P(fj1.E);
        this.V = mpk.P(bool);
        this.a0 = new u0h(new gn1(this, 1));
        this.b0 = x44.a();
        this.d0 = mpk.P(RateLimit.WithinLimit.INSTANCE);
        this.e0 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:
    
        if (r12.u(r0) == r1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f1, code lost:
    
        if (r12.F(r0) == r1) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.tn1 r12, defpackage.fj1 r13, defpackage.tp4 r14) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tn1.b(tn1, fj1, tp4):java.lang.Object");
    }

    public final boolean A() {
        return ((Boolean) this.N.getValue()).booleanValue();
    }

    public final void B(rj1 rj1Var, String str, VoiceEvents$VoiceErrorKind voiceEvents$VoiceErrorKind) {
        this.Q.setValue(rj1Var);
        this.E = voiceEvents$VoiceErrorKind;
        this.F = str;
        this.n.b("Tool approval was cancelled because the voice session ended.");
        L(true);
        synchronized (this.H) {
            no1 no1VarQ = q();
            no1VarQ.getClass();
            this.G.setValue(no1VarQ.c());
        }
        this.x.c();
        this.A.b();
        this.x.h.clear();
        Integer numN = this.C.n(this.t.h);
        this.t.a();
        fkg fkgVar = this.X;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        g5j g5jVar = this.B;
        if (g5jVar != null) {
            g5jVar.f(i(), VoiceEvents$VoiceTurnOutcome.ERROR, this.r.w, numN);
        }
    }

    public final void C(jm1 jm1Var, String str, VoiceEvents$VoiceErrorKind voiceEvents$VoiceErrorKind, boolean z) {
        g5j g5jVar;
        str.getClass();
        this.R.setValue(jm1Var);
        fkg fkgVar = this.Y;
        tp4 tp4Var = null;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        this.Y = gb9.D(this.e, null, null, new nn1(jm1Var, this, tp4Var, 0), 3);
        if (z) {
            this.y.c();
        }
        if (voiceEvents$VoiceErrorKind == null || (g5jVar = this.B) == null) {
            return;
        }
        VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationModeI = i();
        w0j w0jVar = this.r.w;
        voiceEvents$VoiceActivationModeI.getClass();
        w0jVar.getClass();
        g5jVar.a.e(new VoiceEvents$SessionError(g5jVar.b, g5jVar.c, g5jVar.d, voiceEvents$VoiceActivationModeI, voiceEvents$VoiceErrorKind, str, g5jVar.h, w0jVar.a, w0jVar.b), VoiceEvents$SessionError.Companion.serializer());
    }

    public final void D(boolean z, boolean z2, boolean z3) {
        synchronized (this.H) {
            no1 no1VarQ = q();
            no1VarQ.getClass();
            this.G.setValue(no1.a(no1VarQ, false, false, false, false, false, z, z3, z2, false, false, 799));
        }
    }

    public final void E() {
        if (q().a) {
            N(false);
            this.A.b();
            synchronized (this.H) {
                no1 no1VarQ = q();
                no1VarQ.getClass();
                this.G.setValue(no1.a(no1VarQ, false, false, false, false, false, false, false, false, false, false, 496));
            }
            go1 go1Var = this.x;
            nib nibVar = go1Var.b;
            go1Var.m = new rib(nibVar.a, nibVar.b);
            go1Var.n = new poj(7);
            go1Var.o.clear();
            go1Var.p.clear();
            go1Var.q.clear();
            go1Var.r = false;
            if (!this.g.d()) {
                this.y.f();
            }
            g5j g5jVar = this.B;
            if (g5jVar != null) {
                g5jVar.a(VoiceEvents$VoiceInputTrigger.VAD);
            }
            cp3 cp3Var = this.C;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            synchronized (cp3Var) {
                cp3Var.e = Long.valueOf(jElapsedRealtime);
                cp3Var.c = false;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(defpackage.vp4 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.on1
            if (r0 == 0) goto L13
            r0 = r8
            on1 r0 = (defpackage.on1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            on1 r0 = new on1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.E
            m45 r1 = defpackage.m45.E
            int r2 = r0.G
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.sf5.h0(r8)
            goto L75
        L28:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r3
        L2e:
            defpackage.sf5.h0(r8)
            g5j r8 = r7.B
            if (r8 == 0) goto L3e
            monitor-enter(r8)
            r8.c()     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r8)
            goto L3e
        L3b:
            r7 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3b
            throw r7
        L3e:
            g5j r8 = r7.B
            if (r8 == 0) goto L48
            r8.z = r3
            r5 = 0
            r8.A = r5
        L48:
            cp3 r8 = r7.C
            monitor-enter(r8)
            r8.e = r3     // Catch: java.lang.Throwable -> L84
            r2 = 0
            r8.c = r2     // Catch: java.lang.Throwable -> L84
            monitor-exit(r8)
            java.lang.Object r8 = r7.H
            monitor-enter(r8)
            no1 r3 = r7.q()     // Catch: java.lang.Throwable -> L81
            r3.getClass()     // Catch: java.lang.Throwable -> L81
            no1 r3 = r3.b()     // Catch: java.lang.Throwable -> L81
            lsc r5 = r7.G     // Catch: java.lang.Throwable -> L81
            r5.setValue(r3)     // Catch: java.lang.Throwable -> L81
            monitor-exit(r8)
            co1 r8 = r7.n
            java.lang.String r3 = "Tool approval was cancelled because the voice session reconnected."
            r8.b(r3)
            r0.G = r4
            java.lang.Object r8 = r7.e(r2, r0)
            if (r8 != r1) goto L75
            return r1
        L75:
            ej1 r7 = r7.s
            zy1 r7 = r7.e
            vi1 r8 = defpackage.vi1.a
            r7.r(r8)
            iei r7 = defpackage.iei.a
            return r7
        L81:
            r7 = move-exception
            monitor-exit(r8)
            throw r7
        L84:
            r7 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L84
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tn1.F(vp4):java.lang.Object");
    }

    public final void G() {
        this.x.c();
        synchronized (this.H) {
            no1 no1VarQ = q();
            no1VarQ.getClass();
            this.G.setValue(no1.a(no1VarQ, false, false, false, false, false, false, false, false, false, false, 1022));
        }
        this.s.e.r(wi1.a);
    }

    public final void H() {
        tp4 tp4Var;
        g5j g5jVar = this.B;
        if (g5jVar != null) {
            synchronized (g5jVar) {
                g5jVar.c();
            }
        }
        cp3 cp3Var = this.C;
        synchronized (cp3Var) {
            tp4Var = null;
            cp3Var.e = null;
            cp3Var.c = false;
        }
        this.A.b();
        this.n.b("Tool approval was cancelled because the voice session reconnected.");
        gb9.D(this.e, null, null, new em1(this, tp4Var, 2), 3);
    }

    public final void I() {
        if (w()) {
            gb9.D(this.e, this.f.b(), null, new nn1(this, null, 1), 2);
        }
    }

    public final void J(s51 s51Var) {
        s51Var.getClass();
        fkg fkgVar = this.f0;
        tp4 tp4Var = null;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        g5j g5jVar = this.B;
        if (g5jVar != null) {
            g5jVar.d(s51Var, "user");
        }
        this.f0 = gb9.D(this.e, this.f.b(), null, new nn1(this, (Object) s51Var, tp4Var, 4), 2);
    }

    public final void K(String str, String str2, String str3) {
        this.b.invoke(str != null ? ModelId.m1058boximpl(str) : null);
        this.c.invoke(str2 != null ? ThinkingEffort.m1135boximpl(str2) : null);
        this.d.invoke(str3 != null ? ThinkingMode.m1142boximpl(str3) : null);
        H();
    }

    public final void L(boolean z) {
        M(z);
        this.M = false;
        c();
    }

    public final void M(boolean z) {
        lsc lscVar = this.L;
        if (((Boolean) lscVar.getValue()).booleanValue() == z) {
            return;
        }
        lscVar.setValue(Boolean.valueOf(z));
        this.K.r(iei.a);
    }

    public final void N(boolean z) {
        this.N.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O() {
        if (!this.g.c() || A()) {
            return;
        }
        int i = 1;
        BellApiClientMessage.PauseEndpointing.Data data = null;
        Object[] objArr = 0;
        if (q().a) {
            N(true);
            M(false);
            c();
            this.s.b(new BellApiClientMessage.PauseEndpointing(data, i, (mq5) (objArr == true ? 1 : 0)));
            g5j g5jVar = this.B;
            if (g5jVar != null) {
                g5jVar.b();
                return;
            }
            return;
        }
        if (j()) {
            N(true);
            M(false);
            c();
            synchronized (this.H) {
                no1 no1VarQ = q();
                no1VarQ.getClass();
                this.G.setValue(no1VarQ.b());
            }
            this.x.c();
            R(VoiceEvents$VoiceTurnOutcome.BUTTON_INTERRUPT);
            g5j g5jVar2 = this.B;
            if (g5jVar2 != null) {
                g5jVar2.b();
            }
            this.n.b("Tool approval was cancelled because the voice session ended.");
            gb9.D(this.e, null, null, new kn1(this, null), 3);
        }
    }

    public final void P() {
        if (!q().a) {
            t();
        }
        this.g0 = y() && !this.M;
        this.h0 = this.g.c();
        L(true);
    }

    public final void Q() {
        g5j g5jVar = this.B;
        if (g5jVar != null) {
            g5jVar.k++;
        }
        L(!y());
    }

    public final void R(VoiceEvents$VoiceTurnOutcome voiceEvents$VoiceTurnOutcome) {
        voiceEvents$VoiceTurnOutcome.getClass();
        g5j g5jVar = this.B;
        if (g5jVar != null) {
            g5jVar.f(i(), voiceEvents$VoiceTurnOutcome, this.r.w, this.C.n(this.t.h));
        }
    }

    public final void S(RateLimit rateLimit) {
        RateLimit.ApproachingLimit approachingLimit;
        Integer remaining;
        if (rateLimit == null) {
            return;
        }
        if ((rateLimit instanceof RateLimit.ApproachingLimit) && (remaining = (approachingLimit = (RateLimit.ApproachingLimit) rateLimit).getRemaining()) != null && remaining.intValue() == 0) {
            Date resetsAt = approachingLimit.getResetsAt();
            if (resetsAt != null) {
                this.j.b(Long.valueOf(resetsAt.getTime()));
            }
            rateLimit = u1e.b(approachingLimit);
        }
        lsc lscVar = this.d0;
        lscVar.setValue(rateLimit);
        if (((RateLimit) lscVar.getValue()) instanceof RateLimit.ExceedsLimit) {
            B(new pj1(null), "rate_limit", VoiceEvents$VoiceErrorKind.RATE_LIMIT);
        }
    }

    public final void T(v0 v0Var) {
        synchronized (this.H) {
            this.G.setValue((no1) v0Var.invoke(q()));
        }
    }

    public final void c() {
        ki1 ki1Var = this.r;
        boolean z = y() || w();
        akb akbVar = ki1Var.b.a;
        synchronized (akbVar.g) {
            try {
                akbVar.f = z;
                AudioRecord audioRecord = akbVar.c;
                if (audioRecord == null) {
                    return;
                }
                if (audioRecord.getState() != 1) {
                    return;
                }
                try {
                    if (z) {
                        audioRecord.stop();
                    } else {
                        audioRecord.startRecording();
                    }
                } catch (IllegalStateException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.vp4 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.hn1
            if (r0 == 0) goto L13
            r0 = r5
            hn1 r0 = (defpackage.hn1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            hn1 r0 = new hn1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.sf5.h0(r5)
            goto L3e
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L2c:
            defpackage.sf5.h0(r5)
            fkg r5 = r4.X
            if (r5 == 0) goto L40
            r0.G = r3
            java.lang.Object r5 = defpackage.knk.p(r5, r0)
            m45 r0 = defpackage.m45.E
            if (r5 != r0) goto L3e
            return r0
        L3e:
            iei r5 = (defpackage.iei) r5
        L40:
            r4.X = r2
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tn1.d(vp4):java.lang.Object");
    }

    public final Object e(boolean z, vp4 vp4Var) {
        this.x.c();
        this.A.b();
        synchronized (this.H) {
            no1 no1VarQ = q();
            no1VarQ.getClass();
            this.G.setValue(no1.a(no1VarQ, false, false, false, false, false, false, false, false, false, false, 798));
        }
        return (z && q().b && !q().c) ? iei.a : u(vp4Var);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v3 com.anthropic.claude.bell.VoiceSessionSummary, still in use, count: 2, list:
          (r10v3 com.anthropic.claude.bell.VoiceSessionSummary) from 0x0107: MOVE (r7v2 com.anthropic.claude.bell.VoiceSessionSummary) = (r10v3 com.anthropic.claude.bell.VoiceSessionSummary)
          (r10v3 com.anthropic.claude.bell.VoiceSessionSummary) from 0x00fd: MOVE (r7v4 com.anthropic.claude.bell.VoiceSessionSummary) = (r10v3 com.anthropic.claude.bell.VoiceSessionSummary)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public final void f() {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tn1.f():void");
    }

    public final void g() {
        if (A()) {
            N(false);
            M(true);
            this.M = false;
            c();
            this.O = true;
            this.s.b(BellApiClientMessage.ManualInputEnd.INSTANCE);
            this.s.b(BellApiClientMessage.UnpauseEndpointing.INSTANCE);
            g5j g5jVar = this.B;
            if (g5jVar != null) {
                g5jVar.a(VoiceEvents$VoiceInputTrigger.PUSH_TO_TALK);
            }
            E();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.tp4 r8) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tn1.h(tp4):java.lang.Object");
    }

    public final VoiceEvents$VoiceActivationMode i() {
        return this.g.c() ? VoiceEvents$VoiceActivationMode.PUSH_TO_TALK : VoiceEvents$VoiceActivationMode.HANDS_FREE;
    }

    public final boolean j() {
        if (k() != null) {
            return false;
        }
        if (q().b || q().f || q().g || q().h) {
            return true;
        }
        return !q().a && ((fj1) this.U.getValue()) == fj1.F;
    }

    public final rj1 k() {
        return (rj1) this.Q.getValue();
    }

    public final boolean l() {
        return ((Boolean) this.x.j.getValue()).booleanValue();
    }

    public final y49 m() {
        return this.u;
    }

    public final dmc n() {
        return this.v;
    }

    public final fm1 o() {
        fj1 fj1Var = (fj1) this.U.getValue();
        if (this.S) {
            return fm1.E;
        }
        if (((RateLimit) this.d0.getValue()) instanceof RateLimit.ExceedsLimit) {
            return fm1.U;
        }
        if (k() != null) {
            return fm1.V;
        }
        if (w()) {
            return fm1.T;
        }
        fj1 fj1Var2 = fj1.E;
        fm1 fm1Var = fm1.F;
        if (fj1Var == fj1Var2) {
            return fm1Var;
        }
        if (fj1Var == fj1.G) {
            return fm1.G;
        }
        if (fj1Var == fj1.H) {
            return fm1.H;
        }
        if (fj1Var == fj1.I || !((Boolean) this.V.getValue()).booleanValue()) {
            return fm1Var;
        }
        if (((jm1) this.R.getValue()) != null) {
            return fm1.W;
        }
        if (q().i) {
            return fm1.P;
        }
        if (q().f) {
            return fm1.N;
        }
        if (q().h) {
            return fm1.O;
        }
        if (q().g) {
            return fm1.Q;
        }
        ki1 ki1Var = this.r;
        if (((Boolean) ki1Var.t.getValue()).booleanValue()) {
            return fm1.R;
        }
        boolean zY = y();
        gj1 gj1Var = this.g;
        return (!zY || gj1Var.c()) ? q().b ? fm1.M : (!q().a || ((Boolean) ki1Var.u.getValue()).booleanValue()) ? (gj1Var.c() && q().a && A()) ? fm1.K : (gj1Var.c() && q().a) ? fm1.J : q().a ? fm1.I : fm1.L : fm1Var : fm1.S;
    }

    public final boolean p() {
        return this.e0;
    }

    public final no1 q() {
        return (no1) this.G.getValue();
    }

    public final void r(String str, String str2, String str3, boolean z, String str4) {
        rok rokVarL;
        str.getClass();
        str3.getClass();
        co1 co1Var = this.n;
        amg amgVar = (amg) co1Var.g;
        ovh ovhVar = (ovh) amgVar.getValue();
        String str5 = ovhVar != null ? ovhVar.c : null;
        if (str5 == null ? false : ToolUseId.m1160equalsimpl0(str5, str3)) {
            amgVar.m(null);
            co1Var.c(false);
            if (z) {
                myh myhVar = (myh) co1Var.d;
                dxh dxhVar = (dxh) myhVar.h().get(str);
                if (dxhVar != null && (rokVarL = dxhVar.l()) != null) {
                    myhVar.f.c(rokVarL, eyh.G);
                }
            }
            if (str2 == null) {
                str2 = "{}";
            }
            gb9.D((l45) co1Var.f, null, null, new b9(str4, co1Var, str3, str, str2, null, 2), 3);
        }
    }

    public final void s(String str, String str2) {
        str.getClass();
        str2.getClass();
        co1 co1Var = this.n;
        amg amgVar = (amg) co1Var.g;
        ovh ovhVar = (ovh) amgVar.getValue();
        tp4 tp4Var = null;
        String str3 = ovhVar != null ? ovhVar.c : null;
        if (str3 == null ? false : ToolUseId.m1160equalsimpl0(str3, str2)) {
            amgVar.m(null);
            co1Var.c(false);
            gb9.D((l45) co1Var.f, null, null, new tm(co1Var, str2, str, tp4Var, 5), 3);
        }
    }

    public final void t() {
        R(VoiceEvents$VoiceTurnOutcome.BUTTON_INTERRUPT);
        N(false);
        this.n.b("Tool approval was cancelled because the voice session ended.");
        gb9.D(this.e, null, null, new jn1(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(defpackage.vp4 r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof defpackage.ln1
            if (r0 == 0) goto L13
            r0 = r13
            ln1 r0 = (defpackage.ln1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            ln1 r0 = new ln1
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.E
            m45 r1 = defpackage.m45.E
            int r2 = r0.G
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.sf5.h0(r13)
            goto L4e
        L27:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r12)
            r12 = 0
            return r12
        L2e:
            defpackage.sf5.h0(r13)
            no1 r13 = r12.q()
            boolean r13 = r13.b
            if (r13 != 0) goto L3c
            iei r12 = defpackage.iei.a
            return r12
        L3c:
            mo1 r13 = r12.A
            r13.b()
            fkg r13 = r12.X
            if (r13 == 0) goto L50
            r0.G = r3
            java.lang.Object r13 = defpackage.knk.p(r13, r0)
            if (r13 != r1) goto L4e
            return r1
        L4e:
            iei r13 = (defpackage.iei) r13
        L50:
            java.lang.Object r13 = r12.H
            monitor-enter(r13)
            no1 r0 = r12.q()     // Catch: java.lang.Throwable -> L7e
            r0.getClass()     // Catch: java.lang.Throwable -> L7e
            r10 = 0
            r11 = 1017(0x3f9, float:1.425E-42)
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            no1 r0 = defpackage.no1.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L7e
            lsc r1 = r12.G     // Catch: java.lang.Throwable -> L7e
            r1.setValue(r0)     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r13)
            x51 r13 = r12.t
            r13.a()
            dmc r12 = r12.v
            r13 = 0
            r12.a(r13)
            iei r12 = defpackage.iei.a
            return r12
        L7e:
            r0 = move-exception
            r12 = r0
            monitor-exit(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tn1.u(vp4):java.lang.Object");
    }

    public final boolean v() {
        return ((Boolean) this.w.getValue()).booleanValue();
    }

    public final boolean w() {
        return this.r.a.d();
    }

    public final boolean x() {
        return y();
    }

    public final boolean y() {
        return ((Boolean) this.L.getValue()).booleanValue();
    }

    public final boolean z() {
        return q().b;
    }
}
