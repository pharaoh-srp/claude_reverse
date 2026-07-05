package defpackage;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class z26 extends d4c {
    public final /* synthetic */ int M = 0;
    public final /* synthetic */ cx7 N;

    public z26(a36 a36Var, z26 z26Var) {
        this.N = a36Var;
    }

    @Override // defpackage.d4c
    public final View b0(int i) {
        int i2 = this.M;
        cx7 cx7Var = this.N;
        switch (i2) {
            case 0:
                Dialog dialog = ((a36) cx7Var).J0;
                if (dialog != null) {
                    return dialog.findViewById(i);
                }
                return null;
            default:
                throw new IllegalStateException("Fragment " + cx7Var + " does not have a view");
        }
    }

    @Override // defpackage.d4c
    public final boolean c0() {
        switch (this.M) {
            case 0:
                return ((a36) this.N).N0;
            default:
                return false;
        }
    }

    public z26(cx7 cx7Var) {
        this.N = cx7Var;
    }
}
