package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class x26 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ a36 E;

    public x26(a36 a36Var) {
        this.E = a36Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        a36 a36Var = this.E;
        Dialog dialog = a36Var.J0;
        if (dialog != null) {
            a36Var.onCancel(dialog);
        }
    }
}
