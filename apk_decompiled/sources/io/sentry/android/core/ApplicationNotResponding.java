package io.sentry.android.core;

/* JADX INFO: loaded from: classes3.dex */
final class ApplicationNotResponding extends RuntimeException {
    public final Thread E;

    public ApplicationNotResponding(String str, Thread thread) {
        super(str);
        io.sentry.p.v("Thread must be provided.", thread);
        this.E = thread;
        setStackTrace(thread.getStackTrace());
    }

    public ApplicationNotResponding(String str) {
        super(str);
        this.E = null;
    }
}
