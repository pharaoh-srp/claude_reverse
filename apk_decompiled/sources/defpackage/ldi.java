package defpackage;

import com.anthropic.claude.mcpapps.transport.UiResourceCsp;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ldi implements w28 {
    public static final ldi a;
    private static final SerialDescriptor descriptor;

    static {
        ldi ldiVar = new ldi();
        a = ldiVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.mcpapps.transport.UiResourceCsp", ldiVar, 2);
        pluginGeneratedSerialDescriptor.j("connectDomains", true);
        pluginGeneratedSerialDescriptor.j("resourceDomains", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = UiResourceCsp.$childSerializers;
        return new KSerializer[]{d4c.S((KSerializer) kw9VarArr[0].getValue()), d4c.S((KSerializer) kw9VarArr[1].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = UiResourceCsp.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                list = (List) ud4VarC.m(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                list2 = (List) ud4VarC.m(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), list2);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new UiResourceCsp(i, list, list2, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        UiResourceCsp uiResourceCsp = (UiResourceCsp) obj;
        encoder.getClass();
        uiResourceCsp.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        UiResourceCsp.write$Self$Claude_mcpapp(uiResourceCsp, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
