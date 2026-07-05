package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class f4e implements v82, Cloneable {
    public final hdc E;
    public final kie F;
    public final boolean G;
    public final ak6 H;
    public volatile tz6 I;
    public final e4e J;
    public final AtomicBoolean K;
    public Object L;
    public z47 M;
    public g4e N;
    public boolean O;
    public w47 P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public volatile boolean V;
    public volatile w47 W;
    public final CopyOnWriteArrayList X;

    static {
        AtomicReferenceFieldUpdater.newUpdater(f4e.class, tz6.class, "I");
    }

    public f4e(hdc hdcVar, kie kieVar, boolean z) {
        hdcVar.getClass();
        kieVar.getClass();
        this.E = hdcVar;
        this.F = kieVar;
        this.G = z;
        this.H = (ak6) hdcVar.E.F;
        this.I = (tz6) hdcVar.d.F;
        e4e e4eVar = new e4e(this);
        e4eVar.i(hdcVar.v, TimeUnit.MILLISECONDS);
        this.J = e4eVar;
        this.K = new AtomicBoolean();
        this.U = true;
        this.X = new CopyOnWriteArrayList();
        new AtomicReference(kieVar.e);
    }

    public static final String a(f4e f4eVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(f4eVar.V ? "canceled " : "");
        sb.append(f4eVar.G ? "web socket" : "call");
        sb.append(" to ");
        sb.append(f4eVar.F.a.h());
        return sb.toString();
    }

    public final void b(g4e g4eVar) {
        g4eVar.getClass();
        TimeZone timeZone = blj.a;
        if (this.N != null) {
            sz6.j("Check failed.");
        } else {
            this.N = g4eVar;
            g4eVar.q.add(new d4e(this, this.L));
        }
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket socketK;
        TimeZone timeZone = blj.a;
        g4e g4eVar = this.N;
        if (g4eVar != null) {
            synchronized (g4eVar) {
                socketK = k();
            }
            if (this.N == null) {
                if (socketK != null) {
                    blj.d(socketK);
                }
                this.I.k(this, g4eVar);
            } else if (socketK != null) {
                sz6.j("Check failed.");
                return null;
            }
        }
        if (!this.O && this.J.l()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        tz6 tz6Var = this.I;
        if (iOException == null) {
            tz6Var.c(this);
            return interruptedIOException;
        }
        interruptedIOException.getClass();
        tz6Var.d(this, interruptedIOException);
        return interruptedIOException;
    }

    public final void cancel() {
        if (this.V) {
            return;
        }
        this.V = true;
        w47 w47Var = this.W;
        if (w47Var != null) {
            ((y47) w47Var.e).cancel();
        }
        Iterator it = this.X.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((hwe) it.next()).cancel();
        }
        this.I.f(this);
    }

    public final Object clone() {
        return new f4e(this.E, this.F, this.G);
    }

    public final void d(i92 i92Var) {
        i92Var.getClass();
        if (!this.K.compareAndSet(false, true)) {
            sz6.j("Already Executed");
            return;
        }
        s4d s4dVar = s4d.a;
        this.L = s4d.a.g();
        this.I.e(this);
        dpf dpfVar = this.E.a;
        c4e c4eVar = new c4e(this, i92Var);
        dpfVar.getClass();
        dpf.T(dpfVar, c4eVar, null, null, 6);
    }

    public final pqe f() {
        if (!this.K.compareAndSet(false, true)) {
            sz6.j("Already Executed");
            return null;
        }
        this.J.k();
        s4d s4dVar = s4d.a;
        this.L = s4d.a.g();
        this.I.e(this);
        try {
            dpf dpfVar = this.E.a;
            synchronized (dpfVar) {
                ((ArrayDeque) dpfVar.H).add(this);
            }
            return h();
        } finally {
            dpf dpfVar2 = this.E.a;
            dpfVar2.getClass();
            dpf.T(dpfVar2, null, this, null, 5);
        }
    }

    public final void g(boolean z) {
        w47 w47Var;
        synchronized (this) {
            if (!this.U) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (w47Var = this.W) != null) {
            ((y47) w47Var.e).cancel();
            ((f4e) w47Var.c).i(w47Var, true, true, true, true, null);
        }
        this.P = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.pqe h() {
        /*
            r22 = this;
            r1 = r22
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            hdc r0 = r1.E
            java.util.List r0 = r0.b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            defpackage.b54.t0(r2, r0)
            b92 r0 = new b92
            r3 = 4
            r0.<init>(r3)
            r2.add(r0)
            b92 r0 = new b92
            r3 = 2
            r0.<init>(r3)
            r2.add(r0)
            b92 r0 = new b92
            r3 = 3
            r0.<init>(r3)
            r2.add(r0)
            b92 r0 = defpackage.b92.G
            r2.add(r0)
            boolean r0 = r1.G
            if (r0 != 0) goto L3d
            hdc r0 = r1.E
            java.util.List r0 = r0.c
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            defpackage.b54.t0(r2, r0)
        L3d:
            b92 r0 = defpackage.b92.F
            r2.add(r0)
            v4e r0 = new v4e
            kie r5 = r1.F
            hdc r3 = r1.E
            r5.getClass()
            r3.getClass()
            int r6 = r3.w
            int r7 = r3.x
            int r8 = r3.y
            ql8 r9 = r3.g
            jg2 r10 = r3.t
            gmf r11 = r3.E
            i25 r12 = r3.j
            m96 r13 = r3.k
            ycc r14 = r3.s
            ql8 r15 = r3.m
            java.net.ProxySelector r4 = r3.l
            r16 = r0
            boolean r0 = r3.e
            r17 = r0
            javax.net.SocketFactory r0 = r3.n
            r18 = r0
            javax.net.ssl.SSLSocketFactory r0 = r3.o
            r19 = r0
            javax.net.ssl.X509TrustManager r0 = r3.p
            zh4 r3 = r3.u
            r21 = r3
            r3 = 0
            r20 = r0
            r0 = r16
            r16 = r4
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r2 = 0
            r3 = 0
            kie r4 = r1.F     // Catch: java.lang.Throwable -> L9e java.io.IOException -> La0
            pqe r0 = r0.b(r4)     // Catch: java.lang.Throwable -> L9e java.io.IOException -> La0
            boolean r4 = r1.V     // Catch: java.lang.Throwable -> L9e java.io.IOException -> La0
            if (r4 != 0) goto L93
            r1.j(r2)
            return r0
        L93:
            defpackage.zkj.b(r0)     // Catch: java.lang.Throwable -> L9e java.io.IOException -> La0
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L9e java.io.IOException -> La0
            java.lang.String r4 = "Canceled"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L9e java.io.IOException -> La0
            throw r0     // Catch: java.lang.Throwable -> L9e java.io.IOException -> La0
        L9e:
            r0 = move-exception
            goto Laa
        La0:
            r0 = move-exception
            r3 = 1
            java.io.IOException r0 = r1.j(r0)     // Catch: java.lang.Throwable -> L9e
            r0.getClass()     // Catch: java.lang.Throwable -> L9e
            throw r0     // Catch: java.lang.Throwable -> L9e
        Laa:
            if (r3 != 0) goto Laf
            r1.j(r2)
        Laf:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f4e.h():pqe");
    }

    public final IOException i(w47 w47Var, boolean z, boolean z2, boolean z3, boolean z4, IOException iOException) {
        boolean z5;
        boolean z6;
        w47Var.getClass();
        if (w47Var.equals(this.W)) {
            synchronized (this) {
                z5 = false;
                if (z) {
                    try {
                        if (!this.Q) {
                            if ((z2 || !this.R) && ((!z4 || !this.S) && (!z3 || !this.T))) {
                            }
                        }
                        if (z) {
                            this.Q = false;
                        }
                        if (z2) {
                            this.R = false;
                        }
                        if (z4) {
                            this.S = false;
                        }
                        if (z3) {
                            this.T = false;
                        }
                        boolean z7 = (this.Q || this.R || this.S || this.T) ? false : true;
                        if (z7) {
                            if (!this.U) {
                                z5 = true;
                            }
                        }
                        boolean z8 = z5;
                        z5 = z7;
                        z6 = z8;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    z6 = z2 ? false : false;
                }
            }
            if (z5) {
                this.W = null;
                g4e g4eVar = this.N;
                if (g4eVar != null) {
                    synchronized (g4eVar) {
                        g4eVar.n++;
                    }
                }
            }
            if (z6) {
                return c(iOException);
            }
        }
        return iOException;
    }

    public final IOException j(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.U) {
                this.U = false;
                if (!this.Q && !this.R && !this.S) {
                    if (!this.T) {
                        z = true;
                    }
                }
            }
        }
        return z ? c(iOException) : iOException;
    }

    public final Socket k() {
        g4e g4eVar = this.N;
        g4eVar.getClass();
        TimeZone timeZone = blj.a;
        ArrayList arrayList = g4eVar.q;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (x44.r(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            sz6.j("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.N = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        g4eVar.r = System.nanoTime();
        ak6 ak6Var = this.H;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) ak6Var.e;
        TimeZone timeZone2 = blj.a;
        if (!g4eVar.k) {
            ((m7h) ak6Var.c).c((h4e) ak6Var.d, 0L);
            return null;
        }
        g4eVar.k = true;
        concurrentLinkedQueue.remove(g4eVar);
        if (concurrentLinkedQueue.isEmpty()) {
            m7h m7hVar = (m7h) ak6Var.c;
            synchronized (m7hVar.a) {
                if (m7hVar.a()) {
                    m7hVar.a.c(m7hVar);
                }
            }
        }
        return g4eVar.e;
    }
}
