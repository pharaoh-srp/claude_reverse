package io.sentry;

import io.sentry.exception.ExceptionMechanismException;
import java.io.Closeable;
import java.lang.Thread;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class UncaughtExceptionHandlerIntegration implements x1, Thread.UncaughtExceptionHandler, Closeable {
    public static final io.sentry.util.a I = new io.sentry.util.a();
    public Thread.UncaughtExceptionHandler E;
    public n4 F;
    public w6 G;
    public boolean H;

    @Override // io.sentry.x1
    public final void H(w6 w6Var) {
        UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration;
        n4 n4Var;
        n4 n4Var2 = n4.a;
        if (this.H) {
            w6Var.getLogger().h(t5.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.H = true;
        this.F = n4Var2;
        this.G = w6Var;
        a1 logger = w6Var.getLogger();
        t5 t5Var = t5.DEBUG;
        logger.h(t5Var, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.G.isEnableUncaughtExceptionHandler()));
        if (this.G.isEnableUncaughtExceptionHandler()) {
            v vVarA = I.a();
            try {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                if (defaultUncaughtExceptionHandler != null) {
                    this.G.getLogger().h(t5Var, "default UncaughtExceptionHandler class='" + defaultUncaughtExceptionHandler.getClass().getName() + "'", new Object[0]);
                    if (!(defaultUncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) || (n4Var = (uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) defaultUncaughtExceptionHandler).F) == null) {
                        this.E = defaultUncaughtExceptionHandler;
                    } else {
                        i1 i1Var = t4.a;
                        n4Var.getClass();
                        this.E = uncaughtExceptionHandlerIntegration.E;
                    }
                }
                Thread.setDefaultUncaughtExceptionHandler(this);
                vVarA.close();
                this.G.getLogger().h(t5Var, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
                p.a("UncaughtExceptionHandler");
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

    public final void c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, HashSet hashSet) {
        if (uncaughtExceptionHandler == null) {
            w6 w6Var = this.G;
            if (w6Var != null) {
                w6Var.getLogger().h(t5.DEBUG, "Found no UncaughtExceptionHandler to remove.", new Object[0]);
                return;
            }
            return;
        }
        if (!hashSet.add(uncaughtExceptionHandler)) {
            w6 w6Var2 = this.G;
            if (w6Var2 != null) {
                w6Var2.getLogger().h(t5.WARNING, "Cycle detected in UncaughtExceptionHandler chain while removing handler.", new Object[0]);
                return;
            }
            return;
        }
        if (uncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) {
            UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) uncaughtExceptionHandler;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = uncaughtExceptionHandlerIntegration.E;
            if (this != uncaughtExceptionHandler2) {
                c(uncaughtExceptionHandler2, hashSet);
                return;
            }
            uncaughtExceptionHandlerIntegration.E = this.E;
            w6 w6Var3 = this.G;
            if (w6Var3 != null) {
                w6Var3.getLogger().h(t5.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        v vVarA = I.a();
        try {
            if (this == Thread.getDefaultUncaughtExceptionHandler()) {
                Thread.setDefaultUncaughtExceptionHandler(this.E);
                w6 w6Var = this.G;
                if (w6Var != null) {
                    w6Var.getLogger().h(t5.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
                }
            } else {
                c(Thread.getDefaultUncaughtExceptionHandler(), new HashSet());
            }
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

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        io.sentry.protocol.w wVar;
        w6 w6Var = this.G;
        if (w6Var == null || this.F == null) {
            return;
        }
        w6Var.getLogger().h(t5.INFO, "Uncaught exception received.", new Object[0]);
        try {
            u7 u7Var = new u7(this.G.getFlushTimeoutMillis(), this.G.getLogger());
            io.sentry.protocol.o oVar = new io.sentry.protocol.o();
            oVar.H = Boolean.FALSE;
            oVar.E = "UncaughtExceptionHandler";
            j5 j5Var = new j5(new ExceptionMechanismException(oVar, th, thread));
            j5Var.Y = t5.FATAL;
            if (this.F.s() == null && (wVar = j5Var.E) != null) {
                u7Var.g(wVar);
            }
            n0 n0VarA = io.sentry.util.c.a(u7Var);
            boolean zEquals = this.F.I(j5Var, n0VarA).equals(io.sentry.protocol.w.F);
            io.sentry.hints.e eVarC = io.sentry.util.c.c(n0VarA);
            if ((!zEquals || io.sentry.hints.e.MULTITHREADED_DEDUPLICATION.equals(eVarC)) && !u7Var.d()) {
                this.G.getLogger().h(t5.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", j5Var.E);
            }
        } catch (Throwable th2) {
            this.G.getLogger().d(t5.ERROR, "Error sending uncaught exception to Sentry.", th2);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.E;
        w6 w6Var2 = this.G;
        if (uncaughtExceptionHandler != null) {
            w6Var2.getLogger().h(t5.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
            this.E.uncaughtException(thread, th);
        } else if (w6Var2.isPrintUncaughtStackTrace()) {
            th.printStackTrace();
        }
    }
}
