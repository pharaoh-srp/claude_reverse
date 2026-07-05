package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$ModelSelectorSheetSeen;
import com.anthropic.claude.analytics.events.ChatEvents$ModelSelectorSheetSource;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mp2 implements w28 {
    public static final mp2 a;
    private static final SerialDescriptor descriptor;

    static {
        mp2 mp2Var = new mp2();
        a = mp2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.chat.model_selector_sheet.viewed", mp2Var, 3);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        qy1.u(pluginGeneratedSerialDescriptor, "source", false, "is_temporary_chat", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, ChatEvents$ModelSelectorSheetSeen.$childSerializers[1].getValue(), d4c.S(zt1.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ChatEvents$ModelSelectorSheetSeen.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        ChatEvents$ModelSelectorSheetSource chatEvents$ModelSelectorSheetSource = null;
        Boolean bool = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                chatEvents$ModelSelectorSheetSource = (ChatEvents$ModelSelectorSheetSource) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), chatEvents$ModelSelectorSheetSource);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                bool = (Boolean) ud4VarC.m(serialDescriptor, 2, zt1.a, bool);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatEvents$ModelSelectorSheetSeen(i, strV, chatEvents$ModelSelectorSheetSource, bool, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatEvents$ModelSelectorSheetSeen chatEvents$ModelSelectorSheetSeen = (ChatEvents$ModelSelectorSheetSeen) obj;
        encoder.getClass();
        chatEvents$ModelSelectorSheetSeen.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatEvents$ModelSelectorSheetSeen.write$Self$analytics(chatEvents$ModelSelectorSheetSeen, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
