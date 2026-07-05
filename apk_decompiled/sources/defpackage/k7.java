package defpackage;

import com.anthropic.claude.api.account.Account;
import com.anthropic.claude.api.account.AccountSettings;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.EmailAddress;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Date;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k7 implements w28 {
    public static final k7 a;
    private static final SerialDescriptor descriptor;

    static {
        k7 k7Var = new k7();
        a = k7Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.account.Account", k7Var, 9);
        pluginGeneratedSerialDescriptor.j("uuid", false);
        pluginGeneratedSerialDescriptor.j("email_address", false);
        pluginGeneratedSerialDescriptor.j("full_name", true);
        pluginGeneratedSerialDescriptor.j("display_name", true);
        pluginGeneratedSerialDescriptor.j("created_at", false);
        pluginGeneratedSerialDescriptor.j("updated_at", false);
        pluginGeneratedSerialDescriptor.j("memberships", false);
        pluginGeneratedSerialDescriptor.j("settings", true);
        pluginGeneratedSerialDescriptor.j("is_verified", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = Account.$childSerializers;
        srg srgVar = srg.a;
        bc9 bc9Var = bc9.a;
        return new KSerializer[]{z7.a, ok6.a, d4c.S(srgVar), d4c.S(srgVar), bc9Var, bc9Var, kw9VarArr[6].getValue(), d4c.S(l8.a), zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = Account.$childSerializers;
        Object obj = null;
        boolean z = true;
        AccountSettings accountSettings = null;
        String strM949unboximpl = null;
        String strM1013unboximpl = null;
        String str = null;
        String str2 = null;
        Date date = null;
        Date date2 = null;
        List list = null;
        int i = 0;
        boolean zU = false;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    AccountId accountId = (AccountId) ud4VarC.l(serialDescriptor, 0, z7.a, strM949unboximpl != null ? AccountId.m943boximpl(strM949unboximpl) : null);
                    i |= 1;
                    strM949unboximpl = accountId != null ? accountId.m949unboximpl() : null;
                    break;
                case 1:
                    EmailAddress emailAddress = (EmailAddress) ud4VarC.l(serialDescriptor, 1, ok6.a, strM1013unboximpl != null ? EmailAddress.m1006boximpl(strM1013unboximpl) : null);
                    strM1013unboximpl = emailAddress != null ? emailAddress.m1013unboximpl() : null;
                    i |= 2;
                    break;
                case 2:
                    str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str2);
                    i |= 8;
                    break;
                case 4:
                    date = (Date) ud4VarC.l(serialDescriptor, 4, bc9.a, date);
                    i |= 16;
                    break;
                case 5:
                    date2 = (Date) ud4VarC.l(serialDescriptor, 5, bc9.a, date2);
                    i |= 32;
                    break;
                case 6:
                    list = (List) ud4VarC.l(serialDescriptor, 6, (s06) kw9VarArr[6].getValue(), list);
                    i |= 64;
                    break;
                case 7:
                    accountSettings = (AccountSettings) ud4VarC.m(serialDescriptor, 7, l8.a, accountSettings);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    zU = ud4VarC.u(serialDescriptor, 8);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new Account(i, strM949unboximpl, strM1013unboximpl, str, str2, date, date2, list, accountSettings, zU, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        Account account = (Account) obj;
        encoder.getClass();
        account.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        Account.write$Self$api(account, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
