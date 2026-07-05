package defpackage;

import com.anthropic.claude.models.organization.configtypes.EventCreateNewEventsArrayDescription;
import com.anthropic.claude.models.organization.configtypes.EventCreateNewEventsItemDescription;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jv6 implements w28 {
    public static final jv6 a;
    private static final SerialDescriptor descriptor;

    static {
        jv6 jv6Var = new jv6();
        a = jv6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.EventCreateNewEventsArrayDescription", jv6Var, 2);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("items", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, lv6.a};
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
        EventCreateNewEventsItemDescription eventCreateNewEventsItemDescription = null;
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
                eventCreateNewEventsItemDescription = (EventCreateNewEventsItemDescription) ud4VarC.l(serialDescriptor, 1, lv6.a, eventCreateNewEventsItemDescription);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new EventCreateNewEventsArrayDescription(i, strV, eventCreateNewEventsItemDescription, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventCreateNewEventsArrayDescription eventCreateNewEventsArrayDescription = (EventCreateNewEventsArrayDescription) obj;
        encoder.getClass();
        eventCreateNewEventsArrayDescription.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventCreateNewEventsArrayDescription.write$Self$models(eventCreateNewEventsArrayDescription, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
