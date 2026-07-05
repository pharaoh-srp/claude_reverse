package defpackage;

import com.anthropic.claude.api.tasks.StepStatusEvent;
import com.anthropic.claude.api.tasks.TaskStepStatus;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ing implements w28 {
    public static final ing a;
    private static final SerialDescriptor descriptor;

    static {
        ing ingVar = new ing();
        a = ingVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("step_status", ingVar, 3);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("step_id", true);
        pluginGeneratedSerialDescriptor.j("status", false);
        pluginGeneratedSerialDescriptor.k(new gl0(12));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S(srgVar), j9h.d};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        TaskStepStatus taskStepStatus = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i |= 1;
            } else if (iX == 1) {
                str2 = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str2);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                taskStepStatus = (TaskStepStatus) ud4VarC.l(serialDescriptor, 2, j9h.d, taskStepStatus);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new StepStatusEvent(i, str, str2, taskStepStatus, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        StepStatusEvent stepStatusEvent = (StepStatusEvent) obj;
        encoder.getClass();
        stepStatusEvent.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        StepStatusEvent.write$Self$api(stepStatusEvent, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
