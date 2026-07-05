package defpackage;

import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.analytics.events.CronetAnalyticsEvents$RequestFailed;
import com.anthropic.claude.analytics.events.CronetAnalyticsEvents$RequestFailureReason;
import com.anthropic.claude.analytics.events.DispatchEvents$OnboardingPairingFailed;
import com.anthropic.claude.analytics.events.DispatchEvents$PairingFailureReason;
import com.anthropic.claude.analytics.events.DispatchEvents$StarterIntroCompleted;
import com.anthropic.claude.analytics.events.DispatchEvents$StarterIntroDismissReason;
import com.anthropic.claude.api.chat.DeleteChatsRequest;
import com.anthropic.claude.api.chat.DeleteChatsResponse;
import com.anthropic.claude.api.mcp.DirectoryServer;
import com.anthropic.claude.api.mcp.DirectoryServerListResponse;
import com.anthropic.claude.api.mcp.DirectoryServerType;
import com.anthropic.claude.api.notice.CtaIntent;
import com.anthropic.claude.chat.input.draft.DraftMessage;
import com.anthropic.claude.project.details.custominstructions.CustomInstructionsDialogRoute;
import com.anthropic.claude.sessions.types.CreateSessionParams;
import kotlinx.datetime.DateTimeUnit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h85 implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ h85(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return CreateSessionParams._childSerializers$_anonymous_();
            case 1:
                return CronetAnalyticsEvents$RequestFailed._childSerializers$_anonymous_();
            case 2:
                return CronetAnalyticsEvents$RequestFailureReason._init_$_anonymous_();
            case 3:
                return CtaIntent._init_$_anonymous_();
            case 4:
                return x44.W(CustomInstructionsDialogRoute.Closed.INSTANCE);
            case 5:
                return CustomInstructionsDialogRoute._init_$_anonymous_();
            case 6:
                return CustomInstructionsDialogRoute.Closed._init_$_anonymous_();
            case 7:
                return "delete conversation";
            case 8:
                return "delete conversations";
            case 9:
                return "update starred state in DB";
            case 10:
                kce kceVar = jce.a;
                return new odf("kotlinx.datetime.DateTimeUnit.DateBased", kceVar.b(DateTimeUnit.DateBased.class), new pl9[]{kceVar.b(DateTimeUnit.DayBased.class), kceVar.b(DateTimeUnit.MonthBased.class)}, new KSerializer[]{pn5.a, drb.a});
            case 11:
                return mpk.P(new cjh((String) null, 0L, 7));
            case 12:
                qnc qncVar = cn5.a;
                return Float.valueOf(MTTypesetterKt.kLineSkipLimitMultiplier);
            case 13:
                return mpk.P(Boolean.FALSE);
            case 14:
                kce kceVar2 = jce.a;
                return new odf("kotlinx.datetime.DateTimeUnit", kceVar2.b(DateTimeUnit.class), new pl9[]{kceVar2.b(DateTimeUnit.DayBased.class), kceVar2.b(DateTimeUnit.MonthBased.class), kceVar2.b(DateTimeUnit.TimeBased.class)}, new KSerializer[]{pn5.a, drb.a, lph.a});
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
                if (bsg.I0("kotlinx.datetime.DayBased")) {
                    sz6.p("Blank serial names are prohibited");
                    return null;
                }
                oh3 oh3Var = new oh3("kotlinx.datetime.DayBased");
                e79 e79Var = e79.a;
                oh3Var.a("days", e79.b);
                return new jnf("kotlinx.datetime.DayBased", vsg.l, oh3Var.c.size(), mp0.Y0(serialDescriptorArr), oh3Var);
            case 16:
                return DeleteChatsRequest._childSerializers$_anonymous_();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return DeleteChatsResponse._childSerializers$_anonymous_();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return DeleteChatsResponse._childSerializers$_anonymous_$0();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return DirectoryServer._childSerializers$_anonymous_();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return DirectoryServer._childSerializers$_anonymous_$0();
            case 21:
                return DirectoryServer._childSerializers$_anonymous_$1();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return DirectoryServerListResponse._childSerializers$_anonymous_();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return DirectoryServerType._init_$_anonymous_();
            case 24:
                return DispatchEvents$OnboardingPairingFailed._childSerializers$_anonymous_();
            case BuildConfig.VERSION_CODE /* 25 */:
                return DispatchEvents$PairingFailureReason._init_$_anonymous_();
            case 26:
                return DispatchEvents$StarterIntroCompleted._childSerializers$_anonymous_();
            case 27:
                return DispatchEvents$StarterIntroDismissReason._init_$_anonymous_();
            case 28:
                return DraftMessage._childSerializers$_anonymous_();
            default:
                return DraftMessage._childSerializers$_anonymous_$0();
        }
    }
}
