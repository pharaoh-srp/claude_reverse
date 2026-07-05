package defpackage;

import com.google.android.gms.internal.play_billing.c;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class x0l implements x3k {
    public static final boolean H = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger I = Logger.getLogger(x0l.class.getName());
    public static final wpk J;
    public static final Object K;
    public volatile Object E;
    public volatile tjk F;
    public volatile yyk G;

    static {
        wpk jxkVar;
        try {
            jxkVar = new vqk(AtomicReferenceFieldUpdater.newUpdater(yyk.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(yyk.class, yyk.class, "b"), AtomicReferenceFieldUpdater.newUpdater(x0l.class, yyk.class, "G"), AtomicReferenceFieldUpdater.newUpdater(x0l.class, tjk.class, "F"), AtomicReferenceFieldUpdater.newUpdater(x0l.class, Object.class, "E"));
            th = null;
        } catch (Throwable th) {
            th = th;
            jxkVar = new jxk();
        }
        Throwable th2 = th;
        J = jxkVar;
        if (th2 != null) {
            I.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        K = new Object();
    }

    public static void d(x0l x0lVar) {
        yyk yykVar;
        wpk wpkVar;
        tjk tjkVar;
        tjk tjkVar2;
        tjk tjkVar3;
        do {
            yykVar = x0lVar.G;
            wpkVar = J;
        } while (!wpkVar.q(x0lVar, yykVar, yyk.c));
        while (true) {
            tjkVar = null;
            if (yykVar == null) {
                break;
            }
            Thread thread = yykVar.a;
            if (thread != null) {
                yykVar.a = null;
                LockSupport.unpark(thread);
            }
            yykVar = yykVar.b;
        }
        do {
            tjkVar2 = x0lVar.F;
        } while (!wpkVar.o(x0lVar, tjkVar2, tjk.d));
        while (true) {
            tjkVar3 = tjkVar;
            tjkVar = tjkVar2;
            if (tjkVar == null) {
                break;
            }
            tjkVar2 = tjkVar.c;
            tjkVar.c = tjkVar3;
        }
        while (tjkVar3 != null) {
            Runnable runnable = tjkVar3.a;
            tjk tjkVar4 = tjkVar3.c;
            f(runnable, tjkVar3.b);
            tjkVar3 = tjkVar4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            I.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", ij0.k("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    public static final Object h(Object obj) throws ExecutionException {
        if (obj instanceof z6k) {
            Throwable th = ((z6k) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).a);
        }
        if (obj == K) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String b() {
        if (this instanceof ScheduledFuture) {
            return grc.q(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), "remaining delay=[", " ms]");
        }
        return null;
    }

    @Override // defpackage.x3k
    public final void c(Runnable runnable, Executor executor) {
        executor.getClass();
        tjk tjkVar = this.F;
        tjk tjkVar2 = tjk.d;
        if (tjkVar != tjkVar2) {
            tjk tjkVar3 = new tjk(runnable, executor);
            do {
                tjkVar3.c = tjkVar;
                if (J.o(this, tjkVar, tjkVar3)) {
                    return;
                } else {
                    tjkVar = this.F;
                }
            } while (tjkVar != tjkVar2);
        }
        f(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.E;
        if (obj != null) {
            return false;
        }
        if (!J.p(this, obj, H ? new z6k(new CancellationException("Future.cancel() was called.")) : z ? z6k.b : z6k.c)) {
            return false;
        }
        d(this);
        return true;
    }

    public final void e(StringBuilder sb) {
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
            } catch (RuntimeException e) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append("]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    public final void g(yyk yykVar) {
        yykVar.a = null;
        while (true) {
            yyk yykVar2 = this.G;
            if (yykVar2 != yyk.c) {
                yyk yykVar3 = null;
                while (yykVar2 != null) {
                    yyk yykVar4 = yykVar2.b;
                    if (yykVar2.a != null) {
                        yykVar3 = yykVar2;
                    } else if (yykVar3 != null) {
                        yykVar3.b = yykVar4;
                        if (yykVar3.a == null) {
                            break;
                        }
                    } else if (!J.q(this, yykVar2, yykVar4)) {
                        break;
                    }
                    yykVar2 = yykVar4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.E;
        if (obj != null) {
            return h(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            yyk yykVar = this.G;
            yyk yykVar2 = yyk.c;
            if (yykVar != yykVar2) {
                yyk yykVar3 = new yyk();
                do {
                    wpk wpkVar = J;
                    wpkVar.m(yykVar3, yykVar);
                    if (wpkVar.q(this, yykVar, yykVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                g(yykVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.E;
                            if (obj2 != null) {
                                return h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        g(yykVar3);
                    } else {
                        yykVar = this.G;
                    }
                } while (yykVar != yykVar2);
            }
            return h(this.E);
        }
        while (nanos > 0) {
            Object obj3 = this.E;
            if (obj3 != null) {
                return h(obj3);
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
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = true;
            if (jConvert != 0 && nanos2 <= 1000) {
                z = false;
            }
            if (jConvert > 0) {
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

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.E instanceof z6k;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.E != null;
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.E instanceof z6k) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            e(sb);
        } else {
            try {
                strConcat = b();
            } catch (RuntimeException e) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e.getClass()));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strConcat);
                sb.append("]");
            } else if (isDone()) {
                e(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.E;
            if (obj2 != null) {
                return h(obj2);
            }
            yyk yykVar = this.G;
            yyk yykVar2 = yyk.c;
            if (yykVar != yykVar2) {
                yyk yykVar3 = new yyk();
                do {
                    wpk wpkVar = J;
                    wpkVar.m(yykVar3, yykVar);
                    if (wpkVar.q(this, yykVar, yykVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.E;
                            } else {
                                g(yykVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return h(obj);
                    }
                    yykVar = this.G;
                } while (yykVar != yykVar2);
            }
            return h(this.E);
        }
        throw new InterruptedException();
    }
}
