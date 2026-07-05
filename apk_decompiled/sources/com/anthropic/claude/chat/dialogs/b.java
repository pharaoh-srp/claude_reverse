package com.anthropic.claude.chat.dialogs;

import com.anthropic.claude.artifact.sheet.ArtifactShareParams;
import com.anthropic.claude.chat.dialogs.ChatScreenDialog;
import defpackage.hs0;
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
public final /* synthetic */ class b implements w28 {
    public static final b a;
    private static final SerialDescriptor descriptor;

    static {
        b bVar = new b();
        a = bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.chat.dialogs.ChatScreenDialog.ShareArtifact", bVar, 1);
        pluginGeneratedSerialDescriptor.j("params", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{hs0.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        ArtifactShareParams artifactShareParams = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                artifactShareParams = (ArtifactShareParams) ud4VarC.l(serialDescriptor, 0, hs0.a, artifactShareParams);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatScreenDialog.ShareArtifact(i, artifactShareParams, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatScreenDialog.ShareArtifact shareArtifact = (ChatScreenDialog.ShareArtifact) obj;
        encoder.getClass();
        shareArtifact.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, hs0.a, shareArtifact.params);
        vd4VarC.b(serialDescriptor);
    }
}
