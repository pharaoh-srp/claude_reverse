package defpackage;

import com.anthropic.claude.analytics.events.ScreenSource;
import com.anthropic.claude.analytics.events.SearchEvents$SheetSourceClicked;
import com.anthropic.claude.analytics.events.SearchEvents$SourceType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aef implements w28 {
    public static final aef a;
    private static final SerialDescriptor descriptor;

    static {
        aef aefVar = new aef();
        a = aefVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_sheet_source_clicked", aefVar, 4);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("source_type", false);
        pluginGeneratedSerialDescriptor.j("is_citation", false);
        pluginGeneratedSerialDescriptor.j("screen_source", false);
        pluginGeneratedSerialDescriptor.k(new xmb(11));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = SearchEvents$SheetSourceClicked.$childSerializers;
        return new KSerializer[]{srg.a, kw9VarArr[1].getValue(), zt1.a, kw9VarArr[3].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = SearchEvents$SheetSourceClicked.$childSerializers;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        String strV = null;
        SearchEvents$SourceType searchEvents$SourceType = null;
        ScreenSource screenSource = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                searchEvents$SourceType = (SearchEvents$SourceType) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), searchEvents$SourceType);
                i |= 2;
            } else if (iX == 2) {
                zU = ud4VarC.u(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                screenSource = (ScreenSource) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), screenSource);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SearchEvents$SheetSourceClicked(i, strV, searchEvents$SourceType, zU, screenSource, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SearchEvents$SheetSourceClicked searchEvents$SheetSourceClicked = (SearchEvents$SheetSourceClicked) obj;
        encoder.getClass();
        searchEvents$SheetSourceClicked.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SearchEvents$SheetSourceClicked.write$Self$analytics(searchEvents$SheetSourceClicked, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
