package defpackage;

import com.anthropic.claude.api.chat.tool.GenericSourceMetadata;
import com.anthropic.claude.api.chat.tool.GoogleDocMetadata;
import com.anthropic.claude.api.chat.tool.SourceMetadata;
import com.anthropic.claude.api.chat.tool.UnknownSourceMetadata;
import com.anthropic.claude.api.chat.tool.WebpageMetadata;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.a;

/* JADX INFO: loaded from: classes.dex */
public final class zeg {
    public static final /* synthetic */ zeg a = new zeg();
    public static final nnf b;

    static {
        a aVar = new a();
        kce kceVar = jce.a;
        w3c w3cVar = new w3c(kceVar.b(SourceMetadata.class));
        w3cVar.e(kceVar.b(GoogleDocMetadata.class), GoogleDocMetadata.Companion.serializer());
        w3cVar.e(kceVar.b(WebpageMetadata.class), WebpageMetadata.Companion.serializer());
        w3cVar.e(kceVar.b(GenericSourceMetadata.class), GenericSourceMetadata.Companion.serializer());
        w3cVar.b(new yeg(0));
        w3cVar.a(aVar);
        b = aVar.b();
    }

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.api.chat.tool.SourceMetadata", kceVar.b(SourceMetadata.class), new pl9[]{kceVar.b(GenericSourceMetadata.class), kceVar.b(GoogleDocMetadata.class), kceVar.b(UnknownSourceMetadata.class), kceVar.b(WebpageMetadata.class)}, new KSerializer[]{a38.a, k88.a, xei.a, r8j.a}, new Annotation[]{new gl0(10)});
    }
}
