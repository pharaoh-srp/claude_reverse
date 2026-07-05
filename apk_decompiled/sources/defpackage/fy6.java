package defpackage;

import com.anthropic.claude.models.organization.configtypes.EventDeleteRemovedEventsArrayDescription;
import com.anthropic.claude.models.organization.configtypes.EventDeleteRemovedEventsItemDescription;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fy6 implements w28 {
    public static final fy6 a;
    private static final SerialDescriptor descriptor;

    static {
        fy6 fy6Var = new fy6();
        a = fy6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.EventDeleteRemovedEventsArrayDescription", fy6Var, 2);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("items", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, hy6.a};
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
        EventDeleteRemovedEventsItemDescription eventDeleteRemovedEventsItemDescription = null;
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
                eventDeleteRemovedEventsItemDescription = (EventDeleteRemovedEventsItemDescription) ud4VarC.l(serialDescriptor, 1, hy6.a, eventDeleteRemovedEventsItemDescription);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new EventDeleteRemovedEventsArrayDescription(i, strV, eventDeleteRemovedEventsItemDescription, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventDeleteRemovedEventsArrayDescription eventDeleteRemovedEventsArrayDescription = (EventDeleteRemovedEventsArrayDescription) obj;
        encoder.getClass();
        eventDeleteRemovedEventsArrayDescription.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventDeleteRemovedEventsArrayDescription.write$Self$models(eventDeleteRemovedEventsArrayDescription, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
