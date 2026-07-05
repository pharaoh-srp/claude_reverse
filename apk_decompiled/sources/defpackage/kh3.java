package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kh3 {
    public static final String a = w44.S0(x44.X('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
    public static final LinkedHashMap b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listX = x44.X("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iX = iv1.x(0, listX.size() - 1, 2);
        if (iX >= 0) {
            int i = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = a;
                sb.append(str);
                sb.append('/');
                sb.append((String) listX.get(i));
                int i2 = i + 1;
                linkedHashMap.put(sb.toString(), listX.get(i2));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('/');
                linkedHashMap.put(ij0.m(sb2, (String) listX.get(i), "Array"), "[" + ((String) listX.get(i2)));
                if (i == iX) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        linkedHashMap.put(a + "/Unit", "V");
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : x44.X("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : x44.X("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(linkedHashMap, ij0.i("collections/", str3), "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i3 = 0; i3 < 23; i3++) {
            String strP = grc.p(i3, "Function");
            StringBuilder sb3 = new StringBuilder();
            String str4 = a;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i3);
            a(linkedHashMap, strP, sb3.toString());
            a(linkedHashMap, "reflect/KFunction" + i3, str4 + "/reflect/KFunction");
        }
        for (String str5 : x44.X("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(linkedHashMap, kgh.o(str5, ".Companion"), vb7.t(new StringBuilder(), a, "/jvm/internal/", str5, "CompanionObject"));
        }
        b = linkedHashMap;
    }

    public static final void a(LinkedHashMap linkedHashMap, String str, String str2) {
        linkedHashMap.put(a + '/' + str, "L" + str2 + ';');
    }

    public static final String b(String str) {
        str.getClass();
        String str2 = (String) b.get(str);
        if (str2 != null) {
            return str2;
        }
        StringBuilder sb = new StringBuilder("L");
        String strReplace = str.replace('.', '$');
        strReplace.getClass();
        sb.append(strReplace);
        sb.append(';');
        return sb.toString();
    }
}
