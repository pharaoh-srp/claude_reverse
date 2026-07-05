package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import okio.FileSystem;
import okio.Path;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bjk {
    public static final ta4 a = new ta4(-1590821102, false, new jb4(11));

    public static final void a(final boolean z, final zy7 zy7Var, final zy7 zy7Var2, final zy7 zy7Var3, final zy7 zy7Var4, final zy7 zy7Var5, final zy7 zy7Var6, final boolean z2, final boolean z3, final boolean z4, ld4 ld4Var, final int i) {
        int i2;
        e18 e18Var;
        zy7Var.getClass();
        zy7Var2.getClass();
        zy7Var3.getClass();
        zy7Var4.getClass();
        zy7Var5.getClass();
        zy7Var6.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-109322685);
        if ((i & 6) == 0) {
            i2 = (e18Var2.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.h(zy7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.h(zy7Var3) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.h(zy7Var4) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var2.h(zy7Var5) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var2.h(zy7Var6) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= e18Var2.g(z2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= e18Var2.g(z3) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= e18Var2.g(z4) ? 536870912 : 268435456;
        }
        if (e18Var2.Q(i2 & 1, (306783379 & i2) != 306783378)) {
            e18Var = e18Var2;
            j8.b(z, zy7Var, null, 0L, null, null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(-813508288, new rz7() { // from class: az2
                @Override // defpackage.rz7
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ld4 ld4Var2 = (ld4) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((s64) obj).getClass();
                    e18 e18Var3 = (e18) ld4Var2;
                    if (e18Var3.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        String strJ0 = d4c.j0(R.string.chat_message_bottom_sheet_menu_copy, e18Var3);
                        bpc bpcVarA = a.a(ud0.Y, e18Var3);
                        zy7 zy7Var7 = zy7Var;
                        boolean zF = e18Var3.f(zy7Var7);
                        zy7 zy7Var8 = zy7Var3;
                        boolean zF2 = zF | e18Var3.f(zy7Var8);
                        Object objN = e18Var3.N();
                        lz1 lz1Var = jd4.a;
                        if (zF2 || objN == lz1Var) {
                            objN = new kt0(zy7Var7, zy7Var8, 5);
                            e18Var3.k0(objN);
                        }
                        uuj.a(strJ0, bpcVarA, (zy7) objN, null, null, false, null, null, null, null, 0, 0, e18Var3, 64, 4088);
                        String strJ02 = d4c.j0(R.string.chat_message_bottom_sheet_menu_select, e18Var3);
                        bpc bpcVarA2 = a.a(ud0.m1, e18Var3);
                        boolean zF3 = e18Var3.f(zy7Var7);
                        zy7 zy7Var9 = zy7Var4;
                        boolean zF4 = zF3 | e18Var3.f(zy7Var9);
                        Object objN2 = e18Var3.N();
                        if (zF4 || objN2 == lz1Var) {
                            objN2 = new kt0(zy7Var7, zy7Var9, 6);
                            e18Var3.k0(objN2);
                        }
                        uuj.a(strJ02, bpcVarA2, (zy7) objN2, null, null, false, null, null, null, null, 0, 0, e18Var3, 64, 4088);
                        e18 e18Var4 = e18Var3;
                        if (z3) {
                            e18Var4.a0(1275610605);
                            String strJ03 = d4c.j0(R.string.chat_message_bottom_sheet_menu_edit, e18Var4);
                            bpc bpcVarA3 = a.a(ud0.e0, e18Var4);
                            boolean zF5 = e18Var4.f(zy7Var7);
                            zy7 zy7Var10 = zy7Var5;
                            boolean zF6 = zF5 | e18Var4.f(zy7Var10);
                            Object objN3 = e18Var4.N();
                            if (zF6 || objN3 == lz1Var) {
                                objN3 = new kt0(zy7Var7, zy7Var10, 7);
                                e18Var4.k0(objN3);
                            }
                            uuj.a(strJ03, bpcVarA3, (zy7) objN3, null, null, false, null, null, null, null, 0, 0, e18Var4, 64, 4088);
                            e18Var4 = e18Var4;
                            e18Var4.p(false);
                        } else {
                            e18Var4.a0(1275907554);
                            e18Var4.p(false);
                        }
                        if (z2) {
                            e18Var4.a0(1275941313);
                            String strJ04 = d4c.j0(R.string.chat_message_bottom_sheet_menu_retry, e18Var4);
                            bpc bpcVarA4 = a.a(ud0.i, e18Var4);
                            boolean zF7 = e18Var4.f(zy7Var7);
                            zy7 zy7Var11 = zy7Var2;
                            boolean zF8 = zF7 | e18Var4.f(zy7Var11);
                            Object objN4 = e18Var4.N();
                            if (zF8 || objN4 == lz1Var) {
                                objN4 = new kt0(zy7Var7, zy7Var11, 8);
                                e18Var4.k0(objN4);
                            }
                            e18 e18Var5 = e18Var4;
                            uuj.a(strJ04, bpcVarA4, (zy7) objN4, null, null, false, null, null, null, null, 0, 0, e18Var5, 64, 4088);
                            e18Var4 = e18Var5;
                            e18Var4.p(false);
                        } else {
                            e18Var4.a0(1276249794);
                            e18Var4.p(false);
                        }
                        if (z4) {
                            e18Var4.a0(1276296759);
                            iuj.e(null, MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var4).u, e18Var4, 0, 3);
                            String strJ05 = d4c.j0(R.string.chat_message_menu_bad_transcription, e18Var4);
                            bpc bpcVarA5 = a.a(ud0.z1, e18Var4);
                            boolean zF9 = e18Var4.f(zy7Var7);
                            zy7 zy7Var12 = zy7Var6;
                            boolean zF10 = zF9 | e18Var4.f(zy7Var12);
                            Object objN5 = e18Var4.N();
                            if (zF10 || objN5 == lz1Var) {
                                objN5 = new kt0(zy7Var7, zy7Var12, 9);
                                e18Var4.k0(objN5);
                            }
                            e18 e18Var6 = e18Var4;
                            uuj.a(strJ05, bpcVarA5, (zy7) objN5, null, null, false, null, null, null, null, 0, 0, e18Var6, 64, 4088);
                            e18Var6.p(false);
                        } else {
                            e18Var4.a0(1276676354);
                            e18Var4.p(false);
                        }
                    } else {
                        e18Var3.T();
                    }
                    return iei.a;
                }
            }, e18Var2), e18Var, i2 & 126, 2044);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: bz2
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    bjk.a(z, zy7Var, zy7Var2, zy7Var3, zy7Var4, zy7Var5, zy7Var6, z2, z3, z4, (ld4) obj, x44.p0(i | 1));
                    return iei.a;
                }
            };
        }
    }

    public static final void b(m0h m0hVar, iqb iqbVar, boolean z, boolean z2, bz7 bz7Var, ta4 ta4Var, ld4 ld4Var, int i) {
        ta4 ta4Var2;
        boolean z3;
        bz7 bz7Var2;
        bz7 bz7Var3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-741495334);
        int i2 = i | (e18Var.h(m0hVar) ? 4 : 2) | 1769472;
        if (e18Var.Q(i2 & 1, (4793491 & i2) != 4793490)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new z1g(28);
                e18Var.k0(objN);
            }
            bz7 bz7Var4 = (bz7) objN;
            boolean z4 = e18Var.j(ve4.n) == fu9.F;
            q28 q28Var = m0hVar.a;
            q28 q28Var2 = m0hVar.a;
            boolean z5 = ((n0h) q28Var.p()) == n0h.G;
            ry ryVar = (ry) q28Var.F;
            ukc ukcVar = ukc.F;
            iqb iqbVarE = fy.e(iqbVar, ryVar, z4, ukcVar, z5, null, 32);
            o5b o5bVarD = dw1.d(lja.G, true);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarE);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, o5bVarD);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            iqb iqbVarB = nw1.a.b();
            wo1 wo1Var = lja.P;
            fo0 fo0Var = ko0.a;
            cxe cxeVarA = axe.a(fo0Var, wo1Var, e18Var, 0);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE3 = kxk.E(e18Var, iqbVarB);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, cxeVarA);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE3);
            ta4 ta4Var3 = wtk.a;
            fxe fxeVar = fxe.a;
            ta4Var3.invoke(fxeVar, e18Var, 54);
            e18Var.p(true);
            boolean zH = e18Var.h(m0hVar);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new xb2(m0hVar, z, 12);
                e18Var.k0(objN2);
            }
            iqb iqbVarD = vwk.d(fqb.E, q28Var2, ukcVar, (pz7) objN2);
            cxe cxeVarA2 = axe.a(fo0Var, wo1Var, e18Var, 0);
            int iHashCode3 = Long.hashCode(e18Var.T);
            hyc hycVarL3 = e18Var.l();
            iqb iqbVarE4 = kxk.E(e18Var, iqbVarD);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, cxeVarA2);
            d4c.i0(e18Var, z80Var2, hycVarL3);
            ij0.t(iHashCode3, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE4);
            ta4Var2 = ta4Var;
            ta4Var2.invoke(fxeVar, e18Var, 54);
            e18Var.p(true);
            e18Var.p(true);
            n0h n0hVar = (n0h) q28Var2.p();
            boolean zH2 = e18Var.h(m0hVar);
            Object objN3 = e18Var.N();
            if (zH2 || objN3 == lz1Var) {
                bz7Var3 = bz7Var4;
                objN3 = new x1d(m0hVar, bz7Var3, null, 15);
                e18Var.k0(objN3);
            } else {
                bz7Var3 = bz7Var4;
            }
            fd9.j(n0hVar, bz7Var3, (pz7) objN3, e18Var);
            z3 = true;
            bz7Var2 = bz7Var3;
        } else {
            ta4Var2 = ta4Var;
            e18Var.T();
            z3 = z2;
            bz7Var2 = bz7Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new kv2(m0hVar, iqbVar, z, z3, bz7Var2, ta4Var2, i);
        }
    }

    public static final void c(FileSystem fileSystem, Path path) throws IOException {
        try {
            IOException iOException = null;
            for (Path path2 : fileSystem.x(path)) {
                try {
                    if (fileSystem.K(path2).b) {
                        c(fileSystem, path2);
                    }
                    fileSystem.j(path2, false);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static jla d(qh9 qh9Var) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((m7a) qh9Var.E.entrySet()).iterator();
            while (((o7a) it).hasNext()) {
                p7a p7aVarA = ((l7a) it).a();
                Object key = p7aVarA.getKey();
                key.getClass();
                linkedHashMap.put(key, p7aVarA.getValue());
            }
            return new jla(linkedHashMap);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Context", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Context", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Context", e3);
            return null;
        }
    }

    public static final void e(gx gxVar, Throwable th, String str, String str2, String str3, bz7 bz7Var) {
        Map mapQ0;
        th.getClass();
        String message = th.getMessage();
        if (message != null) {
            str = ij0.C(str, ": ", message);
        }
        dch.P(gx.Companion, str, 1);
        wah wahVar = wah.E;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        bz7Var.invoke(linkedHashMap);
        if (wah.F != 0.0d && isg.q0(str2, "analytics_mobile", false) && !linkedHashMap.isEmpty() && Math.random() <= wah.F) {
            if (linkedHashMap.containsKey("error")) {
                Object obj = linkedHashMap.get("error");
                obj.getClass();
                Pattern patternCompile = Pattern.compile("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}[\\d._:port]*");
                patternCompile.getClass();
                String strReplaceAll = patternCompile.matcher((String) obj).replaceAll("_IP");
                strReplaceAll.getClass();
                Pattern patternCompile2 = Pattern.compile("[0-9a-fA-F]{2,4}(:[0-9a-fA-F]{0,4}){2,8}[\\d._:port]*");
                patternCompile2.getClass();
                String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll("_IP");
                strReplaceAll2.getClass();
                Pattern patternCompile3 = Pattern.compile("0x[0-9a-fA-F]+");
                patternCompile3.getClass();
                String strReplaceAll3 = patternCompile3.matcher(strReplaceAll2).replaceAll("0x00");
                strReplaceAll3.getClass();
                Pattern patternCompile4 = Pattern.compile("[0-9a-fA-F]{6,}");
                patternCompile4.getClass();
                String strReplaceAll4 = patternCompile4.matcher(strReplaceAll3).replaceAll("0x00");
                strReplaceAll4.getClass();
                Pattern patternCompile5 = Pattern.compile("^[a-z][a-z0-9]\\.[a-z]:");
                patternCompile5.getClass();
                String strReplaceAll5 = patternCompile5.matcher(strReplaceAll4).replaceAll("");
                strReplaceAll5.getClass();
                linkedHashMap.put("error", strReplaceAll5);
            }
            if (wah.H) {
                mapQ0 = sta.q0(linkedHashMap);
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String lowerCase = ((String) entry.getKey()).toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (!lowerCase.equals("writekey")) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                mapQ0 = linkedHashMap2;
            }
            wah.a(wahVar, str2, mapQ0, 4);
            if (wah.P) {
                wah.P = false;
                wahVar.b();
            }
        }
    }

    public static final void f(yw ywVar, Throwable th) {
        ywVar.getClass();
        th.getClass();
        String message = th.getMessage();
        if (message != null) {
            dch.P(gx.Companion, message, 1);
        }
    }

    public static final void g(gx gxVar, Throwable th) {
        f(gx.Companion, th);
    }

    public abstract qh9 h();
}
