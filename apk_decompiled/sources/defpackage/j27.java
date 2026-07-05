package defpackage;

import com.anthropic.claude.models.organization.configtypes.EventUpdateEventUpdatesArrayDescription;
import com.anthropic.claude.models.organization.configtypes.EventUpdateInputDescriptions;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j27 implements w28 {
    public static final j27 a;
    private static final SerialDescriptor descriptor;

    static {
        j27 j27Var = new j27();
        a = j27Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.EventUpdateInputDescriptions", j27Var, 2);
        pluginGeneratedSerialDescriptor.j("tool_description", false);
        pluginGeneratedSerialDescriptor.j("event_updates", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, v17.a};
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
        EventUpdateEventUpdatesArrayDescription eventUpdateEventUpdatesArrayDescription = null;
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
                eventUpdateEventUpdatesArrayDescription = (EventUpdateEventUpdatesArrayDescription) ud4VarC.l(serialDescriptor, 1, v17.a, eventUpdateEventUpdatesArrayDescription);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new EventUpdateInputDescriptions(i, strV, eventUpdateEventUpdatesArrayDescription, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventUpdateInputDescriptions eventUpdateInputDescriptions = (EventUpdateInputDescriptions) obj;
        encoder.getClass();
        eventUpdateInputDescriptions.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventUpdateInputDescriptions.write$Self$models(eventUpdateInputDescriptions, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
