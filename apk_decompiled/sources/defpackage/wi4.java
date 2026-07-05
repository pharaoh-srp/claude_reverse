package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.mcp.DirectoryServer;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.api.mcp.h;
import com.anthropic.claude.types.strings.DirectoryServerId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wi4 {
    public static final z74 a = new z74(new aua(true));
    public static final mo3 b = new mo3(1);

    /* JADX WARN: Removed duplicated region for block: B:147:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.anthropic.claude.api.mcp.DirectoryServer r17, defpackage.ek4 r18, boolean r19, defpackage.zy7 r20, defpackage.zy7 r21, defpackage.iqb r22, defpackage.ld4 r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wi4.a(com.anthropic.claude.api.mcp.DirectoryServer, ek4, boolean, zy7, zy7, iqb, ld4, int, int):void");
    }

    public static final void b(DirectoryServer directoryServer, uj4 uj4Var, hi4 hi4Var, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        directoryServer.getClass();
        uj4Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1670477415);
        int i2 = i | (e18Var2.f(directoryServer) ? 4 : 2) | (e18Var2.h(uj4Var) ? 32 : 16) | (e18Var2.h(hi4Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var2.Q(i2 & 1, (i2 & 1171) != 1170)) {
            Context context = (Context) e18Var2.j(w00.b);
            nwb nwbVarU = mpk.u(uj4Var.b.g, e18Var2);
            Map map = (Map) uj4Var.l.getValue();
            String strA = h.a(directoryServer);
            McpServer mcpServer = (McpServer) map.get(strA != null ? xvk.h(strA) : null);
            Object[] objArr = new Object[0];
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new l84(13);
                e18Var2.k0(objN);
            }
            nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN, e18Var2, 48);
            boolean zF = e18Var2.f(mcpServer) | e18Var2.f(nwbVar);
            Object objN2 = e18Var2.N();
            if (zF || objN2 == lz1Var) {
                objN2 = new u73(mcpServer, nwbVar, null, 8);
                e18Var2.k0(objN2);
            }
            fd9.i(e18Var2, (pz7) objN2, mcpServer);
            ek4 ek4VarO = uj4Var.O(directoryServer);
            String strM342getIdHdVeoME = directoryServer.m342getIdHdVeoME();
            DirectoryServerId directoryServerId = (DirectoryServerId) nwbVarU.getValue();
            String strM1005unboximpl = directoryServerId != null ? directoryServerId.m1005unboximpl() : null;
            boolean zM1002equalsimpl0 = strM1005unboximpl == null ? false : DirectoryServerId.m1002equalsimpl0(strM342getIdHdVeoME, strM1005unboximpl);
            int i3 = i2 & 14;
            boolean zH = (i3 == 4) | ((i2 & 112) == 32 || e18Var2.h(uj4Var)) | ((i2 & 896) == 256 || e18Var2.h(hi4Var)) | e18Var2.h(context);
            Object objN3 = e18Var2.N();
            if (zH || objN3 == lz1Var) {
                he heVar = new he(uj4Var, directoryServer, hi4Var, context, 10);
                e18Var2.k0(heVar);
                objN3 = heVar;
            }
            zy7 zy7Var = (zy7) objN3;
            boolean zF2 = e18Var2.f(nwbVar);
            Object objN4 = e18Var2.N();
            if (zF2 || objN4 == lz1Var) {
                objN4 = new dy2(29, nwbVar);
                e18Var2.k0(objN4);
            }
            a(directoryServer, ek4VarO, zM1002equalsimpl0, zy7Var, (zy7) objN4, iqbVar, e18Var2, i3 | (458752 & (i2 << 6)), 0);
            e18Var = e18Var2;
            if (!((Boolean) nwbVar.getValue()).booleanValue() || mcpServer == null) {
                e18Var.a0(594762409);
                e18Var.p(false);
            } else {
                e18Var.a0(594293441);
                j66 j66VarS = ssj.s(mcpServer.m346getUuidowoRr7k(), h.b(directoryServer), mcpServer.getUrl(), "directory", e18Var, 0);
                boolean zF3 = e18Var.f(nwbVar);
                Object objN5 = e18Var.N();
                if (zF3 || objN5 == lz1Var) {
                    objN5 = new vi4(0, nwbVar);
                    e18Var.k0(objN5);
                }
                zy7 zy7Var2 = (zy7) objN5;
                boolean zF4 = e18Var.f(nwbVar);
                Object objN6 = e18Var.N();
                if (zF4 || objN6 == lz1Var) {
                    objN6 = new vi4(1, nwbVar);
                    e18Var.k0(objN6);
                }
                ssj.a(j66VarS, zy7Var2, (zy7) objN6, e18Var, 0);
                e18Var.p(false);
            }
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fn(directoryServer, uj4Var, hi4Var, iqbVar, i, 21);
        }
    }

    public static final void c(DirectoryServer directoryServer, zy7 zy7Var, iqb iqbVar, uj4 uj4Var, ld4 ld4Var, int i) {
        e18 e18Var;
        iqb iqbVar2;
        uj4 uj4Var2;
        uj4 uj4VarF;
        iqb iqbVar3;
        directoryServer.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-355359124);
        int i2 = i | (e18Var2.f(directoryServer) ? 4 : 2) | (e18Var2.h(zy7Var) ? 32 : 16) | 1408;
        if (e18Var2.Q(i2 & 1, (i2 & 1171) != 1170)) {
            e18Var2.V();
            if ((i & 1) == 0 || e18Var2.A()) {
                uj4VarF = xpk.f(e18Var2);
                iqbVar3 = fqb.E;
            } else {
                e18Var2.T();
                iqbVar3 = iqbVar;
                uj4VarF = uj4Var;
            }
            e18Var2.q();
            Object objN = e18Var2.N();
            if (objN == jd4.a) {
                objN = sq6.p(e18Var2);
            }
            ybg ybgVar = (ybg) objN;
            hi4 hi4VarR = ez1.R(uj4VarF.d, uj4VarF.f, e18Var2);
            WeakHashMap weakHashMap = gdj.x;
            fei feiVar = s4i.d(e18Var2).l;
            ta4 ta4VarQ0 = fd9.q0(1740633583, new t04(directoryServer, 6, zy7Var), e18Var2);
            ta4 ta4VarQ02 = fd9.q0(-44769679, new rn(ybgVar, 6), e18Var2);
            uj4 uj4Var3 = uj4VarF;
            ta4 ta4VarQ03 = fd9.q0(-162585950, new bn(uj4Var3, ybgVar, directoryServer, hi4VarR, 16), e18Var2);
            e18Var = e18Var2;
            iqb iqbVar4 = iqbVar3;
            v40.b(iqbVar4, null, ta4VarQ0, ib4.a, ta4VarQ02, null, 0, 0L, 0L, feiVar, MTTypesetterKt.kLineSkipLimitMultiplier, ta4VarQ03, e18Var, 28038, 1506);
            uj4Var2 = uj4Var3;
            iqbVar2 = iqbVar4;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
            uj4Var2 = uj4Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fn(directoryServer, zy7Var, iqbVar2, uj4Var2, i, 22);
        }
    }

    public static final void d(String str, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(16540292);
        int i2 = (e18Var.f(str) ? 4 : 2) | i;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objN = e18Var.N();
            if (z || objN == jd4.a) {
                objN = a.a(str);
                e18Var.k0(objN);
            }
            tkh tkhVarB = tkh.b(((jm3) gm3.c(e18Var).e.E).g, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214);
            jlk.e(tkhVarB, lsk.e(tkhVarB, null, e18Var, 0, 510), iqbVar, fd9.q0(2021792628, new af1((jz0) objN, 2), e18Var), e18Var, 3456);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ip(str, iqbVar, i, 9);
        }
    }

    public static final void e(DirectoryServer directoryServer, ek4 ek4Var, boolean z, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-780258175);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(directoryServer) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.d(ek4Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.h(zy7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.f(iqbVar) ? 131072 : 65536;
        }
        if (e18Var.Q(i2 & 1, (74899 & i2) != 74898)) {
            ho0 ho0Var = new ho0(12.0f, true, new sz6(1));
            vo1 vo1Var = lja.S;
            q64 q64VarA = p64.a(ho0Var, vo1Var, e18Var, 6);
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
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, q64VarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            int i3 = i2;
            cxe cxeVarA = axe.a(ko0.a, lja.P, e18Var, 48);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            fqb fqbVar = fqb.E;
            iqb iqbVarE2 = kxk.E(e18Var, fqbVar);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, cxeVarA);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            i56.a(directoryServer, ek4Var, null, e18Var, i3 & 126);
            kxk.g(e18Var, b.t(fqbVar, 12.0f));
            ho0 ho0Var2 = new ho0(4.0f, true, new sz6(1));
            hw9 hw9Var = new hw9(1.0f, true);
            q64 q64VarA2 = p64.a(ho0Var2, vo1Var, e18Var, 6);
            int iHashCode3 = Long.hashCode(e18Var.T);
            hyc hycVarL3 = e18Var.l();
            iqb iqbVarE3 = kxk.E(e18Var, hw9Var);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, q64VarA2);
            d4c.i0(e18Var, z80Var2, hycVarL3);
            ij0.t(iHashCode3, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE3);
            tjh.b(h.b(directoryServer), null, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).f, e18Var, 0, 0, 131066);
            String one_liner = directoryServer.getOne_liner();
            String str = (one_liner == null || bsg.I0(one_liner)) ? null : one_liner;
            if (str == null) {
                e18Var.a0(-45842313);
                e18Var.p(false);
            } else {
                e18Var.a0(-45842312);
                tjh.b(str, null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 0, 131066);
                e18Var.p(false);
            }
            e18Var.p(true);
            kxk.g(e18Var, b.t(fqbVar, 16.0f));
            f(ek4Var, z, zy7Var, zy7Var2, e18Var, (i3 >> 3) & 8190);
            e18Var.p(true);
            if (ek4Var == ek4.H) {
                e18Var.a0(2044799514);
                tjh.b(d4c.j0(R.string.connector_directory_ask_owner, e18Var), gb9.K(yfd.p(xn5.V(b.c(fqbVar, 1.0f), gm3.b(e18Var).f), gm3.a(e18Var).q, zni.b), 16.0f, 12.0f), gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 131064);
                e18Var.p(false);
            } else {
                e18Var.a0(2045256299);
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pg1(directoryServer, ek4Var, z, zy7Var, zy7Var2, iqbVar, i, 6);
        }
    }

    public static final void f(ek4 ek4Var, boolean z, zy7 zy7Var, zy7 zy7Var2, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1942968846);
        if ((i & 6) == 0) {
            i2 = (e18Var.d(ek4Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            spk.a(ek4Var, z, zy7Var, null, fd9.q0(-569496696, new wh(11, zy7Var2), e18Var), e18Var, (i2 & 14) | 24576 | (i2 & 112) | (i2 & 896));
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new en3(ek4Var, z, zy7Var, zy7Var2, i, 1);
        }
    }

    public static final void g(String str, ta4 ta4Var, ld4 ld4Var, int i) {
        e18 e18Var;
        ta4 ta4Var2;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-169733350);
        int i2 = i | (e18Var2.f(str) ? 4 : 2);
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            q64 q64VarA = p64.a(new ho0(4.0f, true, new sz6(1)), lja.S, e18Var2, 6);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, fqb.E);
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
            tjh.b(str, null, gm3.a(e18Var2).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, i2 & 14, 0, 131066);
            ta4Var2 = ta4Var;
            e18Var = e18Var2;
            vb7.y(6, ta4Var2, e18Var, true);
        } else {
            e18Var = e18Var2;
            ta4Var2 = ta4Var;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new og1(str, ta4Var2, i);
        }
    }

    public static final void h(DirectoryServer directoryServer, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        String name;
        String support;
        String privacy_policy;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1956288505);
        if ((i & 6) == 0) {
            i2 = i | (e18Var.f(directoryServer) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            eli eliVar = (eli) e18Var.j(ve4.t);
            op3 op3Var = (op3) e18Var.j(ve4.f);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = fd9.O(im6.E, e18Var);
                e18Var.k0(objN);
            }
            l45 l45Var = (l45) objN;
            q64 q64VarA = p64.a(new ho0(16.0f, true, new sz6(1)), lja.S, e18Var, 6);
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
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            tjh.b(d4c.j0(R.string.connector_directory_details_header, e18Var), null, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).h, e18Var, 0, 0, 131066);
            e18Var = e18Var;
            DirectoryServer.Author author = directoryServer.getAuthor();
            String str = null;
            if (author == null || (name = author.getName()) == null || bsg.I0(name)) {
                name = null;
            }
            if (name == null) {
                e18Var.a0(954297277);
                e18Var.p(false);
            } else {
                e18Var.a0(954297278);
                g(d4c.j0(R.string.connector_directory_author_label, e18Var), fd9.q0(531913250, new f44(5, directoryServer, eliVar, name), e18Var), e18Var, 48);
                e18Var.p(false);
            }
            String strA = h.a(directoryServer);
            if (strA != null && !bsg.I0(strA)) {
                str = strA;
            }
            if (str == null) {
                e18Var.a0(954986903);
                e18Var.p(false);
            } else {
                e18Var.a0(954986904);
                g(d4c.j0(R.string.connector_directory_connector_url_label, e18Var), fd9.q0(-247379367, new f44(str, l45Var, op3Var, 6), e18Var), e18Var, 48);
                e18Var.p(false);
            }
            String documentation = directoryServer.getDocumentation();
            if ((documentation == null || bsg.I0(documentation)) && (((support = directoryServer.getSupport()) == null || bsg.I0(support)) && ((privacy_policy = directoryServer.getPrivacy_policy()) == null || bsg.I0(privacy_policy)))) {
                e18Var.a0(957613317);
                e18Var.p(false);
            } else {
                e18Var.a0(956457234);
                g(d4c.j0(R.string.connector_directory_more_info_label, e18Var), fd9.q0(559117269, new t04(directoryServer, 8, eliVar), e18Var), e18Var, 48);
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qq(directoryServer, iqbVar, i, 13);
        }
    }

    public static final void i(String str, zy7 zy7Var, ld4 ld4Var, int i) {
        String str2;
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1007809041);
        int i2 = i | (e18Var2.f(str) ? 4 : 2) | (e18Var2.h(zy7Var) ? 32 : 16);
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            ho0 ho0Var = new ho0(4.0f, true, new sz6(1));
            wo1 wo1Var = lja.Q;
            mo8 mo8Var = z79.a;
            iqb iqbVarC = androidx.compose.foundation.b.c(xn5.V(pkb.E, gm3.b(e18Var2).d), false, null, new vue(0), null, zy7Var, 11);
            cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var2, 54);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarC);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, cxeVarA);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            tjh.b(str, null, gm3.a(e18Var2).N, 0L, null, null, null, 0L, qeh.c, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, (i2 & 14) | 805306368, 0, 130554);
            str2 = str;
            e18Var = e18Var2;
            iv1.b(ud0.l, null, null, ef2.F, gm3.a(e18Var2).N, e18Var, 3120, 4);
            e18Var.p(true);
        } else {
            str2 = str;
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new e42(str2, zy7Var, i, 2);
        }
    }

    public static final void j(mz8 mz8Var, String str, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1575442288);
        int i2 = (e18Var.f(mz8Var) ? 4 : 2) | i | (e18Var.f(str) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            ho0 ho0Var = new ho0(12.0f, true, new sz6(1));
            qnc qncVarB = gb9.b(16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objN = e18Var.N();
            if (z || objN == jd4.a) {
                objN = new lj2(mz8Var, 20, str);
                e18Var.k0(objN);
            }
            knk.i(null, null, qncVarB, ho0Var, null, null, false, null, (bz7) objN, e18Var, 24960, 491);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new t04(mz8Var, str, i, 7);
        }
    }

    public static final void k(DirectoryServer.PromptImage promptImage, String str, ld4 ld4Var, int i) {
        boolean z;
        boolean z2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1908865303);
        int i2 = (e18Var.f(promptImage) ? 4 : 2) | i | (e18Var.f(str) ? 32 : 16);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            ho0 ho0Var = new ho0(16.0f, true, new sz6(1));
            iqb iqbVarJ = gb9.J(yfd.p(xn5.V(b.e(b.t(fqb.E, 312.0f), 352.0f), gm3.b(e18Var).f), gm3.a(e18Var).p, zni.b), 20.0f);
            q64 q64VarA = p64.a(ho0Var, lja.S, e18Var, 6);
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
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            String prompt = promptImage.getPrompt();
            if (prompt == null || bsg.I0(prompt)) {
                prompt = null;
            }
            if (prompt == null) {
                e18Var.a0(848173228);
                e18Var.p(false);
                z2 = false;
                z = true;
            } else {
                e18Var.a0(848173229);
                z = true;
                z2 = false;
                pzg.a(gb9.N(new ko8(lja.U), 44.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 14), gm3.b(e18Var).v, gm3.a(e18Var).q, gm3.a(e18Var).M, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, sf5.a(MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).v), fd9.q0(-1276500058, new rq(prompt, 14), e18Var), e18Var, 12582912, 48);
                e18Var.p(false);
            }
            String image_url = promptImage.getImage_url();
            if (image_url == null || bsg.I0(image_url)) {
                image_url = null;
            }
            if (image_url == null) {
                e18Var.a0(848970517);
                e18Var.p(z2);
            } else {
                e18Var.a0(848970518);
                String prompt2 = promptImage.getPrompt();
                String str2 = (prompt2 == null || bsg.I0(prompt2)) ? str : null;
                iqb iqbVarC = b.c(new ko8(lja.T), 1.0f);
                if (1.0f <= 0.0d) {
                    z29.a("invalid weight; must be greater than zero");
                }
                nuk.e(image_url, str2, xn5.V(iqbVarC.B(new hw9(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, z)), gm3.b(e18Var).d), null, null, null, ho4.b, MTTypesetterKt.kLineSkipLimitMultiplier, 0, false, e18Var, 12582912, 3960);
                e18Var.p(z2);
            }
            e18Var.p(z);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new t04(promptImage, str, i, 9);
        }
    }

    public static final void l(mz8 mz8Var, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-187056400);
        int i2 = i | (e18Var.f(mz8Var) ? 4 : 2);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            Object[] objArr = new Object[0];
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new l84(12);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN, e18Var, 48);
            List listJ1 = ((Boolean) nwbVar.getValue()).booleanValue() ? mz8Var : w44.j1(mz8Var, 8);
            int size = mz8Var.size() - 8;
            if (size < 0) {
                size = 0;
            }
            q64 q64VarA = p64.a(new ho0(12.0f, true, new sz6(1)), lja.S, e18Var, 6);
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
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, q64VarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            List list = listJ1;
            cxe cxeVarA = axe.a(new ho0(8.0f, true, new sz6(1)), lja.Q, e18Var, 54);
            int i3 = size;
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, fqb.E);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, cxeVarA);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            tjh.b(d4c.j0(R.string.connector_directory_tools_header, e18Var), null, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).h, e18Var, 0, 0, 131066);
            String strValueOf = String.valueOf(mz8Var.size());
            vve vveVar = xve.a;
            tkh tkhVar = ((jm3) gm3.c(e18Var).e.E).k;
            e18Var = e18Var;
            zmk.f(strValueOf, null, null, 0L, 0L, new qnc(8.0f, 2.0f, 8.0f, 2.0f), null, vveVar, tkhVar, e18Var, 196608, 94);
            e18Var.p(true);
            unk.c(null, new ho0(8.0f, true, new sz6(1)), new ho0(8.0f, true, new sz6(1)), null, 0, 0, fd9.q0(1328062603, new ui4(list, i3, nwbVar, 0), e18Var), e18Var, 1573296, 57);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new t04(mz8Var, iqbVar, i, 5);
        }
    }
}
