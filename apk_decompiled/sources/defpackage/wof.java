package defpackage;

import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.chat.messages.TextBlock;
import com.anthropic.claude.api.chat.tool.StringProperty;
import com.anthropic.claude.api.chat.tool.TableDisplayContent;
import com.anthropic.claude.api.experience.SpotlightContent;
import com.anthropic.claude.configs.flags.TaskAgentOverridesDebugConfig;
import com.anthropic.claude.models.organization.configtypes.SpeechInputConfig;
import com.anthropic.claude.models.organization.configtypes.SttSupportedLanguage;
import com.anthropic.claude.tasks.ui.TasksBottomSheetDestination;
import com.anthropic.claude.tool.mcp.ServerListFrame;
import com.anthropic.claude.tool.model.SuggestConnectorsInput;
import com.anthropic.claude.tool.model.SuggestConnectorsOutput;
import com.anthropic.claude.tool.model.TaskProposeInput;
import com.anthropic.claude.tool.model.TaskProposeOutput;
import java.net.InetAddress;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wof implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ wof(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        Object hreVar;
        switch (this.E) {
            case 0:
                return ServerListFrame.ServerStub._childSerializers$_anonymous_();
            case 1:
                return new j1g();
            case 2:
                umg umgVar = e3g.a;
                return null;
            case 3:
                try {
                    hreVar = InetAddress.getByName("time.google.com");
                    break;
                } catch (Throwable th) {
                    hreVar = new hre(th);
                }
                return (InetAddress) (hreVar instanceof hre ? null : hreVar);
            case 4:
                return SpeechInputConfig._childSerializers$_anonymous_();
            case 5:
                return SpotlightContent._childSerializers$_anonymous_();
            case 6:
                return SpotlightContent._childSerializers$_anonymous_$0();
            case 7:
                oqb oqbVar = njg.a;
                return Boolean.FALSE;
            case 8:
                return new pjg();
            case 9:
                return StringProperty._childSerializers$_anonymous_();
            case 10:
                return SttSupportedLanguage._childSerializers$_anonymous_();
            case 11:
                return SuggestConnectorsInput._childSerializers$_anonymous_();
            case 12:
                return SuggestConnectorsOutput._childSerializers$_anonymous_();
            case 13:
                return new va6(MTTypesetterKt.kLineSkipLimitMultiplier);
            case 14:
                return TableDisplayContent._childSerializers$_anonymous_();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return TaskAgentOverridesDebugConfig._childSerializers$_anonymous_();
            case 16:
                return TaskProposeInput._childSerializers$_anonymous_();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return TaskProposeOutput._childSerializers$_anonymous_();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return TasksBottomSheetDestination.Closed._init_$_anonymous_();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return TasksBottomSheetDestination.TaskList._init_$_anonymous_();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return TextBlock._childSerializers$_anonymous_();
            case 21:
                return TextBlock._childSerializers$_anonymous_$0();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return mpk.P(null);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return dci.a;
            case 24:
                return new y69(0L);
            case BuildConfig.VERSION_CODE /* 25 */:
                return new y69(0L);
            case 26:
                return su5.a();
            case 27:
                return h54.c;
            case 28:
                umg umgVar2 = olh.a;
                return Boolean.FALSE;
            default:
                umg umgVar3 = olh.a;
                return null;
        }
    }
}
