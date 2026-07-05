package defpackage;

import com.anthropic.claude.tool.model.EventCreateV0InputRecurrence;
import com.anthropic.claude.tool.model.EventCreateV0InputRecurrenceEnd;
import com.anthropic.claude.tool.model.EventCreateV0InputRecurrenceFrequency;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dw6 implements w28 {
    public static final dw6 a;
    private static final SerialDescriptor descriptor;

    static {
        dw6 dw6Var = new dw6();
        a = dw6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.EventCreateV0InputRecurrence", dw6Var, 9);
        pluginGeneratedSerialDescriptor.j("day_of_month", true);
        pluginGeneratedSerialDescriptor.j("days_of_week", true);
        pluginGeneratedSerialDescriptor.j("end", true);
        pluginGeneratedSerialDescriptor.j("frequency", false);
        pluginGeneratedSerialDescriptor.j("human_readable_frequency", false);
        pluginGeneratedSerialDescriptor.j("interval", true);
        pluginGeneratedSerialDescriptor.j("months", true);
        pluginGeneratedSerialDescriptor.j("position", true);
        pluginGeneratedSerialDescriptor.j("rrule", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = EventCreateV0InputRecurrence.$childSerializers;
        e79 e79Var = e79.a;
        KSerializer kSerializerS = d4c.S(e79Var);
        KSerializer kSerializerS2 = d4c.S((KSerializer) kw9VarArr[1].getValue());
        KSerializer kSerializerS3 = d4c.S(iw6.a);
        KSerializer kSerializerS4 = d4c.S(e79Var);
        KSerializer kSerializerS5 = d4c.S((KSerializer) kw9VarArr[6].getValue());
        KSerializer kSerializerS6 = d4c.S(e79Var);
        srg srgVar = srg.a;
        return new KSerializer[]{kSerializerS, kSerializerS2, kSerializerS3, nw6.d, srgVar, kSerializerS4, kSerializerS5, kSerializerS6, srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = EventCreateV0InputRecurrence.$childSerializers;
        Object obj = null;
        boolean z = true;
        Integer num = null;
        Integer num2 = null;
        List list = null;
        EventCreateV0InputRecurrenceEnd eventCreateV0InputRecurrenceEnd = null;
        EventCreateV0InputRecurrenceFrequency eventCreateV0InputRecurrenceFrequency = null;
        String strV = null;
        Integer num3 = null;
        List list2 = null;
        String strV2 = null;
        int i = 0;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num2 = (Integer) ud4VarC.m(serialDescriptor, 0, e79.a, num2);
                    i |= 1;
                    break;
                case 1:
                    list = (List) ud4VarC.m(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), list);
                    i |= 2;
                    break;
                case 2:
                    eventCreateV0InputRecurrenceEnd = (EventCreateV0InputRecurrenceEnd) ud4VarC.m(serialDescriptor, 2, iw6.a, eventCreateV0InputRecurrenceEnd);
                    i |= 4;
                    break;
                case 3:
                    eventCreateV0InputRecurrenceFrequency = (EventCreateV0InputRecurrenceFrequency) ud4VarC.l(serialDescriptor, 3, nw6.d, eventCreateV0InputRecurrenceFrequency);
                    i |= 8;
                    break;
                case 4:
                    strV = ud4VarC.v(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    num3 = (Integer) ud4VarC.m(serialDescriptor, 5, e79.a, num3);
                    i |= 32;
                    break;
                case 6:
                    list2 = (List) ud4VarC.m(serialDescriptor, 6, (s06) kw9VarArr[6].getValue(), list2);
                    i |= 64;
                    break;
                case 7:
                    num = (Integer) ud4VarC.m(serialDescriptor, 7, e79.a, num);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    strV2 = ud4VarC.v(serialDescriptor, 8);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new EventCreateV0InputRecurrence(i, num2, list, eventCreateV0InputRecurrenceEnd, eventCreateV0InputRecurrenceFrequency, strV, num3, list2, num, strV2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventCreateV0InputRecurrence eventCreateV0InputRecurrence = (EventCreateV0InputRecurrence) obj;
        encoder.getClass();
        eventCreateV0InputRecurrence.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventCreateV0InputRecurrence.write$Self$Claude_tool_model(eventCreateV0InputRecurrence, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
