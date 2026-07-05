package defpackage;

import com.anthropic.claude.tool.model.RequestUserBrowserTakeoverOutput;
import java.time.OffsetDateTime;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gke implements w28 {
    public static final gke a;
    private static final SerialDescriptor descriptor;

    static {
        gke gkeVar = new gke();
        a = gkeVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.RequestUserBrowserTakeoverOutput", gkeVar, 2);
        pluginGeneratedSerialDescriptor.j("expires_at", true);
        pluginGeneratedSerialDescriptor.j("takeover_url", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(ay6.a), srg.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        OffsetDateTime offsetDateTime = null;
        String strV = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                offsetDateTime = (OffsetDateTime) ud4VarC.m(serialDescriptor, 0, ay6.a, offsetDateTime);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                strV = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new RequestUserBrowserTakeoverOutput(i, offsetDateTime, strV, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        RequestUserBrowserTakeoverOutput requestUserBrowserTakeoverOutput = (RequestUserBrowserTakeoverOutput) obj;
        encoder.getClass();
        requestUserBrowserTakeoverOutput.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        RequestUserBrowserTakeoverOutput.write$Self$Claude_tool_model(requestUserBrowserTakeoverOutput, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
