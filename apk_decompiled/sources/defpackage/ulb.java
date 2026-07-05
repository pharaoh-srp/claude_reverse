package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePermissionAction;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePermissionCategory;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePermissionChanged;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePermissionChangedSource;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePermissionState;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePermissionType;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePromptAction;
import com.anthropic.claude.analytics.events.MobileToolEvents$MobileToolKind;
import com.anthropic.claude.analytics.events.MobileToolEvents$MobileToolOutcome;
import com.anthropic.claude.analytics.events.MobileToolEvents$MobileToolResolved;
import com.anthropic.claude.analytics.events.NetworkingEvents$RequestFailed;
import com.anthropic.claude.api.bootstrap.ModelSelectorStateBody;
import com.anthropic.claude.api.chat.ModelSelection;
import com.anthropic.claude.api.chat.MoveChatsRequest;
import com.anthropic.claude.api.chat.MoveChatsResponse;
import com.anthropic.claude.api.model.ModelTooltip;
import com.anthropic.claude.conway.protocol.ModelInfo;
import com.anthropic.claude.models.organization.configtypes.ModelFallbacksConfig;
import java.util.UUID;
import kotlinx.serialization.descriptors.SerialDescriptor;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ulb implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ ulb(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return MobileAppUseEvents$MobileAppUsePermissionAction._init_$_anonymous_();
            case 1:
                return MobileAppUseEvents$MobileAppUsePermissionCategory._init_$_anonymous_();
            case 2:
                return MobileAppUseEvents$MobileAppUsePermissionChanged._childSerializers$_anonymous_();
            case 3:
                return MobileAppUseEvents$MobileAppUsePermissionChanged._childSerializers$_anonymous_$0();
            case 4:
                return MobileAppUseEvents$MobileAppUsePermissionChanged._childSerializers$_anonymous_$1();
            case 5:
                return MobileAppUseEvents$MobileAppUsePermissionChanged._childSerializers$_anonymous_$2();
            case 6:
                return MobileAppUseEvents$MobileAppUsePermissionChanged._childSerializers$_anonymous_$3();
            case 7:
                return MobileAppUseEvents$MobileAppUsePermissionChangedSource._init_$_anonymous_();
            case 8:
                return MobileAppUseEvents$MobileAppUsePermissionState._init_$_anonymous_();
            case 9:
                return MobileAppUseEvents$MobileAppUsePermissionType._init_$_anonymous_();
            case 10:
                return MobileAppUseEvents$MobileAppUsePromptAction._childSerializers$_anonymous_();
            case 11:
                return MobileAppUseEvents$MobileAppUsePromptAction._childSerializers$_anonymous_$0();
            case 12:
                return MobileToolEvents$MobileToolKind._init_$_anonymous_();
            case 13:
                return MobileToolEvents$MobileToolOutcome._init_$_anonymous_();
            case 14:
                return MobileToolEvents$MobileToolResolved._childSerializers$_anonymous_();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return MobileToolEvents$MobileToolResolved._childSerializers$_anonymous_$0();
            case 16:
                return UUID.randomUUID();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return ModelFallbacksConfig._childSerializers$_anonymous_();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return ModelFallbacksConfig._childSerializers$_anonymous_$0();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ModelInfo._childSerializers$_anonymous_();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return ModelSelection._childSerializers$_anonymous_();
            case 21:
                return ModelSelectorStateBody._childSerializers$_anonymous_();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ModelTooltip._childSerializers$_anonymous_();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
                if (bsg.I0("kotlinx.datetime.MonthBased")) {
                    sz6.p("Blank serial names are prohibited");
                    return null;
                }
                oh3 oh3Var = new oh3("kotlinx.datetime.MonthBased");
                e79 e79Var = e79.a;
                oh3Var.a("months", e79.b);
                return new jnf("kotlinx.datetime.MonthBased", vsg.l, oh3Var.c.size(), mp0.Y0(serialDescriptorArr), oh3Var);
            case 24:
                return mpk.P(Boolean.FALSE);
            case BuildConfig.VERSION_CODE /* 25 */:
                return MoveChatsRequest._childSerializers$_anonymous_();
            case 26:
                return MoveChatsResponse._childSerializers$_anonymous_();
            case 27:
                return MoveChatsResponse._childSerializers$_anonymous_$0();
            case 28:
                float f = ryb.a;
                return ss5.a;
            default:
                return NetworkingEvents$RequestFailed._childSerializers$_anonymous_();
        }
    }
}
