package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c06 {
    public static final bm4 c = new bm4();
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final c06 m;
    public static final c06 n;
    public static final c06 o;
    public static final c06 p;
    public static final c06 q;
    public static final ArrayList r;
    public static final ArrayList s;
    public final List a;
    public final int b;

    static {
        b06 b06Var;
        int i2 = d;
        int i3 = i2 << 1;
        e = i2;
        int i4 = i2 << 2;
        f = i3;
        int i5 = i2 << 3;
        g = i4;
        int i6 = i2 << 4;
        h = i5;
        int i7 = i2 << 5;
        i = i6;
        j = i7;
        d = i2 << 7;
        int i8 = (i2 << 6) - 1;
        k = i8;
        int i9 = i2 | i3 | i4;
        l = i9;
        m = new c06(i8);
        n = new c06(i6 | i7);
        new c06(i2);
        new c06(i3);
        new c06(i4);
        o = new c06(i9);
        new c06(i5);
        p = new c06(i6);
        q = new c06(i7);
        new c06(i3 | i6 | i7);
        Field[] fields = c06.class.getFields();
        fields.getClass();
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            b06 b06Var2 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            c06 c06Var = obj instanceof c06 ? (c06) obj : null;
            if (c06Var != null) {
                int i10 = c06Var.b;
                String name = field2.getName();
                name.getClass();
                b06Var2 = new b06(i10, name);
            }
            if (b06Var2 != null) {
                arrayList2.add(b06Var2);
            }
        }
        r = arrayList2;
        Field[] fields2 = c06.class.getFields();
        fields2.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (x44.r(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            obj3.getClass();
            int iIntValue = ((Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                name2.getClass();
                b06Var = new b06(iIntValue, name2);
            } else {
                b06Var = null;
            }
            if (b06Var != null) {
                arrayList5.add(b06Var);
            }
        }
        s = arrayList5;
    }

    public c06(int i2, List list) {
        list.getClass();
        this.a = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i2 &= ~((a06) it.next()).a();
        }
        this.b = i2;
    }

    public final boolean a(int i2) {
        return (this.b & i2) != 0;
    }

    public final List b() {
        return this.a;
    }

    public final c06 c(int i2) {
        int i3 = i2 & this.b;
        if (i3 == 0) {
            return null;
        }
        return new c06(i3, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c06.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        c06 c06Var = (c06) obj;
        return x44.r(this.a, c06Var.a) && this.b == c06Var.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() throws IOException {
        Object next;
        Iterator it = r.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((b06) next).a == this.b) {
                break;
            }
        }
        b06 b06Var = (b06) next;
        String strS0 = b06Var != null ? b06Var.b : null;
        if (strS0 == null) {
            ArrayList arrayList = new ArrayList();
            for (b06 b06Var2 : s) {
                String str = a(b06Var2.a) ? b06Var2.b : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            strS0 = w44.S0(arrayList, " | ", null, null, null, 62);
        }
        StringBuilder sbX = sq6.x("DescriptorKindFilter(", strS0, ", ");
        sbX.append(this.a);
        sbX.append(')');
        return sbX.toString();
    }

    public /* synthetic */ c06(int i2) {
        this(i2, lm6.E);
    }
}
