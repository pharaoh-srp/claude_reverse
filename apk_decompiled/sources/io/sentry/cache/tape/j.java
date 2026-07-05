package io.sentry.cache.tape;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.grc;
import defpackage.pmf;
import defpackage.sz6;
import defpackage.vb7;
import defpackage.xh6;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Closeable, Iterable {
    public static final byte[] O = new byte[FreeTypeConstants.FT_LOAD_MONOCHROME];
    public RandomAccessFile E;
    public final File F;
    public long G;
    public int H;
    public h I;
    public h J;
    public final byte[] K = new byte[32];
    public int L = 0;
    public final int M;
    public boolean N;

    public j(File file, RandomAccessFile randomAccessFile, int i) throws IOException {
        this.F = file;
        this.E = randomAccessFile;
        this.M = i;
        x0();
    }

    public static int B0(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public static long D0(byte[] bArr, int i) {
        return ((((long) bArr[i]) & 255) << 56) + ((((long) bArr[i + 1]) & 255) << 48) + ((((long) bArr[i + 2]) & 255) << 40) + ((((long) bArr[i + 3]) & 255) << 32) + ((((long) bArr[i + 4]) & 255) << 24) + ((((long) bArr[i + 5]) & 255) << 16) + ((((long) bArr[i + 6]) & 255) << 8) + (((long) bArr[i + 7]) & 255);
    }

    public static void U0(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public static void V0(long j, int i, byte[] bArr) {
        bArr[i] = (byte) (j >> 56);
        bArr[i + 1] = (byte) (j >> 48);
        bArr[i + 2] = (byte) (j >> 40);
        bArr[i + 3] = (byte) (j >> 32);
        bArr[i + 4] = (byte) (j >> 24);
        bArr[i + 5] = (byte) (j >> 16);
        bArr[i + 6] = (byte) (j >> 8);
        bArr[i + 7] = (byte) j;
    }

    public static RandomAccessFile e(File file) {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                randomAccessFile.writeInt(-2147483647);
                randomAccessFile.writeLong(4096L);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    xh6.c("Rename failed!");
                    return null;
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        return new RandomAccessFile(file, "rwd");
    }

    public final void O0(int i) throws IOException {
        if (i < 0) {
            sz6.p(grc.u("Cannot remove negative (", i, ") number of elements."));
            return;
        }
        if (i == 0) {
            return;
        }
        int i2 = this.H;
        if (i == i2) {
            clear();
            return;
        }
        if (i2 == 0) {
            pmf.d();
            return;
        }
        if (i > i2) {
            sz6.p(vb7.l(this.H, ").", vb7.u("Cannot remove more elements (", i, ") than present in queue (")));
            return;
        }
        h hVar = this.I;
        long j = hVar.a;
        int iB0 = hVar.b;
        long jS0 = j;
        long j2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            j2 += (long) (iB0 + 4);
            jS0 = S0(jS0 + 4 + ((long) iB0));
            byte[] bArr = this.K;
            if (!Q0(jS0, 4, bArr)) {
                return;
            }
            iB0 = B0(bArr, 0);
        }
        T0(this.G, this.H - i, jS0, this.J.a);
        this.H -= i;
        this.L++;
        this.I = new h(jS0, iB0);
        while (j2 > 0) {
            int iMin = (int) Math.min(j2, 4096L);
            R0(j, iMin, O);
            long j3 = iMin;
            j2 -= j3;
            j += j3;
        }
    }

    public final void P0() throws IOException {
        this.E.close();
        File file = this.F;
        file.delete();
        this.E = e(file);
        x0();
    }

    public final boolean Q0(long j, int i, byte[] bArr) throws IOException {
        try {
            long jS0 = S0(j);
            long j2 = ((long) i) + jS0;
            long j3 = this.G;
            RandomAccessFile randomAccessFile = this.E;
            if (j2 <= j3) {
                randomAccessFile.seek(jS0);
                this.E.readFully(bArr, 0, i);
                return true;
            }
            int i2 = (int) (j3 - jS0);
            randomAccessFile.seek(jS0);
            this.E.readFully(bArr, 0, i2);
            this.E.seek(32L);
            this.E.readFully(bArr, i2, i - i2);
            return true;
        } catch (EOFException unused) {
            P0();
            return false;
        } catch (IOException e) {
            throw e;
        } catch (Throwable unused2) {
            P0();
            return false;
        }
    }

    public final void R0(long j, int i, byte[] bArr) throws IOException {
        long jS0 = S0(j);
        long j2 = ((long) i) + jS0;
        long j3 = this.G;
        RandomAccessFile randomAccessFile = this.E;
        if (j2 <= j3) {
            randomAccessFile.seek(jS0);
            this.E.write(bArr, 0, i);
            return;
        }
        int i2 = (int) (j3 - jS0);
        randomAccessFile.seek(jS0);
        this.E.write(bArr, 0, i2);
        this.E.seek(32L);
        this.E.write(bArr, i2, i - i2);
    }

    public final long S0(long j) {
        long j2 = this.G;
        return j < j2 ? j : (j + 32) - j2;
    }

    public final void T0(long j, int i, long j2, long j3) throws IOException {
        this.E.seek(0L);
        byte[] bArr = this.K;
        U0(bArr, 0, -2147483647);
        V0(j, 4, bArr);
        U0(bArr, 12, i);
        V0(j2, 16, bArr);
        V0(j3, 24, bArr);
        this.E.write(bArr, 0, 32);
    }

    public final void clear() throws IOException {
        if (this.N) {
            sz6.j("closed");
            return;
        }
        T0(4096L, 0, 0L, 0L);
        this.E.seek(32L);
        this.E.write(O, 0, 4064);
        this.H = 0;
        h hVar = h.c;
        this.I = hVar;
        this.J = hVar;
        if (this.G > 4096) {
            this.E.setLength(4096L);
            this.E.getChannel().force(true);
        }
        this.G = 4096L;
        this.L++;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.N = true;
        this.E.close();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new i(this);
    }

    public final h l0(long j) {
        if (j != 0) {
            byte[] bArr = this.K;
            if (Q0(j, 4, bArr)) {
                return new h(j, B0(bArr, 0));
            }
        }
        return h.c;
    }

    public final String toString() {
        return "QueueFile{file=" + this.F + ", zero=true, length=" + this.G + ", size=" + this.H + ", first=" + this.I + ", last=" + this.J + '}';
    }

    public final void x0() throws IOException {
        this.E.seek(0L);
        RandomAccessFile randomAccessFile = this.E;
        byte[] bArr = this.K;
        randomAccessFile.readFully(bArr);
        this.G = D0(bArr, 4);
        this.H = B0(bArr, 12);
        long jD0 = D0(bArr, 16);
        long jD02 = D0(bArr, 24);
        long j = this.G;
        long length = this.E.length();
        long j2 = this.G;
        if (j > length) {
            StringBuilder sbW = grc.w(j2, "File is truncated. Expected length: ", ", Actual length: ");
            sbW.append(this.E.length());
            throw new IOException(sbW.toString());
        }
        if (j2 > 32) {
            this.I = l0(jD0);
            this.J = l0(jD02);
        } else {
            xh6.c(grc.r(this.G, ") is invalid.", new StringBuilder("File is corrupt; length stored in header (")));
        }
    }
}
