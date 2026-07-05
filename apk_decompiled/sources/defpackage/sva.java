package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes2.dex */
public final class sva extends hg0 {
    public final eaa I;
    public final AccessibilityManager J;
    public final int K;
    public final float L;
    public int M;
    public ColorStateList N;

    public sva(Context context, AttributeSet attributeSet) {
        super(dtj.o(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, R.attr.autoCompleteTextViewStyle);
        new Rect();
        Context context2 = getContext();
        ywj.f(context2, attributeSet, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView);
        int[] iArr = s0e.d;
        ywj.g(context2, attributeSet, iArr, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView);
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.K = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.mtrl_auto_complete_simple_item);
        this.L = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        this.M = typedArrayObtainStyledAttributes.getColor(3, 0);
        this.N = dmk.g(context2, typedArrayObtainStyledAttributes, 4);
        this.J = (AccessibilityManager) context2.getSystemService("accessibility");
        eaa eaaVar = new eaa(context2, null, R.attr.listPopupWindowStyle, 0);
        this.I = eaaVar;
        eaaVar.c0 = true;
        jh0 jh0Var = eaaVar.d0;
        jh0Var.setFocusable(true);
        eaaVar.S = this;
        jh0Var.setInputMethodMode(2);
        eaaVar.p(getAdapter());
        eaaVar.T = new uh0(1, this);
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setSimpleItems(typedArrayObtainStyledAttributes.getResourceId(5, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void a(sva svaVar, Object obj) {
        svaVar.setText(svaVar.convertSelectionToString(obj), false);
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        AccessibilityManager accessibilityManager = this.J;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.dismissDropDown();
        } else {
            this.I.dismiss();
        }
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
        }
        return super.getHint();
    }

    public float getPopupElevation() {
        return this.L;
    }

    public int getSimpleItemSelectedColor() {
        return this.M;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.N;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            getAdapter();
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, 0), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        AccessibilityManager accessibilityManager = this.J;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.onWindowFocusChanged(z);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.I.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        eaa eaaVar = this.I;
        if (eaaVar != null) {
            eaaVar.k(drawable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.I.U = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.M = i;
        if (getAdapter() instanceof rva) {
            ((rva) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.N = colorStateList;
        if (getAdapter() instanceof rva) {
            ((rva) getAdapter()).a();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new rva(this, getContext(), this.K, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.J;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.I.g();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }
}
