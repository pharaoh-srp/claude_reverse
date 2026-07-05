package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$Create;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uo2 implements w28 {
    public static final uo2 a;
    private static final SerialDescriptor descriptor;

    static {
        uo2 uo2Var = new uo2();
        a = uo2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_conversation_create", uo2Var, 8);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("document_attachment_count", false);
        pluginGeneratedSerialDescriptor.j("image_attachment_count", false);
        pluginGeneratedSerialDescriptor.j("mm_document_count", false);
        pluginGeneratedSerialDescriptor.j("model", true);
        qy1.u(pluginGeneratedSerialDescriptor, "paprika_mode", true, "is_temporary_chat", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        KSerializer kSerializerS = d4c.S(srgVar);
        KSerializer kSerializerS2 = d4c.S(srgVar);
        KSerializer kSerializerS3 = d4c.S(zt1.a);
        e79 e79Var = e79.a;
        return new KSerializer[]{srgVar, srgVar, e79Var, e79Var, e79Var, kSerializerS, kSerializerS2, kSerializerS3};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        Object obj = null;
        boolean z = true;
        int i = 0;
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        String strV = null;
        String strV2 = null;
        String str = null;
        String str2 = null;
        Boolean bool = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strV2 = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    iR = ud4VarC.r(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    iR2 = ud4VarC.r(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    iR3 = ud4VarC.r(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str);
                    i |= 32;
                    break;
                case 6:
                    str2 = (String) ud4VarC.m(serialDescriptor, 6, srg.a, str2);
                    i |= 64;
                    break;
                case 7:
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 7, zt1.a, bool);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new ChatEvents$Create(i, strV, strV2, iR, iR2, iR3, str, str2, bool, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatEvents$Create chatEvents$Create = (ChatEvents$Create) obj;
        encoder.getClass();
        chatEvents$Create.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatEvents$Create.write$Self$analytics(chatEvents$Create, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
