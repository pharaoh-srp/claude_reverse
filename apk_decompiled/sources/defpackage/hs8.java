package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.Buffer;
import okio.BufferedSink;
import okio.RealBufferedSink;

/* JADX INFO: loaded from: classes.dex */
public final class hs8 implements Closeable {
    public static final Logger J = Logger.getLogger(rr8.class.getName());
    public final BufferedSink E;
    public final Buffer F;
    public int G;
    public boolean H;
    public final tp8 I;

    public hs8(RealBufferedSink realBufferedSink) {
        realBufferedSink.getClass();
        this.E = realBufferedSink;
        Buffer buffer = new Buffer();
        this.F = buffer;
        this.G = 16384;
        this.I = new tp8(buffer);
    }

    public final void c(dyf dyfVar) {
        dyfVar.getClass();
        synchronized (this) {
            try {
                if (this.H) {
                    throw new IOException("closed");
                }
                int i = this.G;
                int i2 = dyfVar.a;
                if ((i2 & 32) != 0) {
                    i = dyfVar.b[5];
                }
                this.G = i;
                if (((i2 & 2) != 0 ? dyfVar.b[1] : -1) != -1) {
                    tp8 tp8Var = this.I;
                    int i3 = (i2 & 2) != 0 ? dyfVar.b[1] : -1;
                    tp8Var.getClass();
                    int iMin = Math.min(i3, 16384);
                    int i4 = tp8Var.d;
                    if (i4 != iMin) {
                        if (iMin < i4) {
                            tp8Var.b = Math.min(tp8Var.b, iMin);
                        }
                        tp8Var.c = true;
                        tp8Var.d = iMin;
                        int i5 = tp8Var.h;
                        if (iMin < i5) {
                            if (iMin == 0) {
                                tg8[] tg8VarArr = tp8Var.e;
                                mp0.z0(0, tg8VarArr.length, null, tg8VarArr);
                                tp8Var.f = tp8Var.e.length - 1;
                                tp8Var.g = 0;
                                tp8Var.h = 0;
                            } else {
                                tp8Var.a(i5 - iMin);
                            }
                        }
                    }
                }
                e(0, 0, 4, 1);
                this.E.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.H = true;
            this.E.close();
        }
    }

    public final void d(boolean z, int i, Buffer buffer, int i2) {
        synchronized (this) {
            if (this.H) {
                throw new IOException("closed");
            }
            e(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                BufferedSink bufferedSink = this.E;
                buffer.getClass();
                bufferedSink.c0(buffer, i2);
            }
        }
    }

    public final void e(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Level level = Level.FINE;
            Logger logger = J;
            if (logger.isLoggable(level)) {
                logger.fine(rr8.b(false, i, i2, i3, i4));
            }
        }
        if (i2 > this.G) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.G + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            mr9.q(grc.p(i, "reserved bit set: "));
            return;
        }
        byte[] bArr = zkj.a;
        BufferedSink bufferedSink = this.E;
        bufferedSink.getClass();
        bufferedSink.writeByte((i2 >>> 16) & 255);
        bufferedSink.writeByte((i2 >>> 8) & 255);
        bufferedSink.writeByte(i2 & 255);
        bufferedSink.writeByte(i3 & 255);
        bufferedSink.writeByte(i4 & 255);
        bufferedSink.writeInt(i & Integer.MAX_VALUE);
    }

    public final void f(int i, xr6 xr6Var, byte[] bArr) {
        synchronized (this) {
            if (this.H) {
                throw new IOException("closed");
            }
            if (xr6Var.E == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            e(0, bArr.length + 8, 7, 0);
            this.E.writeInt(i);
            this.E.writeInt(xr6Var.E);
            if (bArr.length != 0) {
                this.E.write(bArr);
            }
            this.E.flush();
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.H) {
                throw new IOException("closed");
            }
            this.E.flush();
        }
    }

    public final void i(boolean z, int i, ArrayList arrayList) {
        synchronized (this) {
            if (this.H) {
                throw new IOException("closed");
            }
            this.I.d(arrayList);
            long j = this.F.F;
            long jMin = Math.min(this.G, j);
            int i2 = j == jMin ? 4 : 0;
            if (z) {
                i2 |= 1;
            }
            e(i, (int) jMin, 1, i2);
            this.E.c0(this.F, jMin);
            if (j > jMin) {
                long j2 = j - jMin;
                while (j2 > 0) {
                    long jMin2 = Math.min(this.G, j2);
                    j2 -= jMin2;
                    e(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                    this.E.c0(this.F, jMin2);
                }
            }
        }
    }

    public final void j(int i, int i2, boolean z) {
        synchronized (this) {
            if (this.H) {
                throw new IOException("closed");
            }
            e(0, 8, 6, z ? 1 : 0);
            this.E.writeInt(i);
            this.E.writeInt(i2);
            this.E.flush();
        }
    }

    public final void n(int i, xr6 xr6Var) {
        synchronized (this) {
            if (this.H) {
                throw new IOException("closed");
            }
            if (xr6Var.E == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            e(i, 4, 3, 0);
            this.E.writeInt(xr6Var.E);
            this.E.flush();
        }
    }

    public final void x(int i, long j) {
        synchronized (this) {
            try {
                if (this.H) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger = J;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(rr8.c(i, 4, j, false));
                }
                e(i, 4, 8, 0);
                this.E.writeInt((int) j);
                this.E.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
