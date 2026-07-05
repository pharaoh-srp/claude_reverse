package defpackage;

import com.google.android.gms.internal.play_billing.a;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
public final class l4k extends j1k implements x3k {
    public x3k L;
    public ScheduledFuture M;

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof x0k) {
            Throwable th = ((x0k) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof a) {
            throw new ExecutionException(((a) obj).a);
        }
        if (obj == j1k.H) {
            return null;
        }
        return obj;
    }

    public static boolean g(Object obj) {
        return !(obj instanceof y0k);
    }

    public static Object h(x3k x3kVar) {
        Object obj;
        Throwable thD;
        if (x3kVar instanceof l4k) {
            Object x0kVar = ((l4k) x3kVar).E;
            if (x0kVar instanceof x0k) {
                x0k x0kVar2 = (x0k) x0kVar;
                if (x0kVar2.a) {
                    Throwable th = x0kVar2.b;
                    x0kVar = th != null ? new x0k(th, false) : x0k.d;
                }
            }
            Objects.requireNonNull(x0kVar);
            return x0kVar;
        }
        if ((x3kVar instanceof j1k) && (thD = ((j1k) x3kVar).d()) != null) {
            return new a(thD);
        }
        boolean zIsCancelled = x3kVar.isCancelled();
        boolean z = true;
        if ((!j1k.J) && zIsCancelled) {
            x0k x0kVar3 = x0k.d;
            Objects.requireNonNull(x0kVar3);
            return x0kVar3;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = x3kVar.get();
                        break;
                    } catch (Error e) {
                        e = e;
                        return new a(e);
                    }
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th2) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (Error | Exception e2) {
                e = e2;
                return new a(e);
            } catch (CancellationException e3) {
                return !zIsCancelled ? new a(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(x3kVar)), e3)) : new x0k(e3, false);
            } catch (ExecutionException e4) {
                return zIsCancelled ? new x0k(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(x3kVar)), e4), false) : new a(e4.getCause());
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return zIsCancelled ? new x0k(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(x3kVar))), false) : obj == null ? j1k.H : obj;
    }

    public static void j(l4k l4kVar) {
        z0k z0kVar;
        z0k z0kVar2 = null;
        while (true) {
            l4kVar.getClass();
            for (g1k g1kVarH = j1k.K.h(l4kVar); g1kVarH != null; g1kVarH = g1kVarH.b) {
                Thread thread = g1kVarH.a;
                if (thread != null) {
                    g1kVarH.a = null;
                    LockSupport.unpark(thread);
                }
            }
            x3k x3kVar = l4kVar.L;
            if ((l4kVar.E instanceof x0k) & (x3kVar != null)) {
                Object obj = l4kVar.E;
                x3kVar.cancel((obj instanceof x0k) && ((x0k) obj).a);
            }
            ScheduledFuture scheduledFuture = l4kVar.M;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            l4kVar.L = null;
            l4kVar.M = null;
            z0k z0kVar3 = z0kVar2;
            z0k z0kVarG = j1k.K.g(l4kVar);
            z0k z0kVar4 = z0kVar3;
            while (z0kVarG != null) {
                z0k z0kVar5 = z0kVarG.c;
                z0kVarG.c = z0kVar4;
                z0kVar4 = z0kVarG;
                z0kVarG = z0kVar5;
            }
            while (z0kVar4 != null) {
                Runnable runnable = z0kVar4.a;
                z0kVar = z0kVar4.c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof y0k) {
                    y0k y0kVar = (y0k) runnable;
                    l4kVar = y0kVar.E;
                    if (l4kVar.E == y0kVar) {
                        if (j1k.K.l(l4kVar, y0kVar, h(y0kVar.F))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = z0kVar4.b;
                    Objects.requireNonNull(executor);
                    k(runnable, executor);
                }
                z0kVar4 = z0kVar;
            }
            return;
            z0kVar2 = z0kVar;
        }
    }

    public static void k(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            j1k.I.b().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", ij0.k("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    @Override // defpackage.x3k
    public final void c(Runnable runnable, Executor executor) {
        z0k z0kVar;
        z0k z0kVar2 = z0k.d;
        if (executor == null) {
            mr9.h("Executor was null.");
            return;
        }
        if (!isDone() && (z0kVar = this.F) != z0kVar2) {
            z0k z0kVar3 = new z0k(runnable, executor);
            do {
                z0kVar3.c = z0kVar;
                if (j1k.K.k(this, z0kVar, z0kVar3)) {
                    return;
                } else {
                    z0kVar = this.F;
                }
            } while (z0kVar != z0kVar2);
        }
        k(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        x0k x0kVar;
        Object obj = this.E;
        if (!(obj instanceof y0k) && !(obj == null)) {
            return false;
        }
        if (j1k.J) {
            x0kVar = new x0k(new CancellationException("Future.cancel() was called."), z);
        } else {
            x0kVar = z ? x0k.c : x0k.d;
            Objects.requireNonNull(x0kVar);
        }
        boolean z2 = false;
        while (true) {
            if (j1k.K.l(this, obj, x0kVar)) {
                j(this);
                if (!(obj instanceof y0k)) {
                    break;
                }
                x3k x3kVar = ((y0k) obj).F;
                if (!(x3kVar instanceof l4k)) {
                    x3kVar.cancel(z);
                    break;
                }
                this = (l4k) x3kVar;
                obj = this.E;
                if (!(obj == null) && !(obj instanceof y0k)) {
                    break;
                }
                z2 = true;
            } else {
                obj = this.E;
                if (g(obj)) {
                    return z2;
                }
            }
        }
        return true;
    }

    @Override // defpackage.j1k
    public final Throwable d() {
        if (!(this instanceof l4k)) {
            return null;
        }
        Object obj = this.E;
        if (obj instanceof a) {
            return ((a) obj).a;
        }
        return null;
    }

    public final String f() {
        x3k x3kVar = this.L;
        ScheduledFuture scheduledFuture = this.M;
        if (x3kVar == null) {
            return null;
        }
        String strJ = ij0.j("inputFuture=[", x3kVar.toString(), "]");
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                return strJ + ", remaining delay=[" + delay + " ms]";
            }
        }
        return strJ;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long j2;
        g1k g1kVar = g1k.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.E;
        if ((obj != null) && g(obj)) {
            return e(obj);
        }
        long j3 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            g1k g1kVar2 = this.G;
            if (g1kVar2 != g1kVar) {
                g1k g1kVar3 = new g1k();
                while (true) {
                    ppk ppkVar = j1k.K;
                    ppkVar.i(g1kVar3, g1kVar2);
                    if (ppkVar.m(this, g1kVar2, g1kVar3)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                b(g1kVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.E;
                            if ((obj2 != null) && g(obj2)) {
                                return e(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        b(g1kVar3);
                    } else {
                        long j4 = j3;
                        g1kVar2 = this.G;
                        if (g1kVar2 == g1kVar) {
                            break;
                        }
                        j3 = j4;
                    }
                }
            }
            Object obj3 = this.E;
            Objects.requireNonNull(obj3);
            return e(obj3);
        }
        j2 = 0;
        while (nanos > j2) {
            Object obj4 = this.E;
            if ((obj4 != null) && g(obj4)) {
                return e(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < j2) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j5 = -nanos;
            long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == j2 || nanos2 > 1000;
            if (jConvert > j2) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(ij0.C(strConcat, " for ", string));
    }

    public final void i(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (Exception e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (obj == null) {
            sb.append("null");
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.E instanceof x0k;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.E;
        return (obj != null) & g(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l4k.toString():java.lang.String");
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        g1k g1kVar = g1k.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.E;
            if ((obj2 != null) & g(obj2)) {
                return e(obj2);
            }
            g1k g1kVar2 = this.G;
            if (g1kVar2 != g1kVar) {
                g1k g1kVar3 = new g1k();
                do {
                    ppk ppkVar = j1k.K;
                    ppkVar.i(g1kVar3, g1kVar2);
                    if (ppkVar.m(this, g1kVar2, g1kVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.E;
                            } else {
                                b(g1kVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & g(obj)));
                        return e(obj);
                    }
                    g1kVar2 = this.G;
                } while (g1kVar2 != g1kVar);
            }
            Object obj3 = this.E;
            Objects.requireNonNull(obj3);
            return e(obj3);
        }
        throw new InterruptedException();
    }
}
