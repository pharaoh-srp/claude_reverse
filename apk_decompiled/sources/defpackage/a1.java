package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import com.anthropic.claude.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class a1 extends ViewGroup {
    public WeakReference E;
    public IBinder F;
    public gij G;
    public ge4 H;
    public hd4 I;
    public ag5 J;
    public boolean K;
    public boolean L;
    public boolean M;

    public a1(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        p20 p20Var = new p20(1, this);
        addOnAttachStateChangeListener(p20Var);
        pmf pmfVar = new pmf(23);
        zni.E(this).a.add(pmfVar);
        this.J = new ag5(this, p20Var, pmfVar, 3);
    }

    public static /* synthetic */ void getComposeViewContext$ui$annotations() {
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(ge4 ge4Var) {
        if (this.H != ge4Var) {
            this.H = ge4Var;
            if (ge4Var != null) {
                this.E = null;
            }
            gij gijVar = this.G;
            if (gijVar != null) {
                gijVar.a();
                this.G = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.F != iBinder) {
            this.F = iBinder;
            this.E = null;
        }
    }

    public abstract void a(int i, ld4 ld4Var);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void b() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.I == null) {
                AndroidComposeView androidComposeView = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof AndroidComposeView) {
                        androidComposeView = (AndroidComposeView) childAt;
                    }
                }
                if (androidComposeView != null) {
                    androidComposeView.setComposeViewContext(l(mpk.D(this), androidComposeView.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                f();
            }
        }
    }

    public final void c() {
        if (this.L) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void d() {
        hd4 hd4Var;
        View view;
        if (this.H == null && !isAttachedToWindow() && ((hd4Var = this.I) == null || (view = hd4Var.a) == null || !view.isAttachedToWindow())) {
            sz6.j("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        } else {
            f();
        }
    }

    public final void e() {
        View childAt = getChildAt(0);
        AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
        if (androidComposeView != null && androidComposeView.composeViewContextIncrementedDuringInit) {
            androidComposeView.getComposeViewContext().b();
            androidComposeView.composeViewContextIncrementedDuringInit = false;
        }
        gij gijVar = this.G;
        if (gijVar != null) {
            gijVar.a();
        }
        this.G = null;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        if (this.G == null) {
            boolean z = false;
            Object[] objArr = 0;
            try {
                this.L = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    hd4 hd4VarI = this.I;
                    if (hd4VarI == null) {
                        hd4VarI = i();
                    }
                    this.G = mij.a(this, hd4VarI, new ta4(1003123809, true, new z0((int) (objArr == true ? 1 : 0), (Object) this)));
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } finally {
                this.L = false;
            }
        }
    }

    public void g(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m0getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        l71 l71Var = tag instanceof l71 ? (l71) tag : null;
        if (l71Var != null) {
            return l71Var.b();
        }
        return 1;
    }

    public final hd4 getComposeViewContext$ui() {
        return this.I;
    }

    public final boolean getHasComposition() {
        return this.G != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.K;
    }

    public void h(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.hd4 i() {
        /*
            r9 = this;
            int r0 = r9.getChildCount()
            r1 = 0
            if (r0 != 0) goto L9
        L7:
            r0 = r1
            goto L1c
        L9:
            r0 = 0
            android.view.View r0 = r9.getChildAt(r0)
            boolean r2 = r0 instanceof androidx.compose.ui.platform.AndroidComposeView
            if (r2 == 0) goto L15
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            goto L16
        L15:
            r0 = r1
        L16:
            if (r0 == 0) goto L7
            hd4 r0 = r0.getComposeViewContext()
        L1c:
            android.view.View r4 = defpackage.mpk.D(r9)
            hd4 r2 = defpackage.mpk.H(r4)
            if (r2 != 0) goto L7c
            ge4 r5 = r9.k()
            m4a r9 = defpackage.ink.a(r4)
            if (r9 != 0) goto L38
            if (r0 == 0) goto L35
            m4a r9 = r0.c
            goto L36
        L35:
            r9 = r1
        L36:
            if (r9 == 0) goto L3a
        L38:
            r6 = r9
            goto L40
        L3a:
            java.lang.String r9 = "Composed into the View which doesn't propagate ViewTreeLifecycleOwner!"
            defpackage.sz6.j(r9)
            return r1
        L40:
            u5f r9 = defpackage.ryi.a(r4)
            if (r9 != 0) goto L4e
            if (r0 == 0) goto L4b
            u5f r9 = r0.d
            goto L4c
        L4b:
            r9 = r1
        L4c:
            if (r9 == 0) goto L50
        L4e:
            r7 = r9
            goto L56
        L50:
            java.lang.String r9 = "Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!"
            defpackage.sz6.j(r9)
            return r1
        L56:
            eyi r9 = defpackage.syi.a(r4)
            if (r9 != 0) goto L62
            if (r0 == 0) goto L60
            eyi r1 = r0.e
        L60:
            r8 = r1
            goto L63
        L62:
            r8 = r9
        L63:
            hd4 r2 = new hd4
            android.view.View r9 = defpackage.mpk.D(r4)
            hd4 r3 = defpackage.mpk.H(r9)
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
            r9.<init>(r2)
            r0 = 2131361869(0x7f0a004d, float:1.8343503E38)
            r4.setTag(r0, r9)
            return r2
        L7c:
            hd4 r9 = r9.l(r4, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a1.i():hd4");
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.M || super.isTransitionGroup();
    }

    public final ge4 k() {
        x7e x7eVar;
        c45 c45Var;
        a70 a70Var;
        ge4 ge4VarA = this.H;
        if (ge4VarA == null) {
            ge4VarA = bej.a(this);
            if (ge4VarA == null) {
                Object parent = getParent();
                while (ge4VarA == null && (parent instanceof View)) {
                    View view = (View) parent;
                    ge4VarA = bej.a(view);
                    parent = bmk.a(view);
                }
            }
            boolean z = false;
            if (ge4VarA != null) {
                ge4 ge4Var = (!(ge4VarA instanceof x7e) || ((u7e) ((x7e) ge4VarA).v.getValue()).compareTo(u7e.F) > 0) ? ge4VarA : null;
                if (ge4Var != null) {
                    this.E = new WeakReference(ge4Var);
                }
            } else {
                ge4VarA = null;
            }
            if (ge4VarA == null) {
                WeakReference weakReference = this.E;
                if (weakReference == null || (ge4VarA = (ge4) weakReference.get()) == null || ((ge4VarA instanceof x7e) && ((u7e) ((x7e) ge4VarA).v.getValue()).compareTo(u7e.F) <= 0)) {
                    ge4VarA = null;
                }
                if (ge4VarA == null) {
                    if (!isAttachedToWindow()) {
                        b39.c("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    View view2 = this;
                    Object parent2 = bmk.a(this);
                    while (parent2 instanceof View) {
                        View view3 = (View) parent2;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent2 = view3.getParent();
                    }
                    ge4 ge4VarA2 = bej.a(view2);
                    if (ge4VarA2 == null) {
                        ((wdj) xdj.a.get()).getClass();
                        c45 c45Var2 = im6.E;
                        u0h u0hVar = y60.Q;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            c45Var = (c45) y60.Q.getValue();
                        } else {
                            c45Var = (c45) y60.R.get();
                            if (c45Var == null) {
                                sz6.j("no AndroidUiDispatcher for this thread");
                                return null;
                            }
                        }
                        c45 c45VarR0 = c45Var.r0(c45Var2);
                        arb arbVar = (arb) c45VarR0.x0(lja.Z);
                        if (arbVar != null) {
                            a70Var = new a70(arbVar);
                            bm7 bm7Var = (bm7) a70Var.G;
                            synchronized (bm7Var.b) {
                                bm7Var.a = false;
                            }
                        } else {
                            a70Var = null;
                        }
                        dae daeVar = new dae();
                        c45 srbVar = (qrb) c45VarR0.x0(a5.K);
                        if (srbVar == null) {
                            srbVar = new srb(view2.getContext().getApplicationContext());
                            daeVar.E = srbVar;
                        }
                        if (a70Var != null) {
                            c45Var2 = a70Var;
                        }
                        c45 c45VarR02 = c45VarR0.r0(c45Var2).r0(srbVar);
                        x7eVar = new x7e(c45VarR02);
                        synchronized (x7eVar.d) {
                            x7eVar.u = true;
                        }
                        mp4 mp4VarC = fd9.c(c45VarR02);
                        m4a m4aVarA = ink.a(view2);
                        c4a c4aVarA = m4aVarA != null ? m4aVarA.a() : null;
                        if (c4aVarA == null) {
                            b39.d("ViewTreeLifecycleOwner not found from " + view2);
                            sz6.r();
                            return null;
                        }
                        view2.addOnAttachStateChangeListener(new ydj(view2, x7eVar));
                        c4aVarA.a(new aej(mp4VarC, a70Var, x7eVar, daeVar));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, x7eVar);
                        u78 u78Var = u78.E;
                        Handler handler = view2.getHandler();
                        int i = af8.a;
                        view2.addOnAttachStateChangeListener(new p20(2, gb9.D(u78Var, new ye8(handler, "windowRecomposer cleanup", false).J, null, new rrb(x7eVar, view2, z ? 1 : 0, 19), 2)));
                    } else {
                        if (!(ge4VarA2 instanceof x7e)) {
                            sz6.j("root viewTreeParentCompositionContext is not a Recomposer");
                            return null;
                        }
                        x7eVar = (x7e) ge4VarA2;
                    }
                    x7e x7eVar2 = ((u7e) x7eVar.v.getValue()).compareTo(u7e.F) > 0 ? x7eVar : null;
                    if (x7eVar2 != null) {
                        this.E = new WeakReference(x7eVar2);
                    }
                    return x7eVar;
                }
            }
        }
        return ge4VarA;
    }

    public final hd4 l(View view, hd4 hd4Var) {
        ge4 ge4VarK = k();
        m4a m4aVarA = ink.a(view);
        eyi eyiVarA = syi.a(view);
        u5f u5fVarA = ryi.a(view);
        ge4 ge4Var = hd4Var.b;
        u5f u5fVar = hd4Var.d;
        m4a m4aVar = hd4Var.c;
        if (ge4VarK == ge4Var && m4aVarA == m4aVar && eyiVarA == hd4Var.e && u5fVarA == u5fVar) {
            return hd4Var;
        }
        if (ge4VarK.j() != hd4Var.b.j()) {
            e();
        }
        if (m4aVarA == null) {
            m4aVarA = m4aVar;
        }
        hd4 hd4Var2 = new hd4(hd4Var, view, ge4VarK, m4aVarA, u5fVarA == null ? u5fVar : u5fVarA, eyiVarA);
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(hd4Var2));
        return hd4Var2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ewb ewbVar = bej.a;
        Object objA = bmk.a(this);
        View view = this;
        while (objA instanceof View) {
            View view2 = (View) objA;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            objA = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new y0(0, this));
        } else {
            b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        g(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        f();
        h(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m1setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, l71.a(i));
    }

    public final void setComposeViewContext$ui(hd4 hd4Var) {
        if (this.I != hd4Var) {
            if (hd4Var == null) {
                e();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
                if (androidComposeView != null) {
                    if (androidComposeView.getCoroutineContext() != hd4Var.b.j()) {
                        e();
                    }
                    androidComposeView.setComposeViewContext(hd4Var);
                }
            }
            this.I = hd4Var;
        }
    }

    public final void setParentCompositionContext(ge4 ge4Var) {
        setParentContext(ge4Var);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.K = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((Owner) childAt).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.M = true;
    }

    public final void setViewCompositionStrategy(nvi nviVar) {
        ag5 ag5Var = this.J;
        if (ag5Var != null) {
            ag5Var.a();
        }
        ((v40) nviVar).getClass();
        p20 p20Var = new p20(1, this);
        addOnAttachStateChangeListener(p20Var);
        pmf pmfVar = new pmf(23);
        zni.E(this).a.add(pmfVar);
        this.J = new ag5(this, p20Var, pmfVar, 3);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        c();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        c();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        c();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i, layoutParams);
    }
}
