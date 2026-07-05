package defpackage;

import com.airbnb.lottie.parser.moshi.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class up9 {
    public static final epk a = epk.v("k");

    public static ArrayList a(a aVar, bna bnaVar, float f, fri friVar, boolean z) {
        a aVar2;
        bna bnaVar2;
        float f2;
        fri friVar2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (aVar.e() == 6) {
            bnaVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        aVar.beginObject();
        while (aVar.hasNext()) {
            if (aVar.i(a) != 0) {
                aVar.skipValue();
            } else if (aVar.e() == 1) {
                aVar.beginArray();
                if (aVar.e() == 7) {
                    a aVar3 = aVar;
                    bna bnaVar3 = bnaVar;
                    float f3 = f;
                    fri friVar3 = friVar;
                    boolean z3 = z;
                    rp9 rp9VarB = tp9.b(aVar3, bnaVar3, f3, friVar3, false, z3);
                    aVar2 = aVar3;
                    bnaVar2 = bnaVar3;
                    f2 = f3;
                    friVar2 = friVar3;
                    z2 = z3;
                    arrayList.add(rp9VarB);
                } else {
                    aVar2 = aVar;
                    bnaVar2 = bnaVar;
                    f2 = f;
                    friVar2 = friVar;
                    z2 = z;
                    while (aVar2.hasNext()) {
                        arrayList.add(tp9.b(aVar2, bnaVar2, f2, friVar2, true, z2));
                    }
                }
                aVar2.endArray();
                aVar = aVar2;
                bnaVar = bnaVar2;
                f = f2;
                friVar = friVar2;
                z = z2;
            } else {
                a aVar4 = aVar;
                arrayList.add(tp9.b(aVar4, bnaVar, f, friVar, false, z));
                aVar = aVar4;
            }
        }
        aVar.endObject();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i;
        Object obj;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            rp9 rp9Var = (rp9) arrayList.get(i2);
            i2++;
            rp9 rp9Var2 = (rp9) arrayList.get(i2);
            rp9Var.h = Float.valueOf(rp9Var2.g);
            if (rp9Var.c == null && (obj = rp9Var2.b) != null) {
                rp9Var.c = obj;
                if (rp9Var instanceof suc) {
                    ((suc) rp9Var).d();
                }
            }
        }
        rp9 rp9Var3 = (rp9) arrayList.get(i);
        if ((rp9Var3.b == null || rp9Var3.c == null) && arrayList.size() > 1) {
            arrayList.remove(rp9Var3);
        }
    }
}
