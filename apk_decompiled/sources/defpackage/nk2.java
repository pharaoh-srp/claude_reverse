package defpackage;

import com.anthropic.claude.tool.model.ChartDisplayV0InputYAxis;
import com.anthropic.claude.tool.model.ChartDisplayV0InputYAxisScale;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nk2 implements w28 {
    public static final nk2 a;
    private static final SerialDescriptor descriptor;

    static {
        nk2 nk2Var = new nk2();
        a = nk2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.ChartDisplayV0InputYAxis", nk2Var, 6);
        pluginGeneratedSerialDescriptor.j("data", true);
        pluginGeneratedSerialDescriptor.j("format", true);
        pluginGeneratedSerialDescriptor.j("max", true);
        pluginGeneratedSerialDescriptor.j("min", true);
        pluginGeneratedSerialDescriptor.j("scale", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S((KSerializer) ChartDisplayV0InputYAxis.$childSerializers[0].getValue());
        srg srgVar = srg.a;
        KSerializer kSerializerS2 = d4c.S(srgVar);
        na6 na6Var = na6.a;
        return new KSerializer[]{kSerializerS, kSerializerS2, d4c.S(na6Var), d4c.S(na6Var), d4c.S(rk2.d), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ChartDisplayV0InputYAxis.$childSerializers;
        boolean z = true;
        int i = 0;
        List list = null;
        String str = null;
        Double d = null;
        Double d2 = null;
        ChartDisplayV0InputYAxisScale chartDisplayV0InputYAxisScale = null;
        String str2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    list = (List) ud4VarC.m(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                    i |= 2;
                    break;
                case 2:
                    d = (Double) ud4VarC.m(serialDescriptor, 2, na6.a, d);
                    i |= 4;
                    break;
                case 3:
                    d2 = (Double) ud4VarC.m(serialDescriptor, 3, na6.a, d2);
                    i |= 8;
                    break;
                case 4:
                    chartDisplayV0InputYAxisScale = (ChartDisplayV0InputYAxisScale) ud4VarC.m(serialDescriptor, 4, rk2.d, chartDisplayV0InputYAxisScale);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str2);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChartDisplayV0InputYAxis(i, list, str, d, d2, chartDisplayV0InputYAxisScale, str2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChartDisplayV0InputYAxis chartDisplayV0InputYAxis = (ChartDisplayV0InputYAxis) obj;
        encoder.getClass();
        chartDisplayV0InputYAxis.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChartDisplayV0InputYAxis.write$Self$Claude_tool_model(chartDisplayV0InputYAxis, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
