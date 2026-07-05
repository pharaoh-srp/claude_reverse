package defpackage;

import com.anthropic.claude.tool.model.PhoneCallCompletedOutput;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0d implements w28 {
    public static final i0d a;
    private static final SerialDescriptor descriptor;

    static {
        i0d i0dVar = new i0d();
        a = i0dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.PhoneCallCompletedOutput", i0dVar, 4);
        pluginGeneratedSerialDescriptor.j("duration", true);
        pluginGeneratedSerialDescriptor.j("error", true);
        pluginGeneratedSerialDescriptor.j("start_time", true);
        pluginGeneratedSerialDescriptor.j("transcript", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = PhoneCallCompletedOutput.$childSerializers;
        e79 e79Var = e79.a;
        return new KSerializer[]{d4c.S(e79Var), d4c.S(srg.a), d4c.S(e79Var), d4c.S((KSerializer) kw9VarArr[3].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = PhoneCallCompletedOutput.$childSerializers;
        boolean z = true;
        int i = 0;
        Integer num = null;
        String str = null;
        Integer num2 = null;
        List list = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                num = (Integer) ud4VarC.m(serialDescriptor, 0, e79.a, num);
                i |= 1;
            } else if (iX == 1) {
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                i |= 2;
            } else if (iX == 2) {
                num2 = (Integer) ud4VarC.m(serialDescriptor, 2, e79.a, num2);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                list = (List) ud4VarC.m(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), list);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new PhoneCallCompletedOutput(i, num, str, num2, list, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        PhoneCallCompletedOutput phoneCallCompletedOutput = (PhoneCallCompletedOutput) obj;
        encoder.getClass();
        phoneCallCompletedOutput.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        PhoneCallCompletedOutput.write$Self$Claude_tool_model(phoneCallCompletedOutput, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
