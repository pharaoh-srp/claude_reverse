package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.experience.Experience;
import com.anthropic.claude.api.experience.ExperienceActionResponse;
import com.anthropic.claude.api.experience.ExperienceAssetImageVariants;
import com.anthropic.claude.api.experience.ExperienceAssetResizeMode;
import com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceFrequency;
import com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItem;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemAvailability;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemNudgesItemMethod;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemRecurrence;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemRecurrenceEndType;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemRecurrenceFrequency;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemStatus;
import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateErrorErrorType;
import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResult;
import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent;
import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventAvailability;
import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItemMethod;
import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrence;
import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceDaysOfWeekItem;
import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceEndType;
import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceFrequency;
import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventStatus;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m17 implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ m17(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceFrequency._init_$_anonymous_();
            case 1:
                return EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemStatus._init_$_anonymous_();
            case 2:
                return EventUpdateV0InputEventUpdatesItem._childSerializers$_anonymous_();
            case 3:
                return EventUpdateV0InputEventUpdatesItem._childSerializers$_anonymous_$0();
            case 4:
                return EventUpdateV0InputEventUpdatesItem._childSerializers$_anonymous_$1();
            case 5:
                return EventUpdateV0InputEventUpdatesItemAvailability._init_$_anonymous_();
            case 6:
                return EventUpdateV0InputEventUpdatesItemNudgesItemMethod._init_$_anonymous_();
            case 7:
                return EventUpdateV0InputEventUpdatesItemRecurrence._childSerializers$_anonymous_();
            case 8:
                return EventUpdateV0InputEventUpdatesItemRecurrence._childSerializers$_anonymous_$0();
            case 9:
                return EventUpdateV0InputEventUpdatesItemRecurrenceDaysOfWeekItem._init_$_anonymous_();
            case 10:
                return EventUpdateV0InputEventUpdatesItemRecurrenceEndType._init_$_anonymous_();
            case 11:
                return EventUpdateV0InputEventUpdatesItemRecurrenceFrequency._init_$_anonymous_();
            case 12:
                return EventUpdateV0InputEventUpdatesItemStatus._init_$_anonymous_();
            case 13:
                return EventUpdateV0OutputEventUpdateErrorErrorType._init_$_anonymous_();
            case 14:
                return EventUpdateV0OutputEventUpdateResult._childSerializers$_anonymous_();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent._childSerializers$_anonymous_();
            case 16:
                return EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent._childSerializers$_anonymous_$0();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventAvailability._init_$_anonymous_();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItemMethod._init_$_anonymous_();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrence._childSerializers$_anonymous_();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrence._childSerializers$_anonymous_$0();
            case 21:
                return EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceDaysOfWeekItem._init_$_anonymous_();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceEndType._init_$_anonymous_();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceFrequency._init_$_anonymous_();
            case 24:
                return EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventStatus._init_$_anonymous_();
            case BuildConfig.VERSION_CODE /* 25 */:
                return Experience._childSerializers$_anonymous_();
            case 26:
                return ExperienceActionResponse._childSerializers$_anonymous_();
            case 27:
                return ExperienceAssetImageVariants._childSerializers$_anonymous_();
            case 28:
                return ExperienceAssetImageVariants._childSerializers$_anonymous_$0();
            default:
                return ExperienceAssetResizeMode._init_$_anonymous_();
        }
    }
}
