package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes2.dex */
public final class nkg extends mdb implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context F;
    public final vcb G;
    public final scb H;
    public final boolean I;
    public final int J;
    public final int K;
    public final sdb L;
    public PopupWindow.OnDismissListener O;
    public View P;
    public View Q;
    public vdb R;
    public ViewTreeObserver S;
    public boolean T;
    public boolean U;
    public int V;
    public boolean X;
    public final qh0 M = new qh0(3, this);
    public final le2 N = new le2(this, 1);
    public int W = 0;

    public nkg(Context context, vcb vcbVar, View view, int i, boolean z) {
        this.F = context;
        this.G = vcbVar;
        this.I = z;
        this.H = new scb(vcbVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.K = i;
        Resources resources = context.getResources();
        this.J = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.P = view;
        this.L = new sdb(context, null, i, 0);
        vcbVar.b(this, context);
    }

    @Override // defpackage.wdb
    public final void a(vcb vcbVar, boolean z) {
        if (vcbVar != this.G) {
            return;
        }
        dismiss();
        vdb vdbVar = this.R;
        if (vdbVar != null) {
            vdbVar.a(vcbVar, z);
        }
    }

    @Override // defpackage.l5g
    public final boolean b() {
        return !this.T && this.L.d0.isShowing();
    }

    @Override // defpackage.wdb
    public final boolean c(xug xugVar) {
        boolean z;
        if (xugVar.hasVisibleItems()) {
            odb odbVar = new odb(this.F, xugVar, this.Q, this.I, this.K, 0);
            vdb vdbVar = this.R;
            odbVar.h = vdbVar;
            mdb mdbVar = odbVar.i;
            if (mdbVar != null) {
                mdbVar.f(vdbVar);
            }
            int size = xugVar.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = xugVar.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            odbVar.g = z;
            mdb mdbVar2 = odbVar.i;
            if (mdbVar2 != null) {
                mdbVar2.o(z);
            }
            odbVar.j = this.O;
            this.O = null;
            this.G.c(false);
            sdb sdbVar = this.L;
            int width = sdbVar.J;
            int iO = sdbVar.o();
            if ((Gravity.getAbsoluteGravity(this.W, this.P.getLayoutDirection()) & 7) == 5) {
                width += this.P.getWidth();
            }
            if (!odbVar.b()) {
                if (odbVar.e != null) {
                    odbVar.d(width, iO, true, true);
                }
            }
            vdb vdbVar2 = this.R;
            if (vdbVar2 != null) {
                vdbVar2.s(xugVar);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.wdb
    public final boolean d() {
        return false;
    }

    @Override // defpackage.l5g
    public final void dismiss() {
        if (b()) {
            this.L.dismiss();
        }
    }

    @Override // defpackage.wdb
    public final void f(vdb vdbVar) {
        this.R = vdbVar;
    }

    @Override // defpackage.l5g
    public final void g() {
        View view;
        if (b()) {
            return;
        }
        if (this.T || (view = this.P) == null) {
            sz6.j("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.Q = view;
        sdb sdbVar = this.L;
        jh0 jh0Var = sdbVar.d0;
        jh0 jh0Var2 = sdbVar.d0;
        jh0Var.setOnDismissListener(this);
        sdbVar.T = this;
        sdbVar.c0 = true;
        jh0Var2.setFocusable(true);
        View view2 = this.Q;
        boolean z = this.S == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.S = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.M);
        }
        view2.addOnAttachStateChangeListener(this.N);
        sdbVar.S = view2;
        sdbVar.P = this.W;
        boolean z2 = this.U;
        Context context = this.F;
        scb scbVar = this.H;
        if (!z2) {
            this.V = mdb.m(scbVar, context, this.J);
            this.U = true;
        }
        sdbVar.q(this.V);
        jh0Var2.setInputMethodMode(2);
        Rect rect = this.E;
        sdbVar.b0 = rect != null ? new Rect(rect) : null;
        sdbVar.g();
        dh6 dh6Var = sdbVar.G;
        dh6Var.setOnKeyListener(this);
        if (this.X) {
            vcb vcbVar = this.G;
            if (vcbVar.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) dh6Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(vcbVar.m);
                }
                frameLayout.setEnabled(false);
                dh6Var.addHeaderView(frameLayout, null, false);
            }
        }
        sdbVar.p(scbVar);
        sdbVar.g();
    }

    @Override // defpackage.wdb
    public final void i() {
        this.U = false;
        scb scbVar = this.H;
        if (scbVar != null) {
            scbVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.l5g
    public final dh6 j() {
        return this.L.G;
    }

    @Override // defpackage.mdb
    public final void l(vcb vcbVar) {
    }

    @Override // defpackage.mdb
    public final void n(View view) {
        this.P = view;
    }

    @Override // defpackage.mdb
    public final void o(boolean z) {
        this.H.c = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.T = true;
        this.G.c(true);
        ViewTreeObserver viewTreeObserver = this.S;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.S = this.Q.getViewTreeObserver();
            }
            this.S.removeGlobalOnLayoutListener(this.M);
            this.S = null;
        }
        this.Q.removeOnAttachStateChangeListener(this.N);
        PopupWindow.OnDismissListener onDismissListener = this.O;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.mdb
    public final void p(int i) {
        this.W = i;
    }

    @Override // defpackage.mdb
    public final void q(int i) {
        this.L.J = i;
    }

    @Override // defpackage.mdb
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.O = onDismissListener;
    }

    @Override // defpackage.mdb
    public final void s(boolean z) {
        this.X = z;
    }

    @Override // defpackage.mdb
    public final void t(int i) {
        this.L.l(i);
    }
}
