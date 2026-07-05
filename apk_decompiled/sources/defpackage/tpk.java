package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.Display;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tpk {
    public static final ta4 a = new ta4(353610027, false, new ub4(14));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.cte r17, defpackage.mte r18, defpackage.iqb r19, defpackage.bz7 r20, boolean r21, int r22, int r23, defpackage.ld4 r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tpk.a(cte, mte, iqb, bz7, boolean, int, int, ld4, int, int):void");
    }

    public static void b(a10 a10Var, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        yjf yjfVar;
        wjf wjfVar;
        bz7 bz7Var;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponseJ = q00.j(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseJ != null && (value = viewTranslationResponseJ.getValue("android:text")) != null && (text = value.getText()) != null && (yjfVar = (yjf) a10Var.c().b((int) jKeyAt)) != null && (wjfVar = yjfVar.a) != null) {
                Object objG = wjfVar.d.E.g(ojf.l);
                if (objG == null) {
                    objG = null;
                }
                e5 e5Var = (e5) objG;
                if (e5Var != null && (bz7Var = (bz7) e5Var.b) != null) {
                }
            }
        }
    }

    public static boolean c(Context context) {
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null || !display.isHdr() || (hdrCapabilities = display.getHdrCapabilities()) == null) {
            return false;
        }
        for (int i : hdrCapabilities.getSupportedHdrTypes()) {
            if (i == 1) {
                return true;
            }
        }
        return false;
    }

    public static void d(ri4 ri4Var) {
        ri4.e.f(ri4Var);
    }

    public static toe e(qh9 qh9Var) {
        try {
            return new toe(qh9Var.s("duration").k(), qh9Var.s("start").k());
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type FirstByte", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type FirstByte", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type FirstByte", e3);
            return null;
        }
    }

    public static final bl7 f(zb0 zb0Var, Map map, int i) {
        return bnf.c0(new c54(0, zb0Var.b(i, i, lte.b)), new t8(5, map));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.p58 g(defpackage.rvh r6) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tpk.g(rvh):p58");
    }

    public static y3e h() {
        return ri4.f;
    }

    public static void i(a10 a10Var, long[] jArr, Consumer consumer) {
        wjf wjfVar;
        for (long j : jArr) {
            yjf yjfVar = (yjf) a10Var.c().b((int) j);
            if (yjfVar != null && (wjfVar = yjfVar.a) != null) {
                q00.m();
                ViewTranslationRequest.Builder builderH = q00.h(a10Var.E.getAutofillId(), wjfVar.f);
                Object objG = wjfVar.d.E.g(akf.C);
                if (objG == null) {
                    objG = null;
                }
                List list = (List) objG;
                if (list != null) {
                    builderH.setValue("android:text", TranslationRequestValue.forText(new zb0(qaa.a(list, "\n", null, 62))));
                    consumer.accept(builderH.build());
                }
            }
        }
    }

    public static void j(a10 a10Var, LongSparseArray longSparseArray) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (x44.r(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            b(a10Var, longSparseArray);
        } else {
            a10Var.E.post(new fd(a10Var, 1, longSparseArray));
        }
    }

    public static ri4 k(Uri uri) {
        if (!x44.r(uri.getScheme(), "https")) {
            return null;
        }
        if (!x44.r(uri.getHost(), "claude.ai") && !x44.r(uri.getHost(), "claude-ai.staging.ant.dev")) {
            return null;
        }
        if (!x44.r(uri.getPath(), "/api/mcp/auth_callback") && !x44.r(uri.getPath(), "/mobile/api/mcp/auth_callback")) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("code");
        if (queryParameter == null) {
            queryParameter = "";
        }
        String queryParameter2 = uri.getQueryParameter("state");
        return new ri4(queryParameter, queryParameter2 != null ? queryParameter2 : "", uri.getQueryParameter("error"), uri.getQueryParameter("error_description"));
    }

    public static int l(b0k b0kVar) {
        Iterator it = b0kVar.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }
}
