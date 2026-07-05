package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class q7h {
    public static final Logger k;
    public static final q7h l;
    public final tk5 a;
    public final Logger b;
    public int c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public final ArrayList h;
    public final ArrayList i;
    public final m j;

    static {
        Logger logger = Logger.getLogger(q7h.class.getName());
        logger.getClass();
        k = logger;
        l = new q7h(new tk5(new alj(ij0.m(new StringBuilder(), blj.b, " TaskRunner"), true)));
    }

    public q7h(tk5 tk5Var) {
        Logger logger = k;
        logger.getClass();
        this.a = tk5Var;
        this.b = logger;
        this.c = yr6.INVALID_OWNERSHIP;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new m(6, this);
    }

    public static final void a(q7h q7hVar, c5h c5hVar, long j, boolean z) {
        TimeZone timeZone = blj.a;
        m7h m7hVar = c5hVar.c;
        m7hVar.getClass();
        if (m7hVar.d != c5hVar) {
            sz6.j("Check failed.");
            return;
        }
        boolean z2 = m7hVar.f;
        m7hVar.f = false;
        m7hVar.d = null;
        q7hVar.h.remove(m7hVar);
        if (j != -1 && !z2 && !m7hVar.c) {
            m7hVar.d(c5hVar, j, true);
        }
        if (m7hVar.e.isEmpty()) {
            return;
        }
        q7hVar.i.add(m7hVar);
        if (z) {
            return;
        }
        q7hVar.e();
    }

    public final c5h b() {
        boolean z;
        TimeZone timeZone = blj.a;
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.isEmpty()) {
                break;
            }
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            c5h c5hVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                c5h c5hVar2 = (c5h) ((m7h) it.next()).e.get(0);
                long jMax = Math.max(0L, c5hVar2.d - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (c5hVar != null) {
                        z = true;
                        break;
                    }
                    c5hVar = c5hVar2;
                }
            }
            ArrayList arrayList2 = this.h;
            if (c5hVar != null) {
                TimeZone timeZone2 = blj.a;
                c5hVar.d = -1L;
                m7h m7hVar = c5hVar.c;
                m7hVar.getClass();
                m7hVar.e.remove(c5hVar);
                arrayList.remove(m7hVar);
                m7hVar.d = c5hVar;
                arrayList2.add(m7hVar);
                if (z || (!this.d && !arrayList.isEmpty())) {
                    e();
                }
                return c5hVar;
            }
            if (!this.d) {
                this.d = true;
                this.e = jNanoTime + jMin;
                try {
                    try {
                        TimeZone timeZone3 = blj.a;
                        if (jMin > 0) {
                            long j = jMin / 1000000;
                            long j2 = jMin - (1000000 * j);
                            if (j > 0 || jMin > 0) {
                                wait(j, (int) j2);
                            }
                        }
                    } catch (InterruptedException unused) {
                        TimeZone timeZone4 = blj.a;
                        for (int size = arrayList2.size() - 1; -1 < size; size--) {
                            ((m7h) arrayList2.get(size)).a();
                        }
                        for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                            m7h m7hVar2 = (m7h) arrayList.get(size2);
                            m7hVar2.a();
                            if (m7hVar2.e.isEmpty()) {
                                arrayList.remove(size2);
                            }
                        }
                    }
                } finally {
                    this.d = false;
                }
            } else if (jMin < this.e - jNanoTime) {
                notify();
            }
        }
        return null;
    }

    public final void c(m7h m7hVar) {
        m7hVar.getClass();
        TimeZone timeZone = blj.a;
        if (m7hVar.d == null) {
            boolean zIsEmpty = m7hVar.e.isEmpty();
            ArrayList arrayList = this.i;
            if (zIsEmpty) {
                arrayList.remove(m7hVar);
            } else {
                byte[] bArr = zkj.a;
                arrayList.getClass();
                if (!arrayList.contains(m7hVar)) {
                    arrayList.add(m7hVar);
                }
            }
        }
        if (this.d) {
            notify();
        } else {
            e();
        }
    }

    public final m7h d() {
        int i;
        synchronized (this) {
            i = this.c;
            this.c = i + 1;
        }
        return new m7h(this, grc.p(i, "Q"));
    }

    public final void e() {
        TimeZone timeZone = blj.a;
        int i = this.f;
        if (i > this.g) {
            return;
        }
        this.f = i + 1;
        m mVar = this.j;
        mVar.getClass();
        ((ThreadPoolExecutor) this.a.F).execute(mVar);
    }
}
