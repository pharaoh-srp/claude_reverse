package io.sentry.cache.tape;

import defpackage.mr9;
import defpackage.sz6;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class e extends g {
    public final j E;
    public final c F = new c();
    public final f G;

    public e(j jVar, f fVar) {
        this.E = jVar;
        this.G = fVar;
    }

    @Override // io.sentry.cache.tape.g
    public final void clear() throws IOException {
        this.E.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.E.close();
    }

    @Override // io.sentry.cache.tape.g
    public final void e(Object obj) throws IOException {
        long j;
        long j2;
        long j3;
        long jS0;
        long j4;
        long j5;
        c cVar = this.F;
        cVar.reset();
        this.G.d(cVar, obj);
        byte[] bArrC = cVar.c();
        int size = cVar.size();
        j jVar = this.E;
        jVar.getClass();
        byte[] bArr = jVar.K;
        if (bArrC == null) {
            mr9.h("data == null");
            return;
        }
        if (size < 0 || size > bArrC.length) {
            throw new IndexOutOfBoundsException();
        }
        if (jVar.N) {
            sz6.j("closed");
            return;
        }
        int i = jVar.M;
        if (i != -1 && jVar.H == i) {
            jVar.O0(1);
        }
        long j6 = ((long) size) + 4;
        long j7 = jVar.G;
        if (jVar.H == 0) {
            j = 4;
            j3 = 32;
            j2 = 32;
        } else {
            h hVar = jVar.J;
            long j8 = hVar.a;
            j = 4;
            long j9 = jVar.I.a;
            int i2 = hVar.b;
            if (j8 >= j9) {
                j3 = (j8 - j9) + 4 + ((long) i2) + 32;
                j2 = 32;
            } else {
                j2 = 32;
                j3 = (((j8 + 4) + ((long) i2)) + j7) - j9;
            }
        }
        long j10 = j7 - j3;
        if (j10 < j6) {
            do {
                j10 += j7;
                j7 <<= 1;
            } while (j10 < j6);
            jVar.E.setLength(j7);
            jVar.E.getChannel().force(true);
            h hVar2 = jVar.J;
            long jS02 = jVar.S0(hVar2.a + j + ((long) hVar2.b));
            if (jS02 <= jVar.I.a) {
                FileChannel channel = jVar.E.getChannel();
                channel.position(jVar.G);
                j4 = jS02 - j2;
                if (channel.transferTo(32L, j4, channel) != j4) {
                    sz6.h("Copied insufficient number of bytes!");
                    return;
                }
            } else {
                j4 = 0;
            }
            long j11 = jVar.J.a;
            long j12 = jVar.I.a;
            if (j11 < j12) {
                long j13 = (jVar.G + j11) - j2;
                j5 = j7;
                jVar.T0(j5, jVar.H, j12, j13);
                jVar.J = new h(j13, jVar.J.b);
            } else {
                j5 = j7;
                jVar.T0(j5, jVar.H, j12, j11);
            }
            jVar.G = j5;
            long j14 = j2;
            long j15 = j4;
            while (j15 > 0) {
                int iMin = (int) Math.min(j15, 4096L);
                jVar.R0(j14, iMin, j.O);
                long j16 = iMin;
                j15 -= j16;
                j14 += j16;
            }
        }
        boolean z = jVar.H == 0;
        if (z) {
            jS0 = j2;
        } else {
            h hVar3 = jVar.J;
            jS0 = jVar.S0(hVar3.a + j + ((long) hVar3.b));
        }
        h hVar4 = new h(jS0, size);
        j.U0(bArr, 0, size);
        jVar.R0(jS0, 4, bArr);
        jVar.R0(jS0 + j, size, bArrC);
        jVar.T0(jVar.G, jVar.H + 1, z ? jS0 : jVar.I.a, jS0);
        jVar.J = hVar4;
        jVar.H++;
        jVar.L++;
        if (z) {
            jVar.I = hVar4;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        j jVar = this.E;
        jVar.getClass();
        return new d(this, new i(jVar));
    }

    @Override // io.sentry.cache.tape.g
    public final int size() {
        return this.E.H;
    }

    public final String toString() {
        return "FileObjectQueue{queueFile=" + this.E + '}';
    }

    @Override // io.sentry.cache.tape.g
    public final void x0(int i) throws IOException {
        this.E.O0(i);
    }
}
