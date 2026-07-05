package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class uri {
    public static final Matrix p = new Matrix();
    public final Path a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final rri g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;
    public final bp0 o;

    public uri(uri uriVar) {
        this.c = new Matrix();
        this.h = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.i = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.j = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.k = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.l = 255;
        this.m = null;
        this.n = null;
        bp0 bp0Var = new bp0(0);
        this.o = bp0Var;
        this.g = new rri(uriVar.g, bp0Var);
        this.a = new Path(uriVar.a);
        this.b = new Path(uriVar.b);
        this.h = uriVar.h;
        this.i = uriVar.i;
        this.j = uriVar.j;
        this.k = uriVar.k;
        this.l = uriVar.l;
        this.m = uriVar.m;
        String str = uriVar.m;
        if (str != null) {
            bp0Var.put(str, this);
        }
        this.n = uriVar.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(rri rriVar, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        boolean z;
        Matrix matrix2;
        ArrayList arrayList;
        float f;
        int i4;
        float[] fArr;
        int i5;
        Path path;
        Path path2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        Matrix matrix3 = rriVar.a;
        ArrayList arrayList2 = rriVar.b;
        matrix3.set(matrix);
        Matrix matrix4 = rriVar.a;
        matrix4.preConcat(rriVar.j);
        canvas.save();
        boolean z2 = false;
        int i6 = 0;
        while (i6 < arrayList2.size()) {
            sri sriVar = (sri) arrayList2.get(i6);
            if (sriVar instanceof rri) {
                a((rri) sriVar, matrix4, canvas, i, i2);
            } else {
                if (sriVar instanceof tri) {
                    tri triVar = (tri) sriVar;
                    float f14 = i / this.j;
                    float f15 = i2 / this.k;
                    float fMin = Math.min(f14, f15);
                    Matrix matrix5 = this.c;
                    matrix5.set(matrix4);
                    matrix5.postScale(f14, f15);
                    float[] fArr2 = {MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f, 1.0f, MTTypesetterKt.kLineSkipLimitMultiplier};
                    matrix4.mapVectors(fArr2);
                    double d = fArr2[z2 ? 1 : 0];
                    float f16 = fArr2[1];
                    Object[] objArr = z2 ? 1 : 0;
                    i3 = i6;
                    float fHypot = (float) Math.hypot(d, f16);
                    float fHypot2 = (float) Math.hypot(fArr2[2], fArr2[3]);
                    float f17 = (fArr2[objArr == true ? 1 : 0] * fArr2[3]) - (fArr2[1] * fArr2[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > MTTypesetterKt.kLineSkipLimitMultiplier ? Math.abs(f17) / fMax : 0.0f;
                    if (fAbs == MTTypesetterKt.kLineSkipLimitMultiplier) {
                        z2 = objArr == true ? 1 : 0;
                        matrix2 = matrix4;
                        arrayList = arrayList2;
                    } else {
                        Path path3 = this.a;
                        path3.reset();
                        ovc[] ovcVarArr = triVar.a;
                        if (ovcVarArr != null) {
                            float[] fArr3 = new float[6];
                            int length = ovcVarArr.length;
                            z = true;
                            char c = 'm';
                            int i7 = objArr == true ? 1 : 0;
                            while (i7 < length) {
                                ovc ovcVar = ovcVarArr[i7];
                                char c2 = ovcVar.a;
                                Matrix matrix6 = matrix4;
                                float[] fArr4 = ovcVar.b;
                                float f18 = fArr3[objArr == true ? 1 : 0];
                                float f19 = fArr3[1];
                                float f20 = fArr3[2];
                                float f21 = fArr3[3];
                                float f22 = fArr3[4];
                                ArrayList arrayList3 = arrayList2;
                                float f23 = fArr3[5];
                                switch (c2) {
                                    case 'A':
                                    case 'a':
                                        i4 = 7;
                                        break;
                                    case 'C':
                                    case 'c':
                                        i4 = 6;
                                        break;
                                    case 'H':
                                    case 'V':
                                    case 'h':
                                    case 'v':
                                        i4 = 1;
                                        break;
                                    case 'Q':
                                    case 'S':
                                    case 'q':
                                    case 's':
                                        i4 = 4;
                                        break;
                                    case 'Z':
                                    case ModuleDescriptor.MODULE_VERSION /* 122 */:
                                        path3.close();
                                        path3.moveTo(f22, f23);
                                        f18 = f22;
                                        f20 = f18;
                                        f19 = f23;
                                        f21 = f19;
                                    default:
                                        i4 = 2;
                                        break;
                                }
                                float f24 = f22;
                                float f25 = f23;
                                float f26 = fAbs;
                                char c3 = c;
                                float f27 = f18;
                                float f28 = f19;
                                int i8 = objArr == true ? 1 : 0;
                                while (i8 < fArr4.length) {
                                    if (c2 != 'A') {
                                        if (c2 != 'C') {
                                            if (c2 == 'H') {
                                                fArr = fArr4;
                                                path2 = path3;
                                                i5 = i8;
                                                path2.lineTo(fArr[i5 == true ? 1 : 0], f28);
                                                f27 = fArr[i5 == true ? 1 : 0];
                                            } else if (c2 == 'Q') {
                                                fArr = fArr4;
                                                path2 = path3;
                                                i5 = i8;
                                                float f29 = fArr[i5 == true ? 1 : 0];
                                                int i9 = (i5 == true ? 1 : 0) + 1;
                                                float f30 = fArr[i9];
                                                int i10 = (i5 == true ? 1 : 0) + 2;
                                                float f31 = fArr[i10];
                                                int i11 = (i5 == true ? 1 : 0) + 3;
                                                path2.quadTo(f29, f30, f31, fArr[i11]);
                                                f20 = fArr[i5 == true ? 1 : 0];
                                                f21 = fArr[i9];
                                                f27 = fArr[i10];
                                                f28 = fArr[i11];
                                            } else if (c2 == 'V') {
                                                fArr = fArr4;
                                                i5 = i8;
                                                path3.lineTo(f27, fArr[i5 == true ? 1 : 0]);
                                                f28 = fArr[i5 == true ? 1 : 0];
                                            } else if (c2 == 'a') {
                                                fArr = fArr4;
                                                Path path4 = path3;
                                                i5 = i8;
                                                int i12 = (i5 == true ? 1 : 0) + 5;
                                                float f32 = fArr[i12] + f27;
                                                int i13 = (i5 == true ? 1 : 0) + 6;
                                                float f33 = f28;
                                                float f34 = f27;
                                                ovc.a(path4, f34, f33, f32, fArr[i13] + f28, fArr[i5 == true ? 1 : 0], fArr[(i5 == true ? 1 : 0) + 1], fArr[(i5 == true ? 1 : 0) + 2], fArr[(i5 == true ? 1 : 0) + 3] != MTTypesetterKt.kLineSkipLimitMultiplier ? true : objArr == true ? 1 : 0, fArr[(i5 == true ? 1 : 0) + 4] != MTTypesetterKt.kLineSkipLimitMultiplier ? true : objArr == true ? 1 : 0);
                                                f27 = f34 + fArr[i12];
                                                f28 = f33 + fArr[i13];
                                                path3 = path4;
                                                f20 = f27;
                                                f21 = f28;
                                            } else if (c2 == 'c') {
                                                fArr = fArr4;
                                                i5 = i8;
                                                float f35 = fArr[i5 == true ? 1 : 0];
                                                float f36 = fArr[(i5 == true ? 1 : 0) + 1];
                                                int i14 = (i5 == true ? 1 : 0) + 2;
                                                float f37 = fArr[i14];
                                                int i15 = (i5 == true ? 1 : 0) + 3;
                                                float f38 = fArr[i15];
                                                int i16 = (i5 == true ? 1 : 0) + 4;
                                                float f39 = fArr[i16];
                                                int i17 = (i5 == true ? 1 : 0) + 5;
                                                path = path3;
                                                path.rCubicTo(f35, f36, f37, f38, f39, fArr[i17]);
                                                float f40 = f27 + fArr[i14];
                                                float f41 = f28 + fArr[i15];
                                                f27 += fArr[i16];
                                                f28 += fArr[i17];
                                                f21 = f41;
                                                f20 = f40;
                                            } else if (c2 != 'h') {
                                                if (c2 != 'q') {
                                                    if (c2 != 'v') {
                                                        if (c2 != 'L') {
                                                            if (c2 != 'M') {
                                                                if (c2 == 'S') {
                                                                    fArr = fArr4;
                                                                    i5 = i8;
                                                                    if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                                        f27 = (f27 * 2.0f) - f20;
                                                                        f28 = (f28 * 2.0f) - f21;
                                                                    }
                                                                    float f42 = f27;
                                                                    float f43 = f28;
                                                                    float f44 = fArr[i5 == true ? 1 : 0];
                                                                    int i18 = (i5 == true ? 1 : 0) + 1;
                                                                    float f45 = fArr[i18];
                                                                    int i19 = (i5 == true ? 1 : 0) + 2;
                                                                    float f46 = fArr[i19];
                                                                    int i20 = (i5 == true ? 1 : 0) + 3;
                                                                    path3.cubicTo(f42, f43, f44, f45, f46, fArr[i20]);
                                                                    f8 = fArr[i5 == true ? 1 : 0];
                                                                    f9 = fArr[i18];
                                                                    f27 = fArr[i19];
                                                                    f28 = fArr[i20];
                                                                } else if (c2 == 'T') {
                                                                    fArr = fArr4;
                                                                    i5 = i8;
                                                                    if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                                        f27 = (f27 * 2.0f) - f20;
                                                                        f28 = (f28 * 2.0f) - f21;
                                                                    }
                                                                    float f47 = f27;
                                                                    float f48 = f28;
                                                                    float f49 = fArr[i5 == true ? 1 : 0];
                                                                    int i21 = (i5 == true ? 1 : 0) + 1;
                                                                    path3.quadTo(f47, f48, f49, fArr[i21]);
                                                                    f20 = f47;
                                                                    f21 = f48;
                                                                    f27 = fArr[i5 == true ? 1 : 0];
                                                                    f28 = fArr[i21];
                                                                } else if (c2 == 'l') {
                                                                    fArr = fArr4;
                                                                    i5 = i8;
                                                                    float f50 = fArr[i5 == true ? 1 : 0];
                                                                    int i22 = (i5 == true ? 1 : 0) + 1;
                                                                    path3.rLineTo(f50, fArr[i22]);
                                                                    f27 += fArr[i5 == true ? 1 : 0];
                                                                    f5 = fArr[i22];
                                                                } else if (c2 == 'm') {
                                                                    fArr = fArr4;
                                                                    i5 = i8;
                                                                    float f51 = fArr[i5 == true ? 1 : 0];
                                                                    f27 += f51;
                                                                    float f52 = fArr[(i5 == true ? 1 : 0) + 1];
                                                                    f28 += f52;
                                                                    if (i5 > 0) {
                                                                        path3.rLineTo(f51, f52);
                                                                    } else {
                                                                        path3.rMoveTo(f51, f52);
                                                                        f24 = f27;
                                                                    }
                                                                } else if (c2 == 's') {
                                                                    fArr = fArr4;
                                                                    i5 = i8;
                                                                    if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                                        f10 = f27 - f20;
                                                                        f11 = f28 - f21;
                                                                    } else {
                                                                        f10 = MTTypesetterKt.kLineSkipLimitMultiplier;
                                                                        f11 = MTTypesetterKt.kLineSkipLimitMultiplier;
                                                                    }
                                                                    float f53 = fArr[i5 == true ? 1 : 0];
                                                                    int i23 = (i5 == true ? 1 : 0) + 1;
                                                                    float f54 = fArr[i23];
                                                                    int i24 = (i5 == true ? 1 : 0) + 2;
                                                                    float f55 = fArr[i24];
                                                                    int i25 = (i5 == true ? 1 : 0) + 3;
                                                                    path3.rCubicTo(f10, f11, f53, f54, f55, fArr[i25]);
                                                                    f8 = f27 + fArr[i5 == true ? 1 : 0];
                                                                    f9 = f28 + fArr[i23];
                                                                    f27 += fArr[i24];
                                                                    f28 += fArr[i25];
                                                                } else if (c2 != 't') {
                                                                    fArr = fArr4;
                                                                    i5 = i8;
                                                                } else {
                                                                    fArr = fArr4;
                                                                    if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                                        f12 = f27 - f20;
                                                                        f13 = f28 - f21;
                                                                    } else {
                                                                        f12 = MTTypesetterKt.kLineSkipLimitMultiplier;
                                                                        f13 = MTTypesetterKt.kLineSkipLimitMultiplier;
                                                                    }
                                                                    int i26 = i8 + 1;
                                                                    i5 = i8;
                                                                    path3.rQuadTo(f12, f13, fArr[i8], fArr[i26]);
                                                                    f2 = f27 + f12;
                                                                    f3 = f28 + f13;
                                                                    f27 += fArr[i5 == true ? 1 : 0];
                                                                    f4 = fArr[i26];
                                                                }
                                                                f21 = f9;
                                                                f20 = f8;
                                                            } else {
                                                                fArr = fArr4;
                                                                i5 = i8;
                                                                f6 = fArr[i5 == true ? 1 : 0];
                                                                f7 = fArr[(i5 == true ? 1 : 0) + 1];
                                                                if (i5 > 0) {
                                                                    path3.lineTo(f6, f7);
                                                                } else {
                                                                    path3.moveTo(f6, f7);
                                                                    f27 = f6;
                                                                    f24 = f27;
                                                                    f28 = f7;
                                                                }
                                                            }
                                                            f25 = f28;
                                                        } else {
                                                            fArr = fArr4;
                                                            i5 = i8;
                                                            float f56 = fArr[i5 == true ? 1 : 0];
                                                            int i27 = (i5 == true ? 1 : 0) + 1;
                                                            path3.lineTo(f56, fArr[i27]);
                                                            f6 = fArr[i5 == true ? 1 : 0];
                                                            f7 = fArr[i27];
                                                        }
                                                        f27 = f6;
                                                        f28 = f7;
                                                    } else {
                                                        fArr = fArr4;
                                                        i5 = i8;
                                                        path3.rLineTo(MTTypesetterKt.kLineSkipLimitMultiplier, fArr[i5 == true ? 1 : 0]);
                                                        f5 = fArr[i5 == true ? 1 : 0];
                                                    }
                                                    f28 += f5;
                                                } else {
                                                    fArr = fArr4;
                                                    i5 = i8;
                                                    float f57 = fArr[i5 == true ? 1 : 0];
                                                    int i28 = (i5 == true ? 1 : 0) + 1;
                                                    float f58 = fArr[i28];
                                                    int i29 = (i5 == true ? 1 : 0) + 2;
                                                    float f59 = fArr[i29];
                                                    int i30 = (i5 == true ? 1 : 0) + 3;
                                                    path3.rQuadTo(f57, f58, f59, fArr[i30]);
                                                    f2 = f27 + fArr[i5 == true ? 1 : 0];
                                                    f3 = f28 + fArr[i28];
                                                    f27 += fArr[i29];
                                                    f4 = fArr[i30];
                                                }
                                                f28 += f4;
                                                f20 = f2;
                                                f21 = f3;
                                            } else {
                                                fArr = fArr4;
                                                i5 = i8;
                                                path3.rLineTo(fArr[i5 == true ? 1 : 0], MTTypesetterKt.kLineSkipLimitMultiplier);
                                                f27 += fArr[i5 == true ? 1 : 0];
                                            }
                                            path3 = path2;
                                        } else {
                                            fArr = fArr4;
                                            Path path5 = path3;
                                            i5 = i8;
                                            float f60 = fArr[i5 == true ? 1 : 0];
                                            float f61 = fArr[(i5 == true ? 1 : 0) + 1];
                                            int i31 = (i5 == true ? 1 : 0) + 2;
                                            float f62 = fArr[i31];
                                            int i32 = (i5 == true ? 1 : 0) + 3;
                                            float f63 = fArr[i32];
                                            int i33 = (i5 == true ? 1 : 0) + 4;
                                            float f64 = fArr[i33];
                                            int i34 = (i5 == true ? 1 : 0) + 5;
                                            path = path5;
                                            path.cubicTo(f60, f61, f62, f63, f64, fArr[i34]);
                                            float f65 = fArr[i33];
                                            float f66 = fArr[i34];
                                            float f67 = fArr[i31];
                                            f21 = fArr[i32];
                                            f27 = f65;
                                            f28 = f66;
                                            f20 = f67;
                                        }
                                        path3 = path;
                                    } else {
                                        fArr = fArr4;
                                        Path path6 = path3;
                                        i5 = i8;
                                        float f68 = f27;
                                        float f69 = f28;
                                        int i35 = (i5 == true ? 1 : 0) + 5;
                                        float f70 = fArr[i35];
                                        int i36 = (i5 == true ? 1 : 0) + 6;
                                        ovc.a(path6, f68, f69, f70, fArr[i36], fArr[i5 == true ? 1 : 0], fArr[(i5 == true ? 1 : 0) + 1], fArr[(i5 == true ? 1 : 0) + 2], fArr[(i5 == true ? 1 : 0) + 3] != MTTypesetterKt.kLineSkipLimitMultiplier ? true : objArr == true ? 1 : 0, fArr[(i5 == true ? 1 : 0) + 4] != MTTypesetterKt.kLineSkipLimitMultiplier ? true : objArr == true ? 1 : 0);
                                        path3 = path6;
                                        float f71 = fArr[i35];
                                        f21 = fArr[i36];
                                        f28 = f21;
                                        f20 = f71;
                                        f27 = f20;
                                    }
                                    i8 = i5 + i4;
                                    c3 = c2;
                                    fArr4 = fArr;
                                }
                                fArr3[objArr == true ? 1 : 0] = f27;
                                fArr3[1] = f28;
                                fArr3[2] = f20;
                                fArr3[3] = f21;
                                fArr3[4] = f24;
                                fArr3[5] = f25;
                                i7++;
                                c = ovcVar.a;
                                matrix4 = matrix6;
                                arrayList2 = arrayList3;
                                fAbs = f26;
                            }
                        } else {
                            z = true;
                        }
                        matrix2 = matrix4;
                        arrayList = arrayList2;
                        float f72 = fAbs;
                        Path path7 = this.b;
                        path7.reset();
                        if (triVar instanceof pri) {
                            path7.setFillType(triVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path7.addPath(path3, matrix5);
                            canvas.clipPath(path7);
                            z2 = objArr == true ? 1 : 0;
                        } else {
                            qri qriVar = (qri) triVar;
                            float f73 = qriVar.i;
                            if (f73 == MTTypesetterKt.kLineSkipLimitMultiplier && qriVar.j == 1.0f) {
                                z2 = objArr == true ? 1 : 0;
                            } else {
                                float f74 = qriVar.k;
                                float f75 = (f73 + f74) % 1.0f;
                                float f76 = (qriVar.j + f74) % 1.0f;
                                if (this.f == null) {
                                    this.f = new PathMeasure();
                                }
                                PathMeasure pathMeasure = this.f;
                                z2 = objArr == true ? 1 : 0;
                                pathMeasure.setPath(path3, z2);
                                float length2 = this.f.getLength();
                                float f77 = f75 * length2;
                                float f78 = f76 * length2;
                                path3.reset();
                                PathMeasure pathMeasure2 = this.f;
                                if (f77 > f78) {
                                    boolean z3 = z;
                                    pathMeasure2.getSegment(f77, length2, path3, z3);
                                    PathMeasure pathMeasure3 = this.f;
                                    f = MTTypesetterKt.kLineSkipLimitMultiplier;
                                    pathMeasure3.getSegment(MTTypesetterKt.kLineSkipLimitMultiplier, f78, path3, z3);
                                } else {
                                    f = MTTypesetterKt.kLineSkipLimitMultiplier;
                                    pathMeasure2.getSegment(f77, f78, path3, z);
                                }
                                path3.rLineTo(f, f);
                            }
                            path7.addPath(path3, matrix5);
                            l94 l94Var = qriVar.f;
                            if (((Shader) l94Var.c) != null || l94Var.b != 0) {
                                if (this.e == null) {
                                    Paint paint = new Paint(1);
                                    this.e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = this.e;
                                Shader shader = (Shader) l94Var.c;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix5);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(qriVar.h * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i37 = l94Var.b;
                                    float f79 = qriVar.h;
                                    PorterDuff.Mode mode = xri.N;
                                    paint2.setColor((i37 & 16777215) | (((int) (Color.alpha(i37) * f79)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path7.setFillType(qriVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path7, paint2);
                            }
                            l94 l94Var2 = qriVar.d;
                            if (((Shader) l94Var2.c) != null || l94Var2.b != 0) {
                                if (this.d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.d;
                                Paint.Join join = qriVar.m;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = qriVar.l;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(qriVar.n);
                                Shader shader2 = (Shader) l94Var2.c;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix5);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(qriVar.g * 255.0f));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i38 = l94Var2.b;
                                    float f80 = qriVar.g;
                                    PorterDuff.Mode mode2 = xri.N;
                                    paint4.setColor((i38 & 16777215) | (((int) (Color.alpha(i38) * f80)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(qriVar.e * fMin * f72);
                                canvas.drawPath(path7, paint4);
                            }
                        }
                    }
                }
                i6 = i3 + 1;
                matrix4 = matrix2;
                arrayList2 = arrayList;
            }
            matrix2 = matrix4;
            arrayList = arrayList2;
            i3 = i6;
            i6 = i3 + 1;
            matrix4 = matrix2;
            arrayList2 = arrayList;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.l = i;
    }

    public uri() {
        this.c = new Matrix();
        this.h = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.i = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.j = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.k = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.l = 255;
        this.m = null;
        this.n = null;
        this.o = new bp0(0);
        this.g = new rri();
        this.a = new Path();
        this.b = new Path();
    }
}
