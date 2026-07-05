package com.datadog.trace.bootstrap.config.provider;

import defpackage.eve;
import defpackage.gmf;
import defpackage.ij0;
import defpackage.xf4;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final gmf[] a;

    public b(gmf... gmfVarArr) {
        this.a = gmfVarArr;
    }

    public static void a(String str, HashMap map, int i) {
        if (map.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append((String) entry.getKey());
            sb.append(':');
            sb.append((String) entry.getValue());
        }
        xf4.b.a(i, sb.toString(), str);
    }

    public final Object b(String str, Object obj, Class cls, String... strArr) {
        for (gmf gmfVar : this.a) {
            try {
                Properties properties = (Properties) gmfVar.F;
                String property = properties.getProperty(str);
                if (property == null) {
                    int length = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            property = null;
                            break;
                        }
                        String property2 = properties.getProperty(strArr[i]);
                        if (property2 != null) {
                            property = property2;
                            break;
                        }
                        i++;
                    }
                }
                Object objE = a.e(cls, property);
                if (objE != null) {
                    xf4.b.a(3, property, str);
                    return objE;
                }
                continue;
            } catch (NumberFormatException unused) {
            }
        }
        if (obj != null) {
            xf4.b.a(4, obj, str);
        }
        return obj;
    }

    public final boolean c(String str, boolean z, String... strArr) {
        return ((Boolean) b(str, Boolean.valueOf(z), Boolean.class, strArr)).booleanValue();
    }

    public final float d(String str, float f) {
        return ((Float) b(str, Float.valueOf(f), Float.class, new String[0])).floatValue();
    }

    public final int e(String str, int i, String... strArr) {
        return ((Integer) b(str, Integer.valueOf(i), Integer.class, strArr)).intValue();
    }

    public final BitSet f(String str, BitSet bitSet) {
        String strK = k(str);
        if (strK != null) {
            try {
                return a.b(strK);
            } catch (NumberFormatException unused) {
            }
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int iNextSetBit = bitSet.nextSetBit(i);
            if (iNextSetBit < 0) {
                xf4.b.a(4, sb.toString(), str);
                return bitSet;
            }
            int iNextClearBit = bitSet.nextClearBit(iNextSetBit);
            if (sb.length() > 0) {
                sb.append(',');
            }
            if (iNextSetBit < iNextClearBit - 1) {
                sb.append(iNextSetBit);
                sb.append('-');
                sb.append(iNextClearBit);
            } else {
                sb.append(iNextSetBit);
            }
            i = iNextClearBit;
        }
    }

    public final List g(String str) {
        return a.c(k(str), ",");
    }

    public final HashMap h(String str) {
        Map map;
        HashMap map2 = new HashMap();
        gmf[] gmfVarArr = this.a;
        int i = 4;
        for (int length = gmfVarArr.length - 1; length >= 0; length--) {
            String strU = eve.U(((Properties) gmfVarArr[length].F).getProperty(str));
            if (strU.isEmpty()) {
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map3 = new HashMap();
                a.a(strU, map3);
                map = map3;
            }
            if (!map.isEmpty()) {
                gmfVarArr[length].getClass();
                i = 3;
            }
            map2.putAll(map);
        }
        a(str, map2, i);
        return map2;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.HashMap i(java.lang.String r22, java.lang.String... r23) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.trace.bootstrap.config.provider.b.i(java.lang.String, java.lang.String[]):java.util.HashMap");
    }

    public final LinkedHashMap j(String str) {
        Map map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        gmf[] gmfVarArr = this.a;
        int i = 4;
        for (int length = gmfVarArr.length - 1; length >= 0; length--) {
            String strU = eve.U(((Properties) gmfVarArr[length].F).getProperty(str));
            if (strU.isEmpty()) {
                map = Collections.EMPTY_MAP;
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                a.a(strU, linkedHashMap2);
                map = linkedHashMap2;
            }
            if (!map.isEmpty()) {
                gmfVarArr[length].getClass();
                i = 3;
            }
            linkedHashMap.putAll(map);
        }
        a(str, linkedHashMap, i);
        return linkedHashMap;
    }

    public final String k(String str) {
        return l(str, null, new String[0]);
    }

    public final String l(String str, String str2, String... strArr) {
        for (gmf gmfVar : this.a) {
            Properties properties = (Properties) gmfVar.F;
            String property = properties.getProperty(str);
            if (property == null) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        property = null;
                        break;
                    }
                    String property2 = properties.getProperty(strArr[i]);
                    if (property2 != null) {
                        property = property2;
                        break;
                    }
                    i++;
                }
            }
            if (property != null) {
                xf4.b.a(3, property, str);
                return property;
            }
        }
        if (str2 != null) {
            xf4.b.a(4, str2, str);
        }
        return str2;
    }

    public final boolean m(Collection collection, String str, String str2, boolean z) {
        Iterator it = collection.iterator();
        boolean z2 = z;
        while (it.hasNext()) {
            String strC = ij0.C(str, (String) it.next(), str2);
            boolean zC = c(strC.startsWith("trace.") ? strC : "trace.".concat(strC), z, strC);
            z2 = z ? z2 & zC : z2 | zC;
        }
        return z2;
    }
}
