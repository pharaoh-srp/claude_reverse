package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class qh0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ qh0(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                zh0 zh0Var = (zh0) obj;
                if (!zh0Var.getInternalPopup().b()) {
                    zh0Var.J.n(zh0Var.getTextDirection(), zh0Var.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = zh0Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            case 1:
                wh0 wh0Var = (wh0) obj;
                zh0 zh0Var2 = wh0Var.k0;
                if (zh0Var2.isAttachedToWindow() && zh0Var2.getGlobalVisibleRect(wh0Var.i0)) {
                    wh0Var.r();
                    wh0Var.g();
                } else {
                    wh0Var.dismiss();
                }
                break;
            case 2:
                oe2 oe2Var = (oe2) obj;
                ArrayList arrayList = oe2Var.L;
                if (oe2Var.b() && arrayList.size() > 0 && !((ne2) arrayList.get(0)).a.c0) {
                    View view = oe2Var.S;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((ne2) it.next()).a.g();
                        }
                    } else {
                        oe2Var.dismiss();
                    }
                    break;
                }
                break;
            default:
                nkg nkgVar = (nkg) obj;
                sdb sdbVar = nkgVar.L;
                if (nkgVar.b() && !sdbVar.c0) {
                    View view2 = nkgVar.Q;
                    if (view2 != null && view2.isShown()) {
                        sdbVar.g();
                    } else {
                        nkgVar.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
