package defpackage;

import com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceFrequency;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class fz6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceFrequency.values().length];
        try {
            iArr[EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceFrequency.DAILY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceFrequency.WEEKLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceFrequency.MONTHLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemRecurrenceFrequency.YEARLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
