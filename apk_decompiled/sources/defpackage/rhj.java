package defpackage;

import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rhj {
    public static final String a = nga.e("WorkerWrapper");

    public static final Object a(saa saaVar, zaa zaaVar, xzg xzgVar) {
        Object obj;
        try {
            int i = 0;
            if (!saaVar.isDone()) {
                ua2 ua2Var = new ua2(1, zni.I(xzgVar));
                ua2Var.t();
                saaVar.a(new orh(saaVar, ua2Var, i), x46.E);
                ua2Var.w(new zkd(zaaVar, 21, saaVar));
                return ua2Var.r();
            }
            while (true) {
                try {
                    obj = saaVar.get();
                    break;
                } catch (InterruptedException unused) {
                    i = 1;
                } catch (Throwable th) {
                    if (i != 0) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (i != 0) {
                Thread.currentThread().interrupt();
            }
            return obj;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            cause.getClass();
            throw cause;
        }
    }
}
