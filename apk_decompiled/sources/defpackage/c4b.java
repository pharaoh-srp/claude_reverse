package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.api.mcp.McpTool;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.McpServerId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c4b {
    public static final void a(McpServer mcpServer, zy7 zy7Var, bz7 bz7Var, pz7 pz7Var, bz7 bz7Var2, bz7 bz7Var3, zy7 zy7Var2, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(592078733);
        int i2 = i | (e18Var.f(mcpServer) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | (e18Var.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(pz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(bz7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.h(bz7Var3) ? 131072 : 65536) | (e18Var.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_COLOR : 524288);
        if (e18Var.Q(i2 & 1, (599187 & i2) != 599186)) {
            qnc qncVar = qf2.a;
            int i3 = 65534 & i2;
            int i4 = i2 << 3;
            cqk.a(mcpServer, zy7Var, bz7Var, pz7Var, bz7Var2, null, bz7Var3, zy7Var2, gb9.d(MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), e18Var, i3 | (3670016 & i4) | (i4 & 29360128), 32);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lw((Object) mcpServer, zy7Var, bz7Var, (qz7) pz7Var, (Object) bz7Var2, (Object) bz7Var3, (Object) zy7Var2, i, 12);
        }
    }

    public static final void b(final t53 t53Var, final f03 f03Var, final t4g t4gVar, final String str, ld4 ld4Var, final int i) {
        f03 f03Var2;
        r7e r7eVarS;
        pz7 pz7Var;
        boolean z;
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(445505049);
        int i2 = i | (e18Var.f(t53Var) ? 4 : 2) | (e18Var.h(f03Var) ? 32 : 16) | (e18Var.f(t4gVar) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.f(str) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            McpServer mcpServer = (McpServer) f03Var.k.b().get(McpServerId.m1029boximpl(str));
            lz1 lz1Var = jd4.a;
            if (mcpServer == null) {
                e18Var.a0(592251849);
                boolean z2 = (i2 & 896) == 256;
                Object objN = e18Var.N();
                if (z2 || objN == lz1Var) {
                    objN = new zd(t4gVar, null, 4);
                    e18Var.k0(objN);
                }
                fd9.i(e18Var, (pz7) objN, iei.a);
                e18Var.p(false);
                r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    final int i3 = 0;
                    pz7Var = new pz7(t53Var, f03Var, t4gVar, str, i, i3) { // from class: a4b
                        public final /* synthetic */ int E;
                        public final /* synthetic */ t53 F;
                        public final /* synthetic */ f03 G;
                        public final /* synthetic */ t4g H;
                        public final /* synthetic */ String I;

                        {
                            this.E = i3;
                        }

                        @Override // defpackage.pz7
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.E;
                            iei ieiVar = iei.a;
                            switch (i4) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iP0 = x44.p0(65);
                                    c4b.b(this.F, this.G, this.H, this.I, (ld4) obj, iP0);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iP02 = x44.p0(65);
                                    c4b.b(this.F, this.G, this.H, this.I, (ld4) obj, iP02);
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    r7eVarS.d = pz7Var;
                }
                return;
            }
            f03Var2 = f03Var;
            e18Var.a0(592405609);
            e18Var.p(false);
            String strH0 = t53Var.H0();
            int i4 = i2 & 112;
            boolean zF = (i4 == 32 || e18Var.f(f03Var2)) | e18Var.f(strH0 != null ? ChatId.m978boximpl(strH0) : null);
            Object objN2 = e18Var.N();
            if (zF || objN2 == lz1Var) {
                objN2 = new pe(f03Var2, strH0, 4);
                e18Var.k0(objN2);
            }
            bz7 bz7Var = (bz7) objN2;
            boolean zF2 = (i4 == 32 || e18Var.f(f03Var2)) | e18Var.f(strH0 != null ? ChatId.m978boximpl(strH0) : null);
            Object objN3 = e18Var.N();
            if (zF2 || objN3 == lz1Var) {
                objN3 = new lpa(f03Var2, 7, strH0);
                e18Var.k0(objN3);
            }
            pz7 pz7Var2 = (pz7) objN3;
            int i5 = i2 & 7168;
            boolean zF3 = (i4 == 32 || e18Var.f(f03Var2)) | e18Var.f(strH0 != null ? ChatId.m978boximpl(strH0) : null) | (i5 == 2048);
            Object objN4 = e18Var.N();
            if (zF3 || objN4 == lz1Var) {
                objN4 = new ny4(f03Var2, strH0, str, 24);
                e18Var.k0(objN4);
            }
            bz7 bz7Var2 = (bz7) objN4;
            int i6 = i2 & 896;
            boolean z3 = (i6 == 256) | (i5 == 2048);
            Object objN5 = e18Var.N();
            if (z3 || objN5 == lz1Var) {
                objN5 = new ft9(t4gVar, 17, str);
                e18Var.k0(objN5);
            }
            zy7 zy7Var = (zy7) objN5;
            boolean z4 = (i6 == 256) | (i5 == 2048);
            Object objN6 = e18Var.N();
            if (z4 || objN6 == lz1Var) {
                z = false;
                objN6 = new b4b(t4gVar, 0, str);
                e18Var.k0(objN6);
            } else {
                z = false;
            }
            bz7 bz7Var3 = (bz7) objN6;
            boolean z5 = ((i4 == 32 || e18Var.h(f03Var2)) ? true : z) | (i5 == 2048 ? true : z);
            Object objN7 = e18Var.N();
            if (z5 || objN7 == lz1Var) {
                objN7 = new ft9(f03Var2, 18, str);
                e18Var.k0(objN7);
            }
            a(mcpServer, (zy7) objN7, bz7Var, pz7Var2, bz7Var2, bz7Var3, zy7Var, e18Var, 0);
        } else {
            f03Var2 = f03Var;
            e18Var.T();
        }
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final int i7 = 1;
            final f03 f03Var3 = f03Var2;
            pz7Var = new pz7(t53Var, f03Var3, t4gVar, str, i, i7) { // from class: a4b
                public final /* synthetic */ int E;
                public final /* synthetic */ t53 F;
                public final /* synthetic */ f03 G;
                public final /* synthetic */ t4g H;
                public final /* synthetic */ String I;

                {
                    this.E = i7;
                }

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = this.E;
                    iei ieiVar = iei.a;
                    switch (i42) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iP0 = x44.p0(65);
                            c4b.b(this.F, this.G, this.H, this.I, (ld4) obj, iP0);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iP02 = x44.p0(65);
                            c4b.b(this.F, this.G, this.H, this.I, (ld4) obj, iP02);
                            break;
                    }
                    return ieiVar;
                }
            };
            r7eVarS.d = pz7Var;
        }
    }

    public static final void c(McpServer mcpServer, bz7 bz7Var, bz7 bz7Var2, i4g i4gVar, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        iqb iqbVar2;
        bz7Var.getClass();
        bz7Var2.getClass();
        i4gVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(284868864);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(mcpServer) ? 4 : 2) | i;
        } else {
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
        int i3 = i2 | 24576;
        if (e18Var.Q(i3 & 1, (i3 & 9363) != 9362)) {
            ArrayList arrayListH = qok.h(mcpServer);
            ArrayList arrayList = new ArrayList(x44.y(arrayListH, 10));
            Iterator it = arrayListH.iterator();
            while (it.hasNext()) {
                arrayList.add((z4b) bz7Var.invoke((McpTool) it.next()));
            }
            z4b z4bVar = (z4b) w44.g1(w44.p1(w44.s1(arrayList)));
            iqbVar2 = fqb.E;
            gpk.c(z4bVar, z4b.I, bz7Var2, gb9.I(b.c(iqbVar2, 1.0f), i4gVar.a), true, null, e18Var, (i3 & 896) | 24576, 32);
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pk(mcpServer, bz7Var, bz7Var2, i4gVar, iqbVar2, i, 18);
        }
    }
}
