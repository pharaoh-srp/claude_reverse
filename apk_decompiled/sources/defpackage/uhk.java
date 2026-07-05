package defpackage;

import android.util.Log;
import androidx.compose.foundation.layout.b;
import androidx.media3.common.ParserException;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class uhk {
    public static final ta4 a;
    public static final ta4 e;
    public static final ta4 k;
    public static final ta4 l;
    public static final ta4 m;
    public static final ta4 n;
    public static final byte[] o;
    public static final byte[] p;
    public static final ta4 b = new ta4(-1864743298, false, new gb4(12));
    public static final ta4 c = new ta4(-1244740608, false, new gb4(13));
    public static final ta4 d = new ta4(-4735228, false, new gb4(14));
    public static final ta4 f = new ta4(-1388340879, false, new db4(3));
    public static final ta4 g = new ta4(-1856872935, false, new db4(4));
    public static final ta4 h = new ta4(-136160633, false, new db4(5));
    public static final ta4 i = new ta4(-946542398, false, new db4(6));
    public static final ta4 j = new ta4(-1529094042, false, new db4(7));

    static {
        int i2 = 8;
        a = new ta4(-27260995, false, new gb4(i2));
        int i3 = 10;
        e = new ta4(-1253504586, false, new db4(i3));
        k = new ta4(538703644, false, new db4(i2));
        int i4 = 9;
        l = new ta4(-1159443949, false, new db4(i4));
        m = new ta4(570142020, false, new gb4(i4));
        n = new ta4(-173393852, false, new gb4(i3));
        new ta4(2041521440, false, new gb4(11));
        o = new byte[]{0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};
        p = new byte[]{0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};
    }

    public static final void a(bpc bpcVar, String str, zy7 zy7Var, ld4 ld4Var, int i2) {
        int i3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1316824809);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? e18Var.f(bpcVar) : e18Var.h(bpcVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.f(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            e0g e0gVar = gm3.b(e18Var).n;
            qnc qncVar = q02.a;
            csg.a(zy7Var, null, false, e0gVar, q02.a(gm3.a(e18Var).q, gm3.a(e18Var).M, 0L, 0L, e18Var, 12), null, null, new qnc(12.0f, 12.0f, 12.0f, 12.0f), null, fd9.q0(-1095149305, new nw7(bpcVar, 23, str), e18Var), e18Var, ((i3 >> 6) & 14) | 817889280, 358);
            e18Var = e18Var;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v76(bpcVar, i2, str, zy7Var, 23);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.zy7 r23, defpackage.iqb r24, java.lang.String r25, defpackage.mnc r26, defpackage.ta4 r27, defpackage.ld4 r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uhk.b(zy7, iqb, java.lang.String, mnc, ta4, ld4, int, int):void");
    }

    public static final void c(boolean z, boolean z2, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, zy7 zy7Var4, i4g i4gVar, ld4 ld4Var, int i2) {
        int i3;
        zy7Var.getClass();
        zy7Var2.getClass();
        zy7Var3.getClass();
        zy7Var4.getClass();
        i4gVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(762842710);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.g(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i2 & 3072) == 0) {
            i3 |= e18Var.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i2 & 24576) == 0) {
            i3 |= e18Var.h(zy7Var3) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i2) == 0) {
            i3 |= e18Var.h(zy7Var4) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= e18Var.f(i4gVar) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if (e18Var.Q(i3 & 1, (599187 & i3) != 599186)) {
            vo1 vo1Var = lja.T;
            fqb fqbVar = fqb.E;
            iqb iqbVarM = ttj.m(fqbVar, i4gVar);
            q64 q64VarA = p64.a(ko0.c, vo1Var, e18Var, 48);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarM);
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
            kxk.g(e18Var, b.e(fqbVar, 12.0f));
            a(a.a(ud0.n0, e18Var), d4c.j0(R.string.project_knowledge_upload_button, e18Var), zy7Var, e18Var, (i3 & 896) | 8);
            if (z2) {
                sq6.A(8.0f, -41315709, e18Var, e18Var, fqbVar);
                a(a.a(ud0.A, e18Var), d4c.j0(R.string.project_knowledge_camera_button, e18Var), zy7Var3, e18Var, ((i3 >> 6) & 896) | 8);
                e18Var.p(false);
            } else {
                e18Var.a0(-41051434);
                e18Var.p(false);
            }
            if (z) {
                sq6.A(8.0f, -41002919, e18Var, e18Var, fqbVar);
                a(a.a(ud0.B0, e18Var), d4c.j0(R.string.project_knowledge_choose_image_button, e18Var), zy7Var4, e18Var, ((i3 >> 9) & 896) | 8);
                e18Var.p(false);
            } else {
                e18Var.a0(-40729034);
                e18Var.p(false);
            }
            kxk.g(e18Var, b.e(fqbVar, 8.0f));
            a(a.a(ud0.e0, e18Var), d4c.j0(R.string.project_knowledge_create_button, e18Var), zy7Var2, e18Var, ((i3 >> 3) & 896) | 8);
            grc.z(fqbVar, 8.0f, e18Var, true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new wk1(z, z2, zy7Var, zy7Var2, zy7Var3, zy7Var4, i4gVar, i2);
        }
    }

    public static boolean d(xd7 xd7Var) {
        ssc sscVar = new ssc(8);
        int i2 = k79.b(xd7Var, sscVar).a;
        if (i2 != 1380533830 && i2 != 1380333108) {
            return false;
        }
        xd7Var.p(sscVar.a, 0, 4);
        sscVar.M(0);
        int iM = sscVar.m();
        if (iM == 1463899717) {
            return true;
        }
        ysj.j("WavHeaderReader", "Unsupported form type: " + iM);
        return false;
    }

    public static final void e(String str) {
        if (Log.isLoggable("ServiceConnection", 6)) {
            Log.e("ServiceConnection", str);
        }
    }

    public static final void f(String str, Exception exc) {
        if (Log.isLoggable("ServiceConnection", 6)) {
            Log.e("ServiceConnection", str, exc);
        }
    }

    public static zwi g(String str) {
        for (zwi zwiVar : zwi.values()) {
            if (x44.r(zwiVar.E.toString(), str)) {
                return zwiVar;
            }
        }
        pmf.h("Array contains no element matching the predicate.");
        return null;
    }

    public static ws6 h(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("id").m();
            String strM2 = qh9Var.s("type").m();
            strM2.getClass();
            for (int i2 : sq6.H(3)) {
                if (ms6.m(i2).equals(strM2)) {
                    bh9 bh9VarS = qh9Var.s("has_replay");
                    Boolean boolValueOf = bh9VarS != null ? Boolean.valueOf(bh9VarS.a()) : null;
                    strM.getClass();
                    return new ws6(strM, i2, boolValueOf);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type ErrorEventSession", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type ErrorEventSession", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type ErrorEventSession", e4);
            return null;
        }
    }

    public static k79 i(int i2, xd7 xd7Var, ssc sscVar) throws ParserException {
        k79 k79VarB = k79.b(xd7Var, sscVar);
        while (true) {
            int i3 = k79VarB.a;
            if (i3 == i2) {
                return k79VarB;
            }
            ebh.z("Ignoring unknown WAV chunk: ", i3, "WavHeaderReader");
            long j2 = k79VarB.b;
            long j3 = 8 + j2;
            if (j2 % 2 != 0) {
                j3 = 9 + j2;
            }
            if (j3 > 2147483647L) {
                throw ParserException.b("Chunk is too large (~2GB+) to skip; id: " + i3);
            }
            xd7Var.l((int) j3);
            k79VarB = k79.b(xd7Var, sscVar);
        }
    }

    public static boolean j(fhi fhiVar, fhi fhiVar2) {
        fhiVar.getClass();
        fhiVar2.getClass();
        return wjk.t(pyk.U, fhiVar, fhiVar2);
    }

    public static final void k(String str, Exception exc) {
        if (Log.isLoggable("ServiceConnection", 5)) {
            Log.w("ServiceConnection", str, exc);
        }
    }
}
