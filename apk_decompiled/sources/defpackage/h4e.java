package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes.dex */
public final class h4e extends c5h {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4e(ak6 ak6Var, String str) {
        super(str, true);
        this.f = ak6Var;
    }

    @Override // defpackage.c5h
    public final long a() {
        switch (this.e) {
            case 0:
                ak6 ak6Var = (ak6) this.f;
                long jNanoTime = System.nanoTime();
                long j = (jNanoTime - ak6Var.b) + 1;
                Iterator it = ((ConcurrentLinkedQueue) ak6Var.e).iterator();
                it.getClass();
                g4e g4eVar = null;
                long j2 = Long.MAX_VALUE;
                int i = 0;
                g4e g4eVar2 = null;
                g4e g4eVar3 = null;
                int i2 = 0;
                while (it.hasNext()) {
                    g4e g4eVar4 = (g4e) it.next();
                    g4eVar4.getClass();
                    synchronized (g4eVar4) {
                        if (ak6Var.a(g4eVar4, jNanoTime) > 0) {
                            i2++;
                        } else {
                            long j3 = g4eVar4.r;
                            if (j3 < j) {
                                j = j3;
                                g4eVar2 = g4eVar4;
                            }
                            i++;
                            if (j3 < j2) {
                                j2 = j3;
                                g4eVar3 = g4eVar4;
                            }
                        }
                    }
                }
                if (g4eVar2 != null) {
                    g4eVar = g4eVar2;
                } else if (i > 5) {
                    j = j2;
                    g4eVar = g4eVar3;
                } else {
                    j = -1;
                }
                if (g4eVar == null) {
                    if (g4eVar3 != null) {
                        return (j2 + ak6Var.b) - jNanoTime;
                    }
                    if (i2 > 0) {
                        return ak6Var.b;
                    }
                    return -1L;
                }
                synchronized (g4eVar) {
                    if (g4eVar.q.isEmpty() && g4eVar.r == j) {
                        g4eVar.k = true;
                        ((ConcurrentLinkedQueue) ak6Var.e).remove(g4eVar);
                        blj.d(g4eVar.e);
                        if (!((ConcurrentLinkedQueue) ak6Var.e).isEmpty()) {
                            return 0L;
                        }
                        m7h m7hVar = (m7h) ak6Var.c;
                        synchronized (m7hVar.a) {
                            if (m7hVar.a()) {
                                m7hVar.a.c(m7hVar);
                            }
                            break;
                        }
                        return 0L;
                    }
                    return 0L;
                }
            default:
                ((zy7) this.f).a();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4e(zy7 zy7Var, String str, boolean z) {
        super(str, z);
        this.f = zy7Var;
    }
}
