package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes3.dex */
public final class ru1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ BottomSheetBehavior a;

    public ru1(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        cwa cwaVar = this.a.e;
        if (cwaVar != null) {
            bwa bwaVar = cwaVar.E;
            if (bwaVar.i != fFloatValue) {
                bwaVar.i = fFloatValue;
                cwaVar.I = true;
                cwaVar.invalidateSelf();
            }
        }
    }
}
