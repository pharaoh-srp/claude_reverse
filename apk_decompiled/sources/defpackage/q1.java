package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class q1 {
    public static /* synthetic */ boolean a(Unsafe unsafe, w1 w1Var, long j, v1 v1Var, v1 v1Var2) {
        while (!unsafe.compareAndSwapObject(w1Var, j, v1Var, v1Var2)) {
            if (unsafe.getObject(w1Var, j) != v1Var) {
                return false;
            }
        }
        return true;
    }
}
