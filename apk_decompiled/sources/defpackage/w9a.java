package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: loaded from: classes2.dex */
public final class w9a implements wdb, AdapterView.OnItemClickListener {
    public Context E;
    public LayoutInflater F;
    public vcb G;
    public ExpandedMenuView H;
    public vdb I;
    public v9a J;

    public w9a(ContextWrapper contextWrapper) {
        this.E = contextWrapper;
        this.F = LayoutInflater.from(contextWrapper);
    }

    @Override // defpackage.wdb
    public final void a(vcb vcbVar, boolean z) {
        vdb vdbVar = this.I;
        if (vdbVar != null) {
            vdbVar.a(vcbVar, z);
        }
    }

    @Override // defpackage.wdb
    public final boolean c(xug xugVar) {
        boolean zHasVisibleItems = xugVar.hasVisibleItems();
        Context context = xugVar.a;
        if (!zHasVisibleItems) {
            return false;
        }
        xcb xcbVar = new xcb();
        xcbVar.E = xugVar;
        at atVar = new at(context);
        ws wsVar = (ws) atVar.G;
        w9a w9aVar = new w9a(wsVar.a);
        xcbVar.G = w9aVar;
        w9aVar.I = xcbVar;
        xugVar.b(w9aVar, context);
        w9a w9aVar2 = xcbVar.G;
        if (w9aVar2.J == null) {
            w9aVar2.J = new v9a(w9aVar2);
        }
        wsVar.i = w9aVar2.J;
        wsVar.j = xcbVar;
        View view = xugVar.o;
        if (view != null) {
            wsVar.e = view;
        } else {
            wsVar.c = xugVar.n;
            wsVar.d = xugVar.m;
        }
        wsVar.h = xcbVar;
        bt btVarI = atVar.i();
        xcbVar.F = btVarI;
        btVarI.setOnDismissListener(xcbVar);
        WindowManager.LayoutParams attributes = xcbVar.F.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        xcbVar.F.show();
        vdb vdbVar = this.I;
        if (vdbVar == null) {
            return true;
        }
        vdbVar.s(xugVar);
        return true;
    }

    @Override // defpackage.wdb
    public final boolean d() {
        return false;
    }

    @Override // defpackage.wdb
    public final boolean e(adb adbVar) {
        return false;
    }

    @Override // defpackage.wdb
    public final void f(vdb vdbVar) {
        throw null;
    }

    @Override // defpackage.wdb
    public final boolean h(adb adbVar) {
        return false;
    }

    @Override // defpackage.wdb
    public final void i() {
        v9a v9aVar = this.J;
        if (v9aVar != null) {
            v9aVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.wdb
    public final void k(Context context, vcb vcbVar) {
        if (this.E != null) {
            this.E = context;
            if (this.F == null) {
                this.F = LayoutInflater.from(context);
            }
        }
        this.G = vcbVar;
        v9a v9aVar = this.J;
        if (v9aVar != null) {
            v9aVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.G.q(this.J.getItem(i), this, 0);
    }
}
