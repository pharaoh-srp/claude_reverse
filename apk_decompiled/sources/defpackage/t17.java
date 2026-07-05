package defpackage;

import com.anthropic.claude.tool.model.EventUpdateDetails;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItem;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t17 implements w28 {
    public static final t17 a;
    private static final SerialDescriptor descriptor;

    static {
        t17 t17Var = new t17();
        a = t17Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.EventUpdateDetails", t17Var, 2);
        pluginGeneratedSerialDescriptor.j("currentEventTitle", false);
        pluginGeneratedSerialDescriptor.j("updateData", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, n27.a};
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
        EventUpdateV0InputEventUpdatesItem eventUpdateV0InputEventUpdatesItem = null;
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
                eventUpdateV0InputEventUpdatesItem = (EventUpdateV0InputEventUpdatesItem) ud4VarC.l(serialDescriptor, 1, n27.a, eventUpdateV0InputEventUpdatesItem);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new EventUpdateDetails(i, strV, eventUpdateV0InputEventUpdatesItem, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventUpdateDetails eventUpdateDetails = (EventUpdateDetails) obj;
        encoder.getClass();
        eventUpdateDetails.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventUpdateDetails.write$Self$tool(eventUpdateDetails, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
