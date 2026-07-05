package defpackage;

import android.graphics.PorterDuff;
import androidx.health.platform.client.proto.g;
import coil3.compose.AsyncImagePainter;
import coil3.compose.internal.SubcomposeContentPainterElement;
import com.anthropic.claude.api.experience.ExperienceToggle;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sik {
    public static final ta4 a = new ta4(-1221427860, false, new jb4(4));
    public static final ta4 b = new ta4(1236034191, false, new hb4(1));
    public static final String[] c = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};
    public static final String[] d = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};
    public static final String[] e = {"items"};
    public static final String[] f = {"affiliation", "coupon", "creative_name", "creative_slot", "currency", "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", "price", "promotion_id", "promotion_name", "quantity", "shipping", "shipping_tier", "tax", "transaction_id", ExperienceToggle.DEFAULT_PARAM_KEY, "item_list", "checkout_step", "checkout_option", "item_location_id"};

    public static final void a(e11 e11Var, String str, iqb iqbVar, bz7 bz7Var, bz7 bz7Var2, tt ttVar, jo4 jo4Var, ta4 ta4Var, ld4 ld4Var, int i, int i2) {
        int i3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-205779950);
        int i4 = i | (e18Var.f(e11Var) ? 4 : 2) | (e18Var.f(str) ? 32 : 16) | (e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(bz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(bz7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.f(ttVar) ? 131072 : 65536) | (e18Var.c(1.0f) ? 8388608 : 4194304) | (e18Var.f(null) ? 67108864 : 33554432) | (e18Var.d(3) ? 536870912 : 268435456);
        if ((i2 & 6) == 0) {
            i3 = i2 | (e18Var.g(true) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.h(ta4Var) ? 32 : 16;
        }
        int i5 = i3;
        if (e18Var.Q(i4 & 1, ((306783379 & i4) == 306783378 && (i5 & 19) == 18) ? false : true)) {
            jx8 jx8VarD = fqi.d(e11Var.a, jo4Var, e18Var, 48);
            int i6 = i4 >> 6;
            int i7 = i4 >> 12;
            AsyncImagePainter asyncImagePainterL = vuk.l(jx8VarD, e11Var.c, bz7Var, bz7Var2, jo4Var, e18Var, 0);
            x8g x8gVar = jx8VarD.q;
            if (x8gVar instanceof ul4) {
                e18Var.a0(-1470570430);
                xn5.H(iqbVar, ttVar, true, fd9.q0(-374957172, new gn(x8gVar, ta4Var, asyncImagePainterL, str, ttVar, jo4Var), e18Var), e18Var, (i6 & 14) | 3456 | (i7 & 112), 0);
                e18Var.p(false);
            } else {
                e18Var.a0(-1471259157);
                o5b o5bVarD = dw1.d(ttVar, true);
                int iHashCode = Long.hashCode(e18Var.T);
                hyc hycVarL = e18Var.l();
                iqb iqbVarE = kxk.E(e18Var, iqbVar);
                dd4.e.getClass();
                re4 re4Var = cd4.b;
                e18Var.e0();
                if (e18Var.S) {
                    e18Var.k(re4Var);
                } else {
                    e18Var.n0();
                }
                d4c.i0(e18Var, cd4.f, o5bVarD);
                d4c.i0(e18Var, cd4.e, hycVarL);
                d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                d4c.h0(e18Var, cd4.h);
                d4c.i0(e18Var, cd4.d, iqbVarE);
                ta4Var.invoke(new h5e(nw1.a, asyncImagePainterL, str, ttVar, jo4Var), e18Var, Integer.valueOf(i5 & 112));
                e18Var.p(true);
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new we(e11Var, str, iqbVar, bz7Var, bz7Var2, ttVar, jo4Var, ta4Var, i, i2);
        }
    }

    public static final void b(h5e h5eVar, iqb iqbVar, bpc bpcVar, String str, tt ttVar, jo4 jo4Var, float f2, boolean z, ld4 ld4Var, int i) {
        int i2;
        iqb iqbVar2;
        bpc bpcVar2;
        String str2;
        tt ttVar2;
        jo4 jo4Var2;
        float f3;
        boolean z2;
        bpc bpcVar3;
        String str3;
        tt ttVar3;
        iqb iqbVar3;
        float f4;
        boolean z3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1375825518);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(h5eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 = i2 | 176;
        }
        if ((i & 3072) == 0) {
            i3 |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i3 |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i3 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= 33554432;
        }
        if (e18Var.Q(i3 & 1, (38347923 & i3) != 38347922)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                bpcVar3 = h5eVar.b;
                str3 = h5eVar.c;
                ttVar3 = h5eVar.d;
                jo4Var2 = h5eVar.e;
                h5eVar.getClass();
                h5eVar.getClass();
                h5eVar.getClass();
                iqbVar3 = fqb.E;
                f4 = 1.0f;
                z3 = true;
            } else {
                e18Var.T();
                iqbVar3 = iqbVar;
                bpcVar3 = bpcVar;
                str3 = str;
                ttVar3 = ttVar;
                jo4Var2 = jo4Var;
                f4 = f2;
                z3 = z;
            }
            e18Var.q();
            iqb iqbVarB = iqbVar3.B(new SubcomposeContentPainterElement(bpcVar3, ttVar3, jo4Var2, f4, z3, str3));
            int i4 = fqi.b;
            t10 t10Var = t10.h;
            int iHashCode = Long.hashCode(e18Var.T);
            iqb iqbVarE = kxk.E(e18Var, iqbVarB);
            hyc hycVarL = e18Var.l();
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, t10Var);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            e18Var.p(true);
            ttVar2 = ttVar3;
            str2 = str3;
            bpcVar2 = bpcVar3;
            iqbVar2 = iqbVar3;
            f3 = f4;
            z2 = z3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            bpcVar2 = bpcVar;
            str2 = str;
            ttVar2 = ttVar;
            jo4Var2 = jo4Var;
            f3 = f2;
            z2 = z;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new dag(h5eVar, iqbVar2, bpcVar2, str2, ttVar2, jo4Var2, f3, z2, i);
        }
    }

    public static ela c(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("test_execution_id").m();
            strM.getClass();
            return new ela(strM);
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type CiTest", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type CiTest", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type CiTest", e4);
            return null;
        }
    }

    public static final bz7 d() {
        wo5 wo5Var = wo5.d;
        return wo5.d.c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if (r2.equals("edu_list_numbers") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0077, code lost:
    
        if (r2.equals("edu_list_bullets") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007c, code lost:
    
        r2 = defpackage.ud0.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0081, code lost:
    
        return com.anthropic.claude.R.drawable.anthropicon_checklist;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int e(com.anthropic.claude.models.organization.configtypes.StarterPromptConfig r2) {
        /*
            java.lang.String r2 = r2.getMobile_icon_type()
            int r0 = r2.hashCode()
            r1 = 2131230989(0x7f08010d, float:1.8078046E38)
            switch(r0) {
                case -1401180423: goto L71;
                case -1285007991: goto L64;
                case -471480926: goto L55;
                case 38365937: goto L48;
                case 97804074: goto L3c;
                case 180329138: goto L2f;
                case 659554706: goto L26;
                case 848096826: goto L19;
                case 1376743000: goto L10;
                default: goto Le;
            }
        Le:
            goto L79
        L10:
            java.lang.String r0 = "edu_pen_nib"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L51
            goto L79
        L19:
            java.lang.String r0 = "edu_target"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L22
            goto L79
        L22:
            r2 = 2131231380(0x7f080294, float:1.807884E38)
            return r2
        L26:
            java.lang.String r0 = "edu_list_numbers"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L7c
            goto L79
        L2f:
            java.lang.String r0 = "edu_student"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L38
            goto L79
        L38:
            r2 = 2131231379(0x7f080293, float:1.8078837E38)
            return r2
        L3c:
            java.lang.String r0 = "edu_graduation_cap"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L45
            goto L79
        L45:
            ud0 r2 = defpackage.ud0.d
            return r1
        L48:
            java.lang.String r0 = "edu_note_pencil"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L51
            goto L79
        L51:
            r2 = 2131231376(0x7f080290, float:1.8078831E38)
            return r2
        L55:
            java.lang.String r0 = "edu_presentation_chart"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L5e
            goto L79
        L5e:
            ud0 r2 = defpackage.ud0.d
            r2 = 2131230914(0x7f0800c2, float:1.8077894E38)
            return r2
        L64:
            java.lang.String r0 = "edu_compass"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L6d
            goto L79
        L6d:
            r2 = 2131231375(0x7f08028f, float:1.807883E38)
            return r2
        L71:
            java.lang.String r0 = "edu_list_bullets"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L7c
        L79:
            ud0 r2 = defpackage.ud0.d
            return r1
        L7c:
            ud0 r2 = defpackage.ud0.d
            r2 = 2131230926(0x7f0800ce, float:1.8077919E38)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sik.e(com.anthropic.claude.models.organization.configtypes.StarterPromptConfig):int");
    }

    public static final boolean f(mv2 mv2Var, mv2 mv2Var2) {
        if (mv2Var2 == null) {
            return false;
        }
        return new nv2(mv2Var.getFiles(), mv2Var.getAttachments(), bsg.k1(mv2Var.getText()).toString()).equals(new nv2(mv2Var2.getFiles(), mv2Var2.getAttachments(), bsg.k1(mv2Var2.getText()).toString()));
    }

    public static PorterDuff.Mode g(int i) {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i != 5) {
            if (i == 9) {
                return PorterDuff.Mode.SRC_ATOP;
            }
            switch (i) {
                case 14:
                    return PorterDuff.Mode.MULTIPLY;
                case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                    return PorterDuff.Mode.SCREEN;
                case 16:
                    return PorterDuff.Mode.ADD;
            }
        }
        return mode;
    }

    public static String h(String str) {
        return q7j.b(str, c, d);
    }
}
