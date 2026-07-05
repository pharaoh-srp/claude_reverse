package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.agog.mathdisplay.render.MTTypesetterKt;
import defpackage.adb;
import defpackage.h6a;
import defpackage.hb;
import defpackage.i6a;
import defpackage.jb;
import defpackage.kb;
import defpackage.lb;
import defpackage.mb;
import defpackage.nb;
import defpackage.poj;
import defpackage.tqh;
import defpackage.ucb;
import defpackage.vcb;
import defpackage.wyi;
import defpackage.xzd;
import defpackage.ydb;

/* JADX INFO: loaded from: classes2.dex */
public class ActionMenuView extends i6a implements ucb, ydb {
    public vcb T;
    public Context U;
    public int V;
    public boolean W;
    public kb a0;
    public xzd b0;
    public boolean c0;
    public int d0;
    public final int e0;
    public final int f0;
    public nb g0;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.e0 = (int) (56.0f * f);
        this.f0 = (int) (f * 4.0f);
        this.U = context;
        this.V = 0;
    }

    public static mb i() {
        mb mbVar = new mb(-2, -2);
        mbVar.a = false;
        ((LinearLayout.LayoutParams) mbVar).gravity = 16;
        return mbVar;
    }

    public static mb j(ViewGroup.LayoutParams layoutParams) {
        mb mbVar;
        if (layoutParams == null) {
            return i();
        }
        if (layoutParams instanceof mb) {
            mb mbVar2 = (mb) layoutParams;
            mbVar = new mb(mbVar2);
            mbVar.a = mbVar2.a;
        } else {
            mbVar = new mb(layoutParams);
        }
        if (((LinearLayout.LayoutParams) mbVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) mbVar).gravity = 16;
        }
        return mbVar;
    }

    @Override // defpackage.ucb
    public final boolean a(adb adbVar) {
        return this.T.q(adbVar, null, 0);
    }

    @Override // defpackage.ydb
    public final void b(vcb vcbVar) {
        this.T = vcbVar;
    }

    @Override // defpackage.i6a, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof mb;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // defpackage.i6a
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ h6a generateDefaultLayoutParams() {
        return i();
    }

    @Override // defpackage.i6a
    /* JADX INFO: renamed from: f */
    public final h6a generateLayoutParams(AttributeSet attributeSet) {
        return new mb(getContext(), attributeSet);
    }

    @Override // defpackage.i6a
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ h6a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    @Override // defpackage.i6a, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    @Override // defpackage.i6a, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new mb(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.T == null) {
            Context context = getContext();
            vcb vcbVar = new vcb(context);
            this.T = vcbVar;
            vcbVar.e = new poj(this);
            kb kbVar = new kb(context);
            this.a0 = kbVar;
            kbVar.P = true;
            kbVar.Q = true;
            kbVar.I = new tqh(22);
            this.T.b(kbVar, this.U);
            kb kbVar2 = this.a0;
            kbVar2.L = this;
            this.T = kbVar2.G;
        }
        return this.T;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        kb kbVar = this.a0;
        jb jbVar = kbVar.M;
        if (jbVar != null) {
            return jbVar.getDrawable();
        }
        if (kbVar.O) {
            return kbVar.N;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.V;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean k(int i) {
        boolean zB = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof lb)) {
            zB = ((lb) childAt).b();
        }
        return (i <= 0 || !(childAt2 instanceof lb)) ? zB : ((lb) childAt2).c() | zB;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        kb kbVar = this.a0;
        if (kbVar != null) {
            kbVar.i();
            if (this.a0.j()) {
                this.a0.g();
                this.a0.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kb kbVar = this.a0;
        if (kbVar != null) {
            kbVar.g();
            hb hbVar = kbVar.X;
            if (hbVar == null || !hbVar.b()) {
                return;
            }
            hbVar.i.dismiss();
        }
    }

    @Override // defpackage.i6a, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.c0) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = wyi.a;
        boolean z3 = getLayoutDirection() == 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                mb mbVar = (mb) childAt.getLayoutParams();
                if (mbVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) mbVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) mbVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) mbVar).leftMargin) + ((LinearLayout.LayoutParams) mbVar).rightMargin;
                    k(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                mb mbVar2 = (mb) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !mbVar2.a) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) mbVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) mbVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            mb mbVar3 = (mb) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !mbVar3.a) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) mbVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) mbVar3).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // defpackage.i6a, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        vcb vcbVar;
        boolean z = this.c0;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.c0 = z2;
        if (z != z2) {
            this.d0 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.c0 && (vcbVar = this.T) != null && size != this.d0) {
            this.d0 = size;
            vcbVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.c0 || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                mb mbVar = (mb) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) mbVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) mbVar).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.e0;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i13 = 0;
        int iMax2 = 0;
        int i14 = 0;
        boolean z3 = false;
        int i15 = 0;
        long j = 0;
        while (true) {
            i3 = this.f0;
            if (i14 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i14);
            int i16 = size3;
            int i17 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i13++;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                mb mbVar2 = (mb) childAt.getLayoutParams();
                mbVar2.f = false;
                mbVar2.c = 0;
                mbVar2.b = 0;
                mbVar2.d = false;
                ((LinearLayout.LayoutParams) mbVar2).leftMargin = 0;
                ((LinearLayout.LayoutParams) mbVar2).rightMargin = 0;
                mbVar2.e = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i18 = mbVar2.a ? 1 : i10;
                mb mbVar3 = (mb) childAt.getLayoutParams();
                int i19 = i10;
                i5 = i12;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i17, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i18 <= 0 || (z5 && i18 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i18, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                mbVar3.d = !mbVar3.a && z6;
                mbVar3.b = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i6);
                if (mbVar2.d) {
                    i15++;
                }
                if (mbVar2.a) {
                    z3 = true;
                }
                i10 = i19 - i6;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= (long) (1 << i14);
                }
            }
            i14++;
            size3 = i16;
            paddingBottom = i17;
            i12 = i5;
        }
        int i20 = size3;
        int i21 = i10;
        int i22 = i12;
        boolean z7 = z3 && i13 == 2;
        int i23 = i21;
        boolean z8 = false;
        while (i15 > 0 && i23 > 0) {
            int i24 = Integer.MAX_VALUE;
            long j2 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i26 < childCount2) {
                int i27 = iMax;
                mb mbVar4 = (mb) getChildAt(i26).getLayoutParams();
                boolean z9 = z7;
                if (mbVar4.d) {
                    int i28 = mbVar4.b;
                    if (i28 < i24) {
                        j2 = 1 << i26;
                        i24 = i28;
                        i25 = 1;
                    } else if (i28 == i24) {
                        j2 |= 1 << i26;
                        i25++;
                    }
                }
                i26++;
                z7 = z9;
                iMax = i27;
            }
            i4 = iMax;
            boolean z10 = z7;
            j |= j2;
            if (i25 > i23) {
                break;
            }
            int i29 = i24 + 1;
            int i30 = 0;
            while (i30 < childCount2) {
                View childAt2 = getChildAt(i30);
                mb mbVar5 = (mb) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i30;
                if ((j2 & j3) != 0) {
                    if (z10 && mbVar5.e) {
                        r11 = 1;
                        r11 = 1;
                        if (i23 == 1) {
                            childAt2.setPadding(i3 + i22, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    mbVar5.b += r11;
                    mbVar5.f = r11;
                    i23--;
                } else if (mbVar5.b == i29) {
                    j |= j3;
                }
                i30++;
                z3 = z11;
            }
            z7 = z10;
            iMax = i4;
            z8 = true;
        }
        i4 = iMax;
        boolean z12 = !z3 && i13 == 1;
        if (i23 > 0 && j != 0 && (i23 < i13 - 1 || z12 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((mb) getChildAt(0).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount2 - 1;
                if ((j & ((long) (1 << i31))) != 0 && !((mb) getChildAt(i31).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > MTTypesetterKt.kLineSkipLimitMultiplier ? (int) ((i23 * i22) / fBitCount) : 0;
            boolean z13 = z8;
            for (int i33 = 0; i33 < childCount2; i33++) {
                if ((j & ((long) (1 << i33))) != 0) {
                    View childAt3 = getChildAt(i33);
                    mb mbVar6 = (mb) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        mbVar6.c = i32;
                        mbVar6.f = true;
                        if (i33 == 0 && !mbVar6.e) {
                            ((LinearLayout.LayoutParams) mbVar6).leftMargin = (-i32) / 2;
                        }
                        z13 = true;
                    } else if (mbVar6.a) {
                        mbVar6.c = i32;
                        mbVar6.f = true;
                        ((LinearLayout.LayoutParams) mbVar6).rightMargin = (-i32) / 2;
                        z13 = true;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) mbVar6).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) mbVar6).rightMargin = i32 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt4 = getChildAt(i34);
                mb mbVar7 = (mb) childAt4.getLayoutParams();
                if (mbVar7.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((mbVar7.b * i22) + mbVar7.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.a0.U = z;
    }

    public void setOnMenuItemClickListener(nb nbVar) {
        this.g0 = nbVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        kb kbVar = this.a0;
        jb jbVar = kbVar.M;
        if (jbVar != null) {
            jbVar.setImageDrawable(drawable);
        } else {
            kbVar.O = true;
            kbVar.N = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.W = z;
    }

    public void setPopupTheme(int i) {
        if (this.V != i) {
            this.V = i;
            if (i == 0) {
                this.U = getContext();
            } else {
                this.U = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(kb kbVar) {
        this.a0 = kbVar;
        kbVar.L = this;
        this.T = kbVar.G;
    }

    @Override // defpackage.i6a, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }
}
