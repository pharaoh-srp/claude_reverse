package defpackage;

import com.anthropic.claude.analytics.events.PushEvents$CodeSessionPermissionActionTapped;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class iyd implements w28 {
    public static final iyd a;
    private static final SerialDescriptor descriptor;

    static {
        iyd iydVar = new iyd();
        a = iydVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.push.code_session_permission_action_tapped", iydVar, 5);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("account_uuid", false);
        pluginGeneratedSerialDescriptor.j("session_id", false);
        pluginGeneratedSerialDescriptor.j("allow", false);
        pluginGeneratedSerialDescriptor.j("tool_name", true);
        pluginGeneratedSerialDescriptor.k(new gl0(9));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, zt1.a, d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zU = false;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                strV2 = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                strV3 = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            } else if (iX == 3) {
                zU = ud4VarC.u(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new PushEvents$CodeSessionPermissionActionTapped(i, strV, strV2, strV3, zU, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        PushEvents$CodeSessionPermissionActionTapped pushEvents$CodeSessionPermissionActionTapped = (PushEvents$CodeSessionPermissionActionTapped) obj;
        encoder.getClass();
        pushEvents$CodeSessionPermissionActionTapped.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        PushEvents$CodeSessionPermissionActionTapped.write$Self$analytics(pushEvents$CodeSessionPermissionActionTapped, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
