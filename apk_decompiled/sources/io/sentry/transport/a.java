package io.sentry.transport;

import defpackage.jke;
import io.sentry.a5;
import io.sentry.c5;
import io.sentry.n0;
import io.sentry.t5;
import io.sentry.w6;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Runnable {
    public final io.sentry.internal.debugmeta.c E;
    public final n0 F;
    public final io.sentry.cache.d G;
    public final p H = io.sentry.config.a.l();
    public final /* synthetic */ b I;

    public a(b bVar, io.sentry.internal.debugmeta.c cVar, n0 n0Var, io.sentry.cache.d dVar) {
        this.I = bVar;
        io.sentry.p.v("Envelope is required.", cVar);
        this.E = cVar;
        this.F = n0Var;
        io.sentry.p.v("EnvelopeCache is required.", dVar);
        this.G = dVar;
    }

    public static /* synthetic */ void a(a aVar, io.sentry.config.a aVar2, io.sentry.hints.k kVar) {
        aVar.I.G.getLogger().h(t5.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(aVar2.x()));
        kVar.b(aVar2.x());
    }

    public final io.sentry.config.a d() {
        io.sentry.internal.debugmeta.c cVar = this.E;
        ((c5) cVar.F).H = null;
        io.sentry.cache.d dVar = this.G;
        n0 n0Var = this.F;
        boolean zH = dVar.H(cVar, n0Var);
        io.sentry.util.c.i(n0Var, io.sentry.hints.c.class, new jke(22, this));
        b bVar = this.I;
        w6 w6Var = bVar.G;
        if (!bVar.I.a()) {
            Object objB = n0Var.b("sentry:typeCheckHint");
            boolean zIsInstance = io.sentry.hints.h.class.isInstance(n0Var.b("sentry:typeCheckHint"));
            p pVar = this.H;
            if (zIsInstance && objB != null) {
                ((io.sentry.hints.h) objB).c(true);
                return pVar;
            }
            if (!zH) {
                io.sentry.util.c.g(io.sentry.hints.h.class, objB, w6Var.getLogger());
                w6Var.getClientReportRecorder().e(io.sentry.clientreport.d.NETWORK_ERROR, cVar);
            }
            return pVar;
        }
        io.sentry.internal.debugmeta.c cVarM = w6Var.getClientReportRecorder().m(cVar);
        try {
            a5 a5VarC = w6Var.getDateProvider().c();
            ((c5) cVarM.F).H = io.sentry.p.l(Double.valueOf(a5VarC.d() / 1000000.0d).longValue());
            io.sentry.config.a aVarD = bVar.J.d(cVarM);
            if (aVarD.x()) {
                dVar.r0(cVar);
                return aVarD;
            }
            String str = "The transport failed to send the envelope with response code " + aVarD.t();
            w6Var.getLogger().h(t5.ERROR, str, new Object[0]);
            if (aVarD.t() >= 400) {
                dVar.r0(cVar);
                if (aVarD.t() != 429) {
                    w6Var.getClientReportRecorder().e(io.sentry.clientreport.d.SEND_ERROR, cVarM);
                }
            }
            throw new IllegalStateException(str);
        } catch (IOException e) {
            Object objB2 = n0Var.b("sentry:typeCheckHint");
            if (io.sentry.hints.h.class.isInstance(n0Var.b("sentry:typeCheckHint")) && objB2 != null) {
                ((io.sentry.hints.h) objB2).c(true);
            } else if (!zH) {
                io.sentry.util.c.g(io.sentry.hints.h.class, objB2, w6Var.getLogger());
                w6Var.getClientReportRecorder().e(io.sentry.clientreport.d.NETWORK_ERROR, cVarM);
            }
            throw new IllegalStateException("Sending the event failed.", e);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.I.K = this;
        io.sentry.config.a aVarD = this.H;
        try {
            aVarD = d();
            this.I.G.getLogger().h(t5.DEBUG, "Envelope flushed", new Object[0]);
        } catch (Throwable th) {
            try {
                this.I.G.getLogger().b(t5.ERROR, th, "Envelope submission failed", new Object[0]);
                throw th;
            } finally {
                n0 n0Var = this.F;
                Object objB = n0Var.b("sentry:typeCheckHint");
                if (io.sentry.hints.k.class.isInstance(n0Var.b("sentry:typeCheckHint")) && objB != null) {
                    a(this, aVarD, (io.sentry.hints.k) objB);
                }
                this.I.K = null;
            }
        }
    }
}
