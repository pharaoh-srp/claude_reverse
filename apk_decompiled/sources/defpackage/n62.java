package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class n62 implements m62 {
    public final Matrix E = new Matrix();
    public final int[] F = new int[2];

    @Override // defpackage.m62
    public void a(View view, float[] fArr) {
        Matrix matrix = this.E;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.F;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i2);
        csg.N(matrix, fArr);
    }
}
