package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.anthropic.claude.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class oe2 extends mdb implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public final Context F;
    public final int G;
    public final int H;
    public final boolean I;
    public final Handler J;
    public View R;
    public View S;
    public int T;
    public boolean U;
    public boolean V;
    public int W;
    public int X;
    public boolean Z;
    public vdb a0;
    public ViewTreeObserver b0;
    public PopupWindow.OnDismissListener c0;
    public boolean d0;
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public final qh0 M = new qh0(2, this);
    public final le2 N = new le2(this, 0);
    public final poj O = new poj(this);
    public int P = 0;
    public int Q = 0;
    public boolean Y = false;

    public oe2(Context context, View view, int i, boolean z) {
        this.F = context;
        this.R = view;
        this.H = i;
        this.I = z;
        this.T = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.G = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.J = new Handler();
    }

    @Override // defpackage.wdb
    public final void a(vcb vcbVar, boolean z) {
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (vcbVar == ((ne2) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((ne2) arrayList.get(i2)).b.c(false);
        }
        ne2 ne2Var = (ne2) arrayList.remove(i);
        vcb vcbVar2 = ne2Var.b;
        sdb sdbVar = ne2Var.a;
        jh0 jh0Var = sdbVar.d0;
        vcbVar2.r(this);
        if (this.d0) {
            pdb.b(jh0Var, null);
            jh0Var.setAnimationStyle(0);
        }
        sdbVar.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.T = ((ne2) arrayList.get(size2 - 1)).c;
        } else {
            this.T = this.R.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((ne2) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        vdb vdbVar = this.a0;
        if (vdbVar != null) {
            vdbVar.a(vcbVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.b0;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.b0.removeGlobalOnLayoutListener(this.M);
            }
            this.b0 = null;
        }
        this.S.removeOnAttachStateChangeListener(this.N);
        this.c0.onDismiss();
    }

    @Override // defpackage.l5g
    public final boolean b() {
        ArrayList arrayList = this.L;
        return arrayList.size() > 0 && ((ne2) arrayList.get(0)).a.d0.isShowing();
    }

    @Override // defpackage.wdb
    public final boolean c(xug xugVar) {
        for (ne2 ne2Var : this.L) {
            if (xugVar == ne2Var.b) {
                ne2Var.a.G.requestFocus();
                return true;
            }
        }
        if (!xugVar.hasVisibleItems()) {
            return false;
        }
        l(xugVar);
        vdb vdbVar = this.a0;
        if (vdbVar != null) {
            vdbVar.s(xugVar);
        }
        return true;
    }

    @Override // defpackage.wdb
    public final boolean d() {
        return false;
    }

    @Override // defpackage.l5g
    public final void dismiss() {
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        if (size > 0) {
            ne2[] ne2VarArr = (ne2[]) arrayList.toArray(new ne2[size]);
            for (int i = size - 1; i >= 0; i--) {
                ne2 ne2Var = ne2VarArr[i];
                if (ne2Var.a.d0.isShowing()) {
                    ne2Var.a.dismiss();
                }
            }
        }
    }

    @Override // defpackage.wdb
    public final void f(vdb vdbVar) {
        this.a0 = vdbVar;
    }

    @Override // defpackage.l5g
    public final void g() {
        if (b()) {
            return;
        }
        ArrayList arrayList = this.K;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u((vcb) it.next());
        }
        arrayList.clear();
        View view = this.R;
        this.S = view;
        if (view != null) {
            boolean z = this.b0 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.b0 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.M);
            }
            this.S.addOnAttachStateChangeListener(this.N);
        }
    }

    @Override // defpackage.wdb
    public final void i() {
        Iterator it = this.L.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((ne2) it.next()).a.G.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((scb) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.l5g
    public final dh6 j() {
        ArrayList arrayList = this.L;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((ne2) arrayList.get(arrayList.size() - 1)).a.G;
    }

    @Override // defpackage.mdb
    public final void l(vcb vcbVar) {
        vcbVar.b(this, this.F);
        if (b()) {
            u(vcbVar);
        } else {
            this.K.add(vcbVar);
        }
    }

    @Override // defpackage.mdb
    public final void n(View view) {
        if (this.R != view) {
            this.R = view;
            this.Q = Gravity.getAbsoluteGravity(this.P, view.getLayoutDirection());
        }
    }

    @Override // defpackage.mdb
    public final void o(boolean z) {
        this.Y = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ne2 ne2Var;
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                ne2Var = null;
                break;
            }
            ne2Var = (ne2) arrayList.get(i);
            if (!ne2Var.a.d0.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (ne2Var != null) {
            ne2Var.b.c(false);
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
        if (this.P != i) {
            this.P = i;
            this.Q = Gravity.getAbsoluteGravity(i, this.R.getLayoutDirection());
        }
    }

    @Override // defpackage.mdb
    public final void q(int i) {
        this.U = true;
        this.W = i;
    }

    @Override // defpackage.mdb
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.c0 = onDismissListener;
    }

    @Override // defpackage.mdb
    public final void s(boolean z) {
        this.Z = z;
    }

    @Override // defpackage.mdb
    public final void t(int i) {
        this.V = true;
        this.X = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(defpackage.vcb r20) {
        /*
            Method dump skipped, instruction units count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oe2.u(vcb):void");
    }
}
