package defpackage;

import androidx.media3.decoder.DecoderException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z6g implements po5 {
    public final y6g a;
    public final ro5[] e;
    public final so5[] f;
    public int g;
    public int h;
    public ro5 i;
    public DecoderException j;
    public boolean k;
    public boolean l;
    public final Object b = new Object();
    public long m = -9223372036854775807L;
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public z6g(ro5[] ro5VarArr, so5[] so5VarArr) {
        this.e = ro5VarArr;
        this.g = ro5VarArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = g();
        }
        this.f = so5VarArr;
        this.h = so5VarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = h();
        }
        y6g y6gVar = new y6g(this);
        this.a = y6gVar;
        y6gVar.start();
    }

    @Override // defpackage.po5
    public final void a() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // defpackage.po5
    public final void b(long j) {
        synchronized (this.b) {
            try {
                fd9.M(this.g == this.e.length || this.k);
                this.m = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.po5
    public final Object e() {
        ro5 ro5Var;
        synchronized (this.b) {
            try {
                DecoderException decoderException = this.j;
                if (decoderException != null) {
                    throw decoderException;
                }
                fd9.M(this.i == null);
                int i = this.g;
                if (i == 0) {
                    ro5Var = null;
                } else {
                    ro5[] ro5VarArr = this.e;
                    int i2 = i - 1;
                    this.g = i2;
                    ro5Var = ro5VarArr[i2];
                }
                this.i = ro5Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ro5Var;
    }

    @Override // defpackage.po5
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                ro5 ro5Var = this.i;
                if (ro5Var != null) {
                    ro5Var.e();
                    ro5[] ro5VarArr = this.e;
                    int i = this.g;
                    this.g = i + 1;
                    ro5VarArr[i] = ro5Var;
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    ro5 ro5Var2 = (ro5) this.c.removeFirst();
                    ro5Var2.e();
                    ro5[] ro5VarArr2 = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    ro5VarArr2[i2] = ro5Var2;
                }
                while (!this.d.isEmpty()) {
                    ((so5) this.d.removeFirst()).f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract ro5 g();

    public abstract so5 h();

    public abstract DecoderException i(Throwable th);

    public abstract DecoderException j(ro5 ro5Var, so5 so5Var, boolean z);

    public final boolean k() {
        boolean z;
        DecoderException decoderExceptionI;
        synchronized (this.b) {
            while (!this.l) {
                try {
                    if (!this.c.isEmpty() && this.h > 0) {
                        break;
                    }
                    this.b.wait();
                } finally {
                }
            }
            if (this.l) {
                return false;
            }
            ro5 ro5Var = (ro5) this.c.removeFirst();
            so5[] so5VarArr = this.f;
            int i = this.h - 1;
            this.h = i;
            so5 so5Var = so5VarArr[i];
            boolean z2 = this.k;
            this.k = false;
            if (ro5Var.c(4)) {
                so5Var.a(4);
            } else {
                so5Var.G = ro5Var.K;
                if (ro5Var.c(134217728)) {
                    so5Var.a(134217728);
                }
                long j = ro5Var.K;
                synchronized (this.b) {
                    long j2 = this.m;
                    z = j2 == -9223372036854775807L || j >= j2;
                }
                if (!z) {
                    so5Var.H = true;
                }
                try {
                    decoderExceptionI = j(ro5Var, so5Var, z2);
                } catch (OutOfMemoryError e) {
                    decoderExceptionI = i(e);
                } catch (RuntimeException e2) {
                    decoderExceptionI = i(e2);
                }
                if (decoderExceptionI != null) {
                    synchronized (this.b) {
                        this.j = decoderExceptionI;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k || so5Var.H) {
                        so5Var.f();
                    } else {
                        this.d.addLast(so5Var);
                    }
                    ro5Var.e();
                    ro5[] ro5VarArr = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    ro5VarArr[i2] = ro5Var;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // defpackage.po5
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final so5 d() {
        synchronized (this.b) {
            try {
                DecoderException decoderException = this.j;
                if (decoderException != null) {
                    throw decoderException;
                }
                if (this.d.isEmpty()) {
                    return null;
                }
                return (so5) this.d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.po5
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void f(ro5 ro5Var) {
        synchronized (this.b) {
            try {
                DecoderException decoderException = this.j;
                if (decoderException != null) {
                    throw decoderException;
                }
                fd9.E(ro5Var == this.i);
                this.c.addLast(ro5Var);
                if (!this.c.isEmpty() && this.h > 0) {
                    this.b.notify();
                }
                this.i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(so5 so5Var) {
        synchronized (this.b) {
            so5Var.e();
            so5[] so5VarArr = this.f;
            int i = this.h;
            this.h = i + 1;
            so5VarArr[i] = so5Var;
            if (!this.c.isEmpty() && this.h > 0) {
                this.b.notify();
            }
        }
    }
}
