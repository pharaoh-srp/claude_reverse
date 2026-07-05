package defpackage;

import com.anthropic.claude.api.login.VerifyResponse;
import com.anthropic.claude.tool.model.MessageComposeV1Input;
import com.anthropic.claude.tool.model.MessageComposeV1InputKind;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ffb implements w28 {
    public static final ffb a;
    private static final SerialDescriptor descriptor;

    static {
        ffb ffbVar = new ffb();
        a = ffbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.MessageComposeV1Input", ffbVar, 3);
        pluginGeneratedSerialDescriptor.j(VerifyResponse.AuthenticationState.DISCRIMINATOR, false);
        pluginGeneratedSerialDescriptor.j("summary_title", true);
        pluginGeneratedSerialDescriptor.j("variants", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ifb.d, d4c.S(srg.a), MessageComposeV1Input.$childSerializers[2].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = MessageComposeV1Input.$childSerializers;
        boolean z = true;
        int i = 0;
        MessageComposeV1InputKind messageComposeV1InputKind = null;
        String str = null;
        List list = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                messageComposeV1InputKind = (MessageComposeV1InputKind) ud4VarC.l(serialDescriptor, 0, ifb.d, messageComposeV1InputKind);
                i |= 1;
            } else if (iX == 1) {
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
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
        return new MessageComposeV1Input(i, messageComposeV1InputKind, str, list, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MessageComposeV1Input messageComposeV1Input = (MessageComposeV1Input) obj;
        encoder.getClass();
        messageComposeV1Input.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MessageComposeV1Input.write$Self$Claude_tool_model(messageComposeV1Input, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
