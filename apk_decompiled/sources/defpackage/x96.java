package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.a;

/* JADX INFO: loaded from: classes2.dex */
public final class x96 implements fri {
    public static final x96 E = new x96();
    public static final epk F = epk.v("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // defpackage.fri
    public final Object n(a aVar, float f) {
        aVar.beginObject();
        String strNextString = null;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        int iNextInt = 0;
        int iA = 0;
        int iA2 = 0;
        boolean zD = true;
        int i = 3;
        String strNextString2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (aVar.hasNext()) {
            switch (aVar.i(F)) {
                case 0:
                    strNextString = aVar.nextString();
                    break;
                case 1:
                    strNextString2 = aVar.nextString();
                    break;
                case 2:
                    fNextDouble = (float) aVar.nextDouble();
                    break;
                case 3:
                    int iNextInt2 = aVar.nextInt();
                    i = (iNextInt2 <= 2 && iNextInt2 >= 0) ? sq6.H(3)[iNextInt2] : 3;
                    break;
                case 4:
                    iNextInt = aVar.nextInt();
                    break;
                case 5:
                    fNextDouble2 = (float) aVar.nextDouble();
                    break;
                case 6:
                    fNextDouble3 = (float) aVar.nextDouble();
                    break;
                case 7:
                    iA = ej9.a(aVar);
                    break;
                case 8:
                    iA2 = ej9.a(aVar);
                    break;
                case 9:
                    fNextDouble4 = (float) aVar.nextDouble();
                    break;
                case 10:
                    zD = aVar.d();
                    break;
                case 11:
                    aVar.beginArray();
                    pointF = new PointF(((float) aVar.nextDouble()) * f, ((float) aVar.nextDouble()) * f);
                    aVar.endArray();
                    break;
                case 12:
                    aVar.beginArray();
                    pointF = pointF;
                    pointF2 = new PointF(((float) aVar.nextDouble()) * f, ((float) aVar.nextDouble()) * f);
                    aVar.endArray();
                    break;
                default:
                    aVar.j();
                    aVar.skipValue();
                    break;
            }
        }
        aVar.endObject();
        w96 w96Var = new w96();
        w96Var.a = strNextString;
        w96Var.b = strNextString2;
        w96Var.c = fNextDouble;
        w96Var.d = i;
        w96Var.e = iNextInt;
        w96Var.f = fNextDouble2;
        w96Var.g = fNextDouble3;
        w96Var.h = iA;
        w96Var.i = iA2;
        w96Var.j = fNextDouble4;
        w96Var.k = zD;
        w96Var.l = pointF;
        w96Var.m = pointF2;
        return w96Var;
    }
}
