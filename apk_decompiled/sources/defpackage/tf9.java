package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tf9 extends m08 implements rz7 {
    public static final tf9 E = new tf9(3, vf9.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        vf9 vf9Var = (vf9) obj;
        agf agfVar = (agf) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vf9.E;
        while (true) {
            Object objU = vf9Var.U();
            if (!(objU instanceof j09)) {
                if (!(objU instanceof e94)) {
                    objU = wf9.a(objU);
                }
                ((zff) agfVar).I = objU;
            } else if (vf9Var.n0(objU) >= 0) {
                ((zff) agfVar).G = knk.A(vf9Var, new sf9(vf9Var, agfVar));
                break;
            }
        }
        return iei.a;
    }
}
