package defpackage;

import com.google.common.util.concurrent.a;
import java.util.Locale;
import java.util.Objects;
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
public abstract class w1 implements saa {
    public static final boolean H;
    public static final b1a I;
    public static final ijk J;
    public static final Object K;
    public volatile Object E;
    public volatile k1 F;
    public volatile v1 G;

    static {
        boolean z;
        Throwable th;
        ijk n1Var;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        H = z;
        I = new b1a(0, w1.class);
        Throwable th2 = null;
        try {
            n1Var = new u1();
            th = null;
        } catch (Error | Exception e) {
            th = e;
            try {
                n1Var = new l1(AtomicReferenceFieldUpdater.newUpdater(v1.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(v1.class, v1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(w1.class, v1.class, "G"), AtomicReferenceFieldUpdater.newUpdater(w1.class, k1.class, "F"), AtomicReferenceFieldUpdater.newUpdater(w1.class, Object.class, "E"));
            } catch (Error | Exception e2) {
                th2 = e2;
                n1Var = new n1();
            }
        }
        J = n1Var;
        if (th2 != null) {
            b1a b1aVar = I;
            Logger loggerA = b1aVar.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th);
            b1aVar.a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        K = new Object();
    }

    public static void f(w1 w1Var, boolean z) {
        k1 k1Var = null;
        while (true) {
            for (v1 v1VarH = J.h(w1Var); v1VarH != null; v1VarH = v1VarH.b) {
                Thread thread = v1VarH.a;
                if (thread != null) {
                    v1VarH.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                z = false;
            }
            w1Var.d();
            k1 k1Var2 = k1Var;
            k1 k1VarG = J.g(w1Var);
            k1 k1Var3 = k1Var2;
            while (k1VarG != null) {
                k1 k1Var4 = k1VarG.c;
                k1VarG.c = k1Var3;
                k1Var3 = k1VarG;
                k1VarG = k1Var4;
            }
            while (k1Var3 != null) {
                k1Var = k1Var3.c;
                Runnable runnable = k1Var3.a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof m1) {
                    m1 m1Var = (m1) runnable;
                    w1Var = m1Var.E;
                    if (w1Var.E == m1Var) {
                        if (J.c(w1Var, m1Var, i(m1Var.F))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = k1Var3.b;
                    Objects.requireNonNull(executor);
                    g(runnable, executor);
                }
                k1Var3 = k1Var;
            }
            return;
        }
    }

    public static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            I.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object h(Object obj) throws ExecutionException {
        if (obj instanceof j1) {
            Throwable th = ((j1) obj).b;
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

    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object i(defpackage.saa r6) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w1.i(saa):java.lang.Object");
    }

    @Override // defpackage.saa
    public void a(Runnable runnable, Executor executor) {
        k1 k1Var;
        k1 k1Var2 = k1.d;
        if (!isDone() && (k1Var = this.F) != k1Var2) {
            k1 k1Var3 = new k1(runnable, executor);
            do {
                k1Var3.c = k1Var;
                if (J.b(this, k1Var, k1Var3)) {
                    return;
                } else {
                    k1Var = this.F;
                }
            } while (k1Var != k1Var2);
        }
        g(runnable, executor);
    }

    public final void b(StringBuilder sb) {
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
        e(sb, obj);
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        j1 j1Var;
        Object obj = this.E;
        if (!(obj == null) && !(obj instanceof m1)) {
            return false;
        }
        if (H) {
            j1Var = new j1(new CancellationException("Future.cancel() was called."), z);
        } else {
            j1Var = z ? j1.c : j1.d;
            Objects.requireNonNull(j1Var);
        }
        boolean z2 = false;
        while (true) {
            if (J.c(this, obj, j1Var)) {
                f(this, z);
                if (!(obj instanceof m1)) {
                    break;
                }
                saa saaVar = ((m1) obj).F;
                if (!(saaVar instanceof o1)) {
                    saaVar.cancel(z);
                    break;
                }
                this = (w1) saaVar;
                obj = this.E;
                if (!(obj == null) && !(obj instanceof m1)) {
                    break;
                }
                z2 = true;
            } else {
                obj = this.E;
                if (!(obj instanceof m1)) {
                    return z2;
                }
            }
        }
        return true;
    }

    public void d() {
    }

    public final void e(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        long j2;
        v1 v1Var = v1.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.E;
        if ((obj != null) && (!(obj instanceof m1))) {
            return h(obj);
        }
        long j3 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            v1 v1Var2 = this.G;
            if (v1Var2 != v1Var) {
                v1 v1Var3 = new v1();
                z = true;
                while (true) {
                    ijk ijkVar = J;
                    ijkVar.i(v1Var3, v1Var2);
                    if (ijkVar.d(this, v1Var2, v1Var3)) {
                        j2 = j3;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                k(v1Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.E;
                            if ((obj2 != null) && (!(obj2 instanceof m1))) {
                                return h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        k(v1Var3);
                    } else {
                        long j4 = j3;
                        v1Var2 = this.G;
                        if (v1Var2 == v1Var) {
                            break;
                        }
                        j3 = j4;
                    }
                }
            }
            Object obj3 = this.E;
            Objects.requireNonNull(obj3);
            return h(obj3);
        }
        z = true;
        j2 = 0;
        while (nanos > j2) {
            Object obj4 = this.E;
            if ((obj4 != null ? z : false) && (!(obj4 instanceof m1))) {
                return h(obj4);
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
        if (nanos + 1000 < j2) {
            String strConcat = string3.concat(" (plus ");
            long j5 = -nanos;
            long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(jConvert);
            boolean z2 = (jConvert == j2 || nanos2 > 1000) ? z : false;
            if (jConvert > j2) {
                String strConcat2 = strConcat + jConvert + " " + lowerCase;
                if (z2) {
                    strConcat2 = strConcat2.concat(",");
                }
                strConcat = strConcat2.concat(" ");
            }
            if (z2) {
                strConcat = strConcat + nanos2 + " nanoseconds ";
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(ij0.C(string3, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.E instanceof j1;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r2 instanceof m1)) & (this.E != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String j() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void k(v1 v1Var) {
        v1Var.a = null;
        while (true) {
            v1 v1Var2 = this.G;
            if (v1Var2 == v1.c) {
                return;
            }
            v1 v1Var3 = null;
            while (v1Var2 != null) {
                v1 v1Var4 = v1Var2.b;
                if (v1Var2.a != null) {
                    v1Var3 = v1Var2;
                } else if (v1Var3 != null) {
                    v1Var3.b = v1Var4;
                    if (v1Var3.a == null) {
                        break;
                    }
                } else if (!J.d(this, v1Var2, v1Var4)) {
                    break;
                }
                v1Var2 = v1Var4;
            }
            return;
        }
    }

    public boolean l(Object obj) {
        if (obj == null) {
            obj = K;
        }
        if (!J.c(this, null, obj)) {
            return false;
        }
        f(this, false);
        return true;
    }

    public boolean m(Throwable th) {
        th.getClass();
        if (!J.c(this, null, new a(th))) {
            return false;
        }
        f(this, false);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w1.toString():java.lang.String");
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        v1 v1Var = v1.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.E;
            if ((obj2 != null) & (!(obj2 instanceof m1))) {
                return h(obj2);
            }
            v1 v1Var2 = this.G;
            if (v1Var2 != v1Var) {
                v1 v1Var3 = new v1();
                do {
                    ijk ijkVar = J;
                    ijkVar.i(v1Var3, v1Var2);
                    if (ijkVar.d(this, v1Var2, v1Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.E;
                            } else {
                                k(v1Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof m1))));
                        return h(obj);
                    }
                    v1Var2 = this.G;
                } while (v1Var2 != v1Var);
            }
            Object obj3 = this.E;
            Objects.requireNonNull(obj3);
            return h(obj3);
        }
        throw new InterruptedException();
    }
}
