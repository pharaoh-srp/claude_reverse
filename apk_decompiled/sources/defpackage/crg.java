package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.tasks.TaskEventsResponse;
import com.anthropic.claude.api.tasks.TaskResponse;
import com.anthropic.claude.bell.tts.TTSApiMessage;
import com.anthropic.claude.models.organization.configtypes.StudentConfig;
import com.anthropic.claude.models.organization.configtypes.SupportedToolsConfig;
import com.anthropic.claude.sessions.types.SummaryStatusCategory;
import com.anthropic.claude.tool.model.TaskListOutput;
import com.anthropic.claude.tool.model.TaskListOutputTasksItem;
import com.anthropic.claude.tool.model.TaskListOutputTasksItemStatus;
import com.anthropic.claude.tool.model.TaskListOutputTasksItemStepsItemStatus;
import com.anthropic.claude.tool.model.TaskProposeOutputStatus;
import com.anthropic.claude.tool.model.TaskProposeOutputStepsItemStatus;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class crg implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ crg(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return new nrg("string:dispatch_upsell_title", mp0.Z0(new spe[]{new spe(gid.r("de"), "composeResources/claude.agentchat.generated.resources/values-de/strings.commonMain.cvr", 6509L, 105L), new spe(mp0.Z0(new szd[]{new at9("es"), new mde("ES")}), "composeResources/claude.agentchat.generated.resources/values-es-rES/strings.commonMain.cvr", 6305L, 93L), new spe(gid.r("es"), "composeResources/claude.agentchat.generated.resources/values-es/strings.commonMain.cvr", 6341L, 105L), new spe(gid.r("fr"), "composeResources/claude.agentchat.generated.resources/values-fr/strings.commonMain.cvr", 6761L, 113L), new spe(gid.r("hi"), "composeResources/claude.agentchat.generated.resources/values-hi/strings.commonMain.cvr", 10433L, 153L), new spe(gid.r("in"), "composeResources/claude.agentchat.generated.resources/values-in/strings.commonMain.cvr", 5937L, 93L), new spe(gid.r("it"), "composeResources/claude.agentchat.generated.resources/values-it/strings.commonMain.cvr", 6249L, 89L), new spe(gid.r("ja"), "composeResources/claude.agentchat.generated.resources/values-ja/strings.commonMain.cvr", 7753L, 113L), new spe(gid.r("ko"), "composeResources/claude.agentchat.generated.resources/values-ko/strings.commonMain.cvr", 6737L, 93L), new spe(gid.r("pt"), "composeResources/claude.agentchat.generated.resources/values-pt/strings.commonMain.cvr", 6277L, 101L), new spe(um6.E, "composeResources/claude.agentchat.generated.resources/values/strings.commonMain.cvr", 5691L, 81L)}));
            case 1:
                return new nrg("string:dispatch_upsell_turn_on", mp0.Z0(new spe[]{new spe(gid.r("de"), "composeResources/claude.agentchat.generated.resources/values-de/strings.commonMain.cvr", 6615L, 47L), new spe(mp0.Z0(new szd[]{new at9("es"), new mde("ES")}), "composeResources/claude.agentchat.generated.resources/values-es-rES/strings.commonMain.cvr", 6399L, 43L), new spe(gid.r("es"), "composeResources/claude.agentchat.generated.resources/values-es/strings.commonMain.cvr", 6447L, 43L), new spe(gid.r("fr"), "composeResources/claude.agentchat.generated.resources/values-fr/strings.commonMain.cvr", 6875L, 43L), new spe(gid.r("hi"), "composeResources/claude.agentchat.generated.resources/values-hi/strings.commonMain.cvr", 10587L, 67L), new spe(gid.r("in"), "composeResources/claude.agentchat.generated.resources/values-in/strings.commonMain.cvr", 6031L, 43L), new spe(gid.r("it"), "composeResources/claude.agentchat.generated.resources/values-it/strings.commonMain.cvr", 6339L, 39L), new spe(gid.r("ja"), "composeResources/claude.agentchat.generated.resources/values-ja/strings.commonMain.cvr", 7867L, 51L), new spe(gid.r("ko"), "composeResources/claude.agentchat.generated.resources/values-ko/strings.commonMain.cvr", 6831L, 39L), new spe(gid.r("pt"), "composeResources/claude.agentchat.generated.resources/values-pt/strings.commonMain.cvr", 6379L, 39L), new spe(um6.E, "composeResources/claude.agentchat.generated.resources/values/strings.commonMain.cvr", 5773L, 43L)}));
            case 2:
                return new nrg("string:agent_chat_bubble_show_timestamp", mp0.Z0(new spe[]{new spe(gid.r("de"), "composeResources/claude.agentchat.generated.resources/values-de/strings.commonMain.cvr", 545L, 72L), new spe(mp0.Z0(new szd[]{new at9("es"), new mde("ES")}), "composeResources/claude.agentchat.generated.resources/values-es-rES/strings.commonMain.cvr", 509L, 72L), new spe(gid.r("es"), "composeResources/claude.agentchat.generated.resources/values-es/strings.commonMain.cvr", 509L, 72L), new spe(gid.r("fr"), "composeResources/claude.agentchat.generated.resources/values-fr/strings.commonMain.cvr", 549L, 80L), new spe(gid.r("hi"), "composeResources/claude.agentchat.generated.resources/values-hi/strings.commonMain.cvr", 781L, 108L), new spe(gid.r("in"), "composeResources/claude.agentchat.generated.resources/values-in/strings.commonMain.cvr", 489L, 68L), new spe(gid.r("it"), "composeResources/claude.agentchat.generated.resources/values-it/strings.commonMain.cvr", 517L, 72L), new spe(gid.r("ja"), "composeResources/claude.agentchat.generated.resources/values-ja/strings.commonMain.cvr", 545L, 84L), new spe(gid.r("ko"), "composeResources/claude.agentchat.generated.resources/values-ko/strings.commonMain.cvr", 541L, 72L), new spe(gid.r("pt"), "composeResources/claude.agentchat.generated.resources/values-pt/strings.commonMain.cvr", 497L, 72L), new spe(um6.E, "composeResources/claude.agentchat.generated.resources/values/strings.commonMain.cvr", 473L, 64L)}));
            case 3:
                return new nrg("string:agent_chat_download_started", mp0.Z0(new spe[]{new spe(gid.r("de"), "composeResources/claude.agentchat.generated.resources/values-de/strings.commonMain.cvr", 618L, 67L), new spe(mp0.Z0(new szd[]{new at9("es"), new mde("ES")}), "composeResources/claude.agentchat.generated.resources/values-es-rES/strings.commonMain.cvr", 582L, 55L), new spe(gid.r("es"), "composeResources/claude.agentchat.generated.resources/values-es/strings.commonMain.cvr", 582L, 55L), new spe(gid.r("fr"), "composeResources/claude.agentchat.generated.resources/values-fr/strings.commonMain.cvr", 630L, 63L), new spe(gid.r("hi"), "composeResources/claude.agentchat.generated.resources/values-hi/strings.commonMain.cvr", 890L, 99L), new spe(gid.r("in"), "composeResources/claude.agentchat.generated.resources/values-in/strings.commonMain.cvr", 558L, 51L), new spe(gid.r("it"), "composeResources/claude.agentchat.generated.resources/values-it/strings.commonMain.cvr", 590L, 63L), new spe(gid.r("ja"), "composeResources/claude.agentchat.generated.resources/values-ja/strings.commonMain.cvr", 630L, 67L), new spe(gid.r("ko"), "composeResources/claude.agentchat.generated.resources/values-ko/strings.commonMain.cvr", 614L, 63L), new spe(gid.r("pt"), "composeResources/claude.agentchat.generated.resources/values-pt/strings.commonMain.cvr", 570L, 51L), new spe(um6.E, "composeResources/claude.agentchat.generated.resources/values/strings.commonMain.cvr", 538L, 55L)}));
            case 4:
                return new nrg("string:agent_chat_error_download_failed", mp0.Z0(new spe[]{new spe(gid.r("de"), "composeResources/claude.agentchat.generated.resources/values-de/strings.commonMain.cvr", 686L, 72L), new spe(mp0.Z0(new szd[]{new at9("es"), new mde("ES")}), "composeResources/claude.agentchat.generated.resources/values-es-rES/strings.commonMain.cvr", 638L, 64L), new spe(gid.r("es"), "composeResources/claude.agentchat.generated.resources/values-es/strings.commonMain.cvr", 638L, 64L), new spe(gid.r("fr"), "composeResources/claude.agentchat.generated.resources/values-fr/strings.commonMain.cvr", 694L, 84L), new spe(gid.r("hi"), "composeResources/claude.agentchat.generated.resources/values-hi/strings.commonMain.cvr", 990L, 88L), new spe(gid.r("in"), "composeResources/claude.agentchat.generated.resources/values-in/strings.commonMain.cvr", 610L, 60L), new spe(gid.r("it"), "composeResources/claude.agentchat.generated.resources/values-it/strings.commonMain.cvr", 654L, 68L), new spe(gid.r("ja"), "composeResources/claude.agentchat.generated.resources/values-ja/strings.commonMain.cvr", 698L, 92L), new spe(gid.r("ko"), "composeResources/claude.agentchat.generated.resources/values-ko/strings.commonMain.cvr", 678L, 68L), new spe(gid.r("pt"), "composeResources/claude.agentchat.generated.resources/values-pt/strings.commonMain.cvr", 622L, 64L), new spe(um6.E, "composeResources/claude.agentchat.generated.resources/values/strings.commonMain.cvr", 594L, 60L)}));
            case 5:
                return new nrg("string:agent_chat_error_upload_failed", mp0.Z0(new spe[]{new spe(gid.r("de"), "composeResources/claude.agentchat.generated.resources/values-de/strings.commonMain.cvr", 1243L, 74L), new spe(mp0.Z0(new szd[]{new at9("es"), new mde("ES")}), "composeResources/claude.agentchat.generated.resources/values-es-rES/strings.commonMain.cvr", 1151L, 74L), new spe(gid.r("es"), "composeResources/claude.agentchat.generated.resources/values-es/strings.commonMain.cvr", 1163L, 74L), new spe(gid.r("fr"), "composeResources/claude.agentchat.generated.resources/values-fr/strings.commonMain.cvr", 1251L, 86L), new spe(gid.r("hi"), "composeResources/claude.agentchat.generated.resources/values-hi/strings.commonMain.cvr", 1759L, 98L), new spe(gid.r("in"), "composeResources/claude.agentchat.generated.resources/values-in/strings.commonMain.cvr", 1059L, 66L), new spe(gid.r("it"), "composeResources/claude.agentchat.generated.resources/values-it/strings.commonMain.cvr", 1187L, 78L), new spe(gid.r("ja"), "composeResources/claude.agentchat.generated.resources/values-ja/strings.commonMain.cvr", 1375L, 110L), new spe(gid.r("ko"), "composeResources/claude.agentchat.generated.resources/values-ko/strings.commonMain.cvr", 1223L, 70L), new spe(gid.r("pt"), "composeResources/claude.agentchat.generated.resources/values-pt/strings.commonMain.cvr", 1119L, 74L), new spe(um6.E, "composeResources/claude.agentchat.generated.resources/values/strings.commonMain.cvr", 1051L, 62L)}));
            case 6:
                return new nrg("string:agent_chat_input_placeholder_v2", mp0.Z0(new spe[]{new spe(gid.r("de"), "composeResources/claude.agentchat.generated.resources/values-de/strings.commonMain.cvr", 1318L, 63L), new spe(mp0.Z0(new szd[]{new at9("es"), new mde("ES")}), "composeResources/claude.agentchat.generated.resources/values-es-rES/strings.commonMain.cvr", 1226L, 83L), new spe(gid.r("es"), "composeResources/claude.agentchat.generated.resources/values-es/strings.commonMain.cvr", 1238L, 83L), new spe(gid.r("fr"), "composeResources/claude.agentchat.generated.resources/values-fr/strings.commonMain.cvr", 1338L, 87L), new spe(gid.r("hi"), "composeResources/claude.agentchat.generated.resources/values-hi/strings.commonMain.cvr", 1858L, 103L), new spe(gid.r("in"), "composeResources/claude.agentchat.generated.resources/values-in/strings.commonMain.cvr", 1126L, 67L), new spe(gid.r("it"), "composeResources/claude.agentchat.generated.resources/values-it/strings.commonMain.cvr", 1266L, 79L), new spe(gid.r("ja"), "composeResources/claude.agentchat.generated.resources/values-ja/strings.commonMain.cvr", 1486L, 95L), new spe(gid.r("ko"), "composeResources/claude.agentchat.generated.resources/values-ko/strings.commonMain.cvr", 1294L, 95L), new spe(gid.r("pt"), "composeResources/claude.agentchat.generated.resources/values-pt/strings.commonMain.cvr", 1194L, 83L), new spe(um6.E, "composeResources/claude.agentchat.generated.resources/values/strings.commonMain.cvr", 1114L, 67L)}));
            case 7:
                return new nrg("string:agent_chat_intro_banner_body", mp0.Z0(new spe[]{new spe(gid.r("de"), "composeResources/claude.agentchat.generated.resources/values-de/strings.commonMain.cvr", 1382L, 312L), new spe(mp0.Z0(new szd[]{new at9("es"), new mde("ES")}), "composeResources/claude.agentchat.generated.resources/values-es-rES/strings.commonMain.cvr", 1310L, 296L), new spe(gid.r("es"), "composeResources/claude.agentchat.generated.resources/values-es/strings.commonMain.cvr", 1322L, 300L), new spe(gid.r("fr"), "composeResources/claude.agentchat.generated.resources/values-fr/strings.commonMain.cvr", 1426L, 344L), new spe(gid.r("hi"), "composeResources/claude.agentchat.generated.resources/values-hi/strings.commonMain.cvr", 1962L, 672L), new spe(gid.r("in"), "composeResources/claude.agentchat.generated.resources/values-in/strings.commonMain.cvr", 1194L, 300L), new spe(gid.r("it"), "composeResources/claude.agentchat.generated.resources/values-it/strings.commonMain.cvr", 1346L, 308L), new spe(gid.r("ja"), "composeResources/claude.agentchat.generated.resources/values-ja/strings.commonMain.cvr", 1582L, 448L), new spe(gid.r("ko"), "composeResources/claude.agentchat.generated.resources/values-ko/strings.commonMain.cvr", 1390L, 360L), new spe(gid.r("pt"), "composeResources/claude.agentchat.generated.resources/values-pt/strings.commonMain.cvr", 1278L, 304L), new spe(um6.E, "composeResources/claude.agentchat.generated.resources/values/strings.commonMain.cvr", 1182L, 252L)}));
            case 8:
                return "";
            case 9:
                return StudentConfig._childSerializers$_anonymous_();
            case 10:
                return StudentConfig._childSerializers$_anonymous_$0();
            case 11:
                return StudentConfig._childSerializers$_anonymous_$1();
            case 12:
                return Integer.valueOf(i4d.G.size());
            case 13:
                return mpk.P(Boolean.FALSE);
            case 14:
                return SummaryStatusCategory._init_$_anonymous_();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return SupportedToolsConfig._childSerializers$_anonymous_();
            case 16:
                return SupportedToolsConfig._childSerializers$_anonymous_$0();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return TTSApiMessage._init_$_anonymous_();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return mpk.P("");
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return mpk.P("");
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return mpk.P(Boolean.FALSE);
            case 21:
                return mpk.P(Boolean.FALSE);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return TaskEventsResponse._childSerializers$_anonymous_();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return TaskListOutput._childSerializers$_anonymous_();
            case 24:
                return TaskListOutputTasksItem._childSerializers$_anonymous_();
            case BuildConfig.VERSION_CODE /* 25 */:
                return TaskListOutputTasksItemStatus._init_$_anonymous_();
            case 26:
                return TaskListOutputTasksItemStepsItemStatus._init_$_anonymous_();
            case 27:
                return TaskProposeOutputStatus._init_$_anonymous_();
            case 28:
                return TaskProposeOutputStepsItemStatus._init_$_anonymous_();
            default:
                return TaskResponse._childSerializers$_anonymous_();
        }
    }
}
