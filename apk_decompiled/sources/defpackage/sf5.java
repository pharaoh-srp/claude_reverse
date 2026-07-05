package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.Path;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.util.Log;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.result.ApiResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.pvporbit.freetype.FreeTypeConstants;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: loaded from: classes.dex */
public abstract class sf5 {
    public static final c79 a = new c79(0, 0, -1, -1);
    public static final int[] b = new int[0];
    public static final long[] c = new long[0];
    public static final Object[] d = new Object[0];
    public static final f50 e = new f50(1);
    public static final long[] f = new long[0];

    public static ArrayList A(Parcel parcel, int i, Parcelable.Creator creator) {
        int iC0 = c0(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iC0 == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iC0);
        return arrayListCreateTypedArrayList;
    }

    public static vxi B(Class cls) throws InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                pmf.o(grc.s(cls, "Cannot create an instance of "));
                return null;
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                objNewInstance.getClass();
                return (vxi) objNewInstance;
            } catch (IllegalAccessException e2) {
                xh6.f(grc.s(cls, "Cannot create an instance of "), e2);
                return null;
            } catch (InstantiationException e3) {
                xh6.f(grc.s(cls, "Cannot create an instance of "), e3);
                return null;
            }
        } catch (NoSuchMethodException e4) {
            xh6.f(grc.s(cls, "Cannot create an instance of "), e4);
            return null;
        }
    }

    public static final void C(c40 c40Var, double d2, double d3, double d4, double d5, double d6, double d7, double d8, boolean z, boolean z2) {
        double d9;
        double d10;
        double d11 = d6;
        double d12 = (d8 / 180.0d) * 3.141592653589793d;
        double dCos = Math.cos(d12);
        double dSin = Math.sin(d12);
        double d13 = ((d3 * dSin) + (d2 * dCos)) / d11;
        double d14 = ((d3 * dCos) + ((-d2) * dSin)) / d7;
        double d15 = ((d5 * dSin) + (d4 * dCos)) / d11;
        double d16 = ((d5 * dCos) + ((-d4) * dSin)) / d7;
        double d17 = d13 - d15;
        double d18 = d14 - d16;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d14 + d16) / 2.0d;
        double d21 = (d18 * d18) + (d17 * d17);
        if (d21 == 0.0d) {
            return;
        }
        double d22 = (1.0d / d21) - 0.25d;
        if (d22 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d21) / 1.99999d);
            C(c40Var, d2, d3, d4, d5, d11 * dSqrt, d7 * dSqrt, d8, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d22);
        double d23 = d17 * dSqrt2;
        double d24 = dSqrt2 * d18;
        if (z == z2) {
            d9 = d19 - d24;
            d10 = d20 + d23;
        } else {
            d9 = d19 + d24;
            d10 = d20 - d23;
        }
        double dAtan2 = Math.atan2(d14 - d10, d13 - d9);
        double dAtan22 = Math.atan2(d16 - d10, d15 - d9) - dAtan2;
        if (z2 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d25 = d9 * d11;
        double d26 = d10 * d7;
        double d27 = (d25 * dCos) - (d26 * dSin);
        double d28 = (d26 * dCos) + (d25 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(d12);
        double dSin2 = Math.sin(d12);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d29 = -d11;
        double d30 = d29 * dCos2;
        double d31 = d7 * dSin2;
        double d32 = (d30 * dSin3) - (d31 * dCos3);
        double d33 = d29 * dSin2;
        double d34 = d7 * dCos2;
        double d35 = (dCos3 * d34) + (dSin3 * d33);
        double d36 = dAtan22 / ((double) iCeil);
        double d37 = dAtan2;
        double d38 = d32;
        int i = 0;
        double d39 = d35;
        double d40 = d3;
        while (i < iCeil) {
            double d41 = d37 + d36;
            double dSin4 = Math.sin(d41);
            double dCos4 = Math.cos(d41);
            int i2 = iCeil;
            double d42 = (((d11 * dCos2) * dCos4) + d27) - (d31 * dSin4);
            double d43 = (d34 * dSin4) + (d11 * dSin2 * dCos4) + d28;
            double d44 = (d30 * dSin4) - (d31 * dCos4);
            double d45 = (dCos4 * d34) + (dSin4 * d33);
            double d46 = d41 - d37;
            double dTan = Math.tan(d46 / 2.0d);
            double dSqrt3 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d46)) / 3.0d;
            c40Var.d((float) ((d38 * dSqrt3) + d2), (float) ((d39 * dSqrt3) + d40), (float) (d42 - (dSqrt3 * d44)), (float) (d43 - (dSqrt3 * d45)), (float) d42, (float) d43);
            d36 = d36;
            d2 = d42;
            i++;
            d33 = d33;
            dSin2 = dSin2;
            d27 = d27;
            d37 = d41;
            d39 = d45;
            d38 = d44;
            iCeil = i2;
            d40 = d43;
            d11 = d6;
        }
    }

    public static void D(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new SafeParcelReader$ParseException(ij0.g(i, "Overread allowed size end=", new StringBuilder(String.valueOf(i).length() + 26)), parcel);
        }
    }

    public static final int E(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iZ = x44.z(((tb9) list.get(i3)).b, i);
            if (iZ < 0) {
                i2 = i3 + 1;
            } else {
                if (iZ <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static long F(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i3, 262142);
        int iMin2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    sl4.l(i6);
                    sz6.r();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        return sl4.a(Math.min(i5, i), i2 != Integer.MAX_VALUE ? Math.min(i5, i2) : Integer.MAX_VALUE, iMin, iMin2);
    }

    public static long G(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i, 262142);
        int iMin2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
        int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    sl4.l(i6);
                    sz6.r();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        return sl4.a(iMin, iMin2, Math.min(i5, i3), i4 != Integer.MAX_VALUE ? Math.min(i5, i4) : Integer.MAX_VALUE);
    }

    public static final Object H(Object obj, Object obj2, Object obj3) {
        xf9 xf9Var = obj instanceof xf9 ? (xf9) obj : null;
        if (xf9Var == null) {
            return null;
        }
        Object obj4 = xf9Var.b;
        Object obj5 = xf9Var.a;
        if (x44.r(obj5, obj2) && x44.r(obj4, obj3)) {
            return obj;
        }
        Object objH = H(obj5, obj2, obj3);
        return objH == null ? H(obj4, obj2, obj3) : objH;
    }

    public static void J(final Context context) {
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (xn5.h0(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
            packageManager = applicationContext.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        final boolean z = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), FreeTypeConstants.FT_LOAD_PEDANTIC)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        if (Build.VERSION.SDK_INT < 29) {
            ez1.E(null);
        } else {
            final j5h j5hVar = new j5h();
            new Runnable() { // from class: kvd
                @Override // java.lang.Runnable
                public final void run() {
                    Context context2 = context;
                    j5h j5hVar2 = j5hVar;
                    try {
                        if (!(Binder.getCallingUid() == context2.getApplicationInfo().uid)) {
                            Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context2.getPackageName());
                            return;
                        }
                        SharedPreferences.Editor editorEdit = xn5.h0(context2).edit();
                        editorEdit.putBoolean("proxy_notification_initialized", true);
                        editorEdit.apply();
                        NotificationManager notificationManager = (NotificationManager) context2.getSystemService(NotificationManager.class);
                        if (z) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                            notificationManager.setNotificationDelegate(null);
                        }
                    } finally {
                        j5hVar2.d(null);
                    }
                }
            }.run();
        }
    }

    public static boolean K(String str) {
        str.getClass();
        List<String> list = ck5.f;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (String str2 : list) {
                if (str.equals(str2)) {
                    return true;
                }
                if (isg.h0(str, "." + str2, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final iqb L(iqb iqbVar, bz7 bz7Var) {
        return iqbVar.B(new rcc(bz7Var, true));
    }

    public static final iqb M(iqb iqbVar, float f2, float f3) {
        return iqbVar.B(new gcc(f2, f3));
    }

    public static iqb N(iqb iqbVar, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i & 2) != 0) {
            f3 = 0.0f;
        }
        return M(iqbVar, f2, f3);
    }

    public static l94 O(String str) throws ProtocolException {
        int i;
        String strSubstring;
        boolean zQ0 = isg.q0(str, "HTTP/1.", false);
        bvd bvdVar = bvd.HTTP_1_0;
        bvd bvdVar2 = bvd.HTTP_1_1;
        if (zQ0) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                bvdVar = bvdVar2;
            }
        } else if (isg.q0(str, "ICY ", false)) {
            i = 4;
        } else {
            if (!isg.q0(str, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 12;
            bvdVar = bvdVar2;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        Integer numR0 = isg.r0(10, str.substring(i, i2));
        if (numR0 == null) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int iIntValue = numR0.intValue();
        if (str.length() <= i2) {
            strSubstring = "";
        } else {
            if (str.charAt(i2) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            strSubstring = str.substring(i + 4);
        }
        return new l94(bvdVar, iIntValue, strSubstring);
    }

    public static final xd5 P(jt7 jt7Var, int i) {
        int iOrdinal = jt7Var.u1().ordinal();
        xd5 xd5Var = xd5.E;
        if (iOrdinal != 0) {
            xd5 xd5Var2 = xd5.F;
            if (iOrdinal == 1) {
                jt7 jt7VarO = cok.o(jt7Var);
                if (jt7VarO == null) {
                    sz6.p("ActiveParent with no focused child");
                    return null;
                }
                xd5 xd5VarP = P(jt7VarO, i);
                xd5 xd5Var3 = xd5VarP != xd5Var ? xd5VarP : null;
                if (xd5Var3 != null) {
                    return xd5Var3;
                }
                if (jt7Var.U) {
                    return xd5Var;
                }
                jt7Var.U = true;
                try {
                    ws7 ws7VarR1 = jt7Var.r1();
                    qa2 qa2Var = new qa2(i);
                    ts7 ts7Var = (ts7) yfd.X(jt7Var).getFocusOwner();
                    jt7 jt7VarH = ts7Var.h();
                    ws7VarR1.k.invoke(qa2Var);
                    jt7 jt7VarH2 = ts7Var.h();
                    if (!qa2Var.b) {
                        return (jt7VarH == jt7VarH2 || jt7VarH2 == null) ? xd5Var : bt7.d == bt7.c ? xd5Var2 : xd5.G;
                    }
                    bt7 bt7Var = bt7.b;
                    return xd5Var2;
                } finally {
                    jt7Var.U = false;
                }
            }
            if (iOrdinal == 2) {
                return xd5Var2;
            }
            if (iOrdinal != 3) {
                mr9.b();
                return null;
            }
        }
        return xd5Var;
    }

    public static final xd5 Q(jt7 jt7Var, int i) {
        if (!jt7Var.V) {
            jt7Var.V = true;
            try {
                ws7 ws7VarR1 = jt7Var.r1();
                qa2 qa2Var = new qa2(i);
                ts7 ts7Var = (ts7) yfd.X(jt7Var).getFocusOwner();
                jt7 jt7VarH = ts7Var.h();
                ws7VarR1.j.invoke(qa2Var);
                jt7 jt7VarH2 = ts7Var.h();
                boolean z = qa2Var.b;
                xd5 xd5Var = xd5.F;
                if (z) {
                    bt7 bt7Var = bt7.b;
                    return xd5Var;
                }
                if (jt7VarH != jt7VarH2 && jt7VarH2 != null) {
                    return bt7.d == bt7.c ? xd5Var : xd5.G;
                }
            } finally {
                jt7Var.V = false;
            }
        }
        return xd5.E;
    }

    public static final xd5 R(jt7 jt7Var, int i) {
        hqb hqbVarJ;
        g5c g5cVar;
        int iOrdinal = jt7Var.u1().ordinal();
        xd5 xd5Var = xd5.E;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                jt7 jt7VarO = cok.o(jt7Var);
                if (jt7VarO != null) {
                    return P(jt7VarO, i);
                }
                sz6.p("ActiveParent with no focused child");
                return null;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    mr9.b();
                    return null;
                }
                if (!jt7Var.E.R) {
                    b39.c("visitAncestors called on an unattached node");
                }
                hqb hqbVar = jt7Var.E.I;
                av9 av9VarW = yfd.W(jt7Var);
                loop0: while (true) {
                    if (av9VarW == null) {
                        hqbVarJ = null;
                        break;
                    }
                    if ((((hqb) av9VarW.k0.K).H & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                        while (hqbVar != null) {
                            if ((hqbVar.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                                hqbVarJ = hqbVar;
                                wwb wwbVar = null;
                                while (hqbVarJ != null) {
                                    if (hqbVarJ instanceof jt7) {
                                        break loop0;
                                    }
                                    if ((hqbVarJ.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 && (hqbVarJ instanceof qw5)) {
                                        int i2 = 0;
                                        for (hqb hqbVar2 = ((qw5) hqbVarJ).T; hqbVar2 != null; hqbVar2 = hqbVar2.J) {
                                            if ((hqbVar2.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    hqbVarJ = hqbVar2;
                                                } else {
                                                    if (wwbVar == null) {
                                                        wwbVar = new wwb(0, new hqb[16]);
                                                    }
                                                    if (hqbVarJ != null) {
                                                        wwbVar.b(hqbVarJ);
                                                        hqbVarJ = null;
                                                    }
                                                    wwbVar.b(hqbVar2);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    hqbVarJ = yfd.j(wwbVar);
                                }
                            }
                            hqbVar = hqbVar.I;
                        }
                    }
                    av9VarW = av9VarW.G();
                    hqbVar = (av9VarW == null || (g5cVar = av9VarW.k0) == null) ? null : (j4h) g5cVar.J;
                }
                jt7 jt7Var2 = (jt7) hqbVarJ;
                if (jt7Var2 == null) {
                    return xd5Var;
                }
                int iOrdinal2 = jt7Var2.u1().ordinal();
                if (iOrdinal2 == 0) {
                    return Q(jt7Var2, i);
                }
                if (iOrdinal2 == 1) {
                    return R(jt7Var2, i);
                }
                if (iOrdinal2 == 2) {
                    return xd5.F;
                }
                if (iOrdinal2 != 3) {
                    mr9.b();
                    return null;
                }
                xd5 xd5VarR = R(jt7Var2, i);
                xd5 xd5Var2 = xd5VarR != xd5Var ? xd5VarR : null;
                return xd5Var2 == null ? Q(jt7Var2, i) : xd5Var2;
            }
        }
        return xd5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01b9 A[PHI: r16
      0x01b9: PHI (r16v2 wwb) = (r16v1 wwb), (r16v1 wwb), (r16v1 wwb), (r16v4 wwb) binds: [B:95:0x0168, B:97:0x016e, B:99:0x0172, B:116:0x01af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x025e A[ADDED_TO_REGION, LOOP:9: B:161:0x025e->B:168:0x0270, LOOP_START, PHI: r14
      0x025e: PHI (r14v3 int) = (r14v2 int), (r14v4 int) binds: [B:160:0x025c, B:168:0x0270] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x027e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean S(defpackage.jt7 r22) {
        /*
            Method dump skipped, instruction units count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sf5.S(jt7):boolean");
    }

    public static boolean T(Parcel parcel, int i) {
        l0(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static byte U(Parcel parcel, int i) {
        l0(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static float V(Parcel parcel, int i) {
        l0(parcel, i, 4);
        return parcel.readFloat();
    }

    public static Float W(Parcel parcel, int i) {
        int iC0 = c0(parcel, i);
        if (iC0 == 0) {
            return null;
        }
        m0(parcel, iC0, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static IBinder X(Parcel parcel, int i) {
        int iC0 = c0(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iC0 == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iC0);
        return strongBinder;
    }

    public static int Y(Parcel parcel, int i) {
        l0(parcel, i, 4);
        return parcel.readInt();
    }

    public static Integer Z(Parcel parcel, int i) {
        int iC0 = c0(parcel, i);
        if (iC0 == 0) {
            return null;
        }
        m0(parcel, iC0, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static final qu1 a(float f2, long j) {
        return new qu1(f2, new eeg(j));
    }

    public static long a0(Parcel parcel, int i) {
        l0(parcel, i, 8);
        return parcel.readLong();
    }

    public static final void b(ml3 ml3Var, iqb iqbVar, l45 l45Var, ld4 ld4Var, int i) {
        iqb iqbVar2;
        l45 l45Var2;
        l45 l45Var3;
        iqb iqbVar3;
        ml3Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(2074577990);
        int i2 = 2;
        int i3 = (e18Var.f(ml3Var) ? 4 : 2) | i | 176;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                Object objN = e18Var.N();
                if (objN == jd4.a) {
                    objN = fd9.O(im6.E, e18Var);
                    e18Var.k0(objN);
                }
                l45Var3 = (l45) objN;
                iqbVar3 = fqb.E;
            } else {
                e18Var.T();
                iqbVar3 = iqbVar;
                l45Var3 = l45Var;
            }
            e18Var.q();
            knk.e(ml3Var.a, null, null, null, fd9.q0(-1384724250, new wt2(ml3Var, l45Var3, iqbVar3, i2), e18Var), e18Var, 24576, 14);
            iqbVar2 = iqbVar3;
            l45Var2 = l45Var3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            l45Var2 = l45Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new m63(ml3Var, i, iqbVar2, l45Var2, 7);
        }
    }

    public static Long b0(Parcel parcel, int i) {
        int iC0 = c0(parcel, i);
        if (iC0 == 0) {
            return null;
        }
        m0(parcel, iC0, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static r20 c(int i, int i2, int i3, int i4) {
        ColorSpace rgb;
        rse rseVar;
        int i5;
        ColorSpace.Rgb.TransferParameters transferParameters;
        ColorSpace rgb2;
        int i6 = (i4 & 4) != 0 ? 0 : i3;
        rse rseVar2 = t54.e;
        yfd.j0(i6);
        Bitmap.Config configJ0 = yfd.j0(i6);
        if (x44.r(rseVar2, rseVar2)) {
            rgb = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (x44.r(rseVar2, t54.q)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (x44.r(rseVar2, t54.r)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (x44.r(rseVar2, t54.o)) {
            rgb = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (x44.r(rseVar2, t54.j)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (x44.r(rseVar2, t54.i)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (x44.r(rseVar2, t54.t)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (x44.r(rseVar2, t54.s)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (x44.r(rseVar2, t54.k)) {
            rgb = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (x44.r(rseVar2, t54.l)) {
            rgb = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (x44.r(rseVar2, t54.g)) {
            rgb = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (x44.r(rseVar2, t54.h)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (x44.r(rseVar2, t54.f)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (x44.r(rseVar2, t54.m)) {
            rgb = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (x44.r(rseVar2, t54.p)) {
            rgb = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else {
            if (!x44.r(rseVar2, t54.n)) {
                if (Build.VERSION.SDK_INT < 34 || (rgb = pok.i(rseVar2)) == null) {
                    if (rseVar2 != null) {
                        String str = rseVar2.a;
                        float[] fArrA = rseVar2.d.a();
                        a5i a5iVar = rseVar2.g;
                        if (a5iVar != null) {
                            rseVar = rseVar2;
                            i5 = 0;
                            transferParameters = new ColorSpace.Rgb.TransferParameters(a5iVar.b, a5iVar.c, a5iVar.d, a5iVar.e, a5iVar.f, a5iVar.g, a5iVar.a);
                        } else {
                            rseVar = rseVar2;
                            i5 = 0;
                            transferParameters = null;
                        }
                        rse rseVar3 = rseVar;
                        float[] fArr = rseVar3.i;
                        if (transferParameters != null) {
                            ColorSpace.Rgb rgb3 = new ColorSpace.Rgb(str, rseVar3.h, fArrA, transferParameters);
                            if (Float.isNaN(fArr[i5]) || Arrays.equals(rgb3.getTransform(), fArr)) {
                                rgb2 = rgb3;
                            } else {
                                rgb = new ColorSpace.Rgb(str, fArr, transferParameters);
                            }
                        } else {
                            float[] fArr2 = rseVar3.h;
                            final qse qseVar = rseVar3.l;
                            final int i7 = i5;
                            DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: s54
                                @Override // java.util.function.DoubleUnaryOperator
                                public final double applyAsDouble(double d2) {
                                    int i8 = i7;
                                    bz7 bz7Var = qseVar;
                                    switch (i8) {
                                    }
                                    return ((Number) bz7Var.invoke(Double.valueOf(d2))).doubleValue();
                                }
                            };
                            final qse qseVar2 = rseVar3.o;
                            final int i8 = 1;
                            rgb2 = new ColorSpace.Rgb(str, fArr2, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: s54
                                @Override // java.util.function.DoubleUnaryOperator
                                public final double applyAsDouble(double d2) {
                                    int i82 = i8;
                                    bz7 bz7Var = qseVar2;
                                    switch (i82) {
                                    }
                                    return ((Number) bz7Var.invoke(Double.valueOf(d2))).doubleValue();
                                }
                            }, rseVar3.e, rseVar3.f);
                        }
                    } else {
                        rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                    }
                }
                return new r20(Bitmap.createBitmap((DisplayMetrics) null, i, i2, configJ0, true, rgb2));
            }
            rgb = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        rgb2 = rgb;
        return new r20(Bitmap.createBitmap((DisplayMetrics) null, i, i2, configJ0, true, rgb2));
    }

    public static int c0(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static final void d(zy7 zy7Var, koi koiVar, ld4 ld4Var, int i) {
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1989370366);
        int i2 = (e18Var.h(zy7Var) ? 4 : 2) | i | (e18Var.f(koiVar) ? 32 : 16);
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            e18Var.V();
            if ((i & 1) != 0 && !e18Var.A()) {
                e18Var.T();
            }
            e18Var.q();
            nwb nwbVarZ = mpk.Z(zy7Var, e18Var);
            boolean zF = e18Var.f(nwbVarZ) | ((((i2 & 112) ^ 48) > 32 && e18Var.f(koiVar)) || (i2 & 48) == 32);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new vk3(koiVar, 15, nwbVarZ);
                e18Var.k0(objN);
            }
            fd9.d(koiVar, (bz7) objN, e18Var);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fga(zy7Var, koiVar, i, i3);
        }
    }

    public static final xpa d0(ez1 ez1Var, bz7 bz7Var, ld4 ld4Var, int i) {
        Object bdVar;
        ez1 ez1Var2;
        mpk.Z(ez1Var, ld4Var);
        nwb nwbVarZ = mpk.Z(bz7Var, ld4Var);
        Object[] objArr = new Object[0];
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (objN == lz1Var) {
            objN = new j7(5);
            e18Var.k0(objN);
        }
        String str = (String) iuj.I(objArr, (zy7) objN, e18Var, 48);
        ed edVarA = uca.a(e18Var);
        if (edVarA == null) {
            sz6.j("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
            return null;
        }
        z94 z94VarE = edVarA.e();
        Object objN2 = e18Var.N();
        if (objN2 == lz1Var) {
            objN2 = new wc();
            e18Var.k0(objN2);
        }
        wc wcVar = (wc) objN2;
        Object objN3 = e18Var.N();
        if (objN3 == lz1Var) {
            objN3 = new xpa(wcVar);
            e18Var.k0(objN3);
        }
        xpa xpaVar = (xpa) objN3;
        boolean zH = e18Var.h(wcVar) | e18Var.h(z94VarE) | e18Var.f(str) | e18Var.h(ez1Var) | e18Var.f(nwbVarZ);
        Object objN4 = e18Var.N();
        if (zH || objN4 == lz1Var) {
            ez1Var2 = ez1Var;
            bdVar = new bd(wcVar, z94VarE, str, ez1Var2, nwbVarZ, 0);
            e18Var.k0(bdVar);
        } else {
            bdVar = objN4;
            ez1Var2 = ez1Var;
        }
        fd9.f(z94VarE, str, ez1Var2, (bz7) bdVar, e18Var);
        return xpaVar;
    }

    public static final iqb e(bz7 bz7Var) {
        return new rcc(bz7Var, false);
    }

    public static final void e0(vag vagVar, int i, Object obj) {
        int iH = vagVar.h(i);
        Object[] objArr = vagVar.c;
        Object obj2 = objArr[iH];
        objArr[iH] = jd4.a;
        if (obj == obj2) {
            return;
        }
        pd4.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    public static final void f(int i, int i2, List list) {
        int iE = E(i, list);
        if (iE < 0) {
            iE = -(iE + 1);
        }
        while (iE < list.size() && ((tb9) list.get(iE)).b < i2) {
        }
    }

    public static Set f0(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        setSingleton.getClass();
        return setSingleton;
    }

    public static final List g(unb unbVar, int i, int i2, ArrayList arrayList, wub wubVar, int i3, int i4, int i5, bz7 bz7Var) {
        int i6;
        wub wubVar2;
        long j;
        long j2;
        int i7;
        Object obj;
        int i8;
        if (unbVar == null || arrayList.isEmpty() || (i6 = wubVar.b) == 0) {
            return lm6.E;
        }
        int i9 = -1;
        if (i2 - i < 0 || i6 == 0) {
            wubVar2 = u69.a;
        } else {
            b79 b79VarH0 = wd6.H0(0, i6);
            int i10 = b79VarH0.E;
            int i11 = b79VarH0.F;
            int iC = -1;
            if (i10 <= i11) {
                while (wubVar.c(i10) <= i) {
                    iC = wubVar.c(i10);
                    if (i10 == i11) {
                        break;
                    }
                    i10++;
                }
            }
            if (iC == -1) {
                wubVar2 = u69.a;
            } else {
                wub wubVar3 = u69.a;
                wubVar2 = new wub(1);
                wubVar2.a(iC);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj2 = arrayList.get(i12);
            int index = ((oz9) obj2).getIndex();
            int[] iArr = wubVar.a;
            int i13 = wubVar.b;
            int i14 = 0;
            while (true) {
                if (i14 >= i13) {
                    break;
                }
                if (iArr[i14] == index) {
                    arrayList3.add(obj2);
                    break;
                }
                i14++;
            }
        }
        int[] iArr2 = wubVar2.a;
        int i15 = wubVar2.b;
        int i16 = 0;
        while (i16 < i15) {
            int i17 = iArr2[i16];
            Iterator it = arrayList.iterator();
            int i18 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i18 = i9;
                    break;
                }
                if (((oz9) it.next()).getIndex() == i17) {
                    break;
                }
                i18++;
            }
            oz9 oz9Var = i18 == i9 ? (oz9) bz7Var.invoke(Integer.valueOf(i17)) : (oz9) arrayList.remove(i18);
            int iF = oz9Var.f();
            if (i18 == i9) {
                j = 4294967295L;
                i7 = Integer.MIN_VALUE;
            } else {
                long jK = oz9Var.k(0);
                if (oz9Var.i()) {
                    j = 4294967295L;
                    j2 = jK & 4294967295L;
                } else {
                    j = 4294967295L;
                    j2 = jK >> 32;
                }
                i7 = (int) j2;
            }
            int size2 = arrayList3.size();
            int i19 = 0;
            while (true) {
                if (i19 >= size2) {
                    obj = null;
                    break;
                }
                obj = arrayList3.get(i19);
                if (((oz9) obj).getIndex() != i17) {
                    break;
                }
                i19++;
            }
            oz9 oz9Var2 = (oz9) obj;
            if (oz9Var2 != null) {
                long jK2 = oz9Var2.k(0);
                i8 = (int) (oz9Var2.i() ? jK2 & j : jK2 >> 32);
            } else {
                i8 = Integer.MIN_VALUE;
            }
            int iMax = i7 == Integer.MIN_VALUE ? -i3 : Math.max(-i3, i7);
            if (i8 != Integer.MIN_VALUE) {
                iMax = Math.min(iMax, i8 - iF);
            }
            oz9Var.j();
            oz9Var.e(iMax, 0, i4, i5);
            arrayList2.add(oz9Var);
            i16++;
            i9 = -1;
        }
        return arrayList2;
    }

    public static void g0(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + c0(parcel, i));
    }

    public static final int h(int i, int i2, int[] iArr) {
        iArr.getClass();
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final void h0(Object obj) {
        if (obj instanceof hre) {
            throw ((hre) obj).E;
        }
    }

    public static final int i(long[] jArr, int i, long j) {
        jArr.getClass();
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public static final ApiResult i0(oqe oqeVar, Type type, cj3 cj3Var) {
        pqe pqeVar = oqeVar.a;
        int i = pqeVar.H;
        if (pqeVar.U) {
            return type.equals(iei.class) ? new of0(i, iei.a) : new of0(i, oqeVar.b);
        }
        bg9 bg9Var = cj3Var.a;
        rqe rqeVar = oqeVar.c;
        return new lf0(i, dj3.a(bg9Var, i, rqeVar != null ? rqeVar.f() : null));
    }

    public static final c40 j0(List list, c40 c40Var) {
        Path path;
        int i;
        float f2;
        int i2;
        nvc nvcVar;
        float f3;
        float f4;
        float fA;
        float fA2;
        float fC;
        float fB;
        float fD;
        float fD2;
        float fC2;
        float fB2;
        float fD3;
        float f5;
        float f6;
        float fA3;
        float fA4;
        List list2 = list;
        c40 c40Var2 = c40Var;
        Path path2 = c40Var2.a;
        Path path3 = c40Var2.a;
        int i3 = path2.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
        c40Var2.j();
        c40Var2.k(i3);
        nvc nvcVar2 = list2.isEmpty() ? vuc.c : (nvc) list2.get(0);
        int size = list2.size();
        float f7 = MTTypesetterKt.kLineSkipLimitMultiplier;
        int i4 = 0;
        float fA5 = 0.0f;
        float fB3 = 0.0f;
        float f8 = 0.0f;
        float fB4 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        while (i4 < size) {
            nvc nvcVar3 = (nvc) list2.get(i4);
            if (nvcVar3 instanceof vuc) {
                path3.close();
                path = path3;
                i = size;
                f2 = f7;
                i2 = i4;
                nvcVar = nvcVar3;
                fA5 = f9;
                f8 = fA5;
                fB3 = f10;
            } else {
                if (nvcVar3 instanceof hvc) {
                    hvc hvcVar = (hvc) nvcVar3;
                    float fA6 = hvcVar.a() + f8;
                    float fB5 = hvcVar.b() + fB4;
                    path3.rMoveTo(hvcVar.a(), hvcVar.b());
                    path = path3;
                    f8 = fA6;
                    f9 = f8;
                    fB4 = fB5;
                    f10 = fB4;
                } else if (nvcVar3 instanceof zuc) {
                    zuc zucVar = (zuc) nvcVar3;
                    float f11 = zucVar.c;
                    float f12 = zucVar.d;
                    c40Var2.g(f11, f12);
                    fB4 = f12;
                    f10 = fB4;
                    path = path3;
                    f8 = f11;
                    f9 = f8;
                } else if (nvcVar3 instanceof gvc) {
                    gvc gvcVar = (gvc) nvcVar3;
                    path3.rLineTo(gvcVar.a(), gvcVar.b());
                    float fA7 = gvcVar.a() + f8;
                    fB4 = gvcVar.b() + fB4;
                    path = path3;
                    f8 = fA7;
                } else if (nvcVar3 instanceof yuc) {
                    yuc yucVar = (yuc) nvcVar3;
                    float f13 = yucVar.d;
                    float f14 = yucVar.c;
                    c40Var2.f(f14, f13);
                    f8 = f14;
                    path = path3;
                    fB4 = f13;
                } else {
                    if (nvcVar3 instanceof fvc) {
                        fvc fvcVar = (fvc) nvcVar3;
                        path3.rLineTo(fvcVar.a(), f7);
                        fA4 = fvcVar.a() + f8;
                    } else if (nvcVar3 instanceof xuc) {
                        fA4 = ((xuc) nvcVar3).c;
                        c40Var2.f(fA4, fB4);
                    } else {
                        if (nvcVar3 instanceof lvc) {
                            lvc lvcVar = (lvc) nvcVar3;
                            path3.rLineTo(f7, lvcVar.a());
                            fA3 = lvcVar.a() + fB4;
                        } else if (nvcVar3 instanceof mvc) {
                            fA3 = ((mvc) nvcVar3).c;
                            c40Var2.f(f8, fA3);
                        } else {
                            if (nvcVar3 instanceof evc) {
                                evc evcVar = (evc) nvcVar3;
                                path3.rCubicTo(evcVar.a(), evcVar.d(), evcVar.b(), evcVar.e(), evcVar.c(), evcVar.f());
                                Path path4 = path3;
                                float fB6 = evcVar.b() + f8;
                                float fE = evcVar.e() + fB4;
                                float fC3 = evcVar.c() + f8;
                                fB4 = evcVar.f() + fB4;
                                f8 = fC3;
                                path = path4;
                                i = size;
                                f2 = f7;
                                i2 = i4;
                                nvcVar = nvcVar3;
                                fB3 = fE;
                                fA5 = fB6;
                            } else {
                                Path path5 = path3;
                                if (nvcVar3 instanceof wuc) {
                                    wuc wucVar = (wuc) nvcVar3;
                                    c40Var2.d(wucVar.c, wucVar.d, wucVar.e, wucVar.f, wucVar.g, wucVar.h);
                                    fA = wucVar.e;
                                    fC2 = wucVar.f;
                                    fB2 = wucVar.g;
                                    fD3 = wucVar.h;
                                } else {
                                    if (nvcVar3 instanceof jvc) {
                                        if (nvcVar2.a) {
                                            f5 = f8 - fA5;
                                            f6 = fB4 - fB3;
                                        } else {
                                            f5 = f7;
                                            f6 = f5;
                                        }
                                        jvc jvcVar = (jvc) nvcVar3;
                                        path5.rCubicTo(f5, f6, jvcVar.a(), jvcVar.c(), jvcVar.b(), jvcVar.d());
                                        path5 = path5;
                                        fA2 = jvcVar.a() + f8;
                                        fC = jvcVar.c() + fB4;
                                        fB = jvcVar.b() + f8;
                                        fD2 = jvcVar.d();
                                    } else if (nvcVar3 instanceof bvc) {
                                        if (nvcVar2.a) {
                                            f8 = (f8 * 2.0f) - fA5;
                                            fB4 = (2.0f * fB4) - fB3;
                                        }
                                        bvc bvcVar = (bvc) nvcVar3;
                                        c40Var.d(f8, fB4, bvcVar.a(), bvcVar.c(), bvcVar.b(), bvcVar.d());
                                        fA = bvcVar.a();
                                        fC2 = bvcVar.c();
                                        fB2 = bvcVar.b();
                                        fD3 = bvcVar.d();
                                    } else if (nvcVar3 instanceof ivc) {
                                        ivc ivcVar = (ivc) nvcVar3;
                                        path5.rQuadTo(ivcVar.a(), ivcVar.c(), ivcVar.b(), ivcVar.d());
                                        fA2 = ivcVar.a() + f8;
                                        fC = ivcVar.c() + fB4;
                                        fB = ivcVar.b() + f8;
                                        fD2 = ivcVar.d();
                                    } else if (nvcVar3 instanceof avc) {
                                        avc avcVar = (avc) nvcVar3;
                                        path5.quadTo(avcVar.a(), avcVar.c(), avcVar.b(), avcVar.d());
                                        fA2 = avcVar.a();
                                        fC = avcVar.c();
                                        fB = avcVar.b();
                                        fD = avcVar.d();
                                        fB4 = fD;
                                        fB3 = fC;
                                        f8 = fB;
                                        path = path5;
                                        i = size;
                                        f2 = f7;
                                        i2 = i4;
                                        nvcVar = nvcVar3;
                                        fA5 = fA2;
                                    } else if (nvcVar3 instanceof kvc) {
                                        if (nvcVar2.b) {
                                            f3 = f8 - fA5;
                                            f4 = fB4 - fB3;
                                        } else {
                                            f3 = f7;
                                            f4 = f3;
                                        }
                                        kvc kvcVar = (kvc) nvcVar3;
                                        path5.rQuadTo(f3, f4, kvcVar.a(), kvcVar.b());
                                        fA = f3 + f8;
                                        float fA8 = kvcVar.a() + f8;
                                        fB3 = f4 + fB4;
                                        fB4 = kvcVar.b() + fB4;
                                        f8 = fA8;
                                        path = path5;
                                        i = size;
                                        f2 = f7;
                                        i2 = i4;
                                        nvcVar = nvcVar3;
                                        fA5 = fA;
                                    } else if (nvcVar3 instanceof cvc) {
                                        if (nvcVar2.b) {
                                            f8 = (f8 * 2.0f) - fA5;
                                            fB4 = (2.0f * fB4) - fB3;
                                        }
                                        cvc cvcVar = (cvc) nvcVar3;
                                        path5.quadTo(f8, fB4, cvcVar.a(), cvcVar.b());
                                        float fA9 = cvcVar.a();
                                        path = path5;
                                        i = size;
                                        f2 = f7;
                                        i2 = i4;
                                        fA5 = f8;
                                        fB3 = fB4;
                                        nvcVar = nvcVar3;
                                        fB4 = cvcVar.b();
                                        f8 = fA9;
                                    } else if (nvcVar3 instanceof dvc) {
                                        dvc dvcVar = (dvc) nvcVar3;
                                        float fA10 = dvcVar.a() + f8;
                                        float fB7 = dvcVar.b() + fB4;
                                        double dC = dvcVar.c();
                                        double dE = dvcVar.e();
                                        double d2 = dvcVar.d();
                                        boolean zF = dvcVar.f();
                                        boolean zG = dvcVar.g();
                                        f2 = MTTypesetterKt.kLineSkipLimitMultiplier;
                                        i = size;
                                        nvcVar = nvcVar3;
                                        path = path5;
                                        i2 = i4;
                                        C(c40Var, f8, fB4, fA10, fB7, dC, dE, d2, zF, zG);
                                        fA5 = fA10;
                                        f8 = fA5;
                                        fB3 = fB7;
                                    } else {
                                        path = path5;
                                        i = size;
                                        f2 = f7;
                                        i2 = i4;
                                        nvcVar = nvcVar3;
                                        if (!(nvcVar instanceof uuc)) {
                                            mr9.b();
                                            return null;
                                        }
                                        uuc uucVar = (uuc) nvcVar;
                                        C(c40Var, f8, fB4, uucVar.a(), uucVar.b(), uucVar.c(), uucVar.e(), uucVar.d(), uucVar.f(), uucVar.g());
                                        fA5 = uucVar.a();
                                        f8 = fA5;
                                        fB3 = uucVar.b();
                                    }
                                    fD = fD2 + fB4;
                                    fB4 = fD;
                                    fB3 = fC;
                                    f8 = fB;
                                    path = path5;
                                    i = size;
                                    f2 = f7;
                                    i2 = i4;
                                    nvcVar = nvcVar3;
                                    fA5 = fA2;
                                }
                                fB3 = fC2;
                                f8 = fB2;
                                fB4 = fD3;
                                path = path5;
                                i = size;
                                f2 = f7;
                                i2 = i4;
                                nvcVar = nvcVar3;
                                fA5 = fA;
                            }
                            i4 = i2 + 1;
                            c40Var2 = c40Var;
                            nvcVar2 = nvcVar;
                            size = i;
                            path3 = path;
                            f7 = f2;
                            list2 = list;
                        }
                        fB4 = fA3;
                        path = path3;
                    }
                    f8 = fA4;
                    path = path3;
                }
                i = size;
                f2 = f7;
                i2 = i4;
                nvcVar = nvcVar3;
                i4 = i2 + 1;
                c40Var2 = c40Var;
                nvcVar2 = nvcVar;
                size = i;
                path3 = path;
                f7 = f2;
                list2 = list;
            }
            fB4 = fB3;
            i4 = i2 + 1;
            c40Var2 = c40Var;
            nvcVar2 = nvcVar;
            size = i;
            path3 = path;
            f7 = f2;
            list2 = list;
        }
        return c40Var;
    }

    public static pwf k(pwf pwfVar) {
        lqa lqaVar = pwfVar.E;
        lqaVar.c();
        return lqaVar.M > 0 ? pwfVar : pwf.F;
    }

    public static int k0(Parcel parcel) {
        int i = parcel.readInt();
        int iC0 = c0(parcel, i);
        char c2 = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c2 != 20293) {
            throw new SafeParcelReader$ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i2 = iC0 + iDataPosition;
        if (i2 >= iDataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i2).length());
        sb.append("Size read is invalid start=");
        sb.append(iDataPosition);
        sb.append(" end=");
        sb.append(i2);
        throw new SafeParcelReader$ParseException(sb.toString(), parcel);
    }

    public static final lrb l(j7g j7gVar, yh3 yh3Var, int i) {
        if (yh3Var == null || nu6.f(yh3Var)) {
            return null;
        }
        int size = yh3Var.i0().size() + i;
        if (yh3Var.y()) {
            List listSubList = j7gVar.H().subList(i, size);
            bo5 bo5VarH = yh3Var.h();
            return new lrb(yh3Var, listSubList, l(j7gVar, bo5VarH instanceof yh3 ? (yh3) bo5VarH : null, size));
        }
        if (size != j7gVar.H().size()) {
            m06.o(yh3Var);
        }
        return new lrb(yh3Var, j7gVar.H().subList(i, j7gVar.H().size()), (lrb) null);
    }

    public static void l0(Parcel parcel, int i, int i2) {
        int iC0 = c0(parcel, i);
        if (iC0 == i2) {
            return;
        }
        String hexString = Integer.toHexString(iC0);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iC0).length() + 4 + 1);
        ij0.s(i2, iC0, "Expected size ", " got ", sb);
        throw new SafeParcelReader$ParseException(kgh.q(sb, " (0x", hexString, ")"), parcel);
    }

    public static final int m(float f2) {
        return Math.round((float) Math.ceil(f2));
    }

    public static void m0(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        String hexString = Integer.toHexString(i);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i).length() + 4 + 1);
        ij0.s(i2, i, "Expected size ", " got ", sb);
        throw new SafeParcelReader$ParseException(kgh.q(sb, " (0x", hexString, ")"), parcel);
    }

    public static final boolean n(jt7 jt7Var, boolean z) {
        int iOrdinal = jt7Var.u1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                jt7 jt7VarO = cok.o(jt7Var);
                if (!(jt7VarO != null ? n(jt7VarO, z) : true)) {
                    return false;
                }
                jt7Var.q1(ft7.F, ft7.G);
                return true;
            }
            if (iOrdinal == 2) {
                return z;
            }
            if (iOrdinal != 3) {
                mr9.b();
                return false;
            }
        }
        return true;
    }

    public static final void o(rag ragVar, ArrayList arrayList, int i) {
        boolean zL = ragVar.l(i);
        int[] iArr = ragVar.b;
        if (zL) {
            arrayList.add(ragVar.n(i));
            return;
        }
        int i2 = iArr[(i * 5) + 3] + i;
        for (int i3 = i + 1; i3 < i2; i3 += iArr[(i3 * 5) + 3]) {
            o(ragVar, arrayList, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7 A[Catch: all -> 0x00ec, TRY_LEAVE, TryCatch #2 {all -> 0x00ec, blocks: (B:43:0x00c1, B:45:0x00c7), top: B:65:0x00c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0117 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(defpackage.zmf r19, okio.FileSystem r20, defpackage.qo0 r21, okio.Path r22, boolean r23, defpackage.vd1 r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sf5.p(zmf, okio.FileSystem, qo0, okio.Path, boolean, vd1):java.lang.Object");
    }

    public static final List q(yh3 yh3Var) {
        List parameters;
        Object next;
        u9i u9iVarP;
        List listI0 = yh3Var.i0();
        listI0.getClass();
        if (!yh3Var.y() && !(yh3Var.h() instanceof c92)) {
            return listI0;
        }
        int i = o06.a;
        f06 f06Var = f06.H;
        List listE0 = bnf.e0(new rn7(bnf.V(new m4h(bnf.U(bnf.Z(f06Var, yh3Var), 1), pgg.O), pgg.P), pgg.Q, enf.E));
        Iterator it = bnf.U(bnf.Z(f06Var, yh3Var), 1).iterator();
        while (true) {
            parameters = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof qqb) {
                break;
            }
        }
        qqb qqbVar = (qqb) next;
        if (qqbVar != null && (u9iVarP = qqbVar.p()) != null) {
            parameters = u9iVarP.getParameters();
        }
        if (parameters == null) {
            parameters = lm6.E;
        }
        if (listE0.isEmpty() && parameters.isEmpty()) {
            List listI02 = yh3Var.i0();
            listI02.getClass();
            return listI02;
        }
        ArrayList<qai> arrayListA1 = w44.a1(listE0, parameters);
        ArrayList arrayList = new ArrayList(x44.y(arrayListA1, 10));
        for (qai qaiVar : arrayListA1) {
            qaiVar.getClass();
            arrayList.add(new mc2(qaiVar, yh3Var, listI0.size()));
        }
        return w44.a1(listI0, arrayList);
    }

    public static fab r(String str, Iterable iterable) {
        eab eabVar;
        pbg pbgVar = new pbg();
        Iterator it = iterable.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            eabVar = eab.b;
            if (!zHasNext) {
                break;
            }
            fab fabVar = (fab) it.next();
            if (fabVar != eabVar) {
                if (fabVar instanceof ug2) {
                    b54.u0(pbgVar, ((ug2) fabVar).c);
                } else {
                    pbgVar.add(fabVar);
                }
            }
        }
        int i = pbgVar.E;
        return i != 0 ? i != 1 ? new ug2(str, (fab[]) pbgVar.toArray(new fab[0])) : (fab) pbgVar.get(0) : eabVar;
    }

    public static Bundle s(Parcel parcel, int i) {
        int iC0 = c0(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iC0 == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iC0);
        return bundle;
    }

    public static byte[] t(Parcel parcel, int i) {
        int iC0 = c0(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iC0 == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iC0);
        return bArrCreateByteArray;
    }

    public static final hre u(Throwable th) {
        th.getClass();
        return new hre(th);
    }

    public static Parcelable v(Parcel parcel, int i, Parcelable.Creator creator) {
        int iC0 = c0(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iC0 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iC0);
        return parcelable;
    }

    public static String x(Parcel parcel, int i) {
        int iC0 = c0(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iC0 == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iC0);
        return string;
    }

    public static ArrayList y(Parcel parcel, int i) {
        int iC0 = c0(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iC0 == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iC0);
        return arrayListCreateStringArrayList;
    }

    public static Object[] z(Parcel parcel, int i, Parcelable.Creator creator) {
        int iC0 = c0(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iC0 == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iC0);
        return objArrCreateTypedArray;
    }

    public void I(lze lzeVar, Object obj) {
        lzeVar.getClass();
        if (obj == null) {
            return;
        }
        tze tzeVarL0 = lzeVar.L0(w());
        try {
            j(tzeVarL0, obj);
            tzeVarL0.H0();
            csg.o(tzeVarL0, null);
            v40.C(lzeVar);
        } finally {
        }
    }

    public abstract void j(tze tzeVar, Object obj);

    public abstract String w();
}
