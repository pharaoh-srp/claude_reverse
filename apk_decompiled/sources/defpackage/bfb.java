package defpackage;

import com.anthropic.claude.api.login.VerifyResponse;
import com.anthropic.claude.tool.model.MessageComposeV0Input;
import com.anthropic.claude.tool.model.MessageComposeV0InputKind;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bfb implements w28 {
    public static final bfb a;
    private static final SerialDescriptor descriptor;

    static {
        bfb bfbVar = new bfb();
        a = bfbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.MessageComposeV0Input", bfbVar, 4);
        pluginGeneratedSerialDescriptor.j("body", false);
        pluginGeneratedSerialDescriptor.j(VerifyResponse.AuthenticationState.DISCRIMINATOR, false);
        pluginGeneratedSerialDescriptor.j("subject", true);
        pluginGeneratedSerialDescriptor.j("summary_title", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, efb.d, d4c.S(srgVar), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        MessageComposeV0InputKind messageComposeV0InputKind = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                messageComposeV0InputKind = (MessageComposeV0InputKind) ud4VarC.l(serialDescriptor, 1, efb.d, messageComposeV0InputKind);
                i |= 2;
            } else if (iX == 2) {
                str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                str2 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str2);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new MessageComposeV0Input(i, strV, messageComposeV0InputKind, str, str2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MessageComposeV0Input messageComposeV0Input = (MessageComposeV0Input) obj;
        encoder.getClass();
        messageComposeV0Input.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MessageComposeV0Input.write$Self$Claude_tool_model(messageComposeV0Input, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
