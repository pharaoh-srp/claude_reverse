package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class r9d extends a1 {
    public zy7 N;
    public v9d O;
    public String P;
    public final View Q;
    public final boolean R;
    public final cm4 S;
    public final WindowManager T;
    public final WindowManager.LayoutParams U;
    public u9d V;
    public fu9 W;
    public final lsc a0;
    public final lsc b0;
    public c79 c0;
    public final wz5 d0;
    public final Rect e0;
    public final odg f0;
    public pe0 g0;
    public final lsc h0;
    public boolean i0;
    public final int[] j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9d(zy7 zy7Var, v9d v9dVar, String str, View view, cz5 cz5Var, u9d u9dVar, UUID uuid, boolean z) {
        super(view.getContext());
        int i = Build.VERSION.SDK_INT;
        cm4 t9dVar = i >= 30 ? new t9d() : i >= 29 ? new s9d() : new cm4();
        this.N = zy7Var;
        this.O = v9dVar;
        this.P = str;
        this.Q = view;
        this.R = z;
        this.S = t9dVar;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.T = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        v9d v9dVar2 = this.O;
        boolean zC = u40.c(view);
        boolean z2 = v9dVar2.b;
        int i2 = v9dVar2.a;
        if (z2 && zC) {
            i2 |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        } else if (z2 && !zC) {
            i2 &= -8193;
        }
        layoutParams.flags = i2;
        layoutParams.type = this.O.f;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.U = layoutParams;
        this.V = u9dVar;
        this.W = fu9.E;
        this.a0 = mpk.P(null);
        this.b0 = mpk.P(null);
        int i3 = 2;
        this.d0 = mpk.w(new k2c(i3, this));
        this.e0 = new Rect();
        this.f0 = new odg(new p40(this, i3));
        setId(android.R.id.content);
        setTag(R.id.view_tree_lifecycle_owner, ink.a(view));
        setTag(R.id.view_tree_view_model_store_owner, syi.a(view));
        setTag(R.id.view_tree_saved_state_registry_owner, ryi.a(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(cz5Var.q0(8.0f));
        setOutlineProvider(new e36(2));
        this.h0 = mpk.P(wa4.a);
        this.j0 = new int[2];
    }

    private final pz7 getContent() {
        return (pz7) this.h0.getValue();
    }

    private final c79 getDisplayBounds() {
        int i = this.O.a & 512;
        View view = this.Q;
        Rect rect = this.e0;
        cm4 cm4Var = this.S;
        if (i == 0) {
            cm4Var.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            cm4Var.d(view, rect);
        }
        return new c79(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cu9 getParentLayoutCoordinates() {
        return (cu9) this.b0.getValue();
    }

    private final void setContent(pz7 pz7Var) {
        this.h0.setValue(pz7Var);
    }

    private final void setParentLayoutCoordinates(cu9 cu9Var) {
        this.b0.setValue(cu9Var);
    }

    @Override // defpackage.a1
    public final void a(int i, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-857613600);
        int i2 = 2;
        int i3 = (e18Var.h(this) ? 4 : 2) | i;
        if (e18Var.Q(i3 & 1, (i3 & 3) != 2)) {
            getContent().invoke(e18Var, 0);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new r10(this, i, i2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.O.c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                zy7 zy7Var = this.N;
                if (zy7Var != null) {
                    zy7Var.a();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.a1
    public final void g(boolean z, int i, int i2, int i3, int i4) {
        super.g(z, i, i2, i3, i4);
        this.O.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.U;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.S.getClass();
        this.T.updateViewLayout(this, layoutParams);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.d0.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.U;
    }

    public final fu9 getParentLayoutDirection() {
        return this.W;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final g79 m1203getPopupContentSizebOM6tXw() {
        return (g79) this.a0.getValue();
    }

    public final u9d getPositionProvider() {
        return this.V;
    }

    @Override // defpackage.a1
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.i0;
    }

    public a1 getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.P;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // defpackage.a1
    public final void h(int i, int i2) {
        this.O.getClass();
        c79 displayBounds = getDisplayBounds();
        super.h(View.MeasureSpec.makeMeasureSpec(displayBounds.f(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.c(), Integer.MIN_VALUE));
    }

    public final void n(ge4 ge4Var, pz7 pz7Var) {
        setParentCompositionContext(ge4Var);
        setContent(pz7Var);
        this.i0 = true;
    }

    public final void o(zy7 zy7Var, v9d v9dVar, String str, fu9 fu9Var) {
        int i;
        this.N = zy7Var;
        this.P = str;
        if (!x44.r(this.O, v9dVar)) {
            v9dVar.getClass();
            this.O = v9dVar;
            boolean zC = u40.c(this.Q);
            boolean z = v9dVar.b;
            int i2 = v9dVar.a;
            if (z && zC) {
                i2 |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
            } else if (z && !zC) {
                i2 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.U;
            layoutParams.flags = i2;
            this.S.getClass();
            this.T.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = fu9Var.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                wg6.i();
                return;
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    @Override // defpackage.a1, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f0.e();
        if (!this.O.c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.g0 == null) {
            this.g0 = new pe0(0, this.N);
        }
        d6.e(this, this.g0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        odg odgVar = this.f0;
        cd cdVar = (cd) odgVar.i;
        if (cdVar != null) {
            cdVar.h();
        }
        odgVar.a();
        if (Build.VERSION.SDK_INT >= 33) {
            d6.f(this, this.g0);
        }
        this.g0 = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.O.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < MTTypesetterKt.kLineSkipLimitMultiplier || motionEvent.getX() >= getWidth() || motionEvent.getY() < MTTypesetterKt.kLineSkipLimitMultiplier || motionEvent.getY() >= getHeight())) {
            zy7 zy7Var = this.N;
            if (zy7Var != null) {
                zy7Var.a();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        zy7 zy7Var2 = this.N;
        if (zy7Var2 != null) {
            zy7Var2.a();
        }
        return true;
    }

    public final void p() {
        cu9 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.n()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jK = parentLayoutCoordinates.k();
            long jQ = this.R ? parentLayoutCoordinates.q(0L) : parentLayoutCoordinates.b(0L);
            c79 c79VarF = eve.f((((long) Math.round(Float.intBitsToFloat((int) (jQ >> 32)))) << 32) | (4294967295L & ((long) Math.round(Float.intBitsToFloat((int) (jQ & 4294967295L))))), jK);
            if (c79VarF.equals(this.c0)) {
                return;
            }
            this.c0 = c79VarF;
            r();
        }
    }

    public final void q(cu9 cu9Var) {
        setParentLayoutCoordinates(cu9Var);
        p();
    }

    public final void r() {
        g79 g79VarM1203getPopupContentSizebOM6tXw;
        c79 c79Var = this.c0;
        if (c79Var == null || (g79VarM1203getPopupContentSizebOM6tXw = m1203getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j = g79VarM1203getPopupContentSizebOM6tXw.a;
        c79 displayBounds = getDisplayBounds();
        long jC = (((long) displayBounds.c()) & 4294967295L) | (((long) displayBounds.f()) << 32);
        cae caeVar = new cae();
        caeVar.E = 0L;
        this.f0.d(this, p9d.G, new q9d(caeVar, this, c79Var, jC, j));
        long j2 = caeVar.E;
        WindowManager.LayoutParams layoutParams = this.U;
        layoutParams.x = (int) (j2 >> 32);
        layoutParams.y = (int) (j2 & 4294967295L);
        boolean z = this.O.e;
        cm4 cm4Var = this.S;
        if (z) {
            cm4Var.j(this, (int) (jC >> 32), (int) (jC & 4294967295L));
        }
        cm4Var.getClass();
        this.T.updateViewLayout(this, layoutParams);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }

    public final void setParentLayoutDirection(fu9 fu9Var) {
        this.W = fu9Var;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m1204setPopupContentSizefhxjrPA(g79 g79Var) {
        this.a0.setValue(g79Var);
    }

    public final void setPositionProvider(u9d u9dVar) {
        this.V = u9dVar;
    }

    public final void setTestTag(String str) {
        this.P = str;
    }
}
