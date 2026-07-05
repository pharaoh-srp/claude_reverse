package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class s1 {
    public static /* synthetic */ boolean a(Unsafe unsafe, w1 w1Var, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(w1Var, j, obj, obj2)) {
            if (unsafe.getObject(w1Var, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
