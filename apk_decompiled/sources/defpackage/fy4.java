package defpackage;

import com.anthropic.claude.conway.f;
import com.anthropic.claude.conway.protocol.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class fy4 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ b0 H;
    public final /* synthetic */ f I;
    public final /* synthetic */ int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fy4(b0 b0Var, f fVar, int i, tp4 tp4Var, int i2) {
        super(2, tp4Var);
        this.E = i2;
        this.H = b0Var;
        this.I = fVar;
        this.J = i;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                fy4 fy4Var = new fy4(this.H, this.I, this.J, tp4Var, 0);
                fy4Var.G = obj;
                return fy4Var;
            default:
                fy4 fy4Var2 = new fy4(this.H, this.I, this.J, tp4Var, 1);
                fy4Var2.G = obj;
                return fy4Var2;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((fy4) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.E;
        sfa sfaVar = sfa.WARN;
        ks4 ks4Var = ks4.a;
        int i2 = this.J;
        b0 b0Var = this.H;
        m45 m45Var = m45.E;
        f fVar = this.I;
        iei ieiVar = iei.a;
        int i3 = 0;
        tp4 tp4Var = null;
        switch (i) {
            case 0:
                l45 l45Var = (l45) this.G;
                int i4 = this.F;
                try {
                    if (i4 == 0) {
                        sf5.h0(obj);
                        this.G = l45Var;
                        this.F = 1;
                        obj = gb9.c0(b0Var.d.b(), new mz4(b0Var, tp4Var, i3), this);
                        if (obj == m45Var) {
                            return m45Var;
                        }
                    } else {
                        if (i4 != 1) {
                            sz6.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        sf5.h0(obj);
                    }
                    List list = (List) obj;
                    fd9.S(l45Var);
                    AtomicInteger atomicInteger = fVar.B0;
                    amg amgVar = fVar.e0;
                    int i5 = atomicInteger.get();
                    sfa sfaVar2 = sfa.DEBUG;
                    if (i5 != i2) {
                        zfa.a.getClass();
                        if (yfa.b()) {
                            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : copyOnWriteArrayList) {
                                ((n30) ((zfa) obj2)).getClass();
                                arrayList.add(obj2);
                            }
                            if (!arrayList.isEmpty()) {
                                zfa.a.getClass();
                                String str = "Resync fetch raced (gen " + i2 + " stale); dropping";
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    ((n30) ((zfa) it.next())).b(sfaVar2, "Conway", str);
                                }
                            }
                        }
                    } else {
                        fVar.h0(list);
                        if (amgVar.getValue() instanceof gs4) {
                            amgVar.getClass();
                            amgVar.n(null, ks4Var);
                        }
                        zfa.a.getClass();
                        if (yfa.b()) {
                            CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : copyOnWriteArrayList2) {
                                ((n30) ((zfa) obj3)).getClass();
                                arrayList2.add(obj3);
                            }
                            if (!arrayList2.isEmpty()) {
                                zfa.a.getClass();
                                String str2 = "Resync fetch: " + fVar.r0.size() + " entries, loading=" + fVar.t0;
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    ((n30) ((zfa) it2.next())).b(sfaVar2, "Conway", str2);
                                }
                            }
                        }
                        fVar.C0(false);
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    zfa.a.getClass();
                    if (yfa.b()) {
                        CopyOnWriteArrayList copyOnWriteArrayList3 = yfa.b;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj4 : copyOnWriteArrayList3) {
                            ((n30) ((zfa) obj4)).getClass();
                            arrayList3.add(obj4);
                        }
                        if (!arrayList3.isEmpty()) {
                            String strQ = sq6.q(zfa.a, e2, "Resync fetch failed: ");
                            Iterator it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                                ((n30) ((zfa) it3.next())).b(sfaVar, "Conway", strQ);
                            }
                        }
                    }
                    if (fVar.e0.getValue() instanceof gs4) {
                        amg amgVar2 = fVar.e0;
                        amgVar2.getClass();
                        amgVar2.n(null, ks4Var);
                    }
                    fVar.C0(false);
                }
                return ieiVar;
            default:
                l45 l45Var2 = (l45) this.G;
                int i6 = this.F;
                try {
                    if (i6 == 0) {
                        sf5.h0(obj);
                        this.G = l45Var2;
                        this.F = 1;
                        obj = gb9.c0(b0Var.d.b(), new mz4(b0Var, tp4Var, i3), this);
                        if (obj == m45Var) {
                            return m45Var;
                        }
                    } else {
                        if (i6 != 1) {
                            sz6.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        sf5.h0(obj);
                    }
                    List list2 = (List) obj;
                    fd9.S(l45Var2);
                    AtomicInteger atomicInteger2 = fVar.B0;
                    amg amgVar3 = fVar.e0;
                    if (atomicInteger2.get() == i2) {
                        fVar.h0(list2);
                        if (amgVar3.getValue() instanceof gs4) {
                            amgVar3.getClass();
                            amgVar3.n(null, ks4Var);
                        }
                        fVar.C0(false);
                        break;
                    }
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Exception e4) {
                    zfa.a.getClass();
                    if (yfa.b()) {
                        CopyOnWriteArrayList copyOnWriteArrayList4 = yfa.b;
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj5 : copyOnWriteArrayList4) {
                            ((n30) ((zfa) obj5)).getClass();
                            arrayList4.add(obj5);
                        }
                        if (!arrayList4.isEmpty()) {
                            String strQ2 = sq6.q(zfa.a, e4, "Empty-payload refetch failed: ");
                            Iterator it4 = arrayList4.iterator();
                            while (it4.hasNext()) {
                                ((n30) ((zfa) it4.next())).b(sfaVar, "Conway", strQ2);
                            }
                        }
                    }
                }
                return ieiVar;
        }
    }
}
