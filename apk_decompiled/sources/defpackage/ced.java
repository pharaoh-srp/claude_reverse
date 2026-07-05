package defpackage;

import com.anthropic.claude.tool.model.CalendarCreatePreviewData;
import com.anthropic.claude.tool.model.CalendarDeletePreviewData;
import com.anthropic.claude.tool.model.CalendarSearchPreviewData;
import com.anthropic.claude.tool.model.CalendarUpdatePreviewData;
import com.anthropic.claude.tool.model.LocationPreviewData;
import com.anthropic.claude.tool.model.PreviewData;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class ced {
    public static final /* synthetic */ ced a = new ced();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.tool.model.PreviewData", kceVar.b(PreviewData.class), new pl9[]{kceVar.b(CalendarCreatePreviewData.class), kceVar.b(CalendarDeletePreviewData.class), kceVar.b(CalendarSearchPreviewData.class), kceVar.b(CalendarUpdatePreviewData.class), kceVar.b(LocationPreviewData.class)}, new KSerializer[]{o62.a, r62.a, new lq6("com.anthropic.claude.tool.model.CalendarSearchPreviewData", CalendarSearchPreviewData.INSTANCE, new Annotation[0]), r82.a, new lq6("com.anthropic.claude.tool.model.LocationPreviewData", LocationPreviewData.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
