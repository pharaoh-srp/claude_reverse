package defpackage;

import com.anthropic.claude.models.organization.configtypes.EventUpdateEventUpdatesItemRecurrenceDescription;
import com.anthropic.claude.models.organization.configtypes.EventUpdateEventUpdatesItemRecurrenceEndDescription;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d27 implements w28 {
    public static final d27 a;
    private static final SerialDescriptor descriptor;

    static {
        d27 d27Var = new d27();
        a = d27Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.EventUpdateEventUpdatesItemRecurrenceDescription", d27Var, 10);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("day_of_month", false);
        pluginGeneratedSerialDescriptor.j("days_of_week", false);
        pluginGeneratedSerialDescriptor.j("end", false);
        pluginGeneratedSerialDescriptor.j("frequency", false);
        pluginGeneratedSerialDescriptor.j("human_readable_frequency", false);
        pluginGeneratedSerialDescriptor.j("interval", false);
        pluginGeneratedSerialDescriptor.j("months", false);
        pluginGeneratedSerialDescriptor.j("position", false);
        pluginGeneratedSerialDescriptor.j("rrule", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, f27.a, srgVar, srgVar, srgVar, srgVar, srgVar, srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        Object obj = null;
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        EventUpdateEventUpdatesItemRecurrenceEndDescription eventUpdateEventUpdatesItemRecurrenceEndDescription = null;
        String strV4 = null;
        String strV5 = null;
        String strV6 = null;
        String strV7 = null;
        String strV8 = null;
        String strV9 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strV2 = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strV3 = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    eventUpdateEventUpdatesItemRecurrenceEndDescription = (EventUpdateEventUpdatesItemRecurrenceEndDescription) ud4VarC.l(serialDescriptor, 3, f27.a, eventUpdateEventUpdatesItemRecurrenceEndDescription);
                    i |= 8;
                    break;
                case 4:
                    strV4 = ud4VarC.v(serialDescriptor, 4);
                    i |= 16;
                    continue;
                case 5:
                    strV5 = ud4VarC.v(serialDescriptor, 5);
                    i |= 32;
                    continue;
                case 6:
                    strV6 = ud4VarC.v(serialDescriptor, 6);
                    i |= 64;
                    continue;
                case 7:
                    strV7 = ud4VarC.v(serialDescriptor, 7);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    continue;
                case 8:
                    strV8 = ud4VarC.v(serialDescriptor, 8);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    continue;
                case 9:
                    strV9 = ud4VarC.v(serialDescriptor, 9);
                    i |= 512;
                    continue;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new EventUpdateEventUpdatesItemRecurrenceDescription(i, strV, strV2, strV3, eventUpdateEventUpdatesItemRecurrenceEndDescription, strV4, strV5, strV6, strV7, strV8, strV9, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventUpdateEventUpdatesItemRecurrenceDescription eventUpdateEventUpdatesItemRecurrenceDescription = (EventUpdateEventUpdatesItemRecurrenceDescription) obj;
        encoder.getClass();
        eventUpdateEventUpdatesItemRecurrenceDescription.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventUpdateEventUpdatesItemRecurrenceDescription.write$Self$models(eventUpdateEventUpdatesItemRecurrenceDescription, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
