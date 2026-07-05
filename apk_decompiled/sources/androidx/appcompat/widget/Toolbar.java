package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.anthropic.claude.R;
import defpackage.adb;
import defpackage.b2i;
import defpackage.fj0;
import defpackage.fnf;
import defpackage.gh0;
import defpackage.h1i;
import defpackage.hh0;
import defpackage.i1i;
import defpackage.ixe;
import defpackage.j1i;
import defpackage.ji0;
import defpackage.k1i;
import defpackage.k51;
import defpackage.kb;
import defpackage.kx7;
import defpackage.l1i;
import defpackage.lrb;
import defpackage.m1i;
import defpackage.mvi;
import defpackage.p1i;
import defpackage.p9;
import defpackage.r1i;
import defpackage.t0e;
import defpackage.vcb;
import defpackage.wyi;
import defpackage.xn5;
import defpackage.xo5;
import defpackage.xyg;
import defpackage.xzd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class Toolbar extends ViewGroup {
    public ActionMenuView E;
    public ji0 F;
    public ji0 G;
    public gh0 H;
    public hh0 I;
    public final Drawable J;
    public final CharSequence K;
    public gh0 L;
    public View M;
    public Context N;
    public int O;
    public int P;
    public int Q;
    public final int R;
    public final int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public ixe a0;
    public int b0;
    public int c0;
    public final int d0;
    public CharSequence e0;
    public CharSequence f0;
    public ColorStateList g0;
    public ColorStateList h0;
    public boolean i0;
    public boolean j0;
    public final ArrayList k0;
    public final ArrayList l0;
    public final int[] m0;
    public final fj0 n0;
    public ArrayList o0;
    public final fnf p0;
    public r1i q0;
    public kb r0;
    public j1i s0;
    public boolean t0;
    public OnBackInvokedCallback u0;
    public OnBackInvokedDispatcher v0;
    public boolean w0;
    public final k51 x0;

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d0 = 8388627;
        this.k0 = new ArrayList();
        this.l0 = new ArrayList();
        this.m0 = new int[2];
        this.n0 = new fj0(new h1i(this, 1));
        this.o0 = new ArrayList();
        this.p0 = new fnf(5, this);
        this.x0 = new k51(11, this);
        Context context2 = getContext();
        int[] iArr = t0e.w;
        lrb lrbVarP = lrb.P(context2, attributeSet, iArr, i);
        mvi.g(this, context, iArr, attributeSet, (TypedArray) lrbVarP.G, i);
        TypedArray typedArray = (TypedArray) lrbVarP.G;
        this.P = typedArray.getResourceId(28, 0);
        this.Q = typedArray.getResourceId(19, 0);
        this.d0 = typedArray.getInteger(0, 8388627);
        this.R = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.W = dimensionPixelOffset;
        this.V = dimensionPixelOffset;
        this.U = dimensionPixelOffset;
        this.T = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.T = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.U = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.V = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.W = dimensionPixelOffset5;
        }
        this.S = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        ixe ixeVar = this.a0;
        ixeVar.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            ixeVar.e = dimensionPixelSize;
            ixeVar.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            ixeVar.f = dimensionPixelSize2;
            ixeVar.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            ixeVar.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.b0 = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.c0 = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.J = lrbVarP.y(4);
        this.K = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.N = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableY = lrbVarP.y(16);
        if (drawableY != null) {
            setNavigationIcon(drawableY);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableY2 = lrbVarP.y(11);
        if (drawableY2 != null) {
            setLogo(drawableY2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(lrbVarP.w(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(lrbVarP.w(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        lrbVarP.S();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new xyg(getContext());
    }

    public static k1i h() {
        k1i k1iVar = new k1i(-2, -2);
        k1iVar.b = 0;
        k1iVar.a = 8388627;
        return k1iVar;
    }

    public static k1i i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof k1i;
        if (z) {
            k1i k1iVar = (k1i) layoutParams;
            k1i k1iVar2 = new k1i(k1iVar);
            k1iVar2.b = 0;
            k1iVar2.b = k1iVar.b;
            return k1iVar2;
        }
        if (z) {
            k1i k1iVar3 = new k1i((k1i) layoutParams);
            k1iVar3.b = 0;
            return k1iVar3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            k1i k1iVar4 = new k1i(layoutParams);
            k1iVar4.b = 0;
            return k1iVar4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        k1i k1iVar5 = new k1i(marginLayoutParams);
        k1iVar5.b = 0;
        ((ViewGroup.MarginLayoutParams) k1iVar5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) k1iVar5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) k1iVar5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) k1iVar5).bottomMargin = marginLayoutParams.bottomMargin;
        return k1iVar5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                k1i k1iVar = (k1i) childAt.getLayoutParams();
                if (k1iVar.b == 0 && s(childAt)) {
                    int i3 = k1iVar.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            k1i k1iVar2 = (k1i) childAt2.getLayoutParams();
            if (k1iVar2.b == 0 && s(childAt2)) {
                int i5 = k1iVar2.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        k1i k1iVarH = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (k1i) layoutParams;
        k1iVarH.b = 1;
        if (!z || this.M == null) {
            addView(view, k1iVarH);
        } else {
            view.setLayoutParams(k1iVarH);
            this.l0.add(view);
        }
    }

    public final void c() {
        if (this.L == null) {
            gh0 gh0Var = new gh0(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.L = gh0Var;
            gh0Var.setImageDrawable(this.J);
            this.L.setContentDescription(this.K);
            k1i k1iVarH = h();
            k1iVarH.a = (this.R & 112) | 8388611;
            k1iVarH.b = 2;
            this.L.setLayoutParams(k1iVarH);
            this.L.setOnClickListener(new p9(2, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof k1i);
    }

    public final void d() {
        if (this.a0 == null) {
            ixe ixeVar = new ixe();
            ixeVar.a = 0;
            ixeVar.b = 0;
            ixeVar.c = Integer.MIN_VALUE;
            ixeVar.d = Integer.MIN_VALUE;
            ixeVar.e = 0;
            ixeVar.f = 0;
            ixeVar.g = false;
            ixeVar.h = false;
            this.a0 = ixeVar;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.E;
        if (actionMenuView.T == null) {
            vcb vcbVar = (vcb) actionMenuView.getMenu();
            if (this.s0 == null) {
                this.s0 = new j1i(this);
            }
            this.E.setExpandedActionViewsExclusive(true);
            vcbVar.b(this.s0, this.N);
            t();
        }
    }

    public final void f() {
        if (this.E == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.E = actionMenuView;
            actionMenuView.setPopupTheme(this.O);
            this.E.setOnMenuItemClickListener(this.p0);
            ActionMenuView actionMenuView2 = this.E;
            xzd xzdVar = new xzd(14, this);
            actionMenuView2.getClass();
            actionMenuView2.b0 = xzdVar;
            k1i k1iVarH = h();
            k1iVarH.a = (this.R & 112) | 8388613;
            this.E.setLayoutParams(k1iVarH);
            b(this.E, false);
        }
    }

    public final void g() {
        if (this.H == null) {
            this.H = new gh0(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            k1i k1iVarH = h();
            k1iVarH.a = (this.R & 112) | 8388611;
            this.H.setLayoutParams(k1iVarH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        k1i k1iVar = new k1i(context, attributeSet);
        k1iVar.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t0e.b);
        k1iVar.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        k1iVar.b = 0;
        return k1iVar;
    }

    public CharSequence getCollapseContentDescription() {
        gh0 gh0Var = this.L;
        if (gh0Var != null) {
            return gh0Var.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        gh0 gh0Var = this.L;
        if (gh0Var != null) {
            return gh0Var.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        ixe ixeVar = this.a0;
        if (ixeVar != null) {
            return ixeVar.g ? ixeVar.a : ixeVar.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.c0;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        ixe ixeVar = this.a0;
        if (ixeVar != null) {
            return ixeVar.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        ixe ixeVar = this.a0;
        if (ixeVar != null) {
            return ixeVar.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        ixe ixeVar = this.a0;
        if (ixeVar != null) {
            return ixeVar.g ? ixeVar.b : ixeVar.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.b0;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        vcb vcbVar;
        ActionMenuView actionMenuView = this.E;
        return (actionMenuView == null || (vcbVar = actionMenuView.T) == null || !vcbVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.c0, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.b0, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        hh0 hh0Var = this.I;
        if (hh0Var != null) {
            return hh0Var.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        hh0 hh0Var = this.I;
        if (hh0Var != null) {
            return hh0Var.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.E.getMenu();
    }

    public View getNavButtonView() {
        return this.H;
    }

    public CharSequence getNavigationContentDescription() {
        gh0 gh0Var = this.H;
        if (gh0Var != null) {
            return gh0Var.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        gh0 gh0Var = this.H;
        if (gh0Var != null) {
            return gh0Var.getDrawable();
        }
        return null;
    }

    public kb getOuterActionMenuPresenter() {
        return this.r0;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.E.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.N;
    }

    public int getPopupTheme() {
        return this.O;
    }

    public CharSequence getSubtitle() {
        return this.f0;
    }

    public final TextView getSubtitleTextView() {
        return this.G;
    }

    public CharSequence getTitle() {
        return this.e0;
    }

    public int getTitleMarginBottom() {
        return this.W;
    }

    public int getTitleMarginEnd() {
        return this.U;
    }

    public int getTitleMarginStart() {
        return this.T;
    }

    public int getTitleMarginTop() {
        return this.V;
    }

    public final TextView getTitleTextView() {
        return this.F;
    }

    public xo5 getWrapper() {
        Drawable drawable;
        if (this.q0 == null) {
            r1i r1iVar = new r1i();
            r1iVar.n = 0;
            r1iVar.a = this;
            r1iVar.h = getTitle();
            r1iVar.i = getSubtitle();
            r1iVar.g = r1iVar.h != null;
            r1iVar.f = getNavigationIcon();
            lrb lrbVarP = lrb.P(getContext(), null, t0e.a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) lrbVarP.G;
            r1iVar.o = lrbVarP.y(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                r1iVar.g = true;
                r1iVar.h = text;
                if ((r1iVar.b & 8) != 0) {
                    setTitle(text);
                    if (r1iVar.g) {
                        mvi.i(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                r1iVar.i = text2;
                if ((r1iVar.b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableY = lrbVarP.y(20);
            if (drawableY != null) {
                r1iVar.e = drawableY;
                r1iVar.c();
            }
            Drawable drawableY2 = lrbVarP.y(17);
            if (drawableY2 != null) {
                r1iVar.d = drawableY2;
                r1iVar.c();
            }
            if (r1iVar.f == null && (drawable = r1iVar.o) != null) {
                r1iVar.f = drawable;
                if ((r1iVar.b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            r1iVar.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = r1iVar.c;
                if (view != null && (r1iVar.b & 16) != 0) {
                    removeView(view);
                }
                r1iVar.c = viewInflate;
                if (viewInflate != null && (r1iVar.b & 16) != 0) {
                    addView(viewInflate);
                }
                r1iVar.a(r1iVar.b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.a0.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.P = resourceId2;
                ji0 ji0Var = this.F;
                if (ji0Var != null) {
                    ji0Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.Q = resourceId3;
                ji0 ji0Var2 = this.G;
                if (ji0Var2 != null) {
                    ji0Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            lrbVarP.S();
            if (R.string.abc_action_bar_up_description != r1iVar.n) {
                r1iVar.n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = r1iVar.n;
                    r1iVar.j = i != 0 ? getContext().getString(i) : null;
                    r1iVar.b();
                }
            }
            r1iVar.j = getNavigationContentDescription();
            setNavigationOnClickListener(new p1i(r1iVar));
            this.q0 = r1iVar;
        }
        return this.q0;
    }

    public final int j(View view, int i) {
        k1i k1iVar = (k1i) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = k1iVar.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.d0 & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) k1iVar).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) k1iVar).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) k1iVar).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public final void m() {
        Iterator it = this.o0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.n0.G).iterator();
        while (it2.hasNext()) {
            ((kx7) it2.next()).a.k();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.o0 = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.l0.contains(view);
    }

    public final int o(View view, int i, int i2, int[] iArr) {
        k1i k1iVar = (k1i) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) k1iVar).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) k1iVar).rightMargin + iMax;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.x0);
        t();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.j0 = false;
        }
        if (!this.j0) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.j0 = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.j0 = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0285 A[LOOP:0: B:107:0x0283->B:108:0x0285, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x029d A[LOOP:1: B:110:0x029b->B:111:0x029d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02bd A[LOOP:2: B:113:0x02bb->B:114:0x02bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0310 A[LOOP:3: B:122:0x030e->B:123:0x0310, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 801
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        Object[] objArr;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z = wyi.a;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c = 0;
        } else {
            c = 1;
            objArr = false;
        }
        if (s(this.H)) {
            r(this.H, i, 0, i2, this.S);
            iK = k(this.H) + this.H.getMeasuredWidth();
            iMax = Math.max(0, l(this.H) + this.H.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.H.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (s(this.L)) {
            r(this.L, i, 0, i2, this.S);
            iK = k(this.L) + this.L.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.L) + this.L.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.L.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        Object[] objArr2 = objArr;
        int[] iArr = this.m0;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (s(this.E)) {
            r(this.E, i, iMax3, i2, this.S);
            iK2 = k(this.E) + this.E.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.E) + this.E.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.E.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[c] = Math.max(0, currentContentInsetEnd - iK2);
        if (s(this.M)) {
            iMax5 += q(this.M, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.M) + this.M.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.M.getMeasuredState());
        }
        if (s(this.I)) {
            iMax5 += q(this.I, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, l(this.I) + this.I.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.I.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((k1i) childAt.getLayoutParams()).b == 0 && s(childAt)) {
                iMax5 += q(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i5 = iMax5;
        int i6 = this.V + this.W;
        int i7 = this.T + this.U;
        if (s(this.F)) {
            q(this.F, i, i5 + i7, i2, i6, iArr);
            int iK3 = k(this.F) + this.F.getMeasuredWidth();
            iL = l(this.F) + this.F.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.F.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (s(this.G)) {
            iMax2 = Math.max(iMax2, q(this.G, i, i5 + i7, i2, i6 + iL, iArr));
            iL += l(this.G) + this.G.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.G.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i5 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.t0) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            if (s(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof m1i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m1i m1iVar = (m1i) parcelable;
        super.onRestoreInstanceState(m1iVar.E);
        ActionMenuView actionMenuView = this.E;
        vcb vcbVar = actionMenuView != null ? actionMenuView.T : null;
        int i = m1iVar.G;
        if (i != 0 && this.s0 != null && vcbVar != null && (menuItemFindItem = vcbVar.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (m1iVar.H) {
            k51 k51Var = this.x0;
            removeCallbacks(k51Var);
            post(k51Var);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        ixe ixeVar = this.a0;
        boolean z = i == 1;
        if (z == ixeVar.g) {
            return;
        }
        ixeVar.g = z;
        if (!ixeVar.h) {
            ixeVar.a = ixeVar.e;
            ixeVar.b = ixeVar.f;
            return;
        }
        if (z) {
            int i2 = ixeVar.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = ixeVar.e;
            }
            ixeVar.a = i2;
            int i3 = ixeVar.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = ixeVar.f;
            }
            ixeVar.b = i3;
            return;
        }
        int i4 = ixeVar.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = ixeVar.e;
        }
        ixeVar.a = i4;
        int i5 = ixeVar.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = ixeVar.f;
        }
        ixeVar.b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        kb kbVar;
        adb adbVar;
        m1i m1iVar = new m1i(super.onSaveInstanceState());
        j1i j1iVar = this.s0;
        if (j1iVar != null && (adbVar = j1iVar.F) != null) {
            m1iVar.G = adbVar.a;
        }
        ActionMenuView actionMenuView = this.E;
        m1iVar.H = (actionMenuView == null || (kbVar = actionMenuView.a0) == null || !kbVar.j()) ? false : true;
        return m1iVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.i0 = false;
        }
        if (!this.i0) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.i0 = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.i0 = false;
        return true;
    }

    public final int p(View view, int i, int i2, int[] iArr) {
        k1i k1iVar = (k1i) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) k1iVar).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iJ = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) k1iVar).leftMargin);
    }

    public final int q(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void r(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean s(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.w0 != z) {
            this.w0 = z;
            t();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        gh0 gh0Var = this.L;
        if (gh0Var != null) {
            gh0Var.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.L.setImageDrawable(drawable);
        } else {
            gh0 gh0Var = this.L;
            if (gh0Var != null) {
                gh0Var.setImageDrawable(this.J);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.t0 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.c0) {
            this.c0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.b0) {
            this.b0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        hh0 hh0Var = this.I;
        if (drawable != null) {
            if (hh0Var == null) {
                this.I = new hh0(getContext(), null, 0);
            }
            if (!n(this.I)) {
                b(this.I, true);
            }
        } else if (hh0Var != null && n(hh0Var)) {
            removeView(this.I);
            this.l0.remove(this.I);
        }
        hh0 hh0Var2 = this.I;
        if (hh0Var2 != null) {
            hh0Var2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.I == null) {
            this.I = new hh0(getContext(), null, 0);
        }
        hh0 hh0Var = this.I;
        if (hh0Var != null) {
            hh0Var.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        gh0 gh0Var = this.H;
        if (gh0Var != null) {
            gh0Var.setContentDescription(charSequence);
            b2i.a(this.H, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.H)) {
                b(this.H, true);
            }
        } else {
            gh0 gh0Var = this.H;
            if (gh0Var != null && n(gh0Var)) {
                removeView(this.H);
                this.l0.remove(this.H);
            }
        }
        gh0 gh0Var2 = this.H;
        if (gh0Var2 != null) {
            gh0Var2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.H.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(l1i l1iVar) {
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.E.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.O != i) {
            this.O = i;
            if (i == 0) {
                this.N = getContext();
            } else {
                this.N = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        ji0 ji0Var = this.G;
        if (!zIsEmpty) {
            if (ji0Var == null) {
                Context context = getContext();
                ji0 ji0Var2 = new ji0(context, null);
                this.G = ji0Var2;
                ji0Var2.setSingleLine();
                this.G.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.Q;
                if (i != 0) {
                    this.G.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.h0;
                if (colorStateList != null) {
                    this.G.setTextColor(colorStateList);
                }
            }
            if (!n(this.G)) {
                b(this.G, true);
            }
        } else if (ji0Var != null && n(ji0Var)) {
            removeView(this.G);
            this.l0.remove(this.G);
        }
        ji0 ji0Var3 = this.G;
        if (ji0Var3 != null) {
            ji0Var3.setText(charSequence);
        }
        this.f0 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.h0 = colorStateList;
        ji0 ji0Var = this.G;
        if (ji0Var != null) {
            ji0Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        ji0 ji0Var = this.F;
        if (!zIsEmpty) {
            if (ji0Var == null) {
                Context context = getContext();
                ji0 ji0Var2 = new ji0(context, null);
                this.F = ji0Var2;
                ji0Var2.setSingleLine();
                this.F.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.P;
                if (i != 0) {
                    this.F.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.g0;
                if (colorStateList != null) {
                    this.F.setTextColor(colorStateList);
                }
            }
            if (!n(this.F)) {
                b(this.F, true);
            }
        } else if (ji0Var != null && n(ji0Var)) {
            removeView(this.F);
            this.l0.remove(this.F);
        }
        ji0 ji0Var3 = this.F;
        if (ji0Var3 != null) {
            ji0Var3.setText(charSequence);
        }
        this.e0 = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.W = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.U = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.T = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.V = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.g0 = colorStateList;
        ji0 ji0Var = this.F;
        if (ji0Var != null) {
            ji0Var.setTextColor(colorStateList);
        }
    }

    public final void t() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = i1i.a(this);
            j1i j1iVar = this.s0;
            int i = 0;
            boolean z = (j1iVar == null || j1iVar.F == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.w0) ? false : true;
            if (z && this.v0 == null) {
                if (this.u0 == null) {
                    this.u0 = i1i.b(new h1i(this, i));
                }
                i1i.c(onBackInvokedDispatcherA, this.u0);
                this.v0 = onBackInvokedDispatcherA;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.v0) == null) {
                return;
            }
            i1i.d(onBackInvokedDispatcher, this.u0);
            this.v0 = null;
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(xn5.c0(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(xn5.c0(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(xn5.c0(getContext(), i));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context) {
        this(context, null);
    }
}
