package defpackage;

import com.anthropic.claude.sessions.types.SessionGrouping;
import com.anthropic.claude.sessions.types.SessionGroupingVisibility;
import com.anthropic.claude.types.strings.SessionGroupingId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class trf implements w28 {
    public static final trf a;
    private static final SerialDescriptor descriptor;

    static {
        trf trfVar = new trf();
        a = trfVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.SessionGrouping", trfVar, 9);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("description", true);
        pluginGeneratedSerialDescriptor.j("visibility", true);
        pluginGeneratedSerialDescriptor.j("created_by_account_id", true);
        pluginGeneratedSerialDescriptor.j("caller_relations", true);
        pluginGeneratedSerialDescriptor.j("members", true);
        pluginGeneratedSerialDescriptor.j("members_truncated", true);
        pluginGeneratedSerialDescriptor.j("created_at", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{xrf.a, srgVar, d4c.S(srgVar), esf.d, d4c.S(srgVar), vme.d, d4c.S(ume.d), d4c.S(zt1.a), d4c.S(g69.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        Object obj = null;
        boolean z = true;
        c69 c69Var = null;
        String strM1113unboximpl = null;
        String strV = null;
        String str = null;
        SessionGroupingVisibility sessionGroupingVisibility = null;
        String str2 = null;
        List list = null;
        List list2 = null;
        Boolean bool = null;
        int i = 0;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    SessionGroupingId sessionGroupingId = (SessionGroupingId) ud4VarC.l(serialDescriptor, 0, xrf.a, strM1113unboximpl != null ? SessionGroupingId.m1107boximpl(strM1113unboximpl) : null);
                    i |= 1;
                    strM1113unboximpl = sessionGroupingId != null ? sessionGroupingId.m1113unboximpl() : null;
                    break;
                case 1:
                    strV = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                    i |= 4;
                    break;
                case 3:
                    sessionGroupingVisibility = (SessionGroupingVisibility) ud4VarC.l(serialDescriptor, 3, esf.d, sessionGroupingVisibility);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str2);
                    i |= 16;
                    break;
                case 5:
                    list = (List) ud4VarC.l(serialDescriptor, 5, vme.d, list);
                    i |= 32;
                    break;
                case 6:
                    list2 = (List) ud4VarC.m(serialDescriptor, 6, ume.d, list2);
                    i |= 64;
                    break;
                case 7:
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 7, zt1.a, bool);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    c69Var = (c69) ud4VarC.m(serialDescriptor, 8, g69.a, c69Var);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new SessionGrouping(i, strM1113unboximpl, strV, str, sessionGroupingVisibility, str2, list, list2, bool, c69Var, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SessionGrouping sessionGrouping = (SessionGrouping) obj;
        encoder.getClass();
        sessionGrouping.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SessionGrouping.write$Self$sessions(sessionGrouping, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
