package defpackage;

import com.anthropic.claude.api.chat.tool.CodeBlockDisplayContent;
import com.anthropic.claude.api.chat.tool.JsonBlockDisplayContent;
import com.anthropic.claude.api.chat.tool.RichItemsDisplayContent;
import com.anthropic.claude.api.chat.tool.RichLinkDisplayContent;
import com.anthropic.claude.api.chat.tool.TableDisplayContent;
import com.anthropic.claude.api.chat.tool.TextDisplayContent;
import com.anthropic.claude.api.chat.tool.ToolDisplayContent;
import com.anthropic.claude.api.chat.tool.UnknownDisplayContent;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.a;

/* JADX INFO: loaded from: classes.dex */
public final class qwh {
    public static final /* synthetic */ qwh a = new qwh();
    public static final nnf b;

    static {
        a aVar = new a();
        kce kceVar = jce.a;
        w3c w3cVar = new w3c(kceVar.b(ToolDisplayContent.class));
        w3cVar.e(kceVar.b(CodeBlockDisplayContent.class), CodeBlockDisplayContent.Companion.serializer());
        w3cVar.e(kceVar.b(JsonBlockDisplayContent.class), JsonBlockDisplayContent.Companion.serializer());
        w3cVar.e(kceVar.b(TableDisplayContent.class), TableDisplayContent.Companion.serializer());
        w3cVar.e(kceVar.b(RichItemsDisplayContent.class), RichItemsDisplayContent.Companion.serializer());
        w3cVar.e(kceVar.b(RichLinkDisplayContent.class), RichLinkDisplayContent.Companion.serializer());
        w3cVar.b(new yeg(20));
        w3cVar.a(aVar);
        b = aVar.b();
    }

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.api.chat.tool.ToolDisplayContent", kceVar.b(ToolDisplayContent.class), new pl9[]{kceVar.b(CodeBlockDisplayContent.class), kceVar.b(JsonBlockDisplayContent.class), kceVar.b(RichItemsDisplayContent.class), kceVar.b(RichLinkDisplayContent.class), kceVar.b(TableDisplayContent.class), kceVar.b(TextDisplayContent.class), kceVar.b(UnknownDisplayContent.class)}, new KSerializer[]{qq3.a, mg9.a, use.a, wse.a, h3h.a, xeh.a, rei.a}, new Annotation[]{new gl0(13)});
    }
}
