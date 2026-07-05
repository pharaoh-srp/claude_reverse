package com.anthropic.claude.artifact.sheet;

import com.anthropic.claude.artifact.model.WiggleArtifactIdentifier;
import com.anthropic.claude.artifact.sheet.ArtifactBottomSheetParams;
import defpackage.e79;
import defpackage.kaj;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.w28;
import defpackage.zt1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements w28 {
    public static final d a;
    private static final SerialDescriptor descriptor;

    static {
        d dVar = new d();
        a = dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.artifact.sheet.ArtifactBottomSheetParams.WiggleFileArtifact", dVar, 3);
        pluginGeneratedSerialDescriptor.j("identifier", false);
        pluginGeneratedSerialDescriptor.j("isShareEnabled", true);
        pluginGeneratedSerialDescriptor.j("versionIndex", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{kaj.a, zt1.a, e79.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zU = false;
        int iR = 0;
        WiggleArtifactIdentifier wiggleArtifactIdentifier = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                wiggleArtifactIdentifier = (WiggleArtifactIdentifier) ud4VarC.l(serialDescriptor, 0, kaj.a, wiggleArtifactIdentifier);
                i |= 1;
            } else if (iX == 1) {
                zU = ud4VarC.u(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                iR = ud4VarC.r(serialDescriptor, 2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ArtifactBottomSheetParams.WiggleFileArtifact(i, wiggleArtifactIdentifier, zU, iR, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ArtifactBottomSheetParams.WiggleFileArtifact wiggleFileArtifact = (ArtifactBottomSheetParams.WiggleFileArtifact) obj;
        encoder.getClass();
        wiggleFileArtifact.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ArtifactBottomSheetParams.WiggleFileArtifact.write$Self$artifact(wiggleFileArtifact, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
