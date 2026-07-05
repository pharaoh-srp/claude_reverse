package defpackage;

import android.app.ApplicationExitInfo;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class gk5 {
    public final k99 a;
    public final s16 b;
    public final u60 c;

    public gk5(k99 k99Var) {
        sh9 sh9Var = new sh9(k99Var.t(), 1);
        u60 u60Var = new u60(k99Var.t());
        k99Var.getClass();
        this.a = k99Var;
        this.b = sh9Var;
        this.c = u60Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.kt6 a(defpackage.gk5 r45, defpackage.lj5 r46, int r47, int r48, java.lang.String r49, long r50, java.lang.Long r52, java.lang.String r53, java.lang.String r54, java.util.List r55, defpackage.mxi r56) {
        /*
            Method dump skipped, instruction units count: 705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk5.a(gk5, lj5, int, int, java.lang.String, long, java.lang.Long, java.lang.String, java.lang.String, java.util.List, mxi):kt6");
    }

    public static final mxi b(gk5 gk5Var, mxi mxiVar) {
        kxi kxiVar = mxiVar.j;
        awi awiVar = kxiVar.E;
        kxi kxiVarA = kxi.a(kxiVar, null, awiVar != null ? new awi(awiVar.a + 1) : new awi(1L), 2013265919);
        cwi cwiVar = mxiVar.s;
        return mxi.a(mxiVar, kxiVarA, null, null, new cwi(cwiVar.a, cwiVar.b, cwiVar.c, cwiVar.d, cwiVar.e + 1, cwiVar.f, cwiVar.g, cwiVar.h, cwiVar.i), null, 8125951);
    }

    public final void c(ApplicationExitInfo applicationExitInfo, qh9 qh9Var, hi5 hi5Var) {
        hi5Var.getClass();
        Object objR = this.b.r(qh9Var);
        mxi mxiVar = objR instanceof mxi ? (mxi) objR : null;
        if (mxiVar == null) {
            return;
        }
        if (applicationExitInfo.getTimestamp() > mxiVar.a) {
            k99 k99Var = this.a;
            gbf feature = k99Var.getFeature("rum");
            if (feature == null) {
                dch.H(k99Var.t(), 4, g99.E, yf5.V, null, false, 56);
            } else {
                feature.b(sf5.f0("rum"), new dk5(mxiVar, this, applicationExitInfo, hi5Var));
            }
        }
    }

    public final void d(Map map, hi5 hi5Var) {
        hi5Var.getClass();
        k99 k99Var = this.a;
        gbf feature = k99Var.getFeature("rum");
        g99 g99Var = g99.E;
        if (feature == null) {
            dch.H(k99Var.t(), 3, g99Var, yf5.W, null, false, 56);
            return;
        }
        Object obj = map.get("sourceType");
        mxi mxiVar = null;
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("timestamp");
        Long l = obj2 instanceof Long ? (Long) obj2 : null;
        Object obj3 = map.get("timeSinceAppStartMs");
        Long l2 = obj3 instanceof Long ? (Long) obj3 : null;
        Object obj4 = map.get("signalName");
        String str2 = obj4 instanceof String ? (String) obj4 : null;
        Object obj5 = map.get("stacktrace");
        String str3 = obj5 instanceof String ? (String) obj5 : null;
        Object obj6 = map.get("message");
        String str4 = obj6 instanceof String ? (String) obj6 : null;
        Object obj7 = map.get("lastViewEvent");
        qh9 qh9Var = obj7 instanceof qh9 ? (qh9) obj7 : null;
        if (qh9Var != null) {
            Object objR = this.b.r(qh9Var);
            if (objR instanceof mxi) {
                mxiVar = (mxi) objR;
            }
        }
        if (l == null || str2 == null || str3 == null || str4 == null || mxiVar == null) {
            dch.H(k99Var.t(), 4, g99Var, yf5.X, null, false, 56);
        } else {
            feature.b(um6.E, new fk5(this, str, str4, l, l2, str3, str2, mxiVar, hi5Var));
        }
    }
}
