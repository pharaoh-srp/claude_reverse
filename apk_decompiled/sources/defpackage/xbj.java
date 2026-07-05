package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class xbj implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ecj a;
    public final /* synthetic */ bdj b;
    public final /* synthetic */ bdj c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public xbj(ecj ecjVar, bdj bdjVar, bdj bdjVar2, int i, View view) {
        this.a = ecjVar;
        this.b = bdjVar;
        this.c = bdjVar2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ecj ecjVar = this.a;
        dcj dcjVar = ecjVar.a;
        dcjVar.e(animatedFraction);
        float fC = dcjVar.c();
        PathInterpolator pathInterpolator = acj.e;
        int i = Build.VERSION.SDK_INT;
        bdj bdjVar = this.b;
        ncj mcjVar = i >= 36 ? new mcj(bdjVar) : i >= 35 ? new lcj(bdjVar) : i >= 34 ? new kcj(bdjVar) : i >= 31 ? new jcj(bdjVar) : i >= 30 ? new icj(bdjVar) : i >= 29 ? new hcj(bdjVar) : new fcj(bdjVar);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            xcj xcjVar = bdjVar.a;
            if (i3 == 0) {
                mcjVar.d(i2, xcjVar.i(i2));
            } else {
                f59 f59VarI = xcjVar.i(i2);
                f59 f59VarI2 = this.c.a.i(i2);
                float f = 1.0f - fC;
                mcjVar.d(i2, bdj.a(f59VarI, (int) (((double) ((f59VarI.a - f59VarI2.a) * f)) + 0.5d), (int) (((double) ((f59VarI.b - f59VarI2.b) * f)) + 0.5d), (int) (((double) ((f59VarI.c - f59VarI2.c) * f)) + 0.5d), (int) (((double) ((f59VarI.d - f59VarI2.d) * f)) + 0.5d)));
            }
        }
        acj.h(this.e, mcjVar.b(), Collections.singletonList(ecjVar));
    }
}
