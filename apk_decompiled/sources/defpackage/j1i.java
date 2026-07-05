package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class j1i implements wdb {
    public vcb E;
    public adb F;
    public final /* synthetic */ Toolbar G;

    public j1i(Toolbar toolbar) {
        this.G = toolbar;
    }

    @Override // defpackage.wdb
    public final void a(vcb vcbVar, boolean z) {
    }

    @Override // defpackage.wdb
    public final boolean c(xug xugVar) {
        return false;
    }

    @Override // defpackage.wdb
    public final boolean d() {
        return false;
    }

    @Override // defpackage.wdb
    public final boolean e(adb adbVar) {
        Toolbar toolbar = this.G;
        KeyEvent.Callback callback = toolbar.M;
        if (callback instanceof l44) {
            ((edb) ((l44) callback)).E.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.M);
        toolbar.removeView(toolbar.L);
        toolbar.M = null;
        ArrayList arrayList = toolbar.l0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.F = null;
        toolbar.requestLayout();
        adbVar.C = false;
        adbVar.n.p(false);
        toolbar.t();
        return true;
    }

    @Override // defpackage.wdb
    public final boolean h(adb adbVar) {
        Toolbar toolbar = this.G;
        toolbar.c();
        ViewParent parent = toolbar.L.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.L);
            }
            toolbar.addView(toolbar.L);
        }
        View actionView = adbVar.getActionView();
        toolbar.M = actionView;
        this.F = adbVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.M);
            }
            k1i k1iVarH = Toolbar.h();
            k1iVarH.a = (toolbar.R & 112) | 8388611;
            k1iVarH.b = 2;
            toolbar.M.setLayoutParams(k1iVarH);
            toolbar.addView(toolbar.M);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((k1i) childAt.getLayoutParams()).b != 2 && childAt != toolbar.E) {
                toolbar.removeViewAt(childCount);
                toolbar.l0.add(childAt);
            }
        }
        toolbar.requestLayout();
        adbVar.C = true;
        adbVar.n.p(false);
        KeyEvent.Callback callback = toolbar.M;
        if (callback instanceof l44) {
            ((edb) ((l44) callback)).E.onActionViewExpanded();
        }
        toolbar.t();
        return true;
    }

    @Override // defpackage.wdb
    public final void i() {
        if (this.F != null) {
            vcb vcbVar = this.E;
            if (vcbVar != null) {
                int size = vcbVar.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.E.getItem(i) == this.F) {
                        return;
                    }
                }
            }
            e(this.F);
        }
    }

    @Override // defpackage.wdb
    public final void k(Context context, vcb vcbVar) {
        adb adbVar;
        vcb vcbVar2 = this.E;
        if (vcbVar2 != null && (adbVar = this.F) != null) {
            vcbVar2.d(adbVar);
        }
        this.E = vcbVar;
    }
}
