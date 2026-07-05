package defpackage;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wf2 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ View F;
    public final /* synthetic */ nwb G;

    public /* synthetic */ wf2(View view, nwb nwbVar, int i) {
        this.E = i;
        this.F = view;
        this.G = nwbVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        i2i i2iVar;
        int i = this.E;
        iei ieiVar = iei.a;
        nwb nwbVar = this.G;
        View view = this.F;
        cu9 cu9Var = (cu9) obj;
        switch (i) {
            case 0:
                cu9Var.getClass();
                view.getClass();
                Rect rect = new Rect();
                view.getWindowVisibleDisplayFrame(rect);
                l9e l9eVarP = nai.p(cu9Var, true);
                float f = l9eVarP.b - rect.top;
                float f2 = (rect.bottom - r4) - l9eVarP.d;
                float f3 = l9eVarP.c;
                float f4 = f3 - ((f3 - l9eVarP.a) / 2.0f);
                float fCenterX = f4 - rect.centerX();
                if (f < f2) {
                    i2iVar = new i2i((((long) ((int) (cu9Var.k() & 4294967295L))) & 4294967295L) | (((long) ((int) fCenterX)) << 32), z1i.F, f4);
                } else {
                    i2iVar = new i2i((((long) (-((int) (cu9Var.k() & 4294967295L)))) & 4294967295L) | (((long) ((int) fCenterX)) << 32), z1i.E, f4);
                }
                nwbVar.setValue(i2iVar);
                break;
            default:
                cu9Var.getClass();
                l9e l9eVarJ = nai.A(cu9Var).J(cu9Var, true);
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                float f5 = iArr[0];
                float f6 = iArr[1];
                nwbVar.setValue(new l9e(l9eVarJ.a + f5, l9eVarJ.b + f6, f5 + l9eVarJ.c, f6 + l9eVarJ.d));
                break;
        }
        return ieiVar;
    }
}
