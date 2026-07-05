package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import androidx.concurrent.futures.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.pvporbit.freetype.FreeTypeConstants;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public abstract class nai {
    public static Boolean A;
    public static Boolean B;
    public static Boolean C;
    public static final ta4 a;
    public static final ta4 b;
    public static final ta4 c;
    public static final ta4 d;
    public static final ta4 e;
    public static final fz5 f;
    public static final am4 g;
    public static final mrg h;
    public static final mrg i;
    public static final mrg j;
    public static final mrg k;
    public static final mrg l;
    public static final mrg m;
    public static final mrg n;
    public static final mrg o;
    public static final mrg p;
    public static final mrg q;
    public static final mrg r;
    public static final mrg s;
    public static final mrg t;
    public static final mrg u;
    public static final mrg v;
    public static final mrg w;
    public static final mrg x;
    public static final yeg y;
    public static Boolean z;

    static {
        new ta4(2094288676, false, new s03(26));
        a = new ta4(-1342205566, false, new xe3(3));
        b = new ta4(-684072357, false, new s03(27));
        c = new ta4(2136598717, false, new xe3(4));
        new ta4(-229000834, false, new s03(23));
        new ta4(-1276513184, false, new xe3(2));
        d = new ta4(-2101264077, false, new s03(24));
        e = new ta4(37575796, false, new s03(25));
        f = new fz5(1.0f, 1.0f);
        g = new am4(10);
        h = new mrg("networking_base");
        i = new mrg("cronet_client");
        j = new mrg("externalImageLoader");
        k = new mrg("networking_base_url");
        l = new mrg("api_ws_base_url");
        m = new mrg("user_content_url");
        n = new mrg("mcp_sandbox_url");
        o = new mrg("web_view_sandbox_url");
        p = new mrg("mcp_app_runtime_url");
        q = new mrg("bell_mode_qualifier");
        r = new mrg("global_bootstrap_api");
        s = new mrg("mobile_service_client");
        t = new mrg("mobile_service_base_url");
        u = new mrg("privacy_policy_url");
        v = new mrg("consumer_terms_url");
        w = new mrg("web_billing_url");
        x = new mrg("wire_moshi");
        y = new yeg(28);
    }

    public static final cu9 A(cu9 cu9Var) {
        cu9 cu9Var2;
        cu9 cu9VarA = cu9Var.A();
        while (true) {
            cu9 cu9Var3 = cu9VarA;
            cu9Var2 = cu9Var;
            cu9Var = cu9Var3;
            if (cu9Var == null) {
                break;
            }
            cu9VarA = cu9Var.A();
        }
        m5c m5cVar = cu9Var2 instanceof m5c ? (m5c) cu9Var2 : null;
        if (m5cVar == null) {
            return cu9Var2;
        }
        m5c m5cVar2 = m5cVar.W;
        while (true) {
            m5c m5cVar3 = m5cVar2;
            m5c m5cVar4 = m5cVar;
            m5cVar = m5cVar3;
            if (m5cVar == null) {
                return m5cVar4;
            }
            m5cVar2 = m5cVar.W;
        }
    }

    public static fa B(qh9 qh9Var) {
        try {
            Number numberL = qh9Var.s("session_sample_rate").l();
            bh9 bh9VarS = qh9Var.s("session_replay_sample_rate");
            Number numberL2 = bh9VarS != null ? bh9VarS.l() : null;
            bh9 bh9VarS2 = qh9Var.s("profiling_sample_rate");
            Number numberL3 = bh9VarS2 != null ? bh9VarS2.l() : null;
            bh9 bh9VarS3 = qh9Var.s("trace_sample_rate");
            Number numberL4 = bh9VarS3 != null ? bh9VarS3.l() : null;
            numberL.getClass();
            return new fa(numberL, numberL2, numberL3, numberL4);
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Configuration", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Configuration", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Configuration", e4);
            return null;
        }
    }

    public static a45 C(a45 a45Var, b45 b45Var) {
        b45Var.getClass();
        if (x44.r(a45Var.getKey(), b45Var)) {
            return a45Var;
        }
        return null;
    }

    public static p8b D(String str) {
        str.getClass();
        ova ovaVarD = p8b.e.d(0, str);
        if (ovaVarD == null) {
            sz6.p(grc.n('\"', "No subtype found for: \"", str));
            return null;
        }
        String str2 = (String) ((mva) ovaVarD.a()).get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = ((String) ((mva) ovaVarD.a()).get(2)).toLowerCase(locale);
        lowerCase2.getClass();
        ArrayList arrayList = new ArrayList();
        int i2 = ovaVarD.b().F;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= str.length()) {
                return new p8b(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            ova ovaVarD2 = p8b.f.d(i3, str);
            if (ovaVarD2 == null) {
                throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(i3) + "\" for: \"" + str + '\"').toString());
            }
            nva nvaVar = ovaVarD2.c;
            hva hvaVarA = nvaVar.a(1);
            String str3 = hvaVarA != null ? hvaVarA.a : null;
            if (str3 == null) {
                i2 = ovaVarD2.b().F;
            } else {
                hva hvaVarA2 = nvaVar.a(2);
                String strJ = hvaVarA2 != null ? hvaVarA2.a : null;
                if (strJ == null) {
                    hva hvaVarA3 = nvaVar.a(3);
                    hvaVarA3.getClass();
                    strJ = hvaVarA3.a;
                } else if (bsg.a1(strJ, '\'') && bsg.z0(strJ, '\'') && strJ.length() > 2) {
                    strJ = vb7.j(1, 1, strJ);
                }
                arrayList.add(str3);
                arrayList.add(strJ);
                i2 = ovaVarD2.b().F;
            }
        }
    }

    public static final lff H(Object obj) {
        if (obj != ff4.a) {
            return (lff) obj;
        }
        sz6.j("Does not contain segment");
        return null;
    }

    public static final String I(oe4 oe4Var, int i2) {
        yb5.o(oe4Var, w00.a);
        return ((Context) yb5.o(oe4Var, w00.b)).getResources().getString(i2);
    }

    public static final String J(oe4 oe4Var, int i2, Object... objArr) {
        String strI = I(oe4Var, i2);
        Locale locale = ((Configuration) yb5.o(oe4Var, w00.a)).getLocales().get(0);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, strI, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static int K(int i2, int i3) {
        if (i2 > -12 || i3 > -65) {
            return -1;
        }
        return i2 ^ (i3 << 8);
    }

    public static int L(byte[] bArr, int i2, int i3) {
        byte b2 = bArr[i2 - 1];
        int i4 = i3 - i2;
        if (i4 == 0) {
            if (b2 > -12) {
                return -1;
            }
            return b2;
        }
        if (i4 == 1) {
            return K(b2, bArr[i2]);
        }
        if (i4 != 2) {
            mr9.u();
            return 0;
        }
        byte b3 = bArr[i2];
        byte b4 = bArr[i2 + 1];
        if (b2 > -12 || b3 > -65 || b4 > -65) {
            return -1;
        }
        return (b4 << 16) ^ ((b3 << 8) ^ b2);
    }

    public static final boolean M(Object obj) {
        return obj == ff4.a;
    }

    public static boolean N(int i2, Object obj) {
        if (obj instanceof qz7) {
            if ((obj instanceof a08 ? ((a08) obj).getArity() : obj instanceof zy7 ? 0 : obj instanceof bz7 ? 1 : obj instanceof pz7 ? 2 : obj instanceof rz7 ? 3 : obj instanceof sz7 ? 4 : obj instanceof tz7 ? 5 : obj instanceof uz7 ? 6 : obj instanceof vz7 ? 7 : obj instanceof wz7 ? 8 : obj instanceof xz7 ? 9 : obj instanceof az7 ? 10 : obj instanceof cz7 ? 11 : obj instanceof dz7 ? 12 : obj instanceof ez7 ? 13 : obj instanceof fz7 ? 14 : obj instanceof gz7 ? 15 : obj instanceof hz7 ? 16 : obj instanceof iz7 ? 17 : obj instanceof jz7 ? 18 : obj instanceof kz7 ? 19 : obj instanceof mz7 ? 20 : obj instanceof nz7 ? 21 : obj instanceof oz7 ? 22 : -1) == i2) {
                return true;
            }
        }
        return false;
    }

    public static boolean P(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (z == null) {
            z = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        z.booleanValue();
        if (A == null) {
            A = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return A.booleanValue() && Build.VERSION.SDK_INT >= 30;
    }

    public static byte[] Q(Collection collection, byte[] bArr, h99 h99Var) {
        int size;
        byte[] bArr2 = new byte[0];
        byte[] bArr3 = new byte[0];
        bArr.getClass();
        h99Var.getClass();
        Collection collection2 = collection;
        Iterator it = collection2.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += ((byte[]) it.next()).length;
        }
        if (collection.isEmpty()) {
            size = 0;
        } else {
            size = (collection.size() - 1) * bArr.length;
        }
        byte[] bArr4 = new byte[bArr2.length + length + size + bArr3.length];
        s(bArr2, bArr4, 0, bArr2.length, h99Var);
        int length2 = bArr2.length;
        Iterator it2 = w44.u1(collection2).iterator();
        while (true) {
            f2 f2Var = (f2) it2;
            if (!((Iterator) f2Var.G).hasNext()) {
                s(bArr3, bArr4, length2, bArr3.length, h99Var);
                return bArr4;
            }
            b19 b19Var = (b19) f2Var.next();
            Object obj = b19Var.b;
            byte[] bArr5 = (byte[]) obj;
            s(bArr5, bArr4, length2, bArr5.length, h99Var);
            length2 += ((byte[]) obj).length;
            if (b19Var.a != collection.size() - 1) {
                s(bArr, bArr4, length2, bArr.length, h99Var);
                length2 += bArr.length;
            }
        }
    }

    public static final n78 R(zp3 zp3Var, String str, Executor executor, zy7 zy7Var) {
        iei ieiVar = iei.a;
        zp3Var.getClass();
        executor.getClass();
        bvb bvbVar = new bvb(0);
        b bVar = new b();
        bVar.c = new dne();
        o92 o92Var = new o92(bVar);
        bVar.b = o92Var;
        bVar.a = sq6.class;
        try {
            executor.execute(new lg1(zp3Var, str, zy7Var, bvbVar, bVar));
            bVar.a = ieiVar;
        } catch (Exception e2) {
            o92Var.F.l(e2);
        }
        return new n78(bvbVar, o92Var);
    }

    public static int S(int i2, int... iArr) {
        for (int i3 : iArr) {
            i2 = Math.max(i2, i3);
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.p5b T(defpackage.xwe r25, int r26, int r27, int r28, int r29, int r30, defpackage.q5b r31, java.util.List r32, defpackage.c3d[] r33, int r34, int r35, int[] r36, int r37) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nai.T(xwe, int, int, int, int, int, q5b, java.util.List, c3d[], int, int, int[], int):p5b");
    }

    public static float U(float f2, float... fArr) {
        for (float f3 : fArr) {
            f2 = Math.min(f2, f3);
        }
        return f2;
    }

    public static Comparable V(Comparable comparable, Comparable comparable2) {
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2) <= 0 ? comparable : comparable2;
    }

    public static c45 W(a45 a45Var, b45 b45Var) {
        b45Var.getClass();
        return x44.r(a45Var.getKey(), b45Var) ? im6.E : a45Var;
    }

    public static List X(vag vagVar, int i2, vag vagVar2, boolean z2, boolean z3, boolean z4) {
        List list;
        boolean z5;
        int i3;
        int i4;
        int iU = vagVar.u(i2);
        int i5 = i2 + iU;
        int iF = vagVar.f(i2);
        int iF2 = vagVar.f(i5);
        int i6 = iF2 - iF;
        boolean z6 = i2 >= 0 && (vagVar.b[(vagVar.r(i2) * 5) + 1] & 201326592) != 0;
        vagVar2.w(iU);
        vagVar2.x(i6, vagVar2.t);
        if (vagVar.g < i5) {
            vagVar.B(i5);
        }
        if (vagVar.k < iF2) {
            vagVar.C(iF2, i5);
        }
        int[] iArr = vagVar2.b;
        int i7 = vagVar2.t;
        int i8 = i7 * 5;
        mp0.r0(i8, i2 * 5, i5 * 5, vagVar.b, iArr);
        Object[] objArr = vagVar2.c;
        int i9 = vagVar2.i;
        System.arraycopy(vagVar.c, iF, objArr, i9, i6);
        int i10 = vagVar2.v;
        iArr[i8 + 2] = i10;
        int i11 = i7 - i2;
        int i12 = i7 + iU;
        int iG = i9 - vagVar2.g(i7, iArr);
        int i13 = vagVar2.m;
        int i14 = vagVar2.l;
        int length = objArr.length;
        boolean z7 = z6;
        int i15 = i13;
        int i16 = i7;
        while (i16 < i12) {
            if (i16 != i7) {
                int i17 = (i16 * 5) + 2;
                iArr[i17] = iArr[i17] + i11;
            }
            int[] iArr2 = iArr;
            int iG2 = vagVar2.g(i16, iArr) + iG;
            if (i15 < i16) {
                i3 = i7;
                i4 = 0;
            } else {
                i3 = i7;
                i4 = vagVar2.k;
            }
            iArr2[(i16 * 5) + 4] = vag.i(iG2, i4, i14, length);
            if (i16 == i15) {
                i15++;
            }
            i16++;
            i7 = i3;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        vagVar2.m = i15;
        int iA = uag.a(vagVar.d, i2, vagVar.p());
        int iA2 = uag.a(vagVar.d, i5, vagVar.p());
        if (iA < iA2) {
            ArrayList arrayList = vagVar.d;
            ArrayList arrayList2 = new ArrayList(iA2 - iA);
            for (int i18 = iA; i18 < iA2; i18++) {
                y08 y08Var = (y08) arrayList.get(i18);
                y08Var.a += i11;
                arrayList2.add(y08Var);
            }
            vagVar2.d.addAll(uag.a(vagVar2.d, vagVar2.t, vagVar2.p()), arrayList2);
            arrayList.subList(iA, iA2).clear();
            list = arrayList2;
        } else {
            list = lm6.E;
        }
        List list2 = list;
        if (!list2.isEmpty()) {
            HashMap map = vagVar.e;
            HashMap map2 = vagVar2.e;
            if (map != null && map2 != null) {
                int size = list2.size();
                for (int i19 = 0; i19 < size; i19++) {
                }
            }
        }
        int i20 = vagVar2.v;
        vagVar2.O(i10);
        int iE = vagVar.E(i2, vagVar.b);
        if (!z4) {
            z5 = false;
        } else if (z2) {
            boolean z8 = iE >= 0;
            if (z8) {
                vagVar.P();
                vagVar.a(iE - vagVar.t);
                vagVar.P();
            }
            vagVar.a(i2 - vagVar.t);
            boolean zH = vagVar.H();
            if (z8) {
                vagVar.M();
                vagVar.j();
                vagVar.M();
                vagVar.j();
            }
            z5 = zH;
        } else {
            boolean zI = vagVar.I(i2, iU);
            vagVar.J(iF, i6, i2 - 1);
            z5 = zI;
        }
        if (z5) {
            pd4.a("Unexpectedly removed anchors");
        }
        int i21 = vagVar2.o;
        int i22 = iArr3[i8 + 1];
        vagVar2.o = i21 + ((1073741824 & i22) != 0 ? 1 : i22 & 67108863);
        if (z3) {
            vagVar2.t = i12;
            vagVar2.i = i9 + i6;
        }
        if (z7) {
            vagVar2.T(i10);
        }
        return list;
    }

    public static int Y(byte[] bArr, int i2, int i3) {
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return 0;
        }
        while (i2 < i3) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                i2 = i4;
            } else if (b2 < -32) {
                if (i4 >= i3) {
                    return b2;
                }
                if (b2 < -62) {
                    return -1;
                }
                i2 += 2;
                if (bArr[i4] > -65) {
                    return -1;
                }
            } else if (b2 < -16) {
                if (i4 >= i3 - 1) {
                    return L(bArr, i4, i3);
                }
                int i5 = i2 + 2;
                byte b3 = bArr[i4];
                if (b3 > -65) {
                    return -1;
                }
                if (b2 == -32 && b3 < -96) {
                    return -1;
                }
                if (b2 == -19 && b3 >= -96) {
                    return -1;
                }
                i2 += 3;
                if (bArr[i5] > -65) {
                    return -1;
                }
            } else {
                if (i4 >= i3 - 2) {
                    return L(bArr, i4, i3);
                }
                int i6 = i2 + 2;
                byte b4 = bArr[i4];
                if (b4 > -65) {
                    return -1;
                }
                if ((((b4 + 112) + (b2 << 28)) >> 30) != 0) {
                    return -1;
                }
                int i7 = i2 + 3;
                if (bArr[i6] > -65) {
                    return -1;
                }
                i2 += 4;
                if (bArr[i7] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }

    public static c45 Z(a45 a45Var, c45 c45Var) {
        c45Var.getClass();
        return c45Var == im6.E ? a45Var : (c45) c45Var.K(new z35(0), a45Var);
    }

    public static final void a(int i2, int i3, ld4 ld4Var, zy7 zy7Var, boolean z2) {
        boolean z3;
        int i4;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-361453782);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            z3 = z2;
        } else if ((i2 & 6) == 0) {
            z3 = z2;
            i4 = (e18Var.g(z3) ? 4 : 2) | i2;
        } else {
            z3 = z2;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        int i6 = 0;
        int i7 = 1;
        if (e18Var.Q(i4 & 1, (i4 & 19) != 18)) {
            if (i5 != 0) {
                z3 = true;
            }
            Object objA = uda.a(e18Var);
            if (objA == null) {
                e18Var.a0(535274673);
                objA = vda.a(e18Var);
            } else {
                e18Var.a0(535271790);
            }
            e18Var.p(false);
            if (objA == null) {
                sz6.j("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zF = e18Var.f(objA);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                izb izbVar = objA instanceof izb ? (izb) objA : null;
                dpf dpfVarB = izbVar != null ? izbVar.b() : null;
                xdc xdcVar = objA instanceof xdc ? (xdc) objA : null;
                objN = new fb1(dpfVarB, xdcVar != null ? xdcVar.c() : null);
                e18Var.k0(objN);
            }
            fb1 fb1Var = (fb1) objN;
            long j2 = e18Var.T;
            boolean zF2 = e18Var.f(fb1Var) | e18Var.e(j2);
            Object objN2 = e18Var.N();
            Object obj = objN2;
            if (zF2 || objN2 == lz1Var) {
                nc4 nc4Var = new nc4(new gb1(objA, j2));
                nc4Var.c = new oob(19);
                e18Var.k0(nc4Var);
                obj = nc4Var;
            }
            nc4 nc4Var2 = (nc4) obj;
            e18Var.a0(-585307852);
            boolean zH = e18Var.h(nc4Var2) | ((i4 & 112) == 32);
            Object objN3 = e18Var.N();
            if (zH || objN3 == lz1Var) {
                objN3 = new l80(nc4Var2, 3, zy7Var);
                e18Var.k0(objN3);
            }
            fd9.s((zy7) objN3, e18Var);
            Boolean boolValueOf = Boolean.valueOf(z3);
            int i8 = i4 & 14;
            boolean zH2 = e18Var.h(nc4Var2) | (i8 == 4);
            Object objN4 = e18Var.N();
            if (zH2 || objN4 == lz1Var) {
                objN4 = new hb1(nc4Var2, z3, i6);
                e18Var.k0(objN4);
            }
            mwa.i(boolValueOf, nc4Var2, null, (bz7) objN4, e18Var, i8);
            boolean zH3 = e18Var.h(fb1Var) | e18Var.h(nc4Var2);
            Object objN5 = e18Var.N();
            if (zH3 || objN5 == lz1Var) {
                objN5 = new o5(fb1Var, i7, nc4Var2);
                e18Var.k0(objN5);
            }
            fd9.e(fb1Var, nc4Var2, (bz7) objN5, e18Var);
            e18Var.p(false);
        } else {
            e18Var.T();
        }
        boolean z4 = z3;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ib1(i2, i3, 0, zy7Var, z4);
        }
    }

    public static final a6i a0(rok rokVar, String str, ld4 ld4Var, int i2, int i3) {
        tp4 tp4Var = null;
        if ((i3 & 2) != 0) {
            str = null;
        }
        int i4 = (i2 & 14) ^ 6;
        boolean z2 = true;
        int i5 = 4;
        int i6 = 0;
        boolean z3 = (i4 > 4 && ((e18) ld4Var).f(rokVar)) || (i2 & 6) == 4;
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        Object obj = jd4.a;
        if (z3 || objN == obj) {
            rcg rcgVarZ = fd9.Z();
            bz7 bz7VarE = rcgVarZ != null ? rcgVarZ.e() : null;
            rcg rcgVarK0 = fd9.k0(rcgVarZ);
            try {
                Object a6iVar = new a6i(rokVar, null, str);
                fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
                e18Var.k0(a6iVar);
                objN = a6iVar;
            } catch (Throwable th) {
                fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
                throw th;
            }
        }
        a6i a6iVar2 = (a6i) objN;
        if (rokVar instanceof gff) {
            e18Var.a0(-1357590553);
            Object objN2 = e18Var.N();
            if (objN2 == obj) {
                objN2 = fd9.O(im6.E, e18Var);
                e18Var.k0(objN2);
            }
            Object obj2 = (l45) objN2;
            boolean zH = e18Var.h(obj2) | ((i4 > 4 && e18Var.f(rokVar)) || (i2 & 6) == 4);
            Object objN3 = e18Var.N();
            if (zH || objN3 == obj) {
                objN3 = new e6f(rokVar, 10, obj2);
                e18Var.k0(objN3);
            }
            fd9.d(obj2, (bz7) objN3, e18Var);
            gff gffVar = (gff) rokVar;
            Object value = gffVar.G.getValue();
            Object value2 = gffVar.F.getValue();
            if ((i4 <= 4 || !e18Var.f(rokVar)) && (i2 & 6) != 4) {
                z2 = false;
            }
            Object objN4 = e18Var.N();
            if (z2 || objN4 == obj) {
                objN4 = new wmf(rokVar, tp4Var, i5);
                e18Var.k0(objN4);
            }
            fd9.j(value, value2, (pz7) objN4, e18Var);
            e18Var.p(false);
        } else {
            e18Var.a0(-1356604288);
            a6iVar2.a(rokVar.t0(), e18Var, 0);
            e18Var.p(false);
        }
        boolean zF = e18Var.f(a6iVar2);
        Object objN5 = e18Var.N();
        if (zF || objN5 == obj) {
            objN5 = new c6i(a6iVar2, i6);
            e18Var.k0(objN5);
        }
        fd9.d(a6iVar2, (bz7) objN5, e18Var);
        return a6iVar2;
    }

    public static final void b(boolean z2, boolean z3, iqb iqbVar, ld4 ld4Var, int i2) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1243391027);
        int i3 = (e18Var.g(z2) ? 4 : 2) | i2 | (e18Var.g(z3) ? 32 : 16) | (e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            vo1 vo1Var = lja.T;
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new it2(13);
                e18Var.k0(objN);
            }
            iqb iqbVarB = tjf.b(iqbVar, true, (bz7) objN);
            q64 q64VarA = p64.a(ko0.e, vo1Var, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarB);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            bpc bpcVarA = a.a(ud0.r0, e18Var);
            hr1 hr1Var = new hr1(gm3.a(e18Var).M, 5);
            fqb fqbVar = fqb.E;
            xn5.N(bpcVarA, null, androidx.compose.foundation.layout.b.o(fqbVar, 43.0f), null, null, MTTypesetterKt.kLineSkipLimitMultiplier, hr1Var, e18Var, 440, 56);
            kxk.g(e18Var, androidx.compose.foundation.layout.b.e(fqbVar, 11.0f));
            tjh.c(zrk.j(z2 ? R.string.ghost_mode_message_free : z3 ? R.string.ghost_mode_message_raven : R.string.ghost_mode_message, x44.W(z2 ? "https://privacy.claude.com/articles/10023580" : tyg.HOW_MEMORY_WORKS.a()), new ekh(new egg(gm3.a(e18Var).O, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), null, null, null), new CharSequence[0], e18Var, 0, 0), null, gm3.a(e18Var).O, 0L, 0L, new fdh(3), 0L, 0, false, 0, 0, null, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 261114);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new w93(z2, z3, iqbVar, i2);
        }
    }

    public static void b0(String str, Object obj) {
        ClassCastException classCastException = new ClassCastException(ij0.C(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        x44.k0(classCastException, nai.class.getName());
        throw classCastException;
    }

    public static final void c(lc3 lc3Var, zb0 zb0Var, iqb iqbVar, ld4 ld4Var, int i2) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1465965589);
        int i3 = i2 | (e18Var2.f(lc3Var) ? 4 : 2) | (e18Var2.f(zb0Var) ? 32 : 16);
        if (e18Var2.Q(i3 & 1, (i3 & 147) != 146)) {
            vo1 vo1Var = lja.T;
            Object objN = e18Var2.N();
            if (objN == jd4.a) {
                objN = new a73(8);
                e18Var2.k0(objN);
            }
            iqb iqbVarB = tjf.b(iqbVar, true, (bz7) objN);
            q64 q64VarA = p64.a(ko0.e, vo1Var, e18Var2, 54);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarB);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, q64VarA);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            j8.c(e3g.b.a((ia0) e18Var2.j(z23.a)), fd9.q0(-2111575221, new a21(3, lc3Var), e18Var2), e18Var2, 48);
            kxk.g(e18Var2, androidx.compose.foundation.layout.b.e(fqb.E, 11.0f));
            tjh.c(zb0Var, null, 0L, 0L, 0L, new fdh(3), 0L, 2, false, 4, 0, null, null, ((jm3) gm3.c(e18Var2).e.E).a, e18Var2, (i3 >> 3) & 14, 24960, 240638);
            e18Var = e18Var2;
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new m63(lc3Var, i2, zb0Var, iqbVar, 2);
        }
    }

    public static final a6i c0(Object obj, String str, ld4 ld4Var, int i2, int i3) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (objN == lz1Var) {
            objN = new a6i(new swb(obj), null, str);
            e18Var.k0(objN);
        }
        a6i a6iVar = (a6i) objN;
        a6iVar.a(obj, e18Var, (i2 & 8) | 48 | (i2 & 14));
        Object objN2 = e18Var.N();
        if (objN2 == lz1Var) {
            objN2 = new c6i(a6iVar, 1);
            e18Var.k0(objN2);
        }
        fd9.d(a6iVar, (bz7) objN2, e18Var);
        return a6iVar;
    }

    public static final void d(final lc3 lc3Var, final Date date, final String str, final String str2, final boolean z2, final boolean z3, final List list, final bz7 bz7Var, final boolean z4, final boolean z5, final boolean z6, final iqb iqbVar, ld4 ld4Var, final int i2) {
        lc3Var.getClass();
        date.getClass();
        list.getClass();
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(986439372);
        int i3 = i2 | (e18Var.f(lc3Var) ? 4 : 2) | (e18Var.h(date) ? 32 : 16) | (e18Var.f(str) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.f(str2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.g(z2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.g(z3) ? 131072 : 65536) | (e18Var.f(list) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var.h(bz7Var) ? 8388608 : 4194304) | (e18Var.g(z4) ? 67108864 : 33554432) | (e18Var.g(z5) ? 536870912 : 268435456);
        if (e18Var.Q(i3 & 1, ((306783379 & i3) == 306783378 && (((e18Var.g(z6) ? (char) 4 : (char) 2) | '0') & 19) == 18) ? false : true)) {
            final boolean zEquals = dbj.a(e18Var).a.a().equals(rbj.b);
            knk.e(Boolean.valueOf(z4), null, kxk.N(300, 0, null, 6), "HeadlineCrossfade", fd9.q0(-1974433141, new rz7() { // from class: s93
                @Override // defpackage.rz7
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    ld4 ld4Var2 = (ld4) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((e18) ld4Var2).g(zBooleanValue) ? 4 : 2;
                    }
                    e18 e18Var2 = (e18) ld4Var2;
                    if (e18Var2.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        iqb iqbVar2 = iqbVar;
                        if (zBooleanValue) {
                            e18Var2.a0(-760527087);
                            nai.b(z6, z5, gb9.L(iqbVar2, 28.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), e18Var2, 0);
                            e18Var2.p(false);
                        } else {
                            e18Var2.a0(-760277599);
                            final lc3 lc3Var2 = lc3Var;
                            final Date date2 = date;
                            final String str3 = str;
                            final String str4 = str2;
                            final boolean z7 = z2;
                            final List list2 = list;
                            final boolean z8 = zEquals;
                            final boolean z9 = z3;
                            final bz7 bz7Var2 = bz7Var;
                            xn5.H(iqbVar2, null, false, fd9.q0(1182616325, new rz7() { // from class: u93
                                @Override // defpackage.rz7
                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                    zb0 zb0Var;
                                    String str5;
                                    yzc yzcVar;
                                    yzc yzcVar2;
                                    vzc vzcVar;
                                    String str6;
                                    boolean z10;
                                    String strN;
                                    int i4;
                                    qw1 qw1Var = (qw1) obj4;
                                    ld4 ld4Var3 = (ld4) obj5;
                                    int iIntValue2 = ((Integer) obj6).intValue();
                                    qw1Var.getClass();
                                    if ((iIntValue2 & 6) == 0) {
                                        iIntValue2 |= ((e18) ld4Var3).f(qw1Var) ? 4 : 2;
                                    }
                                    e18 e18Var3 = (e18) ld4Var3;
                                    if (e18Var3.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                        vo1 vo1Var = lja.T;
                                        fqb fqbVar = fqb.E;
                                        iqb iqbVarG = androidx.compose.foundation.layout.b.g(mpk.b0(androidx.compose.foundation.layout.b.c(fqbVar, 1.0f), mpk.Y(e18Var3), true), qw1Var.b(), MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                                        q64 q64VarA = p64.a(ko0.e, vo1Var, e18Var3, 54);
                                        int iHashCode = Long.hashCode(e18Var3.T);
                                        hyc hycVarL = e18Var3.l();
                                        iqb iqbVarE = kxk.E(e18Var3, iqbVarG);
                                        dd4.e.getClass();
                                        re4 re4Var = cd4.b;
                                        e18Var3.e0();
                                        if (e18Var3.S) {
                                            e18Var3.k(re4Var);
                                        } else {
                                            e18Var3.n0();
                                        }
                                        d4c.i0(e18Var3, cd4.f, q64VarA);
                                        d4c.i0(e18Var3, cd4.e, hycVarL);
                                        d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode));
                                        d4c.h0(e18Var3, cd4.h);
                                        d4c.i0(e18Var3, cd4.d, iqbVarE);
                                        e18Var3.a0(569039710);
                                        String str7 = str3;
                                        if (str7 != null) {
                                            e18Var3.a0(26272617);
                                            zb0Var = zrk.k(R.string.chat_headline_project, new CharSequence[]{str7}, e18Var3);
                                            e18Var3.p(false);
                                            e18Var3.p(false);
                                        } else {
                                            e18Var3.a0(26360068);
                                            e18Var3.p(false);
                                            Date date3 = date2;
                                            date3.getClass();
                                            Configuration configuration = (Configuration) e18Var3.j(w00.a);
                                            boolean zF = e18Var3.f(configuration);
                                            Object objN = e18Var3.N();
                                            lz1 lz1Var = jd4.a;
                                            if (zF || objN == lz1Var) {
                                                LocaleList locales = configuration.getLocales();
                                                locales.getClass();
                                                objN = (Locale) w44.L0(mpk.f0(locales));
                                                e18Var3.k0(objN);
                                            }
                                            Locale locale = (Locale) objN;
                                            String str8 = str4;
                                            String string = str8 != null ? bsg.k1(str8).toString() : null;
                                            if (string == null) {
                                                string = "";
                                            }
                                            boolean z11 = z7;
                                            boolean zG = e18Var3.g(z11) | e18Var3.f(date3) | e18Var3.f(string) | e18Var3.f(locale);
                                            Object objN2 = e18Var3.N();
                                            if (zG || objN2 == lz1Var) {
                                                Calendar calendar = Calendar.getInstance(locale);
                                                calendar.setTime(date3);
                                                int i5 = calendar.get(11);
                                                List list3 = yzc.e;
                                                xzc xzcVarY = gb9.Y(i5);
                                                if (z11) {
                                                    String str9 = string.length() == 0 ? null : string;
                                                    List list4 = yzc.e;
                                                    locale.getClass();
                                                    list4.getClass();
                                                    boolean z12 = str9 == null || bsg.I0(str9);
                                                    Calendar calendar2 = Calendar.getInstance(locale);
                                                    calendar2.setTime(date3);
                                                    xzc xzcVarY2 = gb9.Y(calendar2.get(11));
                                                    switch (calendar2.get(7)) {
                                                        case 1:
                                                            vzcVar = vzc.E;
                                                            break;
                                                        case 2:
                                                            vzcVar = vzc.F;
                                                            break;
                                                        case 3:
                                                            vzcVar = vzc.G;
                                                            break;
                                                        case 4:
                                                            vzcVar = vzc.H;
                                                            break;
                                                        case 5:
                                                            vzcVar = vzc.I;
                                                            break;
                                                        case 6:
                                                            vzcVar = vzc.J;
                                                            break;
                                                        default:
                                                            vzcVar = vzc.K;
                                                            break;
                                                    }
                                                    yzcVar = null;
                                                    ArrayList arrayList = new ArrayList();
                                                    for (Object obj7 : list4) {
                                                        yzc yzcVar3 = (yzc) obj7;
                                                        Set set = yzcVar3.c;
                                                        Set set2 = yzcVar3.b;
                                                        int iOrdinal = yzcVar3.d.ordinal();
                                                        if (iOrdinal != 0) {
                                                            str6 = string;
                                                            if (iOrdinal != 1) {
                                                                if (iOrdinal != 2) {
                                                                    mr9.b();
                                                                    return null;
                                                                }
                                                            } else if (!z12) {
                                                            }
                                                            if ((set2.isEmpty() || set2.contains(xzcVarY2)) && (set.isEmpty() || set.contains(vzcVar))) {
                                                                arrayList.add(obj7);
                                                            }
                                                        } else {
                                                            str6 = string;
                                                            if (!z12) {
                                                                if (set2.isEmpty()) {
                                                                    arrayList.add(obj7);
                                                                } else {
                                                                    arrayList.add(obj7);
                                                                }
                                                            }
                                                        }
                                                        string = str6;
                                                    }
                                                    str5 = string;
                                                    if (!arrayList.isEmpty()) {
                                                        String str10 = !z12 ? "with_name" : "no_name";
                                                        int i6 = calendar2.get(1);
                                                        int i7 = calendar2.get(2) + 1;
                                                        int i8 = calendar2.get(5);
                                                        String strName = xzcVarY2.name();
                                                        yzcVar2 = (yzc) arrayList.get((int) (Math.abs((i6 + "-" + i7 + "-" + i8 + "_" + strName + "_" + str10).hashCode()) % ((long) arrayList.size())));
                                                    }
                                                    objN2 = new cpc(yzcVar2, xzcVarY);
                                                    e18Var3.k0(objN2);
                                                } else {
                                                    str5 = string;
                                                    yzcVar = null;
                                                }
                                                yzcVar2 = yzcVar;
                                                objN2 = new cpc(yzcVar2, xzcVarY);
                                                e18Var3.k0(objN2);
                                            } else {
                                                str5 = string;
                                                yzcVar = null;
                                            }
                                            cpc cpcVar = (cpc) objN2;
                                            yzc yzcVar4 = (yzc) cpcVar.E;
                                            xzc xzcVar = (xzc) cpcVar.F;
                                            if (yzcVar4 == null) {
                                                e18Var3.a0(1934428504);
                                                int iOrdinal2 = xzcVar.ordinal();
                                                if (iOrdinal2 == 0) {
                                                    i4 = R.string.chat_headline_morning;
                                                } else if (iOrdinal2 == 1) {
                                                    i4 = R.string.chat_headline_afternoon;
                                                } else if (iOrdinal2 == 2) {
                                                    i4 = R.string.chat_headline_evening;
                                                } else {
                                                    if (iOrdinal2 != 3) {
                                                        mr9.b();
                                                        return yzcVar;
                                                    }
                                                    i4 = R.string.chat_headline_late_night;
                                                }
                                                strN = d4c.j0(i4, e18Var3);
                                                z10 = false;
                                                e18Var3.p(false);
                                            } else {
                                                z10 = false;
                                                int i9 = yzcVar4.a;
                                                if (yzcVar4.d == wzc.E) {
                                                    e18Var3.a0(1934431344);
                                                    strN = d4c.k0(i9, new Object[]{str5}, e18Var3);
                                                    e18Var3.p(false);
                                                } else {
                                                    strN = vb7.n(e18Var3, 1934432906, i9, e18Var3, false);
                                                }
                                            }
                                            zb0Var = new zb0(strN);
                                            e18Var3.p(z10);
                                        }
                                        nai.c(lc3Var2, zb0Var, gb9.L(fqbVar, 28.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), e18Var3, 384);
                                        List list5 = list2;
                                        wd6.H(s64.a, (list5.isEmpty() || z8) ? false : true, null, null, null, null, fd9.q0(-168622125, new v93(list5, z9, bz7Var2, 0), e18Var3), e18Var3, 1572870, 30);
                                        e18Var3.p(true);
                                    } else {
                                        e18Var3.T();
                                    }
                                    return iei.a;
                                }
                            }, e18Var2), e18Var2, 3072, 6);
                            e18Var2.p(false);
                        }
                    } else {
                        e18Var2.T();
                    }
                    return iei.a;
                }
            }, e18Var), e18Var, ((i3 >> 24) & 14) | 28032, 2);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(date, str, str2, z2, z3, list, bz7Var, z4, z5, z6, iqbVar, i2) { // from class: t93
                public final /* synthetic */ Date F;
                public final /* synthetic */ String G;
                public final /* synthetic */ String H;
                public final /* synthetic */ boolean I;
                public final /* synthetic */ boolean J;
                public final /* synthetic */ List K;
                public final /* synthetic */ bz7 L;
                public final /* synthetic */ boolean M;
                public final /* synthetic */ boolean N;
                public final /* synthetic */ boolean O;
                public final /* synthetic */ iqb P;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(1);
                    nai.d(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static final void e(hw2 hw2Var, pz7 pz7Var, ld4 ld4Var, int i2) {
        int i3;
        hw2Var.getClass();
        pz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-548087909);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? e18Var.f(hw2Var) : e18Var.h(hw2Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? e18Var.f(pz7Var) : e18Var.h(pz7Var) ? 32 : 16;
        }
        int i4 = 0;
        boolean z2 = true;
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            int i5 = i3 & 14;
            boolean z3 = i5 == 4 || ((i3 & 8) != 0 && e18Var.h(hw2Var));
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (z3 || objN == lz1Var) {
                objN = new vv2(hw2Var, 3);
                e18Var.k0(objN);
            }
            int i6 = 8 | i5;
            tp4 tp4Var = null;
            mwa.d(hw2Var, null, (bz7) objN, e18Var, i6);
            zy1 zy1Var = hw2Var.U;
            if ((i3 & 112) != 32 && ((i3 & 64) == 0 || !e18Var.h(pz7Var))) {
                z2 = false;
            }
            Object objN2 = e18Var.N();
            if (z2 || objN2 == lz1Var) {
                objN2 = new ue8(pz7Var, tp4Var, i4);
                e18Var.k0(objN2);
            }
            x44.b(zy1Var, (pz7) objN2, e18Var, 0);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new kb2(hw2Var, pz7Var, i2, 5);
        }
    }

    public static final void f(kqc kqcVar, fj0 fj0Var, ta4 ta4Var, ta4 ta4Var2, iqb iqbVar, rz7 rz7Var, sz7 sz7Var, ld4 ld4Var, int i2) {
        int i3;
        rz7 rz7Var2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(238076615);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.f(kqcVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.f(fj0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i2 & 3072) == 0) {
            i3 |= e18Var.h(ta4Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i2 & 24576) == 0) {
            i3 |= e18Var.f(iqbVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i2) == 0) {
            rz7Var2 = rz7Var;
            i3 |= e18Var.h(rz7Var2) ? 131072 : 65536;
        } else {
            rz7Var2 = rz7Var;
        }
        if ((1572864 & i2) == 0) {
            i3 |= e18Var.h(sz7Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        int i4 = i3 | 12582912;
        int i5 = 0;
        if (e18Var.Q(i4 & 1, (4793491 & i4) != 4793490)) {
            e18Var.a0(1158380751);
            boolean z2 = (i4 & 112) == 32;
            Object objN = e18Var.N();
            if (z2 || objN == jd4.a) {
                objN = new u8a(fj0Var, i5);
                e18Var.k0(objN);
            }
            vpc vpcVarK = v40.K((zy7) objN, sz7Var != null, e18Var);
            e18Var.p(false);
            int i6 = i4 << 3;
            koh.a(iqbVar.B(androidx.compose.foundation.layout.b.c), kqcVar, fj0Var, t8a.a, ta4Var, rz7Var2, vpcVarK, sz7Var, ta4Var2, e18Var, (i6 & 29360128) | (i6 & 112) | 3072 | (i6 & 896) | (57344 & (i4 << 6)) | (458752 & i4) | ((i4 << 15) & 234881024));
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new n8a(kqcVar, fj0Var, ta4Var, ta4Var2, iqbVar, rz7Var, sz7Var, i2);
        }
    }

    public static final void g(a6i a6iVar, v5i v5iVar, Object obj, Object obj2, kl7 kl7Var, ld4 ld4Var, int i2) {
        int i3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(867041821);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.f(a6iVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.f(v5iVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? e18Var.f(obj) : e18Var.h(obj) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0 ? e18Var.f(obj2) : e18Var.h(obj2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (32768 & i2) == 0 ? e18Var.f(kl7Var) : e18Var.h(kl7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if (!e18Var.Q(i3 & 1, (i3 & 9363) != 9362)) {
            e18Var.T();
        } else if (a6iVar.g()) {
            v5iVar.g(obj, obj2, kl7Var);
        } else {
            v5iVar.h(obj2, kl7Var);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new oa0(a6iVar, v5iVar, obj, obj2, kl7Var, i2, 5);
        }
    }

    public static final int h(int i2, wwb wwbVar) {
        int i3 = wwbVar.G - 1;
        int i4 = 0;
        while (i4 < i3) {
            int i5 = ((i3 - i4) / 2) + i4;
            Object[] objArr = wwbVar.E;
            int i6 = ((ra9) objArr[i5]).a;
            if (i6 != i2) {
                if (i6 < i2) {
                    i4 = i5 + 1;
                    if (i2 < ((ra9) objArr[i4]).a) {
                    }
                } else {
                    i3 = i5 - 1;
                }
            }
            return i5;
        }
        return i4;
    }

    public static final boolean i(tkh tkhVar) {
        i5d i5dVar;
        z5d z5dVar = tkhVar.c;
        vl6 vl6Var = (z5dVar == null || (i5dVar = z5dVar.b) == null) ? null : new vl6(i5dVar.b);
        boolean z2 = false;
        if (vl6Var != null && vl6Var.a == 1) {
            z2 = true;
        }
        return !z2;
    }

    public static Collection j(Object obj) {
        if ((obj instanceof mm9) && !(obj instanceof nm9)) {
            b0("kotlin.collections.MutableCollection", obj);
            throw null;
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e2) {
            x44.k0(e2, nai.class.getName());
            throw e2;
        }
    }

    public static List k(Object obj) {
        if ((obj instanceof mm9) && !(obj instanceof om9)) {
            b0("kotlin.collections.MutableList", obj);
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e2) {
            x44.k0(e2, nai.class.getName());
            throw e2;
        }
    }

    public static Map l(Object obj) {
        if ((obj instanceof mm9) && !(obj instanceof qm9)) {
            b0("kotlin.collections.MutableMap", obj);
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e2) {
            x44.k0(e2, nai.class.getName());
            throw e2;
        }
    }

    public static Set m(Object obj) {
        if ((obj instanceof mm9) && !(obj instanceof an9)) {
            b0("kotlin.collections.MutableSet", obj);
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e2) {
            x44.k0(e2, nai.class.getName());
            throw e2;
        }
    }

    public static Object n(int i2, Object obj) {
        if (obj == null || N(i2, obj)) {
            return obj;
        }
        b0("kotlin.jvm.functions.Function" + i2, obj);
        throw null;
    }

    public static final l9e o(cu9 cu9Var) {
        cu9 cu9VarA = cu9Var.A();
        return cu9VarA != null ? cu9VarA.J(cu9Var, true) : new l9e(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, (int) (cu9Var.k() >> 32), (int) (cu9Var.k() & 4294967295L));
    }

    public static final l9e p(cu9 cu9Var, boolean z2) {
        cu9 cu9VarA = A(cu9Var);
        float fK = (int) (cu9VarA.k() >> 32);
        float fK2 = (int) (cu9VarA.k() & 4294967295L);
        l9e l9eVarJ = cu9VarA.J(cu9Var, z2);
        float f2 = l9eVarJ.a;
        float f3 = MTTypesetterKt.kLineSkipLimitMultiplier;
        if (z2) {
            if (f2 < MTTypesetterKt.kLineSkipLimitMultiplier) {
                f2 = 0.0f;
            }
            if (f2 > fK) {
                f2 = fK;
            }
        }
        float f4 = l9eVarJ.b;
        if (z2) {
            if (f4 < MTTypesetterKt.kLineSkipLimitMultiplier) {
                f4 = 0.0f;
            }
            if (f4 > fK2) {
                f4 = fK2;
            }
        }
        float f5 = l9eVarJ.c;
        if (z2) {
            if (f5 < MTTypesetterKt.kLineSkipLimitMultiplier) {
                f5 = 0.0f;
            }
            if (f5 <= fK) {
                fK = f5;
            }
            f5 = fK;
        }
        float f6 = l9eVarJ.d;
        if (z2) {
            if (f6 >= MTTypesetterKt.kLineSkipLimitMultiplier) {
                f3 = f6;
            }
            if (f3 <= fK2) {
                fK2 = f3;
            }
            f6 = fK2;
        }
        if (f2 == f5 || f4 == f6) {
            return l9e.e;
        }
        long jB = cu9VarA.b((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L));
        long jB2 = cu9VarA.b((((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L));
        long jB3 = cu9VarA.b((((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L));
        long jB4 = cu9VarA.b((((long) Float.floatToRawIntBits(f6)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jB >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jB4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jB3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jB & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jB2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jB4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jB3 & 4294967295L));
        return new l9e(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static u84 q(bz7... bz7VarArr) {
        if (bz7VarArr.length > 0) {
            return new u84(0, bz7VarArr);
        }
        sz6.p("Failed requirement.");
        return null;
    }

    public static int r(Comparable comparable, Comparable comparable2) {
        if (comparable == null) {
            return comparable2 == null ? 0 : -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final void s(byte[] bArr, byte[] bArr2, int i2, int i3, h99 h99Var) {
        bArr.getClass();
        h99Var.getClass();
        int i4 = i2 + i3;
        int length = bArr2.length;
        g99 g99Var = g99.F;
        if (i4 > length) {
            dch.H(h99Var, 4, g99Var, n.V, null, false, 56);
        } else if (i3 > bArr.length) {
            dch.H(h99Var, 4, g99Var, n.W, null, false, 56);
        } else {
            System.arraycopy(bArr, 0, bArr2, i2, i3);
        }
    }

    public static final a6i t(a6i a6iVar, Object obj, Object obj2, String str, ld4 ld4Var, int i2) {
        int i3 = (i2 & 14) ^ 6;
        boolean z2 = true;
        boolean z3 = (i3 > 4 && ((e18) ld4Var).f(a6iVar)) || (i2 & 6) == 4;
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (z3 || objN == lz1Var) {
            objN = new a6i(new swb(obj), a6iVar, kgh.q(new StringBuilder(), a6iVar.c, " > ", str));
            e18Var.k0(objN);
        }
        a6i a6iVar2 = (a6i) objN;
        if ((i3 <= 4 || !e18Var.f(a6iVar)) && (i2 & 6) != 4) {
            z2 = false;
        }
        boolean zF = e18Var.f(a6iVar2) | z2;
        Object objN2 = e18Var.N();
        if (zF || objN2 == lz1Var) {
            objN2 = new e6f(a6iVar, 12, a6iVar2);
            e18Var.k0(objN2);
        }
        fd9.d(a6iVar2, (bz7) objN2, e18Var);
        if (a6iVar.g()) {
            a6iVar2.k(obj, obj2);
            return a6iVar2;
        }
        a6iVar2.p(obj2);
        a6iVar2.k.setValue(Boolean.FALSE);
        return a6iVar2;
    }

    public static final q5i u(a6i a6iVar, d9i d9iVar, String str, ld4 ld4Var, int i2, int i3) {
        p5i p5iVar;
        if ((i3 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean zF = ((e18) ld4Var).f(a6iVar);
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (zF || objN == lz1Var) {
            objN = new q5i(a6iVar, d9iVar, str);
            e18Var.k0(objN);
        }
        q5i q5iVar = (q5i) objN;
        boolean zF2 = e18Var.f(a6iVar) | e18Var.h(q5iVar);
        Object objN2 = e18Var.N();
        if (zF2 || objN2 == lz1Var) {
            objN2 = new e6f(a6iVar, 13, q5iVar);
            e18Var.k0(objN2);
        }
        fd9.d(q5iVar, (bz7) objN2, e18Var);
        if (a6iVar.g() && (p5iVar = (p5i) q5iVar.b.getValue()) != null) {
            a6i a6iVar2 = q5iVar.c;
            p5iVar.E.g(p5iVar.G.invoke(a6iVar2.f().b()), p5iVar.G.invoke(a6iVar2.f().c()), (kl7) p5iVar.F.invoke(a6iVar2.f()));
        }
        return q5iVar;
    }

    public static final v5i v(a6i a6iVar, Object obj, Object obj2, kl7 kl7Var, c9i c9iVar, ld4 ld4Var, int i2) {
        Object obj3;
        Object obj4;
        int i3 = i2 & 14;
        int i4 = i3 ^ 6;
        boolean z2 = true;
        boolean z3 = (i4 > 4 && ((e18) ld4Var).f(a6iVar)) || (i2 & 6) == 4;
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (z3 || objN == lz1Var) {
            rcg rcgVarZ = fd9.Z();
            bz7 bz7VarE = rcgVarZ != null ? rcgVarZ.e() : null;
            rcg rcgVarK0 = fd9.k0(rcgVarZ);
            try {
                obj3 = obj2;
                sb0 sb0Var = (sb0) c9iVar.a().invoke(obj3);
                sb0Var.d();
                obj4 = obj;
                v5i v5iVar = new v5i(a6iVar, obj4, sb0Var, c9iVar);
                fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
                e18Var.k0(v5iVar);
                objN = v5iVar;
            } catch (Throwable th) {
                fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
                throw th;
            }
        } else {
            obj4 = obj;
            obj3 = obj2;
        }
        v5i v5iVar2 = (v5i) objN;
        int i5 = (i2 >> 3) & 8;
        int i6 = i2 << 3;
        g(a6iVar, v5iVar2, obj4, obj3, kl7Var, e18Var, i3 | (i5 << 6) | (i6 & 896) | (i5 << 9) | (i6 & 7168) | (57344 & i6));
        if ((i4 <= 4 || !e18Var.f(a6iVar)) && (i2 & 6) != 4) {
            z2 = false;
        }
        boolean zF = e18Var.f(v5iVar2) | z2;
        Object objN2 = e18Var.N();
        if (zF || objN2 == lz1Var) {
            objN2 = new e6f(a6iVar, 14, v5iVar2);
            e18Var.k0(objN2);
        }
        fd9.d(v5iVar2, (bz7) objN2, e18Var);
        return v5iVar2;
    }

    public static final long w() {
        return Thread.currentThread().getId();
    }

    public static hu5 x() {
        int i2 = 0;
        return new hu5(kxk.N(0, 0, null, 7), i2, new ke7(i2));
    }

    public static final s06 y(n3 n3Var, ud4 ud4Var, String str) {
        n3Var.getClass();
        s06 s06VarA = n3Var.a(ud4Var, str);
        if (s06VarA != null) {
            return s06VarA;
        }
        vjk.h(n3Var.c(), str);
        throw null;
    }

    public static final znf z(n3 n3Var, Encoder encoder, Object obj) {
        n3Var.getClass();
        encoder.getClass();
        obj.getClass();
        znf znfVarB = n3Var.b(encoder, obj);
        if (znfVarB != null) {
            return znfVarB;
        }
        vjk.g(jce.a.b(obj.getClass()), n3Var.c());
        throw null;
    }

    public abstract Method E(Class cls, Field field);

    public abstract Constructor F(Class cls);

    public abstract String[] G(Class cls);

    public abstract boolean O(Class cls);
}
