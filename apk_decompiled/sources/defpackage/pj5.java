package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes3.dex */
public final class pj5 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ Lock G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pj5(Lock lock, int i) {
        super(0);
        this.F = i;
        this.G = lock;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        Lock lock = this.G;
        switch (i) {
            case 0:
                return "Couldn't acquire " + lock.getClass().getSimpleName() + " due to timeout (1 " + TimeUnit.SECONDS + "), aborting operation.";
            case 1:
                return ij0.j("Couldn't acquire ", lock.getClass().getSimpleName(), " due to the exception thrown, aborting operation.");
            default:
                return ij0.j("Couldn't acquire ", lock.getClass().getSimpleName(), " lock due to the exception thrown, aborting operation.");
        }
    }
}
