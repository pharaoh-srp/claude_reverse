package defpackage;

import android.media.AudioTrack;
import android.os.Build;
import androidx.media3.exoplayer.audio.AudioOutput$WriteException;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class g61 {
    public static final Object q = new Object();
    public static ScheduledExecutorService r;
    public static int s;
    public final AudioTrack a;
    public final f51 b;
    public final float c;
    public final poj d;
    public c61 e;
    public final j61 f;
    public final boolean g;
    public final int h;
    public final xv8 i;
    public final kba j = new kba(Thread.currentThread());
    public boolean k;
    public long l;
    public long m;
    public long n;
    public int o;
    public int p;

    public g61(AudioTrack audioTrack, f51 f51Var, poj pojVar, float f, g1h g1hVar) {
        this.a = audioTrack;
        this.b = f51Var;
        this.c = f;
        this.d = pojVar;
        boolean zY = tpi.y(f51Var.a);
        this.g = zY;
        if (zY) {
            this.h = tpi.n(f51Var.a) * Integer.bitCount(f51Var.c);
        } else {
            this.h = -1;
        }
        this.f = new j61(new ive(8, this), g1hVar, audioTrack, f51Var.a, this.h, f51Var.f);
        if (pojVar != null) {
            this.e = new c61(audioTrack, pojVar);
        }
        this.i = c() ? new xv8(this) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x028d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a() {
        /*
            Method dump skipped, instruction units count: 879
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g61.a():long");
    }

    public final long b() {
        if (!this.g) {
            return this.m;
        }
        long j = this.l;
        long j2 = this.h;
        String str = tpi.a;
        return ((j + j2) - 1) / j2;
    }

    public final boolean c() {
        return Build.VERSION.SDK_INT >= 29 && this.a.isOffloadedPlayback();
    }

    public final boolean d(long j, ByteBuffer byteBuffer, int i) throws AudioOutput$WriteException {
        int iWrite;
        boolean z;
        poj pojVar;
        i61 i61Var;
        x31 x31Var;
        long j2;
        f51 f51Var = this.b;
        boolean z2 = this.g;
        if (!z2 && this.o == 0) {
            this.o = vp5.i(byteBuffer, f51Var.a);
        }
        kba kbaVar = this.j;
        kbaVar.getClass();
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = kbaVar.a;
        AudioTrack audioTrack = this.a;
        if (threadCurrentThread == thread) {
            b();
            int underrunCount = audioTrack.getUnderrunCount();
            boolean z3 = underrunCount > this.p;
            this.p = underrunCount;
            if (z3) {
                kbaVar.e(-1, new wg6(16));
            }
        }
        int iRemaining = byteBuffer.remaining();
        if (f51Var.d) {
            if (j == Long.MIN_VALUE) {
                j2 = this.n;
            } else {
                this.n = j;
                j2 = j;
            }
            iWrite = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1, j2 * 1000);
        } else {
            iWrite = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (iWrite >= 0) {
            z = iWrite == iRemaining;
            if (z2) {
                this.l += (long) iWrite;
                return z;
            }
            if (z) {
                this.m = (((long) this.o) * ((long) i)) + this.m;
            }
            return z;
        }
        z = iWrite == -6 || iWrite == -32;
        if (z && (pojVar = this.d) != null && (x31Var = (i61Var = (i61) pojVar.E).i) != null) {
            u31 u31Var = u31.f;
            i61Var.h = u31Var;
            x31Var.b(u31Var);
        }
        throw new AudioOutput$WriteException(iWrite, z);
    }
}
