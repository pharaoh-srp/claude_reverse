package defpackage;

import com.anthropic.claude.tool.model.EventCreateV0Input;
import com.anthropic.claude.tool.model.EventCreateV0InputRecurrence;
import java.time.OffsetDateTime;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bw6 implements w28 {
    public static final bw6 a;
    private static final SerialDescriptor descriptor;

    static {
        bw6 bw6Var = new bw6();
        a = bw6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.EventCreateV0Input", bw6Var, 7);
        pluginGeneratedSerialDescriptor.j("all_day", true);
        pluginGeneratedSerialDescriptor.j("description", true);
        pluginGeneratedSerialDescriptor.j("end_time", true);
        pluginGeneratedSerialDescriptor.j("location", true);
        pluginGeneratedSerialDescriptor.j("recurrence", true);
        pluginGeneratedSerialDescriptor.j("start_time", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S(zt1.a);
        srg srgVar = srg.a;
        KSerializer kSerializerS2 = d4c.S(srgVar);
        ay6 ay6Var = ay6.a;
        return new KSerializer[]{kSerializerS, kSerializerS2, d4c.S(ay6Var), d4c.S(srgVar), d4c.S(dw6.a), ay6Var, srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        String str = null;
        OffsetDateTime offsetDateTime = null;
        String str2 = null;
        EventCreateV0InputRecurrence eventCreateV0InputRecurrence = null;
        OffsetDateTime offsetDateTime2 = null;
        String strV = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 0, zt1.a, bool);
                    i |= 1;
                    break;
                case 1:
                    str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                    i |= 2;
                    break;
                case 2:
                    offsetDateTime = (OffsetDateTime) ud4VarC.m(serialDescriptor, 2, ay6.a, offsetDateTime);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str2);
                    i |= 8;
                    break;
                case 4:
                    eventCreateV0InputRecurrence = (EventCreateV0InputRecurrence) ud4VarC.m(serialDescriptor, 4, dw6.a, eventCreateV0InputRecurrence);
                    i |= 16;
                    break;
                case 5:
                    offsetDateTime2 = (OffsetDateTime) ud4VarC.l(serialDescriptor, 5, ay6.a, offsetDateTime2);
                    i |= 32;
                    break;
                case 6:
                    strV = ud4VarC.v(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new EventCreateV0Input(i, bool, str, offsetDateTime, str2, eventCreateV0InputRecurrence, offsetDateTime2, strV, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventCreateV0Input eventCreateV0Input = (EventCreateV0Input) obj;
        encoder.getClass();
        eventCreateV0Input.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventCreateV0Input.write$Self$Claude_tool_model(eventCreateV0Input, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
