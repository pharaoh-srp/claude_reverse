package defpackage;

import android.util.Pair;
import com.google.common.base.VerifyException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: loaded from: classes3.dex */
public final class vie extends UploadDataProvider {
    public final tie E;
    public final jji F;
    public final frb G;
    public final long H;
    public saa I;
    public long J;

    public vie(tie tieVar, jji jjiVar, ExecutorService executorService, long j) {
        frb irbVar;
        this.E = tieVar;
        this.F = jjiVar;
        boolean z = executorService instanceof frb;
        if (z) {
            this.G = (frb) executorService;
        } else {
            if (z) {
                irbVar = (frb) executorService;
            } else {
                irbVar = executorService instanceof ScheduledExecutorService ? new irb((ScheduledExecutorService) executorService) : new frb(executorService);
            }
            this.G = irbVar;
        }
        this.H = j == 0 ? 2147483647L : j;
    }

    public final void c(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
        int iPosition = byteBuffer.position();
        byteBuffer.position(0);
        if (!d(byteBuffer).equals(iji.F)) {
            long jContentLength = this.E.contentLength();
            long j = this.J;
            StringBuilder sbW = grc.w(jContentLength, "Expected ", " bytes but got at least ");
            sbW.append(j);
            throw new IOException(sbW.toString());
        }
        Object[] objArr = new Object[0];
        if (!(byteBuffer.position() == 0)) {
            throw new VerifyException(iik.g("END_OF_BODY reads shouldn't write anything to the buffer", objArr));
        }
        byteBuffer.position(iPosition);
        uploadDataSink.onReadSucceeded(false);
    }

    public final iji d(ByteBuffer byteBuffer) {
        p1 yy8Var;
        int iPosition = byteBuffer.position();
        jji jjiVar = this.F;
        AtomicReference atomicReference = jjiVar.G;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            yy8Var = new yy8();
            yy8Var.m(th);
        } else {
            p1 exfVar = new exf();
            jjiVar.E.add(Pair.create(byteBuffer, exfVar));
            Throwable th2 = (Throwable) atomicReference.get();
            if (th2 != null) {
                exfVar.m(th2);
            }
            yy8Var = exfVar;
        }
        boolean z = false;
        try {
            long nanos = TimeUnit.MILLISECONDS.toNanos(this.H);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            iji ijiVar = (iji) yy8Var.get(nanos, TimeUnit.NANOSECONDS);
            this.J += (long) (byteBuffer.position() - iPosition);
            return ijiVar;
        } finally {
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.E.contentLength();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
        int i = 0;
        if (this.I == null) {
            saa saaVarC = this.G.c(new mr5(2, this));
            this.I = saaVarC;
            saaVarC.a(new t08(saaVarC, i, new ro6(28, this)), y46.E);
        }
        tie tieVar = this.E;
        if (tieVar.contentLength() == -1) {
            try {
                uploadDataSink.onReadSucceeded(d(byteBuffer).equals(iji.F));
                return;
            } catch (ExecutionException | TimeoutException e) {
                this.I.cancel(true);
                uploadDataSink.onReadError(new IOException(e));
                return;
            }
        }
        try {
            iji ijiVarD = d(byteBuffer);
            if (this.J > tieVar.contentLength()) {
                throw new IOException("Expected " + tieVar.contentLength() + " bytes but got at least " + this.J);
            }
            if (this.J >= tieVar.contentLength()) {
                c(uploadDataSink, byteBuffer);
                return;
            }
            int iOrdinal = ijiVarD.ordinal();
            if (iOrdinal == 0) {
                uploadDataSink.onReadSucceeded(false);
            } else if (iOrdinal == 1) {
                throw new IOException("The source has been exhausted but we expected more data!");
            }
        } catch (ExecutionException e2) {
            e = e2;
            this.I.cancel(true);
            uploadDataSink.onReadError(new IOException(e));
        } catch (TimeoutException e3) {
            e = e3;
            this.I.cancel(true);
            uploadDataSink.onReadError(new IOException(e));
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        uploadDataSink.onRewindError(new UnsupportedOperationException("Rewind is not supported!"));
    }
}
