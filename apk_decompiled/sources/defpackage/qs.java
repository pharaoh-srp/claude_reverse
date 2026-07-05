package defpackage;

import com.anthropic.claude.tool.model.AlarmCreateV0Input;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qs implements w28 {
    public static final qs a;
    private static final SerialDescriptor descriptor;

    static {
        qs qsVar = new qs();
        a = qsVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.AlarmCreateV0Input", qsVar, 5);
        pluginGeneratedSerialDescriptor.j("days", true);
        pluginGeneratedSerialDescriptor.j("hour", false);
        pluginGeneratedSerialDescriptor.j("message", false);
        pluginGeneratedSerialDescriptor.j("minute", false);
        pluginGeneratedSerialDescriptor.j("vibrate", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S((KSerializer) AlarmCreateV0Input.$childSerializers[0].getValue());
        KSerializer kSerializerS2 = d4c.S(zt1.a);
        e79 e79Var = e79.a;
        return new KSerializer[]{kSerializerS, e79Var, srg.a, e79Var, kSerializerS2};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = AlarmCreateV0Input.$childSerializers;
        boolean z = true;
        int i = 0;
        int iR = 0;
        int iR2 = 0;
        List list = null;
        String strV = null;
        Boolean bool = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                list = (List) ud4VarC.m(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), list);
                i |= 1;
            } else if (iX == 1) {
                iR = ud4VarC.r(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                strV = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            } else if (iX == 3) {
                iR2 = ud4VarC.r(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                bool = (Boolean) ud4VarC.m(serialDescriptor, 4, zt1.a, bool);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new AlarmCreateV0Input(i, list, iR, strV, iR2, bool, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        AlarmCreateV0Input alarmCreateV0Input = (AlarmCreateV0Input) obj;
        encoder.getClass();
        alarmCreateV0Input.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        AlarmCreateV0Input.write$Self$Claude_tool_model(alarmCreateV0Input, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
