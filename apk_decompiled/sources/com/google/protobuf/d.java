package com.google.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import defpackage.a9a;
import defpackage.f2e;
import defpackage.f7f;
import defpackage.gsa;
import defpackage.ij0;
import defpackage.lsa;
import defpackage.mr9;
import defpackage.nc7;
import defpackage.poc;
import defpackage.rud;
import defpackage.sq6;
import defpackage.tc7;
import defpackage.u2c;
import defpackage.v28;
import defpackage.vb7;
import defpackage.wgi;
import defpackage.zra;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class d implements f7f {
    public static final int[] n = new int[0];
    public static final Unsafe o = wgi.j();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final v28 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final u2c j;
    public final a9a k;
    public final e l;
    public final lsa m;

    public d(int[] iArr, Object[] objArr, int i, int i2, v28 v28Var, boolean z, int[] iArr2, int i3, int i4, u2c u2cVar, a9a a9aVar, e eVar, tc7 tc7Var, lsa lsaVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = v28Var instanceof v28;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = u2cVar;
        this.k = a9aVar;
        this.l = eVar;
        this.e = v28Var;
        this.m = lsaVar;
    }

    public static Field A(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbX = sq6.x("Field ", str, " for ");
            sbX.append(cls.getName());
            sbX.append(" not found. Known fields are ");
            sbX.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbX.toString());
        }
    }

    public static int F(int i) {
        return (i & 267386880) >>> 20;
    }

    public static boolean n(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof v28) {
            return ((v28) obj).e();
        }
        return true;
    }

    public static d u(f2e f2eVar, u2c u2cVar, a9a a9aVar, e eVar, tc7 tc7Var, lsa lsaVar) {
        if (f2eVar instanceof f2e) {
            return v(f2eVar, u2cVar, a9aVar, eVar, tc7Var, lsaVar);
        }
        mr9.o();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.protobuf.d v(defpackage.f2e r35, defpackage.u2c r36, defpackage.a9a r37, com.google.protobuf.e r38, defpackage.tc7 r39, defpackage.lsa r40) {
        /*
            Method dump skipped, instruction units count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.d.v(f2e, u2c, a9a, com.google.protobuf.e, tc7, lsa):com.google.protobuf.d");
    }

    public static long w(int i) {
        return i & 1048575;
    }

    public static int x(long j, Object obj) {
        return ((Integer) wgi.c.i(j, obj)).intValue();
    }

    public static long y(long j, Object obj) {
        return ((Long) wgi.c.i(j, obj)).longValue();
    }

    public final void B(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        wgi.m(j, obj, (1 << (i2 >>> 20)) | wgi.c.g(j, obj));
    }

    public final void C(int i, Object obj, int i2) {
        wgi.m(this.a[i2 + 2] & 1048575, obj, i);
    }

    public final void D(Object obj, int i, v28 v28Var) {
        o.putObject(obj, G(i) & 1048575, v28Var);
        B(i, obj);
    }

    public final void E(Object obj, int i, int i2, v28 v28Var) {
        o.putObject(obj, G(i2) & 1048575, v28Var);
        C(i, obj, i2);
    }

    public final int G(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    @Override // defpackage.f7f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.d.a(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    @Override // defpackage.f7f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.d.b(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    @Override // defpackage.f7f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.d.c(java.lang.Object):boolean");
    }

    @Override // defpackage.f7f
    public final v28 d() {
        this.j.getClass();
        return this.e.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // defpackage.f7f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(defpackage.v28 r12, defpackage.v28 r13) {
        /*
            Method dump skipped, instruction units count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.d.e(v28, v28):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.f7f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(defpackage.v28 r12) {
        /*
            Method dump skipped, instruction units count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.d.f(v28):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x058f A[Catch: all -> 0x020f, TryCatch #7 {all -> 0x020f, blocks: (B:74:0x0202, B:145:0x058a, B:147:0x058f, B:148:0x0594, B:77:0x0212, B:78:0x0221, B:79:0x0230, B:80:0x023f, B:81:0x024e, B:82:0x0263, B:83:0x0272, B:84:0x0281, B:85:0x0290, B:86:0x029f, B:87:0x02ae, B:88:0x02bd, B:89:0x02cc, B:90:0x02db, B:91:0x02ea, B:92:0x02f9, B:93:0x0308, B:94:0x0317, B:95:0x0326, B:96:0x033b, B:97:0x034a, B:98:0x0359, B:99:0x036d, B:104:0x0379, B:105:0x0385, B:106:0x0391, B:107:0x03a0, B:108:0x03b0, B:109:0x03c0, B:110:0x03d0, B:111:0x03e0, B:112:0x03f0, B:113:0x0400, B:114:0x0410, B:115:0x0426, B:116:0x043a, B:117:0x044e, B:118:0x0462, B:119:0x0476, B:120:0x048d, B:121:0x04a1, B:122:0x04b5, B:123:0x04cb, B:124:0x04d7, B:125:0x04ed, B:126:0x0501, B:127:0x0515, B:128:0x0529, B:129:0x053d, B:130:0x0551, B:131:0x0566, B:137:0x057b), top: B:171:0x0202 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x004e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x059a A[SYNTHETIC] */
    @Override // defpackage.f7f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.lang.Object r18, com.google.protobuf.c r19, defpackage.nc7 r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.d.g(java.lang.Object, com.google.protobuf.c, nc7):void");
    }

    public final boolean h(v28 v28Var, v28 v28Var2, int i) {
        return m(i, v28Var) == m(i, v28Var2);
    }

    public final void i(Object obj, int i, Object obj2) {
        int i2 = this.a[i];
        if (wgi.c.i(G(i) & 1048575, obj) == null) {
            return;
        }
        j(i);
    }

    public final void j(int i) {
        ij0.x(this.b[vb7.d(i, 3, 2, 1)]);
    }

    public final Object k(int i) {
        return this.b[(i / 3) * 2];
    }

    public final f7f l(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        f7f f7fVar = (f7f) objArr[i2];
        if (f7fVar != null) {
            return f7fVar;
        }
        f7f f7fVarA = rud.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = f7fVarA;
        return f7fVarA;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0110 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0111 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(int r8, java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.d.m(int, java.lang.Object):boolean");
    }

    public final boolean o(int i, Object obj, int i2) {
        return wgi.c.g((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final void p(Object obj, int i, Object obj2, nc7 nc7Var, c cVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        long jG = G(i) & 1048575;
        Object objI = wgi.c.i(jG, obj);
        lsa lsaVar = this.m;
        if (objI == null) {
            lsaVar.getClass();
            objI = gsa.F.c();
            wgi.o(jG, obj, objI);
        } else {
            lsaVar.getClass();
            if (!((gsa) objI).E) {
                gsa gsaVarC = gsa.F.c();
                lsa.a(gsaVarC, objI);
                wgi.o(jG, obj, gsaVarC);
                objI = gsaVarC;
            }
        }
        lsaVar.getClass();
        cVar.B((gsa) objI, ((zra) obj2).a, nc7Var);
    }

    public final void q(Object obj, int i, Object obj2) {
        if (m(i, obj2)) {
            long jG = G(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, jG);
            if (object == null) {
                poc.i(this.a[i], " is present but null: ", obj2, "Source subfield ");
                return;
            }
            f7f f7fVarL = l(i);
            if (!m(i, obj)) {
                if (n(object)) {
                    v28 v28VarD = f7fVarL.d();
                    f7fVarL.a(v28VarD, object);
                    unsafe.putObject(obj, jG, v28VarD);
                } else {
                    unsafe.putObject(obj, jG, object);
                }
                B(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jG);
            if (!n(object2)) {
                v28 v28VarD2 = f7fVarL.d();
                f7fVarL.a(v28VarD2, object2);
                unsafe.putObject(obj, jG, v28VarD2);
                object2 = v28VarD2;
            }
            f7fVarL.a(object2, object);
        }
    }

    public final void r(Object obj, int i, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (o(i2, obj2, i)) {
            long jG = G(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, jG);
            if (object == null) {
                poc.i(iArr[i], " is present but null: ", obj2, "Source subfield ");
                return;
            }
            f7f f7fVarL = l(i);
            if (!o(i2, obj, i)) {
                if (n(object)) {
                    v28 v28VarD = f7fVarL.d();
                    f7fVarL.a(v28VarD, object);
                    unsafe.putObject(obj, jG, v28VarD);
                } else {
                    unsafe.putObject(obj, jG, object);
                }
                C(i2, obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jG);
            if (!n(object2)) {
                v28 v28VarD2 = f7fVarL.d();
                f7fVarL.a(v28VarD2, object2);
                unsafe.putObject(obj, jG, v28VarD2);
                object2 = v28VarD2;
            }
            f7fVarL.a(object2, object);
        }
    }

    public final Object s(int i, Object obj) {
        f7f f7fVarL = l(i);
        long jG = G(i) & 1048575;
        if (!m(i, obj)) {
            return f7fVarL.d();
        }
        Object object = o.getObject(obj, jG);
        if (n(object)) {
            return object;
        }
        v28 v28VarD = f7fVarL.d();
        if (object != null) {
            f7fVarL.a(v28VarD, object);
        }
        return v28VarD;
    }

    public final Object t(int i, Object obj, int i2) {
        f7f f7fVarL = l(i2);
        if (!o(i, obj, i2)) {
            return f7fVarL.d();
        }
        Object object = o.getObject(obj, G(i2) & 1048575);
        if (n(object)) {
            return object;
        }
        v28 v28VarD = f7fVarL.d();
        if (object != null) {
            f7fVarL.a(v28VarD, object);
        }
        return v28VarD;
    }

    public final void z(Object obj, int i, c cVar) {
        if ((536870912 & i) != 0) {
            wgi.o(i & 1048575, obj, cVar.P());
        } else if (this.f) {
            wgi.o(i & 1048575, obj, cVar.L());
        } else {
            wgi.o(i & 1048575, obj, cVar.j());
        }
    }
}
