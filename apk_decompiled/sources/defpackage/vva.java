package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class vva extends jg0 implements Checkable, i1g {
    public static final int[] U = {R.attr.state_checkable};
    public static final int[] V = {R.attr.state_checked};
    public final wva H;
    public final LinkedHashSet I;
    public PorterDuff.Mode J;
    public ColorStateList K;
    public Drawable L;
    public String M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public boolean R;
    public boolean S;
    public int T;

    public vva(Context context, AttributeSet attributeSet) {
        int resourceId;
        Drawable drawableC0;
        super(dtj.o(context, attributeSet, com.anthropic.claude.R.attr.materialButtonStyle, com.anthropic.claude.R.style.Widget_MaterialComponents_Button), attributeSet, com.anthropic.claude.R.attr.materialButtonStyle);
        this.I = new LinkedHashSet();
        this.R = false;
        this.S = false;
        Context context2 = getContext();
        ywj.f(context2, attributeSet, com.anthropic.claude.R.attr.materialButtonStyle, com.anthropic.claude.R.style.Widget_MaterialComponents_Button);
        int[] iArr = s0e.e;
        ywj.g(context2, attributeSet, iArr, com.anthropic.claude.R.attr.materialButtonStyle, com.anthropic.claude.R.style.Widget_MaterialComponents_Button, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.anthropic.claude.R.attr.materialButtonStyle, com.anthropic.claude.R.style.Widget_MaterialComponents_Button);
        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        int i = typedArrayObtainStyledAttributes.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.J = sik.g(i);
        this.K = dmk.g(getContext(), typedArrayObtainStyledAttributes, 14);
        this.L = (!typedArrayObtainStyledAttributes.hasValue(10) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(10, 0)) == 0 || (drawableC0 = xn5.c0(getContext(), resourceId)) == null) ? typedArrayObtainStyledAttributes.getDrawable(10) : drawableC0;
        this.T = typedArrayObtainStyledAttributes.getInteger(11, 1);
        this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, 0);
        wva wvaVar = new wva(this, f0g.a(context2, attributeSet, com.anthropic.claude.R.attr.materialButtonStyle, com.anthropic.claude.R.style.Widget_MaterialComponents_Button).d());
        this.H = wvaVar;
        wvaVar.c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        wvaVar.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0);
        wvaVar.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
        wvaVar.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8)) {
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, -1);
            wvaVar.g = dimensionPixelSize;
            float f = dimensionPixelSize;
            g81 g81VarD = wvaVar.b.d();
            g81VarD.e = new y(f);
            g81VarD.f = new y(f);
            g81VarD.g = new y(f);
            g81VarD.h = new y(f);
            wvaVar.c(g81VarD.d());
            wvaVar.p = true;
        }
        wvaVar.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(20, 0);
        wvaVar.i = sik.g(typedArrayObtainStyledAttributes.getInt(7, -1));
        wvaVar.j = dmk.g(getContext(), typedArrayObtainStyledAttributes, 6);
        wvaVar.k = dmk.g(getContext(), typedArrayObtainStyledAttributes, 19);
        wvaVar.l = dmk.g(getContext(), typedArrayObtainStyledAttributes, 16);
        wvaVar.q = typedArrayObtainStyledAttributes.getBoolean(5, false);
        wvaVar.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, 0);
        wvaVar.r = typedArrayObtainStyledAttributes.getBoolean(21, true);
        WeakHashMap weakHashMap = mvi.a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            wvaVar.o = true;
            setSupportBackgroundTintList(wvaVar.j);
            setSupportBackgroundTintMode(wvaVar.i);
        } else {
            wvaVar.e();
        }
        setPaddingRelative(paddingStart + wvaVar.c, paddingTop + wvaVar.e, paddingEnd + wvaVar.d, paddingBottom + wvaVar.f);
        typedArrayObtainStyledAttributes.recycle();
        setCompoundDrawablePadding(this.Q);
        c(this.L != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = MTTypesetterKt.kLineSkipLimitMultiplier;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    public final boolean a() {
        wva wvaVar = this.H;
        return (wvaVar == null || wvaVar.o) ? false : true;
    }

    public final void b() {
        int i = this.T;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.L, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.L, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.L, null, null);
        }
    }

    public final void c(boolean z) {
        Drawable drawable = this.L;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.L = drawableMutate;
            drawableMutate.setTintList(this.K);
            PorterDuff.Mode mode = this.J;
            if (mode != null) {
                this.L.setTintMode(mode);
            }
            int intrinsicWidth = this.N;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.L.getIntrinsicWidth();
            }
            int intrinsicHeight = this.N;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.L.getIntrinsicHeight();
            }
            Drawable drawable2 = this.L;
            int i = this.O;
            int i2 = this.P;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.L.setVisible(true, z);
        }
        if (z) {
            b();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i3 = this.T;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.L) || (((i3 == 3 || i3 == 4) && drawable5 != this.L) || ((i3 == 16 || i3 == 32) && drawable4 != this.L))) {
            b();
        }
    }

    public final void d(int i, int i2) {
        if (this.L == null || getLayout() == null) {
            return;
        }
        int i3 = this.T;
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.O = 0;
                if (i3 == 16) {
                    this.P = 0;
                    c(false);
                    return;
                }
                int intrinsicHeight = this.N;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.L.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.Q) - getPaddingBottom()) / 2);
                if (this.P != iMax) {
                    this.P = iMax;
                    c(false);
                    return;
                }
                return;
            }
            return;
        }
        this.P = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.T;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.O = 0;
            c(false);
            return;
        }
        int intrinsicWidth = this.N;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.L.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap weakHashMap = mvi.a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - intrinsicWidth) - this.Q) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.T == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.O != paddingEnd) {
            this.O = paddingEnd;
            c(false);
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.M)) {
            return this.M;
        }
        wva wvaVar = this.H;
        return ((wvaVar == null || !wvaVar.q) ? Button.class : CompoundButton.class).getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.H.g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.L;
    }

    public int getIconGravity() {
        return this.T;
    }

    public int getIconPadding() {
        return this.Q;
    }

    public int getIconSize() {
        return this.N;
    }

    public ColorStateList getIconTint() {
        return this.K;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.J;
    }

    public int getInsetBottom() {
        return this.H.f;
    }

    public int getInsetTop() {
        return this.H.e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.H.l;
        }
        return null;
    }

    public f0g getShapeAppearanceModel() {
        if (a()) {
            return this.H.b;
        }
        sz6.j("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.H.k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.H.h;
        }
        return 0;
    }

    @Override // defpackage.jg0
    public ColorStateList getSupportBackgroundTintList() {
        return a() ? this.H.j : super.getSupportBackgroundTintList();
    }

    @Override // defpackage.jg0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return a() ? this.H.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.R;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            cwa cwaVarB = this.H.b(false);
            mk6 mk6Var = cwaVarB.E.b;
            if (mk6Var == null || !mk6Var.a) {
                return;
            }
            float elevation = MTTypesetterKt.kLineSkipLimitMultiplier;
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap weakHashMap = mvi.a;
                elevation += ((View) parent).getElevation();
            }
            bwa bwaVar = cwaVarB.E;
            if (bwaVar.l != elevation) {
                bwaVar.l = elevation;
                cwaVarB.h();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        wva wvaVar = this.H;
        if (wvaVar != null && wvaVar.q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, U);
        }
        if (this.R) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, V);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // defpackage.jg0, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.R);
    }

    @Override // defpackage.jg0, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        wva wvaVar = this.H;
        accessibilityNodeInfo.setCheckable(wvaVar != null && wvaVar.q);
        accessibilityNodeInfo.setChecked(this.R);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // defpackage.jg0, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof uva)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        uva uvaVar = (uva) parcelable;
        super.onRestoreInstanceState(uvaVar.E);
        setChecked(uvaVar.G);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        uva uvaVar = new uva(super.onSaveInstanceState());
        uvaVar.G = this.R;
        return uvaVar;
    }

    @Override // defpackage.jg0, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.H.r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.L != null) {
            if (this.L.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.M = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!a()) {
            super.setBackgroundColor(i);
            return;
        }
        wva wvaVar = this.H;
        if (wvaVar.b(false) != null) {
            wvaVar.b(false).setTint(i);
        }
    }

    @Override // defpackage.jg0, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        wva wvaVar = this.H;
        wvaVar.o = true;
        vva vvaVar = wvaVar.a;
        vvaVar.setSupportBackgroundTintList(wvaVar.j);
        vvaVar.setSupportBackgroundTintMode(wvaVar.i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.jg0, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? xn5.c0(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (a()) {
            this.H.q = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        wva wvaVar = this.H;
        if (wvaVar == null || !wvaVar.q || !isEnabled() || this.R == z) {
            return;
        }
        this.R = z;
        refreshDrawableState();
        getParent();
        if (this.S) {
            return;
        }
        this.S = true;
        Iterator it = this.I.iterator();
        if (!it.hasNext()) {
            this.S = false;
        } else {
            it.next().getClass();
            mr9.o();
        }
    }

    public void setCornerRadius(int i) {
        if (a()) {
            wva wvaVar = this.H;
            if (wvaVar.p && wvaVar.g == i) {
                return;
            }
            wvaVar.g = i;
            wvaVar.p = true;
            float f = i;
            g81 g81VarD = wvaVar.b.d();
            g81VarD.e = new y(f);
            g81VarD.f = new y(f);
            g81VarD.g = new y(f);
            g81VarD.h = new y(f);
            wvaVar.c(g81VarD.d());
        }
    }

    public void setCornerRadiusResource(int i) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (a()) {
            cwa cwaVarB = this.H.b(false);
            bwa bwaVar = cwaVarB.E;
            if (bwaVar.m != f) {
                bwaVar.m = f;
                cwaVarB.h();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.L != drawable) {
            this.L = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.T != i) {
            this.T = i;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.Q != i) {
            this.Q = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? xn5.c0(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            sz6.p("iconSize cannot be less than 0");
        } else if (this.N != i) {
            this.N = i;
            c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.K != colorStateList) {
            this.K = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.J != mode) {
            this.J = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(x44.K(getContext(), i));
    }

    public void setInsetBottom(int i) {
        wva wvaVar = this.H;
        wvaVar.d(wvaVar.e, i);
    }

    public void setInsetTop(int i) {
        wva wvaVar = this.H;
        wvaVar.d(i, wvaVar.f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(tva tvaVar) {
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            wva wvaVar = this.H;
            vva vvaVar = wvaVar.a;
            if (wvaVar.l != colorStateList) {
                wvaVar.l = colorStateList;
                if (vvaVar.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) vvaVar.getBackground()).setColor(uue.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (a()) {
            setRippleColor(x44.K(getContext(), i));
        }
    }

    @Override // defpackage.i1g
    public void setShapeAppearanceModel(f0g f0gVar) {
        if (a()) {
            this.H.c(f0gVar);
        } else {
            sz6.j("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (a()) {
            wva wvaVar = this.H;
            wvaVar.n = z;
            wvaVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            wva wvaVar = this.H;
            if (wvaVar.k != colorStateList) {
                wvaVar.k = colorStateList;
                wvaVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (a()) {
            setStrokeColor(x44.K(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (a()) {
            wva wvaVar = this.H;
            if (wvaVar.h != i) {
                wvaVar.h = i;
                wvaVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // defpackage.jg0
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        wva wvaVar = this.H;
        if (wvaVar.j != colorStateList) {
            wvaVar.j = colorStateList;
            if (wvaVar.b(false) != null) {
                wvaVar.b(false).setTintList(wvaVar.j);
            }
        }
    }

    @Override // defpackage.jg0
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        wva wvaVar = this.H;
        if (wvaVar.i != mode) {
            wvaVar.i = mode;
            if (wvaVar.b(false) == null || wvaVar.i == null) {
                return;
            }
            wvaVar.b(false).setTintMode(wvaVar.i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.H.r = z;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.R);
    }
}
