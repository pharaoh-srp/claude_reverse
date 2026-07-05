package io.sentry;

import defpackage.u95;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class r3 extends b0 {
    public static final Charset i = Charset.forName("UTF-8");
    public final h1 e;
    public final x0 f;
    public final n1 g;
    public final a1 h;

    public r3(h1 h1Var, x0 x0Var, n1 n1Var, a1 a1Var, long j, int i2) {
        super(h1Var, a1Var, j, i2);
        p.v("Scopes are required.", h1Var);
        this.e = h1Var;
        p.v("Envelope reader is required.", x0Var);
        this.f = x0Var;
        p.v("Serializer is required.", n1Var);
        this.g = n1Var;
        p.v("Logger is required.", a1Var);
        this.h = a1Var;
    }

    public static /* synthetic */ void c(r3 r3Var, File file, io.sentry.hints.h hVar) {
        a1 a1Var = r3Var.h;
        if (hVar.a()) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            a1Var.h(t5.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        } catch (RuntimeException e) {
            a1Var.b(t5.ERROR, e, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    @Override // io.sentry.b0
    public final boolean a(String str) {
        return (str == null || str.startsWith("session") || str.startsWith("previous_session") || str.startsWith("startup_crash")) ? false : true;
    }

    @Override // io.sentry.b0
    public final void b(File file, n0 n0Var) {
        boolean zA = a(file.getName());
        a1 a1Var = this.h;
        if (!zA) {
            a1Var.h(t5.DEBUG, "File '%s' should be ignored.", file.getAbsolutePath());
            return;
        }
        int i2 = 22;
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                io.sentry.internal.debugmeta.c cVarA = this.f.a(bufferedInputStream);
                if (cVarA == null) {
                    a1Var.h(t5.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                } else {
                    e(cVarA, n0Var);
                    a1Var.h(t5.DEBUG, "File '%s' is done.", file.getAbsolutePath());
                }
                bufferedInputStream.close();
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            a1Var.d(t5.ERROR, "Error processing envelope.", e);
        } finally {
            io.sentry.util.c.j(n0Var, io.sentry.hints.h.class, a1Var, new u95(this, i2, file));
        }
    }

    public final r7 d(p7 p7Var) {
        String str;
        a1 a1Var = this.h;
        if (p7Var != null && (str = p7Var.K) != null) {
            try {
                Double dValueOf = Double.valueOf(Double.parseDouble(str));
                if (p.q(dValueOf, false)) {
                    String str2 = p7Var.L;
                    if (str2 != null) {
                        Double dValueOf2 = Double.valueOf(Double.parseDouble(str2));
                        if (p.q(dValueOf2, false)) {
                            return new r7(Boolean.TRUE, dValueOf, dValueOf2, Boolean.FALSE, null);
                        }
                    }
                    return p.b(new r7(Boolean.TRUE, dValueOf));
                }
                a1Var.h(t5.ERROR, "Invalid sample rate parsed from TraceContext: %s", str);
            } catch (Exception unused) {
                a1Var.h(t5.ERROR, "Unable to parse sample rate from TraceContext: %s", str);
            }
        }
        return new r7(Boolean.TRUE, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x025f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(io.sentry.internal.debugmeta.c r19, io.sentry.n0 r20) {
        /*
            Method dump skipped, instruction units count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.r3.e(io.sentry.internal.debugmeta.c, io.sentry.n0):void");
    }

    public final boolean f(n0 n0Var) {
        Object objD = io.sentry.util.c.d(n0Var);
        if (objD instanceof io.sentry.hints.f) {
            return ((io.sentry.hints.f) objD).d();
        }
        io.sentry.util.c.g(io.sentry.hints.f.class, objD, this.h);
        return true;
    }
}
