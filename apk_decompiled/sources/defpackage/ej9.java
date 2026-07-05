package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.airbnb.lottie.parser.moshi.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ej9 {
    public static final epk a = epk.v("x", "y");

    public static int a(a aVar) {
        aVar.beginArray();
        int iNextDouble = (int) (aVar.nextDouble() * 255.0d);
        int iNextDouble2 = (int) (aVar.nextDouble() * 255.0d);
        int iNextDouble3 = (int) (aVar.nextDouble() * 255.0d);
        while (aVar.hasNext()) {
            aVar.skipValue();
        }
        aVar.endArray();
        return Color.argb(255, iNextDouble, iNextDouble2, iNextDouble3);
    }

    public static PointF b(a aVar, float f) {
        int iF = sq6.F(aVar.e());
        if (iF == 0) {
            aVar.beginArray();
            float fNextDouble = (float) aVar.nextDouble();
            float fNextDouble2 = (float) aVar.nextDouble();
            while (aVar.e() != 2) {
                aVar.skipValue();
            }
            aVar.endArray();
            return new PointF(fNextDouble * f, fNextDouble2 * f);
        }
        if (iF != 2) {
            if (iF != 6) {
                sz6.p("Unknown point starts with ".concat(ms6.A(aVar.e())));
                return null;
            }
            float fNextDouble3 = (float) aVar.nextDouble();
            float fNextDouble4 = (float) aVar.nextDouble();
            while (aVar.hasNext()) {
                aVar.skipValue();
            }
            return new PointF(fNextDouble3 * f, fNextDouble4 * f);
        }
        aVar.beginObject();
        float fD = MTTypesetterKt.kLineSkipLimitMultiplier;
        float fD2 = 0.0f;
        while (aVar.hasNext()) {
            int i = aVar.i(a);
            if (i == 0) {
                fD = d(aVar);
            } else if (i != 1) {
                aVar.j();
                aVar.skipValue();
            } else {
                fD2 = d(aVar);
            }
        }
        aVar.endObject();
        return new PointF(fD * f, fD2 * f);
    }

    public static ArrayList c(a aVar, float f) {
        ArrayList arrayList = new ArrayList();
        aVar.beginArray();
        while (aVar.e() == 1) {
            aVar.beginArray();
            arrayList.add(b(aVar, f));
            aVar.endArray();
        }
        aVar.endArray();
        return arrayList;
    }

    public static float d(a aVar) {
        int iE = aVar.e();
        int iF = sq6.F(iE);
        if (iF != 0) {
            if (iF == 6) {
                return (float) aVar.nextDouble();
            }
            sz6.p("Unknown value for token of type ".concat(ms6.A(iE)));
            return MTTypesetterKt.kLineSkipLimitMultiplier;
        }
        aVar.beginArray();
        float fNextDouble = (float) aVar.nextDouble();
        while (aVar.hasNext()) {
            aVar.skipValue();
        }
        aVar.endArray();
        return fNextDouble;
    }
}
