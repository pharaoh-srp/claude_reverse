package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.ChatEvents$DraftRestoreTrigger;
import com.anthropic.claude.api.account.BillingType;
import com.anthropic.claude.api.chat.ChatConversationSettings;
import com.anthropic.claude.api.experience.BannerContent;
import com.anthropic.claude.api.experience.ChatInputBannerContent;
import com.anthropic.claude.api.mcp.CaiMcpFlag;
import com.anthropic.claude.api.model.BadgeVariant;
import com.anthropic.claude.app.main.loggedin.BootstrapScreen;
import com.anthropic.claude.chat.bottomsheet.ChatScreenArtifactSheetDestination;
import com.anthropic.claude.chat.bottomsheet.options.ChatOptionsBottomSheetDestination;
import com.anthropic.claude.chat.menu.ChatItemMenuDialogDestination;
import com.anthropic.claude.models.organization.configtypes.BetaToolsConfig;
import com.anthropic.claude.tool.model.ChartDisplayV0Input;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rc1 implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ rc1(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return BadgeVariant._init_$_anonymous_();
            case 1:
                return BannerContent._childSerializers$_anonymous_();
            case 2:
                umg umgVar = mg1.a;
                return null;
            case 3:
                return BetaToolsConfig._childSerializers$_anonymous_();
            case 4:
                return BetaToolsConfig._childSerializers$_anonymous_$0();
            case 5:
                return BillingType._init_$_anonymous_();
            case 6:
                return BootstrapScreen.Bootstrapped._childSerializers$_anonymous_();
            case 7:
                return BootstrapScreen.NeedsBootstrap._childSerializers$_anonymous_();
            case 8:
                return CaiMcpFlag._init_$_anonymous_();
            case 9:
                return Float.valueOf(0.7f);
            case 10:
                return ChartDisplayV0Input._childSerializers$_anonymous_();
            case 11:
                return um2.e;
            case 12:
                return ChatConversationSettings._childSerializers$_anonymous_();
            case 13:
                return ChatEvents$DraftRestoreTrigger._init_$_anonymous_();
            case 14:
                return ChatInputBannerContent._childSerializers$_anonymous_();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return ChatItemMenuDialogDestination.ChangeProject._init_$_anonymous_();
            case 16:
                return ChatItemMenuDialogDestination.Delete._init_$_anonymous_();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return ChatItemMenuDialogDestination.Dismissed._init_$_anonymous_();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return ChatItemMenuDialogDestination.Rename._init_$_anonymous_();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return x44.W(ChatItemMenuDialogDestination.Dismissed.INSTANCE);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return ChatOptionsBottomSheetDestination.AddToChat._init_$_anonymous_();
            case 21:
                return ChatOptionsBottomSheetDestination.Closed._init_$_anonymous_();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ChatOptionsBottomSheetDestination.ConnectorDirectory._init_$_anonymous_();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ChatOptionsBottomSheetDestination.Connectors._init_$_anonymous_();
            case 24:
                return ChatOptionsBottomSheetDestination.SelectProject._init_$_anonymous_();
            case BuildConfig.VERSION_CODE /* 25 */:
                return ChatOptionsBottomSheetDestination.SelectStyle._init_$_anonymous_();
            case 26:
                return ChatOptionsBottomSheetDestination.SelectToolAccess._init_$_anonymous_();
            case 27:
                return ChatScreenArtifactSheetDestination.Closed._init_$_anonymous_();
            case 28:
                return mpk.P(Boolean.FALSE);
            default:
                xe4 xe4Var = z23.a;
                return null;
        }
    }
}
