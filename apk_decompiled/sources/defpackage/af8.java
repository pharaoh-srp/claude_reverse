package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public abstract class af8 {
    public static final /* synthetic */ int a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object hreVar;
        try {
            hreVar = new ye8(b(Looper.getMainLooper()));
        } catch (Throwable th) {
            hreVar = new hre(th);
        }
        if (hreVar instanceof hre) {
            hreVar = null;
        }
    }

    public static final void a(ua2 ua2Var) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            choreographer2.getClass();
            choreographer = choreographer2;
        }
        choreographer2.postFrameCallback(new ze8(ua2Var));
    }

    public static final Handler b(Looper looper) throws IllegalAccessException, InvocationTargetException {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        objInvoke.getClass();
        return (Handler) objInvoke;
    }

    public static final Object c(f41 f41Var) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 != null) {
            ua2 ua2Var = new ua2(1, zni.I(f41Var));
            ua2Var.t();
            choreographer2.postFrameCallback(new ze8(ua2Var));
            return ua2Var.r();
        }
        ua2 ua2Var2 = new ua2(1, zni.I(f41Var));
        ua2Var2.t();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            a(ua2Var2);
        } else {
            ft5 ft5Var = g86.a;
            tpa.a.O0(ua2Var2.I, new k51(8, ua2Var2));
        }
        return ua2Var2.r();
    }
}
