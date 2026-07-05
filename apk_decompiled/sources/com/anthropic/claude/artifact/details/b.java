package com.anthropic.claude.artifact.details;

import com.anthropic.claude.artifact.details.ArtifactFullScreenParams;
import com.anthropic.claude.types.strings.ChatId;
import defpackage.srg;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vs2;
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
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.artifact.details.ArtifactFullScreenParams.LoadedArtifactFullScreenParams", bVar, 3);
        pluginGeneratedSerialDescriptor.j("artifactUuid", false);
        pluginGeneratedSerialDescriptor.j("chatId", false);
        pluginGeneratedSerialDescriptor.j("clearCacheOnDismiss", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, vs2.a, zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zU = false;
        String strV = null;
        String strM984unboximpl = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                ChatId chatId = (ChatId) ud4VarC.l(serialDescriptor, 1, vs2.a, strM984unboximpl != null ? ChatId.m978boximpl(strM984unboximpl) : null);
                strM984unboximpl = chatId != null ? chatId.m984unboximpl() : null;
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
        return new ArtifactFullScreenParams.LoadedArtifactFullScreenParams(i, strV, strM984unboximpl, zU, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ArtifactFullScreenParams.LoadedArtifactFullScreenParams loadedArtifactFullScreenParams = (ArtifactFullScreenParams.LoadedArtifactFullScreenParams) obj;
        encoder.getClass();
        loadedArtifactFullScreenParams.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ArtifactFullScreenParams.LoadedArtifactFullScreenParams.write$Self$artifact(loadedArtifactFullScreenParams, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
