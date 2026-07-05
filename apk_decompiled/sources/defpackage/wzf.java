package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class wzf implements heg {
    public static final int[] i = new int[3];
    public static final float[] j = {MTTypesetterKt.kLineSkipLimitMultiplier, 0.5f, 1.0f};
    public static final int[] k = new int[4];
    public static final float[] l = {MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 0.5f, 1.0f};
    public int a;
    public int b;
    public int c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public final Object h;

    public wzf() {
        this.h = new Path();
        Paint paint = new Paint();
        this.g = paint;
        Paint paint2 = new Paint();
        this.d = paint2;
        this.a = x54.d(-16777216, 68);
        this.b = x54.d(-16777216, 20);
        this.c = x54.d(-16777216, 0);
        paint2.setColor(this.a);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.e = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f = new Paint(paint3);
    }

    @Override // defpackage.heg
    public void a(int i2, int i3) {
        for (int i4 = 0; i4 < ((ieg) this.h).b * i3; i4++) {
            ((short[]) this.e)[i2 + i4] = 0;
        }
    }

    @Override // defpackage.heg
    public void b(int i2, int i3) {
        short[] sArr = (short[]) this.e;
        ieg iegVar = (ieg) this.h;
        int i4 = iegVar.h / i3;
        int i5 = iegVar.b;
        int i6 = i3 * i5;
        int i7 = i2 * i5;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                i9 += sArr[(i8 * i6) + i7 + i10];
            }
            ((short[]) this.d)[i8] = (short) (i9 / i6);
        }
    }

    @Override // defpackage.heg
    public int c(int i2, int i3, int i4) {
        return s((short[]) this.e, i2, i3, i4);
    }

    @Override // defpackage.heg
    public void d() {
        this.c = this.a;
    }

    @Override // defpackage.heg
    public Object e() {
        return (short[]) this.e;
    }

    @Override // defpackage.heg
    public Object f() {
        return (short[]) this.f;
    }

    @Override // defpackage.heg
    public void flush() {
        this.c = 0;
        this.a = 0;
        this.b = 0;
    }

    @Override // defpackage.heg
    public void g(int i2) {
        this.f = r((short[]) this.f, ((ieg) this.h).k, i2);
    }

    @Override // defpackage.heg
    public boolean h() {
        int i2 = this.a;
        return i2 != 0 && ((ieg) this.h).p != 0 && this.b <= i2 * 3 && i2 * 2 > this.c * 3;
    }

    @Override // defpackage.heg
    public void i(long j2, int i2, long j3) {
        int i3 = 0;
        while (true) {
            ieg iegVar = (ieg) this.h;
            int i4 = iegVar.b;
            if (i3 >= i4) {
                return;
            }
            short[] sArr = (short[]) this.f;
            int i5 = (iegVar.k * i4) + i3;
            short[] sArr2 = (short[]) this.g;
            int i6 = (i2 * i4) + i3;
            short s = sArr2[i6];
            short s2 = sArr2[i6 + i4];
            long j4 = ((long) iegVar.n) * j2;
            int i7 = iegVar.m;
            long j5 = ((long) (i7 + 1)) * j3;
            long j6 = j5 - j4;
            long j7 = j5 - (((long) i7) * j3);
            sArr[i5] = (short) ((((j7 - j6) * ((long) s2)) + (((long) s) * j6)) / j7);
            i3++;
        }
    }

    @Override // defpackage.heg
    public Object j() {
        return (short[]) this.g;
    }

    @Override // defpackage.heg
    public void k(int i2, int i3, int i4, int i5, int i6) {
        short[] sArr = (short[]) this.f;
        short[] sArr2 = (short[]) this.e;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i4 * i3) + i7;
            int i9 = (i6 * i3) + i7;
            int i10 = (i5 * i3) + i7;
            for (int i11 = 0; i11 < i2; i11++) {
                sArr[i8] = (short) (((sArr2[i9] * i11) + ((i2 - i11) * sArr2[i10])) / i2);
                i8 += i3;
                i10 += i3;
                i9 += i3;
            }
        }
    }

    @Override // defpackage.heg
    public void l(ByteBuffer byteBuffer, int i2) {
        ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = (short[]) this.e;
        ieg iegVar = (ieg) this.h;
        shortBufferAsShortBuffer.get(sArr, iegVar.j * iegVar.b, i2 / 2);
        byteBuffer.position(byteBuffer.position() + i2);
    }

    @Override // defpackage.heg
    public void m(int i2) {
        this.g = r((short[]) this.g, ((ieg) this.h).l, i2);
    }

    @Override // defpackage.heg
    public int n() {
        return 2;
    }

    @Override // defpackage.heg
    public void o(int i2) {
        this.e = r((short[]) this.e, ((ieg) this.h).j, i2);
    }

    @Override // defpackage.heg
    public void p(ByteBuffer byteBuffer, int i2) {
        ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = (short[]) this.f;
        int i3 = ((ieg) this.h).b;
        shortBufferAsShortBuffer.put(sArr, 0, i2 * i3);
        byteBuffer.position((i2 * 2 * i3) + byteBuffer.position());
    }

    @Override // defpackage.heg
    public int q(int i2, int i3) {
        return s((short[]) this.d, 0, i2, i3);
    }

    public short[] r(short[] sArr, int i2, int i3) {
        int length = sArr.length;
        int i4 = ((ieg) this.h).b;
        int i5 = length / i4;
        return i2 + i3 <= i5 ? sArr : Arrays.copyOf(sArr, (((i5 * 3) / 2) + i3) * i4);
    }

    public int s(short[] sArr, int i2, int i3, int i4) {
        int i5 = i2 * ((ieg) this.h).b;
        int i6 = 255;
        int i7 = 1;
        int i8 = 0;
        int i9 = 0;
        while (i3 <= i4) {
            int iAbs = 0;
            for (int i10 = 0; i10 < i3; i10++) {
                iAbs += Math.abs(sArr[i5 + i10] - sArr[(i5 + i3) + i10]);
            }
            if (iAbs * i8 < i7 * i3) {
                i8 = i3;
                i7 = iAbs;
            }
            if (iAbs * i6 > i9 * i3) {
                i6 = i3;
                i9 = iAbs;
            }
            i3++;
        }
        this.a = i7 / i8;
        this.b = i9 / i6;
        return i8;
    }

    public wzf(ieg iegVar) {
        this.h = iegVar;
        int i2 = iegVar.h;
        this.d = new short[i2];
        int i3 = i2 * iegVar.b;
        this.e = new short[i3];
        this.f = new short[i3];
        this.g = new short[i3];
    }
}
