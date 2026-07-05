package defpackage;

import com.anthropic.claude.mcpapps.transport.ResourceMeta;
import com.anthropic.claude.mcpapps.transport.UiResourceMeta;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vpe implements w28 {
    public static final vpe a;
    private static final SerialDescriptor descriptor;

    static {
        vpe vpeVar = new vpe();
        a = vpeVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.mcpapps.transport.ResourceMeta", vpeVar, 1);
        pluginGeneratedSerialDescriptor.j("ui", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(ndi.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        UiResourceMeta uiResourceMeta = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                uiResourceMeta = (UiResourceMeta) ud4VarC.m(serialDescriptor, 0, ndi.a, uiResourceMeta);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ResourceMeta(i, uiResourceMeta, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ResourceMeta resourceMeta = (ResourceMeta) obj;
        encoder.getClass();
        resourceMeta.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ResourceMeta.write$Self$Claude_mcpapp(resourceMeta, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
