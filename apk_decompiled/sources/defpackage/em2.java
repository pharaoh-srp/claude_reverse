package defpackage;

import android.os.Build;
import com.anthropic.claude.analytics.events.ChatEvents$BlockKind;
import com.anthropic.claude.analytics.events.ChatEvents$BusyContainerSendRetryCompleted;
import com.anthropic.claude.analytics.events.ChatEvents$BusyContainerSendRetryOutcome;
import com.anthropic.claude.analytics.events.ChatEvents$ConversationLoadSource;
import com.anthropic.claude.analytics.events.ChatEvents$PollingRecoveryCancellationCause;
import com.anthropic.claude.analytics.events.ChatEvents$PollingRecoveryCompleted;
import com.anthropic.claude.analytics.events.ChatEvents$PollingRecoveryOutcome;
import com.anthropic.claude.analytics.events.ChatEvents$PollingRecoveryStarted;
import com.anthropic.claude.analytics.events.ChatEvents$PollingRecoveryTriggerReason;
import com.anthropic.claude.analytics.events.ChatEvents$RetryCompletion;
import com.anthropic.claude.analytics.events.ChatEvents$RetryCompletionReason;
import com.anthropic.claude.analytics.events.ChatEvents$SendMessage;
import com.anthropic.claude.analytics.events.ChatEvents$SendRetryCompleted;
import com.anthropic.claude.analytics.events.ChatEvents$SendRetryOutcome;
import com.anthropic.claude.analytics.events.ChatEvents$StreamingMessageCompletionStatus;
import com.anthropic.claude.analytics.events.ClaudeAiMessageEvents$MessageSent;
import com.anthropic.claude.analytics.events.ClaudeAiMessageEvents$MessageStreamingAbandoned;
import com.anthropic.claude.analytics.events.ClaudeAiMessageEvents$ResearchMode;
import com.anthropic.claude.analytics.events.MobileToolEvents$MobileToolKind;
import com.anthropic.claude.analytics.events.MobileToolEvents$MobileToolOutcome;
import com.anthropic.claude.analytics.events.MobileToolEvents$MobileToolResolved;
import com.anthropic.claude.analytics.health.HealthMetricAction;
import com.anthropic.claude.api.chat.messages.ContentBlock;
import com.anthropic.claude.api.chat.messages.ToolUseBlock;
import com.anthropic.claude.api.mcp.McpToolApprovalOption;
import com.anthropic.claude.chat.parse.ParsedContentBlock$McpToolInvocation;
import com.anthropic.claude.chat.parse.ParsedContentBlock$Thinking;
import com.anthropic.claude.chat.parse.sse.ServerSentEventError;
import com.anthropic.claude.chat.parse.sse.ServerSentEventException;
import com.anthropic.claude.configs.MobileObservabilityConfig;
import com.anthropic.claude.types.strings.ThinkingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class em2 {
    public static final long C = uh6.f(b2c.b);
    public static final ide D = new ide("\n+");
    public static final ide E = new ide("\n{2,}");
    public static final List F;
    public static final List G;
    public static final ide H;
    public static final ide I;
    public int A;
    public int B;
    public final qi3 a;
    public final id b;
    public final bj0 c;
    public final mn5 d;
    public final rc8 e;
    public final md9 f;
    public final h86 g;
    public final l45 h;
    public final b33 i;
    public final myh j;
    public final hl8 k;
    public ol2 l;
    public sl2 m;
    public kl2 n;
    public ContentBlock o;
    public hi6 p;
    public yme q;
    public ul2 r;
    public final ConcurrentHashMap s;
    public final lsc t;
    public final isc u;
    public final lsc v;
    public boolean w;
    public long x;
    public fkg y;
    public n78 z;

    static {
        jde jdeVar = jde.IGNORE_CASE;
        F = x44.X(new cpc(new ide("^no prompt provided$", jdeVar), "no_prompt_provided"), new cpc(new ide("content filtering", jdeVar), "content_filtering_rejected"), new cpc(new ide("more than 20|at most 20 items", jdeVar), "exceeded_max_uploads_per_message"), new cpc(new ide("prompt is too long|context limit|exceeds claude'?s context", jdeVar), "context_limit_exceeded"), new cpc(new ide("^unsupported model$", jdeVar), "unsupported_model"), new cpc(new ide("conversation has been ended by claude", jdeVar), "conversation_ended_by_model"), new cpc(new ide("refused for safety reasons", jdeVar), "refused_message_continuation"), new cpc(new ide("credit balance is too low", jdeVar), "insufficient_credits"), new cpc(new ide("not available on the requested cloud", jdeVar), "model_not_available_on_provider"), new cpc(new ide("input should be a valid uuid", jdeVar), "invalid_request_uuid"));
        G = x44.X(new cpc(new ide("model (isn['’]?t|is not) available", jdeVar), "model_not_available"), new cpc(new ide("organization has been disabled", jdeVar), "organization_disabled"), new cpc(new ide("status: canceled", jdeVar), "organization_canceled"), new cpc(new ide("status: incomplete_expired", jdeVar), "organization_incomplete_expired"), new cpc(new ide("status: incomplete\\b", jdeVar), "organization_incomplete"), new cpc(new ide("status: unpaid", jdeVar), "organization_unpaid"), new cpc(new ide("past[ _]due", jdeVar), "subscription_past_due"), new cpc(new ide("most recently updated projects", jdeVar), "free_user_project_limit"), new cpc(new ide("restricted by network policy", jdeVar), "tenant_restriction_violation"), new cpc(new ide("^permission denied\\b", jdeVar), "permission_denied"));
        H = new ide("([\"'`][^\"'`\\n]{1,64}[\"'`]|\\S*[\\d@._/:-]\\S*)");
        I = new ide("\\s+");
    }

    public em2(qi3 qi3Var, id idVar, bj0 bj0Var, mn5 mn5Var, rc8 rc8Var, md9 md9Var, h86 h86Var, mp4 mp4Var, b33 b33Var, myh myhVar, hl8 hl8Var) {
        mp4Var.getClass();
        this.a = qi3Var;
        this.b = idVar;
        this.c = bj0Var;
        this.d = mn5Var;
        this.e = rc8Var;
        this.f = md9Var;
        this.g = h86Var;
        this.h = mp4Var;
        this.i = b33Var;
        this.j = myhVar;
        this.k = hl8Var;
        this.s = new ConcurrentHashMap();
        Boolean bool = Boolean.FALSE;
        this.t = mpk.P(bool);
        this.u = new isc(0);
        this.v = mpk.P(bool);
        this.B = -1;
    }

    public static final Map a(em2 em2Var, List list) {
        jz0 jz0VarA;
        em2Var.getClass();
        if (list.isEmpty()) {
            return nm6.E;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mtc mtcVar = (mtc) it.next();
            if (mtcVar instanceof itc) {
                jz0VarA = ((itc) mtcVar).b();
            } else if (mtcVar instanceof zsc) {
                jz0VarA = ((zsc) mtcVar).b();
            } else if (mtcVar instanceof ParsedContentBlock$Thinking) {
                jz0VarA = ((ParsedContentBlock$Thinking) mtcVar).getMarkdownRoot();
            } else if (mtcVar instanceof atc) {
                jz0VarA = ((atc) mtcVar).a();
            } else {
                if (!(mtcVar instanceof ysc) && !(mtcVar instanceof htc) && !(mtcVar instanceof ParsedContentBlock$McpToolInvocation) && !(mtcVar instanceof ctc) && !(mtcVar instanceof btc) && !(mtcVar instanceof gtc) && !(mtcVar instanceof ftc) && !(mtcVar instanceof ltc)) {
                    mr9.b();
                    return null;
                }
                jz0VarA = null;
            }
            if (jz0VarA != null) {
                j(jz0VarA, new lj2(em2Var, 1, linkedHashMap));
            }
        }
        return linkedHashMap;
    }

    public static final ChatEvents$BlockKind b(em2 em2Var, mtc mtcVar) {
        em2Var.getClass();
        if (mtcVar instanceof itc) {
            return ChatEvents$BlockKind.TEXT;
        }
        if (mtcVar instanceof zsc) {
            return ChatEvents$BlockKind.ARTIFACT;
        }
        if (mtcVar instanceof ysc) {
            return ChatEvents$BlockKind.ANALYSIS_TOOL_INVOCATION;
        }
        if (mtcVar instanceof htc) {
            return ChatEvents$BlockKind.SEARCH_TOOL_INVOCATION;
        }
        if (mtcVar instanceof ParsedContentBlock$McpToolInvocation) {
            return ChatEvents$BlockKind.MCP_TOOL_INVOCATION;
        }
        if (mtcVar instanceof ctc) {
            return ChatEvents$BlockKind.MCP_APP_INVOCATION;
        }
        if (mtcVar instanceof btc) {
            return ChatEvents$BlockKind.KNOWLEDGE_SOURCES;
        }
        if (mtcVar instanceof ParsedContentBlock$Thinking) {
            return ChatEvents$BlockKind.THINKING;
        }
        if (mtcVar instanceof atc) {
            return ChatEvents$BlockKind.BELL_NOTE;
        }
        if (mtcVar instanceof gtc) {
            return ChatEvents$BlockKind.RESEARCH_TOOL_INVOCATION;
        }
        if (mtcVar instanceof ftc) {
            return ChatEvents$BlockKind.MOBILE_APP_USE_TOOL_INVOCATION;
        }
        if (mtcVar instanceof ltc) {
            return ChatEvents$BlockKind.WIGGLE_ARTIFACTS;
        }
        mr9.b();
        return null;
    }

    public static final String c(em2 em2Var, ChatEvents$BlockKind chatEvents$BlockKind) {
        em2Var.getClass();
        return ChatEvents$BlockKind.Companion.serializer().getDescriptor().f(chatEvents$BlockKind.ordinal());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        if (defpackage.iuj.R(r6, r10, r0) == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.em2 r8, defpackage.n78 r9, defpackage.vp4 r10) {
        /*
            boolean r0 = r10 instanceof defpackage.dm2
            if (r0 == 0) goto L13
            r0 = r10
            dm2 r0 = (defpackage.dm2) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            dm2 r0 = new dm2
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.F
            int r1 = r0.H
            r2 = 2
            r3 = 0
            r4 = 1
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r2) goto L2b
            defpackage.sf5.h0(r10)
            goto L6a
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r8)
            return r3
        L31:
            n78 r9 = r0.E
            defpackage.sf5.h0(r10)
            goto L54
        L37:
            defpackage.sf5.h0(r10)
            il2 r10 = new il2
            r1 = 0
            r10.<init>(r9, r1)
            b3f r10 = defpackage.mpk.d0(r10)
            zl2 r1 = new zl2
            r1.<init>(r4)
            r0.E = r9
            r0.H = r4
            java.lang.Object r10 = defpackage.j8.H(r10, r1, r0)
            if (r10 != r5) goto L54
            goto L69
        L54:
            long r6 = defpackage.hm2.a()
            cj r10 = new cj
            r1 = 9
            r10.<init>(r9, r3, r1)
            r0.E = r3
            r0.H = r2
            java.lang.Object r9 = defpackage.iuj.R(r6, r10, r0)
            if (r9 != r5) goto L6a
        L69:
            return r5
        L6a:
            lsc r8 = r8.v
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r8.setValue(r9)
            iei r8 = defpackage.iei.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.em2.d(em2, n78, vp4):java.lang.Object");
    }

    public static void j(jz0 jz0Var, lj2 lj2Var) {
        for (jz0 jz0VarA = jz0Var.a().a(); jz0VarA != null; jz0VarA = jz0VarA.a().b()) {
            lj2Var.invoke(jz0VarA.b());
            j(jz0VarA, lj2Var);
        }
    }

    public static void p(em2 em2Var, ChatEvents$PollingRecoveryOutcome chatEvents$PollingRecoveryOutcome, ChatEvents$PollingRecoveryCancellationCause chatEvents$PollingRecoveryCancellationCause, String str, boolean z, int i) {
        ChatEvents$PollingRecoveryCancellationCause chatEvents$PollingRecoveryCancellationCause2 = (i & 2) != 0 ? null : chatEvents$PollingRecoveryCancellationCause;
        String str2 = (i & 4) != 0 ? null : str;
        boolean z2 = (i & 8) != 0 ? false : z;
        bj0 bj0Var = em2Var.c;
        chatEvents$PollingRecoveryOutcome.getClass();
        ul2 ul2Var = em2Var.r;
        if (ul2Var == null) {
            return;
        }
        em2Var.r = null;
        long jA = em2Var.d.a() - ul2Var.k().a();
        long jB = ul2Var.k().b(bj0Var);
        qi3 qi3Var = em2Var.a;
        String strJ = ul2Var.j();
        String strA = ul2Var.a();
        ChatEvents$PollingRecoveryTriggerReason chatEvents$PollingRecoveryTriggerReasonL = ul2Var.l();
        int iB = ul2Var.b();
        Long lG = ul2Var.g();
        boolean zC = ul2Var.c();
        boolean z3 = bj0Var.a().a;
        String strH = ul2Var.h();
        if (strH == null) {
            strH = null;
        }
        String strE = ul2Var.e();
        String str3 = strE == null ? null : strE;
        ChatEvents$PollingRecoveryCancellationCause chatEvents$PollingRecoveryCancellationCause3 = chatEvents$PollingRecoveryOutcome == ChatEvents$PollingRecoveryOutcome.CANCELLED ? chatEvents$PollingRecoveryCancellationCause2 : null;
        String str4 = strH;
        Boolean boolD = ul2Var.d();
        String strF = ul2Var.f();
        long j = jA - jB;
        if (j < 0) {
            j = 0;
        }
        String strI = ul2Var.i();
        if (strI == null) {
            strI = null;
        }
        qi3Var.e(new ChatEvents$PollingRecoveryCompleted(strJ, strA, chatEvents$PollingRecoveryOutcome, chatEvents$PollingRecoveryTriggerReasonL, iB, jA, lG, Boolean.valueOf(zC), Boolean.valueOf(z3), str4, chatEvents$PollingRecoveryCancellationCause3, boolD, strF, str2, str3, Long.valueOf(j), strI), ChatEvents$PollingRecoveryCompleted.Companion.serializer());
        if (ul2Var.l() == ChatEvents$PollingRecoveryTriggerReason.STREAM_FAILED) {
            bne ymeVar = em2Var.q;
            if (ymeVar == null) {
                String lowerCase = chatEvents$PollingRecoveryOutcome.name().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                ymeVar = new yme("client_error", "polling_recovery_".concat(lowerCase));
            }
            switch (wl2.a[chatEvents$PollingRecoveryOutcome.ordinal()]) {
                case 1:
                    if (!z2) {
                        ymeVar = ane.a;
                    }
                    break;
                case 2:
                case 3:
                    ymeVar = xme.a;
                    break;
                case 4:
                case 5:
                case 6:
                    break;
                default:
                    mr9.b();
                    return;
            }
            hi6 hi6Var = em2Var.p;
            if (hi6Var != null) {
                hi6Var.F(ymeVar);
            }
            em2Var.q = null;
        }
    }

    public final void e(ChatEvents$BusyContainerSendRetryOutcome chatEvents$BusyContainerSendRetryOutcome) {
        chatEvents$BusyContainerSendRetryOutcome.getClass();
        kl2 kl2Var = this.n;
        if (kl2Var == null) {
            return;
        }
        this.n = null;
        this.a.e(new ChatEvents$BusyContainerSendRetryCompleted(chatEvents$BusyContainerSendRetryOutcome, kl2Var.b(), this.d.a() - kl2Var.f(), kl2Var.c(), kl2Var.e(), kl2Var.d()), ChatEvents$BusyContainerSendRetryCompleted.Companion.serializer());
    }

    public final void f(ChatEvents$SendRetryOutcome chatEvents$SendRetryOutcome, Throwable th) {
        cpc cpcVar;
        chatEvents$SendRetryOutcome.getClass();
        sl2 sl2Var = this.m;
        if (sl2Var == null) {
            return;
        }
        this.m = null;
        nl2 nl2VarC = sl2Var.c();
        Throwable thD = th == null ? sl2Var.d() : th;
        if (thD instanceof ServerSentEventError) {
            ServerSentEventError serverSentEventError = (ServerSentEventError) thD;
            cpcVar = new cpc(serverSentEventError.getE().getE(), serverSentEventError.getE().getC());
        } else {
            cpcVar = thD instanceof ServerSentEventException ? new cpc(null, jce.a.b(((ServerSentEventException) thD).getE().getClass()).f()) : thD == null ? new cpc(null, null) : new cpc(null, jce.a.b(thD.getClass()).f());
        }
        Integer num = (Integer) cpcVar.E;
        String str = (String) cpcVar.F;
        String strK = nl2VarC.k();
        String strA = nl2VarC.a();
        int iB = sl2Var.b();
        long jA = this.d.a() - sl2Var.e();
        Boolean boolValueOf = Boolean.valueOf(nl2VarC.s());
        String strD = nl2VarC.d();
        String strJ = nl2VarC.j();
        this.a.e(new ChatEvents$SendRetryCompleted(strK, strA, chatEvents$SendRetryOutcome, iB, jA, boolValueOf, num, str, strD, strJ == null ? null : strJ), ChatEvents$SendRetryCompleted.Companion.serializer());
    }

    public final void g(String str, ChatEvents$ConversationLoadSource chatEvents$ConversationLoadSource, List list) {
        str.getClass();
        chatEvents$ConversationLoadSource.getClass();
        list.getClass();
        gb9.D(this.h, null, null, new am2(this.u.h(), this, this.x, list, str, chatEvents$ConversationLoadSource, null), 3);
    }

    public final void h(ChatEvents$StreamingMessageCompletionStatus chatEvents$StreamingMessageCompletionStatus, nl2 nl2Var, String str, vl2 vl2Var, boolean z, List list) {
        Double streaming_jank_sample_rate;
        ad9 ad9Var = rx2.a;
        ad9Var.getClass();
        md9 md9Var = this.f;
        vc9 vc9Var = (vc9) md9Var.c.get(od9.b(ad9Var));
        zc9 zc9VarB = vc9Var != null ? vc9Var.b() : null;
        if (zc9VarB == null) {
            return;
        }
        MobileObservabilityConfig mobileObservabilityConfig = (MobileObservabilityConfig) this.e.l(MobileObservabilityConfig.CONFIG_NAME, MobileObservabilityConfig.Companion.serializer());
        double dDoubleValue = (mobileObservabilityConfig == null || (streaming_jank_sample_rate = mobileObservabilityConfig.getStreaming_jank_sample_rate()) == null) ? 1.0d : streaming_jank_sample_rate.doubleValue();
        if (dDoubleValue <= 0.0d || h1e.F.c() >= dDoubleValue) {
            return;
        }
        gb9.D(this.h, this.g.getDefault(), null, new bm2(this, nl2Var, str, chatEvents$StreamingMessageCompletionStatus, this.d.a() - vl2Var.a(), z, vl2Var.b(this.c), zc9VarB, list, Build.VERSION.SDK_INT >= 31 && md9Var.j > 0, null), 2);
    }

    public final ol2 i() {
        ol2 ol2Var = this.l;
        if (ol2Var != null) {
            this.l = null;
            return ol2Var;
        }
        zfa.a.getClass();
        if (yfa.b()) {
            String strE = iuj.E(this);
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (!arrayList.isEmpty()) {
                zfa.a.getClass();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.WARN, strE, "Terminal event called with no active completion response");
                }
            }
        }
        return ol2Var;
    }

    public final int k() {
        return this.u.h();
    }

    public final void l(List list) {
        ol2 ol2VarI = i();
        if (ol2VarI == null) {
            return;
        }
        nl2 nl2VarD = ol2VarI.d();
        long jA = this.d.a() - ol2VarI.c().a();
        boolean z = ol2VarI.e() != null;
        bj0 bj0Var = this.c;
        xi0 xi0VarA = bj0Var.a();
        long jB = ol2VarI.c().b(bj0Var);
        String strA = nl2VarD.a();
        String strD = nl2VarD.d();
        String strB = ol2VarI.b();
        String strJ = nl2VarD.j();
        String str = strJ == null ? null : strJ;
        int iF = nl2VarD.f();
        int iG = nl2VarD.g();
        boolean zT = nl2VarD.t();
        boolean zU = nl2VarD.u();
        boolean zS = nl2VarD.s();
        String strP = nl2VarD.p();
        String str2 = (strP == null || ThinkingMode.m1147isNonThinkingModeimpl(strP)) ? null : strP;
        ClaudeAiMessageEvents$ResearchMode claudeAiMessageEvents$ResearchMode = nl2VarD.m() ? ClaudeAiMessageEvents$ResearchMode.ADVANCED : ClaudeAiMessageEvents$ResearchMode.DISABLED;
        int iB = nl2VarD.b();
        int iE = nl2VarD.e();
        int iQ = nl2VarD.q();
        String strL = nl2VarD.l();
        this.a.e(new ClaudeAiMessageEvents$MessageStreamingAbandoned(jA, z, strA, strD, strB, str, iF, iG, zT, zU, zS, false, str2, claudeAiMessageEvents$ResearchMode, iB, iE, iQ, jB, true, strL == null ? null : strL), ClaudeAiMessageEvents$MessageStreamingAbandoned.Companion.serializer());
        ChatEvents$StreamingMessageCompletionStatus chatEvents$StreamingMessageCompletionStatus = ChatEvents$StreamingMessageCompletionStatus.ABANDONED;
        String strB2 = ol2VarI.b();
        if (strB2 == null) {
            strB2 = "";
        }
        h(chatEvents$StreamingMessageCompletionStatus, nl2VarD, strB2, ol2VarI.f(), !xi0VarA.a, list);
        hi6 hi6Var = this.p;
        if (hi6Var != null) {
            hi6Var.F(xme.a);
        }
    }

    public final void m() {
        this.x = this.d.a();
        isc iscVar = this.u;
        iscVar.i(iscVar.h() + 1);
        Boolean bool = Boolean.FALSE;
        lsc lscVar = this.v;
        lscVar.setValue(bool);
        this.w = this.A == 0;
        fkg fkgVar = this.y;
        tp4 tp4Var = null;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        n78 n78Var = this.z;
        if (n78Var != null) {
            this.y = gb9.D(this.h, null, null, new nn1(this, n78Var, tp4Var, 14), 3);
            return;
        }
        lscVar.setValue(Boolean.TRUE);
        List list = xah.a;
        xah.e(4, "onConversationLoadStarted with no ConversationLoadSignals", "perflog", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(defpackage.qik r51, boolean r52, defpackage.uhd r53, java.util.List r54, boolean r55) throws java.security.NoSuchAlgorithmException {
        /*
            Method dump skipped, instruction units count: 1383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.em2.n(qik, boolean, uhd, java.util.List, boolean):void");
    }

    public final void o(nl2 nl2Var, String str) {
        Long l;
        str.getClass();
        if (this.l != null) {
            ij0.y("Starting new completion while previous still active", null, false, 3);
            ol2 ol2Var = this.l;
            List listG = ol2Var != null ? ol2Var.g() : null;
            if (listG == null) {
                listG = lm6.E;
            }
            l(listG);
        }
        this.o = null;
        this.s.clear();
        this.n = null;
        long jA = this.d.a();
        bj0 bj0Var = this.c;
        xi0 xi0VarA = bj0Var.a();
        this.l = new ol2(new vl2(jA, xi0VarA.d + ((xi0VarA.a || (l = xi0VarA.b) == null) ? 0L : bj0Var.E.a() - l.longValue())), nl2Var);
        hi6 hi6Var = this.p;
        if (hi6Var != null) {
            hi6Var.F(xme.a);
        }
        this.q = null;
        HealthMetricAction healthMetricAction = HealthMetricAction.MESSAGE_SEND;
        String strJ = nl2Var.j();
        this.p = hl8.c(this.k, healthMetricAction, this.h, null, strJ == null ? null : strJ, 4);
        boolean zU = nl2Var.u();
        qi3 qi3Var = this.a;
        if (zU) {
            String strK = nl2Var.k();
            String strA = nl2Var.a();
            Boolean boolValueOf = Boolean.valueOf(nl2Var.s());
            ChatEvents$RetryCompletionReason chatEvents$RetryCompletionReasonO = nl2Var.o();
            String strL = nl2Var.l();
            String str2 = strL == null ? null : strL;
            String strN = nl2Var.n();
            qi3Var.e(new ChatEvents$RetryCompletion(strK, strA, boolValueOf, chatEvents$RetryCompletionReasonO, str2, strN == null ? null : strN), ChatEvents$RetryCompletion.Companion.serializer());
        } else {
            String strK2 = nl2Var.k();
            String strA2 = nl2Var.a();
            int iB = nl2Var.b();
            int iE = nl2Var.e();
            int i = nl2Var.i();
            String strJ2 = nl2Var.j();
            String str3 = strJ2 == null ? null : strJ2;
            String strC = nl2Var.c();
            String str4 = strC == null ? null : strC;
            Boolean boolValueOf2 = Boolean.valueOf(nl2Var.s());
            String strL2 = nl2Var.l();
            qi3Var.e(new ChatEvents$SendMessage(strK2, strA2, iB, iE, i, str3, str4, boolValueOf2, strL2 == null ? null : strL2, Boolean.valueOf(nl2Var.r())), ChatEvents$SendMessage.Companion.serializer());
        }
        this.b.a(nl2Var.h(), nl2Var.b(), nl2Var.e());
        if (nl2Var.u()) {
            return;
        }
        int iT = bnf.T(ide.c(D, str));
        int iT2 = bnf.T(ide.c(E, str));
        ml2 ml2Var = new ml2(iT2, iT - iT2);
        String strA3 = nl2Var.a();
        String strJ3 = nl2Var.j();
        String str5 = strJ3 == null ? null : strJ3;
        boolean z = nl2Var.b() > 0 || nl2Var.e() > 0;
        boolean z2 = nl2Var.i() > 0;
        int iG = nl2Var.g();
        boolean zT = nl2Var.t();
        boolean zS = nl2Var.s();
        int iA = ml2Var.a();
        int iB2 = ml2Var.b();
        Integer numValueOf = Integer.valueOf(nl2Var.f());
        Integer numValueOf2 = Integer.valueOf(nl2Var.b());
        Integer numValueOf3 = Integer.valueOf(nl2Var.e());
        Integer numValueOf4 = Integer.valueOf(nl2Var.q());
        String strP = nl2Var.p();
        String str6 = (strP == null || ThinkingMode.m1147isNonThinkingModeimpl(strP)) ? null : strP;
        ClaudeAiMessageEvents$ResearchMode claudeAiMessageEvents$ResearchMode = nl2Var.m() ? ClaudeAiMessageEvents$ResearchMode.ADVANCED : ClaudeAiMessageEvents$ResearchMode.DISABLED;
        String strL3 = nl2Var.l();
        qi3Var.e(new ClaudeAiMessageEvents$MessageSent(strA3, str5, z, z2, false, iG, zT, false, true, zS, false, "", iA, iB2, numValueOf, numValueOf2, numValueOf3, numValueOf4, str6, claudeAiMessageEvents$ResearchMode, strL3 == null ? null : strL3), ClaudeAiMessageEvents$MessageSent.Companion.serializer());
    }

    public final void q(String str, String str2, ChatEvents$PollingRecoveryTriggerReason chatEvents$PollingRecoveryTriggerReason, boolean z, Long l, String str3, String str4, String str5, String str6) {
        str.getClass();
        str2.getClass();
        chatEvents$PollingRecoveryTriggerReason.getClass();
        r(str, str2, chatEvents$PollingRecoveryTriggerReason, z, l, str3, str4, str5);
        p(this, ChatEvents$PollingRecoveryOutcome.SKIPPED, null, str6, false, 10);
    }

    public final void r(String str, String str2, ChatEvents$PollingRecoveryTriggerReason chatEvents$PollingRecoveryTriggerReason, boolean z, Long l, String str3, String str4, String str5) {
        Boolean boolValueOf;
        Long l2;
        List<McpToolApprovalOption> approval_options;
        str.getClass();
        str2.getClass();
        chatEvents$PollingRecoveryTriggerReason.getClass();
        bj0 bj0Var = this.c;
        boolean z2 = bj0Var.a().a;
        if (this.r != null) {
            return;
        }
        ContentBlock contentBlock = this.o;
        if (chatEvents$PollingRecoveryTriggerReason != ChatEvents$PollingRecoveryTriggerReason.STREAM_FAILED) {
            contentBlock = null;
        }
        if (contentBlock != null) {
            ToolUseBlock toolUseBlock = contentBlock instanceof ToolUseBlock ? (ToolUseBlock) contentBlock : null;
            boolean z3 = false;
            if (toolUseBlock != null && (approval_options = toolUseBlock.getApproval_options()) != null && (!approval_options.isEmpty())) {
                z3 = true;
            }
            boolValueOf = Boolean.valueOf(z3);
        } else {
            boolValueOf = null;
        }
        String strD = contentBlock != null ? gqk.d(contentBlock) : null;
        long jA = this.d.a();
        xi0 xi0VarA = bj0Var.a();
        this.r = new ul2(str, str2, chatEvents$PollingRecoveryTriggerReason, z2, l, str3, str4, str5, boolValueOf, strD, new vl2(jA, xi0VarA.d + ((xi0VarA.a || (l2 = xi0VarA.b) == null) ? 0L : bj0Var.E.a() - l2.longValue())));
        this.a.e(new ChatEvents$PollingRecoveryStarted(str, str2, chatEvents$PollingRecoveryTriggerReason, z, l, (Boolean) null, Boolean.valueOf(z2), str3 == null ? null : str3, str4 == null ? null : str4, str5 == null ? null : str5, 32, (mq5) null), ChatEvents$PollingRecoveryStarted.Companion.serializer());
    }

    public final void s() {
        f(ChatEvents$SendRetryOutcome.CANCELLED, null);
        e(ChatEvents$BusyContainerSendRetryOutcome.CANCELLED);
        ol2 ol2Var = this.l;
        List listG = ol2Var != null ? ol2Var.g() : null;
        if (listG == null) {
            listG = lm6.E;
        }
        l(listG);
    }

    public final void t(MobileToolEvents$MobileToolKind mobileToolEvents$MobileToolKind, String str, String str2, String str3, String str4, Boolean bool, Long l) {
        nl2 nl2VarD;
        String strA;
        String str5 = str3 == null ? "" : str3;
        ol2 ol2Var = this.l;
        this.a.e(new MobileToolEvents$MobileToolResolved(mobileToolEvents$MobileToolKind, str, str2, str5, (ol2Var == null || (nl2VarD = ol2Var.d()) == null || (strA = nl2VarD.a()) == null) ? "" : strA, str4, (String) null, MobileToolEvents$MobileToolOutcome.OK, bool, (String) null, l, 576, (mq5) null), MobileToolEvents$MobileToolResolved.Companion.serializer());
    }
}
