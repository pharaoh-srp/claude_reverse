package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.io.IOException;
import java.util.ArrayList;
import okio.Buffer;
import okio.ByteString;
import okio.RealBufferedSource;

/* JADX INFO: loaded from: classes.dex */
public final class sp8 {
    public long c;
    public final RealBufferedSource d;
    public int g;
    public int h;
    public int a = FreeTypeConstants.FT_LOAD_MONOCHROME;
    public final ArrayList b = new ArrayList();
    public tg8[] e = new tg8[8];
    public int f = 7;

    public sp8(bs8 bs8Var) {
        this.d = new RealBufferedSource(bs8Var);
    }

    public final void a(tg8 tg8Var) {
        this.b.add(tg8Var);
        long jE = this.c + ((long) (tg8Var.b.e() + tg8Var.a.e()));
        this.c = jE;
        if (jE <= 262144) {
            return;
        }
        xh6.c("header byte count limit of 262144 exceeded");
    }

    public final int b(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.e.length;
            while (true) {
                length--;
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                tg8 tg8Var = this.e[length];
                tg8Var.getClass();
                int i4 = tg8Var.c;
                i -= i4;
                this.h -= i4;
                this.g--;
                i3++;
            }
            tg8[] tg8VarArr = this.e;
            System.arraycopy(tg8VarArr, i2 + 1, tg8VarArr, i2 + 1 + i3, this.g);
            this.f += i3;
        }
        return i3;
    }

    public final ByteString c(int i) throws IOException {
        if (i >= 0) {
            tg8[] tg8VarArr = up8.a;
            if (i <= tg8VarArr.length - 1) {
                return tg8VarArr[i].a;
            }
        }
        int length = this.f + 1 + (i - up8.a.length);
        if (length >= 0) {
            tg8[] tg8VarArr2 = this.e;
            if (length < tg8VarArr2.length) {
                tg8 tg8Var = tg8VarArr2[length];
                tg8Var.getClass();
                return tg8Var.a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void d(tg8 tg8Var) {
        a(tg8Var);
        int i = tg8Var.c;
        int i2 = this.a;
        if (i > i2) {
            tg8[] tg8VarArr = this.e;
            mp0.z0(0, tg8VarArr.length, null, tg8VarArr);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        b((this.h + i) - i2);
        int i3 = this.g + 1;
        tg8[] tg8VarArr2 = this.e;
        if (i3 > tg8VarArr2.length) {
            tg8[] tg8VarArr3 = new tg8[tg8VarArr2.length * 2];
            System.arraycopy(tg8VarArr2, 0, tg8VarArr3, tg8VarArr2.length, tg8VarArr2.length);
            this.f = this.e.length - 1;
            this.e = tg8VarArr3;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = tg8Var;
        this.g++;
        this.h += i;
    }

    public final ByteString e() {
        RealBufferedSource realBufferedSource = this.d;
        byte b = realBufferedSource.readByte();
        byte[] bArr = zkj.a;
        int i = b & 255;
        int i2 = 0;
        boolean z = (b & 128) == 128;
        long jF = f(i, 127);
        if (this.c + jF > 262144) {
            xh6.c("header byte count limit of 262144 exceeded");
            return null;
        }
        if (!z) {
            return realBufferedSource.t(jF);
        }
        Buffer buffer = new Buffer();
        int[] iArr = xs8.a;
        realBufferedSource.getClass();
        gp1 gp1Var = xs8.c;
        gp1 gp1Var2 = gp1Var;
        int i3 = 0;
        for (long j = 0; j < jF; j++) {
            byte b2 = realBufferedSource.readByte();
            byte[] bArr2 = zkj.a;
            i2 = (i2 << 8) | (b2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                gp1[] gp1VarArr = (gp1[]) gp1Var2.G;
                gp1VarArr.getClass();
                gp1Var2 = gp1VarArr[(i2 >>> (i3 - 8)) & 255];
                gp1Var2.getClass();
                if (((gp1[]) gp1Var2.G) == null) {
                    buffer.B0(gp1Var2.E);
                    i3 -= gp1Var2.F;
                    gp1Var2 = gp1Var;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            gp1[] gp1VarArr2 = (gp1[]) gp1Var2.G;
            gp1VarArr2.getClass();
            gp1 gp1Var3 = gp1VarArr2[(i2 << (8 - i3)) & 255];
            gp1Var3.getClass();
            int i4 = gp1Var3.F;
            if (((gp1[]) gp1Var3.G) != null || i4 > i3) {
                break;
            }
            buffer.B0(gp1Var3.E);
            i3 -= i4;
            gp1Var2 = gp1Var;
        }
        return buffer.t(buffer.F);
    }

    public final int f(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        long j = i2;
        int i4 = 0;
        int i5 = 0;
        while (i4 != 5) {
            byte b = this.d.readByte();
            byte[] bArr = zkj.a;
            i4++;
            long j2 = ((long) (b & 127)) << i5;
            if (j2 > 2147483647L - j) {
                xh6.c("HPACK integer overflow");
                return 0;
            }
            j += j2;
            if ((b & 128) == 0) {
                return (int) j;
            }
            i5 += 7;
        }
        xh6.c("HPACK integer overflow");
        return 0;
    }
}
