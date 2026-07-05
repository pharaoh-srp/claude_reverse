package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class zni {
    public static final ta4 a = new ta4(1718208346, false, new xe3(5));
    public static final wo8 b = new wo8(2);
    public static final Type[] c = new Type[0];
    public static boolean d = true;

    public static Type A(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return A(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return A(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static final Object B(h5b h5bVar) {
        Object objZ = h5bVar.z();
        ju9 ju9Var = objZ instanceof ju9 ? (ju9) objZ : null;
        if (ju9Var != null) {
            return ju9Var.S;
        }
        return null;
    }

    public static final Object C(qjf qjfVar, dkf dkfVar) {
        Object objG = qjfVar.E.g(dkfVar);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    public static Type D(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type = actualTypeArguments[i];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder sbU = vb7.u("Index ", i, " not in range [0,");
        sbU.append(actualTypeArguments.length);
        sbU.append(") for ");
        sbU.append(parameterizedType);
        throw new IllegalArgumentException(sbU.toString());
    }

    public static final n9d E(View view) {
        n9d n9dVar = (n9d) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (n9dVar != null) {
            return n9dVar;
        }
        n9d n9dVar2 = new n9d();
        view.setTag(R.id.pooling_container_listener_holder_tag, n9dVar2);
        return n9dVar2;
    }

    public static Class F(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            mr9.y();
            return null;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) F(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return F(((WildcardType) type).getUpperBounds()[0]);
        }
        StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        sb.append(type);
        String name = type.getClass().getName();
        sb.append("> is of type ");
        sb.append(name);
        throw new IllegalArgumentException(sb.toString());
    }

    public static Type G(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return W(type, cls, A(type, cls, Map.class));
        }
        mr9.y();
        return null;
    }

    public static boolean H(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof GenericArrayType) {
                return H(((GenericArrayType) type).getGenericComponentType());
            }
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            pmf.i("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
            return false;
        }
        for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
            if (H(type2)) {
                return true;
            }
        }
        return false;
    }

    public static tp4 I(tp4 tp4Var) {
        tp4<Object> tp4VarIntercepted;
        tp4Var.getClass();
        vp4 vp4Var = tp4Var instanceof vp4 ? (vp4) tp4Var : null;
        return (vp4Var == null || (tp4VarIntercepted = vp4Var.intercepted()) == null) ? tp4Var : tp4VarIntercepted;
    }

    public static boolean J(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean K(defpackage.d56 r3) {
        /*
            int r3 = r3.ordinal()
            r0 = 1
            if (r3 == 0) goto L15
            r1 = 0
            if (r3 == r0) goto L16
            r2 = 2
            if (r3 == r2) goto L15
            r2 = 3
            if (r3 != r2) goto L11
            goto L16
        L11:
            defpackage.mr9.b()
            return r1
        L15:
            r1 = r0
        L16:
            r3 = r1 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zni.K(d56):boolean");
    }

    public static final iqb L(iqb iqbVar, Object obj) {
        return iqbVar.B(new iu9(obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0151 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0189 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0137 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void M(android.content.Intent r9) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zni.M(android.content.Intent):void");
    }

    public static void N(String str, Bundle bundle) {
        try {
            pl7.c();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
                }
            }
            String str2 = ro6.W(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                bundle2.toString();
            }
            hx hxVar = (hx) pl7.c().b(hx.class);
            if (hxVar != null) {
                ((ix) hxVar).a(str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static IllegalArgumentException O(Method method, Exception exc, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), exc);
    }

    public static final c45 P(l45 l45Var, c45 c45Var) {
        c45 c45VarX = x(l45Var.getCoroutineContext(), c45Var, true);
        ft5 ft5Var = g86.a;
        return (c45VarX == ft5Var || c45VarX.x0(a5.G) != null) ? c45VarX : c45VarX.r0(ft5Var);
    }

    public static IllegalArgumentException Q(Method method, int i, String str, Object... objArr) {
        return O(method, null, kgh.p(str, " (", t4d.b.D(i, method), ")"), objArr);
    }

    public static IllegalArgumentException R(Method method, Exception exc, int i, String str, Object... objArr) {
        return O(method, exc, kgh.p(str, " (", t4d.b.D(i, method), ")"), objArr);
    }

    public static final byte[] S(InputStream inputStream) throws IOException {
        inputStream.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(FreeTypeConstants.FT_LOAD_LINEAR_DESIGN, inputStream.available()));
        o(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public static final void T(lz1 lz1Var, int i, wmc wmcVar, sxb sxbVar) {
        lz1Var.getClass();
        sq6.a(i);
        wmcVar.getClass();
        sxbVar.getClass();
        ((xmc) wmcVar).I.b();
        sxbVar.b().getClass();
    }

    public static final oc3 U(String str, ld4 ld4Var) {
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
        boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (zF || objN == lz1Var) {
            objN = m7fVarN.a(jce.a.b(qi3.class), null, null);
            e18Var.k0(objN);
        }
        e18Var.p(false);
        e18Var.p(false);
        qi3 qi3Var = (qi3) objN;
        m7f m7fVarN2 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
        boolean zF2 = e18Var.f(null) | e18Var.f(m7fVarN2);
        Object objN2 = e18Var.N();
        if (zF2 || objN2 == lz1Var) {
            objN2 = m7fVarN2.a(jce.a.b(koi.class), null, null);
            e18Var.k0(objN2);
        }
        e18Var.p(false);
        e18Var.p(false);
        koi koiVar = (koi) objN2;
        m7f m7fVarN3 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
        boolean zF3 = e18Var.f(null) | e18Var.f(m7fVarN3);
        Object objN3 = e18Var.N();
        if (zF3 || objN3 == lz1Var) {
            objN3 = m7fVarN3.a(jce.a.b(ysg.class), null, null);
            e18Var.k0(objN3);
        }
        e18Var.p(false);
        e18Var.p(false);
        ysg ysgVar = (ysg) objN3;
        boolean zF4 = e18Var.f(str);
        Object objN4 = e18Var.N();
        if (zF4 || objN4 == lz1Var) {
            objN4 = new oc3(str, qi3Var, koiVar, ysgVar);
            e18Var.k0(objN4);
        }
        return (oc3) objN4;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.hvf V(java.lang.String r14, java.lang.String r15, defpackage.ld4 r16, int r17) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zni.V(java.lang.String, java.lang.String, ld4, int):hvf");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Type W(java.lang.reflect.Type r8, java.lang.Class r9, java.lang.reflect.Type r10) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zni.W(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    public static final void X(hjc hjcVar, int i, Object obj) {
        hjcVar.s[(hjcVar.t - hjcVar.o[hjcVar.p - 1].c) + i] = obj;
    }

    public static final void Y(hjc hjcVar, int i, Object obj, int i2, Object obj2) {
        int i3 = hjcVar.t - hjcVar.o[hjcVar.p - 1].c;
        Object[] objArr = hjcVar.s;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    public static boolean Z(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static final void a(int i, ld4 ld4Var, zy7 zy7Var, boolean z) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1339183247);
        if ((i & 6) == 0) {
            i2 = (e18Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            nai.a(i2 & 126, 0, e18Var, zy7Var, z);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lw0(z, zy7Var, i, i3);
        }
    }

    public static void a0(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(int i, int i2, ld4 ld4Var, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar) {
        int i3;
        iqb iqbVar2;
        boolean z;
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1290422142);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= e18Var.h(zy7Var2) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i4 = i3 | 3072;
        int i5 = 1;
        if (e18Var.Q(i4 & 1, (i4 & 1171) != 1170)) {
            cxe cxeVarA = axe.a(new ho0(6.0f, true, new sz6(i5)), lja.Q, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            fqb fqbVar = fqb.E;
            iqb iqbVarE = kxk.E(e18Var, fqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            if (i > 0) {
                e18Var.a0(1747849386);
                int i6 = i4 & 14;
                boolean z2 = ((i4 & 896) == 256) | (i6 == 4) | ((i4 & 112) == 32);
                Object objN = e18Var.N();
                if (z2 || objN == jd4.a) {
                    z = false;
                    objN = new aa3(i, zy7Var, zy7Var2, 0 == true ? 1 : 0);
                    e18Var.k0(objN);
                } else {
                    z = false;
                }
                ytk.a(i, i6, e18Var, (zy7) objN, new hw9(1.0f, z), d4c.e0(R.plurals.artifact_pill_view_artifacts, i, e18Var));
                e18Var.p(z);
            } else {
                e18Var.a0(1748335652);
                e18Var.p(false);
            }
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ba3(i, i2, zy7Var, zy7Var2, iqbVar2);
        }
    }

    public static final Shader.TileMode b0(int i) {
        if (i == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i == 2) {
            return Shader.TileMode.MIRROR;
        }
        if (i == 3 && Build.VERSION.SDK_INT >= 31) {
            return ksk.f();
        }
        return Shader.TileMode.CLAMP;
    }

    public static v84 c() {
        v84 v84Var = new v84(true);
        v84Var.X(null);
        return v84Var;
    }

    public static String c0(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static final void d(sbg sbgVar, iqb iqbVar, ta4 ta4Var, ld4 ld4Var, int i) {
        boolean z;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-977568115);
        int i2 = (i & 6) == 0 ? (e18Var.f(sbgVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        boolean z2 = true;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            String strE = dch.E(R.string.m3c_snackbar_pane_title, e18Var);
            Object objN = e18Var.N();
            Object obj = objN;
            if (objN == jd4.a) {
                je7 je7Var = new je7();
                je7Var.a = new Object();
                je7Var.b = new ArrayList();
                e18Var.k0(je7Var);
                obj = je7Var;
            }
            je7 je7Var2 = (je7) obj;
            Object obj2 = je7Var2.a;
            ArrayList arrayList = je7Var2.b;
            if (x44.r(sbgVar, obj2)) {
                z = true;
                e18Var.a0(1443889109);
                e18Var.p(false);
            } else {
                e18Var.a0(1441886385);
                je7Var2.a = sbgVar;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList2.add((sbg) ((ie7) arrayList.get(i3)).c());
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                if (!arrayList3.contains(sbgVar)) {
                    arrayList3.add(sbgVar);
                }
                arrayList.clear();
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    Object obj3 = arrayList3.get(i4);
                    if (obj3 != null) {
                        arrayList4.add(obj3);
                    }
                }
                int size3 = arrayList4.size();
                int i5 = 0;
                while (i5 < size3) {
                    sbg sbgVar2 = (sbg) arrayList4.get(i5);
                    arrayList.add(new ie7(sbgVar2, fd9.q0(-1952400805, new lz9(sbgVar2, sbgVar, je7Var2, strE, 3), e18Var)));
                    i5++;
                    z2 = z2;
                }
                z = z2;
                e18Var.p(false);
            }
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            r7e r7eVarZ = e18Var.z();
            if (r7eVarZ == null) {
                sz6.j("no recompose scope found");
                return;
            }
            r7eVarZ.b |= 1;
            je7Var2.c = r7eVarZ;
            e18Var.a0(-1888182177);
            int size4 = arrayList.size();
            for (int i6 = 0; i6 < size4; i6++) {
                ie7 ie7Var = (ie7) arrayList.get(i6);
                sbg sbgVar3 = (sbg) ie7Var.a();
                rz7 rz7VarB = ie7Var.b();
                e18Var.X(1325010085, sbgVar3);
                ((ta4) rz7VarB).invoke(fd9.q0(-1893791890, new fga(ta4Var, 12, sbgVar3), e18Var), e18Var, 6);
                e18Var.p(false);
            }
            e18Var.p(false);
            e18Var.p(z);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fb0(sbgVar, iqbVar, ta4Var, i, 16);
        }
    }

    public static final ydi d0(tp4 tp4Var, c45 c45Var, Object obj) {
        ydi ydiVar = null;
        if ((tp4Var instanceof n45) && c45Var.x0(cb2.H) != null) {
            n45 callerFrame = (n45) tp4Var;
            while (true) {
                if ((callerFrame instanceof b86) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                    break;
                }
                if (callerFrame instanceof ydi) {
                    ydiVar = (ydi) callerFrame;
                    break;
                }
            }
            if (ydiVar != null) {
                ydiVar.C0(c45Var, obj);
            }
        }
        return ydiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(defpackage.iqb r28, defpackage.pz7 r29, defpackage.pz7 r30, defpackage.rz7 r31, float r32, defpackage.wbj r33, defpackage.m2i r34, defpackage.ld4 r35, int r36, int r37) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zni.e(iqb, pz7, pz7, rz7, float, wbj, m2i, ld4, int, int):void");
    }

    public static final boolean e0(zy7 zy7Var, String str) {
        try {
            boolean zBooleanValue = ((Boolean) zy7Var.a()).booleanValue();
            if (!zBooleanValue) {
                Log.e("ReflectionGuard", str);
            }
            return zBooleanValue;
        } catch (ClassNotFoundException unused) {
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchFieldException unused2) {
            Log.e("ReflectionGuard", "NoSuchField: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused3) {
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static final void f(long j, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-166332950);
        int i2 = i | 2;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                j = ((gwa) e18Var.j(jwa.a)).a.n;
            } else {
                e18Var.T();
            }
            e18Var.q();
            iqb iqbVarC = b.c(fqb.E, 1.0f);
            WeakHashMap weakHashMap = gdj.x;
            dw1.a(w(fik.o(iqbVarC, s4i.d(e18Var).l), j, null, 6), e18Var, 0);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new e32(j, i);
        }
    }

    public static Object f0(pz7 pz7Var, Object obj, tp4 tp4Var) {
        pz7Var.getClass();
        c45 context = tp4Var.getContext();
        Object jb9Var = context == im6.E ? new jb9(tp4Var) : new kb9(tp4Var, context);
        nai.n(2, pz7Var);
        return pz7Var.invoke(obj, jb9Var);
    }

    public static final void g(gh2 gh2Var, ybg ybgVar, ld4 ld4Var, int i) {
        int i2;
        gh2Var.getClass();
        ybgVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1219848931);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(gh2Var) : e18Var.h(gh2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(ybgVar) ? 32 : 16;
        }
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object objN = e18Var.N();
            if (z || objN == jd4.a) {
                objN = new s73(ybgVar, null, i3);
                e18Var.k0(objN);
            }
            x44.b(gh2Var, (pz7) objN, e18Var, i2 & 14);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new kb2(gh2Var, ybgVar, i, 6);
        }
    }

    public static final void h(boolean z, pz7 pz7Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1437916225);
        int i2 = (e18Var.g(z) ? 4 : 2) | i | (e18Var.h(pz7Var) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            mpk.g(z, pz7Var, e18Var, i2 & 126);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new db0(z, pz7Var, i);
        }
    }

    public static final void i(ybg ybgVar, iqb iqbVar, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1077081618);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(ybgVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            sbg sbgVar = (sbg) ybgVar.b.getValue();
            s5 s5Var = (s5) e18Var.j(ve4.a);
            boolean zF = e18Var.f(sbgVar) | e18Var.h(s5Var);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new rrb(sbgVar, s5Var, null, 9);
                e18Var.k0(objN);
            }
            fd9.i(e18Var, (pz7) objN, sbgVar);
            d((sbg) ybgVar.b.getValue(), iqbVar, ta4Var, e18Var, i2 & 1008);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fb0(ybgVar, iqbVar, ta4Var, i, 15);
        }
    }

    public static final int j(fma fmaVar, ut utVar) {
        fma fmaVarO0 = fmaVar.o0();
        if (fmaVarO0 == null) {
            b39.c("Child of " + fmaVar + " cannot be null when calculating alignment line");
        }
        if (fmaVar.x0().c().containsKey(utVar)) {
            Integer num = (Integer) fmaVar.x0().c().get(utVar);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iR = fmaVarO0.R(utVar);
            if (iR != Integer.MIN_VALUE) {
                fmaVarO0.N = true;
                fmaVar.O = true;
                fmaVar.I0();
                fmaVarO0.N = false;
                fmaVar.O = false;
                return iR + ((int) (utVar instanceof mo8 ? fmaVarO0.D0() & 4294967295L : fmaVarO0.D0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final void k(int i, int i2) {
        if (i < 0 || i >= i2) {
            xh6.j(grc.o(i, i2, "index: ", ", size: "));
        }
    }

    public static void l(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            mr9.y();
        }
    }

    public static final void m(int i, int i2) {
        if (i < 0 || i > i2) {
            xh6.j(grc.o(i, i2, "index: ", ", size: "));
        }
    }

    public static final void n(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            mr9.e(i3, vb7.v("fromIndex: ", ", toIndex: ", i, i2, ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            sz6.p(grc.o(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }

    public static void o(InputStream inputStream, OutputStream outputStream) throws IOException {
        inputStream.getClass();
        outputStream.getClass();
        byte[] bArr = new byte[FreeTypeConstants.FT_LOAD_LINEAR_DESIGN];
        int i = inputStream.read(bArr);
        while (i >= 0) {
            outputStream.write(bArr, 0, i);
            i = inputStream.read(bArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static tp4 p(tp4 tp4Var, tp4 tp4Var2, pz7 pz7Var) {
        pz7Var.getClass();
        if (pz7Var instanceof vd1) {
            return ((vd1) pz7Var).create(tp4Var, tp4Var2);
        }
        c45 context = tp4Var2.getContext();
        return context == im6.E ? new hb9(tp4Var2, tp4Var, pz7Var) : new ib9(tp4Var2, context, pz7Var, tp4Var);
    }

    public static final long q() {
        return Thread.currentThread().getId();
    }

    public static boolean r() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            pl7.c();
            pl7 pl7VarC = pl7.c();
            pl7VarC.a();
            Context context = pl7VarC.a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), FreeTypeConstants.FT_LOAD_PEDANTIC)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static final iqb s(iqb iqbVar, bz7 bz7Var) {
        return iqbVar.B(new rd6(bz7Var));
    }

    public static final iqb t(iqb iqbVar, bz7 bz7Var) {
        return iqbVar.B(new ae6(bz7Var));
    }

    public static final iqb u(iqb iqbVar, bz7 bz7Var) {
        return iqbVar.B(new be6(bz7Var));
    }

    public static boolean v(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return v(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static iqb w(iqb iqbVar, long j, va6 va6Var, int i) {
        boolean z = (i & 2) == 0;
        if ((i & 4) != 0) {
            va6Var = null;
        }
        iqbVar.getClass();
        return kxk.p(iqbVar, new bf7(j, va6Var, z));
    }

    public static final c45 x(c45 c45Var, c45 c45Var2, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i = 1;
        boolean zBooleanValue = ((Boolean) c45Var.K(new z35(i), bool)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) c45Var2.K(new z35(i), bool)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return c45Var.r0(c45Var2);
        }
        z35 z35Var = new z35(2);
        im6 im6Var = im6.E;
        c45 c45Var3 = (c45) c45Var.K(z35Var, im6Var);
        Object objK = c45Var2;
        if (zBooleanValue2) {
            objK = c45Var2.K(new z35(3), im6Var);
        }
        return c45Var3.r0((c45) objK);
    }

    public static sxe y(Map map) {
        int i;
        int i2;
        int i3;
        map.getClass();
        Object obj = map.get("application_id");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("session_id");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map.get("session_active");
        Boolean bool = obj3 instanceof Boolean ? (Boolean) obj3 : null;
        Object obj4 = map.get("session_state");
        String str3 = obj4 instanceof String ? (String) obj4 : null;
        int[] iArrH = sq6.H(3);
        int length = iArrH.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                i = 0;
                break;
            }
            i = iArrH[i4];
            if (grc.b(i).equals(str3)) {
                break;
            }
            i4++;
        }
        Object obj5 = map.get("session_start_reason");
        String str4 = obj5 instanceof String ? (String) obj5 : null;
        int[] iArrH2 = sq6.H(7);
        int length2 = iArrH2.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length2) {
                i2 = 0;
                break;
            }
            i2 = iArrH2[i5];
            if (grc.a(i2).equals(str4)) {
                break;
            }
            i5++;
        }
        Object obj6 = map.get("view_id");
        String str5 = obj6 instanceof String ? (String) obj6 : null;
        Object obj7 = map.get("view_name");
        String str6 = obj7 instanceof String ? (String) obj7 : null;
        Object obj8 = map.get("view_url");
        String str7 = obj8 instanceof String ? (String) obj8 : null;
        Object obj9 = map.get("view_type");
        String str8 = obj9 instanceof String ? (String) obj9 : null;
        int[] iArrH3 = sq6.H(4);
        int length3 = iArrH3.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length3) {
                i3 = 0;
                break;
            }
            i3 = iArrH3[i6];
            if (grc.c(i3).equals(str8)) {
                break;
            }
            i6++;
        }
        Object obj10 = map.get("action_id");
        String str9 = obj10 instanceof String ? (String) obj10 : null;
        Object obj11 = map.get("synthetics_test_id");
        String str10 = obj11 instanceof String ? (String) obj11 : null;
        Object obj12 = map.get("synthetics_result_id");
        String str11 = obj12 instanceof String ? (String) obj12 : null;
        Object obj13 = map.get("view_has_replay");
        Boolean bool2 = obj13 instanceof Boolean ? (Boolean) obj13 : null;
        boolean zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
        Object obj14 = map.get("view_timestamp");
        Long l = obj14 instanceof Long ? (Long) obj14 : null;
        long jLongValue = l != null ? l.longValue() : 0L;
        Object obj15 = map.get("view_timestamp_offset");
        Long l2 = obj15 instanceof Long ? (Long) obj15 : null;
        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
        if (str == null) {
            str = sxe.p;
        }
        String str12 = str;
        if (str2 == null) {
            str2 = sxe.p;
        }
        return new sxe(str12, str2, bool != null ? bool.booleanValue() : false, str5, str6, str7, str9, i == 0 ? 1 : i, i2 == 0 ? 1 : i2, i3 == 0 ? 1 : i3, str10, str11, jLongValue, jLongValue2, zBooleanValue);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        r3.add(r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ga z(defpackage.qh9 r13) {
        /*
            java.lang.String r0 = "Unable to parse json into type Connectivity"
            r1 = 0
            java.lang.String r2 = "status"
            bh9 r2 = r13.s(r2)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            java.lang.String r2 = r2.m()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            r2.getClass()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            r3 = 3
            int[] r3 = defpackage.sq6.H(r3)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            int r4 = r3.length     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            r5 = 0
            r6 = r5
        L18:
            java.lang.String r7 = "Array contains no element matching the predicate."
            if (r6 >= r4) goto Laa
            r8 = r3[r6]     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            java.lang.String r9 = defpackage.sq6.j(r8)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            boolean r9 = r9.equals(r2)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            if (r9 == 0) goto La6
            java.lang.String r2 = "interfaces"
            bh9 r2 = r13.s(r2)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            if (r2 == 0) goto L7b
            ig9 r2 = r2.e()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            java.util.ArrayList r2 = r2.E     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            int r4 = r2.size()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            r3.<init>(r4)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
        L43:
            boolean r4 = r2.hasNext()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            if (r4 == 0) goto L7c
            java.lang.Object r4 = r2.next()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            bh9 r4 = (defpackage.bh9) r4     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            java.lang.String r4 = r4.m()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            r4.getClass()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            ta[] r6 = defpackage.ta.values()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            int r9 = r6.length     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            r10 = r5
        L5c:
            if (r10 >= r9) goto L75
            r11 = r6[r10]     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            java.lang.String r12 = r11.E     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            boolean r12 = r12.equals(r4)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            if (r12 == 0) goto L72
            r3.add(r11)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            goto L43
        L6c:
            r13 = move-exception
            goto Lb0
        L6e:
            r13 = move-exception
            goto Lb4
        L70:
            r13 = move-exception
            goto Lb8
        L72:
            int r10 = r10 + 1
            goto L5c
        L75:
            java.util.NoSuchElementException r13 = new java.util.NoSuchElementException     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            r13.<init>(r7)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            throw r13     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
        L7b:
            r3 = r1
        L7c:
            java.lang.String r2 = "effective_type"
            bh9 r2 = r13.s(r2)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            if (r2 == 0) goto L8e
            java.lang.String r2 = r2.m()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            if (r2 == 0) goto L8e
            int r5 = defpackage.jlk.j(r2)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
        L8e:
            java.lang.String r2 = "cellular"
            bh9 r13 = r13.s(r2)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            if (r13 == 0) goto L9f
            qh9 r13 = r13.g()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            da r13 = defpackage.skk.d(r13)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            goto La0
        L9f:
            r13 = r1
        La0:
            ga r2 = new ga     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            r2.<init>(r8, r3, r5, r13)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            return r2
        La6:
            int r6 = r6 + 1
            goto L18
        Laa:
            java.util.NoSuchElementException r13 = new java.util.NoSuchElementException     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            r13.<init>(r7)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            throw r13     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
        Lb0:
            defpackage.pmf.j(r0, r13)
            return r1
        Lb4:
            defpackage.pmf.j(r0, r13)
            return r1
        Lb8:
            defpackage.pmf.j(r0, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zni.z(qh9):ga");
    }
}
