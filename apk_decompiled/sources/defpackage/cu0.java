package defpackage;

import com.anthropic.claude.analytics.events.ArtifactViewerEvents$ArtifactKind;
import com.anthropic.claude.analytics.events.ArtifactViewerEvents$ArtifactViewResult;
import com.anthropic.claude.analytics.events.ArtifactViewerEvents$ArtifactViewed;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cu0 implements w28 {
    public static final cu0 a;
    private static final SerialDescriptor descriptor;

    static {
        cu0 cu0Var = new cu0();
        a = cu0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_artifact_viewed", cu0Var, 6);
        pluginGeneratedSerialDescriptor.j("result", false);
        pluginGeneratedSerialDescriptor.j("artifact_kind", false);
        pluginGeneratedSerialDescriptor.j("artifact_type", false);
        pluginGeneratedSerialDescriptor.j("content_ready_ms", true);
        pluginGeneratedSerialDescriptor.j("render_ready_ms", true);
        pluginGeneratedSerialDescriptor.j("duration_ms", false);
        pluginGeneratedSerialDescriptor.k(new pi(8));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ArtifactViewerEvents$ArtifactViewed.$childSerializers;
        xka xkaVar = xka.a;
        return new KSerializer[]{kw9VarArr[0].getValue(), kw9VarArr[1].getValue(), srg.a, d4c.S(xkaVar), d4c.S(xkaVar), xkaVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ArtifactViewerEvents$ArtifactViewed.$childSerializers;
        int i = 0;
        ArtifactViewerEvents$ArtifactViewResult artifactViewerEvents$ArtifactViewResult = null;
        ArtifactViewerEvents$ArtifactKind artifactViewerEvents$ArtifactKind = null;
        String strV = null;
        Long l = null;
        Long l2 = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    artifactViewerEvents$ArtifactViewResult = (ArtifactViewerEvents$ArtifactViewResult) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), artifactViewerEvents$ArtifactViewResult);
                    i |= 1;
                    break;
                case 1:
                    artifactViewerEvents$ArtifactKind = (ArtifactViewerEvents$ArtifactKind) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), artifactViewerEvents$ArtifactKind);
                    i |= 2;
                    break;
                case 2:
                    strV = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    l = (Long) ud4VarC.m(serialDescriptor, 3, xka.a, l);
                    i |= 8;
                    break;
                case 4:
                    l2 = (Long) ud4VarC.m(serialDescriptor, 4, xka.a, l2);
                    i |= 16;
                    break;
                case 5:
                    j = ud4VarC.j(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ArtifactViewerEvents$ArtifactViewed(i, artifactViewerEvents$ArtifactViewResult, artifactViewerEvents$ArtifactKind, strV, l, l2, j, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ArtifactViewerEvents$ArtifactViewed artifactViewerEvents$ArtifactViewed = (ArtifactViewerEvents$ArtifactViewed) obj;
        encoder.getClass();
        artifactViewerEvents$ArtifactViewed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ArtifactViewerEvents$ArtifactViewed.write$Self$analytics(artifactViewerEvents$ArtifactViewed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
