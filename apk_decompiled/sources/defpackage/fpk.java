package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.types.strings.McpServerId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fpk {
    public static final ta4 a;
    public static final ta4 b;

    static {
        new ta4(119654347, false, new sb4(27));
        a = new ta4(-603796846, false, new tb4(9));
        b = new ta4(347927287, false, new sb4(28));
    }

    public static final void a(final List list, final bz7 bz7Var, final bz7 bz7Var2, final mnc mncVar, final boolean z, final boolean z2, final boolean z3, final String str, final yih yihVar, final boolean z4, final zy7 zy7Var, final zy7 zy7Var2, final boolean z5, final boolean z6, final pz7 pz7Var, iqb iqbVar, final x0a x0aVar, final yzb yzbVar, final Date date, ld4 ld4Var, final int i) {
        iqb iqbVar2;
        e18 e18Var;
        iqb iqbVarI;
        list.getClass();
        bz7Var.getClass();
        bz7Var2.getClass();
        mncVar.getClass();
        str.getClass();
        yihVar.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        pz7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(240539852);
        int i2 = i | (e18Var2.f(list) ? 4 : 2) | (e18Var2.h(bz7Var) ? 32 : 16) | (e18Var2.h(bz7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        boolean zF = e18Var2.f(mncVar);
        int i3 = FreeTypeConstants.FT_LOAD_NO_RECURSE;
        int i4 = i2 | (zF ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : 1024);
        boolean zG = e18Var2.g(z);
        int i5 = FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        int i6 = i4 | (zG ? 16384 : 8192) | (e18Var2.g(z2) ? 131072 : 65536) | (e18Var2.g(z3) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var2.f(str) ? 8388608 : 4194304) | (e18Var2.f(yihVar) ? 67108864 : 33554432) | (e18Var2.g(z4) ? 536870912 : 268435456);
        int i7 = 196608 | (e18Var2.h(zy7Var) ? 4 : 2) | (e18Var2.h(zy7Var2) ? 32 : 16) | (e18Var2.g(z5) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var2.g(z6)) {
            i3 = FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
        }
        int i8 = i7 | i3;
        if (e18Var2.h(pz7Var)) {
            i5 = 16384;
        }
        int i9 = i8 | i5 | (e18Var2.f(x0aVar) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var2.f(yzbVar) ? 8388608 : 4194304) | (e18Var2.h(date) ? 67108864 : 33554432);
        if (e18Var2.Q(i6 & 1, ((i6 & 306783379) == 306783378 && (38347923 & i9) == 38347922) ? false : true)) {
            e18Var2.V();
            if ((i & 1) != 0 && !e18Var2.A()) {
                e18Var2.T();
            }
            e18Var2.q();
            boolean z7 = (i9 & 7168) == 2048;
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (z7 || objN == lz1Var) {
                objN = mpk.w(new vv(x0aVar, z6, 0));
                e18Var2.k0(objN);
            }
            wlg wlgVar = (wlg) objN;
            Boolean bool = (Boolean) wlgVar.getValue();
            bool.getClass();
            boolean zF2 = e18Var2.f(wlgVar) | ((i9 & 112) == 32);
            Object objN2 = e18Var2.N();
            if (zF2 || objN2 == lz1Var) {
                objN2 = new nu(zy7Var2, wlgVar, 1);
                e18Var2.k0(objN2);
            }
            mwa.d(bool, null, (bz7) objN2, e18Var2, 0);
            iqb iqbVar3 = fqb.E;
            if (yzbVar != null && (iqbVarI = ztj.i(iqbVar3, yzbVar, null)) != null) {
                iqbVar3 = iqbVarI;
            }
            iqbVar2 = iqbVar;
            iqb iqbVarB = iqbVar2.B(iqbVar3);
            boolean zH = ((234881024 & i6) == 67108864) | ((1879048192 & i6) == 536870912) | ((i9 & 14) == 4) | ((3670016 & i6) == 1048576) | ((i6 & 14) == 4) | ((i6 & 57344) == 16384) | ((29360128 & i6) == 8388608) | ((458752 & i6) == 131072) | ((i6 & 112) == 32) | ((i6 & 896) == 256) | ((i9 & 57344) == 16384) | e18Var2.h(date) | ((i9 & 896) == 256);
            Object objN3 = e18Var2.N();
            if (zH || objN3 == lz1Var) {
                bz7 bz7Var3 = new bz7() { // from class: wv
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj) {
                        j0a j0aVar = (j0a) obj;
                        j0aVar.getClass();
                        int i10 = 3;
                        j0a.V(j0aVar, null, null, new ta4(192372823, true, new qu(yihVar, 1)), 3);
                        if (z4) {
                            ta4 ta4Var = new ta4(-1959423588, true, new tu(2, zy7Var));
                            ind indVar = ind.H;
                            j0aVar.U(indVar, indVar, ta4Var);
                        }
                        int i11 = 0;
                        boolean z8 = z3;
                        List list2 = list;
                        if (z8 && list2.isEmpty()) {
                            ta4 ta4Var2 = puj.a;
                            ind indVar2 = ind.I;
                            j0aVar.U(indVar2, indVar2, ta4Var2);
                        } else {
                            boolean z9 = z;
                            String str2 = str;
                            if (z9 && str2.length() == 0) {
                                j0a.V(j0aVar, null, ind.E, new ta4(542471612, true, new yv(z2, i11)), 1);
                            } else if (z9 && str2.length() > 0) {
                                j0a.V(j0aVar, null, null, new ta4(403686205, true, new pp(str2, i10)), 3);
                            }
                        }
                        q6 q6Var = new q6(29);
                        zv zvVar = new zv(i11);
                        j0aVar.W(list2.size(), new kp(q6Var, 8, list2), new kp(zvVar, 9, list2), new ta4(802480018, true, new cw(list2, bz7Var, bz7Var2, pz7Var, date, 0)));
                        if (z5) {
                            ind indVar3 = ind.J;
                            j0aVar.U(indVar3, indVar3, puj.b);
                        }
                        ind indVar4 = ind.G;
                        j0aVar.U(indVar4, indVar4, puj.c);
                        return iei.a;
                    }
                };
                e18Var2.k0(bz7Var3);
                objN3 = bz7Var3;
            }
            e18Var = e18Var2;
            knk.h(iqbVarB, x0aVar, mncVar, false, null, null, null, false, null, (bz7) objN3, e18Var, ((i9 >> 15) & 112) | ((i6 >> 3) & 896), 504);
        } else {
            iqbVar2 = iqbVar;
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final iqb iqbVar4 = iqbVar2;
            r7eVarS.d = new pz7(list, bz7Var, bz7Var2, mncVar, z, z2, z3, str, yihVar, z4, zy7Var, zy7Var2, z5, z6, pz7Var, iqbVar4, x0aVar, yzbVar, date, i) { // from class: xv
                public final /* synthetic */ List E;
                public final /* synthetic */ bz7 F;
                public final /* synthetic */ bz7 G;
                public final /* synthetic */ mnc H;
                public final /* synthetic */ boolean I;
                public final /* synthetic */ boolean J;
                public final /* synthetic */ boolean K;
                public final /* synthetic */ String L;
                public final /* synthetic */ yih M;
                public final /* synthetic */ boolean N;
                public final /* synthetic */ zy7 O;
                public final /* synthetic */ zy7 P;
                public final /* synthetic */ boolean Q;
                public final /* synthetic */ boolean R;
                public final /* synthetic */ pz7 S;
                public final /* synthetic */ iqb T;
                public final /* synthetic */ x0a U;
                public final /* synthetic */ yzb V;
                public final /* synthetic */ Date W;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(1);
                    fpk.a(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static float b(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static final void c(final String str, final zy7 zy7Var, iqb iqbVar, y3b y3bVar, ld4 ld4Var, final int i) {
        final iqb iqbVar2;
        final y3b y3bVar2;
        r7e r7eVarS;
        pz7 pz7Var;
        int i2;
        y3b y3bVar3;
        final iqb iqbVar3;
        tp4 tp4Var;
        Object next;
        str.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1418923537);
        int i3 = 16;
        int i4 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | 1408;
        if (e18Var.Q(i4 & 1, (i4 & 1171) != 1170)) {
            e18Var.V();
            int i5 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var.A()) {
                m7f m7fVar = (m7f) e18Var.j(gr9.b);
                boolean zH = e18Var.h(m7fVar);
                Object objN = e18Var.N();
                if (zH || objN == lz1Var) {
                    objN = new di(m7fVar, 19);
                    e18Var.k0(objN);
                }
                kce kceVar = jce.a;
                i2 = i4 & (-7169);
                y3bVar3 = (y3b) fd9.r0(kceVar.b(y3b.class), oq5.B(kceVar.b(y3b.class)), (bz7) objN, e18Var);
                iqbVar3 = fqb.E;
            } else {
                e18Var.T();
                iqbVar3 = iqbVar;
                i2 = i4 & (-7169);
                y3bVar3 = y3bVar;
            }
            e18Var.q();
            Iterator it = y3bVar3.c.f().iterator();
            while (true) {
                tp4Var = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (McpServerId.m1032equalsimpl0(((McpServer) next).m346getUuidowoRr7k(), str)) {
                        break;
                    }
                }
            }
            McpServer mcpServer = (McpServer) next;
            if (mcpServer == null) {
                e18Var.a0(-82674489);
                boolean z = (i2 & 112) == 32;
                Object objN2 = e18Var.N();
                if (z || objN2 == lz1Var) {
                    objN2 = new es0(zy7Var, tp4Var, i3);
                    e18Var.k0(objN2);
                }
                fd9.i(e18Var, (pz7) objN2, iei.a);
                e18Var.p(false);
                r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    final y3b y3bVar4 = y3bVar3;
                    final int i6 = 0;
                    pz7Var = new pz7(str, zy7Var, iqbVar3, y3bVar4, i, i6) { // from class: z3b
                        public final /* synthetic */ int E;
                        public final /* synthetic */ String F;
                        public final /* synthetic */ zy7 G;
                        public final /* synthetic */ iqb H;
                        public final /* synthetic */ y3b I;

                        {
                            this.E = i6;
                        }

                        @Override // defpackage.pz7
                        public final Object invoke(Object obj, Object obj2) {
                            int i7 = this.E;
                            iei ieiVar = iei.a;
                            switch (i7) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iP0 = x44.p0(1);
                                    fpk.c(this.F, this.G, this.H, this.I, (ld4) obj, iP0);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iP02 = x44.p0(1);
                                    fpk.c(this.F, this.G, this.H, this.I, (ld4) obj, iP02);
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    r7eVarS.d = pz7Var;
                }
                return;
            }
            y3b y3bVar5 = y3bVar3;
            iqb iqbVar4 = iqbVar3;
            e18Var.a0(-82539949);
            e18Var.p(false);
            ssj.c(mcpServer.getName(), zy7Var, iqbVar4, null, null, 0L, fd9.q0(-1207614464, new nw7(mcpServer, 13, y3bVar5), e18Var), e18Var, (i2 & 112) | 1573248, 56);
            iqbVar2 = iqbVar4;
            y3bVar2 = y3bVar5;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            y3bVar2 = y3bVar;
        }
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final int i7 = 1;
            pz7Var = new pz7(str, zy7Var, iqbVar2, y3bVar2, i, i7) { // from class: z3b
                public final /* synthetic */ int E;
                public final /* synthetic */ String F;
                public final /* synthetic */ zy7 G;
                public final /* synthetic */ iqb H;
                public final /* synthetic */ y3b I;

                {
                    this.E = i7;
                }

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    int i72 = this.E;
                    iei ieiVar = iei.a;
                    switch (i72) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iP0 = x44.p0(1);
                            fpk.c(this.F, this.G, this.H, this.I, (ld4) obj, iP0);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iP02 = x44.p0(1);
                            fpk.c(this.F, this.G, this.H, this.I, (ld4) obj, iP02);
                            break;
                    }
                    return ieiVar;
                }
            };
            r7eVarS.d = pz7Var;
        }
    }

    public static float d(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static String e(e22 e22Var) {
        StringBuilder sb = new StringBuilder(e22Var.size());
        for (int i = 0; i < e22Var.size(); i++) {
            byte bA = e22Var.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static int f(float f, int i, int i2) {
        if (i == i2 || f <= MTTypesetterKt.kLineSkipLimitMultiplier) {
            return i;
        }
        if (f >= 1.0f) {
            return i2;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float f3 = ((i2 >> 24) & 255) / 255.0f;
        float fB = b(((i >> 16) & 255) / 255.0f);
        float fB2 = b(((i >> 8) & 255) / 255.0f);
        float fB3 = b((i & 255) / 255.0f);
        float fB4 = b(((i2 >> 16) & 255) / 255.0f);
        float fB5 = b(((i2 >> 8) & 255) / 255.0f);
        float fB6 = b((i2 & 255) / 255.0f);
        float fK = sq6.k(f3, f2, f, f2);
        float fK2 = sq6.k(fB4, fB, f, fB);
        float fK3 = sq6.k(fB5, fB2, f, fB2);
        float fK4 = sq6.k(fB6, fB3, f, fB3);
        float fD = d(fK2) * 255.0f;
        float fD2 = d(fK3) * 255.0f;
        return Math.round(d(fK4) * 255.0f) | (Math.round(fD) << 16) | (Math.round(fK * 255.0f) << 24) | (Math.round(fD2) << 8);
    }

    public static moe g(qh9 qh9Var) {
        try {
            long jK = qh9Var.s("format_version").k();
            bh9 bh9VarS = qh9Var.s("session");
            noe noeVarH = bh9VarS != null ? gpk.h(bh9VarS.g()) : null;
            bh9 bh9VarS2 = qh9Var.s("configuration");
            goe goeVarI = bh9VarS2 != null ? uok.i(bh9VarS2.g()) : null;
            bh9 bh9VarS3 = qh9Var.s("browser_sdk_version");
            String strM = bh9VarS3 != null ? bh9VarS3.m() : null;
            bh9 bh9VarS4 = qh9Var.s("sdk_name");
            String strM2 = bh9VarS4 != null ? bh9VarS4.m() : null;
            bh9 bh9VarS5 = qh9Var.s("span_id");
            String strM3 = bh9VarS5 != null ? bh9VarS5.m() : null;
            bh9 bh9VarS6 = qh9Var.s("parent_span_id");
            String strM4 = bh9VarS6 != null ? bh9VarS6.m() : null;
            bh9 bh9VarS7 = qh9Var.s("trace_id");
            String strM5 = bh9VarS7 != null ? bh9VarS7.m() : null;
            bh9 bh9VarS8 = qh9Var.s("rule_psr");
            Number numberL = bh9VarS8 != null ? bh9VarS8.l() : null;
            bh9 bh9VarS9 = qh9Var.s("discarded");
            Boolean boolValueOf = bh9VarS9 != null ? Boolean.valueOf(bh9VarS9.a()) : null;
            if (jK == 2) {
                return new moe(noeVarH, goeVarI, strM, strM2, strM3, strM4, strM5, numberL, boolValueOf);
            }
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Dd", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Dd", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Dd", e3);
            return null;
        }
    }

    public static h0g h(pk7 pk7Var, d0g d0gVar) {
        d0gVar.getClass();
        return new h0g(pk7Var, d0gVar, e59.e, pk7.b, MTTypesetterKt.kLineSkipLimitMultiplier);
    }

    public static void i(Object obj, Object obj2) {
        if (obj == null) {
            mr9.h("null key in entry: null=".concat(String.valueOf(obj2)));
        } else {
            if (obj2 != null) {
                return;
            }
            mr9.h(ij0.j("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
