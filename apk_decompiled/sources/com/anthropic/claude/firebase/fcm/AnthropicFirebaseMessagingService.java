package com.anthropic.claude.firebase.fcm;

import com.anthropic.claude.analytics.events.PushEvents$PushNotificationDisplayed;
import com.anthropic.claude.api.account.Account;
import com.anthropic.claude.types.strings.AccountId;
import com.google.firebase.messaging.FirebaseMessagingService;
import defpackage.bzd;
import defpackage.fk0;
import defpackage.g8c;
import defpackage.grc;
import defpackage.iv1;
import defpackage.jce;
import defpackage.kw9;
import defpackage.m7f;
import defpackage.nai;
import defpackage.p4;
import defpackage.q7;
import defpackage.qi3;
import defpackage.ql3;
import defpackage.rd0;
import defpackage.ul7;
import defpackage.w1a;
import defpackage.xah;
import defpackage.yb5;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class AnthropicFirebaseMessagingService extends FirebaseMessagingService {
    public final kw9 L;
    public final kw9 M;
    public final kw9 N;
    public final kw9 O;
    public final kw9 P;
    public final kw9 Q;
    public final kw9 R;

    public AnthropicFirebaseMessagingService() {
        rd0 rd0Var = new rd0(this, 0);
        w1a w1aVar = w1a.E;
        this.L = yb5.w(w1aVar, rd0Var);
        int i = 5;
        this.M = yb5.w(w1aVar, new p4(this, i, nai.x));
        this.N = yb5.w(w1aVar, new rd0(this, 1));
        this.O = yb5.w(w1aVar, new rd0(this, 2));
        this.P = yb5.w(w1aVar, new rd0(this, 3));
        this.Q = yb5.w(w1aVar, new rd0(this, 4));
        this.R = yb5.w(w1aVar, new rd0(this, i));
    }

    public static String h(int i) {
        return i != 1 ? i != 2 ? grc.u("unknown(", i, ")") : "normal" : "high";
    }

    public static void i(AnthropicFirebaseMessagingService anthropicFirebaseMessagingService, String str, String str2, g8c g8cVar, String str3, String str4, int i) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        anthropicFirebaseMessagingService.e().e(new PushEvents$PushNotificationDisplayed(str, (str2 == null || str2.length() <= 0) ? null : str2, g8cVar.E, (str3 == null || str3.length() <= 0) ? null : str3, (str4 == null || str4.length() <= 0) ? null : str4), iv1.J(jce.b(PushEvents$PushNotificationDisplayed.class)));
    }

    /* JADX WARN: Path cross not found for [B:250:0x0702, B:383:0x0705], limit reached: 387 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x07f7  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x07fa  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x080b  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x093d  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0961  */
    /* JADX WARN: Removed duplicated region for block: B:412:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0108 A[PHI: r8
      0x0108: PHI (r8v10 java.lang.String) = (r8v9 java.lang.String), (r8v31 java.lang.String) binds: [B:46:0x00e0, B:56:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013f A[PHI: r8
      0x013f: PHI (r8v15 java.lang.String) = (r8v14 java.lang.String), (r8v26 java.lang.String) binds: [B:61:0x0117, B:71:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fc  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:373:0x0702
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.cfe r31) {
        /*
            Method dump skipped, instruction units count: 2846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.firebase.fcm.AnthropicFirebaseMessagingService.c(cfe):void");
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void d(String str) {
        bzd bzdVar;
        str.getClass();
        List list = xah.a;
        xah.e(6, "FCM onNewToken", null, null);
        ul7 ul7Var = (ul7) this.Q.getValue();
        ul7Var.getClass();
        ul7Var.b = str;
        m7f m7fVarD = ((ql3) this.P.getValue()).d();
        if (m7fVarD == null || (bzdVar = (bzd) m7fVarD.c(jce.a.b(bzd.class))) == null) {
            return;
        }
        bzdVar.b();
    }

    public final qi3 e() {
        return (qi3) this.N.getValue();
    }

    public final boolean f(String str) {
        if (str != null && str.length() != 0) {
            String strM944constructorimpl = AccountId.m944constructorimpl(str);
            kw9 kw9Var = this.R;
            String strE = ((fk0) kw9Var.getValue()).e();
            if (!(strE == null ? false : AccountId.m946equalsimpl0(strM944constructorimpl, strE)) && !((fk0) kw9Var.getValue()).h().contains(AccountId.m943boximpl(strM944constructorimpl))) {
                return true;
            }
        }
        return false;
    }

    public final String g(String str) {
        Account accountA;
        ql3 ql3Var = (ql3) this.P.getValue();
        String strM944constructorimpl = AccountId.m944constructorimpl(str);
        strM944constructorimpl.getClass();
        String strConcat = "AccountScope:".concat(strM944constructorimpl);
        ql3Var.getClass();
        m7f m7fVarB = ql3Var.a.b(strConcat);
        String display_name = null;
        if (m7fVarB == null) {
            m7fVarB = null;
        }
        if (m7fVarB != null) {
            q7 q7Var = (q7) m7fVarB.a(jce.a.b(q7.class), null, null);
            if (!q7Var.b()) {
                q7Var = null;
            }
            if (q7Var != null && (display_name = (accountA = q7Var.a()).getDisplay_name()) == null && (display_name = accountA.getFull_name()) == null) {
                return accountA.m105getEmail_addressZiuLfiY();
            }
        }
        return display_name;
    }
}
