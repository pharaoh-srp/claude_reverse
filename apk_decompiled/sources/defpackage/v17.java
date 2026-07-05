package defpackage;

import com.anthropic.claude.models.organization.configtypes.EventUpdateEventUpdatesArrayDescription;
import com.anthropic.claude.models.organization.configtypes.EventUpdateEventUpdatesItemDescription;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v17 implements w28 {
    public static final v17 a;
    private static final SerialDescriptor descriptor;

    static {
        v17 v17Var = new v17();
        a = v17Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.EventUpdateEventUpdatesArrayDescription", v17Var, 2);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("items", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, x17.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        String strV = null;
        EventUpdateEventUpdatesItemDescription eventUpdateEventUpdatesItemDescription = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                eventUpdateEventUpdatesItemDescription = (EventUpdateEventUpdatesItemDescription) ud4VarC.l(serialDescriptor, 1, x17.a, eventUpdateEventUpdatesItemDescription);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new EventUpdateEventUpdatesArrayDescription(i, strV, eventUpdateEventUpdatesItemDescription, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventUpdateEventUpdatesArrayDescription eventUpdateEventUpdatesArrayDescription = (EventUpdateEventUpdatesArrayDescription) obj;
        encoder.getClass();
        eventUpdateEventUpdatesArrayDescription.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventUpdateEventUpdatesArrayDescription.write$Self$models(eventUpdateEventUpdatesArrayDescription, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
