package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import defpackage.adb;
import defpackage.b2i;
import defpackage.fb;
import defpackage.gb;
import defpackage.ji0;
import defpackage.lb;
import defpackage.t0e;
import defpackage.ucb;
import defpackage.vcb;
import defpackage.xdb;

/* JADX INFO: loaded from: classes2.dex */
public class ActionMenuItemView extends ji0 implements xdb, View.OnClickListener, lb {
    public adb L;
    public CharSequence M;
    public Drawable N;
    public ucb O;
    public fb P;
    public gb Q;
    public boolean R;
    public boolean S;
    public final int T;
    public int U;
    public final int V;

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.R = g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t0e.c, i, 0);
        this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.V = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.U = -1;
        setSaveEnabled(false);
    }

    @Override // defpackage.xdb
    public final void a(adb adbVar) {
        this.L = adbVar;
        setIcon(adbVar.getIcon());
        setTitle(adbVar.getTitleCondensed());
        setId(adbVar.a);
        setVisibility(adbVar.isVisible() ? 0 : 8);
        setEnabled(adbVar.isEnabled());
        if (adbVar.hasSubMenu() && this.P == null) {
            this.P = new fb(this);
        }
    }

    @Override // defpackage.lb
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // defpackage.lb
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.L.getIcon() == null;
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // defpackage.xdb
    public adb getItemData() {
        return this.L;
    }

    public final void h() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.M);
        if (this.N != null && ((this.L.y & 4) != 4 || (!this.R && !this.S))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.M : null);
        CharSequence charSequence = this.L.q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.L.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.L.r;
        if (TextUtils.isEmpty(charSequence2)) {
            b2i.a(this, z3 ? null : this.L.e);
        } else {
            b2i.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ucb ucbVar = this.O;
        if (ucbVar != null) {
            ucbVar.a(this.L);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.R = g();
        h();
    }

    @Override // defpackage.ji0, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i3 = this.U) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.T;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zIsEmpty || this.N == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.N.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        fb fbVar;
        if (this.L.hasSubMenu() && (fbVar = this.P) != null && fbVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.S != z) {
            this.S = z;
            adb adbVar = this.L;
            if (adbVar != null) {
                vcb vcbVar = adbVar.n;
                vcbVar.k = true;
                vcbVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.N = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.V;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(ucb ucbVar) {
        this.O = ucbVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.U = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(gb gbVar) {
        this.Q = gbVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.M = charSequence;
        h();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }
}
