package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class mxi {
    public final long a;
    public final svi b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final jxi h;
    public final int i;
    public final kxi j;
    public final ixi k;
    public final qvi l;
    public final wvi m;
    public final gwi n;
    public final hxi o;
    public final uvi p;
    public final vwi q;
    public final fwi r;
    public final cwi s;
    public final zvi t;
    public final xvi u;
    public final zvi v;
    public final bxi w;

    public mxi(long j, svi sviVar, String str, String str2, String str3, String str4, String str5, jxi jxiVar, int i, kxi kxiVar, ixi ixiVar, qvi qviVar, wvi wviVar, gwi gwiVar, hxi hxiVar, uvi uviVar, vwi vwiVar, fwi fwiVar, cwi cwiVar, zvi zviVar, xvi xviVar, zvi zviVar2, bxi bxiVar) {
        this.a = j;
        this.b = sviVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = jxiVar;
        this.i = i;
        this.j = kxiVar;
        this.k = ixiVar;
        this.l = qviVar;
        this.m = wviVar;
        this.n = gwiVar;
        this.o = hxiVar;
        this.p = uviVar;
        this.q = vwiVar;
        this.r = fwiVar;
        this.s = cwiVar;
        this.t = zviVar;
        this.u = xviVar;
        this.v = zviVar2;
        this.w = bxiVar;
    }

    public static mxi a(mxi mxiVar, kxi kxiVar, ixi ixiVar, qvi qviVar, cwi cwiVar, zvi zviVar, int i) {
        fwi fwiVar;
        cwi cwiVar2;
        long j = mxiVar.a;
        svi sviVar = mxiVar.b;
        String str = mxiVar.c;
        String str2 = mxiVar.d;
        String str3 = mxiVar.e;
        String str4 = mxiVar.f;
        String str5 = mxiVar.g;
        jxi jxiVar = mxiVar.h;
        int i2 = mxiVar.i;
        ixi ixiVar2 = (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? mxiVar.k : ixiVar;
        qvi qviVar2 = (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? mxiVar.l : qviVar;
        wvi wviVar = mxiVar.m;
        gwi gwiVar = mxiVar.n;
        hxi hxiVar = mxiVar.o;
        uvi uviVar = mxiVar.p;
        vwi vwiVar = mxiVar.q;
        fwi fwiVar2 = mxiVar.r;
        if ((i & 262144) != 0) {
            fwiVar = fwiVar2;
            cwiVar2 = mxiVar.s;
        } else {
            fwiVar = fwiVar2;
            cwiVar2 = cwiVar;
        }
        zvi zviVar2 = (i & 524288) != 0 ? mxiVar.t : zviVar;
        xvi xviVar = mxiVar.u;
        zvi zviVar3 = mxiVar.v;
        bxi bxiVar = mxiVar.w;
        mxiVar.getClass();
        return new mxi(j, sviVar, str, str2, str3, str4, str5, jxiVar, i2, kxiVar, ixiVar2, qviVar2, wviVar, gwiVar, hxiVar, uviVar, vwiVar, fwiVar, cwiVar2, zviVar2, xviVar, zviVar3, bxiVar);
    }

    public final qh9 b() {
        String str;
        String str2;
        qh9 qh9Var = new qh9();
        qh9Var.p(Long.valueOf(this.a), "date");
        qh9 qh9Var2 = new qh9();
        svi sviVar = this.b;
        qh9Var2.r("id", sviVar.a);
        String str3 = sviVar.b;
        if (str3 != null) {
            qh9Var2.r("current_locale", str3);
        }
        qh9Var.o("application", qh9Var2);
        String str4 = this.c;
        if (str4 != null) {
            qh9Var.r("service", str4);
        }
        String str5 = this.d;
        if (str5 != null) {
            qh9Var.r("version", str5);
        }
        String str6 = this.e;
        if (str6 != null) {
            qh9Var.r("build_version", str6);
        }
        String str7 = this.f;
        if (str7 != null) {
            qh9Var.r("build_id", str7);
        }
        String str8 = this.g;
        if (str8 != null) {
            qh9Var.r("ddtags", str8);
        }
        qh9 qh9Var3 = new qh9();
        jxi jxiVar = this.h;
        qh9Var3.r("id", jxiVar.a);
        qh9Var3.o("type", new vh9(kgh.i(jxiVar.b)));
        Boolean bool = jxiVar.c;
        if (bool != null) {
            qh9Var3.q("has_replay", bool);
        }
        Boolean bool2 = jxiVar.d;
        if (bool2 != null) {
            qh9Var3.q("is_active", bool2);
        }
        Boolean bool3 = jxiVar.e;
        if (bool3 != null) {
            qh9Var3.q("sampled_for_replay", bool3);
        }
        String str9 = "session";
        qh9Var.o("session", qh9Var3);
        String str10 = "source";
        int i = this.i;
        if (i != 0) {
            qh9Var.o("source", new vh9(kgh.j(i)));
        }
        qh9 qh9Var4 = new qh9();
        kxi kxiVar = this.j;
        qh9Var4.r("id", kxiVar.a);
        String str11 = kxiVar.b;
        if (str11 != null) {
            qh9Var4.r("referrer", str11);
        }
        qh9Var4.r("url", kxiVar.c);
        String str12 = kxiVar.d;
        if (str12 != null) {
            qh9Var4.r("name", str12);
        }
        Long l = kxiVar.e;
        if (l != null) {
            grc.A(l, qh9Var4, "loading_time");
        }
        Long l2 = kxiVar.f;
        if (l2 != null) {
            grc.A(l2, qh9Var4, "network_settled_time");
        }
        Long l3 = kxiVar.g;
        if (l3 != null) {
            grc.A(l3, qh9Var4, "interaction_to_next_view_time");
        }
        int i2 = kxiVar.Y;
        if (i2 != 0) {
            qh9Var4.o("loading_type", new vh9(kgh.g(i2)));
        }
        qh9Var4.p(Long.valueOf(kxiVar.h), "time_spent");
        Long l4 = kxiVar.i;
        if (l4 != null) {
            grc.A(l4, qh9Var4, "first_contentful_paint");
        }
        Long l5 = kxiVar.j;
        if (l5 != null) {
            grc.A(l5, qh9Var4, "largest_contentful_paint");
        }
        String str13 = kxiVar.k;
        if (str13 != null) {
            qh9Var4.r("largest_contentful_paint_target_selector", str13);
        }
        Long l6 = kxiVar.l;
        if (l6 != null) {
            grc.A(l6, qh9Var4, "first_input_delay");
        }
        Long l7 = kxiVar.m;
        if (l7 != null) {
            grc.A(l7, qh9Var4, "first_input_time");
        }
        String str14 = kxiVar.n;
        if (str14 != null) {
            qh9Var4.r("first_input_target_selector", str14);
        }
        Long l8 = kxiVar.o;
        if (l8 != null) {
            grc.A(l8, qh9Var4, "interaction_to_next_paint");
        }
        Long l9 = kxiVar.p;
        if (l9 != null) {
            grc.A(l9, qh9Var4, "interaction_to_next_paint_time");
        }
        String str15 = kxiVar.q;
        if (str15 != null) {
            qh9Var4.r("interaction_to_next_paint_target_selector", str15);
        }
        Number number = kxiVar.r;
        if (number != null) {
            qh9Var4.p(number, "cumulative_layout_shift");
        }
        Long l10 = kxiVar.s;
        if (l10 != null) {
            grc.A(l10, qh9Var4, "cumulative_layout_shift_time");
        }
        String str16 = kxiVar.t;
        if (str16 != null) {
            qh9Var4.r("cumulative_layout_shift_target_selector", str16);
        }
        Long l11 = kxiVar.u;
        if (l11 != null) {
            grc.A(l11, qh9Var4, "dom_complete");
        }
        Long l12 = kxiVar.v;
        if (l12 != null) {
            grc.A(l12, qh9Var4, "dom_content_loaded");
        }
        Long l13 = kxiVar.w;
        if (l13 != null) {
            grc.A(l13, qh9Var4, "dom_interactive");
        }
        Long l14 = kxiVar.x;
        if (l14 != null) {
            grc.A(l14, qh9Var4, "load_event");
        }
        Long l15 = kxiVar.y;
        if (l15 != null) {
            grc.A(l15, qh9Var4, "first_byte");
        }
        bwi bwiVar = kxiVar.z;
        if (bwiVar != null) {
            qh9 qh9Var5 = new qh9();
            for (Map.Entry entry : bwiVar.a.entrySet()) {
                qh9Var5.p(Long.valueOf(((Number) entry.getValue()).longValue()), (String) entry.getKey());
            }
            qh9Var4.o("custom_timings", qh9Var5);
        }
        Boolean bool4 = kxiVar.A;
        if (bool4 != null) {
            qh9Var4.q("is_active", bool4);
        }
        Boolean bool5 = kxiVar.B;
        if (bool5 != null) {
            qh9Var4.q("is_slow_rendered", bool5);
        }
        rvi rviVar = kxiVar.C;
        qh9 qh9Var6 = new qh9();
        qh9Var6.p(Long.valueOf(rviVar.a), "count");
        qh9Var4.o("action", qh9Var6);
        hwi hwiVar = kxiVar.D;
        qh9 qh9Var7 = new qh9();
        qh9Var7.p(Long.valueOf(hwiVar.a), "count");
        qh9Var4.o("error", qh9Var7);
        awi awiVar = kxiVar.E;
        if (awiVar != null) {
            qh9 qh9Var8 = new qh9();
            qh9Var8.p(Long.valueOf(awiVar.a), "count");
            qh9Var4.o("crash", qh9Var8);
        }
        uwi uwiVar = kxiVar.F;
        if (uwiVar != null) {
            qh9 qh9Var9 = new qh9();
            qh9Var9.p(Long.valueOf(uwiVar.a), "count");
            qh9Var4.o("long_task", qh9Var9);
        }
        mwi mwiVar = kxiVar.G;
        if (mwiVar != null) {
            qh9 qh9Var10 = new qh9();
            qh9Var10.p(Long.valueOf(mwiVar.a), "count");
            qh9Var4.o("frozen_frame", qh9Var10);
        }
        List list = kxiVar.H;
        if (list != null) {
            ig9 ig9Var = new ig9(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                gxi gxiVar = (gxi) it.next();
                gxiVar.getClass();
                Iterator it2 = it;
                qh9 qh9Var11 = new qh9();
                qh9Var11.p(Long.valueOf(gxiVar.a), "start");
                qh9Var11.p(Long.valueOf(gxiVar.b), "duration");
                ig9Var.o(qh9Var11);
                it = it2;
                str9 = str9;
                str10 = str10;
            }
            str = str10;
            str2 = str9;
            qh9Var4.o("slow_frames", ig9Var);
        } else {
            str = "source";
            str2 = "session";
        }
        exi exiVar = kxiVar.I;
        qh9 qh9Var12 = new qh9();
        qh9Var12.p(Long.valueOf(exiVar.a), "count");
        qh9Var4.o("resource", qh9Var12);
        nwi nwiVar = kxiVar.J;
        if (nwiVar != null) {
            qh9 qh9Var13 = new qh9();
            qh9Var13.p(Long.valueOf(nwiVar.a), "count");
            qh9Var4.o("frustration", qh9Var13);
        }
        List<owi> list2 = kxiVar.K;
        if (list2 != null) {
            ig9 ig9Var2 = new ig9(list2.size());
            for (owi owiVar : list2) {
                owiVar.getClass();
                qh9 qh9Var14 = new qh9();
                qh9Var14.p(Long.valueOf(owiVar.a), "start");
                qh9Var14.p(Long.valueOf(owiVar.b), "duration");
                ig9Var2.o(qh9Var14);
            }
            qh9Var4.o("in_foreground_periods", ig9Var2);
        }
        Number number2 = kxiVar.L;
        if (number2 != null) {
            qh9Var4.p(number2, "memory_average");
        }
        Number number3 = kxiVar.M;
        if (number3 != null) {
            qh9Var4.p(number3, "memory_max");
        }
        Number number4 = kxiVar.N;
        if (number4 != null) {
            qh9Var4.p(number4, "cpu_ticks_count");
        }
        Number number5 = kxiVar.O;
        if (number5 != null) {
            qh9Var4.p(number5, "cpu_ticks_per_second");
        }
        Number number6 = kxiVar.P;
        if (number6 != null) {
            qh9Var4.p(number6, "refresh_rate_average");
        }
        Number number7 = kxiVar.Q;
        if (number7 != null) {
            qh9Var4.p(number7, "refresh_rate_min");
        }
        Number number8 = kxiVar.R;
        if (number8 != null) {
            qh9Var4.p(number8, "slow_frames_rate");
        }
        Number number9 = kxiVar.S;
        if (number9 != null) {
            qh9Var4.p(number9, "freeze_rate");
        }
        lwi lwiVar = kxiVar.T;
        if (lwiVar != null) {
            qh9Var4.o("flutter_build_time", lwiVar.a());
        }
        lwi lwiVar2 = kxiVar.U;
        if (lwiVar2 != null) {
            qh9Var4.o("flutter_raster_time", lwiVar2.a());
        }
        lwi lwiVar3 = kxiVar.V;
        if (lwiVar3 != null) {
            qh9Var4.o("js_refresh_rate", lwiVar3.a());
        }
        xwi xwiVar = kxiVar.W;
        if (xwiVar != null) {
            qh9 qh9Var15 = new qh9();
            ywi ywiVar = xwiVar.a;
            if (ywiVar != null) {
                qh9Var15.o("cls", ywiVar.a());
            }
            jwi jwiVar = xwiVar.b;
            if (jwiVar != null) {
                qh9Var15.o("fcp", jwiVar.a());
            }
            kwi kwiVar = xwiVar.c;
            if (kwiVar != null) {
                qh9Var15.o("fid", kwiVar.a());
            }
            pwi pwiVar = xwiVar.d;
            if (pwiVar != null) {
                qh9Var15.o("inp", pwiVar.a());
            }
            swi swiVar = xwiVar.e;
            if (swiVar != null) {
                qh9Var15.o("lcp", swiVar.a());
            }
            iwi iwiVar = xwiVar.f;
            if (iwiVar != null) {
                qh9 qh9Var16 = new qh9();
                qh9Var16.p(Long.valueOf(iwiVar.a), "timestamp");
                qh9Var15.o("fbc", qh9Var16);
            }
            qh9Var4.o("performance", qh9Var15);
        }
        pvi pviVar = kxiVar.X;
        if (pviVar != null) {
            qh9 qh9Var17 = new qh9();
            String str17 = pviVar.a;
            if (str17 != null) {
                qh9Var17.r("text_size", str17);
            }
            Boolean bool6 = pviVar.b;
            if (bool6 != null) {
                qh9Var17.q("screen_reader_enabled", bool6);
            }
            Boolean bool7 = pviVar.c;
            if (bool7 != null) {
                qh9Var17.q("bold_text_enabled", bool7);
            }
            Boolean bool8 = pviVar.d;
            if (bool8 != null) {
                qh9Var17.q("reduce_transparency_enabled", bool8);
            }
            Boolean bool9 = pviVar.e;
            if (bool9 != null) {
                qh9Var17.q("reduce_motion_enabled", bool9);
            }
            Boolean bool10 = pviVar.f;
            if (bool10 != null) {
                qh9Var17.q("button_shapes_enabled", bool10);
            }
            Boolean bool11 = pviVar.g;
            if (bool11 != null) {
                qh9Var17.q("invert_colors_enabled", bool11);
            }
            Boolean bool12 = pviVar.h;
            if (bool12 != null) {
                qh9Var17.q("increase_contrast_enabled", bool12);
            }
            Boolean bool13 = pviVar.i;
            if (bool13 != null) {
                qh9Var17.q("assistive_switch_enabled", bool13);
            }
            Boolean bool14 = pviVar.j;
            if (bool14 != null) {
                qh9Var17.q("assistive_touch_enabled", bool14);
            }
            Boolean bool15 = pviVar.k;
            if (bool15 != null) {
                qh9Var17.q("video_autoplay_enabled", bool15);
            }
            Boolean bool16 = pviVar.l;
            if (bool16 != null) {
                qh9Var17.q("closed_captioning_enabled", bool16);
            }
            Boolean bool17 = pviVar.m;
            if (bool17 != null) {
                qh9Var17.q("mono_audio_enabled", bool17);
            }
            Boolean bool18 = pviVar.n;
            if (bool18 != null) {
                qh9Var17.q("shake_to_undo_enabled", bool18);
            }
            Boolean bool19 = pviVar.o;
            if (bool19 != null) {
                qh9Var17.q("reduced_animations_enabled", bool19);
            }
            Boolean bool20 = pviVar.p;
            if (bool20 != null) {
                qh9Var17.q("should_differentiate_without_color", bool20);
            }
            Boolean bool21 = pviVar.q;
            if (bool21 != null) {
                qh9Var17.q("grayscale_enabled", bool21);
            }
            Boolean bool22 = pviVar.r;
            if (bool22 != null) {
                qh9Var17.q("single_app_mode_enabled", bool22);
            }
            Boolean bool23 = pviVar.s;
            if (bool23 != null) {
                qh9Var17.q("on_off_switch_labels_enabled", bool23);
            }
            Boolean bool24 = pviVar.t;
            if (bool24 != null) {
                qh9Var17.q("speak_screen_enabled", bool24);
            }
            Boolean bool25 = pviVar.u;
            if (bool25 != null) {
                qh9Var17.q("speak_selection_enabled", bool25);
            }
            Boolean bool26 = pviVar.v;
            if (bool26 != null) {
                qh9Var17.q("rtl_enabled", bool26);
            }
            qh9Var4.o("accessibility", qh9Var17);
        }
        qh9Var.o("view", qh9Var4);
        ixi ixiVar = this.k;
        if (ixiVar != null) {
            qh9 qh9Var18 = new qh9();
            String str18 = ixiVar.a;
            if (str18 != null) {
                qh9Var18.r("id", str18);
            }
            String str19 = ixiVar.b;
            if (str19 != null) {
                qh9Var18.r("name", str19);
            }
            String str20 = ixiVar.c;
            if (str20 != null) {
                qh9Var18.r("email", str20);
            }
            String str21 = ixiVar.d;
            if (str21 != null) {
                qh9Var18.r("anonymous_id", str21);
            }
            for (Map.Entry entry2 : ixiVar.e.entrySet()) {
                String str22 = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (!mp0.o0(str22, ixi.f)) {
                    qh9Var18.o(str22, vz8.M(value));
                }
            }
            qh9Var.o("usr", qh9Var18);
        }
        qvi qviVar = this.l;
        if (qviVar != null) {
            qh9 qh9Var19 = new qh9();
            qh9Var19.r("id", qviVar.a);
            String str23 = qviVar.b;
            if (str23 != null) {
                qh9Var19.r("name", str23);
            }
            for (Map.Entry entry3 : qviVar.c.entrySet()) {
                String str24 = (String) entry3.getKey();
                Object value2 = entry3.getValue();
                if (!mp0.o0(str24, qvi.d)) {
                    qh9Var19.o(str24, vz8.M(value2));
                }
            }
            qh9Var.o("account", qh9Var19);
        }
        wvi wviVar = this.m;
        if (wviVar != null) {
            qh9 qh9Var20 = new qh9();
            qh9Var20.o("status", new vh9(kgh.c(wviVar.a)));
            List list3 = wviVar.b;
            if (list3 != null) {
                ig9 ig9Var3 = new ig9(list3.size());
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    ig9Var3.o(new vh9(((rwi) it3.next()).E));
                }
                qh9Var20.o("interfaces", ig9Var3);
            }
            int i3 = wviVar.c;
            if (i3 != 0) {
                qh9Var20.o("effective_type", new vh9(kgh.f(i3)));
            }
            tvi tviVar = wviVar.d;
            if (tviVar != null) {
                qh9 qh9Var21 = new qh9();
                String str25 = tviVar.a;
                if (str25 != null) {
                    qh9Var21.r("technology", str25);
                }
                String str26 = tviVar.b;
                if (str26 != null) {
                    qh9Var21.r("carrier_name", str26);
                }
                qh9Var20.o("cellular", qh9Var21);
            }
            qh9Var.o("connectivity", qh9Var20);
        }
        gwi gwiVar = this.n;
        if (gwiVar != null) {
            qh9 qh9Var22 = new qh9();
            lxi lxiVar = gwiVar.a;
            if (lxiVar != null) {
                qh9Var22.o("viewport", lxiVar.a());
            }
            fxi fxiVar = gwiVar.b;
            if (fxiVar != null) {
                qh9Var22.o("scroll", fxiVar.a());
            }
            qh9Var.o("display", qh9Var22);
        }
        hxi hxiVar = this.o;
        if (hxiVar != null) {
            qh9 qh9Var23 = new qh9();
            qh9Var23.r("test_id", hxiVar.a);
            qh9Var23.r("result_id", hxiVar.b);
            Boolean bool27 = hxiVar.c;
            if (bool27 != null) {
                qh9Var23.q("injected", bool27);
            }
            for (Map.Entry entry4 : hxiVar.d.entrySet()) {
                String str27 = (String) entry4.getKey();
                Object value3 = entry4.getValue();
                if (!mp0.o0(str27, hxi.e)) {
                    qh9Var23.o(str27, vz8.M(value3));
                }
            }
            qh9Var.o("synthetics", qh9Var23);
        }
        uvi uviVar = this.p;
        if (uviVar != null) {
            qh9 qh9Var24 = new qh9();
            qh9Var24.r("test_execution_id", uviVar.a);
            qh9Var.o("ci_test", qh9Var24);
        }
        vwi vwiVar = this.q;
        if (vwiVar != null) {
            qh9 qh9Var25 = new qh9();
            qh9Var25.r("name", vwiVar.a);
            qh9Var25.r("version", vwiVar.b);
            String str28 = vwiVar.c;
            if (str28 != null) {
                qh9Var25.r("build", str28);
            }
            qh9Var25.r("version_major", vwiVar.d);
            qh9Var.o("os", qh9Var25);
        }
        fwi fwiVar = this.r;
        if (fwiVar != null) {
            qh9 qh9Var26 = new qh9();
            int i4 = fwiVar.a;
            if (i4 != 0) {
                qh9Var26.o("type", new vh9(kgh.d(i4)));
            }
            String str29 = fwiVar.b;
            if (str29 != null) {
                qh9Var26.r("name", str29);
            }
            String str30 = fwiVar.c;
            if (str30 != null) {
                qh9Var26.r("model", str30);
            }
            String str31 = fwiVar.d;
            if (str31 != null) {
                qh9Var26.r("brand", str31);
            }
            String str32 = fwiVar.e;
            if (str32 != null) {
                qh9Var26.r("architecture", str32);
            }
            String str33 = fwiVar.f;
            if (str33 != null) {
                qh9Var26.r("locale", str33);
            }
            List list4 = fwiVar.g;
            if (list4 != null) {
                ig9 ig9Var4 = new ig9(list4.size());
                Iterator it4 = list4.iterator();
                while (it4.hasNext()) {
                    ig9Var4.p((String) it4.next());
                }
                qh9Var26.o("locales", ig9Var4);
            }
            String str34 = fwiVar.h;
            if (str34 != null) {
                qh9Var26.r("time_zone", str34);
            }
            Number number10 = fwiVar.i;
            if (number10 != null) {
                qh9Var26.p(number10, "battery_level");
            }
            Boolean bool28 = fwiVar.j;
            if (bool28 != null) {
                qh9Var26.q("power_saving_mode", bool28);
            }
            Number number11 = fwiVar.k;
            if (number11 != null) {
                qh9Var26.p(number11, "brightness_level");
            }
            Number number12 = fwiVar.l;
            if (number12 != null) {
                qh9Var26.p(number12, "logical_cpu_count");
            }
            Number number13 = fwiVar.m;
            if (number13 != null) {
                qh9Var26.p(number13, "total_ram");
            }
            Boolean bool29 = fwiVar.n;
            if (bool29 != null) {
                qh9Var26.q("is_low_ram", bool29);
            }
            qh9Var.o("device", qh9Var26);
        }
        qh9 qh9Var27 = new qh9();
        qh9Var27.p(2L, "format_version");
        cwi cwiVar = this.s;
        ewi ewiVar = cwiVar.a;
        if (ewiVar != null) {
            qh9 qh9Var28 = new qh9();
            zwi zwiVar = ewiVar.a;
            if (zwiVar != null) {
                qh9Var28.o("plan", new vh9(zwiVar.E));
            }
            int i5 = ewiVar.b;
            if (i5 != 0) {
                qh9Var28.o("session_precondition", new vh9(kgh.h(i5)));
            }
            qh9Var27.o(str2, qh9Var28);
        }
        vvi vviVar = cwiVar.b;
        if (vviVar != null) {
            qh9 qh9Var29 = new qh9();
            qh9Var29.p(vviVar.a, "session_sample_rate");
            Number number14 = vviVar.b;
            if (number14 != null) {
                qh9Var29.p(number14, "session_replay_sample_rate");
            }
            Number number15 = vviVar.c;
            if (number15 != null) {
                qh9Var29.p(number15, "profiling_sample_rate");
            }
            Number number16 = vviVar.d;
            if (number16 != null) {
                qh9Var29.p(number16, "trace_sample_rate");
            }
            Boolean bool30 = vviVar.e;
            if (bool30 != null) {
                qh9Var29.q("start_session_replay_recording_manually", bool30);
            }
            qh9Var27.o("configuration", qh9Var29);
        }
        String str35 = cwiVar.c;
        if (str35 != null) {
            qh9Var27.r("browser_sdk_version", str35);
        }
        String str36 = cwiVar.d;
        if (str36 != null) {
            qh9Var27.r("sdk_name", str36);
        }
        qh9Var27.p(Long.valueOf(cwiVar.e), "document_version");
        List list5 = cwiVar.f;
        if (list5 != null) {
            ig9 ig9Var5 = new ig9(list5.size());
            Iterator it5 = list5.iterator();
            while (it5.hasNext()) {
                ig9Var5.o(((wwi) it5.next()).a());
            }
            qh9Var27.o("page_states", ig9Var5);
        }
        dxi dxiVar = cwiVar.g;
        if (dxiVar != null) {
            qh9 qh9Var30 = new qh9();
            Long l16 = dxiVar.a;
            if (l16 != null) {
                grc.A(l16, qh9Var30, "records_count");
            }
            Long l17 = dxiVar.b;
            if (l17 != null) {
                grc.A(l17, qh9Var30, "segments_count");
            }
            Long l18 = dxiVar.c;
            if (l18 != null) {
                grc.A(l18, qh9Var30, "segments_total_raw_size");
            }
            qh9Var27.o("replay_stats", qh9Var30);
        }
        dwi dwiVar = cwiVar.h;
        if (dwiVar != null) {
            qh9 qh9Var31 = new qh9();
            Number number17 = dwiVar.a;
            if (number17 != null) {
                qh9Var31.p(number17, "device_pixel_ratio");
            }
            qh9Var27.o("cls", qh9Var31);
        }
        cxi cxiVar = cwiVar.i;
        if (cxiVar != null) {
            qh9 qh9Var32 = new qh9();
            int i6 = cxiVar.a;
            if (i6 != 0) {
                qh9Var32.o("status", fsh.b(i6));
            }
            int i7 = cxiVar.b;
            if (i7 != 0) {
                qh9Var32.o("error_reason", fsh.a(i7));
            }
            qh9Var27.o("profiling", qh9Var32);
        }
        qh9Var.o("_dd", qh9Var27);
        zvi zviVar = this.t;
        if (zviVar != null) {
            qh9Var.o("context", zviVar.a());
        }
        xvi xviVar = this.u;
        if (xviVar != null) {
            qh9 qh9Var33 = new qh9();
            qh9Var33.o("view", xviVar.a.a());
            qh9Var33.o(str, new vh9(kgh.j(xviVar.b)));
            qh9Var.o("container", qh9Var33);
        }
        zvi zviVar2 = this.v;
        if (zviVar2 != null) {
            qh9Var.o("feature_flags", zviVar2.a());
        }
        bxi bxiVar = this.w;
        if (bxiVar != null) {
            qh9 qh9Var34 = new qh9();
            qh9Var34.o("replay_level", fsh.c(bxiVar.a));
            qh9Var.o("privacy", qh9Var34);
        }
        qh9Var.r("type", "view");
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxi)) {
            return false;
        }
        mxi mxiVar = (mxi) obj;
        return this.a == mxiVar.a && this.b.equals(mxiVar.b) && x44.r(this.c, mxiVar.c) && x44.r(this.d, mxiVar.d) && x44.r(this.e, mxiVar.e) && x44.r(this.f, mxiVar.f) && x44.r(this.g, mxiVar.g) && this.h.equals(mxiVar.h) && this.i == mxiVar.i && this.j.equals(mxiVar.j) && x44.r(this.k, mxiVar.k) && x44.r(this.l, mxiVar.l) && x44.r(this.m, mxiVar.m) && x44.r(this.n, mxiVar.n) && x44.r(this.o, mxiVar.o) && x44.r(this.p, mxiVar.p) && x44.r(this.q, mxiVar.q) && x44.r(this.r, mxiVar.r) && this.s.equals(mxiVar.s) && x44.r(this.t, mxiVar.t) && x44.r(this.u, mxiVar.u) && x44.r(this.v, mxiVar.v) && x44.r(this.w, mxiVar.w);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode6 = (this.h.hashCode() + ((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31;
        int i = this.i;
        int iHashCode7 = (this.j.hashCode() + ((iHashCode6 + (i == 0 ? 0 : sq6.F(i))) * 31)) * 31;
        ixi ixiVar = this.k;
        int iHashCode8 = (iHashCode7 + (ixiVar == null ? 0 : ixiVar.hashCode())) * 31;
        qvi qviVar = this.l;
        int iHashCode9 = (iHashCode8 + (qviVar == null ? 0 : qviVar.hashCode())) * 31;
        wvi wviVar = this.m;
        int iHashCode10 = (iHashCode9 + (wviVar == null ? 0 : wviVar.hashCode())) * 31;
        gwi gwiVar = this.n;
        int iHashCode11 = (iHashCode10 + (gwiVar == null ? 0 : gwiVar.hashCode())) * 31;
        hxi hxiVar = this.o;
        int iHashCode12 = (iHashCode11 + (hxiVar == null ? 0 : hxiVar.hashCode())) * 31;
        uvi uviVar = this.p;
        int iHashCode13 = (iHashCode12 + (uviVar == null ? 0 : uviVar.a.hashCode())) * 31;
        vwi vwiVar = this.q;
        int iHashCode14 = (iHashCode13 + (vwiVar == null ? 0 : vwiVar.hashCode())) * 31;
        fwi fwiVar = this.r;
        int iHashCode15 = (this.s.hashCode() + ((iHashCode14 + (fwiVar == null ? 0 : fwiVar.hashCode())) * 31)) * 31;
        zvi zviVar = this.t;
        int iHashCode16 = (iHashCode15 + (zviVar == null ? 0 : zviVar.a.hashCode())) * 31;
        xvi xviVar = this.u;
        int iHashCode17 = (iHashCode16 + (xviVar == null ? 0 : xviVar.hashCode())) * 31;
        zvi zviVar2 = this.v;
        int iHashCode18 = (iHashCode17 + (zviVar2 == null ? 0 : zviVar2.a.hashCode())) * 31;
        bxi bxiVar = this.w;
        return iHashCode18 + (bxiVar != null ? sq6.F(bxiVar.a) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewEvent(date=");
        sb.append(this.a);
        sb.append(", application=");
        sb.append(this.b);
        kgh.u(sb, ", service=", this.c, ", version=", this.d);
        kgh.u(sb, ", buildVersion=", this.e, ", buildId=", this.f);
        sb.append(", ddtags=");
        sb.append(this.g);
        sb.append(", session=");
        sb.append(this.h);
        sb.append(", source=");
        sb.append(kgh.w(this.i));
        sb.append(", view=");
        sb.append(this.j);
        sb.append(", usr=");
        sb.append(this.k);
        sb.append(", account=");
        sb.append(this.l);
        sb.append(", connectivity=");
        sb.append(this.m);
        sb.append(", display=");
        sb.append(this.n);
        sb.append(", synthetics=");
        sb.append(this.o);
        sb.append(", ciTest=");
        sb.append(this.p);
        sb.append(", os=");
        sb.append(this.q);
        sb.append(", device=");
        sb.append(this.r);
        sb.append(", dd=");
        sb.append(this.s);
        sb.append(", context=");
        sb.append(this.t);
        sb.append(", container=");
        sb.append(this.u);
        sb.append(", featureFlags=");
        sb.append(this.v);
        sb.append(", privacy=");
        sb.append(this.w);
        sb.append(")");
        return sb.toString();
    }
}
