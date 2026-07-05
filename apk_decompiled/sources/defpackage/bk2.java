package defpackage;

import com.anthropic.claude.tool.model.ChartDisplayV0Input;
import com.anthropic.claude.tool.model.ChartDisplayV0InputStyle;
import com.anthropic.claude.tool.model.ChartDisplayV0InputXAxis;
import com.anthropic.claude.tool.model.ChartDisplayV0InputYAxis;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bk2 implements w28 {
    public static final bk2 a;
    private static final SerialDescriptor descriptor;

    static {
        bk2 bk2Var = new bk2();
        a = bk2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.ChartDisplayV0Input", bk2Var, 5);
        pluginGeneratedSerialDescriptor.j("series", false);
        pluginGeneratedSerialDescriptor.j("style", false);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("x_axis", true);
        pluginGeneratedSerialDescriptor.j("y_axis", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ChartDisplayV0Input.$childSerializers[0].getValue(), ik2.d, d4c.S(srg.a), d4c.S(jk2.a), d4c.S(nk2.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ChartDisplayV0Input.$childSerializers;
        boolean z = true;
        int i = 0;
        List list = null;
        ChartDisplayV0InputStyle chartDisplayV0InputStyle = null;
        String str = null;
        ChartDisplayV0InputXAxis chartDisplayV0InputXAxis = null;
        ChartDisplayV0InputYAxis chartDisplayV0InputYAxis = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                list = (List) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), list);
                i |= 1;
            } else if (iX == 1) {
                chartDisplayV0InputStyle = (ChartDisplayV0InputStyle) ud4VarC.l(serialDescriptor, 1, ik2.d, chartDisplayV0InputStyle);
                i |= 2;
            } else if (iX == 2) {
                str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                i |= 4;
            } else if (iX == 3) {
                chartDisplayV0InputXAxis = (ChartDisplayV0InputXAxis) ud4VarC.m(serialDescriptor, 3, jk2.a, chartDisplayV0InputXAxis);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                chartDisplayV0InputYAxis = (ChartDisplayV0InputYAxis) ud4VarC.m(serialDescriptor, 4, nk2.a, chartDisplayV0InputYAxis);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChartDisplayV0Input(i, list, chartDisplayV0InputStyle, str, chartDisplayV0InputXAxis, chartDisplayV0InputYAxis, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChartDisplayV0Input chartDisplayV0Input = (ChartDisplayV0Input) obj;
        encoder.getClass();
        chartDisplayV0Input.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChartDisplayV0Input.write$Self$Claude_tool_model(chartDisplayV0Input, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
