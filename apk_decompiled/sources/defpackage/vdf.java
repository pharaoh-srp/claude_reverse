package defpackage;

import com.anthropic.claude.analytics.events.SearchEvents$InlineCitationClicked;
import com.anthropic.claude.analytics.events.SearchEvents$SourceType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vdf implements w28 {
    public static final vdf a;
    private static final SerialDescriptor descriptor;

    static {
        vdf vdfVar = new vdf();
        a = vdfVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_inline_citation_clicked", vdfVar, 2);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("source_type", false);
        pluginGeneratedSerialDescriptor.k(new xmb(11));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, SearchEvents$InlineCitationClicked.$childSerializers[1].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = SearchEvents$InlineCitationClicked.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        String strV = null;
        SearchEvents$SourceType searchEvents$SourceType = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                searchEvents$SourceType = (SearchEvents$SourceType) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), searchEvents$SourceType);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SearchEvents$InlineCitationClicked(i, strV, searchEvents$SourceType, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SearchEvents$InlineCitationClicked searchEvents$InlineCitationClicked = (SearchEvents$InlineCitationClicked) obj;
        encoder.getClass();
        searchEvents$InlineCitationClicked.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SearchEvents$InlineCitationClicked.write$Self$analytics(searchEvents$InlineCitationClicked, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
