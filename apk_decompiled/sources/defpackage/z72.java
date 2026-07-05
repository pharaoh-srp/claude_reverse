package defpackage;

import com.anthropic.claude.tool.model.CalendarSearchV0Output;
import com.anthropic.claude.tool.model.CalendarSearchV0OutputCalendarSearchError;
import com.anthropic.claude.tool.model.CalendarSearchV0OutputCalendarSearchResult;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class z72 {
    public static final /* synthetic */ z72 a = new z72();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.tool.model.CalendarSearchV0Output", kceVar.b(CalendarSearchV0Output.class), new pl9[]{kceVar.b(CalendarSearchV0OutputCalendarSearchError.class), kceVar.b(CalendarSearchV0OutputCalendarSearchResult.class)}, new KSerializer[]{a82.a, e82.a}, new Annotation[]{new gl0(1)});
    }
}
