package com.anthropic.claude.code.remote;

import android.content.Context;
import com.anthropic.claude.R;
import com.anthropic.claude.code.remote.CodeSessionListScope;
import com.anthropic.claude.sessions.types.ConnectionStatus;
import com.anthropic.claude.sessions.types.PostTurnSummary;
import com.anthropic.claude.sessions.types.SessionContextSource;
import com.anthropic.claude.sessions.types.SessionResource;
import com.anthropic.claude.sessions.types.SessionStatus;
import com.anthropic.claude.sessions.types.SummaryStatusCategory;
import com.anthropic.claude.sessions.types.WorkerStatus;
import defpackage.bsg;
import defpackage.bz7;
import defpackage.c69;
import defpackage.d4c;
import defpackage.e18;
import defpackage.fd9;
import defpackage.fe;
import defpackage.fe5;
import defpackage.gr9;
import defpackage.jce;
import defpackage.jd4;
import defpackage.ld4;
import defpackage.lz1;
import defpackage.m7f;
import defpackage.mpk;
import defpackage.nwb;
import defpackage.srf;
import defpackage.uh6;
import defpackage.v40;
import defpackage.w00;
import defpackage.w44;
import defpackage.wg6;
import defpackage.wlg;
import defpackage.x44;
import defpackage.zh6;
import defpackage.zz3;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {
    public static final List a = x44.W("cowork");
    public static final long b;

    static {
        lz1 lz1Var = uh6.F;
        b = v40.Q(1, zh6.HOURS);
    }

    public static final String a(SessionResource sessionResource, c69 c69Var) {
        String needs_action;
        sessionResource.getClass();
        c69Var.getClass();
        PostTurnSummary post_turn_summary = sessionResource.getPost_turn_summary();
        if (post_turn_summary != null) {
            if (b(sessionResource, c69Var)) {
                post_turn_summary = null;
            }
            if (post_turn_summary != null) {
                if (post_turn_summary.getStatus_category() == SummaryStatusCategory.WAITING) {
                    post_turn_summary = null;
                }
                if (post_turn_summary != null && (needs_action = post_turn_summary.getNeeds_action()) != null && !bsg.I0(needs_action)) {
                    return needs_action;
                }
            }
        }
        return null;
    }

    public static final boolean b(SessionResource sessionResource, c69 c69Var) {
        sessionResource.getClass();
        c69Var.getClass();
        if (fe5.i(sessionResource) && sessionResource.getConnection_status() == ConnectionStatus.DISCONNECTED) {
            return false;
        }
        return (sessionResource.getWorker_status() == WorkerStatus.PROCESSING || sessionResource.getSession_status() == SessionStatus.RUNNING || sessionResource.getTask_summary() != null) && uh6.d(c69Var.a(sessionResource.getUpdated_at()), b) < 0;
    }

    public static final srf c(SessionResource sessionResource, c69 c69Var) {
        sessionResource.getClass();
        c69Var.getClass();
        if (sessionResource.getSession_status() == SessionStatus.ARCHIVED) {
            return srf.K;
        }
        SessionStatus session_status = sessionResource.getSession_status();
        SessionStatus sessionStatus = SessionStatus.PENDING;
        srf srfVar = srf.G;
        if (session_status == sessionStatus) {
            return srfVar;
        }
        SessionStatus session_status2 = sessionResource.getSession_status();
        SessionStatus sessionStatus2 = SessionStatus.REQUIRES_ACTION;
        srf srfVar2 = srf.H;
        if (session_status2 == sessionStatus2) {
            return srfVar2;
        }
        if (b(sessionResource, c69Var)) {
            return srfVar;
        }
        PostTurnSummary post_turn_summary = sessionResource.getPost_turn_summary();
        SummaryStatusCategory status_category = post_turn_summary != null ? post_turn_summary.getStatus_category() : null;
        int i = status_category == null ? -1 : zz3.a[status_category.ordinal()];
        srf srfVar3 = srf.J;
        switch (i) {
            case -1:
            case 7:
                return a(sessionResource, c69Var) != null ? srfVar2 : srfVar3;
            case 0:
            default:
                wg6.i();
                return null;
            case 1:
                return srfVar;
            case 2:
            case 3:
            case 4:
                return srfVar2;
            case 5:
                return srf.I;
            case 6:
                return srfVar3;
        }
    }

    public static final c d(CodeSessionListScope codeSessionListScope, wlg wlgVar, ld4 ld4Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            codeSessionListScope = CodeSessionListScope.Code.INSTANCE;
        }
        CodeSessionListScope codeSessionListScope2 = codeSessionListScope;
        int i3 = i2 & 2;
        lz1 lz1Var = jd4.a;
        if (i3 != 0) {
            e18 e18Var = (e18) ld4Var;
            Object objN = e18Var.N();
            if (objN == lz1Var) {
                objN = mpk.P(Boolean.TRUE);
                e18Var.k0(objN);
            }
            wlgVar = (nwb) objN;
        }
        wlg wlgVar2 = wlgVar;
        m7f m7fVarB = gr9.b(ld4Var);
        e18 e18Var2 = (e18) ld4Var;
        Context applicationContext = ((Context) e18Var2.j(w00.b)).getApplicationContext();
        String str = "CodeRemoteListScreenData:" + codeSessionListScope2;
        boolean zH = e18Var2.h(applicationContext) | e18Var2.h(m7fVarB) | ((((i & 14) ^ 6) > 4 && e18Var2.h(codeSessionListScope2)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && e18Var2.f(wlgVar2)) || (i & 48) == 32);
        Object objN2 = e18Var2.N();
        if (zH || objN2 == lz1Var) {
            fe feVar = new fe(applicationContext, m7fVarB, codeSessionListScope2, wlgVar2, 7);
            e18Var2.k0(feVar);
            objN2 = feVar;
        }
        return (c) fd9.r0(jce.a.b(c.class), str, (bz7) objN2, e18Var2);
    }

    public static final String e(SessionResource sessionResource, ld4 ld4Var) {
        String url;
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(1677261301);
        List<SessionContextSource> sources = sessionResource.getSession_context().getSources();
        ArrayList arrayList = new ArrayList();
        for (Object obj : sources) {
            if (obj instanceof SessionContextSource.GitRepository) {
                arrayList.add(obj);
            }
        }
        SessionContextSource.GitRepository gitRepository = (SessionContextSource.GitRepository) w44.N0(arrayList);
        if (gitRepository == null || (url = gitRepository.getUrl()) == null) {
            e18Var.p(false);
            return null;
        }
        String strT0 = bsg.T0(url, ".git");
        if (bsg.u0(strT0, "://", false)) {
            String strC1 = bsg.c1(strT0, "://", strT0);
            url = bsg.c1(strC1, "/", strC1);
        } else if (bsg.u0(strT0, "@", false)) {
            url = bsg.c1(strT0, ":", strT0);
        }
        int size = arrayList.size() - 1;
        if (size > 0) {
            e18Var.a0(-357792238);
            url = d4c.f0(R.plurals.ccr_repo_subtitle_multi, size, new Object[]{url, Integer.valueOf(size)}, e18Var);
            e18Var.p(false);
        } else {
            e18Var.a0(-357698215);
            e18Var.p(false);
        }
        e18Var.p(false);
        return url;
    }
}
