package defpackage;

import com.anthropic.claude.analytics.events.SearchEvents$CombinedSourcesSheetSeen;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rdf implements w28 {
    public static final rdf a;
    private static final SerialDescriptor descriptor;

    static {
        rdf rdfVar = new rdf();
        a = rdfVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_combined_sources_sheet_viewed", rdfVar, 3);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("citations_count", false);
        pluginGeneratedSerialDescriptor.j("more_count", false);
        pluginGeneratedSerialDescriptor.k(new xmb(11));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        e79 e79Var = e79.a;
        return new KSerializer[]{srg.a, e79Var, e79Var};
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
        String strV = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                iR = ud4VarC.r(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                iR2 = ud4VarC.r(serialDescriptor, 2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SearchEvents$CombinedSourcesSheetSeen(i, strV, iR, iR2, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SearchEvents$CombinedSourcesSheetSeen searchEvents$CombinedSourcesSheetSeen = (SearchEvents$CombinedSourcesSheetSeen) obj;
        encoder.getClass();
        searchEvents$CombinedSourcesSheetSeen.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SearchEvents$CombinedSourcesSheetSeen.write$Self$analytics(searchEvents$CombinedSourcesSheetSeen, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
