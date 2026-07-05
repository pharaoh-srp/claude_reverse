package defpackage;

import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemRecurrenceSpanRecurrenceSpanInstance;
import java.time.OffsetDateTime;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g37 implements w28 {
    public static final g37 a;
    private static final SerialDescriptor descriptor;

    static {
        g37 g37Var = new g37();
        a = g37Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("instance", g37Var, 1);
        pluginGeneratedSerialDescriptor.j("start_time", false);
        pluginGeneratedSerialDescriptor.k(new pi(21));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ay6.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        OffsetDateTime offsetDateTime = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                offsetDateTime = (OffsetDateTime) ud4VarC.l(serialDescriptor, 0, ay6.a, offsetDateTime);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new EventUpdateV0InputEventUpdatesItemRecurrenceSpanRecurrenceSpanInstance(i, offsetDateTime, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventUpdateV0InputEventUpdatesItemRecurrenceSpanRecurrenceSpanInstance eventUpdateV0InputEventUpdatesItemRecurrenceSpanRecurrenceSpanInstance = (EventUpdateV0InputEventUpdatesItemRecurrenceSpanRecurrenceSpanInstance) obj;
        encoder.getClass();
        eventUpdateV0InputEventUpdatesItemRecurrenceSpanRecurrenceSpanInstance.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, ay6.a, eventUpdateV0InputEventUpdatesItemRecurrenceSpanRecurrenceSpanInstance.start_time);
        vd4VarC.b(serialDescriptor);
    }
}
