package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.core.widget.NestedScrollView;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.bdj;
import defpackage.f59;
import defpackage.fcj;
import defpackage.fvi;
import defpackage.hcj;
import defpackage.hyi;
import defpackage.icj;
import defpackage.j1i;
import defpackage.jcj;
import defpackage.k0c;
import defpackage.kb;
import defpackage.kcj;
import defpackage.l0c;
import defpackage.l42;
import defpackage.lcj;
import defpackage.mcj;
import defpackage.mvi;
import defpackage.ncj;
import defpackage.q9;
import defpackage.qbj;
import defpackage.r1i;
import defpackage.r9;
import defpackage.s9;
import defpackage.sz6;
import defpackage.t9;
import defpackage.u9;
import defpackage.vcb;
import defpackage.vdb;
import defpackage.xcj;
import defpackage.xn5;
import defpackage.xo5;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class ActionBarOverlayLayout extends ViewGroup implements k0c, l0c {
    public static final int[] j0 = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final bdj k0;
    public static final Rect l0;
    public int E;
    public int F;
    public ContentFrameLayout G;
    public ActionBarContainer H;
    public xo5 I;
    public Drawable J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public final Rect Q;
    public final Rect R;
    public final Rect S;
    public final Rect T;
    public bdj U;
    public bdj V;
    public bdj W;
    public bdj a0;
    public s9 b0;
    public OverScroller c0;
    public ViewPropertyAnimator d0;
    public final q9 e0;
    public final r9 f0;
    public final r9 g0;
    public final l42 h0;
    public final u9 i0;

    static {
        int i = Build.VERSION.SDK_INT;
        ncj mcjVar = i >= 36 ? new mcj() : i >= 35 ? new lcj() : i >= 34 ? new kcj() : i >= 31 ? new jcj() : i >= 30 ? new icj() : i >= 29 ? new hcj() : new fcj();
        mcjVar.h(f59.c(0, 1, 0, 1));
        k0 = mcjVar.b();
        l0 = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.F = 0;
        this.Q = new Rect();
        this.R = new Rect();
        this.S = new Rect();
        this.T = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        bdj bdjVar = bdj.b;
        this.U = bdjVar;
        this.V = bdjVar;
        this.W = bdjVar;
        this.a0 = bdjVar;
        this.e0 = new q9(0, this);
        this.f0 = new r9(this, 0);
        this.g0 = new r9(this, 1);
        i(context);
        this.h0 = new l42();
        u9 u9Var = new u9(context);
        u9Var.setWillNotDraw(true);
        this.i0 = u9Var;
        addView(u9Var);
    }

    public static boolean b(View view, Rect rect, boolean z) {
        boolean z2;
        t9 t9Var = (t9) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) t9Var).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) t9Var).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) t9Var).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) t9Var).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) t9Var).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) t9Var).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) t9Var).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) t9Var).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // defpackage.k0c
    public final void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(nestedScrollView, i, i2, i3, i4);
        }
    }

    public final void c() {
        removeCallbacks(this.f0);
        removeCallbacks(this.g0);
        ViewPropertyAnimator viewPropertyAnimator = this.d0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof t9;
    }

    @Override // defpackage.k0c
    public final boolean d(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.J != null) {
            if (this.H.getVisibility() == 0) {
                translationY = (int) (this.H.getTranslationY() + this.H.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.J.setBounds(0, translationY, getWidth(), this.J.getIntrinsicHeight() + translationY);
            this.J.draw(canvas);
        }
    }

    @Override // defpackage.k0c
    public final void e(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.k0c
    public final void f(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // defpackage.l0c
    public final void g(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        a(nestedScrollView, i, i2, i3, i4, i5);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new t9(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new t9(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.H;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        l42 l42Var = this.h0;
        return l42Var.c | l42Var.b;
    }

    public CharSequence getTitle() {
        k();
        return ((r1i) this.I).a.getTitle();
    }

    @Override // defpackage.k0c
    public final void h(int i, int i2, int[] iArr, int i3) {
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(j0);
        this.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.J = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.c0 = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((r1i) this.I).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((r1i) this.I).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        xo5 wrapper;
        if (this.G == null) {
            this.G = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.H = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof xo5) {
                wrapper = (xo5) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    sz6.j("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                    return;
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.I = wrapper;
        }
    }

    public final void l(Menu menu, vdb vdbVar) {
        k();
        r1i r1iVar = (r1i) this.I;
        Toolbar toolbar = r1iVar.a;
        if (r1iVar.m == null) {
            r1iVar.m = new kb(toolbar.getContext());
        }
        kb kbVar = r1iVar.m;
        kbVar.I = vdbVar;
        vcb vcbVar = (vcb) menu;
        if (vcbVar == null && toolbar.E == null) {
            return;
        }
        toolbar.f();
        vcb vcbVar2 = toolbar.E.T;
        if (vcbVar2 == vcbVar) {
            return;
        }
        if (vcbVar2 != null) {
            vcbVar2.r(toolbar.r0);
            vcbVar2.r(toolbar.s0);
        }
        if (toolbar.s0 == null) {
            toolbar.s0 = new j1i(toolbar);
        }
        kbVar.U = true;
        Context context = toolbar.N;
        if (vcbVar != null) {
            vcbVar.b(kbVar, context);
            vcbVar.b(toolbar.s0, toolbar.N);
        } else {
            kbVar.k(context, null);
            toolbar.s0.k(toolbar.N, null);
            kbVar.i();
            toolbar.s0.i();
        }
        toolbar.E.setPopupTheme(toolbar.O);
        toolbar.E.setPresenter(kbVar);
        toolbar.r0 = kbVar;
        toolbar.t();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        bdj bdjVarC = bdj.c(windowInsets, this);
        xcj xcjVar = bdjVarC.a;
        boolean zB = b(this.H, new Rect(xcjVar.n().a, xcjVar.n().b, xcjVar.n().c, xcjVar.n().d), false);
        WeakHashMap weakHashMap = mvi.a;
        Rect rect = this.Q;
        fvi.b(this, bdjVarC, rect);
        bdj bdjVarR = xcjVar.r(rect.left, rect.top, rect.right, rect.bottom);
        this.U = bdjVarR;
        boolean z = true;
        if (!this.V.equals(bdjVarR)) {
            this.V = this.U;
            zB = true;
        }
        Rect rect2 = this.R;
        if (rect2.equals(rect)) {
            z = zB;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return xcjVar.a().a.c().a.b().b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = mvi.a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                t9 t9Var = (t9) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) t9Var).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) t9Var).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.M || !z) {
            return false;
        }
        this.c0.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.c0.getFinalY() > this.H.getHeight()) {
            c();
            this.g0.run();
        } else {
            c();
            this.f0.run();
        }
        this.N = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.O + i2;
        this.O = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        qbj qbjVar;
        hyi hyiVar;
        this.h0.b = i;
        this.O = getActionBarHideOffset();
        c();
        s9 s9Var = this.b0;
        if (s9Var == null || (hyiVar = (qbjVar = (qbj) s9Var).s) == null) {
            return;
        }
        hyiVar.a();
        qbjVar.s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.H.getVisibility() != 0) {
            return false;
        }
        return this.M;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.M || this.N) {
            return;
        }
        if (this.O <= this.H.getHeight()) {
            c();
            postDelayed(this.f0, 600L);
        } else {
            c();
            postDelayed(this.g0, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i2 = this.P ^ i;
        this.P = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0;
        s9 s9Var = this.b0;
        if (s9Var != null) {
            qbj qbjVar = (qbj) s9Var;
            qbjVar.o = !z2;
            if (z || !z2) {
                if (qbjVar.p) {
                    qbjVar.p = false;
                    qbjVar.d(true);
                }
            } else if (!qbjVar.p) {
                qbjVar.p = true;
                qbjVar.d(true);
            }
        }
        if ((i2 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0 || this.b0 == null) {
            return;
        }
        WeakHashMap weakHashMap = mvi.a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.F = i;
        s9 s9Var = this.b0;
        if (s9Var != null) {
            ((qbj) s9Var).n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        c();
        this.H.setTranslationY(-Math.max(0, Math.min(i, this.H.getHeight())));
    }

    public void setActionBarVisibilityCallback(s9 s9Var) {
        this.b0 = s9Var;
        if (getWindowToken() != null) {
            ((qbj) this.b0).n = this.F;
            int i = this.P;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = mvi.a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.L = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.M) {
            this.M = z;
            if (z) {
                return;
            }
            c();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        k();
        r1i r1iVar = (r1i) this.I;
        r1iVar.d = i != 0 ? xn5.c0(r1iVar.a.getContext(), i) : null;
        r1iVar.c();
    }

    public void setLogo(int i) {
        k();
        r1i r1iVar = (r1i) this.I;
        r1iVar.e = i != 0 ? xn5.c0(r1iVar.a.getContext(), i) : null;
        r1iVar.c();
    }

    public void setOverlayMode(boolean z) {
        this.K = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        k();
        ((r1i) this.I).k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        k();
        r1i r1iVar = (r1i) this.I;
        if (r1iVar.g) {
            return;
        }
        Toolbar toolbar = r1iVar.a;
        r1iVar.h = charSequence;
        if ((r1iVar.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (r1iVar.g) {
                mvi.i(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new t9(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        r1i r1iVar = (r1i) this.I;
        r1iVar.d = drawable;
        r1iVar.c();
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }
}
