package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class xba extends Handler implements Runnable {
    public final int E;
    public final bkd F;
    public final long G;
    public ekd H;
    public IOException I;
    public int J;
    public Thread K;
    public boolean L;
    public volatile boolean M;
    public final /* synthetic */ xv8 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xba(xv8 xv8Var, Looper looper, bkd bkdVar, ekd ekdVar, int i, long j) {
        super(looper);
        this.N = xv8Var;
        this.F = bkdVar;
        this.H = ekdVar;
        this.E = i;
        this.G = j;
    }

    public final void a(boolean z) {
        this.M = z;
        this.I = null;
        if (hasMessages(1)) {
            this.L = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.L = true;
                    this.F.g = true;
                    Thread thread = this.K;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.N.G = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ekd ekdVar = this.H;
            ekdVar.getClass();
            ekdVar.x(this.F, jElapsedRealtime, jElapsedRealtime - this.G, true);
            this.H = null;
        }
    }

    public final void b() {
        uba ubaVar;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ekd ekdVar = this.H;
        ekdVar.getClass();
        int i = this.J;
        bkd bkdVar = this.F;
        ymg ymgVar = bkdVar.b;
        if (i == 0) {
            ug5 ug5Var = bkdVar.j;
            ubaVar = new uba(ug5Var, ug5Var.a, Collections.EMPTY_MAP, jElapsedRealtime, 0L);
        } else {
            ubaVar = new uba(bkdVar.j, ymgVar.G, ymgVar.H, jElapsedRealtime, ymgVar.F);
        }
        tg6 tg6Var = ekdVar.I;
        tg6Var.a(new b8b(tg6Var, ubaVar, new l7b(-1, null, tpi.M(bkdVar.i), tpi.M(ekdVar.g0)), i));
        this.I = null;
        xv8 xv8Var = this.N;
        hee heeVar = (hee) xv8Var.F;
        xba xbaVar = (xba) xv8Var.G;
        xbaVar.getClass();
        heeVar.execute(xbaVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        long jMin;
        long j;
        k79 k79Var;
        vef vefVar;
        if (this.M) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            b();
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        this.N.G = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = jElapsedRealtime - this.G;
        ekd ekdVar = this.H;
        ekdVar.getClass();
        if (this.L) {
            ekdVar.x(this.F, jElapsedRealtime, j2, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 2) {
            try {
                ekdVar.y(this.F, jElapsedRealtime, j2);
                return;
            } catch (RuntimeException e) {
                ysj.k("LoadTask", "Unexpected exception handling load completed", e);
                this.N.H = new Loader$UnexpectedLoaderException(e);
                return;
            }
        }
        if (i2 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.I = iOException;
        int i3 = this.J + 1;
        this.J = i3;
        bkd bkdVar = this.F;
        ymg ymgVar = bkdVar.b;
        uba ubaVar = new uba(bkdVar.j, ymgVar.G, ymgVar.H, jElapsedRealtime, ymgVar.F);
        String str = tpi.a;
        ekdVar.H.getClass();
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof ParserException) || (cause instanceof FileNotFoundException) || (cause instanceof HttpDataSource$CleartextNotPermittedException) || (cause instanceof Loader$UnexpectedLoaderException) || ((cause instanceof DataSourceException) && ((DataSourceException) cause).E == 2008)) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i3 - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            k79Var = xv8.K;
            j = -9223372036854775807L;
        } else {
            int i4 = ekdVar.i();
            j = -9223372036854775807L;
            int i5 = i4 > ekdVar.s0 ? 1 : 0;
            if (ekdVar.o0 || !((vefVar = ekdVar.f0) == null || vefVar.g() == -9223372036854775807L)) {
                ekdVar.s0 = i4;
            } else if (!ekdVar.b0 || ekdVar.C()) {
                ekdVar.l0 = ekdVar.b0;
                ekdVar.p0 = 0L;
                ekdVar.s0 = 0;
                for (a4f a4fVar : ekdVar.Y) {
                    a4fVar.q(false);
                }
                bkdVar.f.a = 0L;
                bkdVar.i = 0L;
                bkdVar.h = true;
                bkdVar.l = false;
            } else {
                ekdVar.r0 = true;
                k79Var = xv8.J;
            }
            k79Var = new k79(i5, jMin);
        }
        int i6 = k79Var.a;
        boolean z = !(i6 == 0 || i6 == 1);
        tg6 tg6Var = ekdVar.I;
        tg6Var.a(new d8b(tg6Var, ubaVar, new l7b(-1, null, tpi.M(bkdVar.i), tpi.M(ekdVar.g0)), iOException, z));
        int i7 = k79Var.a;
        if (i7 == 3) {
            this.N.H = this.I;
            return;
        }
        if (i7 != 2) {
            if (i7 == 1) {
                this.J = 1;
            }
            long jMin2 = k79Var.b;
            if (jMin2 == j) {
                jMin2 = Math.min((this.J - 1) * 1000, 5000);
            }
            xv8 xv8Var = this.N;
            fd9.M(((xba) xv8Var.G) == null);
            xv8Var.G = this;
            if (jMin2 > 0) {
                sendEmptyMessageDelayed(1, jMin2);
            } else {
                b();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.L;
                this.K = Thread.currentThread();
            }
            if (!z) {
                Trace.beginSection("load:".concat(this.F.getClass().getSimpleName()));
                try {
                    this.F.b();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.K = null;
                Thread.interrupted();
            }
            if (this.M) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.M) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Exception e2) {
            if (this.M) {
                return;
            }
            ysj.k("LoadTask", "Unexpected exception loading stream", e2);
            obtainMessage(3, new Loader$UnexpectedLoaderException(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            if (this.M) {
                return;
            }
            ysj.k("LoadTask", "OutOfMemory error loading stream", e3);
            obtainMessage(3, new Loader$UnexpectedLoaderException(e3)).sendToTarget();
        } catch (Error e4) {
            if (!this.M) {
                ysj.k("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        }
    }
}
