package defpackage;

import com.anthropic.claude.tool.model.EventCreateV0InputRecurrenceEnd;
import com.anthropic.claude.tool.model.EventCreateV0InputRecurrenceEndType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iw6 implements w28 {
    public static final iw6 a;
    private static final SerialDescriptor descriptor;

    static {
        iw6 iw6Var = new iw6();
        a = iw6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.EventCreateV0InputRecurrenceEnd", iw6Var, 3);
        pluginGeneratedSerialDescriptor.j("count", true);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("until", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(e79.a), lw6.d, d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        Integer num = null;
        EventCreateV0InputRecurrenceEndType eventCreateV0InputRecurrenceEndType = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                num = (Integer) ud4VarC.m(serialDescriptor, 0, e79.a, num);
                i |= 1;
            } else if (iX == 1) {
                eventCreateV0InputRecurrenceEndType = (EventCreateV0InputRecurrenceEndType) ud4VarC.l(serialDescriptor, 1, lw6.d, eventCreateV0InputRecurrenceEndType);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new EventCreateV0InputRecurrenceEnd(i, num, eventCreateV0InputRecurrenceEndType, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventCreateV0InputRecurrenceEnd eventCreateV0InputRecurrenceEnd = (EventCreateV0InputRecurrenceEnd) obj;
        encoder.getClass();
        eventCreateV0InputRecurrenceEnd.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventCreateV0InputRecurrenceEnd.write$Self$Claude_tool_model(eventCreateV0InputRecurrenceEnd, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
