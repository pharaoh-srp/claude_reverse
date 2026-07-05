package defpackage;

import com.anthropic.claude.tool.model.EventCreateV1Output;
import com.anthropic.claude.tool.model.EventCreateV1OutputEventCreateV1Error;
import com.anthropic.claude.tool.model.EventCreateV1OutputEventCreateV1Result;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class mx6 {
    public static final /* synthetic */ mx6 a = new mx6();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.tool.model.EventCreateV1Output", kceVar.b(EventCreateV1Output.class), new pl9[]{kceVar.b(EventCreateV1OutputEventCreateV1Error.class), kceVar.b(EventCreateV1OutputEventCreateV1Result.class)}, new KSerializer[]{nx6.a, rx6.a}, new Annotation[]{new gl0(1)});
    }
}
