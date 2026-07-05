package com.anthropic.claude.artifact.sheet;

import com.anthropic.claude.artifact.sheet.ArtifactBottomSheetParams;
import com.anthropic.claude.types.strings.ArtifactIdentifier;
import defpackage.e79;
import defpackage.kr0;
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
public final /* synthetic */ class b implements w28 {
    public static final b a;
    private static final SerialDescriptor descriptor;

    static {
        b bVar = new b();
        a = bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.artifact.sheet.ArtifactBottomSheetParams.InMessageArtifact", bVar, 3);
        pluginGeneratedSerialDescriptor.j("identifier", false);
        pluginGeneratedSerialDescriptor.j("versionIndex", false);
        pluginGeneratedSerialDescriptor.j("isShareEnabled", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{kr0.a, e79.a, zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iR = 0;
        boolean zU = false;
        String strM970unboximpl = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                ArtifactIdentifier artifactIdentifier = (ArtifactIdentifier) ud4VarC.l(serialDescriptor, 0, kr0.a, strM970unboximpl != null ? ArtifactIdentifier.m964boximpl(strM970unboximpl) : null);
                strM970unboximpl = artifactIdentifier != null ? artifactIdentifier.m970unboximpl() : null;
                i |= 1;
            } else if (iX == 1) {
                iR = ud4VarC.r(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                zU = ud4VarC.u(serialDescriptor, 2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ArtifactBottomSheetParams.InMessageArtifact(i, strM970unboximpl, iR, zU, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ArtifactBottomSheetParams.InMessageArtifact inMessageArtifact = (ArtifactBottomSheetParams.InMessageArtifact) obj;
        encoder.getClass();
        inMessageArtifact.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ArtifactBottomSheetParams.InMessageArtifact.write$Self$artifact(inMessageArtifact, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
