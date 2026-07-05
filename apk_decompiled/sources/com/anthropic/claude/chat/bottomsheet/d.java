package com.anthropic.claude.chat.bottomsheet;

import com.anthropic.claude.artifact.sheet.ArtifactBottomSheetParams;
import com.anthropic.claude.chat.bottomsheet.ChatScreenArtifactSheetDestination;
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
public final /* synthetic */ class d implements w28 {
    public static final d a;
    private static final SerialDescriptor descriptor;

    static {
        d dVar = new d();
        a = dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.chat.bottomsheet.ChatScreenArtifactSheetDestination.ViewArtifact", dVar, 1);
        pluginGeneratedSerialDescriptor.j("params", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ChatScreenArtifactSheetDestination.ViewArtifact.$childSerializers[0].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ChatScreenArtifactSheetDestination.ViewArtifact.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        ArtifactBottomSheetParams artifactBottomSheetParams = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                artifactBottomSheetParams = (ArtifactBottomSheetParams) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), artifactBottomSheetParams);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatScreenArtifactSheetDestination.ViewArtifact(i, artifactBottomSheetParams, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatScreenArtifactSheetDestination.ViewArtifact viewArtifact = (ChatScreenArtifactSheetDestination.ViewArtifact) obj;
        encoder.getClass();
        viewArtifact.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, (znf) ChatScreenArtifactSheetDestination.ViewArtifact.$childSerializers[0].getValue(), viewArtifact.params);
        vd4VarC.b(serialDescriptor);
    }
}
