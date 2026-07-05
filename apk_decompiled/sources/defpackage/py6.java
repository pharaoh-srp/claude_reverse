package defpackage;

import com.anthropic.claude.tool.model.EventDeleteV0InputRemovedEventsItemRecurrenceSpan;
import com.anthropic.claude.tool.model.EventDeleteV0InputRemovedEventsItemRecurrenceSpanRecurrenceSpanInstance;
import com.anthropic.claude.tool.model.EventDeleteV0InputRemovedEventsItemRecurrenceSpanRecurrenceSpanSeries;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class py6 {
    public static final /* synthetic */ py6 a = new py6();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.tool.model.EventDeleteV0InputRemovedEventsItemRecurrenceSpan", kceVar.b(EventDeleteV0InputRemovedEventsItemRecurrenceSpan.class), new pl9[]{kceVar.b(EventDeleteV0InputRemovedEventsItemRecurrenceSpanRecurrenceSpanInstance.class), kceVar.b(EventDeleteV0InputRemovedEventsItemRecurrenceSpanRecurrenceSpanSeries.class)}, new KSerializer[]{qy6.a, sy6.a}, new Annotation[]{new pi(21)});
    }
}
