package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.ProUpsellEvents$PlayBillingCallFailed;
import com.anthropic.claude.analytics.events.ProUpsellEvents$StoreViewPurchaseError;
import com.anthropic.claude.analytics.events.ProUpsellEvents$StoreViewPurchaseErrorKind;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.api.project.ProjectFileDeleteManyParams;
import com.anthropic.claude.api.project.ProjectFilter;
import com.anthropic.claude.api.project.ProjectPermission;
import com.anthropic.claude.api.project.ProjectSubtype;
import com.anthropic.claude.project.details.ProjectDetailsDialogDestination;
import com.anthropic.claude.project.knowledge.ProjectDocMenuDialogDestination;
import com.anthropic.claude.project.knowledge.ProjectKnowledgeBottomSheetDestination;
import com.anthropic.claude.project.knowledge.ProjectKnowledgePreviewDestination;
import com.anthropic.claude.project.menu.ProjectItemMenuDialogDestination;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mgd implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ mgd(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return ProUpsellEvents$PlayBillingCallFailed._childSerializers$_anonymous_();
            case 1:
                return ProUpsellEvents$StoreViewPurchaseError._childSerializers$_anonymous_();
            case 2:
                return ProUpsellEvents$StoreViewPurchaseErrorKind._init_$_anonymous_();
            case 3:
                return Project._childSerializers$_anonymous_();
            case 4:
                return ProjectDetailsDialogDestination.Delete._init_$_anonymous_();
            case 5:
                return ProjectDetailsDialogDestination.Dismissed._init_$_anonymous_();
            case 6:
                return ProjectDetailsDialogDestination.Rename._init_$_anonymous_();
            case 7:
                return x44.W(ProjectDetailsDialogDestination.Dismissed.INSTANCE);
            case 8:
                return ProjectDocMenuDialogDestination.Delete._init_$_anonymous_();
            case 9:
                return ProjectDocMenuDialogDestination.Dismissed._init_$_anonymous_();
            case 10:
                return x44.W(ProjectDocMenuDialogDestination.Dismissed.INSTANCE);
            case 11:
                return ProjectFileDeleteManyParams._childSerializers$_anonymous_();
            case 12:
                return ProjectFilter._init_$_anonymous_();
            case 13:
                return mpk.P(Boolean.FALSE);
            case 14:
                return mpk.P(Boolean.FALSE);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new isc(0);
            case 16:
                return ProjectItemMenuDialogDestination.Delete._init_$_anonymous_();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return ProjectItemMenuDialogDestination.Dismissed._init_$_anonymous_();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return ProjectItemMenuDialogDestination.Rename._init_$_anonymous_();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return x44.W(ProjectItemMenuDialogDestination.Dismissed.INSTANCE);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return ProjectKnowledgeBottomSheetDestination.AddContent._init_$_anonymous_();
            case 21:
                return ProjectKnowledgeBottomSheetDestination.Closed._init_$_anonymous_();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ProjectKnowledgeBottomSheetDestination.CreateDoc._init_$_anonymous_();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return mpk.P(Boolean.FALSE);
            case 24:
                return ProjectKnowledgePreviewDestination.Dismissed._init_$_anonymous_();
            case BuildConfig.VERSION_CODE /* 25 */:
                return ProjectKnowledgePreviewDestination.Preview._childSerializers$_anonymous_();
            case 26:
                return mpk.P(Boolean.FALSE);
            case 27:
                return mpk.P(Boolean.FALSE);
            case 28:
                return ProjectPermission._init_$_anonymous_();
            default:
                return ProjectSubtype._init_$_anonymous_();
        }
    }
}
