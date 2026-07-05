package defpackage;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes2.dex */
public final class fdb implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener a;
    public final /* synthetic */ gdb b;

    public fdb(gdb gdbVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.b = gdbVar;
        this.a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.a.onMenuItemActionCollapse(this.b.j(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.a.onMenuItemActionExpand(this.b.j(menuItem));
    }
}
