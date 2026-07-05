package defpackage;

import com.anthropic.claude.api.chat.MessageBlobFile;
import com.anthropic.claude.api.chat.MessageDocumentFile;
import com.anthropic.claude.api.chat.MessageFile;
import com.anthropic.claude.api.chat.MessageImageFile;
import com.anthropic.claude.api.chat.MessageUnknownFile;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.a;

/* JADX INFO: loaded from: classes.dex */
public final class kgb {
    public static final /* synthetic */ kgb a = new kgb();
    public static final nnf b;

    static {
        a aVar = new a();
        kce kceVar = jce.a;
        w3c w3cVar = new w3c(kceVar.b(MessageFile.class));
        w3cVar.e(kceVar.b(MessageImageFile.class), MessageImageFile.Companion.serializer());
        w3cVar.e(kceVar.b(MessageDocumentFile.class), MessageDocumentFile.Companion.serializer());
        w3cVar.e(kceVar.b(MessageBlobFile.class), MessageBlobFile.Companion.serializer());
        w3cVar.b(new xga(10));
        w3cVar.a(aVar);
        b = aVar.b();
    }

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.api.chat.MessageFile", kceVar.b(MessageFile.class), new pl9[]{kceVar.b(MessageBlobFile.class), kceVar.b(MessageDocumentFile.class), kceVar.b(MessageImageFile.class), kceVar.b(MessageUnknownFile.class)}, new KSerializer[]{qeb.a, yfb.a, ihb.a, wib.a}, new Annotation[]{new gl0(8)});
    }
}
