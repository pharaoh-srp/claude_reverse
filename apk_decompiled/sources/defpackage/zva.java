package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zva extends kg0 {
    public static final int[] f0 = {R.attr.state_indeterminate};
    public static final int[] g0 = {R.attr.state_error};
    public static final int[][] h0 = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int i0 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public final LinkedHashSet I;
    public final LinkedHashSet J;
    public ColorStateList K;
    public boolean L;
    public boolean M;
    public boolean N;
    public CharSequence O;
    public Drawable P;
    public Drawable Q;
    public boolean R;
    public ColorStateList S;
    public ColorStateList T;
    public PorterDuff.Mode U;
    public int V;
    public int[] W;
    public boolean a0;
    public CharSequence b0;
    public CompoundButton.OnCheckedChangeListener c0;
    public final z90 d0;
    public final xva e0;

    public zva(Context context, AttributeSet attributeSet) {
        int resourceId;
        ColorStateList colorStateListA;
        int resourceId2;
        ColorStateList colorStateListA2;
        int resourceId3;
        super(dtj.o(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet);
        this.I = new LinkedHashSet();
        this.J = new LinkedHashSet();
        Context context2 = getContext();
        z90 z90Var = new z90(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = iqe.a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        z90Var.E = drawable;
        drawable.setCallback(z90Var.J);
        new y90(z90Var.E.getConstantState());
        this.d0 = z90Var;
        this.e0 = new xva(this);
        Context context3 = getContext();
        this.P = getButtonDrawable();
        this.S = getSuperButtonTintList();
        setSupportButtonTintList(null);
        ywj.f(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        int[] iArr = s0e.f;
        ywj.g(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        this.Q = (!typedArrayObtainStyledAttributes.hasValue(2) || (resourceId3 = typedArrayObtainStyledAttributes.getResourceId(2, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(2) : xn5.c0(context3, resourceId3);
        if (this.P != null && amk.h(R.attr.isMaterial3Theme, context3, false)) {
            int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (resourceId4 == i0 && resourceId5 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.P = xn5.c0(context3, R.drawable.mtrl_checkbox_button);
                this.R = true;
                if (this.Q == null) {
                    this.Q = xn5.c0(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.T = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId2 = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateListA2 = iqe.a(context3.getResources(), resourceId2, context3.getTheme())) == null) ? (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateListA = iqe.a(context3.getResources(), resourceId, context3.getTheme())) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateListA : colorStateListA2;
        int i = typedArrayObtainStyledAttributes.getInt(4, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.U = sik.g(i);
        this.L = typedArrayObtainStyledAttributes.getBoolean(10, false);
        this.M = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.N = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.O = typedArrayObtainStyledAttributes.getText(8);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(7, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.V;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.K == null) {
            int iK = cmk.k(this, R.attr.colorControlActivated);
            int iK2 = cmk.k(this, R.attr.colorError);
            int iK3 = cmk.k(this, R.attr.colorSurface);
            int iK4 = cmk.k(this, R.attr.colorOnSurface);
            this.K = new ColorStateList(h0, new int[]{cmk.s(1.0f, iK3, iK2), cmk.s(1.0f, iK3, iK), cmk.s(0.54f, iK3, iK4), cmk.s(0.38f, iK3, iK4), cmk.s(0.38f, iK3, iK4)});
        }
        return this.K;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.S;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        int intrinsicHeight;
        int intrinsicWidth;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        q9 q9Var;
        Drawable drawableMutate = this.P;
        ColorStateList colorStateList3 = this.S;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (buttonTintMode != null) {
                drawableMutate.setTintMode(buttonTintMode);
            }
        }
        this.P = drawableMutate;
        Drawable drawableMutate2 = this.Q;
        ColorStateList colorStateList4 = this.T;
        PorterDuff.Mode mode = this.U;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
        }
        this.Q = drawableMutate2;
        if (this.R) {
            z90 z90Var = this.d0;
            if (z90Var != null) {
                x90 x90Var = z90Var.F;
                Drawable drawable = z90Var.E;
                xva xvaVar = this.e0;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (xvaVar.a == null) {
                        xvaVar.a = new z70(xvaVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(xvaVar.a);
                }
                ArrayList arrayList = z90Var.I;
                if (arrayList != null && xvaVar != null) {
                    arrayList.remove(xvaVar);
                    if (z90Var.I.size() == 0 && (q9Var = z90Var.H) != null) {
                        x90Var.b.removeListener(q9Var);
                        z90Var.H = null;
                    }
                }
                Drawable drawable2 = z90Var.E;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (xvaVar.a == null) {
                        xvaVar.a = new z70(xvaVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(xvaVar.a);
                } else if (xvaVar != null) {
                    if (z90Var.I == null) {
                        z90Var.I = new ArrayList();
                    }
                    if (!z90Var.I.contains(xvaVar)) {
                        z90Var.I.add(xvaVar);
                        if (z90Var.H == null) {
                            z90Var.H = new q9(1, z90Var);
                        }
                        x90Var.b.addListener(z90Var.H);
                    }
                }
            }
            Drawable drawable3 = this.P;
            if ((drawable3 instanceof AnimatedStateListDrawable) && z90Var != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, z90Var, false);
                ((AnimatedStateListDrawable) this.P).addTransition(R.id.indeterminate, R.id.unchecked, z90Var, false);
            }
        }
        Drawable drawable4 = this.P;
        if (drawable4 != null && (colorStateList2 = this.S) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.Q;
        if (drawable5 != null && (colorStateList = this.T) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.P;
        Drawable drawable7 = this.Q;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            if (drawable7.getIntrinsicWidth() == -1 || drawable7.getIntrinsicHeight() == -1) {
                int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                intrinsicHeight = drawable6.getIntrinsicHeight();
                intrinsicWidth = intrinsicWidth2;
            } else if (drawable7.getIntrinsicWidth() > drawable6.getIntrinsicWidth() || drawable7.getIntrinsicHeight() > drawable6.getIntrinsicHeight()) {
                float intrinsicWidth3 = drawable7.getIntrinsicWidth() / drawable7.getIntrinsicHeight();
                if (intrinsicWidth3 >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    intrinsicWidth = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth / intrinsicWidth3);
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (intrinsicWidth3 * intrinsicHeight);
                }
            } else {
                intrinsicWidth = drawable7.getIntrinsicWidth();
                intrinsicHeight = drawable7.getIntrinsicHeight();
            }
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.P;
    }

    public Drawable getButtonIconDrawable() {
        return this.Q;
    }

    public ColorStateList getButtonIconTintList() {
        return this.T;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.U;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.S;
    }

    public int getCheckedState() {
        return this.V;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.O;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.V == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.L && this.S == null && this.T == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f0);
        }
        if (this.N) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, g0);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= iArrOnCreateDrawableState.length) {
                iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
                iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
                break;
            }
            int i3 = iArrOnCreateDrawableState[i2];
            if (i3 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
                break;
            }
            if (i3 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i2] = 16842912;
                break;
            }
            i2++;
        }
        this.W = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.M || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        WeakHashMap weakHashMap = mvi.a;
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, MTTypesetterKt.kLineSkipLimitMultiplier);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.N) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.O));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof yva)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        yva yvaVar = (yva) parcelable;
        super.onRestoreInstanceState(yvaVar.getSuperState());
        setCheckedState(yvaVar.E);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        yva yvaVar = new yva(super.onSaveInstanceState());
        yvaVar.E = getCheckedState();
        return yvaVar;
    }

    @Override // defpackage.kg0, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(xn5.c0(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.Q = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(xn5.c0(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.T == colorStateList) {
            return;
        }
        this.T = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.U == mode) {
            return;
        }
        this.U = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.S == colorStateList) {
            return;
        }
        this.S = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.M = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.V != i) {
            this.V = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.b0 == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.a0) {
                return;
            }
            this.a0 = true;
            LinkedHashSet linkedHashSet = this.J;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    mr9.o();
                    return;
                }
            }
            if (this.V != 2 && (onCheckedChangeListener = this.c0) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.a0 = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.O = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.N == z) {
            return;
        }
        this.N = z;
        refreshDrawableState();
        Iterator it = this.I.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            mr9.o();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.c0 = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.b0 = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.L = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // defpackage.kg0, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.P = drawable;
        this.R = false;
        a();
    }
}
