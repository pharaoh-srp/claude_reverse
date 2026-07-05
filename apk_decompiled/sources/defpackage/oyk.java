package defpackage;

import com.anthropic.claude.analytics.events.ProUpsellEvents$StoreViewPurchaseErrorKind;
import com.anthropic.claude.sessions.types.PermissionMode;
import com.anthropic.claude.sessions.types.SdkControlCancelRequestEvent;
import com.anthropic.claude.sessions.types.SdkControlRequestEvent;
import com.anthropic.claude.sessions.types.SdkControlResponseEvent;
import com.anthropic.claude.sessions.types.SdkEnvManagerLogEvent;
import com.anthropic.claude.sessions.types.SdkEvent;
import com.anthropic.claude.sessions.types.SdkMessageEvent;
import com.anthropic.claude.sessions.types.SdkPromptSuggestionEvent;
import com.anthropic.claude.sessions.types.SdkRateLimitEvent;
import com.anthropic.claude.sessions.types.SdkResultEvent;
import com.anthropic.claude.sessions.types.SdkStreamEvent;
import com.anthropic.claude.sessions.types.SdkSystemEvent;
import com.anthropic.claude.sessions.types.SdkToolProgressEvent;
import com.anthropic.claude.sessions.types.SdkToolUseSummaryEvent;
import com.anthropic.claude.sessions.types.SdkUnknownEvent;
import com.anthropic.claude.ui.demo.app.UiDemoAppDestination;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oyk {
    public static iyk a;
    public static final xb b = new xb(4);

    public static final void a(iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-786220968);
        int i2 = (e18Var.f(iqbVar) ? 4 : 2) | i | 16;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            e18Var.V();
            int i3 = i & 1;
            tp4 tp4Var = null;
            lz1 lz1Var = jd4.a;
            if (i3 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(idi.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                if (objN != null) {
                    mr9.o();
                    return;
                }
            } else {
                e18Var.T();
            }
            int i4 = i2 & (-113);
            e18Var.q();
            boolean zH = e18Var.h(null);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new n7h(29);
                e18Var.k0(objN2);
            }
            kce kceVar = jce.a;
            rwe rweVarP = eve.P(kceVar.b(UiDemoAppDestination.class), oq5.B(kceVar.b(UiDemoAppDestination.class)), true, iv1.M(kceVar.b(UiDemoAppDestination.class)), (zy7) objN2, e18Var);
            e18Var = e18Var;
            lsc lscVar = rweVarP.F;
            ie3 ie3Var = ((bf3) lscVar.getValue()).a;
            boolean zH2 = e18Var.h(null) | e18Var.f(lscVar);
            Object objN3 = e18Var.N();
            if (zH2 || objN3 == lz1Var) {
                objN3 = new l6b(lscVar, tp4Var, 12);
                e18Var.k0(objN3);
            }
            fd9.i(e18Var, (pz7) objN3, ie3Var);
            iqbVar2 = iqbVar;
            mwa.k((bf3) lscVar.getValue(), iqbVar2, csg.q(rweVarP, e18Var, 392), fd9.q0(1273990651, new ci(9, rweVarP), e18Var), e18Var, ((i4 << 3) & 112) | 3072);
        } else {
            iqbVar2 = iqbVar;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fl(i, 28, iqbVar2);
        }
    }

    public static final String b(nf0 nf0Var) {
        if (nf0Var instanceof lf0) {
            lf0 lf0Var = (lf0) nf0Var;
            String e = lf0Var.b.getA();
            return e == null ? grc.p(lf0Var.a, "HTTP ") : e;
        }
        if (nf0Var instanceof mf0) {
            String message = ((mf0) nf0Var).a.getMessage();
            return message == null ? "Unknown error" : message;
        }
        wg6.i();
        return null;
    }

    public static final ozf c(Integer num) {
        if (num != null && num.intValue() == 0) {
            return null;
        }
        if (num != null && num.intValue() == 1) {
            return null;
        }
        if (num != null && num.intValue() == 12) {
            return null;
        }
        if (num != null && num.intValue() == 2) {
            return null;
        }
        if (num != null && num.intValue() == -1) {
            return null;
        }
        if (num != null && num.intValue() == -3) {
            return null;
        }
        if (num != null && num.intValue() == 3) {
            return null;
        }
        if (num != null && num.intValue() == 5) {
            return ozf.G;
        }
        ozf ozfVar = ozf.F;
        if ((num == null || num.intValue() != -2) && ((num == null || num.intValue() != 4) && ((num == null || num.intValue() != 7) && ((num == null || num.intValue() != 8) && num != null)))) {
            num.intValue();
        }
        return ozfVar;
    }

    public static final String d(qqb qqbVar, c0l c0lVar) {
        qqbVar.getClass();
        c0lVar.getClass();
        bo5 bo5VarH = qqbVar.h();
        bo5VarH.getClass();
        sxb name = qqbVar.getName();
        sxb sxbVar = ygg.a;
        if (name == null || name.F) {
            name = ygg.c;
        }
        String strC = name.c();
        if (bo5VarH instanceof wmc) {
            ww7 ww7Var = ((xmc) ((wmc) bo5VarH)).I;
            if (ww7Var.d()) {
                return strC;
            }
            StringBuilder sb = new StringBuilder();
            String strReplace = ww7Var.b().replace('.', '/');
            strReplace.getClass();
            sb.append(strReplace);
            sb.append('/');
            sb.append(strC);
            return sb.toString();
        }
        qqb qqbVar2 = bo5VarH instanceof qqb ? (qqb) bo5VarH : null;
        if (qqbVar2 == null) {
            pmf.i("Unexpected container: ", bo5VarH, " for ", qqbVar);
            return null;
        }
        return d(qqbVar2, c0lVar) + '$' + strC;
    }

    public static final r5b e(nz9 nz9Var, int i, long j, aoc aocVar, long j2, wo1 wo1Var, fu9 fu9Var, int i2, xub xubVar) {
        List list;
        Object objC = aocVar.c(i);
        List list2 = (List) xubVar.b(i);
        if (list2 != null) {
            list = list2;
        } else {
            List listA = nz9Var.a(i);
            int size = listA.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(((h5b) listA.get(i3)).u(j));
            }
            xubVar.i(i, arrayList);
            list = arrayList;
        }
        return new r5b(i, i2, list, j2, objC, wo1Var, fu9Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b9 A[EDGE_INSN: B:19:0x00b9->B:85:0x0230 BREAK  A[LOOP:1: B:79:0x0209->B:172:?]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.yr9 r21, defpackage.pai r22, defpackage.rz7 r23) {
        /*
            Method dump skipped, instruction units count: 962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oyk.f(yr9, pai, rz7):java.lang.Object");
    }

    public static final PermissionMode g(List list, List list2) {
        Object next;
        list.getClass();
        list2.getClass();
        int size = list.size() - list2.size();
        if (size > 0) {
            al7 al7Var = new al7(bnf.c0(bnf.V(bnf.V(bnf.d0(new c54(0, list), size), gge.I), new d6f(12)), new d6f(13)));
            if (al7Var.hasNext()) {
                next = al7Var.next();
                while (al7Var.hasNext()) {
                    next = al7Var.next();
                }
            } else {
                next = null;
            }
            String str = (String) next;
            if (str != null) {
                PermissionMode.Companion.getClass();
                return ixc.a(str);
            }
        }
        return null;
    }

    public static final boolean h(SdkEvent sdkEvent) {
        sdkEvent.getClass();
        if (sdkEvent instanceof SdkMessageEvent) {
            SdkMessageEvent sdkMessageEvent = (SdkMessageEvent) sdkEvent;
            Boolean isMeta = sdkMessageEvent.getIsMeta();
            Boolean bool = Boolean.TRUE;
            return (x44.r(isMeta, bool) || x44.r(sdkMessageEvent.getIsSynthetic(), bool)) ? false : true;
        }
        if (sdkEvent instanceof SdkResultEvent) {
            return true;
        }
        if (sdkEvent instanceof SdkSystemEvent) {
            return cvk.t((SdkSystemEvent) sdkEvent) != null;
        }
        if (sdkEvent instanceof SdkControlRequestEvent) {
            return cvk.u((SdkControlRequestEvent) sdkEvent) != null;
        }
        if (!(sdkEvent instanceof SdkEnvManagerLogEvent) && !(sdkEvent instanceof SdkRateLimitEvent) && !(sdkEvent instanceof SdkToolProgressEvent) && !(sdkEvent instanceof SdkToolUseSummaryEvent) && !(sdkEvent instanceof SdkPromptSuggestionEvent) && !(sdkEvent instanceof SdkControlResponseEvent) && !(sdkEvent instanceof SdkControlCancelRequestEvent) && !(sdkEvent instanceof SdkStreamEvent) && !(sdkEvent instanceof SdkUnknownEvent)) {
            wg6.i();
        }
        return false;
    }

    public static final ProUpsellEvents$StoreViewPurchaseErrorKind i(Integer num) {
        if (num != null && num.intValue() == 0) {
            return null;
        }
        if (num != null && num.intValue() == 1) {
            return null;
        }
        return (num != null && num.intValue() == 12) ? ProUpsellEvents$StoreViewPurchaseErrorKind.NETWORK : ((num != null && num.intValue() == 2) || (num != null && num.intValue() == -1) || (num != null && num.intValue() == -3)) ? ProUpsellEvents$StoreViewPurchaseErrorKind.SERVICE_UNAVAILABLE : (num != null && num.intValue() == 3) ? ProUpsellEvents$StoreViewPurchaseErrorKind.PURCHASE_NOT_ALLOWED : (num != null && num.intValue() == 4) ? ProUpsellEvents$StoreViewPurchaseErrorKind.PRODUCT_UNAVAILABLE : (num != null && num.intValue() == -2) ? ProUpsellEvents$StoreViewPurchaseErrorKind.UNSUPPORTED : (num != null && num.intValue() == 5) ? ProUpsellEvents$StoreViewPurchaseErrorKind.DEVELOPER_ERROR : (num != null && num.intValue() == 7) ? ProUpsellEvents$StoreViewPurchaseErrorKind.ITEM_ALREADY_OWNED : (num != null && num.intValue() == 6) ? ProUpsellEvents$StoreViewPurchaseErrorKind.SYSTEM_ERROR : ((num != null && num.intValue() == 8) || num == null) ? ProUpsellEvents$StoreViewPurchaseErrorKind.UNSPECIFIED : ProUpsellEvents$StoreViewPurchaseErrorKind.UNSPECIFIED;
    }

    public static ze9 j(int i, boolean z, py9 py9Var, int i2) {
        boolean z2 = (i2 & 1) != 0 ? false : z;
        boolean z3 = (i2 & 2) == 0;
        if ((i2 & 4) != 0) {
            py9Var = null;
        }
        if (i != 0) {
            return new ze9(i, z3, z2, py9Var != null ? sf5.f0(py9Var) : null, 34);
        }
        throw null;
    }

    public static synchronized zxk k() {
        zxk zxkVar;
        bxk bxkVar = new bxk();
        synchronized (oyk.class) {
            try {
                if (a == null) {
                    a = new iyk(1);
                }
                zxkVar = (zxk) a.i(bxkVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zxkVar;
        return zxkVar;
    }
}
