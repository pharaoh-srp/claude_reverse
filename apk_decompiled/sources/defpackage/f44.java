package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.mcp.DirectoryServer;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.conway.ConwayAppScreen;
import com.anthropic.claude.conway.h;
import com.anthropic.claude.tool.model.AlarmCreateV0Input;
import com.anthropic.claude.tool.model.TimerCreateV0Input;
import com.anthropic.claude.types.strings.McpServerId;
import com.anthropic.claude.types.strings.ModelId;
import java.util.List;
import java.util.Set;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f44 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ f44(nwb nwbVar, wlg wlgVar, bz7 bz7Var) {
        this.E = 17;
        this.F = nwbVar;
        this.G = wlgVar;
        this.H = bz7Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        String url;
        int i = this.E;
        fqb fqbVar = fqb.E;
        lz1 lz1Var = jd4.a;
        int i2 = 3;
        iei ieiVar = iei.a;
        Object obj3 = this.H;
        Object obj4 = this.G;
        Object obj5 = this.F;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                bok.d((String) obj5, (String) obj4, (String) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 1:
                ((Integer) obj2).getClass();
                j84.a((k84) obj5, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(49));
                return ieiVar;
            case 2:
                ((Integer) obj2).getClass();
                opk.c((Long) obj5, (am5) obj4, (iqb) obj3, (ld4) obj, x44.p0(385));
                return ieiVar;
            case 3:
                dn5 dn5Var = (dn5) obj5;
                bz7 bz7Var = (bz7) obj4;
                nwb nwbVar = (nwb) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zF = e18Var.f(dn5Var) | e18Var.f(bz7Var) | e18Var.f(nwbVar);
                    Object objN = e18Var.N();
                    if (zF || objN == lz1Var) {
                        objN = new ei(dn5Var, bz7Var, nwbVar, 29);
                        e18Var.k0(objN);
                    }
                    csg.j((zy7) objN, null, false, null, null, null, null, kik.a, e18Var, 805306368, 510);
                } else {
                    e18Var.T();
                }
                return ieiVar;
            case 4:
                ((Integer) obj2).getClass();
                ah4.c((zy7) obj5, (iqb) obj4, (wg4) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 5:
                DirectoryServer directoryServer = (DirectoryServer) obj4;
                String str = (String) obj5;
                eli eliVar = (eli) obj3;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    DirectoryServer.Author author = directoryServer.getAuthor();
                    if (author != null && (url = author.getUrl()) != null && !bsg.I0(url)) {
                        strM1059constructorimpl = url;
                    }
                    if (strM1059constructorimpl != null) {
                        e18Var2.a0(2093398444);
                        boolean zH = e18Var2.h(eliVar) | e18Var2.f(strM1059constructorimpl);
                        Object objN2 = e18Var2.N();
                        if (zH || objN2 == lz1Var) {
                            objN2 = new kp1(eliVar, strM1059constructorimpl, 6);
                            e18Var2.k0(objN2);
                        }
                        wi4.i(str, (zy7) objN2, e18Var2, 0);
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(2093543896);
                        tjh.b(str, null, gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 0, 0, 131066);
                        e18Var2.p(false);
                    }
                } else {
                    e18Var2.T();
                }
                return ieiVar;
            case 6:
                String str2 = (String) obj5;
                l45 l45Var = (l45) obj4;
                op3 op3Var = (op3) obj3;
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var3, 48);
                    int iHashCode = Long.hashCode(e18Var3.T);
                    hyc hycVarL = e18Var3.l();
                    iqb iqbVarE = kxk.E(e18Var3, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var3.e0();
                    if (e18Var3.S) {
                        e18Var3.k(re4Var);
                    } else {
                        e18Var3.n0();
                    }
                    d4c.i0(e18Var3, cd4.f, cxeVarA);
                    d4c.i0(e18Var3, cd4.e, hycVarL);
                    d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var3, cd4.h);
                    d4c.i0(e18Var3, cd4.d, iqbVarE);
                    tjh.b(str2, new hw9(1.0f, false), gm3.a(e18Var3).N, 0L, null, null, null, 0L, null, null, 0L, 5, false, 1, 0, null, ((jm3) gm3.c(e18Var3).e.E).i, e18Var3, 0, 24960, 110584);
                    String strJ0 = d4c.j0(R.string.connector_directory_connector_url_label, e18Var3);
                    boolean zH2 = e18Var3.h(l45Var) | e18Var3.h(op3Var) | e18Var3.f(strJ0) | e18Var3.f(str2);
                    Object objN3 = e18Var3.N();
                    if (zH2 || objN3 == lz1Var) {
                        objN3 = new sm1(l45Var, op3Var, strJ0, str2);
                        e18Var3.k0(objN3);
                    }
                    ez1.e((zy7) objN3, null, false, null, null, ib4.b, e18Var3, 1572864, 62);
                    e18Var3.p(true);
                } else {
                    e18Var3.T();
                }
                return ieiVar;
            case 7:
                j0a j0aVar = (j0a) obj;
                j0aVar.getClass();
                ((mnc) obj2).getClass();
                int i3 = 11;
                cqk.g(j0aVar, (List) obj5, (bz7) obj4, (pl3) obj3, new fc4(i3), new ic4(17), null, new lc4(i3), null, false, 416);
                return ieiVar;
            case 8:
                ConwayAppScreen.Extension extension = (ConwayAppScreen.Extension) obj5;
                nwb nwbVar2 = (nwb) obj4;
                lsc lscVar = (lsc) obj3;
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                } else if (extension == null || !(((bf3) lscVar.getValue()).a.a instanceof ConwayAppScreen.Chat)) {
                    e18Var4.a0(1415940773);
                    e18Var4.p(false);
                } else {
                    e18Var4.a0(1415745690);
                    ir4 ir4Var = (ir4) nwbVar2.getValue();
                    String name = extension.getName();
                    boolean zF2 = e18Var4.f(nwbVar2);
                    Object objN4 = e18Var4.N();
                    if (zF2 || objN4 == lz1Var) {
                        objN4 = new x40(23, nwbVar2);
                        e18Var4.k0(objN4);
                    }
                    zrk.a(ir4Var, name, (bz7) objN4, null, e18Var4, 0);
                    e18Var4.p(false);
                }
                return ieiVar;
            case 9:
                List list = (List) obj5;
                ConwayAppScreen.Extension extension2 = (ConwayAppScreen.Extension) obj4;
                bz7 bz7Var2 = (bz7) obj3;
                ld4 ld4Var5 = (ld4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                e18 e18Var5 = (e18) ld4Var5;
                if (e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    kr4.c(list, extension2, bz7Var2, null, e18Var5, ConwayAppScreen.Extension.$stable << 3);
                } else {
                    e18Var5.T();
                }
                return ieiVar;
            case 10:
                ConwayAppScreen.Extension extension3 = (ConwayAppScreen.Extension) obj5;
                isc iscVar = (isc) obj4;
                zy7 zy7Var = (zy7) obj3;
                ld4 ld4Var6 = (ld4) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                int i4 = 2;
                e18 e18Var6 = (e18) ld4Var6;
                if (e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ta4 ta4VarQ0 = fd9.q0(181936668, new mk4(i4, extension3), e18Var6);
                    ta4 ta4VarQ02 = fd9.q0(520439838, new mk4(i2, iscVar), e18Var6);
                    ta4 ta4VarQ03 = fd9.q0(-403861817, new tu(13, zy7Var), e18Var6);
                    qnc qncVar = n2i.a;
                    eg0.d(ta4VarQ0, null, ta4VarQ02, ta4VarQ03, MTTypesetterKt.kLineSkipLimitMultiplier, null, n2i.d(gm3.a(e18Var6).o, 0L, 0L, 0L, 0L, e18Var6, 62), null, e18Var6, 3462, 434);
                } else {
                    e18Var6.T();
                }
                return ieiVar;
            case 11:
                p05 p05Var = (p05) obj4;
                String str3 = (String) obj5;
                nwb nwbVar3 = (nwb) obj3;
                ld4 ld4Var7 = (ld4) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                e18 e18Var7 = (e18) ld4Var7;
                if (e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    boolean zF3 = e18Var7.f(p05Var) | e18Var7.f(str3) | e18Var7.f(nwbVar3);
                    Object objN5 = e18Var7.N();
                    if (zF3 || objN5 == lz1Var) {
                        objN5 = new yg4(p05Var, str3, nwbVar3, 5);
                        e18Var7.k0(objN5);
                    }
                    csg.j((zy7) objN5, null, false, null, null, null, null, gjk.g, e18Var7, 805306368, 510);
                } else {
                    e18Var7.T();
                }
                return ieiVar;
            case 12:
                List list2 = (List) obj5;
                bz7 bz7Var3 = (bz7) obj4;
                bz7 bz7Var4 = (bz7) obj3;
                ld4 ld4Var8 = (ld4) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                e18 e18Var8 = (e18) ld4Var8;
                if (e18Var8.Q(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    hsk.c(list2, bz7Var3, bz7Var4, null, e18Var8, 0);
                } else {
                    e18Var8.T();
                }
                return ieiVar;
            case 13:
                ((Integer) obj2).getClass();
                msk.a((pw4) obj5, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 14:
                ((Integer) obj2).getClass();
                osk.j((upg) obj5, (iqb) obj4, (sfb) obj3, (ld4) obj, x44.p0(9));
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((Integer) obj2).getClass();
                psk.d((fz4) obj5, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 16:
                wlg wlgVar = (wlg) obj5;
                nwb nwbVar4 = (nwb) obj4;
                wlg wlgVar2 = (wlg) obj3;
                ld4 ld4Var9 = (ld4) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                e18 e18Var9 = (e18) ld4Var9;
                if (e18Var9.Q(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    h.d((ls4) wlgVar.getValue(), ((Boolean) nwbVar4.getValue()).booleanValue(), ((Boolean) wlgVar2.getValue()).booleanValue(), null, e18Var9, 0);
                } else {
                    e18Var9.T();
                }
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                nwb nwbVar5 = (nwb) obj5;
                wlg wlgVar3 = (wlg) obj4;
                bz7 bz7Var5 = (bz7) obj3;
                ld4 ld4Var10 = (ld4) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                e18 e18Var10 = (e18) ld4Var10;
                if (e18Var10.Q(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    twj.b(b.s(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 300.0f, 3).B(b.c), null, null, null, null, fd9.q0(-2009063821, new xg4(nwbVar5, wlgVar3, bz7Var5), e18Var10), e18Var10, 196608, 30);
                } else {
                    e18Var10.T();
                }
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                Set set = (Set) obj5;
                McpServer mcpServer = (McpServer) obj4;
                pz7 pz7Var = (pz7) obj3;
                ld4 ld4Var11 = (ld4) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                e18 e18Var11 = (e18) ld4Var11;
                if (e18Var11.Q(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    boolean zContains = set.contains(McpServerId.m1029boximpl(mcpServer.m346getUuidowoRr7k()));
                    boolean zF4 = e18Var11.f(pz7Var) | e18Var11.f(mcpServer);
                    Object objN6 = e18Var11.N();
                    if (zF4 || objN6 == lz1Var) {
                        objN6 = new f25(pz7Var, 2, mcpServer);
                        e18Var11.k0(objN6);
                    }
                    zsk.d(zContains, null, false, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, (bz7) objN6, e18Var11, 0, 62);
                } else {
                    e18Var11.T();
                }
                return ieiVar;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((Integer) obj2).getClass();
                puk.a((String) obj5, (AlarmCreateV0Input) obj4, (qi3) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ((Integer) obj2).getClass();
                puk.c((String) obj5, (TimerCreateV0Input) obj4, (qi3) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 21:
                bt7 bt7Var = (bt7) obj5;
                yih yihVar = (yih) obj4;
                znd zndVar = (znd) obj3;
                ld4 ld4Var12 = (ld4) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                e18 e18Var12 = (e18) ld4Var12;
                if (e18Var12.Q(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    bg1.a(yihVar, iv1.s(b.c(fqbVar, 1.0f), bt7Var), false, null, tkh.b(((jm3) gm3.c(e18Var12).e.E).g, gm3.a(e18Var12).N, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214), null, unb.R, null, new eeg(gm3.a(e18Var12).N), new qb5((Object) yihVar, (Object) zndVar, false), null, e18Var12, 100663296, 22236);
                } else {
                    e18Var12.T();
                }
                return ieiVar;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((Integer) obj2).getClass();
                cvk.a((znd) obj5, (yih) obj4, (mzi) obj3, (ld4) obj, x44.p0(9));
                return ieiVar;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                iqb iqbVar = (iqb) obj5;
                y85 y85Var = (y85) obj4;
                zy7 zy7Var2 = (zy7) obj3;
                ld4 ld4Var13 = (ld4) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                e18 e18Var13 = (e18) ld4Var13;
                if (e18Var13.Q(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    zni.e(iqbVar, ikk.a, fd9.q0(612734982, new t04(y85Var, 26, zy7Var2), e18Var13), null, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var13, 432, 248);
                } else {
                    e18Var13.T();
                }
                return ieiVar;
            case 24:
                ta4 ta4Var = (ta4) obj5;
                ta4 ta4Var2 = (ta4) obj4;
                pz7 pz7Var2 = (pz7) obj3;
                ld4 ld4Var14 = (ld4) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                e18 e18Var14 = (e18) ld4Var14;
                if (!e18Var14.Q(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    e18Var14.T();
                    return ieiVar;
                }
                q64 q64VarA = p64.a(ko0.g, lja.S, e18Var14, 6);
                int iHashCode2 = Long.hashCode(e18Var14.T);
                hyc hycVarL2 = e18Var14.l();
                iqb iqbVarE2 = kxk.E(e18Var14, fqbVar);
                dd4.e.getClass();
                re4 re4Var2 = cd4.b;
                e18Var14.e0();
                if (e18Var14.S) {
                    e18Var14.k(re4Var2);
                } else {
                    e18Var14.n0();
                }
                z80 z80Var = cd4.f;
                d4c.i0(e18Var14, z80Var, q64VarA);
                z80 z80Var2 = cd4.e;
                d4c.i0(e18Var14, z80Var2, hycVarL2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                z80 z80Var3 = cd4.g;
                d4c.i0(e18Var14, z80Var3, numValueOf);
                bx bxVar = cd4.h;
                d4c.h0(e18Var14, bxVar);
                z80 z80Var4 = cd4.d;
                d4c.i0(e18Var14, z80Var4, iqbVarE2);
                s64 s64Var = s64.a;
                iqb iqbVarB = s64Var.b(fqbVar, 1.0f, false);
                xo1 xo1Var = lja.G;
                o5b o5bVarD = dw1.d(xo1Var, false);
                int iHashCode3 = Long.hashCode(e18Var14.T);
                hyc hycVarL3 = e18Var14.l();
                iqb iqbVarE3 = kxk.E(e18Var14, iqbVarB);
                e18Var14.e0();
                if (e18Var14.S) {
                    e18Var14.k(re4Var2);
                } else {
                    e18Var14.n0();
                }
                d4c.i0(e18Var14, z80Var, o5bVarD);
                d4c.i0(e18Var14, z80Var2, hycVarL3);
                ij0.t(iHashCode3, e18Var14, z80Var3, e18Var14, bxVar);
                d4c.i0(e18Var14, z80Var4, iqbVarE3);
                ta4Var.invoke(s64Var, e18Var14, 6);
                e18Var14.p(true);
                iqb iqbVarI = gb9.I(s64Var.a(fqbVar, lja.U), zl5.a);
                o5b o5bVarD2 = dw1.d(xo1Var, false);
                int iHashCode4 = Long.hashCode(e18Var14.T);
                hyc hycVarL4 = e18Var14.l();
                iqb iqbVarE4 = kxk.E(e18Var14, iqbVarI);
                e18Var14.e0();
                if (e18Var14.S) {
                    e18Var14.k(re4Var2);
                } else {
                    e18Var14.n0();
                }
                d4c.i0(e18Var14, z80Var, o5bVarD2);
                d4c.i0(e18Var14, z80Var2, hycVarL4);
                ij0.t(iHashCode4, e18Var14, z80Var3, e18Var14, bxVar);
                d4c.i0(e18Var14, z80Var4, iqbVarE4);
                zh4.h(p54.d(qwk.a, e18Var14), bci.a(qwk.b, e18Var14), fd9.q0(-1103927529, new kt(ta4Var2, pz7Var2, 2), e18Var14), e18Var14, 384);
                e18Var14.p(true);
                e18Var14.p(true);
                return ieiVar;
            case BuildConfig.VERSION_CODE /* 25 */:
                ((Integer) obj2).getClass();
                qwk.a((zy7) obj5, (qi3) obj4, (jx5) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 26:
                iwg iwgVar = (iwg) obj5;
                eli eliVar2 = (eli) obj4;
                zy7 zy7Var3 = (zy7) obj3;
                ld4 ld4Var15 = (ld4) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                e18 e18Var15 = (e18) ld4Var15;
                if (!e18Var15.Q(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    e18Var15.T();
                } else if (iwgVar == iwg.E) {
                    e18Var15.a0(303227535);
                    boolean zH3 = e18Var15.h(eliVar2) | e18Var15.f(zy7Var3);
                    Object objN7 = e18Var15.N();
                    if (zH3 || objN7 == lz1Var) {
                        objN7 = new w95(eliVar2, 14, zy7Var3);
                        e18Var15.k0(objN7);
                    }
                    lnk.d((zy7) objN7, null, false, null, null, null, null, skk.f, e18Var15, 805306368, 510);
                    e18Var15.p(false);
                } else {
                    e18Var15.a0(303488028);
                    lnk.d(zy7Var3, null, false, null, null, null, null, skk.g, e18Var15, 805306368, 510);
                    e18Var15.p(false);
                }
                return ieiVar;
            case 27:
                String str4 = (String) obj5;
                qi3 qi3Var = (qi3) obj4;
                zy7 zy7Var4 = (zy7) obj3;
                ld4 ld4Var16 = (ld4) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                e18 e18Var16 = (e18) ld4Var16;
                if (e18Var16.Q(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    h66.q(str4, qi3Var, zy7Var4, e18Var16, 0);
                } else {
                    e18Var16.T();
                }
                return ieiVar;
            case 28:
                ((Integer) obj2).getClass();
                h66.l((String) obj5, (iqb) obj4, (ta4) obj3, (ld4) obj, x44.p0(385));
                return ieiVar;
            default:
                bz7 bz7Var6 = (bz7) obj5;
                r4g r4gVar = (r4g) obj4;
                nwb nwbVar6 = (nwb) obj3;
                String str5 = (String) obj;
                String str6 = (String) obj2;
                strM1059constructorimpl = str6 != null ? ModelId.m1059constructorimpl(str6) : null;
                nwbVar6.setValue((strM1059constructorimpl == null || !((Boolean) bz7Var6.invoke(ModelId.m1058boximpl(strM1059constructorimpl))).booleanValue()) ? new ma7(str5, strM1059constructorimpl) : new na7(str5, strM1059constructorimpl));
                r4gVar.a();
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ f44(int i, Object obj, Object obj2, String str) {
        this.E = i;
        this.G = obj;
        this.F = str;
        this.H = obj2;
    }

    public /* synthetic */ f44(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.E = i2;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
    }

    public /* synthetic */ f44(Object obj, Object obj2, Object obj3, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
    }
}
