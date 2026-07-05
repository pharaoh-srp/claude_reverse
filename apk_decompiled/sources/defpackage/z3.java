package defpackage;

import androidx.concurrent.futures.a;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class z3 implements saa {
    public static final boolean H = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger I = Logger.getLogger(z3.class.getName());
    public static final gb9 J;
    public static final Object K;
    public volatile Object E;
    public volatile v3 F;
    public volatile y3 G;

    static {
        gb9 x3Var;
        try {
            x3Var = new w3(AtomicReferenceFieldUpdater.newUpdater(y3.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(y3.class, y3.class, "b"), AtomicReferenceFieldUpdater.newUpdater(z3.class, y3.class, "G"), AtomicReferenceFieldUpdater.newUpdater(z3.class, v3.class, "F"), AtomicReferenceFieldUpdater.newUpdater(z3.class, Object.class, "E"));
            th = null;
        } catch (Throwable th) {
            th = th;
            x3Var = new x3();
        }
        J = x3Var;
        if (th != null) {
            I.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        K = new Object();
    }

    public static void e(z3 z3Var) {
        y3 y3Var;
        v3 v3Var;
        v3 v3Var2;
        v3 v3Var3;
        do {
            y3Var = z3Var.G;
        } while (!J.p(z3Var, y3Var, y3.c));
        while (true) {
            v3Var = null;
            if (y3Var == null) {
                break;
            }
            Thread thread = y3Var.a;
            if (thread != null) {
                y3Var.a = null;
                LockSupport.unpark(thread);
            }
            y3Var = y3Var.b;
        }
        z3Var.d();
        do {
            v3Var2 = z3Var.F;
        } while (!J.n(z3Var, v3Var2, v3.d));
        while (true) {
            v3Var3 = v3Var;
            v3Var = v3Var2;
            if (v3Var == null) {
                break;
            }
            v3Var2 = v3Var.c;
            v3Var.c = v3Var3;
        }
        while (v3Var3 != null) {
            v3 v3Var4 = v3Var3.c;
            f(v3Var3.a, v3Var3.b);
            v3Var3 = v3Var4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            I.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object g(Object obj) throws ExecutionException {
        if (obj instanceof u3) {
            Throwable th = ((u3) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof a) {
            throw new ExecutionException(((a) obj).a);
        }
        if (obj == K) {
            return null;
        }
        return obj;
    }

    public static Object h(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // defpackage.saa
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        v3 v3Var = this.F;
        v3 v3Var2 = v3.d;
        if (v3Var != v3Var2) {
            v3 v3Var3 = new v3(runnable, executor);
            do {
                v3Var3.c = v3Var;
                if (J.n(this, v3Var, v3Var3)) {
                    return;
                } else {
                    v3Var = this.F;
                }
            } while (v3Var != v3Var2);
        }
        f(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        try {
            Object objH = h(this);
            sb.append("SUCCESS, result=[");
            sb.append(objH == this ? "this future" : String.valueOf(objH));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.E;
        if (obj == null) {
            if (J.o(this, obj, H ? new u3(new CancellationException("Future.cancel() was called."), z) : z ? u3.c : u3.d)) {
                e(this);
                return true;
            }
        }
        return false;
    }

    public void d() {
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        y3 y3Var = y3.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.E;
        if (obj != null) {
            return g(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            y3 y3Var2 = this.G;
            if (y3Var2 != y3Var) {
                y3 y3Var3 = new y3();
                do {
                    gb9 gb9Var = J;
                    gb9Var.P(y3Var3, y3Var2);
                    if (gb9Var.p(this, y3Var2, y3Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                j(y3Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.E;
                            if (obj2 != null) {
                                return g(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        j(y3Var3);
                    } else {
                        y3Var2 = this.G;
                    }
                } while (y3Var2 != y3Var);
            }
            return g(this.E);
        }
        while (nanos > 0) {
            Object obj3 = this.E;
            if (obj3 != null) {
                return g(obj3);
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
        StringBuilder sbW = grc.w(j, "Waited ", " ");
        sbW.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbW.toString();
        if (nanos + 1000 < 0) {
            String strConcat = string3.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strConcat2 = strConcat + jConvert + " " + lowerCase;
                if (z) {
                    strConcat2 = strConcat2.concat(",");
                }
                strConcat = strConcat2.concat(" ");
            }
            if (z) {
                strConcat = strConcat + nanos2 + " nanoseconds ";
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(ij0.C(string3, " for ", string));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String i() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.E instanceof u3;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.E != null;
    }

    public final void j(y3 y3Var) {
        y3Var.a = null;
        while (true) {
            y3 y3Var2 = this.G;
            if (y3Var2 == y3.c) {
                return;
            }
            y3 y3Var3 = null;
            while (y3Var2 != null) {
                y3 y3Var4 = y3Var2.b;
                if (y3Var2.a != null) {
                    y3Var3 = y3Var2;
                } else if (y3Var3 != null) {
                    y3Var3.b = y3Var4;
                    if (y3Var3.a == null) {
                        break;
                    }
                } else if (!J.p(this, y3Var2, y3Var4)) {
                    break;
                }
                y3Var2 = y3Var4;
            }
            return;
        }
    }

    public boolean k(Object obj) {
        if (obj == null) {
            obj = K;
        }
        if (!J.o(this, null, obj)) {
            return false;
        }
        e(this);
        return true;
    }

    public boolean l(Throwable th) {
        th.getClass();
        if (!J.o(this, null, new a(th))) {
            return false;
        }
        e(this);
        return true;
    }

    public final String toString() {
        String strI;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.E instanceof u3) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                strI = i();
            } catch (RuntimeException e) {
                strI = "Exception thrown from implementation: " + e.getClass();
            }
            if (strI != null && !strI.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strI);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
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
        y3 y3Var = y3.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.E;
            if (obj2 != null) {
                return g(obj2);
            }
            y3 y3Var2 = this.G;
            if (y3Var2 != y3Var) {
                y3 y3Var3 = new y3();
                do {
                    gb9 gb9Var = J;
                    gb9Var.P(y3Var3, y3Var2);
                    if (gb9Var.p(this, y3Var2, y3Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.E;
                            } else {
                                j(y3Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return g(obj);
                    }
                    y3Var2 = this.G;
                } while (y3Var2 != y3Var);
            }
            return g(this.E);
        }
        throw new InterruptedException();
    }
}
