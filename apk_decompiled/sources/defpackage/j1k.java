package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j1k implements x3k {
    public static final Object H = new Object();
    public static final b1a I = new b1a(1, l4k.class);
    public static final boolean J;
    public static final ppk K;
    public volatile Object E;
    public volatile z0k F;
    public volatile g1k G;

    static {
        boolean z;
        ppk e1kVar;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        J = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property == null || property.contains("Android")) {
            try {
                e1kVar = new f1k();
            } catch (Error | Exception e) {
                try {
                    e1kVar = new d1k();
                } catch (Error | Exception e2) {
                    th3 = e2;
                    e1kVar = new e1k();
                }
                th = th3;
                th2 = e;
            }
        } else {
            try {
                e1kVar = new d1k();
            } catch (NoClassDefFoundError unused2) {
                e1kVar = new e1k();
            }
        }
        th = null;
        th2 = null;
        K = e1kVar;
        if (th != null) {
            b1a b1aVar = I;
            Logger loggerB = b1aVar.b();
            Level level = Level.SEVERE;
            loggerB.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            b1aVar.b().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public final void b(g1k g1kVar) {
        g1kVar.a = null;
        while (true) {
            g1k g1kVar2 = this.G;
            if (g1kVar2 != g1k.c) {
                g1k g1kVar3 = null;
                while (g1kVar2 != null) {
                    g1k g1kVar4 = g1kVar2.b;
                    if (g1kVar2.a != null) {
                        g1kVar3 = g1kVar2;
                    } else if (g1kVar3 != null) {
                        g1kVar3.b = g1kVar4;
                        if (g1kVar3.a == null) {
                            break;
                        }
                    } else if (!K.m(this, g1kVar2, g1kVar4)) {
                        break;
                    }
                    g1kVar2 = g1kVar4;
                }
                return;
            }
            return;
        }
    }

    public abstract Throwable d();
}
