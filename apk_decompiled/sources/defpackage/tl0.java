package defpackage;

import com.anthropic.claude.api.account.Account;
import com.anthropic.claude.api.account.AppStartResponse;
import com.anthropic.claude.api.account.Membership;
import com.anthropic.claude.api.account.Organization;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.types.strings.OrganizationId;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tl0 {
    public final ok0 a;
    public final q7 b;
    public final vob c;
    public final qi3 d;
    public final yjc e;
    public final sc8 f;
    public final of7 g;
    public final vl0 h;
    public final h86 i;

    public tl0(ok0 ok0Var, q7 q7Var, vob vobVar, qi3 qi3Var, yjc yjcVar, sc8 sc8Var, of7 of7Var, vl0 vl0Var, h86 h86Var) {
        this.a = ok0Var;
        this.b = q7Var;
        this.c = vobVar;
        this.d = qi3Var;
        this.e = yjcVar;
        this.f = sc8Var;
        this.g = of7Var;
        this.h = vl0Var;
        this.i = h86Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.tl0 r5, defpackage.vp4 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.ll0
            if (r0 == 0) goto L13
            r0 = r6
            ll0 r0 = (defpackage.ll0) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            ll0 r0 = new ll0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 != r4) goto L27
            defpackage.sf5.h0(r6)
            goto L47
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return r3
        L2d:
            defpackage.sf5.h0(r6)
            h86 r5 = r5.i
            e45 r5 = r5.b()
            ml0 r6 = new ml0
            r1 = 2
            r6.<init>(r1, r3, r2)
            r0.G = r4
            java.lang.Object r6 = defpackage.gb9.c0(r5, r6, r0)
            m45 r5 = defpackage.m45.E
            if (r6 != r5) goto L47
            return r5
        L47:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r5 = defpackage.x44.r(r6, r5)
            if (r5 == 0) goto L52
            goto L64
        L52:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r5 = defpackage.x44.r(r6, r5)
            if (r5 == 0) goto L5c
            r2 = r4
            goto L64
        L5c:
            if (r6 != 0) goto L69
            java.lang.String r5 = "Sentry returned null for isCrashedLastRun"
            r6 = 3
            defpackage.ij0.y(r5, r3, r2, r6)
        L64:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        L69:
            defpackage.mr9.b()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl0.a(tl0, vp4):java.lang.Object");
    }

    public static pvg d(String str, AppStartResponse appStartResponse) {
        Object next;
        Account account = appStartResponse.getAccount();
        umg umgVar = qoi.a;
        account.getClass();
        str.getClass();
        Iterator<T> it = account.getMemberships().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (OrganizationId.m1068equalsimpl0(((Membership) next).getOrganization().m116getUuidXjkXN6I(), str)) {
                break;
            }
        }
        Membership membership = (Membership) next;
        Organization organization = membership != null ? membership.getOrganization() : null;
        if (organization == null) {
            SilentException.a(new SilentException(ij0.j("Organization ", OrganizationId.m1070toStringimpl(str), " not found in account during app start handling")), null, false, 3);
        }
        if (organization != null) {
            return eve.C(organization);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, defpackage.vp4 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.nl0
            if (r0 == 0) goto L13
            r0 = r6
            nl0 r0 = (defpackage.nl0) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            nl0 r0 = new nl0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.F
            int r1 = r0.H
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            java.lang.String r5 = r0.E
            defpackage.sf5.h0(r6)
            goto L40
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L2e:
            defpackage.sf5.h0(r6)
            r0.E = r5
            r0.H = r3
            ok0 r6 = r4.a
            java.lang.Object r6 = r6.a(r5, r0)
            m45 r0 = defpackage.m45.E
            if (r6 != r0) goto L40
            return r0
        L40:
            com.anthropic.claude.api.result.ApiResult r6 = (com.anthropic.claude.api.result.ApiResult) r6
            boolean r0 = r6 instanceof defpackage.of0
            if (r0 == 0) goto L70
            r0 = r6
            of0 r0 = (defpackage.of0) r0
            java.lang.Object r0 = r0.b
            com.anthropic.claude.api.account.AppStartResponse r0 = (com.anthropic.claude.api.account.AppStartResponse) r0
            r5.getClass()
            yjc r4 = r4.e
            java.util.LinkedHashMap r0 = r4.b
            com.anthropic.claude.types.strings.OrganizationId r5 = com.anthropic.claude.types.strings.OrganizationId.m1065boximpl(r5)
            java.lang.Object r1 = r0.get(r5)
            if (r1 != 0) goto L6a
            ul0 r4 = r4.a
            java.lang.Object r4 = r4.a()
            r1 = r4
            vn5 r1 = (defpackage.vn5) r1
            r0.put(r5, r1)
        L6a:
            vn5 r1 = (defpackage.vn5) r1
            r1.b()
            return r6
        L70:
            boolean r4 = r6 instanceof defpackage.nf0
            if (r4 == 0) goto L75
            return r6
        L75:
            defpackage.mr9.b()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl0.b(java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r10, defpackage.vp4 r11) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl0.c(java.lang.String, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r17, com.anthropic.claude.api.account.AppStartResponse r18, defpackage.vp4 r19) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl0.e(java.lang.String, com.anthropic.claude.api.account.AppStartResponse, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r5, com.anthropic.claude.api.account.AppStartResponse r6, defpackage.vp4 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.ql0
            if (r0 == 0) goto L13
            r0 = r7
            ql0 r0 = (defpackage.ql0) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            ql0 r0 = new ql0
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.G
            int r1 = r0.I
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            com.anthropic.claude.api.account.AppStartResponse r6 = r0.F
            java.lang.String r5 = r0.E
            defpackage.sf5.h0(r7)
            goto L42
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L30:
            defpackage.sf5.h0(r7)
            r0.E = r5
            r0.F = r6
            r0.I = r3
            java.lang.Object r7 = r4.e(r5, r6, r0)
            m45 r0 = defpackage.m45.E
            if (r7 != r0) goto L42
            return r0
        L42:
            pvg r7 = d(r5, r6)
            com.anthropic.claude.api.account.Account r0 = r6.getAccount()
            java.lang.String r0 = r0.m106getUuidislZJdo()
            com.anthropic.claude.api.account.Account r6 = r6.getAccount()
            java.lang.String r6 = r6.m105getEmail_addressZiuLfiY()
            qi3 r4 = r4.d
            r4.d(r0, r5, r6, r7)
            if (r7 != 0) goto L73
            com.anthropic.claude.core.telemetry.SilentException r4 = new com.anthropic.claude.core.telemetry.SilentException
            java.lang.String r5 = com.anthropic.claude.types.strings.OrganizationId.m1070toStringimpl(r5)
            java.lang.String r6 = "Organization "
            java.lang.String r7 = " not found in account during app start init"
            java.lang.String r5 = defpackage.ij0.j(r6, r5, r7)
            r4.<init>(r5)
            r5 = 0
            r6 = 3
            com.anthropic.claude.core.telemetry.SilentException.a(r4, r2, r5, r6)
        L73:
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl0.f(java.lang.String, com.anthropic.claude.api.account.AppStartResponse, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r7, com.anthropic.claude.api.account.AppStartResponse r8, defpackage.vp4 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.rl0
            if (r0 == 0) goto L13
            r0 = r9
            rl0 r0 = (defpackage.rl0) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            rl0 r0 = new rl0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.G
            int r1 = r0.I
            r2 = 2
            r3 = 1
            r4 = 0
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.sf5.h0(r9)
            return r9
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r4
        L31:
            com.anthropic.claude.api.account.AppStartResponse r8 = r0.F
            java.lang.String r7 = r0.E
            defpackage.sf5.h0(r9)
            goto L49
        L39:
            defpackage.sf5.h0(r9)
            r0.E = r7
            r0.F = r8
            r0.I = r3
            java.lang.Object r9 = r6.e(r7, r8, r0)
            if (r9 != r5) goto L49
            goto L5d
        L49:
            pvg r8 = d(r7, r8)
            if (r8 == 0) goto L5f
            r0.E = r4
            r0.F = r4
            r0.I = r2
            qi3 r6 = r6.d
            java.lang.Object r6 = r6.b(r7, r8, r0)
            if (r6 != r5) goto L5e
        L5d:
            return r5
        L5e:
            return r6
        L5f:
            com.anthropic.claude.core.telemetry.SilentException r6 = new com.anthropic.claude.core.telemetry.SilentException
            java.lang.String r7 = com.anthropic.claude.types.strings.OrganizationId.m1070toStringimpl(r7)
            java.lang.String r8 = "Organization "
            java.lang.String r9 = " not found in account during app start refresh"
            java.lang.String r7 = defpackage.ij0.j(r8, r7, r9)
            r6.<init>(r7)
            r7 = 0
            r8 = 3
            com.anthropic.claude.core.telemetry.SilentException.a(r6, r4, r7, r8)
            iei r6 = defpackage.iei.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl0.g(java.lang.String, com.anthropic.claude.api.account.AppStartResponse, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r8, defpackage.vp4 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.sl0
            if (r0 == 0) goto L13
            r0 = r9
            sl0 r0 = (defpackage.sl0) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            sl0 r0 = new sl0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.F
            int r1 = r0.H
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            java.lang.String r8 = r0.E
            defpackage.sf5.h0(r9)
            goto L61
        L28:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r2
        L2e:
            defpackage.sf5.h0(r9)
            long r4 = defpackage.pk0.a
            mk0 r9 = new mk0
            r9.<init>(r7, r8, r2, r3)
            r0.E = r8
            r0.H = r3
            yjc r1 = r7.e
            java.util.LinkedHashMap r2 = r1.b
            com.anthropic.claude.types.strings.OrganizationId r3 = com.anthropic.claude.types.strings.OrganizationId.m1065boximpl(r8)
            java.lang.Object r6 = r2.get(r3)
            if (r6 != 0) goto L56
            ul0 r1 = r1.a
            java.lang.Object r1 = r1.a()
            r6 = r1
            vn5 r6 = (defpackage.vn5) r6
            r2.put(r3, r6)
        L56:
            vn5 r6 = (defpackage.vn5) r6
            java.lang.Object r9 = r6.a(r4, r9, r0)
            m45 r0 = defpackage.m45.E
            if (r9 != r0) goto L61
            return r0
        L61:
            com.anthropic.claude.api.result.ApiResult r9 = (com.anthropic.claude.api.result.ApiResult) r9
            if (r9 != 0) goto L77
            com.anthropic.claude.analytics.events.AppStartEvents$MaybeRefreshSkipped r0 = new com.anthropic.claude.analytics.events.AppStartEvents$MaybeRefreshSkipped
            r0.<init>(r8)
            kl0 r8 = com.anthropic.claude.analytics.events.AppStartEvents$MaybeRefreshSkipped.Companion
            kotlinx.serialization.KSerializer r8 = r8.serializer()
            znf r8 = (defpackage.znf) r8
            qi3 r7 = r7.d
            r7.e(r0, r8)
        L77:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl0.h(java.lang.String, vp4):java.lang.Object");
    }

    public final Object i(String str, vp4 vp4Var) {
        List list = xah.a;
        xah.e(6, "Refreshing app start data for org: " + OrganizationId.m1070toStringimpl(str), null, null);
        return b(str, vp4Var);
    }
}
