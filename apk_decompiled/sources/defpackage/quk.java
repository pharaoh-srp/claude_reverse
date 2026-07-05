package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.credentials.internal.FrameworkClassParsingException;
import coil3.compose.AsyncImagePainter;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class quk {
    public static final ta4 a = new ta4(-1275699939, false, new cc4(11));

    public static final void a(final e11 e11Var, final String str, final iqb iqbVar, final bz7 bz7Var, final bz7 bz7Var2, final tt ttVar, final jo4 jo4Var, final float f, final hr1 hr1Var, final int i, final boolean z, ld4 ld4Var, final int i2, final int i3) {
        int i4;
        String str2;
        bz7 bz7Var3;
        bz7 bz7Var4;
        tt ttVar2;
        int i5;
        boolean z2;
        int i6;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1236588022);
        if ((i2 & 6) == 0) {
            i4 = (e18Var.f(e11Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            str2 = str;
            i4 |= e18Var.f(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i2 & 384) == 0) {
            i4 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i2 & 3072) == 0) {
            bz7Var3 = bz7Var;
            i4 |= e18Var.h(bz7Var3) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            bz7Var3 = bz7Var;
        }
        if ((i2 & 24576) == 0) {
            bz7Var4 = bz7Var2;
            i4 |= e18Var.h(bz7Var4) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        } else {
            bz7Var4 = bz7Var2;
        }
        if ((196608 & i2) == 0) {
            ttVar2 = ttVar;
            i4 |= e18Var.f(ttVar2) ? 131072 : 65536;
        } else {
            ttVar2 = ttVar;
        }
        if ((1572864 & i2) == 0) {
            i4 |= e18Var.f(jo4Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= e18Var.c(f) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= e18Var.f(hr1Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i5 = i;
            i4 |= e18Var.d(i5) ? 536870912 : 268435456;
        } else {
            i5 = i;
        }
        if ((i3 & 6) == 0) {
            z2 = z;
            i6 = i3 | (e18Var.g(z2) ? 4 : 2);
        } else {
            z2 = z;
            i6 = i3;
        }
        if (e18Var.Q(i4 & 1, ((i4 & 306783379) == 306783378 && (i6 & 3) == 2) ? false : true)) {
            jx8 jx8VarD = fqi.d(e11Var.a, jo4Var, e18Var, (i4 >> 15) & 112);
            fqi.g(jx8VarD);
            iqb iqbVarB = iqbVar.B(new eo4(jx8VarD, e11Var.c, e11Var.b, bz7Var3, bz7Var4, i5, ttVar2, jo4Var, f, hr1Var, z2, fqi.a(e18Var), str2));
            t10 t10Var = t10.h;
            int iHashCode = Long.hashCode(e18Var.T);
            iqb iqbVarE = kxk.E(e18Var, iqbVarB);
            hyc hycVarL = e18Var.l();
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, t10Var);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: o01
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(i2 | 1);
                    int iP02 = x44.p0(i3);
                    quk.a(e11Var, str, iqbVar, bz7Var, bz7Var2, ttVar, jo4Var, f, hr1Var, i, z, (ld4) obj, iP0, iP02);
                    return iei.a;
                }
            };
        }
    }

    public static final void b(Object obj, String str, yw8 yw8Var, iqb iqbVar, bz7 bz7Var, tt ttVar, jo4 jo4Var, float f, int i, boolean z, ld4 ld4Var, int i2, int i3, int i4) {
        int i5 = i2 >> 3;
        e18 e18Var = (e18) ld4Var;
        a(new e11(obj, (p01) e18Var.j(wca.a), yw8Var), str, iqbVar, (i4 & 16) != 0 ? AsyncImagePainter.Z : bz7Var, null, (i4 & 64) != 0 ? lja.K : ttVar, jo4Var, (i4 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? 1.0f : f, null, (i4 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? 1 : i, (i4 & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? true : z, e18Var, (i5 & 234881024) | (i2 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | (29360128 & i5) | ((i3 << 27) & 1879048192), (i3 >> 3) & 14);
    }

    public static final void c(zy7 zy7Var, zy7 zy7Var2, boolean z, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-860722714);
        int i2 = i | (e18Var2.h(zy7Var) ? 4 : 2) | (e18Var2.h(zy7Var2) ? 32 : 16) | (e18Var2.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var2.Q(i2 & 1, (i2 & 1171) != 1170)) {
            e18Var = e18Var2;
            oq5.i(iqbVar, null, null, null, null, 0, gm3.a(e18Var2).o, 0L, null, fd9.q0(865351989, new tw(zy7Var, zy7Var2, z), e18Var2), e18Var, 805306374, 446);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new iy1(i, 1, zy7Var, zy7Var2, iqbVar, z);
        }
    }

    public static final Drawable d(wv8 wv8Var, Resources resources) {
        return wv8Var instanceof ee6 ? ((ee6) wv8Var).a : wv8Var instanceof gr1 ? new BitmapDrawable(resources, ((gr1) wv8Var).a) : new o9(1, wv8Var);
    }

    public static final wv8 e(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? new gr1(((BitmapDrawable) drawable).getBitmap()) : new ee6(drawable);
    }

    public static gr1 f(Bitmap bitmap) {
        return new gr1(bitmap);
    }

    public static l65 g(String str, Bundle bundle) {
        str.getClass();
        bundle.getClass();
        try {
            int iHashCode = str.hashCode();
            if (iHashCode != -1678407252) {
                if (iHashCode != -543568185) {
                    if (iHashCode == -95037569 && str.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        try {
                            String string = bundle.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON");
                            string.getClass();
                            return new x75(string, bundle);
                        } catch (Exception unused) {
                            throw new FrameworkClassParsingException();
                        }
                    }
                } else if (str.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    return new m65(bundle);
                }
            } else if (str.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
                try {
                    String string2 = bundle.getString("androidx.credentials.BUNDLE_KEY_RESPONSE_JSON");
                    string2.getClass();
                    new Bundle().putString("androidx.credentials.BUNDLE_KEY_RESPONSE_JSON", string2);
                    m65 m65Var = new m65();
                    if (string2.length() != 0) {
                        try {
                            new JSONObject(string2);
                            return m65Var;
                        } catch (Exception unused2) {
                        }
                    }
                    throw new IllegalArgumentException("responseJson must not be empty, and must be a valid JSON");
                } catch (Exception unused3) {
                    throw new FrameworkClassParsingException();
                }
            }
            throw new FrameworkClassParsingException();
        } catch (FrameworkClassParsingException unused4) {
            m65 m65Var2 = new m65();
            if (str.length() > 0) {
                return m65Var2;
            }
            sz6.p("type should not be empty");
            return null;
        }
    }

    public static Bitmap h(wv8 wv8Var) {
        int iB = wv8Var.b();
        int iA = wv8Var.a();
        boolean z = wv8Var instanceof gr1;
        Bitmap.Config config = z ? ((gr1) wv8Var).a.getConfig() : null;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (z) {
            Bitmap bitmap = ((gr1) wv8Var).a;
            if (bitmap.getWidth() == iB && bitmap.getHeight() == iA && bitmap.getConfig() == config) {
                return bitmap;
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iB, iA, config);
        wv8Var.e(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public static final String i(String str) {
        Character chValueOf;
        if (str == null) {
            return "?";
        }
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                chValueOf = null;
                break;
            }
            char cCharAt = str.charAt(i);
            if (Character.isLetter(cCharAt)) {
                chValueOf = Character.valueOf(cCharAt);
                break;
            }
            i++;
        }
        if (chValueOf == null) {
            return "?";
        }
        String strValueOf = String.valueOf(chValueOf.charValue());
        strValueOf.getClass();
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return upperCase;
    }

    public static final void j(wjf wjfVar, int i, ks0 ks0Var) {
        wjf wjfVar2;
        wwb wwbVar = new wwb(0, new wjf[16]);
        List listI = wjfVar.i(false, false);
        while (true) {
            wwbVar.e(wwbVar.G, listI);
            while (true) {
                int i2 = wwbVar.G;
                if (i2 == 0) {
                    return;
                }
                wjfVar2 = (wjf) wwbVar.m(i2 - 1);
                boolean zD = v40.D(wjfVar2);
                qjf qjfVar = wjfVar2.d;
                ewb ewbVar = qjfVar.E;
                if (!zD && !ewbVar.c(akf.j)) {
                    m5c m5cVarD = wjfVar2.d();
                    if (m5cVarD == null) {
                        throw sq6.z("Expected semantics node to have a coordinator.");
                    }
                    c79 c79VarR = eve.R(nai.p(m5cVarD, true));
                    if (c79VarR.a < c79VarR.c && c79VarR.b < c79VarR.d) {
                        Object objG = qjfVar.E.g(ojf.e);
                        if (objG == null) {
                            objG = null;
                        }
                        pz7 pz7Var = (pz7) objG;
                        Object objG2 = ewbVar.g(akf.w);
                        v8f v8fVar = (v8f) (objG2 != null ? objG2 : null);
                        if (pz7Var == null || v8fVar == null || ((Number) v8fVar.b.a()).floatValue() <= MTTypesetterKt.kLineSkipLimitMultiplier) {
                            break;
                        }
                        int i3 = 1 + i;
                        ks0Var.invoke(new w8f(wjfVar2, i3, c79VarR, m5cVarD));
                        j(wjfVar2, i3, ks0Var);
                    }
                }
            }
            listI = wjfVar2.i(false, false);
        }
    }
}
