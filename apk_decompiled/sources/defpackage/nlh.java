package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.chat.messages.ThinkingBlock;
import com.anthropic.claude.api.chat.messages.ToolResultBlock;
import com.anthropic.claude.api.chat.messages.ToolUseBlock;
import com.anthropic.claude.api.chat.messages.ToolUseBlockUpdateDelta;
import com.anthropic.claude.api.chat.tool.ToolResultImageGallery;
import com.anthropic.claude.api.chat.tool.ToolResultKnowledge;
import com.anthropic.claude.api.experience.TrackActionedData;
import com.anthropic.claude.api.model.ThinkingModeOption;
import com.anthropic.claude.api.model.ThinkingOption;
import com.anthropic.claude.api.model.ThinkingOptions;
import com.anthropic.claude.api.model.ThinkingState;
import com.anthropic.claude.configs.flags.ToolSearchConfig;
import com.anthropic.claude.models.organization.configtypes.UpsellConfig;
import com.anthropic.claude.tool.model.Tool;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nlh implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ nlh(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return new cm3();
            case 1:
                return ThinkingBlock._childSerializers$_anonymous_();
            case 2:
                return ThinkingBlock._childSerializers$_anonymous_$0();
            case 3:
                return ThinkingModeOption._childSerializers$_anonymous_();
            case 4:
                return ThinkingModeOption._childSerializers$_anonymous_$0();
            case 5:
                return ThinkingModeOption._childSerializers$_anonymous_$1();
            case 6:
                return ThinkingOption._childSerializers$_anonymous_();
            case 7:
                return ThinkingOption._childSerializers$_anonymous_$0();
            case 8:
                return ThinkingOptions._childSerializers$_anonymous_();
            case 9:
                return ThinkingOptions._childSerializers$_anonymous_$0();
            case 10:
                return ThinkingState.Unknown._init_$_anonymous_();
            case 11:
                xe4 xe4Var = koh.a;
                return tu5.a;
            case 12:
                return Tool.WebSearch._init_$_anonymous_();
            case 13:
                return Boolean.FALSE;
            case 14:
                return ToolResultBlock._childSerializers$_anonymous_();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return ToolResultBlock._childSerializers$_anonymous_$0();
            case 16:
                return ToolResultBlock._childSerializers$_anonymous_$1();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return ToolResultImageGallery._childSerializers$_anonymous_();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return ToolResultKnowledge._childSerializers$_anonymous_();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ToolSearchConfig._childSerializers$_anonymous_();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                o0i o0iVar = q0i.G;
                return Boolean.FALSE;
            case 21:
                return ToolUseBlock._childSerializers$_anonymous_();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ToolUseBlock._childSerializers$_anonymous_$0();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ToolUseBlock._childSerializers$_anonymous_$1();
            case 24:
                return ToolUseBlockUpdateDelta._childSerializers$_anonymous_();
            case BuildConfig.VERSION_CODE /* 25 */:
                return ToolUseBlockUpdateDelta._childSerializers$_anonymous_$0();
            case 26:
                return TrackActionedData._childSerializers$_anonymous_();
            case 27:
                return new zbi();
            case 28:
                return UpsellConfig._childSerializers$_anonymous_();
            default:
                return UpsellConfig._childSerializers$_anonymous_$0();
        }
    }
}
