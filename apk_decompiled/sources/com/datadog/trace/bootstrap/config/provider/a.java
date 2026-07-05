package com.datadog.trace.bootstrap.config.provider;

import defpackage.eve;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static void a(String str, HashMap map) {
        int i = 0;
        try {
            int iIndexOf = str.indexOf(58, 0);
            while (iIndexOf != -1) {
                int i2 = iIndexOf + 1;
                int iIndexOf2 = str.indexOf(58, i2);
                int iIndexOf3 = str.indexOf(44, i2);
                if (iIndexOf3 == -1) {
                    iIndexOf3 = str.length();
                }
                int iIndexOf4 = str.indexOf(32, i2);
                if (iIndexOf4 == -1) {
                    iIndexOf4 = str.length();
                }
                int i3 = iIndexOf3 < str.length() ? iIndexOf3 : iIndexOf4;
                while (iIndexOf2 != -1 && iIndexOf2 < i3) {
                    iIndexOf2 = str.indexOf(58, iIndexOf2 + 1);
                }
                if (iIndexOf2 == -1) {
                    if (iIndexOf3 < str.length() - 1) {
                        throw new ConfigConverter$BadFormatException("Non white space characters after trailing ','");
                    }
                } else if (iIndexOf3 >= str.length()) {
                    if (iIndexOf4 >= str.length()) {
                        throw new ConfigConverter$BadFormatException("Illegal position of split character ':'");
                    }
                    iIndexOf3 = iIndexOf4;
                }
                String strTrim = str.substring(i, iIndexOf).trim();
                if (strTrim.indexOf(44) != -1) {
                    throw new ConfigConverter$BadFormatException("Illegal ',' character in key '" + strTrim + "'");
                }
                String strTrim2 = str.substring(i2, iIndexOf3).trim();
                if (strTrim2.indexOf(32) != -1) {
                    throw new ConfigConverter$BadFormatException("Illegal ' ' character in value for key '" + strTrim + "'");
                }
                if (!strTrim.isEmpty() && !strTrim2.isEmpty()) {
                    map.put(strTrim, strTrim2);
                }
                i = iIndexOf3 + 1;
                iIndexOf = iIndexOf2;
            }
        } catch (Throwable th) {
            if (th instanceof ConfigConverter$BadFormatException) {
                th.getMessage();
            }
            map.clear();
        }
    }

    public static BitSet b(String str) {
        String strReplaceAll = str.replaceAll("\\s", "");
        if (!strReplaceAll.matches("\\d{1,3}(?:-\\d{1,3})?(?:,\\d{1,3}(?:-\\d{1,3})?)*")) {
            throw new NumberFormatException();
        }
        BitSet bitSet = new BitSet(Integer.parseInt(strReplaceAll.substring(Math.max(strReplaceAll.lastIndexOf(44), strReplaceAll.lastIndexOf(45)) + 1)));
        for (String str2 : strReplaceAll.split(",", -1)) {
            int iIndexOf = str2.indexOf(45);
            if (iIndexOf == -1) {
                bitSet.set(Integer.parseInt(str2));
            } else if (iIndexOf > 0) {
                int i = Integer.parseInt(str2.substring(0, iIndexOf));
                int i2 = Integer.parseInt(str2.substring(iIndexOf + 1));
                bitSet.set(Math.min(i, i2), Math.max(i, i2) + 1);
            }
        }
        return bitSet;
    }

    public static List c(String str, String str2) {
        String strU = eve.U(str);
        if (strU.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        String[] strArrSplit = strU.split(str2, -1);
        for (int i = 0; i < strArrSplit.length; i++) {
            strArrSplit[i] = strArrSplit[i].trim();
        }
        return Collections.unmodifiableList(Arrays.asList(strArrSplit));
    }

    public static String d(String str, int i, int i2, boolean z) {
        if (i >= i2) {
            return "";
        }
        StringBuilder sb = new StringBuilder(i2 - i);
        int i3 = -1;
        int i4 = -1;
        for (int i5 = i; i5 < i2; i5++) {
            char cCharAt = str.charAt(i5);
            if (z) {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            if (Character.isWhitespace(cCharAt)) {
                sb.append(' ');
            } else {
                if (i3 == -1) {
                    i3 = i5;
                }
                sb.append(cCharAt);
                i4 = i5;
            }
        }
        return i3 == -1 ? "" : sb.substring(i3 - i, (i4 - i) + 1);
    }

    public static Object e(Class cls, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        try {
            if (cls == Boolean.class) {
                return Boolean.valueOf(str);
            }
            if (cls == Integer.class) {
                return Integer.valueOf(str);
            }
            if (cls == Long.class) {
                return Long.valueOf(str);
            }
            if (cls == Double.class) {
                return Double.valueOf(str);
            }
            if (cls == Float.class) {
                return Float.valueOf(str);
            }
            return null;
        } catch (NumberFormatException e) {
            throw e;
        } catch (Throwable th) {
            throw new NumberFormatException(th.toString());
        }
    }
}
