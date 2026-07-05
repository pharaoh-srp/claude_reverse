package io.sentry.android.core.internal.gestures;

import defpackage.rl;
import io.sentry.a1;
import io.sentry.android.core.p0;
import io.sentry.h5;
import io.sentry.o;
import io.sentry.t5;
import io.sentry.w6;
import io.sentry.y4;

/* JADX INFO: loaded from: classes.dex */
public final class h implements io.sentry.util.g, io.sentry.clientreport.g, io.sentry.metrics.b {
    public static boolean b(a1 a1Var, String str) {
        return h(a1Var, str) != null;
    }

    public static boolean d(w6 w6Var, String str) {
        return b(w6Var != null ? w6Var.getLogger() : null, str);
    }

    public static Class h(a1 a1Var, String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            if (a1Var == null) {
                return null;
            }
            a1Var.h(t5.INFO, "Class not available: ".concat(str), new Object[0]);
            return null;
        } catch (UnsatisfiedLinkError e) {
            if (a1Var == null) {
                return null;
            }
            a1Var.d(t5.ERROR, "Failed to load (UnsatisfiedLinkError) ".concat(str), e);
            return null;
        } catch (Throwable th) {
            if (a1Var == null) {
                return null;
            }
            a1Var.d(t5.ERROR, "Failed to initialize ".concat(str), th);
            return null;
        }
    }

    @Override // io.sentry.clientreport.g
    public void a(io.sentry.clientreport.d dVar, o oVar) {
    }

    @Override // io.sentry.metrics.b
    /* JADX INFO: renamed from: c */
    public io.sentry.metrics.a mo1181c(w6 w6Var, y4 y4Var) {
        return new rl(w6Var, y4Var);
    }

    @Override // io.sentry.clientreport.g
    public void e(io.sentry.clientreport.d dVar, io.sentry.internal.debugmeta.c cVar) {
    }

    @Override // io.sentry.util.g
    public Object f() {
        return Boolean.valueOf(p0.f());
    }

    @Override // io.sentry.clientreport.g
    public void g(io.sentry.clientreport.d dVar, o oVar, long j) {
    }

    @Override // io.sentry.clientreport.g
    public void j(io.sentry.clientreport.d dVar, h5 h5Var) {
    }

    @Override // io.sentry.clientreport.g
    public io.sentry.internal.debugmeta.c m(io.sentry.internal.debugmeta.c cVar) {
        return cVar;
    }
}
