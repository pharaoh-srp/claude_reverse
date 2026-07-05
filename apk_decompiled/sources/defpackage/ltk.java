package defpackage;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.core.graphics.drawable.IconCompat;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.WebViewEvents$WebViewKind;
import com.anthropic.claude.artifact.model.ArtifactType;
import com.anthropic.claude.types.strings.ChatId;
import com.pvporbit.freetype.FreeTypeConstants;
import io.sentry.e0;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ltk {
    public static final ta4 a = new ta4(-1742661686, false, new xb4(20));

    public static final void a(final tp0 tp0Var, final String str, final iqb iqbVar, final zy7 zy7Var, final zy7 zy7Var2, final zy7 zy7Var3, n3f n3fVar, ld4 ld4Var, final int i) {
        e18 e18Var;
        zy7 zy7Var4;
        final n3f n3fVar2;
        r7e r7eVarS;
        pz7 pz7Var;
        n3f n3fVar3;
        int i2;
        tp0Var.getClass();
        str.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-211490330);
        int i3 = i | (e18Var2.f(tp0Var) ? 4 : 2) | (e18Var2.f(str) ? 32 : 16) | (e18Var2.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var2.h(zy7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var2.h(zy7Var3) ? 131072 : 65536) | 524288;
        int i4 = 0;
        if (e18Var2.Q(i3 & 1, (599187 & i3) != 599186)) {
            e18Var2.V();
            int i5 = i & 1;
            tp4 tp4Var = null;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var2.A()) {
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN = e18Var2.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(n3f.class), null, null);
                    e18Var2.k0(objN);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                n3fVar3 = (n3f) objN;
                i2 = i3 & (-3670017);
            } else {
                e18Var2.T();
                i2 = i3 & (-3670017);
                n3fVar3 = n3fVar;
            }
            int i6 = i2;
            e18Var2.q();
            mu0 mu0Var = (mu0) e18Var2.j(vca.a);
            if (mu0Var == null) {
                r7eVarS = e18Var2.s();
                if (r7eVarS != null) {
                    final int i7 = 0;
                    final n3f n3fVar4 = n3fVar3;
                    pz7Var = new pz7(tp0Var, str, iqbVar, zy7Var, zy7Var2, zy7Var3, n3fVar4, i, i7) { // from class: cs0
                        public final /* synthetic */ int E;
                        public final /* synthetic */ tp0 F;
                        public final /* synthetic */ String G;
                        public final /* synthetic */ iqb H;
                        public final /* synthetic */ zy7 I;
                        public final /* synthetic */ zy7 J;
                        public final /* synthetic */ zy7 K;
                        public final /* synthetic */ n3f L;

                        {
                            this.E = i7;
                        }

                        @Override // defpackage.pz7
                        public final Object invoke(Object obj, Object obj2) {
                            int i8 = this.E;
                            iei ieiVar = iei.a;
                            switch (i8) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iP0 = x44.p0(1);
                                    ltk.a(this.F, this.G, this.H, this.I, this.J, this.K, this.L, (ld4) obj, iP0);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iP02 = x44.p0(1);
                                    ltk.a(this.F, this.G, this.H, this.I, this.J, this.K, this.L, (ld4) obj, iP02);
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    r7eVarS.d = pz7Var;
                }
                return;
            }
            n3f n3fVar5 = n3fVar3;
            zy7Var4 = zy7Var3;
            if (mu0Var instanceof lu0) {
                e18Var2.a0(209162064);
                d(iqbVar, e18Var2, (i6 >> 6) & 14);
                e18Var2.p(false);
                e18Var = e18Var2;
            } else if (mu0Var instanceof ku0) {
                e18Var2.a0(209294186);
                boolean z = (i6 & 458752) == 131072;
                Object objN2 = e18Var2.N();
                if (z || objN2 == lz1Var) {
                    objN2 = new es0(zy7Var4, tp4Var, i4);
                    e18Var2.k0(objN2);
                }
                fd9.i(e18Var2, (pz7) objN2, iei.a);
                Object objN3 = e18Var2.N();
                if (objN3 == lz1Var) {
                    objN3 = n3fVar5.a(WebViewEvents$WebViewKind.ARTIFACT_SANDBOX);
                    e18Var2.k0(objN3);
                }
                ku0 ku0Var = (ku0) mu0Var;
                e18Var = e18Var2;
                yuk.d((o3f) objN3, ku0Var.a, ku0Var.b, e18Var, 0, 0);
                c(ku0Var.c, iqbVar, e18Var, (i6 >> 3) & 112);
                e18Var.p(false);
            } else {
                if (!(mu0Var instanceof ju0)) {
                    throw ebh.u(e18Var2, -1378733431, false);
                }
                e18Var2.a0(209798432);
                t4f t4fVar = ((ju0) mu0Var).a;
                int i8 = t4f.a0;
                b(tp0Var, str, t4fVar, zy7Var, zy7Var2, iqbVar, e18Var2, (i6 & 126) | 512 | (i6 & 7168) | (57344 & i6) | (458752 & (i6 << 9)));
                e18Var = e18Var2;
                e18Var.p(false);
            }
            n3fVar2 = n3fVar5;
        } else {
            e18Var = e18Var2;
            zy7Var4 = zy7Var3;
            e18Var.T();
            n3fVar2 = n3fVar;
        }
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final int i9 = 1;
            final zy7 zy7Var5 = zy7Var4;
            pz7Var = new pz7(tp0Var, str, iqbVar, zy7Var, zy7Var2, zy7Var5, n3fVar2, i, i9) { // from class: cs0
                public final /* synthetic */ int E;
                public final /* synthetic */ tp0 F;
                public final /* synthetic */ String G;
                public final /* synthetic */ iqb H;
                public final /* synthetic */ zy7 I;
                public final /* synthetic */ zy7 J;
                public final /* synthetic */ zy7 K;
                public final /* synthetic */ n3f L;

                {
                    this.E = i9;
                }

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    int i82 = this.E;
                    iei ieiVar = iei.a;
                    switch (i82) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iP0 = x44.p0(1);
                            ltk.a(this.F, this.G, this.H, this.I, this.J, this.K, this.L, (ld4) obj, iP0);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iP02 = x44.p0(1);
                            ltk.a(this.F, this.G, this.H, this.I, this.J, this.K, this.L, (ld4) obj, iP02);
                            break;
                    }
                    return ieiVar;
                }
            };
            r7eVarS.d = pz7Var;
        }
    }

    public static final void b(tp0 tp0Var, String str, t4f t4fVar, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        nwb nwbVar;
        ChatId chatId;
        int i3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-627756917);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(tp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? e18Var.f(t4fVar) : e18Var.h(t4fVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
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
        boolean z = false;
        if (e18Var.Q(i2 & 1, (74899 & i2) != 74898)) {
            Object[] objArr = new Object[0];
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new b5(28);
                e18Var.k0(objN);
            }
            nwb nwbVar2 = (nwb) iuj.I(objArr, (zy7) objN, e18Var, 48);
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = mpk.P(null);
                e18Var.k0(objN2);
            }
            nwb nwbVar3 = (nwb) objN2;
            String str2 = (String) nwbVar3.getValue();
            if (str2 == null) {
                e18Var.a0(-1218167666);
                e18Var.p(false);
            } else {
                e18Var.a0(-1218167665);
                Object objN3 = e18Var.N();
                if (objN3 == lz1Var) {
                    objN3 = new ve(11, nwbVar3);
                    e18Var.k0(objN3);
                }
                skk.a(str2, (zy7) objN3, e18Var, 48);
                z = false;
                e18Var.p(false);
            }
            int i4 = i2 & 896;
            boolean zF = ((i4 == 256 || ((i2 & 512) != 0 && e18Var.h(t4fVar))) ? true : z) | e18Var.f(nwbVar2) | ((i2 & 7168) == 2048);
            Object objN4 = e18Var.N();
            if (zF || objN4 == lz1Var) {
                nwbVar = nwbVar2;
                fe feVar = new fe((Object) t4fVar, (Object) zy7Var, (Object) nwbVar, (Object) nwbVar3, 2, false);
                e18Var.k0(feVar);
                objN4 = feVar;
            } else {
                nwbVar = nwbVar2;
            }
            fd9.d(iei.a, (bz7) objN4, e18Var);
            ctk ctkVar = tp0Var.a;
            ArtifactType type = tp0Var.b.getType();
            ChatId chatIdM978boximpl = ChatId.m978boximpl(str);
            boolean zF2 = ((i2 & 14) == 4) | ((i2 & 112) == 32) | (i4 == 256 || ((i2 & 512) != 0 && e18Var.h(t4fVar))) | e18Var.f(nwbVar) | ((57344 & i2) == 16384);
            Object objN5 = e18Var.N();
            if (zF2 || objN5 == lz1Var) {
                chatId = chatIdM978boximpl;
                i3 = i2;
                fs0 fs0Var = new fs0(tp0Var, str, t4fVar, zy7Var2, nwbVar, null);
                e18Var.k0(fs0Var);
                objN5 = fs0Var;
            } else {
                i3 = i2;
                chatId = chatIdM978boximpl;
            }
            fd9.k(ctkVar, type, chatId, (pz7) objN5, e18Var);
            boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
            int i5 = t4f.a0;
            e(t4fVar, zBooleanValue, iqbVar, e18Var, ((i3 >> 6) & 14) | 8 | ((i3 >> 9) & 896));
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new hl((Object) tp0Var, str, (Object) t4fVar, zy7Var, zy7Var2, (Object) iqbVar, i, 2);
        }
    }

    public static final void c(zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        zy7 zy7Var2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-280201697);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            xo1 xo1Var = lja.K;
            iqb iqbVarJ = gb9.J(iqbVar.B(b.c), 16.0f);
            o5b o5bVarD = dw1.d(xo1Var, false);
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
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            zy7Var2 = zy7Var;
            uik.d(d4c.j0(R.string.artifact_webview_crash_error, e18Var), null, null, d4c.j0(R.string.generic_reload, e18Var), zy7Var2, e18Var, (i2 << 12) & 57344, 6);
            e18Var.p(true);
        } else {
            zy7Var2 = zy7Var;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mu(zy7Var2, iqbVar, i, i3);
        }
    }

    public static final void d(iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-752941772);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 0;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            xo1 xo1Var = lja.K;
            iqb iqbVarB = iqbVar.B(b.c);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarB);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            ez1.a(null, vf2.J, 0L, e18Var, 48, 5);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new i10(iqbVar, i, i3, b);
        }
    }

    public static final void e(t4f t4fVar, boolean z, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-272955024);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(t4fVar) : e18Var.h(t4fVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        boolean z2 = false;
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            t4fVar.setAlpha(((Number) n80.b(z ? 1.0f : MTTypesetterKt.kLineSkipLimitMultiplier, null, "Artifact Loading Fade Transition", e18Var, 3072, 22).getValue()).floatValue());
            FillElement fillElement = b.c;
            iqb iqbVarH = xkk.h(e18Var, iqbVar.B(fillElement));
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarH);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && e18Var.h(t4fVar))) {
                z2 = true;
            }
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (z2 || objN == lz1Var) {
                objN = new yq0(t4fVar, i3);
                e18Var.k0(objN);
            }
            bz7 bz7Var = (bz7) objN;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new zv(9);
                e18Var.k0(objN2);
            }
            uj5.a(bz7Var, fillElement, (bz7) objN2, e18Var, 432, 0);
            wd6.M(!z, nw1.a.a(fqb.E, lja.K), gp6.e(null, 3), gp6.f(null, 3), null, hvj.a, e18Var, 200064, 16);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ds0(t4fVar, z, iqbVar, i, 0);
        }
    }

    public static final void f(String str, String str2, int i, int i2, xm8 xm8Var, pz7 pz7Var, ld4 ld4Var, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        pz7 pz7Var2;
        int i9;
        xm8 xm8Var2;
        pz7 pz7Var3;
        int i10;
        pz7 pz7Var4;
        xm8 xm8Var3;
        int i11;
        int i12;
        str2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1320802744);
        int i13 = i3 | (e18Var.f(str) ? 4 : 2) | (e18Var.f(str2) ? 32 : 16);
        int i14 = i4 & 4;
        if (i14 != 0) {
            i6 = i13 | 384;
            i5 = i;
        } else {
            i5 = i;
            i6 = i13 | (e18Var.d(i5) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        }
        int i15 = i4 & 8;
        if (i15 != 0) {
            i8 = i6 | 3072;
            i7 = i2;
        } else {
            i7 = i2;
            i8 = i6 | (e18Var.d(i7) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        }
        int i16 = i8 | FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        int i17 = i4 & 32;
        if (i17 != 0) {
            i9 = i8 | 204800;
            pz7Var2 = pz7Var;
        } else {
            pz7Var2 = pz7Var;
            i9 = i16 | (e18Var.h(pz7Var2) ? 131072 : 65536);
        }
        if (e18Var.Q(i9 & 1, (74899 & i9) != 74898)) {
            e18Var.V();
            if ((i3 & 1) == 0 || e18Var.A()) {
                int i18 = i14 != 0 ? -1 : i5;
                if (i15 != 0) {
                    i7 = 0;
                }
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == jd4.a) {
                    objN = m7fVarN.a(jce.a.b(xm8.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                xm8 xm8Var4 = (xm8) objN;
                int i19 = i9 & (-57345);
                if (i17 != 0) {
                    i10 = i18;
                    xm8Var3 = xm8Var4;
                    pz7Var4 = null;
                } else {
                    pz7Var4 = pz7Var2;
                    i10 = i18;
                    xm8Var3 = xm8Var4;
                }
                i11 = i7;
                i12 = i19;
            } else {
                e18Var.T();
                xm8Var3 = xm8Var;
                pz7Var4 = pz7Var2;
                i12 = i9 & (-57345);
                i10 = i5;
                i11 = i7;
            }
            e18Var.q();
            iqb iqbVarC = b.c(fqb.E, 1.0f);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
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
            int i20 = i12 << 3;
            xsc.c(null, str, 0, 0, null, false, null, e18Var, (i20 & 112) | 3462, 112);
            i7 = i11;
            xm8 xm8Var5 = xm8Var3;
            pz7 pz7Var5 = pz7Var4;
            h(new hw9(1.0f, true), str2, str, i10, i7, xm8Var5, pz7Var5, e18Var, (i12 & 112) | ((i12 << 6) & 896) | (i20 & 7168) | (57344 & i20) | 262144 | (3670016 & i20));
            e18Var.p(true);
            xm8Var2 = xm8Var5;
            pz7Var3 = pz7Var5;
        } else {
            e18Var.T();
            xm8Var2 = xm8Var;
            pz7Var3 = pz7Var2;
            i10 = i5;
        }
        int i21 = i7;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ow7(str, str2, i10, i21, xm8Var2, pz7Var3, i3, i4);
        }
    }

    public static final void g(String str, String str2, ld4 ld4Var, int i) {
        int i2;
        String str3;
        e18 e18Var;
        str.getClass();
        str2.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(2096469125);
        if ((i & 6) == 0) {
            i2 = i | (e18Var2.f(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(str2) ? 32 : 16;
        }
        int i3 = i2;
        if (e18Var2.Q(i3 & 1, (i3 & 19) != 18)) {
            fqb fqbVar = fqb.E;
            iqb iqbVarC = b.c(fqbVar, 1.0f);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 0);
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
            z80 z80Var = cd4.f;
            d4c.i0(e18Var2, z80Var, q64VarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var2, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var2, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var2, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var2, z80Var4, iqbVarE);
            tjh.b(str, null, gm3.a(e18Var2).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).j, e18Var2, i3 & 14, 0, 131066);
            kxk.g(e18Var2, b.e(fqbVar, 4.0f));
            iqb iqbVarJ = gb9.J(mpk.b0(yfd.p(b.c(fqbVar, 1.0f), gm3.a(e18Var2).q, zni.b), mpk.Y(e18Var2), false), 12.0f);
            cxe cxeVarA = axe.a(ko0.a, lja.P, e18Var2, 0);
            int iHashCode2 = Long.hashCode(e18Var2.T);
            hyc hycVarL2 = e18Var2.l();
            iqb iqbVarE2 = kxk.E(e18Var2, iqbVarJ);
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, z80Var, cxeVarA);
            d4c.i0(e18Var2, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var2, z80Var3, e18Var2, bxVar);
            d4c.i0(e18Var2, z80Var4, iqbVarE2);
            str3 = str2;
            tjh.b(str3, null, gm3.a(e18Var2).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (tkh) ((wk) gm3.c(e18Var2).e.F).i, e18Var2, (i3 >> 3) & 14, 3072, 122874);
            e18Var = e18Var2;
            e18Var.p(true);
            kxk.g(e18Var, b.e(fqbVar, 16.0f));
            e18Var.p(true);
        } else {
            str3 = str2;
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pja(str, str3, i);
        }
    }

    public static final void h(hw9 hw9Var, String str, String str2, int i, int i2, xm8 xm8Var, pz7 pz7Var, ld4 ld4Var, int i3) {
        int i4;
        int i5;
        e18 e18Var;
        nwb nwbVar;
        Object nd2Var;
        Integer num;
        lz1 lz1Var;
        boolean z;
        String str3;
        String str4 = str;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1543659876);
        if ((i3 & 6) == 0) {
            i4 = (e18Var2.f(hw9Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= e18Var2.f(str4) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= e18Var2.f(str2) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i3 & 3072) == 0) {
            i5 = i;
            i4 |= e18Var2.d(i5) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            i5 = i;
        }
        if ((i3 & 24576) == 0) {
            i4 |= e18Var2.d(i2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((i3 & 196608) == 0) {
            i4 |= (262144 & i3) == 0 ? e18Var2.f(xm8Var) : e18Var2.h(xm8Var) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= e18Var2.h(pz7Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if (e18Var2.Q(i4 & 1, (i4 & 599187) != 599186)) {
            e18Var2.V();
            if ((i3 & 1) != 0 && !e18Var2.A()) {
                e18Var2.T();
            }
            e18Var2.q();
            om8 om8Var = v40.F(e18Var2) ? q54.b : q54.c;
            boolean z2 = (i4 & 896) == 256;
            Object objN = e18Var2.N();
            lz1 lz1Var2 = jd4.a;
            if (z2 || objN == lz1Var2) {
                objN = qx3.a(str2);
                e18Var2.k0(objN);
            }
            String str5 = (String) objN;
            int i6 = i4 & 112;
            int i7 = i4 & 7168;
            boolean z3 = (i6 == 32) | (i7 == 2048);
            Object objN2 = e18Var2.N();
            if (z3 || objN2 == lz1Var2) {
                objN2 = mpk.P(lm6.E);
                e18Var2.k0(objN2);
            }
            nwb nwbVar2 = (nwb) objN2;
            boolean z4 = (i6 == 32) | (i7 == 2048);
            int i8 = i4;
            Object objN3 = e18Var2.N();
            if (z4 || objN3 == lz1Var2) {
                objN3 = mpk.P(null);
                e18Var2.k0(objN3);
            }
            nwb nwbVar3 = (nwb) objN3;
            Integer numValueOf = Integer.valueOf(i5);
            boolean zF = (i6 == 32) | (i7 == 2048) | e18Var2.f(nwbVar2) | e18Var2.f(nwbVar3) | ((((i8 & 458752) ^ 196608) > 131072 && e18Var2.h(xm8Var)) || (i8 & 196608) == 131072) | e18Var2.f(str5) | e18Var2.h(om8Var);
            Object objN4 = e18Var2.N();
            if (zF || objN4 == lz1Var2) {
                om8 om8Var2 = om8Var;
                nwbVar = nwbVar3;
                num = numValueOf;
                lz1Var = lz1Var2;
                z = false;
                nd2Var = new nd2(xm8Var, str5, om8Var2, str4, i, nwbVar2, nwbVar, null);
                str3 = str5;
                str4 = str4;
                e18Var2.k0(nd2Var);
            } else {
                nwbVar = nwbVar3;
                lz1Var = lz1Var2;
                nd2Var = objN4;
                str3 = str5;
                z = false;
                num = numValueOf;
            }
            fd9.k(str4, num, str3, (pz7) nd2Var, e18Var2);
            Object objN5 = e18Var2.N();
            if (objN5 == lz1Var) {
                objN5 = new qo8();
                e18Var2.k0(objN5);
            }
            qo8 qo8Var = (qo8) objN5;
            iqb iqbVarC = b.c(xn5.W(hw9Var), 1.0f);
            iqbVarC.getClass();
            qo8Var.getClass();
            iqb iqbVarC2 = r9f.c(ztj.i(iqbVarC, qo8Var.d, null), qo8Var.a, z, 52);
            boolean zF2 = e18Var2.f(nwbVar2) | e18Var2.f(nwbVar) | ((i8 & 57344) == 16384 ? true : z) | e18Var2.h(qo8Var) | ((i8 & 3670016) != 1048576 ? z : true);
            Object objN6 = e18Var2.N();
            if (zF2 || objN6 == lz1Var) {
                wu0 wu0Var = new wu0(pz7Var, nwbVar2, i2, qo8Var, nwbVar);
                e18Var2.k0(wu0Var);
                objN6 = wu0Var;
            }
            e18Var = e18Var2;
            knk.h(iqbVarC2, null, null, false, null, null, null, false, null, (bz7) objN6, e18Var, 0, 510);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new kd1(hw9Var, str4, str2, i, i2, xm8Var, pz7Var, i3);
        }
    }

    public static final void i(String str, String str2, String str3, String str4, i4g i4gVar, ld4 ld4Var, int i) {
        int i2;
        str.getClass();
        str3.getClass();
        i4gVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(839994017);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(str3) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(str4) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.f(i4gVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            iqb iqbVarI = gb9.I(mpk.b0(b.c(fqb.E, 1.0f), mpk.Y(e18Var), true), i4gVar.b());
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarI);
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
            if (str2 == null) {
                e18Var.a0(1273524717);
                e18Var.p(false);
            } else {
                e18Var.a0(1273524718);
                g(str, str2, e18Var, i2 & 14);
                e18Var.p(false);
            }
            if (str4 == null) {
                e18Var.a0(1273637774);
                e18Var.p(false);
            } else {
                e18Var.a0(1273637775);
                g(str3, str4, e18Var, (i2 >> 6) & 14);
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new t9h(str, str2, str3, str4, i4gVar, i, 1);
        }
    }

    public static IconCompat j(Icon icon) {
        icon.getClass();
        int iO = o(icon);
        if (iO == 2) {
            return IconCompat.c(null, m(icon), l(icon));
        }
        if (iO == 4) {
            Uri uriP = p(icon);
            PorterDuff.Mode mode = IconCompat.k;
            uriP.getClass();
            String string = uriP.toString();
            string.getClass();
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.b = string;
            return iconCompat;
        }
        if (iO != 6) {
            IconCompat iconCompat2 = new IconCompat(-1);
            iconCompat2.b = icon;
            return iconCompat2;
        }
        Uri uriP2 = p(icon);
        PorterDuff.Mode mode2 = IconCompat.k;
        uriP2.getClass();
        String string2 = uriP2.toString();
        string2.getClass();
        IconCompat iconCompat3 = new IconCompat(6);
        iconCompat3.b = string2;
        return iconCompat3;
    }

    public static String k(Activity activity) {
        String string;
        try {
            ActivityInfo activityInfo = activity.getPackageManager().getActivityInfo(activity.getComponentName(), Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
            String str = activityInfo.parentActivityName;
            if (str != null) {
                return str;
            }
            Bundle bundle = activityInfo.metaData;
            if (bundle != null && (string = bundle.getString("android.support.PARENT_ACTIVITY")) != null) {
                if (string.charAt(0) != '.') {
                    return string;
                }
                return activity.getPackageName() + string;
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            e0.i(e);
            return null;
        }
    }

    public static int l(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return ke0.h(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }

    public static String m(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return ke0.i(obj);
        }
        try {
            return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon package", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        }
    }

    public static final String n(Throwable th) {
        th.getClass();
        Class<?> cls = th.getClass();
        kce kceVar = jce.a;
        String strD = kceVar.b(cls).d();
        if (strD != null) {
            return strD;
        }
        String strF = kceVar.b(th.getClass()).f();
        return strF == null ? "UnknownThrowable" : strF;
    }

    public static int o(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return ke0.l(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e);
            return -1;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e2);
            return -1;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e3);
            return -1;
        }
    }

    public static Uri p(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return ke0.m(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        }
    }
}
