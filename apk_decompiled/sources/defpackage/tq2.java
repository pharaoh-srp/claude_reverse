package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$SafeguardsLearnMoreSurface;
import com.anthropic.claude.analytics.events.ChatEvents$SafeguardsLearnMoreTapped;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tq2 implements w28 {
    public static final tq2 a;
    private static final SerialDescriptor descriptor;

    static {
        tq2 tq2Var = new tq2();
        a = tq2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.chat.safeguards_learn_more.tapped", tq2Var, 2);
        pluginGeneratedSerialDescriptor.j("surface", false);
        pluginGeneratedSerialDescriptor.j("has_server_url", false);
        pluginGeneratedSerialDescriptor.k(new pi(10));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ChatEvents$SafeguardsLearnMoreTapped.$childSerializers[0].getValue(), zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ChatEvents$SafeguardsLearnMoreTapped.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        ChatEvents$SafeguardsLearnMoreSurface chatEvents$SafeguardsLearnMoreSurface = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                chatEvents$SafeguardsLearnMoreSurface = (ChatEvents$SafeguardsLearnMoreSurface) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), chatEvents$SafeguardsLearnMoreSurface);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                zU = ud4VarC.u(serialDescriptor, 1);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatEvents$SafeguardsLearnMoreTapped(i, chatEvents$SafeguardsLearnMoreSurface, zU, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatEvents$SafeguardsLearnMoreTapped chatEvents$SafeguardsLearnMoreTapped = (ChatEvents$SafeguardsLearnMoreTapped) obj;
        encoder.getClass();
        chatEvents$SafeguardsLearnMoreTapped.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatEvents$SafeguardsLearnMoreTapped.write$Self$analytics(chatEvents$SafeguardsLearnMoreTapped, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
