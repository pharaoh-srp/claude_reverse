package io.sentry;

import android.content.Context;
import defpackage.cbf;
import defpackage.lf5;
import defpackage.lpj;
import defpackage.txd;
import defpackage.u95;
import io.sentry.exception.SentryEnvelopeException;
import java.io.Closeable;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public final class y4 implements k1 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public y4(w6 w6Var) {
        this.d = new x4();
        this.b = w6Var;
        this.a = true;
        t1 transportFactory = w6Var.getTransportFactory();
        if (transportFactory instanceof n3) {
            transportFactory = new v2();
            w6Var.setTransportFactory(transportFactory);
        }
        f0 f0VarRetrieveParsedDsn = w6Var.retrieveParsedDsn();
        String sentryClientName = w6Var.getSentryClientName();
        URI uri = f0VarRetrieveParsedDsn.c;
        String string = uri.resolve(uri.getPath() + "/envelope/").toString();
        String str = f0VarRetrieveParsedDsn.b;
        String str2 = f0VarRetrieveParsedDsn.a;
        StringBuilder sb = new StringBuilder("Sentry sentry_version=7,sentry_client=");
        sb.append(sentryClientName);
        sb.append(",sentry_key=");
        sb.append(str);
        sb.append((str2 == null || str2.length() <= 0) ? "" : ",sentry_secret=".concat(str2));
        String string2 = sb.toString();
        HashMap map = new HashMap();
        map.put("User-Agent", sentryClientName);
        map.put("X-Sentry-Auth", string2);
        this.c = transportFactory.a(w6Var, new y(string, map));
        if (w6Var.getLogs().a) {
            this.e = w6Var.getLogs().b.c(w6Var, this);
        } else {
            this.e = io.sentry.logger.d.E;
        }
        if (w6Var.getMetrics().a) {
            this.f = w6Var.getMetrics().b.mo1181c(w6Var, this);
        } else {
            this.f = io.sentry.metrics.c.E;
        }
    }

    public static ArrayList m(n0 n0Var) {
        ArrayList arrayList = new ArrayList(n0Var.b);
        a aVar = n0Var.d;
        if (aVar != null) {
            arrayList.add(aVar);
        }
        a aVar2 = n0Var.e;
        if (aVar2 != null) {
            arrayList.add(aVar2);
        }
        a aVar3 = n0Var.f;
        if (aVar3 != null) {
            arrayList.add(aVar3);
        }
        a aVar4 = n0Var.g;
        if (aVar4 != null) {
            arrayList.add(aVar4);
        }
        return arrayList;
    }

    @Override // io.sentry.k1
    public void a(boolean z) {
        long shutdownTimeoutMillis;
        w6 w6Var = (w6) this.b;
        w6Var.getLogger().h(t5.INFO, "Closing SentryClient.", new Object[0]);
        if (z) {
            shutdownTimeoutMillis = 0;
        } else {
            try {
                shutdownTimeoutMillis = w6Var.getShutdownTimeoutMillis();
            } catch (IOException e) {
                w6Var.getLogger().d(t5.WARNING, "Failed to close the connection to the Sentry Server.", e);
            }
        }
        b(shutdownTimeoutMillis);
        ((io.sentry.logger.a) this.e).a(z);
        ((io.sentry.metrics.a) this.f).a(z);
        ((io.sentry.transport.f) this.c).a(z);
        for (i0 i0Var : w6Var.getEventProcessors()) {
            if (i0Var instanceof Closeable) {
                try {
                    ((Closeable) i0Var).close();
                } catch (IOException e2) {
                    w6Var.getLogger().h(t5.WARNING, "Failed to close the event processor {}.", i0Var, e2);
                }
            }
        }
        this.a = false;
    }

    @Override // io.sentry.k1
    public void b(long j) {
        ((io.sentry.logger.a) this.e).b(j);
        ((io.sentry.metrics.a) this.f).b(j);
        ((io.sentry.transport.f) this.c).b(j);
    }

    @Override // io.sentry.k1
    public void c(h7 h7Var, n0 n0Var) {
        w6 w6Var = (w6) this.b;
        p.v("Session is required.", h7Var);
        String str = h7Var.Q;
        if (str == null || str.isEmpty()) {
            w6Var.getLogger().h(t5.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
            return;
        }
        try {
            k(io.sentry.internal.debugmeta.c.a(w6Var.getSerializer(), h7Var, w6Var.getSdkVersion()), n0Var);
        } catch (IOException e) {
            w6Var.getLogger().d(t5.ERROR, "Failed to capture session.", e);
        }
    }

    @Override // io.sentry.k1
    public io.sentry.protocol.w d(y6 y6Var, f1 f1Var, n0 n0Var) {
        w6 w6Var = (w6) this.b;
        if (t(y6Var, n0Var)) {
            io.sentry.protocol.r rVar = y6Var.H;
            io.sentry.protocol.e eVar = y6Var.F;
            if (rVar == null) {
                y6Var.H = f1Var.a();
            }
            if (y6Var.M == null) {
                y6Var.M = f1Var.S();
            }
            if (y6Var.I == null) {
                y6Var.d(new HashMap(f1Var.H()));
            } else {
                for (Map.Entry entry : f1Var.H().entrySet()) {
                    if (!y6Var.I.containsKey(entry.getKey())) {
                        y6Var.I.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            for (Map.Entry entry2 : new io.sentry.protocol.e(f1Var.L()).E.entrySet()) {
                if (!eVar.a(entry2.getKey())) {
                    eVar.k((String) entry2.getKey(), entry2.getValue());
                }
            }
            p1 p1VarC = f1Var.c();
            if (eVar.i() == null) {
                if (p1VarC == null) {
                    eVar.v(s7.c(f1Var.D()));
                } else {
                    eVar.v(p1VarC.y());
                }
            }
        }
        w6Var.getLogger().h(t5.DEBUG, "Capturing session replay: %s", y6Var.E);
        io.sentry.protocol.w wVar = io.sentry.protocol.w.F;
        io.sentry.protocol.w wVar2 = y6Var.E;
        if (wVar2 != null) {
            wVar = wVar2;
        }
        Iterator<i0> it = w6Var.getEventProcessors().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            i0 next = it.next();
            try {
                y6Var = next.c(y6Var, n0Var);
            } catch (Throwable th) {
                w6Var.getLogger().b(t5.ERROR, th, "An exception occurred while processing replay event by processor: %s", next.getClass().getName());
            }
            if (y6Var == null) {
                w6Var.getLogger().h(t5.DEBUG, "Replay event was dropped by a processor: %s", next.getClass().getName());
                w6Var.getClientReportRecorder().a(io.sentry.clientreport.d.EVENT_PROCESSOR, o.Replay);
                break;
            }
        }
        if (y6Var != null) {
            w6Var.getBeforeSendReplay();
        }
        if (y6Var == null) {
            return io.sentry.protocol.w.F;
        }
        try {
            p7 p7VarO = o(f1Var, n0Var, y6Var, null);
            boolean zE = io.sentry.util.c.e(n0Var, io.sentry.hints.b.class);
            d4 d4Var = n0Var.h;
            ArrayList arrayList = new ArrayList();
            arrayList.add(h5.i(w6Var.getSerializer(), w6Var.getLogger(), y6Var, d4Var, zE));
            io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new c5(y6Var.E, w6Var.getSessionReplay().l, p7VarO), arrayList);
            n0Var.a();
            ((io.sentry.transport.f) this.c).m0(cVar, n0Var);
            return wVar;
        } catch (IOException e) {
            w6Var.getLogger().b(t5.WARNING, e, "Capturing event %s failed.", wVar);
            return io.sentry.protocol.w.F;
        }
    }

    @Override // io.sentry.k1
    public io.sentry.protocol.w e(io.sentry.protocol.e0 e0Var, p7 p7Var, f1 f1Var, n0 n0Var, y3 y3Var) {
        j7 j7VarI;
        w6 w6Var = (w6) this.b;
        n0 n0Var2 = n0Var == null ? new n0() : n0Var;
        if (t(e0Var, n0Var2)) {
            n0Var2.b.addAll(f1Var.getAttachments());
        }
        w6Var.getLogger().h(t5.DEBUG, "Capturing transaction: %s", e0Var.E);
        List<l0> ignoredTransactions = w6Var.getIgnoredTransactions();
        String str = e0Var.T;
        if (str != null && ignoredTransactions != null && !ignoredTransactions.isEmpty()) {
            Iterator<l0> it = ignoredTransactions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    Iterator<l0> it2 = ignoredTransactions.iterator();
                    while (it2.hasNext()) {
                        if (it2.next().b(str)) {
                        }
                    }
                } else if (it.next().a().equalsIgnoreCase(str)) {
                    break;
                }
            }
            w6Var.getLogger().h(t5.DEBUG, "Transaction was dropped as transaction name %s is ignored", e0Var.T);
            io.sentry.clientreport.g clientReportRecorder = w6Var.getClientReportRecorder();
            io.sentry.clientreport.d dVar = io.sentry.clientreport.d.EVENT_PROCESSOR;
            clientReportRecorder.a(dVar, o.Transaction);
            w6Var.getClientReportRecorder().g(dVar, o.Span, e0Var.W.size() + 1);
            return io.sentry.protocol.w.F;
        }
        io.sentry.protocol.w wVar = io.sentry.protocol.w.F;
        io.sentry.protocol.w wVarS = e0Var.E;
        if (wVarS == null) {
            wVarS = wVar;
        }
        if (t(e0Var, n0Var2)) {
            j(e0Var, f1Var);
            e0Var = r(e0Var, n0Var2, f1Var.T());
            if (e0Var == null) {
                w6Var.getLogger().h(t5.DEBUG, "Transaction was dropped by applyScope", new Object[0]);
            }
        }
        if (e0Var != null) {
            e0Var = r(e0Var, n0Var2, w6Var.getEventProcessors());
        }
        if (e0Var == null) {
            w6Var.getLogger().h(t5.DEBUG, "Transaction was dropped by Event processors.", new Object[0]);
            return wVar;
        }
        int size = e0Var.W.size();
        l6 beforeSendTransaction = w6Var.getBeforeSendTransaction();
        if (beforeSendTransaction != null) {
            try {
                e0Var = beforeSendTransaction.a(e0Var, n0Var2);
            } catch (Throwable th) {
                w6Var.getLogger().d(t5.ERROR, "The BeforeSendTransaction callback threw an exception. It will be added as breadcrumb and continue.", th);
                e0Var = null;
            }
        }
        io.sentry.protocol.e0 e0Var2 = e0Var;
        int size2 = e0Var2 == null ? 0 : e0Var2.W.size();
        if (e0Var2 == null) {
            w6Var.getLogger().h(t5.DEBUG, "Transaction was dropped by beforeSendTransaction.", new Object[0]);
            io.sentry.clientreport.g clientReportRecorder2 = w6Var.getClientReportRecorder();
            io.sentry.clientreport.d dVar2 = io.sentry.clientreport.d.BEFORE_SEND;
            clientReportRecorder2.a(dVar2, o.Transaction);
            w6Var.getClientReportRecorder().g(dVar2, o.Span, size + 1);
            return io.sentry.protocol.w.F;
        }
        if (size2 < size) {
            int i = size - size2;
            w6Var.getLogger().h(t5.DEBUG, "%d spans were dropped by beforeSendTransaction.", Integer.valueOf(i));
            w6Var.getClientReportRecorder().g(io.sentry.clientreport.d.BEFORE_SEND, o.Span, i);
        }
        try {
            ArrayList arrayListM = m(n0Var2);
            ArrayList arrayList = new ArrayList();
            Iterator it3 = arrayListM.iterator();
            while (it3.hasNext()) {
                ((a) it3.next()).getClass();
            }
            io.sentry.internal.debugmeta.c cVarL = l(e0Var2, arrayList, null, p7Var, y3Var);
            n0Var2.a();
            if (cVarL != null) {
                wVarS = s(cVarL, n0Var2);
            }
        } catch (SentryEnvelopeException | IOException e) {
            w6Var.getLogger().b(t5.WARNING, e, "Capturing transaction %s failed.", wVarS);
            wVarS = io.sentry.protocol.w.F;
        }
        if (!wVarS.equals(io.sentry.protocol.w.F) && (j7VarI = e0Var2.F.i()) != null) {
            w6Var.getReplayController().i(j7VarI.E);
        }
        return wVarS;
    }

    @Override // io.sentry.k1
    public io.sentry.protocol.w f(io.sentry.protocol.k kVar, f1 f1Var) {
        w6 w6Var = (w6) this.b;
        j5 j5Var = new j5();
        io.sentry.protocol.e eVar = j5Var.F;
        eVar.k("feedback", kVar);
        n0 n0Var = new n0();
        if (kVar.J == null) {
            kVar.J = f1Var.N();
        }
        w6Var.getLogger().h(t5.DEBUG, "Capturing feedback: %s", j5Var.E);
        if (t(j5Var, n0Var)) {
            if (j5Var.M == null) {
                j5Var.M = f1Var.S();
            }
            if (j5Var.I == null) {
                j5Var.d(new HashMap(f1Var.H()));
            } else {
                for (Map.Entry entry : f1Var.H().entrySet()) {
                    if (!j5Var.I.containsKey(entry.getKey())) {
                        j5Var.I.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            for (Map.Entry entry2 : new io.sentry.protocol.e(f1Var.L()).E.entrySet()) {
                if (!eVar.a(entry2.getKey())) {
                    eVar.k((String) entry2.getKey(), entry2.getValue());
                }
            }
            p1 p1VarC = f1Var.c();
            if (eVar.i() == null) {
                if (p1VarC == null) {
                    eVar.v(s7.c(f1Var.D()));
                } else {
                    eVar.v(p1VarC.y());
                }
            }
            j5Var = q(j5Var, n0Var, f1Var.T());
            if (j5Var == null) {
                w6Var.getLogger().h(t5.DEBUG, "Feedback was dropped by applyScope", new Object[0]);
                return io.sentry.protocol.w.F;
            }
        }
        j5 j5VarQ = q(j5Var, n0Var, w6Var.getEventProcessors());
        if (j5VarQ != null) {
            j6 beforeSendFeedback = w6Var.getBeforeSendFeedback();
            if (beforeSendFeedback != null) {
                try {
                    j5VarQ = beforeSendFeedback.a(j5VarQ, n0Var);
                } catch (Throwable th) {
                    w6Var.getLogger().d(t5.ERROR, "The BeforeSendFeedback callback threw an exception.", th);
                    j5VarQ = null;
                }
            }
            if (j5VarQ == null) {
                w6Var.getLogger().h(t5.DEBUG, "Event was dropped by beforeSend", new Object[0]);
                w6Var.getClientReportRecorder().a(io.sentry.clientreport.d.BEFORE_SEND, o.Feedback);
            }
        }
        j5 j5Var2 = j5VarQ;
        if (j5Var2 == null) {
            return io.sentry.protocol.w.F;
        }
        io.sentry.protocol.w wVar = io.sentry.protocol.w.F;
        io.sentry.protocol.w wVar2 = j5Var2.E;
        if (wVar2 == null) {
            wVar2 = wVar;
        }
        if (kVar.I == null) {
            w6Var.getReplayController().c(Boolean.FALSE);
            io.sentry.protocol.w wVarN = f1Var.n();
            if (!wVarN.equals(wVar)) {
                kVar.I = wVarN;
            }
        }
        try {
            io.sentry.internal.debugmeta.c cVarL = l(j5Var2, m(n0Var), null, o(f1Var, n0Var, j5Var2, j5Var2.Z), null);
            n0Var.a();
            return cVarL != null ? s(cVarL, n0Var) : wVar2;
        } catch (SentryEnvelopeException | IOException e) {
            w6Var.getLogger().b(t5.WARNING, e, "Capturing feedback %s failed.", wVar2);
            return io.sentry.protocol.w.F;
        }
    }

    @Override // io.sentry.k1
    public lf5 g() {
        return ((io.sentry.transport.f) this.c).g();
    }

    @Override // io.sentry.k1
    public boolean h() {
        return ((io.sentry.transport.f) this.c).h();
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x01cc  */
    @Override // io.sentry.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public io.sentry.protocol.w i(io.sentry.j5 r12, io.sentry.f1 r13, io.sentry.n0 r14) {
        /*
            Method dump skipped, instruction units count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.y4.i(io.sentry.j5, io.sentry.f1, io.sentry.n0):io.sentry.protocol.w");
    }

    @Override // io.sentry.k1
    public boolean isEnabled() {
        return this.a;
    }

    public void j(w4 w4Var, f1 f1Var) {
        if (w4Var.H == null) {
            w4Var.H = f1Var.a();
        }
        if (w4Var.M == null) {
            w4Var.M = f1Var.S();
        }
        if (w4Var.I == null) {
            w4Var.d(new HashMap(f1Var.H()));
        } else {
            for (Map.Entry entry : f1Var.H().entrySet()) {
                if (!w4Var.I.containsKey(entry.getKey())) {
                    w4Var.I.put((String) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        if (w4Var.Q == null) {
            w4Var.Q = new ArrayList(new ArrayList(f1Var.A()));
        } else {
            Queue queueA = f1Var.A();
            List list = w4Var.Q;
            if (list != null && !queueA.isEmpty()) {
                list.addAll(queueA);
                Collections.sort(list, (x4) this.d);
            }
        }
        if (w4Var.S == null) {
            w4Var.S = new HashMap(new HashMap(f1Var.getExtras()));
        } else {
            for (Map.Entry entry2 : f1Var.getExtras().entrySet()) {
                if (!w4Var.S.containsKey(entry2.getKey())) {
                    w4Var.S.put((String) entry2.getKey(), entry2.getValue());
                }
            }
        }
        io.sentry.protocol.e eVar = w4Var.F;
        for (Map.Entry entry3 : new io.sentry.protocol.e(f1Var.L()).E.entrySet()) {
            if (!eVar.a(entry3.getKey())) {
                eVar.k((String) entry3.getKey(), entry3.getValue());
            }
        }
    }

    @Override // io.sentry.k1
    public io.sentry.protocol.w k(io.sentry.internal.debugmeta.c cVar, n0 n0Var) {
        try {
            n0Var.a();
            return s(cVar, n0Var);
        } catch (IOException e) {
            ((w6) this.b).getLogger().d(t5.ERROR, "Failed to capture envelope.", e);
            return io.sentry.protocol.w.F;
        }
    }

    public io.sentry.internal.debugmeta.c l(w4 w4Var, ArrayList arrayList, h7 h7Var, p7 p7Var, y3 y3Var) {
        io.sentry.protocol.w wVar;
        w6 w6Var = (w6) this.b;
        ArrayList arrayList2 = new ArrayList();
        if (w4Var != null) {
            arrayList2.add(h5.d(w6Var.getSerializer(), w4Var));
            wVar = w4Var.E;
        } else {
            wVar = null;
        }
        if (h7Var != null) {
            arrayList2.add(h5.j(w6Var.getSerializer(), h7Var));
        }
        if (y3Var != null) {
            arrayList2.add(h5.h(y3Var, w6Var.getMaxTraceFileSize(), w6Var.getSerializer()));
            if (wVar == null) {
                wVar = new io.sentry.protocol.w(y3Var.a0);
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(h5.b(w6Var.getMaxAttachmentSize(), (a) it.next(), w6Var.getLogger(), w6Var.getSerializer()));
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new io.sentry.internal.debugmeta.c(new c5(wVar, w6Var.getSdkVersion(), p7Var), arrayList2);
    }

    @Override // io.sentry.k1
    public io.sentry.protocol.w n(v3 v3Var) {
        p.v("profileChunk is required.", v3Var);
        w6 w6Var = (w6) this.b;
        w6Var.getLogger().h(t5.DEBUG, "Capturing profile chunk: %s", v3Var.G);
        io.sentry.protocol.w wVar = v3Var.G;
        io.sentry.protocol.f fVarA = io.sentry.protocol.f.a(v3Var.E, w6Var);
        if (fVarA != null) {
            v3Var.E = fVarA;
        }
        try {
            return s(new io.sentry.internal.debugmeta.c(new c5(wVar, w6Var.getSdkVersion(), null), Collections.singletonList(h5.g(v3Var, w6Var.getSerializer(), w6Var.getProfilerConverter()))), null);
        } catch (SentryEnvelopeException | IOException e) {
            w6Var.getLogger().b(t5.WARNING, e, "Capturing profile chunk %s failed.", wVar);
            return io.sentry.protocol.w.F;
        }
    }

    public p7 o(f1 f1Var, n0 n0Var, w4 w4Var, String str) {
        w6 w6Var = (w6) this.b;
        if (io.sentry.util.c.e(n0Var, io.sentry.hints.b.class)) {
            if (w4Var != null) {
                c cVar = new c(w6Var.getLogger());
                io.sentry.protocol.e eVar = w4Var.F;
                j7 j7VarI = eVar.i();
                cVar.c("sentry-trace_id", j7VarI != null ? j7VarI.E.toString() : null);
                cVar.c("sentry-public_key", w6Var.retrieveParsedDsn().b);
                cVar.c("sentry-release", w4Var.J);
                cVar.c("sentry-environment", w4Var.K);
                cVar.c("sentry-org_id", w6Var.getEffectiveOrgId());
                cVar.c("sentry-transaction", str);
                if (cVar.f) {
                    cVar.c = null;
                }
                cVar.c("sentry-sampled", null);
                if (cVar.f) {
                    cVar.d = null;
                }
                Object objC = eVar.c("replay_id");
                if (objC != null && !objC.toString().equals(io.sentry.protocol.w.F.toString())) {
                    cVar.c("sentry-replay_id", objC.toString());
                    eVar.E.remove("replay_id");
                }
                cVar.f = false;
                return cVar.e();
            }
        } else if (f1Var != null) {
            r1 r1VarS = f1Var.s();
            return r1VarS != null ? r1VarS.b() : ((c) f1Var.M(new u95(f1Var, 29, w6Var)).d).e();
        }
        return null;
    }

    public j5 p(j5 j5Var, n0 n0Var, List list) {
        w6 w6Var = (w6) this.b;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            i0 i0Var = (i0) it.next();
            try {
                boolean z = i0Var instanceof io.sentry.android.core.h0;
                boolean zE = io.sentry.util.c.e(n0Var, io.sentry.hints.b.class);
                if (zE && z) {
                    j5Var = ((io.sentry.android.core.h0) i0Var).d(j5Var, n0Var);
                } else if (!zE && !z) {
                    j5Var = i0Var.d(j5Var, n0Var);
                }
            } catch (Throwable th) {
                w6Var.getLogger().b(t5.ERROR, th, "An exception occurred while processing event by processor: %s", i0Var.getClass().getName());
            }
            if (j5Var == null) {
                w6Var.getLogger().h(t5.DEBUG, "Event was dropped by a processor: %s", i0Var.getClass().getName());
                w6Var.getClientReportRecorder().a(io.sentry.clientreport.d.EVENT_PROCESSOR, o.Error);
                break;
            }
        }
        return j5Var;
    }

    public j5 q(j5 j5Var, n0 n0Var, List list) {
        w6 w6Var = (w6) this.b;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            i0 i0Var = (i0) it.next();
            try {
                j5Var = i0Var.d(j5Var, n0Var);
            } catch (Throwable th) {
                w6Var.getLogger().b(t5.ERROR, th, "An exception occurred while processing feedback event by processor: %s", i0Var.getClass().getName());
            }
            if (j5Var == null) {
                w6Var.getLogger().h(t5.DEBUG, "Feedback event was dropped by a processor: %s", i0Var.getClass().getName());
                w6Var.getClientReportRecorder().a(io.sentry.clientreport.d.EVENT_PROCESSOR, o.Feedback);
                break;
            }
        }
        return j5Var;
    }

    public io.sentry.protocol.e0 r(io.sentry.protocol.e0 e0Var, n0 n0Var, List list) {
        w6 w6Var = (w6) this.b;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            i0 i0Var = (i0) it.next();
            int size = e0Var.W.size();
            try {
                e0Var = i0Var.e(e0Var, n0Var);
            } catch (Throwable th) {
                w6Var.getLogger().b(t5.ERROR, th, "An exception occurred while processing transaction by processor: %s", i0Var.getClass().getName());
            }
            int size2 = e0Var == null ? 0 : e0Var.W.size();
            if (e0Var == null) {
                w6Var.getLogger().h(t5.DEBUG, "Transaction was dropped by a processor: %s", i0Var.getClass().getName());
                io.sentry.clientreport.g clientReportRecorder = w6Var.getClientReportRecorder();
                io.sentry.clientreport.d dVar = io.sentry.clientreport.d.EVENT_PROCESSOR;
                clientReportRecorder.a(dVar, o.Transaction);
                w6Var.getClientReportRecorder().g(dVar, o.Span, size + 1);
                break;
            }
            if (size2 < size) {
                int i = size - size2;
                w6Var.getLogger().h(t5.DEBUG, "%d spans were dropped by a processor: %s", Integer.valueOf(i), i0Var.getClass().getName());
                w6Var.getClientReportRecorder().g(io.sentry.clientreport.d.EVENT_PROCESSOR, o.Span, i);
            }
        }
        return e0Var;
    }

    public io.sentry.protocol.w s(io.sentry.internal.debugmeta.c cVar, n0 n0Var) {
        w6 w6Var = (w6) this.b;
        w6Var.getBeforeEnvelopeCallback();
        r5.d().c(w6Var.getLogger());
        io.sentry.transport.f fVar = (io.sentry.transport.f) this.c;
        if (n0Var == null) {
            fVar.getClass();
            fVar.m0(cVar, new n0());
        } else {
            fVar.m0(cVar, n0Var);
        }
        io.sentry.protocol.w wVar = cVar.e().E;
        return wVar != null ? wVar : io.sentry.protocol.w.F;
    }

    public boolean t(w4 w4Var, n0 n0Var) {
        if (io.sentry.util.c.m(n0Var)) {
            return true;
        }
        ((w6) this.b).getLogger().h(t5.DEBUG, "Event was cached so not applying scope: %s", w4Var.E);
        return false;
    }

    public y4(Context context, txd txdVar, cbf cbfVar) {
        this.b = context;
        this.c = txdVar;
        this.d = cbfVar;
        this.e = new lpj(this, true);
        this.f = new lpj(this, false);
    }
}
