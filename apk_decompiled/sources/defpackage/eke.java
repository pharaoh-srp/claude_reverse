package defpackage;

import com.anthropic.claude.tool.model.RequestUserBrowserTakeoverInput;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eke implements w28 {
    public static final eke a;
    private static final SerialDescriptor descriptor;

    static {
        eke ekeVar = new eke();
        a = ekeVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.RequestUserBrowserTakeoverInput", ekeVar, 2);
        pluginGeneratedSerialDescriptor.j("progress_summary", false);
        pluginGeneratedSerialDescriptor.j("user_instructions", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                strV2 = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new RequestUserBrowserTakeoverInput(i, strV, strV2, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        RequestUserBrowserTakeoverInput requestUserBrowserTakeoverInput = (RequestUserBrowserTakeoverInput) obj;
        encoder.getClass();
        requestUserBrowserTakeoverInput.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        RequestUserBrowserTakeoverInput.write$Self$Claude_tool_model(requestUserBrowserTakeoverInput, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
