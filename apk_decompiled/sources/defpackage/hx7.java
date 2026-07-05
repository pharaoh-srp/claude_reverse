package defpackage;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.anthropic.claude.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class hx7 extends FrameLayout {
    public final ArrayList E;
    public final ArrayList F;
    public View.OnApplyWindowInsetsListener G;
    public boolean H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx7(Context context, AttributeSet attributeSet, rx7 rx7Var) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.H = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q0e.b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        cx7 cx7VarC = rx7Var.C(id);
        if (classAttribute != null && cx7VarC == null) {
            if (id == -1) {
                sz6.j(ij0.j("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
                throw null;
            }
            lx7 lx7VarG = rx7Var.G();
            context.getClassLoader();
            cx7 cx7VarA = lx7VarG.a(classAttribute);
            cx7VarA.getClass();
            cx7VarA.b0 = id;
            cx7VarA.c0 = id;
            cx7VarA.d0 = string;
            cx7VarA.X = rx7Var;
            ex7 ex7Var = rx7Var.w;
            cx7VarA.Y = ex7Var;
            cx7VarA.i0 = true;
            if ((ex7Var == null ? null : ex7Var.M) != null) {
                cx7VarA.i0 = true;
            }
            tb1 tb1Var = new tb1(rx7Var);
            tb1Var.o = true;
            cx7VarA.j0 = this;
            cx7VarA.T = true;
            tb1Var.f(getId(), cx7VarA, string);
            if (tb1Var.g) {
                sz6.j("This transaction is already being added to the back stack");
                throw null;
            }
            rx7 rx7Var2 = tb1Var.q;
            if (rx7Var2.w != null && !rx7Var2.J) {
                rx7Var2.z(true);
                tb1 tb1Var2 = rx7Var2.h;
                if (tb1Var2 != null) {
                    tb1Var2.r = false;
                    tb1Var2.d();
                    if (rx7.J(3)) {
                        Objects.toString(rx7Var2.h);
                        Objects.toString(tb1Var);
                    }
                    rx7Var2.h.e(false, false);
                    rx7Var2.h.a(rx7Var2.L, rx7Var2.M);
                    Iterator it = rx7Var2.h.a.iterator();
                    while (it.hasNext()) {
                        cx7 cx7Var = ((zx7) it.next()).b;
                        if (cx7Var != null) {
                            cx7Var.Q = false;
                        }
                    }
                    rx7Var2.h = null;
                }
                tb1Var.a(rx7Var2.L, rx7Var2.M);
                rx7Var2.b = true;
                try {
                    rx7Var2.V(rx7Var2.L, rx7Var2.M);
                    rx7Var2.d();
                    rx7Var2.g0();
                    rx7Var2.v();
                    ((HashMap) rx7Var2.c.G).values().removeAll(Collections.singleton(null));
                } catch (Throwable th) {
                    rx7Var2.d();
                    throw th;
                }
            }
        }
        Iterator it2 = rx7Var.c.F().iterator();
        while (it2.hasNext()) {
            int i = ((wx7) it2.next()).j().c0;
            getId();
        }
    }

    public final void a(View view) {
        if (this.F.contains(view)) {
            this.E.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof cx7 ? (cx7) tag : null) != null) {
            super.addView(view, i, layoutParams);
        } else {
            sz6.o(view, " is not associated with a Fragment.", "Views added to a FragmentContainerView must be associated with a Fragment. View ");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        bdj bdjVarC;
        windowInsets.getClass();
        bdj bdjVarC2 = bdj.c(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.G;
        if (onApplyWindowInsetsListener != null) {
            bdjVarC = bdj.c(yok.h(onApplyWindowInsetsListener, this, windowInsets), null);
        } else {
            WeakHashMap weakHashMap = mvi.a;
            WindowInsets windowInsetsB = bdjVarC2.b();
            if (windowInsetsB != null && !windowInsetsB.equals(windowInsetsB)) {
                bdjVarC2 = bdj.c(windowInsetsB, this);
            }
            bdjVarC = bdjVarC2;
        }
        if (!bdjVarC.a.s()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                mvi.b(getChildAt(i), bdjVarC);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.H) {
            Iterator it = this.E.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.getClass();
        view.getClass();
        if (this.H) {
            ArrayList arrayList = this.E;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.F.remove(view);
        if (this.E.remove(view)) {
            this.H = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends cx7> F getFragment() {
        cx7 cx7Var;
        fx7 fx7Var;
        rx7 rx7VarI;
        View view = this;
        while (true) {
            if (view == null) {
                cx7Var = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            cx7Var = tag instanceof cx7 ? (cx7) tag : null;
            if (cx7Var != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (cx7Var == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    fx7Var = null;
                    break;
                }
                if (context instanceof fx7) {
                    fx7Var = (fx7) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (fx7Var == null) {
                xh6.b(this, " is not within a subclass of FragmentActivity.", "View ");
                return null;
            }
            rx7VarI = ((ex7) fx7Var.Z.F).P;
        } else {
            if (!cx7Var.p()) {
                throw new IllegalStateException("The Fragment " + cx7Var + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            rx7VarI = cx7Var.i();
        }
        return (F) rx7VarI.C(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                childAt.getClass();
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        childAt.getClass();
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.H = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.G = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.F.add(view);
        }
        super.startViewTransition(view);
    }
}
