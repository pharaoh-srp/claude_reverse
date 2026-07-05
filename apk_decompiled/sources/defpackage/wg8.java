package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class wg8 implements Iterable, mm9 {
    public static final wg8 F = new wg8(new String[0]);
    public final String[] E;

    public wg8(String[] strArr) {
        strArr.getClass();
        this.E = strArr;
    }

    public final String a(String str) {
        String[] strArr = this.E;
        strArr.getClass();
        int length = strArr.length - 2;
        int iX = iv1.x(length, 0, -2);
        if (iX > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == iX) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String e(int i) {
        String str = (String) mp0.I0(i * 2, this.E);
        if (str != null) {
            return str;
        }
        xh6.j(vb7.p("name[", i, ']'));
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wg8) {
            return Arrays.equals(this.E, ((wg8) obj).E);
        }
        return false;
    }

    public final gmf g() {
        gmf gmfVar = new gmf(16);
        b54.u0((ArrayList) gmfVar.F, this.E);
        return gmfVar;
    }

    public final TreeMap h() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeMap treeMap = new TreeMap(comparator);
        int size = size();
        for (int i = 0; i < size; i++) {
            String strE = e(i);
            Locale locale = Locale.US;
            String strN = ij0.n(locale, strE, locale);
            List arrayList = (List) treeMap.get(strN);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(strN, arrayList);
            }
            arrayList.add(k(i));
        }
        return treeMap;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.E);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        cpc[] cpcVarArr = new cpc[size];
        for (int i = 0; i < size; i++) {
            cpcVarArr[i] = new cpc(e(i), k(i));
        }
        return new f2(cpcVarArr);
    }

    public final String k(int i) {
        String str = (String) mp0.I0((i * 2) + 1, this.E);
        if (str != null) {
            return str;
        }
        xh6.j(vb7.p("value[", i, ']'));
        return null;
    }

    public final List l(String str) {
        int size = size();
        List listUnmodifiableList = null;
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(e(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(k(i));
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
        }
        return listUnmodifiableList == null ? lm6.E : listUnmodifiableList;
    }

    public final int size() {
        return this.E.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strE = e(i);
            String strK = k(i);
            sb.append(strE);
            sb.append(": ");
            if (zkj.k(strE)) {
                strK = "██";
            }
            sb.append(strK);
            sb.append("\n");
        }
        return sb.toString();
    }
}
