package defpackage;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Build;
import android.os.Bundle;
import android.util.SizeF;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lvj {
    public static final ta4 a = new ta4(402616759, false, new ua4(9));
    public static final ta4 b = new ta4(480085384, false, new ua4(10));
    public static final byte[] c = {112, 114, 111, 0};
    public static final byte[] d = {112, 114, 109, 0};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    public static final void a(int i, long j, ld4 ld4Var, pz7 pz7Var, v8g v8gVar) {
        ?? r6;
        List listW;
        ?? W;
        v8g v8gVar2 = v8gVar;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(361732211);
        pz7 pz7Var2 = pz7Var;
        int i2 = i | (e18Var.f(v8gVar2) ? 4 : 2) | (e18Var.e(j) ? 32 : 16) | (e18Var.h(pz7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if ((i2 & 147) == 146 && e18Var.C()) {
            e18Var.T();
        } else {
            if (v8gVar2 instanceof u8g) {
                listW = x44.W(new za6(j));
            } else {
                if (!(v8gVar2 instanceof t8g)) {
                    xh6.d("Unknown sizeMode: ", v8gVar2);
                    return;
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    e18Var.a0(291654830);
                    Bundle bundle = (Bundle) e18Var.j(ue4.a);
                    boolean z = (i2 & 112) == 32;
                    Object objN = e18Var.N();
                    if (z || objN == jd4.a) {
                        objN = new ap4(j, 1);
                        e18Var.k0(objN);
                    }
                    zy7 zy7Var = (zy7) objN;
                    ArrayList<SizeF> parcelableArrayList = bundle.getParcelableArrayList("appWidgetSizes");
                    if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
                        int i3 = bundle.getInt("appWidgetMinHeight", 0);
                        int i4 = bundle.getInt("appWidgetMaxHeight", 0);
                        int i5 = bundle.getInt("appWidgetMinWidth", 0);
                        int i6 = bundle.getInt("appWidgetMaxWidth", 0);
                        W = (i3 == 0 || i4 == 0 || i5 == 0 || i6 == 0) ? x44.W(zy7Var.a()) : x44.X(new za6(mpk.d(i5, i4)), new za6(mpk.d(i6, i3)));
                    } else {
                        W = new ArrayList(x44.y(parcelableArrayList, 10));
                        for (SizeF sizeF : parcelableArrayList) {
                            W.add(new za6(mpk.d(sizeF.getWidth(), sizeF.getHeight())));
                        }
                    }
                    e18Var.p(false);
                    r6 = W;
                } else {
                    e18Var.a0(291759176);
                    Bundle bundle2 = (Bundle) e18Var.j(ue4.a);
                    int i7 = bundle2.getInt("appWidgetMinHeight", 0);
                    int i8 = bundle2.getInt("appWidgetMaxWidth", 0);
                    za6 za6Var = null;
                    za6 za6Var2 = (i7 == 0 || i8 == 0) ? null : new za6(mpk.d(i8, i7));
                    int i9 = bundle2.getInt("appWidgetMaxHeight", 0);
                    int i10 = bundle2.getInt("appWidgetMinWidth", 0);
                    if (i9 != 0 && i10 != 0) {
                        za6Var = new za6(mpk.d(i10, i9));
                    }
                    List listC0 = mp0.C0(new za6[]{za6Var2, za6Var});
                    if (listC0.isEmpty()) {
                        listC0 = x44.W(new za6(j));
                    }
                    e18Var.p(false);
                    r6 = listC0;
                }
                listW = (Collection) r6;
            }
            List listP1 = w44.p1(w44.s1(listW));
            ArrayList arrayList = new ArrayList(x44.y(listP1, 10));
            Iterator it = listP1.iterator();
            while (it.hasNext()) {
                d(((i2 << 3) & 112) | (i2 & 896), ((za6) it.next()).a, e18Var, pz7Var2, v8gVar2);
                arrayList.add(iei.a);
                pz7Var2 = pz7Var;
                v8gVar2 = v8gVar;
            }
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fj2(v8gVar, j, pz7Var, i, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.iqb r22, defpackage.x0a r23, defpackage.mnc r24, defpackage.mnc r25, defpackage.rz7 r26, defpackage.sz7 r27, defpackage.bz7 r28, defpackage.ld4 r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lvj.b(iqb, x0a, mnc, mnc, rz7, sz7, bz7, ld4, int, int):void");
    }

    public static final int c(boolean z, boolean z2, boolean z3) {
        return (z ? 1 : 0) | ((z2 ? 1 : 0) << 1) | ((z3 ? 1 : 0) << 2);
    }

    public static final void d(int i, long j, ld4 ld4Var, pz7 pz7Var, v8g v8gVar) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-771692794);
        int i2 = (e18Var.e(j) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var.f(v8gVar) : e18Var.h(v8gVar) ? 32 : 16;
        }
        if (((i2 | (e18Var.h(pz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC)) & 147) == 146 && e18Var.C()) {
            e18Var.T();
        } else {
            j8.c(te4.a.a(new za6(j)), fd9.q0(-367769018, new q8g(pz7Var, j, v8gVar), e18Var), e18Var, 56);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new i39(j, v8gVar, pz7Var, i);
        }
    }

    public static final long e(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static byte[] f(v26[] v26VarArr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (v26 v26Var : v26VarArr) {
            length += ((((v26Var.g * 2) + 7) & (-8)) / 8) + (v26Var.e * 2) + h(bArr, v26Var.a, v26Var.b).getBytes(StandardCharsets.UTF_8).length + 16 + v26Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, nvj.d)) {
            int length2 = v26VarArr.length;
            while (i < length2) {
                v26 v26Var2 = v26VarArr[i];
                r(byteArrayOutputStream, v26Var2, h(bArr, v26Var2.a, v26Var2.b));
                q(byteArrayOutputStream, v26Var2);
                i++;
            }
        } else {
            for (v26 v26Var3 : v26VarArr) {
                r(byteArrayOutputStream, v26Var3, h(bArr, v26Var3.a, v26Var3.b));
            }
            int length3 = v26VarArr.length;
            while (i < length3) {
                q(byteArrayOutputStream, v26VarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static final String g(long j, String str, Locale locale, LinkedHashMap linkedHashMap) {
        String str2 = "S:" + str + locale.toLanguageTag();
        Object obj = linkedHashMap.get(str2);
        Object obj2 = obj;
        if (obj == null) {
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            instanceForSkeleton.setTimeZone(TimeZone.GMT_ZONE);
            linkedHashMap.put(str2, instanceForSkeleton);
            obj2 = instanceForSkeleton;
        }
        return ((DateFormat) obj2).format(new Date(j));
    }

    public static String h(byte[] bArr, String str, String str2) {
        byte[] bArr2 = nvj.e;
        byte[] bArr3 = nvj.f;
        String str3 = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return ij0.m(ij0.o(str), (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static Set i() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static int[] j(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += (int) qvj.i(byteArrayInputStream, 2);
            iArr[i3] = i2;
        }
        return iArr;
    }

    public static v26[] k(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, v26[] v26VarArr) throws IOException {
        byte[] bArr3 = nvj.g;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, nvj.h)) {
                sz6.j("Unsupported meta version");
                return null;
            }
            int i = (int) qvj.i(fileInputStream, 2);
            byte[] bArrH = qvj.h(fileInputStream, (int) qvj.i(fileInputStream, 4), (int) qvj.i(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                sz6.j("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
            try {
                v26[] v26VarArrM = m(byteArrayInputStream, bArr2, i, v26VarArr);
                byteArrayInputStream.close();
                return v26VarArrM;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(nvj.b, bArr2)) {
            sz6.j("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            sz6.j("Unsupported meta version");
            return null;
        }
        int i2 = (int) qvj.i(fileInputStream, 1);
        byte[] bArrH2 = qvj.h(fileInputStream, (int) qvj.i(fileInputStream, 4), (int) qvj.i(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            sz6.j("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrH2);
        try {
            v26[] v26VarArrL = l(byteArrayInputStream2, i2, v26VarArr);
            byteArrayInputStream2.close();
            return v26VarArrL;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static v26[] l(ByteArrayInputStream byteArrayInputStream, int i, v26[] v26VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new v26[0];
        }
        if (i != v26VarArr.length) {
            sz6.j("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = (int) qvj.i(byteArrayInputStream, 2);
            iArr[i2] = (int) qvj.i(byteArrayInputStream, 2);
            strArr[i2] = new String(qvj.g(byteArrayInputStream, i3), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i; i4++) {
            v26 v26Var = v26VarArr[i4];
            if (!v26Var.b.equals(strArr[i4])) {
                sz6.j("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i5 = iArr[i4];
            v26Var.e = i5;
            v26Var.h = j(byteArrayInputStream, i5);
        }
        return v26VarArr;
    }

    public static v26[] m(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, v26[] v26VarArr) {
        v26 v26Var;
        if (byteArrayInputStream.available() == 0) {
            return new v26[0];
        }
        if (i != v26VarArr.length) {
            sz6.j("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            qvj.i(byteArrayInputStream, 2);
            String str = new String(qvj.g(byteArrayInputStream, (int) qvj.i(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jI = qvj.i(byteArrayInputStream, 4);
            int i3 = (int) qvj.i(byteArrayInputStream, 2);
            if (v26VarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i4 = 0; i4 < v26VarArr.length; i4++) {
                    if (v26VarArr[i4].b.equals(strSubstring)) {
                        v26Var = v26VarArr[i4];
                        break;
                    }
                }
                v26Var = null;
            } else {
                v26Var = null;
            }
            if (v26Var == null) {
                sz6.j("Missing profile key: ".concat(str));
                return null;
            }
            v26Var.d = jI;
            int[] iArrJ = j(byteArrayInputStream, i3);
            if (Arrays.equals(bArr, nvj.f)) {
                v26Var.e = i3;
                v26Var.h = iArrJ;
            }
        }
        return v26VarArr;
    }

    public static v26[] n(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, nvj.c)) {
            sz6.j("Unsupported version");
            return null;
        }
        int i = (int) qvj.i(fileInputStream, 1);
        byte[] bArrH = qvj.h(fileInputStream, (int) qvj.i(fileInputStream, 4), (int) qvj.i(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            sz6.j("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
        try {
            v26[] v26VarArrO = o(byteArrayInputStream, str, i);
            byteArrayInputStream.close();
            return v26VarArrO;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static v26[] o(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new v26[0];
        }
        v26[] v26VarArr = new v26[i];
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = (int) qvj.i(byteArrayInputStream, 2);
            int i5 = (int) qvj.i(byteArrayInputStream, 2);
            v26VarArr[i3] = new v26(str, new String(qvj.g(byteArrayInputStream, i4), StandardCharsets.UTF_8), qvj.i(byteArrayInputStream, 4), i5, (int) qvj.i(byteArrayInputStream, 4), (int) qvj.i(byteArrayInputStream, 4), new int[i5], new TreeMap());
        }
        int i6 = 0;
        while (i6 < i) {
            v26 v26Var = v26VarArr[i6];
            int iAvailable = byteArrayInputStream.available();
            int i7 = v26Var.f;
            int i8 = v26Var.g;
            TreeMap treeMap = v26Var.i;
            int i9 = iAvailable - i7;
            int i10 = i2;
            while (byteArrayInputStream.available() > i9) {
                i10 += (int) qvj.i(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i10), 1);
                int i11 = (int) qvj.i(byteArrayInputStream, 2);
                while (i11 > 0) {
                    qvj.i(byteArrayInputStream, 2);
                    int i12 = (int) qvj.i(byteArrayInputStream, 1);
                    if (i12 != 6 && i12 != 7) {
                        while (i12 > 0) {
                            qvj.i(byteArrayInputStream, 1);
                            int i13 = i2;
                            int i14 = i6;
                            for (int i15 = (int) qvj.i(byteArrayInputStream, 1); i15 > 0; i15--) {
                                qvj.i(byteArrayInputStream, 2);
                            }
                            i12--;
                            i2 = i13;
                            i6 = i14;
                        }
                    }
                    i11--;
                    i2 = i2;
                    i6 = i6;
                }
            }
            int i16 = i2;
            int i17 = i6;
            if (byteArrayInputStream.available() != i9) {
                sz6.j("Read too much data during profile line parse");
                return null;
            }
            v26Var.h = j(byteArrayInputStream, v26Var.e);
            BitSet bitSetValueOf = BitSet.valueOf(qvj.g(byteArrayInputStream, (((i8 * 2) + 7) & (-8)) / 8));
            for (int i18 = i16; i18 < i8; i18++) {
                int i19 = bitSetValueOf.get(i18) ? 2 : i16;
                if (bitSetValueOf.get(i18 + i8)) {
                    i19 |= 4;
                }
                if (i19 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i18));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i16);
                    }
                    treeMap.put(Integer.valueOf(i18), Integer.valueOf(i19 | numValueOf.intValue()));
                }
            }
            i6 = i17 + 1;
            i2 = i16;
        }
        return v26VarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean p(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, v26[] v26VarArr) throws IOException {
        int i;
        long j;
        int length;
        byte[] bArr2 = nvj.f;
        byte[] bArr3 = nvj.e;
        byte[] bArr4 = nvj.b;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = nvj.c;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrF = f(v26VarArr, bArr5);
                qvj.j(byteArrayOutputStream, v26VarArr.length, 1);
                qvj.j(byteArrayOutputStream, bArrF.length, 4);
                byte[] bArrC = qvj.c(bArrF);
                qvj.j(byteArrayOutputStream, bArrC.length, 4);
                byteArrayOutputStream.write(bArrC);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                qvj.j(byteArrayOutputStream, v26VarArr.length, 1);
                for (v26 v26Var : v26VarArr) {
                    int size = v26Var.i.size() * 4;
                    String strH = h(bArr3, v26Var.a, v26Var.b);
                    Charset charset = StandardCharsets.UTF_8;
                    qvj.k(byteArrayOutputStream, strH.getBytes(charset).length);
                    qvj.k(byteArrayOutputStream, v26Var.h.length);
                    qvj.j(byteArrayOutputStream, size, 4);
                    qvj.j(byteArrayOutputStream, v26Var.c, 4);
                    byteArrayOutputStream.write(strH.getBytes(charset));
                    Iterator it = v26Var.i.keySet().iterator();
                    while (it.hasNext()) {
                        qvj.k(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        qvj.k(byteArrayOutputStream, 0);
                    }
                    for (int i3 : v26Var.h) {
                        qvj.k(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr6 = nvj.d;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrF2 = f(v26VarArr, bArr6);
                qvj.j(byteArrayOutputStream, v26VarArr.length, 1);
                qvj.j(byteArrayOutputStream, bArrF2.length, 4);
                byte[] bArrC2 = qvj.c(bArrF2);
                qvj.j(byteArrayOutputStream, bArrC2.length, 4);
                byteArrayOutputStream.write(bArrC2);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            qvj.k(byteArrayOutputStream, v26VarArr.length);
            for (v26 v26Var2 : v26VarArr) {
                String str = v26Var2.a;
                TreeMap treeMap = v26Var2.i;
                String strH2 = h(bArr2, str, v26Var2.b);
                Charset charset2 = StandardCharsets.UTF_8;
                qvj.k(byteArrayOutputStream, strH2.getBytes(charset2).length);
                qvj.k(byteArrayOutputStream, treeMap.size());
                qvj.k(byteArrayOutputStream, v26Var2.h.length);
                qvj.j(byteArrayOutputStream, v26Var2.c, 4);
                byteArrayOutputStream.write(strH2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    qvj.k(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : v26Var2.h) {
                    qvj.k(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            qvj.k(byteArrayOutputStream2, v26VarArr.length);
            int i5 = 2;
            int i6 = 2;
            for (v26 v26Var3 : v26VarArr) {
                qvj.j(byteArrayOutputStream2, v26Var3.c, 4);
                qvj.j(byteArrayOutputStream2, v26Var3.d, 4);
                qvj.j(byteArrayOutputStream2, v26Var3.g, 4);
                String strH3 = h(bArr4, v26Var3.a, v26Var3.b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strH3.getBytes(charset3).length;
                qvj.k(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(strH3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            pij pijVar = new pij(1, false, byteArray);
            byteArrayOutputStream2.close();
            arrayList.add(pijVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < v26VarArr.length) {
                try {
                    v26 v26Var4 = v26VarArr[i7];
                    qvj.k(byteArrayOutputStream3, i7);
                    qvj.k(byteArrayOutputStream3, v26Var4.e);
                    i8 = i8 + 4 + (v26Var4.e * i5);
                    int[] iArr = v26Var4.h;
                    int length3 = iArr.length;
                    int i9 = i2;
                    while (i2 < length3) {
                        int i10 = iArr[i2];
                        qvj.k(byteArrayOutputStream3, i10 - i9);
                        i2++;
                        i5 = i5;
                        i9 = i10;
                    }
                    i7++;
                    i2 = 0;
                } catch (Throwable th) {
                }
            }
            int i11 = i5;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
            }
            pij pijVar2 = new pij(3, true, byteArray2);
            byteArrayOutputStream3.close();
            arrayList.add(pijVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i12 = 0;
            for (int i13 = 0; i13 < v26VarArr.length; i13++) {
                try {
                    v26 v26Var5 = v26VarArr[i13];
                    Iterator it3 = v26Var5.i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        s(byteArrayOutputStream4, iIntValue, v26Var5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            t(byteArrayOutputStream4, v26Var5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            qvj.k(byteArrayOutputStream3, i13);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i14 = i12 + 6;
                            qvj.j(byteArrayOutputStream3, length4, 4);
                            qvj.k(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i12 = i14 + length4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            pij pijVar3 = new pij(4, true, byteArray5);
            byteArrayOutputStream3.close();
            arrayList.add(pijVar3);
            long size2 = 12 + ((long) (arrayList.size() * 16));
            qvj.j(byteArrayOutputStream, arrayList.size(), 4);
            int i15 = 0;
            while (i15 < arrayList.size()) {
                pij pijVar4 = (pij) arrayList.get(i15);
                int i16 = pijVar4.a;
                byte[] bArr7 = pijVar4.b;
                if (i16 != 1) {
                    i = i11;
                    if (i16 == i) {
                        j = 1;
                    } else if (i16 == 3) {
                        j = 2;
                    } else if (i16 == 4) {
                        j = 3;
                    } else {
                        if (i16 != 5) {
                            throw null;
                        }
                        j = 4;
                    }
                } else {
                    i = i11;
                    j = 0;
                }
                qvj.j(byteArrayOutputStream, j, 4);
                qvj.j(byteArrayOutputStream, size2, 4);
                if (pijVar4.c) {
                    long length5 = bArr7.length;
                    byte[] bArrC3 = qvj.c(bArr7);
                    arrayList2.add(bArrC3);
                    qvj.j(byteArrayOutputStream, bArrC3.length, 4);
                    qvj.j(byteArrayOutputStream, length5, 4);
                    length = bArrC3.length;
                } else {
                    arrayList2.add(bArr7);
                    qvj.j(byteArrayOutputStream, bArr7.length, 4);
                    qvj.j(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i15++;
                i11 = i;
            }
            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i17));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, v26 v26Var) throws IOException {
        t(byteArrayOutputStream, v26Var);
        int i = v26Var.g;
        int[] iArr = v26Var.h;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            qvj.k(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : v26Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i5 = iIntValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i6 = iIntValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, v26 v26Var, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        qvj.k(byteArrayOutputStream, str.getBytes(charset).length);
        qvj.k(byteArrayOutputStream, v26Var.e);
        qvj.j(byteArrayOutputStream, v26Var.f, 4);
        qvj.j(byteArrayOutputStream, v26Var.c, 4);
        qvj.j(byteArrayOutputStream, v26Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, int i, v26 v26Var) throws IOException {
        int i2 = v26Var.g;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : v26Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & iIntValue2) == i4) {
                        int i5 = (i3 * i2) + iIntValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, v26 v26Var) {
        int i = 0;
        for (Map.Entry entry : v26Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                qvj.k(byteArrayOutputStream, iIntValue - i);
                qvj.k(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }
}
