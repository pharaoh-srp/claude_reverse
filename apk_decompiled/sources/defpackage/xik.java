package defpackage;

import androidx.health.platform.client.proto.c;
import androidx.health.platform.client.proto.e;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.account.RavenType;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xik {
    public static final ta4 a = new ta4(-1571120048, false, new lb4());
    public static final ta4 b = new ta4(-1455401925, false, new hb4(4));
    public static final jf7[] c = {new jf7("name_ulr_private", 1), new jf7("name_sleep_segment_request", 1), new jf7("get_last_activity_feature_id", 1), new jf7("support_context_feature_id", 1), new jf7("get_current_location", 2), new jf7("get_last_location_with_request", 1), new jf7("set_mock_mode_with_callback", 1), new jf7("set_mock_location_with_callback", 1), new jf7("inject_location_with_callback", 1), new jf7("location_updates_with_callback", 1), new jf7("use_safe_parcelable_in_intents", 1), new jf7("flp_debug_updates", 1), new jf7("google_location_accuracy_enabled", 1), new jf7("geofences_with_callback", 1), new jf7("location_enabled", 1)};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean, int] */
    public static final void a(by2 by2Var, bz7 bz7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        iqb iqbVar2;
        String strJ0;
        ?? r2;
        int i3;
        by2Var.getClass();
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1234543772);
        if ((i & 6) == 0) {
            i2 = i | (e18Var.d(by2Var.ordinal()) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(bz7Var) ? 32 : 16;
        }
        int i4 = i2 | 384;
        if (e18Var.Q(i4 & 1, (i4 & 147) != 146)) {
            Object[] objArr = new Object[0];
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new xq2(22);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN, e18Var, 48);
            boolean z = by2Var != by2.E;
            String strJ02 = d4c.j0(R.string.chat_list_filter_chats_a11y, e18Var);
            String strJ03 = d4c.j0(R.string.chat_list_filter_change_a11y, e18Var);
            if (z) {
                e18Var.a0(985606365);
                int iOrdinal = by2Var.ordinal();
                if (iOrdinal == 0) {
                    i3 = R.string.chats_filter_all;
                } else {
                    if (iOrdinal != 1) {
                        wg6.i();
                        return;
                    }
                    i3 = R.string.chats_filter_starred;
                }
                strJ0 = d4c.j0(i3, e18Var);
                e18Var.p(false);
            } else {
                e18Var.a0(489064033);
                e18Var.p(false);
                strJ0 = null;
            }
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            fqb fqbVar = fqb.E;
            iqb iqbVarE = kxk.E(e18Var, fqbVar);
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
            boolean zF = e18Var.f(nwbVar);
            Object objN2 = e18Var.N();
            if (zF || objN2 == lz1Var) {
                objN2 = new ve(29, nwbVar);
                e18Var.k0(objN2);
            }
            zy7 zy7Var = (zy7) objN2;
            boolean zF2 = e18Var.f(strJ02) | e18Var.f(strJ03) | e18Var.f(strJ0);
            Object objN3 = e18Var.N();
            if (zF2 || objN3 == lz1Var) {
                r2 = 0;
                objN3 = new cy2(strJ02, strJ03, strJ0, 0 == true ? 1 : 0);
                e18Var.k0(objN3);
            } else {
                r2 = 0;
            }
            ez1.e(zy7Var, tjf.b(fqbVar, r2, (bz7) objN3), false, null, null, fd9.q0(-1435696008, new xb2(z, by2Var, 1), e18Var), e18Var, 1572864, 60);
            boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
            boolean zF3 = e18Var.f(nwbVar);
            Object objN4 = e18Var.N();
            if (zF3 || objN4 == lz1Var) {
                objN4 = new dy2(r2, nwbVar);
                e18Var.k0(objN4);
            }
            j8.b(zBooleanValue, (zy7) objN4, null, (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) << 32) | (((long) Float.floatToRawIntBits(8.0f)) & 4294967295L), null, null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(1700735379, new ye(by2Var, bz7Var, nwbVar, 15), e18Var), e18Var, 3072, 2036);
            e18Var = e18Var;
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ji(i, 10, iqbVar2, by2Var, bz7Var);
        }
    }

    public static hu6 b(int i, String str) {
        int iIntValue;
        Object obj;
        Field[] declaredFields = yr6.class.getDeclaredFields();
        declaredFields.getClass();
        ArrayList arrayList = new ArrayList();
        for (Field field : declaredFields) {
            if (field.getType().isAssignableFrom(Integer.TYPE)) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            iIntValue = yr6.INTERNAL_ERROR;
            obj = null;
            if (!zHasNext) {
                break;
            }
            try {
                Object obj2 = ((Field) it.next()).get(null);
                obj2.getClass();
                iIntValue = ((Integer) obj2).intValue();
            } catch (IllegalAccessException unused) {
            }
            arrayList2.add(Integer.valueOf(iIntValue));
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((Number) next).intValue() == i) {
                obj = next;
                break;
            }
        }
        Integer num = (Integer) obj;
        if (num != null) {
            iIntValue = num.intValue();
        }
        return new hu6(iIntValue, str);
    }

    public static final e92 c(LinkedList linkedList) {
        Integer numB;
        linkedList.isEmpty();
        Iterator it = linkedList.iterator();
        e92 e92Var = null;
        while (it.hasNext()) {
            e92 e92Var2 = (e92) it.next();
            if (e92Var == null || ((numB = q06.b(e92Var.getVisibility(), e92Var2.getVisibility())) != null && numB.intValue() < 0)) {
                e92Var = e92Var2;
            }
        }
        e92Var.getClass();
        return e92Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        r3.add(r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.gla d(defpackage.qh9 r13) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xik.d(qh9):gla");
    }

    public static final hs e(c cVar) {
        Map mapT = cVar.t();
        mapT.getClass();
        Map mapQ = cVar.q();
        mapQ.getClass();
        o89 o89VarP = cVar.p();
        o89VarP.getClass();
        HashSet hashSet = new HashSet();
        Iterator<E> it = o89VarP.iterator();
        while (it.hasNext()) {
            String strQ = ((e) it.next()).q();
            strQ.getClass();
            hashSet.add(new cg5(strQ));
        }
        return new hs(mapT, mapQ, hashSet);
    }

    public static final String f(pvg pvgVar, RavenType ravenType, ld4 ld4Var) {
        e18 e18Var;
        int i;
        int i2;
        int i3;
        int i4;
        pvgVar.getClass();
        int iOrdinal = pvgVar.ordinal();
        if (iOrdinal == 0) {
            e18Var = (e18) ld4Var;
            i = R.string.subscription_level_free;
            i2 = 734365529;
        } else if (iOrdinal == 1) {
            e18Var = (e18) ld4Var;
            i = R.string.subscription_level_pro;
            i2 = 734368216;
        } else {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw ebh.u((e18) ld4Var, 734364453, false);
                }
                e18 e18Var2 = (e18) ld4Var;
                e18Var2.a0(1290749679);
                if ((ravenType == null ? -1 : uwg.a[ravenType.ordinal()]) == 1) {
                    i3 = 734375365;
                    i4 = R.string.subscription_level_raven_enterprise;
                } else {
                    i3 = 734378015;
                    i4 = R.string.subscription_level_raven_team;
                }
                String strN = vb7.n(e18Var2, i3, i4, e18Var2, false);
                e18Var2.p(false);
                return strN;
            }
            e18Var = (e18) ld4Var;
            i = R.string.subscription_level_max;
            i2 = 734370872;
        }
        return vb7.n(e18Var, i2, i, e18Var, false);
    }
}
