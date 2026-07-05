package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.events.BatchEventLoggingResponse;
import com.anthropic.claude.api.notification.ChannelPreference;
import com.anthropic.claude.api.notification.FeaturePreference;
import com.anthropic.claude.api.notification.NotificationPreferencesSchema;
import com.anthropic.claude.api.notification.Preferences;
import com.anthropic.claude.api.notification.TestPushCategory;
import com.anthropic.claude.api.result.ApiResult;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cjk {
    public static final ta4 a = new ta4(-1457983796, false, new jb4(12));
    public static final ta4 b = new ta4(-724824583, false, new jb4(13));
    public static final ta4 c = new ta4(1248182908, false, new jb4(14));
    public static final ta4 d = new ta4(988494566, false, new jb4(15));
    public static final ta4 e = new ta4(-1915388221, false, new jb4(16));
    public static final ta4 f = new ta4(-1060886385, false, new jb4(17));
    public static final ta4 g = new ta4(36497708, false, new jb4(18));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0120  */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [kl7, tn, yig] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.String r30, final defpackage.zy7 r31, final defpackage.iqb r32, boolean r33, boolean r34, defpackage.pz7 r35, boolean r36, final defpackage.pz7 r37, final boolean r38, defpackage.amc r39, defpackage.mnc r40, float r41, final defpackage.tkh r42, defpackage.ld4 r43, final int r44, final int r45, final int r46) {
        /*
            Method dump skipped, instruction units count: 691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjk.a(java.lang.String, zy7, iqb, boolean, boolean, pz7, boolean, pz7, boolean, amc, mnc, float, tkh, ld4, int, int, int):void");
    }

    public static final void b(String str, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1217214236);
        int i2 = (e18Var.f(str) ? 4 : 2) | i;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            iuj.e(null, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, e18Var, 0, 7);
            tjh.b("Error: ".concat(str), gb9.J(fqb.E, 16.0f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var, 48, 0, 262140);
            e18Var = e18Var;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new yi7(str, i, 25);
        }
    }

    public static final void c(List list, zy7 zy7Var, ld4 ld4Var, int i) {
        e18 e18Var;
        String strConcat;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-758093041);
        int i2 = (e18Var2.f(list) ? 4 : 2) | i | (e18Var2.h(zy7Var) ? 32 : 16);
        int i3 = 18;
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            if (list.isEmpty()) {
                e18Var2.a0(-1411530269);
                e18Var2.p(false);
                strConcat = "No channels registered";
            } else {
                e18Var2.a0(-1411466905);
                c19 c19VarU1 = w44.u1(list);
                Object objN = e18Var2.N();
                if (objN == jd4.a) {
                    objN = new f7d(i3);
                    e18Var2.k0(objN);
                }
                strConcat = "Push Channel Data:\n".concat(w44.S0(c19VarU1, "\n", null, null, (bz7) objN, 30));
                e18Var2.p(false);
            }
            e18Var = e18Var2;
            tjh.b(strConcat, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var, 0, 0, 262142);
            dtj.a("Reload Push Channel Data", gb9.N(b.c(fqb.E, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 7), false, null, null, null, 0L, zy7Var, e18Var2, ((i2 << 18) & 29360128) | 54, 124);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lpa(list, zy7Var, i, 28);
        }
    }

    public static final void d(Preferences preferences, bz7 bz7Var, ld4 ld4Var, int i) {
        bz7 bz7Var2;
        e18 e18Var;
        FeaturePreference feature_preference;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1857013649);
        int i2 = i | (e18Var2.f(preferences) ? 4 : 2) | (e18Var2.h(bz7Var) ? 32 : 16);
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            ChannelPreference compass = (preferences == null || (feature_preference = preferences.getFeature_preference()) == null) ? null : feature_preference.getCompass();
            String strConcat = "• Compass email notifications: ".concat(k(compass != null ? compass.getEnable_email() : null));
            fqb fqbVar = fqb.E;
            ChannelPreference channelPreference = compass;
            tjh.b(strConcat, gb9.J(fqbVar, 8.0f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var2, 48, 0, 262140);
            tjh.b("• Compass push notifications: ".concat(k(channelPreference != null ? channelPreference.getEnable_push() : null)), gb9.J(fqbVar, 8.0f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var2, 48, 0, 262140);
            iqb iqbVarC = b.c(fqbVar, 1.0f);
            boolean zF = e18Var2.f(channelPreference) | ((i2 & 112) == 32);
            Object objN = e18Var2.N();
            if (zF || objN == jd4.a) {
                bz7Var2 = bz7Var;
                objN = new aac(channelPreference, 13, bz7Var2);
                e18Var2.k0(objN);
            } else {
                bz7Var2 = bz7Var;
            }
            dtj.a("Toggle Compass Push Notifications", iqbVarC, false, null, null, null, 0L, (zy7) objN, e18Var2, 54, 124);
            e18Var = e18Var2;
        } else {
            bz7Var2 = bz7Var;
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lpa(preferences, bz7Var2, i, 27);
        }
    }

    public static final void e(zy7 zy7Var, iqb iqbVar, kzd kzdVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        kzd kzdVar2;
        int i2;
        kzd kzdVar3;
        iqb iqbVar3;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1625192079);
        int i3 = i | (e18Var.h(zy7Var) ? 4 : 2) | 176;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            e18Var.V();
            int i4 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i4 == 0 || e18Var.A()) {
                m7f m7fVarB = gr9.b(e18Var);
                boolean zH = e18Var.h(m7fVarB);
                Object objN = e18Var.N();
                if (zH || objN == lz1Var) {
                    objN = new di(m7fVarB, 28);
                    e18Var.k0(objN);
                }
                kce kceVar = jce.a;
                i2 = i3 & (-897);
                kzdVar3 = (kzd) fd9.r0(kceVar.b(kzd.class), oq5.B(kceVar.b(kzd.class)), (bz7) objN, e18Var);
                iqbVar3 = fqb.E;
            } else {
                e18Var.T();
                i2 = i3 & (-897);
                iqbVar3 = iqbVar;
                kzdVar3 = kzdVar;
            }
            e18Var.q();
            Context context = (Context) e18Var.j(w00.b);
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = fd9.O(im6.E, e18Var);
                e18Var.k0(objN2);
            }
            l45 l45Var = (l45) objN2;
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = sq6.p(e18Var);
            }
            ybg ybgVar = (ybg) objN3;
            boolean z = Build.VERSION.SDK_INT < 33 || x44.x(context, "android.permission.POST_NOTIFICATIONS") == 0;
            NotificationPreferencesSchema notificationPreferencesSchema = (NotificationPreferencesSchema) kzdVar3.f.getValue();
            ssj.c("Push Notifications", zy7Var, iqbVar3, null, fd9.q0(-769665817, new rn(ybgVar, 22), e18Var), 0L, fd9.q0(-53379966, new hv4(z, context, kzdVar3, l45Var, notificationPreferencesSchema != null ? notificationPreferencesSchema.getPreferences() : null, ybgVar), e18Var), e18Var, ((i2 << 3) & 112) | 1597830, 40);
            iqbVar2 = iqbVar3;
            kzdVar2 = kzdVar3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            kzdVar2 = kzdVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ra7(zy7Var, iqbVar2, kzdVar2, i, 28);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(defpackage.bpc r16, java.lang.String r17, defpackage.zy7 r18, defpackage.iqb r19, long r20, defpackage.ld4 r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjk.f(bpc, java.lang.String, zy7, iqb, long, ld4, int, int):void");
    }

    public static final void g(o0h o0hVar, ta4 ta4Var, iqb iqbVar, ta4 ta4Var2, ld4 ld4Var, int i) {
        int i2;
        ta4 ta4Var3;
        o0hVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1421463499);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(o0hVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            ta4Var3 = ta4Var;
            i2 |= e18Var.h(ta4Var3) ? 32 : 16;
        } else {
            ta4Var3 = ta4Var;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(ta4Var2) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i3 = i2;
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            gf8 gf8Var = (gf8) e18Var.j(ve4.l);
            ry ryVar = o0hVar.a;
            int i4 = i3 & 14;
            boolean zH = (i4 == 4) | e18Var.h(gf8Var);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zH || objN == lz1Var) {
                objN = new o6e(o0hVar, gf8Var, null, 26);
                e18Var.k0(objN);
            }
            fd9.i(e18Var, (pz7) objN, ryVar);
            boolean z = e18Var.j(ve4.n) == fu9.F;
            boolean zG = (i4 == 4) | ((i3 & 7168) == 2048) | ((i3 & 112) == 32) | e18Var.g(z);
            Object objN2 = e18Var.N();
            if (zG || objN2 == lz1Var) {
                sq sqVar = new sq(z, o0hVar, ta4Var2, ta4Var3, 19);
                e18Var.k0(sqVar);
                objN2 = sqVar;
            }
            bvg.a((i3 >> 6) & 14, 0, e18Var, (pz7) objN2, iqbVar);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bg6(i, 28, o0hVar, ta4Var, iqbVar, ta4Var2, false);
        }
    }

    public static final void h(bz7 bz7Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-919999254);
        int i2 = i | (e18Var.h(bz7Var) ? 4 : 2);
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            fqb fqbVar = fqb.E;
            iuj.e(gb9.L(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 1), MTTypesetterKt.kLineSkipLimitMultiplier, 0L, e18Var, 6, 6);
            tjh.b("Test Push Notifications", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var, 6, 0, 262142);
            e18Var = e18Var;
            ho0 ho0Var = new ho0(8.0f, true, new sz6(1));
            iqb iqbVarN = gb9.N(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13);
            q64 q64VarA = p64.a(ho0Var, lja.S, e18Var, 6);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarN);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            e18Var.a0(-1955607396);
            for (TestPushCategory testPushCategory : TestPushCategory.getEntries()) {
                String strI = ij0.i("Send ", testPushCategory.name());
                iqb iqbVarC = b.c(fqbVar, 1.0f);
                int i3 = 14;
                boolean zD = e18Var.d(testPushCategory.ordinal()) | ((i2 & 14) == 4);
                Object objN = e18Var.N();
                if (zD || objN == jd4.a) {
                    objN = new aac(bz7Var, i3, testPushCategory);
                    e18Var.k0(objN);
                }
                e18 e18Var2 = e18Var;
                dtj.a(strI, iqbVarC, false, null, null, null, 0L, (zy7) objN, e18Var2, 48, 124);
                e18Var = e18Var2;
            }
            e18Var.p(false);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ww9(i, bz7Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(defpackage.c4a r5, defpackage.vp4 r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.h
            if (r0 == 0) goto L13
            r0 = r6
            h r0 = (defpackage.h) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            h r0 = new h
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.G
            int r1 = r0.H
            iei r2 = defpackage.iei.a
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2d
            dae r5 = r0.F
            c4a r0 = r0.E
            defpackage.sf5.h0(r6)     // Catch: java.lang.Throwable -> L2b
            goto L71
        L2b:
            r6 = move-exception
            goto L80
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            r5 = 0
            return r5
        L34:
            defpackage.sf5.h0(r6)
            a4a r6 = r5.b()
            a4a r1 = defpackage.a4a.H
            int r6 = r6.compareTo(r1)
            if (r6 < 0) goto L44
            return r2
        L44:
            dae r6 = new dae
            r6.<init>()
            r0.E = r5     // Catch: java.lang.Throwable -> L7b
            r0.F = r6     // Catch: java.lang.Throwable -> L7b
            r0.H = r3     // Catch: java.lang.Throwable -> L7b
            ua2 r1 = new ua2     // Catch: java.lang.Throwable -> L7b
            tp4 r0 = defpackage.zni.I(r0)     // Catch: java.lang.Throwable -> L7b
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L7b
            r1.t()     // Catch: java.lang.Throwable -> L7b
            i r0 = new i     // Catch: java.lang.Throwable -> L7b
            r3 = 0
            r0.<init>(r1, r3)     // Catch: java.lang.Throwable -> L7b
            r6.E = r0     // Catch: java.lang.Throwable -> L7b
            r5.a(r0)     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r0 = r1.r()     // Catch: java.lang.Throwable -> L7b
            m45 r1 = defpackage.m45.E
            if (r0 != r1) goto L6f
            return r1
        L6f:
            r0 = r5
            r5 = r6
        L71:
            java.lang.Object r5 = r5.E
            l4a r5 = (defpackage.l4a) r5
            if (r5 == 0) goto L7a
            r0.c(r5)
        L7a:
            return r2
        L7b:
            r0 = move-exception
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L80:
            java.lang.Object r5 = r5.E
            l4a r5 = (defpackage.l4a) r5
            if (r5 == 0) goto L89
            r0.c(r5)
        L89:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjk.i(c4a, vp4):java.lang.Object");
    }

    public static kla j(qh9 qh9Var) {
        try {
            long jK = qh9Var.s("format_version").k();
            bh9 bh9VarS = qh9Var.s("session");
            lla llaVarH = bh9VarS != null ? djk.h(bh9VarS.g()) : null;
            bh9 bh9VarS2 = qh9Var.s("configuration");
            fla flaVarH = bh9VarS2 != null ? uik.h(bh9VarS2.g()) : null;
            bh9 bh9VarS3 = qh9Var.s("browser_sdk_version");
            String strM = bh9VarS3 != null ? bh9VarS3.m() : null;
            bh9 bh9VarS4 = qh9Var.s("sdk_name");
            String strM2 = bh9VarS4 != null ? bh9VarS4.m() : null;
            bh9 bh9VarS5 = qh9Var.s("discarded");
            Boolean boolValueOf = bh9VarS5 != null ? Boolean.valueOf(bh9VarS5.a()) : null;
            bh9 bh9VarS6 = qh9Var.s("profiling");
            ula ulaVarI = bh9VarS6 != null ? xjk.i(bh9VarS6.g()) : null;
            if (jK == 2) {
                return new kla(llaVarH, flaVarH, strM, strM2, boolValueOf, ulaVarI);
            }
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Dd", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Dd", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Dd", e4);
            return null;
        }
    }

    public static final String k(Boolean bool) {
        if (x44.r(bool, Boolean.TRUE)) {
            return "Enabled";
        }
        if (x44.r(bool, Boolean.FALSE)) {
            return "Disabled";
        }
        if (bool == null) {
            return "Not set";
        }
        wg6.i();
        return null;
    }

    public static final hki m(ApiResult apiResult) {
        apiResult.getClass();
        if (apiResult instanceof of0) {
            BatchEventLoggingResponse batchEventLoggingResponse = (BatchEventLoggingResponse) ((of0) apiResult).b;
            return new gki(batchEventLoggingResponse.getAccepted_count(), batchEventLoggingResponse.getRejected_count());
        }
        if (!(apiResult instanceof lf0)) {
            if (apiResult instanceof mf0) {
                return new fki("Network error", ((mf0) apiResult).a);
            }
            wg6.i();
            return null;
        }
        lf0 lf0Var = (lf0) apiResult;
        bj3 bj3Var = lf0Var.b;
        int i = lf0Var.a;
        if (i == 429) {
            return eki.a;
        }
        if (500 <= i && i < 600) {
            return new fki(grc.p(i, "Server error: "), null);
        }
        String c2 = bj3Var.getD();
        if (c2 == null) {
            c2 = jce.a.b(bj3Var.getClass()).f();
        }
        return new dki(vb7.k(i, "Client error ", ": ", c2));
    }

    public abstract qh9 l();
}
