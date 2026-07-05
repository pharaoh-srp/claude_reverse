package defpackage;

import android.content.Context;
import android.text.format.Formatter;
import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;
import com.anthropic.claude.api.conway.WebhookRecord;
import com.anthropic.claude.code.remote.i;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ktk {
    public static final ta4 a = new ta4(-1106425133, false, new wb4(16));
    public static final ta4 b = new ta4(1858581302, false, new wb4(17));

    static {
        new ta4(-1305267177, false, new ya4(18));
        new ta4(-1197275228, false, new xb4(19));
        new ta4(-1500856909, false, new ya4(19));
        new ta4(735229391, false, new ya4(20));
    }

    public static final void a(String str, jz0 jz0Var, s6a s6aVar, iqb iqbVar, float f, ld4 ld4Var, int i) {
        float f2;
        str.getClass();
        s6aVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1676738812);
        int i2 = (e18Var.f(str) ? 4 : 2) | i | (e18Var.f(jz0Var) ? 32 : 16) | (e18Var.h(s6aVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | 24576;
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            xvk.c(null, fd9.q0(1007415135, new or0(jz0Var, iqbVar, 16.0f, s6aVar, str), e18Var), e18Var, 48, 1);
            f2 = 16.0f;
        } else {
            e18Var.T();
            f2 = f;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new or0(str, jz0Var, s6aVar, iqbVar, f2, i);
        }
    }

    public static final void b(WebhookRecord webhookRecord, bz7 bz7Var, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        iqb iqbVar2;
        webhookRecord.getClass();
        bz7Var.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(786939183);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(webhookRecord) : e18Var.h(webhookRecord) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(bz7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i3 = i2 | 24576;
        if (e18Var.Q(i3 & 1, (i3 & 9363) != 9362)) {
            pp3 pp3Var = (pp3) e18Var.j(ve4.e);
            wo1 wo1Var = lja.Q;
            ho0 ho0Var = new ho0(4.0f, true, new sz6(1));
            fqb fqbVar = fqb.E;
            iqb iqbVarM = gb9.M(b.c(fqbVar, 1.0f), 16.0f, 12.0f, 4.0f, 12.0f);
            cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var, 54);
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
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, cxeVarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            ho0 ho0Var2 = new ho0(4.0f, true, new sz6(1));
            hw9 hw9Var = new hw9(1.0f, true);
            q64 q64VarA = p64.a(ho0Var2, lja.S, e18Var, 6);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, hw9Var);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, q64VarA);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            cxe cxeVarA2 = axe.a(new ho0(8.0f, true, new sz6(1)), wo1Var, e18Var, 54);
            int iHashCode3 = Long.hashCode(e18Var.T);
            hyc hycVarL3 = e18Var.l();
            iqb iqbVarE3 = kxk.E(e18Var, fqbVar);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, cxeVarA2);
            d4c.i0(e18Var, z80Var2, hycVarL3);
            ij0.t(iHashCode3, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE3);
            tjh.b(webhookRecord.getLabel(), null, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 24960, 110586);
            int i4 = i3 & 14;
            c(webhookRecord, null, e18Var, WebhookRecord.$stable | i4);
            e18Var.p(true);
            tjh.b(webhookRecord.getTrigger_word(), null, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (tkh) ((wk) gm3.c(e18Var).e.F).i, e18Var, 0, 0, 131066);
            e18 e18Var2 = e18Var;
            e18Var2.p(true);
            if (htk.h(webhookRecord) == a25.L) {
                e18Var2.a0(1686972913);
                csg.j(zy7Var2, null, false, null, null, null, null, yjk.d, e18Var2, ((i3 >> 9) & 14) | 805306368, 510);
                e18Var2 = e18Var2;
                e18Var2.p(false);
            } else {
                e18Var2.a0(1687278511);
                e18Var2.p(false);
            }
            boolean zH = e18Var2.h(pp3Var) | (i4 == 4 || ((i3 & 8) != 0 && e18Var2.h(webhookRecord)));
            Object objN = e18Var2.N();
            if (zH || objN == jd4.a) {
                objN = new d44(pp3Var, 17, webhookRecord);
                e18Var2.k0(objN);
            }
            ez1.e((zy7) objN, null, false, null, null, yjk.e, e18Var2, 1572864, 62);
            e18 e18Var3 = e18Var2;
            q0h.a(webhookRecord.getEnabled(), bz7Var, null, false, null, e18Var3, i3 & 112, 124);
            e18Var = e18Var3;
            ez1.e(zy7Var, null, false, null, null, yjk.f, e18Var, ((i3 >> 6) & 14) | 1572864, 62);
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pk(webhookRecord, bz7Var, zy7Var, zy7Var2, iqbVar2, i, 10);
        }
    }

    public static final void c(WebhookRecord webhookRecord, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        iqb iqbVar2;
        cpc cpcVar;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(550662726);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var2.f(webhookRecord) : e18Var2.h(webhookRecord) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (e18Var2.Q(i3 & 1, (i3 & 19) != 18)) {
            a25 a25VarH = htk.h(webhookRecord);
            int iOrdinal = a25VarH.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
                e18Var2.a0(905914268);
                cpcVar = new cpc(new d54(gm3.a(e18Var2).q), new d54(gm3.a(e18Var2).M));
                e18Var2.p(false);
            } else {
                if (iOrdinal != 5) {
                    throw ebh.u(e18Var2, 905907594, false);
                }
                e18Var2.a0(905917756);
                cpcVar = new cpc(new d54(gm3.a(e18Var2).p), new d54(gm3.a(e18Var2).N));
                e18Var2.p(false);
            }
            long j = ((d54) cpcVar.E).a;
            long j2 = ((d54) cpcVar.F).a;
            String strJ0 = d4c.j0(a25VarH.F, e18Var2);
            tkh tkhVar = ((jm3) gm3.c(e18Var2).e.E).i;
            e0g e0gVar = gm3.b(e18Var2).d;
            fqb fqbVar = fqb.E;
            e18Var = e18Var2;
            tjh.b(strJ0, gb9.K(yfd.p(fqbVar, j, e0gVar), 6.0f, 2.0f), j2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var, 0, 0, 131064);
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qq(webhookRecord, iqbVar2, i, 17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.fz4 r31, defpackage.pz7 r32, defpackage.bz7 r33, defpackage.sz7 r34, defpackage.iqb r35, defpackage.ld4 r36, int r37, int r38) {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ktk.d(fz4, pz7, bz7, sz7, iqb, ld4, int, int):void");
    }

    public static final void e(rvh rvhVar, ld4 ld4Var, int i) {
        int i2;
        String content;
        String content2;
        v48 v48VarA;
        String content3;
        JsonElement jsonElement;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1670851108);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (e18Var.h(rvhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            Map map = rvhVar.d;
            Object obj = map.get("file_path");
            tp4 tp4Var = null;
            JsonPrimitive jsonPrimitive = obj instanceof JsonPrimitive ? (JsonPrimitive) obj : null;
            String str = "";
            if (jsonPrimitive == null || (content = jsonPrimitive.getContent()) == null) {
                content = "";
            }
            JsonElement jsonElement2 = rvhVar.h;
            JsonObject jsonObject = jsonElement2 instanceof JsonObject ? (JsonObject) jsonElement2 : null;
            String content4 = (jsonObject == null || (jsonElement = (JsonElement) jsonObject.get((Object) "originalFile")) == null) ? null : ch9.j(jsonElement).getContent();
            JsonElement jsonElement3 = jsonObject != null ? (JsonElement) jsonObject.get((Object) "structuredPatch") : null;
            JsonArray jsonArray = jsonElement3 instanceof JsonArray ? (JsonArray) jsonElement3 : null;
            Object obj2 = map.get("old_string");
            JsonPrimitive jsonPrimitive2 = obj2 instanceof JsonPrimitive ? (JsonPrimitive) obj2 : null;
            if (jsonPrimitive2 == null || (content2 = jsonPrimitive2.getContent()) == null) {
                content2 = "";
            }
            Object obj3 = map.get("new_string");
            JsonPrimitive jsonPrimitive3 = obj3 instanceof JsonPrimitive ? (JsonPrimitive) obj3 : null;
            if (jsonPrimitive3 != null && (content3 = jsonPrimitive3.getContent()) != null) {
                str = content3;
            }
            boolean zF = e18Var.f(jsonArray) | e18Var.f(content) | e18Var.f(content2) | e18Var.f(str);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                if (jsonArray == null || jsonArray.isEmpty()) {
                    v48VarA = w48.a(content2, str);
                    fi7 fi7Var = (fi7) w44.N0(v48VarA.a);
                    fi7 fi7Var2 = fi7Var != null ? new fi7(content, content, fi7Var.c, fi7Var.d) : null;
                    if (fi7Var2 != null) {
                        v48VarA = new v48(x44.W(fi7Var2));
                    }
                } else {
                    v48VarA = w48.b(jsonArray, content);
                }
                objN = v48VarA;
                e18Var.k0(objN);
            }
            v48 v48Var = (v48) objN;
            boolean zF2 = e18Var.f(content4);
            Object objN2 = e18Var.N();
            if (zF2 || objN2 == lz1Var) {
                objN2 = new se2(i3, tp4Var, content4);
                e18Var.k0(objN2);
            }
            xuj.a(xuj.j(v48Var, null, (pz7) objN2, e18Var, 6), b.c(fqb.E, 1.0f), null, null, false, null, null, null, e18Var, 24632, 236);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ay3(rvhVar, i, 9);
        }
    }

    public static final void f(String str, zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        String str2;
        zy7 zy7Var2 = zy7Var;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(20211032);
        if ((i & 6) == 0) {
            i2 = i | (e18Var.f(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var2) ? 32 : 16;
        }
        int i3 = i2;
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            tjh.b(str, null, gm3.a(e18Var).x, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, i3 & 14, 0, 131066);
            str2 = str;
            e18Var = e18Var;
            bhk.a(d4c.j0(R.string.ccr_read_load_full_file, e18Var), false, zy7Var, null, e18Var, ((i3 << 3) & 896) | 48, 8);
            zy7Var2 = zy7Var;
        } else {
            str2 = str;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fv0(str2, zy7Var2, i, 4);
        }
    }

    public static final void g(rvh rvhVar, i4g i4gVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-195307936);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(rvhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(i4gVar) ? 32 : 16;
        }
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            iqb iqbVarC = b.c(fqb.E, 1.0f);
            qnc qncVarB = i4gVar.b();
            boolean zH = e18Var.h(rvhVar);
            Object objN = e18Var.N();
            if (zH || objN == jd4.a) {
                objN = new d6d(28, rvhVar);
                e18Var.k0(objN);
            }
            knk.h(iqbVarC, null, qncVarB, false, null, null, null, false, null, (bz7) objN, e18Var, 6, 506);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new wvh(rvhVar, i4gVar, i, 0);
        }
    }

    public static final void h(bpc bpcVar, String str, iqb iqbVar, boolean z, h12 h12Var, z02 z02Var, long j, zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        String str2;
        iqb iqbVar2;
        boolean z2;
        h12 h12Var2;
        h12 c12Var;
        int i3;
        boolean z3;
        bpcVar.getClass();
        str.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-149458306);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(bpcVar) : e18Var.h(bpcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i2 |= e18Var.f(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        int i4 = i2 | 3456;
        if ((i & 24576) == 0) {
            i4 = i2 | 11648;
        }
        if ((196608 & i) == 0) {
            i4 |= (262144 & i) == 0 ? e18Var.f(z02Var) : e18Var.h(z02Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= e18Var.e(j) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= e18Var.h(zy7Var) ? 8388608 : 4194304;
        }
        if (e18Var.Q(i4 & 1, (4793491 & i4) != 4793490)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                c12Var = new c12();
                i3 = i4 & (-57345);
                iqbVar2 = fqb.E;
                z3 = true;
            } else {
                e18Var.T();
                i3 = i4 & (-57345);
                iqbVar2 = iqbVar;
                z3 = z;
                c12Var = h12Var;
            }
            e18Var.q();
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = vb7.f(e18Var);
            }
            zub zubVar = (zub) objN;
            boolean zBooleanValue = ((Boolean) awj.j(zubVar, e18Var).getValue()).booleanValue();
            a12.E.getClass();
            int i5 = i3 << 3;
            i(bpcVar, str2, !z3 ? a12.H : zBooleanValue ? a12.G : a12.F, iqbVar2, c12Var, z02Var, j, zubVar, zy7Var, e18Var, (i5 & 7168) | (i3 & 14) | 12582920 | (i3 & 112) | (458752 & i3) | (i3 & 3670016) | (234881024 & i5));
            h12Var2 = c12Var;
            z2 = z3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            z2 = z;
            h12Var2 = h12Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xu8(bpcVar, str, iqbVar2, z2, h12Var2, z02Var, j, zy7Var, i);
        }
    }

    public static final void i(bpc bpcVar, String str, a12 a12Var, iqb iqbVar, h12 h12Var, z02 z02Var, long j, zub zubVar, zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        zy7 zy7Var2;
        bpcVar.getClass();
        str.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1192258156);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(bpcVar) : e18Var.h(bpcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= e18Var.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.d(a12Var.ordinal()) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? e18Var.f(h12Var) : e18Var.h(h12Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? e18Var.f(z02Var) : e18Var.h(z02Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var.e(j) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= e18Var.f(zubVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            zy7Var2 = zy7Var;
            i2 |= e18Var.h(zy7Var2) ? 67108864 : 33554432;
        } else {
            zy7Var2 = zy7Var;
        }
        if (e18Var.Q(i2 & 1, (38347923 & i2) != 38347922)) {
            e18Var.V();
            if ((i & 1) != 0 && !e18Var.A()) {
                e18Var.T();
            }
            e18Var.q();
            int i4 = i2 >> 3;
            ysj.a(zy7Var2, b.t(iqbVar, z02Var.d(e18Var)), a12Var, h12Var, z02Var, j, null, zubVar, fd9.q0(-534284416, new xg4(bpcVar, str, z02Var, i3), e18Var), e18Var, (i4 & 7168) | ((i2 >> 24) & 14) | 102236160 | (i2 & 896) | (57344 & i4) | (458752 & i4) | (i2 & 29360128), 0);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new u02(bpcVar, str, a12Var, iqbVar, h12Var, z02Var, j, zubVar, zy7Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(defpackage.bz7 r22, defpackage.iqb r23, java.lang.String r24, defpackage.ld4 r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ktk.j(bz7, iqb, java.lang.String, ld4, int, int):void");
    }

    public static final void k(final rvh rvhVar, final pz7 pz7Var, ld4 ld4Var, final int i) {
        int i2;
        e18 e18Var;
        final pz7 pz7Var2;
        r7e r7eVarS;
        pz7 pz7Var3;
        String content;
        ta4 ta4Var;
        Integer numG;
        Integer numG2;
        String content2;
        Integer numG3;
        Integer numG4;
        JsonElement jsonElement;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1162942843);
        if ((i & 6) == 0) {
            i2 = (e18Var2.h(rvhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var2.f(pz7Var) : e18Var2.h(pz7Var) ? 32 : 16;
        }
        final int i3 = 1;
        final int i4 = 0;
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            String strJ0 = d4c.j0(R.string.ccr_tool_no_content, e18Var2);
            JsonElement jsonElement2 = rvhVar.h;
            String str = rvhVar.a;
            Map map = rvhVar.d;
            JsonObject jsonObject = jsonElement2 instanceof JsonObject ? (JsonObject) jsonElement2 : null;
            JsonObject jsonObjectI = (jsonObject == null || (jsonElement = (JsonElement) jsonObject.get((Object) "file")) == null) ? null : ch9.i(jsonElement);
            Object obj = map.get("file_path");
            JsonPrimitive jsonPrimitive = obj instanceof JsonPrimitive ? (JsonPrimitive) obj : null;
            if (jsonPrimitive == null || (content = jsonPrimitive.getContent()) == null) {
                content = "";
            }
            if (jsonObjectI == null) {
                e18Var2.a0(-2023640015);
                String strE = bwh.e(rvhVar.g);
                if (strE != null) {
                    strJ0 = strE;
                }
                Object obj2 = map.get("offset");
                JsonPrimitive jsonPrimitive2 = obj2 instanceof JsonPrimitive ? (JsonPrimitive) obj2 : null;
                int iIntValue = (jsonPrimitive2 == null || (numG4 = ch9.g(jsonPrimitive2)) == null) ? 0 : numG4.intValue();
                Object obj3 = map.get("limit");
                JsonPrimitive jsonPrimitive3 = obj3 instanceof JsonPrimitive ? (JsonPrimitive) obj3 : null;
                ltk.f(content, strJ0, (jsonPrimitive3 == null || (numG3 = ch9.g(jsonPrimitive3)) == null) ? -1 : numG3.intValue(), iIntValue, null, null, e18Var2, 0, 48);
                e18Var2.p(false);
                r7eVarS = e18Var2.s();
                if (r7eVarS != null) {
                    pz7Var3 = new pz7() { // from class: vvh
                        @Override // defpackage.pz7
                        public final Object invoke(Object obj4, Object obj5) {
                            int i5 = i4;
                            iei ieiVar = iei.a;
                            int i6 = i;
                            pz7 pz7Var4 = pz7Var;
                            rvh rvhVar2 = rvhVar;
                            ld4 ld4Var2 = (ld4) obj4;
                            ((Integer) obj5).intValue();
                            switch (i5) {
                                case 0:
                                    ktk.k(rvhVar2, pz7Var4, ld4Var2, x44.p0(i6 | 1));
                                    break;
                                default:
                                    ktk.k(rvhVar2, pz7Var4, ld4Var2, x44.p0(i6 | 1));
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    r7eVarS.d = pz7Var3;
                }
                return;
            }
            e18Var = e18Var2;
            String str2 = content;
            e18Var.a0(-2023320963);
            e18Var.p(false);
            JsonElement jsonElement3 = (JsonElement) jsonObjectI.get((Object) "content");
            if (jsonElement3 != null && (content2 = ch9.j(jsonElement3).getContent()) != null) {
                strJ0 = content2;
            }
            JsonElement jsonElement4 = (JsonElement) jsonObjectI.get((Object) "startLine");
            int iIntValue2 = (jsonElement4 == null || (numG2 = ch9.g(ch9.j(jsonElement4))) == null) ? 1 : numG2.intValue();
            JsonElement jsonElement5 = (JsonElement) jsonObjectI.get((Object) "numLines");
            int iIntValue3 = (jsonElement5 == null || (numG = ch9.g(ch9.j(jsonElement5))) == null) ? -1 : numG.intValue();
            JsonElement jsonElement6 = (JsonElement) jsonObjectI.get((Object) "totalLines");
            Integer numG5 = jsonElement6 != null ? ch9.g(ch9.j(jsonElement6)) : null;
            JsonElement jsonElement7 = (JsonElement) jsonObjectI.get((Object) "truncatedByTokenCap");
            boolean zR = jsonElement7 != null ? x44.r(ch9.e(ch9.j(jsonElement7)), Boolean.TRUE) : false;
            boolean zF = e18Var.f(str);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                objN = mpk.P(null);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            boolean zF2 = e18Var.f(str) | e18Var.g(zR);
            Object objN2 = e18Var.N();
            if (zF2 || objN2 == lz1Var) {
                objN2 = mpk.P(zR ? p3e.a : null);
                e18Var.k0(objN2);
            }
            nwb nwbVar2 = (nwb) objN2;
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = fd9.O(im6.E, e18Var);
                e18Var.k0(objN3);
            }
            l45 l45Var = (l45) objN3;
            String str3 = (String) nwbVar.getValue();
            String str4 = str3 == null ? strJ0 : str3;
            int i5 = ((String) nwbVar.getValue()) != null ? 1 : iIntValue2;
            int i6 = ((String) nwbVar.getValue()) != null ? -1 : iIntValue3;
            t3e t3eVar = (t3e) nwbVar2.getValue();
            if (t3eVar == null) {
                e18Var.a0(-2022236429);
                e18Var.p(false);
                ta4Var = null;
                pz7Var2 = pz7Var;
            } else {
                e18Var.a0(-2022236428);
                yu yuVar = new yu(iIntValue3, numG5, t3eVar, nwbVar2, l45Var, pz7Var, str2, nwbVar);
                pz7Var2 = pz7Var;
                str2 = str2;
                ta4 ta4VarQ0 = fd9.q0(-1875398874, yuVar, e18Var);
                e18Var.p(false);
                ta4Var = ta4VarQ0;
            }
            ltk.f(str2, str4, i6, i5, null, ta4Var, e18Var, 0, 16);
        } else {
            e18Var = e18Var2;
            pz7Var2 = pz7Var;
            e18Var.T();
        }
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            pz7Var3 = new pz7() { // from class: vvh
                @Override // defpackage.pz7
                public final Object invoke(Object obj4, Object obj5) {
                    int i52 = i3;
                    iei ieiVar = iei.a;
                    int i62 = i;
                    pz7 pz7Var4 = pz7Var2;
                    rvh rvhVar2 = rvhVar;
                    ld4 ld4Var2 = (ld4) obj4;
                    ((Integer) obj5).intValue();
                    switch (i52) {
                        case 0:
                            ktk.k(rvhVar2, pz7Var4, ld4Var2, x44.p0(i62 | 1));
                            break;
                        default:
                            ktk.k(rvhVar2, pz7Var4, ld4Var2, x44.p0(i62 | 1));
                            break;
                    }
                    return ieiVar;
                }
            };
            r7eVarS.d = pz7Var3;
        }
    }

    public static final void l(int i, Integer num, t3e t3eVar, zy7 zy7Var, ld4 ld4Var, int i2) {
        int i3;
        int i4;
        int i5;
        Context context;
        boolean z;
        boolean z2;
        String strK0;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(156534527);
        if ((i2 & 6) == 0) {
            i3 = i;
            i4 = (e18Var.d(i3) ? 4 : 2) | i2;
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= e18Var.f(num) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= e18Var.f(t3eVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i2 & 3072) == 0) {
            i4 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i4 & 1, (i4 & 1171) != 1170)) {
            Context context2 = (Context) e18Var.j(w00.b);
            vo1 vo1Var = lja.T;
            iqb iqbVarK = gb9.K(b.c(fqb.E, 1.0f), 16.0f, 12.0f);
            q64 q64VarA = p64.a(ko0.c, vo1Var, e18Var, 48);
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
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            boolean z3 = t3eVar instanceof q3e;
            if (z3) {
                i5 = i4;
                context = context2;
                z = z3;
                z2 = false;
                e18Var.a0(-240690279);
                e18Var.p(false);
            } else {
                e18Var.a0(-241083638);
                if (num != null) {
                    e18Var.a0(-241039835);
                    strK0 = d4c.k0(R.string.ccr_read_truncated_of_total, new Object[]{Integer.valueOf(i3), num}, e18Var);
                    e18Var.p(false);
                } else {
                    e18Var.a0(-240919462);
                    strK0 = d4c.k0(R.string.ccr_read_truncated, new Object[]{Integer.valueOf(i3)}, e18Var);
                    e18Var.p(false);
                }
                i5 = i4;
                z = z3;
                z2 = false;
                context = context2;
                tjh.b(strK0, null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 131066);
                e18Var = e18Var;
                e18Var.p(false);
            }
            boolean zEquals = t3eVar.equals(p3e.a);
            r3e r3eVar = r3e.a;
            if (zEquals || t3eVar.equals(r3eVar)) {
                e18Var.a0(-423402096);
                bhk.a(d4c.j0(R.string.ccr_read_load_full_file, e18Var), t3eVar.equals(r3eVar), zy7Var, null, e18Var, (i5 >> 3) & 896, 8);
                e18Var.p(z2);
            } else if (t3eVar.equals(s3e.a)) {
                e18Var.a0(-423392503);
                f(d4c.j0(R.string.ccr_read_not_connected, e18Var), zy7Var, e18Var, (i5 >> 6) & 112);
                e18Var.p(z2);
            } else if (t3eVar instanceof o3e) {
                e18Var.a0(-423385224);
                String strN = ((o3e) t3eVar).a;
                if (strN == null) {
                    strN = vb7.n(e18Var, -423383146, R.string.ccr_read_load_failed, e18Var, z2);
                } else {
                    e18Var.a0(-423383673);
                    e18Var.p(z2);
                }
                f(strN, zy7Var, e18Var, (i5 >> 6) & 112);
                e18Var.p(z2);
            } else {
                if (!z) {
                    throw ebh.u(e18Var, -423404655, z2);
                }
                e18Var.a0(-239786474);
                String shortFileSize = Formatter.formatShortFileSize(context, ((q3e) t3eVar).a);
                shortFileSize.getClass();
                e18 e18Var2 = e18Var;
                tjh.b(d4c.k0(R.string.ccr_read_loaded_partial, new Object[]{shortFileSize}, e18Var), null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var2, 0, 0, 131066);
                e18Var = e18Var2;
                e18Var.p(z2);
            }
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new zh(i, num, t3eVar, zy7Var, i2, 13);
        }
    }

    public static final void m(rvh rvhVar, i iVar, i4g i4gVar, bz7 bz7Var, ld4 ld4Var, int i) {
        bz7 bz7Var2;
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(213239034);
        int i2 = (i & 6) == 0 ? (e18Var2.h(rvhVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.f(i4gVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            bz7Var2 = bz7Var;
            i2 |= e18Var2.h(bz7Var2) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            bz7Var2 = bz7Var;
        }
        if (e18Var2.Q(i2 & 1, (i2 & 1171) != 1170)) {
            rvhVar.getClass();
            Iterable iterable = (List) iVar.y0.e.get(rvhVar.a);
            if (iterable == null) {
                iterable = lm6.E;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (obj instanceof rvh) {
                    arrayList.add(obj);
                }
            }
            m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
            boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                objN = m7fVarN.a(jce.a.b(z74.class), null, null);
                e18Var2.k0(objN);
            }
            e18Var2.p(false);
            e18Var2.p(false);
            z74 z74Var = (z74) objN;
            iqb iqbVarC = b.c(fqb.E, 1.0f);
            qnc qncVarB = i4gVar.b();
            boolean zH = ((i2 & 112) == 32) | e18Var2.h(rvhVar) | e18Var2.h(z74Var) | e18Var2.h(arrayList) | ((i2 & 7168) == 2048);
            Object objN2 = e18Var2.N();
            if (zH || objN2 == lz1Var) {
                w20 w20Var = new w20(rvhVar, arrayList, z74Var, iVar, bz7Var2, 11);
                e18Var2.k0(w20Var);
                objN2 = w20Var;
            }
            e18Var = e18Var2;
            knk.h(iqbVarC, null, qncVarB, false, null, null, null, false, null, (bz7) objN2, e18Var, 6, 506);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new tvh(rvhVar, iVar, i4gVar, bz7Var, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r5v14, types: [lm6] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.util.ArrayList] */
    public static final void n(rvh rvhVar, i4g i4gVar, ld4 ld4Var, int i) {
        ?? r12;
        e18 e18Var;
        ?? arrayList;
        boolean z;
        e18 e18Var2;
        String content;
        e18 e18Var3 = (e18) ld4Var;
        e18Var3.c0(-1200907326);
        int i2 = (i & 6) == 0 ? (e18Var3.h(rvhVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= e18Var3.f(i4gVar) ? 32 : 16;
        }
        if (e18Var3.Q(i2 & 1, (i2 & 19) != 18)) {
            iqb iqbVarI = gb9.I(b.c(fqb.E, 1.0f), i4gVar.b());
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var3, 0);
            int iHashCode = Long.hashCode(e18Var3.T);
            hyc hycVarL = e18Var3.l();
            iqb iqbVarE = kxk.E(e18Var3, iqbVarI);
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
            Object obj = rvhVar.d.get("todos");
            JsonArray jsonArray = obj instanceof JsonArray ? (JsonArray) obj : null;
            if (jsonArray != null) {
                arrayList = new ArrayList(x44.y(jsonArray, 10));
                for (JsonElement jsonElement : jsonArray) {
                    JsonElement jsonElement2 = (JsonElement) ch9.i(jsonElement).get((Object) "status");
                    boolean zR = x44.r(jsonElement2 != null ? ch9.j(jsonElement2).getContent() : null, "completed");
                    JsonElement jsonElement3 = (JsonElement) ch9.i(jsonElement).get((Object) "content");
                    if (jsonElement3 == null || (content = ch9.j(jsonElement3).getContent()) == null) {
                        content = "";
                    }
                    arrayList.add(new cpc(Boolean.valueOf(zR), content));
                }
            } else {
                arrayList = lm6.E;
            }
            if (((Collection) arrayList).isEmpty()) {
                e18Var3.a0(-1523906265);
                tjh.b(d4c.j0(R.string.ccr_tool_no_todos, e18Var3), null, gm3.a(e18Var3).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var3).e.E).g, e18Var3, 0, 0, 131066);
                e18 e18Var4 = e18Var3;
                e18Var4.p(false);
                z = true;
                e18Var2 = e18Var4;
            } else {
                e18Var3.a0(-1523969629);
                wsk.d(arrayList, e18Var3, 0);
                e18Var3.p(false);
                z = true;
                e18Var2 = e18Var3;
            }
            e18Var2.p(z);
            e18Var = e18Var2;
            r12 = z;
        } else {
            r12 = 1;
            e18Var3.T();
            e18Var = e18Var3;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new wvh(rvhVar, i4gVar, i, r12);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x010f, code lost:
    
        if (r10.equals("Agent") == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0111, code lost:
    
        r4 = r3;
        r3 = r20;
        r8 = r18;
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x011f, code lost:
    
        if (r10.equals("Task") == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0122, code lost:
    
        r5.a0(-85400751);
        m(r18, r6, r20, r21, r5, r3 & 8190);
        r5 = r5;
        r5.p(r1);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0236 A[PHI: r3 r4 r8 r9
      0x0236: PHI (r3v19 i4g) = (r3v8 i4g), (r3v10 i4g), (r3v15 i4g), (r3v17 i4g), (r3v20 i4g) binds: [B:110:0x0234, B:106:0x0217, B:74:0x0147, B:66:0x0111, B:41:0x008d] A[DONT_GENERATE, DONT_INLINE]
      0x0236: PHI (r4v18 int) = (r4v2 int), (r4v5 int), (r4v14 int), (r4v17 int), (r4v19 int) binds: [B:110:0x0234, B:106:0x0217, B:74:0x0147, B:66:0x0111, B:41:0x008d] A[DONT_GENERATE, DONT_INLINE]
      0x0236: PHI (r8v17 rvh) = (r8v4 rvh), (r8v6 rvh), (r8v9 rvh), (r8v12 rvh), (r8v19 rvh) binds: [B:110:0x0234, B:106:0x0217, B:74:0x0147, B:66:0x0111, B:41:0x008d] A[DONT_GENERATE, DONT_INLINE]
      0x0236: PHI (r9v13 boolean) = (r9v4 boolean), (r9v5 boolean), (r9v8 boolean), (r9v11 boolean), (r9v14 boolean) binds: [B:110:0x0234, B:106:0x0217, B:74:0x0147, B:66:0x0111, B:41:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(defpackage.rvh r18, com.anthropic.claude.code.remote.i r19, defpackage.i4g r20, defpackage.bz7 r21, defpackage.ld4 r22, int r23) {
        /*
            Method dump skipped, instruction units count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ktk.o(rvh, com.anthropic.claude.code.remote.i, i4g, bz7, ld4, int):void");
    }

    public boolean p(u1f u1fVar) {
        return true;
    }

    public abstract void q(String str);
}
