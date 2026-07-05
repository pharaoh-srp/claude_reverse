package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pr1 {
    public final int a;
    public String b = "";
    public List c = lm6.E;

    public pr1(int i) {
        this.a = i;
    }

    public final List a(z74 z74Var, String str) {
        List listW;
        int iMin;
        str.getClass();
        if (str.equals(this.b)) {
            return this.c;
        }
        Collection collectionJ0 = isg.q0(str, this.b, false) ? w44.J0(1, this.c) : lm6.E;
        Iterator it = collectionJ0.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += ((wta) it.next()).a.length();
        }
        String strSubstring = str.substring(length);
        int iK0 = bsg.K0(strSubstring, '\n', 0, 6) + 1;
        b5c b5cVarB = z74Var.a.b(bsg.j1(iK0, strSubstring));
        p96 p96Var = b5cVarB instanceof p96 ? (p96) b5cVarB : null;
        if (p96Var == null) {
            listW = x44.W(new wta(strSubstring, z74Var.a(strSubstring)));
        } else {
            int i = 0;
            for (int i2 = 0; i2 < strSubstring.length(); i2++) {
                if (strSubstring.charAt(i2) == '\n') {
                    i++;
                }
            }
            ArrayList arrayList = new ArrayList(i + 1);
            arrayList.add(0);
            int i3 = 0;
            for (int i4 = 0; i4 < strSubstring.length(); i4++) {
                i3++;
                if (strSubstring.charAt(i4) == '\n') {
                    arrayList.add(Integer.valueOf(i3));
                }
            }
            int[] iArrO1 = w44.o1(arrayList);
            ArrayList arrayList2 = new ArrayList();
            int i5 = 0;
            for (b5c b5cVar = p96Var.b; b5cVar != null; b5cVar = b5cVar.e) {
                List listD = b5cVar.d();
                listD.getClass();
                cfg cfgVar = (cfg) w44.V0(listD);
                if (cfgVar == null) {
                    iMin = iK0;
                } else {
                    int i6 = cfgVar.a;
                    iMin = Math.min(cfgVar.c + cfgVar.b + ((i6 < 0 || i6 >= iArrO1.length) ? iK0 : iArrO1[i6]), iK0);
                }
                boolean z = b5cVar.e == null;
                boolean z2 = iMin - i5 >= this.a;
                if (z || z2) {
                    if (z) {
                        iMin = strSubstring.length();
                    }
                    String strSubstring2 = strSubstring.substring(i5, iMin);
                    arrayList2.add(new wta(strSubstring2, z74Var.a(strSubstring2)));
                    i5 = iMin;
                }
            }
            boolean zIsEmpty = arrayList2.isEmpty();
            List listW2 = arrayList2;
            if (zIsEmpty) {
                listW2 = x44.W(new wta(strSubstring, z74Var.a(strSubstring)));
            }
            listW = listW2;
        }
        ArrayList arrayListA1 = w44.a1(collectionJ0, listW);
        this.c = arrayListA1;
        this.b = str;
        return arrayListA1;
    }
}
