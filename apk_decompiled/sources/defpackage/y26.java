package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class y26 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ a36 E;

    public y26(a36 a36Var) {
        this.E = a36Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        a36 a36Var = this.E;
        Dialog dialog = a36Var.J0;
        if (dialog != null) {
            a36Var.onDismiss(dialog);
        }
    }
}
