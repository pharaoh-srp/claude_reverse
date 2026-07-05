package defpackage;

import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class lbj extends sm7 {
    public final k99 F;
    public final Window.Callback G;
    public final q28 H;
    public final bz7 I;
    public final kf9[] J;
    public final h99 K;
    public final WeakReference L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbj(Window window, k99 k99Var, Window.Callback callback, q28 q28Var, m4c m4cVar, kf9[] kf9VarArr, h99 h99Var) {
        super(callback);
        lxe lxeVar = lxe.N;
        window.getClass();
        k99Var.getClass();
        h99Var.getClass();
        this.F = k99Var;
        this.G = callback;
        this.H = q28Var;
        this.I = lxeVar;
        this.J = kf9VarArr;
        this.K = h99Var;
        this.L = new WeakReference(window);
    }

    public final void a(NullPointerException nullPointerException) {
        String message = nullPointerException.getMessage();
        if (message == null || !bsg.u0(message, "Parameter specified as non-null is null", false)) {
            throw nullPointerException;
        }
        dch.H(this.K, 5, g99.F, tnh.P, nullPointerException, false, 48);
    }

    @Override // defpackage.sm7, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Window window;
        View currentFocus;
        if (keyEvent == null) {
            dch.I(this.K, 5, x44.X(g99.F, g99.G), tnh.M, null, 56);
        } else {
            int keyCode = keyEvent.getKeyCode();
            k99 k99Var = this.F;
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                t78.a(k99Var).t(oxe.I, "back", nm6.E);
            } else if (keyEvent.getKeyCode() == 23 && keyEvent.getAction() == 1 && (window = (Window) this.L.get()) != null && (currentFocus = window.getCurrentFocus()) != null) {
                LinkedHashMap linkedHashMapJ0 = sta.j0(new cpc("action.target.classname", opk.m(currentFocus)), new cpc("action.target.resource_id", opk.l(window.getContext(), currentFocus.getId())));
                for (kf9 kf9Var : this.J) {
                    kf9Var.getClass();
                    kf9.a(currentFocus, linkedHashMapJ0);
                }
                t78.a(k99Var).t(oxe.H, "", linkedHashMapJ0);
            }
        }
        try {
            return this.G.dispatchKeyEvent(keyEvent);
        } catch (NullPointerException e) {
            this.a(e);
            return true;
        }
    }

    @Override // defpackage.sm7, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        g99 g99Var = g99.G;
        g99 g99Var2 = g99.F;
        if (motionEvent != null) {
            MotionEvent motionEvent2 = (MotionEvent) this.I.invoke(motionEvent);
            try {
                try {
                    this.H.w(motionEvent2);
                } catch (Exception e) {
                    dch.I(this.K, 5, x44.X(g99Var2, g99Var), tnh.N, e, 48);
                }
                motionEvent2.recycle();
            } catch (Throwable th) {
                motionEvent2.recycle();
                throw th;
            }
        } else {
            dch.I(this.K, 5, x44.X(g99Var2, g99Var), tnh.O, null, 56);
        }
        try {
            return this.G.dispatchTouchEvent(motionEvent);
        } catch (NullPointerException e2) {
            this.a(e2);
            return true;
        }
    }

    @Override // defpackage.sm7, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        Window window = (Window) this.L.get();
        t78.a(this.F).t(oxe.E, "", sta.j0(new cpc("action.target.classname", menuItem.getClass().getCanonicalName()), new cpc("action.target.resource_id", opk.l(window != null ? window.getContext() : null, menuItem.getItemId())), new cpc("action.target.title", menuItem.getTitle())));
        try {
            return this.G.onMenuItemSelected(i, menuItem);
        } catch (NullPointerException e) {
            this.a(e);
            return true;
        }
    }
}
