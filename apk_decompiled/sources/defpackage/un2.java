package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$AnalysisToolInvokedInBackground;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class un2 implements w28 {
    public static final un2 a;
    private static final SerialDescriptor descriptor;

    static {
        un2 un2Var = new un2();
        a = un2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_conversation_analysis_tool_invoked_in_background", un2Var, 3);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        qy1.u(pluginGeneratedSerialDescriptor, "conversation_uuid", false, "is_temporary_chat", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S(zt1.a);
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, kSerializerS};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        Boolean bool = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                strV2 = ud4VarC.v(serialDescriptor, 1);
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
        return new ChatEvents$AnalysisToolInvokedInBackground(i, strV, strV2, bool, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatEvents$AnalysisToolInvokedInBackground chatEvents$AnalysisToolInvokedInBackground = (ChatEvents$AnalysisToolInvokedInBackground) obj;
        encoder.getClass();
        chatEvents$AnalysisToolInvokedInBackground.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatEvents$AnalysisToolInvokedInBackground.write$Self$analytics(chatEvents$AnalysisToolInvokedInBackground, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
