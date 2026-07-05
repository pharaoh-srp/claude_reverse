package defpackage;

import com.anthropic.claude.api.account.AccountProfile;
import com.anthropic.claude.api.feature.Feature;

/* JADX INFO: loaded from: classes3.dex */
public final class vid extends iwe {
    public final q7 b;
    public final o7 c;
    public final i8 d;
    public final qi3 e;
    public final zy1 f;
    public final wlg g;
    public final lsc h;
    public final lsc i;
    public final lsc j;
    public final lsc k;
    public final lsc l;
    public final wz5 m;
    public final wz5 n;
    public final lsc o;
    public final lsc p;
    public final lsc q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vid(q7 q7Var, o7 o7Var, i8 i8Var, qi3 qi3Var, nf7 nf7Var, h86 h86Var) {
        String conversation_preferences;
        String conversation_preferences2;
        super(h86Var);
        lsc lscVar = q7Var.b;
        this.b = q7Var;
        this.c = o7Var;
        this.d = i8Var;
        this.e = qi3Var;
        this.f = x44.a();
        this.g = nf7Var.f(Feature.CONVERSATION_PREFERENCES);
        String full_name = q7Var.a().getFull_name();
        String str = "";
        this.h = mpk.P(new cjh(full_name == null ? "" : full_name, 0L, 6));
        String display_name = q7Var.a().getDisplay_name();
        this.i = mpk.P(new cjh(display_name == null ? "" : display_name, 0L, 6));
        AccountProfile accountProfile = (AccountProfile) lscVar.getValue();
        this.j = mpk.P(new cjh((accountProfile == null || (conversation_preferences2 = accountProfile.getConversation_preferences()) == null) ? "" : conversation_preferences2, 0L, 6));
        Boolean bool = Boolean.FALSE;
        this.k = mpk.P(bool);
        AccountProfile accountProfile2 = (AccountProfile) lscVar.getValue();
        if (accountProfile2 != null && (conversation_preferences = accountProfile2.getConversation_preferences()) != null) {
            str = conversation_preferences;
        }
        this.l = mpk.P(str);
        int i = 0;
        this.m = mpk.w(new sid(this, i));
        this.n = mpk.w(new sid(this, 1));
        this.o = mpk.P(bool);
        this.p = mpk.P(bool);
        this.q = mpk.P(bool);
        gb9.D(this.a, null, null, new tid(this, null, i), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O(defpackage.vid r10, defpackage.vp4 r11) {
        /*
            lsc r0 = r10.k
            boolean r1 = r11 instanceof defpackage.uid
            if (r1 == 0) goto L15
            r1 = r11
            uid r1 = (defpackage.uid) r1
            int r2 = r1.G
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.G = r2
            goto L1a
        L15:
            uid r1 = new uid
            r1.<init>(r10, r11)
        L1a:
            java.lang.Object r11 = r1.E
            int r2 = r1.G
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.sf5.h0(r11)
            goto L43
        L28:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r10)
            return r3
        L2e:
            defpackage.sf5.h0(r11)
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r0.setValue(r11)
            i8 r11 = r10.d
            r1.G = r4
            java.lang.Object r11 = r11.a(r1)
            m45 r1 = defpackage.m45.E
            if (r11 != r1) goto L43
            return r1
        L43:
            com.anthropic.claude.api.result.ApiResult r11 = (com.anthropic.claude.api.result.ApiResult) r11
            boolean r1 = r11 instanceof defpackage.of0
            if (r1 == 0) goto L88
            r2 = r11
            of0 r2 = (defpackage.of0) r2
            java.lang.Object r2 = r2.b
            com.anthropic.claude.api.account.AccountProfile r2 = (com.anthropic.claude.api.account.AccountProfile) r2
            q7 r4 = r10.b
            r4.getClass()
            r2.getClass()
            lsc r4 = r4.b
            r4.setValue(r2)
            cjh r4 = new cjh
            java.lang.String r5 = r2.getConversation_preferences()
            java.lang.String r6 = ""
            if (r5 != 0) goto L68
            r5 = r6
        L68:
            r7 = 0
            r9 = 6
            r4.<init>(r5, r7, r9)
            lsc r5 = r10.j
            r5.setValue(r4)
            java.lang.String r2 = r2.getConversation_preferences()
            if (r2 != 0) goto L7a
            goto L7b
        L7a:
            r6 = r2
        L7b:
            lsc r2 = r10.l
            r2.setValue(r6)
            java.util.List r2 = defpackage.xah.a
            vba r2 = defpackage.vba.NETWORK
            defpackage.xah.b(r2)
            goto L8c
        L88:
            boolean r2 = r11 instanceof defpackage.nf0
            if (r2 == 0) goto Lac
        L8c:
            if (r1 != 0) goto La4
            boolean r11 = r11 instanceof defpackage.nf0
            if (r11 == 0) goto La0
            zy1 r10 = r10.f
            pt6 r11 = new pt6
            r1 = 2131888215(0x7f120857, float:1.941106E38)
            r11.<init>(r1)
            r10.r(r11)
            goto La4
        La0:
            defpackage.wg6.i()
            return r3
        La4:
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r0.setValue(r10)
            iei r10 = defpackage.iei.a
            return r10
        Lac:
            defpackage.wg6.i()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vid.O(vid, vp4):java.lang.Object");
    }
}
