package defpackage;

import com.anthropic.claude.models.organization.configtypes.EventCreateNewEventsArrayDescription;
import com.anthropic.claude.models.organization.configtypes.EventCreateV1InputDescriptions;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qw6 implements w28 {
    public static final qw6 a;
    private static final SerialDescriptor descriptor;

    static {
        qw6 qw6Var = new qw6();
        a = qw6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.EventCreateV1InputDescriptions", qw6Var, 2);
        pluginGeneratedSerialDescriptor.j("tool_description", false);
        pluginGeneratedSerialDescriptor.j("new_events", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, jv6.a};
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
        EventCreateNewEventsArrayDescription eventCreateNewEventsArrayDescription = null;
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
                eventCreateNewEventsArrayDescription = (EventCreateNewEventsArrayDescription) ud4VarC.l(serialDescriptor, 1, jv6.a, eventCreateNewEventsArrayDescription);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new EventCreateV1InputDescriptions(i, strV, eventCreateNewEventsArrayDescription, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventCreateV1InputDescriptions eventCreateV1InputDescriptions = (EventCreateV1InputDescriptions) obj;
        encoder.getClass();
        eventCreateV1InputDescriptions.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventCreateV1InputDescriptions.write$Self$models(eventCreateV1InputDescriptions, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
