package defpackage;

import com.anthropic.claude.mcpapps.transport.ResourceContent;
import com.anthropic.claude.mcpapps.transport.ResourceMeta;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vne implements w28 {
    public static final vne a;
    private static final SerialDescriptor descriptor;

    static {
        vne vneVar = new vne();
        a = vneVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.mcpapps.transport.ResourceContent", vneVar, 4);
        pluginGeneratedSerialDescriptor.j("uri", true);
        pluginGeneratedSerialDescriptor.j("mimeType", true);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("_meta", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(vpe.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        ResourceMeta resourceMeta = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i |= 1;
            } else if (iX == 1) {
                str2 = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str2);
                i |= 2;
            } else if (iX == 2) {
                str3 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str3);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                resourceMeta = (ResourceMeta) ud4VarC.m(serialDescriptor, 3, vpe.a, resourceMeta);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ResourceContent(i, str, str2, str3, resourceMeta, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ResourceContent resourceContent = (ResourceContent) obj;
        encoder.getClass();
        resourceContent.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ResourceContent.write$Self$Claude_mcpapp(resourceContent, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
