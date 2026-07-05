package com.anthropic.claude.artifact.details;

import com.anthropic.claude.artifact.details.ArtifactFullScreenParams;
import com.anthropic.claude.types.strings.PublishedArtifactId;
import defpackage.swd;
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
public final /* synthetic */ class d implements w28 {
    public static final d a;
    private static final SerialDescriptor descriptor;

    static {
        d dVar = new d();
        a = dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.artifact.details.ArtifactFullScreenParams.PublishedArtifactFullScreenParams", dVar, 1);
        pluginGeneratedSerialDescriptor.j("uuid", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{swd.a};
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
        String strM1092unboximpl = null;
        while (objArr2 != false) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                objArr2 = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                PublishedArtifactId publishedArtifactId = (PublishedArtifactId) ud4VarC.l(serialDescriptor, 0, swd.a, strM1092unboximpl != null ? PublishedArtifactId.m1086boximpl(strM1092unboximpl) : null);
                strM1092unboximpl = publishedArtifactId != null ? publishedArtifactId.m1092unboximpl() : null;
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ArtifactFullScreenParams.PublishedArtifactFullScreenParams(i, strM1092unboximpl, vnfVar, objArr == true ? 1 : 0);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ArtifactFullScreenParams.PublishedArtifactFullScreenParams publishedArtifactFullScreenParams = (ArtifactFullScreenParams.PublishedArtifactFullScreenParams) obj;
        encoder.getClass();
        publishedArtifactFullScreenParams.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, swd.a, PublishedArtifactId.m1086boximpl(publishedArtifactFullScreenParams.uuid));
        vd4VarC.b(serialDescriptor);
    }
}
