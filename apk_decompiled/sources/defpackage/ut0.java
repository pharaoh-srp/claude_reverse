package defpackage;

import com.anthropic.claude.api.artifacts.ArtifactSource;
import com.anthropic.claude.api.artifacts.ArtifactVersionRecord;
import com.anthropic.claude.api.artifacts.ArtifactVisibility;
import com.anthropic.claude.types.strings.ArtifactId;
import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.PublishedArtifactId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Date;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ut0 implements w28 {
    public static final ut0 a;
    private static final SerialDescriptor descriptor;

    static {
        ut0 ut0Var = new ut0();
        a = ut0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.artifacts.ArtifactVersionRecord", ut0Var, 12);
        pluginGeneratedSerialDescriptor.j("uuid", false);
        pluginGeneratedSerialDescriptor.j("artifact_uuid", false);
        pluginGeneratedSerialDescriptor.j("message_uuid", false);
        pluginGeneratedSerialDescriptor.j("artifact_type", false);
        pluginGeneratedSerialDescriptor.j("code_language", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("result_state", false);
        pluginGeneratedSerialDescriptor.j("created_at", false);
        pluginGeneratedSerialDescriptor.j("source", false);
        pluginGeneratedSerialDescriptor.j("visibility", false);
        pluginGeneratedSerialDescriptor.j("published_artifact_uuid", false);
        pluginGeneratedSerialDescriptor.j("published_artifact_deleted_at", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        KSerializer kSerializerS = d4c.S(srgVar);
        KSerializer kSerializerS2 = d4c.S(srgVar);
        bc9 bc9Var = bc9.a;
        KSerializer kSerializerS3 = d4c.S(nt0.d);
        KSerializer kSerializerS4 = d4c.S(swd.a);
        KSerializer kSerializerS5 = d4c.S(bc9Var);
        ir0 ir0Var = ir0.a;
        return new KSerializer[]{ir0Var, ir0Var, ehb.a, srgVar, kSerializerS, kSerializerS2, srgVar, bc9Var, kSerializerS3, fu0.d, kSerializerS4, kSerializerS5};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        Object obj = null;
        ArtifactSource artifactSource = null;
        String strM963unboximpl = null;
        String strM963unboximpl2 = null;
        String strM1057unboximpl = null;
        ArtifactVisibility artifactVisibility = null;
        String str = null;
        String str2 = null;
        Date date = null;
        Date date2 = null;
        String strV = null;
        String strV2 = null;
        String strM1092unboximpl = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    ArtifactId artifactId = (ArtifactId) ud4VarC.l(serialDescriptor, 0, ir0.a, strM963unboximpl != null ? ArtifactId.m957boximpl(strM963unboximpl) : null);
                    i |= 1;
                    strM963unboximpl = artifactId != null ? artifactId.m963unboximpl() : null;
                    break;
                case 1:
                    ArtifactId artifactId2 = (ArtifactId) ud4VarC.l(serialDescriptor, 1, ir0.a, strM963unboximpl2 != null ? ArtifactId.m957boximpl(strM963unboximpl2) : null);
                    strM963unboximpl2 = artifactId2 != null ? artifactId2.m963unboximpl() : null;
                    i |= 2;
                    break;
                case 2:
                    MessageId messageId = (MessageId) ud4VarC.l(serialDescriptor, 2, ehb.a, strM1057unboximpl != null ? MessageId.m1051boximpl(strM1057unboximpl) : null);
                    strM1057unboximpl = messageId != null ? messageId.m1057unboximpl() : null;
                    i |= 4;
                    break;
                case 3:
                    strV = ud4VarC.v(serialDescriptor, 3);
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
                    strV2 = ud4VarC.v(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    date2 = (Date) ud4VarC.l(serialDescriptor, 7, bc9.a, date2);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    artifactSource = (ArtifactSource) ud4VarC.m(serialDescriptor, 8, nt0.d, artifactSource);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                case 9:
                    artifactVisibility = (ArtifactVisibility) ud4VarC.l(serialDescriptor, 9, fu0.d, artifactVisibility);
                    i |= 512;
                    break;
                case 10:
                    PublishedArtifactId publishedArtifactId = (PublishedArtifactId) ud4VarC.m(serialDescriptor, 10, swd.a, strM1092unboximpl != null ? PublishedArtifactId.m1086boximpl(strM1092unboximpl) : null);
                    strM1092unboximpl = publishedArtifactId != null ? publishedArtifactId.m1092unboximpl() : null;
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    break;
                case 11:
                    date = (Date) ud4VarC.m(serialDescriptor, 11, bc9.a, date);
                    i |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new ArtifactVersionRecord(i, strM963unboximpl, strM963unboximpl2, strM1057unboximpl, strV, str, str2, strV2, date2, artifactSource, artifactVisibility, strM1092unboximpl, date, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ArtifactVersionRecord artifactVersionRecord = (ArtifactVersionRecord) obj;
        encoder.getClass();
        artifactVersionRecord.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ArtifactVersionRecord.write$Self$api(artifactVersionRecord, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
