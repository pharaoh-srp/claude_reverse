package defpackage;

import com.anthropic.claude.tool.model.EventSearchV0Output;
import com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchError;
import com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchResult;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class n07 {
    public static final /* synthetic */ n07 a = new n07();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.tool.model.EventSearchV0Output", kceVar.b(EventSearchV0Output.class), new pl9[]{kceVar.b(EventSearchV0OutputEventSearchError.class), kceVar.b(EventSearchV0OutputEventSearchResult.class)}, new KSerializer[]{o07.a, s07.a}, new Annotation[]{new gl0(1)});
    }
}
