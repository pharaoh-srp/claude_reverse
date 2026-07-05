package defpackage;

import java.io.FileOutputStream;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class n35 extends Thread {
    public final /* synthetic */ int E;
    public final Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n35(o35 o35Var) {
        super(dr.a, "dd-tracer-shutdown-hook");
        this.E = 0;
        this.F = new WeakReference(o35Var);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                o35 o35Var = (o35) ((WeakReference) obj).get();
                if (o35Var != null) {
                    o35Var.L.close();
                    o35Var.N.close();
                    o35Var.W.getClass();
                    o35Var.Q.getClass();
                }
                break;
            case 1:
                ((h07) obj).b();
                break;
            default:
                FileOutputStream fileOutputStream = (FileOutputStream) ((fj0) obj).F;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                break;
        }
    }

    public /* synthetic */ n35(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }
}
