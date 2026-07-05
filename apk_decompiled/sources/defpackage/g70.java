package defpackage;

import android.view.WindowInsets;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes2.dex */
public final class g70 extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ nxi G;
    public final /* synthetic */ av9 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g70(nxi nxiVar, av9 av9Var, int i) {
        super(1);
        this.F = i;
        this.G = nxiVar;
        this.H = av9Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        WindowInsets windowInsetsB;
        int i = this.F;
        iei ieiVar = iei.a;
        av9 av9Var = this.H;
        nxi nxiVar = this.G;
        switch (i) {
            case 0:
                Owner owner = (Owner) obj;
                AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
                if (androidComposeView != null) {
                    androidComposeView.getAndroidViewsHandler$ui().getHolderToLayoutNode().put(nxiVar, av9Var);
                    androidComposeView.getAndroidViewsHandler$ui().addView(nxiVar);
                    androidComposeView.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(av9Var, nxiVar);
                    nxiVar.setImportantForAccessibility(1);
                    mvi.h(nxiVar, new vz(androidComposeView, av9Var, androidComposeView));
                }
                if (nxiVar.getView().getParent() != nxiVar) {
                    nxiVar.addView(nxiVar.getView());
                }
                break;
            case 1:
                oe5.g(nxiVar, av9Var);
                break;
            default:
                oe5.g(nxiVar, av9Var);
                ((AndroidComposeView) nxiVar.G).o0 = true;
                int[] iArr = nxiVar.R;
                int i2 = iArr[0];
                int i3 = iArr[1];
                nxiVar.getView().getLocationOnScreen(iArr);
                long j = nxiVar.S;
                long jK = ((cu9) obj).k();
                nxiVar.S = jK;
                bdj bdjVar = nxiVar.T;
                if (bdjVar != null && ((i2 != iArr[0] || i3 != iArr[1] || !g79.b(j, jK)) && (windowInsetsB = nxiVar.n(bdjVar).b()) != null)) {
                    nxiVar.getView().dispatchApplyWindowInsets(windowInsetsB);
                }
                break;
        }
        return ieiVar;
    }
}
