package defpackage;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class p11 implements f6b {
    public static final ArrayDeque K = new ArrayDeque();
    public static final Object L = new Object();
    public final MediaCodec E;
    public final HandlerThread F;
    public xs G;
    public final AtomicReference H;
    public final hf4 I;
    public boolean J;

    public p11(MediaCodec mediaCodec, HandlerThread handlerThread) {
        hf4 hf4Var = new hf4();
        this.E = mediaCodec;
        this.F = handlerThread;
        this.I = hf4Var;
        this.H = new AtomicReference();
    }

    public static o11 a() {
        ArrayDeque arrayDeque = K;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new o11();
                }
                return (o11) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.f6b
    public final void b(Bundle bundle) {
        h();
        xs xsVar = this.G;
        String str = tpi.a;
        xsVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // defpackage.f6b
    public final void c(int i, rc5 rc5Var, long j, int i2) {
        h();
        o11 o11VarA = a();
        o11VarA.a = i;
        o11VarA.b = 0;
        o11VarA.d = j;
        o11VarA.e = i2;
        MediaCodec.CryptoInfo cryptoInfo = o11VarA.c;
        cryptoInfo.numSubSamples = rc5Var.f;
        int[] iArr = rc5Var.d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = rc5Var.e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = rc5Var.b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = rc5Var.a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = rc5Var.c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(rc5Var.g, rc5Var.h));
        xs xsVar = this.G;
        String str = tpi.a;
        xsVar.obtainMessage(2, o11VarA).sendToTarget();
    }

    @Override // defpackage.f6b
    public final void d(int i, int i2, int i3, long j) {
        h();
        o11 o11VarA = a();
        o11VarA.a = i;
        o11VarA.b = i2;
        o11VarA.d = j;
        o11VarA.e = i3;
        xs xsVar = this.G;
        String str = tpi.a;
        xsVar.obtainMessage(1, o11VarA).sendToTarget();
    }

    @Override // defpackage.f6b
    public final void flush() {
        if (this.J) {
            try {
                xs xsVar = this.G;
                xsVar.getClass();
                xsVar.removeCallbacksAndMessages(null);
                hf4 hf4Var = this.I;
                synchronized (hf4Var) {
                    hf4Var.b = false;
                }
                xs xsVar2 = this.G;
                xsVar2.getClass();
                xsVar2.obtainMessage(3).sendToTarget();
                synchronized (hf4Var) {
                    while (!hf4Var.b) {
                        hf4Var.a.getClass();
                        hf4Var.wait();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                pmf.m(e);
            }
        }
    }

    @Override // defpackage.f6b
    public final void h() {
        RuntimeException runtimeException = (RuntimeException) this.H.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // defpackage.f6b
    public final void shutdown() {
        if (this.J) {
            flush();
            this.F.quit();
        }
        this.J = false;
    }

    @Override // defpackage.f6b
    public final void start() {
        if (this.J) {
            return;
        }
        HandlerThread handlerThread = this.F;
        handlerThread.start();
        this.G = new xs(this, handlerThread.getLooper());
        this.J = true;
    }
}
