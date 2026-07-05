package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes2.dex */
public class uyg extends a36 {
    public Dialog O0;
    public DialogInterface.OnCancelListener P0;
    public AlertDialog Q0;

    public static uyg J(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        uyg uygVar = new uyg();
        dgj.w("Cannot display null dialog", dialog);
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        uygVar.O0 = dialog;
        if (onCancelListener != null) {
            uygVar.P0 = onCancelListener;
        }
        return uygVar;
    }

    @Override // defpackage.a36
    public final Dialog I() {
        Dialog dialog = this.O0;
        if (dialog != null) {
            return dialog;
        }
        this.F0 = false;
        if (this.Q0 == null) {
            Context contextJ = j();
            dgj.v(contextJ);
            this.Q0 = new AlertDialog.Builder(contextJ).create();
        }
        return this.Q0;
    }

    public final void K(rx7 rx7Var, String str) {
        this.L0 = false;
        this.M0 = true;
        rx7Var.getClass();
        tb1 tb1Var = new tb1(rx7Var);
        tb1Var.o = true;
        tb1Var.f(0, this, str);
        tb1Var.e(false, true);
    }

    @Override // defpackage.a36, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.P0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
