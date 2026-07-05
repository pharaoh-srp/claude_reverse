package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$ChooseStyleSheetSeen;
import com.anthropic.claude.analytics.events.ChatEvents$ChooseStyleSheetSource;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class go2 implements w28 {
    public static final go2 a;
    private static final SerialDescriptor descriptor;

    static {
        go2 go2Var = new go2();
        a = go2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_choose_style_sheet_seen", go2Var, 3);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        qy1.u(pluginGeneratedSerialDescriptor, "source", false, "is_temporary_chat", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, ChatEvents$ChooseStyleSheetSeen.$childSerializers[1].getValue(), d4c.S(zt1.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ChatEvents$ChooseStyleSheetSeen.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        ChatEvents$ChooseStyleSheetSource chatEvents$ChooseStyleSheetSource = null;
        Boolean bool = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                chatEvents$ChooseStyleSheetSource = (ChatEvents$ChooseStyleSheetSource) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), chatEvents$ChooseStyleSheetSource);
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
        return new ChatEvents$ChooseStyleSheetSeen(i, strV, chatEvents$ChooseStyleSheetSource, bool, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatEvents$ChooseStyleSheetSeen chatEvents$ChooseStyleSheetSeen = (ChatEvents$ChooseStyleSheetSeen) obj;
        encoder.getClass();
        chatEvents$ChooseStyleSheetSeen.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatEvents$ChooseStyleSheetSeen.write$Self$analytics(chatEvents$ChooseStyleSheetSeen, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
