package defpackage;

import com.anthropic.claude.mcpapps.transport.UiResourceCsp;
import com.anthropic.claude.mcpapps.transport.UiResourceMeta;
import com.anthropic.claude.mcpapps.transport.UiResourcePermissions;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ndi implements w28 {
    public static final ndi a;
    private static final SerialDescriptor descriptor;

    static {
        ndi ndiVar = new ndi();
        a = ndiVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.mcpapps.transport.UiResourceMeta", ndiVar, 4);
        pluginGeneratedSerialDescriptor.j("csp", true);
        pluginGeneratedSerialDescriptor.j("permissions", true);
        pluginGeneratedSerialDescriptor.j("domain", true);
        pluginGeneratedSerialDescriptor.j("prefersBorder", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(ldi.a), d4c.S(pdi.a), d4c.S(srg.a), d4c.S(zt1.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        UiResourceCsp uiResourceCsp = null;
        UiResourcePermissions uiResourcePermissions = null;
        String str = null;
        Boolean bool = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                uiResourceCsp = (UiResourceCsp) ud4VarC.m(serialDescriptor, 0, ldi.a, uiResourceCsp);
                i |= 1;
            } else if (iX == 1) {
                uiResourcePermissions = (UiResourcePermissions) ud4VarC.m(serialDescriptor, 1, pdi.a, uiResourcePermissions);
                i |= 2;
            } else if (iX == 2) {
                str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
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
        return new UiResourceMeta(i, uiResourceCsp, uiResourcePermissions, str, bool, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        UiResourceMeta uiResourceMeta = (UiResourceMeta) obj;
        encoder.getClass();
        uiResourceMeta.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        UiResourceMeta.write$Self$Claude_mcpapp(uiResourceMeta, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
