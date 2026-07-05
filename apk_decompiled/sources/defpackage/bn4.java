package defpackage;

import com.anthropic.claude.api.chat.messages.BellNoteBlock;
import com.anthropic.claude.api.chat.messages.ContentBlock;
import com.anthropic.claude.api.chat.messages.FlagBlock;
import com.anthropic.claude.api.chat.messages.TextBlock;
import com.anthropic.claude.api.chat.messages.ThinkingBlock;
import com.anthropic.claude.api.chat.messages.ToolResultBlock;
import com.anthropic.claude.api.chat.messages.ToolUseBlock;
import com.anthropic.claude.api.chat.messages.UnknownContentBlock;
import com.anthropic.claude.api.chat.messages.VoiceNoteBlock;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.a;

/* JADX INFO: loaded from: classes.dex */
public final class bn4 {
    public static final /* synthetic */ bn4 a = new bn4();
    public static final nnf b;

    static {
        a aVar = new a();
        kce kceVar = jce.a;
        w3c w3cVar = new w3c(kceVar.b(ContentBlock.class));
        w3cVar.e(kceVar.b(TextBlock.class), TextBlock.Companion.serializer());
        w3cVar.e(kceVar.b(ToolUseBlock.class), ToolUseBlock.Companion.serializer());
        w3cVar.e(kceVar.b(ToolResultBlock.class), ToolResultBlock.Companion.serializer());
        w3cVar.e(kceVar.b(ThinkingBlock.class), ThinkingBlock.Companion.serializer());
        w3cVar.e(kceVar.b(VoiceNoteBlock.class), VoiceNoteBlock.Companion.serializer());
        w3cVar.e(kceVar.b(FlagBlock.class), FlagBlock.Companion.serializer());
        w3cVar.b(new a73(17));
        w3cVar.a(aVar);
        b = aVar.b();
    }

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.api.chat.messages.ContentBlock", kceVar.b(ContentBlock.class), new pl9[]{kceVar.b(BellNoteBlock.class), kceVar.b(FlagBlock.class), kceVar.b(TextBlock.class), kceVar.b(ThinkingBlock.class), kceVar.b(ToolResultBlock.class), kceVar.b(ToolUseBlock.class), kceVar.b(UnknownContentBlock.class), kceVar.b(VoiceNoteBlock.class)}, new KSerializer[]{om1.a, an7.a, odh.a, tlh.a, oyh.a, w0i.a, nei.a, q4j.a}, new Annotation[]{new gl0(2)});
    }
}
