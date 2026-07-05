package defpackage;

import com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItemRecurrenceEnd;
import com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItemRecurrenceEndType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ex6 implements w28 {
    public static final ex6 a;
    private static final SerialDescriptor descriptor;

    static {
        ex6 ex6Var = new ex6();
        a = ex6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItemRecurrenceEnd", ex6Var, 3);
        pluginGeneratedSerialDescriptor.j("count", true);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("until", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(e79.a), hx6.d, d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        Integer num = null;
        EventCreateV1InputNewEventsItemRecurrenceEndType eventCreateV1InputNewEventsItemRecurrenceEndType = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                num = (Integer) ud4VarC.m(serialDescriptor, 0, e79.a, num);
                i |= 1;
            } else if (iX == 1) {
                eventCreateV1InputNewEventsItemRecurrenceEndType = (EventCreateV1InputNewEventsItemRecurrenceEndType) ud4VarC.l(serialDescriptor, 1, hx6.d, eventCreateV1InputNewEventsItemRecurrenceEndType);
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
        return new EventCreateV1InputNewEventsItemRecurrenceEnd(i, num, eventCreateV1InputNewEventsItemRecurrenceEndType, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventCreateV1InputNewEventsItemRecurrenceEnd eventCreateV1InputNewEventsItemRecurrenceEnd = (EventCreateV1InputNewEventsItemRecurrenceEnd) obj;
        encoder.getClass();
        eventCreateV1InputNewEventsItemRecurrenceEnd.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventCreateV1InputNewEventsItemRecurrenceEnd.write$Self$Claude_tool_model(eventCreateV1InputNewEventsItemRecurrenceEnd, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
