package com.anthropic.claude.app;

import com.anthropic.claude.app.ClaudeAppDestination;
import com.anthropic.claude.sessions.types.SessionResource;
import com.anthropic.claude.types.strings.SessionId;
import defpackage.bz7;
import defpackage.c8a;
import defpackage.fm;
import defpackage.gb9;
import defpackage.iei;
import defpackage.kdg;
import defpackage.n30;
import defpackage.pj3;
import defpackage.qj3;
import defpackage.qzb;
import defpackage.sfa;
import defpackage.sl;
import defpackage.vm;
import defpackage.yfa;
import defpackage.zfa;
import defpackage.zqc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements bz7 {
    public final /* synthetic */ qzb E;
    public final /* synthetic */ zqc F;
    public final /* synthetic */ sl G;

    public k0(qzb qzbVar, zqc zqcVar, sl slVar) {
        this.E = qzbVar;
        this.F = zqcVar;
        this.G = slVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        c8a c8aVar;
        SessionId sessionId = (SessionId) obj;
        String strM1120unboximpl = sessionId != null ? sessionId.m1120unboximpl() : null;
        if (this.E.a()) {
            if (strM1120unboximpl != null) {
                vm vmVar = (vm) this.G;
                vmVar.getClass();
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
                        String strConcat = " requestSession ".concat(strM1120unboximpl);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((n30) ((zfa) it.next())).b(sfa.DEBUG, "AgentChat", strConcat);
                        }
                    }
                }
                SessionResource sessionResourceD = vmVar.d();
                String strM875getIdOcx55TE = sessionResourceD != null ? sessionResourceD.m875getIdOcx55TE() : null;
                if (!(strM875getIdOcx55TE == null ? false : SessionId.m1117equalsimpl0(strM875getIdOcx55TE, strM1120unboximpl))) {
                    kdg kdgVar = vmVar.r;
                    if (kdgVar != null && kdgVar.isEmpty()) {
                        vmVar.q = strM1120unboximpl;
                        break;
                    }
                    ListIterator listIterator = kdgVar.listIterator();
                    do {
                        c8aVar = (c8a) listIterator;
                        if (!c8aVar.hasNext()) {
                            vmVar.q = strM1120unboximpl;
                            break;
                        }
                    } while (!SessionId.m1117equalsimpl0(((SessionResource) c8aVar.next()).m875getIdOcx55TE(), strM1120unboximpl));
                    gb9.D(vmVar.k, null, null, new fm(vmVar, strM1120unboximpl, null, 1), 3);
                }
            }
            ClaudeAppDestination.List.AgentChat agentChat = ClaudeAppDestination.List.AgentChat.INSTANCE;
            pj3 pj3Var = pj3.V;
            zqc zqcVar = this.F;
            zqcVar.E.m(new qj3(agentChat, zqcVar, 10), pj3Var);
        }
        return iei.a;
    }
}
