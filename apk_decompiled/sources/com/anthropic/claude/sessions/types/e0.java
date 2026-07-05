package com.anthropic.claude.sessions.types;

import com.anthropic.claude.sessions.types.EnvironmentConfiguration;
import defpackage.d4c;
import defpackage.h32;
import defpackage.kw9;
import defpackage.s06;
import defpackage.srg;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w28;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e0 implements w28 {
    public static final e0 a;
    private static final SerialDescriptor descriptor;

    static {
        e0 e0Var = new e0();
        a = e0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("anthropic", e0Var, 5);
        pluginGeneratedSerialDescriptor.j("cwd", true);
        pluginGeneratedSerialDescriptor.j("init_script", true);
        pluginGeneratedSerialDescriptor.j("environment", false);
        pluginGeneratedSerialDescriptor.j("languages", false);
        pluginGeneratedSerialDescriptor.j("network_config", true);
        pluginGeneratedSerialDescriptor.k(new d0());
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = EnvironmentConfiguration.Anthropic.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S(srgVar), kw9VarArr[2].getValue(), kw9VarArr[3].getValue(), d4c.S(h32.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = EnvironmentConfiguration.Anthropic.$childSerializers;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        Map map = null;
        List list = null;
        CCRNetworkConfig cCRNetworkConfig = null;
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
                map = (Map) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), map);
                i |= 4;
            } else if (iX == 3) {
                list = (List) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), list);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                cCRNetworkConfig = (CCRNetworkConfig) ud4VarC.m(serialDescriptor, 4, h32.a, cCRNetworkConfig);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new EnvironmentConfiguration.Anthropic(i, str, str2, map, list, cCRNetworkConfig, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EnvironmentConfiguration.Anthropic anthropic2 = (EnvironmentConfiguration.Anthropic) obj;
        encoder.getClass();
        anthropic2.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EnvironmentConfiguration.Anthropic.write$Self$sessions(anthropic2, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
