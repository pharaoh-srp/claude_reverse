package defpackage;

import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemRecurrenceSpan;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemRecurrenceSpanRecurrenceSpanInstance;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemRecurrenceSpanRecurrenceSpanSeries;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class f37 {
    public static final /* synthetic */ f37 a = new f37();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemRecurrenceSpan", kceVar.b(EventUpdateV0InputEventUpdatesItemRecurrenceSpan.class), new pl9[]{kceVar.b(EventUpdateV0InputEventUpdatesItemRecurrenceSpanRecurrenceSpanInstance.class), kceVar.b(EventUpdateV0InputEventUpdatesItemRecurrenceSpanRecurrenceSpanSeries.class)}, new KSerializer[]{g37.a, i37.a}, new Annotation[]{new pi(21)});
    }
}
