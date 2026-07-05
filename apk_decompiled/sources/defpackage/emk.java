package defpackage;

import java.lang.Thread;

/* JADX INFO: loaded from: classes.dex */
public final class emk implements Thread.UncaughtExceptionHandler {
    public final String E;
    public final /* synthetic */ wlk F;

    public emk(wlk wlkVar, String str) {
        this.F = wlkVar;
        this.E = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.F.b0().J.c(this.E, th);
    }
}
