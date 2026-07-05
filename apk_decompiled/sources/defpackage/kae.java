package defpackage;

import com.anthropic.claude.api.referral.ReferralEligibility;
import com.anthropic.claude.types.strings.OrganizationId;

/* JADX INFO: loaded from: classes.dex */
public final class kae {
    public final gae a;
    public final mdg b = new mdg();
    public final mdg c = new mdg();

    public kae(gae gaeVar) {
        this.a = gaeVar;
    }

    public final ReferralEligibility a(String str) {
        str.getClass();
        return (ReferralEligibility) this.b.get(OrganizationId.m1065boximpl(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, defpackage.vp4 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.jae
            if (r0 == 0) goto L13
            r0 = r7
            jae r0 = (defpackage.jae) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            jae r0 = new jae
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.F
            int r1 = r0.H
            r2 = 0
            mdg r3 = r5.c
            r4 = 1
            if (r1 == 0) goto L30
            if (r1 != r4) goto L2a
            java.lang.String r6 = r0.E
            defpackage.sf5.h0(r7)
            goto L49
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return r2
        L30:
            defpackage.sf5.h0(r7)
            com.anthropic.claude.types.strings.OrganizationId r7 = com.anthropic.claude.types.strings.OrganizationId.m1065boximpl(r6)
            r3.remove(r7)
            r0.E = r6
            r0.H = r4
            gae r7 = r5.a
            java.lang.Object r7 = r7.a(r6, r0)
            m45 r0 = defpackage.m45.E
            if (r7 != r0) goto L49
            return r0
        L49:
            com.anthropic.claude.api.result.ApiResult r7 = (com.anthropic.claude.api.result.ApiResult) r7
            boolean r0 = r7 instanceof defpackage.of0
            if (r0 == 0) goto L60
            r1 = r7
            of0 r1 = (defpackage.of0) r1
            java.lang.Object r1 = r1.b
            com.anthropic.claude.api.referral.ReferralEligibility r1 = (com.anthropic.claude.api.referral.ReferralEligibility) r1
            mdg r5 = r5.b
            com.anthropic.claude.types.strings.OrganizationId r4 = com.anthropic.claude.types.strings.OrganizationId.m1065boximpl(r6)
            r5.put(r4, r1)
            goto L64
        L60:
            boolean r5 = r7 instanceof defpackage.nf0
            if (r5 == 0) goto L79
        L64:
            iei r5 = defpackage.iei.a
            if (r0 != 0) goto L78
            boolean r7 = r7 instanceof defpackage.nf0
            if (r7 == 0) goto L74
            com.anthropic.claude.types.strings.OrganizationId r6 = com.anthropic.claude.types.strings.OrganizationId.m1065boximpl(r6)
            r3.put(r6, r5)
            return r5
        L74:
            defpackage.mr9.b()
            return r2
        L78:
            return r5
        L79:
            defpackage.mr9.b()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kae.b(java.lang.String, vp4):java.lang.Object");
    }
}
