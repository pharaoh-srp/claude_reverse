package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class y3f {
    public final xv8 a;
    public final int b;
    public final ssc c;
    public hw1 d;
    public hw1 e;
    public hw1 f;
    public long g;

    public y3f(xv8 xv8Var) {
        int i;
        this.a = xv8Var;
        synchronized (xv8Var) {
            i = ((es5) xv8Var.H).c.b;
        }
        this.b = i;
        this.c = new ssc(32);
        hw1 hw1Var = new hw1(0L, i);
        this.d = hw1Var;
        this.e = hw1Var;
        this.f = hw1Var;
    }

    public static hw1 c(hw1 hw1Var, long j, ByteBuffer byteBuffer, int i) {
        while (j >= hw1Var.F) {
            hw1Var = (hw1) hw1Var.H;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (hw1Var.F - j));
            ow owVar = (ow) hw1Var.G;
            byteBuffer.put(owVar.a, ((int) (j - hw1Var.E)) + owVar.b, iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == hw1Var.F) {
                hw1Var = (hw1) hw1Var.H;
            }
        }
        return hw1Var;
    }

    public static hw1 d(hw1 hw1Var, long j, byte[] bArr, int i) {
        while (j >= hw1Var.F) {
            hw1Var = (hw1) hw1Var.H;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (hw1Var.F - j));
            ow owVar = (ow) hw1Var.G;
            System.arraycopy(owVar.a, ((int) (j - hw1Var.E)) + owVar.b, bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == hw1Var.F) {
                hw1Var = (hw1) hw1Var.H;
            }
        }
        return hw1Var;
    }

    public static hw1 e(hw1 hw1Var, ro5 ro5Var, oo0 oo0Var, ssc sscVar) {
        if (ro5Var.c(1073741824)) {
            long j = oo0Var.b;
            int iG = 1;
            sscVar.J(1);
            hw1 hw1VarD = d(hw1Var, j, sscVar.a, 1);
            long j2 = j + 1;
            byte b = sscVar.a[0];
            boolean z = (b & 128) != 0;
            int i = b & 127;
            rc5 rc5Var = ro5Var.H;
            byte[] bArr = rc5Var.a;
            if (bArr == null) {
                rc5Var.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            hw1Var = d(hw1VarD, j2, rc5Var.a, i);
            long j3 = j2 + ((long) i);
            if (z) {
                sscVar.J(2);
                hw1Var = d(hw1Var, j3, sscVar.a, 2);
                j3 += 2;
                iG = sscVar.G();
            }
            int[] iArr = rc5Var.d;
            if (iArr == null || iArr.length < iG) {
                iArr = new int[iG];
            }
            int[] iArr2 = rc5Var.e;
            if (iArr2 == null || iArr2.length < iG) {
                iArr2 = new int[iG];
            }
            if (z) {
                int i2 = iG * 6;
                sscVar.J(i2);
                hw1Var = d(hw1Var, j3, sscVar.a, i2);
                j3 += (long) i2;
                sscVar.M(0);
                for (int i3 = 0; i3 < iG; i3++) {
                    iArr[i3] = sscVar.G();
                    iArr2[i3] = sscVar.D();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = oo0Var.a - ((int) (j3 - oo0Var.b));
            }
            x3i x3iVar = (x3i) oo0Var.c;
            String str = tpi.a;
            byte[] bArr2 = x3iVar.b;
            byte[] bArr3 = rc5Var.a;
            int i4 = x3iVar.a;
            int i5 = x3iVar.c;
            int i6 = x3iVar.d;
            rc5Var.f = iG;
            rc5Var.d = iArr;
            rc5Var.e = iArr2;
            rc5Var.b = bArr2;
            rc5Var.a = bArr3;
            rc5Var.c = i4;
            rc5Var.g = i5;
            rc5Var.h = i6;
            MediaCodec.CryptoInfo cryptoInfo = rc5Var.i;
            cryptoInfo.numSubSamples = iG;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i4;
            i49 i49Var = rc5Var.j;
            i49Var.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) i49Var.G;
            pattern.set(i5, i6);
            ((MediaCodec.CryptoInfo) i49Var.F).setPattern(pattern);
            long j4 = oo0Var.b;
            int i7 = (int) (j3 - j4);
            oo0Var.b = j4 + ((long) i7);
            oo0Var.a -= i7;
        }
        if (!ro5Var.c(268435456)) {
            ro5Var.h(oo0Var.a);
            return c(hw1Var, oo0Var.b, ro5Var.I, oo0Var.a);
        }
        sscVar.J(4);
        hw1 hw1VarD2 = d(hw1Var, oo0Var.b, sscVar.a, 4);
        int iD = sscVar.D();
        oo0Var.b += 4;
        oo0Var.a -= 4;
        ro5Var.h(iD);
        hw1 hw1VarC = c(hw1VarD2, oo0Var.b, ro5Var.I, iD);
        oo0Var.b += (long) iD;
        int i8 = oo0Var.a - iD;
        oo0Var.a = i8;
        ByteBuffer byteBuffer = ro5Var.L;
        if (byteBuffer == null || byteBuffer.capacity() < i8) {
            ro5Var.L = ByteBuffer.allocate(i8);
        } else {
            ro5Var.L.clear();
        }
        return c(hw1VarC, oo0Var.b, ro5Var.L, oo0Var.a);
    }

    public final void a(long j) {
        hw1 hw1Var;
        if (j == -1) {
            return;
        }
        while (true) {
            hw1Var = this.d;
            if (j < hw1Var.F) {
                break;
            }
            xv8 xv8Var = this.a;
            ow owVar = (ow) hw1Var.G;
            synchronized (xv8Var) {
                cp5 cp5Var = ((es5) xv8Var.H).c;
                synchronized (cp5Var) {
                    ow[] owVarArr = cp5Var.f;
                    int i = cp5Var.e;
                    cp5Var.e = i + 1;
                    owVarArr[i] = owVar;
                    cp5Var.d--;
                }
                xv8Var.y(owVar);
            }
            hw1 hw1Var2 = this.d;
            hw1Var2.G = null;
            hw1 hw1Var3 = (hw1) hw1Var2.H;
            hw1Var2.H = null;
            this.d = hw1Var3;
        }
        if (this.e.E < hw1Var.E) {
            this.e = hw1Var;
        }
    }

    public final int b(int i) {
        ow owVarA;
        hw1 hw1Var = this.f;
        if (((ow) hw1Var.G) == null) {
            xv8 xv8Var = this.a;
            synchronized (xv8Var) {
                owVarA = ((es5) xv8Var.H).c.a();
                ((HashMap) xv8Var.F).put(owVarA, (z6d) xv8Var.G);
                ds5 ds5Var = (ds5) ((es5) xv8Var.H).p.get((z6d) xv8Var.G);
                if (ds5Var != null) {
                    synchronized (ds5Var) {
                        ds5Var.d++;
                    }
                }
            }
            hw1 hw1Var2 = new hw1(this.f.F, this.b);
            hw1Var.G = owVarA;
            hw1Var.H = hw1Var2;
        }
        return Math.min(i, (int) (this.f.F - this.g));
    }
}
