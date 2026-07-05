package com.anthropic.claude.app;

import com.anthropic.claude.app.ClaudeAppOverlay;
import com.anthropic.claude.artifact.details.ArtifactFullScreenParams;
import defpackage.kw9;
import defpackage.s06;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w28;
import defpackage.znf;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0 implements w28 {
    public static final o0 a;
    private static final SerialDescriptor descriptor;

    static {
        o0 o0Var = new o0();
        a = o0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.app.ClaudeAppOverlay.ArtifactFullScreen", o0Var, 1);
        pluginGeneratedSerialDescriptor.j("params", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ClaudeAppOverlay.ArtifactFullScreen.$childSerializers[0].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ClaudeAppOverlay.ArtifactFullScreen.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        ArtifactFullScreenParams artifactFullScreenParams = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                artifactFullScreenParams = (ArtifactFullScreenParams) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), artifactFullScreenParams);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ClaudeAppOverlay.ArtifactFullScreen(i, artifactFullScreenParams, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ClaudeAppOverlay.ArtifactFullScreen artifactFullScreen = (ClaudeAppOverlay.ArtifactFullScreen) obj;
        encoder.getClass();
        artifactFullScreen.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, (znf) ClaudeAppOverlay.ArtifactFullScreen.$childSerializers[0].getValue(), artifactFullScreen.params);
        vd4VarC.b(serialDescriptor);
    }
}
