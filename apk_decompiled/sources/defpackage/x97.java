package defpackage;

import android.content.SharedPreferences;
import com.anthropic.claude.api.experience.Experience;
import com.anthropic.claude.api.experience.ExperiencePlacement;
import com.anthropic.claude.api.experience.ExperienceRules;
import com.anthropic.claude.api.experience.ExperienceTrackActionType;
import com.anthropic.claude.api.experience.TrackActionedData;
import com.anthropic.claude.api.experience.TrackDismissedData;
import com.anthropic.claude.api.experience.TrackShownData;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class x97 {
    public final o7 a;
    public final q7 b;
    public final i8 c;
    public final mn5 d;
    public final p87 e;
    public final koi f;
    public final SharedPreferences g;
    public final el5 h = new el5(10);
    public final wlg i;
    public final q97 j;
    public final q97 k;
    public final q97 l;
    public final q97 m;
    public final LinkedHashMap n;
    public ExperienceRules o;
    public boolean p;
    public Set q;
    public Map r;
    public final lsc s;

    public x97(o7 o7Var, q7 q7Var, i8 i8Var, mn5 mn5Var, p87 p87Var, koi koiVar, rc8 rc8Var, SharedPreferences sharedPreferences) {
        this.a = o7Var;
        this.b = q7Var;
        this.c = i8Var;
        this.d = mn5Var;
        this.e = p87Var;
        this.f = koiVar;
        this.g = sharedPreferences;
        this.i = rc8Var.m("mobile_use_experiences_framework");
        q97 q97Var = new q97(ExperiencePlacement.ANDROID_SPOTLIGHT, new xg5(17), 8);
        this.j = q97Var;
        q97 q97Var2 = new q97(ExperiencePlacement.ANDROID_CHAT_TOOLTIP, new xg5(18), 12);
        this.k = q97Var2;
        q97 q97Var3 = new q97(ExperiencePlacement.ANDROID_CODE_SESSION_LIST_BANNER, new xg5(19), 12);
        this.l = q97Var3;
        q97 q97Var4 = new q97(ExperiencePlacement.ANDROID_CHAT_INPUT_BANNER, new xg5(20), 12);
        this.m = q97Var4;
        cpc[] cpcVarArr = {new cpc("android-spotlight", q97Var), new cpc("android-chat-tooltip", q97Var2), new cpc("android-code-session-list-banner", q97Var3), new cpc("android-chat-input-banner", q97Var4)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(tta.d0(4));
        sta.n0(linkedHashMap, cpcVarArr);
        this.n = linkedHashMap;
        this.q = um6.E;
        this.r = nm6.E;
        this.s = sq6.l(sharedPreferences, "debug_bypass_rules", false);
    }

    public static Object j(x97 x97Var, String str, xzg xzgVar) {
        ((Set) x97Var.h.E).add(str);
        return x97Var.i(str, ExperienceTrackActionType.SHOWN, new TrackShownData(true), xzgVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x97.a(java.lang.String, boolean):boolean");
    }

    public final Experience b(q97 q97Var) {
        Experience experience = (Experience) q97Var.d.getValue();
        if (experience == null) {
            return null;
        }
        boolean z = q97Var.c;
        el5 el5Var = this.h;
        if ((z && ((Set) el5Var.E).contains(experience.getId())) || ((Set) el5Var.F).contains(experience.getId()) || ((Set) el5Var.G).contains(experience.getId())) {
            return null;
        }
        return experience;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.vp4 r15) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x97.c(vp4):java.lang.Object");
    }

    public final boolean d() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    public final Object e(q97 q97Var, String str, String str2, List list, boolean z, xzg xzgVar) {
        q97Var.getClass();
        q97Var.d.setValue(null);
        long jA = this.d.a();
        el5 el5Var = this.h;
        ((Set) el5Var.G).add(str2);
        ((Map) el5Var.H).put(str, new Long(jA));
        if (!this.q.contains(str2)) {
            el5Var.I = new Long(jA);
        }
        return i(str2, ExperienceTrackActionType.ACTIONED, new TrackActionedData(list, z), xzgVar);
    }

    public final Object f(q97 q97Var, String str, String str2, xzg xzgVar) {
        q97Var.d.setValue(null);
        long jA = this.d.a();
        el5 el5Var = this.h;
        ((Set) el5Var.F).add(str2);
        ((Map) el5Var.H).put(str, new Long(jA));
        if (!this.q.contains(str2)) {
            el5Var.I = new Long(jA);
        }
        return i(str2, ExperienceTrackActionType.DISMISSED, new TrackDismissedData(null), xzgVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.vp4 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.t97
            if (r0 == 0) goto L13
            r0 = r5
            t97 r0 = (defpackage.t97) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            t97 r0 = new t97
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.sf5.h0(r5)
            goto L3c
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L2c:
            defpackage.sf5.h0(r5)
            r0.G = r3
            o7 r5 = r4.a
            java.lang.Object r5 = r5.a(r0)
            m45 r0 = defpackage.m45.E
            if (r5 != r0) goto L3c
            return r0
        L3c:
            com.anthropic.claude.api.result.ApiResult r5 = (com.anthropic.claude.api.result.ApiResult) r5
            boolean r0 = r5 instanceof defpackage.of0
            if (r0 == 0) goto L4e
            of0 r5 = (defpackage.of0) r5
            java.lang.Object r5 = r5.b
            com.anthropic.claude.api.account.Account r5 = (com.anthropic.claude.api.account.Account) r5
            q7 r4 = r4.b
            r4.c(r5)
            goto L6d
        L4e:
            boolean r4 = r5 instanceof defpackage.lf0
            r3 = 0
            if (r4 == 0) goto L69
            com.anthropic.claude.core.telemetry.SilentException r4 = new com.anthropic.claude.core.telemetry.SilentException
            lf0 r5 = (defpackage.lf0) r5
            int r5 = r5.a()
            java.lang.String r0 = "Experience: Failed to refresh account: "
            java.lang.String r5 = defpackage.grc.p(r5, r0)
            r4.<init>(r5)
            r5 = 3
            com.anthropic.claude.core.telemetry.SilentException.a(r4, r2, r3, r5)
            goto L6d
        L69:
            boolean r4 = r5 instanceof defpackage.mf0
            if (r4 == 0) goto L72
        L6d:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        L72:
            defpackage.mr9.b()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x97.g(vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.vp4 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.u97
            if (r0 == 0) goto L13
            r0 = r5
            u97 r0 = (defpackage.u97) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            u97 r0 = new u97
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.sf5.h0(r5)
            goto L3c
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L2c:
            defpackage.sf5.h0(r5)
            r0.G = r3
            i8 r5 = r4.c
            java.lang.Object r5 = r5.a(r0)
            m45 r0 = defpackage.m45.E
            if (r5 != r0) goto L3c
            return r0
        L3c:
            com.anthropic.claude.api.result.ApiResult r5 = (com.anthropic.claude.api.result.ApiResult) r5
            boolean r0 = r5 instanceof defpackage.of0
            if (r0 == 0) goto L53
            of0 r5 = (defpackage.of0) r5
            java.lang.Object r5 = r5.b
            com.anthropic.claude.api.account.AccountProfile r5 = (com.anthropic.claude.api.account.AccountProfile) r5
            r5.getClass()
            q7 r4 = r4.b
            lsc r4 = r4.b
            r4.setValue(r5)
            goto L72
        L53:
            boolean r4 = r5 instanceof defpackage.lf0
            r3 = 0
            if (r4 == 0) goto L6e
            com.anthropic.claude.core.telemetry.SilentException r4 = new com.anthropic.claude.core.telemetry.SilentException
            lf0 r5 = (defpackage.lf0) r5
            int r5 = r5.a()
            java.lang.String r0 = "Experience: Failed to refresh account profile: "
            java.lang.String r5 = defpackage.grc.p(r5, r0)
            r4.<init>(r5)
            r5 = 3
            com.anthropic.claude.core.telemetry.SilentException.a(r4, r2, r3, r5)
            goto L72
        L6e:
            boolean r4 = r5 instanceof defpackage.mf0
            if (r4 == 0) goto L77
        L72:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        L77:
            defpackage.mr9.b()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x97.h(vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r7, com.anthropic.claude.api.experience.ExperienceTrackActionType r8, com.anthropic.claude.api.experience.ExperienceTrackActionData r9, defpackage.vp4 r10) throws java.lang.Exception {
        /*
            r6 = this;
            java.lang.String r0 = "Experience: Failed to track experience: "
            boolean r1 = r10 instanceof defpackage.v97
            if (r1 == 0) goto L15
            r1 = r10
            v97 r1 = (defpackage.v97) r1
            int r2 = r1.G
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.G = r2
            goto L1a
        L15:
            v97 r1 = new v97
            r1.<init>(r6, r10)
        L1a:
            java.lang.Object r10 = r1.E
            int r2 = r1.G
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L31
            if (r2 != r4) goto L2b
            defpackage.sf5.h0(r10)     // Catch: java.lang.Exception -> L29
            goto L4a
        L29:
            r6 = move-exception
            goto L78
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r5
        L31:
            defpackage.sf5.h0(r10)
            p87 r10 = r6.e     // Catch: java.lang.Exception -> L29
            koi r6 = r6.f     // Catch: java.lang.Exception -> L29
            java.lang.String r6 = r6.e     // Catch: java.lang.Exception -> L29
            com.anthropic.claude.api.experience.ExperienceTrackRequest r2 = new com.anthropic.claude.api.experience.ExperienceTrackRequest     // Catch: java.lang.Exception -> L29
            r2.<init>(r7, r8, r9)     // Catch: java.lang.Exception -> L29
            r1.G = r4     // Catch: java.lang.Exception -> L29
            java.lang.Object r10 = r10.c(r6, r2, r1)     // Catch: java.lang.Exception -> L29
            m45 r6 = defpackage.m45.E
            if (r10 != r6) goto L4a
            return r6
        L4a:
            com.anthropic.claude.api.result.ApiResult r10 = (com.anthropic.claude.api.result.ApiResult) r10     // Catch: java.lang.Exception -> L29
            boolean r6 = r10 instanceof defpackage.of0     // Catch: java.lang.Exception -> L29
            if (r6 != 0) goto L87
            boolean r6 = r10 instanceof defpackage.nf0     // Catch: java.lang.Exception -> L29
            if (r6 == 0) goto L72
            nf0 r10 = (defpackage.nf0) r10     // Catch: java.lang.Exception -> L29
            com.anthropic.claude.core.telemetry.SilentException r6 = new com.anthropic.claude.core.telemetry.SilentException     // Catch: java.lang.Exception -> L29
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L29
            r7.<init>(r0)     // Catch: java.lang.Exception -> L29
            r7.append(r10)     // Catch: java.lang.Exception -> L29
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L29
            java.lang.Throwable r8 = defpackage.hsk.h(r10)     // Catch: java.lang.Exception -> L29
            r6.<init>(r7, r8)     // Catch: java.lang.Exception -> L29
            ozf r7 = defpackage.ozf.F     // Catch: java.lang.Exception -> L29
            r8 = 2
            com.anthropic.claude.core.telemetry.SilentException.a(r6, r7, r3, r8)     // Catch: java.lang.Exception -> L29
            goto L87
        L72:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Exception -> L29
            r6.<init>()     // Catch: java.lang.Exception -> L29
            throw r6     // Catch: java.lang.Exception -> L29
        L78:
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException
            if (r7 != 0) goto L8a
            com.anthropic.claude.core.telemetry.SilentException r7 = new com.anthropic.claude.core.telemetry.SilentException
            java.lang.String r8 = "Experience: Exception tracking experience"
            r7.<init>(r8, r6)
            r6 = 3
            com.anthropic.claude.core.telemetry.SilentException.a(r7, r5, r3, r6)
        L87:
            iei r6 = defpackage.iei.a
            return r6
        L8a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x97.i(java.lang.String, com.anthropic.claude.api.experience.ExperienceTrackActionType, com.anthropic.claude.api.experience.ExperienceTrackActionData, vp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b7, code lost:
    
        if (r15 == r7) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b7 -> B:31:0x00ba). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r11, java.lang.String r12, kotlinx.serialization.json.JsonObject r13, defpackage.k87 r14, defpackage.vp4 r15) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x97.k(java.lang.String, java.lang.String, kotlinx.serialization.json.JsonObject, k87, vp4):java.lang.Object");
    }
}
