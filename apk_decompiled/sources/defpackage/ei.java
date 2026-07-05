package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.ChatEvents$NewChatButtonPressed;
import com.anthropic.claude.analytics.events.ChatEvents$NewChatButtonPressedSource;
import com.anthropic.claude.analytics.events.CodeEvents$CodePromptSuggestionOutcomeType;
import com.anthropic.claude.analytics.events.CodeEvents$SlashCommandInvoked;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceSettingKind;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.api.chat.ChatFeedbackType;
import com.anthropic.claude.api.chat.CreateChatRequest;
import com.anthropic.claude.artifact.model.ArtifactMetadata;
import com.anthropic.claude.artifact.sheet.ArtifactShareParams;
import com.anthropic.claude.bell.BellOverlayDestination;
import com.anthropic.claude.bell.PlaybackPace;
import com.anthropic.claude.bell.VoiceSessionSummary;
import com.anthropic.claude.bell.api.BellApiClientMessage;
import com.anthropic.claude.bell.api.VoiceSelection;
import com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination;
import com.anthropic.claude.code.remote.bottomsheet.CodeRemoteBottomSheetDestination;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.models.organization.configtypes.SttSupportedLanguage;
import com.anthropic.claude.sessions.types.EnvironmentResource;
import com.anthropic.claude.sessions.types.SessionResource;
import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.ProjectId;
import com.anthropic.claude.types.strings.SessionId;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedHashMap;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ei implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ ei(v4g v4gVar, kl7 kl7Var, kl7 kl7Var2, kl7 kl7Var3) {
        this.E = 12;
        this.F = v4gVar;
        this.G = kl7Var;
        this.H = kl7Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v0, types: [tp4] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v25, types: [sz7] */
    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        int i2 = 6;
        int i3 = 0;
        boolean zL1 = true;
        zL1 = true;
        int i4 = 3;
        ?? M1057unboximpl = 0;
        String str = null;
        M1057unboximpl = 0;
        iei ieiVar = iei.a;
        Object obj = this.H;
        Object obj2 = this.G;
        Object obj3 = this.F;
        switch (i) {
            case 0:
                vb7.B(((ai) obj3).b.a, "age_assurances_completed", true);
                ((nwb) obj).setValue(Boolean.TRUE);
                ((r4g) obj2).a();
                return ieiVar;
            case 1:
                String str2 = (String) obj2;
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", (String) obj);
                intent.putExtra("android.intent.extra.SUBJECT", str2);
                ((Context) obj3).startActivity(Intent.createChooser(intent, str2).addFlags(268435456));
                return ieiVar;
            case 2:
                Boolean bool = Boolean.FALSE;
                ((nwb) obj).setValue(bool);
                ((nwb) obj2).setValue(bool);
                ((vm) ((an) obj3).b).t.c();
                return ieiVar;
            case 3:
                ((bz7) obj3).invoke(SessionId.m1114boximpl(((SessionResource) obj2).m875getIdOcx55TE()));
                ((nwb) obj).setValue(Boolean.FALSE);
                return ieiVar;
            case 4:
                ((qi3) obj3).e(new ChatEvents$NewChatButtonPressed(((lu) obj2).m(), ChatEvents$NewChatButtonPressedSource.CHAT_LIST, (String) null, 4, (mq5) null), ChatEvents$NewChatButtonPressed.Companion.serializer());
                ((zy7) obj).a();
                return ieiVar;
            case 5:
                xp0 xp0Var = (xp0) obj3;
                lq0 lq0Var = (lq0) obj2;
                bz7 bz7Var = (bz7) obj;
                tp0 tp0VarO = xp0Var.O();
                if (tp0VarO != null) {
                    ArtifactMetadata artifactMetadata = tp0VarO.b;
                    kq0 kq0Var = new kq0(xp0Var.c, tp0VarO.a.g(), artifactMetadata);
                    lq0Var.getClass();
                    lq0Var.a.S(kq0Var);
                    String value = artifactMetadata.getUuid().getValue();
                    tp0 tp0VarO2 = xp0Var.O();
                    if (tp0VarO2 != null) {
                        MessageId messageId = (MessageId) ((LinkedHashMap) ((t53) xp0Var.d).z0().b()).get(tp0VarO2.a().getUuid());
                        String strM1057unboximpl = messageId != null ? messageId.m1057unboximpl() : null;
                        MessageId messageIdM1051boximpl = strM1057unboximpl != null ? MessageId.m1051boximpl(strM1057unboximpl) : null;
                        if (messageIdM1051boximpl != null) {
                            M1057unboximpl = messageIdM1051boximpl.m1057unboximpl();
                        }
                    }
                    if (M1057unboximpl == 0) {
                        MessageId.Companion.getClass();
                        M1057unboximpl = MessageId.EMPTY;
                    }
                    bz7Var.invoke(new ArtifactShareParams(value, M1057unboximpl, xp0Var.j.h(), xp0Var.g, null));
                } else {
                    ebh.A("Failed to share artifact, artifact is null", null, false, 3);
                }
                return ieiVar;
            case 6:
                gb9.D((l45) obj3, null, null, new m0((xq0) obj2, (t4f) obj, M1057unboximpl, 18), 3);
                return ieiVar;
            case 7:
                l2i l2iVar = (l2i) obj3;
                l45 l45Var = (l45) obj2;
                nwb nwbVar = (nwb) obj;
                if (l2iVar.b()) {
                    gb9.D(l45Var, null, null, new kk0(l2iVar, M1057unboximpl, i4), 3);
                    nwbVar.setValue(Boolean.FALSE);
                }
                return ieiVar;
            case 8:
                Context context = ((View) obj3).getContext();
                context.getClass();
                oq5.K(context, (wxc) obj2);
                ((um1) obj).g(true);
                return ieiVar;
            case 9:
                mj1 mj1Var = (mj1) obj3;
                rwe rweVar = (rwe) obj2;
                fn1 fn1Var = (fn1) ((wlg) obj).getValue();
                if (fn1Var != null) {
                    xn1 xn1Var = ((tn1) fn1Var).p;
                    zy1 zy1Var = xn1Var.h;
                    z4j z4jVar = VoiceSelection.Companion;
                    um1 um1Var = xn1Var.a;
                    String strB = um1Var.b();
                    z4jVar.getClass();
                    String strA = z4j.a(strB);
                    k6d k6dVar = PlaybackPace.Companion;
                    String strA2 = um1Var.a();
                    k6dVar.getClass();
                    float speedFactor = k6d.a(strA2).getSpeedFactor();
                    String strF = xn1Var.b.f();
                    xn1Var.c.b(new BellApiClientMessage.VoiceSelect(new BellApiClientMessage.VoiceSelect.Data(strA, Float.valueOf(speedFactor), strF, null)));
                    if (!VoiceSelection.m576equalsimpl0(strA, xn1Var.d)) {
                        zy1Var.r(new wn1(VoiceEvents$VoiceSettingKind.VOICE, xn1Var.d, strA));
                        xn1Var.d = strA;
                    }
                    if (!x44.r(strF, xn1Var.f)) {
                        VoiceEvents$VoiceSettingKind voiceEvents$VoiceSettingKind = VoiceEvents$VoiceSettingKind.LANGUAGE;
                        String str3 = xn1Var.f;
                        if (str3 == null) {
                            str3 = "";
                        }
                        zy1Var.r(new wn1(voiceEvents$VoiceSettingKind, str3, strF != null ? strF : ""));
                        xn1Var.f = strF;
                    }
                }
                gb9.D(mj1Var.a, null, null, new jj1(mj1Var, M1057unboximpl, zL1 ? 1 : 0), 3);
                mj1Var.Y();
                rweVar.E.m(new fv(8, new BellOverlayDestination[]{BellOverlayDestination.Closed.INSTANCE}), new a2g(16));
                return ieiVar;
            case 10:
                mj1 mj1Var2 = (mj1) obj3;
                rwe rweVar2 = (rwe) obj;
                String str4 = ((n4j) obj2).b;
                lsc lscVar = mj1Var2.P;
                p4j p4jVar = (p4j) lscVar.getValue();
                n4j n4jVar = p4jVar instanceof n4j ? (n4j) p4jVar : null;
                if (n4jVar != null) {
                    mj1Var2.Z(n4jVar, "accepted");
                }
                fk0 fk0Var = mj1Var2.o;
                lsc lscVar2 = fk0Var.p;
                Boolean bool2 = Boolean.TRUE;
                lscVar2.setValue(bool2);
                vb7.B(fk0Var.a, "voice_added_support_notice_shown", true);
                SttSupportedLanguage sttSupportedLanguageB = mj1Var2.n.b(str4);
                if (sttSupportedLanguageB != null) {
                    mj1Var2.B(sttSupportedLanguageB);
                    gb9.D(mj1Var2.a, null, null, new kk0(mj1Var2, M1057unboximpl, 4), 3);
                }
                lscVar.setValue(null);
                mj1Var2.R.setValue(bool2);
                rweVar2.E.m(new fv(6, new BellOverlayDestination[]{BellOverlayDestination.Settings.INSTANCE}), new a2g(14));
                return ieiVar;
            case 11:
                l45 l45Var2 = (l45) obj2;
                v4g v4gVar = (v4g) obj;
                if (((Boolean) ((v4g) obj3).c.invoke(b5g.F)).booleanValue()) {
                    gb9.D(l45Var2, null, null, new my0(v4gVar, M1057unboximpl, i2), 3);
                }
                return Boolean.TRUE;
            case 12:
                v4g v4gVar2 = (v4g) obj3;
                v4gVar2.e = (kl7) obj2;
                v4gVar2.f = (kl7) obj;
                return ieiVar;
            case 13:
                String str5 = (String) obj3;
                Date date = (Date) obj2;
                pz7 pz7Var = (pz7) obj;
                if (str5 != null && date != null) {
                    pz7Var.invoke(str5, date);
                }
                return ieiVar;
            case 14:
                zy7 zy7Var = (zy7) obj3;
                ?? r9 = (sz7) obj2;
                ds2 ds2Var = (ds2) ((nwb) obj).getValue();
                if (ds2Var == null) {
                    zy7Var.a();
                } else {
                    String str6 = ds2Var.a;
                    r9.i(str6 != null ? MessageId.m1051boximpl(str6) : null, Integer.valueOf(ds2Var.b), ds2Var.c, ds2Var.d);
                }
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((bz7) obj3).invoke((ChatFeedbackType) obj2);
                ((nwb) obj).setValue(Boolean.FALSE);
                return ieiVar;
            case 16:
                zy7 zy7Var2 = (zy7) obj2;
                bz7 bz7Var2 = (bz7) obj;
                String strM208getProject_uuidvfJkQ = ((ChatConversationWithProjectReference) obj3).m208getProject_uuidvfJkQ();
                if (strM208getProject_uuidvfJkQ != null) {
                    bz7Var2.invoke(ProjectId.m1079boximpl(strM208getProject_uuidvfJkQ));
                }
                zy7Var2.a();
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((bz7) obj3).invoke((by2) obj2);
                ((nwb) obj).setValue(Boolean.FALSE);
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                hi6 hi6Var = (hi6) obj3;
                t53 t53Var = (t53) obj2;
                CreateChatRequest createChatRequest = (CreateChatRequest) obj;
                if (hi6Var != null) {
                    hi6Var.F(ane.a);
                }
                gb9.D(t53Var.a, null, null, new nn1(t53Var, createChatRequest, (tp4) M1057unboximpl, 24), 3);
                return ieiVar;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                dkk.j((qi3) obj3, (VoiceSessionSummary) obj2, true, null, null);
                ((f4j) obj).a.setValue(null);
                return ieiVar;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ((f4j) obj3).a.setValue(null);
                ((rwe) obj2).E.m(new cv(15, new ChatScreenModalBottomSheetDestination.VoiceFeedback((VoiceSessionSummary) obj)), new p23(29));
                return ieiVar;
            case 21:
                l45 l45Var3 = (l45) obj3;
                uma umaVar = (uma) obj;
                bna bnaVar = (bna) ((ina) obj2).getValue();
                if (bnaVar != null) {
                    gb9.D(l45Var3, null, null, new ed3(umaVar, bnaVar, M1057unboximpl, i4), 3);
                }
                return ieiVar;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                EnvironmentResource environmentResource = (EnvironmentResource) obj3;
                bz7 bz7Var3 = (bz7) obj2;
                t4g t4gVar = (t4g) obj;
                if (environmentResource != null) {
                    bz7Var3.invoke(environmentResource);
                }
                t4gVar.a();
                return ieiVar;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((t4g) obj3).d(new CodeRemoteBottomSheetDestination.ChannelMessage((String) obj2, (String) obj));
                return ieiVar;
            case 24:
                gb9.D((l45) obj3, null, null, new b14((o0h) obj, M1057unboximpl, i3), 3);
                ((zy7) obj2).a();
                return ieiVar;
            case BuildConfig.VERSION_CODE /* 25 */:
                ((nwb) obj).setValue(Boolean.TRUE);
                oq5.K((Context) obj3, (wxc) obj2);
                return ieiVar;
            case 26:
                yih yihVar = (yih) obj2;
                bt7 bt7Var = (bt7) obj;
                c4c c4cVar = ((i) obj3).B0;
                x3c x3cVarB = c4cVar.b();
                if (x3cVarB != null) {
                    str = x3cVarB.b;
                    c4cVar.a(CodeEvents$CodePromptSuggestionOutcomeType.ACCEPTED);
                    c4cVar.i++;
                    c4cVar.h = new y3c(str, ((Number) c4cVar.e.a()).longValue(), c4cVar.i);
                }
                if (str != null) {
                    cpk.u(yihVar, str);
                    bt7.a(bt7Var);
                }
                return ieiVar;
            case 27:
                gb9.D((l45) obj3, null, null, new b34((ybg) obj2, (Context) obj, M1057unboximpl, i3), 3);
                return ieiVar;
            case 28:
                yih yihVar2 = (yih) obj3;
                i iVar = (i) obj2;
                lsc lscVar3 = iVar.k2;
                nwb nwbVar2 = (nwb) obj;
                String string = yihVar2.d().G.toString();
                if (!iVar.s0()) {
                    boolean zIsEmpty = iVar.W1.isEmpty();
                    ?? r10 = iVar.A0().size() > 0;
                    if (!bsg.I0(string) || !zIsEmpty || r10 != false) {
                        if (iVar.g0 && x44.r(bsg.k1(string).toString(), "/radio") && zIsEmpty && r10 != true && !iVar.K0()) {
                            nwbVar2.setValue(Boolean.TRUE);
                            qi3 qi3Var = iVar.l;
                            String str7 = iVar.m;
                            String strE0 = iVar.E0();
                            qi3Var.e(new CodeEvents$SlashCommandInvoked(str7, strE0 != null ? strE0 : null, "radio"), CodeEvents$SlashCommandInvoked.Companion.serializer());
                            dfh dfhVarG = yihVar2.g();
                            try {
                                dfhVarG.c(0, dfhVarG.F.length(), "");
                                yihVar2.b(dfhVarG);
                            } finally {
                            }
                        } else {
                            if (!iVar.l0 || (!(iVar.U0() || ((Boolean) iVar.m2.getValue()).booleanValue()) || iVar.K0() || bsg.I0(string) || !zIsEmpty || r10 == true)) {
                                zL1 = iVar.l1(string, true);
                            } else if (!bsg.I0(string)) {
                                String str8 = (String) lscVar3.getValue();
                                if (str8 != null) {
                                    string = ij0.C(str8, "\n\n", string);
                                }
                                lscVar3.setValue(string);
                                iVar.l2 = true;
                            }
                            if (zL1) {
                                dfh dfhVarG2 = yihVar2.g();
                                try {
                                    dfhVarG2.c(0, dfhVarG2.F.length(), "");
                                    yihVar2.b(dfhVarG2);
                                } finally {
                                }
                            }
                        }
                    }
                }
                return ieiVar;
            default:
                bz7 bz7Var4 = (bz7) obj2;
                nwb nwbVar3 = (nwb) obj;
                Long lB = ((dn5) obj3).b();
                if (lB != null) {
                    LocalDate localDate = Instant.ofEpochMilli(lB.longValue()).atZone(vjj.a).toLocalDate();
                    localDate.getClass();
                    bz7Var4.invoke(localDate);
                }
                nwbVar3.setValue(Boolean.FALSE);
                return ieiVar;
        }
    }

    public /* synthetic */ ei(an anVar, nwb nwbVar, nwb nwbVar2) {
        this.E = 2;
        this.F = anVar;
        this.H = nwbVar;
        this.G = nwbVar2;
    }

    public /* synthetic */ ei(Object obj, Object obj2, Object obj3, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
    }
}
