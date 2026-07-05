package defpackage;

import com.anthropic.claude.api.chat.MessageImageAsset;
import com.anthropic.claude.types.strings.MessageId;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ghb implements w28 {
    public static final ghb a;
    private static final SerialDescriptor descriptor;

    static {
        ghb ghbVar = new ghb();
        a = ghbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.chat.MessageImageAsset", ghbVar, 5);
        pluginGeneratedSerialDescriptor.j("url", false);
        pluginGeneratedSerialDescriptor.j("image_width", true);
        pluginGeneratedSerialDescriptor.j("image_height", true);
        pluginGeneratedSerialDescriptor.j("messageId", true);
        pluginGeneratedSerialDescriptor.j("cacheKey", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        e79 e79Var = e79.a;
        KSerializer kSerializerS = d4c.S(e79Var);
        KSerializer kSerializerS2 = d4c.S(e79Var);
        KSerializer kSerializerS3 = d4c.S(ehb.a);
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, kSerializerS, kSerializerS2, kSerializerS3, srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        Integer num = null;
        Integer num2 = null;
        String strM1057unboximpl = null;
        String strV2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                num = (Integer) ud4VarC.m(serialDescriptor, 1, e79.a, num);
                i |= 2;
            } else if (iX == 2) {
                num2 = (Integer) ud4VarC.m(serialDescriptor, 2, e79.a, num2);
                i |= 4;
            } else if (iX == 3) {
                MessageId messageId = (MessageId) ud4VarC.m(serialDescriptor, 3, ehb.a, strM1057unboximpl != null ? MessageId.m1051boximpl(strM1057unboximpl) : null);
                strM1057unboximpl = messageId != null ? messageId.m1057unboximpl() : null;
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                strV2 = ud4VarC.v(serialDescriptor, 4);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new MessageImageAsset(i, strV, num, num2, strM1057unboximpl, strV2, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MessageImageAsset messageImageAsset = (MessageImageAsset) obj;
        encoder.getClass();
        messageImageAsset.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MessageImageAsset.write$Self$api(messageImageAsset, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
