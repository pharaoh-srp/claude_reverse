package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class r1 {
    public static /* synthetic */ boolean a(Unsafe unsafe, w1 w1Var, long j, k1 k1Var, k1 k1Var2) {
        while (!unsafe.compareAndSwapObject(w1Var, j, k1Var, k1Var2)) {
            if (unsafe.getObject(w1Var, j) != k1Var) {
                return false;
            }
        }
        return true;
    }
}
