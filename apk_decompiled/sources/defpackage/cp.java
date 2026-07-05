package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class cp extends xzg implements rz7 {
    public final /* synthetic */ int E;
    public /* synthetic */ lp7 F;
    public /* synthetic */ Throwable G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cp(int i, tp4 tp4Var, int i2) {
        super(i, tp4Var);
        this.E = i2;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = 3;
        lp7 lp7Var = (lp7) obj;
        Throwable th = (Throwable) obj2;
        tp4 tp4Var = (tp4) obj3;
        switch (i) {
            case 0:
                cp cpVar = new cp(i2, tp4Var, 0);
                cpVar.F = lp7Var;
                cpVar.G = th;
                cpVar.invokeSuspend(ieiVar);
                break;
            default:
                cp cpVar2 = new cp(i2, tp4Var, 1);
                cpVar2.F = lp7Var;
                cpVar2.G = th;
                cpVar2.invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.E;
        iei ieiVar = iei.a;
        sfa sfaVar = sfa.WARN;
        switch (i) {
            case 0:
                lp7 lp7Var = this.F;
                Throwable th = this.G;
                sf5.h0(obj);
                if (th instanceof CancellationException) {
                    throw th;
                }
                zfa.a.getClass();
                if (yfa.b()) {
                    String strE = iuj.E(lp7Var);
                    CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : copyOnWriteArrayList) {
                        ((n30) ((zfa) obj2)).getClass();
                        arrayList.add(obj2);
                    }
                    if (!arrayList.isEmpty()) {
                        String strS = sq6.s(zfa.a, th, "tasks sessions/watch failed: ");
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((n30) ((zfa) it.next())).b(sfaVar, strE, strS);
                        }
                    }
                }
                return ieiVar;
            default:
                lp7 lp7Var2 = this.F;
                Throwable th2 = this.G;
                sf5.h0(obj);
                if (th2 instanceof CancellationException) {
                    throw th2;
                }
                zfa.a.getClass();
                if (yfa.b()) {
                    String strE2 = iuj.E(lp7Var2);
                    CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : copyOnWriteArrayList2) {
                        ((n30) ((zfa) obj3)).getClass();
                        arrayList2.add(obj3);
                    }
                    if (!arrayList2.isEmpty()) {
                        String strS2 = sq6.s(zfa.a, th2, "sessions/watch failed: ");
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            ((n30) ((zfa) it2.next())).b(sfaVar, strE2, strS2);
                        }
                    }
                }
                return ieiVar;
        }
    }
}
