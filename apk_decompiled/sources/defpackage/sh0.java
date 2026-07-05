package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: loaded from: classes2.dex */
public final class sh0 implements yh0, DialogInterface.OnClickListener {
    public bt E;
    public th0 F;
    public CharSequence G;
    public final /* synthetic */ zh0 H;

    public sh0(zh0 zh0Var) {
        this.H = zh0Var;
    }

    @Override // defpackage.yh0
    public final boolean b() {
        bt btVar = this.E;
        if (btVar != null) {
            return btVar.isShowing();
        }
        return false;
    }

    @Override // defpackage.yh0
    public final int c() {
        return 0;
    }

    @Override // defpackage.yh0
    public final void dismiss() {
        bt btVar = this.E;
        if (btVar != null) {
            btVar.dismiss();
            this.E = null;
        }
    }

    @Override // defpackage.yh0
    public final void e(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.yh0
    public final CharSequence f() {
        return this.G;
    }

    @Override // defpackage.yh0
    public final Drawable h() {
        return null;
    }

    @Override // defpackage.yh0
    public final void i(CharSequence charSequence) {
        this.G = charSequence;
    }

    @Override // defpackage.yh0
    public final void k(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.yh0
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.yh0
    public final void m(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.yh0
    public final void n(int i, int i2) {
        if (this.F == null) {
            return;
        }
        zh0 zh0Var = this.H;
        at atVar = new at(zh0Var.getPopupContext());
        ws wsVar = (ws) atVar.G;
        CharSequence charSequence = this.G;
        if (charSequence != null) {
            wsVar.d = charSequence;
        }
        th0 th0Var = this.F;
        int selectedItemPosition = zh0Var.getSelectedItemPosition();
        wsVar.i = th0Var;
        wsVar.j = this;
        wsVar.m = selectedItemPosition;
        wsVar.l = true;
        bt btVarI = atVar.i();
        this.E = btVarI;
        AlertController$RecycleListView alertController$RecycleListView = btVarI.K.e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.E.show();
    }

    @Override // defpackage.yh0
    public final int o() {
        return 0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        zh0 zh0Var = this.H;
        zh0Var.setSelection(i);
        if (zh0Var.getOnItemClickListener() != null) {
            zh0Var.performItemClick(null, i, this.F.getItemId(i));
        }
        dismiss();
    }

    @Override // defpackage.yh0
    public final void p(ListAdapter listAdapter) {
        this.F = (th0) listAdapter;
    }
}
