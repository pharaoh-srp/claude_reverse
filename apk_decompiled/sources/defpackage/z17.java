package defpackage;

import com.anthropic.claude.models.organization.configtypes.EventUpdateEventUpdatesItemNudgesArrayDescription;
import com.anthropic.claude.models.organization.configtypes.EventUpdateEventUpdatesItemNudgesItemDescription;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z17 implements w28 {
    public static final z17 a;
    private static final SerialDescriptor descriptor;

    static {
        z17 z17Var = new z17();
        a = z17Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.EventUpdateEventUpdatesItemNudgesArrayDescription", z17Var, 2);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("items", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, b27.a};
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
        EventUpdateEventUpdatesItemNudgesItemDescription eventUpdateEventUpdatesItemNudgesItemDescription = null;
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
                eventUpdateEventUpdatesItemNudgesItemDescription = (EventUpdateEventUpdatesItemNudgesItemDescription) ud4VarC.l(serialDescriptor, 1, b27.a, eventUpdateEventUpdatesItemNudgesItemDescription);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new EventUpdateEventUpdatesItemNudgesArrayDescription(i, strV, eventUpdateEventUpdatesItemNudgesItemDescription, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventUpdateEventUpdatesItemNudgesArrayDescription eventUpdateEventUpdatesItemNudgesArrayDescription = (EventUpdateEventUpdatesItemNudgesArrayDescription) obj;
        encoder.getClass();
        eventUpdateEventUpdatesItemNudgesArrayDescription.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventUpdateEventUpdatesItemNudgesArrayDescription.write$Self$models(eventUpdateEventUpdatesItemNudgesArrayDescription, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
