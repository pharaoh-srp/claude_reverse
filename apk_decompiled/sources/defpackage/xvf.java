package defpackage;

import com.anthropic.claude.sessions.api.SessionWebSocketClosedException;
import com.anthropic.claude.sessions.types.SdkEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class xvf extends rkk {
    public final bg9 b;
    public final zy1 c;
    public final zy7 d;
    public final zy7 e;
    public p5e f;
    public volatile boolean g;

    public xvf(bg9 bg9Var, zy1 zy1Var, zy7 zy7Var, zy7 zy7Var2) {
        bg9Var.getClass();
        this.b = bg9Var;
        this.c = zy1Var;
        this.d = zy7Var;
        this.e = zy7Var2;
    }

    @Override // defpackage.rkk
    public final void j(y6j y6jVar, int i, String str) {
        y6jVar.getClass();
        str.getClass();
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
                String str2 = "WS onClosed: code=" + i + " reason='" + str + "'";
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.DEBUG, "AgentChat", str2);
                }
            }
        }
        ((p5e) y6jVar).a();
        this.e.a();
        this.c.i(i == 1000 ? null : new SessionWebSocketClosedException(i, str), false);
    }

    @Override // defpackage.rkk
    public final void k(y6j y6jVar, int i, String str) {
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
                String str2 = "WS onClosing: code=" + i + " reason='" + str + "'";
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.DEBUG, "AgentChat", str2);
                }
            }
        }
        ((p5e) y6jVar).c(i, str);
    }

    @Override // defpackage.rkk
    public final void l(y6j y6jVar, Exception exc, pqe pqeVar) {
        y6jVar.getClass();
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
                Integer numValueOf = pqeVar != null ? Integer.valueOf(pqeVar.H) : null;
                String str = pqeVar != null ? pqeVar.G : null;
                String str2 = "WS onFailure: response=" + numValueOf + " " + str + ": " + gsk.c(exc);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.WARN, "AgentChat", str2);
                }
            }
        }
        this.e.a();
        this.c.i(exc, false);
    }

    @Override // defpackage.rkk
    public final void m(y6j y6jVar, String str) {
        try {
            bg9 bg9Var = this.b;
            bg9Var.getClass();
            iik.i(this.c, (SdkEvent) bg9Var.b(str, SdkEvent.Companion.serializer()));
        } catch (Exception e) {
            zfa.a.getClass();
            if (yfa.b()) {
                CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj : copyOnWriteArrayList) {
                    ((n30) ((zfa) obj)).getClass();
                    arrayList.add(obj);
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                zfa.a.getClass();
                String strK = ij0.k("WS parse error on: ", bsg.j1(200, str), ": ", gsk.c(e));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.ERROR, "AgentChat", strK);
                }
            }
        }
    }

    @Override // defpackage.rkk
    public final void o(y6j y6jVar, pqe pqeVar) {
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
                String str = "WS onOpen: protocol=" + pqeVar.F + " code=" + pqeVar.H;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfaVar, "AgentChat", str);
                }
            }
        }
        this.g = true;
        this.d.a();
    }

    public final void q() {
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
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.DEBUG, "AgentChat", "WS cancel() requested by client");
                }
            }
        }
        p5e p5eVar = this.f;
        if (p5eVar == null) {
            x44.o0("ws");
            throw null;
        }
        p5eVar.a();
    }

    public final void r() {
        if (!this.g) {
            q();
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
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfaVar, "AgentChat", "WS close() requested by client");
                }
            }
        }
        p5e p5eVar = this.f;
        if (p5eVar == null) {
            x44.o0("ws");
            throw null;
        }
        p5eVar.c(1000, "Client disconnect");
    }
}
