package defpackage;

import com.anthropic.claude.api.account.Account;
import com.anthropic.claude.api.account.AppStartResponse;
import com.anthropic.claude.api.account.CurrentUserAccess;
import com.anthropic.claude.api.account.GrowthBookSchema;
import com.anthropic.claude.api.account.MemoryMode;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yl0 implements w28 {
    public static final yl0 a;
    private static final SerialDescriptor descriptor;

    static {
        yl0 yl0Var = new yl0();
        a = yl0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.account.AppStartResponse", yl0Var, 7);
        pluginGeneratedSerialDescriptor.j("account", false);
        pluginGeneratedSerialDescriptor.j("memory_mode", true);
        pluginGeneratedSerialDescriptor.j("org_growthbook", true);
        pluginGeneratedSerialDescriptor.j("server_localizations", true);
        pluginGeneratedSerialDescriptor.j("current_user_access", true);
        pluginGeneratedSerialDescriptor.j("model_selector_state", true);
        pluginGeneratedSerialDescriptor.j("model_selector_config", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = AppStartResponse.$childSerializers;
        return new KSerializer[]{k7.a, d4c.S(xbb.d), d4c.S(sd8.a), d4c.S((KSerializer) kw9VarArr[3].getValue()), d4c.S(kd5.a), d4c.S((KSerializer) kw9VarArr[5].getValue()), d4c.S((KSerializer) kw9VarArr[6].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = AppStartResponse.$childSerializers;
        Object obj = null;
        boolean z = true;
        int i = 0;
        Account account = null;
        MemoryMode memoryMode = null;
        GrowthBookSchema growthBookSchema = null;
        Map map = null;
        CurrentUserAccess currentUserAccess = null;
        List list = null;
        List list2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    account = (Account) ud4VarC.l(serialDescriptor, 0, k7.a, account);
                    i |= 1;
                    break;
                case 1:
                    memoryMode = (MemoryMode) ud4VarC.m(serialDescriptor, 1, xbb.d, memoryMode);
                    i |= 2;
                    break;
                case 2:
                    growthBookSchema = (GrowthBookSchema) ud4VarC.m(serialDescriptor, 2, sd8.a, growthBookSchema);
                    i |= 4;
                    break;
                case 3:
                    map = (Map) ud4VarC.m(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), map);
                    i |= 8;
                    break;
                case 4:
                    currentUserAccess = (CurrentUserAccess) ud4VarC.m(serialDescriptor, 4, kd5.a, currentUserAccess);
                    i |= 16;
                    break;
                case 5:
                    list = (List) ud4VarC.m(serialDescriptor, 5, (s06) kw9VarArr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    list2 = (List) ud4VarC.m(serialDescriptor, 6, (s06) kw9VarArr[6].getValue(), list2);
                    i |= 64;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new AppStartResponse(i, account, memoryMode, growthBookSchema, map, currentUserAccess, list, list2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        AppStartResponse appStartResponse = (AppStartResponse) obj;
        encoder.getClass();
        appStartResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        AppStartResponse.write$Self$api(appStartResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
