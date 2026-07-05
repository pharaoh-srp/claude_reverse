package defpackage;

import com.anthropic.claude.api.chat.messages.CompactionStatusEvent;
import com.anthropic.claude.api.chat.messages.ContentBlockDeltaEvent;
import com.anthropic.claude.api.chat.messages.ContentBlockRetractEvent;
import com.anthropic.claude.api.chat.messages.ContentBlockStartEvent;
import com.anthropic.claude.api.chat.messages.ContentBlockStopEvent;
import com.anthropic.claude.api.chat.messages.ConversationReadyEvent;
import com.anthropic.claude.api.chat.messages.McpAuthRequiredEvent;
import com.anthropic.claude.api.chat.messages.MessageDeltaEvent;
import com.anthropic.claude.api.chat.messages.MessageLimitEvent;
import com.anthropic.claude.api.chat.messages.MessageStartEvent;
import com.anthropic.claude.api.chat.messages.MessageStopEvent;
import com.anthropic.claude.api.chat.messages.ModelUpdateEvent;
import com.anthropic.claude.api.chat.messages.StreamEvent;
import com.anthropic.claude.api.chat.messages.UnknownStreamEvent;
import com.anthropic.claude.api.chat.messages.c;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.a;

/* JADX INFO: loaded from: classes.dex */
public final class ypg {
    public static final /* synthetic */ ypg a = new ypg();
    public static final nnf b;

    static {
        a aVar = new a();
        kce kceVar = jce.a;
        w3c w3cVar = new w3c(kceVar.b(StreamEvent.class));
        w3cVar.e(kceVar.b(MessageStartEvent.class), MessageStartEvent.Companion.serializer());
        w3cVar.e(kceVar.b(MessageDeltaEvent.class), MessageDeltaEvent.Companion.serializer());
        w3cVar.e(kceVar.b(MessageLimitEvent.class), MessageLimitEvent.Companion.serializer());
        w3cVar.e(kceVar.b(MessageStopEvent.class), MessageStopEvent.Companion.serializer());
        w3cVar.e(kceVar.b(ContentBlockStartEvent.class), ContentBlockStartEvent.Companion.serializer());
        w3cVar.e(kceVar.b(ContentBlockDeltaEvent.class), ContentBlockDeltaEvent.Companion.serializer());
        w3cVar.e(kceVar.b(ContentBlockStopEvent.class), ContentBlockStopEvent.Companion.serializer());
        w3cVar.e(kceVar.b(ContentBlockRetractEvent.class), ContentBlockRetractEvent.Companion.serializer());
        w3cVar.e(kceVar.b(ModelUpdateEvent.class), ModelUpdateEvent.Companion.serializer());
        w3cVar.e(kceVar.b(ConversationReadyEvent.class), ConversationReadyEvent.Companion.serializer());
        w3cVar.e(kceVar.b(CompactionStatusEvent.class), CompactionStatusEvent.Companion.serializer());
        w3cVar.e(kceVar.b(McpAuthRequiredEvent.class), McpAuthRequiredEvent.Companion.serializer());
        w3cVar.b(new yeg(3));
        w3cVar.a(aVar);
        b = aVar.b();
    }

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.api.chat.messages.StreamEvent", kceVar.b(StreamEvent.class), new pl9[]{kceVar.b(CompactionStatusEvent.class), kceVar.b(ContentBlockDeltaEvent.class), kceVar.b(ContentBlockRetractEvent.class), kceVar.b(ContentBlockStartEvent.class), kceVar.b(ContentBlockStopEvent.class), kceVar.b(ConversationReadyEvent.class), kceVar.b(McpAuthRequiredEvent.class), kceVar.b(MessageDeltaEvent.class), kceVar.b(MessageLimitEvent.class), kceVar.b(MessageStartEvent.class), kceVar.b(MessageStopEvent.class), kceVar.b(ModelUpdateEvent.class), kceVar.b(UnknownStreamEvent.class)}, new KSerializer[]{c.a, dn4.a, fn4.a, hn4.a, jn4.a, pq4.a, a0b.a, ufb.a, rhb.a, sib.a, uib.a, zpb.a, zei.a}, new Annotation[]{new gl0(11)});
    }
}
