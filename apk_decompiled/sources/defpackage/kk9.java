package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class kk9 implements txb {
    public static final List H;
    public final String[] E;
    public final Set F;
    public final ArrayList G;

    static {
        String strS0 = w44.S0(x44.X('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        List listX = x44.X(strS0.concat("/Any"), strS0.concat("/Nothing"), strS0.concat("/Unit"), strS0.concat("/Throwable"), strS0.concat("/Number"), strS0.concat("/Byte"), strS0.concat("/Double"), strS0.concat("/Float"), strS0.concat("/Int"), strS0.concat("/Long"), strS0.concat("/Short"), strS0.concat("/Boolean"), strS0.concat("/Char"), strS0.concat("/CharSequence"), strS0.concat("/String"), strS0.concat("/Comparable"), strS0.concat("/Enum"), strS0.concat("/Array"), strS0.concat("/ByteArray"), strS0.concat("/DoubleArray"), strS0.concat("/FloatArray"), strS0.concat("/IntArray"), strS0.concat("/LongArray"), strS0.concat("/ShortArray"), strS0.concat("/BooleanArray"), strS0.concat("/CharArray"), strS0.concat("/Cloneable"), strS0.concat("/Annotation"), strS0.concat("/collections/Iterable"), strS0.concat("/collections/MutableIterable"), strS0.concat("/collections/Collection"), strS0.concat("/collections/MutableCollection"), strS0.concat("/collections/List"), strS0.concat("/collections/MutableList"), strS0.concat("/collections/Set"), strS0.concat("/collections/MutableSet"), strS0.concat("/collections/Map"), strS0.concat("/collections/MutableMap"), strS0.concat("/collections/Map.Entry"), strS0.concat("/collections/MutableMap.MutableEntry"), strS0.concat("/collections/Iterator"), strS0.concat("/collections/MutableIterator"), strS0.concat("/collections/ListIterator"), strS0.concat("/collections/MutableListIterator"));
        H = listX;
        c19 c19VarU1 = w44.u1(listX);
        int iD0 = tta.d0(x44.y(c19VarU1, 10));
        if (iD0 < 16) {
            iD0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
        Iterator it = c19VarU1.iterator();
        while (true) {
            f2 f2Var = (f2) it;
            if (!((Iterator) f2Var.G).hasNext()) {
                return;
            }
            b19 b19Var = (b19) f2Var.next();
            linkedHashMap.put((String) b19Var.b, Integer.valueOf(b19Var.a));
        }
    }

    public kk9(dl9 dl9Var, String[] strArr) {
        strArr.getClass();
        List list = dl9Var.G;
        Set setT1 = list.isEmpty() ? um6.E : w44.t1(list);
        List<cl9> list2 = dl9Var.F;
        list2.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list2.size());
        for (cl9 cl9Var : list2) {
            int i = cl9Var.G;
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(cl9Var);
            }
        }
        arrayList.trimToSize();
        this.E = strArr;
        this.F = setT1;
        this.G = arrayList;
    }

    @Override // defpackage.txb
    public final String a(int i) {
        return getString(i);
    }

    @Override // defpackage.txb
    public final boolean b(int i) {
        return this.F.contains(Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    @Override // defpackage.txb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getString(int r8) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kk9.getString(int):java.lang.String");
    }
}
