package defpackage;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class is7 extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ js7 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ is7(js7 js7Var, int i) {
        super(1);
        this.F = i;
        this.G = js7Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        iei ieiVar = iei.a;
        js7 js7Var = this.G;
        switch (i) {
            case 0:
                qa2 qa2Var = (qa2) obj;
                View viewD = xnk.d(js7Var);
                if (!viewD.isFocused() && !viewD.hasFocus()) {
                    rs7 focusOwner = yfd.X(js7Var).getFocusOwner();
                    View viewQ = eve.Q(js7Var);
                    Integer numC = ms7.c(qa2Var.a);
                    int[] iArr = new int[2];
                    viewQ.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    viewD.getLocationOnScreen(iArr2);
                    jt7 jt7VarL = cok.l(((ts7) focusOwner).c);
                    Rect rect = null;
                    l9e l9eVarM = jt7VarL != null ? cok.m(jt7VarL) : null;
                    if (l9eVarM != null) {
                        int i2 = (int) l9eVarM.a;
                        int i3 = iArr[0];
                        int i4 = iArr2[0];
                        int i5 = (int) l9eVarM.b;
                        int i6 = iArr[1];
                        int i7 = iArr2[1];
                        rect = new Rect((i2 + i3) - i4, (i5 + i6) - i7, (((int) l9eVarM.c) + i3) - i4, (((int) l9eVarM.d) + i6) - i7);
                    }
                    if (!ms7.b(viewD, numC, rect)) {
                        qa2Var.b = true;
                    }
                }
                break;
            default:
                xnk.d(js7Var);
                break;
        }
        return ieiVar;
    }
}
