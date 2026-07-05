package defpackage;

import com.anthropic.claude.tool.model.ConwaySuggestConnectorsInput;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f05 implements w28 {
    public static final f05 a;
    private static final SerialDescriptor descriptor;

    static {
        f05 f05Var = new f05();
        a = f05Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.ConwaySuggestConnectorsInput", f05Var, 1);
        pluginGeneratedSerialDescriptor.j("query", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ConwaySuggestConnectorsInput(i, str, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ConwaySuggestConnectorsInput conwaySuggestConnectorsInput = (ConwaySuggestConnectorsInput) obj;
        encoder.getClass();
        conwaySuggestConnectorsInput.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ConwaySuggestConnectorsInput.write$Self$Claude_tool_model(conwaySuggestConnectorsInput, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
