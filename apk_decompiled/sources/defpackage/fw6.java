package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.sessions.types.EventListResponse;
import com.anthropic.claude.tool.model.EventCreateV0InputRecurrenceDaysOfWeekItem;
import com.anthropic.claude.tool.model.EventCreateV0InputRecurrenceEndType;
import com.anthropic.claude.tool.model.EventCreateV0InputRecurrenceFrequency;
import com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItem;
import com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItemAvailability;
import com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItemNudgesItemMethod;
import com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItemRecurrence;
import com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItemRecurrenceDaysOfWeekItem;
import com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItemRecurrenceEndType;
import com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItemRecurrenceFrequency;
import com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItemStatus;
import com.anthropic.claude.tool.model.EventCreateV1OutputEventCreateV1ErrorErrorType;
import com.anthropic.claude.tool.model.EventCreateV1OutputEventCreateV1Result;
import com.anthropic.claude.tool.model.EventDeleteV0InputRemovedEventsItem;
import com.anthropic.claude.tool.model.EventDeleteV0OutputEventDeleteErrorErrorType;
import com.anthropic.claude.tool.model.EventDeleteV0OutputEventDeleteResult;
import com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchErrorErrorType;
import com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchResult;
import com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchResultCalendarEventsItem;
import com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem;
import com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability;
import com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod;
import com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrence;
import com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceDaysOfWeekItem;
import com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceEndType;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fw6 implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ fw6(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return EventCreateV0InputRecurrenceDaysOfWeekItem._init_$_anonymous_();
            case 1:
                return EventCreateV0InputRecurrenceEndType._init_$_anonymous_();
            case 2:
                return EventCreateV0InputRecurrenceFrequency._init_$_anonymous_();
            case 3:
                return EventCreateV1InputNewEventsItem._childSerializers$_anonymous_();
            case 4:
                return EventCreateV1InputNewEventsItem._childSerializers$_anonymous_$0();
            case 5:
                return EventCreateV1InputNewEventsItemAvailability._init_$_anonymous_();
            case 6:
                return EventCreateV1InputNewEventsItemNudgesItemMethod._init_$_anonymous_();
            case 7:
                return EventCreateV1InputNewEventsItemRecurrence._childSerializers$_anonymous_();
            case 8:
                return EventCreateV1InputNewEventsItemRecurrence._childSerializers$_anonymous_$0();
            case 9:
                return EventCreateV1InputNewEventsItemRecurrenceDaysOfWeekItem._init_$_anonymous_();
            case 10:
                return EventCreateV1InputNewEventsItemRecurrenceEndType._init_$_anonymous_();
            case 11:
                return EventCreateV1InputNewEventsItemRecurrenceFrequency._init_$_anonymous_();
            case 12:
                return EventCreateV1InputNewEventsItemStatus._init_$_anonymous_();
            case 13:
                return EventCreateV1OutputEventCreateV1ErrorErrorType._init_$_anonymous_();
            case 14:
                return EventCreateV1OutputEventCreateV1Result._childSerializers$_anonymous_();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return EventDeleteV0InputRemovedEventsItem._childSerializers$_anonymous_();
            case 16:
                return EventDeleteV0OutputEventDeleteErrorErrorType._init_$_anonymous_();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return EventDeleteV0OutputEventDeleteResult._childSerializers$_anonymous_();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return EventListResponse._childSerializers$_anonymous_();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return EventSearchV0OutputEventSearchErrorErrorType._init_$_anonymous_();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return EventSearchV0OutputEventSearchResult._childSerializers$_anonymous_();
            case 21:
                return EventSearchV0OutputEventSearchResultCalendarEventsItem._childSerializers$_anonymous_();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem._childSerializers$_anonymous_();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem._childSerializers$_anonymous_$0();
            case 24:
                return EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemAvailability._init_$_anonymous_();
            case BuildConfig.VERSION_CODE /* 25 */:
                return EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod._init_$_anonymous_();
            case 26:
                return EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrence._childSerializers$_anonymous_();
            case 27:
                return EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrence._childSerializers$_anonymous_$0();
            case 28:
                return EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceDaysOfWeekItem._init_$_anonymous_();
            default:
                return EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceEndType._init_$_anonymous_();
        }
    }
}
