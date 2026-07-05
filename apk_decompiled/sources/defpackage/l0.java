package defpackage;

import android.database.SQLException;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import androidx.health.platform.client.proto.g;
import coil3.compose.AsyncImagePainter$State$Error;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.analytics.events.ChatListEvents$ConversationSearchOutcome;
import com.anthropic.claude.api.account.Account;
import com.anthropic.claude.api.account.AccountSettings;
import com.anthropic.claude.api.account.AppStartResponse;
import com.anthropic.claude.api.account.MemoryMode;
import com.anthropic.claude.api.chat.ChatConversation;
import com.anthropic.claude.api.memory.MemorySettingsResponse;
import com.anthropic.claude.artifact.details.ArtifactFullScreenParams;
import com.anthropic.claude.sessions.types.AskUserQuestionQuestion;
import com.anthropic.claude.types.strings.ChatId;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l0 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ l0(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        aba abaVar;
        int i = this.E;
        int i2 = 0;
        int i3 = 1;
        iei ieiVar = iei.a;
        Object obj2 = this.G;
        Object obj3 = this.F;
        switch (i) {
            case 0:
                ((zub) obj3).c((ndd) obj2);
                return ieiVar;
            case 1:
                cba cbaVar = (cba) obj3;
                AccessibilityManager accessibilityManager = (AccessibilityManager) obj2;
                if (((y3a) obj) == y3a.ON_RESUME) {
                    cbaVar.getClass();
                    cbaVar.G.setValue(Boolean.valueOf(accessibilityManager.isEnabled()));
                    accessibilityManager.addAccessibilityStateChangeListener(cbaVar);
                    bba bbaVar = cbaVar.H;
                    if (bbaVar != null) {
                        bbaVar.E.setValue(Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()));
                        accessibilityManager.addTouchExplorationStateChangeListener(bbaVar);
                    }
                    if (Build.VERSION.SDK_INT >= 33 && (abaVar = cbaVar.I) != null) {
                        abaVar.a.setValue(Boolean.valueOf(cba.a(accessibilityManager)));
                        abaVar.b.setValue(Boolean.valueOf(cba.d(accessibilityManager)));
                        d6.a(accessibilityManager, se0.g(abaVar));
                    }
                }
                return ieiVar;
            case 2:
                MemorySettingsResponse memorySettingsResponse = (MemorySettingsResponse) obj3;
                hcb hcbVar = ((icb) obj2).a;
                AccountSettings accountSettings = (AccountSettings) obj;
                accountSettings.getClass();
                Boolean enabled_melange = memorySettingsResponse.getEnabled_melange();
                boolean zBooleanValue = enabled_melange != null ? enabled_melange.booleanValue() : hcbVar.a();
                Boolean enabled_saffron = memorySettingsResponse.getEnabled_saffron();
                return AccountSettings.m107copyNcesMF4$default(accountSettings, null, null, null, null, null, null, null, null, Boolean.valueOf(enabled_saffron != null ? enabled_saffron.booleanValue() : hcbVar.c()), Boolean.valueOf(zBooleanValue), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268434687, null);
            case 3:
                kl8 kl8Var = (kl8) obj3;
                nwb nwbVar = (nwb) obj2;
                if (((Boolean) obj).booleanValue()) {
                    nwbVar.setValue(eyh.F);
                } else {
                    kl8Var.O(eyh.E);
                }
                return ieiVar;
            case 4:
                hi hiVar = (hi) obj;
                hiVar.getClass();
                ((nwb) obj2).setValue(hiVar);
                tec tecVar = ((ggc) obj3).a;
                fi fiVar = hiVar instanceof fi ? (fi) hiVar : null;
                tecVar.t.setValue(fiVar != null ? fiVar.b : null);
                return ieiVar;
            case 5:
                am amVar = (am) obj3;
                vm vmVar = (vm) obj2;
                ek6 ek6Var = (ek6) obj;
                ek6Var.getClass();
                int iOrdinal = ek6Var.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        amVar.a();
                    } else {
                        if (iOrdinal != 2) {
                            wg6.i();
                            return null;
                        }
                        amVar.a();
                        vmVar.p(xk.H);
                    }
                }
                return ieiVar;
            case 6:
                zl zlVar = (zl) obj3;
                vm vmVar2 = (vm) obj2;
                ek6 ek6Var2 = (ek6) obj;
                ek6Var2.getClass();
                int iOrdinal2 = ek6Var2.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        zlVar.a();
                    } else {
                        if (iOrdinal2 != 2) {
                            wg6.i();
                            return null;
                        }
                        zlVar.a();
                        vmVar2.p(xk.F);
                    }
                }
                return ieiVar;
            case 7:
                kdg kdgVar = (kdg) obj2;
                String str = ((yk) kdgVar.get((kdgVar.size() - 1) - ((Integer) obj).intValue())).a;
                str.getClass();
                vm vmVar3 = (vm) ((an) obj3).b;
                vmVar3.getClass();
                String str2 = (String) vmVar3.P.get(str);
                return str2 == null ? str : str2;
            case 8:
                ep epVar = (ep) obj3;
                bz7 bz7Var = (bz7) obj2;
                j0a j0aVar = (j0a) obj;
                j0aVar.getClass();
                for (cpc cpcVar : (List) epVar.l.getValue()) {
                    n6e n6eVar = (n6e) cpcVar.E;
                    List list = (List) cpcVar.F;
                    j0aVar.U(ij0.i("header-", n6eVar.name()), "header", new ta4(1370533853, true, new hp(n6eVar, i2)));
                    j0aVar.W(list.size(), new kp(new q6(17), i2, list), new kp(new q6(18), i3, list), new ta4(802480018, true, new lp(list, epVar, bz7Var, i2)));
                }
                return ieiVar;
            case 9:
                m7f m7fVar = (m7f) obj2;
                ((swe) obj).getClass();
                kce kceVar = jce.a;
                return new lu((yn8) obj3, (koi) m7fVar.a(kceVar.b(koi.class), null, null), (vd3) m7fVar.a(kceVar.b(vd3.class), null, null), (wqd) m7fVar.a(kceVar.b(wqd.class), null, null), (pkc) m7fVar.a(kceVar.b(pkc.class), null, null), (dl2) m7fVar.a(kceVar.b(dl2.class), null, null), (qi3) m7fVar.a(kceVar.b(qi3.class), null, null), (am0) m7fVar.a(kceVar.b(am0.class), null, null), (mn5) m7fVar.a(kceVar.b(mn5.class), null, null), (h86) m7fVar.a(kceVar.b(h86.class), null, null));
            case 10:
                sx2 sx2Var = (sx2) obj;
                sx2Var.getClass();
                ((lu) obj3).P(ChatListEvents$ConversationSearchOutcome.CLICKED);
                ChatConversation chatConversation = sx2Var.a;
                ((pz7) obj2).invoke(ChatId.m978boximpl(chatConversation.m176getUuidRjYBDck()), chatConversation.getName());
                return ieiVar;
            case 11:
                ky kyVar = (ky) obj3;
                qy qyVar = (qy) obj2;
                long j = ((ac6) obj).a;
                long j2 = kyVar.L1() ? fcc.j(-1.0f, j) : fcc.j(1.0f, j);
                qyVar.a(kyVar.n0.e(Float.intBitsToFloat((int) (kyVar.o0 == ukc.E ? j2 & 4294967295L : j2 >> 32))), MTTypesetterKt.kLineSkipLimitMultiplier);
                return ieiVar;
            case 12:
                p80 p80Var = (p80) obj3;
                h80 h80Var = p80Var.W;
                c3d c3dVar = (c3d) obj2;
                b3d b3dVar = (b3d) obj;
                if (b3dVar.c() != null) {
                    mma mmaVar = p80Var.U;
                    cu9 cu9VarJ = mmaVar.j(b3dVar);
                    cu9 cu9VarC = b3dVar.c();
                    cu9VarC.getClass();
                    long jA0 = yfd.a0(mmaVar.f(cu9VarJ, cu9VarC));
                    rv1 rv1Var = (rv1) h80Var.G;
                    if (!y69.b(rv1Var.a, jA0)) {
                        ((rv1) h80Var.F).a = !((c79) h80Var.H).equals(sf5.a) ? ((c79) h80Var.H).e() : jA0;
                        rv1Var.a = jA0;
                    }
                    if (!p80Var.V) {
                        h80Var.o(1.0f);
                    }
                    b3dVar.f(c3dVar, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                }
                return ieiVar;
            case 13:
                AppStartResponse appStartResponse = (AppStartResponse) obj;
                appStartResponse.getClass();
                return AppStartResponse.copy$default(appStartResponse, Account.m101copyl0kCUe4$default(appStartResponse.getAccount(), null, null, null, null, null, null, null, (AccountSettings) obj3, false, 383, null), (MemoryMode) obj2, null, null, null, null, null, 124, null);
            case 14:
                m7f m7fVar2 = (m7f) obj2;
                ((swe) obj).getClass();
                kce kceVar2 = jce.a;
                return new xq0((ArtifactFullScreenParams) obj3, (h86) m7fVar2.a(kceVar2.b(h86.class), null, null), (dl2) m7fVar2.a(kceVar2.b(dl2.class), null, null), (koi) m7fVar2.a(kceVar2.b(koi.class), null, null), (vd3) m7fVar2.a(kceVar2.b(vd3.class), null, null), (qi3) m7fVar2.a(kceVar2.b(qi3.class), null, null), (lq0) m7fVar2.a(kceVar2.b(lq0.class), null, null));
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                t4f t4fVar = (t4f) obj3;
                ((w86) obj).getClass();
                t4fVar.setExternalUrlHandler(new x40(3, (nwb) obj2));
                return new zq0(t4fVar, i2);
            case 16:
                tw0 tw0Var = (tw0) obj2;
                String str3 = (String) obj;
                str3.getClass();
                if (((AskUserQuestionQuestion) obj3).getMultiSelect()) {
                    tw0Var.h(str3);
                } else {
                    tw0Var.g(str3);
                }
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ha1 ha1Var = (ha1) obj3;
                ia1 ia1Var = (ia1) obj2;
                uoh uohVar = ha1Var.S;
                if (uohVar != null) {
                    uohVar.b();
                }
                ha1Var.S = null;
                v84 v84Var = ia1Var.F;
                if (v84Var != null) {
                    v84Var.c0(ieiVar);
                }
                ia1Var.F = null;
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                bz7 bz7Var2 = (bz7) obj2;
                cjh cjhVar = (cjh) obj;
                if (!x44.r((cjh) obj3, cjhVar)) {
                    bz7Var2.invoke(cjhVar);
                }
                return ieiVar;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((bz7) obj3).invoke(new va6(((cz5) obj2).c0((int) (((g79) obj).a & 4294967295L))));
                return ieiVar;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                h2f h2fVar = (h2f) obj3;
                eeg eegVar = (eeg) obj2;
                xd6 xd6Var = (xd6) obj;
                zy7 zy7Var = (zy7) h2fVar.c;
                zy7Var.getClass();
                float fCeil = va6.b(((va6) zy7Var.a()).E, MTTypesetterKt.kLineSkipLimitMultiplier) ? 1.0f : (float) Math.ceil(xd6Var.q0(r2));
                float fD = k8g.d(xd6Var.g());
                ((zy7) h2fVar.d).getClass();
                float fMin = Math.min(fCeil, (float) Math.ceil((fD - (((float) Math.ceil(xd6Var.q0(((va6) r3.a()).E))) * 2.0f)) / 2.0f));
                float f = fMin < MTTypesetterKt.kLineSkipLimitMultiplier ? 0.0f : fMin;
                ((zy7) h2fVar.d).getClass();
                float fCeil2 = (float) Math.ceil(xd6Var.q0(((va6) r0.a()).E));
                float f2 = (f / 2.0f) + fCeil2;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32);
                float f3 = fCeil2 * 2.0f;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (xd6Var.g() & 4294967295L)) - f) - f3)) & 4294967295L) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (xd6Var.g() >> 32)) - f) - f3)) << 32);
                if (fCeil2 == MTTypesetterKt.kLineSkipLimitMultiplier && 2.0f * f > k8g.d(xd6Var.g())) {
                    i2 = 1;
                }
                if (i2 != 0) {
                    jFloatToRawIntBits = 0;
                }
                if (i2 != 0) {
                    jFloatToRawIntBits2 = xd6Var.g();
                }
                xd6.S0(xd6Var, eegVar, jFloatToRawIntBits, jFloatToRawIntBits2, MTTypesetterKt.kLineSkipLimitMultiplier, i2 != 0 ? qk7.a : new ksg(f, MTTypesetterKt.kLineSkipLimitMultiplier, 0, 0, null, 30), null, 0, 104);
                return ieiVar;
            case 21:
                cv9 cv9Var = (cv9) obj;
                cv9Var.a();
                xd6.Y0(cv9Var, ((elc) obj3).k, (jy1) obj2, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, 0, 60);
                return ieiVar;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                zy7 zy7Var2 = (zy7) obj3;
                nwb nwbVar2 = (nwb) obj2;
                fk fkVar = (fk) obj;
                fkVar.getClass();
                if (fkVar.e != null) {
                    nwbVar2.setValue(fkVar);
                    zy7Var2.a();
                }
                return ieiVar;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((wwb) ((gmf) obj3).F).l((tn4) obj2);
                return ieiVar;
            case 24:
                nwb nwbVar3 = (nwb) obj2;
                ((AsyncImagePainter$State$Error) obj).getClass();
                if (((o32) obj3).b()) {
                    nwbVar3.setValue(Boolean.TRUE);
                }
                return ieiVar;
            case BuildConfig.VERSION_CODE /* 25 */:
                s52 s52Var = (s52) obj2;
                lze lzeVar = (lze) obj;
                lzeVar.getClass();
                nyj nyjVar = ((w52) obj3).b;
                nyjVar.getClass();
                try {
                    ((xn5) nyjVar.F).m0(lzeVar, s52Var);
                    break;
                } catch (SQLException e) {
                    nyj.C(e);
                    ((sf5) nyjVar.G).I(lzeVar, s52Var);
                }
                return ieiVar;
            case 26:
                lze lzeVar2 = (lze) obj;
                lzeVar2.getClass();
                ((e62) obj3).b.g0(lzeVar2, (List) obj2);
                return ieiVar;
            case 27:
                g62 g62Var = (g62) obj2;
                lze lzeVar3 = (lze) obj;
                lzeVar3.getClass();
                nyj nyjVar2 = ((h62) obj3).b;
                nyjVar2.getClass();
                try {
                    ((xn5) nyjVar2.F).m0(lzeVar3, g62Var);
                    break;
                } catch (SQLException e2) {
                    nyj.C(e2);
                    ((sf5) nyjVar2.G).I(lzeVar3, g62Var);
                }
                return ieiVar;
            case 28:
                mub mubVar = (mub) obj3;
                gri griVar = (gri) obj2;
                ed2 ed2Var = (ed2) obj;
                mubVar.a = null;
                mubVar.b = null;
                mubVar.c = new LinkedHashMap();
                mubVar.d = 1.0d;
                if (ed2Var == null) {
                    return wd2.a;
                }
                vc2 vc2Var = (vc2) griVar.a;
                vc2Var.getClass();
                mubVar.d = ((Number) vc2Var.d.invoke(ed2Var)).doubleValue();
                ive iveVar = vc2Var.n;
                iveVar.getClass();
                iveVar.F = mubVar;
                vc2Var.c(ed2Var, iveVar);
                return new nub(mubVar);
            default:
                m7f m7fVar3 = (m7f) obj2;
                ((swe) obj).getClass();
                kce kceVar3 = jce.a;
                return new ah2((Set) obj3, (vd3) m7fVar3.a(kceVar3.b(vd3.class), null, null), (h86) m7fVar3.a(kceVar3.b(h86.class), null, null));
        }
    }
}
