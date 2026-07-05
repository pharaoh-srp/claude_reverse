package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.LoginEvents$LoginClientErrorKind;
import com.anthropic.claude.analytics.events.LoginEvents$LogoutReason;
import com.anthropic.claude.analytics.events.LoginEvents$SignInWithAppleFailed;
import com.anthropic.claude.analytics.events.LoginEvents$SignInWithGoogleError;
import com.anthropic.claude.analytics.events.McpEvents$McpAppError;
import com.anthropic.claude.analytics.events.McpEvents$McpAppErrorPhase;
import com.anthropic.claude.analytics.events.McpEvents$McpAuthCompleted;
import com.anthropic.claude.analytics.events.McpEvents$McpAuthFailureType;
import com.anthropic.claude.analytics.events.McpEvents$McpSuggestionActioned;
import com.anthropic.claude.analytics.events.McpEvents$McpSuggestionOptInActioned;
import com.anthropic.claude.analytics.events.McpEvents$McpToolToggled;
import com.anthropic.claude.analytics.events.McpEvents$SuggestionAction;
import com.anthropic.claude.analytics.events.McpEvents$SuggestionOptInAction;
import com.anthropic.claude.api.chat.MatchedSnippet;
import com.anthropic.claude.api.mcp.McpAppToolResult;
import com.anthropic.claude.api.mcp.McpPrompt;
import com.anthropic.claude.api.mcp.McpToolApprovalOption;
import com.anthropic.claude.api.mcp.McpToolVisibility;
import com.anthropic.claude.login.LoginScreens;
import com.anthropic.claude.mcpapps.transport.McpErrorResult;
import com.anthropic.claude.mcpapps.transport.McpUiContentBlock;
import com.anthropic.claude.mcpapps.transport.McpUiExtension;
import com.google.android.gms.maps.GoogleMapOptions;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mia implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ mia(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return LoginEvents$LoginClientErrorKind._init_$_anonymous_();
            case 1:
                return LoginEvents$LogoutReason._init_$_anonymous_();
            case 2:
                return LoginEvents$SignInWithAppleFailed._childSerializers$_anonymous_();
            case 3:
                return LoginEvents$SignInWithGoogleError._childSerializers$_anonymous_();
            case 4:
                return LoginScreens.MinorBlocked._init_$_anonymous_();
            case 5:
                return mpk.P(Boolean.FALSE);
            case 6:
                try {
                    kuk kukVar = nv1.h;
                    dgj.w("IBitmapDescriptorFactory is not initialized", kukVar);
                    gnk gnkVar = (gnk) kukVar;
                    Parcel parcelH = gnkVar.H();
                    parcelH.writeFloat(210.0f);
                    Parcel parcelF = gnkVar.F(parcelH, 5);
                    lu8 lu8VarF = cbc.F(parcelF.readStrongBinder());
                    parcelF.recycle();
                    return new sq1(lu8VarF);
                } catch (RemoteException e) {
                    poc.q(e);
                    return null;
                }
            case 7:
                GoogleMapOptions googleMapOptions = new GoogleMapOptions();
                googleMapOptions.O = Boolean.TRUE;
                return googleMapOptions;
            case 8:
                return MatchedSnippet._childSerializers$_anonymous_();
            case 9:
                xe4 xe4Var = lwa.a;
                return js5.a;
            case 10:
                return mpk.P(Boolean.FALSE);
            case 11:
                return mpk.P(Boolean.FALSE);
            case 12:
                return McpAppToolResult._childSerializers$_anonymous_();
            case 13:
                return McpErrorResult._childSerializers$_anonymous_();
            case 14:
                return McpEvents$McpAppError._childSerializers$_anonymous_();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return McpEvents$McpAppErrorPhase._init_$_anonymous_();
            case 16:
                return McpEvents$McpAuthCompleted._childSerializers$_anonymous_();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return McpEvents$McpAuthFailureType._init_$_anonymous_();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return McpEvents$McpSuggestionActioned._childSerializers$_anonymous_();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return McpEvents$McpSuggestionOptInActioned._childSerializers$_anonymous_();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return McpEvents$McpToolToggled._childSerializers$_anonymous_();
            case 21:
                return McpEvents$SuggestionAction._init_$_anonymous_();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return McpEvents$SuggestionOptInAction._init_$_anonymous_();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return McpPrompt._childSerializers$_anonymous_();
            case 24:
                return mpk.P(Boolean.FALSE);
            case BuildConfig.VERSION_CODE /* 25 */:
                return mpk.P(null);
            case 26:
                return McpToolApprovalOption._init_$_anonymous_();
            case 27:
                return McpToolVisibility._init_$_anonymous_();
            case 28:
                return McpUiContentBlock._init_$_anonymous_();
            default:
                return McpUiExtension._childSerializers$_anonymous_();
        }
    }
}
