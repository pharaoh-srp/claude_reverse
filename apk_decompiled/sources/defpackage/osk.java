package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.deeplink.DeepLinkActivity;
import com.google.android.gms.internal.play_billing.c;
import com.google.android.gms.internal.play_billing.e;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes2.dex */
public abstract class osk {
    public static final ta4 a = new ta4(-1896968894, false, new vb4(25));

    public static final void a(tpg tpgVar, iqb iqbVar, String str, zy7 zy7Var, ld4 ld4Var, int i) {
        iqb iqbVar2;
        String str2;
        tpgVar.getClass();
        String str3 = tpgVar.b;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-209987429);
        int i2 = i | (e18Var.h(tpgVar) ? 4 : 2) | 48 | (e18Var.f(str) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = (str3 == null || (str2 = tpgVar.c) == null || !isg.q0(str2, "image/", true)) ? false : true;
            fqb fqbVar = fqb.E;
            iqb iqbVarC = b.c(fqbVar, 1.0f);
            cxe cxeVarA = axe.a(ko0.b, lja.P, e18Var, 6);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarC);
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
            if (!z || zy7Var == null) {
                e18Var.a0(-839202192);
                b(tpgVar.a, e18Var, 0);
                e18Var.p(false);
            } else {
                e18Var.a0(-839425206);
                if (str3 == null) {
                    sz6.p("Required value was null.");
                    return;
                } else {
                    c(str3, tpgVar.a, str, zy7Var, e18Var, i2 & 8064);
                    e18Var.p(false);
                }
            }
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fn(i, 26, zy7Var, iqbVar2, tpgVar, str);
        }
    }

    public static final void b(String str, ld4 ld4Var, int i) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1663366145);
        int i2 = (e18Var2.f(str) ? 4 : 2) | i;
        if (e18Var2.Q(i2 & 1, (i2 & 3) != 2)) {
            e18Var = e18Var2;
            tjh.b(d4c.k0(R.string.conway_attachment_label, new Object[]{str}, e18Var2), gb9.K(yfd.p(fqb.E, gm3.a(e18Var2).p, xve.b(10.0f)), 14.0f, 6.0f), gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var, 0, 0, 131064);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new rq(str, i, 19);
        }
    }

    public static final void c(String str, String str2, String str3, zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        String str4;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(953276180);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str4 = str2;
            i2 |= e18Var.f(str4) ? 32 : 16;
        } else {
            str4 = str2;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(str3) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            vve vveVarB = xve.b(10.0f);
            Context context = (Context) e18Var.j(w00.b);
            boolean z = ((i2 & 14) == 4) | ((i2 & 896) == 256);
            Object objN = e18Var.N();
            if (z || objN == jd4.a) {
                fx8 fx8Var = new fx8(context);
                fx8Var.c = str;
                if (str3 != null) {
                    z0c z0cVarO = o(str3);
                    efe efeVar = lx8.a;
                    fx8Var.d().a(lx8.b, z0cVarO);
                }
                objN = fx8Var.a();
                e18Var.k0(objN);
            }
            jx8 jx8Var = (jx8) objN;
            vo1 vo1Var = lja.U;
            ho0 ho0Var = new ho0(4.0f, true, new sz6(1));
            fqb fqbVar = fqb.E;
            iqb iqbVarC = androidx.compose.foundation.b.c(fqbVar, false, null, null, null, zy7Var, 15);
            q64 q64VarA = p64.a(ho0Var, vo1Var, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarC);
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
            nuk.e(jx8Var, str4, ez1.t(yfd.p(xn5.V(b.o(fqbVar, 64.0f), vveVarB), gm3.a(e18Var).p, zni.b), 1.0f, gm3.a(e18Var).u, vveVarB), null, null, null, ho4.a, MTTypesetterKt.kLineSkipLimitMultiplier, 0, false, e18Var, (i2 & 112) | 12582912, 3960);
            tjh.b(str2, gb9.L(b.v(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 120.0f, 1), 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, ((i2 >> 3) & 14) | 48, 24960, 110584);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xd(str, str2, str3, zy7Var, i, 26);
        }
    }

    public static final void d(Map map, iqb iqbVar, ld4 ld4Var, int i) throws IOException {
        iqb iqbVar2;
        map.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(2003438555);
        int i2 = (e18Var.f(map) ? 4 : 2) | i | 48;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            List listI1 = w44.i1(map.entrySet(), new mt7(25));
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new fc4(26);
                e18Var.k0(objN);
            }
            String strS0 = w44.S0(listI1, ", ", null, null, (bz7) objN, 30);
            ho0 ho0Var = new ho0(8.0f, true, new sz6(1));
            wo1 wo1Var = lja.Q;
            fqb fqbVar = fqb.E;
            iqb iqbVarK = gb9.K(yfd.p(b.c(fqbVar, 1.0f), gm3.a(e18Var).p, xve.b(8.0f)), 12.0f, 8.0f);
            cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarK);
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
            iv1.b(ud0.H1, null, null, ef2.F, gm3.a(e18Var).y, e18Var, 3120, 4);
            tjh.b("Unknown frames: ".concat(strS0), null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 131066);
            e18Var = e18Var;
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new t04(map, iqbVar2, i, 22);
        }
    }

    public static final void e(mpg mpgVar, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        iqb iqbVar2;
        mpgVar.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1427930093);
        int i2 = (e18Var2.h(mpgVar) ? 4 : 2) | i | 48;
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            e18Var = e18Var2;
            String str = mpgVar.a;
            tkh tkhVar = ((jm3) gm3.c(e18Var).e.E).i;
            long j = gm3.a(e18Var).y;
            fqb fqbVar = fqb.E;
            tjh.b(str, gb9.K(yfd.p(ez1.t(b.c(fqbVar, 1.0f), 1.0f, d54.b(0.2f, gm3.a(e18Var).y), xve.b(10.0f)), d54.b(0.06f, gm3.a(e18Var).y), xve.b(10.0f)), 16.0f, 10.0f), j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var, 0, 0, 131064);
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new t04(mpgVar, iqbVar2, i, 23);
        }
    }

    public static final void f(String str, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        String strN;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(520212899);
        int i2 = (e18Var.f(str) ? 4 : 2) | i | 48;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            ho0 ho0Var = new ho0(8.0f, true, new sz6(1));
            wo1 wo1Var = lja.Q;
            fqb fqbVar = fqb.E;
            iqb iqbVarL = gb9.L(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 4.0f, 1);
            cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarL);
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
            tjd.a(b.o(fqbVar, 20.0f), gm3.a(e18Var).c, 2.0f, 0L, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, 390, 56);
            if (str == null) {
                strN = vb7.n(e18Var, 952738159, R.string.conway_loading_thinking, e18Var, false);
            } else {
                e18Var.a0(952737911);
                e18Var.p(false);
                strN = str;
            }
            tjh.b(strN, new hw9(1.0f, true), gm3.a(e18Var).O, 0L, new wu7(1), null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 24960, 110552);
            e18Var = e18Var;
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ip(str, iqbVar2, i, 10);
        }
    }

    public static final void g(opg opgVar, boolean z, zy7 zy7Var, iqb iqbVar, boolean z2, ld4 ld4Var, int i) {
        iqb iqbVar2;
        opgVar.getClass();
        String str = opgVar.b;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-958128241);
        int i2 = i | (e18Var.h(opgVar) ? 4 : 2) | (e18Var.g(z) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072 | (e18Var.g(z2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            String strJ1 = bsg.j1(60, str);
            wo1 wo1Var = lja.Q;
            ho0 ho0Var = new ho0(12.0f, true, new sz6(1));
            fqb fqbVar = fqb.E;
            iqb iqbVarJ = gb9.J(androidx.compose.foundation.b.c(yfd.p(ez1.t(b.c(fqbVar, 1.0f), 1.0f, gm3.a(e18Var).u, xve.b(10.0f)), gm3.a(e18Var).p, xve.b(10.0f)), z2, null, null, null, zy7Var, 14), 12.0f);
            cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarJ);
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
            ud0 ud0Var = z ? ud0.V0 : ud0.Y0;
            String strK0 = d4c.k0(z ? R.string.conway_speak_pause_with_text : R.string.conway_speak_play_with_text, new Object[]{strJ1}, e18Var);
            long j = gm3.a(e18Var).c;
            ef2 ef2Var = ef2.F;
            iv1.b(ud0Var, strK0, null, ef2Var, j, e18Var, 3072, 4);
            tjh.b(str, new hw9(1.0f, true), gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 24960, 110584);
            e18Var = e18Var;
            iv1.b(ud0.q1, null, null, ef2Var, gm3.a(e18Var).O, e18Var, 3120, 4);
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new iw0(opgVar, z, zy7Var, iqbVar2, z2, i);
        }
    }

    public static final void h(rpg rpgVar, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        iqb iqbVar2;
        rpgVar.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1309151149);
        int i2 = (e18Var2.h(rpgVar) ? 4 : 2) | i | 48;
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            e18Var = e18Var2;
            String str = rpgVar.a;
            tkh tkhVarB = tkh.b(((jm3) gm3.c(e18Var).e.E).i, 0L, 0L, null, new wu7(1), null, 0L, null, 0, 0L, null, 0, 16777207);
            long j = gm3.a(e18Var).O;
            fqb fqbVar = fqb.E;
            tjh.b(str, b.c(fqbVar, 1.0f), j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVarB, e18Var, 0, 0, 131064);
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new t04(rpgVar, iqbVar2, i, 19);
        }
    }

    public static final void i(spg spgVar, iqb iqbVar, ld4 ld4Var, int i) throws IOException {
        iqb iqbVar2;
        spgVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-730529797);
        int i2 = (e18Var.h(spgVar) ? 4 : 2) | i | 48;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            JsonObject jsonObject = spgVar.b;
            ide ideVar = mw4.a;
            jsonObject.getClass();
            Collection<JsonElement> collectionValues = jsonObject.values();
            ArrayList arrayList = new ArrayList();
            for (JsonElement jsonElement : collectionValues) {
                String content = null;
                JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
                if (jsonPrimitive != null) {
                    if (!jsonPrimitive.isString()) {
                        jsonPrimitive = null;
                    }
                    if (jsonPrimitive != null) {
                        content = jsonPrimitive.getContent();
                    }
                }
                if (content != null) {
                    arrayList.add(content);
                }
            }
            String strS0 = w44.S0(arrayList, " ", null, null, null, 62);
            Pattern patternCompile = Pattern.compile("\\s+");
            patternCompile.getClass();
            String strReplaceAll = patternCompile.matcher(strS0).replaceAll(" ");
            strReplaceAll.getClass();
            String string = bsg.k1(strReplaceAll).toString();
            if (string.length() > 100) {
                string = bsg.j1(100, string).concat("…");
            }
            String str = string;
            ho0 ho0Var = new ho0(2.0f, true, new sz6(1));
            fqb fqbVar = fqb.E;
            iqb iqbVarC = b.c(fqbVar, 1.0f);
            q64 q64VarA = p64.a(ho0Var, lja.S, e18Var, 6);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarC);
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
            tjh.b(spgVar.a, null, gm3.a(e18Var).c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).j, e18Var, 0, 0, 131066);
            e18Var = e18Var;
            if (str.length() > 0) {
                e18Var.a0(1171770550);
                tjh.b(str, null, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, (tkh) ((wk) gm3.c(e18Var).e.F).i, e18Var, 0, 24960, 110586);
                e18Var = e18Var;
                e18Var.p(false);
            } else {
                e18Var.a0(1172021681);
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
            r7eVarS.d = new t04(spgVar, iqbVar2, i, 21);
        }
    }

    public static final void j(upg upgVar, iqb iqbVar, sfb sfbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        upgVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1271845278);
        int i2 = 4;
        int i3 = i | (e18Var.h(upgVar) ? 4 : 2) | 48 | (e18Var.d(sfbVar == null ? -1 : sfbVar.ordinal()) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            wo1 wo1Var = lja.R;
            fqb fqbVar = fqb.E;
            iqb iqbVarN = gb9.N(b.c(fqbVar, 1.0f), 36.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 14);
            cxe cxeVarA = axe.a(ko0.b, wo1Var, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarN);
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
            pzg.a(null, gm3.b(e18Var).v, gm3.a(e18Var).q, gm3.a(e18Var).M, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, sf5.a(MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).v), fd9.q0(1985058819, new mk4(i2, upgVar), e18Var), e18Var, 12582912, 49);
            e18Var = e18Var;
            int i4 = sfbVar == null ? -1 : rw4.a[sfbVar.ordinal()];
            if (i4 != -1) {
                ef2 ef2Var = ef2.F;
                if (i4 == 1) {
                    e18Var.a0(1842467581);
                    iv1.b(ud0.Q, null, gb9.N(fqbVar, 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 14), ef2Var, gm3.a(e18Var).O, e18Var, 3504, 0);
                    e18Var.p(false);
                } else if (i4 == 2) {
                    e18Var.a0(1842806039);
                    iv1.b(ud0.M, null, gb9.N(fqbVar, 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 14), ef2Var, gm3.a(e18Var).O, e18Var, 3504, 0);
                    e18Var.p(false);
                } else if (i4 != 3) {
                    if (i4 != 4) {
                        throw ebh.u(e18Var, -1048945528, false);
                    }
                    e18Var.a0(-1048910942);
                    e18Var.p(false);
                } else {
                    e18Var.a0(1843150635);
                    iv1.b(ud0.N, null, gb9.N(fqbVar, 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 14), ef2Var, gm3.a(e18Var).c, e18Var, 3504, 0);
                    e18Var.p(false);
                }
                e18Var.p(true);
                iqbVar2 = fqbVar;
            } else {
                e18Var.a0(-1048910942);
                e18Var.p(false);
                e18Var.p(true);
                iqbVar2 = fqbVar;
            }
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new f44(upgVar, i, iqbVar2, sfbVar, 14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02d7  */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(defpackage.vpg r40, defpackage.iqb r41, defpackage.ld4 r42, int r43) {
        /*
            Method dump skipped, instruction units count: 935
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.osk.k(vpg, iqb, ld4, int):void");
    }

    public static final void l(ftc ftcVar, lvh lvhVar, boolean z, String str, boolean z2, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        lvhVar.getClass();
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-209689721);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(ftcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var.f(lvhVar) : e18Var.h(lvhVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(str) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.g(z2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.f(iqbVar) ? 131072 : 65536;
        }
        if (e18Var.Q(i2 & 1, (74899 & i2) != 74898)) {
            psk.e(ftcVar.b, ftcVar.h, ftcVar.d, ftcVar.g, lvhVar, z, str, z2, iqbVar, null, e18Var, (i2 << 9) & 268427264);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new yb2(ftcVar, lvhVar, z, str, z2, iqbVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(defpackage.d0h r6, defpackage.vd1 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.ute
            if (r0 == 0) goto L13
            r0 = r7
            ute r0 = (defpackage.ute) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            ute r0 = new ute
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.F
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            d0h r6 = r0.E
            defpackage.sf5.h0(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            r6 = 0
            return r6
        L2e:
            defpackage.sf5.h0(r7)
        L31:
            r0.E = r6
            r0.G = r2
            u7d r7 = defpackage.u7d.F
            java.lang.Object r7 = r6.a(r7, r0)
            m45 r1 = defpackage.m45.E
            if (r7 != r1) goto L40
            return r1
        L40:
            t7d r7 = (defpackage.t7d) r7
            int r1 = r7.d
            java.util.List r7 = r7.a
            r1 = r1 & 66
            if (r1 == 0) goto L31
            r1 = r7
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r3 = 0
            r4 = r3
        L53:
            if (r4 >= r1) goto L65
            java.lang.Object r5 = r7.get(r4)
            z7d r5 = (defpackage.z7d) r5
            boolean r5 = defpackage.hvj.g(r5)
            if (r5 != 0) goto L62
            goto L31
        L62:
            int r4 = r4 + 1
            goto L53
        L65:
            java.lang.Object r6 = r7.get(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.osk.m(d0h, vd1):java.lang.Object");
    }

    public static bqh n(LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        if (localDateTime.isBefore(localDateTime2)) {
            return new bqh(null, localDateTime, localDateTime2);
        }
        sz6.p("end time needs be after start time");
        return null;
    }

    public static final z0c o(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String lowerCase = "x-organization-uuid".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        Object arrayList = linkedHashMap.get(lowerCase);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(lowerCase, arrayList);
        }
        ((List) arrayList).add(str);
        return new z0c(sta.q0(linkedHashMap));
    }

    public static final Intent p(n9 n9Var, f6i f6iVar, int i, zv zvVar) {
        if (n9Var instanceof ukg) {
            ukg ukgVar = (ukg) n9Var;
            Intent intentR = r(ukgVar, f6iVar, ukgVar.a);
            if (intentR.getData() == null) {
                intentR.setData(cmk.i(f6iVar, i, tb.F, String.valueOf(intentR.getFlags())));
            }
            return intentR;
        }
        if (!(n9Var instanceof us9)) {
            xh6.d("Cannot create fill-in Intent for action type: ", n9Var);
            return null;
        }
        ComponentName componentName = f6iVar.n;
        if (componentName == null) {
            sz6.p("In order to use LambdaAction, actionBroadcastReceiver must be provided");
            return null;
        }
        Intent intentPutExtra = new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", (String) null).putExtra("EXTRA_APPWIDGET_ID", f6iVar.b);
        Intent intent = new Intent();
        intent.setComponent((ComponentName) f6iVar.o.F);
        intent.setData(cmk.i(f6iVar, i, tb.E, ""));
        intent.putExtra("ACTION_TYPE", "BROADCAST");
        intent.putExtra("ACTION_INTENT", intentPutExtra);
        return intent;
    }

    public static final PendingIntent q(n9 n9Var, f6i f6iVar, int i, zv zvVar) {
        Context context = f6iVar.a;
        boolean z = n9Var instanceof ukg;
        tb tbVar = tb.F;
        if (z) {
            ukg ukgVar = (ukg) n9Var;
            Intent intentR = r(ukgVar, f6iVar, ukgVar.a);
            if (intentR.getData() == null) {
                intentR.setData(cmk.i(f6iVar, i, tbVar, String.valueOf(intentR.getFlags())));
            }
            return PendingIntent.getActivity(context, 0, intentR, 201326592, null);
        }
        if (!(n9Var instanceof us9)) {
            xh6.d("Cannot create PendingIntent for action type: ", n9Var);
            return null;
        }
        ComponentName componentName = f6iVar.n;
        if (componentName == null) {
            sz6.p("In order to use LambdaAction, actionBroadcastReceiver must be provided");
            return null;
        }
        Intent intentPutExtra = new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", (String) null).putExtra("EXTRA_APPWIDGET_ID", f6iVar.b);
        intentPutExtra.setData(cmk.i(f6iVar, i, tbVar, null));
        return PendingIntent.getBroadcast(context, 0, intentPutExtra, 201326592);
    }

    public static final Intent r(ukg ukgVar, f6i f6iVar, kub kubVar) {
        if (!(ukgVar instanceof ukg)) {
            xh6.d("Action type not defined in app widget package: ", ukgVar);
            return null;
        }
        Intent intent = new Intent(f6iVar.a, (Class<?>) DeepLinkActivity.class);
        Map mapUnmodifiableMap = Collections.unmodifiableMap(kubVar.a);
        ArrayList arrayList = new ArrayList(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            qb qbVar = (qb) entry.getKey();
            arrayList.add(new cpc(qbVar.a, entry.getValue()));
        }
        cpc[] cpcVarArr = (cpc[]) arrayList.toArray(new cpc[0]);
        intent.putExtras(eve.m((cpc[]) Arrays.copyOf(cpcVarArr, cpcVarArr.length)));
        return intent;
    }

    public static final Object s(e8d e8dVar, bz7 bz7Var, tp4 tp4Var) {
        Object objF = pok.f(e8dVar, new vte(0, null, bz7Var), tp4Var);
        return objF == m45.E ? objF : iei.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean t(defpackage.fr5 r12, boolean r13) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            ssc r0 = new ssc
            r1 = 16
            r0.<init>(r1)
            r2 = 1
            r3 = r2
        L9:
            r4 = 8
            r0.J(r4)
            byte[] r5 = r0.a
            r6 = 0
            boolean r5 = r12.d(r5, r6, r4, r2)
            if (r5 != 0) goto L18
            goto L65
        L18:
            long r7 = r0.B()
            int r5 = r0.m()
            r9 = 1
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 != 0) goto L35
            byte[] r7 = r0.a
            boolean r7 = r12.d(r7, r4, r4, r2)
            if (r7 != 0) goto L2f
            goto L65
        L2f:
            long r7 = r0.F()
            r9 = r1
            goto L36
        L35:
            r9 = r4
        L36:
            long r9 = (long) r9
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L3c
            goto L65
        L3c:
            long r7 = r7 - r9
            int r7 = (int) r7
            if (r3 == 0) goto L66
            r3 = 1718909296(0x66747970, float:2.8862439E23)
            if (r5 != r3) goto L65
            if (r7 >= r4) goto L48
            goto L65
        L48:
            r3 = 4
            r0.J(r3)
            byte[] r4 = r0.a
            r12.d(r4, r6, r3, r6)
            int r3 = r0.m()
            r4 = 1751476579(0x68656963, float:4.333464E24)
            if (r3 == r4) goto L5b
            goto L65
        L5b:
            if (r13 != 0) goto L5e
            goto L6b
        L5e:
            int r7 = r7 + (-4)
            r12.j(r7, r6)
            r3 = r6
            goto L9
        L65:
            return r6
        L66:
            r4 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r5 != r4) goto L6c
        L6b:
            return r2
        L6c:
            if (r7 == 0) goto L9
            r12.j(r7, r6)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.osk.t(fr5, boolean):boolean");
    }

    public static u4l u(at atVar) {
        e eVar = new e();
        eVar.c = new k5l();
        u4l u4lVar = new u4l(eVar);
        eVar.b = u4lVar;
        eVar.a = atVar.getClass();
        try {
            eVar.a = atVar.s(eVar);
            return u4lVar;
        } catch (Exception e) {
            c cVar = new c(e);
            wpk wpkVar = x0l.J;
            p4l p4lVar = u4lVar.F;
            if (wpkVar.p(p4lVar, null, cVar)) {
                x0l.d(p4lVar);
            }
            return u4lVar;
        }
    }
}
