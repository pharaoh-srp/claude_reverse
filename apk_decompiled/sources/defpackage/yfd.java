package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Trace;
import android.util.Log;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.types.strings.ProjectId;
import com.pvporbit.freetype.FreeTypeConstants;
import com.squareup.moshi.JsonDataException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public abstract class yfd {
    public static boolean a = true;
    public static n78 d;
    public static String e;
    public static final ro0 h;
    public static final kkg m;
    public static cpc r;
    public static final o54 b = o54.O;
    public static final float c = 1.0f;
    public static final Object f = new Object();
    public static final SerialDescriptor[] g = new SerialDescriptor[0];
    public static final kkg i = new kkg(1);
    public static final kkg j = new kkg(2);
    public static final kkg k = new kkg(3);
    public static final kkg l = new kkg(4);
    public static final kkg n = new kkg(6);
    public static final kkg o = new kkg(7);
    public static final kkg p = new kkg(8);
    public static final kkg q = new kkg(0);

    static {
        int i2 = 5;
        h = new ro0(i2);
        m = new kkg(i2);
    }

    public static aa A(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("id").m();
            String strM2 = qh9Var.s("type").m();
            strM2.getClass();
            for (int i2 : sq6.H(3)) {
                if (sq6.e(i2).equals(strM2)) {
                    bh9 bh9VarS = qh9Var.s("has_replay");
                    Boolean boolValueOf = bh9VarS != null ? Boolean.valueOf(bh9VarS.a()) : null;
                    strM.getClass();
                    return new aa(strM, i2, boolValueOf);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type ActionEventSession", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type ActionEventSession", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type ActionEventSession", e4);
            return null;
        }
    }

    public static final float B(long j2) {
        return (float) Math.sqrt((F(j2) * F(j2)) + (E(j2) * E(j2)));
    }

    public static Object C(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return h02.b(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static ApplicationInfo D(Context context) {
        swc.e("HttpFlagsLoader#getProviderApplicationInfo");
        try {
            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(new Intent("android.net.http.FLAGS_FILE_PROVIDER"), FreeTypeConstants.FT_LOAD_COLOR);
            if (resolveInfoResolveService == null) {
                Log.i("HttpFlagsLoader", "Unable to resolve the HTTP flags file provider package. This is expected if the host system is not set up to provide HTTP flags.");
                Trace.endSection();
                return null;
            }
            ApplicationInfo applicationInfo = resolveInfoResolveService.serviceInfo.applicationInfo;
            Trace.endSection();
            return applicationInfo;
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static final float E(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    public static final float F(long j2) {
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }

    public static final void G(e18 e18Var, pz7 pz7Var) {
        pz7Var.getClass();
        nai.n(2, pz7Var);
        pz7Var.invoke(e18Var, 1);
    }

    public static final boolean H(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == MTTypesetterKt.kLineSkipLimitMultiplier && fArr[2] == MTTypesetterKt.kLineSkipLimitMultiplier && fArr[3] == MTTypesetterKt.kLineSkipLimitMultiplier && fArr[4] == MTTypesetterKt.kLineSkipLimitMultiplier && fArr[5] == 1.0f && fArr[6] == MTTypesetterKt.kLineSkipLimitMultiplier && fArr[7] == MTTypesetterKt.kLineSkipLimitMultiplier && fArr[8] == MTTypesetterKt.kLineSkipLimitMultiplier && fArr[9] == MTTypesetterKt.kLineSkipLimitMultiplier && fArr[10] == 1.0f && fArr[11] == MTTypesetterKt.kLineSkipLimitMultiplier && fArr[12] == MTTypesetterKt.kLineSkipLimitMultiplier && fArr[13] == MTTypesetterKt.kLineSkipLimitMultiplier && fArr[14] == MTTypesetterKt.kLineSkipLimitMultiplier && fArr[15] == 1.0f;
    }

    public static final pl9 I(eo9 eo9Var) {
        cm9 cm9VarH = eo9Var.h();
        if (cm9VarH instanceof pl9) {
            return (pl9) cm9VarH;
        }
        if (!(cm9VarH instanceof go9)) {
            xh6.k("Only KClass supported as classifier, got ", cm9VarH);
            return null;
        }
        throw new IllegalArgumentException("Captured type parameter " + cm9VarH + " from generic non-reified function. Such functionality cannot be supported because " + cm9VarH + " is erased, either specify serializer explicitly or make calling function inline with reified " + cm9VarH + '.');
    }

    public static nn7 J(Context context) {
        try {
            ApplicationInfo applicationInfoD = D(context);
            if (applicationInfoD != null) {
                File file = new File(new File(new File(applicationInfoD.deviceProtectedDataDir), "app_httpflags"), "flags.binarypb");
                file.getAbsolutePath();
                nn7 nn7VarK = K(file);
                if (nn7VarK != null) {
                    nn7VarK.toString();
                    return nn7VarK;
                }
            }
            return null;
        } catch (RuntimeException e2) {
            Log.i("HttpFlagsLoader", "Unable to load HTTP flags file", e2);
            return null;
        }
    }

    public static nn7 K(File file) {
        swc.e("HttpFlagsLoader#loadFlagsFile");
        try {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    nn7 nn7VarH = nn7.h(fileInputStream);
                    fileInputStream.close();
                    Trace.endSection();
                    return nn7VarH;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    Trace.endSection();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (FileNotFoundException unused) {
            Log.i("HttpFlagsLoader", "HTTP flags file `" + file.getPath() + "` is missing. This is expected if HTTP flags functionality is currently disabled in the host system.");
            Trace.endSection();
            return null;
        } catch (IOException e2) {
            throw new RuntimeException("Unable to read HTTP flags file", e2);
        }
    }

    public static final long L(long j2, long j3) {
        return so7.a(E(j2) - E(j3), F(j2) - F(j3));
    }

    public static final String M(pl9 pl9Var) {
        pl9Var.getClass();
        String strF = pl9Var.f();
        if (strF == null) {
            strF = "<local class name not available>";
        }
        return ij0.j("Serializer for class '", strF, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n");
    }

    public static final long N(long j2, long j3) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) + ((int) (j3 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) + ((int) (j3 & 4294967295L)))) & 4294967295L);
    }

    public static final long O(long j2, long j3) {
        return so7.a(E(j3) + E(j2), F(j3) + F(j2));
    }

    public static void P(ur9 ur9Var, Annotation annotation) {
        Class clsI = ez1.I(ez1.H(annotation));
        sr9 sr9VarA = ur9Var.a(yae.a(clsI), new xae(annotation));
        if (sr9VarA != null) {
            Q(sr9VarA, annotation, clsI);
        }
    }

    public static void Q(sr9 sr9Var, Annotation annotation, Class cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            try {
                Object objInvoke = method.invoke(annotation, null);
                objInvoke.getClass();
                sxb sxbVarE = sxb.e(method.getName());
                Class<?> enclosingClass = objInvoke.getClass();
                if (enclosingClass.equals(Class.class)) {
                    sr9Var.q(sxbVarE, r((Class) objInvoke));
                } else if (cce.a.contains(enclosingClass)) {
                    sr9Var.k(sxbVarE, objInvoke);
                } else {
                    List list = yae.a;
                    if (Enum.class.isAssignableFrom(enclosingClass)) {
                        if (!enclosingClass.isEnum()) {
                            enclosingClass = enclosingClass.getEnclosingClass();
                        }
                        enclosingClass.getClass();
                        sr9Var.u(sxbVarE, yae.a(enclosingClass), sxb.e(((Enum) objInvoke).name()));
                    } else if (Annotation.class.isAssignableFrom(enclosingClass)) {
                        Class<?>[] interfaces = enclosingClass.getInterfaces();
                        interfaces.getClass();
                        Class cls2 = (Class) mp0.T0(interfaces);
                        cls2.getClass();
                        sr9 sr9VarZ = sr9Var.z(yae.a(cls2), sxbVarE);
                        if (sr9VarZ != null) {
                            Q(sr9VarZ, (Annotation) objInvoke, cls2);
                        }
                    } else {
                        if (!enclosingClass.isArray()) {
                            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + objInvoke);
                        }
                        tr9 tr9VarT = sr9Var.t(sxbVarE);
                        if (tr9VarT != null) {
                            Class<?> componentType = enclosingClass.getComponentType();
                            if (componentType.isEnum()) {
                                gh3 gh3VarA = yae.a(componentType);
                                for (Object obj : (Object[]) objInvoke) {
                                    obj.getClass();
                                    tr9VarT.K(gh3VarA, sxb.e(((Enum) obj).name()));
                                }
                            } else if (componentType.equals(Class.class)) {
                                for (Object obj2 : (Object[]) objInvoke) {
                                    obj2.getClass();
                                    tr9VarT.j0(r((Class) obj2));
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                for (Object obj3 : (Object[]) objInvoke) {
                                    sr9 sr9VarM = tr9VarT.m(yae.a(componentType));
                                    if (sr9VarM != null) {
                                        obj3.getClass();
                                        Q(sr9VarM, (Annotation) obj3, componentType);
                                    }
                                }
                            } else {
                                for (Object obj4 : (Object[]) objInvoke) {
                                    tr9VarT.H(obj4);
                                }
                            }
                            tr9VarT.j();
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        sr9Var.j();
    }

    public static int R(ci9 ci9Var, String str, int i2, int i3) {
        int iNextInt = ci9Var.nextInt();
        if (iNextInt >= i2 && iNextInt <= i3) {
            return iNextInt;
        }
        String strC = ci9Var.c();
        StringBuilder sbP = ij0.p("Expected ", str, iNextInt, " but was ", " at path ");
        sbP.append(strC);
        throw new JsonDataException(sbP.toString());
    }

    public static final hw2 S(boolean z, String str, String str2, ld4 ld4Var) {
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        m7f m7fVar = (m7f) e18Var.j(gr9.b);
        boolean zG = e18Var.g(z) | e18Var.f(str) | e18Var.f(str2 != null ? ProjectId.m1079boximpl(str2) : null) | e18Var.h(m7fVar);
        Object objN = e18Var.N();
        if (zG || objN == jd4.a) {
            objN = new iw2(z, str, str2, m7fVar, 0);
            e18Var.k0(objN);
        }
        kce kceVar = jce.a;
        return (hw2) fd9.r0(kceVar.b(hw2.class), oq5.B(kceVar.b(hw2.class)), (bz7) objN, e18Var);
    }

    public static final void T(nw5 nw5Var) {
        gz gzVar;
        av9 av9VarW = W(nw5Var);
        if (av9VarW.Y || (gzVar = ((AndroidComposeView) dv9.a(av9VarW))._autofillManager) == null) {
            return;
        }
        gzVar.H.b.k(av9VarW.F, new fz(gzVar, av9VarW));
    }

    public static final m5c U(nw5 nw5Var, int i2) {
        m5c m5cVar = nw5Var.x0().L;
        m5cVar.getClass();
        if (m5cVar.h1() != nw5Var || !s5c.g(i2)) {
            return m5cVar;
        }
        m5c m5cVar2 = m5cVar.V;
        m5cVar2.getClass();
        return m5cVar2;
    }

    public static final m5c V(nw5 nw5Var) {
        if (!nw5Var.x0().R) {
            b39.c("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        m5c m5cVarU = U(nw5Var, 2);
        if (!m5cVarU.h1().R) {
            b39.c("LayoutCoordinates is not attached.");
        }
        return m5cVarU;
    }

    public static final av9 W(nw5 nw5Var) {
        m5c m5cVar = nw5Var.x0().L;
        if (m5cVar != null) {
            return m5cVar.S;
        }
        throw sq6.z("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final Owner X(nw5 nw5Var) {
        Owner owner = W(nw5Var).S;
        if (owner != null) {
            return owner;
        }
        throw sq6.z("This node does not have an owner.");
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.tkh Y(defpackage.tkh r28, defpackage.fu9 r29) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yfd.Y(tkh, fu9):tkh");
    }

    public static final void Z(q4a q4aVar) {
        q4aVar.getClass();
        f0(q4aVar);
        if (q4aVar.F == z3a.H) {
            q4aVar.onResume();
        }
    }

    public static final void a(rwe[] rweVarArr, ld4 ld4Var, int i2) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1098349856);
        e18Var.X(-1047742247, Integer.valueOf(rweVarArr.length));
        int i3 = (e18Var.d(rweVarArr.length) ? 4 : 0) | i2;
        for (rwe rweVar : rweVarArr) {
            i3 |= e18Var.f(rweVar) ? 4 : 0;
        }
        e18Var.p(false);
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        int i4 = 1;
        if (e18Var.Q(i3 & 1, (i3 & 3) != 2)) {
            ps7 ps7Var = (ps7) e18Var.j(ve4.i);
            ArrayList arrayList = new ArrayList(rweVarArr.length);
            for (rwe rweVar2 : rweVarArr) {
                arrayList.add(iv1.t(rweVar2));
            }
            Object[] array = arrayList.toArray(new Object[0]);
            Object[] objArrCopyOf = Arrays.copyOf(array, array.length);
            boolean zH = e18Var.h(ps7Var);
            Object objN = e18Var.N();
            if (zH || objN == jd4.a) {
                objN = new sk3(ps7Var, null, i4);
                e18Var.k0(objN);
            }
            fd9.l(objArrCopyOf, (pz7) objN, e18Var);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new a21(rweVarArr, i2, 19);
        }
    }

    public static final long a0(long j2) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j2 >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static final void b(mif mifVar, ta4 ta4Var, ld4 ld4Var, int i2) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-954926513);
        int i3 = (e18Var.h(mifVar) ? 4 : 2) | i2;
        int i4 = 1;
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            dch.c(mifVar, ta4Var, e18Var, i3 & 126);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new s74(mifVar, ta4Var, i2, i4);
        }
    }

    public static final j7g b0(r9i r9iVar, qqb qqbVar, List list) {
        r9iVar.getClass();
        qqbVar.getClass();
        list.getClass();
        u9i u9iVarP = qqbVar.p();
        u9iVarP.getClass();
        return c0(r9iVar, u9iVarP, list, false);
    }

    public static final void c(zhh zhhVar, ta4 ta4Var, ld4 ld4Var, int i2) {
        int i3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(2080741862);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.h(zhhVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.h(ta4Var) ? 32 : 16;
        }
        int i4 = 1;
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            dch.d(zhhVar, ta4Var, e18Var, i3 & 126);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new q74(zhhVar, ta4Var, i2, i4);
        }
    }

    public static j7g c0(r9i r9iVar, u9i u9iVar, List list, boolean z) {
        fab fabVarF;
        r9iVar.getClass();
        u9iVar.getClass();
        list.getClass();
        if (r9iVar.isEmpty() && list.isEmpty() && !z && u9iVar.a() != null) {
            xh3 xh3VarA = u9iVar.a();
            xh3VarA.getClass();
            j7g j7gVarW = xh3VarA.W();
            j7gVarW.getClass();
            return j7gVarW;
        }
        xh3 xh3VarA2 = u9iVar.a();
        if (xh3VarA2 instanceof qai) {
            fabVarF = ((qai) xh3VarA2).W().G();
        } else if (xh3VarA2 instanceof qqb) {
            int i2 = o06.a;
            tqb tqbVarD = m06.d(xh3VarA2);
            tqbVarD.getClass();
            o06.h(tqbVarD);
            boolean zIsEmpty = list.isEmpty();
            es9 es9Var = es9.a;
            fabVarF = zIsEmpty ? vsk.e((qqb) xh3VarA2, es9Var) : vsk.d((qqb) xh3VarA2, w9i.b.h(u9iVar, list), es9Var);
        } else if (xh3VarA2 instanceof q16) {
            String str = ((q16) xh3VarA2).getName().E;
            str.getClass();
            fabVarF = nu6.a(4, true, str);
        } else {
            if (!(u9iVar instanceof qa9)) {
                throw new IllegalStateException("Unsupported classifier: " + xh3VarA2 + " for constructor: " + u9iVar);
            }
            fabVarF = vkc.f("member scope for intersection type", ((qa9) u9iVar).b);
        }
        return e0(r9iVar, u9iVar, list, z, fabVarF, new bs9(r9iVar, u9iVar, list, z));
    }

    public static final void d(sih sihVar, boolean z, ta4 ta4Var, ld4 ld4Var, int i2) {
        int i3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-579239002);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.h(sihVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            dch.e(sihVar, z, ta4Var, e18Var, i3 & 1022);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new r74(sihVar, z, ta4Var, i2, 1);
        }
    }

    public static final j7g d0(fab fabVar, r9i r9iVar, u9i u9iVar, List list, boolean z) {
        r9iVar.getClass();
        u9iVar.getClass();
        list.getClass();
        fabVar.getClass();
        k7g k7gVar = new k7g(u9iVar, list, z, fabVar, new bs9(fabVar, r9iVar, u9iVar, list, z));
        return r9iVar.isEmpty() ? k7gVar : new m7g(k7gVar, r9iVar);
    }

    public static final long e(int i2, int i3) {
        return (((long) i3) & 4294967295L) | (((long) i2) << 32);
    }

    public static final j7g e0(r9i r9iVar, u9i u9iVar, List list, boolean z, fab fabVar, bz7 bz7Var) {
        r9iVar.getClass();
        u9iVar.getClass();
        list.getClass();
        fabVar.getClass();
        k7g k7gVar = new k7g(u9iVar, list, z, fabVar, bz7Var);
        return r9iVar.isEmpty() ? k7gVar : new m7g(k7gVar, r9iVar);
    }

    public static final void f(final String str, iqb iqbVar, final zy7 zy7Var, final zy7 zy7Var2, final long j2, ld4 ld4Var, final int i2) {
        int i3;
        final iqb iqbVar2;
        iqb iqbVar3;
        boolean z;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2078815310);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        if ((i2 & 384) == 0) {
            i4 |= e18Var.h(zy7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i2 & 3072) == 0) {
            i4 |= e18Var.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i2 & 24576) == 0) {
            i4 |= e18Var.e(j2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if (e18Var.Q(i4 & 1, (i4 & 9363) != 9362)) {
            e18Var.V();
            int i5 = i2 & 1;
            iqb iqbVarB = fqb.E;
            if (i5 == 0 || e18Var.A()) {
                iqbVar3 = iqbVarB;
            } else {
                e18Var.T();
                iqbVar3 = iqbVar;
            }
            e18Var.q();
            if (j2 != 16) {
                e18Var.a0(-853219337);
                lz1 lz1Var = jd4.a;
                if (zy7Var != null) {
                    e18Var.a0(-853120974);
                    int i6 = i4 & 896;
                    boolean z2 = i6 == 256;
                    Object objN = e18Var.N();
                    if (z2 || objN == lz1Var) {
                        objN = new io3(3, zy7Var);
                        e18Var.k0(objN);
                    }
                    iqb iqbVarA = a0h.a(iqbVarB, zy7Var, (PointerInputEventHandler) objN);
                    boolean z3 = ((i4 & 14) == 4) | (i6 == 256);
                    Object objN2 = e18Var.N();
                    if (z3 || objN2 == lz1Var) {
                        z = true;
                        objN2 = new jf8(1 == true ? 1 : 0, zy7Var, str);
                        e18Var.k0(objN2);
                    } else {
                        z = true;
                    }
                    iqbVarB = tjf.b(iqbVarA, z, (bz7) objN2);
                    e18Var.p(false);
                } else {
                    z = true;
                    e18Var.a0(-852623672);
                    e18Var.p(false);
                }
                iqb iqbVarB2 = iqbVar3.B(b.c).B(iqbVarB);
                boolean z4 = (((((57344 & i4) ^ 24576) <= 16384 || !e18Var.e(j2)) && (i4 & 24576) != 16384) ? false : z) | ((i4 & 7168) == 2048 ? z : false);
                Object objN3 = e18Var.N();
                if (z4 != 0 || objN3 == lz1Var) {
                    objN3 = new bz7() { // from class: o8f
                        @Override // defpackage.bz7
                        public final Object invoke(Object obj) {
                            xd6 xd6Var = (xd6) obj;
                            xd6Var.T0(j2, 0L, (58 & 4) != 0 ? xd6.h0(xd6Var.g(), 0L) : 0L, (58 & 8) != 0 ? 1.0f : wd6.d0(((Number) zy7Var2.a()).floatValue(), MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f), (58 & 16) != 0 ? qk7.a : null, (58 & 32) != 0 ? null : null, (58 & 64) != 0 ? 3 : 0);
                            return iei.a;
                        }
                    };
                    e18Var.k0(objN3);
                }
                v40.a(0, e18Var, (bz7) objN3, iqbVarB2);
                e18Var.p(false);
            } else {
                e18Var.a0(-852426512);
                e18Var.p(false);
            }
            iqbVar2 = iqbVar3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: p8f
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    yfd.f(str, iqbVar2, zy7Var, zy7Var2, j2, (ld4) obj, x44.p0(i2 | 1));
                    return iei.a;
                }
            };
        }
    }

    public static final void f0(q4a q4aVar) {
        q4aVar.getClass();
        u(q4aVar);
        if (q4aVar.F == z3a.G) {
            q4aVar.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final java.lang.String r17, final boolean r18, final defpackage.zy7 r19, defpackage.iqb r20, float r21, final java.lang.String r22, defpackage.ld4 r23, final int r24, final int r25) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yfd.g(java.lang.String, boolean, zy7, iqb, float, java.lang.String, ld4, int, int):void");
    }

    public static final void g0(q4a q4aVar) {
        q4aVar.getClass();
        if (q4aVar.F == z3a.I) {
            q4aVar.onPause();
        }
        if (q4aVar.F == z3a.H) {
            q4aVar.b();
        }
    }

    public static final void h(d56 d56Var, a6i a6iVar, ta4 ta4Var, ld4 ld4Var, int i2) {
        int i3;
        a6iVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(955120261);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.f(d56Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (((i3 | (e18Var.f(a6iVar) ? 32 : 16)) & 147) == 146 && e18Var.C()) {
            e18Var.T();
        } else {
            nwb nwbVarZ = mpk.Z(d56Var, e18Var);
            nwb nwbVarZ2 = mpk.Z(a6iVar, e18Var);
            e18Var.a0(1408895207);
            boolean zF = e18Var.f(nwbVarZ) | e18Var.f(nwbVarZ2);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new g7g(nwbVarZ, nwbVarZ2);
                e18Var.k0(objN);
            }
            e18Var.p(false);
            ta4Var.invoke((g7g) objN, e18Var, 48);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fb0(d56Var, i2, a6iVar, ta4Var, 14);
        }
    }

    public static final void h0(ydh ydhVar, Resources resources, ieh iehVar, boolean z, bz7 bz7Var) {
        if (z) {
            tnk.i(ydhVar, iehVar.b(), resources.getString(iehVar.c()), iehVar.a(), bz7Var);
        }
    }

    public static final void i(wwb wwbVar, hqb hqbVar) {
        wwb wwbVarM = W(hqbVar).M();
        int i2 = wwbVarM.G - 1;
        Object[] objArr = wwbVarM.E;
        if (i2 < objArr.length) {
            while (i2 >= 0) {
                wwbVar.b((hqb) ((av9) objArr[i2]).k0.K);
                i2--;
            }
        }
    }

    public static final long i0(float f2, long j2) {
        return so7.a(E(j2) * f2, F(j2) * f2);
    }

    public static final hqb j(wwb wwbVar) {
        int i2;
        if (wwbVar == null || (i2 = wwbVar.G) == 0) {
            return null;
        }
        return (hqb) wwbVar.m(i2 - 1);
    }

    public static final Bitmap.Config j0(int i2) {
        return i2 == 0 ? Bitmap.Config.ARGB_8888 : i2 == 1 ? Bitmap.Config.ALPHA_8 : i2 == 2 ? Bitmap.Config.RGB_565 : i2 == 3 ? Bitmap.Config.RGBA_F16 : i2 == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final void k(int i2, StringBuilder sb) {
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("?");
            if (i3 < i2 - 1) {
                sb.append(",");
            }
        }
    }

    public static String k0(long j2) {
        return y(j2, 12884901888L) ? "Rgb" : y(j2, 12884901889L) ? "Xyz" : y(j2, 12884901890L) ? "Lab" : y(j2, 17179869187L) ? "Cmyk" : "Unknown";
    }

    public static final Bitmap l(r20 r20Var) {
        if (r20Var instanceof r20) {
            return r20Var.a;
        }
        pmf.n("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    public static final y08 m(y08 y08Var) {
        if (y08Var == null) {
            y08Var = null;
        }
        if (y08Var != null) {
            return y08Var;
        }
        pd4.b("Inconsistent composition");
        sz6.r();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final pu9 n(hqb hqbVar) {
        if ((hqbVar.G & 2) != 0) {
            if (hqbVar instanceof pu9) {
                return (pu9) hqbVar;
            }
            if (hqbVar instanceof qw5) {
                hqb hqbVar2 = ((qw5) hqbVar).T;
                while (hqbVar2 != 0) {
                    if (hqbVar2 instanceof pu9) {
                        return (pu9) hqbVar2;
                    }
                    hqbVar2 = (!(hqbVar2 instanceof qw5) || (hqbVar2.G & 2) == 0) ? hqbVar2.J : ((qw5) hqbVar2).T;
                }
            }
        }
        return null;
    }

    public static iqb o(iqb iqbVar, jy1 jy1Var) {
        return iqbVar.B(new zb1(0L, jy1Var, zni.b, 1));
    }

    public static final iqb p(iqb iqbVar, long j2, e0g e0gVar) {
        return iqbVar.B(new zb1(j2, null, e0gVar, 2));
    }

    public static final Set q(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (serialDescriptor instanceof f62) {
            return ((f62) serialDescriptor).b();
        }
        HashSet hashSet = new HashSet(serialDescriptor.e());
        int iE = serialDescriptor.e();
        for (int i2 = 0; i2 < iE; i2++) {
            hashSet.add(serialDescriptor.f(i2));
        }
        return hashSet;
    }

    public static jh3 r(Class cls) {
        int i2 = 0;
        while (cls.isArray()) {
            i2++;
            cls = cls.getComponentType();
            cls.getClass();
        }
        if (cls.isPrimitive()) {
            if (cls.equals(Void.TYPE)) {
                return new jh3(gh3.j(okg.d.g()), i2);
            }
            vfd vfdVarC = nk9.b(cls.getName()).c();
            vfdVarC.getClass();
            return i2 > 0 ? new jh3(gh3.j((ww7) vfdVarC.H.getValue()), i2 - 1) : new jh3(gh3.j((ww7) vfdVarC.G.getValue()), i2);
        }
        gh3 gh3VarA = yae.a(cls);
        String str = ue9.a;
        gh3 gh3VarF = ue9.f(gh3VarA.b());
        if (gh3VarF != null) {
            gh3VarA = gh3VarF;
        }
        return new jh3(gh3VarA, i2);
    }

    public static final SerialDescriptor[] s(List list) {
        SerialDescriptor[] serialDescriptorArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) ? g : serialDescriptorArr;
    }

    public static final void t(int i2, int i3) {
        if (i2 <= i3) {
            return;
        }
        xh6.j(vb7.q("toIndex (", ") is greater than size (", i2, i3, ")."));
    }

    public static final void u(q4a q4aVar) {
        q4aVar.getClass();
        if (q4aVar.F == z3a.F) {
            q4aVar.onCreate();
        }
    }

    public static final void v(q4a q4aVar) {
        q4aVar.getClass();
        g0(q4aVar);
        if (q4aVar.F == z3a.G) {
            q4aVar.onDestroy();
        }
    }

    public static final long w(float f2, long j2) {
        return so7.a(E(j2) / f2, F(j2) / f2);
    }

    public static final float x(long j2, long j3) {
        return (F(j3) * F(j2)) + (E(j3) * E(j2));
    }

    public static final boolean y(long j2, long j3) {
        return j2 == j3;
    }

    public static final fhi z(j7g j7gVar, j7g j7gVar2) {
        j7gVar.getClass();
        j7gVar2.getClass();
        return j7gVar.equals(j7gVar2) ? j7gVar : new un7(j7gVar, j7gVar2);
    }
}
