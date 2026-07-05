package defpackage;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class pq1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int E = 1;
    public final Object F;

    public pq1(qq1 qq1Var) {
        this.F = new WeakReference(qq1Var);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.E;
        Object obj = this.F;
        switch (i2) {
            case 0:
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference.get() != null) {
                    ((qq1) weakReference.get()).i(true);
                }
                break;
            default:
                ((gl7) obj).Q0.i(true);
                break;
        }
    }

    public pq1(gl7 gl7Var) {
        this.F = gl7Var;
    }
}
