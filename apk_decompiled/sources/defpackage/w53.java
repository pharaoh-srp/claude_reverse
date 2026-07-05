package defpackage;

import android.os.Looper;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.app.ClaudeAppDestination;
import com.anthropic.claude.app.ClaudeAppOverlay;
import com.anthropic.claude.chat.ChatScreenOverlay;
import com.anthropic.claude.chat.bottomsheet.ChatScreenArtifactSheetDestination;
import com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination;
import com.anthropic.claude.chat.dialogs.ChatScreenDialog;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w53 implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ w53(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return ChatScreenDialog.Delete._init_$_anonymous_();
            case 1:
                return ChatScreenDialog.Dismissed._init_$_anonymous_();
            case 2:
                return ChatScreenDialog.Rename._init_$_anonymous_();
            case 3:
                return ChatScreenDialog.StopResearch._init_$_anonymous_();
            case 4:
                return ChatScreenDialog.VoiceShortcut._init_$_anonymous_();
            case 5:
                return x44.W(ChatScreenDialog.Dismissed.INSTANCE);
            case 6:
                return x44.W(ChatScreenModalBottomSheetDestination.Closed.INSTANCE);
            case 7:
                return x44.W(ChatScreenArtifactSheetDestination.Closed.INSTANCE);
            case 8:
                return mpk.P(Boolean.FALSE);
            case 9:
                return mpk.P(Boolean.FALSE);
            case 10:
                return x44.W(ChatScreenOverlay.None.INSTANCE);
            case 11:
                return ChatScreenModalBottomSheetDestination.AgeAssurance._init_$_anonymous_();
            case 12:
                return ChatScreenModalBottomSheetDestination.Closed._init_$_anonymous_();
            case 13:
                return ChatScreenModalBottomSheetDestination.ViewAllChatArtifacts._init_$_anonymous_();
            case 14:
                return ChatScreenModalBottomSheetDestination.ViewAllWiggleArtifacts._init_$_anonymous_();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return ChatScreenModalBottomSheetDestination.VoiceSettings._init_$_anonymous_();
            case 16:
                return ChatScreenOverlay.None._init_$_anonymous_();
            case g.MAX_FIELD_NUMBER /* 17 */:
                try {
                    return Long.valueOf(Looper.getMainLooper().getThread().getId());
                } catch (Exception unused) {
                    return null;
                }
            case g.AVG_FIELD_NUMBER /* 18 */:
                return ClaudeAppDestination.List.AgentChat._init_$_anonymous_();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ClaudeAppDestination.List.AgentChatTasks._init_$_anonymous_();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return ClaudeAppDestination.List.AllChatsList._init_$_anonymous_();
            case 21:
                return ClaudeAppDestination.List.AllProjectsList._init_$_anonymous_();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ClaudeAppDestination.List.ArtifactGallery._init_$_anonymous_();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ClaudeAppDestination.List.CodeRemote._init_$_anonymous_();
            case 24:
                return ClaudeAppDestination.List.Conway._init_$_anonymous_();
            case BuildConfig.VERSION_CODE /* 25 */:
                return ClaudeAppDestination.List.CoworkRemote._init_$_anonymous_();
            case 26:
                return ClaudeAppDestination.List.Tasks._init_$_anonymous_();
            case 27:
                return mpk.P(Boolean.FALSE);
            case 28:
                return x44.W(ClaudeAppOverlay.None.INSTANCE);
            default:
                return mpk.P("");
        }
    }
}
