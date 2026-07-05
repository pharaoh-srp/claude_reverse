package defpackage;

import com.anthropic.claude.analytics.events.AppStartEvents$BaselineProfileStatus;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uk0 implements w28 {
    public static final uk0 a;
    private static final SerialDescriptor descriptor;

    static {
        uk0 uk0Var = new uk0();
        a = uk0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.app_start.baseline_profile_status", uk0Var, 3);
        pluginGeneratedSerialDescriptor.j("result_code", false);
        pluginGeneratedSerialDescriptor.j("is_compiled_with_profile", false);
        pluginGeneratedSerialDescriptor.j("has_profile_enqueued", false);
        pluginGeneratedSerialDescriptor.k(new gl0(0));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{e79.a, zt1Var, zt1Var};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iR = 0;
        boolean zU = false;
        boolean zU2 = false;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                iR = ud4VarC.r(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                zU = ud4VarC.u(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                zU2 = ud4VarC.u(serialDescriptor, 2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new AppStartEvents$BaselineProfileStatus(i, iR, zU, zU2, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        AppStartEvents$BaselineProfileStatus appStartEvents$BaselineProfileStatus = (AppStartEvents$BaselineProfileStatus) obj;
        encoder.getClass();
        appStartEvents$BaselineProfileStatus.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        AppStartEvents$BaselineProfileStatus.write$Self$analytics(appStartEvents$BaselineProfileStatus, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
