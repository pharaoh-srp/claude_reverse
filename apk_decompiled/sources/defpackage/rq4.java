package defpackage;

import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.api.chat.ConversationSearchHit;
import com.anthropic.claude.api.chat.MatchedSnippet;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rq4 implements w28 {
    public static final rq4 a;
    private static final SerialDescriptor descriptor;

    static {
        rq4 rq4Var = new rq4();
        a = rq4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.chat.ConversationSearchHit", rq4Var, 3);
        pluginGeneratedSerialDescriptor.j("conversation", false);
        pluginGeneratedSerialDescriptor.j("matched_snippet", true);
        pluginGeneratedSerialDescriptor.j("title_matches", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{cn2.a, d4c.S(kva.a), ConversationSearchHit.$childSerializers[2].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ConversationSearchHit.$childSerializers;
        boolean z = true;
        int i = 0;
        ChatConversationWithProjectReference chatConversationWithProjectReference = null;
        MatchedSnippet matchedSnippet = null;
        List list = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                chatConversationWithProjectReference = (ChatConversationWithProjectReference) ud4VarC.l(serialDescriptor, 0, cn2.a, chatConversationWithProjectReference);
                i |= 1;
            } else if (iX == 1) {
                matchedSnippet = (MatchedSnippet) ud4VarC.m(serialDescriptor, 1, kva.a, matchedSnippet);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                list = (List) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), list);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ConversationSearchHit(i, chatConversationWithProjectReference, matchedSnippet, list, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ConversationSearchHit conversationSearchHit = (ConversationSearchHit) obj;
        encoder.getClass();
        conversationSearchHit.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ConversationSearchHit.write$Self$api(conversationSearchHit, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
