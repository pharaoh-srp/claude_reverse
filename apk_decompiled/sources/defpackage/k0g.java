package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.a;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class k0g implements fri {
    public static final k0g E = new k0g();
    public static final epk F = epk.v("c", "v", "i", "o");

    @Override // defpackage.fri
    public final Object n(a aVar, float f) {
        if (aVar.e() == 1) {
            aVar.beginArray();
        }
        aVar.beginObject();
        ArrayList arrayListC = null;
        ArrayList arrayListC2 = null;
        ArrayList arrayListC3 = null;
        boolean zD = false;
        while (aVar.hasNext()) {
            int i = aVar.i(F);
            if (i == 0) {
                zD = aVar.d();
            } else if (i == 1) {
                arrayListC = ej9.c(aVar, f);
            } else if (i == 2) {
                arrayListC2 = ej9.c(aVar, f);
            } else if (i != 3) {
                aVar.j();
                aVar.skipValue();
            } else {
                arrayListC3 = ej9.c(aVar, f);
            }
        }
        aVar.endObject();
        if (aVar.e() == 2) {
            aVar.endArray();
        }
        if (arrayListC == null || arrayListC2 == null || arrayListC3 == null) {
            sz6.p("Shape data was missing information.");
            return null;
        }
        if (arrayListC.isEmpty()) {
            return new j0g(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayListC.size();
        PointF pointF = (PointF) arrayListC.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 1; i2 < size; i2++) {
            PointF pointF2 = (PointF) arrayListC.get(i2);
            int i3 = i2 - 1;
            arrayList.add(new bd5(vkb.a((PointF) arrayListC.get(i3), (PointF) arrayListC3.get(i3)), vkb.a(pointF2, (PointF) arrayListC2.get(i2)), pointF2));
        }
        if (zD) {
            PointF pointF3 = (PointF) arrayListC.get(0);
            int i4 = size - 1;
            arrayList.add(new bd5(vkb.a((PointF) arrayListC.get(i4), (PointF) arrayListC3.get(i4)), vkb.a(pointF3, (PointF) arrayListC2.get(0)), pointF3));
        }
        return new j0g(pointF, zD, arrayList);
    }
}
