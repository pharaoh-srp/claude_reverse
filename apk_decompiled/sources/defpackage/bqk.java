package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.types.strings.ToolUseId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bqk {
    public static final ta4 a = new ta4(728164927, false, new ub4(20));
    public static final ta4 b = new ta4(-1505537844, false, new tb4(16));

    public static final void a(String str, final boolean z, final boolean z2, Boolean bool, final pz7 pz7Var, final bz7 bz7Var, zy7 zy7Var, final bz7 bz7Var2, final zy7 zy7Var2, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        boolean z3;
        boolean z4;
        bz7 bz7Var3;
        bz7 bz7Var4;
        zy7 zy7Var3;
        iqb iqbVar2;
        dk4 dk4Var;
        str.getClass();
        pz7Var.getClass();
        bz7Var.getClass();
        zy7Var.getClass();
        bz7Var2.getClass();
        zy7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1768474924);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z3 = z;
            i2 |= e18Var.g(z3) ? 32 : 16;
        } else {
            z3 = z;
        }
        if ((i & 384) == 0) {
            z4 = z2;
            i2 |= e18Var.g(z4) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            z4 = z2;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(bool) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? e18Var.f(pz7Var) : e18Var.h(pz7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            bz7Var3 = bz7Var;
            i2 |= e18Var.h(bz7Var3) ? 131072 : 65536;
        } else {
            bz7Var3 = bz7Var;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            bz7Var4 = bz7Var2;
            i2 |= e18Var.h(bz7Var4) ? 8388608 : 4194304;
        } else {
            bz7Var4 = bz7Var2;
        }
        if ((100663296 & i) == 0) {
            zy7Var3 = zy7Var2;
            i2 |= e18Var.h(zy7Var3) ? 67108864 : 33554432;
        } else {
            zy7Var3 = zy7Var2;
        }
        if ((805306368 & i) == 0) {
            i2 |= e18Var.f(iqbVar) ? 536870912 : 268435456;
        }
        int i3 = i2;
        if (e18Var.Q(i3 & 1, (i3 & 306783379) != 306783378)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = fd9.O(im6.E, e18Var);
                e18Var.k0(objN);
            }
            final l45 l45Var = (l45) objN;
            boolean z5 = (i3 & 14) == 4;
            Object objN2 = e18Var.N();
            if (z5 || objN2 == lz1Var) {
                objN2 = mpk.P(dk4.E);
                e18Var.k0(objN2);
            }
            final nwb nwbVar = (nwb) objN2;
            dk4 dk4Var2 = x44.r(bool, Boolean.FALSE) ? dk4.H : (dk4) nwbVar.getValue();
            if (x44.r(bool, Boolean.TRUE)) {
                r7e r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    r7eVarS.d = new ak4(str, z3, z4, bool, pz7Var, bz7Var3, zy7Var, bz7Var4, zy7Var3, iqbVar, i, 0);
                    return;
                }
                return;
            }
            Object[] objArr = {ToolUseId.m1157boximpl(str)};
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = new l84(14);
                e18Var.k0(objN3);
            }
            nwb nwbVar2 = (nwb) iuj.I(objArr, (zy7) objN3, e18Var, 48);
            ToolUseId toolUseIdM1157boximpl = ToolUseId.m1157boximpl(str);
            boolean zF = e18Var.f(nwbVar2) | e18Var.d(dk4Var2.ordinal()) | ((i3 & 3670016) == 1048576);
            Object objN4 = e18Var.N();
            if (zF || objN4 == lz1Var) {
                dk4Var = dk4Var2;
                zn znVar = new zn(dk4Var, zy7Var, nwbVar2, null, 8);
                e18Var.k0(znVar);
                objN4 = znVar;
            } else {
                dk4Var = dk4Var2;
            }
            fd9.i(e18Var, (pz7) objN4, toolUseIdM1157boximpl);
            final long j = gm3.a(e18Var).n;
            final dk4 dk4Var3 = dk4Var;
            iqbVar2 = iqbVar;
            mvk.b(d4c.j0(R.string.connector_discovery_opt_in_header, e18Var), iqbVar2, fd9.q0(-100443077, new rz7() { // from class: bk4
                @Override // defpackage.rz7
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z6;
                    Object dnVar;
                    zy7 zy7Var4;
                    pz7 pz7Var2;
                    bz7 bz7Var5;
                    nwb nwbVar3;
                    y02 y02Var;
                    boolean z7;
                    ld4 ld4Var2 = (ld4) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((s64) obj).getClass();
                    e18 e18Var2 = (e18) ld4Var2;
                    if (e18Var2.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        dk4 dk4Var4 = dk4Var3;
                        int iOrdinal = dk4Var4.ordinal();
                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                            e18Var2.a0(1292802672);
                            tjh.b(d4c.j0(R.string.connector_discovery_opt_in_title, e18Var2), null, gm3.a(e18Var2).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).h, e18Var2, 0, 0, 131066);
                            tjh.b(d4c.j0(R.string.connector_discovery_opt_in_body, e18Var2), null, gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 0, 0, 131066);
                            if (z) {
                                e18Var2.a0(1293473016);
                                boolean z8 = dk4Var4 != dk4.E;
                                ho0 ho0Var = new ho0(8.0f, true, new sz6(1));
                                iqb iqbVarC = b.c(fqb.E, 1.0f);
                                cxe cxeVarA = axe.a(ho0Var, lja.P, e18Var2, 6);
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
                                String strJ0 = d4c.j0(R.string.connector_discovery_opt_in_not_now, e18Var2);
                                boolean z9 = dk4Var4 == dk4.G;
                                boolean z10 = z2;
                                boolean z11 = (z8 || z10) ? false : true;
                                if (1.0f <= 0.0d) {
                                    z29.a("invalid weight; must be greater than zero");
                                }
                                hw9 hw9Var = new hw9(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                                bz7 bz7Var6 = bz7Var2;
                                boolean zF2 = e18Var2.f(bz7Var6);
                                nwb nwbVar4 = nwbVar;
                                boolean zF3 = zF2 | e18Var2.f(nwbVar4);
                                l45 l45Var2 = l45Var;
                                boolean zH = zF3 | e18Var2.h(l45Var2);
                                pz7 pz7Var3 = pz7Var;
                                boolean zH2 = zH | e18Var2.h(pz7Var3);
                                zy7 zy7Var5 = zy7Var2;
                                boolean zF4 = zH2 | e18Var2.f(zy7Var5);
                                Object objN5 = e18Var2.N();
                                lz1 lz1Var2 = jd4.a;
                                if (zF4 || objN5 == lz1Var2) {
                                    zy7Var4 = zy7Var5;
                                    pz7Var2 = pz7Var3;
                                    dnVar = new dn((Object) bz7Var6, (Object) l45Var2, (Object) nwbVar4, (Object) pz7Var2, zy7Var4, 6);
                                    bz7Var5 = bz7Var6;
                                    nwbVar3 = nwbVar4;
                                    e18Var2.k0(dnVar);
                                } else {
                                    zy7Var4 = zy7Var5;
                                    pz7Var2 = pz7Var3;
                                    nwbVar3 = nwbVar4;
                                    dnVar = objN5;
                                    bz7Var5 = bz7Var6;
                                }
                                zy7 zy7Var6 = (zy7) dnVar;
                                zy7 zy7Var7 = zy7Var4;
                                f12 f12Var = f12.a;
                                y02 y02Var2 = y02.a;
                                long j2 = j;
                                pz7 pz7Var4 = pz7Var2;
                                dxj.a(strJ0, z9, hw9Var, z11, null, f12Var, y02Var2, j2, zy7Var6, e18Var2, 1769472, 16);
                                String strJ02 = d4c.j0(R.string.connector_discovery_opt_in_turn_on, e18Var2);
                                boolean z12 = dk4Var4 == dk4.F;
                                if (z8 || z10) {
                                    y02Var = y02Var2;
                                    z7 = false;
                                } else {
                                    y02Var = y02Var2;
                                    z7 = true;
                                }
                                if (1.0f <= 0.0d) {
                                    z29.a("invalid weight; must be greater than zero");
                                }
                                hw9 hw9Var2 = new hw9(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                                boolean zF5 = e18Var2.f(bz7Var5) | e18Var2.f(nwbVar3) | e18Var2.h(l45Var2) | e18Var2.h(pz7Var4);
                                bz7 bz7Var7 = bz7Var;
                                boolean zF6 = zF5 | e18Var2.f(bz7Var7) | e18Var2.f(zy7Var7);
                                Object objN6 = e18Var2.N();
                                if (zF6 || objN6 == lz1Var2) {
                                    objN6 = new ck4(bz7Var5, l45Var2, nwbVar3, pz7Var4, bz7Var7, zy7Var7);
                                    e18Var2.k0(objN6);
                                }
                                dxj.a(strJ02, z12, hw9Var2, z7, null, e12.a, y02Var, j2, (zy7) objN6, e18Var2, 1769472, 16);
                                e18Var2 = e18Var2;
                                e18Var2.p(true);
                                z6 = false;
                                e18Var2.p(false);
                            } else {
                                z6 = false;
                                e18Var2.a0(1296009095);
                                e18Var2.p(false);
                            }
                            e18Var2.p(z6);
                        } else {
                            if (iOrdinal != 3) {
                                throw ebh.u(e18Var2, -2036512030, false);
                            }
                            e18Var2.a0(1296093880);
                            tjh.b(d4c.j0(R.string.connector_discovery_opt_in_declined_title, e18Var2), null, gm3.a(e18Var2).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).h, e18Var2, 0, 0, 131066);
                            tjh.b(d4c.j0(R.string.connector_discovery_opt_in_declined_body, e18Var2), null, gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 0, 0, 131066);
                            e18Var2.p(false);
                        }
                    } else {
                        e18Var2.T();
                    }
                    return iei.a;
                }
            }, e18Var), e18Var, ((i3 >> 24) & 112) | 384);
        } else {
            iqbVar2 = iqbVar;
            e18Var.T();
        }
        r7e r7eVarS2 = e18Var.s();
        if (r7eVarS2 != null) {
            r7eVarS2.d = new ak4(str, z, z2, bool, pz7Var, bz7Var, zy7Var, bz7Var2, zy7Var2, iqbVar2, i, 1);
        }
    }

    public static final void b(ud0 ud0Var, String str, String str2, boolean z, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        str.getClass();
        str2.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(508696589);
        int i2 = i | (e18Var.f(ud0Var) ? 4 : 2) | (e18Var.f(str) ? 32 : 16) | (e18Var.f(str2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.g(z) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(zy7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        if (e18Var.Q(i2 & 1, (74899 & i2) != 74898)) {
            iqb iqbVarL = gb9.L(androidx.compose.foundation.b.c(iqbVar, false, null, new vue(3), null, zy7Var, 11), MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, 1);
            q64 q64VarA = p64.a(new ho0(2.0f, true, new sz6(1)), lja.S, e18Var, 6);
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
            fqb fqbVar = fqb.E;
            iqb iqbVarC = b.c(fqbVar, 1.0f);
            cxe cxeVarA = axe.a(new ho0(12.0f, true, new sz6(1)), lja.Q, e18Var, 54);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarC);
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
            ud0 ud0Var2 = ud0.d;
            cv8.b(a.a(ud0Var, e18Var), null, b.o(fqbVar, 20.0f), gm3.a(e18Var).N, e18Var, 440, 0);
            tjh.b(str, new hw9(1.0f, true), gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).e, e18Var, (i2 >> 3) & 14, 24960, 110584);
            vjk.b(z, zy7Var, null, false, ijk.e(gm3.a(e18Var).c, gm3.a(e18Var).O, 0L, 0L, e18Var, 12), e18Var, (i2 >> 9) & 126, 44);
            e18Var.p(true);
            tjh.b(str2, gb9.N(fqbVar, 32.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 14), gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 2, false, 3, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, ((i2 >> 6) & 14) | 48, 24960, 110584);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ht0(ud0Var, str, str2, z, zy7Var, iqbVar, i);
        }
    }

    public static final int c(LogRecord logRecord) {
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
    }

    public static final boolean d(int i) {
        return i == 2 || i == 4 || i == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:27:0x007d, B:29:0x0085, B:30:0x0090, B:37:0x00a0, B:24:0x006c, B:39:0x00a3, B:41:0x00a8, B:42:0x00a9, B:23:0x0066, B:31:0x0091, B:33:0x0097), top: B:57:0x0021, outer: #1, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa A[Catch: all -> 0x00b3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00b3, blocks: (B:43:0x00aa, B:50:0x00b7, B:51:0x00ba, B:12:0x002d, B:27:0x007d, B:29:0x0085, B:30:0x0090, B:37:0x00a0, B:24:0x006c, B:39:0x00a3, B:41:0x00a8, B:42:0x00a9, B:23:0x0066, B:31:0x0091, B:33:0x0097, B:48:0x00b5), top: B:57:0x0021, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007a -> B:27:0x007d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.vp4 r10) {
        /*
            boolean r0 = r10 instanceof defpackage.y78
            if (r0 == 0) goto L13
            r0 = r10
            y78 r0 = (defpackage.y78) r0
            int r1 = r0.J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.J = r1
            goto L18
        L13:
            y78 r0 = new y78
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.I
            m45 r1 = defpackage.m45.E
            int r2 = r0.J
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 != r5) goto L34
            sy1 r2 = r0.H
            d6e r6 = r0.G
            cd r7 = r0.F
            java.util.concurrent.atomic.AtomicBoolean r8 = r0.E
            defpackage.sf5.h0(r10)     // Catch: java.lang.Throwable -> L31
            goto L7d
        L31:
            r10 = move-exception
            goto Lb5
        L34:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r10)
            return r4
        L3a:
            defpackage.sf5.h0(r10)
            r10 = 6
            zy1 r6 = defpackage.wd6.P(r5, r10, r4)
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r10.<init>(r3)
            f25 r2 = new f25
            r7 = 13
            r2.<init>(r10, r7, r6)
            java.lang.Object r7 = defpackage.ycg.c
            monitor-enter(r7)
            java.util.List r8 = defpackage.ycg.i     // Catch: java.lang.Throwable -> Lbf
            java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.lang.Throwable -> Lbf
            java.util.ArrayList r8 = defpackage.w44.b1(r8, r2)     // Catch: java.lang.Throwable -> Lbf
            defpackage.ycg.i = r8     // Catch: java.lang.Throwable -> Lbf
            monitor-exit(r7)
            defpackage.ycg.a()
            cd r7 = new cd
            r8 = 14
            r7.<init>(r8, r2)
            sy1 r2 = new sy1     // Catch: java.lang.Throwable -> L31
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L31
            r8 = r10
        L6c:
            r0.E = r8     // Catch: java.lang.Throwable -> L31
            r0.F = r7     // Catch: java.lang.Throwable -> L31
            r0.G = r6     // Catch: java.lang.Throwable -> L31
            r0.H = r2     // Catch: java.lang.Throwable -> L31
            r0.J = r5     // Catch: java.lang.Throwable -> L31
            java.lang.Object r10 = r2.b(r0)     // Catch: java.lang.Throwable -> L31
            if (r10 != r1) goto L7d
            return r1
        L7d:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L31
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r10 == 0) goto Laa
            java.lang.Object r10 = r2.c()     // Catch: java.lang.Throwable -> L31
            iei r10 = (defpackage.iei) r10     // Catch: java.lang.Throwable -> L31
            r8.set(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r10 = defpackage.ycg.c     // Catch: java.lang.Throwable -> L31
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L31
            w78 r9 = defpackage.ycg.j     // Catch: java.lang.Throwable -> La7
            fwb r9 = r9.h     // Catch: java.lang.Throwable -> La7
            if (r9 == 0) goto L9f
            boolean r9 = r9.i()     // Catch: java.lang.Throwable -> La7
            if (r9 != r5) goto L9f
            r9 = r5
            goto La0
        L9f:
            r9 = r3
        La0:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L31
            if (r9 == 0) goto L6c
            defpackage.ycg.a()     // Catch: java.lang.Throwable -> L31
            goto L6c
        La7:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L31
            throw r0     // Catch: java.lang.Throwable -> L31
        Laa:
            r6.d(r4)     // Catch: java.lang.Throwable -> Lb3
            r7.h()
            iei r10 = defpackage.iei.a
            return r10
        Lb3:
            r10 = move-exception
            goto Lbb
        Lb5:
            throw r10     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            r0 = move-exception
            defpackage.oq5.s(r6, r10)     // Catch: java.lang.Throwable -> Lb3
            throw r0     // Catch: java.lang.Throwable -> Lb3
        Lbb:
            r7.h()
            throw r10
        Lbf:
            r10 = move-exception
            monitor-exit(r7)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqk.e(vp4):java.lang.Object");
    }

    public static void f(int i, int i2) {
        String strH;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strH = cqk.h("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    sz6.p(ij0.g(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
                    return;
                }
                strH = cqk.h("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strH);
        }
    }

    public static void g(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? h(i, i3, "start index") : (i2 < 0 || i2 > i3) ? h(i2, i3, "end index") : cqk.h("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String h(int i, int i2, String str) {
        if (i < 0) {
            return cqk.h("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return cqk.h("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        sz6.p(ij0.g(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
        return null;
    }
}
