package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class xug extends vcb implements SubMenu {
    public final adb A;
    public final vcb z;

    public xug(Context context, vcb vcbVar, adb adbVar) {
        super(context);
        this.z = vcbVar;
        this.A = adbVar;
    }

    @Override // defpackage.vcb
    public final boolean d(adb adbVar) {
        return this.z.d(adbVar);
    }

    @Override // defpackage.vcb
    public final boolean e(vcb vcbVar, MenuItem menuItem) {
        return super.e(vcbVar, menuItem) || this.z.e(vcbVar, menuItem);
    }

    @Override // defpackage.vcb
    public final boolean f(adb adbVar) {
        return this.z.f(adbVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // defpackage.vcb
    public final String j() {
        adb adbVar = this.A;
        int i = adbVar != null ? adbVar.a : 0;
        if (i == 0) {
            return null;
        }
        return grc.p(i, "android:menu:actionviewstates:");
    }

    @Override // defpackage.vcb
    public final vcb k() {
        return this.z.k();
    }

    @Override // defpackage.vcb
    public final boolean m() {
        return this.z.m();
    }

    @Override // defpackage.vcb
    public final boolean n() {
        return this.z.n();
    }

    @Override // defpackage.vcb
    public final boolean o() {
        return this.z.o();
    }

    @Override // defpackage.vcb, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // defpackage.vcb, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }
}
