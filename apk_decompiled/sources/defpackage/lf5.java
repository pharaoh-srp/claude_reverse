package defpackage;

import io.sentry.o;
import io.sentry.r;
import io.sentry.transport.c;
import io.sentry.transport.n;
import io.sentry.util.a;
import io.sentry.v;
import io.sentry.w6;
import java.io.Closeable;
import java.util.Date;
import java.util.Iterator;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class lf5 implements Closeable {
    public final /* synthetic */ int E;
    public Object F;
    public Object G;
    public Object H;
    public Object I;
    public Object J;
    public Object K;

    public lf5(w6 w6Var) {
        this.E = 1;
        this.H = new ConcurrentHashMap();
        this.I = new CopyOnWriteArrayList();
        this.J = null;
        this.K = new a();
        this.F = c.E;
        this.G = w6Var;
    }

    public void c(o oVar, Date date) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.H;
        Date date2 = (Date) concurrentHashMap.get(oVar);
        if (date2 == null || date.after(date2)) {
            concurrentHashMap.put(oVar, date);
            Iterator it = ((CopyOnWriteArrayList) this.I).iterator();
            while (it.hasNext()) {
                ((n) it.next()).d(this);
            }
            v vVarA = ((a) this.K).a();
            try {
                if (((Timer) this.J) == null) {
                    this.J = new Timer(true);
                }
                ((Timer) this.J).schedule(new r(2, this), date);
                vVarA.close();
            } catch (Throwable th) {
                try {
                    vVarA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.E) {
            case 0:
                ((sze) ((ivd) this.H).get()).close();
                return;
            default:
                v vVarA = ((a) this.K).a();
                try {
                    Timer timer = (Timer) this.J;
                    if (timer != null) {
                        timer.cancel();
                        this.J = null;
                        break;
                    }
                    vVarA.close();
                    ((CopyOnWriteArrayList) this.I).clear();
                    return;
                } catch (Throwable th) {
                    try {
                        vVarA.close();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
        }
    }

    public boolean d(o oVar) {
        Date date;
        ((c) this.F).getClass();
        Date date2 = new Date(System.currentTimeMillis());
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.H;
        Date date3 = (Date) concurrentHashMap.get(o.All);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (o.Unknown.equals(oVar) || (date = (Date) concurrentHashMap.get(oVar)) == null) {
            return false;
        }
        return !date2.after(date);
    }
}
