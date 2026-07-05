package com.anthropic.claude.sessions.types;

import com.anthropic.claude.sessions.types.EnvironmentConfiguration;
import defpackage.d4c;
import defpackage.srg;
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

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g0 implements w28 {
    public static final g0 a;
    private static final SerialDescriptor descriptor;

    static {
        g0 g0Var = new g0();
        a = g0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("bridge", g0Var, 4);
        pluginGeneratedSerialDescriptor.j("machine_name", true);
        pluginGeneratedSerialDescriptor.j("directory", true);
        pluginGeneratedSerialDescriptor.j("branch", true);
        pluginGeneratedSerialDescriptor.j("git_repo_url", true);
        pluginGeneratedSerialDescriptor.k(new d0());
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar)};
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
        String str3 = null;
        String str4 = null;
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
            } else if (iX == 2) {
                str3 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str3);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                str4 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str4);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new EnvironmentConfiguration.Bridge(i, str, str2, str3, str4, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EnvironmentConfiguration.Bridge bridge = (EnvironmentConfiguration.Bridge) obj;
        encoder.getClass();
        bridge.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EnvironmentConfiguration.Bridge.write$Self$sessions(bridge, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
