package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.anthropic.claude.R;
import com.anthropic.claude.tool.model.CalendarSearchV0Output;
import com.anthropic.claude.tool.model.CalendarSearchV0OutputCalendarSearchError;
import com.anthropic.claude.tool.model.CalendarSearchV0OutputCalendarSearchErrorErrorType;
import com.anthropic.claude.tool.model.CalendarSearchV0OutputCalendarSearchResult;
import com.anthropic.claude.tool.model.CalendarSearchV0OutputCalendarSearchResultCalendarsItem;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l72 implements v0i {
    public final int E;
    public final CalendarSearchV0OutputCalendarSearchErrorErrorType F;
    public final boolean G;

    public l72(CalendarSearchV0Output calendarSearchV0Output) {
        List<CalendarSearchV0OutputCalendarSearchResultCalendarsItem> calendars;
        CalendarSearchV0OutputCalendarSearchResult calendarSearchV0OutputCalendarSearchResult = calendarSearchV0Output instanceof CalendarSearchV0OutputCalendarSearchResult ? (CalendarSearchV0OutputCalendarSearchResult) calendarSearchV0Output : null;
        this.E = (calendarSearchV0OutputCalendarSearchResult == null || (calendars = calendarSearchV0OutputCalendarSearchResult.getCalendars()) == null) ? 0 : calendars.size();
        boolean z = calendarSearchV0Output instanceof CalendarSearchV0OutputCalendarSearchError;
        CalendarSearchV0OutputCalendarSearchError calendarSearchV0OutputCalendarSearchError = z ? (CalendarSearchV0OutputCalendarSearchError) calendarSearchV0Output : null;
        this.F = calendarSearchV0OutputCalendarSearchError != null ? calendarSearchV0OutputCalendarSearchError.getError_type() : null;
        this.G = (z ? (CalendarSearchV0OutputCalendarSearchError) calendarSearchV0Output : null) != null;
    }

    @Override // defpackage.v0i
    public final String H(Context context, boolean z, boolean z2) {
        context.getClass();
        CalendarSearchV0OutputCalendarSearchErrorErrorType calendarSearchV0OutputCalendarSearchErrorErrorType = CalendarSearchV0OutputCalendarSearchErrorErrorType.APP_PERMISSION_DENIED;
        CalendarSearchV0OutputCalendarSearchErrorErrorType calendarSearchV0OutputCalendarSearchErrorErrorType2 = this.F;
        if (calendarSearchV0OutputCalendarSearchErrorErrorType2 == calendarSearchV0OutputCalendarSearchErrorErrorType) {
            String string = context.getString(R.string.calendar_events_permission_denied_app);
            string.getClass();
            return string;
        }
        if (calendarSearchV0OutputCalendarSearchErrorErrorType2 == CalendarSearchV0OutputCalendarSearchErrorErrorType.SYSTEM_PERMISSION_DENIED) {
            String string2 = context.getString(R.string.calendar_events_permission_denied_system);
            string2.getClass();
            return string2;
        }
        if (calendarSearchV0OutputCalendarSearchErrorErrorType2 == CalendarSearchV0OutputCalendarSearchErrorErrorType.RESTRICTED_ACCESS) {
            String string3 = context.getString(R.string.calendar_events_access_restricted);
            string3.getClass();
            return string3;
        }
        if (z2 || this.G) {
            String string4 = context.getString(R.string.calendar_list_status_failed);
            string4.getClass();
            return string4;
        }
        if (!z) {
            String string5 = context.getString(R.string.calendar_list_status_searching);
            string5.getClass();
            return string5;
        }
        Resources resources = context.getResources();
        int i = this.E;
        String quantityString = resources.getQuantityString(R.plurals.calendar_list_status_found, i, Integer.valueOf(i));
        quantityString.getClass();
        return quantityString;
    }
}
