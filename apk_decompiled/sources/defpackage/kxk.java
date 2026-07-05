package defpackage;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.foundation.layout.b;
import androidx.work.impl.WorkDatabase;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.types.strings.ChatId;
import com.google.android.gms.internal.measurement.m0;
import com.pvporbit.freetype.FreeTypeConstants;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import okio.Buffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class kxk {
    public static final ta4 a = new ta4(1014570812, false, new eb4(4));
    public static final ta4 b = new ta4(-802381935, false, new eb4(5));
    public static final ta4 c = new ta4(-312149492, false, new xe3(9));
    public static final ta4 d = new ta4(-1224286013, false, new xe3(10));
    public static final o54 e = o54.P;
    public static final o54 f;
    public static final float g;
    public static final o54 h;
    public static final float i;
    public static final o54 j;
    public static final char[] k;

    static {
        o54 o54Var = o54.L;
        f = o54Var;
        g = 0.1f;
        h = o54Var;
        i = 0.38f;
        j = o54.I;
        k = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public static final boolean A(int i2, int i3, String str) {
        str.getClass();
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && zkj.l(str.charAt(i2 + 1)) != -1 && zkj.l(str.charAt(i4)) != -1;
    }

    public static final iqb B(iqb iqbVar, kn9 kn9Var, a0a a0aVar, ukc ukcVar, boolean z, boolean z2) {
        return iqbVar.B(new d0a(kn9Var, a0aVar, ukcVar, z, z2));
    }

    public static final String C(bga bgaVar) {
        bgaVar.getClass();
        String strF = jce.a.b(bgaVar.getClass()).f();
        return strF == null ? "unknown" : strF;
    }

    public static final iqb D(ld4 ld4Var, iqb iqbVar) {
        if (iqbVar.e(bx.X)) {
            return iqbVar;
        }
        e18 e18Var = (e18) ld4Var;
        e18Var.b0(1219399079);
        iqb iqbVar2 = (iqb) iqbVar.a(new z0(3, e18Var), fqb.E);
        e18Var.p(false);
        return iqbVar2;
    }

    public static final iqb E(ld4 ld4Var, iqb iqbVar) {
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(439770924);
        iqb iqbVarD = D(e18Var, iqbVar);
        e18Var.p(false);
        return iqbVarD;
    }

    public static wg8 F(String... strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length % 2 != 0) {
            sz6.p("Expected alternating header names and values");
            return null;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        int length = strArr3.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (strArr3[i3] == null) {
                sz6.p("Headers cannot be null");
                return null;
            }
            strArr3[i3] = bsg.k1(strArr2[i3]).toString();
        }
        int iX = iv1.x(0, strArr3.length - 1, 2);
        if (iX >= 0) {
            while (true) {
                String str = strArr3[i2];
                String str2 = strArr3[i2 + 1];
                skj.c(str);
                skj.d(str2, str);
                if (i2 == iX) {
                    break;
                }
                i2 += 2;
            }
        }
        return new wg8(strArr3);
    }

    public static String G(String str, int i2, int i3, int i4) {
        int i5;
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        boolean z = (i4 & 4) == 0;
        str.getClass();
        int iCharCount = i2;
        while (iCharCount < i3) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                Buffer buffer = new Buffer();
                buffer.S0(i2, iCharCount, str);
                while (iCharCount < i3) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i5 = iCharCount + 2) < i3) {
                        int iL = zkj.l(str.charAt(iCharCount + 1));
                        int iL2 = zkj.l(str.charAt(i5));
                        if (iL == -1 || iL2 == -1) {
                            buffer.U0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            buffer.B0((iL << 4) + iL2);
                            iCharCount = Character.charCount(iCodePointAt) + i5;
                        }
                    } else if (iCodePointAt == 43 && z) {
                        buffer.B0(32);
                        iCharCount++;
                    } else {
                        buffer.U0(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return buffer.t0();
            }
            iCharCount++;
        }
        return str.substring(i2, i3);
    }

    public static final nfe H(String str, ld4 ld4Var, int i2) {
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        m7f m7fVar = (m7f) e18Var.j(gr9.b);
        ChatId chatIdM978boximpl = ChatId.m978boximpl(str);
        int i3 = 1;
        boolean zH = ((((i2 & 14) ^ 6) > 4 && e18Var.f(str)) || (i2 & 6) == 4) | e18Var.h(m7fVar);
        Object objN = e18Var.N();
        if (zH || objN == jd4.a) {
            objN = new wx5(str, m7fVar, i3);
            e18Var.k0(objN);
        }
        kce kceVar = jce.a;
        return (nfe) fd9.r0(kceVar.b(nfe.class), x44.X(oq5.B(kceVar.b(nfe.class)), chatIdM978boximpl), (bz7) objN, e18Var);
    }

    public static final iqb I(iqb iqbVar, aaf aafVar, ukc ukcVar, b20 b20Var, boolean z, boolean z2, eo7 eo7Var, zub zubVar, wnc wncVar) {
        ukc ukcVar2 = ukc.E;
        fqb fqbVar = fqb.E;
        return iqbVar.B(ukcVar == ukcVar2 ? xn5.V(fqbVar, wo8.c) : xn5.V(fqbVar, wo8.b)).B(new k9f(b20Var, wncVar, eo7Var, zubVar, ukcVar, aafVar, z, z2, false));
    }

    public static qcg J() {
        return new qcg(0);
    }

    public static yig K(float f2, float f3, Object obj, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return new yig(f2, f3, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object L(JsonElement jsonElement) {
        if (jsonElement instanceof JsonNull) {
            return null;
        }
        if (!(jsonElement instanceof JsonPrimitive)) {
            if (!(jsonElement instanceof JsonArray)) {
                if (jsonElement instanceof JsonObject) {
                    return M((JsonObject) jsonElement);
                }
                mr9.b();
                return null;
            }
            Iterable iterable = (Iterable) jsonElement;
            ArrayList arrayList = new ArrayList(x44.y(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(L((JsonElement) it.next()));
            }
            return arrayList;
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
        if (jsonPrimitive.isString()) {
            return jsonPrimitive.getContent();
        }
        Object objE = ch9.e(jsonPrimitive);
        if (objE == null) {
            try {
                objE = Long.valueOf(ch9.k(jsonPrimitive));
            } catch (JsonDecodingException unused) {
                objE = null;
            }
            if (objE == null) {
                Double dA0 = hsg.a0(jsonPrimitive.getContent());
                if (dA0 != null) {
                    return dA0;
                }
                xh6.d("JsonPrimitive could not be parsed to a Kotlin type: ", jsonPrimitive);
                return null;
            }
        }
        return objE;
    }

    public static final LinkedHashMap M(JsonObject jsonObject) {
        jsonObject.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(tta.d0(jsonObject.size()));
        Iterator<T> it = jsonObject.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), L((JsonElement) entry.getValue()));
        }
        return linkedHashMap;
    }

    public static z8i N(int i2, int i3, vi6 vi6Var, int i4) {
        if ((i4 & 1) != 0) {
            i2 = 300;
        }
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            vi6Var = wi6.a;
        }
        return new z8i(i2, i3, vi6Var);
    }

    public static final int O(float f2, float[] fArr, int i2) {
        float f3 = MTTypesetterKt.kLineSkipLimitMultiplier;
        if (f2 >= MTTypesetterKt.kLineSkipLimitMultiplier) {
            f3 = f2;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (Math.abs(f3 - f2) > 1.05E-6f) {
            f3 = Float.NaN;
        }
        fArr[i2] = f3;
        return !Float.isNaN(f3) ? 1 : 0;
    }

    public static fwk P() {
        String strP;
        ClassLoader classLoader = kxk.class.getClassLoader();
        if (fwk.class.equals(fwk.class)) {
            strP = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!fwk.class.getPackage().equals(kxk.class.getPackage())) {
                sz6.p(fwk.class.getName());
                return null;
            }
            strP = kgh.p(fwk.class.getPackage().getName(), ".BlazeGenerated", fwk.class.getSimpleName(), "Loader");
        }
        try {
            try {
                try {
                    ij0.x(Class.forName(strP, true, classLoader).getConstructor(null).newInstance(null));
                    throw null;
                } catch (IllegalAccessException e2) {
                    throw new IllegalStateException(e2);
                } catch (InstantiationException e3) {
                    throw new IllegalStateException(e3);
                }
            } catch (NoSuchMethodException e4) {
                throw new IllegalStateException(e4);
            } catch (InvocationTargetException e5) {
                throw new IllegalStateException(e5);
            }
        } catch (ClassNotFoundException unused) {
            try {
                Iterator it = Arrays.asList(new kxk[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    } catch (ServiceConfigurationError e6) {
                        Logger.getLogger(m0.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(fwk.class.getSimpleName()), (Throwable) e6);
                    }
                }
                if (arrayList.size() == 1) {
                    return (fwk) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (fwk) fwk.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e7) {
                    pmf.m(e7);
                    return null;
                } catch (NoSuchMethodException e8) {
                    pmf.m(e8);
                    return null;
                } catch (InvocationTargetException e9) {
                    pmf.m(e9);
                    return null;
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    public static final void a(fj0 fj0Var, ue7 ue7Var, ld4 ld4Var, int i2) {
        fj0 fj0Var2;
        ue7 ue7Var2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1196134678);
        int i3 = (e18Var.f(fj0Var) ? 4 : 2) | i2 | (e18Var.h(ue7Var) ? 32 : 16);
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            eae eaeVarG = knk.G(Float.valueOf(MTTypesetterKt.kLineSkipLimitMultiplier), e18Var);
            boolean zH = e18Var.h(eaeVarG) | ((i3 & 14) == 4) | e18Var.h(ue7Var);
            Object objN = e18Var.N();
            if (zH || objN == jd4.a) {
                fj0Var2 = fj0Var;
                ue7Var2 = ue7Var;
                cx cxVar = new cx(fj0Var2, ue7Var2, eaeVarG, (tp4) null, 26);
                e18Var.k0(cxVar);
                objN = cxVar;
            } else {
                fj0Var2 = fj0Var;
                ue7Var2 = ue7Var;
            }
            fd9.i(e18Var, (pz7) objN, fj0Var2);
        } else {
            fj0Var2 = fj0Var;
            ue7Var2 = ue7Var;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fga(fj0Var2, ue7Var2, i2, 5);
        }
    }

    public static final void b(final yih yihVar, final iqb iqbVar, boolean z, final tkh tkhVar, wgh wghVar, final pz7 pz7Var, final pz7 pz7Var2, final pz7 pz7Var3, mp9 mp9Var, final dhh dhhVar, j9f j9fVar, final e0g e0gVar, final ffh ffhVar, final mnc mncVar, ld4 ld4Var, final int i2, final int i3) {
        int i4;
        mnc mncVar2;
        final boolean z2;
        final wgh wghVar2;
        final mp9 mp9Var2;
        final j9f j9fVar2;
        final mp9 mp9Var3;
        final j9f j9fVarY;
        final boolean z3;
        final wgh wghVar3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2007078942);
        if ((i2 & 6) == 0) {
            i4 = (e18Var.f(yihVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        int i5 = i4 | 3456;
        if ((i2 & 24576) == 0) {
            i5 |= e18Var.f(tkhVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i2) == 0) {
            i5 |= 65536;
        }
        int i6 = i5 | 1572864;
        if ((12582912 & i2) == 0) {
            i6 |= e18Var.h(pz7Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i6 |= e18Var.h(pz7Var2) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i6 |= e18Var.h(pz7Var3) ? 536870912 : 268435456;
        }
        int i7 = (i3 & 6) == 0 ? i3 | 2 : i3;
        if ((i3 & 48) == 0) {
            i7 |= e18Var.f(e0gVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i7 |= e18Var.f(ffhVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i3 & 3072) == 0) {
            mncVar2 = mncVar;
            i7 |= e18Var.f(mncVar2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            mncVar2 = mncVar;
        }
        if (e18Var.Q(i6 & 1, ((306783379 & i6) == 306783378 && ((i7 | 24576) & 9363) == 9362) ? false : true)) {
            e18Var.V();
            if ((i2 & 1) == 0 || e18Var.A()) {
                wgh wghVar4 = new wgh();
                mp9Var3 = mp9.g;
                j9fVarY = mpk.Y(e18Var);
                z3 = true;
                wghVar3 = wghVar4;
            } else {
                e18Var.T();
                z3 = z;
                wghVar3 = wghVar;
                mp9Var3 = mp9Var;
                j9fVarY = j9fVar;
            }
            e18Var.q();
            e18Var.a0(1647363481);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = vb7.f(e18Var);
            }
            final zub zubVar = (zub) objN;
            e18Var.p(false);
            e18Var.a0(-362495780);
            long jD = tkhVar.d();
            if (jD == 16) {
                jD = ffhVar.e(z3, false, ((Boolean) zh4.m(zubVar, e18Var, 0).getValue()).booleanValue());
            }
            long j2 = jD;
            e18Var.p(false);
            final tkh tkhVarF = tkhVar.f(new tkh(j2, 0L, null, null, null, 0L, 0L, 0, 0, 0L, null, 16777214));
            final mnc mncVar3 = mncVar2;
            j8.c(okh.a.a(ffhVar.k), fd9.q0(-416142558, new pz7() { // from class: nlc
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ld4 ld4Var2 = (ld4) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    e18 e18Var2 = (e18) ld4Var2;
                    if (e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        e18Var2.a0(-2026714080);
                        e18Var2.p(false);
                        iqb iqbVarB = iqbVar.B(fqb.E);
                        dch.E(R.string.default_error_message, e18Var2);
                        iqb iqbVarA = b.a(iqbVarB, 280.0f, 56.0f);
                        ffh ffhVar2 = ffhVar;
                        eeg eegVar = new eeg(ffhVar2.i);
                        boolean z4 = z3;
                        zub zubVar2 = zubVar;
                        ta4 ta4VarQ0 = fd9.q0(-98391231, new sq(z4, zubVar2, ffhVar2, e0gVar, 12), e18Var2);
                        yih yihVar2 = yihVar;
                        dhh dhhVar2 = dhhVar;
                        bg1.a(yihVar2, iqbVarA, z4, null, tkhVarF, mp9Var3, dhhVar2, zubVar2, eegVar, new x31(yihVar2, dhhVar2, wghVar3, pz7Var, pz7Var2, pz7Var3, z4, zubVar2, mncVar3, ffhVar2, ta4VarQ0), j9fVarY, e18Var2, 0, 0);
                    } else {
                        e18Var2.T();
                    }
                    return iei.a;
                }
            }, e18Var), e18Var, 56);
            wghVar2 = wghVar3;
            z2 = z3;
            mp9Var2 = mp9Var3;
            j9fVar2 = j9fVarY;
        } else {
            e18Var.T();
            z2 = z;
            wghVar2 = wghVar;
            mp9Var2 = mp9Var;
            j9fVar2 = j9fVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: plc
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(i2 | 1);
                    int iP02 = x44.p0(i3);
                    kxk.b(yihVar, iqbVar, z2, tkhVar, wghVar2, pz7Var, pz7Var2, pz7Var3, mp9Var2, dhhVar, j9fVar2, e0gVar, ffhVar, mncVar, (ld4) obj, iP0, iP02);
                    return iei.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:268:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.cjh r49, final defpackage.bz7 r50, final defpackage.iqb r51, boolean r52, defpackage.tkh r53, defpackage.pz7 r54, final defpackage.pz7 r55, defpackage.pz7 r56, defpackage.pz7 r57, boolean r58, final defpackage.pzi r59, final defpackage.mp9 r60, defpackage.kp9 r61, final boolean r62, int r63, int r64, defpackage.e0g r65, final defpackage.ffh r66, defpackage.ld4 r67, final int r68, final int r69, final int r70, final int r71) {
        /*
            Method dump skipped, instruction units count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kxk.c(cjh, bz7, iqb, boolean, tkh, pz7, pz7, pz7, pz7, boolean, pzi, mp9, kp9, boolean, int, int, e0g, ffh, ld4, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:311:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final java.lang.String r49, final defpackage.bz7 r50, defpackage.iqb r51, boolean r52, boolean r53, defpackage.tkh r54, defpackage.pz7 r55, defpackage.pz7 r56, defpackage.pz7 r57, defpackage.pz7 r58, defpackage.pz7 r59, boolean r60, defpackage.pzi r61, defpackage.mp9 r62, defpackage.kp9 r63, boolean r64, int r65, int r66, defpackage.e0g r67, defpackage.ffh r68, defpackage.ld4 r69, final int r70, final int r71, final int r72, final int r73) {
        /*
            Method dump skipped, instruction units count: 1193
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kxk.d(java.lang.String, bz7, iqb, boolean, boolean, tkh, pz7, pz7, pz7, pz7, pz7, boolean, pzi, mp9, kp9, boolean, int, int, e0g, ffh, ld4, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:262:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x058c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final defpackage.pz7 r40, defpackage.rz7 r41, defpackage.pz7 r42, final defpackage.pz7 r43, final defpackage.pz7 r44, final defpackage.pz7 r45, final defpackage.pz7 r46, final boolean r47, final defpackage.wgh r48, final defpackage.ogh r49, final defpackage.ogh r50, final defpackage.ogh r51, final defpackage.bz7 r52, final defpackage.ta4 r53, defpackage.pz7 r54, defpackage.mnc r55, defpackage.ld4 r56, final int r57, final int r58) {
        /*
            Method dump skipped, instruction units count: 1633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kxk.e(pz7, rz7, pz7, pz7, pz7, pz7, pz7, boolean, wgh, ogh, ogh, ogh, bz7, ta4, pz7, mnc, ld4, int, int):void");
    }

    public static final void f(final nfe nfeVar, bz7 bz7Var, zy7 zy7Var, ld4 ld4Var, int i2) {
        int i3;
        e18 e18Var;
        nfeVar.getClass();
        bz7Var.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-513177912);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (e18Var2.f(nfeVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var2.h(bz7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= e18Var2.h(zy7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        final byte b2 = 0;
        final int i5 = 1;
        if (e18Var2.Q(i3 & 1, (i3 & 147) != 146)) {
            zy1 zy1Var = nfeVar.d;
            boolean z = (i3 & 112) == 32;
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (z || objN == lz1Var) {
                objN = new vp6(i4, null, bz7Var);
                e18Var2.k0(objN);
            }
            x44.b(zy1Var, (pz7) objN, e18Var2, 0);
            boolean z2 = ((i3 & 896) == 256) | ((i3 & 14) == 4);
            Object objN2 = e18Var2.N();
            int i6 = 21;
            if (z2 || objN2 == lz1Var) {
                objN2 = new aac(nfeVar, i6, zy7Var);
                e18Var2.k0(objN2);
            }
            e18Var = e18Var2;
            trk.b((zy7) objN2, fd9.q0(1852115141, new pz7() { // from class: pfe
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    int i7 = b2;
                    lz1 lz1Var2 = jd4.a;
                    iei ieiVar = iei.a;
                    switch (i7) {
                        case 0:
                            ld4 ld4Var2 = (ld4) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            e18 e18Var3 = (e18) ld4Var2;
                            if (!e18Var3.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                e18Var3.T();
                            } else {
                                String strJ0 = d4c.j0(R.string.chat_menu_rename, e18Var3);
                                nfe nfeVar2 = nfeVar;
                                boolean zBooleanValue = ((Boolean) nfeVar2.f.getValue()).booleanValue();
                                boolean zF = e18Var3.f(nfeVar2);
                                Object objN3 = e18Var3.N();
                                if (zF || objN3 == lz1Var2) {
                                    mx5 mx5Var = new mx5(0, nfeVar2, nfe.class, "submitRename", "submitRename()V", 0, 25);
                                    e18Var3.k0(mx5Var);
                                    objN3 = mx5Var;
                                }
                                bhk.a(strJ0, zBooleanValue, (zy7) ((jm9) objN3), null, e18Var3, 0, 8);
                            }
                            break;
                        default:
                            ld4 ld4Var3 = (ld4) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            e18 e18Var4 = (e18) ld4Var3;
                            if (!e18Var4.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                e18Var4.T();
                            } else {
                                q64 q64VarA = p64.a(ko0.c, lja.T, e18Var4, 48);
                                int iHashCode = Long.hashCode(e18Var4.T);
                                hyc hycVarL = e18Var4.l();
                                fqb fqbVar = fqb.E;
                                iqb iqbVarE = kxk.E(e18Var4, fqbVar);
                                dd4.e.getClass();
                                re4 re4Var = cd4.b;
                                e18Var4.e0();
                                if (e18Var4.S) {
                                    e18Var4.k(re4Var);
                                } else {
                                    e18Var4.n0();
                                }
                                d4c.i0(e18Var4, cd4.f, q64VarA);
                                d4c.i0(e18Var4, cd4.e, hycVarL);
                                d4c.i0(e18Var4, cd4.g, Integer.valueOf(iHashCode));
                                d4c.h0(e18Var4, cd4.h);
                                d4c.i0(e18Var4, cd4.d, iqbVarE);
                                Object objN4 = e18Var4.N();
                                if (objN4 == lz1Var2) {
                                    objN4 = ij0.d(e18Var4);
                                }
                                bt7 bt7Var = (bt7) objN4;
                                nfe nfeVar3 = nfeVar;
                                cjh cjhVar = (cjh) nfeVar3.e.getValue();
                                boolean zF2 = e18Var4.f(nfeVar3);
                                Object objN5 = e18Var4.N();
                                if (zF2 || objN5 == lz1Var2) {
                                    pac pacVar = new pac(1, nfeVar3, nfe.class, "updateNameInput", "updateNameInput(Landroidx/compose/ui/text/input/TextFieldValue;)V", 0, 22);
                                    e18Var4.k0(pacVar);
                                    objN5 = pacVar;
                                }
                                mwa.a(cjhVar, (bz7) ((jm9) objN5), d4c.j0(R.string.chat_menu_rename_dialog_title, e18Var4), iv1.s(fqbVar, bt7Var), false, null, null, null, null, null, null, null, true, 0, 0, 0L, null, e18Var4, 100663296, 1572864, 2031344);
                                Object objN6 = e18Var4.N();
                                if (objN6 == lz1Var2) {
                                    objN6 = new fz3(bt7Var, null, 9);
                                    e18Var4.k0(objN6);
                                }
                                fd9.i(e18Var4, (pz7) objN6, ieiVar);
                                e18Var4.p(true);
                            }
                            break;
                    }
                    return ieiVar;
                }
            }, e18Var2), null, fd9.q0(1021461507, new sxa(zy7Var, i6, b2), e18Var2), vsk.a, fd9.q0(-224518944, new pz7() { // from class: pfe
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    int i7 = i5;
                    lz1 lz1Var2 = jd4.a;
                    iei ieiVar = iei.a;
                    switch (i7) {
                        case 0:
                            ld4 ld4Var2 = (ld4) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            e18 e18Var3 = (e18) ld4Var2;
                            if (!e18Var3.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                e18Var3.T();
                            } else {
                                String strJ0 = d4c.j0(R.string.chat_menu_rename, e18Var3);
                                nfe nfeVar2 = nfeVar;
                                boolean zBooleanValue = ((Boolean) nfeVar2.f.getValue()).booleanValue();
                                boolean zF = e18Var3.f(nfeVar2);
                                Object objN3 = e18Var3.N();
                                if (zF || objN3 == lz1Var2) {
                                    mx5 mx5Var = new mx5(0, nfeVar2, nfe.class, "submitRename", "submitRename()V", 0, 25);
                                    e18Var3.k0(mx5Var);
                                    objN3 = mx5Var;
                                }
                                bhk.a(strJ0, zBooleanValue, (zy7) ((jm9) objN3), null, e18Var3, 0, 8);
                            }
                            break;
                        default:
                            ld4 ld4Var3 = (ld4) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            e18 e18Var4 = (e18) ld4Var3;
                            if (!e18Var4.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                e18Var4.T();
                            } else {
                                q64 q64VarA = p64.a(ko0.c, lja.T, e18Var4, 48);
                                int iHashCode = Long.hashCode(e18Var4.T);
                                hyc hycVarL = e18Var4.l();
                                fqb fqbVar = fqb.E;
                                iqb iqbVarE = kxk.E(e18Var4, fqbVar);
                                dd4.e.getClass();
                                re4 re4Var = cd4.b;
                                e18Var4.e0();
                                if (e18Var4.S) {
                                    e18Var4.k(re4Var);
                                } else {
                                    e18Var4.n0();
                                }
                                d4c.i0(e18Var4, cd4.f, q64VarA);
                                d4c.i0(e18Var4, cd4.e, hycVarL);
                                d4c.i0(e18Var4, cd4.g, Integer.valueOf(iHashCode));
                                d4c.h0(e18Var4, cd4.h);
                                d4c.i0(e18Var4, cd4.d, iqbVarE);
                                Object objN4 = e18Var4.N();
                                if (objN4 == lz1Var2) {
                                    objN4 = ij0.d(e18Var4);
                                }
                                bt7 bt7Var = (bt7) objN4;
                                nfe nfeVar3 = nfeVar;
                                cjh cjhVar = (cjh) nfeVar3.e.getValue();
                                boolean zF2 = e18Var4.f(nfeVar3);
                                Object objN5 = e18Var4.N();
                                if (zF2 || objN5 == lz1Var2) {
                                    pac pacVar = new pac(1, nfeVar3, nfe.class, "updateNameInput", "updateNameInput(Landroidx/compose/ui/text/input/TextFieldValue;)V", 0, 22);
                                    e18Var4.k0(pacVar);
                                    objN5 = pacVar;
                                }
                                mwa.a(cjhVar, (bz7) ((jm9) objN5), d4c.j0(R.string.chat_menu_rename_dialog_title, e18Var4), iv1.s(fqbVar, bt7Var), false, null, null, null, null, null, null, null, true, 0, 0, 0L, null, e18Var4, 100663296, 1572864, 2031344);
                                Object objN6 = e18Var4.N();
                                if (objN6 == lz1Var2) {
                                    objN6 = new fz3(bt7Var, null, 9);
                                    e18Var4.k0(objN6);
                                }
                                fd9.i(e18Var4, (pz7) objN6, ieiVar);
                                e18Var4.p(true);
                            }
                            break;
                    }
                    return ieiVar;
                }
            }, e18Var2), null, 0L, 0L, 0L, 0L, null, e18Var, 1772592, 0, 16276);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v76(nfeVar, i2, bz7Var, zy7Var, 25);
        }
    }

    public static final void g(ld4 ld4Var, iqb iqbVar) {
        cw1 cw1Var = cw1.g;
        e18 e18Var = (e18) ld4Var;
        int iHashCode = Long.hashCode(e18Var.T);
        iqb iqbVarE = E(ld4Var, iqbVar);
        hyc hycVarL = e18Var.l();
        dd4.e.getClass();
        re4 re4Var = cd4.b;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.e0();
        if (e18Var2.S) {
            e18Var2.k(re4Var);
        } else {
            e18Var2.n0();
        }
        d4c.i0(ld4Var, cd4.f, cw1Var);
        d4c.i0(ld4Var, cd4.e, hycVarL);
        d4c.h0(ld4Var, cd4.h);
        d4c.i0(ld4Var, cd4.d, iqbVarE);
        d4c.i0(ld4Var, cd4.g, Integer.valueOf(iHashCode));
        e18Var2.p(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final defpackage.rwe r18, final java.lang.String r19, defpackage.iqb r20, defpackage.ojg r21, defpackage.bz7 r22, final defpackage.ta4 r23, defpackage.ld4 r24, final int r25, final int r26) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kxk.h(rwe, java.lang.String, iqb, ojg, bz7, ta4, ld4, int, int):void");
    }

    public static final boolean i(mb6 mb6Var, long j2) {
        if (!mb6Var.E.R) {
            return false;
        }
        z39 z39Var = (z39) yfd.W(mb6Var).k0.H;
        if (!z39Var.y0.R) {
            return false;
        }
        long jK = z39Var.K(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jK >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jK & 4294967295L));
        long j3 = mb6Var.V;
        float f2 = ((int) (j3 >> 32)) + fIntBitsToFloat;
        float f3 = ((int) (j3 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f2) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f3;
    }

    public static final void j(CursorAnchorInfo.Builder builder, yjh yjhVar, l9e l9eVar) {
        if (l9eVar.j()) {
            return;
        }
        qtb qtbVar = yjhVar.b;
        int i2 = qtbVar.f - 1;
        if (i2 < 0) {
            i2 = 0;
        }
        int iE0 = wd6.e0(qtbVar.e(l9eVar.b), 0, i2);
        int iE02 = wd6.e0(qtbVar.e(l9eVar.d), 0, i2);
        if (iE0 > iE02) {
            return;
        }
        while (true) {
            builder.addVisibleLineBounds(yjhVar.f(iE0), qtbVar.f(iE0), yjhVar.g(iE0), qtbVar.b(iE0));
            if (iE0 == iE02) {
                return;
            } else {
                iE0++;
            }
        }
    }

    public static final String k(lj5 lj5Var) {
        lj5Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("service:" + lj5Var.c);
        sb.append(",");
        sb.append("version:" + lj5Var.e);
        sb.append(",");
        sb.append("sdk_version:" + lj5Var.i);
        sb.append(",");
        sb.append("env:" + lj5Var.d);
        String str = lj5Var.g;
        if (str.length() > 0) {
            sb.append(",");
            sb.append("variant:" + str);
        }
        return sb.toString();
    }

    public static final void l(bgj bgjVar, String str) {
        qhj qhjVarB;
        WorkDatabase workDatabase = bgjVar.c;
        workDatabase.getClass();
        ahj ahjVarW = workDatabase.w();
        kz5 kz5VarR = workDatabase.r();
        ArrayList arrayListA0 = x44.a0(str);
        while (!arrayListA0.isEmpty()) {
            String str2 = (String) b54.z0(arrayListA0);
            zfj zfjVarC = ahjVarW.c(str2);
            if (zfjVarC != zfj.G && zfjVarC != zfj.H) {
                ((Number) u00.E(ahjVarW.a, false, true, new hti(str2, 8))).intValue();
            }
            arrayListA0.addAll(kz5VarR.a(str2));
        }
        xhd xhdVar = bgjVar.f;
        xhdVar.getClass();
        synchronized (xhdVar.k) {
            nga.c().getClass();
            xhdVar.i.add(str);
            qhjVarB = xhdVar.b(str);
        }
        xhd.d(qhjVarB, 1);
        Iterator it = bgjVar.e.iterator();
        while (it.hasNext()) {
            ((x6f) it.next()).d(str);
        }
    }

    public static String m(int i2, int i3, int i4, String str, String str2, boolean z) {
        int i5 = (i4 & 1) != 0 ? 0 : i2;
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        int i6 = i3;
        boolean z2 = (i4 & 8) != 0 ? false : z;
        boolean z3 = (i4 & 16) == 0;
        boolean z4 = (i4 & 32) == 0;
        boolean z5 = (i4 & 64) == 0;
        str.getClass();
        return n(str, i5, i6, str2, z2, z3, z4, z5, FreeTypeConstants.FT_LOAD_PEDANTIC);
    }

    public static String n(String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i4) {
        int i5 = (i4 & 1) != 0 ? 0 : i2;
        int length = (i4 & 2) != 0 ? str.length() : i3;
        boolean z5 = (i4 & 8) != 0 ? false : z;
        boolean z6 = (i4 & 16) != 0 ? false : z2;
        boolean z7 = (i4 & 64) == 0 ? z4 : false;
        str.getClass();
        int iCharCount = i5;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i6 = FreeTypeConstants.FT_LOAD_PEDANTIC;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z7) || bsg.v0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z5 || (z6 && !A(iCharCount, length, str)))) || (iCodePointAt == 43 && z3)))) {
                Buffer buffer = new Buffer();
                buffer.S0(i5, iCharCount, str);
                Buffer buffer2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z5 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 32 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            buffer.T0("+");
                        } else if (iCodePointAt2 == 43 && z3) {
                            buffer.T0(z5 ? "+" : "%2B");
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i6 && !z7) || bsg.v0(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z5 || (z6 && !A(iCharCount, length, str)))))) {
                            if (buffer2 == null) {
                                buffer2 = new Buffer();
                            }
                            buffer2.U0(iCodePointAt2);
                            while (!buffer2.F()) {
                                byte b2 = buffer2.readByte();
                                buffer.B0(37);
                                char[] cArr = k;
                                buffer.B0(cArr[((b2 & 255) >> 4) & 15]);
                                buffer.B0(cArr[b2 & 15]);
                            }
                        } else {
                            buffer.U0(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i6 = FreeTypeConstants.FT_LOAD_PEDANTIC;
                }
                return buffer.t0();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i5, length);
    }

    public static iqb o(iqb iqbVar) {
        return iqbVar.B(new af3(new f9c(7)));
    }

    public static iqb p(iqb iqbVar, rz7 rz7Var) {
        return iqbVar.B(new id4(rz7Var));
    }

    public static final boolean r(long j2, long j3) {
        return j2 == j3;
    }

    public static final Object s(e9d e9dVar, String str, vp4 vp4Var) {
        Object objB = e9dVar.b(str, new yeg(27), vp4Var);
        return objB == m45.E ? objB : iei.a;
    }

    public static final qqb t(tqb tqbVar, gh3 gh3Var) {
        tqbVar.getClass();
        gh3Var.getClass();
        xh3 xh3VarU = u(tqbVar, gh3Var);
        if (xh3VarU instanceof qqb) {
            return (qqb) xh3VarU;
        }
        return null;
    }

    public static final xh3 u(tqb tqbVar, gh3 gh3Var) {
        tqbVar.getClass();
        gh3Var.getClass();
        if (tqbVar.F(cne.a) != null) {
            mr9.o();
            return null;
        }
        ww7 ww7VarG = gh3Var.g();
        ww7VarG.getClass();
        d1a d1aVarA0 = tqbVar.a0(ww7VarG);
        List listE = gh3Var.h().a.e();
        g1a g1aVar = d1aVarA0.K;
        Object objL0 = w44.L0(listE);
        objL0.getClass();
        xh3 xh3VarE = g1aVar.e((sxb) objL0, 18);
        if (xh3VarE != null) {
            for (sxb sxbVar : listE.subList(1, listE.size())) {
                if (xh3VarE instanceof qqb) {
                    fab fabVarK0 = ((qqb) xh3VarE).k0();
                    sxbVar.getClass();
                    xh3 xh3VarE2 = fabVarK0.e(sxbVar, 18);
                    xh3VarE = xh3VarE2 instanceof qqb ? (qqb) xh3VarE2 : null;
                    if (xh3VarE != null) {
                    }
                }
            }
            return xh3VarE;
        }
        return null;
    }

    public static final qqb v(tqb tqbVar, gh3 gh3Var, dpf dpfVar) {
        tqbVar.getClass();
        gh3Var.getClass();
        dpfVar.getClass();
        qqb qqbVarT = t(tqbVar, gh3Var);
        return qqbVarT != null ? qqbVarT : dpfVar.H(gh3Var, bnf.e0(bnf.b0(bnf.Z(dl7.E, gh3Var), f06.M)));
    }

    public static ra w(qh9 qh9Var) {
        try {
            return new ra(qh9Var.s("count").k());
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Error", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Error", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Error", e4);
            return null;
        }
    }

    public static final fei y(ld4 ld4Var) {
        WeakHashMap weakHashMap = gdj.x;
        w70 w70Var = s4i.d(ld4Var).g;
        WeakHashMap weakHashMap2 = gdj.x;
        return new fei(w70Var, s4i.d(ld4Var).b);
    }

    public static y19 z(vh6 vh6Var, fhe fheVar, int i2) {
        if ((i2 & 2) != 0) {
            fheVar = fhe.E;
        }
        return new y19(vh6Var, fheVar);
    }

    public abstract boolean q(tk5 tk5Var);

    public abstract Object x(tk5 tk5Var);
}
