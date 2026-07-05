package defpackage;

import com.anthropic.claude.api.account.AccountSettings;
import com.anthropic.claude.api.account.UpdateAccountRequest;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ohi implements w28 {
    public static final ohi a;
    private static final SerialDescriptor descriptor;

    static {
        ohi ohiVar = new ohi();
        a = ohiVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.account.UpdateAccountRequest", ohiVar, 5);
        pluginGeneratedSerialDescriptor.j("full_name", true);
        pluginGeneratedSerialDescriptor.j("display_name", true);
        pluginGeneratedSerialDescriptor.j("accept_document_ids", true);
        pluginGeneratedSerialDescriptor.j("settings", true);
        pluginGeneratedSerialDescriptor.j("age_is_verified", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = UpdateAccountRequest.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[2].getValue()), d4c.S(l8.a), d4c.S(zt1.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = UpdateAccountRequest.$childSerializers;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        List list = null;
        AccountSettings accountSettings = null;
        Boolean bool = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i |= 1;
            } else if (iX == 1) {
                str2 = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str2);
                i |= 2;
            } else if (iX == 2) {
                list = (List) ud4VarC.m(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), list);
                i |= 4;
            } else if (iX == 3) {
                accountSettings = (AccountSettings) ud4VarC.m(serialDescriptor, 3, l8.a, accountSettings);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                bool = (Boolean) ud4VarC.m(serialDescriptor, 4, zt1.a, bool);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new UpdateAccountRequest(i, str, str2, list, accountSettings, bool, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        UpdateAccountRequest updateAccountRequest = (UpdateAccountRequest) obj;
        encoder.getClass();
        updateAccountRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        UpdateAccountRequest.write$Self$api(updateAccountRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
