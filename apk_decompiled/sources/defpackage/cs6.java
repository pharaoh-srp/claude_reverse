package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public class cs6 extends DialogFragment {
    public Dialog E;
    public DialogInterface.OnCancelListener F;
    public AlertDialog G;

    public static cs6 a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        cs6 cs6Var = new cs6();
        dgj.w("Cannot display null dialog", dialog);
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        cs6Var.E = dialog;
        if (onCancelListener != null) {
            cs6Var.F = onCancelListener;
        }
        return cs6Var;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.F;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.E;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.G == null) {
            Activity activity = getActivity();
            dgj.v(activity);
            this.G = new AlertDialog.Builder(activity).create();
        }
        return this.G;
    }
}
