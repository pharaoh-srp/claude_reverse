package defpackage;

import com.anthropic.claude.artifact.model.ArtifactMetadata;
import com.anthropic.claude.artifact.model.ArtifactType;
import com.anthropic.claude.artifact.model.ArtifactUuid;
import com.anthropic.claude.types.strings.ArtifactId;
import com.anthropic.claude.types.strings.ArtifactIdentifier;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pr0 implements w28 {
    public static final pr0 a;
    private static final SerialDescriptor descriptor;

    static {
        pr0 pr0Var = new pr0();
        a = pr0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.artifact.model.ArtifactMetadata", pr0Var, 7);
        pluginGeneratedSerialDescriptor.j("uuid", true);
        pluginGeneratedSerialDescriptor.j("versionUuid", true);
        pluginGeneratedSerialDescriptor.j("identifier", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("language", true);
        pluginGeneratedSerialDescriptor.j("isComplete", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S((KSerializer) ArtifactMetadata.$childSerializers[3].getValue());
        srg srgVar = srg.a;
        return new KSerializer[]{st0.a, ir0.a, kr0.a, kSerializerS, d4c.S(srgVar), d4c.S(srgVar), zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ArtifactMetadata.$childSerializers;
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        ArtifactUuid artifactUuid = null;
        String strM963unboximpl = null;
        String strM970unboximpl = null;
        ArtifactType artifactType = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    artifactUuid = (ArtifactUuid) ud4VarC.l(serialDescriptor, 0, st0.a, artifactUuid);
                    i |= 1;
                    break;
                case 1:
                    ArtifactId artifactId = (ArtifactId) ud4VarC.l(serialDescriptor, 1, ir0.a, strM963unboximpl != null ? ArtifactId.m957boximpl(strM963unboximpl) : null);
                    strM963unboximpl = artifactId != null ? artifactId.m963unboximpl() : null;
                    i |= 2;
                    break;
                case 2:
                    ArtifactIdentifier artifactIdentifier = (ArtifactIdentifier) ud4VarC.l(serialDescriptor, 2, kr0.a, strM970unboximpl != null ? ArtifactIdentifier.m964boximpl(strM970unboximpl) : null);
                    strM970unboximpl = artifactIdentifier != null ? artifactIdentifier.m970unboximpl() : null;
                    i |= 4;
                    break;
                case 3:
                    artifactType = (ArtifactType) ud4VarC.m(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), artifactType);
                    i |= 8;
                    break;
                case 4:
                    str = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str2);
                    i |= 32;
                    break;
                case 6:
                    zU = ud4VarC.u(serialDescriptor, 6);
                    i |= 64;
                    continue;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new ArtifactMetadata(i, artifactUuid, strM963unboximpl, strM970unboximpl, artifactType, str, str2, zU, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ArtifactMetadata artifactMetadata = (ArtifactMetadata) obj;
        encoder.getClass();
        artifactMetadata.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ArtifactMetadata.write$Self$artifact(artifactMetadata, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
