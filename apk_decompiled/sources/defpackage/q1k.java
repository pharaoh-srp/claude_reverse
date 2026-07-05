package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class q1k {
    public static /* synthetic */ boolean a(Unsafe unsafe, j1k j1kVar, long j, Object obj, Object obj2) {
        while (!n1k.a(unsafe, j1kVar, j, obj, obj2)) {
            if (unsafe.getObject(j1kVar, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
