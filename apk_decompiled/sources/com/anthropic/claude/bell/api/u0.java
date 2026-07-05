package com.anthropic.claude.bell.api;

import com.anthropic.claude.bell.api.BellApiServerMessage;
import defpackage.kw9;
import defpackage.s06;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w28;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u0 implements w28 {
    public static final u0 a;
    private static final SerialDescriptor descriptor;

    static {
        u0 u0Var = new u0();
        a = u0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("session_server_config", u0Var, 1);
        pluginGeneratedSerialDescriptor.j("data", true);
        pluginGeneratedSerialDescriptor.k(new j());
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{BellApiServerMessage.SessionServerConfig.$childSerializers[0].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = BellApiServerMessage.SessionServerConfig.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        Map map = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                map = (Map) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), map);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new BellApiServerMessage.SessionServerConfig(i, map, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        BellApiServerMessage.SessionServerConfig sessionServerConfig = (BellApiServerMessage.SessionServerConfig) obj;
        encoder.getClass();
        sessionServerConfig.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        BellApiServerMessage.SessionServerConfig.write$Self$bell(sessionServerConfig, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
