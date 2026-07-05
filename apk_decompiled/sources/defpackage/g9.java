package defpackage;

import android.app.NotificationManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.media.AudioDeviceInfo;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.audiofx.Visualizer;
import android.net.Uri;
import android.provider.CalendarContract;
import androidx.core.content.FileProvider;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.ArtifactSharingEvents$SharedArtifactInteraction;
import com.anthropic.claude.analytics.events.ArtifactSharingEvents$SharedArtifactInteractionType;
import com.anthropic.claude.analytics.events.ChatEvents$RecentPhotosStripShown;
import com.anthropic.claude.analytics.events.DispatchEvents$OnboardingIntroViewed;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceErrorKind;
import com.anthropic.claude.api.chat.ChatMessage;
import com.anthropic.claude.api.chat.MessageAttachment;
import com.anthropic.claude.api.chat.UpdateChatModelFallbackResponse;
import com.anthropic.claude.api.chat.messages.BellNoteBlock;
import com.anthropic.claude.api.chat.messages.ContentBlock;
import com.anthropic.claude.api.chat.messages.FlagBlock;
import com.anthropic.claude.api.chat.messages.TextBlock;
import com.anthropic.claude.api.chat.messages.ThinkingBlock;
import com.anthropic.claude.api.chat.messages.ToolResultBlock;
import com.anthropic.claude.api.chat.messages.ToolUseBlock;
import com.anthropic.claude.api.chat.messages.UnknownContentBlock;
import com.anthropic.claude.api.chat.messages.VoiceNoteBlock;
import com.anthropic.claude.api.chat.tool.JsonBlockDisplayContent;
import com.anthropic.claude.bell.PlaybackPace;
import com.anthropic.claude.bell.api.VoiceSelection;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.tool.model.CalendarSearchV0OutputCalendarSearchResult;
import com.anthropic.claude.tool.model.CalendarSearchV0OutputCalendarSearchResultCalendarsItem;
import com.anthropic.claude.tool.model.EventCreateV1Input;
import com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItem;
import com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItemNudgesItem;
import com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItemNudgesItemMethod;
import com.anthropic.claude.tool.model.EventCreateV1OutputEventCreateV1Result;
import com.anthropic.claude.tool.model.EventCreateV1OutputEventCreateV1ResultCreateResultsItem;
import com.anthropic.claude.tool.model.EventCreateV1OutputEventCreateV1ResultCreateResultsItemError;
import com.anthropic.claude.tool.model.EventDeleteV0Input;
import com.anthropic.claude.tool.model.EventDeleteV0InputRemovedEventsItem;
import com.anthropic.claude.tool.model.EventDeleteV0InputRemovedEventsItemRecurrenceSpan;
import com.anthropic.claude.tool.model.EventDeleteV0InputRemovedEventsItemRecurrenceSpanRecurrenceSpanInstance;
import com.anthropic.claude.tool.model.EventDeleteV0OutputEventDeleteResult;
import com.anthropic.claude.tool.model.EventDeleteV0OutputEventDeleteResultDeleteResultsItem;
import com.anthropic.claude.tool.model.EventDeleteV0OutputEventDeleteResultDeleteResultsItemError;
import com.anthropic.claude.tool.model.EventSearchV0Input;
import com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchError;
import com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchErrorErrorType;
import com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchResult;
import com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchResultCalendarEventsItem;
import com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem;
import com.anthropic.claude.tool.model.EventUpdateV0Input;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItem;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemNudgesItem;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemNudgesItemMethod;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemRecurrenceSpan;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemRecurrenceSpanRecurrenceSpanInstance;
import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResult;
import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResultUpdateResultsItem;
import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResultUpdateResultsItemError;
import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.ProjectId;
import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import okio.BufferedSource;
import org.json.JSONObject;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class g9 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public /* synthetic */ Object F;
    public /* synthetic */ Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9(tp4 tp4Var, Context context, String str) {
        super(2, tp4Var);
        this.E = 5;
        this.G = str;
        this.F = context;
    }

    private final Object d(Object obj) {
        iei ieiVar = iei.a;
        l45 l45Var = (l45) this.F;
        sf5.h0(obj);
        boolean z = ((tn1) this.G).t.f;
        tn1 tn1Var = (tn1) this.G;
        if (z) {
            tn1Var.B(oj1.a, "audio_output_unavailable", VoiceEvents$VoiceErrorKind.AUDIO);
            return ieiVar;
        }
        int i = 2;
        tn1Var.t.i = new gn1(tn1Var, i);
        tn1 tn1Var2 = (tn1) this.G;
        int i2 = 11;
        tn1Var2.t.j = new fp(i2, tn1Var2);
        tp4 tp4Var = null;
        int i3 = 3;
        zv5 zv5VarK = gb9.k(l45Var, ((tn1) this.G).f.b(), new nn1((tn1) this.G, (Object) l45Var, tp4Var, i3), 2);
        ((tn1) this.G).q.a();
        xn1 xn1Var = ((tn1) this.G).p;
        z4j z4jVar = VoiceSelection.Companion;
        um1 um1Var = xn1Var.a;
        String strB = um1Var.b();
        z4jVar.getClass();
        xn1Var.d = z4j.a(strB);
        k6d k6dVar = PlaybackPace.Companion;
        String strA = um1Var.a();
        k6dVar.getClass();
        xn1Var.e = k6d.a(strA);
        xn1Var.f = xn1Var.b.f();
        gb9.D(l45Var, ((tn1) this.G).f.b(), null, new em1((tn1) this.G, tp4Var, 9), 2);
        gb9.D(l45Var, ((tn1) this.G).f.b(), null, new qn1((tn1) this.G, zv5VarK, (tp4) null), 2);
        gb9.D(l45Var, ((tn1) this.G).f.b(), null, new em1((tn1) this.G, tp4Var, 10), 2);
        gb9.D(l45Var, null, null, new em1((tn1) this.G, tp4Var, i2), 3);
        gb9.D(l45Var, null, null, new em1((tn1) this.G, tp4Var, 12), 3);
        gb9.D(l45Var, null, null, new em1((tn1) this.G, tp4Var, 13), 3);
        gb9.D(l45Var, null, null, new em1((tn1) this.G, tp4Var, 14), 3);
        gb9.D(l45Var, ((tn1) this.G).f.b(), null, new nn1((tn1) this.G, tp4Var, i), 2);
        gb9.D(l45Var, ((tn1) this.G).f.b(), null, new qn1(zv5VarK, (tn1) this.G, (tp4) null), 2);
        gb9.D(l45Var, ((tn1) this.G).f.b(), null, new o0(zv5VarK, (tn1) this.G, l45Var, tp4Var, 28), 2);
        gb9.D(l45Var, null, null, new em1((tn1) this.G, tp4Var, i3), 3);
        gb9.D(l45Var, null, null, new em1((tn1) this.G, tp4Var, 4), 3);
        gb9.D(l45Var, null, null, new em1((tn1) this.G, tp4Var, 5), 3);
        gb9.D(l45Var, null, null, new em1((tn1) this.G, tp4Var, 6), 3);
        gb9.D(l45Var, null, null, new em1((tn1) this.G, tp4Var, 7), 3);
        gb9.D(l45Var, ((tn1) this.G).f.b(), null, new em1((tn1) this.G, tp4Var, 8), 2);
        tn1 tn1Var3 = (tn1) this.G;
        dmc dmcVar = tn1Var3.v;
        int iH = tn1Var3.t.c.h();
        Visualizer visualizer = dmcVar.d;
        if (iH == 0) {
            if (visualizer != null) {
                visualizer.release();
            }
            dmcVar.d = null;
            byte[] bArr = dmcVar.a;
            Arrays.fill(bArr, 0, bArr.length, (byte) 0);
            dmcVar.b = null;
            dmcVar.c.setValue(Boolean.TRUE);
            return ieiVar;
        }
        if (visualizer != null) {
            try {
                visualizer.release();
            } catch (Exception e) {
                List list = xah.a;
                xah.f(e, "Bell Viz: Output setup failed", null, null, 28);
                dmcVar.c.setValue(Boolean.TRUE);
                return ieiVar;
            }
        }
        Visualizer visualizer2 = new Visualizer(iH);
        visualizer2.setCaptureSize(Visualizer.getCaptureSizeRange()[1]);
        visualizer2.setDataCaptureListener(new cmc(dmcVar), Visualizer.getMaxCaptureRate() / 2, false, true);
        visualizer2.setEnabled(false);
        dmcVar.d = visualizer2;
        return ieiVar;
    }

    private final Object n(Object obj) {
        sf5.h0(obj);
        v72 v72Var = (v72) this.F;
        nyj nyjVar = v72Var.d;
        el5 el5Var = v72Var.f;
        EventCreateV1Input eventCreateV1Input = (EventCreateV1Input) this.G;
        w72 w72Var = (w72) el5Var.G;
        eventCreateV1Input.getClass();
        ArrayList arrayList = new ArrayList();
        for (EventCreateV1InputNewEventsItem eventCreateV1InputNewEventsItem : eventCreateV1Input.getNew_events()) {
            try {
                String calendar_id = eventCreateV1InputNewEventsItem.getCalendar_id();
                if (calendar_id == null || !w72Var.d(calendar_id)) {
                    calendar_id = w72Var.c();
                }
                String str = calendar_id;
                if (str == null) {
                    arrayList.add(new EventCreateV1OutputEventCreateV1ResultCreateResultsItem((String) null, new EventCreateV1OutputEventCreateV1ResultCreateResultsItemError("no_calendar", "No valid calendar found"), (String) null, 5, (mq5) null));
                } else {
                    cpc cpcVarA = ((dpf) el5Var.H).A(str);
                    Uri uri = (Uri) cpcVarA.E;
                    Boolean bool = (Boolean) cpcVarA.F;
                    if (uri == null) {
                        arrayList.add(new EventCreateV1OutputEventCreateV1ResultCreateResultsItem((String) null, new EventCreateV1OutputEventCreateV1ResultCreateResultsItemError("no_calendar", "No valid calendar found"), (String) null, 5, (mq5) null));
                    } else {
                        Uri uriInsert = ((Context) el5Var.E).getContentResolver().insert(uri, el5Var.s(eventCreateV1InputNewEventsItem, str, bool));
                        ArrayList arrayList2 = null;
                        String lastPathSegment = uriInsert != null ? uriInsert.getLastPathSegment() : null;
                        if (lastPathSegment != null) {
                            el5Var.n(lastPathSegment, eventCreateV1InputNewEventsItem.getAttendees());
                            List<EventCreateV1InputNewEventsItemNudgesItem> nudges = eventCreateV1InputNewEventsItem.getNudges();
                            if (nudges != null) {
                                List<EventCreateV1InputNewEventsItemNudgesItem> list = nudges;
                                arrayList2 = new ArrayList(x44.y(list, 10));
                                for (EventCreateV1InputNewEventsItemNudgesItem eventCreateV1InputNewEventsItemNudgesItem : list) {
                                    Integer numValueOf = Integer.valueOf(eventCreateV1InputNewEventsItemNudgesItem.getMinutes_before());
                                    EventCreateV1InputNewEventsItemNudgesItemMethod method = eventCreateV1InputNewEventsItemNudgesItem.getMethod();
                                    int i = method == null ? -1 : yx6.a[method.ordinal()];
                                    int i2 = 2;
                                    if (i != 1) {
                                        i2 = i != 2 ? i != 3 ? 1 : 4 : 3;
                                    }
                                    arrayList2.add(new cpc(numValueOf, Integer.valueOf(i2)));
                                }
                            }
                            el5Var.o(lastPathSegment, arrayList2);
                            arrayList.add(new EventCreateV1OutputEventCreateV1ResultCreateResultsItem(str, (EventCreateV1OutputEventCreateV1ResultCreateResultsItemError) null, lastPathSegment, 2, (mq5) null));
                        } else {
                            arrayList.add(new EventCreateV1OutputEventCreateV1ResultCreateResultsItem((String) null, new EventCreateV1OutputEventCreateV1ResultCreateResultsItemError("creation_failed", "Failed to create event"), (String) null, 5, (mq5) null));
                        }
                    }
                }
            } catch (Exception e) {
                zfa.a.getClass();
                if (yfa.b()) {
                    String strE = iuj.E(el5Var);
                    CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : copyOnWriteArrayList) {
                        ((n30) ((zfa) obj2)).getClass();
                        arrayList3.add(obj2);
                    }
                    if (!arrayList3.isEmpty()) {
                        zfa.a.getClass();
                        String strK = ij0.k("Failed to create event: ", eventCreateV1InputNewEventsItem.getTitle(), ": ", gsk.c(e));
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            ((n30) ((zfa) it.next())).b(sfa.ERROR, strE, strK);
                        }
                    }
                }
                String message = e.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                arrayList.add(new EventCreateV1OutputEventCreateV1ResultCreateResultsItem((String) null, new EventCreateV1OutputEventCreateV1ResultCreateResultsItemError("exception", message), (String) null, 5, (mq5) null));
            }
        }
        EventCreateV1OutputEventCreateV1Result eventCreateV1OutputEventCreateV1Result = new EventCreateV1OutputEventCreateV1Result(arrayList);
        nyjVar.Z();
        nyjVar.c0();
        return eventCreateV1OutputEventCreateV1Result;
    }

    private final Object p(Object obj) {
        EventDeleteV0OutputEventDeleteResultDeleteResultsItem eventDeleteV0OutputEventDeleteResultDeleteResultsItem;
        String lastPathSegment;
        sf5.h0(obj);
        v72 v72Var = (v72) this.F;
        el5 el5Var = v72Var.f;
        nyj nyjVar = v72Var.d;
        EventDeleteV0Input eventDeleteV0Input = (EventDeleteV0Input) this.G;
        el5Var.getClass();
        eventDeleteV0Input.getClass();
        List<EventDeleteV0InputRemovedEventsItem> removed_events = eventDeleteV0Input.getRemoved_events();
        ArrayList arrayList = new ArrayList(x44.y(removed_events, 10));
        for (EventDeleteV0InputRemovedEventsItem eventDeleteV0InputRemovedEventsItem : removed_events) {
            EventDeleteV0InputRemovedEventsItemRecurrenceSpan recurrence_span = eventDeleteV0InputRemovedEventsItem.getRecurrence_span();
            if (recurrence_span instanceof EventDeleteV0InputRemovedEventsItemRecurrenceSpanRecurrenceSpanInstance) {
                String event_id = eventDeleteV0InputRemovedEventsItem.getEvent_id();
                String calendar_id = eventDeleteV0InputRemovedEventsItem.getCalendar_id();
                OffsetDateTime start_time = ((EventDeleteV0InputRemovedEventsItemRecurrenceSpanRecurrenceSpanInstance) recurrence_span).getStart_time();
                q28 q28Var = (q28) el5Var.I;
                q28Var.getClass();
                event_id.getClass();
                calendar_id.getClass();
                start_time.getClass();
                ContentValues contentValues = new ContentValues();
                contentValues.put("eventStatus", (Integer) 2);
                Uri uriJ = q28Var.j(event_id, calendar_id, start_time, contentValues, false);
                if (uriJ == null || (lastPathSegment = uriJ.getLastPathSegment()) == null) {
                    lastPathSegment = event_id;
                }
                eventDeleteV0OutputEventDeleteResultDeleteResultsItem = new EventDeleteV0OutputEventDeleteResultDeleteResultsItem(calendar_id, uriJ == null ? new EventDeleteV0OutputEventDeleteResultDeleteResultsItemError("not_found", "Unable to cancel recurrence instance for event: ".concat(event_id)) : null, lastPathSegment);
            } else {
                try {
                    int iDelete = ((Context) el5Var.E).getContentResolver().delete(CalendarContract.Events.CONTENT_URI.buildUpon().appendPath(eventDeleteV0InputRemovedEventsItem.getEvent_id()).build(), null, null);
                    String event_id2 = eventDeleteV0InputRemovedEventsItem.getEvent_id();
                    String calendar_id2 = eventDeleteV0InputRemovedEventsItem.getCalendar_id();
                    if (iDelete <= 0) {
                        eventDeleteV0OutputEventDeleteResultDeleteResultsItemError = new EventDeleteV0OutputEventDeleteResultDeleteResultsItemError("not_found", "Event not found or already deleted");
                    }
                    eventDeleteV0OutputEventDeleteResultDeleteResultsItem = new EventDeleteV0OutputEventDeleteResultDeleteResultsItem(calendar_id2, eventDeleteV0OutputEventDeleteResultDeleteResultsItemError, event_id2);
                } catch (Exception e) {
                    zfa.a.getClass();
                    if (yfa.b()) {
                        String strE = iuj.E(el5Var);
                        CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : copyOnWriteArrayList) {
                            ((n30) ((zfa) obj2)).getClass();
                            arrayList2.add(obj2);
                        }
                        if (!arrayList2.isEmpty()) {
                            zfa.a.getClass();
                            String strK = ij0.k("Failed to delete event: ", eventDeleteV0InputRemovedEventsItem.getEvent_id(), ": ", gsk.c(e));
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                ((n30) ((zfa) it.next())).b(sfa.ERROR, strE, strK);
                            }
                        }
                    }
                    String event_id3 = eventDeleteV0InputRemovedEventsItem.getEvent_id();
                    String calendar_id3 = eventDeleteV0InputRemovedEventsItem.getCalendar_id();
                    String message = e.getMessage();
                    if (message == null) {
                        message = "Unknown error";
                    }
                    eventDeleteV0OutputEventDeleteResultDeleteResultsItem = new EventDeleteV0OutputEventDeleteResultDeleteResultsItem(calendar_id3, new EventDeleteV0OutputEventDeleteResultDeleteResultsItemError("exception", message), event_id3);
                }
            }
            arrayList.add(eventDeleteV0OutputEventDeleteResultDeleteResultsItem);
        }
        EventDeleteV0OutputEventDeleteResult eventDeleteV0OutputEventDeleteResult = new EventDeleteV0OutputEventDeleteResult(arrayList);
        nyjVar.Z();
        nyjVar.c0();
        return eventDeleteV0OutputEventDeleteResult;
    }

    /* JADX WARN: Finally extract failed */
    private final Object r(Object obj) throws IOException {
        Instant instant;
        Instant instant2;
        sfa sfaVar = sfa.ERROR;
        sf5.h0(obj);
        v72 v72Var = (v72) this.F;
        v72Var.d.c0();
        dpf dpfVar = v72Var.e;
        EventSearchV0Input eventSearchV0Input = (EventSearchV0Input) this.G;
        Set set = (Set) v72Var.b.a();
        dpfVar.getClass();
        eventSearchV0Input.getClass();
        ContentResolver contentResolver = ((Context) dpfVar.F).getContentResolver();
        String[] strArr = {"event_id", "calendar_id", "title", "begin", "end", "allDay", "eventLocation", "description", "eventStatus", "availability", "organizer", "eventTimezone", "rrule"};
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        Set set2 = set;
        if (!set2.isEmpty()) {
            sb.append("calendar_id IN (" + w44.S0(set, ",", null, null, new hz6(2), 30) + ")");
            arrayList.addAll(set2);
        }
        String calendar_id = eventSearchV0Input.getCalendar_id();
        if (calendar_id != null) {
            if (sb.length() > 0) {
                sb.append(" AND ");
            }
            sb.append("calendar_id = ?");
            arrayList.add(calendar_id);
        }
        if (x44.r(eventSearchV0Input.getInclude_all_day(), Boolean.FALSE)) {
            if (sb.length() > 0) {
                sb.append(" AND ");
            }
            sb.append("allDay = 0");
        }
        EventSearchV0OutputEventSearchResult eventSearchV0OutputEventSearchResult = null;
        String string = sb.length() > 0 ? sb.toString() : null;
        zfa.a.getClass();
        boolean zB = yfa.b();
        sfa sfaVar2 = sfa.DEBUG;
        if (zB) {
            String strE = iuj.E(dpfVar);
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : copyOnWriteArrayList) {
                ((n30) ((zfa) obj2)).getClass();
                arrayList2.add(obj2);
            }
            if (!arrayList2.isEmpty()) {
                zfa.a.getClass();
                String str = "Querying events with selection: " + string + ", args: " + arrayList;
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfaVar2, strE, str);
                }
            }
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            OffsetDateTime start_time = eventSearchV0Input.getStart_time();
            long jA = (start_time == null || (instant2 = start_time.toInstant()) == null) ? ((mn5) dpfVar.G).a() : instant2.toEpochMilli();
            OffsetDateTime end_time = eventSearchV0Input.getEnd_time();
            Uri uriBuild = CalendarContract.Instances.CONTENT_URI.buildUpon().appendPath(String.valueOf(jA)).appendPath(String.valueOf((end_time == null || (instant = end_time.toInstant()) == null) ? 31104000000L + jA : instant.toEpochMilli())).build();
            Integer limit = eventSearchV0Input.getLimit();
            int iIntValue = limit != null ? limit.intValue() : 50;
            Cursor cursorQuery = contentResolver.query(uriBuild, strArr, string, (String[]) arrayList.toArray(new String[0]), "begin ASC");
            if (cursorQuery != null) {
                int i = 0;
                while (cursorQuery.moveToNext() && i < iIntValue) {
                    try {
                        try {
                            EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItem eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemS = dpfVar.S(cursorQuery, contentResolver);
                            String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("calendar_id"));
                            Object arrayList3 = linkedHashMap.get(string2);
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                                linkedHashMap.put(string2, arrayList3);
                            }
                            ((List) arrayList3).add(eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemS);
                            i++;
                        } catch (Exception e) {
                            zfa.a.getClass();
                            if (yfa.b()) {
                                String strE2 = iuj.E(dpfVar);
                                CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj3 : copyOnWriteArrayList2) {
                                    ((n30) ((zfa) obj3)).getClass();
                                    arrayList4.add(obj3);
                                }
                                if (!arrayList4.isEmpty()) {
                                    zfa.a.getClass();
                                    String str2 = "Failed to parse event from cursor: " + gsk.c(e);
                                    Iterator it2 = arrayList4.iterator();
                                    while (it2.hasNext()) {
                                        ((n30) ((zfa) it2.next())).b(sfaVar, strE2, str2);
                                    }
                                }
                            }
                            List list = xah.a;
                            xah.f(e, "Failed to parse calendar event", null, null, 28);
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            wd6.Z(cursorQuery, th);
                            throw th2;
                        }
                    }
                }
                cursorQuery.close();
            }
            zfa.a.getClass();
            if (yfa.b()) {
                String strE3 = iuj.E(dpfVar);
                CopyOnWriteArrayList copyOnWriteArrayList3 = yfa.b;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj4 : copyOnWriteArrayList3) {
                    ((n30) ((zfa) obj4)).getClass();
                    arrayList5.add(obj4);
                }
                if (!arrayList5.isEmpty()) {
                    zfa.a.getClass();
                    String str3 = "Found " + linkedHashMap.size() + " events";
                    Iterator it3 = arrayList5.iterator();
                    while (it3.hasNext()) {
                        ((n30) ((zfa) it3.next())).b(sfaVar2, strE3, str3);
                    }
                }
            }
            ArrayList arrayList6 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str4 = (String) entry.getKey();
                List list2 = (List) entry.getValue();
                String strB = ((w72) dpfVar.H).b(str4);
                if (strB == null) {
                    strB = "Unknown Calendar";
                }
                arrayList6.add(new EventSearchV0OutputEventSearchResultCalendarEventsItem(str4, strB, list2));
            }
            eventSearchV0OutputEventSearchResult = new EventSearchV0OutputEventSearchResult(w44.p1(arrayList6));
        } catch (Throwable th3) {
            zfa.a.getClass();
            if (yfa.b()) {
                String strE4 = iuj.E(dpfVar);
                CopyOnWriteArrayList copyOnWriteArrayList4 = yfa.b;
                ArrayList arrayList7 = new ArrayList();
                for (Object obj5 : copyOnWriteArrayList4) {
                    ((n30) ((zfa) obj5)).getClass();
                    arrayList7.add(obj5);
                }
                if (!arrayList7.isEmpty()) {
                    String strS = sq6.s(zfa.a, th3, "Failed to query events: ");
                    Iterator it4 = arrayList7.iterator();
                    while (it4.hasNext()) {
                        ((n30) ((zfa) it4.next())).b(sfaVar, strE4, strS);
                    }
                }
            }
            List list3 = xah.a;
            xah.f(th3, "Failed to query calendar events", null, null, 28);
        }
        return eventSearchV0OutputEventSearchResult != null ? eventSearchV0OutputEventSearchResult : new EventSearchV0OutputEventSearchError(EventSearchV0OutputEventSearchErrorErrorType.SEARCH_FAILED, "Failed to parse event data");
    }

    private final Object s(Object obj) {
        cpc cpcVar;
        String lastPathSegment;
        sf5.h0(obj);
        v72 v72Var = (v72) this.F;
        el5 el5Var = v72Var.f;
        nyj nyjVar = v72Var.d;
        EventUpdateV0Input eventUpdateV0Input = (EventUpdateV0Input) this.G;
        Context context = (Context) el5Var.E;
        eventUpdateV0Input.getClass();
        ArrayList arrayList = new ArrayList();
        for (EventUpdateV0InputEventUpdatesItem eventUpdateV0InputEventUpdatesItem : eventUpdateV0Input.getEvent_updates()) {
            try {
                ContentValues contentValuesT = el5.t(eventUpdateV0InputEventUpdatesItem);
                EventUpdateV0InputEventUpdatesItemRecurrenceSpan recurrence_span = eventUpdateV0InputEventUpdatesItem.getRecurrence_span();
                if (recurrence_span instanceof EventUpdateV0InputEventUpdatesItemRecurrenceSpanRecurrenceSpanInstance) {
                    String event_id = eventUpdateV0InputEventUpdatesItem.getEvent_id();
                    String calendar_id = eventUpdateV0InputEventUpdatesItem.getCalendar_id();
                    OffsetDateTime start_time = ((EventUpdateV0InputEventUpdatesItemRecurrenceSpanRecurrenceSpanInstance) recurrence_span).getStart_time();
                    contentValuesT.remove("dtend");
                    OffsetDateTime start_time2 = eventUpdateV0InputEventUpdatesItem.getStart_time();
                    if (start_time2 == null) {
                        start_time2 = ((EventUpdateV0InputEventUpdatesItemRecurrenceSpanRecurrenceSpanInstance) recurrence_span).getStart_time();
                    }
                    OffsetDateTime end_time = eventUpdateV0InputEventUpdatesItem.getEnd_time();
                    if (end_time != null) {
                        contentValuesT.put("duration", hjk.f(end_time.toInstant().toEpochMilli() - start_time2.toInstant().toEpochMilli()));
                    }
                    q28 q28Var = (q28) el5Var.I;
                    q28Var.getClass();
                    event_id.getClass();
                    calendar_id.getClass();
                    start_time.getClass();
                    Uri uriJ = q28Var.j(event_id, calendar_id, start_time, contentValuesT, true);
                    Boolean boolValueOf = Boolean.valueOf(uriJ != null);
                    if (uriJ != null && (lastPathSegment = uriJ.getLastPathSegment()) != null) {
                        event_id = lastPathSegment;
                    }
                    cpcVar = new cpc(boolValueOf, event_id);
                } else {
                    String event_id2 = eventUpdateV0InputEventUpdatesItem.getEvent_id();
                    cpcVar = new cpc(Boolean.valueOf(context.getContentResolver().update(CalendarContract.Events.CONTENT_URI.buildUpon().appendPath(event_id2).build(), contentValuesT, null, null) > 0), event_id2);
                }
                boolean zBooleanValue = ((Boolean) cpcVar.E).booleanValue();
                String str = (String) cpcVar.F;
                if (zBooleanValue) {
                    List<String> attendees = eventUpdateV0InputEventUpdatesItem.getAttendees();
                    if (attendees != null) {
                        context.getContentResolver().delete(CalendarContract.Attendees.CONTENT_URI, "event_id = ?", new String[]{str});
                        el5Var.n(str, attendees);
                    }
                    List<EventUpdateV0InputEventUpdatesItemNudgesItem> nudges = eventUpdateV0InputEventUpdatesItem.getNudges();
                    if (nudges != null) {
                        context.getContentResolver().delete(CalendarContract.Reminders.CONTENT_URI, "event_id = ?", new String[]{eventUpdateV0InputEventUpdatesItem.getEvent_id()});
                        List<EventUpdateV0InputEventUpdatesItemNudgesItem> list = nudges;
                        ArrayList arrayList2 = new ArrayList(x44.y(list, 10));
                        for (EventUpdateV0InputEventUpdatesItemNudgesItem eventUpdateV0InputEventUpdatesItemNudgesItem : list) {
                            Integer numValueOf = Integer.valueOf(eventUpdateV0InputEventUpdatesItemNudgesItem.getMinutes_before());
                            EventUpdateV0InputEventUpdatesItemNudgesItemMethod method = eventUpdateV0InputEventUpdatesItemNudgesItem.getMethod();
                            int i = method == null ? -1 : yx6.b[method.ordinal()];
                            int i2 = 2;
                            if (i != 1) {
                                i2 = i != 2 ? i != 3 ? 1 : 4 : 3;
                            }
                            arrayList2.add(new cpc(numValueOf, Integer.valueOf(i2)));
                        }
                        el5Var.o(str, arrayList2);
                    }
                    arrayList.add(new EventUpdateV0OutputEventUpdateResultUpdateResultsItem(eventUpdateV0InputEventUpdatesItem.getCalendar_id(), (EventUpdateV0OutputEventUpdateResultUpdateResultsItemError) null, str, (EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent) null, 8, (mq5) null));
                } else {
                    arrayList.add(new EventUpdateV0OutputEventUpdateResultUpdateResultsItem(eventUpdateV0InputEventUpdatesItem.getCalendar_id(), new EventUpdateV0OutputEventUpdateResultUpdateResultsItemError("not_found", "Event not found or could not be updated"), str, (EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent) null, 8, (mq5) null));
                }
            } catch (Exception e) {
                zfa.a.getClass();
                if (yfa.b()) {
                    String strE = iuj.E(el5Var);
                    CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : copyOnWriteArrayList) {
                        ((n30) ((zfa) obj2)).getClass();
                        arrayList3.add(obj2);
                    }
                    if (!arrayList3.isEmpty()) {
                        zfa.a.getClass();
                        String strK = ij0.k("Failed to update event: ", eventUpdateV0InputEventUpdatesItem.getEvent_id(), ": ", gsk.c(e));
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            ((n30) ((zfa) it.next())).b(sfa.ERROR, strE, strK);
                        }
                    }
                }
                String event_id3 = eventUpdateV0InputEventUpdatesItem.getEvent_id();
                String calendar_id2 = eventUpdateV0InputEventUpdatesItem.getCalendar_id();
                String message = e.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                arrayList.add(new EventUpdateV0OutputEventUpdateResultUpdateResultsItem(calendar_id2, new EventUpdateV0OutputEventUpdateResultUpdateResultsItemError("exception", message), event_id3, (EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent) null, 8, (mq5) null));
            }
        }
        EventUpdateV0OutputEventUpdateResult eventUpdateV0OutputEventUpdateResult = new EventUpdateV0OutputEventUpdateResult(arrayList);
        nyjVar.Z();
        nyjVar.c0();
        return eventUpdateV0OutputEventUpdateResult;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r9v3, types: [lm6] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.ArrayList] */
    private final Object t(Object obj) {
        ?? I1;
        List<CalendarSearchV0OutputCalendarSearchResultCalendarsItem> calendars;
        List<CalendarSearchV0OutputCalendarSearchResultCalendarsItem> calendars2;
        o82 o82Var = (o82) this.G;
        lsc lscVar = o82Var.g;
        lsc lscVar2 = o82Var.f;
        w72 w72Var = o82Var.b;
        lsc lscVar3 = o82Var.i;
        l45 l45Var = (l45) this.F;
        sf5.h0(obj);
        boolean zContains = true;
        try {
            try {
                CalendarSearchV0OutputCalendarSearchResult calendarSearchV0OutputCalendarSearchResultE = w72Var.e(true);
                CalendarSearchV0OutputCalendarSearchResult calendarSearchV0OutputCalendarSearchResultE2 = w72Var.e(false);
                Map mapA = o82Var.c.a();
                ?? arrayList = lm6.E;
                if (calendarSearchV0OutputCalendarSearchResultE == null || (calendars2 = calendarSearchV0OutputCalendarSearchResultE.getCalendars()) == null) {
                    I1 = arrayList;
                } else {
                    List<CalendarSearchV0OutputCalendarSearchResultCalendarsItem> list = calendars2;
                    ArrayList arrayList2 = new ArrayList(x44.y(list, 10));
                    for (CalendarSearchV0OutputCalendarSearchResultCalendarsItem calendarSearchV0OutputCalendarSearchResultCalendarsItem : list) {
                        String account_name = calendarSearchV0OutputCalendarSearchResultCalendarsItem.getAccount_name();
                        Set set = (Set) mapA.get(account_name == null ? "" : account_name);
                        String id = calendarSearchV0OutputCalendarSearchResultCalendarsItem.getId();
                        String name = calendarSearchV0OutputCalendarSearchResultCalendarsItem.getName();
                        if (set != null) {
                            zContains = set.contains(calendarSearchV0OutputCalendarSearchResultCalendarsItem.getId());
                        }
                        arrayList2.add(new k82(id, name, zContains, x44.r(calendarSearchV0OutputCalendarSearchResultCalendarsItem.is_primary(), Boolean.TRUE), account_name, calendarSearchV0OutputCalendarSearchResultCalendarsItem.getColor()));
                        zContains = true;
                    }
                    I1 = w44.i1(arrayList2, new mt7(12));
                }
                if (calendarSearchV0OutputCalendarSearchResultE2 != null && (calendars = calendarSearchV0OutputCalendarSearchResultE2.getCalendars()) != null) {
                    List<CalendarSearchV0OutputCalendarSearchResultCalendarsItem> list2 = calendars;
                    arrayList = new ArrayList(x44.y(list2, 10));
                    for (CalendarSearchV0OutputCalendarSearchResultCalendarsItem calendarSearchV0OutputCalendarSearchResultCalendarsItem2 : list2) {
                        String account_name2 = calendarSearchV0OutputCalendarSearchResultCalendarsItem2.getAccount_name();
                        Set set2 = (Set) mapA.get(account_name2 == null ? "" : account_name2);
                        arrayList.add(new k82(calendarSearchV0OutputCalendarSearchResultCalendarsItem2.getId(), calendarSearchV0OutputCalendarSearchResultCalendarsItem2.getName(), set2 == null ? false : set2.contains(calendarSearchV0OutputCalendarSearchResultCalendarsItem2.getId()), x44.r(calendarSearchV0OutputCalendarSearchResultCalendarsItem2.is_primary(), Boolean.TRUE), account_name2, calendarSearchV0OutputCalendarSearchResultCalendarsItem2.getColor()));
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : (Iterable) I1) {
                    String str = ((k82) obj2).c;
                    Object arrayList3 = linkedHashMap.get(str);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap.put(str, arrayList3);
                    }
                    ((List) arrayList3).add(obj2);
                }
                lscVar2.setValue(linkedHashMap);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj3 : (Iterable) arrayList) {
                    String str2 = ((k82) obj3).c;
                    Object arrayList4 = linkedHashMap2.get(str2);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                        linkedHashMap2.put(str2, arrayList4);
                    }
                    ((List) arrayList4).add(obj3);
                }
                lscVar.setValue(linkedHashMap2);
                int size = I1.size();
                int size2 = arrayList.size();
                sfa sfaVar = sfa.DEBUG;
                zfa.a.getClass();
                if (yfa.b()) {
                    String strE = iuj.E(l45Var);
                    CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj4 : copyOnWriteArrayList) {
                        ((n30) ((zfa) obj4)).getClass();
                        arrayList5.add(obj4);
                    }
                    if (!arrayList5.isEmpty()) {
                        zfa.a.getClass();
                        String str3 = "Loaded " + size + " visible calendars and " + size2 + " hidden calendars";
                        Iterator it = arrayList5.iterator();
                        while (it.hasNext()) {
                            ((n30) ((zfa) it.next())).b(sfaVar, strE, str3);
                        }
                    }
                }
            } catch (Exception e) {
                sfa sfaVar2 = sfa.ERROR;
                zfa.a.getClass();
                if (yfa.b()) {
                    String strE2 = iuj.E(l45Var);
                    CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj5 : copyOnWriteArrayList2) {
                        ((n30) ((zfa) obj5)).getClass();
                        arrayList6.add(obj5);
                    }
                    if (!arrayList6.isEmpty()) {
                        zfa.a.getClass();
                        String str4 = "Failed to load calendars: " + gsk.c(e);
                        Iterator it2 = arrayList6.iterator();
                        while (it2.hasNext()) {
                            ((n30) ((zfa) it2.next())).b(sfaVar2, strE2, str4);
                        }
                    }
                }
                nm6 nm6Var = nm6.E;
                lscVar2.setValue(nm6Var);
                lscVar.setValue(nm6Var);
            }
            lscVar3.setValue(Boolean.FALSE);
            return iei.a;
        } catch (Throwable th) {
            lscVar3.setValue(Boolean.FALSE);
            throw th;
        }
    }

    private final Object v(Object obj) {
        String str;
        sf5.h0(obj);
        uz2 uz2Var = (uz2) this.F;
        ChatMessage chatMessage = (ChatMessage) this.G;
        uz2Var.getClass();
        List<ContentBlock> content = chatMessage.getContent();
        if (content == null || content.size() != 1) {
            List<ContentBlock> content2 = chatMessage.getContent();
            SilentException.a(new SilentException("Human message has " + (content2 != null ? Integer.valueOf(content2.size()) : null) + " content blocks."), null, false, 3);
        }
        StringBuilder sb = new StringBuilder();
        List<ContentBlock> content3 = chatMessage.getContent();
        if (content3 != null) {
            for (ContentBlock contentBlock : content3) {
                boolean z = contentBlock instanceof TextBlock;
                if (z) {
                    sb.append(((TextBlock) contentBlock).getText());
                } else {
                    if (contentBlock instanceof ToolUseBlock) {
                        str = "tool_use";
                    } else if (contentBlock instanceof ToolResultBlock) {
                        str = "tool_result";
                    } else if (z) {
                        str = "text";
                    } else if (contentBlock instanceof ThinkingBlock) {
                        str = "thinking";
                    } else if (contentBlock instanceof VoiceNoteBlock) {
                        str = "voice_note";
                    } else if (contentBlock instanceof BellNoteBlock) {
                        str = "bell";
                    } else if (contentBlock instanceof FlagBlock) {
                        str = "flag";
                    } else {
                        if (!(contentBlock instanceof UnknownContentBlock)) {
                            wg6.i();
                            return null;
                        }
                        str = "unknown";
                    }
                    SilentException.a(new SilentException(ij0.j("Human message has content block of type ", str, ".")), null, false, 3);
                }
            }
        }
        return new vhd(chatMessage.m216getUuidPStrttk(), chatMessage.getIndex(), chatMessage.getInput_mode(), false, sb.toString(), chatMessage.getFiles(), chatMessage.getAttachments(), Long.valueOf(chatMessage.getCreated_at().getTime()));
    }

    private final Object w(Object obj) {
        Object hreVar;
        Object obj2;
        sf5.h0(obj);
        String partial_json = ((ToolUseBlock) this.G).getInput().getPartial_json();
        if (partial_json.length() == 0 || partial_json.equals("{}")) {
            return null;
        }
        try {
            hreVar = new JSONObject(partial_json).toString(2);
        } catch (Throwable th) {
            hreVar = new hre(th);
        }
        if (jre.a(hreVar) == null) {
            obj2 = hreVar;
        } else {
            ebh.A("Failed to parse tool input JSON", null, false, 3);
            obj2 = partial_json;
        }
        String str = (String) obj2;
        str.getClass();
        return new JsonBlockDisplayContent(str);
    }

    private final Object x(Object obj) {
        String str = (String) this.G;
        sf5.h0(obj);
        return Boolean.valueOf(str == null ? false : ModelId.m1061equalsimpl0(str, ((UpdateChatModelFallbackResponse) this.F).m287getModeli4oh0I()));
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new g9((h9) this.F, (String) this.G, tp4Var, 0);
            case 1:
                return new g9((List) this.F, (f03) this.G, tp4Var, 1);
            case 2:
                return new g9((kk) this.F, (String) this.G, tp4Var, 2);
            case 3:
                return new g9((qi3) this.F, (nwb) this.G, tp4Var, 3);
            case 4:
                return new g9((an) this.F, (wlg) this.G, tp4Var, 4);
            case 5:
                return new g9(tp4Var, (Context) this.F, (String) this.G);
            case 6:
                return new g9((e10) this.F, (String) this.G, tp4Var, 6);
            case 7:
                return new g9((xp0) this.F, (Integer) this.G, tp4Var, 7);
            case 8:
                return new g9((xq0) this.F, (String) this.G, tp4Var, 8);
            case 9:
                g9 g9Var = new g9((pz7) this.G, tp4Var, 9);
                g9Var.F = obj;
                return g9Var;
            case 10:
                g9 g9Var2 = new g9((File) this.G, tp4Var, 10);
                g9Var2.F = obj;
                return g9Var2;
            case 11:
                return new g9((Context) this.F, (File) this.G, tp4Var, 11);
            case 12:
                g9 g9Var3 = new g9((AudioDeviceInfo) this.G, tp4Var, 12);
                g9Var3.F = obj;
                return g9Var3;
            case 13:
                return new g9((p61) this.F, (dmc) this.G, tp4Var, 13);
            case 14:
                return new g9((p61) this.F, (y49) this.G, tp4Var, 14);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                g9 g9Var4 = new g9((ki1) this.G, tp4Var, 15);
                g9Var4.F = obj;
                return g9Var4;
            case 16:
                return new g9((pi1) this.F, (AudioFocusRequest) this.G, tp4Var, 16);
            case g.MAX_FIELD_NUMBER /* 17 */:
                g9 g9Var5 = new g9((tn1) this.G, tp4Var, 17);
                g9Var5.F = obj;
                return g9Var5;
            case g.AVG_FIELD_NUMBER /* 18 */:
                return new g9((v72) this.F, (EventCreateV1Input) this.G, tp4Var, 18);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new g9((v72) this.F, (EventDeleteV0Input) this.G, tp4Var, 19);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new g9((v72) this.F, (EventSearchV0Input) this.G, tp4Var, 20);
            case 21:
                return new g9((v72) this.F, (EventUpdateV0Input) this.G, tp4Var, 21);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                g9 g9Var6 = new g9((o82) this.G, tp4Var, 22);
                g9Var6.F = obj;
                return g9Var6;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new g9((hw2) this.F, (MessageAttachment) this.G, tp4Var, 23);
            case 24:
                return new g9((ny2) this.F, (String) this.G, tp4Var, 24);
            case BuildConfig.VERSION_CODE /* 25 */:
                return new g9((uz2) this.F, (ChatMessage) this.G, tp4Var, 25);
            case 26:
                g9 g9Var7 = new g9((cae) this.G, tp4Var, 26);
                g9Var7.F = obj;
                return g9Var7;
            case 27:
                g9 g9Var8 = new g9((ToolUseBlock) this.G, tp4Var, 27);
                g9Var8.F = obj;
                return g9Var8;
            case 28:
                g9 g9Var9 = new g9((UpdateChatModelFallbackResponse) this.F, tp4Var);
                ModelId modelId = (ModelId) obj;
                g9Var9.G = modelId != null ? modelId.m1064unboximpl() : null;
                return g9Var9;
            default:
                return new g9((t53) this.F, (hw2) this.G, tp4Var, 29);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((g9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 1:
                ((g9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 2:
                return ((g9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 3:
                ((g9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 4:
                ((g9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 5:
                ((g9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 6:
                return ((g9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 7:
                ((g9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 8:
                ((g9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 9:
                ((g9) create((gs0) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 10:
                return ((g9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 11:
                ((g9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 12:
                return ((g9) create((Integer) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 13:
                ((g9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 14:
                ((g9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((g9) create((aid) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 16:
                return ((g9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((g9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                return ((g9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ((g9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return ((g9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 21:
                return ((g9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((g9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((g9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 24:
                return ((g9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case BuildConfig.VERSION_CODE /* 25 */:
                return ((g9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 26:
                return ((g9) create((xi0) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 27:
                return ((g9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 28:
                ModelId modelId = (ModelId) obj;
                String strM1064unboximpl = modelId != null ? modelId.m1064unboximpl() : null;
                return ((g9) create(strM1064unboximpl != null ? ModelId.m1058boximpl(strM1064unboximpl) : null, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                ((g9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        Object hreVar;
        Object obj2;
        int i = 3;
        int i2 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.E) {
            case 0:
                String str = (String) this.G;
                Context context = ((h9) this.F).a;
                sf5.h0(obj);
                try {
                    ArrayList arrayList = new ArrayList();
                    String[] strArrDatabaseList = context.databaseList();
                    strArrDatabaseList.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    for (String str2 : strArrDatabaseList) {
                        str2.getClass();
                        if (bsg.u0(str2, str, false)) {
                            arrayList2.add(str2);
                        }
                    }
                    ArrayList<String> arrayList3 = new ArrayList();
                    for (Object obj3 : arrayList2) {
                        String str3 = (String) obj3;
                        List<String> list = h9.c;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            for (String str4 : list) {
                                str3.getClass();
                                if (isg.h0(str3, str4, false)) {
                                }
                                break;
                            }
                        }
                        arrayList3.add(obj3);
                    }
                    for (String str5 : arrayList3) {
                        if (!context.deleteDatabase(str5)) {
                            arrayList.add("db/" + str5);
                        }
                    }
                    File[] fileArrListFiles = new File(context.getFilesDir(), "datastores").listFiles();
                    if (fileArrListFiles == null) {
                        fileArrListFiles = new File[0];
                    }
                    ArrayList<File> arrayList4 = new ArrayList();
                    for (File file : fileArrListFiles) {
                        String name = file.getName();
                        name.getClass();
                        if (bsg.u0(name, str, false)) {
                            arrayList4.add(file);
                        }
                    }
                    for (File file2 : arrayList4) {
                        if (!file2.delete()) {
                            arrayList.add("datastore/" + file2.getName());
                        }
                    }
                    File[] fileArrListFiles2 = new File(context.getDataDir(), "shared_prefs").listFiles();
                    if (fileArrListFiles2 == null) {
                        fileArrListFiles2 = new File[0];
                    }
                    ArrayList<File> arrayList5 = new ArrayList();
                    for (File file3 : fileArrListFiles2) {
                        String name2 = file3.getName();
                        name2.getClass();
                        if (bsg.u0(name2, str, false)) {
                            arrayList5.add(file3);
                        }
                    }
                    for (File file4 : arrayList5) {
                        file4.getClass();
                        if (!context.deleteSharedPreferences(nk7.n0(file4))) {
                            arrayList.add("prefs/" + file4.getName());
                        }
                    }
                    if (arrayList.isEmpty()) {
                        List list2 = xah.a;
                        xah.e(6, "AccountStorageCleaner: wiped account storage", null, null);
                    } else {
                        SilentException.a(new SilentException("AccountStorageCleaner: failed to delete " + w44.S0(arrayList, null, null, null, null, 63)), ozf.F, false, 2);
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    SilentException.a(new SilentException("AccountStorageCleaner: unexpected exception", e2), ozf.G, false, 2);
                }
                return iei.a;
            case 1:
                sf5.h0(obj);
                List list3 = (List) this.F;
                List list4 = list3;
                if (list4 != null && !list4.isEmpty()) {
                    ((f03) this.G).c.e(new ChatEvents$RecentPhotosStripShown(list3.size()), ChatEvents$RecentPhotosStripShown.Companion.serializer());
                }
                return iei.a;
            case 2:
                sfa sfaVar = sfa.WARN;
                sf5.h0(obj);
                hdc hdcVar = ((kk) this.F).f;
                jie jieVar = new jie();
                String str6 = (String) this.G;
                jieVar.g(str6);
                pqe pqeVarF = new f4e(hdcVar, new kie(jieVar), false).f();
                try {
                    if (pqeVarF.U) {
                        BufferedSource bufferedSourceG0 = pqeVarF.K.G0();
                        if (bufferedSourceG0.j0(2000001L)) {
                            zfa.a.getClass();
                            if (yfa.b()) {
                                CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                                ArrayList arrayList6 = new ArrayList();
                                for (Object obj4 : copyOnWriteArrayList) {
                                    ((n30) ((zfa) obj4)).getClass();
                                    arrayList6.add(obj4);
                                }
                                if (!arrayList6.isEmpty()) {
                                    zfa.a.getClass();
                                    Iterator it = arrayList6.iterator();
                                    while (it.hasNext()) {
                                        ((n30) ((zfa) it.next())).b(sfaVar, "AgentChat", "Code fetch: body exceeds 2000000B cap, falling back to download");
                                    }
                                }
                            }
                        } else {
                            String strT0 = bufferedSourceG0.t0();
                            if (bsg.v0(strT0, (char) 0)) {
                                zfa.a.getClass();
                                if (yfa.b()) {
                                    CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                                    ArrayList arrayList7 = new ArrayList();
                                    for (Object obj5 : copyOnWriteArrayList2) {
                                        ((n30) ((zfa) obj5)).getClass();
                                        arrayList7.add(obj5);
                                    }
                                    if (!arrayList7.isEmpty()) {
                                        zfa.a.getClass();
                                        Iterator it2 = arrayList7.iterator();
                                        while (it2.hasNext()) {
                                            ((n30) ((zfa) it2.next())).b(sfaVar, "AgentChat", "Code fetch: NUL in body, not text");
                                        }
                                    }
                                }
                            } else {
                                obj = strT0;
                            }
                        }
                    } else {
                        zfa.a.getClass();
                        if (yfa.b()) {
                            CopyOnWriteArrayList copyOnWriteArrayList3 = yfa.b;
                            ArrayList arrayList8 = new ArrayList();
                            for (Object obj6 : copyOnWriteArrayList3) {
                                ((n30) ((zfa) obj6)).getClass();
                                arrayList8.add(obj6);
                            }
                            if (!arrayList8.isEmpty()) {
                                zfa.a.getClass();
                                String str7 = "Code fetch: HTTP " + pqeVarF.H + " for " + str6;
                                Iterator it3 = arrayList8.iterator();
                                while (it3.hasNext()) {
                                    ((n30) ((zfa) it3.next())).b(sfaVar, "AgentChat", str7);
                                }
                            }
                        }
                    }
                    pqeVarF.close();
                    return obj;
                } finally {
                    try {
                        throw th;
                    } catch (Throwable th) {
                        wd6.Z(pqeVarF, th);
                    }
                }
            case 3:
                sf5.h0(obj);
                nwb nwbVar = (nwb) this.G;
                y5f y5fVar = il.c;
                if (((pgc) nwbVar.getValue()) == pgc.E) {
                    ((qi3) this.F).e(new DispatchEvents$OnboardingIntroViewed(), DispatchEvents$OnboardingIntroViewed.Companion.serializer());
                }
                return iei.a;
            case 4:
                iei ieiVar = iei.a;
                an anVar = (an) this.F;
                sf5.h0(obj);
                if (((Boolean) ((wlg) this.G).getValue()).booleanValue() && !anVar.O()) {
                    ((vm) anVar.b).b.i.r(ieiVar);
                }
                return ieiVar;
            case 5:
                sf5.h0(obj);
                String str8 = (String) this.G;
                if (str8 != null) {
                    Context context2 = (Context) this.F;
                    context2.getClass();
                    str8.getClass();
                    int iHashCode = str8.hashCode();
                    synchronized (ysj.a) {
                        NotificationManager notificationManager = (NotificationManager) context2.getSystemService(NotificationManager.class);
                        if (notificationManager != null) {
                            notificationManager.cancel(iHashCode);
                        }
                        break;
                    }
                }
                return iei.a;
            case 6:
                sf5.h0(obj);
                e10 e10Var = (e10) this.F;
                String str9 = (String) this.G;
                oog oogVar = e10Var.G;
                if (oogVar != null) {
                    String strA = oogVar.a(3);
                    return strA == null ? str9 : strA;
                }
                x44.o0("storage");
                throw null;
            case 7:
                iei ieiVar2 = iei.a;
                sf5.h0(obj);
                xp0 xp0Var = (xp0) this.F;
                Integer num = (Integer) xp0Var.q.getValue();
                if (!x44.r(num, (Integer) this.G) && num != null && !((Boolean) xp0Var.r.getValue()).booleanValue()) {
                    xp0Var.j.i(wd6.e0(num.intValue(), 0, xp0Var.Q() - 1));
                }
                return ieiVar2;
            case 8:
                sf5.h0(obj);
                xq0 xq0Var = (xq0) this.F;
                xq0Var.g.e(new ArtifactSharingEvents$SharedArtifactInteraction(xq0Var.e.e, (String) this.G, ArtifactSharingEvents$SharedArtifactInteractionType.REMIX), ArtifactSharingEvents$SharedArtifactInteraction.Companion.serializer());
                return iei.a;
            case 9:
                gs0 gs0Var = (gs0) this.F;
                sf5.h0(obj);
                if (gs0Var == null) {
                    wg6.i();
                    return null;
                }
                pz7 pz7Var = (pz7) this.G;
                ChatId chatIdM978boximpl = ChatId.m978boximpl(gs0Var.a);
                String str10 = gs0Var.b;
                pz7Var.invoke(chatIdM978boximpl, str10 != null ? ProjectId.m1079boximpl(str10) : null);
                return iei.a;
            case 10:
                sf5.h0(obj);
                try {
                    hreVar = Boolean.valueOf(nk7.l0((File) this.G));
                    break;
                } catch (Throwable th2) {
                    hreVar = new hre(th2);
                }
                return new jre(hreVar);
            case 11:
                sf5.h0(obj);
                Context context3 = (Context) this.F;
                String strO = kgh.o(context3.getPackageName(), ".provider");
                File file5 = (File) this.G;
                Uri uriD = FileProvider.d(context3, strO, file5);
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("application/pdf");
                intent.putExtra("android.intent.extra.STREAM", uriD);
                intent.putExtra("android.intent.extra.SUBJECT", nk7.n0(file5));
                intent.addFlags(1);
                context3.startActivity(Intent.createChooser(intent, null).addFlags(268435456));
                return iei.a;
            case 12:
                Integer num2 = (Integer) this.F;
                sf5.h0(obj);
                return Boolean.valueOf(num2 != null && num2.intValue() == ((AudioDeviceInfo) this.G).getId());
            case 13:
                sf5.h0(obj);
                ((p61) this.F).F.b = (dmc) this.G;
                return iei.a;
            case 14:
                sf5.h0(obj);
                ((p61) this.F).F.c = (y49) this.G;
                return iei.a;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                aid aidVar = (aid) this.F;
                sf5.h0(obj);
                m6b m6bVar = ((ki1) this.G).l;
                if (m6bVar == null) {
                    sz6.j("encodedMicAudio collected before acquire() / after stop()");
                    return null;
                }
                qd qdVar = new qd(((gj1) ((ki1) this.G).e.F).a());
                tp4 tp4Var = null;
                gb9.D(aidVar, ((ki1) this.G).h.getDefault(), null, new m0((ki1) this.G, qdVar, tp4Var, 25), 2);
                gb9.D(aidVar, ((ki1) this.G).h.b(), null, new m0(m6bVar, aidVar, tp4Var, 26), 2);
                gb9.D(aidVar, ((ki1) this.G).h.b(), null, new ei1((ki1) this.G, tp4Var, objArr2 == true ? 1 : 0), 2);
                gb9.D(aidVar, ((ki1) this.G).h.b(), null, new fi1((ki1) this.G, tp4Var, objArr == true ? 1 : 0), 2);
                gb9.D(aidVar, ((ki1) this.G).h.getDefault(), null, new o0((ki1) this.G, m6bVar, qdVar, tp4Var, 21), 2);
                gb9.D(aidVar, ((ki1) this.G).h.b(), null, new ei1((ki1) this.G, tp4Var, z ? 1 : 0), 2);
                gb9.D(aidVar, ((ki1) this.G).h.b(), null, new ei1((ki1) this.G, tp4Var, i2), 2);
                gb9.D(aidVar, ((ki1) this.G).h.b(), null, new ei1((ki1) this.G, tp4Var, i), 2);
                return iei.a;
            case 16:
                sf5.h0(obj);
                AudioManager audioManager = ((pi1) this.F).a;
                if (audioManager != null) {
                    return new Integer(audioManager.abandonAudioFocusRequest((AudioFocusRequest) this.G));
                }
                return null;
            case g.MAX_FIELD_NUMBER /* 17 */:
                return d(obj);
            case g.AVG_FIELD_NUMBER /* 18 */:
                return n(obj);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return p(obj);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return r(obj);
            case 21:
                return s(obj);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return t(obj);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                sf5.h0(obj);
                ((hw2) this.F).f.a(lm6.E, x44.W((MessageAttachment) this.G));
                return iei.a;
            case 24:
                sf5.h0(obj);
                try {
                    return ((ny2) this.F).a.a((String) this.G);
                } catch (Throwable th3) {
                    List list5 = xah.a;
                    xah.f(th3, "Failed to parse markdown", null, null, 28);
                    return null;
                }
            case BuildConfig.VERSION_CODE /* 25 */:
                return v(obj);
            case 26:
                xi0 xi0Var = (xi0) this.F;
                sf5.h0(obj);
                Long l = xi0Var.c;
                return Boolean.valueOf((l != null ? l.longValue() : 0L) > ((cae) this.G).E);
            case 27:
                return w(obj);
            case 28:
                return x(obj);
            default:
                sf5.h0(obj);
                kdg kdgVar = ((t53) this.F).X0;
                int size = kdgVar.size() - 1;
                int iE = oq5.E(kdgVar);
                while (true) {
                    if ((size >= 0) != true) {
                        obj2 = null;
                    } else {
                        if (oq5.E(kdgVar) != iE) {
                            sz6.c();
                            return null;
                        }
                        oq5.o(size, kdgVar.size());
                        obj2 = kdgVar.get(size);
                        size--;
                        if (((whd) obj2) instanceof vhd) {
                        }
                    }
                }
                vhd vhdVar = obj2 instanceof vhd ? (vhd) obj2 : null;
                hw2 hw2Var = (hw2) this.G;
                pt2 pt2Var = hw2Var.f;
                String string = hw2Var.a0().toString();
                ArrayList arrayListF = pt2Var.f();
                ArrayList arrayListE = pt2Var.e();
                string.getClass();
                if (vhdVar != null ? new nv2(arrayListF, arrayListE, bsg.k1(string).toString()).equals(new nv2(vhdVar.f, vhdVar.g, bsg.k1(vhdVar.e).toString())) : false) {
                    cpk.e(hw2Var.D);
                    pt2Var.a.h();
                    lsc lscVar = hw2Var.K;
                    Boolean bool = Boolean.FALSE;
                    lscVar.setValue(bool);
                    hw2Var.H.setValue(null);
                    hw2Var.F.setValue(null);
                    hw2Var.G.setValue(null);
                    hw2Var.z.setValue(bool);
                }
                return iei.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9(UpdateChatModelFallbackResponse updateChatModelFallbackResponse, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 28;
        this.F = updateChatModelFallbackResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g9(Object obj, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g9(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }
}
