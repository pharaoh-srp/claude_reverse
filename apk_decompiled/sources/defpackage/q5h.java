package defpackage;

import com.anthropic.claude.api.tasks.TaskEventsResponse;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q5h implements w28 {
    public static final q5h a;
    private static final SerialDescriptor descriptor;

    static {
        q5h q5hVar = new q5h();
        a = q5hVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.tasks.TaskEventsResponse", q5hVar, 3);
        pluginGeneratedSerialDescriptor.j("data", true);
        pluginGeneratedSerialDescriptor.j("has_more", true);
        pluginGeneratedSerialDescriptor.j("next_page", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{TaskEventsResponse.$childSerializers[0].getValue(), d4c.S(zt1.a), d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = TaskEventsResponse.$childSerializers;
        boolean z = true;
        int i = 0;
        List list = null;
        Boolean bool = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                list = (List) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), list);
                i |= 1;
            } else if (iX == 1) {
                bool = (Boolean) ud4VarC.m(serialDescriptor, 1, zt1.a, bool);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new TaskEventsResponse(i, list, bool, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        TaskEventsResponse taskEventsResponse = (TaskEventsResponse) obj;
        encoder.getClass();
        taskEventsResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        TaskEventsResponse.write$Self$api(taskEventsResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
