package defpackage;

import com.anthropic.claude.tool.model.ChartDisplayV0Output;
import com.anthropic.claude.tool.model.ChartDisplayV0OutputStatus;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sk2 implements w28 {
    public static final sk2 a;
    private static final SerialDescriptor descriptor;

    static {
        sk2 sk2Var = new sk2();
        a = sk2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.ChartDisplayV0Output", sk2Var, 2);
        pluginGeneratedSerialDescriptor.j("message", true);
        pluginGeneratedSerialDescriptor.j("status", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(srg.a), vk2.d};
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
        ChartDisplayV0OutputStatus chartDisplayV0OutputStatus = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                chartDisplayV0OutputStatus = (ChartDisplayV0OutputStatus) ud4VarC.l(serialDescriptor, 1, vk2.d, chartDisplayV0OutputStatus);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChartDisplayV0Output(i, str, chartDisplayV0OutputStatus, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChartDisplayV0Output chartDisplayV0Output = (ChartDisplayV0Output) obj;
        encoder.getClass();
        chartDisplayV0Output.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChartDisplayV0Output.write$Self$Claude_tool_model(chartDisplayV0Output, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
