package defpackage;

import com.anthropic.claude.api.chat.messages.ApiHelpline;
import com.anthropic.claude.api.chat.messages.FlagDelta;
import com.anthropic.claude.api.chat.messages.MessageFlag;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cn7 implements w28 {
    public static final cn7 a;
    private static final SerialDescriptor descriptor;

    static {
        cn7 cn7Var = new cn7();
        a = cn7Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flag_delta", cn7Var, 2);
        pluginGeneratedSerialDescriptor.j("flag", false);
        pluginGeneratedSerialDescriptor.j("helpline", true);
        pluginGeneratedSerialDescriptor.k(new gl0(3));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{dhb.a, d4c.S(ef0.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        MessageFlag messageFlag = null;
        ApiHelpline apiHelpline = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                messageFlag = (MessageFlag) ud4VarC.l(serialDescriptor, 0, dhb.a, messageFlag);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                apiHelpline = (ApiHelpline) ud4VarC.m(serialDescriptor, 1, ef0.a, apiHelpline);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new FlagDelta(i, messageFlag, apiHelpline, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        FlagDelta flagDelta = (FlagDelta) obj;
        encoder.getClass();
        flagDelta.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        FlagDelta.write$Self$api(flagDelta, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
