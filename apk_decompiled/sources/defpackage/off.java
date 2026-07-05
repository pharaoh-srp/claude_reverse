package defpackage;

import com.segment.analytics.kotlin.core.BaseEvent;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class off extends pd implements pz7, uzg {
    public final /* synthetic */ int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ off(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.L = i3;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.L;
        iei ieiVar = iei.a;
        Object obj3 = this.E;
        switch (i) {
            case 0:
                a1h a1hVar = (a1h) obj;
                pff pffVar = (pff) obj3;
                pffVar.getClass();
                a1hVar.getClass();
                boolean z = a1hVar.e;
                h07 h07Var = pffVar.H;
                if (!z) {
                    if (h07Var != null) {
                        h07Var.b();
                    }
                } else if (h07Var != null) {
                    gx gxVar = h07Var.a;
                    if (!h07Var.h) {
                        h07Var.h = true;
                        tp4 tp4Var = null;
                        if (h07Var.e.E() || h07Var.e.a()) {
                            h07Var.e = wd6.P(Integer.MAX_VALUE, 6, null);
                            h07Var.f = wd6.P(Integer.MAX_VALUE, 6, null);
                        }
                        Iterator it = h07Var.c.iterator();
                        while (it.hasNext()) {
                            ((sr7) it.next()).b(gxVar);
                        }
                        el5 el5Var = gxVar.F;
                        gb9.D((mp4) el5Var.I, (e45) el5Var.H, null, new g07(h07Var, null), 2);
                        gb9.D((mp4) gxVar.F.I, (e45) gxVar.F.G, null, new zw(h07Var, tp4Var, 11), 2);
                    }
                }
                break;
            default:
                a1h a1hVar2 = (a1h) obj;
                tlg tlgVar = (tlg) obj3;
                yb5.z(tlgVar.e(), "Analytics starting = " + a1hVar2.c);
                AtomicBoolean atomicBoolean = tlgVar.F;
                atomicBoolean.set(a1hVar2.c);
                if (atomicBoolean.get()) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = tlgVar.G;
                    while (!concurrentLinkedQueue.isEmpty()) {
                        BaseEvent baseEvent = (BaseEvent) concurrentLinkedQueue.poll();
                        if (baseEvent != null) {
                            tlgVar.e().c(baseEvent, baseEvent.getEnrichment());
                        }
                    }
                }
                break;
        }
        return ieiVar;
    }
}
