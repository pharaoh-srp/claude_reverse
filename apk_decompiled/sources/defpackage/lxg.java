package defpackage;

import com.anthropic.claude.tool.model.SuggestConnectorsOutput;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lxg implements w28 {
    public static final lxg a;
    private static final SerialDescriptor descriptor;

    static {
        lxg lxgVar = new lxg();
        a = lxgVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.SuggestConnectorsOutput", lxgVar, 3);
        pluginGeneratedSerialDescriptor.j("connectors", false);
        pluginGeneratedSerialDescriptor.j("message", true);
        pluginGeneratedSerialDescriptor.j("opt_in_required", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{SuggestConnectorsOutput.$childSerializers[0].getValue(), d4c.S(srg.a), d4c.S(zt1.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = SuggestConnectorsOutput.$childSerializers;
        boolean z = true;
        int i = 0;
        List list = null;
        String str = null;
        Boolean bool = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                list = (List) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), list);
                i |= 1;
            } else if (iX == 1) {
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                bool = (Boolean) ud4VarC.m(serialDescriptor, 2, zt1.a, bool);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SuggestConnectorsOutput(i, list, str, bool, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SuggestConnectorsOutput suggestConnectorsOutput = (SuggestConnectorsOutput) obj;
        encoder.getClass();
        suggestConnectorsOutput.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SuggestConnectorsOutput.write$Self$Claude_tool_model(suggestConnectorsOutput, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
