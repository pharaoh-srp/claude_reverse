package defpackage;

import com.anthropic.claude.artifact.sheet.ArtifactShareParams;
import com.anthropic.claude.types.strings.MessageId;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hs0 implements w28 {
    public static final hs0 a;
    private static final SerialDescriptor descriptor;

    static {
        hs0 hs0Var = new hs0();
        a = hs0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.artifact.sheet.ArtifactShareParams", hs0Var, 4);
        pluginGeneratedSerialDescriptor.j("artifactUuid", false);
        pluginGeneratedSerialDescriptor.j("messageId", false);
        pluginGeneratedSerialDescriptor.j("versionIndex", false);
        pluginGeneratedSerialDescriptor.j("isWiggleArtifact", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, ehb.a, e79.a, zt1.a};
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
        String strV = null;
        String strM1057unboximpl = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                MessageId messageId = (MessageId) ud4VarC.l(serialDescriptor, 1, ehb.a, strM1057unboximpl != null ? MessageId.m1051boximpl(strM1057unboximpl) : null);
                strM1057unboximpl = messageId != null ? messageId.m1057unboximpl() : null;
                i |= 2;
            } else if (iX == 2) {
                iR = ud4VarC.r(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                zU = ud4VarC.u(serialDescriptor, 3);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ArtifactShareParams(i, strV, strM1057unboximpl, iR, zU, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ArtifactShareParams artifactShareParams = (ArtifactShareParams) obj;
        encoder.getClass();
        artifactShareParams.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ArtifactShareParams.write$Self$artifact(artifactShareParams, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
