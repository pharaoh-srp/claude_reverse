package com.anthropic.claude.app;

import com.anthropic.claude.app.ClaudeAppDestination;
import defpackage.mzf;
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

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements w28 {
    public static final u a;
    private static final SerialDescriptor descriptor;

    static {
        u uVar = new u();
        a = uVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.app.ClaudeAppDestination.List.Settings", uVar, 1);
        pluginGeneratedSerialDescriptor.j("params", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{mzf.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        SettingsScreenParams settingsScreenParams = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                settingsScreenParams = (SettingsScreenParams) ud4VarC.l(serialDescriptor, 0, mzf.a, settingsScreenParams);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ClaudeAppDestination.List.Settings(i, settingsScreenParams, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ClaudeAppDestination.List.Settings settings = (ClaudeAppDestination.List.Settings) obj;
        encoder.getClass();
        settings.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, mzf.a, settings.params);
        vd4VarC.b(serialDescriptor);
    }
}
