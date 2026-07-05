package defpackage;

import android.view.MotionEvent;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes2.dex */
public final class h70 extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ nxi G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h70(nxi nxiVar, int i) {
        super(1);
        this.F = i;
        this.G = nxiVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        boolean zDispatchTouchEvent;
        int i = this.F;
        iei ieiVar = iei.a;
        nxi nxiVar = this.G;
        switch (i) {
            case 0:
                Owner owner = (Owner) obj;
                AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
                if (androidComposeView != null) {
                    androidComposeView.getAndroidViewsHandler$ui().removeViewInLayout(nxiVar);
                    nai.l(androidComposeView.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(androidComposeView.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(nxiVar));
                    nxiVar.setImportantForAccessibility(0);
                }
                nxiVar.removeAllViewsInLayout();
                return ieiVar;
            case 1:
                nxiVar.U = (bz7) obj;
                return ieiVar;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                switch (motionEvent.getActionMasked()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = nxiVar.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = nxiVar.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
        }
    }
}
