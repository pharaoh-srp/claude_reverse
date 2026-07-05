package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectDocumentAdded;
import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectDocumentDeleted;
import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectDocumentSource;
import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectFileAdded;
import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectFileDeleted;
import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectFileSource;
import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectUploadSource;
import com.anthropic.claude.analytics.events.PushEvents$SessionReplyActionResult;
import com.anthropic.claude.analytics.events.PushEvents$SessionReplyOutcome;
import com.anthropic.claude.analytics.events.ReadAloudEvents$MobileReadAloudCompleted;
import com.anthropic.claude.analytics.events.ReadAloudEvents$ReadAloudOutcome;
import com.anthropic.claude.api.chat.RecordToolApprovalRequest;
import com.anthropic.claude.api.chat.RecordToolResultRequest;
import com.anthropic.claude.api.common.RateLimit;
import com.anthropic.claude.api.notice.RedirectHint;
import com.anthropic.claude.api.project.ProjectType;
import com.anthropic.claude.chat.input.draft.QueuedSendRequest;
import com.anthropic.claude.models.organization.configtypes.ProjectTemplatesConfig;
import com.anthropic.claude.tool.model.RecipeDisplayV0InputIngredientsItemUnit;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rod implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ rod(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return ProjectTemplatesConfig._childSerializers$_anonymous_();
            case 1:
                return ProjectType._init_$_anonymous_();
            case 2:
                return ProjectsEvents$ProjectDocumentAdded._childSerializers$_anonymous_();
            case 3:
                return ProjectsEvents$ProjectDocumentAdded._childSerializers$_anonymous_$0();
            case 4:
                return ProjectsEvents$ProjectDocumentDeleted._childSerializers$_anonymous_();
            case 5:
                return ProjectsEvents$ProjectDocumentSource._init_$_anonymous_();
            case 6:
                return ProjectsEvents$ProjectFileAdded._childSerializers$_anonymous_();
            case 7:
                return ProjectsEvents$ProjectFileAdded._childSerializers$_anonymous_$0();
            case 8:
                return ProjectsEvents$ProjectFileDeleted._childSerializers$_anonymous_();
            case 9:
                return ProjectsEvents$ProjectFileSource._init_$_anonymous_();
            case 10:
                return ProjectsEvents$ProjectUploadSource._init_$_anonymous_();
            case 11:
                int i = zqd.a;
                return iei.a;
            case 12:
                return PushEvents$SessionReplyActionResult._childSerializers$_anonymous_();
            case 13:
                return PushEvents$SessionReplyOutcome._init_$_anonymous_();
            case 14:
                return QueuedSendRequest._childSerializers$_anonymous_();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return RateLimit.ApproachingLimit._childSerializers$_anonymous_();
            case 16:
                return RateLimit.ExceedsLimit._childSerializers$_anonymous_();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return ReadAloudEvents$MobileReadAloudCompleted._childSerializers$_anonymous_();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return ReadAloudEvents$MobileReadAloudCompleted._childSerializers$_anonymous_$0();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ReadAloudEvents$ReadAloudOutcome._init_$_anonymous_();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new isc(0);
            case 21:
                return RecipeDisplayV0InputIngredientsItemUnit._init_$_anonymous_();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return mpk.P(Boolean.FALSE);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new jsc(0L);
            case 24:
                return RecordToolApprovalRequest._childSerializers$_anonymous_();
            case BuildConfig.VERSION_CODE /* 25 */:
                return RecordToolApprovalRequest._childSerializers$_anonymous_$0();
            case 26:
                return RecordToolResultRequest._childSerializers$_anonymous_();
            case 27:
                return RedirectHint._init_$_anonymous_();
            case 28:
                return mpk.P(Boolean.FALSE);
            default:
                xe4 xe4Var = yee.a;
                return eua.c;
        }
    }
}
