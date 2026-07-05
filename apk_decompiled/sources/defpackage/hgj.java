package defpackage;

import android.content.Context;
import com.datadog.android.core.UploadWorker;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class hgj {
    public static ewi a(qh9 qh9Var) {
        String strM;
        String strM2;
        try {
            bh9 bh9VarS = qh9Var.s("plan");
            zwi zwiVarG = (bh9VarS == null || (strM2 = bh9VarS.m()) == null) ? null : uhk.g(strM2);
            bh9 bh9VarS2 = qh9Var.s("session_precondition");
            int i = 0;
            if (bh9VarS2 != null && (strM = bh9VarS2.m()) != null) {
                int[] iArrH = sq6.H(7);
                int length = iArrH.length;
                while (i < length) {
                    int i2 = iArrH[i];
                    if (kgh.h(i2).equals(strM)) {
                        i = i2;
                    } else {
                        i++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return new ewi(zwiVarG, i);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type DdSession", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type DdSession", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type DdSession", e3);
            return null;
        }
    }

    public static final void b(Context context, String str, h99 h99Var) {
        g99 g99Var = g99.F;
        str.getClass();
        h99Var.getClass();
        try {
            bgj bgjVarD = bgj.d(context);
            bgjVarD.getClass();
            ol4 ol4Var = new ol4();
            ol4Var.b();
            ql4 ql4VarA = ol4Var.a();
            s31 s31Var = new s31(UploadWorker.class);
            s31Var.g(ql4VarA);
            s31Var.a("DatadogBackgroundUpload/".concat(str));
            s31Var.i(5000L, TimeUnit.MILLISECONDS);
            vf3 vf3Var = new vf3(1);
            vf3Var.f(str);
            s31Var.k(vf3Var.b());
            bgjVarD.c("DatadogUploadWorker", c77.E, s31Var.b());
            dch.H(h99Var, 3, g99Var, tnh.S, null, false, 56);
        } catch (Exception e) {
            dch.I(h99Var, 5, x44.X(g99Var, g99.G), tnh.T, e, 48);
        }
    }
}
