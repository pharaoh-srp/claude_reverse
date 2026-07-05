package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.Layout;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nu1 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ long F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ nu1(l9e l9eVar, dae daeVar, long j, hr1 hr1Var) {
        this.E = 0;
        this.G = l9eVar;
        this.H = daeVar;
        this.F = j;
        this.I = hr1Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) throws Throwable {
        long j;
        int i;
        float fA;
        float fA2;
        long j2;
        iei ieiVar;
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        xd6 xd6Var;
        v30 v30Var;
        v30 v30Var2;
        int i2 = this.E;
        iei ieiVar2 = iei.a;
        Object obj2 = this.I;
        Object obj3 = this.H;
        Object obj4 = this.G;
        switch (i2) {
            case 0:
                l9e l9eVar = (l9e) obj4;
                dae daeVar = (dae) obj3;
                long j3 = this.F;
                hr1 hr1Var = (hr1) obj2;
                cv9 cv9Var = (cv9) obj;
                cv9Var.a();
                float f = l9eVar.a;
                float f2 = l9eVar.b;
                ib2 ib2Var = cv9Var.E;
                ((efe) ib2Var.F.E).G(f, f2);
                try {
                    xd6.P(cv9Var, (r20) daeVar.E, 0L, j3, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, hr1Var, 0, 890);
                    return ieiVar2;
                } finally {
                    ((efe) ib2Var.F.E).G(-f, -f2);
                }
            case 1:
                float[] fArr = (float[]) obj4;
                bae baeVar = (bae) obj3;
                aae aaeVar = (aae) obj2;
                drc drcVar = (drc) obj;
                int i3 = drcVar.b;
                x30 x30Var = drcVar.a;
                int iF = drcVar.c;
                long j4 = this.F;
                int iG = i3 > kkh.g(j4) ? drcVar.b : kkh.g(j4);
                if (iF >= kkh.f(j4)) {
                    iF = kkh.f(j4);
                }
                long jM = mwa.m(drcVar.d(iG), drcVar.d(iF));
                int i4 = baeVar.E;
                wjh wjhVar = x30Var.d;
                int iG2 = kkh.g(jM);
                int iF2 = kkh.f(jM);
                Layout layout = wjhVar.f;
                int length = layout.getText().length();
                if (iG2 < 0) {
                    c39.a("startOffset must be > 0");
                }
                if (iG2 >= length) {
                    c39.a("startOffset must be less than text length");
                }
                if (iF2 <= iG2) {
                    c39.a("endOffset must be greater than startOffset");
                }
                if (iF2 > length) {
                    c39.a("endOffset must be smaller or equal to text length");
                }
                if (fArr.length - i4 < (iF2 - iG2) * 4) {
                    c39.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(iG2);
                int lineForOffset2 = layout.getLineForOffset(iF2 - 1);
                so8 so8Var = new so8(wjhVar);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        int iF3 = wjhVar.f(lineForOffset);
                        int iMax = Math.max(iG2, lineStart);
                        float fG = wjhVar.g(lineForOffset);
                        float fE = wjhVar.e(lineForOffset);
                        j = jM;
                        boolean z = layout.getParagraphDirection(lineForOffset) == 1;
                        for (int iMin = Math.min(iF2, iF3); iMax < iMin; iMin = i) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(iMax);
                            if (!z || zIsRtlCharAt) {
                                if (z && zIsRtlCharAt) {
                                    float fA3 = so8Var.a(iMax, false, false, false);
                                    i = iMin;
                                    fA = so8Var.a(iMax + 1, true, true, false);
                                    fA2 = fA3;
                                } else {
                                    i = iMin;
                                    if (z || !zIsRtlCharAt) {
                                        fA = so8Var.a(iMax, false, false, false);
                                        fA2 = so8Var.a(iMax + 1, true, true, false);
                                    } else {
                                        fA2 = so8Var.a(iMax, false, false, true);
                                        fA = so8Var.a(iMax + 1, true, true, true);
                                    }
                                }
                                fArr[i4] = fA;
                                fArr[i4 + 1] = fG;
                                fArr[i4 + 2] = fA2;
                                fArr[i4 + 3] = fE;
                                i4 += 4;
                                iMax++;
                            } else {
                                fA = so8Var.a(iMax, false, false, true);
                                i = iMin;
                                fA2 = so8Var.a(iMax + 1, true, true, true);
                            }
                            fArr[i4] = fA;
                            fArr[i4 + 1] = fG;
                            fArr[i4 + 2] = fA2;
                            fArr[i4 + 3] = fE;
                            i4 += 4;
                            iMax++;
                        }
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            jM = j;
                        }
                    }
                } else {
                    j = jM;
                }
                int iE = (kkh.e(j) * 4) + baeVar.E;
                for (int i5 = baeVar.E; i5 < iE; i5 += 4) {
                    int i6 = i5 + 1;
                    float f3 = fArr[i6];
                    float f4 = aaeVar.E;
                    fArr[i6] = f3 + f4;
                    int i7 = i5 + 3;
                    fArr[i7] = fArr[i7] + f4;
                }
                baeVar.E = iE;
                aaeVar.E = x30Var.b() + aaeVar.E;
                return ieiVar2;
            default:
                aae aaeVar2 = (aae) obj4;
                dge dgeVar = (dge) obj3;
                Context context = (Context) obj2;
                xd6 xd6Var2 = (xd6) obj;
                xd6Var2.getClass();
                long j5 = this.F;
                long j6 = j5 ^ (-9223372034707292160L);
                long jG = k8g.g(aaeVar2.E, xd6Var2.g());
                gg8 gg8Var = dgeVar.a;
                kw9 kw9Var = ig8.a;
                gg8 gg8Var2 = gg8Var;
                u00.o(xd6Var2, j6, jG, gg8Var.n0 != null, new d6d(8, dgeVar));
                long jG2 = xd6Var2.g();
                float fMax = Math.max(Float.intBitsToFloat((int) (j5 >> 32)), MTTypesetterKt.kLineSkipLimitMultiplier) * 2.0f;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jG2 & 4294967295L)) + (Math.max(Float.intBitsToFloat((int) (j5 & 4294967295L)), MTTypesetterKt.kLineSkipLimitMultiplier) * 2.0f))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jG2 >> 32)) + fMax)) << 32);
                float fD = ig8.d(gg8Var2);
                xd6 xd6Var3 = xd6Var2;
                if (fD > MTTypesetterKt.kLineSkipLimitMultiplier) {
                    Object obj5 = null;
                    if (((((j6 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) != 0 || fcc.c(j6, 0L)) {
                        j2 = j5;
                        ieiVar = ieiVar2;
                        ax5 ax5Var = apc.a;
                        ax5Var.getClass();
                        fwb fwbVar = (fwb) ax5Var.F;
                        if (fwbVar.i()) {
                            Object objF = fwbVar.f();
                            fwbVar.m(objF);
                            obj5 = objF;
                        }
                        v30 v30VarJ = (v30) obj5;
                        if (v30VarJ == null) {
                            v30VarJ = dch.j();
                        }
                        v30 v30Var3 = v30VarJ;
                        Paint paint = v30Var3.a;
                        try {
                            paint.setAntiAlias(true);
                            v30Var3.c(wd6.d0(fD, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f));
                            Bitmap bitmapF = d59.f(context);
                            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                            BitmapShader bitmapShader = new BitmapShader(bitmapF, tileMode, tileMode);
                            float f5 = aaeVar2.E;
                            float f6 = f5 > MTTypesetterKt.kLineSkipLimitMultiplier ? f5 : 1.0f;
                            if (Math.abs(f6 - 1.0f) >= 0.001f) {
                                Matrix matrix = new Matrix();
                                float f7 = 1.0f / f6;
                                matrix.setScale(f7, f7);
                                bitmapShader.setLocalMatrix(matrix);
                            }
                            v30Var3.i(bitmapShader);
                            v30Var3.d(9);
                            fb2 fb2VarP = xd6Var3.B0().p();
                            l9e l9eVarX = d4c.x(0L, jFloatToRawIntBits);
                            try {
                                fb2VarP.j(l9eVarX.a, l9eVarX.b, l9eVarX.c, l9eVarX.d, v30Var3);
                                paint.reset();
                                if (fwbVar.d < 3) {
                                    fwbVar.l(v30Var3);
                                }
                            } catch (Throwable th) {
                                th = th;
                                v30Var = v30Var3;
                                paint.reset();
                                if (fwbVar.d < 3) {
                                    fwbVar.l(v30Var);
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            v30Var = v30Var3;
                        }
                    } else {
                        fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
                        ieiVar = ieiVar2;
                        fIntBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L));
                        ((efe) xd6Var3.B0().E).G(fIntBitsToFloat, fIntBitsToFloat2);
                        try {
                            ax5 ax5Var2 = apc.a;
                            ax5Var2.getClass();
                            fwb fwbVar2 = (fwb) ax5Var2.F;
                            if (fwbVar2.i()) {
                                Object objF2 = fwbVar2.f();
                                fwbVar2.m(objF2);
                                obj5 = objF2;
                            }
                            v30 v30VarJ2 = (v30) obj5;
                            if (v30VarJ2 == null) {
                                v30VarJ2 = dch.j();
                            }
                            v30 v30Var4 = v30VarJ2;
                            try {
                                Paint paint2 = v30Var4.a;
                                j2 = j5;
                                paint2.setAntiAlias(true);
                                v30Var4.c(wd6.d0(fD, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f));
                                Bitmap bitmapF2 = d59.f(context);
                                Shader.TileMode tileMode2 = Shader.TileMode.REPEAT;
                                BitmapShader bitmapShader2 = new BitmapShader(bitmapF2, tileMode2, tileMode2);
                                float f8 = aaeVar2.E;
                                float f9 = f8 > MTTypesetterKt.kLineSkipLimitMultiplier ? f8 : 1.0f;
                                if (Math.abs(f9 - 1.0f) >= 0.001f) {
                                    Matrix matrix2 = new Matrix();
                                    float f10 = 1.0f / f9;
                                    matrix2.setScale(f10, f10);
                                    bitmapShader2.setLocalMatrix(matrix2);
                                }
                                v30Var4.i(bitmapShader2);
                                v30Var4.d(9);
                                fb2 fb2VarP2 = xd6Var3.B0().p();
                                l9e l9eVarX2 = d4c.x(0L, jFloatToRawIntBits);
                                try {
                                    fb2VarP2.j(l9eVarX2.a, l9eVarX2.b, l9eVarX2.c, l9eVarX2.d, v30Var4);
                                    paint2.reset();
                                    if (fwbVar2.d < 3) {
                                        fwbVar2.l(v30Var4);
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    v30Var2 = v30Var4;
                                    v30Var2.a.reset();
                                    fwb fwbVar3 = (fwb) ax5Var2.F;
                                    if (fwbVar3.d < 3) {
                                        fwbVar3.l(v30Var2);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                v30Var2 = v30Var4;
                            }
                        } finally {
                            ((efe) xd6Var3.B0().E).G(-fIntBitsToFloat, -fIntBitsToFloat2);
                        }
                    }
                } else {
                    j2 = j5;
                    ieiVar = ieiVar2;
                }
                if (((((j6 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) != 0 || fcc.c(j6, 0L)) {
                    long j7 = j2;
                    Iterator it = ig8.e(gg8Var2).iterator();
                    while (it.hasNext()) {
                        u00.p(xd6Var3, (qg8) it.next(), gg8Var2, j7, jFloatToRawIntBits);
                    }
                } else {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
                    fIntBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L));
                    ((efe) xd6Var3.B0().E).G(fIntBitsToFloat, fIntBitsToFloat2);
                    try {
                        Iterator it2 = ig8.e(gg8Var2).iterator();
                        while (it2.hasNext()) {
                            gg8 gg8Var3 = gg8Var2;
                            xd6Var = xd6Var3;
                            long j8 = j2;
                            try {
                                u00.p(xd6Var, (qg8) it2.next(), gg8Var3, j8, jFloatToRawIntBits);
                                gg8Var2 = gg8Var3;
                                j2 = j8;
                                xd6Var3 = xd6Var;
                            } catch (Throwable th5) {
                                th = th5;
                                ((efe) xd6Var.B0().E).G(-fIntBitsToFloat, -fIntBitsToFloat2);
                                throw th;
                            }
                            break;
                        }
                        xd6Var3 = xd6Var3;
                    } catch (Throwable th6) {
                        th = th6;
                        xd6Var = xd6Var3;
                    }
                }
                return ieiVar;
        }
    }

    public /* synthetic */ nu1(long j, Serializable serializable, Object obj, Object obj2, int i) {
        this.E = i;
        this.F = j;
        this.G = serializable;
        this.H = obj;
        this.I = obj2;
    }
}
