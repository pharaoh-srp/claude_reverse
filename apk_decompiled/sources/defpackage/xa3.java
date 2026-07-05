package defpackage;

import com.anthropic.claude.api.chat.ChatConversationSettings;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;

/* JADX INFO: loaded from: classes.dex */
public final class xa3 {
    public final dl2 a;
    public final vd3 b;
    public final koi c;

    public xa3(dl2 dl2Var, vd3 vd3Var, koi koiVar) {
        this.a = dl2Var;
        this.b = vd3Var;
        this.c = koiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, defpackage.bz7 r6, defpackage.pz7 r7, defpackage.tp4 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.ua3
            if (r0 == 0) goto L13
            r0 = r8
            ua3 r0 = (defpackage.ua3) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            ua3 r0 = new ua3
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.E
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.sf5.h0(r8)
            goto L42
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.sf5.h0(r8)
            lj2 r8 = new lj2
            r1 = 4
            r8.<init>(r7, r1, r6)
            r0.G = r2
            vd3 r4 = r4.b
            java.lang.Object r4 = r4.s(r5, r8, r0)
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L42
            return r5
        L42:
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xa3.a(java.lang.String, bz7, pz7, tp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r20, defpackage.bz7 r21, defpackage.bz7 r22, defpackage.pz7 r23, defpackage.vp4 r24) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xa3.b(java.lang.String, bz7, bz7, pz7, vp4):java.lang.Object");
    }

    public final Object c(String str, String str2, vp4 vp4Var) {
        ChatConversationSettings settings;
        ChatConversationWithProjectReference chatConversationWithProjectReferenceI = this.b.i(str);
        return b(str, new w43(str2, 8), new w43((chatConversationWithProjectReferenceI == null || (settings = chatConversationWithProjectReferenceI.getSettings()) == null) ? null : settings.m185getEffort_level_couWBU(), 9), new te(25), vp4Var);
    }

    public final Object d(String str, String str2, vp4 vp4Var) {
        ChatConversationSettings settings;
        ChatConversationWithProjectReference chatConversationWithProjectReferenceI = this.b.i(str);
        return b(str, new w43(str2, 2), new w43((chatConversationWithProjectReferenceI == null || (settings = chatConversationWithProjectReferenceI.getSettings()) == null) ? null : settings.m187getThinking_modeKLP3kNA(), 4), new te(23), vp4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0101 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r24, java.lang.String r25, defpackage.vp4 r26) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xa3.e(java.lang.String, java.lang.String, vp4):java.lang.Object");
    }
}
