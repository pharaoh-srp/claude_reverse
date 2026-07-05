package io.sentry.exception;

import io.sentry.p;
import io.sentry.protocol.o;

/* JADX INFO: loaded from: classes3.dex */
public final class ExceptionMechanismException extends RuntimeException {
    public final o E;
    public final Throwable F;
    public final Thread G;
    public final boolean H;

    public ExceptionMechanismException(o oVar, Throwable th, Thread thread, boolean z) {
        this.E = oVar;
        p.v("Throwable is required.", th);
        this.F = th;
        this.G = thread;
        this.H = z;
    }

    public final o a() {
        return this.E;
    }

    public final Thread b() {
        return this.G;
    }

    public final Throwable c() {
        return this.F;
    }

    public final boolean d() {
        return this.H;
    }

    public ExceptionMechanismException(o oVar, Throwable th, Thread thread) {
        this(oVar, th, thread, false);
    }
}
