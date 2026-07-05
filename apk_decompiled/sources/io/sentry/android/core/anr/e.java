package io.sentry.android.core.anr;

import defpackage.u15;
import io.sentry.a1;
import io.sentry.cache.tape.j;
import io.sentry.t5;
import io.sentry.w6;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements AutoCloseable {
    public final io.sentry.cache.tape.g E;

    public e(w6 w6Var, File file) {
        j jVar;
        a1 logger = w6Var.getLogger();
        try {
            try {
                try {
                    jVar = new j(file, j.e(file), 120);
                } catch (Throwable th) {
                    throw th;
                }
            } catch (IOException e) {
                logger.d(t5.ERROR, "Failed to create stacktrace queue", e);
                jVar = null;
            }
        } catch (IOException unused) {
            if (!file.delete()) {
                throw new IOException("Could not delete file");
            }
            RandomAccessFile randomAccessFileE = j.e(file);
            try {
                jVar = new j(file, randomAccessFileE, 120);
            } finally {
                randomAccessFileE.close();
            }
        }
        if (jVar == null) {
            this.E = new io.sentry.cache.tape.b();
        } else {
            this.E = new io.sentry.cache.tape.e(jVar, new io.sentry.hints.j());
        }
    }

    public final void c(g gVar) {
        this.E.e(gVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.E.close();
    }

    public final void d() {
        this.E.clear();
    }

    public final u15 e() {
        List<g> listL0 = this.E.l0();
        u15 u15Var = new u15();
        u15Var.G = new ArrayList(listL0.size());
        for (g gVar : listL0) {
            if (gVar != null) {
                ((ArrayList) u15Var.G).add(gVar);
            }
        }
        Collections.sort((ArrayList) u15Var.G);
        if (((ArrayList) u15Var.G).isEmpty()) {
            u15Var.E = 0L;
            u15Var.F = 0L;
        } else {
            u15Var.E = ((g) ((ArrayList) u15Var.G).get(0)).F;
            u15Var.F = ((g) ((ArrayList) u15Var.G).get(r5.size() - 1)).F + 10000;
        }
        return u15Var;
    }
}
