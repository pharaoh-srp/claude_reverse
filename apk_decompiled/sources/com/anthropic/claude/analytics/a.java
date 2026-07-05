package com.anthropic.claude.analytics;

import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.EmailAddress;
import com.anthropic.claude.types.strings.OrganizationId;
import defpackage.d4c;
import defpackage.fkc;
import defpackage.ok6;
import defpackage.srg;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.w28;
import defpackage.z7;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements w28 {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.analytics.ClaudeAnalyticsImpl.Traits", aVar, 4);
        pluginGeneratedSerialDescriptor.j("account_uuid", false);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("email", false);
        pluginGeneratedSerialDescriptor.j("subscription_level", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{z7.a, fkc.a, ok6.a, d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strM949unboximpl = null;
        String strM1071unboximpl = null;
        String strM1013unboximpl = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                AccountId accountId = (AccountId) ud4VarC.l(serialDescriptor, 0, z7.a, strM949unboximpl != null ? AccountId.m943boximpl(strM949unboximpl) : null);
                strM949unboximpl = accountId != null ? accountId.m949unboximpl() : null;
                i |= 1;
            } else if (iX == 1) {
                OrganizationId organizationId = (OrganizationId) ud4VarC.l(serialDescriptor, 1, fkc.a, strM1071unboximpl != null ? OrganizationId.m1065boximpl(strM1071unboximpl) : null);
                strM1071unboximpl = organizationId != null ? organizationId.m1071unboximpl() : null;
                i |= 2;
            } else if (iX == 2) {
                EmailAddress emailAddress = (EmailAddress) ud4VarC.l(serialDescriptor, 2, ok6.a, strM1013unboximpl != null ? EmailAddress.m1006boximpl(strM1013unboximpl) : null);
                strM1013unboximpl = emailAddress != null ? emailAddress.m1013unboximpl() : null;
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ClaudeAnalyticsImpl$Traits(i, strM949unboximpl, strM1071unboximpl, strM1013unboximpl, str, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ClaudeAnalyticsImpl$Traits claudeAnalyticsImpl$Traits = (ClaudeAnalyticsImpl$Traits) obj;
        encoder.getClass();
        claudeAnalyticsImpl$Traits.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ClaudeAnalyticsImpl$Traits.write$Self$analytics(claudeAnalyticsImpl$Traits, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
