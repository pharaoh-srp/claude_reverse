package com.anthropic.claude.api.feature;

import com.anthropic.claude.api.feature.PermissionModePolicy;
import defpackage.d4c;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w28;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements w28 {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.feature.PermissionModePolicy", aVar, 2);
        pluginGeneratedSerialDescriptor.j("auto_permissions", false);
        pluginGeneratedSerialDescriptor.j("bypass_permissions", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        b bVar = b.a;
        return new KSerializer[]{bVar, d4c.S(bVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        PermissionModePolicy.ModePolicy modePolicy = null;
        PermissionModePolicy.ModePolicy modePolicy2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                modePolicy = (PermissionModePolicy.ModePolicy) ud4VarC.l(serialDescriptor, 0, b.a, modePolicy);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                modePolicy2 = (PermissionModePolicy.ModePolicy) ud4VarC.m(serialDescriptor, 1, b.a, modePolicy2);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new PermissionModePolicy(i, modePolicy, modePolicy2, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        PermissionModePolicy permissionModePolicy = (PermissionModePolicy) obj;
        encoder.getClass();
        permissionModePolicy.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        PermissionModePolicy.write$Self$api(permissionModePolicy, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
