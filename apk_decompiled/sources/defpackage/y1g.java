package defpackage;

import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.chat.share.SharedChatModalBottomSheetDestination;
import com.anthropic.claude.chat.share.k;
import com.anthropic.claude.conway.protocol.StreamMessage;
import com.anthropic.claude.sessions.types.SharedSessionData;
import com.anthropic.claude.sessions.types.StdinMessage;
import com.anthropic.claude.tool.model.SourceImage;
import java.util.ArrayList;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y1g implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ y1g(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return SharedChatModalBottomSheetDestination.ViewCollapsedTools._childSerializers$_anonymous_();
            case 1:
                return SharedChatModalBottomSheetDestination.ViewCombinedSources._childSerializers$_anonymous_();
            case 2:
                return SharedChatModalBottomSheetDestination.ViewCombinedSources._childSerializers$_anonymous_$0();
            case 3:
                return SharedChatModalBottomSheetDestination.ViewSources._childSerializers$_anonymous_();
            case 4:
                return mpk.P(Boolean.FALSE);
            case 5:
                k.c("onOpenSystemAppSettings");
                return ieiVar;
            case 6:
                return x44.W(SharedChatModalBottomSheetDestination.Closed.INSTANCE);
            case 7:
                k.c("onPartialResponseErrorClick");
                return ieiVar;
            case 8:
                k.c("onCompletionNotificationUpsellShown");
                return ieiVar;
            case 9:
                return SharedSessionData._childSerializers$_anonymous_();
            case 10:
                oy8 oy8Var = new oy8("SlackLogo", 24.0f, 24.0f, 122.8f, 122.8f, 0L, 0, false, 224);
                eeg eegVar = new eeg(d4c.o(4292877914L));
                int i2 = asi.a;
                dn0 dn0Var = new dn0(1);
                dn0Var.r(25.8f, 77.6f);
                dn0Var.k(MTTypesetterKt.kLineSkipLimitMultiplier, 7.1f, -5.8f, 12.9f, -12.9f, 12.9f);
                ArrayList arrayList = dn0Var.E;
                arrayList.add(new bvc(MTTypesetterKt.kLineSkipLimitMultiplier, 84.7f, MTTypesetterKt.kLineSkipLimitMultiplier, 77.6f));
                dn0Var.s(5.8f, -12.9f, 12.9f, -12.9f);
                dn0Var.o(12.9f);
                dn0Var.u(12.9f);
                dn0Var.j();
                dn0Var.r(32.3f, 77.6f);
                dn0Var.k(MTTypesetterKt.kLineSkipLimitMultiplier, -7.1f, 5.8f, -12.9f, 12.9f, -12.9f);
                dn0Var.s(12.9f, 5.8f, 12.9f, 12.9f);
                dn0Var.u(32.3f);
                dn0Var.k(MTTypesetterKt.kLineSkipLimitMultiplier, 7.1f, -5.8f, 12.9f, -12.9f, 12.9f);
                dn0Var.s(-12.9f, -5.8f, -12.9f, -12.9f);
                dn0Var.t(77.6f);
                dn0Var.j();
                oy8Var.c(1.0f, 1.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 0, 0, 0, eegVar, null, "", arrayList);
                eeg eegVar2 = new eeg(d4c.o(4281779696L));
                dn0 dn0Var2 = new dn0(1);
                dn0Var2.r(45.2f, 25.8f);
                dn0Var2.k(-7.1f, MTTypesetterKt.kLineSkipLimitMultiplier, -12.9f, -5.8f, -12.9f, -12.9f);
                ArrayList arrayList2 = dn0Var2.E;
                arrayList2.add(new bvc(38.1f, MTTypesetterKt.kLineSkipLimitMultiplier, 45.2f, MTTypesetterKt.kLineSkipLimitMultiplier));
                dn0Var2.s(12.9f, 5.8f, 12.9f, 12.9f);
                dn0Var2.u(12.9f);
                arrayList2.add(new xuc(45.2f));
                dn0Var2.j();
                dn0Var2.r(45.2f, 32.3f);
                dn0Var2.k(7.1f, MTTypesetterKt.kLineSkipLimitMultiplier, 12.9f, 5.8f, 12.9f, 12.9f);
                dn0Var2.s(-5.8f, 12.9f, -12.9f, 12.9f);
                arrayList2.add(new xuc(12.9f));
                arrayList2.add(new wuc(5.8f, 58.1f, MTTypesetterKt.kLineSkipLimitMultiplier, 52.3f, MTTypesetterKt.kLineSkipLimitMultiplier, 45.2f));
                dn0Var2.s(5.8f, -12.9f, 12.9f, -12.9f);
                dn0Var2.o(32.3f);
                dn0Var2.j();
                oy8Var.c(1.0f, 1.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 0, 0, 0, eegVar2, null, "", arrayList2);
                eeg eegVar3 = new eeg(d4c.o(4281251453L));
                dn0 dn0Var3 = new dn0(1);
                dn0Var3.r(97.0f, 45.2f);
                dn0Var3.k(MTTypesetterKt.kLineSkipLimitMultiplier, -7.1f, 5.8f, -12.9f, 12.9f, -12.9f);
                dn0Var3.s(12.9f, 5.8f, 12.9f, 12.9f);
                dn0Var3.s(-5.8f, 12.9f, -12.9f, 12.9f);
                ArrayList arrayList3 = dn0Var3.E;
                arrayList3.add(new xuc(97.0f));
                dn0Var3.t(45.2f);
                dn0Var3.j();
                dn0Var3.r(90.5f, 45.2f);
                dn0Var3.k(MTTypesetterKt.kLineSkipLimitMultiplier, 7.1f, -5.8f, 12.9f, -12.9f, 12.9f);
                dn0Var3.s(-12.9f, -5.8f, -12.9f, -12.9f);
                dn0Var3.t(12.9f);
                arrayList3.add(new wuc(64.7f, 5.8f, 70.5f, MTTypesetterKt.kLineSkipLimitMultiplier, 77.6f, MTTypesetterKt.kLineSkipLimitMultiplier));
                dn0Var3.s(12.9f, 5.8f, 12.9f, 12.9f);
                dn0Var3.u(32.3f);
                dn0Var3.j();
                oy8Var.c(1.0f, 1.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 0, 0, 0, eegVar3, null, "", arrayList3);
                eeg eegVar4 = new eeg(d4c.o(4293702190L));
                dn0 dn0Var4 = new dn0(1);
                dn0Var4.r(77.6f, 97.0f);
                dn0Var4.k(7.1f, MTTypesetterKt.kLineSkipLimitMultiplier, 12.9f, 5.8f, 12.9f, 12.9f);
                dn0Var4.s(-5.8f, 12.9f, -12.9f, 12.9f);
                dn0Var4.s(-12.9f, -5.8f, -12.9f, -12.9f);
                dn0Var4.t(97.0f);
                dn0Var4.o(12.9f);
                dn0Var4.j();
                dn0Var4.r(77.6f, 90.5f);
                dn0Var4.k(-7.1f, MTTypesetterKt.kLineSkipLimitMultiplier, -12.9f, -5.8f, -12.9f, -12.9f);
                dn0Var4.s(5.8f, -12.9f, 12.9f, -12.9f);
                dn0Var4.o(32.3f);
                dn0Var4.k(7.1f, MTTypesetterKt.kLineSkipLimitMultiplier, 12.9f, 5.8f, 12.9f, 12.9f);
                dn0Var4.s(-5.8f, 12.9f, -12.9f, 12.9f);
                ArrayList arrayList4 = dn0Var4.E;
                arrayList4.add(new xuc(77.6f));
                dn0Var4.j();
                oy8Var.c(1.0f, 1.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 0, 0, 0, eegVar4, null, "", arrayList4);
                return oy8Var.e();
            case 11:
                return SourceImage.GoogleDoc._init_$_anonymous_();
            case 12:
                mlg mlgVar = (mlg) w44.N0(nlg.a);
                return mpk.P(mlgVar != null ? mlgVar.a : "custom");
            case 13:
                return mpk.P("");
            case 14:
                return new l8f("M3 35.5C6.16667 33.5 13.1 28.2 15.5 23C14.5 27.6667 13.2 36.8 16 36C18.8 35.2 25.8333 26.6667 29 22.5C27.1667 27.8333 24.4 38.1 28 36.5C32.5 34.5 41 25.5 43.5 22.5C44 22.5 38.5 36 41.5 36.5C44.5 37 49 34 52.5 31");
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new l8f("M4 24.3635C6.5 21.7622 9.05892 19.5455 12 20.0803C16.4 20.8803 19 22.8776 19 25.4789C19 28.9789 17.9 35.0803 11.5 35.0803C7.9 35.0803 9.16667 31.0803 10.5 29.0803C11.8333 27.0803 15.3124 25.1741 19.5 23.0803C22.5 21.5803 24 20.5803 27.5 20.5803C30 21.0803 32.2 21.9803 33 23.5803C33.6667 25.9136 33.8 31.2803 29 34.0803C24.2 36.8803 23.3333 34.9136 23.5 33.5803C23.5 32.7469 24.4 30.6803 26 29.0803C27.8333 26.9136 32.6 22.2803 37 21.0803C41.4 19.8803 45.1667 21.2469 46.5 22.0803C47.8333 23.4136 49.7 27.0803 46.5 31.0803C43.3 35.0803 40.8333 35.4136 40 35.0803C38.5 34.0803 37.7909 31.2893 40 29.0803C43.5 25.5803 45.5 22.9789 52 21.0803");
            case 16:
                u0h u0hVar = dng.a;
                return Float.valueOf(MTTypesetterKt.kLineSkipLimitMultiplier);
            case g.MAX_FIELD_NUMBER /* 17 */:
                u0h u0hVar2 = dng.a;
                return Float.valueOf(1.0f);
            case g.AVG_FIELD_NUMBER /* 18 */:
                return StdinMessage.SdkUserMessage._childSerializers$_anonymous_();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return StreamMessage.AgentsUpdated._childSerializers$_anonymous_();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return StreamMessage.AgentsUpdated._childSerializers$_anonymous_$0();
            case 21:
                return StreamMessage.ClientsChanged._childSerializers$_anonymous_();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return StreamMessage.ForksSnapshot._childSerializers$_anonymous_();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                umg umgVar = oqg.a;
                return null;
            case 24:
                return new nrg("string:agent_chat_intro_banner_dismiss", mp0.Z0(new spe[]{new spe(gid.r("de"), "composeResources/claude.agentchat.generated.resources/values-de/strings.commonMain.cvr", 1695L, 55L), new spe(mp0.Z0(new szd[]{new at9("es"), new mde("ES")}), "composeResources/claude.agentchat.generated.resources/values-es-rES/strings.commonMain.cvr", 1607L, 51L), new spe(gid.r("es"), "composeResources/claude.agentchat.generated.resources/values-es/strings.commonMain.cvr", 1623L, 51L), new spe(gid.r("fr"), "composeResources/claude.agentchat.generated.resources/values-fr/strings.commonMain.cvr", 1771L, 51L), new spe(gid.r("hi"), "composeResources/claude.agentchat.generated.resources/values-hi/strings.commonMain.cvr", 2635L, 79L), new spe(gid.r("in"), "composeResources/claude.agentchat.generated.resources/values-in/strings.commonMain.cvr", 1495L, 47L), new spe(gid.r("it"), "composeResources/claude.agentchat.generated.resources/values-it/strings.commonMain.cvr", 1655L, 47L), new spe(gid.r("ja"), "composeResources/claude.agentchat.generated.resources/values-ja/strings.commonMain.cvr", 2031L, 51L), new spe(gid.r("ko"), "composeResources/claude.agentchat.generated.resources/values-ko/strings.commonMain.cvr", 1751L, 47L), new spe(gid.r("pt"), "composeResources/claude.agentchat.generated.resources/values-pt/strings.commonMain.cvr", 1583L, 51L), new spe(um6.E, "composeResources/claude.agentchat.generated.resources/values/strings.commonMain.cvr", 1435L, 51L)}));
            case BuildConfig.VERSION_CODE /* 25 */:
                return new nrg("string:agent_chat_intro_banner_example_1", mp0.Z0(new spe[]{new spe(gid.r("de"), "composeResources/claude.agentchat.generated.resources/values-de/strings.commonMain.cvr", 1751L, 137L), new spe(mp0.Z0(new szd[]{new at9("es"), new mde("ES")}), "composeResources/claude.agentchat.generated.resources/values-es-rES/strings.commonMain.cvr", 1659L, 137L), new spe(gid.r("es"), "composeResources/claude.agentchat.generated.resources/values-es/strings.commonMain.cvr", 1675L, 141L), new spe(gid.r("fr"), "composeResources/claude.agentchat.generated.resources/values-fr/strings.commonMain.cvr", 1823L, 157L), new spe(gid.r("hi"), "composeResources/claude.agentchat.generated.resources/values-hi/strings.commonMain.cvr", 2715L, 225L), new spe(gid.r("in"), "composeResources/claude.agentchat.generated.resources/values-in/strings.commonMain.cvr", 1543L, 117L), new spe(gid.r("it"), "composeResources/claude.agentchat.generated.resources/values-it/strings.commonMain.cvr", 1703L, 129L), new spe(gid.r("ja"), "composeResources/claude.agentchat.generated.resources/values-ja/strings.commonMain.cvr", 2083L, 149L), new spe(gid.r("ko"), "composeResources/claude.agentchat.generated.resources/values-ko/strings.commonMain.cvr", 1799L, 137L), new spe(gid.r("pt"), "composeResources/claude.agentchat.generated.resources/values-pt/strings.commonMain.cvr", 1635L, 145L), new spe(um6.E, "composeResources/claude.agentchat.generated.resources/values/strings.commonMain.cvr", 1487L, 121L)}));
            case 26:
                return new nrg("string:agent_chat_activity_offline_body", mp0.Z0(new spe[]{new spe(gid.r("de"), "composeResources/claude.agentchat.generated.resources/values-de/strings.commonMain.cvr", 69L, 124L), new spe(mp0.Z0(new szd[]{new at9("es"), new mde("ES")}), "composeResources/claude.agentchat.generated.resources/values-es-rES/strings.commonMain.cvr", 69L, 84L), new spe(gid.r("es"), "composeResources/claude.agentchat.generated.resources/values-es/strings.commonMain.cvr", 69L, 84L), new spe(gid.r("fr"), "composeResources/claude.agentchat.generated.resources/values-fr/strings.commonMain.cvr", 69L, 100L), new spe(gid.r("hi"), "composeResources/claude.agentchat.generated.resources/values-hi/strings.commonMain.cvr", 113L, 168L), new spe(gid.r("in"), "composeResources/claude.agentchat.generated.resources/values-in/strings.commonMain.cvr", 69L, 92L), new spe(gid.r("it"), "composeResources/claude.agentchat.generated.resources/values-it/strings.commonMain.cvr", 73L, 88L), new spe(gid.r("ja"), "composeResources/claude.agentchat.generated.resources/values-ja/strings.commonMain.cvr", 65L, 84L), new spe(gid.r("ko"), "composeResources/claude.agentchat.generated.resources/values-ko/strings.commonMain.cvr", 69L, 88L), new spe(gid.r("pt"), "composeResources/claude.agentchat.generated.resources/values-pt/strings.commonMain.cvr", 69L, 84L), new spe(um6.E, "composeResources/claude.agentchat.generated.resources/values/strings.commonMain.cvr", 69L, 80L)}));
            case 27:
                return new nrg("string:agent_chat_intro_banner_example_2", mp0.Z0(new spe[]{new spe(gid.r("de"), "composeResources/claude.agentchat.generated.resources/values-de/strings.commonMain.cvr", 1889L, 173L), new spe(mp0.Z0(new szd[]{new at9("es"), new mde("ES")}), "composeResources/claude.agentchat.generated.resources/values-es-rES/strings.commonMain.cvr", 1797L, 149L), new spe(gid.r("es"), "composeResources/claude.agentchat.generated.resources/values-es/strings.commonMain.cvr", 1817L, 157L), new spe(gid.r("fr"), "composeResources/claude.agentchat.generated.resources/values-fr/strings.commonMain.cvr", 1981L, 189L), new spe(gid.r("hi"), "composeResources/claude.agentchat.generated.resources/values-hi/strings.commonMain.cvr", 2941L, 289L), new spe(gid.r("in"), "composeResources/claude.agentchat.generated.resources/values-in/strings.commonMain.cvr", 1661L, 141L), new spe(gid.r("it"), "composeResources/claude.agentchat.generated.resources/values-it/strings.commonMain.cvr", 1833L, 161L), new spe(gid.r("ja"), "composeResources/claude.agentchat.generated.resources/values-ja/strings.commonMain.cvr", 2233L, 201L), new spe(gid.r("ko"), "composeResources/claude.agentchat.generated.resources/values-ko/strings.commonMain.cvr", 1937L, 189L), new spe(gid.r("pt"), "composeResources/claude.agentchat.generated.resources/values-pt/strings.commonMain.cvr", 1781L, 153L), new spe(um6.E, "composeResources/claude.agentchat.generated.resources/values/strings.commonMain.cvr", 1609L, 141L)}));
            case 28:
                return new nrg("string:agent_chat_intro_banner_example_3", mp0.Z0(new spe[]{new spe(gid.r("de"), "composeResources/claude.agentchat.generated.resources/values-de/strings.commonMain.cvr", 2063L, 181L), new spe(mp0.Z0(new szd[]{new at9("es"), new mde("ES")}), "composeResources/claude.agentchat.generated.resources/values-es-rES/strings.commonMain.cvr", 1947L, 181L), new spe(gid.r("es"), "composeResources/claude.agentchat.generated.resources/values-es/strings.commonMain.cvr", 1975L, 177L), new spe(gid.r("fr"), "composeResources/claude.agentchat.generated.resources/values-fr/strings.commonMain.cvr", 2171L, 177L), new spe(gid.r("hi"), "composeResources/claude.agentchat.generated.resources/values-hi/strings.commonMain.cvr", 3231L, 333L), new spe(gid.r("in"), "composeResources/claude.agentchat.generated.resources/values-in/strings.commonMain.cvr", 1803L, 157L), new spe(gid.r("it"), "composeResources/claude.agentchat.generated.resources/values-it/strings.commonMain.cvr", 1995L, 181L), new spe(gid.r("ja"), "composeResources/claude.agentchat.generated.resources/values-ja/strings.commonMain.cvr", 2435L, 205L), new spe(gid.r("ko"), "composeResources/claude.agentchat.generated.resources/values-ko/strings.commonMain.cvr", 2127L, 173L), new spe(gid.r("pt"), "composeResources/claude.agentchat.generated.resources/values-pt/strings.commonMain.cvr", 1935L, 201L), new spe(um6.E, "composeResources/claude.agentchat.generated.resources/values/strings.commonMain.cvr", 1751L, 145L)}));
            default:
                return new nrg("string:agent_chat_intro_banner_title", mp0.Z0(new spe[]{new spe(gid.r("de"), "composeResources/claude.agentchat.generated.resources/values-de/strings.commonMain.cvr", 2245L, 89L), new spe(mp0.Z0(new szd[]{new at9("es"), new mde("ES")}), "composeResources/claude.agentchat.generated.resources/values-es-rES/strings.commonMain.cvr", 2129L, 85L), new spe(gid.r("es"), "composeResources/claude.agentchat.generated.resources/values-es/strings.commonMain.cvr", 2153L, 85L), new spe(gid.r("fr"), "composeResources/claude.agentchat.generated.resources/values-fr/strings.commonMain.cvr", 2349L, 93L), new spe(gid.r("hi"), "composeResources/claude.agentchat.generated.resources/values-hi/strings.commonMain.cvr", 3565L, 145L), new spe(gid.r("in"), "composeResources/claude.agentchat.generated.resources/values-in/strings.commonMain.cvr", 1961L, 81L), new spe(gid.r("it"), "composeResources/claude.agentchat.generated.resources/values-it/strings.commonMain.cvr", 2177L, 81L), new spe(gid.r("ja"), "composeResources/claude.agentchat.generated.resources/values-ja/strings.commonMain.cvr", 2641L, 113L), new spe(gid.r("ko"), "composeResources/claude.agentchat.generated.resources/values-ko/strings.commonMain.cvr", 2301L, 97L), new spe(gid.r("pt"), "composeResources/claude.agentchat.generated.resources/values-pt/strings.commonMain.cvr", 2137L, 93L), new spe(um6.E, "composeResources/claude.agentchat.generated.resources/values/strings.commonMain.cvr", 1897L, 81L)}));
        }
    }
}
