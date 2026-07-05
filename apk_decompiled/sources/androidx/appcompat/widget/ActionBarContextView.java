package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import defpackage.gyi;
import defpackage.hb;
import defpackage.kb;
import defpackage.mvi;
import defpackage.ob;
import defpackage.p9;
import defpackage.sz6;
import defpackage.t;
import defpackage.t0e;
import defpackage.vcb;
import defpackage.wyi;
import defpackage.xn5;
import defpackage.ydb;

/* JADX INFO: loaded from: classes2.dex */
public class ActionBarContextView extends ViewGroup {
    public final t E;
    public final Context F;
    public ActionMenuView G;
    public kb H;
    public int I;
    public gyi J;
    public boolean K;
    public boolean L;
    public CharSequence M;
    public CharSequence N;
    public View O;
    public View P;
    public View Q;
    public LinearLayout R;
    public TextView S;
    public TextView T;
    public final int U;
    public final int V;
    public boolean W;
    public final int a0;

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        super(context, attributeSet, i);
        t tVar = new t();
        tVar.c = this;
        tVar.b = false;
        this.E = tVar;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.F = context;
        } else {
            this.F = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t0e.d, i, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : xn5.c0(context, resourceId));
        this.U = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.V = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.I = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.a0 = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int g(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public final void c(ob obVar) {
        View view = this.O;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.a0, (ViewGroup) this, false);
            this.O = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.O);
        }
        View viewFindViewById = this.O.findViewById(R.id.action_mode_close_button);
        this.P = viewFindViewById;
        viewFindViewById.setOnClickListener(new p9(0, obVar));
        vcb vcbVarD = obVar.d();
        kb kbVar = this.H;
        if (kbVar != null) {
            kbVar.g();
            hb hbVar = kbVar.X;
            if (hbVar != null && hbVar.b()) {
                hbVar.i.dismiss();
            }
        }
        kb kbVar2 = new kb(getContext());
        this.H = kbVar2;
        kbVar2.P = true;
        kbVar2.Q = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        vcbVarD.b(this.H, this.F);
        kb kbVar3 = this.H;
        ydb ydbVar = kbVar3.L;
        if (ydbVar == null) {
            ydb ydbVar2 = (ydb) kbVar3.H.inflate(kbVar3.J, (ViewGroup) this, false);
            kbVar3.L = ydbVar2;
            ydbVar2.b(kbVar3.G);
            kbVar3.i();
        }
        ydb ydbVar3 = kbVar3.L;
        if (ydbVar != ydbVar3) {
            ((ActionMenuView) ydbVar3).setPresenter(kbVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) ydbVar3;
        this.G = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.G, layoutParams);
    }

    public final void d() {
        if (this.R == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.R = linearLayout;
            this.S = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.T = (TextView) this.R.findViewById(R.id.action_bar_subtitle);
            int i = this.U;
            if (i != 0) {
                this.S.setTextAppearance(getContext(), i);
            }
            int i2 = this.V;
            if (i2 != 0) {
                this.T.setTextAppearance(getContext(), i2);
            }
        }
        this.S.setText(this.M);
        this.T.setText(this.N);
        boolean zIsEmpty = TextUtils.isEmpty(this.M);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.N);
        this.T.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.R.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.R.getParent() == null) {
            addView(this.R);
        }
    }

    public final void e() {
        removeAllViews();
        this.Q = null;
        this.G = null;
        this.H = null;
        View view = this.P;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.J != null ? this.E.a : getVisibility();
    }

    public int getContentHeight() {
        return this.I;
    }

    public CharSequence getSubtitle() {
        return this.N;
    }

    public CharSequence getTitle() {
        return this.M;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            gyi gyiVar = this.J;
            if (gyiVar != null) {
                gyiVar.b();
            }
            super.setVisibility(i);
        }
    }

    public final gyi i(int i, long j) {
        gyi gyiVar = this.J;
        if (gyiVar != null) {
            gyiVar.b();
        }
        t tVar = this.E;
        if (i != 0) {
            gyi gyiVarA = mvi.a(this);
            gyiVarA.a(MTTypesetterKt.kLineSkipLimitMultiplier);
            gyiVarA.c(j);
            ((ActionBarContextView) tVar.c).J = gyiVarA;
            tVar.a = i;
            gyiVarA.d(tVar);
            return gyiVarA;
        }
        if (getVisibility() != 0) {
            setAlpha(MTTypesetterKt.kLineSkipLimitMultiplier);
        }
        gyi gyiVarA2 = mvi.a(this);
        gyiVarA2.a(1.0f);
        gyiVarA2.c(j);
        ((ActionBarContextView) tVar.c).J = gyiVarA2;
        tVar.a = i;
        gyiVarA2.d(tVar);
        return gyiVarA2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, t0e.a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        kb kbVar = this.H;
        if (kbVar != null) {
            Configuration configuration2 = kbVar.F.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            kbVar.T = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            vcb vcbVar = kbVar.G;
            if (vcbVar != null) {
                vcbVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kb kbVar = this.H;
        if (kbVar != null) {
            kbVar.g();
            hb hbVar = this.H.X;
            if (hbVar == null || !hbVar.b()) {
                return;
            }
            hbVar.i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.L = false;
        }
        if (!this.L) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.L = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.L = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = wyi.a;
        boolean z3 = getLayoutDirection() == 1;
        int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.O;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.O.getLayoutParams();
            int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z3 ? paddingRight - i5 : paddingRight + i5;
            int iG = g(this.O, i7, paddingTop, paddingTop2, z3) + i7;
            paddingRight = z3 ? iG - i6 : iG + i6;
        }
        LinearLayout linearLayout = this.R;
        if (linearLayout != null && this.Q == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.R, paddingRight, paddingTop, paddingTop2, z3);
        }
        View view2 = this.Q;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z3);
        }
        int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.G;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            sz6.j(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            sz6.j(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.I;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.O;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.O.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.G;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.G, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.R;
        if (linearLayout != null && this.Q == null) {
            if (this.W) {
                this.R.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.R.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.R.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.Q;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.Q.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.I > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.K = false;
        }
        if (!this.K) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.K = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.K = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.I = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.Q;
        if (view2 != null) {
            removeView(view2);
        }
        this.Q = view;
        if (view != null && (linearLayout = this.R) != null) {
            removeView(linearLayout);
            this.R = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.N = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.M = charSequence;
        d();
        mvi.i(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.W) {
            requestLayout();
        }
        this.W = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }
}
