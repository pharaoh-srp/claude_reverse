package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.account.MemoryMode;
import com.anthropic.claude.api.chat.messages.MessageLimitEvent;
import com.anthropic.claude.api.mcp.McpAuthStatus;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.api.mcp.McpToolMaxPermission;
import com.anthropic.claude.api.mcp.McpToolUiMeta;
import com.anthropic.claude.api.model.ModelOption;
import com.anthropic.claude.api.model.ModelSection;
import com.anthropic.claude.app.main.MainAppScreens;
import com.anthropic.claude.chat.bottomsheet.model.ModelSelectorBottomSheetDestination;
import com.anthropic.claude.chat.modelselector.ModelRedirect;
import com.anthropic.claude.tool.model.MapDisplayV0Input;
import com.anthropic.claude.tool.model.MessageComposeV1Input;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rpa implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ rpa(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return mja.a;
            case 1:
                return MainAppScreens.AddAccount._init_$_anonymous_();
            case 2:
                return MainAppScreens.InternalSettings._init_$_anonymous_();
            case 3:
                return MainAppScreens.LoggedIn._childSerializers$_anonymous_();
            case 4:
                return MainAppScreens.LoggedOut._childSerializers$_anonymous_();
            case 5:
                return MainAppScreens.RequiredUpdate._init_$_anonymous_();
            case 6:
                return MainAppScreens.UiDemoApp._init_$_anonymous_();
            case 7:
                return MapDisplayV0Input._childSerializers$_anonymous_();
            case 8:
                umg umgVar = jwa.a;
                return Boolean.FALSE;
            case 9:
                umg umgVar2 = p54.a;
                long j = i54.z;
                return new gwa(new n54(j, i54.j, i54.A, i54.k, i54.e, i54.E, i54.n, i54.F, i54.o, i54.R, i54.t, i54.S, i54.u, i54.a, i54.g, i54.I, i54.r, i54.Q, i54.s, j, i54.f, i54.d, i54.b, i54.h, i54.c, i54.i, i54.x, i54.y, i54.D, i54.J, i54.P, i54.K, i54.L, i54.M, i54.N, i54.O, i54.B, i54.C, i54.l, i54.m, i54.G, i54.H, i54.p, i54.q, i54.T, i54.U, i54.v, i54.w), new zbi(), new j1g(), zrb.a);
            case 10:
                return McpAuthStatus._init_$_anonymous_();
            case 11:
                return McpServer._childSerializers$_anonymous_();
            case 12:
                return McpServer._childSerializers$_anonymous_$0();
            case 13:
                return McpServer._childSerializers$_anonymous_$1();
            case 14:
                return McpServer._childSerializers$_anonymous_$2();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return McpServer._childSerializers$_anonymous_$3();
            case 16:
                return McpToolMaxPermission._init_$_anonymous_();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return McpToolUiMeta._childSerializers$_anonymous_();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return MemoryMode._init_$_anonymous_();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return MessageComposeV1Input._childSerializers$_anonymous_();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return MessageLimitEvent._childSerializers$_anonymous_();
            case 21:
                return ModelOption._childSerializers$_anonymous_();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ModelOption._childSerializers$_anonymous_$0();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ModelOption._childSerializers$_anonymous_$1();
            case 24:
                return ModelRedirect._childSerializers$_anonymous_();
            case BuildConfig.VERSION_CODE /* 25 */:
                return ModelSection._init_$_anonymous_();
            case 26:
                return ModelSelectorBottomSheetDestination.Closed._init_$_anonymous_();
            case 27:
                return ModelSelectorBottomSheetDestination.MoreModels._init_$_anonymous_();
            case 28:
                return ModelSelectorBottomSheetDestination.SelectEffort._init_$_anonymous_();
            default:
                return ModelSelectorBottomSheetDestination.SelectModel._init_$_anonymous_();
        }
    }
}
