package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Matrix;
import android.media.AudioDeviceInfo;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.model.ThinkingOption;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jvk {
    public static final ta4 a = new ta4(-1142440342, false, new cc4(18));
    public static final ta4 b = new ta4(-598763094, false, new cc4(19));

    public static final void a(boolean z, zy7 zy7Var, zy7 zy7Var2, qi3 qi3Var, u2a u2aVar, ld4 ld4Var, int i) {
        boolean z2;
        int i2;
        e18 e18Var;
        qi3 qi3Var2;
        u2a u2aVar2;
        qi3 qi3Var3;
        int i3;
        u2a u2aVar3;
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1227796463);
        if ((i & 6) == 0) {
            z2 = z;
            i2 = (e18Var2.g(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.h(zy7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.h(null) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= 65536;
        }
        if (e18Var2.Q(i2 & 1, (74899 & i2) != 74898)) {
            e18Var2.V();
            if ((i & 1) == 0 || e18Var2.A()) {
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN = e18Var2.N();
                lz1 lz1Var = jd4.a;
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(qi3.class), null, null);
                    e18Var2.k0(objN);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                qi3Var3 = (qi3) objN;
                m7f m7fVarN2 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF2 = e18Var2.f(null) | e18Var2.f(m7fVarN2);
                Object objN2 = e18Var2.N();
                if (zF2 || objN2 == lz1Var) {
                    objN2 = m7fVarN2.a(jce.a.b(u2a.class), null, null);
                    e18Var2.k0(objN2);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                i3 = i2 & (-516097);
                u2aVar3 = (u2a) objN2;
            } else {
                e18Var2.T();
                i3 = i2 & (-516097);
                qi3Var3 = qi3Var;
                u2aVar3 = u2aVar;
            }
            e18Var2.q();
            e18Var = e18Var2;
            j8.b(z2, zy7Var, null, 0L, null, null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(1300109906, new bn(u2aVar3, zy7Var, zy7Var2, qi3Var3, 25), e18Var2), e18Var, i3 & 126, 2044);
            u2aVar2 = u2aVar3;
            qi3Var2 = qi3Var3;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            qi3Var2 = qi3Var;
            u2aVar2 = u2aVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new k04(z, zy7Var, zy7Var2, qi3Var2, u2aVar2, i);
        }
    }

    public static final void b(int i, zy7 zy7Var, zy7 zy7Var2, ld4 ld4Var, int i2) {
        int i3;
        e18 e18Var;
        zy7 zy7Var3 = zy7Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(219620818);
        if ((i2 & 6) == 0) {
            i3 = (e18Var2.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var2.h(zy7Var3) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= e18Var2.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        byte b2 = 0;
        if (e18Var2.Q(i3 & 1, (i3 & 147) != 146)) {
            e18Var = e18Var2;
            zy7Var3 = zy7Var;
            ppk.a(zy7Var3, fd9.q0(1371670666, new x7i(3, zy7Var2), e18Var2), null, fd9.q0(-764212536, new x7i(b2, zy7Var3), e18Var2), null, nvk.g, fd9.q0(-1820553691, new gq0(i, 11, b2), e18Var2), null, gm3.a(e18Var2).o, 0L, gm3.a(e18Var2).M, gm3.a(e18Var2).N, null, e18Var, ((i3 >> 3) & 14) | 1772592, 0, 12948);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ve2(i, i2, zy7Var3, zy7Var2);
        }
    }

    public static final void c(t53 t53Var, t4g t4gVar, i4g i4gVar, ld4 ld4Var, int i) {
        int i2;
        t4gVar.getClass();
        i4gVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(236761641);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(t53Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var.f(t4gVar) : e18Var.h(t4gVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(i4gVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i3 = 0;
        boolean z = true;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            r93 r93Var = t53Var.g0;
            List list = (List) r93Var.z.getValue();
            String strG = r93Var.g();
            ThinkingOption thinkingOption = (ThinkingOption) w44.N0((List) r93Var.C.getValue());
            boolean zBooleanValue = ((Boolean) r93Var.D.getValue()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) r93Var.F.getValue()).booleanValue();
            boolean zF = e18Var.f(r93Var);
            if ((i2 & 112) != 32 && ((i2 & 64) == 0 || !e18Var.h(t4gVar))) {
                z = false;
            }
            boolean z2 = zF | z;
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (z2 || objN == lz1Var) {
                objN = new wff(r93Var, t4gVar, i3);
                e18Var.k0(objN);
            }
            bz7 bz7Var = (bz7) objN;
            boolean zF2 = e18Var.f(r93Var);
            Object objN2 = e18Var.N();
            if (zF2 || objN2 == lz1Var) {
                ks0 ks0Var = new ks0(1, r93Var, r93.class, "onSetThinkingEnabled", "onSetThinkingEnabled(Z)Lkotlinx/coroutines/Job;", 8, 4);
                e18Var.k0(ks0Var);
                objN2 = ks0Var;
            }
            d(list, strG, thinkingOption, zBooleanValue, zBooleanValue2, bz7Var, (bz7) objN2, i4gVar, null, e18Var, (i2 << 15) & 29360128, FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v76(t53Var, i, t4gVar, i4gVar, 27);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(java.util.List r27, java.lang.String r28, com.anthropic.claude.api.model.ThinkingOption r29, boolean r30, boolean r31, defpackage.bz7 r32, defpackage.bz7 r33, defpackage.i4g r34, defpackage.pl3 r35, defpackage.ld4 r36, int r37, int r38) {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jvk.d(java.util.List, java.lang.String, com.anthropic.claude.api.model.ThinkingOption, boolean, boolean, bz7, bz7, i4g, pl3, ld4, int, int):void");
    }

    public static final void e(yo6 yo6Var, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        zy7Var.getClass();
        zy7Var2.getClass();
        zy7Var3.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-152465943);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (e18Var2.d(yo6Var == null ? -1 : yo6Var.ordinal()) ? 4 : 2) | i;
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
        int i4 = 1;
        if (e18Var2.Q(i2 & 1, (i2 & 1171) != 1170)) {
            int i5 = yo6Var == null ? -1 : y7i.a[yo6Var.ordinal()];
            if (i5 == -1) {
                e18Var = e18Var2;
                e18Var.a0(-490827379);
                e18Var.p(false);
            } else if (i5 == 1) {
                e18Var = e18Var2;
                e18Var.a0(-490875914);
                b(R.string.trusted_device_confirm_message_untrusted, zy7Var, zy7Var2, e18Var, i2 & 1008);
                e18Var.p(false);
            } else if (i5 == 2) {
                e18Var = e18Var2;
                e18Var.a0(-490868814);
                b(R.string.trusted_device_confirm_message_stale, zy7Var, zy7Var2, e18Var, i2 & 1008);
                e18Var.p(false);
            } else {
                if (i5 != 3) {
                    throw ebh.u(e18Var2, -490876601, false);
                }
                e18Var2.a0(1963180914);
                ppk.a(zy7Var, fd9.q0(996901473, new x7i(i4, zy7Var3), e18Var2), null, fd9.q0(-351232097, new x7i(i3, zy7Var), e18Var2), null, nvk.c, nvk.d, null, gm3.a(e18Var2).o, 0L, gm3.a(e18Var2).M, gm3.a(e18Var2).N, null, e18Var2, ((i2 >> 3) & 14) | 1772592, 0, 12948);
                e18Var = e18Var2;
                e18Var.p(false);
            }
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new p3h(yo6Var, zy7Var, zy7Var2, zy7Var3, i, 5);
        }
    }

    public static final void f(final yo6 yo6Var, final boolean z, final zy7 zy7Var, final pz7 pz7Var, final zy7 zy7Var2, final zy7 zy7Var3, w7 w7Var, ze0 ze0Var, ld4 ld4Var, final int i) {
        e18 e18Var;
        final w7 w7Var2;
        final ze0 ze0Var2;
        r7e r7eVarS;
        pz7 pz7Var2;
        final w7 w7Var3;
        int i2;
        int i3;
        final ze0 ze0Var3;
        w7 w7Var4;
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1615446826);
        int i4 = i | (e18Var2.d(yo6Var == null ? -1 : yo6Var.ordinal()) ? 4 : 2) | (e18Var2.g(z) ? 32 : 16) | (e18Var2.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.h(pz7Var) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var2.h(zy7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var2.h(zy7Var3) ? 131072 : 65536) | 4718592;
        if (e18Var2.Q(i4 & 1, (4793491 & i4) != 4793490)) {
            e18Var2.V();
            int i5 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var2.A()) {
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN = e18Var2.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(w7.class), null, null);
                    e18Var2.k0(objN);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                w7Var3 = (w7) objN;
                m7f m7fVarN2 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF2 = e18Var2.f(null) | e18Var2.f(m7fVarN2);
                Object objN2 = e18Var2.N();
                if (zF2 || objN2 == lz1Var) {
                    objN2 = m7fVarN2.a(jce.a.b(ze0.class), null, null);
                    e18Var2.k0(objN2);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                i2 = i4 & (-33030145);
                i3 = 2048;
                ze0Var3 = (ze0) objN2;
            } else {
                e18Var2.T();
                w7Var3 = w7Var;
                i2 = i4 & (-33030145);
                i3 = 2048;
                ze0Var3 = ze0Var;
            }
            e18Var2.q();
            if (!z) {
                r7eVarS = e18Var2.s();
                if (r7eVarS != null) {
                    final int i6 = 0;
                    pz7Var2 = new pz7(yo6Var, z, zy7Var, pz7Var, zy7Var2, zy7Var3, w7Var3, ze0Var3, i, i6) { // from class: w7i
                        public final /* synthetic */ int E;
                        public final /* synthetic */ yo6 F;
                        public final /* synthetic */ boolean G;
                        public final /* synthetic */ zy7 H;
                        public final /* synthetic */ pz7 I;
                        public final /* synthetic */ zy7 J;
                        public final /* synthetic */ zy7 K;
                        public final /* synthetic */ w7 L;
                        public final /* synthetic */ ze0 M;

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
                                    jvk.f(this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, (ld4) obj, iP0);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iP02 = x44.p0(1);
                                    jvk.f(this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, (ld4) obj, iP02);
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    r7eVarS.d = pz7Var2;
                }
                return;
            }
            w7 w7Var5 = w7Var3;
            ze0 ze0Var4 = ze0Var3;
            Context context = (Context) e18Var2.j(w00.b);
            boolean z2 = yo6Var == yo6.E || yo6Var == yo6.F;
            int i7 = i2 & 7168;
            int i8 = i2 & 896;
            boolean zG = e18Var2.g(z2) | (i7 == i3) | (i8 == 256);
            Object objN3 = e18Var2.N();
            if (zG || objN3 == lz1Var) {
                objN3 = new gk1(z2, pz7Var, zy7Var, 3);
                e18Var2.k0(objN3);
            }
            zy7 zy7Var4 = (zy7) objN3;
            boolean zH = (i7 == i3) | ((((57344 & i2) ^ 24576) > 16384 && e18Var2.f(zy7Var2)) || (i2 & 24576) == 16384) | e18Var2.h(w7Var5) | ((458752 & i2) == 131072);
            Object objN4 = e18Var2.N();
            if (zH || objN4 == lz1Var) {
                n5h n5hVar = new n5h((Object) zy7Var2, (Object) w7Var5, pz7Var, (Object) zy7Var3, 1);
                w7Var4 = w7Var5;
                e18Var2.k0(n5hVar);
                objN4 = n5hVar;
            } else {
                w7Var4 = w7Var5;
            }
            zy7 zy7Var5 = (zy7) objN4;
            boolean zH2 = e18Var2.h(ze0Var4) | (i8 == 256) | e18Var2.h(context);
            Object objN5 = e18Var2.N();
            if (zH2 || objN5 == lz1Var) {
                objN5 = new hya(zy7Var, ze0Var4, context, 28);
                e18Var2.k0(objN5);
            }
            e18Var = e18Var2;
            e(yo6Var, zy7Var4, zy7Var5, (zy7) objN5, e18Var, i2 & 14);
            ze0Var2 = ze0Var4;
            w7Var2 = w7Var4;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            w7Var2 = w7Var;
            ze0Var2 = ze0Var;
        }
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final int i9 = 1;
            pz7Var2 = new pz7(yo6Var, z, zy7Var, pz7Var, zy7Var2, zy7Var3, w7Var2, ze0Var2, i, i9) { // from class: w7i
                public final /* synthetic */ int E;
                public final /* synthetic */ yo6 F;
                public final /* synthetic */ boolean G;
                public final /* synthetic */ zy7 H;
                public final /* synthetic */ pz7 I;
                public final /* synthetic */ zy7 J;
                public final /* synthetic */ zy7 K;
                public final /* synthetic */ w7 L;
                public final /* synthetic */ ze0 M;

                {
                    this.E = i9;
                }

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    int i72 = this.E;
                    iei ieiVar = iei.a;
                    switch (i72) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iP0 = x44.p0(1);
                            jvk.f(this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, (ld4) obj, iP0);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iP02 = x44.p0(1);
                            jvk.f(this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, (ld4) obj, iP02);
                            break;
                    }
                    return ieiVar;
                }
            };
            r7eVarS.d = pz7Var2;
        }
    }

    public static final void g(int i, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1543846892);
        if (e18Var.Q(i & 1, i != 0)) {
            Context context = (Context) e18Var.j(w00.b);
            boolean zF = e18Var.f(context);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                try {
                    objN = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                } catch (Exception e) {
                    List list = xah.a;
                    xah.f(e, "Package info not found for VersionInfo", null, null, 28);
                    objN = null;
                }
                e18Var.k0(objN);
            }
            PackageInfo packageInfo = (PackageInfo) objN;
            if (packageInfo != null) {
                e18Var.a0(-2061623217);
                String str = packageInfo.versionName + " (" + rwk.m(packageInfo) + ")";
                op3 op3Var = (op3) e18Var.j(ve4.f);
                Object objN2 = e18Var.N();
                if (objN2 == lz1Var) {
                    objN2 = fd9.O(im6.E, e18Var);
                    e18Var.k0(objN2);
                }
                l45 l45Var = (l45) objN2;
                String strK0 = d4c.k0(R.string.version_info_prefix, new Object[]{str}, e18Var);
                tkh tkhVar = ((jm3) gm3.c(e18Var).e.E).i;
                iqb iqbVarJ = gb9.J(b.c(fqb.E, 1.0f), 12.0f);
                boolean zH = e18Var.h(l45Var) | e18Var.h(op3Var) | e18Var.f(str);
                Object objN3 = e18Var.N();
                if (zH || objN3 == lz1Var) {
                    objN3 = new yg4(l45Var, op3Var, str, 25);
                    e18Var.k0(objN3);
                }
                tjh.b(strK0, androidx.compose.foundation.b.c(iqbVarJ, false, null, null, null, (zy7) objN3, 15), 0L, 0L, null, null, null, 0L, null, new fdh(6), 0L, 0, false, 0, 0, null, tkhVar, e18Var, 0, 0, 130044);
                e18Var = e18Var;
                e18Var.p(false);
            } else {
                e18Var.a0(-2060847690);
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uw8(i, 4);
        }
    }

    public static final String h(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 7 ? i != 8 ? i != 11 ? i != 15 ? i != 22 ? i != 26 ? i != 27 ? grc.u("Unknown(", i, ")") : "BleSpeaker" : "BleHeadset" : "UsbHeadset" : "BuiltinMic" : "UsbDevice" : "BluetoothA2dp" : "BluetoothSco" : "WiredHeadphones" : "WiredHeadset" : "BuiltinSpeaker" : "BuiltinEarpiece";
    }

    public static final CursorAnchorInfo i(CursorAnchorInfo.Builder builder, cjh cjhVar, occ occVar, yjh yjhVar, Matrix matrix, l9e l9eVar, l9e l9eVar2, boolean z, boolean z2, boolean z3, boolean z4) {
        builder.reset();
        builder.setMatrix(matrix);
        long j = cjhVar.b;
        kkh kkhVar = cjhVar.c;
        int iG = kkh.g(j);
        builder.setSelectionRange(iG, kkh.f(cjhVar.b));
        lne lneVar = lne.F;
        if (z && iG >= 0) {
            int iD = occVar.D(iG);
            l9e l9eVarC = yjhVar.c(iD);
            float fD0 = wd6.d0(l9eVarC.a, MTTypesetterKt.kLineSkipLimitMultiplier, (int) (yjhVar.c >> 32));
            boolean zJ = j(l9eVar, fD0, l9eVarC.b);
            boolean zJ2 = j(l9eVar, fD0, l9eVarC.d);
            boolean z5 = yjhVar.a(iD) == lneVar;
            int i = (zJ || zJ2) ? 1 : 0;
            if (!zJ || !zJ2) {
                i |= 2;
            }
            if (z5) {
                i |= 4;
            }
            float f = l9eVarC.b;
            float f2 = l9eVarC.d;
            builder.setInsertionMarkerLocation(fD0, f, f2, f2, i);
        }
        if (z2) {
            int iG2 = kkhVar != null ? kkh.g(kkhVar.a) : -1;
            int iF = kkhVar != null ? kkh.f(kkhVar.a) : -1;
            if (iG2 >= 0 && iG2 < iF) {
                builder.setComposingText(iG2, cjhVar.a.F.subSequence(iG2, iF));
                int iD2 = occVar.D(iG2);
                int iD3 = occVar.D(iF);
                float[] fArr = new float[(iD3 - iD2) * 4];
                yjhVar.b.a(mwa.m(iD2, iD3), fArr);
                for (int i2 = iG2; i2 < iF; i2++) {
                    int iD4 = occVar.D(i2);
                    int i3 = (iD4 - iD2) * 4;
                    float f3 = fArr[i3];
                    float f4 = fArr[i3 + 1];
                    float f5 = fArr[i3 + 2];
                    float f6 = fArr[i3 + 3];
                    int i4 = (l9eVar.a < f5 ? 1 : 0) & (f3 < l9eVar.c ? 1 : 0) & (l9eVar.b < f6 ? 1 : 0) & (f4 < l9eVar.d ? 1 : 0);
                    if (!j(l9eVar, f3, f4) || !j(l9eVar, f5, f6)) {
                        i4 |= 2;
                    }
                    if (yjhVar.a(iD4) == lneVar) {
                        i4 |= 4;
                    }
                    builder.addCharacterBounds(i2, f3, f4, f5, f6, i4);
                }
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33 && z3) {
            builder.setEditorBoundsInfo(z5.k().setEditorBounds(mwa.R(l9eVar2)).setHandwritingBounds(mwa.R(l9eVar2)).build());
        }
        if (i5 >= 34 && z4 && !l9eVar.j()) {
            qtb qtbVar = yjhVar.b;
            int i6 = qtbVar.f - 1;
            if (i6 < 0) {
                i6 = 0;
            }
            int iE0 = wd6.e0(qtbVar.e(l9eVar.b), 0, i6);
            int iE02 = wd6.e0(qtbVar.e(l9eVar.d), 0, i6);
            if (iE0 <= iE02) {
                while (true) {
                    builder.addVisibleLineBounds(yjhVar.f(iE0), qtbVar.f(iE0), yjhVar.g(iE0), qtbVar.b(iE0));
                    if (iE0 == iE02) {
                        break;
                    }
                    iE0++;
                }
            }
        }
        return builder.build();
    }

    public static final boolean j(l9e l9eVar, float f, float f2) {
        float f3 = l9eVar.a;
        if (f > l9eVar.c || f3 > f) {
            return false;
        }
        return f2 <= l9eVar.d && l9eVar.b <= f2;
    }

    public static final iqb k(iqb iqbVar, String str) {
        iqbVar.getClass();
        return str != null ? tjf.b(iqbVar, false, new cm5(str, 13)) : iqbVar;
    }

    public static final cpc l(AudioDeviceInfo audioDeviceInfo) {
        if (audioDeviceInfo == null) {
            return new cpc("", "");
        }
        String strH = h(audioDeviceInfo.getType());
        return new cpc(audioDeviceInfo.getType() == 2 ? h(15) : strH, strH);
    }
}
