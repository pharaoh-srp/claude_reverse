package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.DrawerEvents$DrawerColdStartRestored;
import com.anthropic.claude.analytics.events.DrawerEvents$DrawerItemSelected;
import com.anthropic.claude.analytics.events.DrawerEvents$DrawerOpenSource;
import com.anthropic.claude.analytics.events.DrawerEvents$DrawerOpened;
import com.anthropic.claude.analytics.events.DrawerEvents$DrawerTabReordered;
import com.anthropic.claude.analytics.events.DrawerEvents$DrawerTabVisibilityToggled;
import com.anthropic.claude.api.consent.EntityType;
import com.anthropic.claude.sessions.types.EnvironmentConfiguration;
import com.anthropic.claude.sessions.types.EnvironmentCreateRequest;
import com.anthropic.claude.sessions.types.EnvironmentKind;
import com.anthropic.claude.sessions.types.EnvironmentListResponse;
import com.anthropic.claude.sessions.types.EnvironmentResource;
import com.anthropic.claude.sessions.types.EnvironmentState;
import com.anthropic.claude.sessions.types.EnvironmentUpdateRequest;
import com.anthropic.claude.tool.model.EventCreateV0InputRecurrence;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fc6 implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ fc6(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                float f = nc6.a;
                return Boolean.TRUE;
            case 1:
                return new he6("drawable:onboarding_check", sf5.f0(new spe(um6.E, "composeResources/claude.agentchat.generated.resources/drawable/onboarding_check.xml", -1L, -1L)));
            case 2:
                return new he6("drawable:onboarding_laptop", sf5.f0(new spe(um6.E, "composeResources/claude.agentchat.generated.resources/drawable/onboarding_laptop.xml", -1L, -1L)));
            case 3:
                return new he6("drawable:onboarding_loop", sf5.f0(new spe(um6.E, "composeResources/claude.agentchat.generated.resources/drawable/onboarding_loop.xml", -1L, -1L)));
            case 4:
                return new he6("drawable:onboarding_phone", sf5.f0(new spe(um6.E, "composeResources/claude.agentchat.generated.resources/drawable/onboarding_phone.xml", -1L, -1L)));
            case 5:
                return new he6("drawable:onboarding_x", sf5.f0(new spe(um6.E, "composeResources/claude.agentchat.generated.resources/drawable/onboarding_x.xml", -1L, -1L)));
            case 6:
                return new he6("drawable:scribble_compacting", sf5.f0(new spe(um6.E, "composeResources/claude.agentchat.generated.resources/drawable/scribble_compacting.xml", -1L, -1L)));
            case 7:
                return new he6("drawable:scribble_working", sf5.f0(new spe(um6.E, "composeResources/claude.agentchat.generated.resources/drawable/scribble_working.xml", -1L, -1L)));
            case 8:
                return DrawerEvents$DrawerColdStartRestored._childSerializers$_anonymous_();
            case 9:
                return DrawerEvents$DrawerItemSelected._childSerializers$_anonymous_();
            case 10:
                return DrawerEvents$DrawerOpenSource._init_$_anonymous_();
            case 11:
                return DrawerEvents$DrawerOpened._childSerializers$_anonymous_();
            case 12:
                return DrawerEvents$DrawerTabReordered._childSerializers$_anonymous_();
            case 13:
                return DrawerEvents$DrawerTabVisibilityToggled._childSerializers$_anonymous_();
            case 14:
                return mpk.P(Boolean.FALSE);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return mpk.P(Boolean.FALSE);
            case 16:
                return Boolean.TRUE;
            case g.MAX_FIELD_NUMBER /* 17 */:
                return EntityType._init_$_anonymous_();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return EnvironmentConfiguration._init_$_anonymous_();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return EnvironmentConfiguration.Anthropic._childSerializers$_anonymous_();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return EnvironmentConfiguration.Anthropic._childSerializers$_anonymous_$0();
            case 21:
                return EnvironmentCreateRequest._childSerializers$_anonymous_();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return EnvironmentKind._init_$_anonymous_();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return EnvironmentListResponse._childSerializers$_anonymous_();
            case 24:
                return EnvironmentResource._childSerializers$_anonymous_();
            case BuildConfig.VERSION_CODE /* 25 */:
                return EnvironmentResource._childSerializers$_anonymous_$0();
            case 26:
                return EnvironmentState._init_$_anonymous_();
            case 27:
                return EnvironmentUpdateRequest._childSerializers$_anonymous_();
            case 28:
                return EventCreateV0InputRecurrence._childSerializers$_anonymous_();
            default:
                return EventCreateV0InputRecurrence._childSerializers$_anonymous_$0();
        }
    }
}
