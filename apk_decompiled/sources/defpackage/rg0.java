package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class rg0 extends nik {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ rg0(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.nik, defpackage.iyi
    public void b() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                ((og0) obj).F.R.setVisibility(0);
                break;
            case 1:
                ah0 ah0Var = (ah0) obj;
                ah0Var.R.setVisibility(0);
                if (ah0Var.R.getParent() instanceof View) {
                    View view = (View) ah0Var.R.getParent();
                    WeakHashMap weakHashMap = mvi.a;
                    view.requestApplyInsets();
                }
                break;
        }
    }

    @Override // defpackage.iyi
    public final void c() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                ah0 ah0Var = ((og0) obj).F;
                ah0Var.R.setAlpha(1.0f);
                ah0Var.U.d(null);
                ah0Var.U = null;
                break;
            case 1:
                ah0 ah0Var2 = (ah0) obj;
                ah0Var2.R.setAlpha(1.0f);
                ah0Var2.U.d(null);
                ah0Var2.U = null;
                break;
            default:
                ah0 ah0Var3 = (ah0) ((qb5) obj).F;
                ah0Var3.R.setVisibility(8);
                PopupWindow popupWindow = ah0Var3.S;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (ah0Var3.R.getParent() instanceof View) {
                    View view = (View) ah0Var3.R.getParent();
                    WeakHashMap weakHashMap = mvi.a;
                    view.requestApplyInsets();
                }
                ah0Var3.R.e();
                ah0Var3.U.d(null);
                ah0Var3.U = null;
                ViewGroup viewGroup = ah0Var3.X;
                WeakHashMap weakHashMap2 = mvi.a;
                viewGroup.requestApplyInsets();
                break;
        }
    }
}
