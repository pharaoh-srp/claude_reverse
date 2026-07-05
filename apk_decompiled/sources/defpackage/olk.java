package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class olk {
    public static final xxi a;

    static {
        int i = p8k.a;
        a = new xxi(14);
    }

    public static void a(int i, List list, w9h w9hVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xak xakVar = (xak) w9hVar.E;
        if (list instanceof cik) {
            qy1.r(list);
            if (!z) {
                throw null;
            }
            xakVar.j(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xakVar.f(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        xakVar.j(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        xakVar.l(i3);
        while (i2 < list.size()) {
            xakVar.g(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void b(int i, List list, w9h w9hVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xak xakVar = (xak) w9hVar.E;
        int i2 = 0;
        if (!(list instanceof dek)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    xakVar.k(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            xakVar.j(i, 2);
            int iO = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iO += xak.o((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            xakVar.l(iO);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                xakVar.l((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        dek dekVar = (dek) list;
        if (!z) {
            while (i2 < dekVar.size()) {
                int iE = dekVar.e(i2);
                xakVar.k(i, (iE >> 31) ^ (iE + iE));
                i2++;
            }
            return;
        }
        xakVar.j(i, 2);
        int iO2 = 0;
        for (int i4 = 0; i4 < dekVar.size(); i4++) {
            int iE2 = dekVar.e(i4);
            iO2 += xak.o((iE2 >> 31) ^ (iE2 + iE2));
        }
        xakVar.l(iO2);
        while (i2 < dekVar.size()) {
            int iE3 = dekVar.e(i2);
            xakVar.l((iE3 >> 31) ^ (iE3 + iE3));
            i2++;
        }
    }

    public static void c(int i, List list, w9h w9hVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xak xakVar = (xak) w9hVar.E;
        if (list instanceof cik) {
            qy1.r(list);
            if (!z) {
                throw null;
            }
            xakVar.j(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                xakVar.m(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
            return;
        }
        xakVar.j(i, 2);
        int iP = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iP += xak.p((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        xakVar.l(iP);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            xakVar.n((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i2++;
        }
    }

    public static void d(int i, List list, w9h w9hVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xak xakVar = (xak) w9hVar.E;
        int i2 = 0;
        if (!(list instanceof dek)) {
            if (!z) {
                while (i2 < list.size()) {
                    xakVar.k(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            xakVar.j(i, 2);
            int iO = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iO += xak.o(((Integer) list.get(i3)).intValue());
            }
            xakVar.l(iO);
            while (i2 < list.size()) {
                xakVar.l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        dek dekVar = (dek) list;
        if (!z) {
            while (i2 < dekVar.size()) {
                xakVar.k(i, dekVar.e(i2));
                i2++;
            }
            return;
        }
        xakVar.j(i, 2);
        int iO2 = 0;
        for (int i4 = 0; i4 < dekVar.size(); i4++) {
            iO2 += xak.o(dekVar.e(i4));
        }
        xakVar.l(iO2);
        while (i2 < dekVar.size()) {
            xakVar.l(dekVar.e(i2));
            i2++;
        }
    }

    public static void e(int i, List list, w9h w9hVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xak xakVar = (xak) w9hVar.E;
        if (list instanceof cik) {
            qy1.r(list);
            if (!z) {
                throw null;
            }
            xakVar.j(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xakVar.m(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        xakVar.j(i, 2);
        int iP = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iP += xak.p(((Long) list.get(i3)).longValue());
        }
        xakVar.l(iP);
        while (i2 < list.size()) {
            xakVar.n(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static boolean f(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof dek)) {
            int iP = 0;
            while (i < size) {
                iP += xak.p(((Integer) list.get(i)).intValue());
                i++;
            }
            return iP;
        }
        dek dekVar = (dek) list;
        int iP2 = 0;
        while (i < size) {
            iP2 += xak.p(dekVar.e(i));
            i++;
        }
        return iP2;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (xak.o(i << 3) + 4) * size;
    }

    public static int i(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (xak.o(i << 3) + 8) * size;
    }

    public static int j(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof dek)) {
            int iP = 0;
            while (i < size) {
                iP += xak.p(((Integer) list.get(i)).intValue());
                i++;
            }
            return iP;
        }
        dek dekVar = (dek) list;
        int iP2 = 0;
        while (i < size) {
            iP2 += xak.p(dekVar.e(i));
            i++;
        }
        return iP2;
    }

    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof cik) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iP = 0;
        for (int i = 0; i < size; i++) {
            iP += xak.p(((Long) list.get(i)).longValue());
        }
        return iP;
    }

    public static int l(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof dek)) {
            int iO = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iO += xak.o((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iO;
        }
        dek dekVar = (dek) list;
        int iO2 = 0;
        while (i < size) {
            int iE = dekVar.e(i);
            iO2 += xak.o((iE >> 31) ^ (iE + iE));
            i++;
        }
        return iO2;
    }

    public static int m(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof cik) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iP = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iP += xak.p((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iP;
    }

    public static int n(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof dek)) {
            int iO = 0;
            while (i < size) {
                iO += xak.o(((Integer) list.get(i)).intValue());
                i++;
            }
            return iO;
        }
        dek dekVar = (dek) list;
        int iO2 = 0;
        while (i < size) {
            iO2 += xak.o(dekVar.e(i));
            i++;
        }
        return iO2;
    }

    public static int o(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof cik) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iP = 0;
        for (int i = 0; i < size; i++) {
            iP += xak.p(((Long) list.get(i)).longValue());
        }
        return iP;
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
    public static void p(Object obj, Object obj2) {
        zdk zdkVar = (zdk) obj;
        vnk vnkVar = zdkVar.zzc;
        vnk vnkVar2 = ((zdk) obj2).zzc;
        vnk vnkVar3 = vnk.f;
        if (!vnkVar3.equals(vnkVar2)) {
            if (vnkVar3.equals(vnkVar)) {
                int i = vnkVar.a + vnkVar2.a;
                int[] iArrCopyOf = Arrays.copyOf(vnkVar.b, i);
                System.arraycopy(vnkVar2.b, 0, iArrCopyOf, vnkVar.a, vnkVar2.a);
                Object[] objArrCopyOf = Arrays.copyOf(vnkVar.c, i);
                System.arraycopy(vnkVar2.c, 0, objArrCopyOf, vnkVar.a, vnkVar2.a);
                vnkVar = new vnk(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                vnkVar.getClass();
                if (!vnkVar2.equals(vnkVar3)) {
                    if (!vnkVar.e) {
                        mr9.x();
                        return;
                    }
                    int i2 = vnkVar.a + vnkVar2.a;
                    vnkVar.e(i2);
                    System.arraycopy(vnkVar2.b, 0, vnkVar.b, vnkVar.a, vnkVar2.a);
                    System.arraycopy(vnkVar2.c, 0, vnkVar.c, vnkVar.a, vnkVar2.a);
                    vnkVar.a = i2;
                }
            }
        }
        zdkVar.zzc = vnkVar;
    }

    public static void q(int i, List list, w9h w9hVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xak xakVar = (xak) w9hVar.E;
        if (list instanceof z8k) {
            qy1.r(list);
            if (!z) {
                throw null;
            }
            xakVar.j(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                xakVar.l(i << 3);
                xakVar.a(zBooleanValue ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        xakVar.j(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        xakVar.l(i3);
        while (i2 < list.size()) {
            xakVar.a(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void r(int i, List list, w9h w9hVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xak xakVar = (xak) w9hVar.E;
        if (list instanceof ubk) {
            qy1.r(list);
            if (!z) {
                throw null;
            }
            xakVar.j(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xakVar.f(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        xakVar.j(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        xakVar.l(i3);
        while (i2 < list.size()) {
            xakVar.g(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void s(int i, List list, w9h w9hVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xak xakVar = (xak) w9hVar.E;
        int i2 = 0;
        if (!(list instanceof dek)) {
            if (!z) {
                while (i2 < list.size()) {
                    xakVar.h(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            xakVar.j(i, 2);
            int iP = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iP += xak.p(((Integer) list.get(i3)).intValue());
            }
            xakVar.l(iP);
            while (i2 < list.size()) {
                xakVar.i(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        dek dekVar = (dek) list;
        if (!z) {
            while (i2 < dekVar.size()) {
                xakVar.h(i, dekVar.e(i2));
                i2++;
            }
            return;
        }
        xakVar.j(i, 2);
        int iP2 = 0;
        for (int i4 = 0; i4 < dekVar.size(); i4++) {
            iP2 += xak.p(dekVar.e(i4));
        }
        xakVar.l(iP2);
        while (i2 < dekVar.size()) {
            xakVar.i(dekVar.e(i2));
            i2++;
        }
    }

    public static void t(int i, List list, w9h w9hVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xak xakVar = (xak) w9hVar.E;
        int i2 = 0;
        if (!(list instanceof dek)) {
            if (!z) {
                while (i2 < list.size()) {
                    xakVar.d(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            xakVar.j(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            xakVar.l(i3);
            while (i2 < list.size()) {
                xakVar.e(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        dek dekVar = (dek) list;
        if (!z) {
            while (i2 < dekVar.size()) {
                xakVar.d(i, dekVar.e(i2));
                i2++;
            }
            return;
        }
        xakVar.j(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < dekVar.size(); i6++) {
            dekVar.e(i6);
            i5 += 4;
        }
        xakVar.l(i5);
        while (i2 < dekVar.size()) {
            xakVar.e(dekVar.e(i2));
            i2++;
        }
    }

    public static void u(int i, List list, w9h w9hVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xak xakVar = (xak) w9hVar.E;
        if (list instanceof cik) {
            qy1.r(list);
            if (!z) {
                throw null;
            }
            xakVar.j(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xakVar.f(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        xakVar.j(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        xakVar.l(i3);
        while (i2 < list.size()) {
            xakVar.g(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void v(int i, List list, w9h w9hVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xak xakVar = (xak) w9hVar.E;
        if (list instanceof fdk) {
            qy1.r(list);
            if (!z) {
                throw null;
            }
            xakVar.j(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xakVar.d(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        xakVar.j(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        xakVar.l(i3);
        while (i2 < list.size()) {
            xakVar.e(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void w(int i, List list, w9h w9hVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xak xakVar = (xak) w9hVar.E;
        int i2 = 0;
        if (!(list instanceof dek)) {
            if (!z) {
                while (i2 < list.size()) {
                    xakVar.h(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            xakVar.j(i, 2);
            int iP = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iP += xak.p(((Integer) list.get(i3)).intValue());
            }
            xakVar.l(iP);
            while (i2 < list.size()) {
                xakVar.i(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        dek dekVar = (dek) list;
        if (!z) {
            while (i2 < dekVar.size()) {
                xakVar.h(i, dekVar.e(i2));
                i2++;
            }
            return;
        }
        xakVar.j(i, 2);
        int iP2 = 0;
        for (int i4 = 0; i4 < dekVar.size(); i4++) {
            iP2 += xak.p(dekVar.e(i4));
        }
        xakVar.l(iP2);
        while (i2 < dekVar.size()) {
            xakVar.i(dekVar.e(i2));
            i2++;
        }
    }

    public static void x(int i, List list, w9h w9hVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xak xakVar = (xak) w9hVar.E;
        if (list instanceof cik) {
            qy1.r(list);
            if (!z) {
                throw null;
            }
            xakVar.j(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                xakVar.m(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        xakVar.j(i, 2);
        int iP = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iP += xak.p(((Long) list.get(i3)).longValue());
        }
        xakVar.l(iP);
        while (i2 < list.size()) {
            xakVar.n(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void y(int i, List list, w9h w9hVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        xak xakVar = (xak) w9hVar.E;
        int i2 = 0;
        if (!(list instanceof dek)) {
            if (!z) {
                while (i2 < list.size()) {
                    xakVar.d(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            xakVar.j(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            xakVar.l(i3);
            while (i2 < list.size()) {
                xakVar.e(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        dek dekVar = (dek) list;
        if (!z) {
            while (i2 < dekVar.size()) {
                xakVar.d(i, dekVar.e(i2));
                i2++;
            }
            return;
        }
        xakVar.j(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < dekVar.size(); i6++) {
            dekVar.e(i6);
            i5 += 4;
        }
        xakVar.l(i5);
        while (i2 < dekVar.size()) {
            xakVar.e(dekVar.e(i2));
            i2++;
        }
    }
}
