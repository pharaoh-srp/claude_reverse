package io.sentry;

import android.os.SystemClock;
import defpackage.jke;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b2 implements d2, io.sentry.util.g, io.sentry.util.b, f4, io.sentry.transport.e, s4, j4 {
    public final /* synthetic */ int E;

    public /* synthetic */ b2(int i) {
        this.E = i;
    }

    public static /* synthetic */ void e(Object obj, Object obj2, String str) {
        throw new NumberFormatException(str + obj + obj2);
    }

    public static /* synthetic */ void g(String str, Object obj) {
        throw new IllegalArgumentException(str + obj);
    }

    @Override // io.sentry.transport.e
    public long a() {
        return SystemClock.uptimeMillis();
    }

    @Override // io.sentry.util.b
    public void accept(Object obj) {
        switch (this.E) {
            case 3:
                ((io.sentry.android.core.w0) obj).f();
                break;
            case 8:
                ((io.sentry.hints.k) obj).b(false);
                break;
            case 9:
                ((io.sentry.hints.h) obj).c(true);
                break;
            case 10:
                ((io.sentry.hints.k) obj).b(false);
                break;
            default:
                ((io.sentry.hints.h) obj).c(false);
                break;
        }
    }

    @Override // io.sentry.f4
    public void b(h7 h7Var) {
    }

    @Override // io.sentry.d2
    public Object c() {
        return null;
    }

    @Override // io.sentry.s4
    public void d(w6 w6Var) {
        io.sentry.util.a aVar = io.sentry.android.core.j1.b;
    }

    @Override // io.sentry.util.g
    public Object f() {
        return w6.empty();
    }

    @Override // io.sentry.j4
    public void i(f1 f1Var) {
        switch (this.E) {
            case 7:
                f1Var.getClass();
                f1Var.q(io.sentry.protocol.w.F);
                break;
            default:
                f1Var.M(new jke(24, f1Var));
                break;
        }
    }
}
