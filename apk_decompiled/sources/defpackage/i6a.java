package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i6a extends ViewGroup {
    public boolean E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public float K;
    public boolean L;
    public int[] M;
    public int[] N;
    public Drawable O;
    public int P;
    public int Q;
    public int R;
    public int S;

    public i6a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.E = true;
        this.F = -1;
        this.G = 0;
        this.I = 8388659;
        int[] iArr = t0e.n;
        lrb lrbVarP = lrb.P(context, attributeSet, iArr, 0);
        mvi.g(this, context, iArr, attributeSet, (TypedArray) lrbVarP.G, 0);
        TypedArray typedArray = (TypedArray) lrbVarP.G;
        int i = typedArray.getInt(1, -1);
        if (i >= 0) {
            setOrientation(i);
        }
        int i2 = typedArray.getInt(0, -1);
        if (i2 >= 0) {
            setGravity(i2);
        }
        boolean z = typedArray.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.K = typedArray.getFloat(4, -1.0f);
        this.F = typedArray.getInt(3, -1);
        this.L = typedArray.getBoolean(7, false);
        setDividerDrawable(lrbVarP.y(5));
        this.R = typedArray.getInt(8, 0);
        this.S = typedArray.getDimensionPixelSize(6, 0);
        lrbVarP.S();
    }

    public final void c(Canvas canvas, int i) {
        this.O.setBounds(getPaddingLeft() + this.S, i, (getWidth() - getPaddingRight()) - this.S, this.Q + i);
        this.O.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof h6a;
    }

    public final void d(Canvas canvas, int i) {
        this.O.setBounds(i, getPaddingTop() + this.S, this.P + i, (getHeight() - getPaddingBottom()) - this.S);
        this.O.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public h6a generateDefaultLayoutParams() {
        int i = this.H;
        if (i == 0) {
            return new h6a(-2, -2);
        }
        if (i == 1) {
            return new h6a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public h6a generateLayoutParams(AttributeSet attributeSet) {
        return new h6a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public h6a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof h6a ? new h6a((h6a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new h6a((ViewGroup.MarginLayoutParams) layoutParams) : new h6a(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.F < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.F;
        if (childCount <= i2) {
            pmf.o("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
            return 0;
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.F == 0) {
                return -1;
            }
            pmf.o("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            return 0;
        }
        int bottom = this.G;
        if (this.H == 1 && (i = this.I & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.J) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.J;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((h6a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.F;
    }

    public Drawable getDividerDrawable() {
        return this.O;
    }

    public int getDividerPadding() {
        return this.S;
    }

    public int getDividerWidth() {
        return this.P;
    }

    public int getGravity() {
        return this.I;
    }

    public int getOrientation() {
        return this.H;
    }

    public int getShowDividers() {
        return this.R;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.K;
    }

    public final boolean h(int i) {
        if (i == 0) {
            return (this.R & 1) != 0;
        }
        int childCount = getChildCount();
        int i2 = this.R;
        if (i == childCount) {
            return (i2 & 4) != 0;
        }
        if ((i2 & 2) != 0) {
            for (int i3 = i - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.O == null) {
            return;
        }
        int i2 = 0;
        if (this.H == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && h(i2)) {
                    c(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((h6a) childAt.getLayoutParams())).topMargin) - this.Q);
                }
                i2++;
            }
            if (h(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                c(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.Q : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((h6a) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z = wyi.a;
        boolean z2 = getLayoutDirection() == 1;
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && h(i2)) {
                h6a h6aVar = (h6a) childAt3.getLayoutParams();
                d(canvas, z2 ? childAt3.getRight() + ((LinearLayout.LayoutParams) h6aVar).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) h6aVar).leftMargin) - this.P);
            }
            i2++;
        }
        if (h(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                h6a h6aVar2 = (h6a) childAt4.getLayoutParams();
                if (z2) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) h6aVar2).leftMargin;
                    i = this.P;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) h6aVar2).rightMargin;
                }
            } else if (z2) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.P;
                right = left - i;
            }
            d(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a9  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i6a.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:229:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0146  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 2139
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i6a.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.E = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.F = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.O) {
            return;
        }
        this.O = drawable;
        if (drawable != null) {
            this.P = drawable.getIntrinsicWidth();
            this.Q = drawable.getIntrinsicHeight();
        } else {
            this.P = 0;
            this.Q = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.S = i;
    }

    public void setGravity(int i) {
        if (this.I != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.I = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.I;
        if ((8388615 & i3) != i2) {
            this.I = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.L = z;
    }

    public void setOrientation(int i) {
        if (this.H != i) {
            this.H = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.R) {
            requestLayout();
        }
        this.R = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.I;
        if ((i3 & 112) != i2) {
            this.I = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.K = Math.max(MTTypesetterKt.kLineSkipLimitMultiplier, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
