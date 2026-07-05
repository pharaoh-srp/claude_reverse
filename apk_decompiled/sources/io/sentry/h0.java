package io.sentry;

import defpackage.et5;
import defpackage.jke;
import defpackage.u95;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends b0 {
    public final h1 e;
    public final n1 f;
    public final a1 g;

    public h0(h1 h1Var, n1 n1Var, a1 a1Var, long j, int i) {
        super(h1Var, a1Var, j, i);
        p.v("Scopes are required.", h1Var);
        this.e = h1Var;
        p.v("Serializer is required.", n1Var);
        this.f = n1Var;
        p.v("Logger is required.", a1Var);
        this.g = a1Var;
    }

    @Override // io.sentry.b0
    public final boolean a(String str) {
        return str.endsWith(".envelope");
    }

    @Override // io.sentry.b0
    public final void b(File file, n0 n0Var) {
        u95 u95Var;
        boolean zIsFile = file.isFile();
        a1 a1Var = this.g;
        if (!zIsFile) {
            a1Var.h(t5.DEBUG, "'%s' is not a file.", file.getAbsolutePath());
            return;
        }
        if (!file.getName().endsWith(".envelope")) {
            a1Var.h(t5.DEBUG, "File '%s' doesn't match extension expected.", file.getAbsolutePath());
            return;
        }
        if (!file.getParentFile().canWrite()) {
            a1Var.h(t5.WARNING, "File '%s' cannot be deleted so it will not be processed.", file.getAbsolutePath());
            return;
        }
        try {
            try {
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    try {
                        io.sentry.internal.debugmeta.c cVarD = this.f.d(bufferedInputStream);
                        if (cVarD == null) {
                            a1Var.h(t5.ERROR, "Failed to deserialize cached envelope %s", file.getAbsolutePath());
                        } else {
                            this.e.k(cVarD, n0Var);
                        }
                        io.sentry.util.c.j(n0Var, io.sentry.hints.f.class, a1Var, new jke(13, this));
                        bufferedInputStream.close();
                        io.sentry.util.c.j(n0Var, io.sentry.hints.h.class, a1Var, new u95(this, 21, file));
                    } catch (Throwable th) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    io.sentry.util.c.j(n0Var, io.sentry.hints.h.class, a1Var, new u95(this, 21, file));
                    throw th3;
                }
            } catch (FileNotFoundException e) {
                a1Var.b(t5.ERROR, e, "File '%s' cannot be found.", file.getAbsolutePath());
                u95Var = new u95(this, 21, file);
                io.sentry.util.c.j(n0Var, io.sentry.hints.h.class, a1Var, u95Var);
            }
        } catch (IOException e2) {
            a1Var.b(t5.ERROR, e2, "I/O on file '%s' failed.", file.getAbsolutePath());
            u95Var = new u95(this, 21, file);
            io.sentry.util.c.j(n0Var, io.sentry.hints.h.class, a1Var, u95Var);
        } catch (Throwable th4) {
            a1Var.b(t5.ERROR, th4, "Failed to capture cached envelope %s", file.getAbsolutePath());
            io.sentry.util.c.j(n0Var, io.sentry.hints.h.class, a1Var, new et5(this, th4, file, 8));
            u95Var = new u95(this, 21, file);
            io.sentry.util.c.j(n0Var, io.sentry.hints.h.class, a1Var, u95Var);
        }
    }
}
