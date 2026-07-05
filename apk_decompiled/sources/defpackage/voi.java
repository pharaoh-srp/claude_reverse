package defpackage;

import com.anthropic.claude.tool.model.UserTimeV0Output;
import java.time.OffsetDateTime;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class voi implements w28 {
    public static final voi a;
    private static final SerialDescriptor descriptor;

    static {
        voi voiVar = new voi();
        a = voiVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.UserTimeV0Output", voiVar, 1);
        pluginGeneratedSerialDescriptor.j("current_time", false);
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
        return new UserTimeV0Output(i, offsetDateTime, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        UserTimeV0Output userTimeV0Output = (UserTimeV0Output) obj;
        encoder.getClass();
        userTimeV0Output.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, ay6.a, userTimeV0Output.current_time);
        vd4VarC.b(serialDescriptor);
    }
}
