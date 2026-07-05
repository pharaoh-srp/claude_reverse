package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class l51 {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public Object h;
    public final Object i;
    public final Object j;

    public l51(int i) {
        int i2 = 0;
        switch (i) {
            case 1:
                this.b = new AtomicBoolean();
                this.c = null;
                this.d = new HashMap(16, 1.0f);
                this.e = new HashMap(16, 1.0f);
                this.f = new HashMap(16, 1.0f);
                this.g = new HashMap(16, 1.0f);
                this.h = null;
                this.a = false;
                this.i = new String[0];
                this.j = new bm4();
                break;
            default:
                this.e = new float[7];
                this.f = new float[7];
                this.g = new float[7];
                this.h = mpk.P(Boolean.FALSE);
                this.i = new Handler(Looper.getMainLooper());
                this.j = new k51(i2, this);
                break;
        }
    }

    public static final void a(l51 l51Var) {
        byte[] bArr;
        Integer num;
        byte[] bArr2;
        int i;
        float fLog10;
        boolean z = l51Var.a;
        float f = MTTypesetterKt.kLineSkipLimitMultiplier;
        int i2 = 1;
        if (z) {
            y49 y49Var = (y49) l51Var.c;
            float fD0 = wd6.d0((y49Var != null ? y49Var.a : 0.0f) / 2000.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f);
            double dNanoTime = System.nanoTime() * 1.0E-9d;
            for (int i3 = 0; i3 < 7; i3++) {
                ((float[]) l51Var.e)[i3] = wd6.d0(bwk.a[i3] * fD0 * ((((float) Math.sin(((double) bwk.b[i3]) * dNanoTime)) * 0.15f) + 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f);
            }
        } else {
            dmc dmcVar = (dmc) l51Var.b;
            if (dmcVar != null && (bArr = dmcVar.a) != null && bArr.length != 0 && (num = dmcVar.b) != null) {
                int iIntValue = num.intValue() / 2;
                int length = bArr.length / 2;
                int i4 = 0;
                for (int i5 = 7; i4 < i5; i5 = 7) {
                    float f2 = 487.85715f + (i4 * 487.85715f) + 85.0f;
                    float f3 = iIntValue;
                    float f4 = length - 1;
                    int iFloor = (int) Math.floor((r10 / f3) * f4);
                    int iFloor2 = (int) Math.floor((f2 / f3) * f4);
                    if (iFloor <= iFloor2) {
                        fLog10 = f;
                        i = 0;
                        while (true) {
                            if ((iFloor * 2) + 1 < bArr.length) {
                                bArr2 = bArr;
                                fLog10 += (float) Math.log10((float) Math.hypot(bArr[r14], bArr[r15]));
                                i++;
                            } else {
                                bArr2 = bArr;
                            }
                            if (iFloor == iFloor2) {
                                break;
                            }
                            iFloor++;
                            bArr = bArr2;
                        }
                    } else {
                        bArr2 = bArr;
                        i = 0;
                        fLog10 = MTTypesetterKt.kLineSkipLimitMultiplier;
                    }
                    ((float[]) l51Var.e)[i4] = wd6.d0(i > 0 ? fLog10 / i : MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f);
                    i4++;
                    f = 0.0f;
                    bArr = bArr2;
                }
            }
        }
        float[] fArr = (float[]) l51Var.f;
        float[] fArr2 = (float[]) l51Var.e;
        int length2 = fArr2.length;
        for (int i6 = 0; i6 < length2; i6++) {
            fArr[i6] = (fArr2[i6] * 0.06999999f) + (fArr[i6] * 0.93f);
        }
        int length3 = fArr.length;
        for (int i7 = 0; i7 < length3; i7++) {
            float[] fArr3 = (float[]) l51Var.g;
            fArr3[i7] = (fArr[i7] * 0.14999998f) + (fArr3[i7] * 0.85f);
        }
        fp fpVar = (fp) l51Var.d;
        if (fpVar != null) {
            float[] fArr4 = (float[]) l51Var.g;
            float[] fArr5 = (float[]) l51Var.e;
            if (fArr5.length == 0) {
                pmf.d();
                return;
            }
            float fMax = fArr5[0];
            int length4 = fArr5.length - 1;
            if (1 <= length4) {
                while (true) {
                    fMax = Math.max(fMax, fArr5[i2]);
                    if (i2 == length4) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            fpVar.invoke(fArr4, Float.valueOf(fMax));
        }
    }
}
