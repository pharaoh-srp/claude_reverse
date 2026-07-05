package io.sentry.transport;

import defpackage.jke;
import defpackage.lf5;
import defpackage.pga;
import io.sentry.a0;
import io.sentry.a1;
import io.sentry.a5;
import io.sentry.b2;
import io.sentry.b5;
import io.sentry.h5;
import io.sentry.m5;
import io.sentry.n0;
import io.sentry.t5;
import io.sentry.u7;
import io.sentry.w6;
import io.sentry.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class b implements f {
    public final m E;
    public final io.sentry.cache.d F;
    public final w6 G;
    public final lf5 H;
    public final g I;
    public final d J;
    public volatile a K;

    public b(w6 w6Var, lf5 lf5Var, g gVar, y yVar) {
        int maxQueueSize = w6Var.getMaxQueueSize();
        io.sentry.cache.d envelopeDiskCache = w6Var.getEnvelopeDiskCache();
        a1 logger = w6Var.getLogger();
        b5 dateProvider = w6Var.getDateProvider();
        m mVar = new m(maxQueueSize, new m5(1), new pga(envelopeDiskCache, logger), logger, dateProvider);
        d dVar = new d(w6Var, yVar, lf5Var);
        this.K = null;
        this.E = mVar;
        io.sentry.cache.d envelopeDiskCache2 = w6Var.getEnvelopeDiskCache();
        io.sentry.p.v("envelopeCache is required", envelopeDiskCache2);
        this.F = envelopeDiskCache2;
        this.G = w6Var;
        this.H = lf5Var;
        io.sentry.p.v("transportGate is required", gVar);
        this.I = gVar;
        this.J = dVar;
    }

    @Override // io.sentry.transport.f
    public final void a(boolean z) {
        this.H.close();
        this.E.shutdown();
        this.G.getLogger().h(t5.DEBUG, "Shutting down", new Object[0]);
        if (z) {
            return;
        }
        try {
            long flushTimeoutMillis = this.G.getFlushTimeoutMillis();
            if (this.E.awaitTermination(flushTimeoutMillis, TimeUnit.MILLISECONDS)) {
                return;
            }
            this.G.getLogger().h(t5.WARNING, "Failed to shutdown the async connection async sender  within " + flushTimeoutMillis + " ms. Trying to force it now.", new Object[0]);
            this.E.shutdownNow();
            if (this.K != null) {
                this.E.getRejectedExecutionHandler().rejectedExecution(this.K, this.E);
            }
        } catch (InterruptedException unused) {
            this.G.getLogger().h(t5.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    @Override // io.sentry.transport.f
    public final void b(long j) {
        m mVar = this.E;
        mVar.getClass();
        try {
            ((o) mVar.I.E).tryAcquireSharedNanos(1, TimeUnit.MILLISECONDS.toNanos(j));
        } catch (InterruptedException e) {
            mVar.G.d(t5.ERROR, "Failed to wait till idle", e);
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(false);
    }

    @Override // io.sentry.transport.f
    public final lf5 g() {
        return this.H;
    }

    @Override // io.sentry.transport.f
    public final boolean h() {
        boolean z;
        lf5 lf5Var = this.H;
        lf5Var.getClass();
        ((c) lf5Var.F).getClass();
        Date date = new Date(System.currentTimeMillis());
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) lf5Var.H;
        Iterator it = concurrentHashMap.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Date date2 = (Date) concurrentHashMap.get((io.sentry.o) it.next());
            if (date2 != null && !date.after(date2)) {
                z = true;
                break;
            }
        }
        m mVar = this.E;
        a5 a5Var = mVar.F;
        return (z || (a5Var != null && (mVar.H.c().b(a5Var) > 2000000000L ? 1 : (mVar.H.c().b(a5Var) == 2000000000L ? 0 : -1)) < 0)) ? false : true;
    }

    @Override // io.sentry.transport.f
    public final void m0(io.sentry.internal.debugmeta.c cVar, n0 n0Var) {
        io.sentry.cache.d dVar;
        boolean z;
        io.sentry.internal.debugmeta.c cVarM;
        List listSingletonList;
        boolean zE = io.sentry.util.c.e(n0Var, io.sentry.hints.d.class);
        w6 w6Var = this.G;
        io.sentry.cache.d dVar2 = this.F;
        if (zE) {
            w6Var.getLogger().h(t5.DEBUG, "Captured Envelope is already cached", new Object[0]);
            dVar = h.E;
            z = true;
        } else {
            dVar = dVar2;
            z = false;
        }
        lf5 lf5Var = this.H;
        w6 w6Var2 = (w6) lf5Var.G;
        Iterator it = cVar.g().iterator();
        ArrayList arrayList = null;
        while (true) {
            if (!it.hasNext()) {
                if (arrayList != null) {
                    w6Var2.getLogger().h(t5.WARNING, "%d envelope items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
                    ArrayList arrayList2 = new ArrayList();
                    for (h5 h5Var : cVar.g()) {
                        if (!arrayList.contains(h5Var)) {
                            arrayList2.add(h5Var);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        w6Var2.getLogger().h(t5.WARNING, "Envelope discarded due all items rate limited.", new Object[0]);
                        io.sentry.util.c.i(n0Var, io.sentry.hints.k.class, new b2(10));
                        io.sentry.util.c.i(n0Var, io.sentry.hints.h.class, new b2(11));
                        io.sentry.util.c.i(n0Var, io.sentry.hints.c.class, new jke(23, lf5Var));
                        cVarM = null;
                    } else {
                        cVarM = new io.sentry.internal.debugmeta.c(cVar.e(), arrayList2);
                    }
                } else {
                    cVarM = cVar;
                }
                if (cVarM == null) {
                    if (z) {
                        dVar2.r0(cVar);
                        return;
                    }
                    return;
                }
                if (io.sentry.util.c.e(n0Var, u7.class)) {
                    cVarM = w6Var.getClientReportRecorder().m(cVarM);
                }
                Future futureSubmit = this.E.submit(new a(this, cVarM, n0Var, dVar));
                if (futureSubmit == null || !futureSubmit.isCancelled()) {
                    io.sentry.util.c.i(n0Var, a0.class, new jke(21, this));
                    return;
                } else {
                    w6Var.getClientReportRecorder().e(io.sentry.clientreport.d.QUEUE_OVERFLOW, cVarM);
                    return;
                }
            }
            h5 h5Var2 = (h5) it.next();
            String itemType = h5Var2.m().I.getItemType();
            itemType.getClass();
            switch (itemType) {
                case "attachment":
                    listSingletonList = Collections.singletonList(io.sentry.o.Attachment);
                    break;
                case "replay_video":
                    listSingletonList = Collections.singletonList(io.sentry.o.Replay);
                    break;
                case "profile_chunk":
                    listSingletonList = Arrays.asList(io.sentry.o.ProfileChunkUi, io.sentry.o.ProfileChunk);
                    break;
                case "profile":
                    listSingletonList = Collections.singletonList(io.sentry.o.Profile);
                    break;
                case "feedback":
                    listSingletonList = Collections.singletonList(io.sentry.o.Feedback);
                    break;
                case "log":
                    listSingletonList = Collections.singletonList(io.sentry.o.LogItem);
                    break;
                case "span":
                    listSingletonList = Collections.singletonList(io.sentry.o.Span);
                    break;
                case "event":
                    listSingletonList = Collections.singletonList(io.sentry.o.Error);
                    break;
                case "trace_metric":
                    listSingletonList = Collections.singletonList(io.sentry.o.TraceMetric);
                    break;
                case "check_in":
                    listSingletonList = Collections.singletonList(io.sentry.o.Monitor);
                    break;
                case "session":
                    listSingletonList = Collections.singletonList(io.sentry.o.Session);
                    break;
                case "transaction":
                    listSingletonList = Collections.singletonList(io.sentry.o.Transaction);
                    break;
                default:
                    listSingletonList = Collections.singletonList(io.sentry.o.Unknown);
                    break;
            }
            Iterator it2 = listSingletonList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (lf5Var.d((io.sentry.o) it2.next())) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(h5Var2);
                    w6Var2.getClientReportRecorder().j(io.sentry.clientreport.d.RATELIMIT_BACKOFF, h5Var2);
                }
            }
        }
    }
}
