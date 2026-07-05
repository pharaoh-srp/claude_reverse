package defpackage;

import com.anthropic.claude.tool.model.EventSearchV0Input;
import java.time.OffsetDateTime;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l07 implements w28 {
    public static final l07 a;
    private static final SerialDescriptor descriptor;

    static {
        l07 l07Var = new l07();
        a = l07Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.EventSearchV0Input", l07Var, 5);
        pluginGeneratedSerialDescriptor.j("calendar_id", true);
        pluginGeneratedSerialDescriptor.j("end_time", true);
        pluginGeneratedSerialDescriptor.j("include_all_day", true);
        pluginGeneratedSerialDescriptor.j("limit", true);
        pluginGeneratedSerialDescriptor.j("start_time", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S(srg.a);
        ay6 ay6Var = ay6.a;
        return new KSerializer[]{kSerializerS, d4c.S(ay6Var), d4c.S(zt1.a), d4c.S(e79.a), d4c.S(ay6Var)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        OffsetDateTime offsetDateTime = null;
        Boolean bool = null;
        Integer num = null;
        OffsetDateTime offsetDateTime2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i |= 1;
            } else if (iX == 1) {
                offsetDateTime = (OffsetDateTime) ud4VarC.m(serialDescriptor, 1, ay6.a, offsetDateTime);
                i |= 2;
            } else if (iX == 2) {
                bool = (Boolean) ud4VarC.m(serialDescriptor, 2, zt1.a, bool);
                i |= 4;
            } else if (iX == 3) {
                num = (Integer) ud4VarC.m(serialDescriptor, 3, e79.a, num);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                offsetDateTime2 = (OffsetDateTime) ud4VarC.m(serialDescriptor, 4, ay6.a, offsetDateTime2);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new EventSearchV0Input(i, str, offsetDateTime, bool, num, offsetDateTime2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventSearchV0Input eventSearchV0Input = (EventSearchV0Input) obj;
        encoder.getClass();
        eventSearchV0Input.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventSearchV0Input.write$Self$Claude_tool_model(eventSearchV0Input, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
