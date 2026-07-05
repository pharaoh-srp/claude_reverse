package defpackage;

import com.airbnb.lottie.parser.moshi.c;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e80 {
    public static final epk a = epk.v("k", "x", "y");

    public static d80 a(c cVar, bna bnaVar) {
        ArrayList arrayList = new ArrayList();
        if (cVar.e() == 1) {
            cVar.beginArray();
            while (cVar.hasNext()) {
                c cVar2 = cVar;
                bna bnaVar2 = bnaVar;
                arrayList.add(new suc(bnaVar2, tp9.b(cVar2, bnaVar2, zpi.c(), lyk.T, cVar.e() == 3, false)));
                cVar = cVar2;
                bnaVar = bnaVar2;
            }
            cVar.endArray();
            up9.b(arrayList);
        } else {
            arrayList.add(new rp9(ej9.b(cVar, zpi.c())));
        }
        return new d80(arrayList);
    }

    public static k80 b(c cVar, bna bnaVar) {
        cVar.beginObject();
        d80 d80VarA = null;
        c80 c80VarE = null;
        boolean z = false;
        c80 c80VarE2 = null;
        while (cVar.e() != 4) {
            int i = cVar.i(a);
            if (i == 0) {
                d80VarA = a(cVar, bnaVar);
            } else if (i != 1) {
                if (i != 2) {
                    cVar.j();
                    cVar.skipValue();
                } else if (cVar.e() == 6) {
                    cVar.skipValue();
                    z = true;
                } else {
                    c80VarE = urk.e(cVar, bnaVar, true);
                }
            } else if (cVar.e() == 6) {
                cVar.skipValue();
                z = true;
            } else {
                c80VarE2 = urk.e(cVar, bnaVar, true);
            }
        }
        cVar.endObject();
        if (z) {
            bnaVar.a("Lottie doesn't support expressions.");
        }
        return d80VarA != null ? d80VarA : new f80(c80VarE2, c80VarE);
    }
}
