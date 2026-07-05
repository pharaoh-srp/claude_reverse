package defpackage;

import com.google.gson.JsonParseException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class iek {
    public static s4i a;

    public static kxi a(qh9 qh9Var) {
        String str;
        ArrayList arrayList;
        exi exiVar;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String strM;
        try {
            String strM2 = qh9Var.s("id").m();
            bh9 bh9VarS = qh9Var.s("referrer");
            String strM3 = bh9VarS != null ? bh9VarS.m() : null;
            String strM4 = qh9Var.s("url").m();
            bh9 bh9VarS2 = qh9Var.s("name");
            String strM5 = bh9VarS2 != null ? bh9VarS2.m() : null;
            bh9 bh9VarS3 = qh9Var.s("loading_time");
            Long lValueOf = bh9VarS3 != null ? Long.valueOf(bh9VarS3.k()) : null;
            bh9 bh9VarS4 = qh9Var.s("network_settled_time");
            Long lValueOf2 = bh9VarS4 != null ? Long.valueOf(bh9VarS4.k()) : null;
            bh9 bh9VarS5 = qh9Var.s("interaction_to_next_view_time");
            Long lValueOf3 = bh9VarS5 != null ? Long.valueOf(bh9VarS5.k()) : null;
            bh9 bh9VarS6 = qh9Var.s("loading_type");
            int iD = (bh9VarS6 == null || (strM = bh9VarS6.m()) == null) ? 0 : bhk.d(strM);
            long jK = qh9Var.s("time_spent").k();
            bh9 bh9VarS7 = qh9Var.s("first_contentful_paint");
            Long lValueOf4 = bh9VarS7 != null ? Long.valueOf(bh9VarS7.k()) : null;
            bh9 bh9VarS8 = qh9Var.s("largest_contentful_paint");
            Long lValueOf5 = bh9VarS8 != null ? Long.valueOf(bh9VarS8.k()) : null;
            bh9 bh9VarS9 = qh9Var.s("largest_contentful_paint_target_selector");
            String strM6 = bh9VarS9 != null ? bh9VarS9.m() : null;
            bh9 bh9VarS10 = qh9Var.s("first_input_delay");
            Long lValueOf6 = bh9VarS10 != null ? Long.valueOf(bh9VarS10.k()) : null;
            bh9 bh9VarS11 = qh9Var.s("first_input_time");
            Long lValueOf7 = bh9VarS11 != null ? Long.valueOf(bh9VarS11.k()) : null;
            bh9 bh9VarS12 = qh9Var.s("first_input_target_selector");
            String strM7 = bh9VarS12 != null ? bh9VarS12.m() : null;
            bh9 bh9VarS13 = qh9Var.s("interaction_to_next_paint");
            Long lValueOf8 = bh9VarS13 != null ? Long.valueOf(bh9VarS13.k()) : null;
            bh9 bh9VarS14 = qh9Var.s("interaction_to_next_paint_time");
            Long lValueOf9 = bh9VarS14 != null ? Long.valueOf(bh9VarS14.k()) : null;
            bh9 bh9VarS15 = qh9Var.s("interaction_to_next_paint_target_selector");
            String strM8 = bh9VarS15 != null ? bh9VarS15.m() : null;
            bh9 bh9VarS16 = qh9Var.s("cumulative_layout_shift");
            Number numberL = bh9VarS16 != null ? bh9VarS16.l() : null;
            bh9 bh9VarS17 = qh9Var.s("cumulative_layout_shift_time");
            Long lValueOf10 = bh9VarS17 != null ? Long.valueOf(bh9VarS17.k()) : null;
            bh9 bh9VarS18 = qh9Var.s("cumulative_layout_shift_target_selector");
            String strM9 = bh9VarS18 != null ? bh9VarS18.m() : null;
            bh9 bh9VarS19 = qh9Var.s("dom_complete");
            Long lValueOf11 = bh9VarS19 != null ? Long.valueOf(bh9VarS19.k()) : null;
            bh9 bh9VarS20 = qh9Var.s("dom_content_loaded");
            Long lValueOf12 = bh9VarS20 != null ? Long.valueOf(bh9VarS20.k()) : null;
            bh9 bh9VarS21 = qh9Var.s("dom_interactive");
            Long lValueOf13 = bh9VarS21 != null ? Long.valueOf(bh9VarS21.k()) : null;
            bh9 bh9VarS22 = qh9Var.s("load_event");
            Long lValueOf14 = bh9VarS22 != null ? Long.valueOf(bh9VarS22.k()) : null;
            bh9 bh9VarS23 = qh9Var.s("first_byte");
            Long lValueOf15 = bh9VarS23 != null ? Long.valueOf(bh9VarS23.k()) : null;
            bh9 bh9VarS24 = qh9Var.s("custom_timings");
            bwi bwiVarM = bh9VarS24 != null ? lwj.m(bh9VarS24.g()) : null;
            bh9 bh9VarS25 = qh9Var.s("is_active");
            Boolean boolValueOf = bh9VarS25 != null ? Boolean.valueOf(bh9VarS25.a()) : null;
            bh9 bh9VarS26 = qh9Var.s("is_slow_rendered");
            Boolean boolValueOf2 = bh9VarS26 != null ? Boolean.valueOf(bh9VarS26.a()) : null;
            rvi rviVarF = ez1.F(qh9Var.s("action").g());
            hwi hwiVarA = pjj.a(qh9Var.s("error").g());
            bh9 bh9VarS27 = qh9Var.s("crash");
            awi awiVarA = bh9VarS27 != null ? dej.a(bh9VarS27.g()) : null;
            bh9 bh9VarS28 = qh9Var.s("long_task");
            uwi uwiVarA = bh9VarS28 != null ? bsj.a(bh9VarS28.g()) : null;
            bh9 bh9VarS29 = qh9Var.s("frozen_frame");
            mwi mwiVarB = bh9VarS29 != null ? skj.b(bh9VarS29.g()) : null;
            bh9 bh9VarS30 = qh9Var.s("slow_frames");
            if (bh9VarS30 != null) {
                ig9 ig9VarE = bh9VarS30.e();
                str = strM2;
                arrayList = new ArrayList(ig9VarE.E.size());
                Iterator it = ig9VarE.iterator();
                while (it.hasNext()) {
                    arrayList.add(gik.f(((bh9) it.next()).g()));
                }
            } else {
                str = strM2;
                arrayList = null;
            }
            exi exiVarA = pwj.a(qh9Var.s("resource").g());
            bh9 bh9VarS31 = qh9Var.s("frustration");
            nwi nwiVarA = bh9VarS31 != null ? vpj.a(bh9VarS31.g()) : null;
            bh9 bh9VarS32 = qh9Var.s("in_foreground_periods");
            if (bh9VarS32 != null) {
                ig9 ig9VarE2 = bh9VarS32.e();
                exiVar = exiVarA;
                arrayList2 = arrayList;
                arrayList3 = new ArrayList(ig9VarE2.E.size());
                Iterator it2 = ig9VarE2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(xwj.d(((bh9) it2.next()).g()));
                }
            } else {
                exiVar = exiVarA;
                arrayList2 = arrayList;
                arrayList3 = null;
            }
            bh9 bh9VarS33 = qh9Var.s("memory_average");
            Number numberL2 = bh9VarS33 != null ? bh9VarS33.l() : null;
            bh9 bh9VarS34 = qh9Var.s("memory_max");
            Number numberL3 = bh9VarS34 != null ? bh9VarS34.l() : null;
            bh9 bh9VarS35 = qh9Var.s("cpu_ticks_count");
            Number numberL4 = bh9VarS35 != null ? bh9VarS35.l() : null;
            bh9 bh9VarS36 = qh9Var.s("cpu_ticks_per_second");
            Number numberL5 = bh9VarS36 != null ? bh9VarS36.l() : null;
            bh9 bh9VarS37 = qh9Var.s("refresh_rate_average");
            Number numberL6 = bh9VarS37 != null ? bh9VarS37.l() : null;
            bh9 bh9VarS38 = qh9Var.s("refresh_rate_min");
            Number numberL7 = bh9VarS38 != null ? bh9VarS38.l() : null;
            bh9 bh9VarS39 = qh9Var.s("slow_frames_rate");
            Number numberL8 = bh9VarS39 != null ? bh9VarS39.l() : null;
            bh9 bh9VarS40 = qh9Var.s("freeze_rate");
            Number numberL9 = bh9VarS40 != null ? bh9VarS40.l() : null;
            bh9 bh9VarS41 = qh9Var.s("flutter_build_time");
            lwi lwiVarE = bh9VarS41 != null ? uwj.e(bh9VarS41.g()) : null;
            bh9 bh9VarS42 = qh9Var.s("flutter_raster_time");
            lwi lwiVarE2 = bh9VarS42 != null ? uwj.e(bh9VarS42.g()) : null;
            bh9 bh9VarS43 = qh9Var.s("js_refresh_rate");
            lwi lwiVarE3 = bh9VarS43 != null ? uwj.e(bh9VarS43.g()) : null;
            bh9 bh9VarS44 = qh9Var.s("performance");
            xwi xwiVarJ = bh9VarS44 != null ? ghk.j(bh9VarS44.g()) : null;
            bh9 bh9VarS45 = qh9Var.s("accessibility");
            pvi pviVarK = bh9VarS45 != null ? awj.k(bh9VarS45.g()) : null;
            ArrayList arrayList4 = arrayList2;
            Number number = numberL2;
            str.getClass();
            strM4.getClass();
            return new kxi(str, strM3, strM4, strM5, lValueOf, lValueOf2, lValueOf3, iD, jK, lValueOf4, lValueOf5, strM6, lValueOf6, lValueOf7, strM7, lValueOf8, lValueOf9, strM8, numberL, lValueOf10, strM9, lValueOf11, lValueOf12, lValueOf13, lValueOf14, lValueOf15, bwiVarM, boolValueOf, boolValueOf2, rviVarF, hwiVarA, awiVarA, uwiVarA, mwiVarB, arrayList4, exiVar, nwiVarA, arrayList3, number, numberL3, numberL4, numberL5, numberL6, numberL7, numberL8, numberL9, lwiVarE, lwiVarE2, lwiVarE3, xwiVarJ, pviVarK);
        } catch (IllegalStateException e) {
            throw new JsonParseException(e);
        } catch (NullPointerException e2) {
            throw new JsonParseException(e2);
        } catch (NumberFormatException e3) {
            throw new JsonParseException(e3);
        }
    }
}
