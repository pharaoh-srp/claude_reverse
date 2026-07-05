package defpackage;

import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vv implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;

    public /* synthetic */ vv(Object obj, boolean z, int i) {
        this.E = i;
        this.G = obj;
        this.F = z;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        boolean z = this.F;
        Object obj = this.G;
        switch (i) {
            case 0:
                p0a p0aVarH = ((x0a) obj).h();
                int i2 = p0aVarH.n;
                q0a q0aVar = (q0a) w44.V0(p0aVarH.k);
                return Boolean.valueOf((q0aVar != null ? q0aVar.a : 0) + 1 > i2 + (-5) && z);
            case 1:
                return Boolean.valueOf(((Boolean) ((wlg) obj).getValue()).booleanValue() && z);
            case 2:
                WebView webView = (WebView) ((m8j) obj).e.getValue();
                if (webView != null) {
                    Object systemService = webView.getContext().getSystemService("input_method");
                    systemService.getClass();
                    InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                    if (z) {
                        inputMethodManager.hideSoftInputFromWindow(webView.getWindowToken(), 0);
                    } else {
                        webView.requestFocus();
                        inputMethodManager.showSoftInput(webView, 1);
                    }
                }
                return ieiVar;
            case 3:
                bt7 bt7Var = (bt7) obj;
                if (z) {
                    bt7.a(bt7Var);
                }
                return ieiVar;
            case 4:
                phg phgVar = (phg) obj;
                boolean zQ = phgVar.Q();
                wsg wsgVar = phgVar.b;
                zy1 zy1Var = phgVar.g;
                if (zQ) {
                    String strC = ((whg) phgVar.c).c();
                    if (!bsg.I0(strC)) {
                        zy1Var.r(new ghg(strC));
                        wsgVar.b((int) phgVar.P(), strC.length(), phgVar.p);
                        phgVar.R(ane.a);
                    } else if (z) {
                        zy1Var.r(ehg.a);
                        wsgVar.d((int) phgVar.P(), strC.length(), phgVar.p);
                        phgVar.R(xme.a);
                    } else {
                        zy1Var.r(new fhg(new pt6(R.string.stt_error_transcription_empty), strC));
                        wsg wsgVar2 = phgVar.b;
                        int iP = (int) phgVar.P();
                        int length = strC.length();
                        ohg ohgVar = ohg.J;
                        wsgVar2.a(ohgVar.toString(), "empty", iP, length, phgVar.p);
                        phgVar.R(ohgVar.a());
                    }
                }
                return ieiVar;
            default:
                r8f r8fVar = hj6.Q;
                return new dui(this.F, r8fVar, r8fVar, c0l.G, (yig) obj, MTTypesetterKt.kLineSkipLimitMultiplier, false);
        }
    }

    public /* synthetic */ vv(boolean z, Object obj, int i) {
        this.E = i;
        this.F = z;
        this.G = obj;
    }
}
