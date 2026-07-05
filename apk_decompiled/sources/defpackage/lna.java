package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lna implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public /* synthetic */ lna(pna pnaVar) {
        this.b = pnaVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                pna pnaVar = (pna) obj;
                int i2 = pnaVar.j0;
                if (i2 == 0) {
                    i2 = 1;
                }
                if (i2 != 2) {
                    me4 me4Var = pnaVar.M;
                    if (me4Var != null) {
                        me4Var.m(pnaVar.F.a());
                    }
                } else {
                    pnaVar.invalidateSelf();
                }
                break;
            default:
                ((View) ((qbj) ((xzd) obj).F).d.getParent()).invalidate();
                break;
        }
    }

    public /* synthetic */ lna(xzd xzdVar, View view) {
        this.b = xzdVar;
    }
}
