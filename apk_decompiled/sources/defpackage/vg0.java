package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class vg0 implements Window.Callback {
    public final Window.Callback E;
    public boolean F;
    public boolean G;
    public boolean H;
    public final /* synthetic */ ah0 I;

    public vg0(ah0 ah0Var, Window.Callback callback) {
        this.I = ah0Var;
        if (callback != null) {
            this.E = callback;
        } else {
            sz6.p("Window callback may not be null");
            throw null;
        }
    }

    public final void a(Window.Callback callback) {
        try {
            this.F = true;
            callback.onContentChanged();
        } finally {
            this.F = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.E.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.E.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        jbj.a(this.E, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.E.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.G;
        Window.Callback callback = this.E;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.I.j(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            android.view.Window$Callback r0 = r5.E
            boolean r0 = r0.dispatchKeyShortcutEvent(r6)
            r1 = 1
            if (r0 != 0) goto L69
            int r0 = r6.getKeyCode()
            ah0 r5 = r5.I
            qbj r2 = r5.q()
            r3 = 0
            if (r2 == 0) goto L3b
            pbj r2 = r2.i
            if (r2 != 0) goto L1c
        L1a:
            r0 = r3
            goto L38
        L1c:
            vcb r2 = r2.H
            if (r2 == 0) goto L1a
            int r4 = r6.getDeviceId()
            android.view.KeyCharacterMap r4 = android.view.KeyCharacterMap.load(r4)
            int r4 = r4.getKeyboardType()
            if (r4 == r1) goto L30
            r4 = r1
            goto L31
        L30:
            r4 = r3
        L31:
            r2.setQwertyMode(r4)
            boolean r0 = r2.performShortcut(r0, r6, r3)
        L38:
            if (r0 == 0) goto L3b
            goto L69
        L3b:
            zg0 r0 = r5.j0
            if (r0 == 0) goto L50
            int r2 = r6.getKeyCode()
            boolean r0 = r5.u(r0, r2, r6)
            if (r0 == 0) goto L50
            zg0 r5 = r5.j0
            if (r5 == 0) goto L69
            r5.l = r1
            return r1
        L50:
            zg0 r0 = r5.j0
            if (r0 != 0) goto L68
            zg0 r0 = r5.p(r3)
            r5.v(r0, r6)
            int r2 = r6.getKeyCode()
            boolean r5 = r5.u(r0, r2, r6)
            r0.k = r3
            if (r5 == 0) goto L68
            goto L69
        L68:
            return r3
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg0.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.E.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.E.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.E.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.E.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.E.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.E.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.F) {
            this.E.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof vcb)) {
            return this.E.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.E.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.E.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.E.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        qbj qbjVarQ;
        b(i, menu);
        if (i == 108 && (qbjVarQ = this.I.q()) != null) {
            ArrayList arrayList = qbjVarQ.m;
            if (true != qbjVarQ.l) {
                qbjVarQ.l = true;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    mr9.o();
                    return false;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.H) {
            this.E.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        ah0 ah0Var = this.I;
        if (i != 108) {
            if (i == 0) {
                zg0 zg0VarP = ah0Var.p(i);
                if (zg0VarP.m) {
                    ah0Var.i(zg0VarP, false);
                    return;
                }
                return;
            }
            return;
        }
        qbj qbjVarQ = ah0Var.q();
        if (qbjVarQ != null) {
            ArrayList arrayList = qbjVarQ.m;
            if (qbjVarQ.l) {
                qbjVarQ.l = false;
                if (arrayList.size() <= 0) {
                    return;
                }
                arrayList.get(0).getClass();
                mr9.o();
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        kbj.a(this.E, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        vcb vcbVar = menu instanceof vcb ? (vcb) menu : null;
        if (i == 0 && vcbVar == null) {
            return false;
        }
        if (vcbVar != null) {
            vcbVar.x = true;
        }
        boolean zOnPreparePanel = this.E.onPreparePanel(i, view, menu);
        if (vcbVar != null) {
            vcbVar.x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        vcb vcbVar = this.I.p(0).h;
        if (vcbVar != null) {
            d(list, vcbVar, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return ibj.a(this.E, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.E.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.E.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        ah0 ah0Var = this.I;
        Context context = ah0Var.I;
        if (!ah0Var.V || i != 0) {
            return ibj.b(this.E, callback, i);
        }
        c61 c61Var = new c61(context, callback);
        ob obVar = ah0Var.Q;
        if (obVar != null) {
            obVar.b();
        }
        qb5 qb5Var = new qb5(ah0Var, c61Var);
        qbj qbjVarQ = ah0Var.q();
        int i2 = 1;
        if (qbjVarQ != null) {
            pbj pbjVar = qbjVarQ.i;
            if (pbjVar != null) {
                pbjVar.b();
            }
            qbjVarQ.c.setHideOnContentScrollEnabled(false);
            qbjVarQ.f.e();
            pbj pbjVar2 = new pbj(qbjVarQ, qbjVarQ.f.getContext(), qb5Var);
            vcb vcbVar = pbjVar2.H;
            vcbVar.w();
            try {
                if (((c61) pbjVar2.I.E).C(pbjVar2, vcbVar)) {
                    qbjVarQ.i = pbjVar2;
                    pbjVar2.h();
                    qbjVarQ.f.c(pbjVar2);
                    qbjVarQ.a(true);
                } else {
                    pbjVar2 = null;
                }
                ah0Var.Q = pbjVar2;
            } finally {
                vcbVar.v();
            }
        }
        if (ah0Var.Q == null) {
            gyi gyiVar = ah0Var.U;
            if (gyiVar != null) {
                gyiVar.b();
            }
            ob obVar2 = ah0Var.Q;
            if (obVar2 != null) {
                obVar2.b();
            }
            if (ah0Var.R == null) {
                if (ah0Var.f0) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        np4 np4Var = new np4(context, 0);
                        np4Var.getTheme().setTo(themeNewTheme);
                        context = np4Var;
                    }
                    ah0Var.R = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    ah0Var.S = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    ah0Var.S.setContentView(ah0Var.R);
                    ah0Var.S.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    ah0Var.R.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    ah0Var.S.setHeight(-2);
                    ah0Var.T = new og0(ah0Var, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) ah0Var.X.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(ah0Var.n()));
                        ah0Var.R = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (ah0Var.R != null) {
                gyi gyiVar2 = ah0Var.U;
                if (gyiVar2 != null) {
                    gyiVar2.b();
                }
                ah0Var.R.e();
                Context context2 = ah0Var.R.getContext();
                ActionBarContextView actionBarContextView = ah0Var.R;
                ekg ekgVar = new ekg();
                ekgVar.G = context2;
                ekgVar.H = actionBarContextView;
                ekgVar.I = qb5Var;
                vcb vcbVar2 = new vcb(actionBarContextView.getContext());
                vcbVar2.l = 1;
                ekgVar.L = vcbVar2;
                vcbVar2.e = ekgVar;
                if (c61Var.C(ekgVar, vcbVar2)) {
                    ekgVar.h();
                    ah0Var.R.c(ekgVar);
                    ah0Var.Q = ekgVar;
                    boolean z = ah0Var.W && (viewGroup = ah0Var.X) != null && viewGroup.isLaidOut();
                    ActionBarContextView actionBarContextView2 = ah0Var.R;
                    if (z) {
                        actionBarContextView2.setAlpha(MTTypesetterKt.kLineSkipLimitMultiplier);
                        gyi gyiVarA = mvi.a(ah0Var.R);
                        gyiVarA.a(1.0f);
                        ah0Var.U = gyiVarA;
                        gyiVarA.d(new rg0(i2, ah0Var));
                    } else {
                        actionBarContextView2.setAlpha(1.0f);
                        ah0Var.R.setVisibility(0);
                        if (ah0Var.R.getParent() instanceof View) {
                            View view = (View) ah0Var.R.getParent();
                            WeakHashMap weakHashMap = mvi.a;
                            view.requestApplyInsets();
                        }
                    }
                    if (ah0Var.S != null) {
                        ah0Var.J.getDecorView().post(ah0Var.T);
                    }
                } else {
                    ah0Var.Q = null;
                }
            }
            ah0Var.x();
            ah0Var.Q = ah0Var.Q;
        }
        ah0Var.x();
        ob obVar3 = ah0Var.Q;
        if (obVar3 != null) {
            return c61Var.p(obVar3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.E.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
