package defpackage;

import android.content.Context;
import com.anthropic.claude.R;
import com.anthropic.claude.tool.model.EventSearchV0Output;
import com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchError;
import com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchErrorErrorType;
import com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchResult;
import com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchResultCalendarEventsItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h72 implements v0i {
    public final Integer E;
    public final EventSearchV0OutputEventSearchErrorErrorType F;
    public final boolean G;

    public h72(EventSearchV0Output eventSearchV0Output) {
        Integer numValueOf;
        List<EventSearchV0OutputEventSearchResultCalendarEventsItem> calendar_events;
        EventSearchV0OutputEventSearchResult eventSearchV0OutputEventSearchResult = eventSearchV0Output instanceof EventSearchV0OutputEventSearchResult ? (EventSearchV0OutputEventSearchResult) eventSearchV0Output : null;
        if (eventSearchV0OutputEventSearchResult == null || (calendar_events = eventSearchV0OutputEventSearchResult.getCalendar_events()) == null) {
            numValueOf = null;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = calendar_events.iterator();
            while (it.hasNext()) {
                b54.t0(arrayList, ((EventSearchV0OutputEventSearchResultCalendarEventsItem) it.next()).getEvents());
            }
            numValueOf = Integer.valueOf(arrayList.size());
        }
        this.E = numValueOf;
        boolean z = eventSearchV0Output instanceof EventSearchV0OutputEventSearchError;
        EventSearchV0OutputEventSearchError eventSearchV0OutputEventSearchError = z ? (EventSearchV0OutputEventSearchError) eventSearchV0Output : null;
        this.F = eventSearchV0OutputEventSearchError != null ? eventSearchV0OutputEventSearchError.getError_type() : null;
        this.G = (z ? (EventSearchV0OutputEventSearchError) eventSearchV0Output : null) != null;
    }

    @Override // defpackage.v0i
    public final String H(Context context, boolean z, boolean z2) {
        context.getClass();
        EventSearchV0OutputEventSearchErrorErrorType eventSearchV0OutputEventSearchErrorErrorType = EventSearchV0OutputEventSearchErrorErrorType.APP_PERMISSION_DENIED;
        EventSearchV0OutputEventSearchErrorErrorType eventSearchV0OutputEventSearchErrorErrorType2 = this.F;
        if (eventSearchV0OutputEventSearchErrorErrorType2 == eventSearchV0OutputEventSearchErrorErrorType) {
            String string = context.getString(R.string.calendar_events_permission_denied_app);
            string.getClass();
            return string;
        }
        if (eventSearchV0OutputEventSearchErrorErrorType2 == EventSearchV0OutputEventSearchErrorErrorType.SYSTEM_PERMISSION_DENIED) {
            String string2 = context.getString(R.string.calendar_events_permission_denied_system);
            string2.getClass();
            return string2;
        }
        if (eventSearchV0OutputEventSearchErrorErrorType2 == EventSearchV0OutputEventSearchErrorErrorType.RESTRICTED_ACCESS) {
            String string3 = context.getString(R.string.calendar_events_access_restricted);
            string3.getClass();
            return string3;
        }
        if (z2 || this.G) {
            String string4 = context.getString(R.string.calendar_events_status_failed);
            string4.getClass();
            return string4;
        }
        if (!z) {
            String string5 = context.getString(R.string.calendar_events_status_searching);
            string5.getClass();
            return string5;
        }
        Integer num = this.E;
        int iIntValue = num != null ? num.intValue() : 0;
        String quantityString = context.getResources().getQuantityString(R.plurals.calendar_events_status_found, iIntValue, Integer.valueOf(iIntValue));
        quantityString.getClass();
        return quantityString;
    }
}
