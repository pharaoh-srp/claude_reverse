package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.MessageFileEvents$PdfPreviewResult;
import com.anthropic.claude.bell.b;
import com.anthropic.claude.code.remote.c;

/* JADX INFO: loaded from: classes2.dex */
public final class o10 implements v86 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o10(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.v86
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                f36 f36Var = (f36) obj;
                f36Var.dismiss();
                f36Var.L.e();
                break;
            case 1:
                r9d r9dVar = (r9d) obj;
                r9dVar.e();
                r9dVar.setTag(R.id.view_tree_lifecycle_owner, null);
                r9dVar.T.removeViewImmediate(r9dVar);
                break;
            case 2:
                g60 g60Var = (g60) obj;
                odg odgVar = g60Var.e;
                cd cdVar = (cd) odgVar.i;
                if (cdVar != null) {
                    cdVar.h();
                }
                odgVar.a();
                ActionMode actionMode = g60Var.h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                g60Var.h = null;
                break;
            case 3:
                gf1 gf1Var = (gf1) ((hf1) obj).c.getValue();
                if (gf1Var != null) {
                    gf1Var.close();
                }
                break;
            case 4:
                ua2 ua2Var = ((l2i) obj).c;
                if (ua2Var != null) {
                    ua2Var.q(null);
                }
                break;
            case 5:
                Context context = (Context) obj;
                context.getClass();
                b.q(context);
                break;
            case 6:
                dui duiVar = (dui) obj;
                duiVar.h = null;
                duiVar.i = null;
                duiVar.j = null;
                break;
            case 7:
                c cVar = (c) obj;
                fkg fkgVar = cVar.W;
                if (fkgVar != null) {
                    fkgVar.d(null);
                }
                cVar.W = null;
                break;
            case 8:
                lv4 lv4Var = (lv4) obj;
                WebView webView = lv4Var.m;
                fkg fkgVar2 = lv4Var.j;
                if (fkgVar2 != null) {
                    fkgVar2.d(null);
                }
                fkg fkgVar3 = lv4Var.k;
                if (fkgVar3 != null) {
                    fkgVar3.d(null);
                }
                ViewParent parent = webView.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(webView);
                }
                webView.destroy();
                break;
            case 9:
                yb7 yb7Var = (yb7) obj;
                View view = yb7Var.F;
                if (yb7Var.E) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(yb7Var);
                    yb7Var.E = false;
                }
                view.removeOnAttachStateChangeListener(yb7Var);
                break;
            case 10:
                ((zy7) obj).a();
                break;
            case 11:
                ValueCallback valueCallback = (ValueCallback) ((nwb) obj).getValue();
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(null);
                }
                break;
            case 12:
                bnb bnbVar = (bnb) obj;
                bnbVar.dismiss();
                bnbVar.M.e();
                break;
            case 13:
                ((lvb) obj).getClass();
                break;
            case 14:
                ((wvb) obj).e = null;
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((fti) obj).onDestroy();
                break;
            case 16:
                uvc uvcVar = (uvc) obj;
                uvcVar.getClass();
                uvcVar.a(MessageFileEvents$PdfPreviewResult.ABANDONED);
                break;
            default:
                mif mifVar = (mif) obj;
                mifVar.n();
                mifVar.j.setValue(Boolean.FALSE);
                break;
        }
    }
}
