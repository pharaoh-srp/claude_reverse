package defpackage;

import com.anthropic.claude.analytics.events.ChatListEvents$ConversationSearchEntryPoint;
import com.anthropic.claude.analytics.events.ChatListEvents$ConversationSearchOutcome;
import com.anthropic.claude.analytics.events.ChatListEvents$ConversationSearchSessionEnded;
import com.anthropic.claude.analytics.events.ChatListEvents$ConversationSearchVersion;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wx2 implements w28 {
    public static final wx2 a;
    private static final SerialDescriptor descriptor;

    static {
        wx2 wx2Var = new wx2();
        a = wx2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.conversation_search.session_ended", wx2Var, 5);
        pluginGeneratedSerialDescriptor.j("entry_point", false);
        pluginGeneratedSerialDescriptor.j("outcome", false);
        pluginGeneratedSerialDescriptor.j("total_time_ms", false);
        pluginGeneratedSerialDescriptor.j("search_version", false);
        pluginGeneratedSerialDescriptor.j("search_version_str", true);
        pluginGeneratedSerialDescriptor.k(new pi(11));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ChatListEvents$ConversationSearchSessionEnded.$childSerializers;
        return new KSerializer[]{kw9VarArr[0].getValue(), kw9VarArr[1].getValue(), xka.a, kw9VarArr[3].getValue(), d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ChatListEvents$ConversationSearchSessionEnded.$childSerializers;
        int i = 0;
        ChatListEvents$ConversationSearchEntryPoint chatListEvents$ConversationSearchEntryPoint = null;
        ChatListEvents$ConversationSearchOutcome chatListEvents$ConversationSearchOutcome = null;
        ChatListEvents$ConversationSearchVersion chatListEvents$ConversationSearchVersion = null;
        String str = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                chatListEvents$ConversationSearchEntryPoint = (ChatListEvents$ConversationSearchEntryPoint) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), chatListEvents$ConversationSearchEntryPoint);
                i |= 1;
            } else if (iX == 1) {
                chatListEvents$ConversationSearchOutcome = (ChatListEvents$ConversationSearchOutcome) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), chatListEvents$ConversationSearchOutcome);
                i |= 2;
            } else if (iX == 2) {
                j = ud4VarC.j(serialDescriptor, 2);
                i |= 4;
            } else if (iX == 3) {
                chatListEvents$ConversationSearchVersion = (ChatListEvents$ConversationSearchVersion) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), chatListEvents$ConversationSearchVersion);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatListEvents$ConversationSearchSessionEnded(i, chatListEvents$ConversationSearchEntryPoint, chatListEvents$ConversationSearchOutcome, j, chatListEvents$ConversationSearchVersion, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatListEvents$ConversationSearchSessionEnded chatListEvents$ConversationSearchSessionEnded = (ChatListEvents$ConversationSearchSessionEnded) obj;
        encoder.getClass();
        chatListEvents$ConversationSearchSessionEnded.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatListEvents$ConversationSearchSessionEnded.write$Self$analytics(chatListEvents$ConversationSearchSessionEnded, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
