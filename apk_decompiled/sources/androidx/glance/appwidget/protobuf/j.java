package androidx.glance.appwidget.protobuf;

import defpackage.aka;
import defpackage.da6;
import defpackage.ij0;
import defpackage.ive;
import defpackage.l69;
import defpackage.lo7;
import defpackage.mr9;
import defpackage.n89;
import defpackage.nud;
import defpackage.qt1;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {
    public static final Class a;
    public static final k b;
    public static final m c;

    static {
        Class<?> cls;
        Class<?> cls2;
        nud nudVar = nud.c;
        k kVar = null;
        try {
            cls = Class.forName("androidx.glance.appwidget.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            nud nudVar2 = nud.c;
            try {
                cls2 = Class.forName("androidx.glance.appwidget.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                kVar = (k) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = kVar;
        c = new m();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof l69) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += e.j(((Integer) list.get(i)).intValue());
        }
        return iJ;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (e.h(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (e.h(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof l69) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += e.j(((Integer) list.get(i)).intValue());
        }
        return iJ;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof aka) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += e.j(((Long) list.get(i)).longValue());
        }
        return iJ;
    }

    public static int f(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof l69)) {
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    i += e.i((iIntValue >> 31) ^ (iIntValue << 1));
                }
                return i;
            }
            ij0.x(list);
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static int g(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof aka)) {
                int iJ = 0;
                for (int i = 0; i < size; i++) {
                    long jLongValue = ((Long) list.get(i)).longValue();
                    iJ += e.j((jLongValue >> 63) ^ (jLongValue << 1));
                }
                return iJ;
            }
            ij0.x(list);
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof l69) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += e.i(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof aka) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += e.j(((Long) list.get(i)).longValue());
        }
        return iJ;
    }

    public static Object j(Object obj, int i, n89 n89Var, Object obj2, k kVar) {
        return obj2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void k(k kVar, Object obj, Object obj2) {
        ((m) kVar).getClass();
        f fVar = (f) obj;
        l lVar = fVar.unknownFields;
        l lVar2 = ((f) obj2).unknownFields;
        l lVar3 = l.f;
        if (!lVar3.equals(lVar2)) {
            if (lVar3.equals(lVar)) {
                int i = lVar.a + lVar2.a;
                int[] iArrCopyOf = Arrays.copyOf(lVar.b, i);
                System.arraycopy(lVar2.b, 0, iArrCopyOf, lVar.a, lVar2.a);
                Object[] objArrCopyOf = Arrays.copyOf(lVar.c, i);
                System.arraycopy(lVar2.c, 0, objArrCopyOf, lVar.a, lVar2.a);
                lVar = new l(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                lVar.getClass();
                if (!lVar2.equals(lVar3)) {
                    if (!lVar.e) {
                        mr9.x();
                        return;
                    }
                    int i2 = lVar.a + lVar2.a;
                    lVar.a(i2);
                    System.arraycopy(lVar2.b, 0, lVar.b, lVar.a, lVar2.a);
                    System.arraycopy(lVar2.c, 0, lVar.c, lVar.a, lVar2.a);
                    lVar.a = i2;
                }
            }
        }
        fVar.unknownFields = lVar;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i, List list, ive iveVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) iveVar.F;
        if (list instanceof qt1) {
            mr9.o();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                eVar.n(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        eVar.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = e.f;
            i3++;
        }
        eVar.A(i3);
        while (i2 < list.size()) {
            byte b2 = ((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0;
            if (eVar.d == eVar.c) {
                eVar.k();
            }
            byte[] bArr = eVar.b;
            int i5 = eVar.d;
            eVar.d = i5 + 1;
            bArr[i5] = b2;
            i2++;
        }
    }

    public static void n(int i, List list, ive iveVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) iveVar.F;
        if (list instanceof da6) {
            mr9.o();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                eVar.getClass();
                eVar.r(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        eVar.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = e.f;
            i3 += 8;
        }
        eVar.A(i3);
        while (i2 < list.size()) {
            eVar.s(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void o(int i, List list, ive iveVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) iveVar.F;
        if (list instanceof l69) {
            mr9.o();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                eVar.t(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        eVar.y(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += e.j(((Integer) list.get(i3)).intValue());
        }
        eVar.A(iJ);
        while (i2 < list.size()) {
            eVar.u(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void p(int i, List list, ive iveVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) iveVar.F;
        if (list instanceof l69) {
            mr9.o();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                eVar.p(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        eVar.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = e.f;
            i3 += 4;
        }
        eVar.A(i3);
        while (i2 < list.size()) {
            eVar.q(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void q(int i, List list, ive iveVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) iveVar.F;
        if (list instanceof aka) {
            mr9.o();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                eVar.r(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        eVar.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = e.f;
            i3 += 8;
        }
        eVar.A(i3);
        while (i2 < list.size()) {
            eVar.s(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void r(int i, List list, ive iveVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) iveVar.F;
        if (list instanceof lo7) {
            mr9.o();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                eVar.getClass();
                eVar.p(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        eVar.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = e.f;
            i3 += 4;
        }
        eVar.A(i3);
        while (i2 < list.size()) {
            eVar.q(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void s(int i, List list, ive iveVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) iveVar.F;
        if (list instanceof l69) {
            mr9.o();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                eVar.t(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        eVar.y(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += e.j(((Integer) list.get(i3)).intValue());
        }
        eVar.A(iJ);
        while (i2 < list.size()) {
            eVar.u(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void t(int i, List list, ive iveVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) iveVar.F;
        if (list instanceof aka) {
            mr9.o();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                eVar.B(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        eVar.y(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += e.j(((Long) list.get(i3)).longValue());
        }
        eVar.A(iJ);
        while (i2 < list.size()) {
            eVar.C(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void u(int i, List list, ive iveVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) iveVar.F;
        if (list instanceof l69) {
            mr9.o();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                eVar.p(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        eVar.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = e.f;
            i3 += 4;
        }
        eVar.A(i3);
        while (i2 < list.size()) {
            eVar.q(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void v(int i, List list, ive iveVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) iveVar.F;
        if (list instanceof aka) {
            mr9.o();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                eVar.r(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        eVar.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = e.f;
            i3 += 8;
        }
        eVar.A(i3);
        while (i2 < list.size()) {
            eVar.s(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void w(int i, List list, ive iveVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) iveVar.F;
        if (list instanceof l69) {
            mr9.o();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                eVar.z(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return;
        }
        eVar.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue2 = ((Integer) list.get(i4)).intValue();
            i3 += e.i((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        eVar.A(i3);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            eVar.A((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    public static void x(int i, List list, ive iveVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) iveVar.F;
        if (list instanceof aka) {
            mr9.o();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                eVar.B(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        eVar.y(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iJ += e.j((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        eVar.A(iJ);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            eVar.C((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    public static void y(int i, List list, ive iveVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) iveVar.F;
        if (list instanceof l69) {
            mr9.o();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                eVar.z(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        eVar.y(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += e.i(((Integer) list.get(i4)).intValue());
        }
        eVar.A(i3);
        while (i2 < list.size()) {
            eVar.A(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void z(int i, List list, ive iveVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) iveVar.F;
        if (list instanceof aka) {
            mr9.o();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                eVar.B(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        eVar.y(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += e.j(((Long) list.get(i3)).longValue());
        }
        eVar.A(iJ);
        while (i2 < list.size()) {
            eVar.C(((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
