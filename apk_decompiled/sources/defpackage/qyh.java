package defpackage;

import com.anthropic.claude.api.chat.tool.ToolResultContent;
import com.anthropic.claude.api.chat.tool.ToolResultImage;
import com.anthropic.claude.api.chat.tool.ToolResultImageGallery;
import com.anthropic.claude.api.chat.tool.ToolResultKnowledge;
import com.anthropic.claude.api.chat.tool.ToolResultText;
import com.anthropic.claude.api.chat.tool.ToolResultUnknown;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.a;

/* JADX INFO: loaded from: classes.dex */
public final class qyh {
    public static final /* synthetic */ qyh a = new qyh();
    public static final nnf b;

    static {
        a aVar = new a();
        kce kceVar = jce.a;
        w3c w3cVar = new w3c(kceVar.b(ToolResultContent.class));
        w3cVar.e(kceVar.b(ToolResultText.class), ToolResultText.Companion.serializer());
        w3cVar.e(kceVar.b(ToolResultKnowledge.class), ToolResultKnowledge.Companion.serializer());
        w3cVar.e(kceVar.b(ToolResultImageGallery.class), ToolResultImageGallery.Companion.serializer());
        w3cVar.e(kceVar.b(ToolResultImage.class), ToolResultImage.Companion.serializer());
        w3cVar.b(new yeg(22));
        w3cVar.a(aVar);
        b = aVar.b();
    }

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.api.chat.tool.ToolResultContent", kceVar.b(ToolResultContent.class), new pl9[]{kceVar.b(ToolResultImage.class), kceVar.b(ToolResultImageGallery.class), kceVar.b(ToolResultKnowledge.class), kceVar.b(ToolResultText.class), kceVar.b(ToolResultUnknown.class)}, new KSerializer[]{syh.a, uyh.a, wyh.a, dzh.a, fzh.a}, new Annotation[]{new gl0(14)});
    }
}
