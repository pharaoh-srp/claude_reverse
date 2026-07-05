package defpackage;

import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ActionSource;
import com.anthropic.claude.api.chat.MessageBlobFile;
import com.anthropic.claude.api.chat.MessageDocumentFile;
import com.anthropic.claude.api.chat.MessageImageAsset;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.chat.share.k;
import com.anthropic.claude.configs.flags.ToolSearchModeConfig;
import com.anthropic.claude.sessions.types.SdkSystemEvent;
import com.anthropic.claude.types.strings.ToolSearchMode;
import java.util.List;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d6f implements bz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ d6f(int i) {
        this.E = i;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                obj.getClass();
                break;
            case 1:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                gkh gkhVar = (x44.r(obj2, Boolean.FALSE) || obj2 == null) ? null : (gkh) tvj.f.b.invoke(obj2);
                gkhVar.getClass();
                int i2 = gkhVar.a;
                Object obj3 = list.get(1);
                Boolean bool = obj3 != null ? (Boolean) obj3 : null;
                bool.getClass();
                break;
            case 2:
                obj.getClass();
                break;
            case 3:
                break;
            case 4:
                Project project = (Project) obj;
                project.getClass();
                break;
            case 5:
                ToolSearchModeConfig toolSearchModeConfig = (ToolSearchModeConfig) obj;
                toolSearchModeConfig.getClass();
                String strM732getValueOP4DWQA = toolSearchModeConfig.m732getValueOP4DWQA();
                if (strM732getValueOP4DWQA == null) {
                    ToolSearchMode.Companion.getClass();
                }
                break;
            case 6:
                wn9[] wn9VarArr = ckf.a;
                ((ekf) obj).a(akf.e, ieiVar);
                break;
            case 7:
                ((ekf) obj).getClass();
                break;
            case 8:
                break;
            case 9:
                ymf ymfVar = (ymf) obj;
                ymfVar.getClass();
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                SdkSystemEvent sdkSystemEvent = (SdkSystemEvent) obj;
                sdkSystemEvent.getClass();
                if (!x44.r(sdkSystemEvent.getSubtype(), "status") && !x44.r(sdkSystemEvent.getSubtype(), "thinking_tokens")) {
                    z = true;
                }
                break;
            case 13:
                SdkSystemEvent sdkSystemEvent2 = (SdkSystemEvent) obj;
                sdkSystemEvent2.getClass();
                break;
            case 14:
                mr1 mr1Var = (mr1) obj;
                mr1Var.getClass();
                mr1Var.s1(8.0f);
                mr1Var.r1((((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) << 32) | (((long) Float.floatToRawIntBits(2.0f)) & 4294967295L));
                mr1Var.q1(d54.b(0.08f, d54.b));
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                jtf jtfVar = (jtf) obj;
                jtfVar.getClass();
                break;
            case 16:
                ((ChatMessageActionEvents$ActionSource) obj).getClass();
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((vhd) obj).getClass();
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ((vsa) obj).getClass();
                k.c("onOpenLocation");
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((List) obj).getClass();
                k.c("onOpenRoute");
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ((String) obj).getClass();
                k.c("onToolShown");
                break;
            case 21:
                ((String) obj).getClass();
                k.c("onSendMessage");
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((String) obj).getClass();
                k.c("onBrowserTakeOver");
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((String) obj).getClass();
                k.c("onClickWiggleLink");
                break;
            case 24:
                ((zy7) obj).getClass();
                k.c("onEnableCompletionNotifications");
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                ((String) obj).getClass();
                break;
            case 26:
                k.c("onRequestMcpAppFullscreen");
                break;
            case 27:
                ((MessageImageAsset) obj).getClass();
                k.c("onPreviewImageAsset");
                break;
            case 28:
                ((MessageDocumentFile) obj).getClass();
                k.c("onPreviewDocument");
                break;
            default:
                ((MessageBlobFile) obj).getClass();
                k.c("onPreviewBlob");
                break;
        }
        return ieiVar;
    }
}
