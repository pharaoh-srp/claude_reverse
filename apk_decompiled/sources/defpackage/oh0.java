package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes2.dex */
public final class oh0 extends qb5 {
    public final nh0 H;
    public Drawable I;
    public ColorStateList J;
    public PorterDuff.Mode K;
    public boolean L;
    public boolean M;

    public oh0(nh0 nh0Var) {
        super(nh0Var);
        this.J = null;
        this.K = null;
        this.L = false;
        this.M = false;
        this.H = nh0Var;
    }

    public final void F() {
        Drawable drawable = this.I;
        if (drawable != null) {
            if (this.L || this.M) {
                Drawable drawableMutate = drawable.mutate();
                this.I = drawableMutate;
                if (this.L) {
                    drawableMutate.setTintList(this.J);
                }
                if (this.M) {
                    this.I.setTintMode(this.K);
                }
                if (this.I.isStateful()) {
                    this.I.setState(this.H.getDrawableState());
                }
            }
        }
    }

    public final void G(Canvas canvas) {
        if (this.I != null) {
            int max = this.H.getMax();
            if (max > 1) {
                int intrinsicWidth = this.I.getIntrinsicWidth();
                int intrinsicHeight = this.I.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.I.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.I.draw(canvas);
                    canvas.translate(width, MTTypesetterKt.kLineSkipLimitMultiplier);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // defpackage.qb5
    public final void r(AttributeSet attributeSet, int i) {
        super.r(attributeSet, R.attr.seekBarStyle);
        nh0 nh0Var = this.H;
        Context context = nh0Var.getContext();
        int[] iArr = t0e.g;
        lrb lrbVarP = lrb.P(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) lrbVarP.G;
        mvi.g(nh0Var, nh0Var.getContext(), iArr, attributeSet, (TypedArray) lrbVarP.G, R.attr.seekBarStyle);
        Drawable drawableZ = lrbVarP.z(0);
        if (drawableZ != null) {
            nh0Var.setThumb(drawableZ);
        }
        Drawable drawableY = lrbVarP.y(1);
        Drawable drawable = this.I;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.I = drawableY;
        if (drawableY != null) {
            drawableY.setCallback(nh0Var);
            drawableY.setLayoutDirection(nh0Var.getLayoutDirection());
            if (drawableY.isStateful()) {
                drawableY.setState(nh0Var.getDrawableState());
            }
            F();
        }
        nh0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.K = je6.b(typedArray.getInt(3, -1), this.K);
            this.M = true;
        }
        if (typedArray.hasValue(2)) {
            this.J = lrbVarP.w(2);
            this.L = true;
        }
        lrbVarP.S();
        F();
    }
}
