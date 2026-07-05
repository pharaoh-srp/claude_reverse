package com.anthropic.claude.code.remote;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.anthropic.claude.analytics.events.CodeEvents$SessionListLoaded;
import com.anthropic.claude.analytics.events.PushEvents$CodeSessionPermissionActionTapped;
import com.anthropic.claude.code.remote.CodeSessionListScope;
import com.anthropic.claude.sessions.types.RequiresActionDetails;
import com.anthropic.claude.sessions.types.SessionExternalMetadata;
import com.anthropic.claude.sessions.types.SessionResource;
import com.anthropic.claude.sessions.types.SessionStatus;
import com.anthropic.claude.types.strings.SessionId;
import defpackage.b1i;
import defpackage.b9;
import defpackage.bz7;
import defpackage.c69;
import defpackage.d69;
import defpackage.dxf;
import defpackage.e58;
import defpackage.ed3;
import defpackage.fkg;
import defpackage.gb9;
import defpackage.gq7;
import defpackage.gtf;
import defpackage.h86;
import defpackage.htf;
import defpackage.ik6;
import defpackage.iwe;
import defpackage.j8;
import defpackage.j8i;
import defpackage.jrf;
import defpackage.jwf;
import defpackage.jxb;
import defpackage.lm6;
import defpackage.lsc;
import defpackage.mpk;
import defpackage.n2g;
import defpackage.o2g;
import defpackage.ogc;
import defpackage.otf;
import defpackage.oz3;
import defpackage.pb2;
import defpackage.pkc;
import defpackage.pz3;
import defpackage.q7;
import defpackage.qi3;
import defpackage.qzb;
import defpackage.rc8;
import defpackage.sq6;
import defpackage.srf;
import defpackage.t9a;
import defpackage.tta;
import defpackage.tvf;
import defpackage.u73;
import defpackage.u9a;
import defpackage.um6;
import defpackage.wlg;
import defpackage.wz5;
import defpackage.x44;
import defpackage.x97;
import defpackage.xhe;
import defpackage.y3e;
import defpackage.y48;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends iwe {
    public final lsc A;
    public final lsc B;
    public final lsc C;
    public final wz5 D;
    public final wz5 E;
    public final wz5 F;
    public final wz5 G;
    public final wz5 H;
    public final wz5 I;
    public final lsc J;
    public final lsc K;
    public final lsc L;
    public fkg M;
    public final jxb N;
    public final n2g O;
    public final y3e P;
    public final lsc Q;
    public final lsc R;
    public final lsc S;
    public final lsc T;
    public final oz3 U;
    public final wz5 V;
    public fkg W;
    public final lsc X;
    public final Context b;
    public final jwf c;
    public final jrf d;
    public final tvf e;
    public final e58 f;
    public final xhe g;
    public final com.anthropic.claude.code.remote.stores.b h;
    public final com.anthropic.claude.code.remote.stores.a i;
    public final otf j;
    public final b1i k;
    public final qzb l;
    public final qi3 m;
    public final pkc n;
    public final q7 o;
    public final j8i p;
    public final CodeSessionListScope q;
    public final wlg r;
    public final boolean s;
    public final ik6 t;
    public final List u;
    public final boolean v;
    public final lsc w;
    public List x;
    public final lsc y;
    public final lsc z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, jwf jwfVar, jrf jrfVar, tvf tvfVar, e58 e58Var, xhe xheVar, com.anthropic.claude.code.remote.stores.b bVar, com.anthropic.claude.code.remote.stores.a aVar, otf otfVar, b1i b1iVar, qzb qzbVar, h86 h86Var, y48 y48Var, qi3 qi3Var, pkc pkcVar, x97 x97Var, q7 q7Var, j8i j8iVar, rc8 rc8Var, CodeSessionListScope codeSessionListScope, wlg wlgVar) {
        NotificationManager notificationManager;
        super(h86Var);
        context.getClass();
        SharedPreferences sharedPreferences = aVar.a;
        codeSessionListScope.getClass();
        wlgVar.getClass();
        this.b = context;
        this.c = jwfVar;
        this.d = jrfVar;
        this.e = tvfVar;
        this.f = e58Var;
        this.g = xheVar;
        this.h = bVar;
        this.i = aVar;
        this.j = otfVar;
        this.k = b1iVar;
        this.l = qzbVar;
        this.m = qi3Var;
        this.n = pkcVar;
        this.o = q7Var;
        this.p = j8iVar;
        this.q = codeSessionListScope;
        this.r = wlgVar;
        boolean zBooleanValue = ((Boolean) rc8Var.m("sessions_elevated_auth_enforcement").getValue()).booleanValue();
        this.s = zBooleanValue;
        gtf gtfVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        this.t = zBooleanValue ? new ik6(j8iVar, this.a) : null;
        this.u = codeSessionListScope.getScopeTags();
        this.v = codeSessionListScope.equals(CodeSessionListScope.Scheduled.INSTANCE);
        lm6 lm6Var = lm6.E;
        this.w = mpk.P(lm6Var);
        this.x = lm6Var;
        this.y = mpk.P(null);
        Boolean bool = Boolean.FALSE;
        this.z = mpk.P(bool);
        um6 um6Var = um6.E;
        this.A = mpk.P(um6Var);
        this.B = mpk.P(srf.F);
        this.C = mpk.P(d69.a.c());
        int i = 0;
        this.D = mpk.w(new pz3(this, i));
        boolean z = true;
        z = true;
        this.E = mpk.w(new pz3(this, z ? 1 : 0));
        this.F = mpk.w(new pz3(this, 2));
        this.G = mpk.w(new pz3(this, 3));
        int i2 = 4;
        this.H = mpk.w(new pz3(this, i2));
        this.I = mpk.w(new pz3(this, 5));
        this.J = mpk.P(t9a.a);
        this.K = mpk.P(bool);
        this.L = mpk.P(new htf(gtfVar, i, objArr3 == true ? 1 : 0, 31));
        this.N = new jxb();
        n2g n2gVarB = o2g.b(1, 5, null);
        this.O = n2gVarB;
        this.P = new y3e(n2gVarB);
        if (Build.VERSION.SDK_INT < 33 ? (notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class)) == null || !notificationManager.areNotificationsEnabled() : x44.x(context, "android.permission.POST_NOTIFICATIONS") != 0) {
            z = false;
        }
        this.Q = mpk.P(Boolean.valueOf(z));
        this.R = sq6.l(sharedPreferences, "onboarding_completed", false);
        this.S = sq6.l(sharedPreferences, "notification_prompt_seen", false);
        this.T = sq6.l(sharedPreferences, "cowork_starter_seen", false);
        this.U = new oz3(x97Var, this.a, codeSessionListScope.getEmitsCodeTabTelemetry());
        int i3 = 6;
        this.V = mpk.w(new pz3(this, i3));
        j8.T(new gq7(y48Var.b, new ed3(this, objArr2 == true ? 1 : 0, i3), 2), this.a);
        j8.T(new gq7(otfVar.e, new u73(this, objArr == true ? 1 : 0, i2), 2), this.a);
        gb9.D(this.a, null, null, new b(this, null), 3);
        this.X = mpk.P(um6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O(com.anthropic.claude.code.remote.c r8, defpackage.vp4 r9) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.code.remote.c.O(com.anthropic.claude.code.remote.c, vp4):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P(com.anthropic.claude.code.remote.c r20, defpackage.gtf r21, defpackage.vp4 r22) {
        /*
            Method dump skipped, instruction units count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.code.remote.c.P(com.anthropic.claude.code.remote.c, gtf, vp4):java.lang.Object");
    }

    public static final void Q(c cVar) {
        if (((Boolean) cVar.k.z.getValue()).booleanValue()) {
            Map mapB = cVar.j.b();
            LinkedHashMap linkedHashMap = new LinkedHashMap(tta.d0(mapB.size()));
            for (Map.Entry entry : mapB.entrySet()) {
                linkedHashMap.put(SessionId.m1114boximpl(SessionId.m1115constructorimpl((String) entry.getKey())), entry.getValue());
            }
            if (linkedHashMap.isEmpty()) {
                return;
            }
            gb9.D(cVar.a, null, null, new b9(linkedHashMap, cVar, null, 7), 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00dc, code lost:
    
        if (defpackage.d4c.L(r13, r0) != r6) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b A[PHI: r1 r7 r13
      0x009b: PHI (r1v3 cae) = (r1v7 cae), (r1v7 cae), (r1v9 cae) binds: [B:26:0x008b, B:28:0x0098, B:17:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r7v4 z9e) = (r7v8 z9e), (r7v8 z9e), (r7v10 z9e) binds: [B:26:0x008b, B:28:0x0098, B:17:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r13v4 com.anthropic.claude.code.remote.c) = 
      (r13v8 com.anthropic.claude.code.remote.c)
      (r13v8 com.anthropic.claude.code.remote.c)
      (r13v0 com.anthropic.claude.code.remote.c)
     binds: [B:26:0x008b, B:28:0x0098, B:17:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00dc -> B:37:0x00df). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object R(com.anthropic.claude.code.remote.c r13, defpackage.vp4 r14) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.code.remote.c.R(com.anthropic.claude.code.remote.c, vp4):java.lang.Object");
    }

    public final void S(String str) {
        List<SessionResource> listX = X();
        ArrayList arrayList = new ArrayList(x44.y(listX, 10));
        for (SessionResource sessionResourceM870copy3s6jSc4$default : listX) {
            if (SessionId.m1117equalsimpl0(sessionResourceM870copy3s6jSc4$default.m875getIdOcx55TE(), str) && sessionResourceM870copy3s6jSc4$default.getUnread()) {
                sessionResourceM870copy3s6jSc4$default = SessionResource.m870copy3s6jSc4$default(sessionResourceM870copy3s6jSc4$default, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 8126463, null);
            }
            arrayList.add(sessionResourceM870copy3s6jSc4$default);
        }
        f0(arrayList);
    }

    public final void T(SessionResource sessionResource, bz7 bz7Var) {
        bz7Var.getClass();
        RequiresActionDetails pending_action = sessionResource.getPending_action();
        if (pending_action == null) {
            return;
        }
        lsc lscVar = this.X;
        if (((Set) lscVar.getValue()).contains(SessionId.m1114boximpl(sessionResource.m875getIdOcx55TE()))) {
            return;
        }
        lscVar.setValue(dxf.q0((Set) lscVar.getValue(), SessionId.m1114boximpl(sessionResource.m875getIdOcx55TE())));
        if (this.q.getEmitsCodeTabTelemetry()) {
            this.m.e(new PushEvents$CodeSessionPermissionActionTapped(this.n.a().e().m116getUuidXjkXN6I(), this.o.a().m106getUuidislZJdo(), sessionResource.m875getIdOcx55TE(), true, pending_action.getTool_name()), PushEvents$CodeSessionPermissionActionTapped.Companion.serializer());
        }
        List listX = X();
        ArrayList arrayList = new ArrayList(x44.y(listX, 10));
        Iterator it = listX.iterator();
        while (true) {
            if (!it.hasNext()) {
                f0(arrayList);
                gb9.D(this.a, null, null, new b9(this, sessionResource, pending_action, bz7Var, null, 6), 3);
                return;
            }
            SessionResource sessionResourceM870copy3s6jSc4$default = (SessionResource) it.next();
            if (SessionId.m1117equalsimpl0(sessionResourceM870copy3s6jSc4$default.m875getIdOcx55TE(), sessionResource.m875getIdOcx55TE())) {
                SessionStatus sessionStatus = SessionStatus.RUNNING;
                c69 c69VarC = d69.a.c();
                SessionExternalMetadata external_metadata = sessionResourceM870copy3s6jSc4$default.getExternal_metadata();
                sessionResourceM870copy3s6jSc4$default = SessionResource.m870copy3s6jSc4$default(sessionResourceM870copy3s6jSc4$default, null, null, null, sessionStatus, null, null, null, c69VarC, null, null, null, null, null, null, null, null, null, external_metadata != null ? SessionExternalMetadata.copy$default(external_metadata, null, null, null, null, null, null, null, 126, null) : null, false, null, null, null, null, 8257399, null);
            }
            arrayList.add(sessionResourceM870copy3s6jSc4$default);
        }
    }

    public final void U() {
        if (b0().isEmpty()) {
            d0(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V(java.lang.String r17, boolean r18, boolean r19, defpackage.vp4 r20) {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.code.remote.c.V(java.lang.String, boolean, boolean, vp4):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x021e A[Catch: all -> 0x020c, TryCatch #5 {all -> 0x020c, blocks: (B:105:0x0206, B:109:0x0210, B:111:0x021e, B:113:0x0224, B:118:0x0231, B:119:0x0243, B:121:0x0249, B:123:0x025e, B:124:0x0262, B:134:0x0292, B:136:0x029f, B:139:0x02a7, B:140:0x02aa, B:145:0x02b4, B:148:0x02bc, B:154:0x02cd, B:158:0x02d8, B:160:0x02f3, B:161:0x0315, B:163:0x031f, B:172:0x0343, B:187:0x039e, B:166:0x032b, B:167:0x032f, B:169:0x0335, B:157:0x02d6, B:153:0x02c8, B:127:0x0269, B:128:0x0272, B:130:0x0278, B:132:0x028d, B:115:0x0229, B:117:0x022e, B:116:0x022c), top: B:201:0x0206 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0229 A[Catch: all -> 0x020c, TryCatch #5 {all -> 0x020c, blocks: (B:105:0x0206, B:109:0x0210, B:111:0x021e, B:113:0x0224, B:118:0x0231, B:119:0x0243, B:121:0x0249, B:123:0x025e, B:124:0x0262, B:134:0x0292, B:136:0x029f, B:139:0x02a7, B:140:0x02aa, B:145:0x02b4, B:148:0x02bc, B:154:0x02cd, B:158:0x02d8, B:160:0x02f3, B:161:0x0315, B:163:0x031f, B:172:0x0343, B:187:0x039e, B:166:0x032b, B:167:0x032f, B:169:0x0335, B:157:0x02d6, B:153:0x02c8, B:127:0x0269, B:128:0x0272, B:130:0x0278, B:132:0x028d, B:115:0x0229, B:117:0x022e, B:116:0x022c), top: B:201:0x0206 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x022c A[Catch: all -> 0x020c, TryCatch #5 {all -> 0x020c, blocks: (B:105:0x0206, B:109:0x0210, B:111:0x021e, B:113:0x0224, B:118:0x0231, B:119:0x0243, B:121:0x0249, B:123:0x025e, B:124:0x0262, B:134:0x0292, B:136:0x029f, B:139:0x02a7, B:140:0x02aa, B:145:0x02b4, B:148:0x02bc, B:154:0x02cd, B:158:0x02d8, B:160:0x02f3, B:161:0x0315, B:163:0x031f, B:172:0x0343, B:187:0x039e, B:166:0x032b, B:167:0x032f, B:169:0x0335, B:157:0x02d6, B:153:0x02c8, B:127:0x0269, B:128:0x0272, B:130:0x0278, B:132:0x028d, B:115:0x0229, B:117:0x022e, B:116:0x022c), top: B:201:0x0206 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0249 A[Catch: all -> 0x020c, TryCatch #5 {all -> 0x020c, blocks: (B:105:0x0206, B:109:0x0210, B:111:0x021e, B:113:0x0224, B:118:0x0231, B:119:0x0243, B:121:0x0249, B:123:0x025e, B:124:0x0262, B:134:0x0292, B:136:0x029f, B:139:0x02a7, B:140:0x02aa, B:145:0x02b4, B:148:0x02bc, B:154:0x02cd, B:158:0x02d8, B:160:0x02f3, B:161:0x0315, B:163:0x031f, B:172:0x0343, B:187:0x039e, B:166:0x032b, B:167:0x032f, B:169:0x0335, B:157:0x02d6, B:153:0x02c8, B:127:0x0269, B:128:0x0272, B:130:0x0278, B:132:0x028d, B:115:0x0229, B:117:0x022e, B:116:0x022c), top: B:201:0x0206 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0269 A[Catch: all -> 0x020c, TryCatch #5 {all -> 0x020c, blocks: (B:105:0x0206, B:109:0x0210, B:111:0x021e, B:113:0x0224, B:118:0x0231, B:119:0x0243, B:121:0x0249, B:123:0x025e, B:124:0x0262, B:134:0x0292, B:136:0x029f, B:139:0x02a7, B:140:0x02aa, B:145:0x02b4, B:148:0x02bc, B:154:0x02cd, B:158:0x02d8, B:160:0x02f3, B:161:0x0315, B:163:0x031f, B:172:0x0343, B:187:0x039e, B:166:0x032b, B:167:0x032f, B:169:0x0335, B:157:0x02d6, B:153:0x02c8, B:127:0x0269, B:128:0x0272, B:130:0x0278, B:132:0x028d, B:115:0x0229, B:117:0x022e, B:116:0x022c), top: B:201:0x0206 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x029f A[Catch: all -> 0x020c, TryCatch #5 {all -> 0x020c, blocks: (B:105:0x0206, B:109:0x0210, B:111:0x021e, B:113:0x0224, B:118:0x0231, B:119:0x0243, B:121:0x0249, B:123:0x025e, B:124:0x0262, B:134:0x0292, B:136:0x029f, B:139:0x02a7, B:140:0x02aa, B:145:0x02b4, B:148:0x02bc, B:154:0x02cd, B:158:0x02d8, B:160:0x02f3, B:161:0x0315, B:163:0x031f, B:172:0x0343, B:187:0x039e, B:166:0x032b, B:167:0x032f, B:169:0x0335, B:157:0x02d6, B:153:0x02c8, B:127:0x0269, B:128:0x0272, B:130:0x0278, B:132:0x028d, B:115:0x0229, B:117:0x022e, B:116:0x022c), top: B:201:0x0206 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02a7 A[Catch: all -> 0x020c, TryCatch #5 {all -> 0x020c, blocks: (B:105:0x0206, B:109:0x0210, B:111:0x021e, B:113:0x0224, B:118:0x0231, B:119:0x0243, B:121:0x0249, B:123:0x025e, B:124:0x0262, B:134:0x0292, B:136:0x029f, B:139:0x02a7, B:140:0x02aa, B:145:0x02b4, B:148:0x02bc, B:154:0x02cd, B:158:0x02d8, B:160:0x02f3, B:161:0x0315, B:163:0x031f, B:172:0x0343, B:187:0x039e, B:166:0x032b, B:167:0x032f, B:169:0x0335, B:157:0x02d6, B:153:0x02c8, B:127:0x0269, B:128:0x0272, B:130:0x0278, B:132:0x028d, B:115:0x0229, B:117:0x022e, B:116:0x022c), top: B:201:0x0206 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02b4 A[Catch: all -> 0x020c, TryCatch #5 {all -> 0x020c, blocks: (B:105:0x0206, B:109:0x0210, B:111:0x021e, B:113:0x0224, B:118:0x0231, B:119:0x0243, B:121:0x0249, B:123:0x025e, B:124:0x0262, B:134:0x0292, B:136:0x029f, B:139:0x02a7, B:140:0x02aa, B:145:0x02b4, B:148:0x02bc, B:154:0x02cd, B:158:0x02d8, B:160:0x02f3, B:161:0x0315, B:163:0x031f, B:172:0x0343, B:187:0x039e, B:166:0x032b, B:167:0x032f, B:169:0x0335, B:157:0x02d6, B:153:0x02c8, B:127:0x0269, B:128:0x0272, B:130:0x0278, B:132:0x028d, B:115:0x0229, B:117:0x022e, B:116:0x022c), top: B:201:0x0206 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02bc A[Catch: all -> 0x020c, TryCatch #5 {all -> 0x020c, blocks: (B:105:0x0206, B:109:0x0210, B:111:0x021e, B:113:0x0224, B:118:0x0231, B:119:0x0243, B:121:0x0249, B:123:0x025e, B:124:0x0262, B:134:0x0292, B:136:0x029f, B:139:0x02a7, B:140:0x02aa, B:145:0x02b4, B:148:0x02bc, B:154:0x02cd, B:158:0x02d8, B:160:0x02f3, B:161:0x0315, B:163:0x031f, B:172:0x0343, B:187:0x039e, B:166:0x032b, B:167:0x032f, B:169:0x0335, B:157:0x02d6, B:153:0x02c8, B:127:0x0269, B:128:0x0272, B:130:0x0278, B:132:0x028d, B:115:0x0229, B:117:0x022e, B:116:0x022c), top: B:201:0x0206 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02c8 A[Catch: all -> 0x020c, TryCatch #5 {all -> 0x020c, blocks: (B:105:0x0206, B:109:0x0210, B:111:0x021e, B:113:0x0224, B:118:0x0231, B:119:0x0243, B:121:0x0249, B:123:0x025e, B:124:0x0262, B:134:0x0292, B:136:0x029f, B:139:0x02a7, B:140:0x02aa, B:145:0x02b4, B:148:0x02bc, B:154:0x02cd, B:158:0x02d8, B:160:0x02f3, B:161:0x0315, B:163:0x031f, B:172:0x0343, B:187:0x039e, B:166:0x032b, B:167:0x032f, B:169:0x0335, B:157:0x02d6, B:153:0x02c8, B:127:0x0269, B:128:0x0272, B:130:0x0278, B:132:0x028d, B:115:0x0229, B:117:0x022e, B:116:0x022c), top: B:201:0x0206 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02d6 A[Catch: all -> 0x020c, TryCatch #5 {all -> 0x020c, blocks: (B:105:0x0206, B:109:0x0210, B:111:0x021e, B:113:0x0224, B:118:0x0231, B:119:0x0243, B:121:0x0249, B:123:0x025e, B:124:0x0262, B:134:0x0292, B:136:0x029f, B:139:0x02a7, B:140:0x02aa, B:145:0x02b4, B:148:0x02bc, B:154:0x02cd, B:158:0x02d8, B:160:0x02f3, B:161:0x0315, B:163:0x031f, B:172:0x0343, B:187:0x039e, B:166:0x032b, B:167:0x032f, B:169:0x0335, B:157:0x02d6, B:153:0x02c8, B:127:0x0269, B:128:0x0272, B:130:0x0278, B:132:0x028d, B:115:0x0229, B:117:0x022e, B:116:0x022c), top: B:201:0x0206 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02f3 A[Catch: all -> 0x020c, TryCatch #5 {all -> 0x020c, blocks: (B:105:0x0206, B:109:0x0210, B:111:0x021e, B:113:0x0224, B:118:0x0231, B:119:0x0243, B:121:0x0249, B:123:0x025e, B:124:0x0262, B:134:0x0292, B:136:0x029f, B:139:0x02a7, B:140:0x02aa, B:145:0x02b4, B:148:0x02bc, B:154:0x02cd, B:158:0x02d8, B:160:0x02f3, B:161:0x0315, B:163:0x031f, B:172:0x0343, B:187:0x039e, B:166:0x032b, B:167:0x032f, B:169:0x0335, B:157:0x02d6, B:153:0x02c8, B:127:0x0269, B:128:0x0272, B:130:0x0278, B:132:0x028d, B:115:0x0229, B:117:0x022e, B:116:0x022c), top: B:201:0x0206 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x032b A[Catch: all -> 0x020c, TryCatch #5 {all -> 0x020c, blocks: (B:105:0x0206, B:109:0x0210, B:111:0x021e, B:113:0x0224, B:118:0x0231, B:119:0x0243, B:121:0x0249, B:123:0x025e, B:124:0x0262, B:134:0x0292, B:136:0x029f, B:139:0x02a7, B:140:0x02aa, B:145:0x02b4, B:148:0x02bc, B:154:0x02cd, B:158:0x02d8, B:160:0x02f3, B:161:0x0315, B:163:0x031f, B:172:0x0343, B:187:0x039e, B:166:0x032b, B:167:0x032f, B:169:0x0335, B:157:0x02d6, B:153:0x02c8, B:127:0x0269, B:128:0x0272, B:130:0x0278, B:132:0x028d, B:115:0x0229, B:117:0x022e, B:116:0x022c), top: B:201:0x0206 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0335 A[Catch: all -> 0x020c, TryCatch #5 {all -> 0x020c, blocks: (B:105:0x0206, B:109:0x0210, B:111:0x021e, B:113:0x0224, B:118:0x0231, B:119:0x0243, B:121:0x0249, B:123:0x025e, B:124:0x0262, B:134:0x0292, B:136:0x029f, B:139:0x02a7, B:140:0x02aa, B:145:0x02b4, B:148:0x02bc, B:154:0x02cd, B:158:0x02d8, B:160:0x02f3, B:161:0x0315, B:163:0x031f, B:172:0x0343, B:187:0x039e, B:166:0x032b, B:167:0x032f, B:169:0x0335, B:157:0x02d6, B:153:0x02c8, B:127:0x0269, B:128:0x0272, B:130:0x0278, B:132:0x028d, B:115:0x0229, B:117:0x022e, B:116:0x022c), top: B:201:0x0206 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0112 A[Catch: all -> 0x0067, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x0067, blocks: (B:22:0x0062, B:60:0x0112), top: B:199:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011e A[Catch: all -> 0x0125, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0125, blocks: (B:58:0x0100, B:64:0x011e, B:72:0x0132, B:74:0x0136, B:76:0x013a, B:91:0x01bb, B:98:0x01e2, B:100:0x01e6, B:175:0x0351, B:177:0x035b, B:179:0x0365, B:184:0x037e, B:185:0x0395, B:182:0x036f, B:79:0x0153, B:80:0x0166, B:82:0x016c, B:83:0x0181, B:85:0x0189, B:86:0x01a5, B:88:0x01ab, B:92:0x01c9, B:93:0x01ce), top: B:198:0x0100 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e2 A[Catch: all -> 0x0125, TryCatch #3 {all -> 0x0125, blocks: (B:58:0x0100, B:64:0x011e, B:72:0x0132, B:74:0x0136, B:76:0x013a, B:91:0x01bb, B:98:0x01e2, B:100:0x01e6, B:175:0x0351, B:177:0x035b, B:179:0x0365, B:184:0x037e, B:185:0x0395, B:182:0x036f, B:79:0x0153, B:80:0x0166, B:82:0x016c, B:83:0x0181, B:85:0x0189, B:86:0x01a5, B:88:0x01ab, B:92:0x01c9, B:93:0x01ce), top: B:198:0x0100 }] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v12, types: [hxb] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5, types: [hxb] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v2, types: [hxb, jxb] */
    /* JADX WARN: Type inference failed for: r1v42, types: [hxb] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.anthropic.claude.code.remote.c, iwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [hxb] */
    /* JADX WARN: Type inference failed for: r3v2, types: [tp4, vp4, wz3] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [hxb] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r8v13 */
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
    public final java.lang.Object W(boolean r24, boolean r25, defpackage.vp4 r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 941
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.code.remote.c.W(boolean, boolean, vp4):java.lang.Object");
    }

    public final List X() {
        return (List) this.w.getValue();
    }

    public final u9a Y() {
        return (u9a) this.J.getValue();
    }

    public final ogc Z() {
        return (ogc) this.V.getValue();
    }

    public final htf a0() {
        return (htf) this.L.getValue();
    }

    public final List b0() {
        return (List) this.D.getValue();
    }

    public final boolean c0(SessionResource sessionResource) {
        if (((Boolean) this.k.z.getValue()).booleanValue()) {
            String strM875getIdOcx55TE = sessionResource.m875getIdOcx55TE();
            SessionId sessionId = (SessionId) this.y.getValue();
            String strM1120unboximpl = sessionId != null ? sessionId.m1120unboximpl() : null;
            if (!(strM1120unboximpl == null ? false : SessionId.m1117equalsimpl0(strM875getIdOcx55TE, strM1120unboximpl)) && sessionResource.getUnread()) {
                String strM875getIdOcx55TE2 = sessionResource.m875getIdOcx55TE();
                otf otfVar = this.j;
                otfVar.getClass();
                strM875getIdOcx55TE2.getClass();
                if (((String) otfVar.b().get(strM875getIdOcx55TE2)) == null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d0(boolean r10) {
        /*
            r9 = this;
            htf r0 = r9.a0()
            gtf r7 = r0.a
            gtf r1 = r0.a
            boolean r2 = r0.b
            if (r7 != 0) goto Ld
            goto L4c
        Ld:
            u9a r3 = r9.Y()
            s9a r4 = defpackage.s9a.a
            boolean r3 = defpackage.x44.r(r3, r4)
            if (r3 != 0) goto L1a
            goto L4c
        L1a:
            r8 = 0
            if (r10 == 0) goto L3a
            if (r2 != 0) goto L38
            if (r1 == 0) goto L38
            boolean r10 = r0.c
            if (r10 != 0) goto L38
            int r10 = r0.d
            r1 = 10
            if (r10 >= r1) goto L38
            int r4 = r10 + 1
            r5 = 0
            r6 = 17
            r1 = 0
            r2 = 1
            r3 = 0
            htf r10 = defpackage.htf.a(r0, r1, r2, r3, r4, r5, r6)
            goto L4a
        L38:
            r10 = r8
            goto L4a
        L3a:
            if (r1 == 0) goto L38
            if (r2 == 0) goto L3f
            goto L38
        L3f:
            r5 = 0
            r6 = 17
            r1 = 0
            r2 = 1
            r3 = 0
            r4 = 0
            htf r10 = defpackage.htf.a(r0, r1, r2, r3, r4, r5, r6)
        L4a:
            if (r10 != 0) goto L4d
        L4c:
            return
        L4d:
            r9.g0(r10)
            tm r10 = new tm
            r0 = 21
            r10.<init>(r9, r7, r8, r0)
            r0 = 3
            mp4 r1 = r9.a
            fkg r10 = defpackage.gb9.D(r1, r8, r8, r10, r0)
            r9.M = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.code.remote.c.d0(boolean):void");
    }

    public final void e0(SessionResource sessionResource) {
        if (((Boolean) this.k.z.getValue()).booleanValue() && sessionResource.getUnread()) {
            this.j.c(sessionResource.m875getIdOcx55TE(), "");
            S(sessionResource.m875getIdOcx55TE());
            gb9.D(this.a, null, null, new pb2(this, sessionResource, null, 21), 3);
        }
    }

    public final void f0(AbstractList abstractList) {
        this.w.setValue(abstractList);
    }

    public final void g0(htf htfVar) {
        this.L.setValue(htfVar);
    }

    public final void h0(String str, boolean z) {
        if (this.q.getEmitsCodeTabTelemetry()) {
            Map map = str == null ? (Map) this.H.getValue() : null;
            this.m.e(new CodeEvents$SessionListLoaded(this.n.a().e().m116getUuidXjkXN6I(), str == null ? b0().size() : 0, z, str, map != null ? (Integer) map.get(srf.H) : null, map != null ? (Integer) map.get(srf.I) : null, map != null ? (Integer) map.get(srf.G) : null, map != null ? (Integer) map.get(srf.J) : null, map != null ? (Integer) map.get(srf.K) : null), CodeEvents$SessionListLoaded.Companion.serializer());
        }
    }
}
