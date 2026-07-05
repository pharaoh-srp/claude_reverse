package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.agog.mathdisplay.MTMathView;
import com.agog.mathdisplay.parse.MathDisplayException;

/* JADX INFO: loaded from: classes2.dex */
public final class it9 extends FrameLayout {
    public final MTMathView E;
    public final ol5 F;
    public boolean G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public it9(Context context, MTMathView mTMathView, ol5 ol5Var) {
        super(context);
        context.getClass();
        this.E = mTMathView;
        this.F = ol5Var;
        addView(mTMathView, new ViewGroup.LayoutParams(-2, -2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        int iSave = canvas.save();
        try {
            super.dispatchDraw(canvas);
        } catch (MathDisplayException e) {
            if (!this.G) {
                this.G = true;
                this.F.invoke(e);
            }
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public final View getChild() {
        return this.E;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        view.getClass();
        view2.getClass();
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (MathDisplayException e) {
            if (!this.G) {
                this.G = true;
                this.F.invoke(e);
            }
            setMeasuredDimension(View.resolveSize(0, i), View.resolveSize(0, i2));
        }
    }
}
