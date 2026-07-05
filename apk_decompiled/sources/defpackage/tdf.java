package defpackage;

import com.anthropic.claude.analytics.events.SearchEvents$ImageSearchResultClicked;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tdf implements w28 {
    public static final tdf a;
    private static final SerialDescriptor descriptor;

    static {
        tdf tdfVar = new tdf();
        a = tdfVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.image_search.result.clicked", tdfVar, 3);
        pluginGeneratedSerialDescriptor.j("image_index", false);
        pluginGeneratedSerialDescriptor.j("images_count", false);
        pluginGeneratedSerialDescriptor.j("telemetry", true);
        pluginGeneratedSerialDescriptor.k(new xmb(11));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S(srg.a);
        e79 e79Var = e79.a;
        return new KSerializer[]{e79Var, e79Var, kSerializerS};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iR = 0;
        int iR2 = 0;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                iR = ud4VarC.r(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                iR2 = ud4VarC.r(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SearchEvents$ImageSearchResultClicked(i, iR, iR2, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SearchEvents$ImageSearchResultClicked searchEvents$ImageSearchResultClicked = (SearchEvents$ImageSearchResultClicked) obj;
        encoder.getClass();
        searchEvents$ImageSearchResultClicked.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SearchEvents$ImageSearchResultClicked.write$Self$analytics(searchEvents$ImageSearchResultClicked, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
