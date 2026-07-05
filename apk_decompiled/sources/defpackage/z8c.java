package defpackage;

import com.anthropic.claude.api.account.Account;
import com.anthropic.claude.api.account.Membership;
import com.anthropic.claude.api.notification.Preferences;
import com.anthropic.claude.types.strings.OrganizationId;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z8c {
    public final b7c a;
    public final q7 b;
    public final koi c;
    public final LinkedHashMap d;

    public z8c(b7c b7cVar, q7 q7Var, koi koiVar) {
        this.a = b7cVar;
        this.b = q7Var;
        this.c = koiVar;
        gq6 gq6Var = g9c.N;
        int iD0 = tta.d0(x44.y(gq6Var, 10));
        int i = 16;
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0 < 16 ? 16 : iD0);
        for (Object obj : gq6Var) {
            linkedHashMap.put(obj, mpk.w(new vc8(this, i, (g9c) obj)));
        }
        this.d = linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.vp4 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.v8c
            if (r0 == 0) goto L13
            r0 = r5
            v8c r0 = (defpackage.v8c) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            v8c r0 = new v8c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.sf5.h0(r5)
            goto L40
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L2c:
            defpackage.sf5.h0(r5)
            koi r5 = r4.c
            java.lang.String r5 = r5.e
            r0.G = r3
            b7c r1 = r4.a
            java.lang.Object r5 = r1.a(r5, r2, r0)
            m45 r0 = defpackage.m45.E
            if (r5 != r0) goto L40
            return r0
        L40:
            com.anthropic.claude.api.result.ApiResult r5 = (com.anthropic.claude.api.result.ApiResult) r5
            boolean r0 = r5 instanceof defpackage.of0
            if (r0 == 0) goto L57
            r0 = r5
            of0 r0 = (defpackage.of0) r0
            java.lang.Object r0 = r0.b
            com.anthropic.claude.api.notification.NotificationPreferencesSchema r0 = (com.anthropic.claude.api.notification.NotificationPreferencesSchema) r0
            w8c r1 = new w8c
            r2 = 0
            r1.<init>(r0, r2)
            r4.b(r1)
            return r5
        L57:
            boolean r4 = r5 instanceof defpackage.nf0
            if (r4 == 0) goto L5c
            return r5
        L5c:
            defpackage.mr9.b()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z8c.a(vp4):java.lang.Object");
    }

    public final void b(bz7 bz7Var) {
        q7 q7Var = this.b;
        Account accountA = q7Var.a();
        List<Membership> memberships = q7Var.a().getMemberships();
        ArrayList arrayList = new ArrayList(x44.y(memberships, 10));
        for (Membership membershipCopy$default : memberships) {
            if (OrganizationId.m1068equalsimpl0(membershipCopy$default.getOrganization().m116getUuidXjkXN6I(), this.c.e)) {
                membershipCopy$default = Membership.copy$default(membershipCopy$default, null, null, null, null, (Preferences) bz7Var.invoke(membershipCopy$default.getNotification_preferences()), 15, null);
            }
            arrayList.add(membershipCopy$default);
        }
        q7Var.c(Account.m101copyl0kCUe4$default(accountA, null, null, null, null, null, null, arrayList, null, false, 447, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.g9c r8, boolean r9, defpackage.vp4 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.x8c
            if (r0 == 0) goto L13
            r0 = r10
            x8c r0 = (defpackage.x8c) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            x8c r0 = new x8c
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.G
            int r1 = r0.I
            r2 = 8
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L34
            if (r1 != r4) goto L2e
            boolean r8 = r0.F
            g9c r9 = r0.E
            defpackage.sf5.h0(r10)
            r1 = r8
            r8 = r9
            goto L73
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r3
        L34:
            defpackage.sf5.h0(r10)
            koi r10 = r7.c
            com.anthropic.claude.api.account.Membership r1 = r10.d()
            com.anthropic.claude.api.notification.Preferences r1 = r1.getNotification_preferences()
            boolean r1 = defpackage.puk.h(r1, r8)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r9)
            b4b r6 = new b4b
            r6.<init>(r8, r2, r5)
            r7.b(r6)
            com.anthropic.claude.api.account.Membership r10 = r10.d()
            com.anthropic.claude.api.notification.Preferences r10 = r10.getNotification_preferences()
            if (r10 != 0) goto L60
            com.anthropic.claude.api.notification.Preferences r10 = new com.anthropic.claude.api.notification.Preferences
            r10.<init>(r3, r4, r3)
        L60:
            com.anthropic.claude.api.notification.Preferences r9 = defpackage.puk.j(r10, r8, r9)
            r0.E = r8
            r0.F = r1
            r0.I = r4
            java.lang.Object r10 = r7.d(r9, r0)
            m45 r9 = defpackage.m45.E
            if (r10 != r9) goto L73
            return r9
        L73:
            com.anthropic.claude.api.result.ApiResult r10 = (com.anthropic.claude.api.result.ApiResult) r10
            boolean r9 = r10 instanceof defpackage.of0
            if (r9 != 0) goto L91
            boolean r9 = r10 instanceof defpackage.nf0
            if (r9 == 0) goto L8d
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r1)
            r8.getClass()
            b4b r0 = new b4b
            r0.<init>(r8, r2, r9)
            r7.b(r0)
            return r10
        L8d:
            defpackage.mr9.b()
            return r3
        L91:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z8c.c(g9c, boolean, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.anthropic.claude.api.notification.Preferences r5, defpackage.vp4 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.y8c
            if (r0 == 0) goto L13
            r0 = r6
            y8c r0 = (defpackage.y8c) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            y8c r0 = new y8c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.sf5.h0(r6)
            goto L45
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L2c:
            defpackage.sf5.h0(r6)
            koi r6 = r4.c
            java.lang.String r6 = r6.e
            com.anthropic.claude.api.notification.NotificationPreferencesUpdateParams r1 = new com.anthropic.claude.api.notification.NotificationPreferencesUpdateParams
            r1.<init>(r5)
            r0.G = r3
            b7c r5 = r4.a
            java.lang.Object r6 = r5.b(r6, r1, r2, r0)
            m45 r5 = defpackage.m45.E
            if (r6 != r5) goto L45
            return r5
        L45:
            com.anthropic.claude.api.result.ApiResult r6 = (com.anthropic.claude.api.result.ApiResult) r6
            boolean r5 = r6 instanceof defpackage.of0
            if (r5 == 0) goto L5b
            r5 = r6
            of0 r5 = (defpackage.of0) r5
            java.lang.Object r5 = r5.b
            com.anthropic.claude.api.notification.NotificationPreferencesSchema r5 = (com.anthropic.claude.api.notification.NotificationPreferencesSchema) r5
            w8c r0 = new w8c
            r0.<init>(r5, r3)
            r4.b(r0)
            return r6
        L5b:
            boolean r4 = r6 instanceof defpackage.nf0
            if (r4 == 0) goto L60
            return r6
        L60:
            defpackage.mr9.b()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z8c.d(com.anthropic.claude.api.notification.Preferences, vp4):java.lang.Object");
    }
}
