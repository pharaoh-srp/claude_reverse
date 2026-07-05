package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wy1 extends m08 implements rz7 {
    public static final wy1 E = new wy1(3, zy1.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        zy1 zy1Var = (zy1) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = zy1.F;
        zy1Var.getClass();
        if (obj3 == bz1.l) {
            obj3 = new yh2(zy1Var.v());
        }
        return new ai2(obj3);
    }
}
