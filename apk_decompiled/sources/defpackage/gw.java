package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.AnalyticsEvent;
import com.anthropic.claude.analytics.events.OnboardingEvents$PhoneVerificationStart;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class gw extends xzg implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ qi3 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gw(qi3 qi3Var, tp4 tp4Var, int i) {
        super(1, tp4Var);
        this.E = i;
        this.F = qi3Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new gw(this.F, tp4Var, 0);
            case 1:
                return new gw(this.F, tp4Var, 1);
            case 2:
                return new gw(this.F, tp4Var, 2);
            case 3:
                return new gw(this.F, tp4Var, 3);
            case 4:
                return new gw(this.F, tp4Var, 4);
            case 5:
                return new gw(this.F, tp4Var, 5);
            case 6:
                return new gw(this.F, tp4Var, 6);
            case 7:
                return new gw(this.F, tp4Var, 7);
            case 8:
                return new gw(this.F, tp4Var, 8);
            case 9:
                return new gw(this.F, tp4Var, 9);
            case 10:
                return new gw(this.F, tp4Var, 10);
            case 11:
                return new gw(this.F, tp4Var, 11);
            case 12:
                return new gw(this.F, tp4Var, 12);
            case 13:
                return new gw(this.F, tp4Var, 13);
            case 14:
                return new gw(this.F, tp4Var, 14);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new gw(this.F, tp4Var, 15);
            case 16:
                return new gw(this.F, tp4Var, 16);
            case g.MAX_FIELD_NUMBER /* 17 */:
                return new gw(this.F, tp4Var, 17);
            case g.AVG_FIELD_NUMBER /* 18 */:
                return new gw(this.F, tp4Var, 18);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new gw(this.F, tp4Var, 19);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new gw(this.F, tp4Var, 20);
            case 21:
                return new gw(this.F, tp4Var, 21);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new gw(this.F, tp4Var, 22);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new gw(this.F, tp4Var, 23);
            case 24:
                return new gw(this.F, tp4Var, 24);
            case BuildConfig.VERSION_CODE /* 25 */:
                return new gw(this.F, tp4Var, 25);
            case 26:
                return new gw(this.F, tp4Var, 26);
            case 27:
                return new gw(this.F, tp4Var, 27);
            default:
                return new gw(this.F, tp4Var, 28);
        }
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        tp4 tp4Var = (tp4) obj;
        switch (i) {
            case 0:
                ((gw) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 1:
                ((gw) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 2:
                ((gw) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 3:
                ((gw) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 4:
                ((gw) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 5:
                ((gw) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 6:
                ((gw) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 7:
                ((gw) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 8:
                ((gw) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 9:
                ((gw) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 10:
                ((gw) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 11:
                ((gw) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 12:
                ((gw) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 13:
                ((gw) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 14:
                ((gw) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((gw) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 16:
                ((gw) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((gw) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ((gw) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((gw) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ((gw) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 21:
                ((gw) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((gw) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((gw) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 24:
                ((gw) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                ((gw) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 26:
                ((gw) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 27:
                ((gw) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((gw) create(tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        sx sxVar = sx.ARTIFACT_PREVIEW;
        iei ieiVar = iei.a;
        qi3 qi3Var = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                qi3Var.a(sx.PROJECT_LIST);
                break;
            case 1:
                sf5.h0(obj);
                qi3Var.a(sx.SHARED_LINKS_SETTINGS);
                break;
            case 2:
                sf5.h0(obj);
                qi3Var.a(sxVar);
                break;
            case 3:
                sf5.h0(obj);
                qi3Var.a(sxVar);
                break;
            case 4:
                sf5.h0(obj);
                qi3Var.a(sx.VIEW_SHARED_ARTIFACT);
                break;
            case 5:
                sf5.h0(obj);
                qi3Var.a(sx.ARTIFACT_GALLERY);
                break;
            case 6:
                sf5.h0(obj);
                qi3Var.a(sx.SHARE_ARTIFACT);
                break;
            case 7:
                sf5.h0(obj);
                qi3Var.a(sx.BROWSER_TAKEOVER);
                break;
            case 8:
                sf5.h0(obj);
                qi3Var.a(sx.MESSAGE_FEEDBACK);
                break;
            case 9:
                sf5.h0(obj);
                qi3Var.a(sx.CODE_SESSION_LIST);
                break;
            case 10:
                sf5.h0(obj);
                qi3Var.a(sx.CREATE_PROJECT);
                break;
            case 11:
                sf5.h0(obj);
                qi3Var.a(sx.PROJECT_TEMPLATE_CREATE);
                break;
            case 12:
                sf5.h0(obj);
                qi3Var.a(sx.DELETE_ACCOUNT);
                break;
            case 13:
                sf5.h0(obj);
                qi3Var.a(sx.EDIT_PROJECT_CUSTOM_INSTRUCTIONS);
                break;
            case 14:
                sf5.h0(obj);
                qi3Var.a(sx.ENDPOINT_SELECTION);
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                sf5.h0(obj);
                qi3Var.a(sx.PHONE_VERIFICATION);
                qi3Var.e(new OnboardingEvents$PhoneVerificationStart("claude-android", 2), AnalyticsEvent.Companion.serializer());
                break;
            case 16:
                sf5.h0(obj);
                qi3Var.a(sx.MOBILE_APP_FEEDBACK);
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                sf5.h0(obj);
                qi3Var.a(sx.DEBUG_MENU);
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                sf5.h0(obj);
                qi3Var.a(sx.OSS_ATTRIBUTIONS);
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                sf5.h0(obj);
                qi3Var.a(sx.ONBOARDING);
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                sf5.h0(obj);
                qi3Var.a(sx.TOOL_PERMISSIONS);
                break;
            case 21:
                sf5.h0(obj);
                qi3Var.e(new OnboardingEvents$PhoneVerificationStart("claude-android", 2), AnalyticsEvent.Companion.serializer());
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                sf5.h0(obj);
                qi3Var.a(sx.PRIVACY_SETTINGS);
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                sf5.h0(obj);
                qi3Var.a(sx.PROFILE_SETTINGS);
                break;
            case 24:
                sf5.h0(obj);
                qi3Var.a(sx.PROJECT_DETAIL);
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                sf5.h0(obj);
                qi3Var.a(sx.PROJECT_DOCUMENT_LIST);
                break;
            case 26:
                sf5.h0(obj);
                qi3Var.a(sx.PROJECT_TEMPLATE_UPLOAD);
                break;
            case 27:
                sf5.h0(obj);
                qi3Var.a(sx.RESEARCH_DETAILS);
                break;
            default:
                sf5.h0(obj);
                qi3Var.a(sx.CLAUDE_STORE_VIEW);
                break;
        }
        return ieiVar;
    }
}
