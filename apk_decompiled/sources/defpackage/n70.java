package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.node.Owner;
import androidx.core.widget.NestedScrollView;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n70 extends ViewGroup implements l0c, tc4, nmc, ldc {
    public final b0c E;
    public final View F;
    public final Owner G;
    public zy7 H;
    public boolean I;
    public zy7 J;
    public zy7 K;
    public iqb L;
    public bz7 M;
    public cz5 N;
    public bz7 O;
    public m4a P;
    public u5f Q;
    public final int[] R;
    public long S;
    public bdj T;
    public bz7 U;
    public final m70 V;
    public final m70 W;
    public bz7 a0;
    public final int[] b0;
    public int c0;
    public int d0;
    public final l42 e0;
    public boolean f0;
    public final av9 g0;

    public n70(Context context, c18 c18Var, int i, b0c b0cVar, View view, Owner owner) {
        super(context);
        this.E = b0cVar;
        this.F = view;
        this.G = owner;
        ewb ewbVar = bej.a;
        setTag(R.id.androidx_compose_ui_view_composition_context, c18Var);
        int i2 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        nxi nxiVar = (nxi) this;
        mvi.j(this, new f70(nxiVar, i2));
        fvi.c(this, this);
        this.H = n.R;
        this.J = n.Q;
        this.K = n.P;
        fqb fqbVar = fqb.E;
        this.L = fqbVar;
        this.N = dch.h();
        int i3 = 2;
        this.R = new int[2];
        this.S = 0L;
        int i4 = 1;
        this.V = new m70(nxiVar, i4);
        this.W = new m70(nxiVar, i2);
        this.b0 = new int[2];
        this.c0 = Integer.MIN_VALUE;
        this.d0 = Integer.MIN_VALUE;
        this.e0 = new l42();
        av9 av9Var = new av9(3);
        av9Var.T = nxiVar;
        iqb iqbVarB = tjf.b(ztj.i(fqbVar, oe5.a, b0cVar), true, ex.Q);
        g8d g8dVar = new g8d();
        g8dVar.E = new h70(nxiVar, i3);
        u3a u3aVar = new u3a();
        u3a u3aVar2 = g8dVar.F;
        if (u3aVar2 != null) {
            u3aVar2.F = null;
        }
        g8dVar.F = u3aVar;
        u3aVar.F = g8dVar;
        setOnRequestDisallowInterceptTouchEvent$ui(u3aVar);
        iqb iqbVarB2 = xn5.p0(zni.s(iqbVarB.B(g8dVar), new j70(nxiVar, av9Var, nxiVar)), new g70(nxiVar, av9Var, i3)).B(new kx1(new h70(nxiVar, i4)));
        av9Var.D0(this.L.B(iqbVarB2));
        this.M = new g4(av9Var, 4, iqbVarB2);
        av9Var.z0(this.N);
        this.O = new h4(5, av9Var);
        av9Var.q0 = new g70(nxiVar, av9Var, i2);
        av9Var.r0 = new h70(nxiVar, i2);
        av9Var.C0(new i70(nxiVar, av9Var));
        this.g0 = av9Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final omc getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            b39.c("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.G.getSnapshotObserver();
    }

    public static final int l(nxi nxiVar, int i, int i2, int i3) {
        return (i3 >= 0 || i == i2) ? View.MeasureSpec.makeMeasureSpec(wd6.e0(i3, i, i2), 1073741824) : (i3 != -2 || i2 == Integer.MAX_VALUE) ? (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824) : View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }

    public static f59 m(f59 f59Var, int i, int i2, int i3, int i4) {
        int i5 = f59Var.a - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = f59Var.b - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = f59Var.c - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = f59Var.d - i4;
        return f59.c(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    @Override // defpackage.k0c
    public final void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5) {
        if (this.F.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i3 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i4 * (-1.0f))) & 4294967295L);
            int i6 = i5 == 0 ? 1 : 2;
            f0c f0cVar = this.E.a;
            f0c f0cVarQ1 = f0cVar != null ? f0cVar.q1() : null;
            if (f0cVarQ1 != null) {
                f0cVarQ1.F(jFloatToRawIntBits, i6, jFloatToRawIntBits2);
            }
        }
    }

    @Override // defpackage.tc4
    public final void b() {
        this.K.a();
    }

    @Override // defpackage.tc4
    public final void c() {
        this.J.a();
        removeAllViewsInLayout();
    }

    @Override // defpackage.k0c
    public final boolean d(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // defpackage.k0c
    public final void e(View view, View view2, int i, int i2) {
        l42 l42Var = this.e0;
        if (i2 == 1) {
            l42Var.c = i;
        } else {
            l42Var.b = i;
        }
    }

    @Override // defpackage.k0c
    public final void f(View view, int i) {
        l42 l42Var = this.e0;
        if (i == 1) {
            l42Var.c = 0;
        } else {
            l42Var.b = 0;
        }
    }

    @Override // defpackage.l0c
    public final void g(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.F.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i3 * (-1.0f))) << 32) | (((long) Float.floatToRawIntBits(i4 * (-1.0f))) & 4294967295L);
            int i6 = i5 == 0 ? 1 : 2;
            f0c f0cVar = this.E.a;
            f0c f0cVarQ1 = f0cVar != null ? f0cVar.q1() : null;
            long jF = f0cVarQ1 != null ? f0cVarQ1.F(jFloatToRawIntBits, i6, jFloatToRawIntBits2) : 0L;
            iArr[0] = mwa.L(Float.intBitsToFloat((int) (jF >> 32))) * (-1);
            iArr[1] = mwa.L(Float.intBitsToFloat((int) (jF & 4294967295L))) * (-1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.b0;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final cz5 getDensity() {
        return this.N;
    }

    public final View getInteropView() {
        return this.F;
    }

    public final av9 getLayoutNode() {
        return this.g0;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.F.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final m4a getLifecycleOwner() {
        return this.P;
    }

    public final iqb getModifier() {
        return this.L;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        l42 l42Var = this.e0;
        return l42Var.c | l42Var.b;
    }

    public final bz7 getOnDensityChanged$ui() {
        return this.O;
    }

    public final bz7 getOnModifierChanged$ui() {
        return this.M;
    }

    public final bz7 getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.a0;
    }

    public final zy7 getRelease() {
        return this.K;
    }

    public final zy7 getReset() {
        return this.J;
    }

    public final u5f getSavedStateRegistryOwner() {
        return this.Q;
    }

    public final zy7 getUpdate() {
        return this.H;
    }

    public final View getView() {
        return this.F;
    }

    @Override // defpackage.k0c
    public final void h(int i, int i2, int[] iArr, int i3) {
        if (this.F.isNestedScrollingEnabled()) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i2 * (-1.0f))) & 4294967295L) | (((long) Float.floatToRawIntBits(i * (-1.0f))) << 32);
            int i4 = i3 == 0 ? 1 : 2;
            f0c f0cVar = this.E.a;
            f0c f0cVarQ1 = f0cVar != null ? f0cVar.q1() : null;
            long jX = f0cVarQ1 != null ? f0cVarQ1.X(i4, jFloatToRawIntBits) : 0L;
            iArr[0] = mwa.L(Float.intBitsToFloat((int) (jX >> 32))) * (-1);
            iArr[1] = mwa.L(Float.intBitsToFloat((int) (jX & 4294967295L))) * (-1);
        }
    }

    @Override // defpackage.tc4
    public final void i() {
        View view = this.F;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.J.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.f0) {
            this.g0.Q();
            return null;
        }
        this.F.postOnAnimation(new b60(1, this.W));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.F.isNestedScrollingEnabled();
    }

    @Override // defpackage.ldc
    public final bdj j(View view, bdj bdjVar) {
        this.T = new bdj(bdjVar);
        return n(bdjVar);
    }

    public final bdj n(bdj bdjVar) {
        xcj xcjVar = bdjVar.a;
        f59 f59VarI = xcjVar.i(-1);
        f59 f59Var = f59.e;
        if (!f59VarI.equals(f59Var) || !xcjVar.j(-9).equals(f59Var) || xcjVar.h() != null) {
            z39 z39Var = (z39) this.g0.k0.H;
            if (z39Var.y0.R) {
                long jA0 = yfd.a0(z39Var.K(0L));
                int i = (int) (jA0 >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (jA0 & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long jK = nai.A(z39Var).k();
                int i3 = (int) (jK >> 32);
                int i4 = (int) (jK & 4294967295L);
                long j = z39Var.G;
                long jA02 = yfd.a0(z39Var.K((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i5 = i3 - ((int) (jA02 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (4294967295L & jA02));
                int i7 = i6 >= 0 ? i6 : 0;
                if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                    return bdjVar.a.r(i, i2, i5, i7);
                }
            }
        }
        return bdjVar;
    }

    public final void o() {
        int i;
        int i2 = this.c0;
        if (i2 == Integer.MIN_VALUE || (i = this.d0) == Integer.MIN_VALUE) {
            return;
        }
        measure(i2, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.V.a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.f0) {
            this.g0.Q();
        } else {
            this.F.postOnAnimation(new b60(1, this.W));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().a.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.F.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.F;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.c0 = i;
        this.d0 = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.F.isNestedScrollingEnabled()) {
            return false;
        }
        gb9.D(this.E.c(), null, null, new k70(z, this, lvj.e(f * (-1.0f), f2 * (-1.0f)), (tp4) null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.F.isNestedScrollingEnabled()) {
            return false;
        }
        gb9.D(this.E.c(), null, null, new l70(this, lvj.e(f * (-1.0f), f2 * (-1.0f)), null, 0), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        bz7 bz7Var = this.U;
        if (bz7Var == null) {
            return true;
        }
        bz7Var.invoke(rect != null ? mwa.S(rect) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        bz7 bz7Var = this.a0;
        if (bz7Var != null) {
            bz7Var.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(cz5 cz5Var) {
        if (cz5Var != this.N) {
            this.N = cz5Var;
            bz7 bz7Var = this.O;
            if (bz7Var != null) {
                bz7Var.invoke(cz5Var);
            }
        }
    }

    public final void setLifecycleOwner(m4a m4aVar) {
        if (m4aVar != this.P) {
            this.P = m4aVar;
            setTag(R.id.view_tree_lifecycle_owner, m4aVar);
        }
    }

    public final void setModifier(iqb iqbVar) {
        if (iqbVar != this.L) {
            this.L = iqbVar;
            bz7 bz7Var = this.M;
            if (bz7Var != null) {
                bz7Var.invoke(iqbVar);
            }
        }
    }

    public final void setOnDensityChanged$ui(bz7 bz7Var) {
        this.O = bz7Var;
    }

    public final void setOnModifierChanged$ui(bz7 bz7Var) {
        this.M = bz7Var;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(bz7 bz7Var) {
        this.a0 = bz7Var;
    }

    public final void setRelease(zy7 zy7Var) {
        this.K = zy7Var;
    }

    public final void setReset(zy7 zy7Var) {
        this.J = zy7Var;
    }

    public final void setSavedStateRegistryOwner(u5f u5fVar) {
        if (u5fVar != this.Q) {
            this.Q = u5fVar;
            setTag(R.id.view_tree_saved_state_registry_owner, u5fVar);
        }
    }

    public final void setUpdate(zy7 zy7Var) {
        this.H = zy7Var;
        this.I = true;
        this.V.a();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // defpackage.nmc
    public final boolean v() {
        return isAttachedToWindow();
    }
}
