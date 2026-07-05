package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public class ifa {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(ifa.class, Object.class, "_cur$volatile");
    public static final /* synthetic */ long b = yf4.a.objectFieldOffset(ifa.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new kfa(8, false);

    public final boolean a(Runnable runnable) {
        ifa ifaVar;
        while (true) {
            a.getClass();
            Unsafe unsafe = yf4.a;
            long j = b;
            kfa kfaVar = (kfa) unsafe.getObjectVolatile(this, j);
            int iA = kfaVar.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                kfa kfaVarD = kfaVar.d();
                while (true) {
                    Unsafe unsafe2 = yf4.a;
                    ifaVar = this;
                    if (!unsafe2.compareAndSwapObject(ifaVar, b, kfaVar, kfaVarD) && unsafe2.getObjectVolatile(ifaVar, j) == kfaVar) {
                        this = ifaVar;
                    }
                }
            } else {
                if (iA == 2) {
                    return false;
                }
                ifaVar = this;
            }
            this = ifaVar;
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            atomicReferenceFieldUpdater.getClass();
            kfa kfaVar = (kfa) yf4.a.getObjectVolatile(this, b);
            if (kfaVar.c()) {
                return;
            } else {
                y6a.u(atomicReferenceFieldUpdater, this, kfaVar, kfaVar.d());
            }
        }
    }

    public final int c() {
        a.getClass();
        kfa kfaVar = (kfa) yf4.a.getObjectVolatile(this, b);
        kfaVar.getClass();
        long j = kfa.f.get(kfaVar);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final Object d() {
        ifa ifaVar;
        while (true) {
            a.getClass();
            Unsafe unsafe = yf4.a;
            long j = b;
            kfa kfaVar = (kfa) unsafe.getObjectVolatile(this, j);
            Object objE = kfaVar.e();
            if (objE != kfa.g) {
                return objE;
            }
            kfa kfaVarD = kfaVar.d();
            while (true) {
                Unsafe unsafe2 = yf4.a;
                ifaVar = this;
                if (!unsafe2.compareAndSwapObject(ifaVar, b, kfaVar, kfaVarD) && unsafe2.getObjectVolatile(ifaVar, j) == kfaVar) {
                    this = ifaVar;
                }
            }
            this = ifaVar;
        }
    }
}
