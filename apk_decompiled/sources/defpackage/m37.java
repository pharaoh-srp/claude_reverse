package defpackage;

import com.anthropic.claude.tool.model.EventUpdateV0Output;
import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateError;
import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResult;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class m37 {
    public static final /* synthetic */ m37 a = new m37();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.tool.model.EventUpdateV0Output", kceVar.b(EventUpdateV0Output.class), new pl9[]{kceVar.b(EventUpdateV0OutputEventUpdateError.class), kceVar.b(EventUpdateV0OutputEventUpdateResult.class)}, new KSerializer[]{n37.a, r37.a}, new Annotation[]{new gl0(1)});
    }
}
