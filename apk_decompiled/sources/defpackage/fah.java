package defpackage;

import com.anthropic.claude.api.tasks.TasksPagination;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fah implements w28 {
    public static final fah a;
    private static final SerialDescriptor descriptor;

    static {
        fah fahVar = new fah();
        a = fahVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.tasks.TasksPagination", fahVar, 4);
        pluginGeneratedSerialDescriptor.j("has_more", false);
        pluginGeneratedSerialDescriptor.j("limit", false);
        pluginGeneratedSerialDescriptor.j("offset", false);
        pluginGeneratedSerialDescriptor.j("total", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        e79 e79Var = e79.a;
        return new KSerializer[]{zt1.a, e79Var, e79Var, e79Var};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zU = false;
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                zU = ud4VarC.u(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                iR = ud4VarC.r(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                iR2 = ud4VarC.r(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                iR3 = ud4VarC.r(serialDescriptor, 3);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new TasksPagination(i, zU, iR, iR2, iR3, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        TasksPagination tasksPagination = (TasksPagination) obj;
        encoder.getClass();
        tasksPagination.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        TasksPagination.write$Self$api(tasksPagination, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
