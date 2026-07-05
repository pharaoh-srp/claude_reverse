package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import okio.RealBufferedSink;
import okio.RealBufferedSource;

/* JADX INFO: loaded from: classes.dex */
public final class zr8 implements Closeable {
    public static final dyf e0;
    public final xr8 E;
    public final LinkedHashMap F = new LinkedHashMap();
    public final String G;
    public int H;
    public int I;
    public boolean J;
    public final q7h K;
    public final m7h L;
    public final m7h M;
    public final m7h N;
    public final a5 O;
    public long P;
    public long Q;
    public long R;
    public long S;
    public long T;
    public final mp7 U;
    public final dyf V;
    public dyf W;
    public final nbj X;
    public long Y;
    public long Z;
    public final fj0 a0;
    public final hs8 b0;
    public final yr8 c0;
    public final LinkedHashSet d0;

    static {
        dyf dyfVar = new dyf();
        dyfVar.b(4, 65535);
        dyfVar.b(5, 16384);
        e0 = dyfVar;
    }

    public zr8(vr8 vr8Var) {
        this.E = (xr8) vr8Var.e;
        String str = (String) vr8Var.d;
        if (str == null) {
            x44.o0("connectionName");
            throw null;
        }
        this.G = str;
        this.I = 3;
        q7h q7hVar = (q7h) vr8Var.b;
        this.K = q7hVar;
        m7h m7hVarD = q7hVar.d();
        this.L = m7hVarD;
        this.M = q7hVar.d();
        this.N = q7hVar.d();
        this.O = a5.M;
        this.U = (mp7) vr8Var.f;
        dyf dyfVar = new dyf();
        dyfVar.b(4, 16777216);
        this.V = dyfVar;
        this.W = e0;
        this.X = new nbj(0);
        this.Z = r2.a();
        fj0 fj0Var = (fj0) vr8Var.c;
        if (fj0Var == null) {
            x44.o0("socket");
            throw null;
        }
        this.a0 = fj0Var;
        this.b0 = new hs8((RealBufferedSink) fj0Var.G);
        this.c0 = new yr8(this, new cs8((RealBufferedSource) fj0Var.F));
        this.d0 = new LinkedHashSet();
        int i = vr8Var.a;
        if (i != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            m7hVarD.c(new o5e(new r60(this, nanos, 1), str.concat(" ping")), nanos);
        }
    }

    public final void c(xr6 xr6Var, xr6 xr6Var2, IOException iOException) {
        int i;
        Object[] array;
        TimeZone timeZone = blj.a;
        try {
            f(xr6Var);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.F.isEmpty()) {
                array = null;
            } else {
                array = this.F.values().toArray(new gs8[0]);
                this.F.clear();
            }
        }
        gs8[] gs8VarArr = (gs8[]) array;
        if (gs8VarArr != null) {
            for (gs8 gs8Var : gs8VarArr) {
                try {
                    gs8Var.c(xr6Var2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.b0.close();
        } catch (IOException unused3) {
        }
        try {
            this.a0.cancel();
        } catch (IOException unused4) {
        }
        this.L.e();
        this.M.e();
        this.N.e();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c(xr6.NO_ERROR, xr6.CANCEL, null);
    }

    public final gs8 d(int i) {
        gs8 gs8Var;
        synchronized (this) {
            gs8Var = (gs8) this.F.get(Integer.valueOf(i));
        }
        return gs8Var;
    }

    public final gs8 e(int i) {
        gs8 gs8Var;
        synchronized (this) {
            gs8Var = (gs8) this.F.remove(Integer.valueOf(i));
            notifyAll();
        }
        return gs8Var;
    }

    public final void f(xr6 xr6Var) {
        synchronized (this.b0) {
            synchronized (this) {
                if (this.J) {
                    return;
                }
                this.J = true;
                this.b0.f(this.H, xr6Var, zkj.a);
            }
        }
    }

    public final void flush() {
        this.b0.flush();
    }

    public final void i(long j) {
        synchronized (this) {
            try {
                nbj.b(this.X, j, 0L, 2);
                long jA = this.X.a();
                if (jA >= this.V.a() / 2) {
                    x(0, jA);
                    nbj.b(this.X, 0L, jA, 1);
                }
                mp7 mp7Var = this.U;
                nbj nbjVar = this.X;
                mp7Var.getClass();
                nbjVar.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.b0.G);
        r6 = r2;
        r8.Y += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r9, boolean r10, okio.Buffer r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            hs8 r8 = r8.b0
            r8.d(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.Y     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r6 = r8.Z     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.F     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            goto L12
        L2a:
            r9 = move-exception
            goto L66
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            hs8 r4 = r8.b0     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.G     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.Y     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.Y = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            hs8 r4 = r8.b0
            if (r10 == 0) goto L54
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = r3
        L55:
            r4.d(r5, r9, r11, r2)
            goto Ld
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr8.j(int, boolean, okio.Buffer, long):void");
    }

    public final void n(int i, xr6 xr6Var) {
        m7h.b(this.L, this.G + '[' + i + "] writeSynReset", 0L, new aa3(this, i, xr6Var), 6);
    }

    public final void x(final int i, final long j) {
        m7h.b(this.L, this.G + '[' + i + "] windowUpdate", 0L, new zy7() { // from class: sr8
            @Override // defpackage.zy7
            public final Object a() {
                zr8 zr8Var = this.E;
                try {
                    zr8Var.b0.x(i, j);
                } catch (IOException e) {
                    xr6 xr6Var = xr6.PROTOCOL_ERROR;
                    zr8Var.c(xr6Var, xr6Var, e);
                }
                return iei.a;
            }
        }, 6);
    }
}
