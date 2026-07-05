package com.anthropic.claude.code.remote;

import android.app.NotificationManager;
import android.content.Context;
import android.util.LruCache;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.CodeEvents$BridgeOfflineSendBlocked;
import com.anthropic.claude.analytics.events.CodeEvents$BridgeReconnectWait;
import com.anthropic.claude.analytics.events.CodeEvents$CodePromptSuggestionReceived;
import com.anthropic.claude.analytics.events.CodeEvents$CodePromptSuggestionSuppressReason;
import com.anthropic.claude.analytics.events.CodeEvents$PlanModeSelected;
import com.anthropic.claude.analytics.events.CodeEvents$PullRequestOpenEntryPoint;
import com.anthropic.claude.analytics.events.CodeEvents$PullRequestOpened;
import com.anthropic.claude.analytics.events.CodeEvents$RepositorySelected;
import com.anthropic.claude.analytics.events.CodeEvents$SessionStreamConnectResult;
import com.anthropic.claude.api.errors.ClaudeApiErrorException;
import com.anthropic.claude.api.model.ModelSelectorEntry;
import com.anthropic.claude.code.remote.CodeSessionListScope;
import com.anthropic.claude.code.remote.stores.SessionTarget;
import com.anthropic.claude.configs.flags.StreamSmoothingConfig;
import com.anthropic.claude.sessions.types.ConnectionStatus;
import com.anthropic.claude.sessions.types.EnvironmentKind;
import com.anthropic.claude.sessions.types.EnvironmentResource;
import com.anthropic.claude.sessions.types.GetShareStatusResponse;
import com.anthropic.claude.sessions.types.GitHubRepo;
import com.anthropic.claude.sessions.types.Outcome;
import com.anthropic.claude.sessions.types.PermissionMode;
import com.anthropic.claude.sessions.types.RepoBranch;
import com.anthropic.claude.sessions.types.RepoWithStatus;
import com.anthropic.claude.sessions.types.SessionContext;
import com.anthropic.claude.sessions.types.SessionContextSource;
import com.anthropic.claude.sessions.types.SessionExternalMetadata;
import com.anthropic.claude.sessions.types.SessionFileAttachment;
import com.anthropic.claude.sessions.types.SessionResource;
import com.anthropic.claude.sessions.types.SessionStatus;
import com.anthropic.claude.sessions.types.ShareRecord;
import com.anthropic.claude.sessions.types.ShareStatus;
import com.anthropic.claude.sessions.types.ShareVisibilityType;
import com.anthropic.claude.types.strings.CodeAgentId;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.SessionId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.a4c;
import defpackage.a68;
import defpackage.amg;
import defpackage.awc;
import defpackage.b1i;
import defpackage.b4c;
import defpackage.b54;
import defpackage.b9;
import defpackage.ba9;
import defpackage.bj3;
import defpackage.bsg;
import defpackage.bx1;
import defpackage.bz7;
import defpackage.c4c;
import defpackage.c55;
import defpackage.c61;
import defpackage.c8a;
import defpackage.cz3;
import defpackage.d55;
import defpackage.d8a;
import defpackage.dfh;
import defpackage.e14;
import defpackage.e58;
import defpackage.ed3;
import defpackage.ejb;
import defpackage.f14;
import defpackage.f9;
import defpackage.fe5;
import defpackage.fk0;
import defpackage.fkg;
import defpackage.g14;
import defpackage.g81;
import defpackage.gb9;
import defpackage.gwj;
import defpackage.h86;
import defpackage.hi6;
import defpackage.i04;
import defpackage.i55;
import defpackage.ide;
import defpackage.ij0;
import defpackage.ik6;
import defpackage.iqf;
import defpackage.iuj;
import defpackage.iwe;
import defpackage.j32;
import defpackage.j4d;
import defpackage.j8i;
import defpackage.jrf;
import defpackage.jud;
import defpackage.jwf;
import defpackage.kdg;
import defpackage.kh4;
import defpackage.koi;
import defpackage.kpf;
import defpackage.l14;
import defpackage.l34;
import defpackage.l45;
import defpackage.leb;
import defpackage.lei;
import defpackage.lf0;
import defpackage.lf9;
import defpackage.lh4;
import defpackage.lhf;
import defpackage.lm6;
import defpackage.lpf;
import defpackage.lqf;
import defpackage.lsc;
import defpackage.lwc;
import defpackage.m29;
import defpackage.mdg;
import defpackage.mf0;
import defpackage.mh4;
import defpackage.mn5;
import defpackage.mp4;
import defpackage.mq5;
import defpackage.mqg;
import defpackage.n2g;
import defpackage.n30;
import defpackage.n32;
import defpackage.n58;
import defpackage.n71;
import defpackage.nf0;
import defpackage.nf7;
import defpackage.nh4;
import defpackage.nj6;
import defpackage.o14;
import defpackage.o32;
import defpackage.oag;
import defpackage.oda;
import defpackage.oh4;
import defpackage.otf;
import defpackage.ozf;
import defpackage.p14;
import defpackage.pb2;
import defpackage.ph4;
import defpackage.pkc;
import defpackage.psf;
import defpackage.qb5;
import defpackage.qi3;
import defpackage.qs2;
import defpackage.qy3;
import defpackage.qzb;
import defpackage.rc8;
import defpackage.s71;
import defpackage.sfa;
import defpackage.spb;
import defpackage.t14;
import defpackage.tm;
import defpackage.tp4;
import defpackage.tta;
import defpackage.tw0;
import defpackage.u36;
import defpackage.v14;
import defpackage.vb7;
import defpackage.vlh;
import defpackage.w14;
import defpackage.w43;
import defpackage.w44;
import defpackage.we2;
import defpackage.wg6;
import defpackage.wlg;
import defpackage.wwk;
import defpackage.wz5;
import defpackage.x3c;
import defpackage.x44;
import defpackage.xah;
import defpackage.xdh;
import defpackage.xhe;
import defpackage.xw1;
import defpackage.xzd;
import defpackage.y36;
import defpackage.y3c;
import defpackage.y3e;
import defpackage.yfa;
import defpackage.yih;
import defpackage.yl;
import defpackage.ylg;
import defpackage.ysj;
import defpackage.z36;
import defpackage.z3c;
import defpackage.z74;
import defpackage.ze0;
import defpackage.zfa;
import defpackage.zmk;
import defpackage.zpf;
import defpackage.zy7;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends iwe {
    public final y36 A;
    public final yih A0;
    public final lsc A1;
    public final lpf B;
    public final c4c B0;
    public final xzd B1;
    public final otf C;
    public fkg C0;
    public final wz5 C1;
    public final ze0 D;
    public final lsc D0;
    public final lsc D1;
    public final j8i E;
    public final wz5 E0;
    public final lsc E1;
    public final mn5 F;
    public final lsc F0;
    public final lsc F1;
    public final c61 G;
    public final lsc G0;
    public final lsc G1;
    public final lsc H;
    public final lsc H0;
    public final lsc H1;
    public final Long I;
    public final lsc I0;
    public boolean I1;
    public final boolean J;
    public final lsc J0;
    public fkg J1;
    public final String K;
    public final LinkedHashSet K0;
    public boolean K1;
    public String L;
    public final LinkedHashSet L0;
    public fkg L1;
    public boolean M;
    public final lsc M0;
    public String M1;
    public boolean N;
    public final lsc N0;
    public fkg N1;
    public boolean O;
    public final lsc O0;
    public String O1;
    public boolean P;
    public final lsc P0;
    public final lsc P1;
    public boolean Q;
    public final amg Q0;
    public final lsc Q1;
    public int R;
    public fkg R0;
    public final mdg R1;
    public boolean S;
    public final lsc S0;
    public final kdg S1;
    public boolean T;
    public final kdg T0;
    public final lsc T1;
    public boolean U;
    public final lsc U0;
    public final lsc U1;
    public boolean V;
    public final lsc V0;
    public final lsc V1;
    public boolean W;
    public final lsc W0;
    public final kdg W1;
    public boolean X;
    public final hi6 X0;
    public final LinkedHashMap X1;
    public String Y;
    public final lsc Y0;
    public final lsc Y1;
    public Long Z;
    public final lsc Z0;
    public final lsc Z1;
    public boolean a0;
    public final wz5 a1;
    public final lsc a2;
    public final CodeSessionListScope b;
    public final n2g b0;
    public String b1;
    public final lsc b2;
    public final jwf c;
    public final y3e c0;
    public String c1;
    public final lsc c2;
    public final jrf d;
    public final boolean d0;
    public final lsc d1;
    public final g81 d2;
    public final z74 e;
    public final boolean e0;
    public final i55 e1;
    public final jud e2;
    public final h86 f;
    public final boolean f0;
    public final lsc f1;
    public final lsc f2;
    public final xhe g;
    public final boolean g0;
    public final n2g g1;
    public final lsc g2;
    public final com.anthropic.claude.code.remote.stores.b h;
    public final boolean h0;
    public final y3e h1;
    public final lsc h2;
    public final bx1 i;
    public final boolean i0;
    public final lsc i1;
    public List i2;
    public final e58 j;
    public final boolean j0;
    public final lsc j1;
    public z3c j2;
    public final com.anthropic.claude.code.remote.stores.a k;
    public final boolean k0;
    public final lsc k1;
    public final lsc k2;
    public final qi3 l;
    public final boolean l0;
    public final lsc l1;
    public boolean l2;
    public final String m;
    public final boolean m0;
    public final lsc m1;
    public final lsc m2;
    public final oda n;
    public final boolean n0;
    public final lsc n1;
    public final lsc n2;
    public final Context o;
    public final boolean o0;
    public final lsc o1;
    public final lsc o2;
    public final pkc p;
    public final boolean p0;
    public int p1;
    public final wz5 p2;
    public final spb q;
    public final boolean q0;
    public int q1;
    public final wz5 q2;
    public final rc8 r;
    public final boolean r0;
    public final lsc r1;
    public final lsc r2;
    public final nf7 s;
    public final boolean s0;
    public final lsc s1;
    public final lsc s2;
    public final fk0 t;
    public final boolean t0;
    public final oag t1;
    public final lsc t2;
    public final qzb u;
    public final StreamSmoothingConfig u0;
    public final LinkedHashSet u1;
    public final lsc u2;
    public final qs2 v;
    public final boolean v0;
    public String v1;
    public Long v2;
    public final b1i w;
    public final boolean w0;
    public final wlg w1;
    public final lsc w2;
    public final koi x;
    public final wz5 x0;
    public final wlg x1;
    public final qb5 x2;
    public final f9 y;
    public final iqf y0;
    public final wlg y1;
    public final Set y2;
    public final psf z;
    public final c61 z0;
    public final wlg z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x07a1  */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27, types: [c45, java.util.concurrent.CancellationException, o45, tp4] */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29, types: [c45, o45, tp4] */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
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
    public i(java.lang.String r19, com.anthropic.claude.code.remote.CodeSessionListScope r20, defpackage.jwf r21, defpackage.jrf r22, defpackage.z74 r23, defpackage.h86 r24, defpackage.xhe r25, com.anthropic.claude.code.remote.stores.b r26, defpackage.bx1 r27, defpackage.e58 r28, com.anthropic.claude.code.remote.stores.a r29, defpackage.qi3 r30, java.lang.String r31, defpackage.dl2 r32, defpackage.oda r33, android.content.Context r34, defpackage.pkc r35, defpackage.spb r36, defpackage.rc8 r37, defpackage.nf7 r38, defpackage.fk0 r39, defpackage.qzb r40, defpackage.qs2 r41, defpackage.b1i r42, defpackage.koi r43, defpackage.f9 r44, defpackage.psf r45, defpackage.y36 r46, defpackage.lpf r47, defpackage.otf r48, defpackage.ze0 r49, defpackage.j8i r50, defpackage.owf r51, defpackage.mn5 r52, defpackage.bj0 r53) {
        /*
            Method dump skipped, instruction units count: 2149
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.code.remote.i.<init>(java.lang.String, com.anthropic.claude.code.remote.CodeSessionListScope, jwf, jrf, z74, h86, xhe, com.anthropic.claude.code.remote.stores.b, bx1, e58, com.anthropic.claude.code.remote.stores.a, qi3, java.lang.String, dl2, oda, android.content.Context, pkc, spb, rc8, nf7, fk0, qzb, qs2, b1i, koi, f9, psf, y36, lpf, otf, ze0, j8i, owf, mn5, bj0):void");
    }

    public static final void O(i iVar, SessionResource sessionResource) {
        String strE0;
        if (!iVar.a0) {
            iVar.a0 = true;
            if (!iVar.V0()) {
                ide ideVar = j.b;
                if (sessionResource != null && fe5.i(sessionResource) && sessionResource.getConnection_status() == ConnectionStatus.DISCONNECTED) {
                    iVar.Z = Long.valueOf(System.nanoTime());
                }
            }
        }
        iVar.x1(sessionResource);
        iVar.m1(null);
        iVar.T = false;
        if (iVar.h0 && (strE0 = iVar.E0()) != null) {
            lpf lpfVar = iVar.B;
            lpfVar.getClass();
            sessionResource.getClass();
            LruCache lruCache = lpfVar.a;
            kpf kpfVar = (kpf) lruCache.get(SessionId.m1114boximpl(strE0));
            lruCache.put(SessionId.m1114boximpl(strE0), new kpf(sessionResource, kpfVar != null ? kpfVar.b : lm6.E, kpfVar != null ? kpfVar.c : false));
        }
        iVar.V();
        iVar.U();
        iVar.n1();
        iVar.C1();
    }

    public static final void P(i iVar, String str) {
        tp4 tp4Var = null;
        iVar.H.setValue(str != null ? SessionId.m1114boximpl(str) : null);
        Set set = (Set) iVar.h2.getValue();
        int i = 2;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                lf9 lf9Var = (lf9) iVar.X1.remove((UUID) it.next());
                if (lf9Var != null) {
                    lf9Var.d(null);
                }
            }
            b54.w0(new yl(2, set), iVar.W1);
            iVar.r1(null);
        }
        iVar.i2 = lm6.E;
        iVar.Y0();
        gb9.D(iVar.a, null, null, new g(iVar, tp4Var, i), 3);
    }

    public static final void Q(i iVar) {
        RepoWithStatus repoWithStatus;
        GitHubRepo repo;
        kdg kdgVar = iVar.T0;
        xhe xheVar = iVar.g;
        if (iVar.E0() == null && xheVar.b()) {
            if (b54.w0(new cz3(iVar, 1), kdgVar)) {
                iVar.h1();
                iVar.v1(null);
            }
            if (!kdgVar.isEmpty() || (repoWithStatus = (RepoWithStatus) w44.N0(xheVar.c())) == null || (repo = repoWithStatus.getRepo()) == null) {
                return;
            }
            iVar.T(repo);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object R(com.anthropic.claude.code.remote.i r16, boolean r17, defpackage.vp4 r18) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.code.remote.i.R(com.anthropic.claude.code.remote.i, boolean, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object S(com.anthropic.claude.code.remote.i r8, com.anthropic.claude.sessions.types.PermissionMode r9, defpackage.vp4 r10) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.code.remote.i.S(com.anthropic.claude.code.remote.i, com.anthropic.claude.sessions.types.PermissionMode, vp4):java.lang.Object");
    }

    public static LinkedHashMap e0(Map map) {
        Object string;
        LinkedHashMap linkedHashMap = new LinkedHashMap(tta.d0(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object obj = (JsonElement) entry.getValue();
            if (obj instanceof JsonPrimitive) {
                string = ((JsonPrimitive) obj).getContent();
            } else if (obj instanceof JsonArray) {
                Iterable<JsonElement> iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(x44.y(iterable, 10));
                for (JsonElement jsonElement : iterable) {
                    jsonElement.getClass();
                    arrayList.add(((JsonPrimitive) jsonElement).getContent());
                }
                string = arrayList;
            } else {
                string = obj.toString();
            }
            linkedHashMap.put(key, string);
        }
        return linkedHashMap;
    }

    public final List A0() {
        return (List) this.Y1.getValue();
    }

    public final void A1(awc awcVar, int i, Map map, Map map2) {
        this.Q1.setValue(new tw0(awcVar, new qy3(this, 1, (byte) 0), new l14(this, 6), i, map, map2));
    }

    public final String B0() {
        CodeAgentId codeAgentId = (CodeAgentId) this.d1.getValue();
        if (codeAgentId != null) {
            return codeAgentId.m998unboximpl();
        }
        return null;
    }

    public final void B1(CodeEvents$PullRequestOpenEntryPoint codeEvents$PullRequestOpenEntryPoint) {
        codeEvents$PullRequestOpenEntryPoint.getClass();
        String strE0 = E0();
        if (strE0 == null) {
            strE0 = null;
        }
        this.l.e(new CodeEvents$PullRequestOpened(this.m, strE0, codeEvents$PullRequestOpenEntryPoint), CodeEvents$PullRequestOpened.Companion.serializer());
    }

    public final SessionTarget C0() {
        return (SessionTarget) this.W0.getValue();
    }

    public final void C1() {
        n58 n58VarQ0;
        SessionContext session_context;
        List<Outcome> outcomes;
        SessionResource sessionResourceD0 = D0();
        if ((sessionResourceD0 == null || !sessionResourceD0.isAgentOwned()) && (n58VarQ0 = q0()) != null) {
            d8a d8aVarE = x44.E();
            d8aVarE.add(new RepoBranch(n58VarQ0.a, n58VarQ0.b));
            SessionResource sessionResourceD02 = D0();
            if (sessionResourceD02 != null && (session_context = sessionResourceD02.getSession_context()) != null && (outcomes = session_context.getOutcomes()) != null) {
                ArrayList<Outcome.GitRepository> arrayList = new ArrayList();
                for (Object obj : outcomes) {
                    if (obj instanceof Outcome.GitRepository) {
                        arrayList.add(obj);
                    }
                }
                for (Outcome.GitRepository gitRepository : arrayList) {
                    Iterator<T> it = gitRepository.getGit_info().getBranches().iterator();
                    while (it.hasNext()) {
                        d8aVarE.add(new RepoBranch(gitRepository.getGit_info().getRepo(), (String) it.next()));
                    }
                }
            }
            gb9.D(this.a, null, null, new w14(this, (Object) w44.H0(x44.v(d8aVarE)), (Object) n58VarQ0, (tp4) null, 5), 3);
        }
    }

    public final SessionResource D0() {
        return (SessionResource) this.S0.getValue();
    }

    public final void D1(PermissionMode permissionMode) {
        permissionMode.getClass();
        this.s1.setValue(permissionMode);
        this.A1.setValue(Boolean.TRUE);
        xzd xzdVar = this.B1;
        xzdVar.getClass();
        xzdVar.F = permissionMode;
        String strE0 = E0();
        tp4 tp4Var = null;
        if (strE0 == null) {
            strE0 = null;
        }
        this.l.e(new CodeEvents$PlanModeSelected(this.m, strE0, permissionMode.toWireFormat()), CodeEvents$PlanModeSelected.Companion.serializer());
        if (R0()) {
            return;
        }
        String str = this.d.m;
        String strE02 = E0();
        boolean zM1117equalsimpl0 = false;
        if (str == null) {
            if (strE02 == null) {
                zM1117equalsimpl0 = true;
            }
        } else if (strE02 != null) {
            zM1117equalsimpl0 = SessionId.m1117equalsimpl0(str, strE02);
        }
        if (zM1117equalsimpl0) {
            gb9.D(this.a, null, null, new ed3(this, permissionMode, tp4Var, 10), 3);
        }
    }

    public final String E0() {
        SessionId sessionId = (SessionId) this.H.getValue();
        if (sessionId != null) {
            return sessionId.m1120unboximpl();
        }
        return null;
    }

    public final void E1() {
        if (!this.q0 || E0() == null || D0() == null || V0()) {
            return;
        }
        ph4 ph4VarO0 = o0();
        if ((ph4VarO0 instanceof lh4) || (ph4VarO0 instanceof kh4) || (ph4VarO0 instanceof oh4)) {
            return;
        }
        if (!(ph4VarO0 instanceof mh4) && !(ph4VarO0 instanceof nh4)) {
            wg6.i();
            return;
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
                String strE0 = E0();
                if (strE0 == null) {
                    strE0 = null;
                }
                String strI = ij0.i("wakeSession: opening WS subscribe for ", strE0);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.DEBUG, strE, strI);
                }
            }
        }
        c0();
    }

    public final boolean F0() {
        SessionResource sessionResourceD0;
        Object next;
        if (!this.k0 || L0() || (sessionResourceD0 = D0()) == null) {
            return false;
        }
        String environment_id = sessionResourceD0.getEnvironment_id();
        EnvironmentKind kind = null;
        if (environment_id.length() <= 0) {
            environment_id = null;
        }
        if (environment_id == null) {
            return false;
        }
        EnvironmentKind environment_kind = sessionResourceD0.getEnvironment_kind();
        if (environment_kind == null) {
            Iterator it = this.h.f().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (x44.r(((EnvironmentResource) next).getEnvironment_id(), environment_id)) {
                    break;
                }
            }
            EnvironmentResource environmentResource = (EnvironmentResource) next;
            if (environmentResource != null) {
                kind = environmentResource.getKind();
            }
        } else {
            kind = environment_kind;
        }
        return kind == EnvironmentKind.ANTHROPIC_CLOUD || kind == EnvironmentKind.BYOC;
    }

    public final mqg G0() {
        return (mqg) this.O0.getValue();
    }

    public final String H0() {
        String str;
        mqg mqgVar = (mqg) this.Q0.getValue();
        if (mqgVar != null && (str = mqgVar.a) != null) {
            return str;
        }
        mqg mqgVarG0 = G0();
        if (mqgVarG0 != null) {
            return mqgVarG0.a;
        }
        return null;
    }

    public final j8i I0() {
        return this.E;
    }

    public final boolean J0() {
        SessionResource sessionResourceD0 = D0();
        return (sessionResourceD0 != null ? sessionResourceD0.getSession_status() : null) == SessionStatus.ARCHIVED;
    }

    public final boolean K0() {
        return ((Boolean) this.G1.getValue()).booleanValue();
    }

    public final boolean L0() {
        SessionResource sessionResourceD0 = D0();
        List<String> tags = sessionResourceD0 != null ? sessionResourceD0.getTags() : null;
        if (tags == null) {
            tags = lm6.E;
        }
        return tags.contains("cowork-local") || tags.contains("cowork-dispatch-local") || tags.contains("cowork-dispatch-child");
    }

    public final boolean M0() {
        if (this.b instanceof CodeSessionListScope.DramaticShrimp) {
            return true;
        }
        SessionResource sessionResourceD0 = D0();
        List<String> tags = sessionResourceD0 != null ? sessionResourceD0.getTags() : null;
        if (tags == null) {
            tags = lm6.E;
        }
        return tags.contains("cowork-remote");
    }

    public final boolean N0(String str, String str2) {
        return ((Set) this.M0.getValue()).contains(str + ":" + str2);
    }

    public final boolean O0() {
        return this.j.d() && !this.k.c();
    }

    public final boolean P0() {
        if (!F0()) {
            return false;
        }
        Collection collectionValues = ((Map) this.q2.getValue()).values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            return false;
        }
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (!((m29) it.next()).c) {
                return true;
            }
        }
        return false;
    }

    public final boolean Q0() {
        return R0() && (this.b instanceof CodeSessionListScope.DramaticShrimp);
    }

    public final boolean R0() {
        return E0() == null;
    }

    public final boolean S0() {
        List<ShareRecord> shares;
        g81 g81Var = this.d2;
        GetShareStatusResponse getShareStatusResponseF = g81Var.f();
        ShareRecord shareRecord = null;
        Object obj = null;
        shareRecord = null;
        if (getShareStatusResponseF != null && (shares = getShareStatusResponseF.getShares()) != null) {
            Iterator<T> it = shares.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((ShareRecord) next).getStatus() == ShareStatus.ACTIVE) {
                    obj = next;
                    break;
                }
            }
            shareRecord = (ShareRecord) obj;
        }
        if (shareRecord == null) {
            return false;
        }
        ShareVisibilityType visibility_type = shareRecord.getVisibility_type();
        return visibility_type != null ? visibility_type == ShareVisibilityType.ORG_ONLY : g81Var.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T(GitHubRepo gitHubRepo) {
        gitHubRepo.getClass();
        kdg kdgVar = this.T0;
        if (kdgVar == null || !kdgVar.isEmpty()) {
            ListIterator listIterator = kdgVar.listIterator();
            while (true) {
                c8a c8aVar = (c8a) listIterator;
                if (!c8aVar.hasNext()) {
                    break;
                }
                lhf lhfVar = (lhf) c8aVar.next();
                if (x44.r(lhfVar.a.getOwner().getLogin(), gitHubRepo.getOwner().getLogin()) && x44.r(lhfVar.a.getName(), gitHubRepo.getName())) {
                    return;
                }
            }
        }
        kdgVar.add(new lhf(gitHubRepo, null));
        h1();
        this.l.e(new CodeEvents$RepositorySelected(this.m, (Integer) null, 2, (mq5) (0 == true ? 1 : 0)), CodeEvents$RepositorySelected.Companion.serializer());
    }

    public final boolean T0() {
        EnvironmentResource environmentResourceA = com.anthropic.claude.code.remote.stores.h.a(C0());
        return environmentResourceA != null && gwj.j(environmentResourceA);
    }

    public final void U() {
        String environment_id;
        Object next;
        SessionResource sessionResourceD0 = D0();
        if (sessionResourceD0 == null || (environment_id = sessionResourceD0.getEnvironment_id()) == null) {
            return;
        }
        Iterator it = this.h.f().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (x44.r(((EnvironmentResource) next).getEnvironment_id(), environment_id)) {
                    break;
                }
            }
        }
        EnvironmentResource environmentResource = (EnvironmentResource) next;
        if (environmentResource == null) {
            return;
        }
        w1(new SessionTarget.Environment(environmentResource));
    }

    public final boolean U0() {
        Object objPrevious;
        boolean z;
        if (!V0()) {
            iqf iqfVar = this.y0;
            if (iqfVar.j.getValue() != null) {
                return false;
            }
            if (((Boolean) this.f2.getValue()).booleanValue()) {
                return true;
            }
            if (!K0()) {
                List listP0 = p0();
                ListIterator listIterator = listP0.listIterator(listP0.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    zpf zpfVar = (zpf) objPrevious;
                    if (!(zpfVar instanceof ejb) && !(zpfVar instanceof lei)) {
                        break;
                    }
                }
                zpf zpfVar2 = (zpf) objPrevious;
                if (zpfVar2 != null && ((!((z = zpfVar2 instanceof leb)) || !((leb) zpfVar2).e) && ((!z || !((leb) zpfVar2).e()) && ((Boolean) this.H1.getValue()).booleanValue()))) {
                    if (z && wwk.i((leb) zpfVar2) == nj6.E) {
                        return ((Boolean) iqfVar.i.getValue()).booleanValue();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void V() {
        SessionContext session_context;
        List<SessionContextSource> sources;
        Object next;
        SessionResource sessionResourceD0 = D0();
        if (sessionResourceD0 == null || (session_context = sessionResourceD0.getSession_context()) == null || (sources = session_context.getSources()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : sources) {
            if (obj instanceof SessionContextSource.GitRepository) {
                arrayList.add(obj);
            }
        }
        SessionContextSource.GitRepository gitRepository = (SessionContextSource.GitRepository) w44.N0(arrayList);
        if (gitRepository != null) {
            List listY0 = bsg.Y0(bsg.T0(gitRepository.getUrl(), "/"), new String[]{"/"}, 6);
            if (listY0.size() < 2) {
                return;
            }
            String str = (String) listY0.get(listY0.size() - 2);
            String str2 = (String) listY0.get(listY0.size() - 1);
            Iterator it = this.g.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                RepoWithStatus repoWithStatus = (RepoWithStatus) next;
                if (x44.r(repoWithStatus.getRepo().getOwner().getLogin(), str) && x44.r(repoWithStatus.getRepo().getName(), str2)) {
                    break;
                }
            }
            RepoWithStatus repoWithStatus2 = (RepoWithStatus) next;
            if (repoWithStatus2 == null) {
                return;
            }
            kdg kdgVar = this.T0;
            kdgVar.clear();
            kdgVar.add(new lhf(repoWithStatus2.getRepo(), null));
            this.i.h(new xw1(repoWithStatus2.getRepo().getOwner().getLogin(), repoWithStatus2.getRepo().getName(), repoWithStatus2.getRepo().getGheConfigurationId()));
        }
    }

    public final boolean V0() {
        return ((Boolean) this.c2.getValue()).booleanValue();
    }

    public final void W(String str) {
        tp4 tp4Var;
        Object next;
        str.getClass();
        kdg kdgVar = this.S1;
        ListIterator listIterator = kdgVar.listIterator();
        while (true) {
            c8a c8aVar = (c8a) listIterator;
            tp4Var = null;
            if (!c8aVar.hasNext()) {
                next = null;
                break;
            } else {
                next = c8aVar.next();
                if (x44.r(((lwc) next).b, str)) {
                    break;
                }
            }
        }
        b54.w0(new w43(str, 20), kdgVar);
        f0();
        gb9.D(this.a, null, null, new t14(this, str, (lwc) next, tp4Var, 1), 3);
    }

    public final boolean W0() {
        EnvironmentResource environmentResourceA;
        return E0() == null && !Q0() && (environmentResourceA = com.anthropic.claude.code.remote.stores.h.a(C0())) != null && gwj.j(environmentResourceA) && this.h.h(environmentResourceA);
    }

    public final void X() {
        if (((Boolean) this.m2.getValue()).booleanValue()) {
            fkg fkgVar = this.J1;
            if (fkgVar == null || !fkgVar.c()) {
                this.J1 = gb9.D(this.a, null, null, new o14(this, null, 14), 3);
            }
        }
    }

    public final boolean X0() {
        return (v0() == null && ((Set) this.h2.getValue()) == null && this.y0.h.getValue() == null) ? false : true;
    }

    public final String Y(String str) {
        str.getClass();
        return this.D.a() + "/api/organizations/" + this.m + "/files/" + str + "/contents";
    }

    public final void Y0() {
        String strE0 = E0();
        if (strE0 == null) {
            return;
        }
        fkg fkgVar = this.N1;
        if (fkgVar == null || !fkgVar.c()) {
            this.N1 = gb9.D(this.a, null, null, new pb2(this, strE0, null, 24), 3);
        }
    }

    public final String Z(String str) {
        str.getClass();
        return this.D.a() + "/api/" + this.m + "/files/" + str + "/preview";
    }

    public final void Z0(zpf zpfVar) {
        if (zpfVar instanceof ejb) {
            return;
        }
        if (!this.K1 || ((zpfVar instanceof leb) && x44.r(((leb) zpfVar).c, "user"))) {
            fkg fkgVar = this.J1;
            if (fkgVar != null) {
                fkgVar.d(null);
            }
            this.J1 = null;
            o1(true);
            if ((zpfVar instanceof leb) && ((leb) zpfVar).e) {
                return;
            }
            s1(true);
        }
    }

    public final void a0() {
        this.G.I = null;
        p1(null);
        r1(null);
        this.i2 = lm6.E;
    }

    public final void a1(nf0 nf0Var) {
        nf0Var.getClass();
        if (nf0Var instanceof mf0) {
            List list = xah.a;
            Throwable th = ((mf0) nf0Var).a;
            String strE0 = E0();
            xah.f(th, ij0.i("Failed to load some events for session ", strE0 != null ? SessionId.m1119toStringimpl(strE0) : "null"), ozf.F, null, 24);
        } else {
            if (!(nf0Var instanceof lf0)) {
                wg6.i();
                return;
            }
            List list2 = xah.a;
            bj3 bj3Var = ((lf0) nf0Var).b;
            String strE02 = E0();
            ClaudeApiErrorException claudeApiErrorException = new ClaudeApiErrorException(bj3Var, ij0.i("Failed to load some events for session ", strE02 == null ? "null" : SessionId.m1119toStringimpl(strE02)));
            String strE03 = E0();
            xah.f(claudeApiErrorException, ij0.i("Failed to load some events for session ", strE03 != null ? SessionId.m1119toStringimpl(strE03) : "null"), null, null, 28);
        }
        m1(this.o.getString(R.string.error_loading_some_messages));
    }

    public final void b0() {
        this.O0.setValue(null);
        this.P0.setValue(lm6.E);
        this.Q0.m(null);
        fkg fkgVar = this.R0;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        this.R0 = gb9.D(this.a, null, null, new w14((tp4) null, this), 3);
    }

    public final void b1(String str, String str2) {
        CodeEvents$CodePromptSuggestionSuppressReason codeEvents$CodePromptSuggestionSuppressReason;
        str.getClass();
        c4c c4cVar = this.B0;
        LinkedHashSet linkedHashSet = c4cVar.k;
        String string = str2 != null ? bsg.k1(str2).toString() : null;
        if (string == null) {
            string = "";
        }
        a4c a4cVar = !c4cVar.d ? a4c.E : linkedHashSet.contains(str) ? a4c.G : string.length() == 0 ? a4c.F : null;
        int i = 0;
        if (string.length() != 0) {
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(string);
            while (characterInstance.next() != -1) {
                i++;
            }
        }
        int i2 = a4cVar == null ? -1 : b4c.a[a4cVar.ordinal()];
        if (i2 == -1) {
            codeEvents$CodePromptSuggestionSuppressReason = CodeEvents$CodePromptSuggestionSuppressReason.NOT_SUPPRESSED;
        } else if (i2 == 1) {
            codeEvents$CodePromptSuggestionSuppressReason = CodeEvents$CodePromptSuggestionSuppressReason.DISABLED;
        } else if (i2 == 2) {
            codeEvents$CodePromptSuggestionSuppressReason = CodeEvents$CodePromptSuggestionSuppressReason.DUPLICATE;
        } else {
            if (i2 != 3) {
                wg6.i();
                return;
            }
            codeEvents$CodePromptSuggestionSuppressReason = CodeEvents$CodePromptSuggestionSuppressReason.BLANK;
        }
        qi3 qi3Var = c4cVar.a;
        String str3 = (String) c4cVar.c.a();
        qi3Var.e(new CodeEvents$CodePromptSuggestionReceived(str3 != null ? str3 : "", codeEvents$CodePromptSuggestionSuppressReason, i), CodeEvents$CodePromptSuggestionReceived.Companion.serializer());
        int i3 = a4cVar == null ? -1 : b4c.a[a4cVar.ordinal()];
        if (i3 == -1) {
            if (c4cVar.b() != null) {
                c4cVar.c();
            }
            c4cVar.f.setValue(new x3c(str, string));
            linkedHashSet.add(str);
            c4cVar.g = null;
            return;
        }
        if (i3 == 1 || i3 == 2) {
            return;
        }
        if (i3 != 3) {
            wg6.i();
        } else {
            linkedHashSet.add(str);
            c4cVar.c();
        }
    }

    public final void c0() {
        String strE0 = E0();
        if (strE0 == null) {
            return;
        }
        boolean zBooleanValue = ((Boolean) this.u.l.getValue()).booleanValue();
        Boolean boolValueOf = M0() ? Boolean.valueOf(this.w0) : null;
        iqf iqfVar = this.y0;
        iqfVar.getClass();
        ik6 ik6Var = iqfVar.d;
        if (ik6Var != null) {
            ik6Var.c();
        }
        iqfVar.c(strE0, zBooleanValue, this.t0, boolValueOf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c1(java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            r9 = this;
            c61 r0 = r9.G
            r5 = 0
            r0.I = r5
            r9.j2 = r5
            boolean r0 = com.anthropic.claude.code.remote.j.c(r10)
            java.lang.String r7 = r9.m
            qi3 r8 = r9.l
            if (r0 == 0) goto L2a
            com.anthropic.claude.analytics.events.CodeEvents$BridgeOfflineSendBlocked r1 = new com.anthropic.claude.analytics.events.CodeEvents$BridgeOfflineSendBlocked
            java.lang.String r2 = r9.E0()
            if (r2 != 0) goto L1a
            r2 = r5
        L1a:
            java.lang.String r3 = "server_error"
            r1.<init>(r7, r2, r3)
            wr3 r2 = com.anthropic.claude.analytics.events.CodeEvents$BridgeOfflineSendBlocked.Companion
            kotlinx.serialization.KSerializer r2 = r2.serializer()
            znf r2 = (defpackage.znf) r2
            r8.e(r1, r2)
        L2a:
            if (r0 == 0) goto L36
            android.content.Context r0 = r9.o
            r1 = 2131886531(0x7f1201c3, float:1.9407643E38)
            java.lang.String r0 = r0.getString(r1)
            goto L37
        L36:
            r0 = r10
        L37:
            r9.m1(r0)
            r9.r1(r5)
            boolean r1 = r9.R0()
            if (r1 != 0) goto L4a
            if (r0 == 0) goto L4a
            n2g r1 = r9.g1
            r1.f(r0)
        L4a:
            boolean r0 = r9.j1()
            if (r0 != 0) goto L7e
            java.util.List r0 = r9.i2
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L77
            java.util.List r4 = r9.i2
            lm6 r0 = defpackage.lm6.E
            r9.i2 = r0
            r9.t1(r4)
            java.lang.String r3 = r9.E0()
            if (r3 == 0) goto L77
            a24 r1 = new a24
            r6 = 0
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r9 = 3
            mp4 r0 = r2.a
            defpackage.gb9.D(r0, r5, r5, r1, r9)
            goto L78
        L77:
            r2 = r9
        L78:
            if (r11 == 0) goto L7f
            r2.k1(r11)
            goto L7f
        L7e:
            r2 = r9
        L7f:
            boolean r9 = r2.M0()
            if (r9 == 0) goto L86
            return
        L86:
            com.anthropic.claude.analytics.events.CodeEvents$MessageSendingFailed r9 = new com.anthropic.claude.analytics.events.CodeEvents$MessageSendingFailed
            java.lang.String r11 = r2.E0()
            if (r11 != 0) goto L8f
            goto L90
        L8f:
            r5 = r11
        L90:
            boolean r10 = com.anthropic.claude.code.remote.j.c(r10)
            if (r10 == 0) goto L98
            java.lang.String r12 = "bridge_offline"
        L98:
            r9.<init>(r7, r5, r12)
            vt3 r10 = com.anthropic.claude.analytics.events.CodeEvents$MessageSendingFailed.Companion
            kotlinx.serialization.KSerializer r10 = r10.serializer()
            znf r10 = (defpackage.znf) r10
            r8.e(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.code.remote.i.c1(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void d0() {
        lsc lscVar = this.k2;
        String strConcat = (String) lscVar.getValue();
        if (strConcat == null) {
            return;
        }
        lscVar.setValue(null);
        this.l2 = false;
        yih yihVar = this.A0;
        dfh dfhVarG = yihVar.g();
        try {
            if (dfhVarG.F.length() != 0) {
                strConcat = strConcat.concat("\n\n");
            }
            dfhVarG.c(0, 0, strConcat);
            yihVar.b(dfhVarG);
        } finally {
            yihVar.c();
        }
    }

    public final void d1() {
        if (this.v0) {
            lsc lscVar = this.u2;
            Long l = (Long) lscVar.getValue();
            if (l != null) {
                long jLongValue = l.longValue();
                long jA = this.F.a();
                Long l2 = this.v2;
                long jLongValue2 = l2 != null ? l2.longValue() : jA;
                if (jLongValue2 < jLongValue) {
                    jLongValue2 = jLongValue;
                }
                long jMax = Math.max(jLongValue, jA);
                if (jLongValue2 <= jMax) {
                    jMax = jLongValue2;
                }
                this.t2.setValue(new vlh(jLongValue, jMax, jA));
                lscVar.setValue(null);
                this.v2 = null;
            }
        }
    }

    public final void e1(String str, String str2, String str3, String str4, String str5, String str6, Map map, boolean z) {
        String str7;
        str.getClass();
        str2.getClass();
        str3.getClass();
        map.getClass();
        kdg kdgVar = this.S1;
        ListIterator listIterator = kdgVar.listIterator();
        int i = 0;
        while (true) {
            c8a c8aVar = (c8a) listIterator;
            if (!c8aVar.hasNext()) {
                str7 = str2;
                i = -1;
                break;
            } else {
                str7 = str2;
                if (x44.r(((lwc) c8aVar.next()).b, str7)) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (i < 0) {
            kdgVar.add(new lwc(str, str7, str3, str4, str5, str6, map, z, FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING));
            return;
        }
        lwc lwcVar = (lwc) kdgVar.get(i);
        String str8 = lwcVar.d;
        boolean z2 = str8 == null && str4 != null;
        String str9 = lwcVar.e;
        boolean z3 = str9 == null && str5 != null;
        String str10 = lwcVar.f;
        boolean z4 = str10 == null && str6 != null;
        boolean z5 = lwcVar.h;
        boolean z6 = !z5 && z;
        if (z2 || z3 || z4 || z6) {
            String str11 = str4 == null ? str8 : str4;
            String str12 = str5 == null ? str9 : str5;
            String str13 = str6 == null ? str10 : str6;
            boolean z7 = z5 || z;
            String str14 = lwcVar.a;
            String str15 = lwcVar.b;
            String str16 = lwcVar.c;
            Map map2 = lwcVar.g;
            boolean z8 = lwcVar.i;
            str14.getClass();
            str15.getClass();
            str16.getClass();
            map2.getClass();
            kdgVar.set(i, new lwc(str14, str15, str16, str11, str12, str13, map2, z7, z8));
        }
    }

    public final void f0() {
        String strE0;
        if (this.S1.isEmpty() && w0() == null && m0() == null && (strE0 = E0()) != null) {
            Context context = this.o;
            context.getClass();
            int iHashCode = strE0.hashCode();
            synchronized (ysj.a) {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (notificationManager != null) {
                    notificationManager.cancel(iHashCode);
                }
            }
        }
    }

    public final void f1(String str) {
        str.getClass();
        b54.w0(new w43(str, 17), this.S1);
        f0();
    }

    public final void g0(String str) {
        Long l;
        if (V0() || this.U || (l = this.Z) == null) {
            return;
        }
        long jLongValue = l.longValue();
        String strE0 = E0();
        if (strE0 == null) {
            return;
        }
        this.Z = null;
        this.l.e(new CodeEvents$BridgeReconnectWait(this.m, strE0, str, (System.nanoTime() - jLongValue) / 1000000), CodeEvents$BridgeReconnectWait.Companion.serializer());
    }

    public final void g1(List list) {
        qb5 qb5Var = this.x2;
        qb5Var.getClass();
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qb5Var.v((zpf) it.next());
        }
    }

    public final void h0() {
        n58 n58VarQ0 = q0();
        String strE0 = E0();
        GitHubRepo gitHubRepoZ0 = z0();
        String default_branch = gitHubRepoZ0 != null ? gitHubRepoZ0.getDefault_branch() : null;
        if (n58VarQ0 == null || strE0 == null || default_branch == null) {
            return;
        }
        gb9.D(this.a, null, null, new w14(this, strE0, n58VarQ0, default_branch, null, 1), 3);
    }

    public final void h1() {
        kdg kdgVar = this.T0;
        ArrayList arrayList = new ArrayList(x44.y(kdgVar, 10));
        ListIterator listIterator = kdgVar.listIterator();
        while (true) {
            c8a c8aVar = (c8a) listIterator;
            if (!c8aVar.hasNext()) {
                this.k.i(arrayList);
                GitHubRepo gitHubRepoZ0 = z0();
                xhe xheVar = this.g;
                xheVar.k.setValue(gitHubRepoZ0);
                xheVar.b.h(gitHubRepoZ0);
                return;
            }
            arrayList.add(((lhf) c8aVar.next()).a);
        }
    }

    public final void i0() {
        g81 g81Var = this.d2;
        p14 p14Var = (p14) g81Var.f;
        lsc lscVar = (lsc) g81Var.i;
        SessionId sessionId = (SessionId) p14Var.a();
        tp4 tp4Var = null;
        String strM1120unboximpl = sessionId != null ? sessionId.m1120unboximpl() : null;
        if (strM1120unboximpl == null || ((Boolean) lscVar.getValue()).booleanValue()) {
            return;
        }
        lscVar.setValue(Boolean.TRUE);
        gb9.D((l45) g81Var.a, null, null, new ba9(g81Var, strM1120unboximpl, tp4Var, 22), 3);
    }

    public final void i1(zy7 zy7Var, bz7 bz7Var, String str) {
        str.getClass();
        String strE0 = E0();
        if (strE0 == null) {
            return;
        }
        gb9.D(this.a, null, null, new tm((Object) this, strE0, str, (Object) bz7Var, zy7Var, (tp4) null, 24), 3);
    }

    public final void j0(String str, String str2) {
        Long l;
        if (this.P) {
            this.P = false;
            String strE0 = E0();
            if (strE0 != null) {
                List list = xah.a;
                we2 we2Var = we2.a;
                xah.g("ccr.session.init.".concat(strE0), str2, null, str2.equals("error") ? this.Y : null, 4);
            }
        }
        if (str.equals("connected") && !this.V) {
            this.V = true;
            if (this.X) {
                List list2 = xah.a;
                xah.c("composer_enabled");
            } else {
                this.W = true;
            }
        }
        if (this.S || !this.Q || V0() || this.U || (l = this.I) == null) {
            return;
        }
        long jLongValue = l.longValue();
        String strE02 = E0();
        if (strE02 == null) {
            return;
        }
        this.S = true;
        if (M0()) {
            return;
        }
        long jNanoTime = (System.nanoTime() - jLongValue) / 1000000;
        int i = this.R;
        this.l.e(new CodeEvents$SessionStreamConnectResult(this.m, strE02, str, jNanoTime, i < 1 ? 1 : i, this.Y), CodeEvents$SessionStreamConnectResult.Companion.serializer());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j1() {
        /*
            r7 = this;
            c61 r0 = r7.G
            r5 = 0
            r0.I = r5
            leb r0 = r7.v0()
            if (r0 != 0) goto Ld
            r7 = 0
            return r7
        Ld:
            java.util.List r0 = r0.d
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r0.next()
            boolean r3 = r2 instanceof defpackage.xdh
            if (r3 == 0) goto L1a
            r1.add(r2)
            goto L1a
        L2c:
            java.lang.Object r0 = defpackage.w44.N0(r1)
            xdh r0 = (defpackage.xdh) r0
            if (r0 == 0) goto L38
            java.lang.String r0 = r0.a
            if (r0 != 0) goto L3a
        L38:
            java.lang.String r0 = ""
        L3a:
            r7.k1(r0)
            java.util.List r0 = r7.i2
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L64
            java.util.List r4 = r7.i2
            lm6 r0 = defpackage.lm6.E
            r7.i2 = r0
            r7.t1(r4)
            java.lang.String r3 = r7.E0()
            if (r3 == 0) goto L64
            a24 r1 = new a24
            r6 = 1
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r7 = 3
            mp4 r0 = r2.a
            defpackage.gb9.D(r0, r5, r5, r1, r7)
            goto L65
        L64:
            r2 = r7
        L65:
            r2.p1(r5)
            r2.r1(r5)
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.code.remote.i.j1():boolean");
    }

    public final void k0() {
        LinkedHashSet linkedHashSet = this.L0;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        List<String> listP1 = w44.p1(linkedHashSet);
        linkedHashSet.clear();
        for (String str : listP1) {
            if (!((Map) this.J0.getValue()).containsKey(str) && this.K0.add(str)) {
                gb9.D(this.a, null, null, new v14(this, str, null, 2), 3);
            }
        }
    }

    public final void k1(String str) {
        yih yihVar = this.A0;
        dfh dfhVarG = yihVar.g();
        try {
            if (dfhVarG.F.length() != 0) {
                str = str + "\n\n";
            }
            dfhVarG.c(0, 0, str);
            yihVar.b(dfhVarG);
        } finally {
            yihVar.c();
        }
    }

    public final l34 l0() {
        SessionResource sessionResourceD0 = D0();
        if (sessionResourceD0 != null) {
            return fe5.i(sessionResourceD0) ? l34.BRIDGE : l34.REMOTE;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [iqf] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [c45, java.lang.Long, java.lang.Object, o45, tp4] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [c45, o45] */
    /* JADX WARN: Type inference failed for: r2v10, types: [lsc] */
    /* JADX WARN: Type inference failed for: r2v7, types: [lsc] */
    /* JADX WARN: Type inference failed for: r2v8, types: [lsc] */
    /* JADX WARN: Type inference failed for: r2v9, types: [lsc] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r7v18, types: [c45, o45] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean l1(String str, boolean z) {
        String str2;
        ?? r0;
        String str3;
        mp4 mp4Var;
        ?? r4;
        String str4;
        y3c y3cVar;
        SessionResource sessionResourceD0;
        str.getClass();
        if (((Set) this.h2.getValue()) == null) {
            c4c c4cVar = this.B0;
            c4cVar.c();
            String strE0 = E0();
            boolean z2 = false;
            if (strE0 != null) {
                z36 z36Var = (z36) this.A;
                z36Var.getClass();
                amg amgVar = (amg) z36Var.c.get(SessionId.m1114boximpl(strE0));
                if (amgVar != null) {
                    amgVar.n(null, u36.a);
                }
            }
            kdg kdgVar = this.W1;
            ArrayList arrayList = new ArrayList(x44.y(kdgVar, 10));
            ListIterator listIterator = kdgVar.listIterator();
            while (true) {
                c8a c8aVar = (c8a) listIterator;
                if (!c8aVar.hasNext()) {
                    break;
                }
                arrayList.add(((o32) c8aVar.next()).a);
            }
            Set setT1 = w44.t1(arrayList);
            ArrayList arrayList2 = new ArrayList();
            ListIterator listIterator2 = kdgVar.listIterator();
            while (true) {
                c8a c8aVar2 = (c8a) listIterator2;
                if (!c8aVar2.hasNext()) {
                    break;
                }
                n32 n32VarA = ((o32) c8aVar2.next()).a();
                j32 j32Var = n32VarA instanceof j32 ? (j32) n32VarA : null;
                SessionFileAttachment sessionFileAttachment = j32Var != null ? j32Var.a : null;
                if (sessionFileAttachment != null) {
                    arrayList2.add(sessionFileAttachment);
                }
            }
            StringBuilder sb = new StringBuilder();
            if (bsg.I0(str)) {
                str2 = str;
            } else {
                str2 = str;
                sb.append(str2);
            }
            if (!A0().isEmpty()) {
                if (!bsg.I0(sb)) {
                    sb.append("\n\n---\n\n");
                }
                sb.append(w44.S0(A0(), "\n\n---\n\n", null, null, new i04(5), 30));
            }
            String string = sb.toString();
            if (!bsg.I0(string) || !arrayList2.isEmpty()) {
                if (!R0() && (sessionResourceD0 = D0()) != null && fe5.i(sessionResourceD0) && sessionResourceD0.getConnection_status() == ConnectionStatus.DISCONNECTED) {
                    String string2 = this.o.getString(R.string.ccr_remote_control_offline_error);
                    string2.getClass();
                    m1(string2);
                    this.g1.f(string2);
                    String strE02 = E0();
                    this.l.e(new CodeEvents$BridgeOfflineSendBlocked(this.m, strE02 != null ? strE02 : null, "pre_send_guard"), CodeEvents$BridgeOfflineSendBlocked.Companion.serializer());
                    Y0();
                    return false;
                }
                int i = 1;
                this.j2 = (!z || (y3cVar = c4cVar.h) == null || bsg.I0(str2)) ? null : new z3c(y3cVar.c, ((Number) c4cVar.e.a()).longValue() - y3cVar.b, !x44.r(bsg.k1(str2).toString(), y3cVar.a));
                String str5 = this.O1;
                mp4 mp4Var2 = this.a;
                if (str5 != null) {
                    this.O1 = null;
                    r0 = 0;
                    gb9.D(mp4Var2, null, null, new pb2(this, str5, string, z2 ? 1 : 0, 26), 3);
                } else {
                    r0 = 0;
                }
                this.G1.setValue(Boolean.FALSE);
                this.s2.setValue(r0);
                this.u2.setValue(r0);
                this.t2.setValue(r0);
                this.v2 = r0;
                this.w2.setValue(r0);
                z1(Long.valueOf(this.F.a()));
                if (!((Boolean) this.m2.getValue()).booleanValue()) {
                    b0();
                }
                String strI = vb7.i();
                boolean zI0 = bsg.I0(string);
                lm6 lm6Var = lm6.E;
                List listW = !zI0 ? x44.W(new xdh(string)) : lm6Var;
                leb lebVar = new leb(strI, (String) null, "user", listW, (String) null, (List) arrayList2, false, (String) null, (String) null, 944);
                p1(lebVar);
                r1(setT1);
                this.i2 = w44.p1(A0());
                String strE03 = E0();
                if (strE03 != null) {
                    t1(lm6Var);
                    gb9.D(mp4Var2, r0, r0, new v14(this, strE03, r0, i), 3);
                }
                boolean zR0 = R0();
                c61 c61Var = this.G;
                if (!zR0) {
                    ?? r13 = r0;
                    c61Var.h(strI, false);
                    ?? r42 = !arrayList2.isEmpty() ? arrayList2 : r13;
                    ModelId modelId = (ModelId) this.Y0.getValue();
                    ?? M1064unboximpl = modelId != null ? modelId.m1064unboximpl() : r13;
                    if (M1064unboximpl != 0) {
                        r13 = M1064unboximpl;
                    }
                    this.y0.d(string, r13, strI, r42);
                    return true;
                }
                c61Var.h(strI, true);
                String str6 = "";
                if (this.b instanceof CodeSessionListScope.DramaticShrimp) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : listW) {
                        if (obj instanceof xdh) {
                            arrayList3.add(obj);
                        }
                    }
                    xdh xdhVar = (xdh) w44.N0(arrayList3);
                    if (xdhVar != null && (str4 = xdhVar.a) != null) {
                        str6 = str4;
                    }
                    List list = lebVar.g;
                    if (list.isEmpty()) {
                        mp4Var = mp4Var2;
                        r4 = r0;
                    } else {
                        r4 = list;
                        mp4Var = mp4Var2;
                    }
                    if (bsg.I0(str6)) {
                        a0();
                        return false;
                    }
                    ?? r7 = r0;
                    gb9.D(mp4Var, r7, r7, new b9(this, str6, lebVar, r4, null, 8), 3);
                    return true;
                }
                ?? r132 = r0;
                String strB0 = B0();
                List listP1 = w44.p1(this.T0);
                SessionTarget sessionTargetC0 = C0();
                String str7 = this.b1;
                if (strB0 == null) {
                    boolean zO0 = O0();
                    Object obj2 = f14.a;
                    n2g n2gVar = this.b0;
                    if (!zO0 && !T0() && str7 == null) {
                        List listF = this.h.f();
                        if ((listF instanceof Collection) && listF.isEmpty()) {
                            obj2 = e14.a;
                        } else {
                            Iterator it = listF.iterator();
                            while (it.hasNext()) {
                                if (gwj.j((EnvironmentResource) it.next())) {
                                    break;
                                }
                            }
                            obj2 = e14.a;
                        }
                        a0();
                        n2gVar.f(obj2);
                        return false;
                    }
                    if (listP1.isEmpty() && !T0() && str7 == null) {
                        a0();
                        n2gVar.f(g14.a);
                        return false;
                    }
                    if (sessionTargetC0 == null) {
                        a0();
                        n2gVar.f(obj2);
                        return false;
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : listW) {
                    if (obj3 instanceof xdh) {
                        arrayList4.add(obj3);
                    }
                }
                xdh xdhVar2 = (xdh) w44.N0(arrayList4);
                if (xdhVar2 == null || (str3 = xdhVar2.a) == null) {
                    str3 = "";
                }
                gb9.D(mp4Var2, r132, r132, new h(this, strB0, str3, sessionTargetC0, listP1, str7, lebVar, null), 3);
                return true;
            }
        }
        return false;
    }

    public final tw0 m0() {
        return (tw0) this.Q1.getValue();
    }

    public final void m1(String str) {
        this.f1.setValue(str);
    }

    public final s71 n0() {
        return (s71) this.C1.getValue();
    }

    public final void n1() {
        SessionResource sessionResourceD0;
        SessionContext session_context;
        List<Outcome> outcomes;
        String strCurrentBranchFor;
        SessionExternalMetadata external_metadata;
        if (q0() != null || (sessionResourceD0 = D0()) == null || (session_context = sessionResourceD0.getSession_context()) == null || (outcomes = session_context.getOutcomes()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : outcomes) {
            if (obj instanceof Outcome.GitRepository) {
                arrayList.add(obj);
            }
        }
        Outcome.GitRepository gitRepository = (Outcome.GitRepository) w44.N0(arrayList);
        if (gitRepository != null) {
            String repo = gitRepository.getGit_info().getRepo();
            SessionResource sessionResourceD02 = D0();
            if ((sessionResourceD02 == null || (external_metadata = sessionResourceD02.getExternal_metadata()) == null || (strCurrentBranchFor = external_metadata.currentBranchFor(repo)) == null) && (strCurrentBranchFor = (String) w44.N0(gitRepository.getGit_info().getBranches())) == null) {
                return;
            }
            this.l1.setValue(new n58(repo, strCurrentBranchFor, a68.a));
        }
    }

    public final ph4 o0() {
        return (ph4) this.T1.getValue();
    }

    public final void o1(boolean z) {
        this.H1.setValue(Boolean.valueOf(z));
    }

    @Override // defpackage.iwe, defpackage.y59
    public final void onDestroy() {
        lqf lqfVar = null;
        this.G.I = null;
        if (this.T) {
            j0("failed", "error");
        } else {
            j0("cancelled", "cancelled");
        }
        g0("gave_up");
        this.B0.c();
        i55 i55Var = this.e1;
        if (i55Var != null) {
            fkg fkgVar = i55Var.h;
            if (fkgVar != null) {
                fkgVar.d(null);
            }
            i55Var.h = null;
            i55Var.l = null;
            i55Var.j = false;
            d55 d55Var = i55Var.m;
            if (d55Var != null) {
                i55Var.m = null;
                i55Var.d(d55Var.a, c55.DISMISSED);
            }
        }
        LinkedHashMap linkedHashMap = this.X1;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((lf9) it.next()).d(null);
        }
        linkedHashMap.clear();
        this.W1.clear();
        if (this.p0) {
            jud judVar = this.e2;
            if (!((Boolean) ((l14) judVar.g).a()).booleanValue()) {
                SessionId sessionId = (SessionId) ((p14) judVar.f).a();
                String strM1120unboximpl = sessionId != null ? sessionId.m1120unboximpl() : null;
                lqf lqfVar2 = (lqf) ((ylg) judVar.e).getValue();
                if (lqfVar2 != null) {
                    if (strM1120unboximpl != null ? SessionId.m1117equalsimpl0(lqfVar2.a, strM1120unboximpl) : false) {
                        lqfVar = lqfVar2;
                    }
                }
                if (strM1120unboximpl != null && lqfVar != null) {
                    String str = lqfVar.b;
                    if (!str.equals((String) judVar.b)) {
                        ((otf) judVar.d).c(strM1120unboximpl, str);
                    }
                }
            }
        }
        super.onDestroy();
    }

    public final List p0() {
        List list = (List) this.y0.e.get(null);
        return list == null ? lm6.E : list;
    }

    public final void p1(leb lebVar) {
        this.g2.setValue(lebVar);
    }

    public final n58 q0() {
        return (n58) this.l1.getValue();
    }

    public final void q1(j4d j4dVar) {
        this.F1.setValue(j4dVar);
    }

    public final boolean r0() {
        List<ShareRecord> shares;
        GetShareStatusResponse getShareStatusResponseF = this.d2.f();
        if (getShareStatusResponseF == null || (shares = getShareStatusResponseF.getShares()) == null) {
            return false;
        }
        List<ShareRecord> list = shares;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((ShareRecord) it.next()).getStatus() == ShareStatus.ACTIVE) {
                return true;
            }
        }
        return false;
    }

    public final void r1(Set set) {
        this.h2.setValue(set);
    }

    public final boolean s0() {
        c8a c8aVar;
        kdg kdgVar = this.W1;
        if (kdgVar != null && kdgVar.isEmpty()) {
            return false;
        }
        ListIterator listIterator = kdgVar.listIterator();
        do {
            c8aVar = (c8a) listIterator;
            if (!c8aVar.hasNext()) {
                return false;
            }
        } while (((o32) c8aVar.next()).a() instanceof j32);
        return true;
    }

    public final void s1(boolean z) {
        this.m2.setValue(Boolean.valueOf(z));
    }

    public final zpf t0() {
        Object objPrevious;
        List listP0 = p0();
        ListIterator listIterator = listP0.listIterator(listP0.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            zpf zpfVar = (zpf) objPrevious;
            if (!(zpfVar instanceof ejb) && !(zpfVar instanceof lei)) {
                break;
            }
        }
        return (zpf) objPrevious;
    }

    public final void t1(List list) {
        this.Y1.setValue(list);
    }

    public final String u0() {
        ModelId modelId = (ModelId) this.Y0.getValue();
        String strM1064unboximpl = modelId != null ? modelId.m1064unboximpl() : null;
        if (strM1064unboximpl == null) {
            ModelId modelId2 = (ModelId) this.Z0.getValue();
            strM1064unboximpl = modelId2 != null ? modelId2.m1064unboximpl() : null;
        }
        if (strM1064unboximpl == null) {
            return null;
        }
        hi6 hi6Var = this.X0;
        ModelSelectorEntry modelSelectorEntryL = hi6Var.l(strM1064unboximpl);
        if (modelSelectorEntryL != null) {
            return modelSelectorEntryL.m364getIdi4oh0I();
        }
        ModelSelectorEntry modelSelectorEntryL2 = hi6Var.l(j.b(strM1064unboximpl));
        return modelSelectorEntryL2 != null ? modelSelectorEntryL2.m364getIdi4oh0I() : strM1064unboximpl;
    }

    public final void u1(boolean z) {
        this.c2.setValue(Boolean.valueOf(z));
    }

    public final leb v0() {
        return (leb) this.g2.getValue();
    }

    public final void v1(Integer num) {
        this.U0.setValue(num);
    }

    public final j4d w0() {
        return (j4d) this.F1.getValue();
    }

    public final void w1(SessionTarget sessionTarget) {
        this.W0.setValue(sessionTarget);
    }

    public final PermissionMode x0() {
        return (PermissionMode) this.s1.getValue();
    }

    public final void x1(SessionResource sessionResource) {
        this.S0.setValue(sessionResource);
    }

    public final boolean y0() {
        String str;
        int iIntValue;
        if (x44.r(n0(), n71.b) && (str = (String) this.G0.getValue()) != null) {
            ArrayList arrayListK = zmk.k(str);
            ArrayList arrayListK2 = zmk.k("2.1.163");
            int iMax = Math.max(arrayListK.size(), arrayListK2.size());
            int i = 0;
            while (true) {
                if (i >= iMax) {
                    iIntValue = 0;
                    break;
                }
                iIntValue = ((Number) ((i < 0 || i >= arrayListK.size()) ? 0 : arrayListK.get(i))).intValue() - ((Number) ((i < 0 || i >= arrayListK2.size()) ? 0 : arrayListK2.get(i))).intValue();
                if (iIntValue != 0) {
                    break;
                }
                i++;
            }
            if (iIntValue >= 0) {
                return true;
            }
        }
        return false;
    }

    public final void y1(boolean z) {
        this.o2.setValue(Boolean.valueOf(z));
    }

    public final GitHubRepo z0() {
        lhf lhfVar = (lhf) w44.N0(this.T0);
        if (lhfVar != null) {
            return lhfVar.a;
        }
        return null;
    }

    public final void z1(Long l) {
        this.r2.setValue(l);
    }
}
