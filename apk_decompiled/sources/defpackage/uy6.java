package defpackage;

import com.anthropic.claude.tool.model.EventDeleteV0Output;
import com.anthropic.claude.tool.model.EventDeleteV0OutputEventDeleteError;
import com.anthropic.claude.tool.model.EventDeleteV0OutputEventDeleteResult;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class uy6 {
    public static final /* synthetic */ uy6 a = new uy6();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.tool.model.EventDeleteV0Output", kceVar.b(EventDeleteV0Output.class), new pl9[]{kceVar.b(EventDeleteV0OutputEventDeleteError.class), kceVar.b(EventDeleteV0OutputEventDeleteResult.class)}, new KSerializer[]{vy6.a, zy6.a}, new Annotation[]{new gl0(1)});
    }
}
