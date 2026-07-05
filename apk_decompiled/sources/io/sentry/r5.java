package io.sentry;

import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class r5 {
    public static volatile r5 c;
    public static final io.sentry.util.a d = new io.sentry.util.a();
    public static volatile Boolean e = null;
    public static final io.sentry.util.a f = new io.sentry.util.a();
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet b = new CopyOnWriteArraySet();

    public static r5 d() {
        if (c == null) {
            v vVarA = d.a();
            try {
                if (c == null) {
                    c = new r5();
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
        return c;
    }

    public final void a(String str) {
        p.v("integration is required.", str);
        this.a.add(str);
    }

    public final void b(String str, String str2) {
        this.b.add(new io.sentry.protocol.x(str, str2));
        v vVarA = f.a();
        try {
            e = null;
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

    public final boolean c(a1 a1Var) {
        Boolean bool = e;
        if (bool != null) {
            return bool.booleanValue();
        }
        v vVarA = f.a();
        try {
            boolean z = false;
            for (io.sentry.protocol.x xVar : this.b) {
                if (xVar.E.startsWith("maven:io.sentry:") && !"8.43.1".equalsIgnoreCase(xVar.F)) {
                    a1Var.h(t5.ERROR, "The Sentry SDK has been configured with mixed versions. Expected %s to match core SDK version %s but was %s", xVar.E, "8.43.1", xVar.F);
                    z = true;
                }
            }
            if (z) {
                t5 t5Var = t5.ERROR;
                a1Var.h(t5Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                a1Var.h(t5Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                a1Var.h(t5Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                a1Var.h(t5Var, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
            }
            e = Boolean.valueOf(z);
            vVarA.close();
            return z;
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
