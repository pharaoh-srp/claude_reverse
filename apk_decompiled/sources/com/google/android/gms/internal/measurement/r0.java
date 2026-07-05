package com.google.android.gms.internal.measurement;

import defpackage.bnh;
import defpackage.ftk;
import defpackage.mr9;
import defpackage.mxk;
import defpackage.p0l;
import defpackage.qy1;
import defpackage.qyk;
import defpackage.txk;
import defpackage.zvk;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class r0 {
    public static void a(int i, List list, bnh bnhVar, boolean z) throws zzkl$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0 m0Var = (m0) bnhVar.F;
        if (list instanceof ftk) {
            qy1.r(list);
            if (!z) {
                throw null;
            }
            m0Var.o(i, 2);
            throw null;
        }
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                m0Var.o(i, 0);
                m0Var.a(zBooleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        m0Var.o(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = m0.e;
            i3++;
        }
        m0Var.n(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            m0Var.a(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
        }
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
    public static void b(Object obj, Object obj2) {
        n0 n0Var = (n0) obj;
        p0l p0lVar = n0Var.zzb;
        p0l p0lVar2 = ((n0) obj2).zzb;
        p0l p0lVar3 = p0l.f;
        if (!p0lVar3.equals(p0lVar2)) {
            if (p0lVar3.equals(p0lVar)) {
                int i = p0lVar.a + p0lVar2.a;
                int[] iArrCopyOf = Arrays.copyOf(p0lVar.b, i);
                System.arraycopy(p0lVar2.b, 0, iArrCopyOf, p0lVar.a, p0lVar2.a);
                Object[] objArrCopyOf = Arrays.copyOf(p0lVar.c, i);
                System.arraycopy(p0lVar2.c, 0, objArrCopyOf, p0lVar.a, p0lVar2.a);
                p0lVar = new p0l(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                p0lVar.getClass();
                if (!p0lVar2.equals(p0lVar3)) {
                    if (!p0lVar.e) {
                        mr9.x();
                        return;
                    }
                    int i2 = p0lVar.a + p0lVar2.a;
                    p0lVar.b(i2);
                    System.arraycopy(p0lVar2.b, 0, p0lVar.b, p0lVar.a, p0lVar2.a);
                    System.arraycopy(p0lVar2.c, 0, p0lVar.c, p0lVar.a, p0lVar2.a);
                    p0lVar.a = i2;
                }
            }
        }
        n0Var.zzb = p0lVar;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof txk)) {
            int iR = 0;
            while (i < size) {
                iR += m0.r(((Integer) list.get(i)).intValue());
                i++;
            }
            return iR;
        }
        txk txkVar = (txk) list;
        int iR2 = 0;
        while (i < size) {
            iR2 += m0.r(txkVar.a(i));
            i++;
        }
        return iR2;
    }

    public static void e(int i, List list, bnh bnhVar, boolean z) throws zzkl$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0 m0Var = (m0) bnhVar.F;
        if (list instanceof zvk) {
            qy1.r(list);
            if (!z) {
                throw null;
            }
            m0Var.o(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                m0Var.getClass();
                m0Var.d(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        m0Var.o(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = m0.e;
            i3 += 8;
        }
        m0Var.n(i3);
        while (i2 < list.size()) {
            m0Var.e(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void f(int i, List list, bnh bnhVar, boolean z) throws zzkl$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0 m0Var = (m0) bnhVar.F;
        int i2 = 0;
        if (!(list instanceof txk)) {
            if (!z) {
                while (i2 < list.size()) {
                    m0Var.j(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            m0Var.o(i, 2);
            int iR = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iR += m0.r(((Integer) list.get(i3)).intValue());
            }
            m0Var.n(iR);
            while (i2 < list.size()) {
                m0Var.i(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        txk txkVar = (txk) list;
        if (!z) {
            while (i2 < txkVar.G) {
                m0Var.j(i, txkVar.a(i2));
                i2++;
            }
            return;
        }
        m0Var.o(i, 2);
        int iR2 = 0;
        for (int i4 = 0; i4 < txkVar.G; i4++) {
            iR2 += m0.r(txkVar.a(i4));
        }
        m0Var.n(iR2);
        while (i2 < txkVar.G) {
            m0Var.i(txkVar.a(i2));
            i2++;
        }
    }

    public static void g(int i, List list, bnh bnhVar, boolean z) throws zzkl$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0 m0Var = (m0) bnhVar.F;
        int i2 = 0;
        if (!(list instanceof txk)) {
            if (!z) {
                while (i2 < list.size()) {
                    m0Var.c(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            m0Var.o(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                Logger logger = m0.e;
                i3 += 4;
            }
            m0Var.n(i3);
            while (i2 < list.size()) {
                m0Var.b(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        txk txkVar = (txk) list;
        if (!z) {
            while (i2 < txkVar.G) {
                m0Var.c(i, txkVar.a(i2));
                i2++;
            }
            return;
        }
        m0Var.o(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < txkVar.G; i6++) {
            txkVar.a(i6);
            Logger logger2 = m0.e;
            i5 += 4;
        }
        m0Var.n(i5);
        while (i2 < txkVar.G) {
            m0Var.b(txkVar.a(i2));
            i2++;
        }
    }

    public static int h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof txk)) {
            int iR = 0;
            while (i < size) {
                iR += m0.r(((Integer) list.get(i)).intValue());
                i++;
            }
            return iR;
        }
        txk txkVar = (txk) list;
        int iR2 = 0;
        while (i < size) {
            iR2 += m0.r(txkVar.a(i));
            i++;
        }
        return iR2;
    }

    public static void i(int i, List list, bnh bnhVar, boolean z) throws zzkl$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0 m0Var = (m0) bnhVar.F;
        int i2 = 0;
        if (!(list instanceof qyk)) {
            if (!z) {
                while (i2 < list.size()) {
                    m0Var.d(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            m0Var.o(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                Logger logger = m0.e;
                i3 += 8;
            }
            m0Var.n(i3);
            while (i2 < list.size()) {
                m0Var.e(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        qyk qykVar = (qyk) list;
        if (!z) {
            while (i2 < qykVar.size()) {
                m0Var.d(i, qykVar.b(i2));
                i2++;
            }
            return;
        }
        m0Var.o(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < qykVar.size(); i6++) {
            qykVar.b(i6);
            Logger logger2 = m0.e;
            i5 += 8;
        }
        m0Var.n(i5);
        while (i2 < qykVar.size()) {
            m0Var.e(qykVar.b(i2));
            i2++;
        }
    }

    public static int j(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof qyk)) {
            int iR = 0;
            while (i < size) {
                iR += m0.r(((Long) list.get(i)).longValue());
                i++;
            }
            return iR;
        }
        qyk qykVar = (qyk) list;
        int iR2 = 0;
        while (i < size) {
            iR2 += m0.r(qykVar.b(i));
            i++;
        }
        return iR2;
    }

    public static void k(int i, List list, bnh bnhVar, boolean z) throws zzkl$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0 m0Var = (m0) bnhVar.F;
        if (list instanceof mxk) {
            qy1.r(list);
            if (!z) {
                throw null;
            }
            m0Var.o(i, 2);
            throw null;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                m0Var.getClass();
                m0Var.c(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        m0Var.o(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = m0.e;
            i3 += 4;
        }
        m0Var.n(i3);
        while (i2 < list.size()) {
            m0Var.b(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static int l(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof txk)) {
            int iT = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iT += m0.t((iIntValue >> 31) ^ (iIntValue << 1));
                i++;
            }
            return iT;
        }
        txk txkVar = (txk) list;
        int iT2 = 0;
        while (i < size) {
            int iA = txkVar.a(i);
            iT2 += m0.t((iA >> 31) ^ (iA << 1));
            i++;
        }
        return iT2;
    }

    public static void m(int i, List list, bnh bnhVar, boolean z) throws zzkl$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0 m0Var = (m0) bnhVar.F;
        int i2 = 0;
        if (!(list instanceof txk)) {
            if (!z) {
                while (i2 < list.size()) {
                    m0Var.j(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            m0Var.o(i, 2);
            int iR = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iR += m0.r(((Integer) list.get(i3)).intValue());
            }
            m0Var.n(iR);
            while (i2 < list.size()) {
                m0Var.i(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        txk txkVar = (txk) list;
        if (!z) {
            while (i2 < txkVar.G) {
                m0Var.j(i, txkVar.a(i2));
                i2++;
            }
            return;
        }
        m0Var.o(i, 2);
        int iR2 = 0;
        for (int i4 = 0; i4 < txkVar.G; i4++) {
            iR2 += m0.r(txkVar.a(i4));
        }
        m0Var.n(iR2);
        while (i2 < txkVar.G) {
            m0Var.i(txkVar.a(i2));
            i2++;
        }
    }

    public static int n(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof qyk)) {
            int iR = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iR += m0.r((jLongValue >> 63) ^ (jLongValue << 1));
                i++;
            }
            return iR;
        }
        qyk qykVar = (qyk) list;
        int iR2 = 0;
        while (i < size) {
            long jB = qykVar.b(i);
            iR2 += m0.r((jB >> 63) ^ (jB << 1));
            i++;
        }
        return iR2;
    }

    public static void o(int i, List list, bnh bnhVar, boolean z) throws zzkl$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0 m0Var = (m0) bnhVar.F;
        int i2 = 0;
        if (!(list instanceof qyk)) {
            if (!z) {
                while (i2 < list.size()) {
                    m0Var.k(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            m0Var.o(i, 2);
            int iR = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iR += m0.r(((Long) list.get(i3)).longValue());
            }
            m0Var.n(iR);
            while (i2 < list.size()) {
                m0Var.l(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        qyk qykVar = (qyk) list;
        if (!z) {
            while (i2 < qykVar.size()) {
                m0Var.k(i, qykVar.b(i2));
                i2++;
            }
            return;
        }
        m0Var.o(i, 2);
        int iR2 = 0;
        for (int i4 = 0; i4 < qykVar.size(); i4++) {
            iR2 += m0.r(qykVar.b(i4));
        }
        m0Var.n(iR2);
        while (i2 < qykVar.size()) {
            m0Var.l(qykVar.b(i2));
            i2++;
        }
    }

    public static int p(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof txk)) {
            int iT = 0;
            while (i < size) {
                iT += m0.t(((Integer) list.get(i)).intValue());
                i++;
            }
            return iT;
        }
        txk txkVar = (txk) list;
        int iT2 = 0;
        while (i < size) {
            iT2 += m0.t(txkVar.a(i));
            i++;
        }
        return iT2;
    }

    public static void q(int i, List list, bnh bnhVar, boolean z) throws zzkl$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0 m0Var = (m0) bnhVar.F;
        int i2 = 0;
        if (!(list instanceof txk)) {
            if (!z) {
                while (i2 < list.size()) {
                    m0Var.c(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            m0Var.o(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                Logger logger = m0.e;
                i3 += 4;
            }
            m0Var.n(i3);
            while (i2 < list.size()) {
                m0Var.b(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        txk txkVar = (txk) list;
        if (!z) {
            while (i2 < txkVar.G) {
                m0Var.c(i, txkVar.a(i2));
                i2++;
            }
            return;
        }
        m0Var.o(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < txkVar.G; i6++) {
            txkVar.a(i6);
            Logger logger2 = m0.e;
            i5 += 4;
        }
        m0Var.n(i5);
        while (i2 < txkVar.G) {
            m0Var.b(txkVar.a(i2));
            i2++;
        }
    }

    public static int r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof qyk)) {
            int iR = 0;
            while (i < size) {
                iR += m0.r(((Long) list.get(i)).longValue());
                i++;
            }
            return iR;
        }
        qyk qykVar = (qyk) list;
        int iR2 = 0;
        while (i < size) {
            iR2 += m0.r(qykVar.b(i));
            i++;
        }
        return iR2;
    }

    public static void s(int i, List list, bnh bnhVar, boolean z) throws zzkl$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0 m0Var = (m0) bnhVar.F;
        int i2 = 0;
        if (!(list instanceof qyk)) {
            if (!z) {
                while (i2 < list.size()) {
                    m0Var.d(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            m0Var.o(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                Logger logger = m0.e;
                i3 += 8;
            }
            m0Var.n(i3);
            while (i2 < list.size()) {
                m0Var.e(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        qyk qykVar = (qyk) list;
        if (!z) {
            while (i2 < qykVar.size()) {
                m0Var.d(i, qykVar.b(i2));
                i2++;
            }
            return;
        }
        m0Var.o(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < qykVar.size(); i6++) {
            qykVar.b(i6);
            Logger logger2 = m0.e;
            i5 += 8;
        }
        m0Var.n(i5);
        while (i2 < qykVar.size()) {
            m0Var.e(qykVar.b(i2));
            i2++;
        }
    }

    public static void t(int i, List list, bnh bnhVar, boolean z) throws zzkl$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0 m0Var = (m0) bnhVar.F;
        int i2 = 0;
        if (!(list instanceof txk)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    m0Var.q(i, (iIntValue >> 31) ^ (iIntValue << 1));
                    i2++;
                }
                return;
            }
            m0Var.o(i, 2);
            int iT = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iT += m0.t((iIntValue2 >> 31) ^ (iIntValue2 << 1));
            }
            m0Var.n(iT);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                m0Var.n((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                i2++;
            }
            return;
        }
        txk txkVar = (txk) list;
        if (!z) {
            while (i2 < txkVar.G) {
                int iA = txkVar.a(i2);
                m0Var.q(i, (iA >> 31) ^ (iA << 1));
                i2++;
            }
            return;
        }
        m0Var.o(i, 2);
        int iT2 = 0;
        for (int i4 = 0; i4 < txkVar.G; i4++) {
            int iA2 = txkVar.a(i4);
            iT2 += m0.t((iA2 >> 31) ^ (iA2 << 1));
        }
        m0Var.n(iT2);
        while (i2 < txkVar.G) {
            int iA3 = txkVar.a(i2);
            m0Var.n((iA3 >> 31) ^ (iA3 << 1));
            i2++;
        }
    }

    public static void u(int i, List list, bnh bnhVar, boolean z) throws zzkl$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0 m0Var = (m0) bnhVar.F;
        int i2 = 0;
        if (!(list instanceof qyk)) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    m0Var.k(i, (jLongValue >> 63) ^ (jLongValue << 1));
                    i2++;
                }
                return;
            }
            m0Var.o(i, 2);
            int iR = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iR += m0.r((jLongValue2 >> 63) ^ (jLongValue2 << 1));
            }
            m0Var.n(iR);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                m0Var.l((jLongValue3 >> 63) ^ (jLongValue3 << 1));
                i2++;
            }
            return;
        }
        qyk qykVar = (qyk) list;
        if (!z) {
            while (i2 < qykVar.size()) {
                long jB = qykVar.b(i2);
                m0Var.k(i, (jB >> 63) ^ (jB << 1));
                i2++;
            }
            return;
        }
        m0Var.o(i, 2);
        int iR2 = 0;
        for (int i4 = 0; i4 < qykVar.size(); i4++) {
            long jB2 = qykVar.b(i4);
            iR2 += m0.r((jB2 >> 63) ^ (jB2 << 1));
        }
        m0Var.n(iR2);
        while (i2 < qykVar.size()) {
            long jB3 = qykVar.b(i2);
            m0Var.l((jB3 >> 63) ^ (jB3 << 1));
            i2++;
        }
    }

    public static void v(int i, List list, bnh bnhVar, boolean z) throws zzkl$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0 m0Var = (m0) bnhVar.F;
        int i2 = 0;
        if (!(list instanceof txk)) {
            if (!z) {
                while (i2 < list.size()) {
                    m0Var.q(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            m0Var.o(i, 2);
            int iT = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iT += m0.t(((Integer) list.get(i3)).intValue());
            }
            m0Var.n(iT);
            while (i2 < list.size()) {
                m0Var.n(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        txk txkVar = (txk) list;
        if (!z) {
            while (i2 < txkVar.G) {
                m0Var.q(i, txkVar.a(i2));
                i2++;
            }
            return;
        }
        m0Var.o(i, 2);
        int iT2 = 0;
        for (int i4 = 0; i4 < txkVar.G; i4++) {
            iT2 += m0.t(txkVar.a(i4));
        }
        m0Var.n(iT2);
        while (i2 < txkVar.G) {
            m0Var.n(txkVar.a(i2));
            i2++;
        }
    }

    public static void w(int i, List list, bnh bnhVar, boolean z) throws zzkl$zzb {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0 m0Var = (m0) bnhVar.F;
        int i2 = 0;
        if (!(list instanceof qyk)) {
            if (!z) {
                while (i2 < list.size()) {
                    m0Var.k(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            m0Var.o(i, 2);
            int iR = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iR += m0.r(((Long) list.get(i3)).longValue());
            }
            m0Var.n(iR);
            while (i2 < list.size()) {
                m0Var.l(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        qyk qykVar = (qyk) list;
        if (!z) {
            while (i2 < qykVar.size()) {
                m0Var.k(i, qykVar.b(i2));
                i2++;
            }
            return;
        }
        m0Var.o(i, 2);
        int iR2 = 0;
        for (int i4 = 0; i4 < qykVar.size(); i4++) {
            iR2 += m0.r(qykVar.b(i4));
        }
        m0Var.n(iR2);
        while (i2 < qykVar.size()) {
            m0Var.l(qykVar.b(i2));
            i2++;
        }
    }
}
