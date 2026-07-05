package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class f98 extends xzg implements rz7 {
    public /* synthetic */ Throwable E;

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        f98 f98Var = new f98(3, (tp4) obj3);
        f98Var.E = (Throwable) obj2;
        iei ieiVar = iei.a;
        f98Var.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th = this.E;
        sf5.h0(obj);
        if (th instanceof TimeoutCancellationException) {
            return iei.a;
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
    }
}
