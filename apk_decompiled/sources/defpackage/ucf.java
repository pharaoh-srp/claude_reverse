package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.SearchEvents$InlineCitationClicked;
import com.anthropic.claude.analytics.events.SearchEvents$InlineSourcesSheetSeen;
import com.anthropic.claude.analytics.events.SearchEvents$SearchType;
import com.anthropic.claude.analytics.events.SearchEvents$SheetSourceClicked;
import com.anthropic.claude.analytics.events.SearchEvents$SourceType;
import com.anthropic.claude.code.ui.SessionInputData;
import com.anthropic.claude.sessions.types.SdkToolUseSummaryEvent;
import com.anthropic.claude.sessions.types.SendEventsParams;
import com.anthropic.claude.sessions.types.SendEventsRequest;
import com.anthropic.claude.sessions.types.SendEventsV2Request;
import com.anthropic.claude.sessions.types.SessionConfigV2;
import com.anthropic.claude.sessions.types.SessionConfigViewV2;
import com.anthropic.claude.sessions.types.SessionContext;
import com.anthropic.claude.sessions.types.SessionContextSource;
import com.anthropic.claude.sessions.types.SessionExternalMetadata;
import com.anthropic.claude.sessions.types.SessionGroupingRelation;
import com.anthropic.claude.sessions.types.SessionGroupingVisibility;
import com.anthropic.claude.sessions.types.SessionLifecycleStatusV2;
import com.anthropic.claude.sessions.types.SessionMcpServerConfig;
import com.anthropic.claude.sessions.types.SessionResource;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ucf implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ ucf(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        ServiceConfigurationError serviceConfigurationError;
        int i = 2;
        switch (this.E) {
            case 0:
                return SdkToolUseSummaryEvent._childSerializers$_anonymous_();
            case 1:
                return SearchEvents$InlineCitationClicked._childSerializers$_anonymous_();
            case 2:
                return SearchEvents$InlineSourcesSheetSeen._childSerializers$_anonymous_();
            case 3:
                return SearchEvents$SearchType._init_$_anonymous_();
            case 4:
                return SearchEvents$SheetSourceClicked._childSerializers$_anonymous_();
            case 5:
                return SearchEvents$SheetSourceClicked._childSerializers$_anonymous_$0();
            case 6:
                return SearchEvents$SourceType._init_$_anonymous_();
            case 7:
                return mpk.P(Boolean.FALSE);
            case 8:
                return new tif(1L);
            case 9:
                return SendEventsParams._childSerializers$_anonymous_();
            case 10:
                return SendEventsRequest._childSerializers$_anonymous_();
            case 11:
                return SendEventsV2Request._childSerializers$_anonymous_();
            case 12:
                try {
                    Iterator it = Arrays.asList(new b7b(), new jdc()).iterator();
                    it.getClass();
                    return mwa.U(bnf.e0(new kl4(new pp0(i, it))));
                } finally {
                }
            case 13:
                try {
                    Iterator it2 = Arrays.asList(new iui(), new j0h()).iterator();
                    it2.getClass();
                    return mwa.U(bnf.e0(new kl4(new pp0(i, it2))));
                } finally {
                }
            case 14:
                return SessionConfigV2._childSerializers$_anonymous_();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return SessionConfigV2._childSerializers$_anonymous_$0();
            case 16:
                return SessionConfigViewV2._childSerializers$_anonymous_();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return SessionConfigViewV2._childSerializers$_anonymous_$0();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return SessionContext._childSerializers$_anonymous_();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return SessionContext._childSerializers$_anonymous_$0();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return SessionContextSource._init_$_anonymous_();
            case 21:
                return SessionExternalMetadata._childSerializers$_anonymous_();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return SessionGroupingRelation._init_$_anonymous_();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return SessionGroupingVisibility._init_$_anonymous_();
            case 24:
                return SessionInputData._childSerializers$_anonymous_();
            case BuildConfig.VERSION_CODE /* 25 */:
                return SessionInputData._childSerializers$_anonymous_$0();
            case 26:
                return SessionLifecycleStatusV2._init_$_anonymous_();
            case 27:
                return SessionMcpServerConfig._childSerializers$_anonymous_();
            case 28:
                return SessionResource._childSerializers$_anonymous_();
            default:
                return SessionResource._childSerializers$_anonymous_$0();
        }
    }
}
