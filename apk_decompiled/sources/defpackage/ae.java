package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.mcp.McpPrompt;
import com.anthropic.claude.api.mcp.McpResource;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.types.strings.McpServerId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ae {
    public static final void a(McpServer mcpServer, bz7 bz7Var, bz7 bz7Var2, i4g i4gVar, ld4 ld4Var, int i) {
        McpServer mcpServer2;
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(2136646029);
        if ((i & 6) == 0) {
            mcpServer2 = mcpServer;
            i2 = (e18Var.f(mcpServer2) ? 4 : 2) | i;
        } else {
            mcpServer2 = mcpServer;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(bz7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(bz7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(i4gVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            List<McpPrompt> prompts = mcpServer2.getPrompts();
            if (prompts == null) {
                prompts = lm6.E;
            }
            ArrayList arrayListI = qok.i(mcpServer2);
            boolean zF = e18Var.f(prompts) | e18Var.f(arrayListI);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                d8a d8aVarE = x44.E();
                Iterator<T> it = prompts.iterator();
                while (it.hasNext()) {
                    d8aVarE.add(new d3b((McpPrompt) it.next()));
                }
                Iterator it2 = arrayListI.iterator();
                while (it2.hasNext()) {
                    d8aVarE.add(new e3b((McpResource) it2.next()));
                }
                objN = x44.v(d8aVarE);
                e18Var.k0(objN);
            }
            List list = (List) objN;
            i4gVar.getClass();
            qnc qncVarQ0 = xn5.q0(i4gVar.a, gb9.b(MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 1));
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new q6(3);
                e18Var.k0(objN2);
            }
            lvk.b(false, list, null, (bz7) objN2, null, i4gVar, null, null, zsj.a, fd9.q0(-1675347465, new wd(bz7Var, qncVarQ0, bz7Var2), e18Var), e18Var, ((i2 << 6) & 458752) | 905972742, 212);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xd(mcpServer2, bz7Var, bz7Var2, i4gVar, i, 0);
        }
    }

    public static final void b(final hw2 hw2Var, final f03 f03Var, final t4g t4gVar, final String str, final i4g i4gVar, ld4 ld4Var, final int i) {
        int i2;
        String str2;
        r7e r7eVarS;
        pz7 pz7Var;
        str.getClass();
        i4gVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-973820008);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(hw2Var) : e18Var.h(hw2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var.f(f03Var) : e18Var.h(f03Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? e18Var.f(t4gVar) : e18Var.h(t4gVar) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            str2 = str;
            i2 |= e18Var.f(str2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            str2 = str;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.f(i4gVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        boolean z = true;
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            McpServer mcpServer = (McpServer) f03Var.k.b().get(McpServerId.m1029boximpl(str2));
            lz1 lz1Var = jd4.a;
            if (mcpServer == null) {
                e18Var.a0(1432548554);
                if ((i2 & 896) != 256 && ((i2 & 512) == 0 || !e18Var.h(t4gVar))) {
                    z = false;
                }
                Object objN = e18Var.N();
                if (z || objN == lz1Var) {
                    objN = new zd(t4gVar, null, 0);
                    e18Var.k0(objN);
                }
                fd9.i(e18Var, (pz7) objN, iei.a);
                e18Var.p(false);
                r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    final int i3 = 0;
                    final String str3 = str2;
                    pz7Var = new pz7() { // from class: ud
                        @Override // defpackage.pz7
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = i3;
                            iei ieiVar = iei.a;
                            int i5 = i;
                            switch (i4) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iP0 = x44.p0(i5 | 1);
                                    ae.b(hw2Var, f03Var, t4gVar, str3, i4gVar, (ld4) obj, iP0);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iP02 = x44.p0(i5 | 1);
                                    ae.b(hw2Var, f03Var, t4gVar, str3, i4gVar, (ld4) obj, iP02);
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    r7eVarS.d = pz7Var;
                }
                return;
            }
            e18Var.a0(1432702314);
            e18Var.p(false);
            int i4 = i2 & 896;
            int i5 = i2 & 14;
            boolean zF = (i4 == 256 || ((i2 & 512) != 0 && e18Var.h(t4gVar))) | e18Var.f(mcpServer) | (i5 == 4 || ((i2 & 8) != 0 && e18Var.h(hw2Var)));
            Object objN2 = e18Var.N();
            if (zF || objN2 == lz1Var) {
                objN2 = new vd(t4gVar, mcpServer, hw2Var);
                e18Var.k0(objN2);
            }
            bz7 bz7Var = (bz7) objN2;
            boolean zF2 = (i5 == 4 || ((i2 & 8) != 0 && e18Var.h(hw2Var))) | e18Var.f(mcpServer);
            if (i4 != 256 && ((i2 & 512) == 0 || !e18Var.h(t4gVar))) {
                z = false;
            }
            boolean z2 = zF2 | z;
            Object objN3 = e18Var.N();
            if (z2 || objN3 == lz1Var) {
                objN3 = new vd(hw2Var, mcpServer, t4gVar);
                e18Var.k0(objN3);
            }
            a(mcpServer, bz7Var, (bz7) objN3, i4gVar, e18Var, (i2 >> 3) & 7168);
        } else {
            e18Var.T();
        }
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final int i6 = 1;
            pz7Var = new pz7() { // from class: ud
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = i6;
                    iei ieiVar = iei.a;
                    int i52 = i;
                    switch (i42) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iP0 = x44.p0(i52 | 1);
                            ae.b(hw2Var, f03Var, t4gVar, str, i4gVar, (ld4) obj, iP0);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iP02 = x44.p0(i52 | 1);
                            ae.b(hw2Var, f03Var, t4gVar, str, i4gVar, (ld4) obj, iP02);
                            break;
                    }
                    return ieiVar;
                }
            };
            r7eVarS.d = pz7Var;
        }
    }
}
