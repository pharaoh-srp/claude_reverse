package defpackage;

import com.anthropic.claude.api.chat.messages.BellNoteDelta;
import com.anthropic.claude.api.chat.messages.CitationEndDelta;
import com.anthropic.claude.api.chat.messages.CitationStartDelta;
import com.anthropic.claude.api.chat.messages.ContentBlockDelta;
import com.anthropic.claude.api.chat.messages.FlagDelta;
import com.anthropic.claude.api.chat.messages.InputJsonDelta;
import com.anthropic.claude.api.chat.messages.TextDelta;
import com.anthropic.claude.api.chat.messages.ThinkingDelta;
import com.anthropic.claude.api.chat.messages.ThinkingSummaryDelta;
import com.anthropic.claude.api.chat.messages.ToolUseBlockUpdateDelta;
import com.anthropic.claude.api.chat.messages.VoiceNoteDelta;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.a;

/* JADX INFO: loaded from: classes.dex */
public final class cn4 {
    public static final /* synthetic */ cn4 a = new cn4();
    public static final nnf b;

    static {
        a aVar = new a();
        kce kceVar = jce.a;
        w3c w3cVar = new w3c(kceVar.b(ContentBlockDelta.class));
        w3cVar.e(kceVar.b(TextDelta.class), TextDelta.Companion.serializer());
        w3cVar.e(kceVar.b(CitationStartDelta.class), CitationStartDelta.Companion.serializer());
        w3cVar.e(kceVar.b(CitationEndDelta.class), CitationEndDelta.Companion.serializer());
        w3cVar.e(kceVar.b(InputJsonDelta.class), InputJsonDelta.Companion.serializer());
        w3cVar.e(kceVar.b(ThinkingDelta.class), ThinkingDelta.Companion.serializer());
        w3cVar.e(kceVar.b(ThinkingSummaryDelta.class), ThinkingSummaryDelta.Companion.serializer());
        w3cVar.e(kceVar.b(ToolUseBlockUpdateDelta.class), ToolUseBlockUpdateDelta.Companion.serializer());
        w3cVar.e(kceVar.b(VoiceNoteDelta.class), VoiceNoteDelta.Companion.serializer());
        w3cVar.e(kceVar.b(FlagDelta.class), FlagDelta.Companion.serializer());
        w3cVar.b(new a73(18));
        w3cVar.a(aVar);
        b = aVar.b();
    }

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.api.chat.messages.ContentBlockDelta", kceVar.b(ContentBlockDelta.class), new pl9[]{kceVar.b(BellNoteDelta.class), kceVar.b(CitationEndDelta.class), kceVar.b(CitationStartDelta.class), kceVar.b(FlagDelta.class), kceVar.b(InputJsonDelta.class), kceVar.b(TextDelta.class), kceVar.b(ThinkingDelta.class), kceVar.b(ThinkingSummaryDelta.class), kceVar.b(ToolUseBlockUpdateDelta.class), kceVar.b(VoiceNoteDelta.class)}, new KSerializer[]{qm1.a, gg3.a, pg3.a, cn7.a, f49.a, ueh.a, xlh.a, omh.a, y0i.a, s4j.a}, new Annotation[]{new gl0(3)});
    }
}
