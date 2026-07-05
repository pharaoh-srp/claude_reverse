package defpackage;

import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrence;
import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceEnd;
import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceFrequency;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f47 implements w28 {
    public static final f47 a;
    private static final SerialDescriptor descriptor;

    static {
        f47 f47Var = new f47();
        a = f47Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrence", f47Var, 9);
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
        kw9[] kw9VarArr = EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrence.$childSerializers;
        e79 e79Var = e79.a;
        KSerializer kSerializerS = d4c.S(e79Var);
        KSerializer kSerializerS2 = d4c.S((KSerializer) kw9VarArr[1].getValue());
        KSerializer kSerializerS3 = d4c.S(j47.a);
        KSerializer kSerializerS4 = d4c.S(e79Var);
        KSerializer kSerializerS5 = d4c.S((KSerializer) kw9VarArr[6].getValue());
        KSerializer kSerializerS6 = d4c.S(e79Var);
        srg srgVar = srg.a;
        return new KSerializer[]{kSerializerS, kSerializerS2, kSerializerS3, o47.d, srgVar, kSerializerS4, kSerializerS5, kSerializerS6, srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrence.$childSerializers;
        Object obj = null;
        boolean z = true;
        Integer num = null;
        Integer num2 = null;
        List list = null;
        EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceEnd eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceEnd = null;
        EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceFrequency eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceFrequency = null;
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
                    eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceEnd = (EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceEnd) ud4VarC.m(serialDescriptor, 2, j47.a, eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceEnd);
                    i |= 4;
                    break;
                case 3:
                    eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceFrequency = (EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceFrequency) ud4VarC.l(serialDescriptor, 3, o47.d, eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceFrequency);
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
        return new EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrence(i, num2, list, eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceEnd, eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrenceFrequency, strV, num3, list2, num, strV2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrence eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrence = (EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrence) obj;
        encoder.getClass();
        eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrence.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrence.write$Self$Claude_tool_model(eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrence, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
