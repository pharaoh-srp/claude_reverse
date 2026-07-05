package com.anthropic.claude.tool.custom;

import com.anthropic.claude.tool.custom.PhoneCallMonitorEvent;
import com.anthropic.claude.tool.model.PhoneCallCompletedOutputTranscriptItemSpeaker;
import defpackage.a1d;
import defpackage.b1d;
import defpackage.gsk;
import defpackage.ih9;
import defpackage.kdg;
import defpackage.kwb;
import defpackage.n30;
import defpackage.oq5;
import defpackage.p5e;
import defpackage.pqe;
import defpackage.q0d;
import defpackage.r0d;
import defpackage.rcg;
import defpackage.rkk;
import defpackage.sfa;
import defpackage.sq6;
import defpackage.sz6;
import defpackage.t0d;
import defpackage.u0d;
import defpackage.v0d;
import defpackage.vb7;
import defpackage.w0d;
import defpackage.wg6;
import defpackage.x0d;
import defpackage.x44;
import defpackage.y0d;
import defpackage.y6j;
import defpackage.ycg;
import defpackage.yfa;
import defpackage.z0d;
import defpackage.zfa;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends rkk {
    public final /* synthetic */ v0d b;

    public a(v0d v0dVar) {
        this.b = v0dVar;
    }

    @Override // defpackage.rkk
    public final void k(y6j y6jVar, int i, String str) {
        if (this.b.h || y6jVar != this.b.f) {
            return;
        }
        sfa sfaVar = sfa.DEBUG;
        zfa.a.getClass();
        if (yfa.b()) {
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (!arrayList.isEmpty()) {
                zfa.a.getClass();
                String str2 = "Monitor closing: code=" + i + " reason=" + str;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfaVar, "PhoneCallMonitor", str2);
                }
            }
        }
        v0d.b(this.b, (i == 1000 || i == 1001) ? w0d.a : i != 4403 ? i != 4404 ? i != 4500 ? i != 4502 ? new a1d(i) : x0d.a : b1d.a : y0d.a : z0d.a);
        ((p5e) y6jVar).a();
    }

    @Override // defpackage.rkk
    public final void l(y6j y6jVar, Exception exc, pqe pqeVar) {
        y6jVar.getClass();
        if (this.b.h || y6jVar != this.b.f) {
            return;
        }
        int i = pqeVar != null ? pqeVar.H : 0;
        sfa sfaVar = sfa.DEBUG;
        zfa.a.getClass();
        if (yfa.b()) {
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (!arrayList.isEmpty()) {
                zfa.a.getClass();
                String strK = vb7.k(i, "Monitor failed: code=", " ", gsk.c(exc));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfaVar, "PhoneCallMonitor", strK);
                }
            }
        }
        v0d.b(this.b, new a1d(i));
    }

    @Override // defpackage.rkk
    public final void m(y6j y6jVar, String str) {
        kwb kwbVarC;
        rcg rcgVarJ;
        int i;
        if (this.b.h || y6jVar != this.b.f) {
            return;
        }
        if (x44.r((t0d) this.b.c.getValue(), r0d.a)) {
            v0d v0dVar = this.b;
            rcg rcgVarJ2 = ycg.j();
            kwb kwbVar = rcgVarJ2 instanceof kwb ? (kwb) rcgVarJ2 : null;
            if (kwbVar == null || (kwbVarC = kwbVar.C(null, null)) == null) {
                sz6.j("Cannot create a mutable snapshot of an read-only snapshot");
                return;
            }
            try {
                rcgVarJ = kwbVarC.j();
                try {
                    v0dVar.c.setValue(q0d.a);
                    kwbVarC.w().p();
                } finally {
                }
            } finally {
            }
        }
        try {
            ih9 ih9Var = this.b.i;
            ih9Var.getClass();
            PhoneCallMonitorEvent phoneCallMonitorEvent = (PhoneCallMonitorEvent) ih9Var.b(str, PhoneCallMonitorEvent.Companion.serializer());
            if (phoneCallMonitorEvent instanceof PhoneCallMonitorEvent.UserTranscript) {
                v0d.a(this.b, PhoneCallCompletedOutputTranscriptItemSpeaker.CALLEE, ((PhoneCallMonitorEvent.UserTranscript) phoneCallMonitorEvent).getEvent().getText());
                return;
            }
            if (phoneCallMonitorEvent instanceof PhoneCallMonitorEvent.AgentResponse) {
                v0d.a(this.b, PhoneCallCompletedOutputTranscriptItemSpeaker.AGENT, ((PhoneCallMonitorEvent.AgentResponse) phoneCallMonitorEvent).getEvent().getText());
                return;
            }
            if (!(phoneCallMonitorEvent instanceof PhoneCallMonitorEvent.AgentResponseCorrection)) {
                if (!x44.r(phoneCallMonitorEvent, PhoneCallMonitorEvent.CallEndedProcessing.INSTANCE)) {
                    if (x44.r(phoneCallMonitorEvent, PhoneCallMonitorEvent.Meta.INSTANCE) || x44.r(phoneCallMonitorEvent, PhoneCallMonitorEvent.Unknown.INSTANCE)) {
                        return;
                    }
                    wg6.i();
                    return;
                }
                v0d v0dVar2 = this.b;
                rcg rcgVarJ3 = ycg.j();
                kwb kwbVar2 = rcgVarJ3 instanceof kwb ? (kwb) rcgVarJ3 : null;
                if (kwbVar2 == null || (kwbVarC = kwbVar2.C(null, null)) == null) {
                    sz6.j("Cannot create a mutable snapshot of an read-only snapshot");
                    return;
                }
                try {
                    rcgVarJ = kwbVarC.j();
                    try {
                        v0dVar2.d.setValue(Boolean.TRUE);
                        kwbVarC.w().p();
                        return;
                    } finally {
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            v0d v0dVar3 = this.b;
            rcg rcgVarJ4 = ycg.j();
            kwb kwbVar3 = rcgVarJ4 instanceof kwb ? (kwb) rcgVarJ4 : null;
            if (kwbVar3 == null || (kwbVarC = kwbVar3.C(null, null)) == null) {
                sz6.j("Cannot create a mutable snapshot of an read-only snapshot");
                return;
            }
            try {
                rcgVarJ = kwbVarC.j();
                try {
                    kdg kdgVar = v0dVar3.e;
                    int size = kdgVar.size() - 1;
                    int iE = oq5.E(kdgVar);
                    while (true) {
                        if (!(size >= 0)) {
                            i = -1;
                            break;
                        }
                        if (oq5.E(kdgVar) != iE) {
                            throw new ConcurrentModificationException();
                        }
                        oq5.o(size, kdgVar.size());
                        Object obj = kdgVar.get(size);
                        size--;
                        if (((u0d) obj).b == PhoneCallCompletedOutputTranscriptItemSpeaker.AGENT) {
                            i = size + 1;
                            break;
                        }
                    }
                    kdg kdgVar2 = v0dVar3.e;
                    if (i >= 0) {
                        u0d u0dVar = (u0d) kdgVar2.get(i);
                        String corrected = ((PhoneCallMonitorEvent.AgentResponseCorrection) phoneCallMonitorEvent).getCorrected();
                        int i2 = u0dVar.a;
                        PhoneCallCompletedOutputTranscriptItemSpeaker phoneCallCompletedOutputTranscriptItemSpeaker = u0dVar.b;
                        phoneCallCompletedOutputTranscriptItemSpeaker.getClass();
                        corrected.getClass();
                        kdgVar2.set(i, new u0d(i2, phoneCallCompletedOutputTranscriptItemSpeaker, corrected));
                    } else {
                        int i3 = v0dVar3.g;
                        v0dVar3.g = i3 + 1;
                        kdgVar2.add(new u0d(i3, PhoneCallCompletedOutputTranscriptItemSpeaker.AGENT, ((PhoneCallMonitorEvent.AgentResponseCorrection) phoneCallMonitorEvent).getCorrected()));
                    }
                    kwbVarC.w().p();
                } catch (Throwable th) {
                    throw th;
                }
            } finally {
            }
        } catch (Exception e) {
            sfa sfaVar = sfa.WARN;
            zfa.a.getClass();
            if (yfa.b()) {
                CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : copyOnWriteArrayList) {
                    ((n30) ((zfa) obj2)).getClass();
                    arrayList.add(obj2);
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                String strQ = sq6.q(zfa.a, e, "Failed to decode monitor frame: ");
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfaVar, "PhoneCallMonitor", strQ);
                }
            }
        }
    }
}
