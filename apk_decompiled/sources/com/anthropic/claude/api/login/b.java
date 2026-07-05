package com.anthropic.claude.api.login;

import com.anthropic.claude.api.login.CodeConfiguration;
import defpackage.d4c;
import defpackage.e79;
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
public final /* synthetic */ class b implements w28 {
    public static final b a;
    private static final SerialDescriptor descriptor;

    static {
        b bVar = new b();
        a = bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.login.CodeConfiguration", bVar, 3);
        pluginGeneratedSerialDescriptor.j("charset", true);
        pluginGeneratedSerialDescriptor.j("length", true);
        pluginGeneratedSerialDescriptor.j("show_input_after_delay", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S(a.d);
        e79 e79Var = e79.a;
        return new KSerializer[]{kSerializerS, d4c.S(e79Var), d4c.S(e79Var)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        CodeConfiguration.CharSet charSet = null;
        Integer num = null;
        Integer num2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                charSet = (CodeConfiguration.CharSet) ud4VarC.m(serialDescriptor, 0, a.d, charSet);
                i |= 1;
            } else if (iX == 1) {
                num = (Integer) ud4VarC.m(serialDescriptor, 1, e79.a, num);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                num2 = (Integer) ud4VarC.m(serialDescriptor, 2, e79.a, num2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CodeConfiguration(i, charSet, num, num2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CodeConfiguration codeConfiguration = (CodeConfiguration) obj;
        encoder.getClass();
        codeConfiguration.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CodeConfiguration.write$Self$api(codeConfiguration, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
