package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.connector.auth.b;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public abstract class ez1 {
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData};
    public static final Object e = new Object();
    public static final o54 f;
    public static final o54 g;
    public static final float h;
    public static final q0g i;
    public static final o54 j;
    public static final q0g k;
    public static final float l;
    public static final o54 m;
    public static final o54 n;
    public static final eb0 o;

    static {
        o54 o54Var = o54.K;
        f = o54Var;
        g = o54.T;
        h = 56.0f;
        i = q0g.I;
        j = o54Var;
        k = q0g.K;
        l = 360.0f;
        o54 o54Var2 = o54.M;
        m = o54Var2;
        n = o54Var2;
        o = new eb0(2);
    }

    public static final iqb A(iqb iqbVar) {
        return iqbVar.B(fs7.E);
    }

    public static final iqb B(iqb iqbVar, boolean z, zub zubVar) {
        return iqbVar.B(z ? new nt7(zubVar) : fqb.E);
    }

    public static /* synthetic */ iqb C(iqb iqbVar, zub zubVar, int i2) {
        boolean z = (i2 & 1) != 0;
        if ((i2 & 2) != 0) {
            zubVar = null;
        }
        return B(iqbVar, z, zubVar);
    }

    public static r5l D(Exception exc) {
        r5l r5lVar = new r5l();
        r5lVar.m(exc);
        return r5lVar;
    }

    public static r5l E(Object obj) {
        r5l r5lVar = new r5l();
        r5lVar.n(obj);
        return r5lVar;
    }

    public static rvi F(qh9 qh9Var) {
        try {
            return new rvi(qh9Var.s("count").k());
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Action", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Action", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Action", e4);
            return null;
        }
    }

    public static ze0 G(String str) {
        str.getClass();
        xe0 xe0Var = xe0.g;
        if (str.equals(xe0Var.a)) {
            return xe0Var;
        }
        ye0 ye0Var = ye0.g;
        if (str.equals(ye0Var.a)) {
            return ye0Var;
        }
        ue0 ue0Var = ue0.g;
        if (str.equals(ue0Var.a)) {
            return ue0Var;
        }
        we0 we0Var = we0.g;
        return str.equals(we0Var.a) ? we0Var : new ve0(str);
    }

    public static final pl9 H(Annotation annotation) {
        annotation.getClass();
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        clsAnnotationType.getClass();
        return jce.a.b(clsAnnotationType);
    }

    public static final Class I(pl9 pl9Var) {
        pl9Var.getClass();
        Class clsA = ((sg3) pl9Var).a();
        clsA.getClass();
        return clsA;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class J(pl9 pl9Var) {
        pl9Var.getClass();
        Class clsA = ((sg3) pl9Var).a();
        if (!clsA.isPrimitive()) {
            return clsA;
        }
        String name = clsA.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return clsA;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class K(pl9 pl9Var) {
        pl9Var.getClass();
        Class clsA = ((sg3) pl9Var).a();
        if (clsA.isPrimitive()) {
            return clsA;
        }
        String name = clsA.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final int M(int i2, int i3) {
        return (i2 >> i3) & 31;
    }

    public static kja N(Context context) {
        int i2;
        context.getClass();
        kja kjaVar = kja.i;
        if (kjaVar != null) {
            return kjaVar;
        }
        synchronized (kja.j) {
            i2 = kja.k;
        }
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(com.anthropic.claude.R.raw.login_overview_frames);
        try {
            inputStreamOpenRawResource.getClass();
            byte[] bArrS = zni.S(inputStreamOpenRawResource);
            inputStreamOpenRawResource.close();
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArrS).order(ByteOrder.LITTLE_ENDIAN);
            if (byteBufferOrder.getInt() != 1280267846) {
                sz6.p("login_overview_frames: bad magic");
                return null;
            }
            if (byteBufferOrder.getShort() != 1) {
                sz6.p("login_overview_frames: unsupported version");
                return null;
            }
            short s = byteBufferOrder.getShort();
            int i3 = byteBufferOrder.getInt();
            int i4 = byteBufferOrder.getInt();
            int i5 = byteBufferOrder.getInt();
            int i6 = i3 + 1;
            int[] iArr = new int[i6];
            for (int i7 = 0; i7 < i6; i7++) {
                iArr[i7] = byteBufferOrder.getInt();
            }
            byte[] bArr = new byte[i4];
            byte[] bArr2 = new byte[i4];
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            for (int i8 = 0; i8 < i4; i8++) {
                bArr[i8] = byteBufferOrder.get();
                bArr2[i8] = byteBufferOrder.get();
                iArr2[i8] = byteBufferOrder.getShort() & 65535;
                iArr3[i8] = byteBufferOrder.getInt();
            }
            float[] fArr = new float[i5 * 6];
            byteBufferOrder.asFloatBuffer().get(fArr);
            kja kjaVar2 = new kja(i3, s, iArr, bArr, bArr2, iArr2, iArr3, fArr);
            synchronized (kja.j) {
                if (kja.k == i2) {
                    kja.i = kjaVar2;
                }
            }
            return kjaVar2;
        } finally {
        }
    }

    public static final Class P(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            rawType.getClass();
            return P(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            upperBounds.getClass();
            Object objD0 = mp0.D0(upperBounds);
            objD0.getClass();
            return P((Type) objD0);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            genericComponentType.getClass();
            return P(genericComponentType);
        }
        StringBuilder sb = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
        sb.append(type);
        sb.append(" has type ");
        sz6.p(sq6.t(jce.a, type.getClass(), sb));
        return null;
    }

    public static final KSerializer Q(fof fofVar, Class cls, List list) throws IllegalAccessException, InvocationTargetException {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        KSerializer kSerializerB = x44.B(cls, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (kSerializerB != null) {
            return kSerializerB;
        }
        kce kceVar = jce.a;
        pl9 pl9VarB = kceVar.b(cls);
        KSerializer kSerializer = (KSerializer) xfd.a.get(pl9VarB);
        if (kSerializer != null) {
            return kSerializer;
        }
        KSerializer kSerializerB2 = fofVar.b(pl9VarB, list);
        if (kSerializerB2 != null) {
            return kSerializerB2;
        }
        if (cls.isInterface()) {
            return new v8d(kceVar.b(cls));
        }
        return null;
    }

    public static final hi4 R(b bVar, gh2 gh2Var, ld4 ld4Var) {
        bVar.getClass();
        gh2Var.getClass();
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (objN == lz1Var) {
            objN = fd9.O(im6.E, e18Var);
            e18Var.k0(objN);
        }
        l45 l45Var = (l45) objN;
        boolean zF = e18Var.f(bVar) | e18Var.f(gh2Var);
        Object objN2 = e18Var.N();
        if (zF || objN2 == lz1Var) {
            objN2 = new hi4(bVar, gh2Var, l45Var);
            e18Var.k0(objN2);
        }
        hi4 hi4Var = (hi4) objN2;
        nwb nwbVarU = mpk.u(hi4Var.a.g, e18Var);
        di4 di4Var = (di4) nwbVarU.getValue();
        boolean zF2 = e18Var.f(nwbVarU) | e18Var.h(hi4Var);
        Object objN3 = e18Var.N();
        tp4 tp4Var = null;
        if (zF2 || objN3 == lz1Var) {
            objN3 = new dx(nwbVarU, hi4Var, tp4Var, 14);
            e18Var.k0(objN3);
        }
        fd9.i(e18Var, (pz7) objN3, di4Var);
        m4a m4aVar = (m4a) e18Var.j(tda.a);
        boolean zH = e18Var.h(m4aVar) | e18Var.h(hi4Var);
        Object objN4 = e18Var.N();
        if (zH || objN4 == lz1Var) {
            objN4 = new dx(m4aVar, hi4Var, tp4Var, 15);
            e18Var.k0(objN4);
        }
        fd9.i(e18Var, (pz7) objN4, m4aVar);
        return hi4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r7 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        if (r7 == null) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlinx.serialization.KSerializer S(defpackage.fof r7, java.lang.reflect.Type r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez1.S(fof, java.lang.reflect.Type, boolean):kotlinx.serialization.KSerializer");
    }

    public static void T(EditorInfo editorInfo, CharSequence charSequence) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            c6.f(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i2 >= 30) {
            c6.f(editorInfo, charSequence);
            return;
        }
        int i3 = editorInfo.initialSelStart;
        int i4 = editorInfo.initialSelEnd;
        int i5 = i3 > i4 ? i4 : i3;
        if (i3 <= i4) {
            i3 = i4;
        }
        int length = charSequence.length();
        if (i5 < 0 || i3 > length) {
            V(editorInfo, null, 0, 0);
            return;
        }
        int i6 = editorInfo.inputType & 4095;
        if (i6 == 129 || i6 == 225 || i6 == 18) {
            V(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            V(editorInfo, charSequence, i5, i3);
            return;
        }
        int i7 = i3 - i5;
        int i8 = i7 > 1024 ? 0 : i7;
        int i9 = 2048 - i8;
        int iMin = Math.min(charSequence.length() - i3, i9 - Math.min(i5, (int) (((double) i9) * 0.8d)));
        int iMin2 = Math.min(i5, i9 - iMin);
        int i10 = i5 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i10))) {
            i10++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i3 + iMin) - 1))) {
            iMin--;
        }
        int i11 = iMin2 + i8;
        V(editorInfo, i8 != i7 ? TextUtils.concat(charSequence.subSequence(i10, i10 + iMin2), charSequence.subSequence(i3, iMin + i3)) : charSequence.subSequence(i10, i11 + iMin + i10), iMin2, i11);
    }

    public static void U(EditorInfo editorInfo, boolean z) {
        if (Build.VERSION.SDK_INT >= 35) {
            mj6.a(editorInfo, z);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z);
    }

    public static void V(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i2);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i3);
    }

    public static final long W(float f2, long j2) {
        float fMax = Math.max(MTTypesetterKt.kLineSkipLimitMultiplier, Float.intBitsToFloat((int) (j2 >> 32)) - f2);
        float fMax2 = Math.max(MTTypesetterKt.kLineSkipLimitMultiplier, Float.intBitsToFloat((int) (j2 & 4294967295L)) - f2);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    public static Object X(d5h d5hVar) throws ExecutionException {
        if (d5hVar.g()) {
            return d5hVar.e();
        }
        if (((r5l) d5hVar).d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(d5hVar.d());
    }

    public static final void a(iqb iqbVar, vf2 vf2Var, long j2, ld4 ld4Var, final int i2, final int i3) {
        final iqb iqbVar2;
        int i4;
        long j3;
        e18 e18Var;
        final vf2 vf2Var2;
        final long j4;
        iqb iqbVar3;
        vf2 vf2Var3;
        long j5;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1284499463);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            iqbVar2 = iqbVar;
        } else if ((i2 & 6) == 0) {
            iqbVar2 = iqbVar;
            i4 = (e18Var2.f(iqbVar2) ? 4 : 2) | i2;
        } else {
            iqbVar2 = iqbVar;
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= e18Var2.d(vf2Var == null ? -1 : vf2Var.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            j3 = j2;
            i4 |= ((i3 & 4) == 0 && e18Var2.e(j3)) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            j3 = j2;
        }
        if (e18Var2.Q(i4 & 1, (i4 & 147) != 146)) {
            e18Var2.V();
            if ((i2 & 1) == 0 || e18Var2.A()) {
                iqbVar3 = i5 != 0 ? fqb.E : iqbVar2;
                vf2Var3 = i6 != 0 ? vf2.I : vf2Var;
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                    j5 = gm3.a(e18Var2).c;
                } else {
                    j5 = j3;
                }
            } else {
                e18Var2.T();
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
                iqbVar3 = iqbVar2;
                j5 = j3;
                vf2Var3 = vf2Var;
            }
            e18Var2.q();
            if (((Boolean) e18Var2.j(p59.a)).booleanValue()) {
                e18Var2.a0(-1634812113);
                long j6 = d54.g;
                float f2 = vf2Var3.F;
                iqb iqbVarO = androidx.compose.foundation.layout.b.o(iqbVar3, vf2Var3.E);
                Object objN = e18Var2.N();
                if (objN == jd4.a) {
                    objN = new rc1(9);
                    e18Var2.k0(objN);
                }
                e18Var = e18Var2;
                long j7 = j5;
                tjd.b((zy7) objN, iqbVarO, j7, f2, j6, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, (i4 & 896) | 24582);
                j5 = j7;
                e18Var.p(false);
            } else {
                e18Var2.a0(-1634558564);
                tjd.a(androidx.compose.foundation.layout.b.o(iqbVar3, vf2Var3.E), j5, vf2Var3.F, 0L, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var2, (i4 >> 3) & 112, 56);
                e18Var = e18Var2;
                e18Var.p(false);
            }
            vf2Var2 = vf2Var3;
            j4 = j5;
            iqbVar2 = iqbVar3;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            vf2Var2 = vf2Var;
            j4 = j3;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: gf2
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ez1.a(iqbVar2, vf2Var2, j4, (ld4) obj, x44.p0(i2 | 1), i3);
                    return iei.a;
                }
            };
        }
    }

    public static final void b(zy7 zy7Var, iqb iqbVar, vf2 vf2Var, long j2, ld4 ld4Var, int i2) {
        int i3;
        iqb iqbVar2;
        vf2 vf2Var2;
        long j3;
        long j4;
        int i4;
        iqb iqbVar3;
        vf2 vf2Var3;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1221844101);
        if ((i2 & 6) == 0) {
            i3 = i2 | (e18Var.h(zy7Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        int i5 = i3 | 1456;
        if (e18Var.Q(i5 & 1, (i5 & 1171) != 1170)) {
            e18Var.V();
            if ((i2 & 1) == 0 || e18Var.A()) {
                j4 = gm3.a(e18Var).c;
                i4 = i5 & (-7169);
                iqbVar3 = fqb.E;
                vf2Var3 = vf2.I;
            } else {
                e18Var.T();
                i4 = i5 & (-7169);
                iqbVar3 = iqbVar;
                vf2Var3 = vf2Var;
                j4 = j2;
            }
            e18Var.q();
            tjd.b(zy7Var, androidx.compose.foundation.layout.b.o(iqbVar3, vf2Var3.E), j4, vf2Var3.F, gm3.a(e18Var).u, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, i4 & 14);
            j3 = j4;
            iqbVar2 = iqbVar3;
            vf2Var2 = vf2Var3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            vf2Var2 = vf2Var;
            j3 = j2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ff2(zy7Var, iqbVar2, vf2Var2, j3, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.fm3 r15, final defpackage.iqb r16, float r17, defpackage.ld4 r18, final int r19, final int r20) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez1.c(fm3, iqb, float, ld4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.zy7 r16, defpackage.iqb r17, boolean r18, defpackage.e0g r19, defpackage.wu8 r20, defpackage.ta4 r21, defpackage.ld4 r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez1.d(zy7, iqb, boolean, e0g, wu8, ta4, ld4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(defpackage.zy7 r24, defpackage.iqb r25, boolean r26, defpackage.wu8 r27, defpackage.e0g r28, defpackage.pz7 r29, defpackage.ld4 r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez1.e(zy7, iqb, boolean, wu8, e0g, pz7, ld4, int, int):void");
    }

    public static final void f(iqb iqbVar, zy7 zy7Var, boolean z, e0g e0gVar, wu8 wu8Var, pz7 pz7Var, ld4 ld4Var, int i2) {
        int i3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1134296466);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.f(iqbVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= e18Var.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i2 & 3072) == 0) {
            i3 |= e18Var.f(e0gVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i2 & 24576) == 0) {
            i3 |= e18Var.f(wu8Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i2) == 0) {
            i3 |= e18Var.f(null) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= e18Var.h(pz7Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        int i4 = i3;
        if (e18Var.Q(i4 & 1, (599187 & i4) != 599186)) {
            e18Var.a0(976976045);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = vb7.f(e18Var);
            }
            zub zubVar = (zub) objN;
            e18Var.p(false);
            mo8 mo8Var = z79.a;
            iqb iqbVarO = kxk.o(androidx.compose.foundation.b.b(yfd.p(xn5.V(androidx.compose.foundation.layout.b.p(vz8.K(), iqbVar.B(pkb.E)), e0gVar), z ? wu8Var.a : wu8Var.c, e0gVar), zubVar, due.a(false, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, e0gVar, false, 247), z, null, new vue(0), zy7Var, 8));
            o5b o5bVarD = dw1.d(lja.K, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarO);
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
            j8.c(sq6.m(z ? wu8Var.b : wu8Var.d, on4.a), pz7Var, e18Var, ((i4 >> 15) & 112) | 8);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new cx2(iqbVar, zy7Var, z, e0gVar, wu8Var, pz7Var, i2);
        }
    }

    public static final void g(zy7 zy7Var, iqb iqbVar, xz9 xz9Var, mz9 mz9Var, ld4 ld4Var, int i2) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1055276397);
        int i3 = (e18Var.h(zy7Var) ? 4 : 2) | i2 | (e18Var.f(iqbVar) ? 32 : 16) | (e18Var.f(xz9Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.f(mz9Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            oq5.f(fd9.q0(-933153643, new lz9(xz9Var, iqbVar, mz9Var, mpk.Z(zy7Var, e18Var), 0), e18Var), e18Var, 6);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new f73(zy7Var, iqbVar, xz9Var, mz9Var, i2, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final java.lang.String r29, final defpackage.zy7 r30, defpackage.iqb r31, final boolean r32, defpackage.pz7 r33, final defpackage.pz7 r34, defpackage.pz7 r35, defpackage.pz7 r36, final defpackage.yq5 r37, final defpackage.tkh r38, long r39, defpackage.ld4 r41, final int r42, final int r43, final int r44) {
        /*
            Method dump skipped, instruction units count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez1.h(java.lang.String, zy7, iqb, boolean, pz7, pz7, pz7, pz7, yq5, tkh, long, ld4, int, int, int):void");
    }

    public static x30 i(String str, tkh tkhVar, long j2, cz5 cz5Var, wt7 wt7Var, int i2, int i3) {
        lm6 lm6Var = lm6.E;
        return new x30(new b40(str, tkhVar, lm6Var, lm6Var, wt7Var, cz5Var), i2, 1, j2);
    }

    public static final void j(zy7 zy7Var, oke okeVar, qi3 qi3Var, ld4 ld4Var, int i2) {
        oke okeVar2;
        qi3 qi3Var2;
        qi3 qi3Var3;
        oke okeVar3;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-91030699);
        int i3 = i2 | (e18Var.h(zy7Var) ? 4 : 2) | 144;
        int i4 = 1;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            e18Var.V();
            int i5 = i2 & 1;
            tp4 tp4Var = null;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(oke.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                oke okeVar4 = (oke) objN;
                m7f m7fVarN2 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF2 = e18Var.f(null) | e18Var.f(m7fVarN2);
                Object objN2 = e18Var.N();
                if (zF2 || objN2 == lz1Var) {
                    objN2 = m7fVarN2.a(jce.a.b(qi3.class), null, null);
                    e18Var.k0(objN2);
                }
                e18Var.p(false);
                e18Var.p(false);
                qi3Var3 = (qi3) objN2;
                okeVar3 = okeVar4;
            } else {
                e18Var.T();
                okeVar3 = okeVar;
                qi3Var3 = qi3Var;
            }
            e18Var.q();
            i6d i6dVar = (i6d) mpk.u(okeVar3.g, e18Var).getValue();
            Boolean bool = (Boolean) mpk.u(okeVar3.i, e18Var).getValue();
            boolean zBooleanValue = bool.booleanValue();
            Context context = (Context) e18Var.j(w00.b);
            nwb nwbVarZ = mpk.Z(zy7Var, e18Var);
            boolean zG = e18Var.g(zBooleanValue) | e18Var.f(nwbVarZ);
            Object objN3 = e18Var.N();
            if (zG || objN3 == lz1Var) {
                objN3 = new t73(zBooleanValue, nwbVarZ, tp4Var, i4);
                e18Var.k0(objN3);
            }
            fd9.i(e18Var, (pz7) objN3, bool);
            vc vcVar = new vc(3);
            boolean zH = e18Var.h(okeVar3);
            Object objN4 = e18Var.N();
            if (zH || objN4 == lz1Var) {
                objN4 = new tz9(20, okeVar3);
                e18Var.k0(objN4);
            }
            xpa xpaVarD0 = sf5.d0(vcVar, (bz7) objN4, e18Var, 0);
            boolean z = i6dVar instanceof g6d;
            if (z && zBooleanValue) {
                e18Var.a0(-1770069884);
                y3a y3aVar = y3a.ON_RESUME;
                boolean zH2 = e18Var.h(okeVar3) | e18Var.h(qi3Var3) | e18Var.h(context) | e18Var.h(i6dVar) | e18Var.h(xpaVarD0);
                Object objN5 = e18Var.N();
                if (zH2 || objN5 == lz1Var) {
                    n63 n63Var = new n63(okeVar3, qi3Var3, context, (g6d) i6dVar, xpaVarD0, 3);
                    e18Var.k0(n63Var);
                    objN5 = n63Var;
                }
                mwa.c(y3aVar, null, (zy7) objN5, e18Var, 6);
                e18Var.p(false);
            } else {
                e18Var.a0(-1769353939);
                e18Var.p(false);
            }
            if (z && zBooleanValue) {
                e18Var.a0(-1769266860);
                boolean zH3 = e18Var.h(context) | e18Var.h(i6dVar) | e18Var.h(xpaVarD0);
                Object objN6 = e18Var.N();
                if (zH3 || objN6 == lz1Var) {
                    zn znVar = new zn(context, (g6d) i6dVar, xpaVarD0, tp4Var, 28);
                    e18Var.k0(znVar);
                    objN6 = znVar;
                }
                fd9.i(e18Var, (pz7) objN6, iei.a);
                e18Var.p(false);
            } else {
                e18Var.a0(-1768904563);
                e18Var.p(false);
            }
            okeVar2 = okeVar3;
            qi3Var2 = qi3Var3;
        } else {
            e18Var.T();
            okeVar2 = okeVar;
            qi3Var2 = qi3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new m63(zy7Var, i2, okeVar2, qi3Var2, 18);
        }
    }

    public static final void k(noh nohVar, iqb iqbVar, ta4 ta4Var, ld4 ld4Var, int i2) {
        int i3;
        nohVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(790568582);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? e18Var.f(nohVar) : e18Var.h(nohVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        if ((i2 & 384) == 0) {
            i4 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i4 & 1, (i4 & 147) != 146)) {
            j8.c(aqc.a.a(u2f.a), fd9.q0(-972721338, new fga(nohVar, ta4Var), e18Var), e18Var, 48);
            iqbVar = fqb.E;
        } else {
            e18Var.T();
        }
        iqb iqbVar2 = iqbVar;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fb0(nohVar, iqbVar2, ta4Var, i2, 12);
        }
    }

    public static final void l(zy7 zy7Var, iqb iqbVar, boolean z, e0g e0gVar, wu8 wu8Var, ta4 ta4Var, ld4 ld4Var, int i2) {
        zy7 zy7Var2;
        int i3;
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-171935091);
        if ((i2 & 6) == 0) {
            zy7Var2 = zy7Var;
            i3 = (e18Var2.h(zy7Var2) ? 4 : 2) | i2;
        } else {
            zy7Var2 = zy7Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var2.f(iqbVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= e18Var2.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i2 & 3072) == 0) {
            i3 |= e18Var2.f(e0gVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i2 & 24576) == 0) {
            i3 |= e18Var2.f(wu8Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i2) == 0) {
            i3 |= e18Var2.f(null) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= e18Var2.f(null) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= e18Var2.h(ta4Var) ? 8388608 : 4194304;
        }
        if (e18Var2.Q(i3 & 1, (4793491 & i3) != 4793490)) {
            Object objN = e18Var2.N();
            if (objN == jd4.a) {
                objN = new fg7(18);
                e18Var2.k0(objN);
            }
            int i4 = i3 & 8078;
            int i5 = i3 << 9;
            e18Var = e18Var2;
            pzg.c(zy7Var2, tjf.b(iqbVar, false, (bz7) objN), z, e0gVar, z ? wu8Var.a : wu8Var.c, z ? wu8Var.b : wu8Var.d, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, fd9.q0(669231714, new tu2(ta4Var, 3), e18Var2), e18Var, i4 | (i5 & 234881024) | (i5 & 1879048192), 192);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new cx2(zy7Var, iqbVar, z, e0gVar, wu8Var, ta4Var, i2);
        }
    }

    public static final Object[] m(Object[] objArr, int i2, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        mp0.v0(0, i2, 6, objArr, objArr2);
        mp0.s0(i2 + 2, i2, objArr.length, objArr, objArr2);
        objArr2[i2] = obj;
        objArr2[i2 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] n(int i2, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        mp0.v0(0, i2, 6, objArr, objArr2);
        mp0.s0(i2, i2 + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] o(int i2, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        mp0.v0(0, i2, 6, objArr, objArr2);
        mp0.s0(i2, i2 + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0086 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0089 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(java.util.List r6, defpackage.gh5 r7, defpackage.vp4 r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.uf5
            if (r0 == 0) goto L13
            r0 = r8
            uf5 r0 = (defpackage.uf5) r0
            int r1 = r0.J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.J = r1
            goto L18
        L13:
            uf5 r0 = new uf5
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.I
            int r1 = r0.J
            r2 = 2
            r3 = 1
            r4 = 0
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L39
            if (r1 != r2) goto L33
            int r6 = r0.H
            java.util.Iterator r7 = r0.G
            dae r1 = r0.F
            defpackage.sf5.h0(r8)     // Catch: java.lang.Throwable -> L31
            goto L65
        L31:
            r8 = move-exception
            goto L82
        L33:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r4
        L39:
            java.util.ArrayList r6 = r0.E
            defpackage.sf5.h0(r8)
            goto L58
        L3f:
            defpackage.sf5.h0(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            wf5 r1 = new wf5
            r1.<init>(r6, r8, r4)
            r0.E = r8
            r0.J = r3
            java.lang.Object r6 = r7.a(r1, r0)
            if (r6 != r5) goto L57
            goto L97
        L57:
            r6 = r8
        L58:
            dae r7 = new dae
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
            r8 = 0
            r1 = r7
            r7 = r6
            r6 = r8
        L65:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L8f
            java.lang.Object r8 = r7.next()
            bz7 r8 = (defpackage.bz7) r8
            r0.E = r4     // Catch: java.lang.Throwable -> L31
            r0.F = r1     // Catch: java.lang.Throwable -> L31
            r0.G = r7     // Catch: java.lang.Throwable -> L31
            r0.H = r6     // Catch: java.lang.Throwable -> L31
            r0.J = r2     // Catch: java.lang.Throwable -> L31
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L31
            if (r8 != r5) goto L65
            goto L97
        L82:
            java.lang.Object r3 = r1.E
            if (r3 != 0) goto L89
            r1.E = r8
            goto L65
        L89:
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            defpackage.mwa.p(r3, r8)
            goto L65
        L8f:
            java.lang.Object r6 = r1.E
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto L98
            iei r5 = defpackage.iei.a
        L97:
            return r5
        L98:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ez1.p(java.util.List, gh5, vp4):java.lang.Object");
    }

    public static final lsc q(bm7 bm7Var, b4a b4aVar) {
        Object obj;
        bm7Var.getClass();
        b4aVar.getClass();
        synchronized (((efk) bm7Var.b)) {
            obj = bm7Var.c;
        }
        lsc lscVarP = mpk.P(obj);
        b73 b73Var = new b73(lscVarP, 1);
        dae daeVar = new dae();
        d4c.l0(b4aVar, null, new ka1(daeVar, bm7Var, b73Var, 26), null, null, new p3f(20, daeVar), null, 45);
        return lscVarP;
    }

    public static Object r(d5h d5hVar) throws InterruptedException {
        dgj.u("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            sz6.j("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        dgj.w("Task must not be null", d5hVar);
        if (d5hVar.f()) {
            return X(d5hVar);
        }
        cbi cbiVar = new cbi();
        Executor executor = y5h.b;
        d5hVar.c(executor, cbiVar);
        d5hVar.b(executor, cbiVar);
        r5l r5lVar = (r5l) d5hVar;
        r5lVar.b.k(new njk(executor, (ydc) cbiVar));
        r5lVar.q();
        ((CountDownLatch) cbiVar.E).await();
        return X(d5hVar);
    }

    public static Object s(d5h d5hVar, long j2, TimeUnit timeUnit) throws TimeoutException {
        dgj.u("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            sz6.j("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        dgj.w("Task must not be null", d5hVar);
        dgj.w("TimeUnit must not be null", timeUnit);
        if (d5hVar.f()) {
            return X(d5hVar);
        }
        cbi cbiVar = new cbi();
        Executor executor = y5h.b;
        d5hVar.c(executor, cbiVar);
        d5hVar.b(executor, cbiVar);
        r5l r5lVar = (r5l) d5hVar;
        r5lVar.b.k(new njk(executor, (ydc) cbiVar));
        r5lVar.q();
        if (((CountDownLatch) cbiVar.E).await(j2, timeUnit)) {
            return X(d5hVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static final iqb t(iqb iqbVar, float f2, long j2, e0g e0gVar) {
        return u(iqbVar, f2, new eeg(j2), e0gVar);
    }

    public static final iqb u(iqb iqbVar, float f2, eeg eegVar, e0g e0gVar) {
        return iqbVar.B(new pu1(f2, eegVar, e0gVar));
    }

    public static r5l v(Executor executor, Callable callable) {
        dgj.w("Executor must not be null", executor);
        r5l r5lVar = new r5l();
        executor.execute(new c5a(r5lVar, callable, false, 14));
        return r5lVar;
    }

    public static void w(boolean z) {
        if (z) {
            return;
        }
        mr9.y();
    }

    public static final qr7 x(cve cveVar, boolean z, String[] strArr, bz7 bz7Var) {
        cpc cpcVar;
        vb9 vb9VarG = cveVar.g();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        o7i o7iVar = vb9VarG.b;
        o7iVar.getClass();
        strArr2.getClass();
        pwf pwfVar = new pwf();
        int i2 = 0;
        for (String str : strArr2) {
            LinkedHashMap linkedHashMap = o7iVar.c;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) linkedHashMap.get(lowerCase);
            if (set != null) {
                pwfVar.addAll(set);
            } else {
                pwfVar.add(str);
            }
        }
        String[] strArr3 = (String[]) sf5.k(pwfVar).toArray(new String[0]);
        int length = strArr3.length;
        int[] iArr = new int[length];
        while (true) {
            if (i2 >= length) {
                cpcVar = new cpc(strArr3, iArr);
                break;
            }
            String str2 = strArr3[i2];
            LinkedHashMap linkedHashMap2 = o7iVar.f;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) linkedHashMap2.get(lowerCase2);
            if (num == null) {
                sz6.p("There is no table with name ".concat(str2));
                cpcVar = null;
                break;
            }
            iArr[i2] = num.intValue();
            i2++;
        }
        String[] strArr4 = (String[]) cpcVar.E;
        int[] iArr2 = (int[]) cpcVar.F;
        strArr4.getClass();
        iArr2.getClass();
        return new qr7(j8.l(new b3f(new zw(o7iVar, iArr2, strArr4, null, 23)), -1, py1.E), cveVar, z, bz7Var);
    }

    public static final ow5 z(bud budVar) {
        switch (budVar == null ? -1 : iud.b[budVar.ordinal()]) {
            case 1:
                p06 p06Var = q06.d;
                p06Var.getClass();
                return p06Var;
            case 2:
                p06 p06Var2 = q06.a;
                p06Var2.getClass();
                return p06Var2;
            case 3:
                p06 p06Var3 = q06.b;
                p06Var3.getClass();
                return p06Var3;
            case 4:
                p06 p06Var4 = q06.c;
                p06Var4.getClass();
                return p06Var4;
            case 5:
                p06 p06Var5 = q06.e;
                p06Var5.getClass();
                return p06Var5;
            case 6:
                p06 p06Var6 = q06.f;
                p06Var6.getClass();
                return p06Var6;
            default:
                p06 p06Var7 = q06.a;
                p06Var7.getClass();
                return p06Var7;
        }
    }

    public g6 L(Context context, Object obj) {
        return null;
    }

    public abstract Object O(Intent intent, int i2);

    public abstract Intent y(Context context, Object obj);
}
