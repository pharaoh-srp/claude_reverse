package com.anthropic.claude.chat.bottomsheet.model;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.model.Badge;
import com.anthropic.claude.api.model.DisabledReason;
import com.anthropic.claude.api.model.ModelSelectorEntry;
import com.anthropic.claude.api.model.ThinkingOption;
import com.anthropic.claude.chat.bottomsheet.model.b;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings._ServerLocalizedString;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.apb;
import defpackage.bsg;
import defpackage.bz7;
import defpackage.c0l;
import defpackage.cpb;
import defpackage.cpc;
import defpackage.d54;
import defpackage.dgf;
import defpackage.e18;
import defpackage.ebh;
import defpackage.fd9;
import defpackage.fqb;
import defpackage.gb9;
import defpackage.ggf;
import defpackage.gm3;
import defpackage.gq0;
import defpackage.hl;
import defpackage.htk;
import defpackage.i4g;
import defpackage.iqb;
import defpackage.jce;
import defpackage.jd4;
import defpackage.jrb;
import defpackage.ks0;
import defpackage.kvk;
import defpackage.ld4;
import defpackage.lz1;
import defpackage.m7f;
import defpackage.mnc;
import defpackage.nxf;
import defpackage.on4;
import defpackage.pl3;
import defpackage.pvg;
import defpackage.pz7;
import defpackage.qnc;
import defpackage.qwj;
import defpackage.r7e;
import defpackage.r93;
import defpackage.sq6;
import defpackage.t4g;
import defpackage.t53;
import defpackage.ta4;
import defpackage.ue;
import defpackage.w44;
import defpackage.wff;
import defpackage.x44;
import defpackage.xn5;
import defpackage.yb2;
import defpackage.ybi;
import defpackage.zob;
import defpackage.zy7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static final void a(ModelSelectorEntry modelSelectorEntry, boolean z, bz7 bz7Var, zy7 zy7Var, qnc qncVar, boolean z2, ld4 ld4Var, int i, int i2) {
        boolean z3;
        int i3;
        boolean z4;
        ta4 ta4VarQ0;
        long j;
        long j2;
        int i4;
        int i5;
        boolean z5;
        nxf nxfVarG;
        String localizedText;
        _ServerLocalizedString message;
        String localizedText2;
        bz7Var.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(252477481);
        int i6 = i | (e18Var.f(modelSelectorEntry) ? 4 : 2) | (e18Var.g(z) ? 32 : 16) | (e18Var.h(bz7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.f(qncVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        int i7 = i2 & 32;
        if (i7 != 0) {
            i3 = i6 | 196608;
            z3 = z2;
        } else {
            z3 = z2;
            i3 = i6 | (e18Var.g(z3) ? 131072 : 65536);
        }
        byte b = 0;
        if (e18Var.Q(i3 & 1, (74899 & i3) != 74898)) {
            boolean z6 = i7 != 0 ? true : z3;
            DisabledReason disabled_reason = modelSelectorEntry.getDisabled_reason();
            DisabledReason.UpgradeRequired upgradeRequired = disabled_reason instanceof DisabledReason.UpgradeRequired ? (DisabledReason.UpgradeRequired) disabled_reason : null;
            String required_plan = upgradeRequired != null ? upgradeRequired.getRequired_plan() : null;
            pvg pvgVar = x44.r(required_plan, "pro") ? pvg.PRO : x44.r(required_plan, "max") ? pvg.MAX : null;
            int i8 = pvgVar == null ? -1 : ggf.a[pvgVar.ordinal()];
            Integer numValueOf = i8 != 1 ? i8 != 2 ? null : Integer.valueOf(R.string.subscription_level_max) : Integer.valueOf(R.string.subscription_level_pro);
            if (numValueOf == null) {
                e18Var.a0(1069385272);
                e18Var.p(false);
                ta4VarQ0 = null;
            } else {
                e18Var.a0(1069385273);
                ta4VarQ0 = fd9.q0(-353742751, new gq0(numValueOf.intValue(), 9, b), e18Var);
                e18Var.p(false);
            }
            if (ta4VarQ0 == null) {
                e18Var.a0(1069740843);
                Badge badge = modelSelectorEntry.getBadge();
                if (badge == null || (message = badge.getMessage()) == null || (localizedText2 = message.getLocalizedText()) == null || !(!bsg.I0(localizedText2))) {
                    badge = null;
                }
                if (badge == null) {
                    e18Var.a0(1069740842);
                    e18Var.p(false);
                    ta4VarQ0 = null;
                } else {
                    e18Var.a0(1069740843);
                    ta4VarQ0 = fd9.q0(-1038994637, new zob(badge, 3), e18Var);
                    e18Var.p(false);
                }
                e18Var.p(false);
            } else {
                e18Var.a0(2112706095);
                e18Var.p(false);
            }
            ta4 ta4Var = ta4VarQ0;
            if (z) {
                e18Var.a0(2112722035);
                j = gm3.a(e18Var).b0;
            } else {
                e18Var.a0(2112723120);
                j = ((d54) e18Var.j(on4.a)).a;
            }
            e18Var.p(false);
            if (z) {
                e18Var.a0(2112725371);
                j2 = gm3.a(e18Var).k;
            } else {
                e18Var.a0(2112726736);
                j2 = gm3.a(e18Var).O;
            }
            e18Var.p(false);
            if (modelSelectorEntry.isUnavailable()) {
                i4 = i3;
                i5 = 256;
                z5 = false;
                e18Var.a0(1070580199);
                nxfVarG = c0l.g(j, j2, 0L, 0L, 0L, e18Var, 58);
                e18Var.p(false);
            } else {
                e18Var.a0(1070323705);
                long j3 = j;
                long j4 = j2;
                z5 = false;
                i4 = i3;
                i5 = 256;
                nxfVarG = c0l.g(j3, j4, j3, 0L, j4, e18Var, 18);
                e18Var.p(false);
            }
            String displayName = modelSelectorEntry.getDisplayName();
            _ServerLocalizedString description = modelSelectorEntry.getDescription();
            if (description == null || (localizedText = description.getLocalizedText()) == null || bsg.I0(localizedText)) {
                localizedText = null;
            }
            boolean zIsSelectable = z6 ? modelSelectorEntry.isSelectable() : z5;
            zy7 zy7Var2 = (z6 && modelSelectorEntry.isUpgradeGated()) ? zy7Var : null;
            iqb iqbVarC = androidx.compose.foundation.layout.b.c(fqb.E, 1.0f);
            boolean z7 = (i4 & 896) == i5 ? true : z5;
            if ((i4 & 14) == 4) {
                z5 = true;
            }
            boolean z8 = z7 | z5;
            Object objN = e18Var.N();
            if (z8 || objN == jd4.a) {
                objN = new apb(bz7Var, modelSelectorEntry, 1);
                e18Var.k0(objN);
            }
            kvk.b(displayName, (zy7) objN, iqbVarC, localizedText, z, null, ta4Var, zIsSelectable, zy7Var2, 0, qncVar, nxfVarG, e18Var, ((i4 << 9) & 57344) | 384, (i4 >> 12) & 14, 544);
            e18Var = e18Var;
            z4 = z6;
        } else {
            e18Var.T();
            z4 = z3;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new yb2(modelSelectorEntry, z, bz7Var, zy7Var, qncVar, z4, i, i2);
        }
    }

    public static final void b(Badge badge, iqb iqbVar, ld4 ld4Var, int i) {
        cpc cpcVar;
        String localizedText;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(123432106);
        int i2 = (e18Var.f(badge) ? 4 : 2) | i | 48;
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            int i4 = ggf.b[badge.getVariant().ordinal()];
            if (i4 == 1) {
                e18Var.a0(-1640824704);
                cpcVar = new cpc(new d54(gm3.a(e18Var).q), new d54(gm3.a(e18Var).N));
                e18Var.p(false);
            } else if (i4 == 2) {
                e18Var.a0(-1640821910);
                cpcVar = new cpc(new d54(d54.b(0.1f, gm3.a(e18Var).k)), new d54(gm3.a(e18Var).j));
                e18Var.p(false);
            } else {
                if (i4 != 3) {
                    throw ebh.u(e18Var, -1640826162, false);
                }
                e18Var.a0(-1640817798);
                cpcVar = new cpc(new d54(d54.b(0.1f, gm3.a(e18Var).Q)), new d54(gm3.a(e18Var).Q));
                e18Var.p(false);
            }
            long j = ((d54) cpcVar.E).a;
            long j2 = ((d54) cpcVar.F).a;
            _ServerLocalizedString message = badge.getMessage();
            String string = (message == null || (localizedText = message.getLocalizedText()) == null) ? null : bsg.k1(localizedText).toString();
            if (string == null) {
                string = "";
            }
            fqb fqbVar = fqb.E;
            c(string, j, j2, fqbVar, e18Var, 3072, 0);
            iqbVar = fqbVar;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new cpb(badge, iqbVar, i, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(java.lang.String r22, long r23, long r25, defpackage.iqb r27, defpackage.ld4 r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.chat.bottomsheet.model.b.c(java.lang.String, long, long, iqb, ld4, int, int):void");
    }

    public static final void d(String str, String str2, zy7 zy7Var, qnc qncVar, iqb iqbVar, nxf nxfVar, ld4 ld4Var, int i) {
        nxf nxfVar2;
        boolean z;
        nxf nxfVarG;
        int i2;
        ta4 ta4Var;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1565151699);
        int i3 = i | (e18Var.f(str) ? 4 : 2);
        if ((i & 48) == 0) {
            i3 |= e18Var.f(str2) ? 32 : 16;
        }
        int i4 = i3 | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.f(qncVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | 5767168;
        if (e18Var.Q(i4 & 1, (4793491 & i4) != 4793490)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                z = false;
                nxfVarG = c0l.g(0L, 0L, 0L, 0L, 0L, e18Var, 63);
                i2 = i4 & (-29360129);
            } else {
                e18Var.T();
                nxfVarG = nxfVar;
                i2 = i4 & (-29360129);
                z = false;
            }
            e18Var.q();
            e18Var.a0(1269972979);
            e18Var.p(z);
            if (str2 == null || str2.length() == 0) {
                e18Var.a0(1270340019);
                e18Var.p(z);
                ta4Var = null;
            } else {
                e18Var.a0(1270383109);
                ta4 ta4VarQ0 = fd9.q0(-1314923739, new dgf(str2, nxfVarG), e18Var);
                e18Var.p(z);
                ta4Var = ta4VarQ0;
            }
            ybi.b(null, fd9.q0(1633500619, new dgf(nxfVarG, str), e18Var), androidx.compose.foundation.b.c(iqbVar, true, null, null, null, zy7Var, 14), ta4Var, htk.a, 0L, qncVar, MTTypesetterKt.kLineSkipLimitMultiplier, null, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, false, null, null, e18Var, (3670016 & (i2 << 6)) | 48, 0, 16288);
            e18Var = e18Var;
            nxfVar2 = nxfVarG;
        } else {
            e18Var.T();
            nxfVar2 = nxfVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new hl(str, str2, zy7Var, qncVar, iqbVar, nxfVar2, i);
        }
    }

    public static final void e(t53 t53Var, t4g t4gVar, zy7 zy7Var, i4g i4gVar, ld4 ld4Var, int i) {
        int i2;
        zy7 zy7Var2;
        i4g i4gVar2;
        e18 e18Var;
        int i3;
        _ServerLocalizedString name;
        t4gVar.getClass();
        zy7Var.getClass();
        i4gVar.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1996016889);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(t53Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var2.f(t4gVar) : e18Var2.h(t4gVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            zy7Var2 = zy7Var;
            i2 |= e18Var2.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            zy7Var2 = zy7Var;
        }
        if ((i & 3072) == 0) {
            i4gVar2 = i4gVar;
            i2 |= e18Var2.f(i4gVar2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            i4gVar2 = i4gVar;
        }
        int i4 = 1;
        if (e18Var2.Q(i2 & 1, (i2 & 1171) != 1170)) {
            r93 r93Var = t53Var.g0;
            List list = (List) r93Var.o.getValue();
            boolean z = !((List) r93Var.p.getValue()).isEmpty();
            String strE = r93Var.e();
            boolean z2 = !((List) r93Var.z.getValue()).isEmpty();
            ThinkingOption thinkingOption = (ThinkingOption) r93Var.E.getValue();
            String localizedText = (thinkingOption == null || (name = thinkingOption.getName()) == null) ? null : name.getLocalizedText();
            ThinkingOption thinkingOption2 = (ThinkingOption) w44.N0((List) r93Var.C.getValue());
            boolean zBooleanValue = ((Boolean) r93Var.A.getValue()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) r93Var.D.getValue()).booleanValue();
            boolean zBooleanValue3 = ((Boolean) r93Var.F.getValue()).booleanValue();
            boolean zBooleanValue4 = ((Boolean) r93Var.f().q.getValue()).booleanValue();
            int i5 = i2 & 112;
            boolean zF = e18Var2.f(r93Var) | (i5 == 32 || ((i2 & 64) != 0 && e18Var2.h(t4gVar)));
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                objN = new wff(r93Var, t4gVar, i4);
                e18Var2.k0(objN);
            }
            bz7 bz7Var = (bz7) objN;
            boolean zF2 = e18Var2.f(r93Var);
            Object objN2 = e18Var2.N();
            if (zF2 || objN2 == lz1Var) {
                i3 = i5;
                ks0 ks0Var = new ks0(1, r93Var, r93.class, "onSetThinkingEnabled", "onSetThinkingEnabled(Z)Lkotlinx/coroutines/Job;", 8, 5);
                e18Var2.k0(ks0Var);
                objN2 = ks0Var;
            } else {
                i3 = i5;
            }
            bz7 bz7Var2 = (bz7) objN2;
            boolean z3 = i3 == 32 || ((i2 & 64) != 0 && e18Var2.h(t4gVar));
            Object objN3 = e18Var2.N();
            if (z3 || objN3 == lz1Var) {
                objN3 = new ue(t4gVar, 26);
                e18Var2.k0(objN3);
            }
            zy7 zy7Var3 = (zy7) objN3;
            boolean z4 = i3 == 32 || ((i2 & 64) != 0 && e18Var2.h(t4gVar));
            Object objN4 = e18Var2.N();
            if (z4 || objN4 == lz1Var) {
                objN4 = new ue(t4gVar, 27);
                e18Var2.k0(objN4);
            }
            e18Var = e18Var2;
            f(list, z, strE, z2, localizedText, thinkingOption2, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, bz7Var, zy7Var2, bz7Var2, zy7Var3, (zy7) objN4, i4gVar2, null, e18Var, 0, ((i2 << 6) & 458752) | ((i2 >> 3) & 112));
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new jrb(t53Var, t4gVar, zy7Var, i4gVar, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [e18] */
    /* JADX WARN: Type inference failed for: r0v2, types: [e18] */
    /* JADX WARN: Type inference failed for: r0v24, types: [e18] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r10v23, types: [ld4] */
    /* JADX WARN: Type inference failed for: r3v49, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [e18] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8 */
    public static final void f(final List list, final boolean z, final String str, final boolean z2, final String str2, final ThinkingOption thinkingOption, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final bz7 bz7Var, final zy7 zy7Var, final bz7 bz7Var2, final zy7 zy7Var2, final zy7 zy7Var3, final i4g i4gVar, pl3 pl3Var, ld4 ld4Var, final int i, final int i2) {
        int i3;
        final pl3 pl3Var2;
        ?? r0;
        pl3 pl3Var3;
        int i4;
        ?? arrayList;
        final pl3 pl3Var4;
        mnc mncVar;
        ?? r02;
        ?? r4 = (e18) ld4Var;
        r4.c0(1674528013);
        int i5 = i | (r4.f(list) ? 4 : 2) | (r4.g(z) ? 32 : 16) | (r4.f(str != null ? ModelId.m1058boximpl(str) : null) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        boolean zG = r4.g(z2);
        int i6 = FreeTypeConstants.FT_LOAD_NO_RECURSE;
        int i7 = i5 | (zG ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : 1024);
        boolean zF = r4.f(str2);
        int i8 = FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        int i9 = i7 | (zF ? 16384 : 8192) | (r4.f(thinkingOption) ? 131072 : 65536) | (r4.g(z3) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (r4.g(z4) ? 8388608 : 4194304) | (r4.g(z5) ? 67108864 : 33554432) | (r4.g(z6) ? 536870912 : 268435456);
        if ((i2 & 6) == 0) {
            i3 = i2 | (r4.h(bz7Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= r4.h(zy7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= r4.h(bz7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i2 & 3072) == 0) {
            if (r4.h(zy7Var2)) {
                i6 = FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
            }
            i3 |= i6;
        }
        if ((i2 & 24576) == 0) {
            if (r4.h(zy7Var3)) {
                i8 = 16384;
            }
            i3 |= i8;
        }
        if ((i2 & 196608) == 0) {
            i3 |= r4.f(i4gVar) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= 524288;
        }
        if (r4.Q(i9 & 1, ((i9 & 306783379) == 306783378 && (i3 & 599187) == 599186) ? false : true)) {
            r4.V();
            int i10 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i10 == 0 || r4.A()) {
                m7f m7fVarN = sq6.n(r4, -1168520582, r4, -1633490746);
                boolean zF2 = r4.f(null) | r4.f(m7fVarN);
                Object objN = r4.N();
                if (zF2 || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(pl3.class), null, null);
                    r4.k0(objN);
                }
                r4.p(false);
                r4.p(false);
                pl3Var3 = (pl3) objN;
                i4 = i3 & (-3670017);
            } else {
                r4.T();
                pl3Var3 = pl3Var;
                i4 = i3 & (-3670017);
            }
            r4.q();
            final qnc qncVarQ0 = xn5.q0(i4gVar.a, gb9.b(MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 1));
            if (z6) {
                arrayList = list;
            } else {
                arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Iterator it2 = it;
                    if (str == null ? false : ModelId.m1061equalsimpl0(((ModelSelectorEntry) next).m364getIdi4oh0I(), str)) {
                        arrayList.add(next);
                    }
                    it = it2;
                }
            }
            mnc mncVar2 = i4gVar.a;
            iqb iqbVarN = gb9.N(fqb.E, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, i4gVar.b, 7);
            boolean zH = ((i9 & 896) == 256) | r4.h(arrayList) | ((i4 & 14) == 4) | ((i4 & 112) == 32) | r4.f(qncVarQ0) | ((1879048192 & i9) == 536870912) | ((i9 & 7168) == 2048) | ((i9 & 57344) == 16384) | ((i4 & 7168) == 2048) | ((458752 & i9) == 131072) | ((3670016 & i9) == 1048576) | ((29360128 & i9) == 8388608) | ((234881024 & i9) == 67108864) | ((i4 & 896) == 256) | r4.h(pl3Var3) | ((i9 & 112) == 32) | ((i4 & 57344) == 16384);
            Object objN2 = r4.N();
            if (zH || objN2 == lz1Var) {
                ?? r03 = r4;
                pl3Var4 = pl3Var3;
                final ?? r3 = arrayList;
                mncVar = mncVar2;
                bz7 bz7Var3 = new bz7() { // from class: egf
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj) {
                        haa haaVar = (haa) obj;
                        haaVar.getClass();
                        List list2 = r3;
                        int i11 = 1;
                        boolean z7 = !list2.isEmpty();
                        String str3 = str;
                        bz7 bz7Var4 = bz7Var;
                        zy7 zy7Var4 = zy7Var;
                        qnc qncVar = qncVarQ0;
                        boolean z8 = z6;
                        haa.a(haaVar, z7, new ta4(1028878156, true, new mwe(list2, str3, bz7Var4, zy7Var4, qncVar, z8, 1)), 2);
                        ta4 ta4Var = new ta4(-1321597821, true, new wob(str2, zy7Var2, qncVar, i11));
                        boolean z9 = z2;
                        haa.a(haaVar, z9, ta4Var, 2);
                        ThinkingOption thinkingOption2 = thinkingOption;
                        boolean z10 = z3;
                        boolean z11 = false;
                        haa.a(haaVar, !z9 && (thinkingOption2 != null || z10), new ta4(-2145408636, true, new xob(thinkingOption2, z10, z4, z5, bz7Var2, qncVar, pl3Var4, 1)), 2);
                        if (z && z8) {
                            z11 = true;
                        }
                        haa.a(haaVar, z11, new ta4(1325747845, true, new yob(zy7Var3, qncVar, i11)), 2);
                        return iei.a;
                    }
                };
                r03.k0(bz7Var3);
                objN2 = bz7Var3;
                r02 = r03;
            } else {
                r02 = r4;
                pl3Var4 = pl3Var3;
                mncVar = mncVar2;
            }
            qwj.a(iqbVarN, mncVar, null, null, null, null, null, (bz7) objN2, r02, 0, 124);
            pl3Var2 = pl3Var4;
            r0 = r02;
        } else {
            ?? r04 = r4;
            r04.T();
            pl3Var2 = pl3Var;
            r0 = r04;
        }
        r7e r7eVarS = r0.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(list, z, str, z2, str2, thinkingOption, z3, z4, z5, z6, bz7Var, zy7Var, bz7Var2, zy7Var2, zy7Var3, i4gVar, pl3Var2, i, i2) { // from class: fgf
                public final /* synthetic */ List E;
                public final /* synthetic */ boolean F;
                public final /* synthetic */ String G;
                public final /* synthetic */ boolean H;
                public final /* synthetic */ String I;
                public final /* synthetic */ ThinkingOption J;
                public final /* synthetic */ boolean K;
                public final /* synthetic */ boolean L;
                public final /* synthetic */ boolean M;
                public final /* synthetic */ boolean N;
                public final /* synthetic */ bz7 O;
                public final /* synthetic */ zy7 P;
                public final /* synthetic */ bz7 Q;
                public final /* synthetic */ zy7 R;
                public final /* synthetic */ zy7 S;
                public final /* synthetic */ i4g T;
                public final /* synthetic */ pl3 U;
                public final /* synthetic */ int V;

                {
                    this.V = i2;
                }

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(1);
                    int iP02 = x44.p0(this.V);
                    b.f(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, (ld4) obj, iP0, iP02);
                    return iei.a;
                }
            };
        }
    }
}
