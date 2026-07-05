package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class u4d {
    public static final qi6 a;
    public static final r4d b;

    static {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        String property = System.getProperty("java.version");
        int iIndexOf = property.indexOf(45);
        int i = 0;
        if (iIndexOf >= 0) {
            property = property.substring(0, iIndexOf);
        }
        try {
            ArrayList arrayListC = c(property);
            iIntValue = ((Integer) arrayListC.get(0)).intValue();
            try {
                if (iIntValue == 1) {
                    iIntValue = ((Integer) arrayListC.get(1)).intValue();
                    iIntValue2 = ((Integer) arrayListC.get(2)).intValue();
                    try {
                        iIntValue3 = ((Integer) arrayListC.get(3)).intValue();
                    } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                    }
                } else {
                    int iIntValue4 = ((Integer) arrayListC.get(1)).intValue();
                    try {
                        iIntValue3 = ((Integer) arrayListC.get(2)).intValue();
                        iIntValue2 = iIntValue4;
                    } catch (IndexOutOfBoundsException | NumberFormatException unused2) {
                        iIntValue2 = iIntValue4;
                    }
                }
                i = iIntValue3;
            } catch (IndexOutOfBoundsException | NumberFormatException unused3) {
                iIntValue2 = i;
            }
        } catch (IndexOutOfBoundsException | NumberFormatException unused4) {
            iIntValue = 0;
            iIntValue2 = 0;
        }
        qi6 qi6Var = new qi6();
        qi6Var.a = iIntValue;
        qi6Var.b = iIntValue2;
        qi6Var.c = i;
        a = qi6Var;
        String property2 = System.getProperty("java.version");
        String property3 = System.getProperty("java.runtime.version");
        System.getProperty("java.runtime.name");
        System.getProperty("java.vm.vendor");
        String property4 = System.getProperty("java.vendor.version");
        r4d r4dVar = new r4d();
        if (property2 == null) {
            property2 = "";
        }
        if (property4 == null) {
            property4 = "";
        }
        r4dVar.a = property4;
        if (property2.isEmpty() || property3 == null) {
            property3 = property2;
        }
        if (property2.length() + 1 < property3.length()) {
            property3.substring(property2.length() + 1);
        }
        b = r4dVar;
    }

    public static boolean a(int i) {
        return a.a == i;
    }

    public static boolean b(int i, int i2) {
        qi6 qi6Var = a;
        int i3 = qi6Var.a;
        int i4 = qi6Var.b;
        int i5 = qi6Var.c;
        if (i3 > i) {
            return true;
        }
        if (i3 != i || i4 <= 0) {
            return i3 == i && i4 == 0 && i5 >= i2;
        }
        return true;
    }

    public static ArrayList c(String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= '0' && cCharAt <= '9') {
                i = (cCharAt - '0') + (i * 10);
            } else {
                if (cCharAt != '.' && cCharAt != '_' && cCharAt != '+') {
                    throw new NumberFormatException();
                }
                arrayList.add(Integer.valueOf(i));
                i = 0;
            }
        }
        arrayList.add(Integer.valueOf(i));
        return arrayList;
    }
}
