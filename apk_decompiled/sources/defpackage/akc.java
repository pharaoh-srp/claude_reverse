package defpackage;

import com.anthropic.claude.api.account.Organization;
import com.anthropic.claude.api.account.OrganizationSettings;
import com.anthropic.claude.api.account.RateLimitUpsell;
import com.anthropic.claude.api.account.RavenType;
import com.anthropic.claude.types.strings.OrganizationId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Date;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class akc implements w28 {
    public static final akc a;
    private static final SerialDescriptor descriptor;

    static {
        akc akcVar = new akc();
        a = akcVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.account.Organization", akcVar, 13);
        pluginGeneratedSerialDescriptor.j("uuid", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("settings", false);
        pluginGeneratedSerialDescriptor.j("capabilities", false);
        pluginGeneratedSerialDescriptor.j("raven_type", true);
        pluginGeneratedSerialDescriptor.j("rate_limit_tier", true);
        pluginGeneratedSerialDescriptor.j("billing_type", true);
        pluginGeneratedSerialDescriptor.j("rate_limit_upsell", true);
        pluginGeneratedSerialDescriptor.j("free_credits_status", true);
        pluginGeneratedSerialDescriptor.j("api_disabled_reason", true);
        pluginGeneratedSerialDescriptor.j("api_disabled_until", true);
        pluginGeneratedSerialDescriptor.j("billable_usage_paused_until", true);
        pluginGeneratedSerialDescriptor.j("claude_ai_bootstrap_models_config", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = Organization.$childSerializers;
        srg srgVar = srg.a;
        bc9 bc9Var = bc9.a;
        return new KSerializer[]{fkc.a, srgVar, skc.a, kw9VarArr[3].getValue(), d4c.S(w1e.d), d4c.S(srgVar), d4c.S(srgVar), d4c.S(t1e.d), d4c.S(srgVar), d4c.S(srgVar), d4c.S(bc9Var), d4c.S(bc9Var), d4c.S((KSerializer) kw9VarArr[12].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        boolean z;
        String str;
        List list;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = Organization.$childSerializers;
        List list2 = null;
        Date date = null;
        Date date2 = null;
        String str2 = null;
        boolean z2 = true;
        RateLimitUpsell rateLimitUpsell = null;
        int i = 0;
        String strM1071unboximpl = null;
        String str3 = null;
        OrganizationSettings organizationSettings = null;
        List list3 = null;
        RavenType ravenType = null;
        String str4 = null;
        String str5 = null;
        String strV = null;
        while (z2) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    list = list2;
                    z2 = false;
                    list2 = list;
                    break;
                case 0:
                    boolean z3 = z2;
                    String str6 = strM1071unboximpl;
                    list = list2;
                    OrganizationId organizationId = (OrganizationId) ud4VarC.l(serialDescriptor, 0, fkc.a, str6 != null ? OrganizationId.m1065boximpl(str6) : null);
                    strM1071unboximpl = organizationId != null ? organizationId.m1071unboximpl() : null;
                    i |= 1;
                    z2 = z3;
                    list2 = list;
                    break;
                case 1:
                    strV = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    z2 = z2;
                    break;
                case 2:
                    z = z2;
                    str = strM1071unboximpl;
                    organizationSettings = (OrganizationSettings) ud4VarC.l(serialDescriptor, 2, skc.a, organizationSettings);
                    i |= 4;
                    z2 = z;
                    strM1071unboximpl = str;
                    break;
                case 3:
                    z = z2;
                    str = strM1071unboximpl;
                    list3 = (List) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), list3);
                    i |= 8;
                    z2 = z;
                    strM1071unboximpl = str;
                    break;
                case 4:
                    z = z2;
                    str = strM1071unboximpl;
                    ravenType = (RavenType) ud4VarC.m(serialDescriptor, 4, w1e.d, ravenType);
                    i |= 16;
                    z2 = z;
                    strM1071unboximpl = str;
                    break;
                case 5:
                    z = z2;
                    str = strM1071unboximpl;
                    str4 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str4);
                    i |= 32;
                    z2 = z;
                    strM1071unboximpl = str;
                    break;
                case 6:
                    z = z2;
                    str = strM1071unboximpl;
                    str5 = (String) ud4VarC.m(serialDescriptor, 6, srg.a, str5);
                    i |= 64;
                    z2 = z;
                    strM1071unboximpl = str;
                    break;
                case 7:
                    z = z2;
                    str = strM1071unboximpl;
                    rateLimitUpsell = (RateLimitUpsell) ud4VarC.m(serialDescriptor, 7, t1e.d, rateLimitUpsell);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    z2 = z;
                    strM1071unboximpl = str;
                    break;
                case 8:
                    z = z2;
                    str = strM1071unboximpl;
                    str3 = (String) ud4VarC.m(serialDescriptor, 8, srg.a, str3);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    z2 = z;
                    strM1071unboximpl = str;
                    break;
                case 9:
                    z = z2;
                    str = strM1071unboximpl;
                    str2 = (String) ud4VarC.m(serialDescriptor, 9, srg.a, str2);
                    i |= 512;
                    z2 = z;
                    strM1071unboximpl = str;
                    break;
                case 10:
                    z = z2;
                    str = strM1071unboximpl;
                    date2 = (Date) ud4VarC.m(serialDescriptor, 10, bc9.a, date2);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    z2 = z;
                    strM1071unboximpl = str;
                    break;
                case 11:
                    z = z2;
                    str = strM1071unboximpl;
                    date = (Date) ud4VarC.m(serialDescriptor, 11, bc9.a, date);
                    i |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    z2 = z;
                    strM1071unboximpl = str;
                    break;
                case 12:
                    z = z2;
                    str = strM1071unboximpl;
                    list2 = (List) ud4VarC.m(serialDescriptor, 12, (s06) kw9VarArr[12].getValue(), list2);
                    i |= FreeTypeConstants.FT_LOAD_MONOCHROME;
                    z2 = z;
                    strM1071unboximpl = str;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new Organization(i, strM1071unboximpl, strV, organizationSettings, list3, ravenType, str4, str5, rateLimitUpsell, str3, str2, date2, date, list2, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        Organization organization = (Organization) obj;
        encoder.getClass();
        organization.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        Organization.write$Self$api(organization, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
