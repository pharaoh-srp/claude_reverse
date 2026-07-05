package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.io.EOFException;
import java.util.Arrays;
import okio.Buffer;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final class tp8 {
    public final Buffer a;
    public boolean c;
    public int g;
    public int h;
    public int b = Integer.MAX_VALUE;
    public int d = FreeTypeConstants.FT_LOAD_MONOCHROME;
    public tg8[] e = new tg8[8];
    public int f = 7;

    public tp8(Buffer buffer) {
        this.a = buffer;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                tg8 tg8Var = this.e[length];
                tg8Var.getClass();
                i -= tg8Var.c;
                int i4 = this.h;
                tg8 tg8Var2 = this.e[length];
                tg8Var2.getClass();
                this.h = i4 - tg8Var2.c;
                this.g--;
                i3++;
                length--;
            }
            tg8[] tg8VarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(tg8VarArr, i5, tg8VarArr, i5 + i3, this.g);
            tg8[] tg8VarArr2 = this.e;
            int i6 = this.f + 1;
            Arrays.fill(tg8VarArr2, i6, i6 + i3, (Object) null);
            this.f += i3;
        }
    }

    public final void b(tg8 tg8Var) {
        int i = tg8Var.c;
        int i2 = this.d;
        if (i > i2) {
            tg8[] tg8VarArr = this.e;
            mp0.z0(0, tg8VarArr.length, null, tg8VarArr);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i2);
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

    public final void c(ByteString byteString) throws EOFException {
        byteString.getClass();
        int[] iArr = xs8.a;
        int iE = byteString.e();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < iE; i++) {
            byte bJ = byteString.j(i);
            byte[] bArr = zkj.a;
            j2 += (long) xs8.b[bJ & 255];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int iE2 = byteString.e();
        Buffer buffer = this.a;
        if (i2 >= iE2) {
            e(byteString.e(), 127, 0);
            buffer.r0(byteString);
            return;
        }
        Buffer buffer2 = new Buffer();
        int[] iArr2 = xs8.a;
        int iE3 = byteString.e();
        int i3 = 0;
        for (int i4 = 0; i4 < iE3; i4++) {
            byte bJ2 = byteString.j(i4);
            byte[] bArr2 = zkj.a;
            int i5 = bJ2 & 255;
            int i6 = xs8.a[i5];
            byte b = xs8.b[i5];
            j = (j << b) | ((long) i6);
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                buffer2.B0((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            buffer2.B0((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        ByteString byteStringT = buffer2.t(buffer2.F);
        e(byteStringT.e(), 127, FreeTypeConstants.FT_LOAD_PEDANTIC);
        buffer.r0(byteStringT);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.util.ArrayList r14) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tp8.d(java.util.ArrayList):void");
    }

    public final void e(int i, int i2, int i3) {
        Buffer buffer = this.a;
        if (i < i2) {
            buffer.B0(i | i3);
            return;
        }
        buffer.B0(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            buffer.B0(128 | (i4 & 127));
            i4 >>>= 7;
        }
        buffer.B0(i4);
    }
}
