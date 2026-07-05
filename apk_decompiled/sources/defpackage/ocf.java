package defpackage;

import com.anthropic.claude.sessions.types.SdkToolResultContent;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ocf implements w28 {
    public static final ocf a;
    private static final SerialDescriptor descriptor;

    static {
        ocf ocfVar = new ocf();
        a = ocfVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.SdkToolResultContent", ocfVar, 4);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("tool_use_id", false);
        pluginGeneratedSerialDescriptor.j("content", true);
        pluginGeneratedSerialDescriptor.j("is_error", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S(zt1.a);
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, ryh.a, kSerializerS};
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
        List list = null;
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
            } else if (iX == 2) {
                list = (List) ud4VarC.l(serialDescriptor, 2, ryh.a, list);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                bool = (Boolean) ud4VarC.m(serialDescriptor, 3, zt1.a, bool);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SdkToolResultContent(i, strV, strV2, list, bool, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SdkToolResultContent sdkToolResultContent = (SdkToolResultContent) obj;
        encoder.getClass();
        sdkToolResultContent.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SdkToolResultContent.write$Self$sessions(sdkToolResultContent, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
