package defpackage;

import android.content.Context;
import com.anthropic.claude.analytics.events.ChatEvents$CompactionCompleted;
import com.anthropic.claude.analytics.events.ChatEvents$CompactionOutcome;
import com.anthropic.claude.analytics.events.ChatEvents$Create;
import com.anthropic.claude.analytics.events.ChatEvents$PollingRecoveryCancellationCause;
import com.anthropic.claude.analytics.events.ChatEvents$PollingRecoveryOutcome;
import com.anthropic.claude.analytics.events.ChatEvents$PollingRecoveryTriggerReason;
import com.anthropic.claude.analytics.events.ChatEvents$RetryCompletionReason;
import com.anthropic.claude.analytics.events.McpEvents$McpAppError;
import com.anthropic.claude.analytics.events.McpEvents$McpAppErrorPhase;
import com.anthropic.claude.analytics.events.McpEvents$McpToolsCalled;
import com.anthropic.claude.analytics.events.MessageFileEvents$DownloadSource;
import com.anthropic.claude.analytics.events.MessageFileEvents$FileDownloadRequested;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePermissionAction;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePermissionCategory;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePermissionChanged;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePermissionChangedSource;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePermissionState;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePermissionType;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePromptAction;
import com.anthropic.claude.analytics.events.OfflineEvents$OfflineScreen;
import com.anthropic.claude.analytics.events.PushEvents$ChatNotificationUpsellClicked;
import com.anthropic.claude.analytics.events.ScreenSource;
import com.anthropic.claude.analytics.events.SearchEvents$SheetSourceClicked;
import com.anthropic.claude.analytics.events.SearchEvents$SourceType;
import com.anthropic.claude.analytics.health.HealthMetricAction;
import com.anthropic.claude.api.chat.ChatConversation;
import com.anthropic.claude.api.chat.ChatMessage;
import com.anthropic.claude.api.chat.CreateChatRequest;
import com.anthropic.claude.api.chat.InputMode;
import com.anthropic.claude.api.chat.MessageImageFile;
import com.anthropic.claude.api.chat.ToolState;
import com.anthropic.claude.api.chat.ToolStateContentBlock;
import com.anthropic.claude.api.common.RateLimit;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.api.mcp.McpToolApprovalOption;
import com.anthropic.claude.api.model.ThinkingState;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.artifact.model.ArtifactMetadata;
import com.anthropic.claude.artifact.model.WiggleArtifactIdentifier;
import com.anthropic.claude.artifact.sheet.ArtifactBottomSheetParams;
import com.anthropic.claude.bell.tts.f;
import com.anthropic.claude.chat.ChatScreenParams;
import com.anthropic.claude.chat.parse.ParsedContentBlockId;
import com.anthropic.claude.configs.flags.MessageQueueConfig;
import com.anthropic.claude.configs.flags.PollingRecoveryConfig;
import com.anthropic.claude.configs.flags.SendRetryConfig;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.mcpapps.b;
import com.anthropic.claude.mcpapps.transport.McpUiContentBlock;
import com.anthropic.claude.tool.model.CreateFileInput;
import com.anthropic.claude.tool.model.KnowledgeSource;
import com.anthropic.claude.tool.model.PresentFilesInput;
import com.anthropic.claude.tool.model.ToolInvocationResult$Report;
import com.anthropic.claude.types.strings.ArtifactIdentifier;
import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.ProjectId;
import com.anthropic.claude.types.strings.ResearchMode;
import com.anthropic.claude.types.strings.ResearchTaskId;
import com.anthropic.claude.types.strings.ToolUseId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class t53 extends iwe implements yp0 {
    public final qs2 A;
    public final lsc A0;
    public final efe A1;
    public final jzg B;
    public final lsc B0;
    public fkg B1;
    public final faj C;
    public final lsc C0;
    public fkg C1;
    public final q0i D;
    public final lsc D0;
    public fkg D1;
    public final bj0 E;
    public final wz5 E0;
    public fkg E1;
    public final yle F;
    public final lsc F0;
    public final kdg F1;
    public final b1i G;
    public final lsc G0;
    public final kdg G1;
    public final abj H;
    public final lsc H0;
    public final wz5 H1;
    public final ole I;
    public final lsc I0;
    public final lsc I1;
    public final gob J;
    public final lsc J0;
    public final lsc J1;
    public final x97 K;
    public final lsc K0;
    public final lsc K1;
    public final f9 L;
    public final String L0;
    public final lsc L1;
    public final lea M;
    public final wz5 M0;
    public final lsc M1;
    public final myh N;
    public final wz5 N0;
    public final wz5 N1;
    public final lgb O;
    public final wz5 O0;
    public final wz5 O1;
    public final sa6 P;
    public final lsc P0;
    public final wlg P1;
    public final z8c Q;
    public final wz5 Q0;
    public final wlg Q1;
    public final na3 R;
    public final lsc R0;
    public final wz5 R1;
    public final saj S;
    public final lsc S0;
    public final wz5 S1;
    public final lq0 T;
    public final wz5 T0;
    public final wz5 T1;
    public final om2 U;
    public final wlg U0;
    public final lsc U1;
    public final cr9 V;
    public final wlg V0;
    public final AtomicReference V1;
    public final h86 W;
    public final wz5 W0;
    public final LinkedHashSet W1;
    public final b X;
    public final kdg X0;
    public final g11 X1;
    public final bg9 Y;
    public final wz5 Y0;
    public hi6 Y1;
    public final ze0 Z;
    public final wz5 Z0;
    public boolean Z1;
    public final String a0;
    public final lsc a1;
    public final LinkedHashSet a2;
    public final ChatScreenParams b;
    public final f1c b0;
    public fkg b1;
    public final LinkedHashSet b2;
    public final Context c;
    public final a8f c0;
    public final wz5 c1;
    public final lsc c2;
    public final koi d;
    public final com.anthropic.claude.connector.auth.b d0;
    public final wz5 d1;
    public final wz5 d2;
    public final q7 e;
    public final fb6 e0;
    public final lsc e1;
    public final wz5 e2;
    public final pkc f;
    public final dpf f0;
    public final wz5 f1;
    public final lsc f2;
    public final mn5 g;
    public final r93 g0;
    public final wz5 g1;
    public final wz5 g2;
    public final oof h;
    public final em2 h0;
    public final wz5 h1;
    public final lsc h2;
    public final dl2 i;
    public final zy1 i0;
    public final wz5 i1;
    public final wz5 i2;
    public final nm2 j;
    public final zy1 j0;
    public final wz5 j1;
    public boolean j2;
    public final nz2 k;
    public final zy1 k0;
    public final wz5 k1;
    public final lsc k2;
    public final uz2 l;
    public final x0a l0;
    public final kdg l1;
    public final wz5 l2;
    public final vd3 m;
    public final lsc m0;
    public final wz5 m1;
    public boolean m2;
    public final wqd n;
    public final mdg n0;
    public final wz5 n1;
    public final wz5 n2;
    public final omd o;
    public final LinkedHashSet o0;
    public final wz5 o1;
    public final fod p;
    public final LinkedHashMap p0;
    public final wz5 p1;
    public final zkg q;
    public final LinkedHashSet q0;
    public final wz5 q1;
    public final f r;
    public final wz5 r0;
    public final wz5 r1;
    public final f4j s;
    public final fj0 s0;
    public final wlg s1;
    public final kah t;
    public final lsc t0;
    public final wz5 t1;
    public final rc8 u;
    public final lsc u0;
    public final wz5 u1;
    public final m78 v;
    public final mdg v0;
    public final lsc v1;
    public final qi3 w;
    public final lsc w0;
    public final lsc w1;
    public final hl8 x;
    public final lsc x0;
    public final lsc x1;
    public final fk0 y;
    public final wz5 y0;
    public final lsc y1;
    public final am0 z;
    public zw z0;
    public d43 z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t53(ChatScreenParams chatScreenParams, com.arkivanov.essenty.statekeeper.b bVar, Context context, koi koiVar, q7 q7Var, pkc pkcVar, mn5 mn5Var, oof oofVar, dl2 dl2Var, nm2 nm2Var, nz2 nz2Var, uz2 uz2Var, vd3 vd3Var, wqd wqdVar, omd omdVar, fod fodVar, zkg zkgVar, f fVar, f4j f4jVar, kah kahVar, rc8 rc8Var, m78 m78Var, qi3 qi3Var, hl8 hl8Var, fm2 fm2Var, fk0 fk0Var, am0 am0Var, qs2 qs2Var, jzg jzgVar, faj fajVar, q0i q0iVar, bj0 bj0Var, yle yleVar, b1i b1iVar, abj abjVar, ole oleVar, gob gobVar, x97 x97Var, xa3 xa3Var, f9 f9Var, spb spbVar, lea leaVar, myh myhVar, lgb lgbVar, sa6 sa6Var, z8c z8cVar, na3 na3Var, saj sajVar, lq0 lq0Var, om2 om2Var, cr9 cr9Var, h86 h86Var, b bVar2, bg9 bg9Var, ze0 ze0Var, String str, f1c f1cVar, a8f a8fVar, com.anthropic.claude.connector.auth.b bVar3, fb6 fb6Var) {
        super(h86Var);
        chatScreenParams.getClass();
        bVar.getClass();
        this.b = chatScreenParams;
        this.c = context;
        this.d = koiVar;
        this.e = q7Var;
        this.f = pkcVar;
        this.g = mn5Var;
        this.h = oofVar;
        this.i = dl2Var;
        this.j = nm2Var;
        this.k = nz2Var;
        this.l = uz2Var;
        this.m = vd3Var;
        this.n = wqdVar;
        this.o = omdVar;
        this.p = fodVar;
        this.q = zkgVar;
        this.r = fVar;
        this.s = f4jVar;
        this.t = kahVar;
        this.u = rc8Var;
        this.v = m78Var;
        this.w = qi3Var;
        this.x = hl8Var;
        this.y = fk0Var;
        this.z = am0Var;
        this.A = qs2Var;
        this.B = jzgVar;
        this.C = fajVar;
        this.D = q0iVar;
        this.E = bj0Var;
        this.F = yleVar;
        this.G = b1iVar;
        this.H = abjVar;
        this.I = oleVar;
        this.J = gobVar;
        this.K = x97Var;
        this.L = f9Var;
        this.M = leaVar;
        this.N = myhVar;
        this.O = lgbVar;
        this.P = sa6Var;
        this.Q = z8cVar;
        this.R = na3Var;
        this.S = sajVar;
        this.T = lq0Var;
        this.U = om2Var;
        this.V = cr9Var;
        this.W = h86Var;
        this.X = bVar2;
        this.Y = bg9Var;
        this.Z = ze0Var;
        this.a0 = str;
        this.b0 = f1cVar;
        this.c0 = a8fVar;
        this.d0 = bVar3;
        this.e0 = fb6Var;
        this.f0 = new dpf(chatScreenParams.m591getChatIdRjYBDck(), bVar, new b33(this, 12), new t43(this, 1));
        this.g0 = new r93(this, pkcVar, rc8Var, xa3Var, f9Var, spbVar, q7Var, leaVar, this.a, vd3Var, qi3Var);
        mp4 mp4Var = this.a;
        b33 b33Var = new b33(this, 2);
        mp4Var.getClass();
        em2 em2Var = new em2(fm2Var.a, fm2Var.b, fm2Var.c, fm2Var.d, fm2Var.e, fm2Var.f, fm2Var.g, mp4Var, b33Var, fm2Var.h, fm2Var.i);
        this.h0 = em2Var;
        this.i0 = x44.a();
        this.j0 = x44.a();
        this.k0 = x44.a();
        this.l0 = new x0a();
        Boolean bool = Boolean.FALSE;
        this.m0 = mpk.P(bool);
        this.n0 = new mdg();
        this.o0 = new LinkedHashSet();
        this.p0 = new LinkedHashMap();
        this.q0 = new LinkedHashSet();
        a5 a5Var = a5.N;
        int i = 10;
        this.r0 = mpk.x(new b33(this, i), a5Var);
        int i2 = 8;
        it2 it2Var = new it2(i2);
        fj0 fj0Var = new fj0();
        fj0Var.E = it2Var;
        fj0Var.F = new LinkedHashMap();
        fj0Var.G = new qo0();
        this.s0 = fj0Var;
        tp4 tp4Var = null;
        this.t0 = mpk.P(null);
        this.u0 = mpk.P(bool);
        this.v0 = new mdg();
        this.w0 = mpk.P(null);
        this.x0 = mpk.P(bool);
        int i3 = 13;
        this.y0 = mpk.x(new b33(this, i3), a5Var);
        this.A0 = mpk.P(fm3.E);
        this.B0 = mpk.P(null);
        this.C0 = mpk.P(bool);
        this.D0 = mpk.P(null);
        this.E0 = mpk.x(new b33(this, 14), a5Var);
        this.F0 = mpk.P(new Date());
        this.G0 = mpk.P(null);
        this.H0 = mpk.P(bool);
        this.I0 = mpk.P(bool);
        this.J0 = mpk.P(bool);
        this.K0 = mpk.P(bool);
        String strM591getChatIdRjYBDck = chatScreenParams.m591getChatIdRjYBDck();
        this.L0 = strM591getChatIdRjYBDck;
        this.M0 = mpk.w(new w13(this, 19));
        this.N0 = mpk.x(new w13(this, 20), a5Var);
        this.O0 = mpk.x(new w13(this, 21), a5Var);
        this.P0 = mpk.P(bool);
        this.Q0 = mpk.w(new w13(this, 22));
        String strM593getProjectIdvfJkQ = chatScreenParams.m593getProjectIdvfJkQ();
        this.R0 = mpk.P(strM593getProjectIdvfJkQ != null ? ProjectId.m1079boximpl(strM593getProjectIdvfJkQ) : null);
        this.S0 = mpk.P(bool);
        this.T0 = mpk.x(new w13(this, 24), a5Var);
        this.U0 = rc8Var.f(SendRetryConfig.FEATURE_KEY, SendRetryConfig.Companion.serializer());
        this.V0 = rc8Var.f(MessageQueueConfig.FEATURE_KEY, MessageQueueConfig.Companion.serializer());
        this.W0 = mpk.w(new b33(this, 16));
        mpk.x(new b33(this, 17), a5Var);
        this.X0 = new kdg();
        this.Y0 = mpk.w(new w13(this, 25));
        this.Z0 = mpk.w(new w13(this, 26));
        this.a1 = mpk.P(null);
        this.c1 = mpk.w(new w13(this, 27));
        char c = 0;
        this.d1 = mpk.w(new b33(this, c));
        this.e1 = mpk.P(bool);
        this.f1 = mpk.w(new w13(this, 2));
        this.g1 = mpk.w(new b33(this, 1));
        int i4 = 3;
        this.h1 = mpk.w(new w13(this, i4));
        int i5 = 4;
        this.i1 = mpk.w(new w13(this, i5));
        mpk.w(new b33(this, i4));
        this.j1 = mpk.w(new b33(this, i5));
        int i6 = 5;
        this.k1 = mpk.w(new b33(this, i6));
        this.l1 = new kdg();
        this.m1 = mpk.w(new w13(this, i6));
        int i7 = 6;
        this.n1 = mpk.x(new b33(this, i7), a5Var);
        int i8 = 7;
        this.o1 = mpk.x(new b33(this, i8), a5Var);
        this.p1 = mpk.x(new b33(this, i2), a5Var);
        int i9 = 9;
        this.q1 = mpk.x(new b33(this, i9), a5Var);
        this.r1 = mpk.w(new w13(this, i7));
        wlg wlgVarM = rc8Var.m("claude_ai_tasks_nav");
        this.s1 = wlgVarM;
        this.t1 = mpk.x(new w13(this, i8), a5Var);
        this.u1 = mpk.x(new w13(this, i2), a5Var);
        this.v1 = mpk.P(RateLimit.WithinLimit.INSTANCE);
        this.w1 = mpk.P(null);
        this.x1 = mpk.P(u03.a);
        this.y1 = mpk.P(0);
        this.z1 = a43.a;
        this.A1 = new efe(i6, c);
        this.F1 = new kdg();
        this.G1 = new kdg();
        this.H1 = mpk.w(new w13(this, i9));
        this.I1 = mpk.P(null);
        this.J1 = mpk.P(bool);
        this.K1 = mpk.P(bool);
        this.L1 = mpk.P(null);
        this.M1 = mpk.P(null);
        this.N1 = mpk.w(new w13(this, i));
        int i10 = 11;
        this.O1 = mpk.x(new w13(this, i10), a5Var);
        this.P1 = rc8Var.m("mobile_claude_speaks");
        this.Q1 = rc8Var.m("mobile_use_ucr_for_wiggle");
        this.R1 = mpk.w(new t43(this, c));
        this.S1 = mpk.w(new w13(this, 12));
        this.T1 = mpk.w(new w13(this, i3));
        this.U1 = mpk.P(null);
        this.V1 = new AtomicReference(null);
        this.W1 = new LinkedHashSet();
        int i11 = 3;
        gb9.D(this.a, null, null, new f33(this, tp4Var, 1), 3);
        gb9.D(this.a, null, null, new f33(this, tp4Var, 2), 3);
        gb9.D(this.a, null, null, new f33(this, tp4Var, i11), 3);
        strM591getChatIdRjYBDck.getClass();
        int i12 = 18;
        j8.T(new gq7(new b3f(new dx(new er7(new cpc(null, null), mpk.d0(new l80(vd3Var, i12, strM591getChatIdRjYBDck)), new zzh(i11, tp4Var), 0), tp4Var, i10)), new f33(this, tp4Var, 4), 2), this.a);
        gb9.D(this.a, null, null, new f33(this, tp4Var, i6), 3);
        gb9.D(this.a, null, null, new f33(this, tp4Var, 6), 3);
        gb9.D(this.a, null, null, new f33(this, tp4Var, 7), 3);
        gb9.D(this.a, null, null, new f33(this, tp4Var, 8), 3);
        if (((Boolean) wlgVarM.getValue()).booleanValue()) {
            gb9.D(this.a, null, null, new f33(this, tp4Var, 9), 3);
        }
        gb9.D(this.a, null, null, new f33(this, tp4Var, c), 3);
        this.X1 = new g11(0, false, false);
        em2Var.z = new n78(8, this);
        this.a2 = new LinkedHashSet();
        rc8Var.m("mobile_chat_feedback_ui_enabled");
        this.b2 = new LinkedHashSet();
        this.c2 = mpk.P(bool);
        gb9.D(this.a, h86Var.b(), null, new i30(this, null, 1), 2);
        this.d2 = mpk.x(new w13(this, 14), a5Var);
        this.e2 = mpk.x(new w13(this, 15), a5Var);
        this.f2 = mpk.P(bool);
        this.g2 = mpk.x(new w13(this, 16), a5Var);
        this.h2 = mpk.P(bool);
        this.i2 = mpk.x(new w13(this, 17), a5Var);
        this.k2 = mpk.P(bool);
        this.l2 = mpk.x(new w13(this, i12), a5Var);
        this.n2 = mpk.x(new b33(this, i10), a5Var);
    }

    public static void E1(t53 t53Var, String str) {
        t53Var.w.e(new McpEvents$McpToolsCalled(t53Var.d.e, str, 0), McpEvents$McpToolsCalled.Companion.serializer());
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a8, code lost:
    
        if (r8.b(r1, defpackage.b63.a) == r6) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O(defpackage.t53 r8, java.util.List r9, defpackage.vba r10, defpackage.vp4 r11) {
        /*
            kdg r0 = r8.X0
            boolean r1 = r11 instanceof defpackage.f43
            if (r1 == 0) goto L15
            r1 = r11
            f43 r1 = (defpackage.f43) r1
            int r2 = r1.H
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.H = r2
            goto L1a
        L15:
            f43 r1 = new f43
            r1.<init>(r8, r11)
        L1a:
            java.lang.Object r11 = r1.F
            int r2 = r1.H
            r3 = 2
            r4 = 0
            r5 = 1
            m45 r6 = defpackage.m45.E
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L34
            if (r2 != r3) goto L2e
            defpackage.sf5.h0(r11)
            goto Lab
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r8)
            return r4
        L34:
            vba r10 = r1.E
            defpackage.sf5.h0(r11)
            goto L4e
        L3a:
            defpackage.sf5.h0(r11)
            r1.E = r10
            r1.H = r5
            uz2 r11 = r8.l
            boolean r2 = r8.f1()
            java.lang.Object r11 = defpackage.uz2.b(r11, r9, r2, r1, r3)
            if (r11 != r6) goto L4e
            goto Laa
        L4e:
            java.util.List r11 = (java.util.List) r11
            vba r9 = defpackage.vba.CACHE
            if (r10 != r9) goto L5d
            boolean r9 = r0.isEmpty()
            if (r9 != 0) goto L5d
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L5d:
            boolean r9 = r8.I0()
            r8.z1(r11)
            r8.w1(r5)
            if (r9 != 0) goto L86
            em2 r2 = r8.h0
            java.lang.String r7 = r8.L0
            int r10 = r10.ordinal()
            if (r10 == 0) goto L81
            if (r10 == r5) goto L7e
            if (r10 != r3) goto L7a
            com.anthropic.claude.analytics.events.ChatEvents$ConversationLoadSource r10 = com.anthropic.claude.analytics.events.ChatEvents$ConversationLoadSource.UNSPECIFIED
            goto L83
        L7a:
            defpackage.mr9.b()
            return r4
        L7e:
            com.anthropic.claude.analytics.events.ChatEvents$ConversationLoadSource r10 = com.anthropic.claude.analytics.events.ChatEvents$ConversationLoadSource.INITIAL_CACHE
            goto L83
        L81:
            com.anthropic.claude.analytics.events.ChatEvents$ConversationLoadSource r10 = com.anthropic.claude.analytics.events.ChatEvents$ConversationLoadSource.INITIAL_NETWORK
        L83:
            r2.g(r7, r10, r11)
        L86:
            lsc r10 = r8.J0
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r10.setValue(r11)
            if (r9 != 0) goto L9c
            boolean r9 = r0.isEmpty()
            if (r9 != 0) goto L9c
            lsc r9 = r8.m0
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r9.setValue(r10)
        L9c:
            zy1 r8 = r8.i0
            r1.E = r4
            r1.H = r3
            b63 r9 = defpackage.b63.a
            java.lang.Object r8 = r8.b(r1, r9)
            if (r8 != r6) goto Lab
        Laa:
            return r6
        Lab:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t53.O(t53, java.util.List, vba, vp4):java.lang.Object");
    }

    public static final ArrayList P(t53 t53Var) {
        ToolStateContentBlock image;
        mdg mdgVar = t53Var.v0;
        if (mdgVar.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(mdgVar.size());
        Iterator it = mdgVar.F.iterator();
        while (((hmg) it).hasNext()) {
            Map.Entry entry = (Map.Entry) ((hmg) it).next();
            String str = (String) entry.getKey();
            List<McpUiContentBlock> list = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList(x44.y(list, 10));
            for (McpUiContentBlock mcpUiContentBlock : list) {
                if (mcpUiContentBlock instanceof McpUiContentBlock.Text) {
                    image = new ToolStateContentBlock.Text(((McpUiContentBlock.Text) mcpUiContentBlock).getText());
                } else {
                    if (!(mcpUiContentBlock instanceof McpUiContentBlock.Image)) {
                        mr9.b();
                        return null;
                    }
                    McpUiContentBlock.Image image2 = (McpUiContentBlock.Image) mcpUiContentBlock;
                    image = new ToolStateContentBlock.Image(image2.getData(), image2.getMimeType());
                }
                arrayList2.add(image);
            }
            arrayList.add(new ToolState(str, arrayList2));
        }
        return arrayList;
    }

    public static final String Q(t53 t53Var, McpServer mcpServer, String str) {
        List list = sya.a;
        String strD = sya.d(str, mcpServer.getUrl(), t53Var.b.m591getChatIdRjYBDck() + mcpServer.m346getUuidowoRr7k());
        String str2 = t53Var.a0;
        ze0 ze0Var = t53Var.Z;
        return sya.b(str2, strD, ze0Var.d, ze0Var.c);
    }

    public static final void R(t53 t53Var, String str) {
        if (str != null) {
            wqd wqdVar = t53Var.n;
            wqdVar.getClass();
            if (wqdVar.h.b(str) == null) {
                gb9.D(t53Var.a, null, null, new m33(t53Var, str, null, 1), 3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0086 A[EDGE_INSN: B:120:0x0086->B:41:0x0086 BREAK  A[LOOP:1: B:43:0x008c->B:123:0x008c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ce A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean S(defpackage.t53 r32, java.lang.String r33, java.lang.String r34, boolean r35) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t53.S(t53, java.lang.String, java.lang.String, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b0(defpackage.t53 r5, defpackage.vp4 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.n43
            if (r0 == 0) goto L13
            r0 = r6
            n43 r0 = (defpackage.n43) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            n43 r0 = new n43
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.G
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L26
            defpackage.sf5.h0(r6)
            goto L54
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return r3
        L2c:
            defpackage.sf5.h0(r6)
            k84 r6 = r5.E0()
            if (r6 == 0) goto L3a
            com.anthropic.claude.api.chat.messages.CompactionStatus$Status r6 = r6.c()
            goto L3b
        L3a:
            r6 = r3
        L3b:
            com.anthropic.claude.api.chat.messages.CompactionStatus$Status r1 = com.anthropic.claude.api.chat.messages.CompactionStatus.Status.FAILED
            if (r6 != r1) goto L54
            zy1 r6 = r5.j0
            pt6 r1 = new pt6
            r4 = 2131886964(0x7f120374, float:1.9408522E38)
            r1.<init>(r4)
            r0.G = r2
            java.lang.Object r6 = r6.b(r0, r1)
            m45 r0 = defpackage.m45.E
            if (r6 != r0) goto L54
            return r0
        L54:
            k84 r6 = r5.E0()
            if (r6 == 0) goto L5f
            com.anthropic.claude.api.chat.messages.CompactionStatus$Status r6 = r6.c()
            goto L60
        L5f:
            r6 = r3
        L60:
            com.anthropic.claude.api.chat.messages.CompactionStatus$Status r0 = com.anthropic.claude.api.chat.messages.CompactionStatus.Status.COMPACTING
            if (r6 != r0) goto L69
            com.anthropic.claude.analytics.events.ChatEvents$CompactionOutcome r6 = com.anthropic.claude.analytics.events.ChatEvents$CompactionOutcome.INTERRUPTED
            r5.C1(r6, r3)
        L69:
            r5.t1(r3)
            iei r5 = defpackage.iei.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t53.b0(t53, vp4):java.lang.Object");
    }

    public static final void c0(t53 t53Var) {
        t53Var.B1 = gb9.D(t53Var.a, null, null, new o43(t53Var.B1, t53Var, null, 0), 3);
    }

    public static final void d0(t53 t53Var) {
        kdg kdgVar = t53Var.X0;
        ChatConversation chatConversationA0 = t53Var.A0();
        String name = chatConversationA0 != null ? chatConversationA0.getName() : null;
        if ((name == null || name.length() == 0) && kdgVar.size() >= 2 && ((whd) kdgVar.get(1)).e().length() != 0) {
            fkg fkgVar = t53Var.D1;
            if (fkgVar == null || !fkgVar.c()) {
                t53Var.D1 = gb9.D(t53Var.a, null, null, new vo(t53Var, null), 3);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
    
        r13 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009f, code lost:
    
        if (r13 >= r7.size()) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a1, code lost:
    
        r6.h(r7, r13, defpackage.cw7.E);
        r22.q0(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a9, code lost:
    
        r0 = java.util.UUID.randomUUID().toString();
        r0.getClass();
        r7.add(new defpackage.uhd(com.anthropic.claude.types.strings.MessageId.m1052constructorimpl(r0), r13, com.anthropic.claude.api.chat.InputMode.RETRY, true, defpackage.lm6.E, !r24.isEmpty(), null, null, null, 1984));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d6, code lost:
    
        return;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e0(defpackage.t53 r22, java.lang.String r23, java.util.List r24, java.util.List r25, com.anthropic.claude.api.chat.InputMode r26, boolean r27, java.lang.String r28) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t53.e0(t53, java.lang.String, java.util.List, java.util.List, com.anthropic.claude.api.chat.InputMode, boolean, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f0(defpackage.t53 r28, defpackage.tp4 r29) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t53.f0(t53, tp4):java.lang.Object");
    }

    public static final void g0(t53 t53Var, String str, uxh uxhVar, String str2) {
        if (uxhVar instanceof ToolInvocationResult$Report) {
            gb9.D(t53Var.a, null, null, new cm(t53Var, str, uxhVar, str2, null, 19), 3);
            return;
        }
        t53Var.getClass();
        if (!x44.r(uxhVar, txh.a)) {
            mr9.b();
            return;
        }
        zfa.a.getClass();
        if (yfa.b()) {
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (arrayList.isEmpty()) {
                return;
            }
            zfa.a.getClass();
            String strI = ij0.i("Skipped tool report for ", ToolUseId.m1162toStringimpl(str));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((n30) ((zfa) it.next())).b(sfa.DEBUG, "ChatScreenData", strI);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h0(defpackage.t53 r21, java.util.List r22, defpackage.vp4 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t53.h0(t53, java.util.List, vp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f3, code lost:
    
        if (r3 == r11) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0158, code lost:
    
        if (defpackage.d4c.K(r12, r5) != r11) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015a, code lost:
    
        return r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i0(defpackage.t53 r18, java.lang.Throwable r19, defpackage.m02 r20, boolean r21, defpackage.vp4 r22) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t53.i0(t53, java.lang.Throwable, m02, boolean, vp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01c0, code lost:
    
        if (defpackage.d4c.K(r8, r7) != r4) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j0(defpackage.t53 r18, java.lang.Throwable r19, int r20, com.anthropic.claude.configs.flags.SendRetryConfig r21, defpackage.vp4 r22) {
        /*
            Method dump skipped, instruction units count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t53.j0(t53, java.lang.Throwable, int, com.anthropic.claude.configs.flags.SendRetryConfig, vp4):java.lang.Object");
    }

    public static /* synthetic */ Object j1(t53 t53Var, ChatEvents$PollingRecoveryTriggerReason chatEvents$PollingRecoveryTriggerReason, boolean z, String str, String str2, String str3, Long l, Long l2, xzg xzgVar, int i) {
        if ((i & 32) != 0) {
            l = null;
        }
        if ((i & 64) != 0) {
            l2 = null;
        }
        return t53Var.i1(chatEvents$PollingRecoveryTriggerReason, z, str, str2, str3, l, l2, xzgVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r9 == r5) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k0(defpackage.t53 r7, defpackage.y03 r8, defpackage.vp4 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.p53
            if (r0 == 0) goto L13
            r0 = r9
            p53 r0 = (defpackage.p53) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            p53 r0 = new p53
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.F
            int r1 = r0.H
            r2 = 0
            r3 = 2
            r4 = 1
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.sf5.h0(r9)
            return r9
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r2
        L31:
            y03 r8 = r0.E
            defpackage.sf5.h0(r9)
            goto L58
        L37:
            defpackage.sf5.h0(r9)
            mp4 r9 = r7.a
            h43 r1 = new h43
            r6 = 6
            r1.<init>(r7, r2, r6)
            r6 = 3
            fkg r9 = defpackage.gb9.D(r9, r2, r2, r1, r6)
            r7.C1 = r9
            fkg r9 = r7.E1
            if (r9 == 0) goto L5a
            r0.E = r8
            r0.H = r4
            java.lang.Object r9 = defpackage.knk.p(r9, r0)
            if (r9 != r5) goto L58
            goto L77
        L58:
            iei r9 = (defpackage.iei) r9
        L5a:
            u03 r9 = defpackage.u03.a
            r7.A1(r9)
            zy1 r7 = r7.i0
            f63 r9 = new f63
            boolean r8 = r8.d()
            r1 = 0
            e63 r4 = defpackage.e63.F
            r9.<init>(r8, r1, r4)
            r0.E = r2
            r0.H = r3
            java.lang.Object r7 = r7.b(r0, r9)
            if (r7 != r5) goto L78
        L77:
            return r5
        L78:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t53.k0(t53, y03, vp4):java.lang.Object");
    }

    public static final void k1(t53 t53Var, InputMode inputMode, String str, List list, List list2) {
        kdg kdgVar = t53Var.X0;
        int size = kdgVar.size();
        String string = UUID.randomUUID().toString();
        string.getClass();
        kdgVar.add(new vhd(MessageId.m1052constructorimpl(string), size, inputMode, str, list, list2));
        int size2 = kdgVar.size();
        String string2 = UUID.randomUUID().toString();
        string2.getClass();
        kdgVar.add(new uhd(MessageId.m1052constructorimpl(string2), size2, null, true, lm6.E, !list.isEmpty(), null, null, null, 1984));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l0(defpackage.t53 r9, defpackage.uhd r10, defpackage.vp4 r11) {
        /*
            boolean r0 = r11 instanceof defpackage.q53
            if (r0 == 0) goto L13
            r0 = r11
            q53 r0 = (defpackage.q53) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            q53 r0 = new q53
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.E
            int r1 = r0.G
            iei r2 = defpackage.iei.a
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            defpackage.sf5.h0(r11)
            return r2
        L28:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r9)
            return r4
        L2e:
            defpackage.sf5.h0(r11)
            if (r10 == 0) goto L84
            boolean r11 = r10.m()
            if (r11 == 0) goto L40
            boolean r11 = r10.b()
            if (r11 != 0) goto L40
            goto L41
        L40:
            r10 = r4
        L41:
            if (r10 != 0) goto L44
            goto L84
        L44:
            java.lang.Long r10 = r10.j()
            if (r10 == 0) goto L84
            long r10 = r10.longValue()
            oof r1 = r9.h
            long r5 = r1.a()
            long r5 = r5 - r10
            lz1 r10 = defpackage.uh6.F
            com.anthropic.claude.configs.flags.PollingRecoveryConfig r10 = r9.P0()
            int r10 = r10.getResponse_budget_sec()
            zh6 r11 = defpackage.zh6.SECONDS
            long r7 = defpackage.v40.Q(r10, r11)
            long r7 = defpackage.uh6.f(r7)
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 >= 0) goto L84
            r10 = 5
            long r10 = defpackage.v40.Q(r10, r11)
            h43 r1 = new h43
            r5 = 9
            r1.<init>(r9, r4, r5)
            r0.G = r3
            java.lang.Object r9 = defpackage.iuj.R(r10, r1, r0)
            m45 r10 = defpackage.m45.E
            if (r9 != r10) goto L84
            return r10
        L84:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t53.l0(t53, uhd, vp4):java.lang.Object");
    }

    public static void l1(t53 t53Var, String str, boolean z, String str2, McpToolApprovalOption mcpToolApprovalOption) {
        t53Var.getClass();
        str.getClass();
        if (!z && str2 != null) {
            E1(t53Var, "disallowed");
        }
        gb9.D(t53Var.a, null, null, new c53(t53Var, str, z, str2, mcpToolApprovalOption, null, 0), 3);
    }

    public static final void m0(t53 t53Var, List list, boolean z, long j, boolean z2) {
        if (t53Var.Z1) {
            return;
        }
        t53Var.Z1 = true;
        a8f a8fVar = t53Var.c0;
        OfflineEvents$OfflineScreen offlineEvents$OfflineScreen = OfflineEvents$OfflineScreen.CHAT;
        boolean z3 = !list.isEmpty();
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Date updated_at = ((ChatMessage) it.next()).getUpdated_at();
            Long lValueOf = updated_at != null ? Long.valueOf(updated_at.getTime()) : null;
            if (lValueOf != null) {
                arrayList.add(lValueOf);
            }
        }
        a8fVar.a(offlineEvents$OfflineScreen, z3, z, size, (Long) w44.W0(arrayList), j, z2);
    }

    public static final String n0(t53 t53Var, String str, String str2) {
        String str3;
        Object objG;
        kdg kdgVar = t53Var.X0;
        if (MessageId.m1054equalsimpl0(str, str2)) {
            return str;
        }
        ListIterator listIterator = kdgVar.listIterator();
        int i = 0;
        while (true) {
            c8a c8aVar = (c8a) listIterator;
            if (!c8aVar.hasNext()) {
                i = -1;
                break;
            }
            if (MessageId.m1054equalsimpl0(((whd) c8aVar.next()).c(), str)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            ListIterator listIterator2 = kdgVar.listIterator();
            int i2 = 0;
            while (true) {
                c8a c8aVar2 = (c8a) listIterator2;
                if (!c8aVar2.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (MessageId.m1054equalsimpl0(((whd) c8aVar2.next()).c(), str2)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                return str2;
            }
            SilentException.a(new SilentException(ij0.j("Cannot find message with UUID ", str, " to update")), ozf.F, false, 2);
            return str2;
        }
        ListIterator listIterator3 = kdgVar.listIterator();
        int i3 = 0;
        while (true) {
            c8a c8aVar3 = (c8a) listIterator3;
            if (!c8aVar3.hasNext()) {
                i3 = -1;
                break;
            }
            if (MessageId.m1054equalsimpl0(((whd) c8aVar3.next()).c(), str2)) {
                break;
            }
            i3++;
        }
        if (i3 != -1) {
            if (t53Var.a2.add(new cpc(MessageId.m1051boximpl(str), MessageId.m1051boximpl(str2)))) {
                SilentException.a(new SilentException(vb7.l(i, ".", ij0.p("updateMessageIdByUuid collision: server sent ", str2, i3, " (already at index ", ") while updating index "))), ozf.G, false, 2);
            }
            return null;
        }
        whd whdVar = (whd) kdgVar.get(i);
        if (whdVar instanceof vhd) {
            objG = vhd.f((vhd) whdVar, str2);
            str3 = str2;
        } else {
            if (!(whdVar instanceof uhd)) {
                mr9.b();
                return null;
            }
            str3 = str2;
            objG = uhd.g((uhd) whdVar, str3, null, null, null, null, 2038);
        }
        kdgVar.set(i, objG);
        return str3;
    }

    public static /* synthetic */ Object p0(t53 t53Var, a33 a33Var, vp4 vp4Var, int i) {
        boolean z = (i & 1) != 0;
        boolean z2 = (i & 2) == 0;
        bz7 it2Var = a33Var;
        if ((i & 4) != 0) {
            it2Var = new it2(10);
        }
        return t53Var.o0(z, z2, it2Var, vp4Var);
    }

    public final ChatConversation A0() {
        return (ChatConversation) this.M0.getValue();
    }

    public final void A1(b13 b13Var) {
        this.x1.setValue(b13Var);
    }

    public final em2 B0() {
        return this.h0;
    }

    public final void B1(MessageFileEvents$DownloadSource messageFileEvents$DownloadSource, String str) {
        str.getClass();
        messageFileEvents$DownloadSource.getClass();
        if (this.G.e()) {
            String strB = ikb.b(str);
            this.w.e(new MessageFileEvents$FileDownloadRequested(messageFileEvents$DownloadSource, strB), MessageFileEvents$FileDownloadRequested.Companion.serializer());
            gb9.D(this.a, null, null, new cm(this, str, messageFileEvents$DownloadSource, strB, null, 20), 3);
        }
    }

    public final String C0() {
        return this.L0;
    }

    public final void C1(ChatEvents$CompactionOutcome chatEvents$CompactionOutcome, String str) {
        k84 k84VarE0 = E0();
        if (k84VarE0 == null) {
            return;
        }
        this.w.e(new ChatEvents$CompactionCompleted(this.d.e, this.L0, chatEvents$CompactionOutcome, Long.valueOf(this.g.a() - k84VarE0.b()), str), ChatEvents$CompactionCompleted.Companion.serializer());
    }

    public final List D0(List list) {
        whb whbVarQ;
        list.getClass();
        if (list.isEmpty()) {
            return lm6.E;
        }
        Set setT1 = w44.t1(list);
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = this.X0.listIterator();
        while (true) {
            c8a c8aVar = (c8a) listIterator;
            if (!c8aVar.hasNext()) {
                return arrayList;
            }
            whd whdVar = (whd) c8aVar.next();
            if (whdVar instanceof uhd) {
                for (mtc mtcVar : ((uhd) whdVar).i()) {
                    if ((mtcVar instanceof vf8) && setT1.contains(((vf8) mtcVar).getId()) && (whbVarQ = c0l.q(mtcVar)) != null) {
                        arrayList.add(whbVarQ);
                    }
                }
            }
        }
    }

    public final void D1(ctc ctcVar, String str, String str2, Integer num) {
        McpEvents$McpAppErrorPhase mcpEvents$McpAppErrorPhase;
        String url;
        ctcVar.getClass();
        str.getClass();
        str2.getClass();
        if (this.b0.b()) {
            ParsedContentBlockId id = ctcVar.getId();
            LinkedHashSet linkedHashSet = this.b2;
            if (linkedHashSet.contains(id)) {
                return;
            }
            linkedHashSet.add(ctcVar.getId());
            McpServer mcpServerV0 = v0(ctcVar);
            String strD = ctcVar.d();
            fj0 fj0Var = this.s0;
            fj0Var.getClass();
            strD.getClass();
            vza vzaVar = (vza) ((LinkedHashMap) fj0Var.F).get(strD);
            if (vzaVar == null || !vzaVar.b()) {
                mcpEvents$McpAppErrorPhase = McpEvents$McpAppErrorPhase.LOAD;
                this.p0.remove(ctcVar.getId());
            } else {
                mcpEvents$McpAppErrorPhase = McpEvents$McpAppErrorPhase.RUN;
            }
            this.w.e(new McpEvents$McpAppError(this.d.e, mcpServerV0 != null ? mcpServerV0.m346getUuidowoRr7k() : null, ctcVar.a(), ctcVar.d(), str, mcpServerV0 != null ? mcpServerV0.getName() : null, str2, mcpEvents$McpAppErrorPhase, (mcpServerV0 == null || (url = mcpServerV0.getUrl()) == null) ? null : npk.b(url), num != null ? Long.valueOf(num.intValue()) : null), McpEvents$McpAppError.Companion.serializer());
        }
    }

    public final k84 E0() {
        return (k84) this.B0.getValue();
    }

    public final com.anthropic.claude.connector.auth.b F0() {
        return this.d0;
    }

    public final void F1(KnowledgeSource knowledgeSource, boolean z) {
        knowledgeSource.getClass();
        this.w.e(new SearchEvents$SheetSourceClicked(this.d.e, SearchEvents$SourceType.UNSPECIFIED, z, ScreenSource.CHAT_SCREEN), SearchEvents$SheetSourceClicked.Companion.serializer());
    }

    public final boolean G0() {
        return ((Boolean) this.J0.getValue()).booleanValue();
    }

    public final void G1(Project project) {
        String strM404getUuid5pmjbU = project != null ? project.m404getUuid5pmjbU() : null;
        String strV0 = V0();
        this.R0.setValue(strM404getUuid5pmjbU != null ? ProjectId.m1079boximpl(strM404getUuid5pmjbU) : null);
        String strH0 = H0();
        if (strH0 != null) {
            this.S0.setValue(Boolean.TRUE);
            gb9.D(this.a, null, null, new tm(this, strH0, strM404getUuid5pmjbU, project, strV0, (tp4) null), 3);
        }
    }

    public final String H0() {
        if (d1()) {
            return null;
        }
        return this.L0;
    }

    public final boolean I0() {
        return ((Boolean) this.I0.getValue()).booleanValue();
    }

    public final boolean J0() {
        return ((Boolean) this.Y0.getValue()).booleanValue();
    }

    public final boolean K0() {
        return ((blg) this.q.a.getValue()) != null;
    }

    public final fx2 L0() {
        return (fx2) this.a1.getValue();
    }

    public final uhd M0() {
        return (uhd) this.c1.getValue();
    }

    public final kdg N0() {
        return this.X0;
    }

    public final String O0() {
        return (String) this.U1.getValue();
    }

    public final PollingRecoveryConfig P0() {
        PollingRecoveryConfig pollingRecoveryConfig = (PollingRecoveryConfig) this.u.i(PollingRecoveryConfig.FEATURE_KEY, PollingRecoveryConfig.Companion.serializer());
        if (pollingRecoveryConfig != null) {
            return pollingRecoveryConfig;
        }
        return new PollingRecoveryConfig(0, 0L, 0L, 0, 0, false, false, 127, (mq5) null);
    }

    public final skd Q0() {
        return (skd) this.T0.getValue();
    }

    public final gtc R0(String str) {
        str.getClass();
        return (gtc) ((LinkedHashMap) z0().e()).get(ResearchTaskId.m1100boximpl(str));
    }

    public final yle S0() {
        return this.F;
    }

    public final cpc T0(gme gmeVar) {
        List listI;
        Object objO0 = w44.O0(gmeVar.b(), this.X0);
        uhd uhdVar = objO0 instanceof uhd ? (uhd) objO0 : null;
        mtc mtcVar = (uhdVar == null || (listI = uhdVar.i()) == null) ? null : (mtc) w44.O0(gmeVar.a(), listI);
        return new cpc(uhdVar, mtcVar instanceof gtc ? (gtc) mtcVar : null);
    }

    public final b13 U0() {
        return (b13) this.x1.getValue();
    }

    public final String V0() {
        ProjectId projectId = (ProjectId) this.R0.getValue();
        if (projectId != null) {
            return projectId.m1085unboximpl();
        }
        return null;
    }

    public final MobileAppUseEvents$MobileAppUsePermissionCategory W0(String str) {
        myh myhVar = this.N;
        myhVar.getClass();
        str.getClass();
        dxh dxhVar = (dxh) myhVar.h().get(str);
        rok rokVarL = dxhVar != null ? dxhVar.l() : null;
        if (x44.r(rokVarL, xxh.F) || x44.r(rokVarL, yxh.F)) {
            return MobileAppUseEvents$MobileAppUsePermissionCategory.CALENDAR;
        }
        if (x44.r(rokVarL, ayh.F)) {
            return MobileAppUseEvents$MobileAppUsePermissionCategory.LOCATION;
        }
        if (x44.r(rokVarL, zxh.F)) {
            return MobileAppUseEvents$MobileAppUsePermissionCategory.HEALTH;
        }
        if (rokVarL instanceof byh) {
            return MobileAppUseEvents$MobileAppUsePermissionCategory.CONNECTED_APP;
        }
        if (rokVarL == null) {
            return MobileAppUseEvents$MobileAppUsePermissionCategory.UNSPECIFIED;
        }
        mr9.b();
        return null;
    }

    public final void X0(String str, String str2, boolean z, boolean z2, String str3, String str4) {
        MobileAppUseEvents$MobileAppUsePermissionType mobileAppUseEvents$MobileAppUsePermissionType;
        rok rokVarL;
        en1 en1VarB;
        amg amgVarA;
        fn1 fn1Var;
        str.getClass();
        str3.getClass();
        if (z2) {
            fx2 fx2VarL0 = L0();
            fx2 fx2Var = fx2VarL0 != null ? fx2VarL0 : null;
            if (fx2Var == null || (en1VarB = fx2Var.a.b()) == null || (amgVarA = en1VarB.a()) == null || (fn1Var = (fn1) amgVarA.getValue()) == null) {
                return;
            }
            ((tn1) fn1Var).r(str, str2, str3, z, str4);
            return;
        }
        String str5 = str;
        MobileAppUseEvents$MobileAppUsePermissionAction mobileAppUseEvents$MobileAppUsePermissionAction = z ? MobileAppUseEvents$MobileAppUsePermissionAction.ALWAYS_ALLOW : MobileAppUseEvents$MobileAppUsePermissionAction.ALLOW_ONCE;
        mobileAppUseEvents$MobileAppUsePermissionAction.getClass();
        MobileAppUseEvents$MobileAppUsePromptAction mobileAppUseEvents$MobileAppUsePromptAction = new MobileAppUseEvents$MobileAppUsePromptAction(W0(str5), mobileAppUseEvents$MobileAppUsePermissionAction, str5);
        KSerializer kSerializerSerializer = MobileAppUseEvents$MobileAppUsePromptAction.Companion.serializer();
        qi3 qi3Var = this.w;
        qi3Var.e(mobileAppUseEvents$MobileAppUsePromptAction, kSerializerSerializer);
        if (z) {
            MobileAppUseEvents$MobileAppUsePermissionState mobileAppUseEvents$MobileAppUsePermissionState = MobileAppUseEvents$MobileAppUsePermissionState.ASK;
            MobileAppUseEvents$MobileAppUsePermissionState mobileAppUseEvents$MobileAppUsePermissionState2 = MobileAppUseEvents$MobileAppUsePermissionState.ALWAYS;
            MobileAppUseEvents$MobileAppUsePermissionChangedSource mobileAppUseEvents$MobileAppUsePermissionChangedSource = MobileAppUseEvents$MobileAppUsePermissionChangedSource.CHAT_PROMPT;
            mobileAppUseEvents$MobileAppUsePermissionState.getClass();
            mobileAppUseEvents$MobileAppUsePermissionState2.getClass();
            mobileAppUseEvents$MobileAppUsePermissionChangedSource.getClass();
            MobileAppUseEvents$MobileAppUsePermissionCategory mobileAppUseEvents$MobileAppUsePermissionCategoryW0 = W0(str5);
            myh myhVar = this.N;
            myhVar.getClass();
            dxh dxhVar = (dxh) myhVar.h().get(str5);
            rok rokVarL2 = dxhVar != null ? dxhVar.l() : null;
            if (x44.r(rokVarL2, xxh.F)) {
                mobileAppUseEvents$MobileAppUsePermissionType = MobileAppUseEvents$MobileAppUsePermissionType.READ;
            } else if (x44.r(rokVarL2, yxh.F)) {
                mobileAppUseEvents$MobileAppUsePermissionType = MobileAppUseEvents$MobileAppUsePermissionType.WRITE;
            } else if (x44.r(rokVarL2, ayh.F) || x44.r(rokVarL2, zxh.F)) {
                mobileAppUseEvents$MobileAppUsePermissionType = MobileAppUseEvents$MobileAppUsePermissionType.READ;
            } else {
                if (!(rokVarL2 instanceof byh) && rokVarL2 != null) {
                    mr9.b();
                    return;
                }
                mobileAppUseEvents$MobileAppUsePermissionType = MobileAppUseEvents$MobileAppUsePermissionType.UNSPECIFIED;
            }
            MobileAppUseEvents$MobileAppUsePermissionChanged mobileAppUseEvents$MobileAppUsePermissionChanged = new MobileAppUseEvents$MobileAppUsePermissionChanged(mobileAppUseEvents$MobileAppUsePermissionCategoryW0, mobileAppUseEvents$MobileAppUsePermissionState, mobileAppUseEvents$MobileAppUsePermissionState2, mobileAppUseEvents$MobileAppUsePermissionChangedSource, str5, mobileAppUseEvents$MobileAppUsePermissionType);
            str5 = str5;
            qi3Var.e(mobileAppUseEvents$MobileAppUsePermissionChanged, MobileAppUseEvents$MobileAppUsePermissionChanged.Companion.serializer());
            dxh dxhVar2 = (dxh) myhVar.h().get(str5);
            if (dxhVar2 != null && (rokVarL = dxhVar2.l()) != null) {
                myhVar.f.c(rokVarL, eyh.G);
            }
        }
        gb9.D(this.a, null, null, new tm(this, str5, str2, str4, str3, (tp4) null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y0(String str, String str2, boolean z) {
        en1 en1VarB;
        amg amgVarA;
        fn1 fn1Var;
        str.getClass();
        str2.getClass();
        Object[] objArr = 0;
        if (!z) {
            MobileAppUseEvents$MobileAppUsePermissionAction mobileAppUseEvents$MobileAppUsePermissionAction = MobileAppUseEvents$MobileAppUsePermissionAction.DENY;
            mobileAppUseEvents$MobileAppUsePermissionAction.getClass();
            this.w.e(new MobileAppUseEvents$MobileAppUsePromptAction(W0(str), mobileAppUseEvents$MobileAppUsePermissionAction, str), MobileAppUseEvents$MobileAppUsePromptAction.Companion.serializer());
            gb9.D(this.a, null, null, new tm((Object) this, str2, str, (tp4) (objArr == true ? 1 : 0), 13), 3);
            return;
        }
        fx2 fx2VarL0 = L0();
        fx2 fx2Var = fx2VarL0 != null ? fx2VarL0 : null;
        if (fx2Var == null || (en1VarB = fx2Var.a.b()) == null || (amgVarA = en1VarB.a()) == null || (fn1Var = (fn1) amgVarA.getValue()) == null) {
            return;
        }
        ((tn1) fn1Var).s(str, str2);
    }

    public final boolean Z0() {
        return ((Boolean) this.A.d.getValue()).booleanValue();
    }

    public final boolean a1() {
        return ((Boolean) this.K0.getValue()).booleanValue();
    }

    public final boolean b1() {
        return ((Boolean) this.H0.getValue()).booleanValue();
    }

    public final boolean c1(ArtifactBottomSheetParams artifactBottomSheetParams) {
        artifactBottomSheetParams.getClass();
        if (artifactBottomSheetParams instanceof ArtifactBottomSheetParams.WiggleFileArtifact) {
            saj sajVar = this.S;
            ArtifactBottomSheetParams.WiggleFileArtifact wiggleFileArtifact = (ArtifactBottomSheetParams.WiggleFileArtifact) artifactBottomSheetParams;
            boolean z = sajVar.e.get(wiggleFileArtifact.getIdentifier()) != null;
            WiggleArtifactIdentifier identifier = wiggleFileArtifact.getIdentifier();
            identifier.getClass();
            boolean zContains = sajVar.g.contains(identifier);
            if (!z && !zContains) {
                return true;
            }
        } else if (!(artifactBottomSheetParams instanceof ArtifactBottomSheetParams.InMessageArtifact)) {
            mr9.b();
            return false;
        }
        return false;
    }

    public final boolean d1() {
        return ((Boolean) this.N0.getValue()).booleanValue();
    }

    public final boolean e1() {
        return ((Boolean) this.H1.getValue()).booleanValue();
    }

    public final boolean f1() {
        return ((Boolean) this.h1.getValue()).booleanValue();
    }

    public final void g1() {
        if (b1()) {
            return;
        }
        if (this.Y1 == null) {
            this.Y1 = hl8.c(this.x, HealthMetricAction.CONVERSATION_OPEN, this.a, null, null, 12);
        }
        y1(true);
        this.h0.m();
        g11 g11Var = this.X1;
        if (((AtomicBoolean) g11Var.G).compareAndSet(false, true)) {
            mpk.q(g11Var.F, "chatScreenNetworkApply");
        }
        this.B1 = gb9.D(this.a, null, null, new r43(this.B1, this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h1(defpackage.vp4 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.s43
            if (r0 == 0) goto L13
            r0 = r5
            s43 r0 = (defpackage.s43) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            s43 r0 = new s43
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.E
            int r1 = r0.G
            iei r2 = defpackage.iei.a
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L27
            defpackage.sf5.h0(r5)
            return r2
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.sf5.h0(r5)
            x97 r4 = r4.K
            boolean r5 = r4.d()
            if (r5 == 0) goto L44
            r0.G = r3
            java.lang.Object r4 = r4.c(r0)
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L44
            return r5
        L44:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t53.h1(vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i1(com.anthropic.claude.analytics.events.ChatEvents$PollingRecoveryTriggerReason r27, boolean r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.Long r32, java.lang.Long r33, defpackage.vp4 r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t53.i1(com.anthropic.claude.analytics.events.ChatEvents$PollingRecoveryTriggerReason, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, vp4):java.lang.Object");
    }

    public final void m1() {
        if (L0() != null) {
            List list = xah.a;
            xah.e(6, "refreshChat: skipped, inputSession active", null, null);
            return;
        }
        w1(false);
        this.J0.setValue(Boolean.FALSE);
        this.V1.set(null);
        this.W1.clear();
        g1();
    }

    public final void n1() {
        tp4 tp4Var = null;
        if (L0() != null) {
            List list = xah.a;
            xah.e(6, "refreshChatInBackground: skipped, inputSession active", null, null);
            return;
        }
        fkg fkgVar = this.E1;
        if (fkgVar == null || !fkgVar.c()) {
            this.B1 = gb9.D(this.a, null, null, new o43(this.B1, this, tp4Var, 2), 3);
            return;
        }
        List list2 = xah.a;
        xah.e(6, "refreshChatInBackground: skipped, sendJob active (responseState=" + U0() + ")", null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o0(boolean r14, boolean r15, defpackage.bz7 r16, defpackage.vp4 r17) {
        /*
            r13 = this;
            r0 = r17
            boolean r1 = r0 instanceof defpackage.g43
            if (r1 == 0) goto L16
            r1 = r0
            g43 r1 = (defpackage.g43) r1
            int r2 = r1.L
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.L = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            g43 r1 = new g43
            r1.<init>(r13, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.J
            int r1 = r7.L
            r9 = 0
            r10 = 2
            r2 = 1
            m45 r11 = defpackage.m45.E
            if (r1 == 0) goto L4a
            if (r1 == r2) goto L3c
            if (r1 != r10) goto L36
            t53 r13 = r7.I
            java.util.List r14 = r7.H
            java.util.List r14 = (java.util.List) r14
            defpackage.sf5.h0(r0)
            goto La1
        L36:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r13)
            return r9
        L3c:
            boolean r14 = r7.F
            boolean r1 = r7.E
            bz7 r2 = r7.G
            defpackage.sf5.h0(r0)
            r12 = r0
            r0 = r14
            r14 = r1
            r1 = r12
            goto L69
        L4a:
            defpackage.sf5.h0(r0)
            r0 = r16
            r7.G = r0
            r7.E = r14
            r7.F = r15
            r7.L = r2
            vd3 r2 = r13.m
            java.lang.String r3 = r13.L0
            r6 = 0
            r8 = 24
            r4 = r14
            r5 = r15
            java.lang.Object r1 = defpackage.vd3.f(r2, r3, r4, r5, r6, r7, r8)
            if (r1 != r11) goto L67
            goto L9f
        L67:
            r2 = r0
            r0 = r15
        L69:
            com.anthropic.claude.api.chat.ChatConversationWithNestedMessage r1 = (com.anthropic.claude.api.chat.ChatConversationWithNestedMessage) r1
            if (r1 != 0) goto L70
            v33 r13 = defpackage.v33.a
            return r13
        L70:
            java.util.List r1 = r1.getChat_messages()
            if (r1 != 0) goto L78
            lm6 r1 = defpackage.lm6.E
        L78:
            java.lang.Object r2 = r2.invoke(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Lac
            r7.G = r9
            r2 = r1
            java.util.List r2 = (java.util.List) r2
            r7.H = r2
            r7.I = r13
            r7.E = r14
            r7.F = r0
            r7.L = r10
            uz2 r14 = r13.l
            boolean r0 = r13.f1()
            java.lang.Object r0 = defpackage.uz2.b(r14, r1, r0, r7, r10)
            if (r0 != r11) goto La0
        L9f:
            return r11
        La0:
            r14 = r1
        La1:
            java.util.List r0 = (java.util.List) r0
            r13.z1(r0)
            u33 r13 = new u33
            r13.<init>(r14)
            return r13
        Lac:
            x33 r13 = new x33
            r13.<init>(r1)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t53.o0(boolean, boolean, bz7, vp4):java.lang.Object");
    }

    public final whd o1(String str, ld4 ld4Var) {
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        if (objN == jd4.a) {
            objN = mpk.w(new ik1(this, 14, str));
            e18Var.k0(objN);
        }
        return (whd) ((wlg) objN).getValue();
    }

    @Override // defpackage.iwe, defpackage.y59
    public final void onDestroy() {
        fx2 fx2VarL0 = L0();
        if (fx2VarL0 == null) {
            fx2VarL0 = null;
        }
        if (fx2VarL0 != null) {
            fx2VarL0.a.a();
        }
        super.onDestroy();
        fj0 fj0Var = this.s0;
        LinkedHashMap linkedHashMap = (LinkedHashMap) fj0Var.F;
        zfa.a.getClass();
        if (yfa.b()) {
            String strE = iuj.E(fj0Var);
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (!arrayList.isEmpty()) {
                zfa.a.getClass();
                String strU = grc.u("Destroying ", linkedHashMap.size(), " cached MCP app WebViews");
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.INFO, strE, strU);
                }
            }
        }
        Collection collectionValues = linkedHashMap.values();
        it2 it2Var = (it2) fj0Var.E;
        Iterator it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            it2Var.invoke(it2.next());
        }
        linkedHashMap.clear();
        ((qo0) fj0Var.G).clear();
        saj sajVar = this.S;
        String str = this.L0;
        sajVar.c(str);
        lq0 lq0Var = this.T;
        lq0Var.getClass();
        lq0Var.a.E(new rq(str, 1));
        ((zy7) this.D.D.O).a();
        Object objV0 = w44.V0(this.X0);
        uhd uhdVar = objV0 instanceof uhd ? (uhd) objV0 : null;
        List listI = uhdVar != null ? uhdVar.i() : null;
        if (listI == null) {
            listI = lm6.E;
        }
        em2 em2Var = this.h0;
        em2Var.getClass();
        if (em2Var.l != null) {
            em2Var.l(listI);
        }
        if (em2Var.r != null) {
            em2.p(em2Var, ChatEvents$PollingRecoveryOutcome.CANCELLED, ChatEvents$PollingRecoveryCancellationCause.ROUTE_DESTROYED, null, false, 12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [tp4] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final void p1(ChatEvents$RetryCompletionReason chatEvents$RetryCompletionReason) {
        int i;
        chatEvents$RetryCompletionReason.getClass();
        kdg kdgVar = this.X0;
        int size = kdgVar.size() - 1;
        int iE = oq5.E(kdgVar);
        while (true) {
            if ((size >= 0) != true) {
                i = -1;
                break;
            }
            if (oq5.E(kdgVar) != iE) {
                sz6.c();
                return;
            }
            oq5.o(size, kdgVar.size());
            Object obj = kdgVar.get(size);
            size--;
            if (((whd) obj) instanceof vhd) {
                i = size + 1;
                break;
            }
        }
        String strC = 0;
        strC = 0;
        if (i == -1) {
            SilentException.a(new SilentException(grc.u("Retry Error: Cannot find human message (size=", kdgVar.size(), ")")), null, false, 3);
            gb9.D(this.a, null, null, new h43(this, strC, 3), 3);
            return;
        }
        Object objV0 = w44.V0(kdgVar);
        uhd uhdVar = objV0 instanceof uhd ? (uhd) objV0 : null;
        if (uhdVar != null) {
            if (uhdVar.b()) {
                uhdVar = null;
            }
            if (uhdVar != null) {
                strC = uhdVar.c();
            }
        }
        flf flfVar = new flf(chatEvents$RetryCompletionReason, strC);
        lm6 lm6Var = lm6.E;
        r1("", lm6Var, lm6Var, flfVar, false);
    }

    public final void q0(int i) {
        kdg kdgVar = this.X0;
        if (i < 0 || i >= kdgVar.size()) {
            SilentException.a(new SilentException(grc.o(i, kdgVar.size(), "Invalid index to edit: ", ", message size: ")), null, false, 3);
        } else {
            kdgVar.h(i, kdgVar.size());
        }
    }

    public final void q1(List list) {
        String file_text;
        String path;
        Integer num;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof uhd) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            mq5 mq5Var = null;
            if (!it.hasNext()) {
                for (Object obj2 : arrayList) {
                    int i3 = i + 1;
                    if (i < 0) {
                        x44.n0();
                        throw null;
                    }
                    for (mtc mtcVar : ((uhd) obj2).i()) {
                        if (mtcVar instanceof ftc) {
                            ftc ftcVar = (ftc) mtcVar;
                            if (x44.r(ftcVar.getToolName(), hxh.y)) {
                                dlb dlbVarC = ftcVar.c();
                                Object objA = dlbVarC != null ? dlbVarC.a() : null;
                                CreateFileInput createFileInput = objA instanceof CreateFileInput ? (CreateFileInput) objA : null;
                                if (createFileInput != null && (file_text = createFileInput.getFile_text()) != null && (path = createFileInput.getPath()) != null && (num = (Integer) linkedHashMap.get(path)) != null && num.intValue() == i && yc3.a(path, false)) {
                                    this.S.d(new WiggleArtifactIdentifier(this.L0, path, mq5Var), file_text, path, ftcVar.getIsComplete());
                                }
                            }
                        }
                    }
                    i = i3;
                }
                return;
            }
            Object next = it.next();
            int i4 = i2 + 1;
            if (i2 < 0) {
                x44.n0();
                throw null;
            }
            for (mtc mtcVar2 : ((uhd) next).i()) {
                boolean z = mtcVar2 instanceof ftc;
                List<String> listY = lm6.E;
                if (z) {
                    ftc ftcVar2 = (ftc) mtcVar2;
                    String toolName = ftcVar2.getToolName();
                    if (x44.r(toolName, hxh.y)) {
                        dlb dlbVarC2 = ftcVar2.c();
                        Object objA2 = dlbVarC2 != null ? dlbVarC2.a() : null;
                        CreateFileInput createFileInput2 = objA2 instanceof CreateFileInput ? (CreateFileInput) objA2 : null;
                        listY = x44.Y(createFileInput2 != null ? createFileInput2.getPath() : null);
                    } else if (x44.r(toolName, hxh.x)) {
                        dlb dlbVarC3 = ftcVar2.c();
                        Object objA3 = dlbVarC3 != null ? dlbVarC3.a() : null;
                        PresentFilesInput presentFilesInput = objA3 instanceof PresentFilesInput ? (PresentFilesInput) objA3 : null;
                        List<String> filepaths = presentFilesInput != null ? presentFilesInput.getFilepaths() : null;
                        if (filepaths != null) {
                            listY = filepaths;
                        }
                    }
                }
                Iterator it2 = listY.iterator();
                while (it2.hasNext()) {
                    linkedHashMap.put((String) it2.next(), Integer.valueOf(i2));
                }
            }
            i2 = i4;
        }
    }

    public final void r0() {
        this.w.e(new PushEvents$ChatNotificationUpsellClicked(this.d.e, this.L0, true), PushEvents$ChatNotificationUpsellClicked.Companion.serializer());
        gb9.D(this.a, null, null, new h43(this, null, 0), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r2v0, types: [tp4] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final void r1(String str, List list, List list2, glf glfVar, boolean z) {
        CreateChatRequest createChatRequest;
        String str2;
        List list3;
        glf glfVar2;
        boolean z2;
        List list4;
        String strB;
        String str3;
        Object next;
        str.getClass();
        list.getClass();
        list2.getClass();
        ?? ValueOf = 0;
        ValueOf = 0;
        if (L0() != null) {
            List list5 = xah.a;
            xah.e(6, "sendMessage: skipped, inputSession active", null, null);
            return;
        }
        this.S.c(this.L0);
        this.I1.setValue(null);
        this.V1.set(null);
        this.W1.clear();
        if (d1()) {
            y1(true);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof MessageImageFile) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            koi koiVar = this.d;
            String str4 = koiVar.e;
            int size2 = list2.size();
            int size3 = list.size() - size;
            r93 r93Var = this.g0;
            String strE = r93Var.e();
            wz5 wz5Var = r93Var.y;
            String str5 = strE == null ? null : strE;
            ThinkingState thinkingState = (ThinkingState) wz5Var.getValue();
            String strB2 = thinkingState != null ? com.anthropic.claude.api.model.f.b(thinkingState) : null;
            this.w.e(new ChatEvents$Create(str4, this.L0, size2, size, size3, str5, strB2 == null ? null : strB2, Boolean.valueOf(a1())), ChatEvents$Create.Companion.serializer());
            gb9.D(this.a, null, null, new e53(this, ValueOf, 0), 3);
            String strE2 = r93Var.e();
            skd skdVarQ0 = Q0();
            String str6 = skdVarQ0 != null ? skdVarQ0.a : null;
            if (r93Var.j()) {
                strB = null;
            } else {
                ThinkingState thinkingState2 = (ThinkingState) wz5Var.getValue();
                strB = thinkingState2 != null ? com.anthropic.claude.api.model.f.b(thinkingState2) : null;
            }
            q0i q0iVar = this.D;
            if (q0iVar.D.c(H0(), new xnb(strE2))) {
                ResearchMode.Companion.getClass();
                str3 = ResearchMode.ADVANCED;
            } else {
                str3 = null;
            }
            boolean zA1 = a1();
            ListIterator listIterator = koiVar.q.listIterator();
            while (true) {
                c8a c8aVar = (c8a) listIterator;
                if (c8aVar.hasNext()) {
                    next = c8aVar.next();
                    if (x44.r(((McpServer) next).getName(), "visualize")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            McpServer mcpServer = (McpServer) next;
            if (mcpServer != null && !qok.f(mcpServer).isEmpty()) {
                ValueOf = Boolean.valueOf(q0iVar.E.f(H0(), mcpServer.m346getUuidowoRr7k()) > 0);
            }
            createChatRequest = new CreateChatRequest(this.L0, "", null, strE2, str6, strB, str3, zA1, Boolean.TRUE, ValueOf, null);
            str2 = str;
            list4 = list;
            list3 = list2;
            glfVar2 = glfVar;
            z2 = z;
        } else {
            createChatRequest = null;
            str2 = str;
            list3 = list2;
            glfVar2 = glfVar;
            z2 = z;
            list4 = list;
        }
        s1(str2, list4, list3, glfVar2, createChatRequest, z2);
        this.e1.setValue(Boolean.FALSE);
    }

    public final void s0() {
        fx2 fx2VarL0 = L0();
        if (fx2VarL0 == null) {
            fx2VarL0 = null;
        }
        if (fx2VarL0 != null) {
            fx2VarL0.a.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s1(java.lang.String r17, java.util.List r18, java.util.List r19, defpackage.glf r20, com.anthropic.claude.api.chat.CreateChatRequest r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t53.s1(java.lang.String, java.util.List, java.util.List, glf, com.anthropic.claude.api.chat.CreateChatRequest, boolean):void");
    }

    public final void t0(ctc ctcVar) {
        ctcVar.getClass();
        if (this.n0.containsKey(ctcVar.getId())) {
            return;
        }
        ParsedContentBlockId id = ctcVar.getId();
        LinkedHashSet linkedHashSet = this.o0;
        if (linkedHashSet.contains(id)) {
            return;
        }
        linkedHashSet.add(ctcVar.getId());
        gb9.D(this.a, this.W.b(), null, new ky0(this, ctcVar, (tp4) null), 2);
    }

    public final void t1(k84 k84Var) {
        this.B0.setValue(k84Var);
    }

    public final String u0(String str) {
        str.getClass();
        kdg kdgVar = this.X0;
        ListIterator listIterator = kdgVar.listIterator();
        int i = 0;
        while (true) {
            c8a c8aVar = (c8a) listIterator;
            if (!c8aVar.hasNext()) {
                i = -1;
                break;
            }
            if (MessageId.m1054equalsimpl0(((whd) c8aVar.next()).c(), str)) {
                break;
            }
            i++;
        }
        whd whdVar = (whd) w44.O0(i - 1, kdgVar);
        if (whdVar != null) {
            return whdVar.c();
        }
        MessageId.Companion.getClass();
        return MessageId.ROOT_PARENT_UUID;
    }

    public final void u1(boolean z) {
        this.x0.setValue(Boolean.valueOf(z));
    }

    public final McpServer v0(ctc ctcVar) {
        Object next;
        String integrationName = ctcVar.getIntegrationName();
        if (integrationName == null) {
            String toolName = ctcVar.getToolName();
            toolName.getClass();
            int iL0 = bsg.L0(toolName, 6, ":");
            if (iL0 != -1) {
                toolName = toolName.substring(0, iL0);
            }
            integrationName = toolName;
        }
        ListIterator listIterator = this.d.q.listIterator();
        while (true) {
            c8a c8aVar = (c8a) listIterator;
            if (!c8aVar.hasNext()) {
                next = null;
                break;
            }
            next = c8aVar.next();
            if (x44.r(((McpServer) next).getName(), integrationName)) {
                break;
            }
        }
        return (McpServer) next;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v1(boolean r5, defpackage.tp4 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.m53
            if (r0 == 0) goto L13
            r0 = r6
            m53 r0 = (defpackage.m53) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            m53 r0 = new m53
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.sf5.h0(r6)
            goto L3c
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.sf5.h0(r6)
            r0.G = r2
            f9 r4 = r4.L
            java.lang.Object r6 = r4.e(r5, r0)
            m45 r4 = defpackage.m45.E
            if (r6 != r4) goto L3c
            return r4
        L3c:
            boolean r4 = r6 instanceof defpackage.of0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t53.v1(boolean, tp4):java.lang.Object");
    }

    public final b19 w0(String str) {
        int i;
        kdg kdgVar = this.X0;
        c8a c8aVar = new c8a(kdgVar, kdgVar.size());
        while (true) {
            if (!c8aVar.hasPrevious()) {
                i = -1;
                break;
            }
            if (str == null ? false : MessageId.m1054equalsimpl0(((whd) c8aVar.previous()).c(), str)) {
                i = c8aVar.F + 1;
                break;
            }
        }
        if (i != -1) {
            Object obj = kdgVar.get(i);
            uhd uhdVar = obj instanceof uhd ? (uhd) obj : null;
            if (uhdVar != null) {
                return new b19(i, uhdVar);
            }
        }
        return null;
    }

    public final void w1(boolean z) {
        this.I0.setValue(Boolean.valueOf(z));
    }

    public final ArtifactBottomSheetParams.InMessageArtifact x0(ArtifactMetadata artifactMetadata) {
        artifactMetadata.getClass();
        String strM537getIdentifiereX_QYXY = artifactMetadata.m537getIdentifiereX_QYXY();
        List list = (List) ((Map) this.n1.getValue()).get(ArtifactIdentifier.m964boximpl(strM537getIdentifiereX_QYXY));
        int iNextIndex = -1;
        if (list != null) {
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                if (x44.r(((tp0) listIterator.previous()).a().getUuid(), artifactMetadata.getUuid())) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
        }
        return new ArtifactBottomSheetParams.InMessageArtifact(strM537getIdentifiereX_QYXY, iNextIndex, !a1(), null);
    }

    public final void x1(bqb bqbVar) {
        this.L1.setValue(bqbVar);
    }

    public final List y0(ArtifactBottomSheetParams artifactBottomSheetParams) {
        artifactBottomSheetParams.getClass();
        if (artifactBottomSheetParams instanceof ArtifactBottomSheetParams.InMessageArtifact) {
            List list = (List) ((Map) this.n1.getValue()).get(ArtifactIdentifier.m964boximpl(((ArtifactBottomSheetParams.InMessageArtifact) artifactBottomSheetParams).m546getIdentifiereX_QYXY()));
            if (list != null) {
                return list;
            }
        } else {
            if (!(artifactBottomSheetParams instanceof ArtifactBottomSheetParams.WiggleFileArtifact)) {
                mr9.b();
                return null;
            }
            tp0 tp0Var = (tp0) this.S.e.get(((ArtifactBottomSheetParams.WiggleFileArtifact) artifactBottomSheetParams).getIdentifier());
            if (tp0Var != null) {
                return x44.W(tp0Var);
            }
        }
        return lm6.E;
    }

    public final void y1(boolean z) {
        this.H0.setValue(Boolean.valueOf(z));
    }

    public final o33 z0() {
        return (o33) this.p1.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        r4 = (defpackage.whd) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (r4 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        r2 = r4.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r6.E.a().a == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (r2 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        r6.U.a(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z1(java.util.List r7) {
        /*
            r6 = this;
            kdg r0 = r6.X0
            java.lang.String r1 = "setMessages"
            android.os.Trace.beginSection(r1)
            fx2 r1 = r6.L0()     // Catch: java.lang.Throwable -> L7d
            r2 = 0
            if (r1 == 0) goto L17
            java.util.List r6 = defpackage.xah.a     // Catch: java.lang.Throwable -> L7d
            java.lang.String r6 = "setMessages: skipped, inputSession active"
            r7 = 6
            defpackage.xah.e(r7, r6, r2, r2)     // Catch: java.lang.Throwable -> L7d
            goto L79
        L17:
            efe r1 = r6.A1     // Catch: java.lang.Throwable -> L7d
            r1.F = r2     // Catch: java.lang.Throwable -> L7d
            r0.clear()     // Catch: java.lang.Throwable -> L7d
            r1 = r7
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L7d
            r0.addAll(r1)     // Catch: java.lang.Throwable -> L7d
            boolean r1 = r6.f1()     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L2d
            r6.q1(r7)     // Catch: java.lang.Throwable -> L7d
        L2d:
            int r7 = r0.size()     // Catch: java.lang.Throwable -> L7d
            r1 = 1
            int r7 = r7 - r1
            int r3 = defpackage.oq5.E(r0)     // Catch: java.lang.Throwable -> L7d
        L37:
            if (r7 < 0) goto L3b
            r4 = r1
            goto L3c
        L3b:
            r4 = 0
        L3c:
            if (r4 == 0) goto L5f
            int r4 = defpackage.oq5.E(r0)     // Catch: java.lang.Throwable -> L7d
            if (r4 != r3) goto L59
            int r4 = r0.size()     // Catch: java.lang.Throwable -> L7d
            defpackage.oq5.o(r7, r4)     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r4 = r0.get(r7)     // Catch: java.lang.Throwable -> L7d
            int r7 = r7 + (-1)
            r5 = r4
            whd r5 = (defpackage.whd) r5     // Catch: java.lang.Throwable -> L7d
            boolean r5 = r5 instanceof defpackage.uhd     // Catch: java.lang.Throwable -> L7d
            if (r5 == 0) goto L37
            goto L60
        L59:
            java.util.ConcurrentModificationException r6 = new java.util.ConcurrentModificationException     // Catch: java.lang.Throwable -> L7d
            r6.<init>()     // Catch: java.lang.Throwable -> L7d
            throw r6     // Catch: java.lang.Throwable -> L7d
        L5f:
            r4 = r2
        L60:
            whd r4 = (defpackage.whd) r4     // Catch: java.lang.Throwable -> L7d
            if (r4 == 0) goto L68
            java.lang.String r2 = r4.c()     // Catch: java.lang.Throwable -> L7d
        L68:
            bj0 r7 = r6.E     // Catch: java.lang.Throwable -> L7d
            xi0 r7 = r7.a()     // Catch: java.lang.Throwable -> L7d
            boolean r7 = r7.a     // Catch: java.lang.Throwable -> L7d
            if (r7 == 0) goto L79
            if (r2 == 0) goto L79
            om2 r6 = r6.U     // Catch: java.lang.Throwable -> L7d
            r6.a(r2)     // Catch: java.lang.Throwable -> L7d
        L79:
            android.os.Trace.endSection()
            return
        L7d:
            r6 = move-exception
            android.os.Trace.endSection()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t53.z1(java.util.List):void");
    }
}
