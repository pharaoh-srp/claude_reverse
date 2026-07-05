package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.ArtifactSharingEvents$ArtifactShareScreenOpened;
import com.anthropic.claude.analytics.events.ArtifactSharingEvents$ArtifactShareSuccess;
import com.anthropic.claude.analytics.events.ArtifactSharingEvents$ArtifactShareVisibility;
import com.anthropic.claude.analytics.events.ArtifactSharingEvents$ArtifactVisibilityChanged;
import com.anthropic.claude.analytics.events.ArtifactSharingEvents$SharedArtifactInteraction;
import com.anthropic.claude.analytics.events.ArtifactSharingEvents$SharedArtifactInteractionType;
import com.anthropic.claude.analytics.events.ArtifactSharingEvents$SharedArtifactViewed;
import com.anthropic.claude.analytics.events.ArtifactViewerEvents$ArtifactKind;
import com.anthropic.claude.analytics.events.ArtifactViewerEvents$ArtifactViewResult;
import com.anthropic.claude.analytics.events.ArtifactViewerEvents$ArtifactViewed;
import com.anthropic.claude.api.artifacts.ArtifactSource;
import com.anthropic.claude.api.artifacts.ArtifactVersionsResponse;
import com.anthropic.claude.api.artifacts.ArtifactVisibility;
import com.anthropic.claude.api.chat.tool.ArtifactToolInput;
import com.anthropic.claude.artifact.model.ArtifactType;
import com.anthropic.claude.sessions.types.AskUserQuestionInput;
import com.anthropic.claude.tool.model.AskUserInputV0InputQuestionsItem;
import com.anthropic.claude.tool.model.AskUserInputV0InputQuestionsItemType;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class os0 implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ os0(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return ArtifactSharingEvents$ArtifactShareScreenOpened._childSerializers$_anonymous_();
            case 1:
                return ArtifactSharingEvents$ArtifactShareScreenOpened._childSerializers$_anonymous_$0();
            case 2:
                return ArtifactSharingEvents$ArtifactShareSuccess._childSerializers$_anonymous_();
            case 3:
                return ArtifactSharingEvents$ArtifactShareVisibility._init_$_anonymous_();
            case 4:
                return ArtifactSharingEvents$ArtifactVisibilityChanged._childSerializers$_anonymous_();
            case 5:
                return ArtifactSharingEvents$ArtifactVisibilityChanged._childSerializers$_anonymous_$0();
            case 6:
                return ArtifactSharingEvents$SharedArtifactInteraction._childSerializers$_anonymous_();
            case 7:
                return ArtifactSharingEvents$SharedArtifactInteractionType._init_$_anonymous_();
            case 8:
                return ArtifactSharingEvents$SharedArtifactViewed._childSerializers$_anonymous_();
            case 9:
                return mpk.P(Boolean.FALSE);
            case 10:
                return ArtifactSource._init_$_anonymous_();
            case 11:
                return ArtifactToolInput._childSerializers$_anonymous_();
            case 12:
                return ArtifactType._init_$_anonymous_();
            case 13:
                return ArtifactType.Code._init_$_anonymous_();
            case 14:
                return ArtifactType.Html._init_$_anonymous_();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return ArtifactType.Markdown._init_$_anonymous_();
            case 16:
                return ArtifactType.Mermaid._init_$_anonymous_();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return ArtifactType.React._init_$_anonymous_();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return ArtifactType.Repl._init_$_anonymous_();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ArtifactType.Svg._init_$_anonymous_();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return ArtifactType.Text._init_$_anonymous_();
            case 21:
                return ArtifactVersionsResponse._childSerializers$_anonymous_();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ArtifactViewerEvents$ArtifactKind._init_$_anonymous_();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ArtifactViewerEvents$ArtifactViewResult._init_$_anonymous_();
            case 24:
                return ArtifactViewerEvents$ArtifactViewed._childSerializers$_anonymous_();
            case BuildConfig.VERSION_CODE /* 25 */:
                return ArtifactViewerEvents$ArtifactViewed._childSerializers$_anonymous_$0();
            case 26:
                return ArtifactVisibility._init_$_anonymous_();
            case 27:
                return AskUserInputV0InputQuestionsItem._childSerializers$_anonymous_();
            case 28:
                return AskUserInputV0InputQuestionsItemType._init_$_anonymous_();
            default:
                return AskUserQuestionInput._childSerializers$_anonymous_();
        }
    }
}
