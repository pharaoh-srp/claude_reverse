package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.model.Badge;
import com.anthropic.claude.api.model.DisabledReason;
import com.anthropic.claude.api.model.ModelSelectorEntry;
import com.anthropic.claude.api.model.ThinkingOption;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.ThinkingEffort;
import com.anthropic.claude.types.strings._ServerLocalizedString;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kpb {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(ModelSelectorEntry modelSelectorEntry, boolean z, bz7 bz7Var, qnc qncVar, boolean z2, ld4 ld4Var, int i, int i2) {
        boolean z3;
        int i3;
        boolean z4;
        ta4 ta4VarQ0;
        long j;
        long j2;
        int i4;
        int i5;
        int i6;
        int i7;
        nxf nxfVarG;
        String localizedText;
        _ServerLocalizedString message;
        String localizedText2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2133689084);
        int i8 = i | (e18Var.f(modelSelectorEntry) ? 4 : 2) | (e18Var.g(z) ? 32 : 16) | (e18Var.h(bz7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.f(qncVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        int i9 = i2 & 16;
        if (i9 != 0) {
            i3 = i8 | 24576;
            z3 = z2;
        } else {
            z3 = z2;
            i3 = i8 | (e18Var.g(z3) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        }
        byte b = 0;
        if (e18Var.Q(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z5 = i9 != 0 ? true : z3;
            DisabledReason disabled_reason = modelSelectorEntry.getDisabled_reason();
            DisabledReason.UpgradeRequired upgradeRequired = disabled_reason instanceof DisabledReason.UpgradeRequired ? (DisabledReason.UpgradeRequired) disabled_reason : null;
            String required_plan = upgradeRequired != null ? upgradeRequired.getRequired_plan() : null;
            pvg pvgVar = x44.r(required_plan, "pro") ? pvg.PRO : x44.r(required_plan, "max") ? pvg.MAX : null;
            int i10 = pvgVar == null ? -1 : jpb.a[pvgVar.ordinal()];
            Integer numValueOf = i10 != 1 ? i10 != 2 ? null : Integer.valueOf(R.string.subscription_level_max) : Integer.valueOf(R.string.subscription_level_pro);
            if (numValueOf == null) {
                e18Var.a0(784929725);
                e18Var.p(false);
                ta4VarQ0 = null;
            } else {
                e18Var.a0(784929726);
                ta4VarQ0 = fd9.q0(-833084612, new gq0(numValueOf.intValue(), 8, b), e18Var);
                e18Var.p(false);
            }
            if (ta4VarQ0 == null) {
                e18Var.a0(785285296);
                Badge badge = modelSelectorEntry.getBadge();
                if (badge == null || (message = badge.getMessage()) == null || (localizedText2 = message.getLocalizedText()) == null || !(!bsg.I0(localizedText2))) {
                    badge = null;
                }
                if (badge == null) {
                    e18Var.a0(785285295);
                    e18Var.p(false);
                    ta4VarQ0 = null;
                } else {
                    e18Var.a0(785285296);
                    ta4VarQ0 = fd9.q0(-291182450, new zob(badge, 0), e18Var);
                    e18Var.p(false);
                }
                e18Var.p(false);
            } else {
                e18Var.a0(-1775795190);
                e18Var.p(false);
            }
            ta4 ta4Var = ta4VarQ0;
            if (z) {
                e18Var.a0(-1775779250);
                j = gm3.a(e18Var).b0;
            } else {
                e18Var.a0(-1775778165);
                j = ((d54) e18Var.j(on4.a)).a;
            }
            e18Var.p(false);
            if (z) {
                e18Var.a0(-1775775914);
                j2 = gm3.a(e18Var).k;
            } else {
                e18Var.a0(-1775774549);
                j2 = gm3.a(e18Var).O;
            }
            e18Var.p(false);
            if (modelSelectorEntry.isSelectable()) {
                e18Var.a0(785986206);
                long j3 = j2;
                i6 = 1;
                i4 = i3;
                i5 = 256;
                i7 = 0;
                nxfVarG = c0l.g(j, j3, j, 0L, j3, e18Var, 18);
                e18Var.p(false);
            } else {
                i4 = i3;
                i5 = 256;
                i6 = 1;
                i7 = 0;
                e18Var.a0(786242700);
                nxfVarG = c0l.g(j, j2, 0L, 0L, 0L, e18Var, 58);
                e18Var.p(false);
            }
            String displayName = modelSelectorEntry.getDisplayName();
            _ServerLocalizedString description = modelSelectorEntry.getDescription();
            if (description == null || (localizedText = description.getLocalizedText()) == null || bsg.I0(localizedText)) {
                localizedText = null;
            }
            boolean zIsSelectable = z5 ? modelSelectorEntry.isSelectable() : i7;
            iqb iqbVarC = b.c(fqb.E, 1.0f);
            int i11 = (i4 & 896) == i5 ? i6 : i7;
            if ((i4 & 14) != 4) {
                i6 = i7;
            }
            int i12 = i11 | i6;
            Object objN = e18Var.N();
            if (i12 != 0 || objN == jd4.a) {
                objN = new apb(bz7Var, modelSelectorEntry, i7);
                e18Var.k0(objN);
            }
            kvk.b(displayName, (zy7) objN, iqbVarC, localizedText, z, null, ta4Var, zIsSelectable, null, 0, qncVar, nxfVarG, e18Var, ((i4 << 9) & 57344) | 384, (i4 >> 9) & 14, 800);
            e18Var = e18Var;
            z4 = z5;
        } else {
            e18Var.T();
            z4 = z3;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ey3(modelSelectorEntry, z, bz7Var, qncVar, z4, i, i2);
        }
    }

    public static final void b(Badge badge, iqb iqbVar, ld4 ld4Var, int i) {
        cpc cpcVar;
        String localizedText;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1119149241);
        int i2 = (e18Var.f(badge) ? 4 : 2) | i | 48;
        int i3 = 0;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            int i4 = jpb.b[badge.getVariant().ordinal()];
            if (i4 == 1) {
                e18Var.a0(1760602319);
                cpcVar = new cpc(new d54(gm3.a(e18Var).q), new d54(gm3.a(e18Var).N));
                e18Var.p(false);
            } else if (i4 == 2) {
                e18Var.a0(1760605113);
                cpcVar = new cpc(new d54(d54.b(0.1f, gm3.a(e18Var).k)), new d54(gm3.a(e18Var).j));
                e18Var.p(false);
            } else {
                if (i4 != 3) {
                    throw ebh.u(e18Var, 1760600861, false);
                }
                e18Var.a0(1760609225);
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

    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(java.lang.String r22, long r23, long r25, defpackage.iqb r27, defpackage.ld4 r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kpb.c(java.lang.String, long, long, iqb, ld4, int, int):void");
    }

    public static final void d(String str, String str2, zy7 zy7Var, qnc qncVar, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        ta4 ta4VarQ0;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1074003574);
        int i2 = i | (e18Var2.f(str) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(str2) ? 32 : 16;
        }
        int i3 = i2 | (e18Var2.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var2.f(qncVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        if (e18Var2.Q(i3 & 1, (74899 & i3) != 74898)) {
            if (str2 == null || str2.length() == 0) {
                e18Var2.a0(1866473276);
                e18Var2.p(false);
                ta4VarQ0 = null;
            } else {
                e18Var2.a0(1866517017);
                ta4VarQ0 = fd9.q0(1756326811, new yi7(str2, 19), e18Var2);
                e18Var2.p(false);
            }
            e18Var = e18Var2;
            ybi.b(null, fd9.q0(-922956414, new yi7(str, 20), e18Var2), androidx.compose.foundation.b.c(iqbVar, true, null, null, null, zy7Var, 14), ta4VarQ0, ypk.b, 0L, qncVar, MTTypesetterKt.kLineSkipLimitMultiplier, null, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, false, null, null, e18Var, ((i3 << 6) & 3670016) | 54, 0, 16288);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pk(str, str2, zy7Var, qncVar, iqbVar, i, 20);
        }
    }

    public static final void e(List list, String str, bz7 bz7Var, i4g i4gVar, ld4 ld4Var, int i) {
        int i2;
        bz7 bz7Var2;
        e18 e18Var;
        list.getClass();
        bz7Var.getClass();
        i4gVar.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(866926601);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var2.f(list) : e18Var2.h(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(str != null ? ModelId.m1058boximpl(str) : null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            bz7Var2 = bz7Var;
            i2 |= e18Var2.h(bz7Var2) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            bz7Var2 = bz7Var;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.f(i4gVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var2.Q(i2 & 1, (i2 & 1171) != 1170)) {
            qnc qncVarQ0 = xn5.q0(i4gVar.a, gb9.b(MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 1));
            mnc mncVar = i4gVar.a;
            iqb iqbVarN = gb9.N(fqb.E, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, i4gVar.b, 7);
            boolean zF = ((i2 & 14) == 4 || ((i2 & 8) != 0 && e18Var2.h(list))) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | e18Var2.f(qncVarQ0);
            Object objN = e18Var2.N();
            if (zF || objN == jd4.a) {
                fe feVar = new fe(list, str, bz7Var2, qncVarQ0, 28);
                e18Var2.k0(feVar);
                objN = feVar;
            }
            e18Var = e18Var2;
            qwj.a(iqbVarN, mncVar, null, null, null, null, null, (bz7) objN, e18Var, 0, 124);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bg6(list, (Object) str, (qz7) bz7Var, i4gVar, i, 10);
        }
    }

    public static final void f(List list, String str, ThinkingOption thinkingOption, boolean z, boolean z2, bz7 bz7Var, bz7 bz7Var2, i4g i4gVar, pl3 pl3Var, ld4 ld4Var, int i) {
        int i2;
        ThinkingOption thinkingOption2;
        boolean z3;
        boolean z4;
        bz7 bz7Var3;
        e18 e18Var;
        mnc mncVar;
        list.getClass();
        bz7Var.getClass();
        bz7Var2.getClass();
        i4gVar.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-871244342);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var2.f(list) : e18Var2.h(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(str != null ? ThinkingEffort.m1135boximpl(str) : null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            thinkingOption2 = thinkingOption;
            i2 |= e18Var2.f(thinkingOption2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            thinkingOption2 = thinkingOption;
        }
        if ((i & 3072) == 0) {
            z3 = z;
            i2 |= e18Var2.g(z3) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            z3 = z;
        }
        if ((i & 24576) == 0) {
            z4 = z2;
            i2 |= e18Var2.g(z4) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        } else {
            z4 = z2;
        }
        if ((196608 & i) == 0) {
            bz7Var3 = bz7Var;
            i2 |= e18Var2.h(bz7Var3) ? 131072 : 65536;
        } else {
            bz7Var3 = bz7Var;
        }
        if ((i & 1572864) == 0) {
            i2 |= e18Var2.h(bz7Var2) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= e18Var2.f(i4gVar) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= (i & 134217728) == 0 ? e18Var2.f(pl3Var) : e18Var2.h(pl3Var) ? 67108864 : 33554432;
        }
        if (e18Var2.Q(i2 & 1, (i2 & 38347923) != 38347922)) {
            e18Var2.V();
            if ((i & 1) != 0 && !e18Var2.A()) {
                e18Var2.T();
            }
            e18Var2.q();
            qnc qncVarQ0 = xn5.q0(i4gVar.a, gb9.b(MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 1));
            mnc mncVar2 = i4gVar.a;
            iqb iqbVarN = gb9.N(fqb.E, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, i4gVar.b, 7);
            boolean zF = ((i2 & 14) == 4 || ((i2 & 8) != 0 && e18Var2.h(list))) | ((i2 & 112) == 32) | ((458752 & i2) == 131072) | e18Var2.f(qncVarQ0) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384) | ((3670016 & i2) == 1048576) | ((((234881024 & i2) ^ 100663296) > 67108864 && e18Var2.h(pl3Var)) || (i2 & 100663296) == 67108864);
            Object objN = e18Var2.N();
            if (zF || objN == jd4.a) {
                bz7 bz7Var4 = bz7Var3;
                mncVar = mncVar2;
                epb epbVar = new epb(list, thinkingOption2, z3, str, bz7Var4, qncVarQ0, z4, bz7Var2, pl3Var, 0);
                e18Var2.k0(epbVar);
                objN = epbVar;
            } else {
                mncVar = mncVar2;
            }
            e18Var = e18Var2;
            qwj.a(iqbVarN, mncVar, null, null, null, null, null, (bz7) objN, e18Var, 0, 124);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new wu2(list, str, thinkingOption, z, z2, bz7Var, bz7Var2, i4gVar, pl3Var, i);
        }
    }

    public static final void g(final List list, final boolean z, final String str, final boolean z2, final String str2, final ThinkingOption thinkingOption, final boolean z3, final boolean z4, final boolean z5, final bz7 bz7Var, final bz7 bz7Var2, final zy7 zy7Var, final zy7 zy7Var2, final i4g i4gVar, final pl3 pl3Var, ld4 ld4Var, final int i, final int i2) {
        int i3;
        zy7 zy7Var3;
        e18 e18Var;
        mnc mncVar;
        list.getClass();
        bz7Var.getClass();
        bz7Var2.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        i4gVar.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1649255080);
        int i4 = i | (e18Var2.f(list) ? 4 : 2) | (e18Var2.g(z) ? 32 : 16) | (e18Var2.f(str != null ? ModelId.m1058boximpl(str) : null) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.g(z2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        boolean zF = e18Var2.f(str2);
        int i5 = FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        int i6 = i4 | (zF ? 16384 : 8192) | (e18Var2.f(thinkingOption) ? 131072 : 65536) | (e18Var2.g(z3) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var2.g(z4) ? 8388608 : 4194304) | (e18Var2.g(z5) ? 67108864 : 33554432);
        if ((i2 & 6) == 0) {
            i3 = i2 | (e18Var2.h(bz7Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var2.h(bz7Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            zy7Var3 = zy7Var;
            i3 |= e18Var2.h(zy7Var3) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            zy7Var3 = zy7Var;
        }
        if ((i2 & 3072) == 0) {
            i3 |= e18Var2.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i2 & 24576) == 0) {
            if (e18Var2.f(i4gVar)) {
                i5 = 16384;
            }
            i3 |= i5;
        }
        if ((i2 & 196608) == 0) {
            i3 |= (i2 & 262144) == 0 ? e18Var2.f(pl3Var) : e18Var2.h(pl3Var) ? 131072 : 65536;
        }
        int i7 = i3;
        if (e18Var2.Q(i6 & 1, ((i6 & 306783379) == 306783378 && (74899 & i7) == 74898) ? false : true)) {
            e18Var2.V();
            if ((i & 1) != 0 && !e18Var2.A()) {
                e18Var2.T();
            }
            e18Var2.q();
            final qnc qncVarQ0 = xn5.q0(i4gVar.a, gb9.b(MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 1));
            mnc mncVar2 = i4gVar.a;
            iqb iqbVarN = gb9.N(fqb.E, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, i4gVar.b, 7);
            boolean zH = ((i6 & 896) == 256) | e18Var2.h(list) | ((i7 & 14) == 4) | e18Var2.f(qncVarQ0) | ((i6 & 7168) == 2048) | ((57344 & i6) == 16384) | ((i7 & 896) == 256) | ((i6 & 458752) == 131072) | ((3670016 & i6) == 1048576) | ((29360128 & i6) == 8388608) | ((234881024 & i6) == 67108864) | ((i7 & 112) == 32) | ((((i7 & 458752) ^ 196608) > 131072 && e18Var2.h(pl3Var)) || (i7 & 196608) == 131072) | ((i6 & 112) == 32) | ((i7 & 7168) == 2048);
            Object objN = e18Var2.N();
            if (zH || objN == jd4.a) {
                mncVar = mncVar2;
                final zy7 zy7Var4 = zy7Var3;
                bz7 bz7Var3 = new bz7() { // from class: fpb
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj) {
                        haa haaVar = (haa) obj;
                        haaVar.getClass();
                        List list2 = list;
                        boolean z6 = !list2.isEmpty();
                        String str3 = str;
                        bz7 bz7Var4 = bz7Var;
                        qnc qncVar = qncVarQ0;
                        haa.a(haaVar, z6, new ta4(1807130023, true, new hpb(list2, str3, bz7Var4, qncVar, 2)), 2);
                        int i8 = 0;
                        ta4 ta4Var = new ta4(-850015842, true, new wob(str2, zy7Var4, qncVar, i8));
                        boolean z7 = z2;
                        haa.a(haaVar, z7, ta4Var, 2);
                        ThinkingOption thinkingOption2 = thinkingOption;
                        boolean z8 = z3;
                        haa.a(haaVar, !z7 && (thinkingOption2 != null || z8), new ta4(-799330849, true, new xob(thinkingOption2, z8, z4, z5, bz7Var2, qncVar, pl3Var, 0)), 2);
                        haa.a(haaVar, z, new ta4(-748645856, true, new yob(zy7Var2, qncVar, i8)), 2);
                        return iei.a;
                    }
                };
                e18Var = e18Var2;
                e18Var.k0(bz7Var3);
                objN = bz7Var3;
            } else {
                mncVar = mncVar2;
                e18Var = e18Var2;
            }
            qwj.a(iqbVarN, mncVar, null, null, null, null, null, (bz7) objN, e18Var, 0, 124);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(list, z, str, z2, str2, thinkingOption, z3, z4, z5, bz7Var, bz7Var2, zy7Var, zy7Var2, i4gVar, pl3Var, i, i2) { // from class: gpb
                public final /* synthetic */ List E;
                public final /* synthetic */ boolean F;
                public final /* synthetic */ String G;
                public final /* synthetic */ boolean H;
                public final /* synthetic */ String I;
                public final /* synthetic */ ThinkingOption J;
                public final /* synthetic */ boolean K;
                public final /* synthetic */ boolean L;
                public final /* synthetic */ boolean M;
                public final /* synthetic */ bz7 N;
                public final /* synthetic */ bz7 O;
                public final /* synthetic */ zy7 P;
                public final /* synthetic */ zy7 Q;
                public final /* synthetic */ i4g R;
                public final /* synthetic */ pl3 S;
                public final /* synthetic */ int T;

                {
                    this.T = i2;
                }

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(805306369);
                    int iP02 = x44.p0(this.T);
                    kpb.g(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, (ld4) obj, iP0, iP02);
                    return iei.a;
                }
            };
        }
    }
}
