package com.google.crypto.tink.shaded.protobuf;

import defpackage.cka;
import defpackage.e7f;
import defpackage.g22;
import defpackage.ive;
import defpackage.k22;
import defpackage.mr9;
import defpackage.n69;
import defpackage.r1a;
import defpackage.t89;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {
    public static final Class a;
    public static final k b;
    public static final k c;
    public static final m d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = v(false);
        c = v(true);
        d = new m();
    }

    public static void A(int i, List list, ive iveVar, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) iveVar.F;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                eVar.getClass();
                eVar.o(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        eVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = e.e;
            i3 += 8;
        }
        eVar.s(i3);
        while (i2 < list.size()) {
            eVar.p(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void B(int i, List list, ive iveVar, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) iveVar.F;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                eVar.r(i, 0);
                eVar.q(iIntValue);
            }
            return;
        }
        eVar.r(i, 2);
        int iF = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iF += e.f(((Integer) list.get(i3)).intValue());
        }
        eVar.s(iF);
        for (int i4 = 0; i4 < list.size(); i4++) {
            eVar.q(((Integer) list.get(i4)).intValue());
        }
    }

    public static void C(int i, List list, ive iveVar, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) iveVar.F;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                eVar.m(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        eVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = e.e;
            i3 += 4;
        }
        eVar.s(i3);
        while (i2 < list.size()) {
            eVar.n(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void D(int i, List list, ive iveVar, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) iveVar.F;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                eVar.o(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        eVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = e.e;
            i3 += 8;
        }
        eVar.s(i3);
        while (i2 < list.size()) {
            eVar.p(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void E(int i, List list, ive iveVar, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) iveVar.F;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                eVar.getClass();
                eVar.m(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        eVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = e.e;
            i3 += 4;
        }
        eVar.s(i3);
        while (i2 < list.size()) {
            eVar.n(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void F(int i, List list, ive iveVar, e7f e7fVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        iveVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            iveVar.F(i, list.get(i2), e7fVar);
        }
    }

    public static void G(int i, List list, ive iveVar, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) iveVar.F;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                eVar.r(i, 0);
                eVar.q(iIntValue);
            }
            return;
        }
        eVar.r(i, 2);
        int iF = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iF += e.f(((Integer) list.get(i3)).intValue());
        }
        eVar.s(iF);
        for (int i4 = 0; i4 < list.size(); i4++) {
            eVar.q(((Integer) list.get(i4)).intValue());
        }
    }

    public static void H(int i, List list, ive iveVar, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) iveVar.F;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                eVar.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        eVar.r(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += e.j(((Long) list.get(i3)).longValue());
        }
        eVar.s(iJ);
        while (i2 < list.size()) {
            eVar.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void I(int i, List list, ive iveVar, e7f e7fVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        iveVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            iveVar.G(i, list.get(i2), e7fVar);
        }
    }

    public static void J(int i, List list, ive iveVar, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) iveVar.F;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                eVar.m(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        eVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = e.e;
            i3 += 4;
        }
        eVar.s(i3);
        while (i2 < list.size()) {
            eVar.n(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void K(int i, List list, ive iveVar, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) iveVar.F;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                eVar.o(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        eVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = e.e;
            i3 += 8;
        }
        eVar.s(i3);
        while (i2 < list.size()) {
            eVar.p(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void L(int i, List list, ive iveVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) iveVar.F;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                eVar.r(i, 0);
                eVar.s((iIntValue >> 31) ^ (iIntValue << 1));
            }
            return;
        }
        eVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue2 = ((Integer) list.get(i4)).intValue();
            i3 += e.i((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        eVar.s(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            int iIntValue3 = ((Integer) list.get(i5)).intValue();
            eVar.s((iIntValue3 >> 31) ^ (iIntValue3 << 1));
        }
    }

    public static void M(int i, List list, ive iveVar, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) iveVar.F;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                eVar.t(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        eVar.r(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iJ += e.j((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        eVar.s(iJ);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            eVar.u((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    public static void N(int i, List list, ive iveVar) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) iveVar.F;
        if (!(list instanceof r1a)) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                String str = (String) list.get(i2);
                eVar.r(i, 2);
                int i3 = eVar.c;
                byte[] bArr = eVar.b;
                int i4 = eVar.d;
                try {
                    int i5 = e.i(str.length() * 3);
                    int i6 = e.i(str.length());
                    if (i6 == i5) {
                        int i7 = i4 + i6;
                        eVar.d = i7;
                        int iM = o.a.m(str, bArr, i7, i3 - i7);
                        eVar.d = i4;
                        eVar.s((iM - i4) - i6);
                        eVar.d = iM;
                    } else {
                        eVar.s(o.b(str));
                        int i8 = eVar.d;
                        eVar.d = o.a.m(str, bArr, i8, i3 - i8);
                    }
                } catch (Utf8$UnpairedSurrogateException e) {
                    eVar.d = i4;
                    e.e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                    byte[] bytes = str.getBytes(t89.a);
                    try {
                        eVar.s(bytes.length);
                        eVar.l(bytes, 0, bytes.length);
                    } catch (IndexOutOfBoundsException e2) {
                        throw new CodedOutputStream$OutOfSpaceException(e2);
                    }
                } catch (IndexOutOfBoundsException e3) {
                    throw new CodedOutputStream$OutOfSpaceException(e3);
                }
            }
            return;
        }
        r1a r1aVar = (r1a) list;
        for (int i9 = 0; i9 < list.size(); i9++) {
            Object objB0 = r1aVar.b0(i9);
            if (objB0 instanceof String) {
                String str2 = (String) objB0;
                eVar.r(i, 2);
                int i10 = eVar.c;
                byte[] bArr2 = eVar.b;
                int i11 = eVar.d;
                try {
                    int i12 = e.i(str2.length() * 3);
                    int i13 = e.i(str2.length());
                    if (i13 == i12) {
                        int i14 = i11 + i13;
                        eVar.d = i14;
                        int iM2 = o.a.m(str2, bArr2, i14, i10 - i14);
                        eVar.d = i11;
                        eVar.s((iM2 - i11) - i13);
                        eVar.d = iM2;
                    } else {
                        eVar.s(o.b(str2));
                        int i15 = eVar.d;
                        eVar.d = o.a.m(str2, bArr2, i15, i10 - i15);
                    }
                } catch (Utf8$UnpairedSurrogateException e4) {
                    eVar.d = i11;
                    e.e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e4);
                    byte[] bytes2 = str2.getBytes(t89.a);
                    try {
                        eVar.s(bytes2.length);
                        eVar.l(bytes2, 0, bytes2.length);
                    } catch (IndexOutOfBoundsException e5) {
                        throw new CodedOutputStream$OutOfSpaceException(e5);
                    }
                } catch (IndexOutOfBoundsException e6) {
                    throw new CodedOutputStream$OutOfSpaceException(e6);
                }
            } else {
                k22 k22Var = (k22) objB0;
                eVar.r(i, 2);
                eVar.s(k22Var.size());
                g22 g22Var = (g22) k22Var;
                eVar.l(g22Var.H, g22Var.k(), g22Var.size());
            }
        }
    }

    public static void O(int i, List list, ive iveVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) iveVar.F;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                eVar.r(i, 0);
                eVar.s(iIntValue);
            }
            return;
        }
        eVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += e.i(((Integer) list.get(i4)).intValue());
        }
        eVar.s(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            eVar.s(((Integer) list.get(i5)).intValue());
        }
    }

    public static void P(int i, List list, ive iveVar, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) iveVar.F;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                eVar.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        eVar.r(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += e.j(((Long) list.get(i3)).longValue());
        }
        eVar.s(iJ);
        while (i2 < list.size()) {
            eVar.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iH = e.h(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iH += e.b((k22) list.get(i2));
        }
        return iH;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (e.h(i) * size) + c(list);
    }

    public static int c(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof n69) {
            n69 n69Var = (n69) list;
            if (size <= 0) {
                return 0;
            }
            n69Var.e(0);
            throw null;
        }
        int iF = 0;
        for (int i = 0; i < size; i++) {
            iF += e.f(((Integer) list.get(i)).intValue());
        }
        return iF;
    }

    public static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return e.c(i) * size;
    }

    public static int e(List list) {
        return list.size() * 4;
    }

    public static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return e.d(i) * size;
    }

    public static int g(List list) {
        return list.size() * 8;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (e.h(i) * size) + i(list);
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof n69) {
            n69 n69Var = (n69) list;
            if (size <= 0) {
                return 0;
            }
            n69Var.e(0);
            throw null;
        }
        int iF = 0;
        for (int i = 0; i < size; i++) {
            iF += e.f(((Integer) list.get(i)).intValue());
        }
        return iF;
    }

    public static int j(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (e.h(i) * list.size()) + k(list);
    }

    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof cka) {
            cka ckaVar = (cka) list;
            if (size <= 0) {
                return 0;
            }
            ckaVar.e(0);
            throw null;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += e.j(((Long) list.get(i)).longValue());
        }
        return iJ;
    }

    public static int l(int i, List list, e7f e7fVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iH = e.h(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            int iB = ((a) list.get(i2)).b(e7fVar);
            iH += e.i(iB) + iB;
        }
        return iH;
    }

    public static int m(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (e.h(i) * size) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof n69) {
            n69 n69Var = (n69) list;
            if (size <= 0) {
                return 0;
            }
            n69Var.e(0);
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int iIntValue = ((Integer) list.get(i2)).intValue();
            i += e.i((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return i;
    }

    public static int o(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (e.h(i) * size) + p(list);
    }

    public static int p(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof cka) {
            cka ckaVar = (cka) list;
            if (size <= 0) {
                return 0;
            }
            ckaVar.e(0);
            throw null;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iJ += e.j((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iJ;
    }

    public static int q(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iH = e.h(i) * size;
        if (!(list instanceof r1a)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof k22) {
                    int size2 = ((k22) obj).size();
                    iH = e.i(size2) + size2 + iH;
                } else {
                    iH = e.g((String) obj) + iH;
                }
                i2++;
            }
            return iH;
        }
        r1a r1aVar = (r1a) list;
        while (i2 < size) {
            Object objB0 = r1aVar.b0(i2);
            if (objB0 instanceof k22) {
                int size3 = ((k22) objB0).size();
                iH = e.i(size3) + size3 + iH;
            } else {
                iH = e.g((String) objB0) + iH;
            }
            i2++;
        }
        return iH;
    }

    public static int r(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (e.h(i) * size) + s(list);
    }

    public static int s(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof n69) {
            n69 n69Var = (n69) list;
            if (size <= 0) {
                return 0;
            }
            n69Var.e(0);
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += e.i(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int t(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (e.h(i) * size) + u(list);
    }

    public static int u(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof cka) {
            cka ckaVar = (cka) list;
            if (size <= 0) {
                return 0;
            }
            ckaVar.e(0);
            throw null;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += e.j(((Long) list.get(i)).longValue());
        }
        return iJ;
    }

    public static k v(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (k) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
            }
        }
        return null;
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
    public static void w(k kVar, Object obj, Object obj2) {
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

    public static boolean x(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void y(int i, List list, ive iveVar, boolean z) throws CodedOutputStream$OutOfSpaceException {
        if (list == null || list.isEmpty()) {
            return;
        }
        e eVar = (e) iveVar.F;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                eVar.r(i, 0);
                eVar.k(zBooleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        eVar.r(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = e.e;
            i3++;
        }
        eVar.s(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            eVar.k(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    public static void z(int i, List list, ive iveVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        iveVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            e eVar = (e) iveVar.F;
            k22 k22Var = (k22) list.get(i2);
            eVar.r(i, 2);
            eVar.s(k22Var.size());
            g22 g22Var = (g22) k22Var;
            eVar.l(g22Var.H, g22Var.k(), g22Var.size());
        }
    }
}
