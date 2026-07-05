package com.google.android.gms.internal.measurement;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.b0l;
import defpackage.czk;
import defpackage.dyk;
import defpackage.f7i;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mr9;
import defpackage.ozk;
import defpackage.qsk;
import defpackage.r0l;
import defpackage.suk;
import defpackage.sz6;
import defpackage.t0l;
import defpackage.usk;
import defpackage.vb7;
import defpackage.wxk;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import siftscience.android.BuildConfig;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class p0 implements b0l {
    public static final int[] i = new int[0];
    public static final Unsafe j = t0l.e();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final l0 e;
    public final int[] f;
    public final int g;
    public final int h;

    public p0(int[] iArr, Object[] objArr, int i2, int i3, l0 l0Var, int[] iArr2, int i4, int i5, f7i f7iVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i2;
        this.d = i3;
        this.f = iArr2;
        this.g = i4;
        this.h = i5;
        this.e = l0Var;
    }

    public static boolean D(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof n0) {
            return ((n0) obj).o();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.measurement.p0 k(defpackage.zzk r34, defpackage.f7i r35) {
        /*
            Method dump skipped, instruction units count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.p0.k(zzk, f7i):com.google.android.gms.internal.measurement.p0");
    }

    public static Field n(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbR = kgh.r("Field ", str, " for ", name, " not found. Known fields are ");
            sbR.append(string);
            throw new RuntimeException(sbR.toString());
        }
    }

    public static int v(long j2, Object obj) {
        return ((Integer) t0l.j(j2, obj)).intValue();
    }

    public static long z(long j2, Object obj) {
        return ((Long) t0l.j(j2, obj)).longValue();
    }

    public final wxk A(int i2) {
        return (wxk) this.b[((i2 / 3) << 1) + 1];
    }

    public final b0l B(int i2) {
        int i3 = (i2 / 3) << 1;
        Object[] objArr = this.b;
        b0l b0lVar = (b0l) objArr[i3];
        if (b0lVar != null) {
            return b0lVar;
        }
        b0l b0lVarA = ozk.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = b0lVarA;
        return b0lVarA;
    }

    public final Object C(int i2) {
        return this.b[(i2 / 3) << 1];
    }

    @Override // defpackage.b0l
    public final boolean a(Object obj) {
        int i2;
        int i3;
        int i4;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i7 < this.g) {
            int i8 = this.f[i7];
            int[] iArr = this.a;
            int i9 = iArr[i8];
            int iU = u(i8);
            int i10 = iArr[i8 + 2];
            int i11 = i10 & 1048575;
            int i12 = 1 << (i10 >>> 20);
            if (i11 != i5) {
                if (i11 != 1048575) {
                    i6 = j.getInt(obj, i11);
                }
                i3 = i8;
                i4 = i6;
                i2 = i11;
            } else {
                int i13 = i6;
                i2 = i5;
                i3 = i8;
                i4 = i13;
            }
            if ((268435456 & iU) == 0 || r(obj, i3, i2, i4, i12)) {
                int i14 = (267386880 & iU) >>> 20;
                if (i14 != 9 && i14 != 17) {
                    if (i14 != 27) {
                        if (i14 == 60 || i14 == 68) {
                            if (!x(i9, obj, i3) || B(i3).a(t0l.j(iU & 1048575, obj))) {
                            }
                        } else if (i14 != 49) {
                            if (i14 == 50 && !((czk) t0l.j(iU & 1048575, obj)).isEmpty()) {
                                ij0.x(C(i3));
                                throw new NoSuchMethodError();
                            }
                        }
                        i7++;
                        i5 = i2;
                        i6 = i4;
                    }
                    List list = (List) t0l.j(iU & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        b0l b0lVarB = B(i3);
                        for (int i15 = 0; i15 < list.size(); i15++) {
                            if (b0lVarB.a(list.get(i15))) {
                            }
                        }
                    }
                    i7++;
                    i5 = i2;
                    i6 = i4;
                } else if (!r(obj, i3, i2, i4, i12) || B(i3).a(t0l.j(iU & 1048575, obj))) {
                    i7++;
                    i5 = i2;
                    i6 = i4;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.b0l
    public final void b(Object obj, byte[] bArr, int i2, int i3, usk uskVar) {
        j(obj, bArr, i2, i3, 0, uskVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    @Override // defpackage.b0l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.p0.c(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0370  */
    @Override // defpackage.b0l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(com.google.android.gms.internal.measurement.n0 r17) {
        /*
            Method dump skipped, instruction units count: 1912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.p0.d(com.google.android.gms.internal.measurement.n0):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    @Override // defpackage.b0l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(com.google.android.gms.internal.measurement.n0 r12, com.google.android.gms.internal.measurement.n0 r13) {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.p0.e(com.google.android.gms.internal.measurement.n0, com.google.android.gms.internal.measurement.n0):boolean");
    }

    @Override // defpackage.b0l
    public final void f(Object obj, Object obj2) {
        Object obj3;
        if (!D(obj)) {
            sz6.p("Mutating immutable message: ".concat(String.valueOf(obj)));
            return;
        }
        obj2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                r0.b(obj, obj2);
                return;
            }
            int iU = u(i2);
            long j2 = iU & 1048575;
            int i3 = iArr[i2];
            switch ((iU & 267386880) >>> 20) {
                case 0:
                    obj3 = obj;
                    if (w(i2, obj2)) {
                        r0l r0lVar = t0l.c;
                        r0lVar.d(obj3, j2, r0lVar.a(j2, obj2));
                        s(i2, obj3);
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 1:
                    obj3 = obj;
                    if (w(i2, obj2)) {
                        r0l r0lVar2 = t0l.c;
                        r0lVar2.e(obj3, j2, r0lVar2.h(j2, obj2));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 2:
                    obj3 = obj;
                    if (w(i2, obj2)) {
                        r0l r0lVar3 = t0l.c;
                        r0lVar3.f(obj3, j2, r0lVar3.k(j2, obj2));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 3:
                    obj3 = obj;
                    if (w(i2, obj2)) {
                        r0l r0lVar4 = t0l.c;
                        r0lVar4.f(obj3, j2, r0lVar4.k(j2, obj2));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 4:
                    obj3 = obj;
                    if (w(i2, obj2)) {
                        t0l.b(j2, obj3, t0l.c.j(j2, obj2));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 5:
                    obj3 = obj;
                    if (w(i2, obj2)) {
                        r0l r0lVar5 = t0l.c;
                        r0lVar5.f(obj3, j2, r0lVar5.k(j2, obj2));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 6:
                    obj3 = obj;
                    if (w(i2, obj2)) {
                        t0l.b(j2, obj3, t0l.c.j(j2, obj2));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 7:
                    obj3 = obj;
                    if (w(i2, obj2)) {
                        r0l r0lVar6 = t0l.c;
                        r0lVar6.g(obj3, j2, r0lVar6.i(j2, obj2));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 8:
                    obj3 = obj;
                    if (w(i2, obj2)) {
                        t0l.c(j2, obj3, t0l.j(j2, obj2));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 9:
                    obj3 = obj;
                    q(obj3, obj2, i2);
                    continue;
                    i2 += 3;
                    obj = obj3;
                    break;
                case 10:
                    obj3 = obj;
                    if (w(i2, obj2)) {
                        t0l.c(j2, obj3, t0l.j(j2, obj2));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 11:
                    obj3 = obj;
                    if (w(i2, obj2)) {
                        t0l.b(j2, obj3, t0l.c.j(j2, obj2));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 12:
                    obj3 = obj;
                    if (w(i2, obj2)) {
                        t0l.b(j2, obj3, t0l.c.j(j2, obj2));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 13:
                    obj3 = obj;
                    if (w(i2, obj2)) {
                        t0l.b(j2, obj3, t0l.c.j(j2, obj2));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 14:
                    obj3 = obj;
                    if (w(i2, obj2)) {
                        r0l r0lVar7 = t0l.c;
                        r0lVar7.f(obj3, j2, r0lVar7.k(j2, obj2));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case androidx.health.platform.client.proto.g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                    obj3 = obj;
                    if (w(i2, obj2)) {
                        t0l.b(j2, obj3, t0l.c.j(j2, obj2));
                        s(i2, obj3);
                    } else {
                        continue;
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case 16:
                    if (w(i2, obj2)) {
                        r0l r0lVar8 = t0l.c;
                        obj3 = obj;
                        r0lVar8.f(obj3, j2, r0lVar8.k(j2, obj2));
                        s(i2, obj3);
                    }
                    i2 += 3;
                    obj = obj3;
                    break;
                case androidx.health.platform.client.proto.g.MAX_FIELD_NUMBER /* 17 */:
                    q(obj, obj2, i2);
                    break;
                case androidx.health.platform.client.proto.g.AVG_FIELD_NUMBER /* 18 */:
                case androidx.health.platform.client.proto.g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                case androidx.health.platform.client.proto.g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                case 21:
                case androidx.health.platform.client.proto.g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                case androidx.health.platform.client.proto.g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                case 24:
                case BuildConfig.VERSION_CODE /* 25 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case FreeTypeConstants.FT_LOAD_FORCE_AUTOHINT /* 32 */:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case mdj.f /* 48 */:
                case 49:
                    dyk dykVarD = (dyk) t0l.j(j2, obj);
                    dyk dykVar = (dyk) t0l.j(j2, obj2);
                    int size = dykVarD.size();
                    int size2 = dykVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!((qsk) dykVarD).E) {
                            dykVarD = dykVarD.d(size2 + size);
                        }
                        dykVarD.addAll(dykVar);
                    }
                    if (size > 0) {
                        dykVar = dykVarD;
                    }
                    t0l.c(j2, obj, dykVar);
                    break;
                case 50:
                    czk czkVarF = (czk) t0l.j(j2, obj);
                    czk czkVar = (czk) t0l.j(j2, obj2);
                    if (!czkVar.isEmpty()) {
                        if (!czkVarF.h()) {
                            czkVarF = czkVarF.f();
                        }
                        czkVarF.d(czkVar);
                    }
                    t0l.c(j2, obj, czkVarF);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (x(i3, obj2, i2)) {
                        t0l.c(j2, obj, t0l.j(j2, obj2));
                        t0l.b(iArr[i2 + 2] & 1048575, obj, i3);
                    }
                    break;
                case 60:
                    t(obj, i2, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case FreeTypeConstants.FT_LOAD_CROP_BITMAP /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (x(i3, obj2, i2)) {
                        t0l.c(j2, obj, t0l.j(j2, obj2));
                        t0l.b(iArr[i2 + 2] & 1048575, obj, i3);
                    }
                    break;
                case 68:
                    t(obj, i2, obj2);
                    break;
            }
            obj3 = obj;
            i2 += 3;
            obj = obj3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063 A[PHI: r3 r4
      0x0063: PHI (r3v20 int) = 
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v3 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
      (r3v1 int)
     binds: [B:16:0x0060, B:259:0x076a, B:237:0x06c2, B:257:0x074a, B:252:0x0738, B:246:0x0707, B:243:0x06eb, B:234:0x06af, B:235:0x06b1, B:231:0x0689, B:232:0x068b, B:228:0x067a, B:229:0x067c, B:225:0x066b, B:226:0x066d, B:222:0x065c, B:223:0x065e, B:219:0x064d, B:220:0x064f, B:216:0x0639, B:217:0x063b, B:213:0x0623, B:214:0x0625, B:210:0x0610, B:211:0x0612, B:200:0x0576, B:134:0x03f2, B:136:0x03f8, B:326:0x0063, B:126:0x03b6, B:128:0x03bc, B:325:0x0063, B:117:0x034f, B:116:0x0340, B:115:0x0331, B:114:0x0322, B:113:0x0313, B:112:0x0304, B:111:0x02f5, B:110:0x02e6, B:109:0x02d7, B:108:0x02c8, B:107:0x02b9, B:106:0x02aa, B:105:0x029b, B:104:0x028c, B:97:0x0273, B:99:0x0279, B:324:0x0063, B:92:0x0256, B:89:0x023a, B:90:0x023c, B:86:0x021e, B:87:0x0220, B:83:0x020f, B:84:0x0211, B:80:0x0200, B:81:0x0202, B:77:0x01f1, B:78:0x01f3, B:74:0x01e2, B:75:0x01e4, B:71:0x01d3, B:72:0x01d5, B:68:0x01b9, B:69:0x01bb, B:46:0x0113, B:66:0x019a, B:61:0x0188, B:55:0x0157, B:52:0x013b, B:43:0x0100, B:44:0x0102, B:40:0x00db, B:41:0x00dd, B:37:0x00cd, B:38:0x00cf, B:34:0x00bf, B:35:0x00c1, B:31:0x00b1, B:32:0x00b3, B:28:0x00a3, B:29:0x00a5, B:25:0x0090, B:26:0x0092, B:22:0x007c, B:23:0x007e, B:19:0x006a, B:20:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0063: PHI (r4v15 int) = 
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v5 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
      (r4v3 int)
     binds: [B:16:0x0060, B:259:0x076a, B:237:0x06c2, B:257:0x074a, B:252:0x0738, B:246:0x0707, B:243:0x06eb, B:234:0x06af, B:235:0x06b1, B:231:0x0689, B:232:0x068b, B:228:0x067a, B:229:0x067c, B:225:0x066b, B:226:0x066d, B:222:0x065c, B:223:0x065e, B:219:0x064d, B:220:0x064f, B:216:0x0639, B:217:0x063b, B:213:0x0623, B:214:0x0625, B:210:0x0610, B:211:0x0612, B:200:0x0576, B:134:0x03f2, B:136:0x03f8, B:326:0x0063, B:126:0x03b6, B:128:0x03bc, B:325:0x0063, B:117:0x034f, B:116:0x0340, B:115:0x0331, B:114:0x0322, B:113:0x0313, B:112:0x0304, B:111:0x02f5, B:110:0x02e6, B:109:0x02d7, B:108:0x02c8, B:107:0x02b9, B:106:0x02aa, B:105:0x029b, B:104:0x028c, B:97:0x0273, B:99:0x0279, B:324:0x0063, B:92:0x0256, B:89:0x023a, B:90:0x023c, B:86:0x021e, B:87:0x0220, B:83:0x020f, B:84:0x0211, B:80:0x0200, B:81:0x0202, B:77:0x01f1, B:78:0x01f3, B:74:0x01e2, B:75:0x01e4, B:71:0x01d3, B:72:0x01d5, B:68:0x01b9, B:69:0x01bb, B:46:0x0113, B:66:0x019a, B:61:0x0188, B:55:0x0157, B:52:0x013b, B:43:0x0100, B:44:0x0102, B:40:0x00db, B:41:0x00dd, B:37:0x00cd, B:38:0x00cf, B:34:0x00bf, B:35:0x00c1, B:31:0x00b1, B:32:0x00b3, B:28:0x00a3, B:29:0x00a5, B:25:0x0090, B:26:0x0092, B:22:0x007c, B:23:0x007e, B:19:0x006a, B:20:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.b0l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.lang.Object r28, defpackage.bnh r29) throws com.google.android.gms.internal.measurement.zzkl$zzb {
        /*
            Method dump skipped, instruction units count: 2200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.p0.g(java.lang.Object, bnh):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8 A[PHI: r3
      0x00d8: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x01fd, B:41:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.b0l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.google.android.gms.internal.measurement.n0 r12) {
        /*
            Method dump skipped, instruction units count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.p0.h(com.google.android.gms.internal.measurement.n0):int");
    }

    public final int i(int i2, int i3) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = iArr[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x031c, code lost:
    
        r14 = r19 | r28;
        r5 = r3;
        r3 = r1;
        r1 = r4;
        r4 = r5;
        r15 = r36;
        r5 = r37;
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f7, code lost:
    
        r5 = r37;
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fa, code lost:
    
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ac, code lost:
    
        r5 = r37;
        r6 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0207, code lost:
    
        r2 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0d48 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:631:0x0a37 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:659:0x0a2d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:660:0x0d04 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0263  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, defpackage.usk r39) {
        /*
            Method dump skipped, instruction units count: 3686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.p0.j(java.lang.Object, byte[], int, int, int, usk):int");
    }

    public final Object l(int i2, Object obj) {
        b0l b0lVarB = B(i2);
        long jU = u(i2) & 1048575;
        if (!w(i2, obj)) {
            return b0lVarB.zza();
        }
        Object object = j.getObject(obj, jU);
        if (D(object)) {
            return object;
        }
        n0 n0VarZza = b0lVarB.zza();
        if (object != null) {
            b0lVarB.f(n0VarZza, object);
        }
        return n0VarZza;
    }

    public final Object m(int i2, Object obj, int i3) {
        b0l b0lVarB = B(i3);
        if (!x(i2, obj, i3)) {
            return b0lVarB.zza();
        }
        Object object = j.getObject(obj, u(i3) & 1048575);
        if (D(object)) {
            return object;
        }
        n0 n0VarZza = b0lVarB.zza();
        if (object != null) {
            b0lVarB.f(n0VarZza, object);
        }
        return n0VarZza;
    }

    public final void o(int i2, Object obj, Object obj2, int i3) {
        j.putObject(obj, u(i3) & 1048575, obj2);
        t0l.b(this.a[i3 + 2] & 1048575, obj, i2);
    }

    public final void p(Object obj, int i2, Object obj2) {
        j.putObject(obj, u(i2) & 1048575, obj2);
        s(i2, obj);
    }

    public final void q(Object obj, Object obj2, int i2) {
        if (w(i2, obj2)) {
            long jU = u(i2) & 1048575;
            Unsafe unsafe = j;
            Object object = unsafe.getObject(obj2, jU);
            if (object == null) {
                sz6.j(vb7.k(this.a[i2], "Source subfield ", " is present but null: ", String.valueOf(obj2)));
                return;
            }
            b0l b0lVarB = B(i2);
            if (!w(i2, obj)) {
                if (D(object)) {
                    n0 n0VarZza = b0lVarB.zza();
                    b0lVarB.f(n0VarZza, object);
                    unsafe.putObject(obj, jU, n0VarZza);
                } else {
                    unsafe.putObject(obj, jU, object);
                }
                s(i2, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jU);
            if (!D(object2)) {
                n0 n0VarZza2 = b0lVarB.zza();
                b0lVarB.f(n0VarZza2, object2);
                unsafe.putObject(obj, jU, n0VarZza2);
                object2 = n0VarZza2;
            }
            b0lVarB.f(object2, object);
        }
    }

    public final boolean r(Object obj, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? w(i2, obj) : (i4 & i5) != 0;
    }

    public final void s(int i2, Object obj) {
        int i3 = this.a[i2 + 2];
        long j2 = 1048575 & i3;
        if (j2 == 1048575) {
            return;
        }
        t0l.b(j2, obj, (1 << (i3 >>> 20)) | t0l.c.j(j2, obj));
    }

    public final void t(Object obj, int i2, Object obj2) {
        int[] iArr = this.a;
        int i3 = iArr[i2];
        if (x(i3, obj2, i2)) {
            long jU = u(i2) & 1048575;
            Unsafe unsafe = j;
            Object object = unsafe.getObject(obj2, jU);
            if (object == null) {
                sz6.j(vb7.k(iArr[i2], "Source subfield ", " is present but null: ", String.valueOf(obj2)));
                return;
            }
            b0l b0lVarB = B(i2);
            if (!x(i3, obj, i2)) {
                if (D(object)) {
                    n0 n0VarZza = b0lVarB.zza();
                    b0lVarB.f(n0VarZza, object);
                    unsafe.putObject(obj, jU, n0VarZza);
                } else {
                    unsafe.putObject(obj, jU, object);
                }
                t0l.b(iArr[i2 + 2] & 1048575, obj, i3);
                return;
            }
            Object object2 = unsafe.getObject(obj, jU);
            if (!D(object2)) {
                n0 n0VarZza2 = b0lVarB.zza();
                b0lVarB.f(n0VarZza2, object2);
                unsafe.putObject(obj, jU, n0VarZza2);
                object2 = n0VarZza2;
            }
            b0lVarB.f(object2, object);
        }
    }

    public final int u(int i2) {
        return this.a[i2 + 1];
    }

    public final boolean w(int i2, Object obj) {
        int i3 = this.a[i2 + 2];
        long j2 = i3 & 1048575;
        if (j2 != 1048575) {
            return ((1 << (i3 >>> 20)) & t0l.c.j(j2, obj)) != 0;
        }
        int iU = u(i2);
        long j3 = iU & 1048575;
        switch ((iU & 267386880) >>> 20) {
            case 0:
                if (Double.doubleToRawLongBits(t0l.c.a(j3, obj)) != 0) {
                }
                break;
            case 1:
                if (Float.floatToRawIntBits(t0l.c.h(j3, obj)) != 0) {
                }
                break;
            case 2:
                if (t0l.c.k(j3, obj) != 0) {
                }
                break;
            case 3:
                if (t0l.c.k(j3, obj) != 0) {
                }
                break;
            case 4:
                if (t0l.c.j(j3, obj) != 0) {
                }
                break;
            case 5:
                if (t0l.c.k(j3, obj) != 0) {
                }
                break;
            case 6:
                if (t0l.c.j(j3, obj) != 0) {
                }
                break;
            case 7:
                break;
            case 8:
                Object objJ = t0l.j(j3, obj);
                if (!(objJ instanceof String)) {
                    if (!(objJ instanceof suk)) {
                        mr9.y();
                        break;
                    } else if (!suk.G.equals(objJ)) {
                    }
                } else if (!((String) objJ).isEmpty()) {
                }
                break;
            case 9:
                if (t0l.j(j3, obj) != null) {
                }
                break;
            case 10:
                if (!suk.G.equals(t0l.j(j3, obj))) {
                }
                break;
            case 11:
                if (t0l.c.j(j3, obj) != 0) {
                }
                break;
            case 12:
                if (t0l.c.j(j3, obj) != 0) {
                }
                break;
            case 13:
                if (t0l.c.j(j3, obj) != 0) {
                }
                break;
            case 14:
                if (t0l.c.k(j3, obj) != 0) {
                }
                break;
            case androidx.health.platform.client.proto.g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                if (t0l.c.j(j3, obj) != 0) {
                }
                break;
            case 16:
                if (t0l.c.k(j3, obj) != 0) {
                }
                break;
            case androidx.health.platform.client.proto.g.MAX_FIELD_NUMBER /* 17 */:
                if (t0l.j(j3, obj) != null) {
                }
                break;
            default:
                mr9.y();
                break;
        }
        return false;
    }

    public final boolean x(int i2, Object obj, int i3) {
        return t0l.c.j((long) (this.a[i3 + 2] & 1048575), obj) == i2;
    }

    public final boolean y(n0 n0Var, n0 n0Var2, int i2) {
        return w(i2, n0Var) == w(i2, n0Var2);
    }

    @Override // defpackage.b0l
    public final n0 zza() {
        return (n0) ((n0) this.e).e(4);
    }
}
