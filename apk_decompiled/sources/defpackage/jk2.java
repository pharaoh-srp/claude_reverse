package defpackage;

import com.anthropic.claude.tool.model.ChartDisplayV0InputXAxis;
import com.anthropic.claude.tool.model.ChartDisplayV0InputXAxisScale;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jk2 implements w28 {
    public static final jk2 a;
    private static final SerialDescriptor descriptor;

    static {
        jk2 jk2Var = new jk2();
        a = jk2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.ChartDisplayV0InputXAxis", jk2Var, 6);
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
        KSerializer kSerializerS = d4c.S((KSerializer) ChartDisplayV0InputXAxis.$childSerializers[0].getValue());
        srg srgVar = srg.a;
        KSerializer kSerializerS2 = d4c.S(srgVar);
        na6 na6Var = na6.a;
        return new KSerializer[]{kSerializerS, kSerializerS2, d4c.S(na6Var), d4c.S(na6Var), d4c.S(mk2.d), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ChartDisplayV0InputXAxis.$childSerializers;
        boolean z = true;
        int i = 0;
        List list = null;
        String str = null;
        Double d = null;
        Double d2 = null;
        ChartDisplayV0InputXAxisScale chartDisplayV0InputXAxisScale = null;
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
                    chartDisplayV0InputXAxisScale = (ChartDisplayV0InputXAxisScale) ud4VarC.m(serialDescriptor, 4, mk2.d, chartDisplayV0InputXAxisScale);
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
        return new ChartDisplayV0InputXAxis(i, list, str, d, d2, chartDisplayV0InputXAxisScale, str2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChartDisplayV0InputXAxis chartDisplayV0InputXAxis = (ChartDisplayV0InputXAxis) obj;
        encoder.getClass();
        chartDisplayV0InputXAxis.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChartDisplayV0InputXAxis.write$Self$Claude_tool_model(chartDisplayV0InputXAxis, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
