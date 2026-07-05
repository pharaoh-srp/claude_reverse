package defpackage;

import com.anthropic.claude.analytics.events.SearchEvents$InlineSourcesSheetSeen;
import com.anthropic.claude.analytics.events.SearchEvents$SearchType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xdf implements w28 {
    public static final xdf a;
    private static final SerialDescriptor descriptor;

    static {
        xdf xdfVar = new xdf();
        a = xdfVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_inline_sources_sheet_viewed", xdfVar, 3);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("search_type", false);
        pluginGeneratedSerialDescriptor.j("sources_count", false);
        pluginGeneratedSerialDescriptor.k(new xmb(11));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, SearchEvents$InlineSourcesSheetSeen.$childSerializers[1].getValue(), e79.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = SearchEvents$InlineSourcesSheetSeen.$childSerializers;
        boolean z = true;
        int i = 0;
        int iR = 0;
        String strV = null;
        SearchEvents$SearchType searchEvents$SearchType = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                searchEvents$SearchType = (SearchEvents$SearchType) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), searchEvents$SearchType);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                iR = ud4VarC.r(serialDescriptor, 2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SearchEvents$InlineSourcesSheetSeen(i, strV, searchEvents$SearchType, iR, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SearchEvents$InlineSourcesSheetSeen searchEvents$InlineSourcesSheetSeen = (SearchEvents$InlineSourcesSheetSeen) obj;
        encoder.getClass();
        searchEvents$InlineSourcesSheetSeen.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SearchEvents$InlineSourcesSheetSeen.write$Self$analytics(searchEvents$InlineSourcesSheetSeen, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
