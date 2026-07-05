package com.anthropic.claude.artifact.details;

import com.anthropic.claude.artifact.details.ArtifactFullScreenParams;
import com.anthropic.claude.types.strings.ArtifactId;
import defpackage.ir0;
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
public final /* synthetic */ class f implements w28 {
    public static final f a;
    private static final SerialDescriptor descriptor;

    static {
        f fVar = new f();
        a = fVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.artifact.details.ArtifactFullScreenParams.SharedArtifactFullScreenParams", fVar, 1);
        pluginGeneratedSerialDescriptor.j("uuid", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ir0.a};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = true;
        int i = 0;
        String strM963unboximpl = null;
        while (objArr2 != false) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                objArr2 = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                ArtifactId artifactId = (ArtifactId) ud4VarC.l(serialDescriptor, 0, ir0.a, strM963unboximpl != null ? ArtifactId.m957boximpl(strM963unboximpl) : null);
                strM963unboximpl = artifactId != null ? artifactId.m963unboximpl() : null;
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ArtifactFullScreenParams.SharedArtifactFullScreenParams(i, strM963unboximpl, vnfVar, objArr == true ? 1 : 0);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ArtifactFullScreenParams.SharedArtifactFullScreenParams sharedArtifactFullScreenParams = (ArtifactFullScreenParams.SharedArtifactFullScreenParams) obj;
        encoder.getClass();
        sharedArtifactFullScreenParams.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, ir0.a, ArtifactId.m957boximpl(sharedArtifactFullScreenParams.uuid));
        vd4VarC.b(serialDescriptor);
    }
}
