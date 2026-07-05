package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes2.dex */
public final class nh0 extends SeekBar {
    public final oh0 E;

    public nh0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        qlh.a(this, getContext());
        oh0 oh0Var = new oh0(this);
        this.E = oh0Var;
        oh0Var.r(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        oh0 oh0Var = this.E;
        nh0 nh0Var = oh0Var.H;
        Drawable drawable = oh0Var.I;
        if (drawable != null && drawable.isStateful() && drawable.setState(nh0Var.getDrawableState())) {
            nh0Var.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.E.I;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.E.G(canvas);
    }
}
