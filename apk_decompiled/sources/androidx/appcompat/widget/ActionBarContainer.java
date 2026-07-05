package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.anthropic.claude.R;
import defpackage.o9;
import defpackage.saf;
import defpackage.t0e;

/* JADX INFO: loaded from: classes2.dex */
public class ActionBarContainer extends FrameLayout {
    public boolean E;
    public View F;
    public View G;
    public Drawable H;
    public Drawable I;
    public Drawable J;
    public final boolean K;
    public boolean L;
    public final int M;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        setBackground(new o9(0, this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t0e.a);
        this.H = typedArrayObtainStyledAttributes.getDrawable(0);
        this.I = typedArrayObtainStyledAttributes.getDrawable(2);
        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.K = true;
            this.J = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.K ? !(this.H != null || this.I != null) : this.J == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.H;
        if (drawable != null && drawable.isStateful()) {
            this.H.setState(getDrawableState());
        }
        Drawable drawable2 = this.I;
        if (drawable2 != null && drawable2.isStateful()) {
            this.I.setState(getDrawableState());
        }
        Drawable drawable3 = this.J;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.J.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.H;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.I;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.J;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.F = findViewById(R.id.action_bar);
        this.G = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.E || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.K) {
            Drawable drawable = this.J;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.H == null) {
                z2 = false;
            } else if (this.F.getVisibility() == 0) {
                this.H.setBounds(this.F.getLeft(), this.F.getTop(), this.F.getRight(), this.F.getBottom());
            } else {
                View view = this.G;
                if (view == null || view.getVisibility() != 0) {
                    this.H.setBounds(0, 0, 0, 0);
                } else {
                    this.H.setBounds(this.G.getLeft(), this.G.getTop(), this.G.getRight(), this.G.getBottom());
                }
            }
            this.L = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.F == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.M) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.F == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.H;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.H);
        }
        this.H = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.F;
            if (view != null) {
                this.H.setBounds(view.getLeft(), this.F.getTop(), this.F.getRight(), this.F.getBottom());
            }
        }
        boolean z = false;
        if (!this.K ? !(this.H != null || this.I != null) : this.J == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.J;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.J);
        }
        this.J = drawable;
        boolean z = this.K;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.J) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.H != null || this.I != null) : this.J == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.I;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.I);
        }
        this.I = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.L && this.I != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.K ? !(this.H != null || this.I != null) : this.J == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(saf safVar) {
    }

    public void setTransitioning(boolean z) {
        this.E = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.H;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.I;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.J;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.H;
        boolean z = this.K;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.I && this.L) {
            return true;
        }
        return (drawable == this.J && z) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }
}
