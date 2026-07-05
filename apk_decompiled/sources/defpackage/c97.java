package defpackage;

import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.analytics.events.GroveEvents$GroveLocation;
import com.anthropic.claude.analytics.events.GroveEvents$GrovePolicyToggled;
import com.anthropic.claude.analytics.events.GroveEvents$GrovePolicyViewed;
import com.anthropic.claude.api.chat.FillSensitiveTextRequest;
import com.anthropic.claude.api.chat.GenerateChatTitleRequest;
import com.anthropic.claude.api.experience.ExperienceButton;
import com.anthropic.claude.api.experience.ExperienceButtonType;
import com.anthropic.claude.api.experience.ExperienceTooltipActionType;
import com.anthropic.claude.api.experience.ExperienceTooltipLocation;
import com.anthropic.claude.api.experience.ExperienceTrackActionType;
import com.anthropic.claude.api.experience.ExperienceTrackRequest;
import com.anthropic.claude.api.export.ExportStatus;
import com.anthropic.claude.api.mobile.GetTranslationsResponse;
import com.anthropic.claude.chat.input.files.FileUploadWorker;
import com.anthropic.claude.conway.protocol.ForkPrefixResponse;
import com.anthropic.claude.sessions.types.GetBatchBranchStatusRequest;
import com.anthropic.claude.sessions.types.GetBatchBranchStatusResponse;
import com.anthropic.claude.sessions.types.GetShareStatusResponse;
import com.anthropic.claude.sessions.types.GitHubBranchListResponse;
import com.anthropic.claude.sessions.types.GitInfoType;
import com.anthropic.claude.sessions.types.GitProxyCompareResponse;
import com.anthropic.claude.settings.internal.growthbook.GateKind;
import com.anthropic.claude.tool.model.HealthConnectDataTypesV0OutputDataTypesItem;
import com.anthropic.claude.tool.model.HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType;
import com.anthropic.claude.tool.model.HealthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem;
import com.anthropic.claude.tool.ui.chat.FormSheetDestination;
import java.util.ArrayList;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c97 implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ c97(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return ExperienceButton._childSerializers$_anonymous_();
            case 1:
                return ExperienceButtonType._init_$_anonymous_();
            case 2:
                return ExperienceTooltipActionType._init_$_anonymous_();
            case 3:
                return ExperienceTooltipLocation._init_$_anonymous_();
            case 4:
                return ExperienceTrackActionType._init_$_anonymous_();
            case 5:
                return ExperienceTrackRequest._childSerializers$_anonymous_();
            case 6:
                return ExportStatus._init_$_anonymous_();
            case 7:
                return FileUploadWorker.Args._childSerializers$_anonymous_();
            case 8:
                return FillSensitiveTextRequest._childSerializers$_anonymous_();
            case 9:
                return ForkPrefixResponse._childSerializers$_anonymous_();
            case 10:
                return FormSheetDestination.Closed._init_$_anonymous_();
            case 11:
                return FormSheetDestination.FormInput._init_$_anonymous_();
            case 12:
                hz6 hz6Var = rw7.d;
                return 0;
            case 13:
                return GateKind._init_$_anonymous_();
            case 14:
                return GenerateChatTitleRequest._childSerializers$_anonymous_();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return GetBatchBranchStatusRequest._childSerializers$_anonymous_();
            case 16:
                return GetBatchBranchStatusResponse._childSerializers$_anonymous_();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return GetShareStatusResponse._childSerializers$_anonymous_();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return GetTranslationsResponse._childSerializers$_anonymous_();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return GitHubBranchListResponse._childSerializers$_anonymous_();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return GitInfoType._init_$_anonymous_();
            case 21:
                return GitProxyCompareResponse._childSerializers$_anonymous_();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return GroveEvents$GroveLocation._init_$_anonymous_();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return GroveEvents$GrovePolicyToggled._childSerializers$_anonymous_();
            case 24:
                return GroveEvents$GrovePolicyViewed._childSerializers$_anonymous_();
            case BuildConfig.VERSION_CODE /* 25 */:
                return mpk.P(Boolean.FALSE);
            case 26:
                return HealthConnectDataTypesV0OutputDataTypesItem._childSerializers$_anonymous_();
            case 27:
                return HealthConnectDataTypesV0OutputDataTypesItemRecordBaseType._init_$_anonymous_();
            case 28:
                return HealthConnectDataTypesV0OutputDataTypesItemSupportedAggregationTypesItem._init_$_anonymous_();
            default:
                oy8 oy8Var = new oy8("HealthConnectHeart", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                int i = asi.a;
                lm6 lm6Var = lm6.E;
                oy8Var.a("", MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f, 1.0f, 0.5f, 2.5f, lm6Var);
                oy8Var.a("", 45.0f, 15.5564f, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f, 1.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, lm6Var);
                long j = d54.b;
                eeg eegVar = new eeg(j);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new zuc(20.5564f, MTTypesetterKt.kLineSkipLimitMultiplier));
                arrayList.add(new uuc(5.0f, 5.0f, MTTypesetterKt.kLineSkipLimitMultiplier, false, true, 25.5564f, 5.0f));
                arrayList.add(new yuc(25.5564f, 11.0f));
                arrayList.add(new uuc(5.0f, 5.0f, MTTypesetterKt.kLineSkipLimitMultiplier, false, true, 20.5564f, 16.0f));
                arrayList.add(new uuc(5.0f, 5.0f, MTTypesetterKt.kLineSkipLimitMultiplier, false, true, 15.5564f, 11.0f));
                arrayList.add(new yuc(15.5564f, 5.0f));
                arrayList.add(new uuc(5.0f, 5.0f, MTTypesetterKt.kLineSkipLimitMultiplier, false, true, 20.5564f, MTTypesetterKt.kLineSkipLimitMultiplier));
                vuc vucVar = vuc.c;
                arrayList.add(vucVar);
                oy8Var.c(1.0f, 1.0f, 1.2f, 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 0, 1, 1, null, eegVar, "", arrayList);
                oy8Var.f();
                eeg eegVar2 = new eeg(j);
                ArrayList arrayList2 = new ArrayList(32);
                arrayList2.add(new zuc(7.81394f, 14.885f));
                arrayList2.add(new yuc(3.53571f, 10.6068f));
                arrayList2.add(new wuc(1.58309f, 8.65418f, 1.58309f, 5.48836f, 3.53571f, 3.53573f));
                arrayList2.add(new wuc(5.48833f, 1.58311f, 8.65416f, 1.58311f, 10.6068f, 3.53574f));
                arrayList2.add(new yuc(11.314f, 4.24292f));
                oy8Var.c(1.0f, 1.0f, 1.2f, 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 0, 1, 1, null, eegVar2, "", arrayList2);
                eeg eegVar3 = new eeg(j);
                ArrayList arrayList3 = new ArrayList(32);
                arrayList3.add(new zuc(13.314f, 7.07129f));
                arrayList3.add(new uuc(2.0f, 2.0f, MTTypesetterKt.kLineSkipLimitMultiplier, false, true, 17.314f, 7.07129f));
                arrayList3.add(new uuc(2.0f, 2.0f, MTTypesetterKt.kLineSkipLimitMultiplier, false, true, 13.314f, 7.07129f));
                arrayList3.add(vucVar);
                oy8Var.c(1.0f, 1.0f, 1.2f, 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 0, 1, 1, null, eegVar3, "", arrayList3);
                oy8Var.f();
                return oy8Var.e();
        }
    }
}
