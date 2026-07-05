package defpackage;

import com.anthropic.claude.api.chat.tool.ResearchStatus;
import com.anthropic.claude.api.chat.tool.ResearchStatusResponse;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zle implements w28 {
    public static final zle a;
    private static final SerialDescriptor descriptor;

    static {
        zle zleVar = new zle();
        a = zleVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.chat.tool.ResearchStatusResponse", zleVar, 9);
        pluginGeneratedSerialDescriptor.j("started_at", false);
        pluginGeneratedSerialDescriptor.j("total_sources", false);
        pluginGeneratedSerialDescriptor.j("error", true);
        pluginGeneratedSerialDescriptor.j("research_headline", false);
        pluginGeneratedSerialDescriptor.j("status", false);
        pluginGeneratedSerialDescriptor.j("finished_at", false);
        pluginGeneratedSerialDescriptor.j("top_icon_urls", false);
        pluginGeneratedSerialDescriptor.j("top_source_domains", false);
        pluginGeneratedSerialDescriptor.j("agent_summaries", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ResearchStatusResponse.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), e79.a, d4c.S(srgVar), d4c.S(srgVar), bme.d, d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[6].getValue()), d4c.S((KSerializer) kw9VarArr[7].getValue()), d4c.S((KSerializer) kw9VarArr[8].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ResearchStatusResponse.$childSerializers;
        List list = null;
        boolean z = true;
        List list2 = null;
        int i = 0;
        String str = null;
        int iR = 0;
        String str2 = null;
        String str3 = null;
        ResearchStatus researchStatus = null;
        String str4 = null;
        List list3 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                    i |= 1;
                    break;
                case 1:
                    iR = ud4VarC.r(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str3);
                    i |= 8;
                    break;
                case 4:
                    researchStatus = (ResearchStatus) ud4VarC.l(serialDescriptor, 4, bme.d, researchStatus);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str4);
                    i |= 32;
                    break;
                case 6:
                    list3 = (List) ud4VarC.m(serialDescriptor, 6, (s06) kw9VarArr[6].getValue(), list3);
                    i |= 64;
                    break;
                case 7:
                    list2 = (List) ud4VarC.m(serialDescriptor, 7, (s06) kw9VarArr[7].getValue(), list2);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    list = (List) ud4VarC.m(serialDescriptor, 8, (s06) kw9VarArr[8].getValue(), list);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ResearchStatusResponse(i, str, iR, str2, str3, researchStatus, str4, list3, list2, list, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ResearchStatusResponse researchStatusResponse = (ResearchStatusResponse) obj;
        encoder.getClass();
        researchStatusResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ResearchStatusResponse.write$Self$api(researchStatusResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
