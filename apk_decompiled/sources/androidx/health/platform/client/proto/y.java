package androidx.health.platform.client.proto;

import defpackage.bka;
import defpackage.ea6;
import defpackage.m69;
import defpackage.mo7;
import defpackage.mr9;
import defpackage.oud;
import defpackage.poj;
import defpackage.rt1;
import defpackage.uei;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y {
    public static final Class a;
    public static final a0 b;
    public static final uei c;

    static {
        Class<?> cls;
        Class<?> cls2;
        oud oudVar = oud.c;
        a0 a0Var = null;
        try {
            cls = Class.forName("androidx.health.platform.client.proto.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            oud oudVar2 = oud.c;
            try {
                cls2 = Class.forName("androidx.health.platform.client.proto.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                a0Var = (a0) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = a0Var;
        c = new uei();
    }

    public static int a(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof m69)) {
            int iG = 0;
            while (i < size) {
                iG += b.g(((Integer) list.get(i)).intValue());
                i++;
            }
            return iG;
        }
        m69 m69Var = (m69) list;
        int iG2 = 0;
        while (i < size) {
            iG2 += b.g(m69Var.e(i));
            i++;
        }
        return iG2;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (b.e(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (b.e(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof m69)) {
            int iG = 0;
            while (i < size) {
                iG += b.g(((Integer) list.get(i)).intValue());
                i++;
            }
            return iG;
        }
        m69 m69Var = (m69) list;
        int iG2 = 0;
        while (i < size) {
            iG2 += b.g(m69Var.e(i));
            i++;
        }
        return iG2;
    }

    public static int e(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof bka)) {
            int iG = 0;
            while (i < size) {
                iG += b.g(((Long) list.get(i)).longValue());
                i++;
            }
            return iG;
        }
        bka bkaVar = (bka) list;
        int iG2 = 0;
        while (i < size) {
            iG2 += b.g(bkaVar.e(i));
            i++;
        }
        return iG2;
    }

    public static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof m69)) {
            int iB = 0;
            while (i < size) {
                iB += b.b(((Integer) list.get(i)).intValue());
                i++;
            }
            return iB;
        }
        m69 m69Var = (m69) list;
        int iB2 = 0;
        while (i < size) {
            iB2 += b.b(m69Var.e(i));
            i++;
        }
        return iB2;
    }

    public static int g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof bka)) {
            int iC = 0;
            while (i < size) {
                iC += b.c(((Long) list.get(i)).longValue());
                i++;
            }
            return iC;
        }
        bka bkaVar = (bka) list;
        int iC2 = 0;
        while (i < size) {
            iC2 += b.c(bkaVar.e(i));
            i++;
        }
        return iC2;
    }

    public static int h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof m69)) {
            int iF = 0;
            while (i < size) {
                iF += b.f(((Integer) list.get(i)).intValue());
                i++;
            }
            return iF;
        }
        m69 m69Var = (m69) list;
        int iF2 = 0;
        while (i < size) {
            iF2 += b.f(m69Var.e(i));
            i++;
        }
        return iF2;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof bka)) {
            int iG = 0;
            while (i < size) {
                iG += b.g(((Long) list.get(i)).longValue());
                i++;
            }
            return iG;
        }
        bka bkaVar = (bka) list;
        int iG2 = 0;
        while (i < size) {
            iG2 += b.g(bkaVar.e(i));
            i++;
        }
        return iG2;
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
    public static void j(a0 a0Var, Object obj, Object obj2) {
        ((uei) a0Var).getClass();
        n nVar = (n) obj;
        b0 b0Var = nVar.unknownFields;
        b0 b0Var2 = ((n) obj2).unknownFields;
        b0 b0Var3 = b0.f;
        if (!b0Var3.equals(b0Var2)) {
            if (b0Var3.equals(b0Var)) {
                int i = b0Var.a + b0Var2.a;
                int[] iArrCopyOf = Arrays.copyOf(b0Var.b, i);
                System.arraycopy(b0Var2.b, 0, iArrCopyOf, b0Var.a, b0Var2.a);
                Object[] objArrCopyOf = Arrays.copyOf(b0Var.c, i);
                System.arraycopy(b0Var2.c, 0, objArrCopyOf, b0Var.a, b0Var2.a);
                b0Var = new b0(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                b0Var.getClass();
                if (!b0Var2.equals(b0Var3)) {
                    if (!b0Var.e) {
                        mr9.x();
                        return;
                    }
                    int i2 = b0Var.a + b0Var2.a;
                    b0Var.a(i2);
                    System.arraycopy(b0Var2.b, 0, b0Var.b, b0Var.a, b0Var2.a);
                    System.arraycopy(b0Var2.c, 0, b0Var.c, b0Var.a, b0Var2.a);
                    b0Var.a = i2;
                }
            }
        }
        nVar.unknownFields = b0Var;
    }

    public static boolean k(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void l(int i, List list, poj pojVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof rt1;
        b bVar = (b) pojVar.E;
        if (z2) {
            if (z) {
                bVar.r(i, 2);
                bVar.t(0);
                return;
            }
            return;
        }
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                bVar.r(i, 0);
                bVar.h(zBooleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        bVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = b.e;
            i3++;
        }
        bVar.t(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            bVar.h(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    public static void m(int i, List list, poj pojVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof ea6;
        b bVar = (b) pojVar.E;
        int i2 = 0;
        if (z2) {
            if (z) {
                bVar.r(i, 2);
                bVar.t(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                bVar.getClass();
                bVar.m(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        bVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = b.e;
            i3 += 8;
        }
        bVar.t(i3);
        while (i2 < list.size()) {
            bVar.n(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void n(int i, List list, poj pojVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof m69;
        b bVar = (b) pojVar.E;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    bVar.o(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            bVar.r(i, 2);
            int iG = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iG += b.g(((Integer) list.get(i3)).intValue());
            }
            bVar.t(iG);
            while (i2 < list.size()) {
                bVar.p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        m69 m69Var = (m69) list;
        if (!z) {
            while (i2 < 0) {
                bVar.o(i, m69Var.e(i2));
                i2++;
            }
            return;
        }
        bVar.r(i, 2);
        int iG2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iG2 += b.g(m69Var.e(i4));
        }
        bVar.t(iG2);
        while (i2 < 0) {
            bVar.p(m69Var.e(i2));
            i2++;
        }
    }

    public static void o(int i, List list, poj pojVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof m69;
        b bVar = (b) pojVar.E;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    bVar.k(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            bVar.r(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                Logger logger = b.e;
                i3 += 4;
            }
            bVar.t(i3);
            while (i2 < list.size()) {
                bVar.l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        m69 m69Var = (m69) list;
        if (!z) {
            while (i2 < 0) {
                bVar.k(i, m69Var.e(i2));
                i2++;
            }
            return;
        }
        bVar.r(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            m69Var.e(i6);
            Logger logger2 = b.e;
            i5 += 4;
        }
        bVar.t(i5);
        while (i2 < 0) {
            bVar.l(m69Var.e(i2));
            i2++;
        }
    }

    public static void p(int i, List list, poj pojVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof bka;
        b bVar = (b) pojVar.E;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    bVar.m(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            bVar.r(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                Logger logger = b.e;
                i3 += 8;
            }
            bVar.t(i3);
            while (i2 < list.size()) {
                bVar.n(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        bka bkaVar = (bka) list;
        if (!z) {
            while (i2 < 0) {
                bVar.m(i, bkaVar.e(i2));
                i2++;
            }
            return;
        }
        bVar.r(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            bkaVar.e(i6);
            Logger logger2 = b.e;
            i5 += 8;
        }
        bVar.t(i5);
        while (i2 < 0) {
            bVar.n(bkaVar.e(i2));
            i2++;
        }
    }

    public static void q(int i, List list, poj pojVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof mo7;
        b bVar = (b) pojVar.E;
        int i2 = 0;
        if (z2) {
            if (z) {
                bVar.r(i, 2);
                bVar.t(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                bVar.getClass();
                bVar.k(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        bVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = b.e;
            i3 += 4;
        }
        bVar.t(i3);
        while (i2 < list.size()) {
            bVar.l(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void r(int i, List list, poj pojVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof m69;
        b bVar = (b) pojVar.E;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    bVar.o(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            bVar.r(i, 2);
            int iG = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iG += b.g(((Integer) list.get(i3)).intValue());
            }
            bVar.t(iG);
            while (i2 < list.size()) {
                bVar.p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        m69 m69Var = (m69) list;
        if (!z) {
            while (i2 < 0) {
                bVar.o(i, m69Var.e(i2));
                i2++;
            }
            return;
        }
        bVar.r(i, 2);
        int iG2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iG2 += b.g(m69Var.e(i4));
        }
        bVar.t(iG2);
        while (i2 < 0) {
            bVar.p(m69Var.e(i2));
            i2++;
        }
    }

    public static void s(int i, List list, poj pojVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof bka;
        b bVar = (b) pojVar.E;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    bVar.u(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            bVar.r(i, 2);
            int iG = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iG += b.g(((Long) list.get(i3)).longValue());
            }
            bVar.t(iG);
            while (i2 < list.size()) {
                bVar.v(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        bka bkaVar = (bka) list;
        if (!z) {
            while (i2 < 0) {
                bVar.u(i, bkaVar.e(i2));
                i2++;
            }
            return;
        }
        bVar.r(i, 2);
        int iG2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iG2 += b.g(bkaVar.e(i4));
        }
        bVar.t(iG2);
        while (i2 < 0) {
            bVar.v(bkaVar.e(i2));
            i2++;
        }
    }

    public static void t(int i, List list, poj pojVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof m69;
        b bVar = (b) pojVar.E;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    bVar.k(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            bVar.r(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                Logger logger = b.e;
                i3 += 4;
            }
            bVar.t(i3);
            while (i2 < list.size()) {
                bVar.l(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        m69 m69Var = (m69) list;
        if (!z) {
            while (i2 < 0) {
                bVar.k(i, m69Var.e(i2));
                i2++;
            }
            return;
        }
        bVar.r(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            m69Var.e(i6);
            Logger logger2 = b.e;
            i5 += 4;
        }
        bVar.t(i5);
        while (i2 < 0) {
            bVar.l(m69Var.e(i2));
            i2++;
        }
    }

    public static void u(int i, List list, poj pojVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof bka;
        b bVar = (b) pojVar.E;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    bVar.m(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            bVar.r(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                Logger logger = b.e;
                i3 += 8;
            }
            bVar.t(i3);
            while (i2 < list.size()) {
                bVar.n(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        bka bkaVar = (bka) list;
        if (!z) {
            while (i2 < 0) {
                bVar.m(i, bkaVar.e(i2));
                i2++;
            }
            return;
        }
        bVar.r(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            bkaVar.e(i6);
            Logger logger2 = b.e;
            i5 += 8;
        }
        bVar.t(i5);
        while (i2 < 0) {
            bVar.n(bkaVar.e(i2));
            i2++;
        }
    }

    public static void v(int i, List list, poj pojVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof m69;
        b bVar = (b) pojVar.E;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    bVar.s(i, (iIntValue >> 31) ^ (iIntValue << 1));
                    i2++;
                }
                return;
            }
            bVar.r(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iB += b.b(((Integer) list.get(i3)).intValue());
            }
            bVar.t(iB);
            while (i2 < list.size()) {
                int iIntValue2 = ((Integer) list.get(i2)).intValue();
                bVar.t((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                i2++;
            }
            return;
        }
        m69 m69Var = (m69) list;
        if (!z) {
            while (i2 < 0) {
                int iE = m69Var.e(i2);
                bVar.s(i, (iE >> 31) ^ (iE << 1));
                i2++;
            }
            return;
        }
        bVar.r(i, 2);
        int iB2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iB2 += b.b(m69Var.e(i4));
        }
        bVar.t(iB2);
        while (i2 < 0) {
            int iE2 = m69Var.e(i2);
            bVar.t((iE2 >> 31) ^ (iE2 << 1));
            i2++;
        }
    }

    public static void w(int i, List list, poj pojVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof bka;
        b bVar = (b) pojVar.E;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    bVar.u(i, (jLongValue >> 63) ^ (jLongValue << 1));
                    i2++;
                }
                return;
            }
            bVar.r(i, 2);
            int iC = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iC += b.c(((Long) list.get(i3)).longValue());
            }
            bVar.t(iC);
            while (i2 < list.size()) {
                long jLongValue2 = ((Long) list.get(i2)).longValue();
                bVar.v((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                i2++;
            }
            return;
        }
        bka bkaVar = (bka) list;
        if (!z) {
            while (i2 < 0) {
                long jE = bkaVar.e(i2);
                bVar.u(i, (jE >> 63) ^ (jE << 1));
                i2++;
            }
            return;
        }
        bVar.r(i, 2);
        int iC2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iC2 += b.c(bkaVar.e(i4));
        }
        bVar.t(iC2);
        while (i2 < 0) {
            long jE2 = bkaVar.e(i2);
            bVar.v((jE2 >> 63) ^ (jE2 << 1));
            i2++;
        }
    }

    public static void x(int i, List list, poj pojVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof m69;
        b bVar = (b) pojVar.E;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    bVar.s(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            bVar.r(i, 2);
            int iF = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iF += b.f(((Integer) list.get(i3)).intValue());
            }
            bVar.t(iF);
            while (i2 < list.size()) {
                bVar.t(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        m69 m69Var = (m69) list;
        if (!z) {
            while (i2 < 0) {
                bVar.s(i, m69Var.e(i2));
                i2++;
            }
            return;
        }
        bVar.r(i, 2);
        int iF2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iF2 += b.f(m69Var.e(i4));
        }
        bVar.t(iF2);
        while (i2 < 0) {
            bVar.t(m69Var.e(i2));
            i2++;
        }
    }

    public static void y(int i, List list, poj pojVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof bka;
        b bVar = (b) pojVar.E;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    bVar.u(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            bVar.r(i, 2);
            int iG = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iG += b.g(((Long) list.get(i3)).longValue());
            }
            bVar.t(iG);
            while (i2 < list.size()) {
                bVar.v(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        bka bkaVar = (bka) list;
        if (!z) {
            while (i2 < 0) {
                bVar.u(i, bkaVar.e(i2));
                i2++;
            }
            return;
        }
        bVar.r(i, 2);
        int iG2 = 0;
        for (int i4 = 0; i4 < 0; i4++) {
            iG2 += b.g(bkaVar.e(i4));
        }
        bVar.t(iG2);
        while (i2 < 0) {
            bVar.v(bkaVar.e(i2));
            i2++;
        }
    }
}
