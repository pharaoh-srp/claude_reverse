package defpackage;

import com.anthropic.claude.api.share.ChatSnapshotSummaryWithChatId;

/* JADX INFO: loaded from: classes2.dex */
public final class s2g extends rq5 {
    public final ya3 e;
    public final koi f;
    public final qi3 g;
    public final h86 h;
    public final lsc i;
    public final lsc j;
    public final wz5 k;
    public final kdg l;
    public final lsc m;

    public s2g(ya3 ya3Var, koi koiVar, qi3 qi3Var, h86 h86Var) {
        super(h86Var);
        this.e = ya3Var;
        this.f = koiVar;
        this.g = qi3Var;
        this.h = h86Var;
        this.i = mpk.P(Boolean.FALSE);
        this.j = mpk.P(null);
        this.k = mpk.w(new q2g(this, 0));
        this.l = new kdg();
        this.m = mpk.P(null);
        gb9.D(this.a, h86Var.b(), null, new bff(this, null, 4), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.rq5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O(defpackage.tp4 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.r2g
            if (r0 == 0) goto L13
            r0 = r9
            r2g r0 = (defpackage.r2g) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L1a
        L13:
            r2g r0 = new r2g
            vp4 r9 = (defpackage.vp4) r9
            r0.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r0.F
            int r1 = r0.H
            r2 = 0
            r3 = 1
            koi r4 = r8.f
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2c
            com.anthropic.claude.api.share.ChatSnapshotSummaryWithChatId r0 = r0.E
            defpackage.sf5.h0(r9)
            goto L6a
        L2c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r8)
            return r2
        L32:
            defpackage.sf5.h0(r9)
            com.anthropic.claude.api.share.ChatSnapshotSummaryWithChatId r9 = r8.P()
            if (r9 != 0) goto L52
            com.anthropic.claude.core.telemetry.SilentException r8 = new com.anthropic.claude.core.telemetry.SilentException
            java.lang.String r9 = "No snapshot to delete"
            r8.<init>(r9)
            r0 = 0
            r1 = 3
            com.anthropic.claude.core.telemetry.SilentException.a(r8, r2, r0, r1)
            mf0 r8 = new mf0
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r9)
            r8.<init>(r0)
            return r8
        L52:
            java.lang.String r1 = r4.e
            java.lang.String r5 = r9.m434getUuidN1vkeFQ()
            r0.E = r9
            r0.H = r3
            ya3 r3 = r8.e
            java.lang.Object r0 = r3.f(r1, r5, r0)
            m45 r1 = defpackage.m45.E
            if (r0 != r1) goto L67
            return r1
        L67:
            r7 = r0
            r0 = r9
            r9 = r7
        L6a:
            com.anthropic.claude.api.result.ApiResult r9 = (com.anthropic.claude.api.result.ApiResult) r9
            boolean r1 = r9 instanceof defpackage.of0
            qi3 r8 = r8.g
            if (r1 == 0) goto L90
            r3 = r9
            of0 r3 = (defpackage.of0) r3
            java.lang.Object r3 = r3.b
            iei r3 = (defpackage.iei) r3
            com.anthropic.claude.analytics.events.ChatSharingEvents$SharedLinkUnshared r3 = new com.anthropic.claude.analytics.events.ChatSharingEvents$SharedLinkUnshared
            java.lang.String r5 = r4.e
            java.lang.String r6 = r0.m434getUuidN1vkeFQ()
            r3.<init>(r5, r6)
            ub3 r5 = com.anthropic.claude.analytics.events.ChatSharingEvents$SharedLinkUnshared.Companion
            kotlinx.serialization.KSerializer r5 = r5.serializer()
            znf r5 = (defpackage.znf) r5
            r8.e(r3, r5)
            goto L94
        L90:
            boolean r3 = r9 instanceof defpackage.nf0
            if (r3 == 0) goto Lbd
        L94:
            if (r1 != 0) goto Lbc
            boolean r1 = r9 instanceof defpackage.nf0
            if (r1 == 0) goto Lb8
            r1 = r9
            nf0 r1 = (defpackage.nf0) r1
            com.anthropic.claude.analytics.events.ChatSharingEvents$SharedLinkUnshareFailed r2 = new com.anthropic.claude.analytics.events.ChatSharingEvents$SharedLinkUnshareFailed
            java.lang.String r3 = r4.e
            java.lang.String r0 = r0.m434getUuidN1vkeFQ()
            java.lang.String r1 = r1.toString()
            r2.<init>(r3, r0, r1)
            sb3 r0 = com.anthropic.claude.analytics.events.ChatSharingEvents$SharedLinkUnshareFailed.Companion
            kotlinx.serialization.KSerializer r0 = r0.serializer()
            znf r0 = (defpackage.znf) r0
            r8.e(r2, r0)
            return r9
        Lb8:
            defpackage.wg6.i()
            return r2
        Lbc:
            return r9
        Lbd:
            defpackage.wg6.i()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s2g.O(tp4):java.lang.Object");
    }

    public final ChatSnapshotSummaryWithChatId P() {
        return (ChatSnapshotSummaryWithChatId) this.m.getValue();
    }
}
