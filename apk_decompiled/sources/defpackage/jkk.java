package defpackage;

import androidx.health.platform.client.proto.g;
import com.google.android.gms.internal.play_billing.d;
import com.google.android.gms.internal.play_billing.zzfa;
import com.google.android.gms.internal.play_billing.zzgc;
import com.pvporbit.freetype.FreeTypeConstants;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import siftscience.android.BuildConfig;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class jkk implements klk {
    public static final int[] j = new int[0];
    public static final Unsafe k = wok.i();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final h8k e;
    public final int[] f;
    public final int g;
    public final int h;
    public final xxi i;

    public jkk(int[] iArr, Object[] objArr, int i, int i2, h8k h8kVar, int[] iArr2, int i3, int i4, xxi xxiVar, byi byiVar) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = iArr2;
        this.g = i3;
        this.h = i4;
        this.i = xxiVar;
        this.e = h8kVar;
    }

    public static Field E(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
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
            throw new RuntimeException(sbR.toString(), e);
        }
    }

    public static boolean r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zdk) {
            return ((zdk) obj).h();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.jkk u(defpackage.glk r35, defpackage.xxi r36, defpackage.byi r37) {
        /*
            Method dump skipped, instruction units count: 1050
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jkk.u(glk, xxi, byi):jkk");
    }

    public static int v(long j2, Object obj) {
        return ((Integer) wok.h(j2, obj)).intValue();
    }

    public static int x(int i) {
        return (i >>> 20) & 255;
    }

    public static long z(long j2, Object obj) {
        return ((Long) wok.h(j2, obj)).longValue();
    }

    public final oek A(int i) {
        int i2 = i / 3;
        return (oek) this.b[i2 + i2 + 1];
    }

    public final klk B(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        klk klkVar = (klk) objArr[i3];
        if (klkVar != null) {
            return klkVar;
        }
        klk klkVarA = zkk.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = klkVarA;
        return klkVarA;
    }

    public final Object C(int i, Object obj) {
        klk klkVarB = B(i);
        int iY = y(i) & 1048575;
        if (!p(i, obj)) {
            return klkVarB.a();
        }
        Object object = k.getObject(obj, iY);
        if (r(object)) {
            return object;
        }
        zdk zdkVarA = klkVarB.a();
        if (object != null) {
            klkVarB.h(zdkVarA, object);
        }
        return zdkVarA;
    }

    public final Object D(int i, Object obj, int i2) {
        klk klkVarB = B(i2);
        if (!s(i, obj, i2)) {
            return klkVarB.a();
        }
        Object object = k.getObject(obj, y(i2) & 1048575);
        if (r(object)) {
            return object;
        }
        zdk zdkVarA = klkVarB.a();
        if (object != null) {
            klkVarB.h(zdkVarA, object);
        }
        return zdkVarA;
    }

    @Override // defpackage.klk
    public final zdk a() {
        return ((zdk) this.e).n();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    @Override // defpackage.klk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jkk.b(java.lang.Object):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.klk
    public final void c(Object obj, w9h w9hVar) throws zzfa {
        int[] iArr;
        int i;
        int i2;
        int i3;
        int i4;
        char c;
        jkk jkkVar = this;
        xak xakVar = (xak) w9hVar.E;
        Unsafe unsafe = k;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int[] iArr2 = jkkVar.a;
            if (i7 >= iArr2.length) {
                ((zdk) obj).zzc.d(w9hVar);
                return;
            }
            int iY = jkkVar.y(i7);
            int iX = x(iY);
            int i9 = iArr2[i7];
            if (iX <= 17) {
                int i10 = iArr2[i7 + 2];
                int i11 = i10 & i5;
                if (i11 != i6) {
                    i8 = i11 == i5 ? 0 : unsafe.getInt(obj, i11);
                    i6 = i11;
                }
                iArr = iArr2;
                i = 1 << (i10 >>> 20);
            } else {
                iArr = iArr2;
                i = 0;
            }
            long j2 = iY & i5;
            char c2 = 3;
            switch (iX) {
                case 0:
                    if (jkkVar.q(obj, i7, i6, i8, i)) {
                        xakVar.f(i9, Double.doubleToRawLongBits(wok.c.B0(j2, obj)));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 1:
                    if (jkkVar.q(obj, i7, i6, i8, i)) {
                        xakVar.d(i9, Float.floatToRawIntBits(wok.c.C0(j2, obj)));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 2:
                    if (jkkVar.q(obj, i7, i6, i8, i)) {
                        xakVar.m(i9, unsafe.getLong(obj, j2));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 3:
                    if (jkkVar.q(obj, i7, i6, i8, i)) {
                        xakVar.m(i9, unsafe.getLong(obj, j2));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 4:
                    if (jkkVar.q(obj, i7, i6, i8, i)) {
                        xakVar.h(i9, unsafe.getInt(obj, j2));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 5:
                    if (jkkVar.q(obj, i7, i6, i8, i)) {
                        xakVar.f(i9, unsafe.getLong(obj, j2));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 6:
                    if (jkkVar.q(obj, i7, i6, i8, i)) {
                        xakVar.d(i9, unsafe.getInt(obj, j2));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 7:
                    if (jkkVar.q(obj, i7, i6, i8, i)) {
                        boolean zH0 = wok.c.H0(j2, obj);
                        xakVar.l(i9 << 3);
                        xakVar.a(zH0 ? (byte) 1 : (byte) 0);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 8:
                    if (jkkVar.q(obj, i7, i6, i8, i)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            String str = (String) object;
                            xakVar.l((i9 << 3) | 2);
                            int i12 = xakVar.c;
                            byte[] bArr = xakVar.b;
                            int i13 = xakVar.d;
                            try {
                                int iO = xak.o(str.length() * 3);
                                int iO2 = xak.o(str.length());
                                if (iO2 == iO) {
                                    int i14 = i13 + iO2;
                                    xakVar.d = i14;
                                    int iA = d.a(str, bArr, i14, i12 - i14);
                                    xakVar.d = i13;
                                    xakVar.l((iA - i13) - iO2);
                                    xakVar.d = iA;
                                } else {
                                    xakVar.l(d.b(str));
                                    int i15 = xakVar.d;
                                    xakVar.d = d.a(str, bArr, i15, i12 - i15);
                                }
                            } catch (IndexOutOfBoundsException e) {
                                throw new zzfa(e);
                            }
                        } else {
                            xakVar.c(i9, (w9k) object);
                        }
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 9:
                    if (jkkVar.q(obj, i7, i6, i8, i)) {
                        w9hVar.m(i9, unsafe.getObject(obj, j2), jkkVar.B(i7));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 10:
                    if (jkkVar.q(obj, i7, i6, i8, i)) {
                        xakVar.c(i9, (w9k) unsafe.getObject(obj, j2));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 11:
                    if (jkkVar.q(obj, i7, i6, i8, i)) {
                        xakVar.k(i9, unsafe.getInt(obj, j2));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 12:
                    if (jkkVar.q(obj, i7, i6, i8, i)) {
                        xakVar.h(i9, unsafe.getInt(obj, j2));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 13:
                    if (jkkVar.q(obj, i7, i6, i8, i)) {
                        xakVar.d(i9, unsafe.getInt(obj, j2));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 14:
                    if (jkkVar.q(obj, i7, i6, i8, i)) {
                        xakVar.f(i9, unsafe.getLong(obj, j2));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                    if (jkkVar.q(obj, i7, i6, i8, i)) {
                        int i16 = unsafe.getInt(obj, j2);
                        xakVar.k(i9, (i16 >> 31) ^ (i16 + i16));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 16:
                    if (jkkVar.q(obj, i7, i6, i8, i)) {
                        long j3 = unsafe.getLong(obj, j2);
                        xakVar.m(i9, (j3 >> 63) ^ (j3 + j3));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case g.MAX_FIELD_NUMBER /* 17 */:
                    if (jkkVar.q(obj, i7, i6, i8, i)) {
                        Object object2 = unsafe.getObject(obj, j2);
                        xakVar.j(i9, 3);
                        jkkVar.B(i7).c((h8k) object2, w9hVar);
                        xakVar.j(i9, 4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case g.AVG_FIELD_NUMBER /* 18 */:
                    i2 = i7;
                    olk.r(iArr[i2], (List) unsafe.getObject(obj, j2), w9hVar, false);
                    i7 = i2;
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    i2 = i7;
                    olk.v(iArr[i2], (List) unsafe.getObject(obj, j2), w9hVar, false);
                    i7 = i2;
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                    i2 = i7;
                    olk.x(iArr[i2], (List) unsafe.getObject(obj, j2), w9hVar, false);
                    i7 = i2;
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 21:
                    i2 = i7;
                    olk.e(iArr[i2], (List) unsafe.getObject(obj, j2), w9hVar, false);
                    i7 = i2;
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    i2 = i7;
                    olk.w(iArr[i2], (List) unsafe.getObject(obj, j2), w9hVar, false);
                    i7 = i2;
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                    i2 = i7;
                    olk.u(iArr[i2], (List) unsafe.getObject(obj, j2), w9hVar, false);
                    i7 = i2;
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 24:
                    i2 = i7;
                    olk.t(iArr[i2], (List) unsafe.getObject(obj, j2), w9hVar, false);
                    i7 = i2;
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case BuildConfig.VERSION_CODE /* 25 */:
                    i2 = i7;
                    olk.q(iArr[i2], (List) unsafe.getObject(obj, j2), w9hVar, false);
                    i7 = i2;
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 26:
                    int i17 = iArr[i7];
                    List list = (List) unsafe.getObject(obj, j2);
                    xxi xxiVar = olk.a;
                    if (list != null && !list.isEmpty()) {
                        if (list instanceof ugk) {
                            ugk ugkVar = (ugk) list;
                            int i18 = 0;
                            while (i18 < list.size()) {
                                Object objZza = ugkVar.zza();
                                if (objZza instanceof String) {
                                    String str2 = (String) objZza;
                                    xakVar.l((i17 << 3) | 2);
                                    int i19 = xakVar.c;
                                    byte[] bArr2 = xakVar.b;
                                    c = c2;
                                    int i20 = xakVar.d;
                                    try {
                                        int iO3 = xak.o(str2.length() * 3);
                                        i4 = i7;
                                        int iO4 = xak.o(str2.length());
                                        if (iO4 == iO3) {
                                            int i21 = i20 + iO4;
                                            xakVar.d = i21;
                                            int iA2 = d.a(str2, bArr2, i21, i19 - i21);
                                            xakVar.d = i20;
                                            xakVar.l((iA2 - i20) - iO4);
                                            xakVar.d = iA2;
                                        } else {
                                            xakVar.l(d.b(str2));
                                            int i22 = xakVar.d;
                                            xakVar.d = d.a(str2, bArr2, i22, i19 - i22);
                                        }
                                    } catch (IndexOutOfBoundsException e2) {
                                        throw new zzfa(e2);
                                    }
                                } else {
                                    i4 = i7;
                                    c = c2;
                                    xakVar.c(i17, (w9k) objZza);
                                }
                                i18++;
                                c2 = c;
                                i7 = i4;
                            }
                            i3 = i7;
                        } else {
                            i3 = i7;
                            for (int i23 = 0; i23 < list.size(); i23++) {
                                String str3 = (String) list.get(i23);
                                xakVar.l((i17 << 3) | 2);
                                int i24 = xakVar.c;
                                byte[] bArr3 = xakVar.b;
                                int i25 = xakVar.d;
                                try {
                                    int iO5 = xak.o(str3.length() * 3);
                                    int iO6 = xak.o(str3.length());
                                    if (iO6 == iO5) {
                                        int i26 = i25 + iO6;
                                        xakVar.d = i26;
                                        int iA3 = d.a(str3, bArr3, i26, i24 - i26);
                                        xakVar.d = i25;
                                        xakVar.l((iA3 - i25) - iO6);
                                        xakVar.d = iA3;
                                    } else {
                                        xakVar.l(d.b(str3));
                                        int i27 = xakVar.d;
                                        xakVar.d = d.a(str3, bArr3, i27, i24 - i27);
                                    }
                                } catch (IndexOutOfBoundsException e3) {
                                    throw new zzfa(e3);
                                }
                            }
                        }
                        i7 = i3;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 27:
                    int i28 = iArr[i7];
                    List list2 = (List) unsafe.getObject(obj, j2);
                    klk klkVarB = jkkVar.B(i7);
                    xxi xxiVar2 = olk.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i29 = 0; i29 < list2.size(); i29++) {
                            w9hVar.m(i28, list2.get(i29), klkVarB);
                        }
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 28:
                    int i30 = iArr[i7];
                    List list3 = (List) unsafe.getObject(obj, j2);
                    xxi xxiVar3 = olk.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i31 = 0; i31 < list3.size(); i31++) {
                            xakVar.c(i30, (w9k) list3.get(i31));
                        }
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 29:
                    olk.d(iArr[i7], (List) unsafe.getObject(obj, j2), w9hVar, false);
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 30:
                    olk.s(iArr[i7], (List) unsafe.getObject(obj, j2), w9hVar, false);
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 31:
                    olk.y(iArr[i7], (List) unsafe.getObject(obj, j2), w9hVar, false);
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case FreeTypeConstants.FT_LOAD_FORCE_AUTOHINT /* 32 */:
                    olk.a(iArr[i7], (List) unsafe.getObject(obj, j2), w9hVar, false);
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 33:
                    olk.b(iArr[i7], (List) unsafe.getObject(obj, j2), w9hVar, false);
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 34:
                    olk.c(iArr[i7], (List) unsafe.getObject(obj, j2), w9hVar, false);
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 35:
                    olk.r(iArr[i7], (List) unsafe.getObject(obj, j2), w9hVar, true);
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 36:
                    olk.v(iArr[i7], (List) unsafe.getObject(obj, j2), w9hVar, true);
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 37:
                    olk.x(iArr[i7], (List) unsafe.getObject(obj, j2), w9hVar, true);
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 38:
                    olk.e(iArr[i7], (List) unsafe.getObject(obj, j2), w9hVar, true);
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 39:
                    olk.w(iArr[i7], (List) unsafe.getObject(obj, j2), w9hVar, true);
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 40:
                    olk.u(iArr[i7], (List) unsafe.getObject(obj, j2), w9hVar, true);
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 41:
                    olk.t(iArr[i7], (List) unsafe.getObject(obj, j2), w9hVar, true);
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 42:
                    olk.q(iArr[i7], (List) unsafe.getObject(obj, j2), w9hVar, true);
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 43:
                    olk.d(iArr[i7], (List) unsafe.getObject(obj, j2), w9hVar, true);
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 44:
                    olk.s(iArr[i7], (List) unsafe.getObject(obj, j2), w9hVar, true);
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 45:
                    olk.y(iArr[i7], (List) unsafe.getObject(obj, j2), w9hVar, true);
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 46:
                    olk.a(iArr[i7], (List) unsafe.getObject(obj, j2), w9hVar, true);
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 47:
                    olk.b(iArr[i7], (List) unsafe.getObject(obj, j2), w9hVar, true);
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case mdj.f /* 48 */:
                    olk.c(iArr[i7], (List) unsafe.getObject(obj, j2), w9hVar, true);
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 49:
                    int i32 = iArr[i7];
                    List list4 = (List) unsafe.getObject(obj, j2);
                    klk klkVarB2 = jkkVar.B(i7);
                    xxi xxiVar4 = olk.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i33 = 0; i33 < list4.size(); i33++) {
                            h8k h8kVar = (h8k) list4.get(i33);
                            xakVar.j(i32, 3);
                            klkVarB2.c(h8kVar, w9hVar);
                            xakVar.j(i32, 4);
                        }
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j2) != null) {
                        int i34 = i7 / 3;
                        throw ij0.e(jkkVar.b[i34 + i34]);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 51:
                    if (jkkVar.s(i9, obj, i7)) {
                        xakVar.f(i9, Double.doubleToRawLongBits(((Double) wok.h(j2, obj)).doubleValue()));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 52:
                    if (jkkVar.s(i9, obj, i7)) {
                        xakVar.d(i9, Float.floatToRawIntBits(((Float) wok.h(j2, obj)).floatValue()));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 53:
                    if (jkkVar.s(i9, obj, i7)) {
                        xakVar.m(i9, z(j2, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 54:
                    if (jkkVar.s(i9, obj, i7)) {
                        xakVar.m(i9, z(j2, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 55:
                    if (jkkVar.s(i9, obj, i7)) {
                        xakVar.h(i9, v(j2, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 56:
                    if (jkkVar.s(i9, obj, i7)) {
                        xakVar.f(i9, z(j2, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 57:
                    if (jkkVar.s(i9, obj, i7)) {
                        xakVar.d(i9, v(j2, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 58:
                    if (jkkVar.s(i9, obj, i7)) {
                        boolean zBooleanValue = ((Boolean) wok.h(j2, obj)).booleanValue();
                        xakVar.l(i9 << 3);
                        xakVar.a(zBooleanValue ? (byte) 1 : (byte) 0);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 59:
                    if (jkkVar.s(i9, obj, i7)) {
                        Object object3 = unsafe.getObject(obj, j2);
                        if (object3 instanceof String) {
                            String str4 = (String) object3;
                            xakVar.l((i9 << 3) | 2);
                            int i35 = xakVar.c;
                            byte[] bArr4 = xakVar.b;
                            int i36 = xakVar.d;
                            try {
                                int iO7 = xak.o(str4.length() * 3);
                                int iO8 = xak.o(str4.length());
                                if (iO8 == iO7) {
                                    int i37 = i36 + iO8;
                                    xakVar.d = i37;
                                    int iA4 = d.a(str4, bArr4, i37, i35 - i37);
                                    xakVar.d = i36;
                                    xakVar.l((iA4 - i36) - iO8);
                                    xakVar.d = iA4;
                                } else {
                                    xakVar.l(d.b(str4));
                                    int i38 = xakVar.d;
                                    xakVar.d = d.a(str4, bArr4, i38, i35 - i38);
                                }
                            } catch (IndexOutOfBoundsException e4) {
                                throw new zzfa(e4);
                            }
                        } else {
                            xakVar.c(i9, (w9k) object3);
                        }
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 60:
                    if (jkkVar.s(i9, obj, i7)) {
                        w9hVar.m(i9, unsafe.getObject(obj, j2), jkkVar.B(i7));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 61:
                    if (jkkVar.s(i9, obj, i7)) {
                        xakVar.c(i9, (w9k) unsafe.getObject(obj, j2));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 62:
                    if (jkkVar.s(i9, obj, i7)) {
                        xakVar.k(i9, v(j2, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 63:
                    if (jkkVar.s(i9, obj, i7)) {
                        xakVar.h(i9, v(j2, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case FreeTypeConstants.FT_LOAD_CROP_BITMAP /* 64 */:
                    if (jkkVar.s(i9, obj, i7)) {
                        xakVar.d(i9, v(j2, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 65:
                    if (jkkVar.s(i9, obj, i7)) {
                        xakVar.f(i9, z(j2, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 66:
                    if (jkkVar.s(i9, obj, i7)) {
                        int iV = v(j2, obj);
                        xakVar.k(i9, (iV >> 31) ^ (iV + iV));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 67:
                    if (jkkVar.s(i9, obj, i7)) {
                        long jZ = z(j2, obj);
                        xakVar.m(i9, (jZ >> 63) ^ (jZ + jZ));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                case 68:
                    if (jkkVar.s(i9, obj, i7)) {
                        Object object4 = unsafe.getObject(obj, j2);
                        xakVar.j(i9, 3);
                        jkkVar.B(i7).c((h8k) object4, w9hVar);
                        xakVar.j(i9, 4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
                default:
                    i7 += 3;
                    i5 = 1048575;
                    jkkVar = this;
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[PHI: r1
      0x00db: PHI (r1v34 int) = (r1v10 int), (r1v35 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.klk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(defpackage.zdk r11) {
        /*
            Method dump skipped, instruction units count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jkk.d(zdk):int");
    }

    @Override // defpackage.klk
    public final boolean e(zdk zdkVar, zdk zdkVar2) {
        boolean zF;
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int iY = y(i);
                long j2 = iY & 1048575;
                switch (x(iY)) {
                    case 0:
                        if (o(zdkVar, zdkVar2, i)) {
                            rok rokVar = wok.c;
                            if (Double.doubleToLongBits(rokVar.B0(j2, zdkVar)) == Double.doubleToLongBits(rokVar.B0(j2, zdkVar2))) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 1:
                        if (o(zdkVar, zdkVar2, i)) {
                            rok rokVar2 = wok.c;
                            if (Float.floatToIntBits(rokVar2.C0(j2, zdkVar)) == Float.floatToIntBits(rokVar2.C0(j2, zdkVar2))) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 2:
                        if (o(zdkVar, zdkVar2, i) && wok.f(j2, zdkVar) == wok.f(j2, zdkVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (o(zdkVar, zdkVar2, i) && wok.f(j2, zdkVar) == wok.f(j2, zdkVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (o(zdkVar, zdkVar2, i) && wok.e(j2, zdkVar) == wok.e(j2, zdkVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (o(zdkVar, zdkVar2, i) && wok.f(j2, zdkVar) == wok.f(j2, zdkVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (o(zdkVar, zdkVar2, i) && wok.e(j2, zdkVar) == wok.e(j2, zdkVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (o(zdkVar, zdkVar2, i)) {
                            rok rokVar3 = wok.c;
                            if (rokVar3.H0(j2, zdkVar) == rokVar3.H0(j2, zdkVar2)) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 8:
                        if (o(zdkVar, zdkVar2, i) && olk.f(wok.h(j2, zdkVar), wok.h(j2, zdkVar2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (o(zdkVar, zdkVar2, i) && olk.f(wok.h(j2, zdkVar), wok.h(j2, zdkVar2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (o(zdkVar, zdkVar2, i) && olk.f(wok.h(j2, zdkVar), wok.h(j2, zdkVar2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (o(zdkVar, zdkVar2, i) && wok.e(j2, zdkVar) == wok.e(j2, zdkVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (o(zdkVar, zdkVar2, i) && wok.e(j2, zdkVar) == wok.e(j2, zdkVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (o(zdkVar, zdkVar2, i) && wok.e(j2, zdkVar) == wok.e(j2, zdkVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (o(zdkVar, zdkVar2, i) && wok.f(j2, zdkVar) == wok.f(j2, zdkVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                        if (o(zdkVar, zdkVar2, i) && wok.e(j2, zdkVar) == wok.e(j2, zdkVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (o(zdkVar, zdkVar2, i) && wok.f(j2, zdkVar) == wok.f(j2, zdkVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case g.MAX_FIELD_NUMBER /* 17 */:
                        if (o(zdkVar, zdkVar2, i) && olk.f(wok.h(j2, zdkVar), wok.h(j2, zdkVar2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case g.AVG_FIELD_NUMBER /* 18 */:
                    case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                    case 21:
                    case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
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
                        zF = olk.f(wok.h(j2, zdkVar), wok.h(j2, zdkVar2));
                        break;
                    case 50:
                        zF = olk.f(wok.h(j2, zdkVar), wok.h(j2, zdkVar2));
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
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case FreeTypeConstants.FT_LOAD_CROP_BITMAP /* 64 */:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j3 = iArr[i + 2] & 1048575;
                        if (wok.e(j3, zdkVar) == wok.e(j3, zdkVar2) && olk.f(wok.h(j2, zdkVar), wok.h(j2, zdkVar2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        i += 3;
                        break;
                }
                if (zF) {
                    i += 3;
                }
            } else if (zdkVar.zzc.equals(zdkVar2.zzc)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.klk
    public final boolean f(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.g) {
            int i7 = this.f[i5];
            int[] iArr = this.a;
            int i8 = iArr[i7];
            int iY = y(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i4 = k.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i4;
                i = i10;
            } else {
                int i12 = i4;
                i = i6;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & iY) == 0 || q(obj, i2, i, i3, i11)) {
                int iX = x(iY);
                if (iX != 9 && iX != 17) {
                    if (iX != 27) {
                        if (iX == 60 || iX == 68) {
                            if (!s(i8, obj, i2) || B(i2).f(wok.h(iY & 1048575, obj))) {
                            }
                        } else if (iX != 49) {
                            if (iX == 50 && !((yik) wok.h(iY & 1048575, obj)).isEmpty()) {
                                int i13 = i2 / 3;
                                ij0.x(this.b[i13 + i13]);
                                throw null;
                            }
                        }
                        i5++;
                        i6 = i;
                        i4 = i3;
                    }
                    List list = (List) wok.h(iY & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        klk klkVarB = B(i2);
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            if (klkVarB.f(list.get(i14))) {
                            }
                        }
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                } else if (!q(obj, i2, i, i3, i11) || B(i2).f(wok.h(iY & 1048575, obj))) {
                    i5++;
                    i6 = i;
                    i4 = i3;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.klk
    public final void g(Object obj, byte[] bArr, int i, int i2, po0 po0Var) throws zzgc {
        t(obj, bArr, i, i2, 0, po0Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // defpackage.klk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.lang.Object r13, java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jkk.h(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
    @Override // defpackage.klk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(defpackage.h8k r18) {
        /*
            Method dump skipped, instruction units count: 1876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jkk.i(h8k):int");
    }

    public final void j(Object obj, int i, Object obj2) {
        if (p(i, obj2)) {
            int iY = y(i) & 1048575;
            Unsafe unsafe = k;
            long j2 = iY;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                sz6.j(vb7.k(this.a[i], "Source subfield ", " is present but null: ", obj2.toString()));
                return;
            }
            klk klkVarB = B(i);
            if (!p(i, obj)) {
                if (r(object)) {
                    zdk zdkVarA = klkVarB.a();
                    klkVarB.h(zdkVarA, object);
                    unsafe.putObject(obj, j2, zdkVarA);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                l(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!r(object2)) {
                zdk zdkVarA2 = klkVarB.a();
                klkVarB.h(zdkVarA2, object2);
                unsafe.putObject(obj, j2, zdkVarA2);
                object2 = zdkVarA2;
            }
            klkVarB.h(object2, object);
        }
    }

    public final void k(Object obj, int i, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (s(i2, obj2, i)) {
            int iY = y(i) & 1048575;
            Unsafe unsafe = k;
            long j2 = iY;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                sz6.j(vb7.k(iArr[i], "Source subfield ", " is present but null: ", obj2.toString()));
                return;
            }
            klk klkVarB = B(i);
            if (!s(i2, obj, i)) {
                if (r(object)) {
                    zdk zdkVarA = klkVarB.a();
                    klkVarB.h(zdkVarA, object);
                    unsafe.putObject(obj, j2, zdkVarA);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                wok.j(iArr[i + 2] & 1048575, obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!r(object2)) {
                zdk zdkVarA2 = klkVarB.a();
                klkVarB.h(zdkVarA2, object2);
                unsafe.putObject(obj, j2, zdkVarA2);
                object2 = zdkVarA2;
            }
            klkVarB.h(object2, object);
        }
    }

    public final void l(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j2 = 1048575 & i2;
        if (j2 == 1048575) {
            return;
        }
        wok.j(j2, obj, (1 << (i2 >>> 20)) | wok.e(j2, obj));
    }

    public final void m(Object obj, int i, Object obj2) {
        k.putObject(obj, y(i) & 1048575, obj2);
        l(i, obj);
    }

    public final void n(int i, Object obj, Object obj2, int i2) {
        k.putObject(obj, y(i2) & 1048575, obj2);
        wok.j(this.a[i2 + 2] & 1048575, obj, i);
    }

    public final boolean o(zdk zdkVar, zdk zdkVar2, int i) {
        return p(i, zdkVar) == p(i, zdkVar2);
    }

    public final boolean p(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j2 = i2 & 1048575;
        if (j2 != 1048575) {
            return ((1 << (i2 >>> 20)) & wok.e(j2, obj)) != 0;
        }
        int iY = y(i);
        long j3 = iY & 1048575;
        switch (x(iY)) {
            case 0:
                if (Double.doubleToRawLongBits(wok.c.B0(j3, obj)) != 0) {
                }
                break;
            case 1:
                if (Float.floatToRawIntBits(wok.c.C0(j3, obj)) != 0) {
                }
                break;
            case 2:
                if (wok.f(j3, obj) != 0) {
                }
                break;
            case 3:
                if (wok.f(j3, obj) != 0) {
                }
                break;
            case 4:
                if (wok.e(j3, obj) != 0) {
                }
                break;
            case 5:
                if (wok.f(j3, obj) != 0) {
                }
                break;
            case 6:
                if (wok.e(j3, obj) != 0) {
                }
                break;
            case 7:
                break;
            case 8:
                Object objH = wok.h(j3, obj);
                if (!(objH instanceof String)) {
                    if (!(objH instanceof w9k)) {
                        mr9.y();
                        break;
                    } else if (!w9k.F.equals(objH)) {
                    }
                } else if (!((String) objH).isEmpty()) {
                }
                break;
            case 9:
                if (wok.h(j3, obj) != null) {
                }
                break;
            case 10:
                if (!w9k.F.equals(wok.h(j3, obj))) {
                }
                break;
            case 11:
                if (wok.e(j3, obj) != 0) {
                }
                break;
            case 12:
                if (wok.e(j3, obj) != 0) {
                }
                break;
            case 13:
                if (wok.e(j3, obj) != 0) {
                }
                break;
            case 14:
                if (wok.f(j3, obj) != 0) {
                }
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                if (wok.e(j3, obj) != 0) {
                }
                break;
            case 16:
                if (wok.f(j3, obj) != 0) {
                }
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                if (wok.h(j3, obj) != null) {
                }
                break;
            default:
                mr9.y();
                break;
        }
        return false;
    }

    public final boolean q(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? p(i, obj) : (i3 & i4) != 0;
    }

    public final boolean s(int i, Object obj, int i2) {
        return wok.e((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0309, code lost:
    
        r8 = r11;
        r3 = r12;
        r6 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x032c, code lost:
    
        r4 = r42;
        r2 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x017d, code lost:
    
        r3 = r2;
        r2 = r1;
        r1 = r3;
        r4 = r42;
        r3 = r9;
        r8 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0184, code lost:
    
        r9 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0186, code lost:
    
        r7 = r21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0929 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0bef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:606:0x093d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:608:0x0c01 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int t(java.lang.Object r39, byte[] r40, int r41, int r42, int r43, defpackage.po0 r44) throws com.google.android.gms.internal.play_billing.zzgc {
        /*
            Method dump skipped, instruction units count: 3396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jkk.t(java.lang.Object, byte[], int, int, int, po0):int");
    }

    public final int w(int i, int i2) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final int y(int i) {
        return this.a[i + 1];
    }
}
