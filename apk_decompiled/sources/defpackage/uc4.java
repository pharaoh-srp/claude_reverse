package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class uc4 extends xzg implements rz7 {
    public final /* synthetic */ int E;
    public /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uc4(Object obj, tp4 tp4Var, int i) {
        super(3, tp4Var);
        this.E = i;
        this.F = obj;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                new uc4((z9e) this.F, (tp4) obj3, 0).invokeSuspend(ieiVar);
                break;
            case 1:
                uc4 uc4Var = new uc4(3, (tp4) obj3);
                uc4Var.F = (Throwable) obj2;
                uc4Var.invokeSuspend(ieiVar);
                break;
            default:
                ((Number) obj2).floatValue();
                new uc4((mag) this.F, (tp4) obj3, 2).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                sf5.h0(obj);
                ((z9e) this.F).E = true;
                return ieiVar;
            case 1:
                Throwable th = (Throwable) this.F;
                sf5.h0(obj);
                if (th instanceof TimeoutCancellationException) {
                    return ieiVar;
                }
                zfa.a.getClass();
                if (!yfa.b()) {
                    throw th;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : copyOnWriteArrayList) {
                    ((n30) ((zfa) obj2)).getClass();
                    arrayList.add(obj2);
                }
                if (arrayList.isEmpty()) {
                    throw th;
                }
                String strS = sq6.s(zfa.a, th, "GooglePlaySubscriptionManager: Connection flow error.: ");
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.ERROR, "GooglePlaySubscriptionManager", strS);
                }
                throw th;
            default:
                sf5.h0(obj);
                ((mag) this.F).o.a();
                return ieiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uc4(int i, tp4 tp4Var) {
        super(i, tp4Var);
        this.E = 1;
    }
}
