package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ng0 {
    public static final int E;
    public static final ip0 F;
    public static final Object G;

    static {
        new ArrayDeque();
        E = -100;
        F = new ip0(0);
        G = new Object();
    }

    public static void c(ah0 ah0Var) {
        synchronized (G) {
            try {
                ip0 ip0Var = F;
                ip0Var.getClass();
                hp0 hp0Var = new hp0(ip0Var);
                while (hp0Var.hasNext()) {
                    ng0 ng0Var = (ng0) ((WeakReference) hp0Var.next()).get();
                    if (ng0Var == ah0Var || ng0Var == null) {
                        hp0Var.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b();

    public abstract boolean d(int i);
}
